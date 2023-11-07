package main.DSA;

import java.util.Optional;

import static main.DSA.Direction.NORTH;

public class RoverGrid {
    private Grid grid;
    Direction direction = NORTH;
    Coordinates coordinate = new Coordinates(0,0);
    public RoverGrid(Grid grid) {
        this.grid = grid;
    }
    public String execute(String commands) {
        String obstacleString = "";
        for (char command : commands.toCharArray()) {
            if (command == 'R'){
                direction = direction.right();
            }
             if(command == 'L'){
                direction = direction.left();
            }
            if (command == 'M') {
                obstacleString = move();
            }
        }

        return obstacleString + coordinate.x() + ":" + coordinate.y()+":" + direction.value();
    }

    private String move() {

        Optional<Coordinates> nextCoordinate =  grid.nextCoordinateFor(this.coordinate, direction);
        nextCoordinate.ifPresent(nc -> this.coordinate = nc);
     return nextCoordinate.isPresent() ? "" : "O";
    }

}
