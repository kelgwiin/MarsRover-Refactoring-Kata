package mars.rover.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Coordinate {
    private int x;
    private int y;
    private Direction direction;

    public Coordinate(int x, int y, char direction) {
        this(x, y, Direction.valueOfCustomName(direction));
    }
}
