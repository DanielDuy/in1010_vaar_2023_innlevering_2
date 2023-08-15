public class Integrasjonstest {
    public static void main(String [] args) {
        VanligLegemiddel vanligLegemiddel = new VanligLegemiddel("vanligLegemiddel", 350, 2.0);
        System.out.println(vanligLegemiddel.navn + " " + vanligLegemiddel.id + " " + vanligLegemiddel.pris + " " + vanligLegemiddel.antallMgVirkestoff);
        NarkotiskLegemiddel narkoLegemiddel = new NarkotiskLegemiddel("narkoLegemiddel", 225, 10.0, 5);
        System.out.println(narkoLegemiddel.navn + " " + narkoLegemiddel.id + " " + narkoLegemiddel.pris + " " + narkoLegemiddel.antallMgVirkestoff + " " + narkoLegemiddel.antallStyrkeNarkotisk);
        VanedannedeLegemiddel vaneLegemiddel = new VanedannedeLegemiddel("vaneLegemiddel", 150, 7.5, 4);
        System.out.println(vaneLegemiddel.navn + " " + vaneLegemiddel.id + " " + vaneLegemiddel.pris + " " + vaneLegemiddel.antallMgVirkestoff + " " + vaneLegemiddel.antallStyrkeVandedannede);

        Lege lege1 = new Lege("Per Pettersen");
        System.out.println(lege1.hentNavn());
        Spesialist spesialist1 = new Spesialist("Ole Olsen", "AF926f53");
        System.out.println(spesialist1.hentNavn() + " " + spesialist1.hentKontrollkode());

        BlaaResept blaResept = new BlaaResept(vanligLegemiddel, lege1, 13523, 2);
        System.out.println(blaResept.farge() + " " + blaResept.prisAaBetale() + " " + blaResept.id + " " + blaResept.reseptLegemiddel.navn + " " + blaResept.reseptLege.legeNavn + " " + blaResept.reseptPasientID + " " + blaResept.reit);
        HvitResept hvitResept = new HvitResept(narkoLegemiddel, lege1, 51232, 3);
        System.out.println(hvitResept.farge() + " " + hvitResept.prisAaBetale() + " " + hvitResept.id + " " + hvitResept.reseptLegemiddel.navn + " " + hvitResept.reseptLege.legeNavn + " " + hvitResept.reseptPasientID + " " + hvitResept.reit);
        MilResept millitaerResept = new MilResept(vaneLegemiddel, spesialist1, 21854);
        System.out.println(millitaerResept.farge() + " " + millitaerResept.prisAaBetale() + " " + millitaerResept.id + " " + millitaerResept.reseptLegemiddel.navn + " " + millitaerResept.reseptLege.legeNavn + " " + millitaerResept.reseptPasientID + " " + millitaerResept.reit);
        PResept pResept = new PResept(vaneLegemiddel, spesialist1, 82037, 4);
        System.out.println(pResept.farge() + " " + pResept.prisAaBetale() + " " + pResept.id + " " + pResept.reseptLegemiddel.navn + " " + pResept.reseptLege.legeNavn + " " + pResept.reseptPasientID + " " + pResept.reit);

    }
}
