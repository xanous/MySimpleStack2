package dcll.aaou.MySimpleStack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by root on 14/04/16.
 */
public class SimpleStackImplTest {
    SimpleStack simpleStack;

    @Before
    public void setUp() throws Exception{
        simpleStack = new SimpleStackImpl();
    }

    @Test
    public void testIsEmpty() throws Exception {
        assertTrue("Stack vide lors de sa creeation",simpleStack.isEmpty());
        simpleStack.push(new Item(new String("Anass Aoun")));
        assertFalse("Stack non vide arpès ajout d'un element",simpleStack.isEmpty());
    }

    @Test
    public void testGetSize() throws Exception {
        assertEquals("Stack vide lors de sa creeation",0,simpleStack.getSize());
        String nomPrenom = new String("Aoun");
        simpleStack.push(new Item(new String(nomPrenom)));
        simpleStack.push(new Item(new String(nomPrenom+" Anass")));
        assertEquals("Stack non vide arpès ajout d'un element",2,simpleStack.getSize());
    }

    @Test
    public void testPush() throws Exception {
        Item item = new Item(new String("Anass"));
        assertEquals(0,simpleStack.getSize());
        simpleStack.push(item);
        assertEquals(1,simpleStack.getSize());
        Item o = simpleStack.peek();
        assertTrue(o.getValue() instanceof String);
        assertEquals("Anass",item.getValue());
        assertTrue(o.getValue().equals("Anass"));
        assertFalse(o.getValue().equals("An"));
    }

    @Test
    public void testPeek() throws Exception {
        Item item = new Item(new Integer(10));
        assertEquals(0,simpleStack.getSize());
        simpleStack.push(item);
        assertEquals(1,simpleStack.getSize());
        Item o = simpleStack.peek();
        assertTrue(o.getValue() instanceof Integer);
        assertEquals(10,item.getValue());
        assertEquals(item.getValue(),o.getValue());
    }

    @Test
    public void testPop() throws Exception {
        Item item = new Item(new Integer(11));
        assertEquals(0,simpleStack.getSize());
        simpleStack.push(item);
        assertEquals(1,simpleStack.getSize());
        Item o = simpleStack.pop();
        assertEquals(0,simpleStack.getSize());
        assertTrue(o.getValue() instanceof Integer);
        assertEquals(11,item.getValue());
        assertEquals(item.getValue(),o.getValue());
    }
}