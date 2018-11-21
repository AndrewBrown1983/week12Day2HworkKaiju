import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Army2Test {

    Army2 army2;
    BigLizard bigLizard;

    @Before
    public void setUp() throws Exception {
        army2 = new Army2("destroyer", 80);
        bigLizard = new BigLizard("Boris", 100, 50);
    }

    @Test
    public void canGetType() {
        assertEquals("destroyer", army2.getType());
    }

    @Test
    public void canGetHealth() {
        assertEquals(80, army2.getHealthValue());
    }

    @Test
    public void canAttack() {
        assertEquals("Opponent attacked!", army2.attack(bigLizard));
    }

    @Test
    public void canTakeDamage() {
        bigLizard.takeDamage(40);
        assertEquals(60, bigLizard.getHealthValue());
    }
}
