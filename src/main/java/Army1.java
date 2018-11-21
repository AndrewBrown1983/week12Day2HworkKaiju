import Interfaces.IDamage;

public class Army1 extends Vehicle{
    public Army1(String type, int healthValue) {
        super(type, healthValue);
    }

    public String attack(IDamage enemy) {
        return "Opponent attacked!";
    }

    public void takeDamage(int damage) {
        this.setHealthValue(getHealthValue() - damage);
    }
}
