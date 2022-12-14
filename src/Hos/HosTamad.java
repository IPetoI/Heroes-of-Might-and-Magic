package Hos;

import Egysegek.EgysegLathatosag;
import Egysegek.Eletero;
import Hos.Tulajdonsagok.Tamadas;

import static Egysegek.EgysegLetetel.egysegekSorrend;
import static Egysegek.Sebzes.egysegPozTorlese;
import static Egysegek.Sebzes.tamadasSzurkites;
import static Ellenfel.EllenfelEgysege.*;
import static Jatek.JatekAblak.*;
import static Jatek.Sorrend.*;
import static Jatek.XYKordinatakBemenet.*;

public class HosTamad {

    static int velemVagy1Hos =0;
    static int velemVagy2Hos =0;
    static int velemVagy3Hos =0;
    static int velemVagy4Hos =0;
    static int velemVagy5Hos =0;
    static int ellenemVagydbHos =0;
    public static int ellenemVagy1Hos =0;
    public static int ellenemVagy2Hos =0;
    public static int ellenemVagy3Hos =0;
    public static int ellenemVagy4Hos =0;
    public static int ellenemVagy5Hos =0;

    static String velemVagy1HosNev="n";
    static String velemVagy2HosNev="n";
    static String velemVagy3HosNev="n";
    static String velemVagy4HosNev="n";
    static String velemVagy5HosNev="n";

    public static int mutato=0;

    public static boolean hosVolt=false;


