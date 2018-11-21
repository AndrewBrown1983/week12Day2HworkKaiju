import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BiggerLizardTest {
    BiggerLizard biggerLizard;
    Army1 army1;

    @Before
    public void setUp() throws Exception {
        biggerLizard = new BiggerLizard("BigBoris", 100, 100);
        army1 = new Army1("bomber", 150);
    }

    @Test
    public void canGetName() {
        assertEquals("BigBoris", biggerLizard.getName());
    }

    @Test
    public void canGetHealth() {
        assertEquals(100, biggerLizard.getHealthValue());
    }

    @Test
    public void canGetAttack() {
        assertEquals(100, biggerLizard.getAttackValue());
    }

    @Test
    public void canRoar() {
        assertEquals("Raaaaaar!", biggerLizard.roar());
    }

    @Test
    public void canMove() {
        assertEquals("thud thud!", biggerLizard.move());
    }

    @Test
    public void canAttack() {
        assertEquals("Opponent attacked!", biggerLizard.attack(army1));
    }

    @Test
    public void canTakeDamage() {
        army1.takeDamage(50);
        assertEquals(100, army1.getHealthValue());
    }
}
