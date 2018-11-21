import Interfaces.IDamage;

public class Army2 extends Vehicle {
    public Army2(String type, int healthValue) {
        super(type, healthValue);
    }

    public String attack(IDamage damage) {
        return "Opponent attacked!";
    }

    public void takeDamage(int damage) {
        this.setHealthValue(getHealthValue() - damage);
    }
}
