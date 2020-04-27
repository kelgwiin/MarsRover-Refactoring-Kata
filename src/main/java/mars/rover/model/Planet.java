package mars.rover.model;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import mars.rover.rotate.Move;

@RequiredArgsConstructor
public class Planet {
    @NonNull
    private Coordinate position;

    @Setter
    private Move actionMove;

    public void doMovement() {
        position = actionMove.doMovement(position);
    }

    @Override
    public String toString() {
        return position.getX() + " " + position.getY() + " " + position.getDirection().getCustomName();
    }
}
