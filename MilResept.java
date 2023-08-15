public class MilResept extends HvitResept {
    //pris er 0 kr
    public MilResept(Legemiddel paramReseptLegemiddel, Lege paramReseptLege, int paramPasientID) {
        super(paramReseptLegemiddel, paramReseptLege, paramPasientID, 3);
    }

    @Override
    public int prisAaBetale() {
        return 0;
    }
}