    public static void KiKicsoda() {
        int sor=0;
        int oszlop;
        velemVagy1Hos =0;
        velemVagy2Hos =0;
        velemVagy3Hos =0;
        velemVagy4Hos =0;
        velemVagy5Hos =0;
        ellenemVagydbHos =0;
        ellenemVagy1Hos =0;
        ellenemVagy2Hos =0;
        ellenemVagy3Hos =0;
        ellenemVagy4Hos =0;
        ellenemVagy5Hos =0;
        velemVagy1HosNev="n";
        velemVagy2HosNev="n";
        velemVagy3HosNev="n";
        velemVagy4HosNev="n";
        velemVagy5HosNev="n";

        for (int i=0;i<10;i++) {
            sor++;

            oszlop=0;
            for (int j=0;j<12;j++) {
                oszlop++;

                if (sor == 10 && oszlop == 1 && sor10oszlop1) {
                    Csapatok(sor10oszlop1Nev,10,1);
                } else if (sor == 10 && oszlop == 2 && sor10oszlop2) {
                    Csapatok(sor10oszlop2Nev,10,2);
                } else if (sor == 9 && oszlop == 1 && sor9oszlop1) {
                    Csapatok( sor9oszlop1Nev,9,1);
                } else if (sor == 9 && oszlop == 2 && sor9oszlop2) {
                    Csapatok( sor9oszlop2Nev,9,2);
                } else if (sor == 8 && oszlop == 1 && sor8oszlop1) {
                    Csapatok( sor8oszlop1Nev,8,1);
                } else if (sor == 8 && oszlop == 2 && sor8oszlop2) {
                    Csapatok( sor8oszlop2Nev,8,2);
                } else if (sor == 7 && oszlop == 1 && sor7oszlop1) {
                    Csapatok( sor7oszlop1Nev,7,1);
                } else if (sor == 7 && oszlop == 2 && sor7oszlop2) {
                    Csapatok( sor7oszlop2Nev,7,2);
                } else if (sor == 6 && oszlop == 1 && sor6oszlop1) {
                    Csapatok( sor6oszlop1Nev,6,1);
                } else if (sor == 6 && oszlop == 2 && sor6oszlop2) {
                    Csapatok( sor6oszlop2Nev,6,2);
                } else if (sor == 5 && oszlop == 1 && sor5oszlop1) {
                    Csapatok( sor5oszlop1Nev,5,1);
                } else if (sor == 5 && oszlop == 2 && sor5oszlop2) {
                    Csapatok( sor5oszlop2Nev,5,2);
                } else if (sor == 4 && oszlop == 1 && sor4oszlop1) {
                    Csapatok( sor4oszlop1Nev,4,1);
                } else if (sor == 4 && oszlop == 2 && sor4oszlop2) {
                    Csapatok( sor4oszlop2Nev,4,2);
                } else if (sor == 3 && oszlop == 1 && sor3oszlop1) {
                    Csapatok( sor3oszlop1Nev,3,1);
                } else if (sor == 3 && oszlop == 2 && sor3oszlop2) {
                    Csapatok( sor3oszlop2Nev,3,2);
                } else if (sor == 2 && oszlop == 1 && sor2oszlop1) {
                    Csapatok( sor2oszlop1Nev,2,1);
                } else if (sor == 2 && oszlop == 2 && sor2oszlop2) {
                    Csapatok( sor2oszlop2Nev,2,2);
                } else if (sor == 1 && oszlop == 1 && sor1oszlop1) {
                    Csapatok( sor1oszlop1Nev,1,1);
                } else if (sor == 1 && oszlop == 2 && sor1oszlop2) {
                    Csapatok( sor1oszlop2Nev,1,2);
                } else if (sor == 8 && oszlop == 3 && sor8oszlop3) {
                    Csapatok( sor8oszlop3Nev,8,3);
                } else if (sor == 7 && oszlop == 3 && sor7oszlop3) {
                    Csapatok( sor7oszlop3Nev,7,3);
                } else if (sor == 6 && oszlop == 3 && sor6oszlop3) {
                    Csapatok( sor6oszlop3Nev,6,3);
                } else if (sor == 5 && oszlop == 3 && sor5oszlop3) {
                    Csapatok( sor5oszlop3Nev,5,3);
                } else if (sor == 4 && oszlop == 3 && sor4oszlop3) {
                    Csapatok( sor4oszlop3Nev,4,3);
                } else if (sor == 3 && oszlop == 3 && sor3oszlop3) {
                    Csapatok( sor3oszlop3Nev,3,3);
                } else if (sor == 2 && oszlop == 3 && sor2oszlop3) {
                    Csapatok( sor2oszlop3Nev,2,3);
                } else if (sor == 1 && oszlop == 3 && sor1oszlop3) {
                    Csapatok( sor1oszlop3Nev,1,3);
                } else if (sor == 8 && oszlop == 4 && sor8oszlop4) {
                    Csapatok( sor8oszlop4Nev,8,4);
                } else if (sor == 7 && oszlop == 4 && sor7oszlop4) {
                    Csapatok( sor7oszlop4Nev,7,4);
                } else if (sor == 5 && oszlop == 4 && sor5oszlop4) {
                    Csapatok( sor5oszlop4Nev,5,4);
                } else if (sor == 4 && oszlop == 4 && sor4oszlop4) {
                    Csapatok( sor4oszlop4Nev,4,4);
                } else if (sor == 3 && oszlop == 4 && sor3oszlop4) {
                    Csapatok( sor3oszlop4Nev,3,4);
                } else if (sor == 2 && oszlop == 4 && sor2oszlop4) {
                    Csapatok( sor2oszlop4Nev,2,4);
                } else if (sor == 1 && oszlop == 4 && sor1oszlop4) {
                    Csapatok( sor1oszlop4Nev,1,4);
                } else if (sor == 10 && oszlop == 5 && sor10oszlop5) {
                    Csapatok(sor10oszlop5Nev,10,5);
                } else if (sor == 9 && oszlop == 5 && sor9oszlop5) {
                    Csapatok( sor9oszlop5Nev,9,5);
                } else if (sor == 8 && oszlop == 5 && sor8oszlop5) {
                    Csapatok( sor8oszlop5Nev,8,5);
                } else if (sor == 7 && oszlop == 5 && sor7oszlop5) {
                    Csapatok( sor7oszlop5Nev,7,5);
                } else if (sor == 6 && oszlop == 5 && sor6oszlop5) {
                    Csapatok( sor6oszlop5Nev,6,5);
                } else if (sor == 5 && oszlop == 5 && sor5oszlop5) {
                    Csapatok( sor5oszlop5Nev,5,5);
                } else if (sor == 4 && oszlop == 5 && sor4oszlop5) {
                    Csapatok( sor4oszlop5Nev,4,5);
                } else if (sor == 3 && oszlop == 5 && sor3oszlop5) {
                    Csapatok( sor3oszlop5Nev,3,5);
                } else if (sor == 2 && oszlop == 5 && sor2oszlop5) {
                    Csapatok( sor2oszlop5Nev,2,5);
                } else if (sor == 1 && oszlop == 5 && sor1oszlop5) {
                    Csapatok( sor1oszlop5Nev,1,5);
                } else if (sor == 10 && oszlop == 6 && sor10oszlop6) {
                    Csapatok(sor10oszlop6Nev,10,6);
                } else if (sor == 9 && oszlop == 6 && sor9oszlop6) {
                    Csapatok( sor9oszlop6Nev,9,6);
                } else if (sor == 7 && oszlop == 6 && sor7oszlop6) {
                    Csapatok( sor7oszlop6Nev,7,6);
                } else if (sor == 6 && oszlop == 6 && sor6oszlop6) {
                    Csapatok( sor6oszlop6Nev,6,6);
                } else if (sor == 5 && oszlop == 6 && sor5oszlop6) {
                    Csapatok( sor5oszlop6Nev,5,6);
                } else if (sor == 4 && oszlop == 6 && sor4oszlop6) {
                    Csapatok( sor4oszlop6Nev,4,6);
                } else if (sor == 3 && oszlop == 6 && sor3oszlop6) {
                    Csapatok( sor3oszlop6Nev,3,6);
                } else if (sor == 2 && oszlop == 6 && sor2oszlop6) {
                    Csapatok( sor2oszlop6Nev,2,6);
                } else if (sor == 1 && oszlop == 6 && sor1oszlop6) {
                    Csapatok( sor1oszlop6Nev,1,6);
                } else if (sor == 10 && oszlop == 7 && sor10oszlop7) {
                    Csapatok(sor10oszlop7Nev,10,7);
                } else if (sor == 9 && oszlop == 7 && sor9oszlop7) {
                    Csapatok( sor9oszlop7Nev,9,7);
                } else if (sor == 7 && oszlop == 7 && sor7oszlop7) {
                    Csapatok( sor7oszlop7Nev,7,7);
                } else if (sor == 6 && oszlop == 7 && sor6oszlop7) {
                    Csapatok( sor6oszlop7Nev,6,7);
                } else if (sor == 5 && oszlop == 7 && sor5oszlop7) {
                    Csapatok( sor5oszlop7Nev,5,7);
                } else if (sor == 4 && oszlop == 7 && sor4oszlop7) {
                    Csapatok( sor4oszlop7Nev,4,7);
                } else if (sor == 3 && oszlop == 7 && sor3oszlop7) {
                    Csapatok( sor3oszlop7Nev,3,7);
                } else if (sor == 2 && oszlop == 7 && sor2oszlop7) {
                    Csapatok( sor2oszlop7Nev,2,7);
                } else if (sor == 1 && oszlop == 7 && sor1oszlop7) {
                    Csapatok( sor1oszlop7Nev,1,7);
                } else if (sor == 10 && oszlop == 8 && sor10oszlop8) {
                    Csapatok(sor10oszlop8Nev,10,8);
                } else if (sor == 9 && oszlop == 8 && sor9oszlop8) {
                    Csapatok( sor9oszlop8Nev,9,8);
                } else if (sor == 8 && oszlop == 8 && sor8oszlop8) {
                    Csapatok( sor8oszlop8Nev,8,8);
                } else if (sor == 6 && oszlop == 8 && sor6oszlop8) {
                    Csapatok( sor6oszlop8Nev,6,8);
                } else if (sor == 5 && oszlop == 8 && sor5oszlop8) {
                    Csapatok( sor5oszlop8Nev,5,8);
                } else if (sor == 4 && oszlop == 8 && sor4oszlop8) {
                    Csapatok( sor4oszlop8Nev,4,8);
                } else if (sor == 3 && oszlop == 8 && sor3oszlop8) {
                    Csapatok( sor3oszlop8Nev,3,8);
                } else if (sor == 2 && oszlop == 8 && sor2oszlop8) {
                    Csapatok( sor2oszlop8Nev,2,8);
                } else if (sor == 1 && oszlop == 8 && sor1oszlop8) {
                    Csapatok( sor1oszlop8Nev,1,8);
                } else if (sor == 10 && oszlop == 9 && sor10oszlop9) {
                    Csapatok(sor10oszlop9Nev,10,9);
                } else if (sor == 9 && oszlop == 9 && sor9oszlop9) {
                    Csapatok( sor9oszlop9Nev,9,9);
                } else if (sor == 8 && oszlop == 9 && sor8oszlop9) {
                    Csapatok( sor8oszlop9Nev,8,9);
                } else if (sor == 6 && oszlop == 9 && sor6oszlop9) {
                    Csapatok( sor6oszlop9Nev,6,9);
                } else if (sor == 5 && oszlop == 9 && sor5oszlop9) {
                    Csapatok( sor5oszlop9Nev,5,9);
                } else if (sor == 4 && oszlop == 9 && sor4oszlop9) {
                    Csapatok( sor4oszlop9Nev,4,9);
                } else if (sor == 3 && oszlop == 9 && sor3oszlop9) {
                    Csapatok( sor3oszlop9Nev,3,9);
                } else if (sor == 2 && oszlop == 9 && sor2oszlop9) {
                    Csapatok( sor2oszlop9Nev,2,9);
                } else if (sor == 1 && oszlop == 9 && sor1oszlop9) {
                    Csapatok( sor1oszlop9Nev,1,9);
                } else if (sor == 10 && oszlop == 10 && sor10oszlop10) {
                    Csapatok(sor10oszlop10Nev,10,10);
                } else if (sor == 9 && oszlop == 10 && sor9oszlop10) {
                    Csapatok(sor9oszlop10Nev,9,10);
                } else if (sor == 8 && oszlop == 10 && sor8oszlop10) {
                    Csapatok(sor8oszlop10Nev,8,10);
                } else if (sor == 7 && oszlop == 10 && sor7oszlop10) {
                    Csapatok(sor7oszlop10Nev,7,10);
                } else if (sor == 6 && oszlop == 10 && sor6oszlop10) {
                    Csapatok(sor6oszlop10Nev,6,10);
                } else if (sor == 5 && oszlop == 10 && sor5oszlop10) {
                    Csapatok(sor5oszlop10Nev,5,10);
                } else if (sor == 4 && oszlop == 10 && sor4oszlop10) {
                    Csapatok(sor4oszlop10Nev,4,10);
                } else if (sor == 3 && oszlop == 10 && sor3oszlop10) {
                    Csapatok(sor3oszlop10Nev,3,10);
                } else if (sor == 2 && oszlop == 10 && sor2oszlop10) {
                    Csapatok(sor2oszlop10Nev,2,10);
                } else if (sor == 1 && oszlop == 10 && sor1oszlop10) {
                    Csapatok(sor1oszlop10Nev,1,10);
                } else if (sor == 10 && oszlop == 11 && sor10oszlop11) {
                    Csapatok(sor10oszlop11Nev,10,11);
                } else if (sor == 9 && oszlop == 11 && sor9oszlop11) {
                    Csapatok(sor9oszlop11Nev,9,11);
                } else if (sor == 8 && oszlop == 11 && sor8oszlop11) {
                    Csapatok(sor8oszlop11Nev,8,11);
                } else if (sor == 7 && oszlop == 11 && sor7oszlop11) {
                    Csapatok(sor7oszlop11Nev,7,11);
                } else if (sor == 6 && oszlop == 11 && sor6oszlop11) {
                    Csapatok(sor6oszlop11Nev,6,11);
                } else if (sor == 5 && oszlop == 11 && sor5oszlop11) {
                    Csapatok(sor5oszlop11Nev,5,11);
                } else if (sor == 4 && oszlop == 11 && sor4oszlop11) {
                    Csapatok(sor4oszlop11Nev,4,11);
                } else if (sor == 3 && oszlop == 11 && sor3oszlop11) {
                    Csapatok(sor3oszlop11Nev,3,11);
                } else if (sor == 2 && oszlop == 11 && sor2oszlop11) {
                    Csapatok(sor2oszlop11Nev,2,11);
                } else if (sor == 1 && oszlop == 11 && sor1oszlop11) {
                    Csapatok(sor1oszlop11Nev,1,11);
                } else if (sor == 10 && oszlop == 12 && sor10oszlop12) {
                    Csapatok(sor10oszlop12Nev,10,12);
                } else if (sor == 9 && oszlop == 12 && sor9oszlop12) {
                    Csapatok(sor9oszlop12Nev,9,12);
                } else if (sor == 8 && oszlop == 12 && sor8oszlop12) {
                    Csapatok(sor8oszlop12Nev,8,12);
                } else if (sor == 7 && oszlop == 12 && sor7oszlop12) {
                    Csapatok(sor7oszlop12Nev,7,12);
                } else if (sor == 6 && oszlop == 12 && sor6oszlop12) {
                    Csapatok(sor6oszlop12Nev,6,12);
                } else if (sor == 5 && oszlop == 12 && sor5oszlop12) {
                    Csapatok(sor5oszlop12Nev,5,12);
                } else if (sor == 4 && oszlop == 12 && sor4oszlop12) {
                    Csapatok(sor4oszlop12Nev,4,12);
                } else if (sor == 3 && oszlop == 12 && sor3oszlop12) {
                    Csapatok(sor3oszlop12Nev,3,12);
                } else if (sor == 2 && oszlop == 12 && sor2oszlop12) {
                    Csapatok(sor2oszlop12Nev,2,12);
                } else if (sor == 1 && oszlop == 12 && sor1oszlop12) {
                    Csapatok(sor1oszlop12Nev,1,12);
                }
            }
        }
    }

