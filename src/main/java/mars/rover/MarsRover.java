package mars.rover;

import mars.rover.model.Coordinate;
import mars.rover.model.Planet;
import mars.rover.rotate.Move;
import mars.rover.rotate.MoveBuilder;

public class MarsRover {
    public static String process(int x, int y, char direction, String instructions) {
        MoveBuilder moveBuilder = new MoveBuilder();
        Planet planet = new Planet(new Coordinate(x, y, direction));
        moveBuilder.build();

        instructions.chars().forEach(instruction -> {
            Move actionMove;
            actionMove = moveBuilder.getActionMove((char) instruction);

            planet.setActionMove(actionMove);
            planet.doMovement();
        });

        return planet.toString();
    }
}
