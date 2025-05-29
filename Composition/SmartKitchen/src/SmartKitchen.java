public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private Dishwasher dishwasher;
    private Refrigerator iceBox;

    public SmartKitchen(){
        this.brewMaster = new CoffeeMaker(true);
        this.dishwasher = new Dishwasher(true);
        this.iceBox = new Refrigerator(true);
    }

    public void addWater(){
        brewMaster.brewCoffee();
    }

    public void pourMilk(){
        iceBox.orderFood();
    }

    public void loadDishwasher(){
        dishwasher.doDishes();
    }

    public void setKitchenState(boolean makeCoffee, boolean doDishes, boolean useRefrigerator){
        this.brewMaster = new CoffeeMaker(makeCoffee);
        this.dishwasher = new Dishwasher(doDishes);
        this.iceBox = new Refrigerator(useRefrigerator);
    }

    public void doKitchenWork(){
        if(brewMaster.getHasWorkToDo()){
            brewMaster.brewCoffee();
        }
        if(dishwasher.getHasWorkToDo()){
            dishwasher.doDishes();
        }
        if(iceBox.getHasWorkToDo()){
            iceBox.orderFood();
        }
    }

}
