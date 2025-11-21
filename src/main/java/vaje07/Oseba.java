package vaje07;

public class Oseba {
    private String ime;
    private String priimek;
    private char spol;
    private int letoRojstva;
    private Oseba oce = null;
    private Oseba mati = null;

    public Oseba(String ime, String priimek, char spol, int letoRojstva) {
        new Oseba(ime, priimek, spol, letoRojstva, null, null);
    }

    public Oseba(String ime, String priimek, char spol, int letoRojstva, Oseba oce, Oseba mati) {
        this.ime = ime;
        this.priimek = priimek;
        this.spol = spol;
        this.letoRojstva = letoRojstva;
        this.oce = oce;
        this.mati = mati;
    }

    public String vrniIme() {
        return this.ime;
    }

    public String toString() {
        return String.format("%s %s (%c), %d", this.ime, this.priimek, this.spol, this.letoRojstva);
    }

    public int starost(int leto) {
        return leto - this.letoRojstva;
    }

    public boolean jeStarejsaOd(Oseba os) {
        return this.letoRojstva < os.letoRojstva;
    }

    public static Oseba starejsa(Oseba a, Oseba b) {
        if (a.jeStarejsaOd(b)) {
            return a;
        } else if (b.jeStarejsaOd(b)) {
            return b;
        }

        return null;
    }

    public String imeOceta() {
        return this.oce == null ? null : this.oce.ime;
    }

    public boolean jeBratAliSestraOd(Oseba os) {
        if (this == os) {
            return false;
        }

        return this.oce == os.oce && this.mati == os.mati;
    }

    public boolean jeSestraOd(Oseba os) {
        return this.spol == 'Z' && jeBratAliSestraOd(os);
    }

    public boolean jeTetaOd(Oseba os) {
        return jeSestraOd(os.mati) || jeSestraOd(os.oce);
    }

    public boolean jeOcetovskiPrednikOd(Oseba os) {
        if (os.oce == null) {
            return false;
        }

        if (os.oce == this) {
            return true;
        }

        return jeOcetovskiPrednikOd(os.oce);
    }

    public boolean jePrednikOd(Oseba os) {
        if (os == null) {
            return false;
        }

        if (os == this) {
            return true;
        }

        return jePrednikOd(os.oce) || jePrednikOd(os.mati);
    }


}
