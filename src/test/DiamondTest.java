package test;

import main.Diamond;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DiamondTest {

    @Test
    public final void drawIsoscelesTriangle(){
        Diamond diamond = new Diamond();
        assertEquals("  *\n ***\n*****", diamond.drawIsoscelesTriangle(3));
    }

    @Test
    public final void drawDiamond(){
        Diamond diamond = new Diamond();
        assertEquals("  *\n ***\n*****\n ***\n  *", diamond.drawDiamond(3));
    }

    @Test
    public final void drawDiamondWithName(){
        Diamond diamond = new Diamond();
        assertEquals("  *\n ***\nCarlos\n ***\n  *", diamond.drawDiamondWithName(3));
    }
}
