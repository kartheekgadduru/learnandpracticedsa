package main.DSA;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static main.DSA.Direction.*;

public class Grid {
    private static final int MAX_HEIGHT = 10;
    private static final int MAX_WIDTH = 10;
    private List<Coordinates> obstacles = Collections.emptyList();

    public Grid() {
    }

    public  Grid(List<Coordinates> obstacles) {
        this.obstacles = obstacles;
    }

    public Optional<Coordinates> nextCoordinateFor(Coordinates coordinates, Direction direction) {

        int y = coordinates.y();
        int x = coordinates.x();
        if (direction == NORTH) {
            y = (y + 1) % MAX_HEIGHT;
        }
        if (direction == EAST) {
            x = (x + 1) % MAX_WIDTH;
        }
        if (direction == WEST) {
            x = (x > 0) ? x - 1 : MAX_WIDTH - 1;
        }
        if (direction == SOUTH) {
            y = y > 0 ? y - 1 : MAX_WIDTH - 1;
        }
        Coordinates newCoordinates = new Coordinates(x, y);

        return obstacles.contains(newCoordinates) ? Optional.empty() : Optional.of(newCoordinates);


    }


}
