package main.DSA;

public class Arithmetic {
    public static final int num = Integer.MAX_VALUE;

    public Object add(int first, int second) {
        if (first == 0 && second == 0)
            return null;
        return first + second;
    }

    public boolean isOdd(int number) {
        return number % 2 == 1;
    }

}
