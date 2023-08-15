public class PResept extends HvitResept {
    //unge rabatt på prevesjonsmidler på minus 108 kr. (Pass på at prisen ikke blir negativ)
    public PResept(Legemiddel paramReseptLegemiddel, Lege paramReseptLege, int paramPasientID, int paramReit) {
        super(paramReseptLegemiddel, paramReseptLege, paramPasientID, paramReit);
    }

    @Override
    public int prisAaBetale() {
        if ((reseptLegemiddel.hentPris() - 108) > 0) {
            return reseptLegemiddel.hentPris() - 108;
        } else {
            return 0;
        }
    }
}
