public class TestLegemiddel {
    public static void main(String [] args) {
        try {
            VanligLegemiddel legemiddel1 = new VanligLegemiddel("middel1", 100, 5.2);
            legemiddel1.hentPris();
            legemiddel1.settNyPris(234);
            if (legemiddel1.id != 0) {
                System.out.println("Feil ID for legemiddel1");
            }
        } catch (Exception e) {
            System.out.println("Feilet å lage VanligLegemiddel-objekt");
        }

        try {
            NarkotiskLegemiddel legemiddel2 = new NarkotiskLegemiddel("middel2", 150, 1.0, 2);
            if (legemiddel2.id != 1) {
                System.out.println("Feil ID for legemiddel2");
            }
        } catch (Exception e) {
            System.out.println("Feilet å lage NarkotiskLegemiddel-objekt");
        }

        try {
            VanedannedeLegemiddel legemiddel3 = new VanedannedeLegemiddel("middel3", 200, 25.5, 5);
            if (legemiddel3.id != 2) {
                System.out.println("Feil ID for legemiddel3");
            }
        } catch (Exception e) {
            System.out.println("Feilet å lage VandedannedeLegemiddel");
        }
    }
}
