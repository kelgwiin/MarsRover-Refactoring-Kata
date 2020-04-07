package mars.rover.rotate;

import mars.rover.model.Coordinate;
import mars.rover.model.Direction;

public class MoveRight implements Move {
    public Coordinate doMovement(Coordinate coordinate) {
        Direction newDirection = Direction.valueOfCustomName(coordinate.getDirection().getRight());
        return new Coordinate(coordinate.getX(), coordinate.getY(), newDirection);
    }
}
