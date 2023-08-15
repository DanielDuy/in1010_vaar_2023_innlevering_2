public class TestResepter {
    public static void main(String [] args) {
        VanligLegemiddel legemiddel1 = new VanligLegemiddel("middel1", 200, 5.2);
        Lege lege1 = new Lege("Hans Hansen");

        try {
            BlaaResept resept1 = new BlaaResept(legemiddel1, lege1, 15235, 4);
            if (resept1.prisAaBetale() != 50) {
                System.out.println("Feil pris på blaa resept");
            }
            resept1.bruk();
            if (resept1.hentReit() != 3) {
                System.out.println("Feil reit på blaa resept");
            }
        } catch (Exception e) {
            System.out.println("Feilet å lage blaa resept-objekt");
        }

        try {
            HvitResept resept1 = new HvitResept(legemiddel1, lege1, 15235, 4);
            if (resept1.prisAaBetale() != 200) {
                System.out.println("Feil pris på hvit resept");
            }
            resept1.bruk();
            if (resept1.hentReit() != 3) {
                System.out.println("Feil reit på hvit resept");
            }
        } catch (Exception e) {
            System.out.println("Feilet å lage Hvit resept-objekt");
        }

        try {
            MilResept resept1 = new MilResept(legemiddel1, lege1, 15235);
            if (resept1.prisAaBetale() != 0) {
                System.out.println("Feil pris på Millitær resept");
            }
            resept1.bruk();
            if (resept1.hentReit() != 2) {
                System.out.println("Feil reit på Millitær resept");
            }
        } catch (Exception e) {
            System.out.println("Feilet å lage Militær resept-objekt");
        }

        try {
            PResept resept1 = new PResept(legemiddel1, lege1, 15235, 4);
            if (resept1.prisAaBetale() != 92) {
                System.out.println("Feil pris på P resept");
            }
            resept1.bruk();
            if (resept1.hentReit() != 3) {
                System.out.println("Feil reit på P resept");
            }
        } catch (Exception e) {
            System.out.println("Feilet å lage P resept-objekt");
        }
    }
}
