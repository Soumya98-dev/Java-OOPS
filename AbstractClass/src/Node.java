public class Node extends ListItem {
    public Node(Object initialNodeValue){
        super(initialNodeValue);
    }

    @Override
    ListItem next(){
        return this.rightLink;
    }

    @Override
    ListItem setNext(ListItem newRightLink){
        this.rightLink = newRightLink;
        return this.rightLink;
    }

    @Override
    ListItem previous(){
        return this.leftLink;
    }

    @Override
    ListItem setPrevious(ListItem newLeftLink){
        this.leftLink = newLeftLink;
        return this.leftLink;
    }

    @Override
    int compareTo(ListItem item){
        return ((String) super.getValue()).compareTo((String) item.value);
    }

}
