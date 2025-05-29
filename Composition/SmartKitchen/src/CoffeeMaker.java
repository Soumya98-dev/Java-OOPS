public class CoffeeMaker {
    private boolean hasWorkToDo;

    public CoffeeMaker(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean getHasWorkToDo(){
        return this.hasWorkToDo;
    }

    public void brewCoffee(){
        if(this.hasWorkToDo){
            System.out.println("Brewing coffee");
            this.hasWorkToDo = false;
        }
    }
}
