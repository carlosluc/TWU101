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

    @Test
    public final void drawVerticalLine(){
        Triangle triangle = new Triangle();
        assertEquals("*\n*\n*", triangle.drawVerticalLine(3));
    }

    @Test
    public final void drawRightTriangle(){
        Triangle triangle = new Triangle();
        assertEquals("*\n**\n***", triangle.drawRightTriangle(3));
    }
}
