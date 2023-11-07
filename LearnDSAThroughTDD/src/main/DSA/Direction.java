package main.DSA;

enum Direction {
    EAST("E", "N", "S"),
    NORTH("N", "W", "E"),
    SOUTH("S", "E", "W"),
    WEST("W", "S", "N");


    private final String value;
    private final String left;
    private final String right;

    Direction(String value, String left, String right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Direction right() {
        return directionToThe(right);
    }

    private Direction directionToThe(String value) {
        for (Direction direction : values()) {
            if (direction.value == value)
                return direction;
        }
        return null;
    }

    public Direction left() {
        return directionToThe(left);
    }

    public String value() {
        return value;
    }
}
