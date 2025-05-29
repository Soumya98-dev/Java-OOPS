public class Refrigerator {
    private boolean hasWorkToDo;

    public Refrigerator(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean getHasWorkToDo(){
        return this.hasWorkToDo;
    }

    public void orderFood(){
        if(this.hasWorkToDo){
            System.out.println("Ordering food");
            this.hasWorkToDo = false;
        }
    }
}
