package other;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by HL on 3/21/17.
 */
public class StuffTest {

    @Test
    public void addTest(){
        Stuff stuff = new Stuff();
        assertTrue("1+1", 2==stuff.add(1,1));
    }
}