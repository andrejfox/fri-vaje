package vaje06;

public class Mravlja {
    public static void main(String[] args) {
        System.out.println(stPotiWrap(20, 40));
    }

    public static long stPotiWrap(int x, int y) {
        int delta = Math.abs(x - y);
        return stPoti(x, y, new long[x + delta][y + delta]);
    }

    public static long stPoti(int x, int y, long[][] memoize) {
        if (x == 1 && y == 1) {
            return 1;
        }

        if (memoize[x - 1][y - 1] != 0) {
            return memoize[x - 1][y - 1];
        }

        if (memoize[y - 1][x - 1] != 0) {
            return memoize[y - 1][x - 1];
        }

        long count = 0;

        if (x != 1) {
            count += stPoti(x - 1, y, memoize);
        }

        if (y != 1) {
            count += stPoti(x, y - 1, memoize);
        }

        memoize[x - 1][y - 1] = count;

        return count;
    }
}
