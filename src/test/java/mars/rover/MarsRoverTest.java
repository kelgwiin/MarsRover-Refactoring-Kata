package mars.rover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {

    @Test
    public void
    acceptance_test_1() {
        String newPositionRefactored = MarsRover.process(1, 2, 'N', "LMLMLMLMM");
        assertEquals("1 3 N", newPositionRefactored);
    }

    @Test
    public void
    acceptance_test_2() {
        String newPositionRefactored = MarsRover.process(3, 3, 'E', "MMRMMRMRRM");

        assertEquals("5 1 E", newPositionRefactored);
    }

}