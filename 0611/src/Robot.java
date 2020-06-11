import java.util.*;

public class Robot {
    public int countWays(int x, int y) {
         return count(x,y);

    }

    private int count(int x, int y) {
        if (x == 1 || y == 1) {
            return 1;
        }
        return count(x-1,y) + count(x, y -1);
    }
}