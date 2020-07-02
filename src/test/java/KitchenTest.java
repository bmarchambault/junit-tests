import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KitchenTest {

    private Kitchen emptyKitchen;
    private Kitchen kitchenWithOne;
    private Kitchen kitchenWithMany;


    @Before
    public void setUp() throws Exception {
        emptyKitchen = new Kitchen();

        kitchenWithOne = new Kitchen();
        kitchenWithOne.add("yellow");

        kitchenWithMany = new Kitchen();
        kitchenWithMany.add("blue");
        kitchenWithMany.add("yellow");
        kitchenWithMany.add("white");
    }

//can add souts in test methods, but don't keep them.
    @Test
    public void testIsEmpty() {
        assertTrue(emptyKitchen.isEmpty());//should return true
        assertFalse(kitchenWithOne.isEmpty());//should be true
        assertFalse(kitchenWithMany.isEmpty());//should be true
    }

    @Test
    public void testSize() {
        assertEquals(0, emptyKitchen.size());
        assertEquals(1, kitchenWithOne.size());
        assertEquals(3, kitchenWithMany.size());
    }

    @Test
    public void testAdd() {
        emptyKitchen.add("yellow");
        assertEquals(1, emptyKitchen.size());

        kitchenWithOne.add("blue");
        assertEquals(2, kitchenWithOne.size());

        kitchenWithOne.add("white");
        assertEquals(3, kitchenWithOne.size());

    }

    @Test
    public void testPop() {//pop removes from an Array
        kitchenWithMany.pop();
        assertEquals(2, kitchenWithMany.size());

    }

    @Test
    public void testContains() {
        assertFalse(emptyKitchen.contains("blue"));
        assertTrue(kitchenWithOne.contains("yellow"));
        assertTrue(kitchenWithMany.contains("white"));
    }

    @Test
    public void testPrintAll() {
    }

}