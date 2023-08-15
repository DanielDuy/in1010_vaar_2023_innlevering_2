public class HvitResept extends Resept {
    public HvitResept(Legemiddel paramReseptLegemiddel, Lege paramReseptLege, int paramPasientID, int paramReit) {
        super(paramReseptLegemiddel, paramReseptLege, paramPasientID, paramReit);
    }

    public String farge() {
        return "Hvit";
    }

    public int prisAaBetale() {
        return reseptLegemiddel.hentPris();
    }
}
