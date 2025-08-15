interface NodeList {

    ListItem getRoot();
    boolean addItem(ListItem newItem);
    boolean removeItem(ListItem itemToRemove);
    void traverse(ListItem root);
}
