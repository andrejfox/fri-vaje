package vaje06;

public class Volitve {
    public static void main(String[] args) {
        int[][][] volitve = {
                {
                        {20,  5,  0, 10},
                        {30, 40, 45, 25},
                        {50, 20, 20, 15},
                        { 0, 15,  5, 25},
                        { 0, 20, 30, 25},
                },
                {
                        {60,  5, 25,  0},
                        {10, 15, 15, 30},
                        {10, 65, 15, 55},
                        { 0,  5, 25,  0},
                        {20, 10, 20, 15},
                },
                {
                        {20, 10, 10,  0},
                        { 5, 30,  5, 90},
                        {15, 30, 10, 10},
                        {40, 20,  5,  0},
                        {20, 10, 70,  0},
                },
        };

        for (int stranka = 0;  stranka < volitve[0].length;  stranka++) {
            System.out.println(Volitve.najVolisce(volitve, stranka));
        }
    }

    public static int steviloGlasov(int[][][] t, int leto, int stranka) {
        int sum = 0;
        for (int volisce : t[leto][stranka]) {
            sum += volisce;
        }
        return sum;
    }

    public static int[][] glasovi(int[][][] t) {
        int[][] ret = new int[t.length][t[0].length];
        for (int leto = 0; leto < t.length; leto++) {
            for (int stranka = 0; stranka < t[leto].length; stranka++) {
                ret[leto][stranka] = steviloGlasov(t, leto, stranka);
            }
        }
        return ret;
    }

    public static int najVolisce(int[][][] t, int stranka) {
        int maxGlasoviIndex = 0;
        int maxGlasovi = 0;
        int curGlasovi = 0;

        for (int[][] leto : t) {
            maxGlasovi += leto[stranka][maxGlasoviIndex];
        }

        for (int volisce = 1; volisce < t[0][0].length; volisce++) {
            for (int[][] leto : t) {
                curGlasovi += leto[stranka][volisce];
            }
            if (maxGlasovi < curGlasovi) {
                maxGlasoviIndex = volisce;
                maxGlasovi = curGlasovi;
            }
            curGlasovi = 0;
        }

        return maxGlasoviIndex;
    }

    public static int vsotaUvrstitev(int[][][] t, int stranka, int volisce) {
        int sum = 0;
        for (int i = 0; i < t.length; i++) {
            sum += mesto(t, i, stranka, volisce);
        }
        return sum;
    }

    private static int mesto(int[][][] t, int leto, int stranka, int volisce) {
        int count = 1;
        for (int curStranka = 0; curStranka < t[leto].length; curStranka++) {
            if (curStranka == stranka) {
                continue;
            }

            if (t[leto][curStranka][volisce] > t[leto][stranka][volisce]) {
                count++;
            }
        }
        return count;
    }
}
