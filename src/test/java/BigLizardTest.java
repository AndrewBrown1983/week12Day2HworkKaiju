import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BigLizardTest {

    BigLizard bigLizard;
    Army1 army1;

    @Before
    public void setUp() throws Exception {
        bigLizard = new BigLizard("Boris", 100, 50);
        army1 = new Army1("bomber", 150);
    }

    @Test
    public void canGetName() {
        assertEquals("Boris", bigLizard.getName());
    }

    @Test
    public void canGetHealth() {
        assertEquals(100, bigLizard.getHealthValue());
    }

    @Test
    public void canGetAttack() {
        assertEquals(50, bigLizard.getAttackValue());
    }

    @Test
    public void canRoar() {
        assertEquals("Rar!", bigLizard.roar());
    }

    @Test
    public void canMove() {
        assertEquals("thump thump!", bigLizard.move());
    }

    @Test
    public void canAttack() {
        assertEquals("Opponent attacked!", bigLizard.attack(army1));
    }

    @Test
    public void canTakeDamage() {
        army1.takeDamage(25);
        assertEquals(125, army1.getHealthValue());
    }
}
