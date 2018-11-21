import Interfaces.IDamage;

public class BiggerLizard extends Kaiju {
    public BiggerLizard(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }

    public String roar() {
        return "Raaaaaar!";
    }

    public String move() {
        return "thud thud!";
    }

    public String attack(IDamage damage) {
        return "Opponent attacked!";
    }

    public void takeDamage(int damage) {
        this.setHealthValue(getHealthValue() - damage);
    }
}
