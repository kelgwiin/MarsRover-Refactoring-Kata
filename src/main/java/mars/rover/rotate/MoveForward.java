package mars.rover.rotate;

import mars.rover.model.Coordinate;
import mars.rover.model.Point;

import java.util.HashMap;
import java.util.Map;

public class MoveForward implements Move {
    private final Map<Character, Point> pointMap = new HashMap<>();

    public MoveForward() {
        init();
    }

    @Override
    public Coordinate doMovement(Coordinate coordinate) {
        Point currPoint = pointMap.get(coordinate.getDirection().getCustomName());
        return new Coordinate(coordinate.getX() + currPoint.getX(), coordinate.getY() + currPoint.getY(), coordinate.getDirection());
    }

    private void init() {
        pointMap.put('N', new Point(0, 1));
        pointMap.put('S', new Point(0, -1));
        pointMap.put('W', new Point(-1, 0));
        pointMap.put('E', new Point(1, 0));
    }
}
