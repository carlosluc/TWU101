package test;

import main.Diamond;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DiamondTest {

    @Test
    public final void drawIsoscelesTriangle(){
        Diamond diamond = new Diamond();
        assertEquals("  *  \n *** \n *****", diamond.drawIsoscelesTriangle(3));
    }
}
