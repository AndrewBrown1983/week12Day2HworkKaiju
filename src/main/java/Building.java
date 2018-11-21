import Interfaces.IDamage;

public class Building implements IDamage {

    private String type;
    private int healthValue;

    public Building(String type, int healthValue) {
        this.type = type;
        this.healthValue = healthValue;
    }

    public String getType() {
        return type;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }

    public void takeDamage(int damage) {
        this.setHealthValue(getHealthValue() - damage);
    }
}
