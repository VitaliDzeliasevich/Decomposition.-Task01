package by.epam.training.composition;

import static org.junit.Assert.*;

public class Task7CompositionTest {

    @org.junit.Test
    public void calculateStep() {
        int actual = Task7Composition.calculateStep(40,80);
        int expected = 4;
        assertEquals(expected,actual);
    }

    @org.junit.Test
    public void calculateX() {
        double actual = Task7Composition.calculateX(20);
        double expected = 0.6669;
        assertEquals(expected,actual,0.0001);
    }
}