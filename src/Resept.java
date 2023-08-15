abstract public class Resept {
    public final int id;
    public final Legemiddel reseptLegemiddel;
    public final Lege reseptLege;
    public final int reseptPasientID;
    public int reit;
    private static int teller = 0;

    public Resept(Legemiddel paramReseptLegemiddel, Lege paramReseptLege, int paramPasientID, int paramReit) {
        teller = teller + 1;
        id = teller;
        this.reseptLegemiddel = paramReseptLegemiddel;
        this.reseptLege = paramReseptLege;
        this.reseptPasientID = paramPasientID;
        this.reit = paramReit;
    }

    public int hentId() {
        return id;
    }

    public Legemiddel hentLegemiddel() {
        return reseptLegemiddel;
    }

    public Lege hentLege() {
        return reseptLege;
    }

    public int hentPasientId() {
        return reseptPasientID;
    }

    public int hentReit() {
        return reit;
    }

    public boolean bruk() {
        if (reit > 0) {
            reit = reit - 1;
            return true;
        }
        return false;
    }

    abstract public String farge();

    abstract public int prisAaBetale();
}