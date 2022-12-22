package no.uib.inf101.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMain {

    @Test
    public void testGetSize() {
        MovingDot dot = new MovingDot();
        assertEquals(150, dot.getPreferredSize().getHeight());
    }
}
