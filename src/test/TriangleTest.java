package test;

import main.Triangle;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TriangleTest {

    @Test
    public final void drawAsterisk(){
        Triangle triangle = new Triangle();
        assertEquals("*", triangle.drawAsterisk());
    }

    @Test
    public final void drawHorizontalLine(){
        Triangle triangle = new Triangle();
        assertEquals("********", triangle.drawHorizontalLine(8));
    }
}
