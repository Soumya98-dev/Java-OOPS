public class Dishwasher {
    private boolean hasWorkToDo;

    public Dishwasher(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean getHasWorkToDo(){
        return this.hasWorkToDo;
    }

    public void doDishes(){
        if(this.hasWorkToDo){
            System.out.println("Washing dishes");
            this.hasWorkToDo = false;
        }
    }
}
