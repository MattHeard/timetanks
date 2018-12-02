package net.mattheard.timetanks;

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
}
