package by.epam.training.composition;

import by.epam.training.composition.logic.Methods;
import org.junit.Test;

import static org.junit.Assert.*;

public class MethodsTest {

    @Test
    public void hasNextStep() {
        int arg = 20;
        int max = 19;
        boolean actual = Methods.hasNextStep(arg,max);
        assertFalse(actual);
    }

    @Test
    public void calculateStep() {
        int pointA = 25;
        int pointB = 38;
        int actual = Methods.calculateStep(pointA,pointB);
        int expected = 1;
        assertEquals(expected,actual);
    }

    @Test
    public void calculateFunction() {
        int arg=20;
        double actual = Methods.calculateFunction(arg);
        double expected = 0.6669;
        assertEquals(expected,actual,0.0001);
    }
}