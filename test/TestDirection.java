import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDirection {
    @Test
    public void deplacerSouth() throws Exception {
        Direction direction = new Direction();
        direction.deplacer('S');
        assertEquals(0,direction.x);
        assertEquals(-1,direction.y);
    }

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void deplacerNorth() throws Exception {
        Direction direction = new Direction();
        direction.deplacer('N');
        assertEquals(0,direction.x);
        assertEquals(1,direction.y);
    }

    @Test
    public void deplacerOuest() throws Exception {
        Direction direction = new Direction();
        direction.deplacer('O');
        assertEquals(-1,direction.x);
        assertEquals(0,direction.y);
    }

    @Test
    public void deplacerEast() throws Exception {
        Direction direction = new Direction();
        direction.deplacer('E');
        assertEquals(1,direction.x);
        assertEquals(0,direction.y);
    }

    @Test
    public void deplacerAll() throws Exception {
        Direction direction = new Direction();
        direction.deplacer('S');
        direction.deplacer('E');
        direction.deplacer('O');
        direction.deplacer('N');
        assertEquals(0,direction.x);
        assertEquals(0,direction.y);
    }

    @Test
    public void deplacerRandom() throws Exception {
        Direction direction = new Direction();
        direction.deplacer('S');
        direction.deplacer('S');
        direction.deplacer('S');
        direction.deplacer('S');
        direction.deplacer('S');
        direction.deplacer('N');
        direction.deplacer('N');
        direction.deplacer('E');
        assertEquals(1,direction.x);
        assertEquals(3,direction.y);
    }
}
