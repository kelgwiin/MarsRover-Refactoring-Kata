package mars.rover.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Planet {
    private Coordinate position;

    @Override
    public String toString() {
        return position.getX() + " " + position.getY() + " " + position.getDirection().getCustomName();
    }
}