    public static void holVagyHos() {

        int listaMeret=moralSorrendTList.size();
        mutato=100;

        if (velemVagy1HosNev.charAt(0)=='f' || velemVagy2HosNev.charAt(0)=='i' || velemVagy3HosNev.charAt(0)=='g'
                || velemVagy4HosNev.charAt(0)=='f' || velemVagy5HosNev.charAt(0)=='h'  ) {
            for (int i=0;i<listaMeret;i++) {
                if (moralSorrendTList.get(i)==2) {
                    mutato=i;
                }
            }
        }else if (velemVagy1HosNev.charAt(0)=='c' || velemVagy2HosNev.charAt(0)=='f' || velemVagy3HosNev.charAt(0)=='m'
                || velemVagy4HosNev.charAt(0)=='o' || velemVagy5HosNev.charAt(0)=='r'  ){
            for (int i=0;i<listaMeret;i++) {
                if (moralSorrendTList.get(i)==1) {
                    mutato=i;
                }
            }
        }
    }

    public static void Csapatok(String egyseg, int sor, int oszlop) {

                  if (egyseg.charAt(0)=='e') {
                      ellenemVagydbHos++;

                      if (ellenemVagydbHos==1) {
                          ellenemVagy1Hos=Integer.parseInt(String.valueOf(sor) + String.valueOf(oszlop));
                      }else if (ellenemVagydbHos==2) {
                          ellenemVagy2Hos=Integer.parseInt(String.valueOf(sor) + String.valueOf(oszlop));
                      }else if (ellenemVagydbHos==3) {
                          ellenemVagy3Hos=Integer.parseInt(String.valueOf(sor) + String.valueOf(oszlop));
                      }else if (ellenemVagydbHos==4) {
                          ellenemVagy4Hos=Integer.parseInt(String.valueOf(sor) + String.valueOf(oszlop));
                      }else if (ellenemVagydbHos==5) {
                          ellenemVagy5Hos=Integer.parseInt(String.valueOf(sor) + String.valueOf(oszlop));
                      }
                      tamadasSzurkites(sor,oszlop);
                  }else {

                      if ((egyseg.equals("foldmuv") || egyseg.equals("csont"))) {
                          velemVagy1Hos= Integer.parseInt(String.valueOf(sor) + String.valueOf(oszlop));
                          velemVagy1HosNev=egyseg;
                      }else if ((egyseg.equals("ijas") || egyseg.equals("felder"))) {
                          velemVagy2Hos=Integer.parseInt(String.valueOf(sor) + String.valueOf(oszlop));
                          velemVagy2HosNev=egyseg;
                      }else if ((egyseg.equals("grif") || egyseg.equals("mino"))) {
                          velemVagy3Hos=Integer.parseInt(String.valueOf(sor) + String.valueOf(oszlop));
                          velemVagy3HosNev=egyseg;
                      }else if ((egyseg.equals("fegyv") || egyseg.equals("orgy"))) {
                          velemVagy4Hos=Integer.parseInt(String.valueOf(sor) + String.valueOf(oszlop));
                          velemVagy4HosNev=egyseg;
                      }else if ((egyseg.equals("harcp") || egyseg.equals("rapt"))) {
                          velemVagy5Hos=Integer.parseInt(String.valueOf(sor) + String.valueOf(oszlop));
                          velemVagy5HosNev=egyseg;
                      }
                  }
    }

