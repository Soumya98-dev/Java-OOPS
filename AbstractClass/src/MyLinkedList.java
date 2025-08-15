public class MyLinkedList implements NodeList {
    ListItem root = null;

    public MyLinkedList(ListItem initialRoot) {
        this.root = initialRoot;
    }

    public ListItem getRoot() {
        return this.root;
    }

    public boolean addItem(ListItem newItem) {
        //* Handling the empty list
        if (this.root == null) {
            this.root = newItem;
            return true;
        }

        //* Traversing the list
        ListItem currentItem = this.root;
        while (true) {
            int comparison = currentItem.compareTo(newItem);

            //* currentItem smaller than newItem
            if (comparison < 0) {
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(newItem);
                    newItem.setPrevious(currentItem);
                    return true;
                }
            }
            //* currentItem larger than newItem
            else if (comparison > 0) {
                if (currentItem != root) {
                    newItem.setPrevious(currentItem.previous());
                    currentItem.previous().setNext(newItem);
                    newItem.setNext(currentItem);
                    currentItem.setPrevious(newItem);
                } else {
                    newItem.setNext(currentItem);
                    currentItem.setPrevious(newItem);
                    this.root = newItem;
                }
                return true;
            }
            //* comparison == 0 ; duplicate is found
            else {
                return false;
            }
        }
    }

    public boolean removeItem(ListItem itemToRemove) {
        //! Edge Cases
        if (itemToRemove == null || this.root == null) {
            return false;
        }

        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(itemToRemove);

            //* Found the item
            if (comparison == 0) {
                //* removing the root
                if (currentItem == this.root) {
                    this.root = currentItem.next();
                    if (this.root != null) {
                        this.root.setPrevious(null);
                    }
                }
                //* Removing from the middle
                else {
                    //* Getting the items before and after
                    ListItem previousItem = currentItem.previous();
                    ListItem nextItem = currentItem.next();
                    //* previous item pointing to the next item
                    previousItem.setNext(nextItem);
                    //* If there is a nextItem
                    if (nextItem != null) {
                        nextItem.setPrevious(previousItem);
                    }
                    //* If no next item; means the "itemToRemove" is tail
//                previousItem.setNext(null);
                }
            }
            //* itemToRemove is ahead
            else if (comparison < 0) {
                currentItem = currentItem.next();
            }
            //* the itemToRemove not in the list (comparison > 0)
            else {
                return false;
            }
        }
        return false;
    }

    public void traverse(ListItem root) {
        if(root == null){
            System.out.println("The list is empty");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }
}
