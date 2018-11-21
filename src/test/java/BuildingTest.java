import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuildingTest {

    Building building;


    @Before
    public void setUp() throws Exception {
        building = new Building("hospital", 250);

    }

    @Test
    public void canGetBuildingType() {
        assertEquals("hospital", building.getType());
    }

    @Test
    public void canGetBuildingHealth() {
        assertEquals(250, building.getHealthValue());
    }

    @Test
    public void canTakeDamage() {
        building.takeDamage(50);
        assertEquals(200, building.getHealthValue());
    }
}