    public static void megtamadhato(int sor,int oszlop) {

        int poz=Integer.parseInt(String.valueOf(sor) + String.valueOf(oszlop));

        boolean nemVelemVagy = poz== ellenemVagy1Hos || poz== ellenemVagy2Hos ||
                poz== ellenemVagy3Hos || poz== ellenemVagy4Hos || poz== ellenemVagy5Hos ;

        if (sor == 10 && oszlop == 1 && sor10oszlop1 && nemVelemVagy) {
            hosTamadas(sor10oszlop1Nev,10,1);
        } else if (sor == 10 && oszlop == 2 && sor10oszlop2 && nemVelemVagy) {
            hosTamadas(sor10oszlop2Nev,10,2);
        } else if (sor == 9 && oszlop == 1 && sor9oszlop1 && nemVelemVagy) {
            hosTamadas(sor9oszlop1Nev,9,1);
        } else if (sor == 9 && oszlop == 2 && sor9oszlop2 && nemVelemVagy) {
            hosTamadas(sor9oszlop2Nev,9,2);
        } else if (sor == 8 && oszlop == 1 && sor8oszlop1 && nemVelemVagy) {
            hosTamadas(sor8oszlop1Nev,8,1);
        } else if (sor == 8 && oszlop == 2 && sor8oszlop2 && nemVelemVagy) {
            hosTamadas(sor8oszlop2Nev,8,2);
        } else if (sor == 7 && oszlop == 1 && sor7oszlop1 && nemVelemVagy) {
            hosTamadas(sor7oszlop1Nev,7,1);
        } else if (sor == 7 && oszlop == 2 && sor7oszlop2 && nemVelemVagy) {
            hosTamadas(sor7oszlop2Nev,7,2);
        } else if (sor == 6 && oszlop == 1 && sor6oszlop1 && nemVelemVagy) {
            hosTamadas(sor6oszlop1Nev,6,1);
        } else if (sor == 6 && oszlop == 2 && sor6oszlop2 && nemVelemVagy) {
            hosTamadas(sor6oszlop2Nev,6,2);
        } else if (sor == 5 && oszlop == 1 && sor5oszlop1 && nemVelemVagy) {
            hosTamadas(sor5oszlop1Nev,5,1);
        } else if (sor == 5 && oszlop == 2 && sor5oszlop2 && nemVelemVagy) {
            hosTamadas(sor5oszlop2Nev,5,2);
        } else if (sor == 4 && oszlop == 1 && sor4oszlop1 && nemVelemVagy) {
            hosTamadas(sor4oszlop1Nev,4,1);
        } else if (sor == 4 && oszlop == 2 && sor4oszlop2 && nemVelemVagy) {
            hosTamadas(sor4oszlop2Nev,4,2);
        } else if (sor == 3 && oszlop == 1 && sor3oszlop1 && nemVelemVagy) {
            hosTamadas(sor3oszlop1Nev,3,1);
        } else if (sor == 3 && oszlop == 2 && sor3oszlop2 && nemVelemVagy) {
            hosTamadas(sor3oszlop2Nev,3,2);
        } else if (sor == 2 && oszlop == 1 && sor2oszlop1 && nemVelemVagy) {
            hosTamadas(sor2oszlop1Nev,2,1);
        } else if (sor == 2 && oszlop == 2 && sor2oszlop2 && nemVelemVagy) {
            hosTamadas(sor2oszlop2Nev,2,2);
        } else if (sor == 1 && oszlop == 1 && sor1oszlop1 && nemVelemVagy) {
            hosTamadas(sor1oszlop1Nev,1,1);
        } else if (sor == 1 && oszlop == 2 && sor1oszlop2 && nemVelemVagy) {
            hosTamadas(sor1oszlop2Nev,1,2);
        } else if (sor == 8 && oszlop == 3 && sor8oszlop3 && nemVelemVagy) {
            hosTamadas(sor8oszlop3Nev,8,3);
        } else if (sor == 7 && oszlop == 3 && sor7oszlop3 && nemVelemVagy) {
            hosTamadas(sor7oszlop3Nev,7,3);
        } else if (sor == 6 && oszlop == 3 && sor6oszlop3 && nemVelemVagy) {
            hosTamadas(sor6oszlop3Nev,6,3);
        } else if (sor == 5 && oszlop == 3 && sor5oszlop3 && nemVelemVagy) {
            hosTamadas(sor5oszlop3Nev,5,3);
        } else if (sor == 4 && oszlop == 3 && sor4oszlop3 && nemVelemVagy) {
            hosTamadas(sor4oszlop3Nev,4,3);
        } else if (sor == 3 && oszlop == 3 && sor3oszlop3 && nemVelemVagy) {
            hosTamadas(sor3oszlop3Nev,3,3);
        } else if (sor == 2 && oszlop == 3 && sor2oszlop3 && nemVelemVagy) {
            hosTamadas(sor2oszlop3Nev,2,3);
        } else if (sor == 1 && oszlop == 3 && sor1oszlop3 && nemVelemVagy) {
            hosTamadas(sor1oszlop3Nev,1,3);
        } else if (sor == 8 && oszlop == 4 && sor8oszlop4 && nemVelemVagy) {
            hosTamadas(sor8oszlop4Nev,8,4);
        } else if (sor == 7 && oszlop == 4 && sor7oszlop4 && nemVelemVagy) {
            hosTamadas(sor7oszlop4Nev,7,4);
        } else if (sor == 5 && oszlop == 4 && sor5oszlop4 && nemVelemVagy) {
            hosTamadas(sor5oszlop4Nev,5,4);
        } else if (sor == 4 && oszlop == 4 && sor4oszlop4 && nemVelemVagy) {
            hosTamadas(sor4oszlop4Nev,4,4);
        } else if (sor == 3 && oszlop == 4 && sor3oszlop4 && nemVelemVagy) {
            hosTamadas(sor3oszlop4Nev,3,4);
        } else if (sor == 2 && oszlop == 4 && sor2oszlop4 && nemVelemVagy) {
            hosTamadas(sor2oszlop4Nev,2,4);
        } else if (sor == 1 && oszlop == 4 && sor1oszlop4 && nemVelemVagy) {
            hosTamadas(sor1oszlop4Nev,1,4);
        } else if (sor == 10 && oszlop == 5 && sor10oszlop5 && nemVelemVagy) {
            hosTamadas(sor10oszlop5Nev,10,5);
        } else if (sor == 9 && oszlop == 5 && sor9oszlop5 && nemVelemVagy) {
            hosTamadas(sor9oszlop5Nev,9,5);
        } else if (sor == 8 && oszlop == 5 && sor8oszlop5 && nemVelemVagy) {
            hosTamadas(sor8oszlop5Nev,8,5);
        } else if (sor == 7 && oszlop == 5 && sor7oszlop5 && nemVelemVagy) {
            hosTamadas(sor7oszlop5Nev,7,5);
        } else if (sor == 6 && oszlop == 5 && sor6oszlop5 && nemVelemVagy) {
            hosTamadas(sor6oszlop5Nev,6,5);
        } else if (sor == 5 && oszlop == 5 && sor5oszlop5 && nemVelemVagy) {
            hosTamadas(sor5oszlop5Nev,5,5);
        } else if (sor == 4 && oszlop == 5 && sor4oszlop5 && nemVelemVagy) {
            hosTamadas(sor4oszlop5Nev,4,5);
        } else if (sor == 3 && oszlop == 5 && sor3oszlop5 && nemVelemVagy) {
            hosTamadas(sor3oszlop5Nev,3,5);
        } else if (sor == 2 && oszlop == 5 && sor2oszlop5 && nemVelemVagy) {
            hosTamadas(sor2oszlop5Nev,2,5);
        } else if (sor == 1 && oszlop == 5 && sor1oszlop5 && nemVelemVagy) {
            hosTamadas(sor1oszlop5Nev,1,5);
        } else if (sor == 10 && oszlop == 6 && sor10oszlop6 && nemVelemVagy) {
            hosTamadas(sor10oszlop6Nev,10,6);
        } else if (sor == 9 && oszlop == 6 && sor9oszlop6 && nemVelemVagy) {
            hosTamadas(sor9oszlop6Nev,9,6);
        } else if (sor == 7 && oszlop == 6 && sor7oszlop6 && nemVelemVagy) {
            hosTamadas(sor7oszlop6Nev,7,6);
        } else if (sor == 6 && oszlop == 6 && sor6oszlop6 && nemVelemVagy) {
            hosTamadas(sor6oszlop6Nev,6,6);
        } else if (sor == 5 && oszlop == 6 && sor5oszlop6 && nemVelemVagy) {
            hosTamadas(sor5oszlop6Nev,5,6);
        } else if (sor == 4 && oszlop == 6 && sor4oszlop6 && nemVelemVagy) {
            hosTamadas(sor4oszlop6Nev,4,6);
        } else if (sor == 3 && oszlop == 6 && sor3oszlop6 && nemVelemVagy) {
            hosTamadas(sor3oszlop6Nev,3,6);
        } else if (sor == 2 && oszlop == 6 && sor2oszlop6 && nemVelemVagy) {
            hosTamadas(sor2oszlop6Nev,2,6);
        } else if (sor == 1 && oszlop == 6 && sor1oszlop6 && nemVelemVagy) {
            hosTamadas(sor1oszlop6Nev,1,6);
        } else if (sor == 10 && oszlop == 7 && sor10oszlop7 && nemVelemVagy) {
            hosTamadas(sor10oszlop7Nev,10,7);
        } else if (sor == 9 && oszlop == 7 && sor9oszlop7 && nemVelemVagy) {
            hosTamadas(sor9oszlop7Nev,9,7);
        } else if (sor == 7 && oszlop == 7 && sor7oszlop7 && nemVelemVagy) {
            hosTamadas(sor7oszlop7Nev,7,7);
        } else if (sor == 6 && oszlop == 7 && sor6oszlop7 && nemVelemVagy) {
            hosTamadas(sor6oszlop7Nev,6,7);
        } else if (sor == 5 && oszlop == 7 && sor5oszlop7 && nemVelemVagy) {
            hosTamadas(sor5oszlop7Nev,5,7);
        } else if (sor == 4 && oszlop == 7 && sor4oszlop7 && nemVelemVagy) {
            hosTamadas(sor4oszlop7Nev,4,7);
        } else if (sor == 3 && oszlop == 7 && sor3oszlop7 && nemVelemVagy) {
            hosTamadas(sor3oszlop7Nev,3,7);
        } else if (sor == 2 && oszlop == 7 && sor2oszlop7 && nemVelemVagy) {
            hosTamadas(sor2oszlop7Nev,2,7);
        } else if (sor == 1 && oszlop == 7 && sor1oszlop7 && nemVelemVagy) {
            hosTamadas(sor1oszlop7Nev,1,7);
        } else if (sor == 10 && oszlop == 8 && sor10oszlop8 && nemVelemVagy) {
            hosTamadas(sor10oszlop8Nev,10,8);
        } else if (sor == 9 && oszlop == 8 && sor9oszlop8 && nemVelemVagy) {
            hosTamadas(sor9oszlop8Nev,9,8);
        } else if (sor == 8 && oszlop == 8 && sor8oszlop8 && nemVelemVagy) {
            hosTamadas(sor8oszlop8Nev,8,8);
        } else if (sor == 6 && oszlop == 8 && sor6oszlop8 && nemVelemVagy) {
            hosTamadas(sor6oszlop8Nev,6,8);
        } else if (sor == 5 && oszlop == 8 && sor5oszlop8 && nemVelemVagy) {
            hosTamadas(sor5oszlop8Nev,5,8);
        } else if (sor == 4 && oszlop == 8 && sor4oszlop8 && nemVelemVagy) {
            hosTamadas(sor4oszlop8Nev,4,8);
        } else if (sor == 3 && oszlop == 8 && sor3oszlop8 && nemVelemVagy) {
            hosTamadas(sor3oszlop8Nev,3,8);
        } else if (sor == 2 && oszlop == 8 && sor2oszlop8 && nemVelemVagy) {
            hosTamadas(sor2oszlop8Nev,2,8);
        } else if (sor == 1 && oszlop == 8 && sor1oszlop8 && nemVelemVagy) {
            hosTamadas(sor1oszlop8Nev,1,8);
        } else if (sor == 10 && oszlop == 9 && sor10oszlop9 && nemVelemVagy) {
            hosTamadas(sor10oszlop9Nev,10,9);
        } else if (sor == 9 && oszlop == 9 && sor9oszlop9 && nemVelemVagy) {
            hosTamadas(sor9oszlop9Nev,9,9);
        } else if (sor == 8 && oszlop == 9 && sor8oszlop9 && nemVelemVagy) {
            hosTamadas(sor8oszlop9Nev,8,9);
        } else if (sor == 6 && oszlop == 9 && sor6oszlop9 && nemVelemVagy) {
            hosTamadas(sor6oszlop9Nev,6,9);
        } else if (sor == 5 && oszlop == 9 && sor5oszlop9 && nemVelemVagy) {
            hosTamadas(sor5oszlop9Nev,5,9);
        } else if (sor == 4 && oszlop == 9 && sor4oszlop9 && nemVelemVagy) {
            hosTamadas(sor4oszlop9Nev,4,9);
        } else if (sor == 3 && oszlop == 9 && sor3oszlop9 && nemVelemVagy) {
            hosTamadas(sor3oszlop9Nev,3,9);
        } else if (sor == 2 && oszlop == 9 && sor2oszlop9 && nemVelemVagy) {
            hosTamadas(sor2oszlop9Nev,2,9);
        } else if (sor == 1 && oszlop == 9 && sor1oszlop9 && nemVelemVagy) {
            hosTamadas(sor1oszlop9Nev,1,9);
        } else if (sor == 10 && oszlop == 10 && sor10oszlop10 && nemVelemVagy) {
            hosTamadas(sor10oszlop10Nev,10,10);
        } else if (sor == 9 && oszlop == 10 && sor9oszlop10 && nemVelemVagy) {
            hosTamadas(sor9oszlop10Nev,9,10);
        } else if (sor == 8 && oszlop == 10 && sor8oszlop10 && nemVelemVagy) {
            hosTamadas(sor8oszlop10Nev,8,10);
        } else if (sor == 7 && oszlop == 10 && sor7oszlop10 && nemVelemVagy) {
            hosTamadas(sor7oszlop10Nev,7,10);
        } else if (sor == 6 && oszlop == 10 && sor6oszlop10 && nemVelemVagy) {
            hosTamadas(sor6oszlop10Nev,6,10);
        } else if (sor == 5 && oszlop == 10 && sor5oszlop10 && nemVelemVagy) {
            hosTamadas(sor5oszlop10Nev,5,10);
        } else if (sor == 4 && oszlop == 10 && sor4oszlop10 && nemVelemVagy) {
            hosTamadas(sor4oszlop10Nev,4,10);
        } else if (sor == 3 && oszlop == 10 && sor3oszlop10 && nemVelemVagy) {
            hosTamadas(sor3oszlop10Nev,3,10);
        } else if (sor == 2 && oszlop == 10 && sor2oszlop10 && nemVelemVagy) {
            hosTamadas(sor2oszlop10Nev,2,10);
        } else if (sor == 1 && oszlop == 10 && sor1oszlop10 && nemVelemVagy) {
            hosTamadas(sor1oszlop10Nev,1,10);
        } else if (sor == 10 && oszlop == 11 && sor10oszlop11 && nemVelemVagy) {
            hosTamadas(sor10oszlop11Nev,10,11);
        } else if (sor == 9 && oszlop == 11 && sor9oszlop11 && nemVelemVagy) {
            hosTamadas(sor9oszlop11Nev,9,11);
        } else if (sor == 8 && oszlop == 11 && sor8oszlop11 && nemVelemVagy) {
            hosTamadas(sor8oszlop11Nev,8,11);
        } else if (sor == 7 && oszlop == 11 && sor7oszlop11 && nemVelemVagy) {
            hosTamadas(sor7oszlop11Nev,7,11);
        } else if (sor == 6 && oszlop == 11 && sor6oszlop11 && nemVelemVagy) {
            hosTamadas(sor6oszlop11Nev,6,11);
        } else if (sor == 5 && oszlop == 11 && sor5oszlop11 && nemVelemVagy) {
            hosTamadas(sor5oszlop11Nev,5,11);
        } else if (sor == 4 && oszlop == 11 && sor4oszlop11 && nemVelemVagy) {
            hosTamadas(sor4oszlop11Nev,4,11);
        } else if (sor == 3 && oszlop == 11 && sor3oszlop11 && nemVelemVagy) {
            hosTamadas(sor3oszlop11Nev,3,11);
        } else if (sor == 2 && oszlop == 11 && sor2oszlop11 && nemVelemVagy) {
            hosTamadas(sor2oszlop11Nev,2,11);
        } else if (sor == 1 && oszlop == 11 && sor1oszlop11 && nemVelemVagy) {
            hosTamadas(sor1oszlop11Nev,1,11);
        } else if (sor == 10 && oszlop == 12 && sor10oszlop12 && nemVelemVagy) {
            hosTamadas(sor10oszlop12Nev,10,12);
        } else if (sor == 9 && oszlop == 12 && sor9oszlop12 && nemVelemVagy) {
            hosTamadas(sor9oszlop12Nev,9,12);
        } else if (sor == 8 && oszlop == 12 && sor8oszlop12 && nemVelemVagy) {
            hosTamadas(sor8oszlop12Nev,8,12);
        } else if (sor == 7 && oszlop == 12 && sor7oszlop12 && nemVelemVagy) {
            hosTamadas(sor7oszlop12Nev,7,12);
        } else if (sor == 6 && oszlop == 12 && sor6oszlop12 && nemVelemVagy) {
            hosTamadas(sor6oszlop12Nev,6,12);
        } else if (sor == 5 && oszlop == 12 && sor5oszlop12 && nemVelemVagy) {
            hosTamadas(sor5oszlop12Nev,5,12);
        } else if (sor == 4 && oszlop == 12 && sor4oszlop12 && nemVelemVagy) {
            hosTamadas(sor4oszlop12Nev,4,12);
        } else if (sor == 3 && oszlop == 12 && sor3oszlop12 && nemVelemVagy) {
            hosTamadas(sor3oszlop12Nev,3,12);
        } else if (sor == 2 && oszlop == 12 && sor2oszlop12 && nemVelemVagy) {
            hosTamadas(sor2oszlop12Nev,2,12);
        } else if (sor == 1 && oszlop == 12 && sor1oszlop12 && nemVelemVagy) {
            hosTamadas(sor1oszlop12Nev,1,12);
        }
    }

