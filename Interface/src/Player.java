import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable{
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    //Constructor
    public Player(String newName, int newHitPoints, int newStrength){
        this.name = newName;
        this.hitPoints = newHitPoints;
        this.strength = newStrength;
        this.weapon = "Sword";
    }

    //Getters
    public String getName(){
        return this.name;
    }
    public String getWeapon(){
        return this.weapon;
    }
    public int getHitPoints(){
        return this.hitPoints;
    }
    public int getStrength(){
        return this.strength;
    }
    //Setters
    public void setName(String newName){
        this.name = newName;
    }
    public void setWeapon(String newWeapon){
        this.weapon = newWeapon;
    }
    public void setHitPoints(int newHitPoints){
        this.hitPoints = newHitPoints;
    }
    public void setStrength(int newStrength){
        this.strength = newStrength;
    }

    public List<String> write(){
        List<String> vals = new ArrayList<>();
        vals.add(this.name);
        vals.add(String.valueOf(this.hitPoints));
        vals.add(String.valueOf(this.strength));
        vals.add(this.weapon);
        return vals;
    }

    public void read(List<String> values){
        if(values != null && !values.isEmpty()){
            this.name = values.get(0);
            this.hitPoints = Integer.parseInt(values.get(1));
            this.strength = Integer.parseInt(values.get(2));
            this.weapon = values.get(3);
        }
    }

    public String toString(){
        return "Player{name='" + this.name + "', hitPoints=" + this.hitPoints +
                ", strength=" + this.strength + ", weapon='" + this.weapon + "'}";

    }
    
}
