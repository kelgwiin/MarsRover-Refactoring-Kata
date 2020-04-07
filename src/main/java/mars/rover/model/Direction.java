package mars.rover.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@Getter
public enum Direction {
    NORTH('N', 'W', 'E'),
    WEST('W', 'S', 'N'),
    SOUTH('S', 'E', 'W'),
    EAST('E', 'N', 'S');

    private final char customName;
    private final char left;
    private final char right;

    private final static Map<Character, Direction> BY_CUSTOM_NAME = new HashMap<>();

    static {
        Arrays.stream(values()).forEach(direction -> BY_CUSTOM_NAME.put(direction.customName, direction));
    }

    public static Direction valueOfCustomName(Character customName) {
        return BY_CUSTOM_NAME.get(customName);
    }

}