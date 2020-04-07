package mars.rover.rotate;

import mars.rover.model.Coordinate;
import mars.rover.model.Direction;

public class MoveLeft implements Move {
    @Override
    public Coordinate doMovement(Coordinate coordinate) {
        Direction newDirection = Direction.valueOfCustomName(coordinate.getDirection().getLeft());
        return new Coordinate(coordinate.getX(), coordinate.getY(), newDirection);
    }
}
