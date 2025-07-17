package parking.v5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Parking {

    //    private List<Pojazd> listaSamochodow = new ArrayList<>();
//    private List<Pojazd> listaAutobusow = new ArrayList<>();
//    private List<Pojazd> listaMotocykli = new ArrayList<>();
    private Map<TypPojazdu, List<Pojazd>> listaPojazdow = new HashMap<>();
    //    private List<Integer> iloscMiejsc = new ArrayList<>();
    private Map<TypPojazdu, Integer> iloscMiejsc = new HashMap<>();
    private double stanKontaParkingu = 0;
    private double oplata = 0;

    public Parking(int iloscMiejscDlaSamochodow, int iloscMiejscDlaAutobusow, int iloscMiejscDlaMotocykli, int iloscMiejscDlaRowerow, double oplata) {
//        this.iloscMiejsc.add(iloscMiejscDlaSamochodow);
//        this.iloscMiejsc.add(iloscMiejscDlaAutobusow);
//        this.iloscMiejsc.add(iloscMiejscDlaMotocykli);
        this.iloscMiejsc.put(TypPojazdu.SAMOCHOD, iloscMiejscDlaSamochodow);
        this.iloscMiejsc.put(TypPojazdu.AUTOBUS, iloscMiejscDlaAutobusow);
        this.iloscMiejsc.put(TypPojazdu.MOTOCYKL, iloscMiejscDlaMotocykli);
        this.iloscMiejsc.put(TypPojazdu.ROWER, iloscMiejscDlaRowerow);
        // ToDo Zrobić bardziej elastycznie
        this.listaPojazdow.put(TypPojazdu.SAMOCHOD, new ArrayList<>());
        this.listaPojazdow.put(TypPojazdu.AUTOBUS, new ArrayList<>());
        this.listaPojazdow.put(TypPojazdu.MOTOCYKL, new ArrayList<>());
        this.listaPojazdow.put(TypPojazdu.ROWER, new ArrayList<>());
        this.oplata = oplata;
    }


    public void wpuscPojazd(Pojazd pojazd) {
        TypPojazdu typPojazdu = pojazd.getTypPojazdu();
        int ileAktualniePojazdow = listaPojazdow.get(typPojazdu).size();
        int ileMaksymalniePojazdow = iloscMiejsc.get(typPojazdu);

        if (ileAktualniePojazdow < ileMaksymalniePojazdow) {
            listaPojazdow.get(typPojazdu).add(pojazd);
            stanKontaParkingu += oplata;
            System.out.println("Pojazd o numerze rejestracyjnym " + pojazd.getNumerRejestracyjny() + " został wpuszczony.");
        } else {
            System.out.println("Na parkingu nie ma już wolnych miejsc");
        }
    }


    public void wypuscPojazd(int ID) {

        Pojazd pojazd = null;

        List<TypPojazdu> wszystkieTypy = listaPojazdow.keySet().stream().toList();
        for(int i = 0; i < wszystkieTypy.size(); i++) {

            TypPojazdu typPojazdu = wszystkieTypy.get(i);
            List<Pojazd> lista  = listaPojazdow.get(typPojazdu);
            for (int u = 0; u < lista.size(); u++){
                if(lista.get(u).getID() == ID){
                    pojazd = lista.get(u);
                    lista.remove(u);
                    break;
                }
            }
        }

        if (pojazd != null) {
            System.out.println("Pojazd o numerze rejestracyjnym " + pojazd.getNumerRejestracyjny() + " wyjechał z parkingu.");
        } else {
            System.out.println("Na parkingu nie ma takiego pojazdu");
        }
    }

    public void stanParkingu() {
        List<TypPojazdu> wszystkieTypy = listaPojazdow.keySet().stream().toList();
        for(int i = 0; i < listaPojazdow.size(); i++){
            TypPojazdu typPojazdu = wszystkieTypy.get(i);
            List <Pojazd> lista = listaPojazdow.get(typPojazdu);
            int liczbaMiejsc = lista.size();
            double procentZajetychMiejsc = (liczbaMiejsc * 100.0) / iloscMiejsc.get(typPojazdu);
            System.out.println("Obecnie na parkingu znajduje się " + liczbaMiejsc + " " + typPojazdu.name());
            System.out.println("Obecnie na parkingu zajęte jest " + procentZajetychMiejsc + "% miejsc dla " + typPojazdu.name());

        }


        System.out.println("Jak dotąd parking zarobił: " + stanKontaParkingu + " zlotych");
    }

}
