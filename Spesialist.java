public class Spesialist extends Lege implements Godkjenningsfritak {
    String kontrollkode;
    public Spesialist(String paramNavn,String paramKontrollkode) {
        super(paramNavn);
        kontrollkode = paramKontrollkode;
    }

    @Override
    public String hentKontrollkode() {
        return kontrollkode;
    }
}
