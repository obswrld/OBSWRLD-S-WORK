import Staccks.Stacck;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

    @Test
    public void testThatStackIsEmpty(){
        Stacck myStacck = new Stacck(4);
        assertTrue(myStacck.isEmpty());
    }

    @Test
    public void testStackIsNotEmpty(){
        Stacck myStacck = new Stacck(4);
        assertTrue(myStacck.isEmpty());

        myStacck.push("Ball");
        assertFalse(myStacck.isEmpty());
    }

    @Test
    public void testStackIsEmptyAndNotEmpty(){
        Stacck myStacck = new Stacck(4);
        assertTrue(myStacck.isEmpty());

        myStacck.push("Ball");
        assertFalse(myStacck.isEmpty());
        myStacck.pop();
        assertTrue(myStacck.isEmpty());
    }

    @Test
    public void testStackPopTheLastElement(){
        Stacck myStacck = new Stacck(4);
        assertTrue(myStacck.isEmpty());
        myStacck.push("Ball");
        assertFalse(myStacck.isEmpty());
        myStacck.push("Boots");
        assertFalse(myStacck.isEmpty());
        myStacck.pop();
        assertFalse(myStacck.isEmpty());
    }

    @Test
    public void testThatStackIsFull(){
        Stacck myStacck = new Stacck(4);
        assertTrue(myStacck.isEmpty());
        myStacck.push("Ball");
        assertFalse(myStacck.isEmpty());
        myStacck.push("Boots");
        assertFalse(myStacck.isEmpty());
        myStacck.push("Socks");
        assertFalse(myStacck.isEmpty());
        myStacck.push("Gloves");
        assertFalse(myStacck.isEmpty());
        assertTrue(myStacck.isFull());
    }

    @Test
    public void testStackIsFullAndNotEmpty(){
        Stacck myStacck = new Stacck(4);
        assertTrue(myStacck.isEmpty());
        myStacck.push("Ball");
        assertFalse(myStacck.isEmpty());
        myStacck.push("Boots");
        assertFalse(myStacck.isEmpty());
        myStacck.push("Socks");
        assertFalse(myStacck.isEmpty());
        myStacck.push("Gloves");
        assertFalse(myStacck.isEmpty());
        myStacck.pop();
        assertFalse(myStacck.isEmpty());
    }

    @Test
    public void testStackCanBeFullAndNotFull(){
        Stacck myStacck = new Stacck(4);
        assertTrue(myStacck.isEmpty());
        myStacck.push("Ball");
        assertFalse(myStacck.isEmpty());
        myStacck.push("Boots");
        assertFalse(myStacck.isEmpty());
        myStacck.push("Socks");
        assertFalse(myStacck.isEmpty());
        myStacck.push("Gloves");
        assertFalse(myStacck.isEmpty());
        assertTrue(myStacck.isFull());
        myStacck.pop();
        assertFalse(myStacck.isEmpty());
        assertFalse(myStacck.isFull());
    }

}
