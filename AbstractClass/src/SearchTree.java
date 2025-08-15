import java.util.Comparator;
import java.util.PriorityQueue;

public class SearchTree implements NodeList {
    ListItem root = null;

    public SearchTree(ListItem initialRoot) {
        this.root = root;
    }

    public ListItem getRoot() {
        return this.root;
    }

    public boolean addItem(ListItem newItem) {
        //! Edge Case
        if (this.root == null) {
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(newItem);

            //* newItem is larger
            if (comparison < 0) {
                //* right child exists
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                }
                //* right child does not exist
                else {
                    currentItem.setNext(newItem);
                    return true;
                }
            }
            //* newItem is smaller
            else if (comparison > 0) {
                if (currentItem.previous() != null) {
                    currentItem = currentItem.previous();
                } else {
                    currentItem.setPrevious(newItem);
                    return true;
                }
            }
            //* Duplicate found
            else {
                return false;
            }
        }
        return false;
    }

    public void traverse(ListItem root) {
        //* Base Case
        if (this.root == null) {
            return;
        } else {
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }
    }

    public boolean removeItem(ListItem itemToRemove) {
        //! Edge Case
        if (this.root == null) {
            return false;
        }

        ListItem currentItem = this.root;
        ListItem parentItem = null;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(itemToRemove);

            //* move right
            if (comparison < 0) {
                parentItem = currentItem;
                currentItem = currentItem.next();
            }
            //* move left
            else if (comparison > 0) {
                parentItem = currentItem;
                currentItem = currentItem.previous();
            }
            //* comparison == 0 ; found
            else {
                performRemoval(currentItem, parentItem);
                return true;
            }

        }

        return false;
    }

    private void performRemoval(ListItem itemToBeRemoved, ListItem parent) {
        //* Case 1: the item is a leaf(no children)
        if (itemToBeRemoved.previous() == null && itemToBeRemoved.next() == null) {
            if (parent == null) {
                this.root = null;
            } else if (parent.previous() == itemToBeRemoved) {
                parent.setPrevious(null);
            } else {
                parent.setNext(null);
            }
        }

        //* Case 2: item has only one child: right
        else if (itemToBeRemoved.previous() == null) {
            if(parent == null){
                this.root = itemToBeRemoved.next();
            } else if(parent.previous() == itemToBeRemoved){
                parent.setPrevious(itemToBeRemoved.next());
            } else {
                parent.setNext(itemToBeRemoved.next());
            }
        }

        //* Case 2: item has only one child: left
        else if (itemToBeRemoved.next() == null) {
            if(parent == null){
                this.root = itemToBeRemoved.previous();
            } else if(parent.next() == itemToBeRemoved){
                parent.setNext(itemToBeRemoved.previous());
            } else {
                parent.setPrevious(itemToBeRemoved.previous());
            }
        }

        //* Case 3: Item has 2 children
        else {
            ListItem successor = itemToBeRemoved.next();
            ListItem successorParent = itemToBeRemoved;
            while(successor.previous() != null){
                successorParent = successor;
                successor = successor.previous();
            }
            itemToBeRemoved.setValue(successor.getValue());

            if(successorParent == itemToBeRemoved){
                successorParent.setNext(successor.next());
            } else {
                successorParent.setPrevious(successor.next());
            }
        }
    }
}
