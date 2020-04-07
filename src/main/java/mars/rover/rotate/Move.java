package mars.rover.rotate;

import mars.rover.model.Coordinate;

public interface Move {
    Coordinate doMovement(Coordinate coordinate);
}
