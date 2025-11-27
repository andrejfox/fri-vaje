package vaje08;

public class Knjiznica {

    private int stClanov;
    private int stNaslovov;
    private int stIzvodovNaNaslov;

    private int[][] clanList;
    private int[] naslovList;
    private int[] izposojaLog;

    public Knjiznica(int stClanov, int stNaslovov, int stIzvodovNaNaslov) {
        this.stClanov = stClanov;
        this.stNaslovov = stNaslovov;
        this.stIzvodovNaNaslov = stIzvodovNaNaslov;

        this.clanList = new int[stClanov][stNaslovov];
        this.naslovList = new int[stNaslovov];
        this.izposojaLog = new int[stNaslovov];

        for (int i = 0; i < stNaslovov; i++) {
            naslovList[i] = stIzvodovNaNaslov;
        }
    }

    public boolean posodi(int clan, int naslov) {
        if (naslovList[naslov] <= 0) return false;
        if (clanList[clan][naslov] >= 1) return false;

        izposojaLog[naslov]++;
        naslovList[naslov]--;
        clanList[clan][naslov]++;

        return true;
    }

    public void clanVrne(int clan) {
        for (int i = 0; i < stNaslovov; i++) {
            naslovList[i] += clanList[clan][i];
            clanList[clan][i] = 0;
        }
    }

    public int posojeni(int naslov) {
        return stIzvodovNaNaslov - naslovList[naslov];
    }

    public int priClanu(int clan) {
        int sum = 0;

        for (int i = 0; i < stNaslovov; i++) {
            sum += clanList[clan][i];
        }

        return sum;
    }

    public int najNaslov() {
        int najNaslov = 0;

        for (int i = 1; i < stNaslovov; i++) {
            if (izposojaLog[i] > izposojaLog[najNaslov]) {
                najNaslov = i;
            }
        }

        return najNaslov;
    }
}
