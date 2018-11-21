import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Army1Test {

    Army1 army1;
    BigLizard bigLizard;

    @Before
    public void setUp() throws Exception {
        army1 = new Army1("bomber", 150);
        bigLizard = new BigLizard("Boris", 100, 50);
    }

    @Test
    public void cangetType() {
        assertEquals("bomber", army1.getType());
    }

    @Test
    public void canGetHealth() {
        assertEquals(150, army1.getHealthValue());
    }

    @Test
    public void canAttack() {
        assertEquals("Opponent attacked!", army1.attack(bigLizard));
    }

    @Test
    public void canTakeDamage() {
        army1.takeDamage(50);
        assertEquals(100, army1.getHealthValue());
    }
}
