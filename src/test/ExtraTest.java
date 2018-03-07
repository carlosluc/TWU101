package test;

import main.Extra;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ExtraTest {

    @Test
    public final void fizzBuzzGame(){
        Extra extra = new Extra();
        assertEquals("1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz", extra.fizzBuzzGame(15));
    }

    @Test
    public final void primeFactors(){
        Extra extra = new Extra();
        List<Integer> list = Arrays.asList(2,3,5);
        assertEquals(list, extra.primeFactors(30));
    }
}
