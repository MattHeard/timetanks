package net.mattheard.timetanks;

import java.util.List;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName ) {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite( AppTest.class );
    }

    public void testCommanderNameAlice() {
        final String name = "Alice";
        final Commander commander = new Commander(name);
        assertEquals(name, commander.getName());
    }

    public void testCommanderNameBob() {
        final String name = "Bob";
        final Commander commander = new Commander(name);
        assertEquals(name, commander.getName());
    }

    public void testEmptyInventorySize() {
        final Inventory inventory = new Inventory();
        assertEquals(0, inventory.size());
    }

    public void testTankNameHeartseeker() {
        final String name = "Heartseeker";
        final Tank tank = new Tank(name);
        assertEquals(name, tank.getName());
    }

    public void testTankNameSpectre() {
        final String name = "Spectre";
        final Tank tank = new Tank(name);
        assertEquals(name, tank.getName());
    }

    public void testNewCommanderTankNames() {
        Commander commander = new Commander("Alice");
        List<String> tankNames = commander.getTankNames();
        assertEquals(0, tankNames.size());
    }
}
