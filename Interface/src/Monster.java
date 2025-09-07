import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable{
    private String name;
    private int hitPoints;
    private int strength;

    //Constructor
    public Monster(String newName, int newHitPoints, int newStrength){
        this.name = newName;
        this.hitPoints = newHitPoints;
        this.strength = newStrength;
    }

    //Getters
    public String getName(){
        return this.name;
    }
    public int getHitPoints(){
        return this.hitPoints;
    }
    public int getStrength(){
        return this.strength;
    }

    public List<String> write(){
        List<String> vals = new ArrayList<>();
        vals.add(this.name);
        vals.add(String.valueOf(this.hitPoints));
        vals.add(String.valueOf(this.strength));
        return vals;
    }

    public void read(List<String> vals){
        if(vals != null && !vals.isEmpty()){
            this.name = vals.get(0);
            this.hitPoints = Integer.parseInt(vals.get(1));
            this.strength = Integer.parseInt(vals.get(2));
        }
    }

    public String toString() {
        return "Monster{name='" + this.name + "', hitPoints=" + this.hitPoints + ", strength=" + this.strength + "}";
    }

}
