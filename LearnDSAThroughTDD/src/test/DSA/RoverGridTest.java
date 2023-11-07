package test.DSA;

import main.DSA.Coordinates;
import main.DSA.Grid;
import main.DSA.RoverGrid;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class RoverGridTest {
    private RoverGrid rover;

    @BeforeEach
    public void setUP() {
        Grid grid = new Grid();
        rover = new RoverGrid(grid);

    }


    @Test
    public void rotate_right() {
        assertEquals(rover.execute("R"), "0:0:E");
    }

    @Test
    public void rotate_right2() {
        assertEquals(rover.execute("RR"), "0:0:S");
    }

    @Test
    public void rotate_right3() {
        assertEquals(rover.execute("RRR"), "0:0:W");
    }

    @Test
    public void rotate_right4() {
        assertEquals(rover.execute("RRR"), "0:0:W");
    }

    @Test
    public void rotate_Left1() {
        assertEquals(rover.execute("L"), "0:0:W");
    }

    @Test
    public void rotate_Left2() {
        assertEquals(rover.execute("LL"), "0:0:S");
    }

    @Test
    public void rotate_Left3() {
        assertEquals(rover.execute("LLL"), "0:0:E");
    }

    @Test
    public void rotate_Left4() {
        assertEquals(rover.execute("LLLL"), "0:0:N");
    }

    @Test
    public void rotate_leftAndThen_right() {
        assertEquals(rover.execute("LR"), "0:0:N");
    }
    @Test
    public void move_top_from_north() {
        assertEquals(rover.execute("MMM"), "0:3:N");
    }
    @Test
    public void move_bottom_from_north() {
        assertEquals(rover.execute("MMMMMMMMMMMMMMM"), "0:5:N");
    }

    @Test
    public void move_right_from_east() {
        assertEquals(rover.execute("RMMMMMM"), "6:0:E");
    }
    @Test
    public void move_left_from_right_in_east_direction() {
        assertEquals(rover.execute("RMMMMMMMMMM"), "0:0:E");
    }
    @Test
    public void move_left() {
        assertEquals(rover.execute("LMMMMM"), "5:0:W");
    }

    @Test
    public void move_south() {
        assertEquals(rover.execute("LLMMM"), "0:7:S");
    }
    @Test
    public void move_right_turn_left_and_move() {
        assertEquals(rover.execute("RMMLM"), "2:1:N");
    }
    @Test
    public void stop_at_obstacle() {

        Coordinates obstacle_0X4 = new Coordinates(0, 4);
        Grid grid = new Grid(asList(obstacle_0X4));
        RoverGrid roverGrid = new RoverGrid(grid);
        assertEquals(rover.execute("MMMM"), "O:0:3:N");
    }

    @Test
    public void tuna_is_getting(){
        String str  = null;
        assertEquals(reverse(str), "");
        str = "";
        assertEquals(reverse(str), "");
        str ="K";
        assertEquals(reverse(str), "K");

        str ="Ka";
        assertEquals(reverse(str), "aK");

        str ="Kartheek";
        assertEquals(reverse(str), "keehtraK");

    }

    @Test
    public void bitWise_operation(){
        int a = 5;
        int b = 5;
        System.out.println(a & b);
    }


    public String reverse(String value){
        if(value == "" || value == null)
            return "";
        if(value.length() == 1)
            return value;
        return reverse(value.substring(1))+value.charAt(0);
    }


}
