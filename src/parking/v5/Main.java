package parking.v5;


public class Main {
    public static void main(String[] args) {
        Parking parking1 = new Parking(20, 1, 3, 10,5);
        Pojazd pojazd1 = new Pojazd( "BMW", "318D", "XYZ", TypPojazdu.SAMOCHOD);

        Pojazd pojazd2 = new Pojazd( "Audi", "A4", "AAAA", TypPojazdu.AUTOBUS);
        Pojazd pojazd3 = new Pojazd( "Audi", "A4", "AAAA", TypPojazdu.AUTOBUS);
        Pojazd pojazd4 = new Pojazd( "Audi", "A4", "AAAA", TypPojazdu.MOTOCYKL);
        Pojazd pojazd5 = new Pojazd( "Audi", "A4", "AAAA", TypPojazdu.MOTOCYKL);
        Pojazd pojazd6 = new Pojazd( "Audi", "A4", "AAAA", TypPojazdu.MOTOCYKL);
        Pojazd pojazd7 = new Pojazd( "Audi", "A4", "AAAA", TypPojazdu.ROWER);
        parking1.wpuscPojazd(pojazd1);
        parking1.wpuscPojazd(pojazd2);
        parking1.wpuscPojazd(pojazd3);
        parking1.wpuscPojazd(pojazd4);
        parking1.wpuscPojazd(pojazd5);
        parking1.wpuscPojazd(pojazd6);
        parking1.wpuscPojazd(pojazd7);

        parking1.stanParkingu();
        parking1.wypuscPojazd(pojazd1.getID());
        parking1.stanParkingu();
    }

}