    public static void hosTamadas(String egyseg, int sor, int oszlop) {

        switch (egyseg) {

            case "efoldmuv" -> {
                Eletero.elsoEllEgysegEletero -= Tamadas.tamadasErtek;
                ellenfelDbSzamElso = Eletero.elsoEllEgysegEletero / 3;
                if (Eletero.elsoEllEgysegEletero > 0) {

                    egysegekSorrend.remove(ellenfelEgysegIras1);
                    egysegekSorrend.remove(ellenfelEgysegL1Kep);

                    if (ellenfelDbSzamElso < 10) {
                        ellenfelEgysegErtek1.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamElso)));
                    } else {
                        ellenfelEgysegErtek1.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamElso)));
                    }

                    informacioErtek.setText("<html><center>" + egysegNeve + " hős megtámadta " + egyseg + " egységet,<p> aki " + Tamadas.tamadasErtek + " szenvedett " +
                            "és " + Eletero.elsoEllEgysegEletero + " maradt.</p></center></html>");

                    ellenfelEgysegIras1.add(ellenfelEgysegErtek1);
                    ellenfelEgysegL1Kep.add(ellenfelEgysegL1Kepe);
                    EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras1, ellenfelEgysegL1Kep, oszlop, sor);
                    ablakCsata.add(egysegekSorrend);
                } else {
                    egysegekSorrend.remove(ellenfelEgysegIras1);
                    egysegekSorrend.remove(ellenfelEgysegL1Kep);

                    efoldmuv = 0;
                    egysegPozTorlese("efoldmuv", sor, oszlop);

                    informacioErtek.setText("<html><center>" + egysegNeve + " hős megtámadta " + egyseg + " egységet,<p> aki " + Tamadas.tamadasErtek + " szenvedett " +
                            "és meghalt.</p></center></html>");
                }
            }
            case "ecsont" -> {
                Eletero.elsoEllEgysegEletero -= Tamadas.tamadasErtek;
                ellenfelDbSzamElso = Eletero.elsoEllEgysegEletero / 2;
                if (Eletero.elsoEllEgysegEletero > 0) {

                    egysegekSorrend.remove(ellenfelEgysegIras1);
                    egysegekSorrend.remove(ellenfelEgysegL1Kep);

                    if (ellenfelDbSzamElso < 10) {
                        ellenfelEgysegErtek1.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamElso)));
                    } else {
                        ellenfelEgysegErtek1.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamElso)));
                    }

                    informacioErtek.setText("<html><center>" + egysegNeve + " hős megtámadta " + egyseg + " egységet,<p> aki " + Tamadas.tamadasErtek + " szenvedett " +
                            "és " + Eletero.elsoEllEgysegEletero + " maradt.</p></center></html>");

                    ellenfelEgysegIras1.add(ellenfelEgysegErtek1);
                    ellenfelEgysegL1Kep.add(ellenfelEgysegL1Kepe);
                    EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras1, ellenfelEgysegL1Kep, oszlop, sor);
                    ablakCsata.add(egysegekSorrend);
                } else {
                    egysegekSorrend.remove(ellenfelEgysegIras1);
                    egysegekSorrend.remove(ellenfelEgysegL1Kep);

                    ecsont = 0;
                    egysegPozTorlese("ecsont", sor, oszlop);

                    informacioErtek.setText("<html><center>" + egysegNeve + " hős megtámadta " + egyseg + " egységet,<p> aki " + Tamadas.tamadasErtek + " szenvedett " +
                            "és meghalt.</p></center></html>");
                }
            }
            case "efelder" -> {
                Eletero.masodikEllEgysegEletero -= Tamadas.tamadasErtek;
                ellenfelDbSzamMasodik = Eletero.masodikEllEgysegEletero / 10;
                if (Eletero.masodikEllEgysegEletero > 0) {

                    egysegekSorrend.remove(ellenfelEgysegIras2);
                    egysegekSorrend.remove(ellenfelEgysegL2Kep);

                    if (ellenfelDbSzamMasodik < 10) {
                        ellenfelEgysegErtek2.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamMasodik)));
                    } else {
                        ellenfelEgysegErtek2.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamMasodik)));
                    }

                    informacioErtek.setText("<html><center>" + egysegNeve + " hős megtámadta " + egyseg + " egységet,<p> aki " + Tamadas.tamadasErtek + " szenvedett " +
                            "és " + Eletero.masodikEllEgysegEletero + " maradt.</p></center></html>");

                    ellenfelEgysegIras2.add(ellenfelEgysegErtek2);
                    ellenfelEgysegL2Kep.add(ellenfelEgysegL2Kepe);
                    EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras2, ellenfelEgysegL2Kep, oszlop, sor);
                    ablakCsata.add(egysegekSorrend);
                } else {
                    egysegekSorrend.remove(ellenfelEgysegIras2);
                    egysegekSorrend.remove(ellenfelEgysegL2Kep);

                    efelder = 0;
                    egysegPozTorlese("efelder", sor, oszlop);

                    informacioErtek.setText("<html><center>" + egysegNeve + " hős megtámadta " + egyseg + " egységet,<p> aki " + Tamadas.tamadasErtek + " szenvedett " +
                            "és meghalt.</p></center></html>");
                }
            }
            case "eijas" -> {
                Eletero.masodikEllEgysegEletero -= Tamadas.tamadasErtek;
                ellenfelDbSzamMasodik = Eletero.masodikEllEgysegEletero / 7;
                if (Eletero.masodikEllEgysegEletero > 0) {

                    egysegekSorrend.remove(ellenfelEgysegIras2);
                    egysegekSorrend.remove(ellenfelEgysegL2Kep);

                    if (ellenfelDbSzamMasodik < 10) {
                        ellenfelEgysegErtek2.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamMasodik)));
                    } else {
                        ellenfelEgysegErtek2.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamMasodik)));
                    }

                    informacioErtek.setText("<html><center>" + egysegNeve + " hős megtámadta " + egyseg + " egységet,<p> aki " + Tamadas.tamadasErtek + " szenvedett " +
                            "és " + Eletero.masodikEllEgysegEletero + " maradt.</p></center></html>");

                    ellenfelEgysegIras2.add(ellenfelEgysegErtek2);
                    ellenfelEgysegL2Kep.add(ellenfelEgysegL2Kepe);
                    EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras2, ellenfelEgysegL2Kep, oszlop, sor);
                    ablakCsata.add(egysegekSorrend);
                } else {
                    egysegekSorrend.remove(ellenfelEgysegIras2);
                    egysegekSorrend.remove(ellenfelEgysegL2Kep);

                    eijas = 0;
                    egysegPozTorlese("eijas", sor, oszlop);

                    informacioErtek.setText("<html><center>" + egysegNeve + " hős megtámadta " + egyseg + " egységet,<p> aki " + Tamadas.tamadasErtek + " szenvedett " +
                            "és meghalt.</p></center></html>");
                }
            }
            case "emino" -> {
                Eletero.harmadikEllEgysegEletero -= Tamadas.tamadasErtek;
                ellenfelDbSzamHarmadik = Eletero.harmadikEllEgysegEletero / 80;
                if (Eletero.harmadikEllEgysegEletero > 0) {

                    egysegekSorrend.remove(ellenfelEgysegIras3);
                    egysegekSorrend.remove(ellenfelEgysegL3Kep);

                    if (ellenfelDbSzamHarmadik < 10) {
                        ellenfelEgysegErtek3.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamHarmadik)));
                    } else {
                        ellenfelEgysegErtek3.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamHarmadik)));
                    }

                    informacioErtek.setText("<html><center>" + egysegNeve + " hős megtámadta " + egyseg + " egységet,<p> aki " + Tamadas.tamadasErtek + " szenvedett " +
                            "és " + Eletero.harmadikEllEgysegEletero + " maradt.</p></center></html>");

                    ellenfelEgysegIras3.add(ellenfelEgysegErtek3);
                    ellenfelEgysegL3Kep.add(ellenfelEgysegL3Kepe);
                    EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras3, ellenfelEgysegL3Kep, oszlop, sor);
                    ablakCsata.add(egysegekSorrend);
                } else {
                    egysegekSorrend.remove(ellenfelEgysegIras3);
                    egysegekSorrend.remove(ellenfelEgysegL3Kep);

                    emino = 0;
                    egysegPozTorlese("emino", sor, oszlop);

                    informacioErtek.setText("<html><center>" + egysegNeve + " hős megtámadta " + egyseg + " egységet,<p> aki " + Tamadas.tamadasErtek + " szenvedett " +
                            "és meghalt.</p></center></html>");
                }
            }
            case "egrif" -> {
                Eletero.harmadikEllEgysegEletero -= Tamadas.tamadasErtek;
                ellenfelDbSzamHarmadik = Eletero.harmadikEllEgysegEletero / 30;
                if (Eletero.harmadikEllEgysegEletero > 0) {

                    egysegekSorrend.remove(ellenfelEgysegIras3);
                    egysegekSorrend.remove(ellenfelEgysegL3Kep);

                    if (ellenfelDbSzamHarmadik < 10) {
                        ellenfelEgysegErtek3.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamHarmadik)));
                    } else {
                        ellenfelEgysegErtek3.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamHarmadik)));
                    }

                    informacioErtek.setText("<html><center>" + egysegNeve + " hős megtámadta " + egyseg + " egységet,<p> aki " + Tamadas.tamadasErtek + " szenvedett " +
                            "és " + Eletero.harmadikEllEgysegEletero + " maradt.</p></center></html>");

                    ellenfelEgysegIras3.add(ellenfelEgysegErtek3);
                    ellenfelEgysegL3Kep.add(ellenfelEgysegL3Kepe);
                    EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras3, ellenfelEgysegL3Kep, oszlop, sor);
                    ablakCsata.add(egysegekSorrend);
                } else {
                    egysegekSorrend.remove(ellenfelEgysegIras3);
                    egysegekSorrend.remove(ellenfelEgysegL3Kep);

                    egrif = 0;
                    egysegPozTorlese("egrif", sor, oszlop);

                    informacioErtek.setText("<html><center>" + egysegNeve + " hős megtámadta " + egyseg + " egységet,<p> aki " + Tamadas.tamadasErtek + " szenvedett " +
                            "és meghalt.</p></center></html>");
                }
            }
            case "efegyv" -> {
                Eletero.negyedikEllEgysegEletero -= Tamadas.tamadasErtek;
                ellenfelDbSzamNegyedik = Eletero.negyedikEllEgysegEletero / 33;
                if (Eletero.negyedikEllEgysegEletero > 0) {

                    egysegekSorrend.remove(ellenfelEgysegIras4);
                    egysegekSorrend.remove(ellenfelEgysegL4Kep);

                    if (ellenfelDbSzamNegyedik < 10) {
                        ellenfelEgysegErtek4.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamNegyedik)));
                    } else {
                        ellenfelEgysegErtek4.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamNegyedik)));
                    }

                    informacioErtek.setText("<html><center>" + egysegNeve + " hős megtámadta " + egyseg + " egységet,<p> aki " + Tamadas.tamadasErtek + " szenvedett " +
                            "és " + Eletero.negyedikEllEgysegEletero + " maradt.</p></center></html>");

                    ellenfelEgysegIras4.add(ellenfelEgysegErtek4);
                    ellenfelEgysegL4Kep.add(ellenfelEgysegL4Kepe);
                    EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras4, ellenfelEgysegL4Kep, oszlop, sor);
                    ablakCsata.add(egysegekSorrend);
                } else {
                    egysegekSorrend.remove(ellenfelEgysegIras4);
                    egysegekSorrend.remove(ellenfelEgysegL4Kep);

                    efegyv = 0;
                    egysegPozTorlese("efegyv", sor, oszlop);

                    informacioErtek.setText("<html><center>" + egysegNeve + " hős megtámadta " + egyseg + " egységet,<p> aki " + Tamadas.tamadasErtek + " szenvedett " +
                            "és meghalt.</p></center></html>");
                }
            }
            case "eorgy" -> {
                Eletero.negyedikEllEgysegEletero -= Tamadas.tamadasErtek;
                ellenfelDbSzamNegyedik = Eletero.negyedikEllEgysegEletero / 20;
                if (Eletero.negyedikEllEgysegEletero > 0) {

                    egysegekSorrend.remove(ellenfelEgysegIras4);
                    egysegekSorrend.remove(ellenfelEgysegL4Kep);

                    if (ellenfelDbSzamNegyedik < 10) {
                        ellenfelEgysegErtek4.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamNegyedik)));
                    } else {
                        ellenfelEgysegErtek4.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamNegyedik)));
                    }

                    informacioErtek.setText("<html><center>" + egysegNeve + " hős megtámadta " + egyseg + " egységet,<p> aki " + Tamadas.tamadasErtek + " szenvedett " +
                            "és " + Eletero.negyedikEllEgysegEletero + " maradt.</p></center></html>");

                    ellenfelEgysegIras4.add(ellenfelEgysegErtek4);
                    ellenfelEgysegL4Kep.add(ellenfelEgysegL4Kepe);
                    EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras4, ellenfelEgysegL4Kep, oszlop, sor);
                    ablakCsata.add(egysegekSorrend);
                } else {
                    egysegekSorrend.remove(ellenfelEgysegIras4);
                    egysegekSorrend.remove(ellenfelEgysegL4Kep);

                    eorgy = 0;
                    egysegPozTorlese("eorgy", sor, oszlop);

                    informacioErtek.setText("<html><center>" + egysegNeve + " hős megtámadta " + egyseg + " egységet,<p> aki " + Tamadas.tamadasErtek + " szenvedett " +
                            "és meghalt.</p></center></html>");
                }
            }
            case "eharcp" -> {
                Eletero.otodikEllEgysegEletero -= Tamadas.tamadasErtek;
                ellenfelDbSzamOtodik = Eletero.otodikEllEgysegEletero / 54;
                if (Eletero.otodikEllEgysegEletero > 0) {

                    egysegekSorrend.remove(ellenfelEgysegIras5);
                    egysegekSorrend.remove(ellenfelEgysegL5Kep);

                    if (ellenfelDbSzamOtodik < 10) {
                        ellenfelEgysegErtek5.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamOtodik)));
                    } else {
                        ellenfelEgysegErtek5.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamOtodik)));
                    }

                    informacioErtek.setText("<html><center>" + egysegNeve + " hős megtámadta " + egyseg + " egységet,<p> aki " + Tamadas.tamadasErtek + " szenvedett " +
                            "és " + Eletero.otodikEllEgysegEletero + " maradt.</p></center></html>");

                    ellenfelEgysegIras5.add(ellenfelEgysegErtek5);
                    ellenfelEgysegL5Kep.add(ellenfelEgysegL5Kepe);
                    EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras5, ellenfelEgysegL5Kep, oszlop, sor);
                    ablakCsata.add(egysegekSorrend);
                } else {
                    egysegekSorrend.remove(ellenfelEgysegIras5);
                    egysegekSorrend.remove(ellenfelEgysegL5Kep);

                    eharcp = 0;
                    egysegPozTorlese("eharcp", sor, oszlop);

                    informacioErtek.setText("<html><center>" + egysegNeve + " hős megtámadta " + egyseg + " egységet,<p> aki " + Tamadas.tamadasErtek + " szenvedett " +
                            "és meghalt.</p></center></html>");
                }
            }
            case "erapt" -> {
                Eletero.otodikEllEgysegEletero -= Tamadas.tamadasErtek;
                ellenfelDbSzamOtodik = Eletero.otodikEllEgysegEletero / 35;
                if (Eletero.otodikEllEgysegEletero > 0) {

                    egysegekSorrend.remove(ellenfelEgysegIras5);
                    egysegekSorrend.remove(ellenfelEgysegL5Kep);

                    if (ellenfelDbSzamOtodik < 10) {
                        ellenfelEgysegErtek5.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamOtodik)));
                    } else {
                        ellenfelEgysegErtek5.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamOtodik)));
                    }

                    informacioErtek.setText("<html><center>" + egysegNeve + " hős megtámadta " + egyseg + " egységet,<p> aki " + Tamadas.tamadasErtek + " szenvedett " +
                            "és " + Eletero.otodikEllEgysegEletero + " maradt.</p></center></html>");

                    ellenfelEgysegIras5.add(ellenfelEgysegErtek5);
                    ellenfelEgysegL5Kep.add(ellenfelEgysegL5Kepe);
                    EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras5, ellenfelEgysegL5Kep, oszlop, sor);
                    ablakCsata.add(egysegekSorrend);
                } else {
                    egysegekSorrend.remove(ellenfelEgysegIras5);
                    egysegekSorrend.remove(ellenfelEgysegL5Kep);

                    erapt = 0;
                    egysegPozTorlese("erapt", sor, oszlop);

                    informacioErtek.setText("<html><center>" + egysegNeve + " hős megtámadta " + egyseg + " egységet,<p> aki " + Tamadas.tamadasErtek + " szenvedett " +
                            "és meghalt.</p></center></html>");
                }
            }
        }
        double ujErtek2 = moralSorrendTList.get(mutato);

        moralSorrendTList.remove(mutato);
        moralSorrendTList.add(ujErtek2);

        hanyadikKor(elsoHely);
        korokKiirasa();

        sorrendFrissites();
    }
}
