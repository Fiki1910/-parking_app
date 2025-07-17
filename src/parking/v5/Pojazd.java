package parking.v5;

public class Pojazd {

    private int ID;
    private String marka;
    private String model;
    private String numerRejestracyjny;
    private TypPojazdu typPojazdu;

    private static int counter = 0;

    public Pojazd(String marka, String model, String numerRejestracyjny, TypPojazdu typPojazdu) {
        this.ID = counter++;
        this.marka = marka;
        this.model = model;
        this.numerRejestracyjny = numerRejestracyjny;
        this.typPojazdu = typPojazdu;
    }

    public int getID() {
        return ID;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public String getNumerRejestracyjny() {
        return numerRejestracyjny;
    }

    public TypPojazdu getTypPojazdu() {
        return typPojazdu;
    }
}
