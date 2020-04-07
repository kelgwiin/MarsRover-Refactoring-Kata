package mars.rover.rotate;

import java.util.HashMap;
import java.util.Map;

public class MoveBuilder {
    private final Map<Character, Move> moveMap = new HashMap<>();

    public void build() {
        moveMap.put('L', new MoveLeft());
        moveMap.put('R', new MoveRight());
        moveMap.put('M', new MoveForward());
    }

    public Move getActionMove(char direction) {
        return moveMap.get(direction);
    }
}
