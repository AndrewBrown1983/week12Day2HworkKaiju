import Interfaces.IDamage;

public class BigLizard extends Kaiju {
    public BigLizard(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }

    public String roar() {
        return "Rar!";
    }

    public String move() {
        return "thump thump!";
    }


    public String attack(IDamage damage) {
        return  "Opponent attacked!";
    }

    public void takeDamage(int damage) {
        this.setHealthValue(getHealthValue() - damage);
    }
}
