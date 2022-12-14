package Ellenfel;

import Egysegek.EgysegLathatosag;
import Egysegek.Eletero;

import static Egysegek.EgysegLetetel.*;
import static Egysegek.Sebzes.egysegPozTorlese;
import static Egysegek.Sebzes.tamadasSzurkites;
import static Egysegek.EgysegSzam.*;
import static Jatek.JatekAblak.*;
import static Jatek.Sorrend.*;
import static Jatek.XYKordinatakBemenet.*;

public class EllenfelTamad {

    static int velemVagy1EllenfelH =0;
    static int velemVagy2EllenfelH =0;
    static int velemVagy3EllenfelH =0;
    static int velemVagy4EllenfelH =0;
    static int velemVagy5EllenfelH =0;
    static int ellenemVagydbEllenfelH =0;
    public static int ellenemVagy1EllenfelH =0;
    public static int ellenemVagy2EllenfelH =0;
    public static int ellenemVagy3EllenfelH =0;
    public static int ellenemVagy4EllenfelH =0;
    public static int ellenemVagy5EllenfelH =0;

    static String velemVagy1EllenfelHNev="n";
    static String velemVagy2EllenfelHNev="n";
    static String velemVagy3EllenfelHNev="n";
    static String velemVagy4EllenfelHNev="n";
    static String velemVagy5EllenfelHNev="n";

    public static int mutatoEll=0;

    public static boolean ellenfelHosVolt=false;


    public static void kiKicsodaEll() {
        int sor=0;
        int oszlop;
        velemVagy1EllenfelH =0;
        velemVagy2EllenfelH =0;
        velemVagy3EllenfelH =0;
        velemVagy4EllenfelH =0;
        velemVagy5EllenfelH =0;
        ellenemVagydbEllenfelH =0;
        ellenemVagy1EllenfelH =0;
        ellenemVagy2EllenfelH =0;
        ellenemVagy3EllenfelH =0;
        ellenemVagy4EllenfelH =0;
        ellenemVagy5EllenfelH =0;
        velemVagy1EllenfelHNev="n";
        velemVagy2EllenfelHNev="n";
        velemVagy3EllenfelHNev="n";
        velemVagy4EllenfelHNev="n";
        velemVagy5EllenfelHNev="n";

        for (int i=0;i<10;i++) {
            sor++;

            oszlop=0;
            for (int j=0;j<12;j++) {
                oszlop++;

                if (sor == 10 && oszlop == 1 && sor10oszlop1) {
                    ellCsapatok(sor10oszlop1Nev,10,1);
                } else if (sor == 10 && oszlop == 2 && sor10oszlop2) {
                    ellCsapatok(sor10oszlop2Nev,10,2);
                } else if (sor == 9 && oszlop == 1 && sor9oszlop1) {
                    ellCsapatok( sor9oszlop1Nev,9,1);
                } else if (sor == 9 && oszlop == 2 && sor9oszlop2) {
                    ellCsapatok( sor9oszlop2Nev,9,2);
                } else if (sor == 8 && oszlop == 1 && sor8oszlop1) {
                    ellCsapatok( sor8oszlop1Nev,8,1);
                } else if (sor == 8 && oszlop == 2 && sor8oszlop2) {
                    ellCsapatok( sor8oszlop2Nev,8,2);
                } else if (sor == 7 && oszlop == 1 && sor7oszlop1) {
                    ellCsapatok( sor7oszlop1Nev,7,1);
                } else if (sor == 7 && oszlop == 2 && sor7oszlop2) {
                    ellCsapatok( sor7oszlop2Nev,7,2);
                } else if (sor == 6 && oszlop == 1 && sor6oszlop1) {
                    ellCsapatok( sor6oszlop1Nev,6,1);
                } else if (sor == 6 && oszlop == 2 && sor6oszlop2) {
                    ellCsapatok( sor6oszlop2Nev,6,2);
                } else if (sor == 5 && oszlop == 1 && sor5oszlop1) {
                    ellCsapatok( sor5oszlop1Nev,5,1);
                } else if (sor == 5 && oszlop == 2 && sor5oszlop2) {
                    ellCsapatok( sor5oszlop2Nev,5,2);
                } else if (sor == 4 && oszlop == 1 && sor4oszlop1) {
                    ellCsapatok( sor4oszlop1Nev,4,1);
                } else if (sor == 4 && oszlop == 2 && sor4oszlop2) {
                    ellCsapatok( sor4oszlop2Nev,4,2);
                } else if (sor == 3 && oszlop == 1 && sor3oszlop1) {
                    ellCsapatok( sor3oszlop1Nev,3,1);
                } else if (sor == 3 && oszlop == 2 && sor3oszlop2) {
                    ellCsapatok( sor3oszlop2Nev,3,2);
                } else if (sor == 2 && oszlop == 1 && sor2oszlop1) {
                    ellCsapatok( sor2oszlop1Nev,2,1);
                } else if (sor == 2 && oszlop == 2 && sor2oszlop2) {
                    ellCsapatok( sor2oszlop2Nev,2,2);
                } else if (sor == 1 && oszlop == 1 && sor1oszlop1) {
                    ellCsapatok( sor1oszlop1Nev,1,1);
                } else if (sor == 1 && oszlop == 2 && sor1oszlop2) {
                    ellCsapatok( sor1oszlop2Nev,1,2);
                } else if (sor == 8 && oszlop == 3 && sor8oszlop3) {
                    ellCsapatok( sor8oszlop3Nev,8,3);
                } else if (sor == 7 && oszlop == 3 && sor7oszlop3) {
                    ellCsapatok( sor7oszlop3Nev,7,3);
                } else if (sor == 6 && oszlop == 3 && sor6oszlop3) {
                    ellCsapatok( sor6oszlop3Nev,6,3);
                } else if (sor == 5 && oszlop == 3 && sor5oszlop3) {
                    ellCsapatok( sor5oszlop3Nev,5,3);
                } else if (sor == 4 && oszlop == 3 && sor4oszlop3) {
                    ellCsapatok( sor4oszlop3Nev,4,3);
                } else if (sor == 3 && oszlop == 3 && sor3oszlop3) {
                    ellCsapatok( sor3oszlop3Nev,3,3);
                } else if (sor == 2 && oszlop == 3 && sor2oszlop3) {
                    ellCsapatok( sor2oszlop3Nev,2,3);
                } else if (sor == 1 && oszlop == 3 && sor1oszlop3) {
                    ellCsapatok( sor1oszlop3Nev,1,3);
                } else if (sor == 8 && oszlop == 4 && sor8oszlop4) {
                    ellCsapatok( sor8oszlop4Nev,8,4);
                } else if (sor == 7 && oszlop == 4 && sor7oszlop4) {
                    ellCsapatok( sor7oszlop4Nev,7,4);
                } else if (sor == 5 && oszlop == 4 && sor5oszlop4) {
                    ellCsapatok( sor5oszlop4Nev,5,4);
                } else if (sor == 4 && oszlop == 4 && sor4oszlop4) {
                    ellCsapatok( sor4oszlop4Nev,4,4);
                } else if (sor == 3 && oszlop == 4 && sor3oszlop4) {
                    ellCsapatok( sor3oszlop4Nev,3,4);
                } else if (sor == 2 && oszlop == 4 && sor2oszlop4) {
                    ellCsapatok( sor2oszlop4Nev,2,4);
                } else if (sor == 1 && oszlop == 4 && sor1oszlop4) {
                    ellCsapatok( sor1oszlop4Nev,1,4);
                } else if (sor == 10 && oszlop == 5 && sor10oszlop5) {
                    ellCsapatok(sor10oszlop5Nev,10,5);
                } else if (sor == 9 && oszlop == 5 && sor9oszlop5) {
                    ellCsapatok( sor9oszlop5Nev,9,5);
                } else if (sor == 8 && oszlop == 5 && sor8oszlop5) {
                    ellCsapatok( sor8oszlop5Nev,8,5);
                } else if (sor == 7 && oszlop == 5 && sor7oszlop5) {
                    ellCsapatok( sor7oszlop5Nev,7,5);
                } else if (sor == 6 && oszlop == 5 && sor6oszlop5) {
                    ellCsapatok( sor6oszlop5Nev,6,5);
                } else if (sor == 5 && oszlop == 5 && sor5oszlop5) {
                    ellCsapatok( sor5oszlop5Nev,5,5);
                } else if (sor == 4 && oszlop == 5 && sor4oszlop5) {
                    ellCsapatok( sor4oszlop5Nev,4,5);
                } else if (sor == 3 && oszlop == 5 && sor3oszlop5) {
                    ellCsapatok( sor3oszlop5Nev,3,5);
                } else if (sor == 2 && oszlop == 5 && sor2oszlop5) {
                    ellCsapatok( sor2oszlop5Nev,2,5);
                } else if (sor == 1 && oszlop == 5 && sor1oszlop5) {
                    ellCsapatok( sor1oszlop5Nev,1,5);
                } else if (sor == 10 && oszlop == 6 && sor10oszlop6) {
                    ellCsapatok(sor10oszlop6Nev,10,6);
                } else if (sor == 9 && oszlop == 6 && sor9oszlop6) {
                    ellCsapatok( sor9oszlop6Nev,9,6);
                } else if (sor == 7 && oszlop == 6 && sor7oszlop6) {
                    ellCsapatok( sor7oszlop6Nev,7,6);
                } else if (sor == 6 && oszlop == 6 && sor6oszlop6) {
                    ellCsapatok( sor6oszlop6Nev,6,6);
                } else if (sor == 5 && oszlop == 6 && sor5oszlop6) {
                    ellCsapatok( sor5oszlop6Nev,5,6);
                } else if (sor == 4 && oszlop == 6 && sor4oszlop6) {
                    ellCsapatok( sor4oszlop6Nev,4,6);
                } else if (sor == 3 && oszlop == 6 && sor3oszlop6) {
                    ellCsapatok( sor3oszlop6Nev,3,6);
                } else if (sor == 2 && oszlop == 6 && sor2oszlop6) {
                    ellCsapatok( sor2oszlop6Nev,2,6);
                } else if (sor == 1 && oszlop == 6 && sor1oszlop6) {
                    ellCsapatok( sor1oszlop6Nev,1,6);
                } else if (sor == 10 && oszlop == 7 && sor10oszlop7) {
                    ellCsapatok(sor10oszlop7Nev,10,7);
                } else if (sor == 9 && oszlop == 7 && sor9oszlop7) {
                    ellCsapatok( sor9oszlop7Nev,9,7);
                } else if (sor == 7 && oszlop == 7 && sor7oszlop7) {
                    ellCsapatok( sor7oszlop7Nev,7,7);
                } else if (sor == 6 && oszlop == 7 && sor6oszlop7) {
                    ellCsapatok( sor6oszlop7Nev,6,7);
                } else if (sor == 5 && oszlop == 7 && sor5oszlop7) {
                    ellCsapatok( sor5oszlop7Nev,5,7);
                } else if (sor == 4 && oszlop == 7 && sor4oszlop7) {
                    ellCsapatok( sor4oszlop7Nev,4,7);
                } else if (sor == 3 && oszlop == 7 && sor3oszlop7) {
                    ellCsapatok( sor3oszlop7Nev,3,7);
                } else if (sor == 2 && oszlop == 7 && sor2oszlop7) {
                    ellCsapatok( sor2oszlop7Nev,2,7);
                } else if (sor == 1 && oszlop == 7 && sor1oszlop7) {
                    ellCsapatok( sor1oszlop7Nev,1,7);
                } else if (sor == 10 && oszlop == 8 && sor10oszlop8) {
                    ellCsapatok(sor10oszlop8Nev,10,8);
                } else if (sor == 9 && oszlop == 8 && sor9oszlop8) {
                    ellCsapatok( sor9oszlop8Nev,9,8);
                } else if (sor == 8 && oszlop == 8 && sor8oszlop8) {
                    ellCsapatok( sor8oszlop8Nev,8,8);
                } else if (sor == 6 && oszlop == 8 && sor6oszlop8) {
                    ellCsapatok( sor6oszlop8Nev,6,8);
                } else if (sor == 5 && oszlop == 8 && sor5oszlop8) {
                    ellCsapatok( sor5oszlop8Nev,5,8);
                } else if (sor == 4 && oszlop == 8 && sor4oszlop8) {
                    ellCsapatok( sor4oszlop8Nev,4,8);
                } else if (sor == 3 && oszlop == 8 && sor3oszlop8) {
                    ellCsapatok( sor3oszlop8Nev,3,8);
                } else if (sor == 2 && oszlop == 8 && sor2oszlop8) {
                    ellCsapatok( sor2oszlop8Nev,2,8);
                } else if (sor == 1 && oszlop == 8 && sor1oszlop8) {
                    ellCsapatok( sor1oszlop8Nev,1,8);
                } else if (sor == 10 && oszlop == 9 && sor10oszlop9) {
                    ellCsapatok(sor10oszlop9Nev,10,9);
                } else if (sor == 9 && oszlop == 9 && sor9oszlop9) {
                    ellCsapatok( sor9oszlop9Nev,9,9);
                } else if (sor == 8 && oszlop == 9 && sor8oszlop9) {
                    ellCsapatok( sor8oszlop9Nev,8,9);
                } else if (sor == 6 && oszlop == 9 && sor6oszlop9) {
                    ellCsapatok( sor6oszlop9Nev,6,9);
                } else if (sor == 5 && oszlop == 9 && sor5oszlop9) {
                    ellCsapatok( sor5oszlop9Nev,5,9);
                } else if (sor == 4 && oszlop == 9 && sor4oszlop9) {
                    ellCsapatok( sor4oszlop9Nev,4,9);
                } else if (sor == 3 && oszlop == 9 && sor3oszlop9) {
                    ellCsapatok( sor3oszlop9Nev,3,9);
                } else if (sor == 2 && oszlop == 9 && sor2oszlop9) {
                    ellCsapatok( sor2oszlop9Nev,2,9);
                } else if (sor == 1 && oszlop == 9 && sor1oszlop9) {
                    ellCsapatok( sor1oszlop9Nev,1,9);
                } else if (sor == 10 && oszlop == 10 && sor10oszlop10) {
                    ellCsapatok(sor10oszlop10Nev,10,10);
                } else if (sor == 9 && oszlop == 10 && sor9oszlop10) {
                    ellCsapatok(sor9oszlop10Nev,9,10);
                } else if (sor == 8 && oszlop == 10 && sor8oszlop10) {
                    ellCsapatok(sor8oszlop10Nev,8,10);
                } else if (sor == 7 && oszlop == 10 && sor7oszlop10) {
                    ellCsapatok(sor7oszlop10Nev,7,10);
                } else if (sor == 6 && oszlop == 10 && sor6oszlop10) {
                    ellCsapatok(sor6oszlop10Nev,6,10);
                } else if (sor == 5 && oszlop == 10 && sor5oszlop10) {
                    ellCsapatok(sor5oszlop10Nev,5,10);
                } else if (sor == 4 && oszlop == 10 && sor4oszlop10) {
                    ellCsapatok(sor4oszlop10Nev,4,10);
                } else if (sor == 3 && oszlop == 10 && sor3oszlop10) {
                    ellCsapatok(sor3oszlop10Nev,3,10);
                } else if (sor == 2 && oszlop == 10 && sor2oszlop10) {
                    ellCsapatok(sor2oszlop10Nev,2,10);
                } else if (sor == 1 && oszlop == 10 && sor1oszlop10) {
                    ellCsapatok(sor1oszlop10Nev,1,10);
                } else if (sor == 10 && oszlop == 11 && sor10oszlop11) {
                    ellCsapatok(sor10oszlop11Nev,10,11);
                } else if (sor == 9 && oszlop == 11 && sor9oszlop11) {
                    ellCsapatok(sor9oszlop11Nev,9,11);
                } else if (sor == 8 && oszlop == 11 && sor8oszlop11) {
                    ellCsapatok(sor8oszlop11Nev,8,11);
                } else if (sor == 7 && oszlop == 11 && sor7oszlop11) {
                    ellCsapatok(sor7oszlop11Nev,7,11);
                } else if (sor == 6 && oszlop == 11 && sor6oszlop11) {
                    ellCsapatok(sor6oszlop11Nev,6,11);
                } else if (sor == 5 && oszlop == 11 && sor5oszlop11) {
                    ellCsapatok(sor5oszlop11Nev,5,11);
                } else if (sor == 4 && oszlop == 11 && sor4oszlop11) {
                    ellCsapatok(sor4oszlop11Nev,4,11);
                } else if (sor == 3 && oszlop == 11 && sor3oszlop11) {
                    ellCsapatok(sor3oszlop11Nev,3,11);
                } else if (sor == 2 && oszlop == 11 && sor2oszlop11) {
                    ellCsapatok(sor2oszlop11Nev,2,11);
                } else if (sor == 1 && oszlop == 11 && sor1oszlop11) {
                    ellCsapatok(sor1oszlop11Nev,1,11);
                } else if (sor == 10 && oszlop == 12 && sor10oszlop12) {
                    ellCsapatok(sor10oszlop12Nev,10,12);
                } else if (sor == 9 && oszlop == 12 && sor9oszlop12) {
                    ellCsapatok(sor9oszlop12Nev,9,12);
                } else if (sor == 8 && oszlop == 12 && sor8oszlop12) {
                    ellCsapatok(sor8oszlop12Nev,8,12);
                } else if (sor == 7 && oszlop == 12 && sor7oszlop12) {
                    ellCsapatok(sor7oszlop12Nev,7,12);
                } else if (sor == 6 && oszlop == 12 && sor6oszlop12) {
                    ellCsapatok(sor6oszlop12Nev,6,12);
                } else if (sor == 5 && oszlop == 12 && sor5oszlop12) {
                    ellCsapatok(sor5oszlop12Nev,5,12);
                } else if (sor == 4 && oszlop == 12 && sor4oszlop12) {
                    ellCsapatok(sor4oszlop12Nev,4,12);
                } else if (sor == 3 && oszlop == 12 && sor3oszlop12) {
                    ellCsapatok(sor3oszlop12Nev,3,12);
                } else if (sor == 2 && oszlop == 12 && sor2oszlop12) {
                    ellCsapatok(sor2oszlop12Nev,2,12);
                } else if (sor == 1 && oszlop == 12 && sor1oszlop12) {
                    ellCsapatok(sor1oszlop12Nev,1,12);
                }
            }
        }
    }

    public static void holVagyEllHos() {

        int listaMeret=moralSorrendTList.size();
        mutatoEll=110;

        //System.out.println(velemVagy1EllenfelHNev+" "+velemVagy2EllenfelHNev+" "+velemVagy3EllenfelHNev+" "+velemVagy4EllenfelHNev+" "+velemVagy5EllenfelHNev+" "+moralSorrendTList);

        if ((velemVagy1EllenfelHNev.charAt(0)=='e' && velemVagy1EllenfelHNev.charAt(1)=='f') ||
            (velemVagy2EllenfelHNev.charAt(0)=='e' && velemVagy2EllenfelHNev.charAt(1)=='i') || 
            (velemVagy3EllenfelHNev.charAt(0)=='e' && velemVagy3EllenfelHNev.charAt(1)=='g') || 
            (velemVagy4EllenfelHNev.charAt(0)=='e' && velemVagy4EllenfelHNev.charAt(1)=='f') ||
            (velemVagy5EllenfelHNev.charAt(0)=='e' && velemVagy5EllenfelHNev.charAt(1)=='h')  ) {
                for (int i=0;i<listaMeret;i++) {
                    if (moralSorrendTList.get(i)==2) {
                        mutatoEll=i;
                    }
                }
        }else if ((velemVagy1EllenfelHNev.charAt(0)=='e' && velemVagy1EllenfelHNev.charAt(1)=='c') ||
                    (velemVagy2EllenfelHNev.charAt(0)=='e' && velemVagy2EllenfelHNev.charAt(1)=='f') || 
                    (velemVagy3EllenfelHNev.charAt(0)=='e' && velemVagy3EllenfelHNev.charAt(1)=='m') || 
                    (velemVagy4EllenfelHNev.charAt(0)=='e' && velemVagy4EllenfelHNev.charAt(1)=='o') ||
                    (velemVagy5EllenfelHNev.charAt(0)=='e' && velemVagy5EllenfelHNev.charAt(1)=='r')  ){
            for (int i=0;i<listaMeret;i++) {
                if (moralSorrendTList.get(i)==1) {
                    mutatoEll=i;
                }
            }
        }
    }

    public static void ellCsapatok(String egyseg, int sor, int oszlop) {

                  if (egyseg.charAt(0)!='e') {
                      ellenemVagydbEllenfelH++;

                      if (ellenemVagydbEllenfelH==1) {
                          ellenemVagy1EllenfelH=Integer.parseInt(String.valueOf(sor) + String.valueOf(oszlop));
                      }else if (ellenemVagydbEllenfelH==2) {
                          ellenemVagy2EllenfelH=Integer.parseInt(String.valueOf(sor) + String.valueOf(oszlop));
                      }else if (ellenemVagydbEllenfelH==3) {
                          ellenemVagy3EllenfelH=Integer.parseInt(String.valueOf(sor) + String.valueOf(oszlop));
                      }else if (ellenemVagydbEllenfelH==4) {
                          ellenemVagy4EllenfelH=Integer.parseInt(String.valueOf(sor) + String.valueOf(oszlop));
                      }else if (ellenemVagydbEllenfelH==5) {
                          ellenemVagy5EllenfelH=Integer.parseInt(String.valueOf(sor) + String.valueOf(oszlop));
                      }
                      tamadasSzurkites(sor,oszlop);
                  }else {

                      if ((egyseg.equals("efoldmuv") || egyseg.equals("ecsont"))) {
                          velemVagy1EllenfelH= Integer.parseInt(String.valueOf(sor) + String.valueOf(oszlop));
                          velemVagy1EllenfelHNev=egyseg;
                      }else if ((egyseg.equals("eijas") || egyseg.equals("efelder"))) {
                          velemVagy2EllenfelH=Integer.parseInt(String.valueOf(sor) + String.valueOf(oszlop));
                          velemVagy2EllenfelHNev=egyseg;
                      }else if ((egyseg.equals("egrif") || egyseg.equals("emino"))) {
                          velemVagy3EllenfelH=Integer.parseInt(String.valueOf(sor) + String.valueOf(oszlop));
                          velemVagy3EllenfelHNev=egyseg;
                      }else if ((egyseg.equals("efegyv") || egyseg.equals("eorgy"))) {
                          velemVagy4EllenfelH=Integer.parseInt(String.valueOf(sor) + String.valueOf(oszlop));
                          velemVagy4EllenfelHNev=egyseg;
                      }else if ((egyseg.equals("eharcp") || egyseg.equals("erapt"))) {
                          velemVagy5EllenfelH=Integer.parseInt(String.valueOf(sor) + String.valueOf(oszlop));
                          velemVagy5EllenfelHNev=egyseg;
                      }
                  }
    }

    public static void megtamadhato(int sor,int oszlop) {

        int poz=Integer.parseInt(String.valueOf(sor) + String.valueOf(oszlop));

        boolean nemVelemVagy = poz== ellenemVagy1EllenfelH || poz== ellenemVagy2EllenfelH ||
                poz== ellenemVagy3EllenfelH || poz== ellenemVagy4EllenfelH || poz== ellenemVagy5EllenfelH ;


        System.out.println(nemVelemVagy+"  1:"+ellenemVagy1EllenfelH+"  2:"+ellenemVagy2EllenfelH+"  3:"+ellenemVagy3EllenfelH+"  4:"+ellenemVagy4EllenfelH+"  5:"+ellenemVagy5EllenfelH);

        if (sor == 10 && oszlop == 1 && sor10oszlop1 && nemVelemVagy) {
            ellHosTamadas(sor10oszlop1Nev,10,1);
        } else if (sor == 10 && oszlop == 2 && sor10oszlop2 && nemVelemVagy) {
            ellHosTamadas(sor10oszlop2Nev,10,2);
        } else if (sor == 9 && oszlop == 1 && sor9oszlop1 && nemVelemVagy) {
            ellHosTamadas(sor9oszlop1Nev,9,1);
        } else if (sor == 9 && oszlop == 2 && sor9oszlop2 && nemVelemVagy) {
            ellHosTamadas(sor9oszlop2Nev,9,2);
        } else if (sor == 8 && oszlop == 1 && sor8oszlop1 && nemVelemVagy) {
            ellHosTamadas(sor8oszlop1Nev,8,1);
        } else if (sor == 8 && oszlop == 2 && sor8oszlop2 && nemVelemVagy) {
            ellHosTamadas(sor8oszlop2Nev,8,2);
        } else if (sor == 7 && oszlop == 1 && sor7oszlop1 && nemVelemVagy) {
            ellHosTamadas(sor7oszlop1Nev,7,1);
        } else if (sor == 7 && oszlop == 2 && sor7oszlop2 && nemVelemVagy) {
            ellHosTamadas(sor7oszlop2Nev,7,2);
        } else if (sor == 6 && oszlop == 1 && sor6oszlop1 && nemVelemVagy) {
            ellHosTamadas(sor6oszlop1Nev,6,1);
        } else if (sor == 6 && oszlop == 2 && sor6oszlop2 && nemVelemVagy) {
            ellHosTamadas(sor6oszlop2Nev,6,2);
        } else if (sor == 5 && oszlop == 1 && sor5oszlop1 && nemVelemVagy) {
            ellHosTamadas(sor5oszlop1Nev,5,1);
        } else if (sor == 5 && oszlop == 2 && sor5oszlop2 && nemVelemVagy) {
            ellHosTamadas(sor5oszlop2Nev,5,2);
        } else if (sor == 4 && oszlop == 1 && sor4oszlop1 && nemVelemVagy) {
            ellHosTamadas(sor4oszlop1Nev,4,1);
        } else if (sor == 4 && oszlop == 2 && sor4oszlop2 && nemVelemVagy) {
            ellHosTamadas(sor4oszlop2Nev,4,2);
        } else if (sor == 3 && oszlop == 1 && sor3oszlop1 && nemVelemVagy) {
            ellHosTamadas(sor3oszlop1Nev,3,1);
        } else if (sor == 3 && oszlop == 2 && sor3oszlop2 && nemVelemVagy) {
            ellHosTamadas(sor3oszlop2Nev,3,2);
        } else if (sor == 2 && oszlop == 1 && sor2oszlop1 && nemVelemVagy) {
            ellHosTamadas(sor2oszlop1Nev,2,1);
        } else if (sor == 2 && oszlop == 2 && sor2oszlop2 && nemVelemVagy) {
            ellHosTamadas(sor2oszlop2Nev,2,2);
        } else if (sor == 1 && oszlop == 1 && sor1oszlop1 && nemVelemVagy) {
            ellHosTamadas(sor1oszlop1Nev,1,1);
        } else if (sor == 1 && oszlop == 2 && sor1oszlop2 && nemVelemVagy) {
            ellHosTamadas(sor1oszlop2Nev,1,2);
        } else if (sor == 8 && oszlop == 3 && sor8oszlop3 && nemVelemVagy) {
            ellHosTamadas(sor8oszlop3Nev,8,3);
        } else if (sor == 7 && oszlop == 3 && sor7oszlop3 && nemVelemVagy) {
            ellHosTamadas(sor7oszlop3Nev,7,3);
        } else if (sor == 6 && oszlop == 3 && sor6oszlop3 && nemVelemVagy) {
            ellHosTamadas(sor6oszlop3Nev,6,3);
        } else if (sor == 5 && oszlop == 3 && sor5oszlop3 && nemVelemVagy) {
            ellHosTamadas(sor5oszlop3Nev,5,3);
        } else if (sor == 4 && oszlop == 3 && sor4oszlop3 && nemVelemVagy) {
            ellHosTamadas(sor4oszlop3Nev,4,3);
        } else if (sor == 3 && oszlop == 3 && sor3oszlop3 && nemVelemVagy) {
            ellHosTamadas(sor3oszlop3Nev,3,3);
        } else if (sor == 2 && oszlop == 3 && sor2oszlop3 && nemVelemVagy) {
            ellHosTamadas(sor2oszlop3Nev,2,3);
        } else if (sor == 1 && oszlop == 3 && sor1oszlop3 && nemVelemVagy) {
            ellHosTamadas(sor1oszlop3Nev,1,3);
        } else if (sor == 8 && oszlop == 4 && sor8oszlop4 && nemVelemVagy) {
            ellHosTamadas(sor8oszlop4Nev,8,4);
        } else if (sor == 7 && oszlop == 4 && sor7oszlop4 && nemVelemVagy) {
            ellHosTamadas(sor7oszlop4Nev,7,4);
        } else if (sor == 5 && oszlop == 4 && sor5oszlop4 && nemVelemVagy) {
            ellHosTamadas(sor5oszlop4Nev,5,4);
        } else if (sor == 4 && oszlop == 4 && sor4oszlop4 && nemVelemVagy) {
            ellHosTamadas(sor4oszlop4Nev,4,4);
        } else if (sor == 3 && oszlop == 4 && sor3oszlop4 && nemVelemVagy) {
            ellHosTamadas(sor3oszlop4Nev,3,4);
        } else if (sor == 2 && oszlop == 4 && sor2oszlop4 && nemVelemVagy) {
            ellHosTamadas(sor2oszlop4Nev,2,4);
        } else if (sor == 1 && oszlop == 4 && sor1oszlop4 && nemVelemVagy) {
            ellHosTamadas(sor1oszlop4Nev,1,4);
        } else if (sor == 10 && oszlop == 5 && sor10oszlop5 && nemVelemVagy) {
            ellHosTamadas(sor10oszlop5Nev,10,5);
        } else if (sor == 9 && oszlop == 5 && sor9oszlop5 && nemVelemVagy) {
            ellHosTamadas(sor9oszlop5Nev,9,5);
        } else if (sor == 8 && oszlop == 5 && sor8oszlop5 && nemVelemVagy) {
            ellHosTamadas(sor8oszlop5Nev,8,5);
        } else if (sor == 7 && oszlop == 5 && sor7oszlop5 && nemVelemVagy) {
            ellHosTamadas(sor7oszlop5Nev,7,5);
        } else if (sor == 6 && oszlop == 5 && sor6oszlop5 && nemVelemVagy) {
            ellHosTamadas(sor6oszlop5Nev,6,5);
        } else if (sor == 5 && oszlop == 5 && sor5oszlop5 && nemVelemVagy) {
            ellHosTamadas(sor5oszlop5Nev,5,5);
        } else if (sor == 4 && oszlop == 5 && sor4oszlop5 && nemVelemVagy) {
            ellHosTamadas(sor4oszlop5Nev,4,5);
        } else if (sor == 3 && oszlop == 5 && sor3oszlop5 && nemVelemVagy) {
            ellHosTamadas(sor3oszlop5Nev,3,5);
        } else if (sor == 2 && oszlop == 5 && sor2oszlop5 && nemVelemVagy) {
            ellHosTamadas(sor2oszlop5Nev,2,5);
        } else if (sor == 1 && oszlop == 5 && sor1oszlop5 && nemVelemVagy) {
            ellHosTamadas(sor1oszlop5Nev,1,5);
        } else if (sor == 10 && oszlop == 6 && sor10oszlop6 && nemVelemVagy) {
            ellHosTamadas(sor10oszlop6Nev,10,6);
        } else if (sor == 9 && oszlop == 6 && sor9oszlop6 && nemVelemVagy) {
            ellHosTamadas(sor9oszlop6Nev,9,6);
        } else if (sor == 7 && oszlop == 6 && sor7oszlop6 && nemVelemVagy) {
            ellHosTamadas(sor7oszlop6Nev,7,6);
        } else if (sor == 6 && oszlop == 6 && sor6oszlop6 && nemVelemVagy) {
            ellHosTamadas(sor6oszlop6Nev,6,6);
        } else if (sor == 5 && oszlop == 6 && sor5oszlop6 && nemVelemVagy) {
            ellHosTamadas(sor5oszlop6Nev,5,6);
        } else if (sor == 4 && oszlop == 6 && sor4oszlop6 && nemVelemVagy) {
            ellHosTamadas(sor4oszlop6Nev,4,6);
        } else if (sor == 3 && oszlop == 6 && sor3oszlop6 && nemVelemVagy) {
            ellHosTamadas(sor3oszlop6Nev,3,6);
        } else if (sor == 2 && oszlop == 6 && sor2oszlop6 && nemVelemVagy) {
            ellHosTamadas(sor2oszlop6Nev,2,6);
        } else if (sor == 1 && oszlop == 6 && sor1oszlop6 && nemVelemVagy) {
            ellHosTamadas(sor1oszlop6Nev,1,6);
        } else if (sor == 10 && oszlop == 7 && sor10oszlop7 && nemVelemVagy) {
            ellHosTamadas(sor10oszlop7Nev,10,7);
        } else if (sor == 9 && oszlop == 7 && sor9oszlop7 && nemVelemVagy) {
            ellHosTamadas(sor9oszlop7Nev,9,7);
        } else if (sor == 7 && oszlop == 7 && sor7oszlop7 && nemVelemVagy) {
            ellHosTamadas(sor7oszlop7Nev,7,7);
        } else if (sor == 6 && oszlop == 7 && sor6oszlop7 && nemVelemVagy) {
            ellHosTamadas(sor6oszlop7Nev,6,7);
        } else if (sor == 5 && oszlop == 7 && sor5oszlop7 && nemVelemVagy) {
            ellHosTamadas(sor5oszlop7Nev,5,7);
        } else if (sor == 4 && oszlop == 7 && sor4oszlop7 && nemVelemVagy) {
            ellHosTamadas(sor4oszlop7Nev,4,7);
        } else if (sor == 3 && oszlop == 7 && sor3oszlop7 && nemVelemVagy) {
            ellHosTamadas(sor3oszlop7Nev,3,7);
        } else if (sor == 2 && oszlop == 7 && sor2oszlop7 && nemVelemVagy) {
            ellHosTamadas(sor2oszlop7Nev,2,7);
        } else if (sor == 1 && oszlop == 7 && sor1oszlop7 && nemVelemVagy) {
            ellHosTamadas(sor1oszlop7Nev,1,7);
        } else if (sor == 10 && oszlop == 8 && sor10oszlop8 && nemVelemVagy) {
            ellHosTamadas(sor10oszlop8Nev,10,8);
        } else if (sor == 9 && oszlop == 8 && sor9oszlop8 && nemVelemVagy) {
            ellHosTamadas(sor9oszlop8Nev,9,8);
        } else if (sor == 8 && oszlop == 8 && sor8oszlop8 && nemVelemVagy) {
            ellHosTamadas(sor8oszlop8Nev,8,8);
        } else if (sor == 6 && oszlop == 8 && sor6oszlop8 && nemVelemVagy) {
            ellHosTamadas(sor6oszlop8Nev,6,8);
        } else if (sor == 5 && oszlop == 8 && sor5oszlop8 && nemVelemVagy) {
            ellHosTamadas(sor5oszlop8Nev,5,8);
        } else if (sor == 4 && oszlop == 8 && sor4oszlop8 && nemVelemVagy) {
            ellHosTamadas(sor4oszlop8Nev,4,8);
        } else if (sor == 3 && oszlop == 8 && sor3oszlop8 && nemVelemVagy) {
            ellHosTamadas(sor3oszlop8Nev,3,8);
        } else if (sor == 2 && oszlop == 8 && sor2oszlop8 && nemVelemVagy) {
            ellHosTamadas(sor2oszlop8Nev,2,8);
        } else if (sor == 1 && oszlop == 8 && sor1oszlop8 && nemVelemVagy) {
            ellHosTamadas(sor1oszlop8Nev,1,8);
        } else if (sor == 10 && oszlop == 9 && sor10oszlop9 && nemVelemVagy) {
            ellHosTamadas(sor10oszlop9Nev,10,9);
        } else if (sor == 9 && oszlop == 9 && sor9oszlop9 && nemVelemVagy) {
            ellHosTamadas(sor9oszlop9Nev,9,9);
        } else if (sor == 8 && oszlop == 9 && sor8oszlop9 && nemVelemVagy) {
            ellHosTamadas(sor8oszlop9Nev,8,9);
        } else if (sor == 6 && oszlop == 9 && sor6oszlop9 && nemVelemVagy) {
            ellHosTamadas(sor6oszlop9Nev,6,9);
        } else if (sor == 5 && oszlop == 9 && sor5oszlop9 && nemVelemVagy) {
            ellHosTamadas(sor5oszlop9Nev,5,9);
        } else if (sor == 4 && oszlop == 9 && sor4oszlop9 && nemVelemVagy) {
            ellHosTamadas(sor4oszlop9Nev,4,9);
        } else if (sor == 3 && oszlop == 9 && sor3oszlop9 && nemVelemVagy) {
            ellHosTamadas(sor3oszlop9Nev,3,9);
        } else if (sor == 2 && oszlop == 9 && sor2oszlop9 && nemVelemVagy) {
            ellHosTamadas(sor2oszlop9Nev,2,9);
        } else if (sor == 1 && oszlop == 9 && sor1oszlop9 && nemVelemVagy) {
            ellHosTamadas(sor1oszlop9Nev,1,9);
        } else if (sor == 10 && oszlop == 10 && sor10oszlop10 && nemVelemVagy) {
            ellHosTamadas(sor10oszlop10Nev,10,10);
        } else if (sor == 9 && oszlop == 10 && sor9oszlop10 && nemVelemVagy) {
            ellHosTamadas(sor9oszlop10Nev,9,10);
        } else if (sor == 8 && oszlop == 10 && sor8oszlop10 && nemVelemVagy) {
            ellHosTamadas(sor8oszlop10Nev,8,10);
        } else if (sor == 7 && oszlop == 10 && sor7oszlop10 && nemVelemVagy) {
            ellHosTamadas(sor7oszlop10Nev,7,10);
        } else if (sor == 6 && oszlop == 10 && sor6oszlop10 && nemVelemVagy) {
            ellHosTamadas(sor6oszlop10Nev,6,10);
        } else if (sor == 5 && oszlop == 10 && sor5oszlop10 && nemVelemVagy) {
            ellHosTamadas(sor5oszlop10Nev,5,10);
        } else if (sor == 4 && oszlop == 10 && sor4oszlop10 && nemVelemVagy) {
            ellHosTamadas(sor4oszlop10Nev,4,10);
        } else if (sor == 3 && oszlop == 10 && sor3oszlop10 && nemVelemVagy) {
            ellHosTamadas(sor3oszlop10Nev,3,10);
        } else if (sor == 2 && oszlop == 10 && sor2oszlop10 && nemVelemVagy) {
            ellHosTamadas(sor2oszlop10Nev,2,10);
        } else if (sor == 1 && oszlop == 10 && sor1oszlop10 && nemVelemVagy) {
            ellHosTamadas(sor1oszlop10Nev,1,10);
        } else if (sor == 10 && oszlop == 11 && sor10oszlop11 && nemVelemVagy) {
            ellHosTamadas(sor10oszlop11Nev,10,11);
        } else if (sor == 9 && oszlop == 11 && sor9oszlop11 && nemVelemVagy) {
            ellHosTamadas(sor9oszlop11Nev,9,11);
        } else if (sor == 8 && oszlop == 11 && sor8oszlop11 && nemVelemVagy) {
            ellHosTamadas(sor8oszlop11Nev,8,11);
        } else if (sor == 7 && oszlop == 11 && sor7oszlop11 && nemVelemVagy) {
            ellHosTamadas(sor7oszlop11Nev,7,11);
        } else if (sor == 6 && oszlop == 11 && sor6oszlop11 && nemVelemVagy) {
            ellHosTamadas(sor6oszlop11Nev,6,11);
        } else if (sor == 5 && oszlop == 11 && sor5oszlop11 && nemVelemVagy) {
            ellHosTamadas(sor5oszlop11Nev,5,11);
        } else if (sor == 4 && oszlop == 11 && sor4oszlop11 && nemVelemVagy) {
            ellHosTamadas(sor4oszlop11Nev,4,11);
        } else if (sor == 3 && oszlop == 11 && sor3oszlop11 && nemVelemVagy) {
            ellHosTamadas(sor3oszlop11Nev,3,11);
        } else if (sor == 2 && oszlop == 11 && sor2oszlop11 && nemVelemVagy) {
            ellHosTamadas(sor2oszlop11Nev,2,11);
        } else if (sor == 1 && oszlop == 11 && sor1oszlop11 && nemVelemVagy) {
            ellHosTamadas(sor1oszlop11Nev,1,11);
        } else if (sor == 10 && oszlop == 12 && sor10oszlop12 && nemVelemVagy) {
            ellHosTamadas(sor10oszlop12Nev,10,12);
        } else if (sor == 9 && oszlop == 12 && sor9oszlop12 && nemVelemVagy) {
            ellHosTamadas(sor9oszlop12Nev,9,12);
        } else if (sor == 8 && oszlop == 12 && sor8oszlop12 && nemVelemVagy) {
            ellHosTamadas(sor8oszlop12Nev,8,12);
        } else if (sor == 7 && oszlop == 12 && sor7oszlop12 && nemVelemVagy) {
            ellHosTamadas(sor7oszlop12Nev,7,12);
        } else if (sor == 6 && oszlop == 12 && sor6oszlop12 && nemVelemVagy) {
            ellHosTamadas(sor6oszlop12Nev,6,12);
        } else if (sor == 5 && oszlop == 12 && sor5oszlop12 && nemVelemVagy) {
            ellHosTamadas(sor5oszlop12Nev,5,12);
        } else if (sor == 4 && oszlop == 12 && sor4oszlop12 && nemVelemVagy) {
            ellHosTamadas(sor4oszlop12Nev,4,12);
        } else if (sor == 3 && oszlop == 12 && sor3oszlop12 && nemVelemVagy) {
            ellHosTamadas(sor3oszlop12Nev,3,12);
        } else if (sor == 2 && oszlop == 12 && sor2oszlop12 && nemVelemVagy) {
            ellHosTamadas(sor2oszlop12Nev,2,12);
        } else if (sor == 1 && oszlop == 12 && sor1oszlop12 && nemVelemVagy) {
            ellHosTamadas(sor1oszlop12Nev,1,12);
        }
    }

    public static void ellHosTamadas(String egyseg, int sor, int oszlop) {

        System.out.println("ellhostamadas:" + egyseg +"   sor"+ sor +"   osz"+ oszlop);

        switch (egyseg) {

            case "foldmuv" -> {
                Eletero.elsoEgysegEletero -= EllenfelTulajdonsaga.ellenfelTamadasa;
                elsoEgysegSzam = Eletero.elsoEgysegEletero / 3;
                if (Eletero.elsoEgysegEletero > 0) {

                    egysegekSorrend.remove(egysegIras1);
                    egysegekSorrend.remove(egysegL1TestKep);

                    if (elsoEgysegSzam < 10) {
                        egysegErtek1.setText(String.valueOf(String.format("%.2f", elsoEgysegSzam)));
                    } else {
                        egysegErtek1.setText(String.valueOf(String.format("%.1f", elsoEgysegSzam)));
                    }

                    informacioErtek.setText("<html><center>" + egysegNeve + " ellenfel hős megtámadta " + egyseg + " egységet,<p> aki " + EllenfelTulajdonsaga.ellenfelTamadasa + " szenvedett " +
                            "és " + Eletero.elsoEgysegEletero + " maradt.</p></center></html>");

                    egysegIras1.add(egysegErtek1);
                    egysegL1TestKep.add(egysegL1TestKepe);
                    EgysegLathatosag.lathatosagSorrend(egysegIras1, egysegL1TestKep, oszlop, sor);
                    ablakCsata.add(egysegekSorrend);
                } else {
                    egysegekSorrend.remove(egysegIras1);
                    egysegekSorrend.remove(egysegL1TestKep);

                    foldmuv = 0;
                    egysegPozTorlese("foldmuv", sor, oszlop);

                    informacioErtek.setText("<html><center>" + egysegNeve + " ellenfel hős megtámadta " + egyseg + " egységet,<p> aki " + EllenfelTulajdonsaga.ellenfelTamadasa + " szenvedett " +
                            "és meghalt.</p></center></html>");
                }
            }
            case "csont" -> {
                Eletero.elsoEgysegEletero -= EllenfelTulajdonsaga.ellenfelTamadasa;
                elsoEgysegSzam = Eletero.elsoEgysegEletero / 2;
                if (Eletero.elsoEgysegEletero > 0) {

                    egysegekSorrend.remove(egysegIras1);
                    egysegekSorrend.remove(egysegL1TestKep);

                    if (elsoEgysegSzam < 10) {
                        egysegErtek1.setText(String.valueOf(String.format("%.2f", elsoEgysegSzam)));
                    } else {
                        egysegErtek1.setText(String.valueOf(String.format("%.1f", elsoEgysegSzam)));
                    }

                    informacioErtek.setText("<html><center>" + egysegNeve + " ellenfel hős megtámadta " + egyseg + " egységet,<p> aki " + EllenfelTulajdonsaga.ellenfelTamadasa + " szenvedett " +
                            "és " + Eletero.elsoEgysegEletero + " maradt.</p></center></html>");

                    egysegIras1.add(egysegErtek1);
                    egysegL1TestKep.add(egysegL1TestKepe);
                    EgysegLathatosag.lathatosagSorrend(egysegIras1, egysegL1TestKep, oszlop, sor);
                    ablakCsata.add(egysegekSorrend);
                } else {
                    egysegekSorrend.remove(egysegIras1);
                    egysegekSorrend.remove(egysegL1TestKep);

                    csont = 0;
                    egysegPozTorlese("csont", sor, oszlop);

                    informacioErtek.setText("<html><center>" + egysegNeve + " ellenfel hős megtámadta " + egyseg + " egységet,<p> aki " + EllenfelTulajdonsaga.ellenfelTamadasa + " szenvedett " +
                            "és meghalt.</p></center></html>");
                }
            }
            case "felder" -> {
                Eletero.masodikEgysegEletero -= EllenfelTulajdonsaga.ellenfelTamadasa;
                masodikEgysegSzam = Eletero.masodikEgysegEletero / 10;
                if (Eletero.masodikEgysegEletero > 0) {

                    egysegekSorrend.remove(egysegIras2);
                    egysegekSorrend.remove(egysegL2TestKep);

                    if (masodikEgysegSzam < 10) {
                        egysegErtek2.setText(String.valueOf(String.format("%.2f", masodikEgysegSzam)));
                    } else {
                        egysegErtek2.setText(String.valueOf(String.format("%.1f", masodikEgysegSzam)));
                    }

                    informacioErtek.setText("<html><center>" + egysegNeve + " ellenfel hős megtámadta " + egyseg + " egységet,<p> aki " + EllenfelTulajdonsaga.ellenfelTamadasa + " szenvedett " +
                            "és " + Eletero.masodikEgysegEletero + " maradt.</p></center></html>");

                    egysegIras2.add(egysegErtek2);
                    egysegL2TestKep.add(egysegL2TestKepe);
                    EgysegLathatosag.lathatosagSorrend(egysegIras2, egysegL2TestKep, oszlop, sor);
                    ablakCsata.add(egysegekSorrend);
                } else {
                    egysegekSorrend.remove(egysegIras2);
                    egysegekSorrend.remove(egysegL2TestKep);

                    felder = 0;
                    egysegPozTorlese("felder", sor, oszlop);

                    informacioErtek.setText("<html><center>" + egysegNeve + " ellenfel hős megtámadta " + egyseg + " egységet,<p> aki " + EllenfelTulajdonsaga.ellenfelTamadasa + " szenvedett " +
                            "és meghalt.</p></center></html>");
                }
            }
            case "ijas" -> {
                Eletero.masodikEgysegEletero -= EllenfelTulajdonsaga.ellenfelTamadasa;
                masodikEgysegSzam = Eletero.masodikEgysegEletero / 7;
                if (Eletero.masodikEgysegEletero > 0) {

                    egysegekSorrend.remove(egysegIras2);
                    egysegekSorrend.remove(egysegL2TestKep);

                    if (masodikEgysegSzam < 10) {
                        egysegErtek2.setText(String.valueOf(String.format("%.2f", masodikEgysegSzam)));
                    } else {
                        egysegErtek2.setText(String.valueOf(String.format("%.1f", masodikEgysegSzam)));
                    }

                    informacioErtek.setText("<html><center>" + egysegNeve + " ellenfel hős megtámadta " + egyseg + " egységet,<p> aki " + EllenfelTulajdonsaga.ellenfelTamadasa + " szenvedett " +
                            "és " + Eletero.masodikEgysegEletero + " maradt.</p></center></html>");
                    System.out.println(EllenfelTulajdonsaga.ellenfelTamadasa+"  "+Eletero.masodikEgysegEletero);

                    egysegIras2.add(egysegErtek2);
                    egysegL2TestKep.add(egysegL2TestKepe);
                    EgysegLathatosag.lathatosagSorrend(egysegIras2, egysegL2TestKep, oszlop, sor);
                    ablakCsata.add(egysegekSorrend);
                } else {
                    egysegekSorrend.remove(egysegIras2);
                    egysegekSorrend.remove(egysegL2TestKep);

                    ijas = 0;
                    egysegPozTorlese("ijas", sor, oszlop);

                    informacioErtek.setText("<html><center>" + egysegNeve + " ellenfel hős megtámadta " + egyseg + " egységet,<p> aki " + EllenfelTulajdonsaga.ellenfelTamadasa + " szenvedett " +
                            "és meghalt.</p></center></html>");
                }
            }
            case "mino" -> {
                Eletero.harmadikEgysegEletero -= EllenfelTulajdonsaga.ellenfelTamadasa;
                harmadikEgysegSzam = Eletero.harmadikEgysegEletero / 80;
                if (Eletero.harmadikEgysegEletero > 0) {

                    egysegekSorrend.remove(egysegIras3);
                    egysegekSorrend.remove(egysegL3TestKep);

                    if (harmadikEgysegSzam < 10) {
                        egysegErtek3.setText(String.valueOf(String.format("%.2f", harmadikEgysegSzam)));
                    } else {
                        egysegErtek3.setText(String.valueOf(String.format("%.1f", harmadikEgysegSzam)));
                    }

                    informacioErtek.setText("<html><center>" + egysegNeve + " ellenfel hős megtámadta " + egyseg + " egységet,<p> aki " + EllenfelTulajdonsaga.ellenfelTamadasa + " szenvedett " +
                            "és " + Eletero.harmadikEgysegEletero + " maradt.</p></center></html>");

                    egysegIras3.add(egysegErtek3);
                    egysegL3TestKep.add(egysegL3TestKepe);
                    EgysegLathatosag.lathatosagSorrend(egysegIras3, egysegL3TestKep, oszlop, sor);
                    ablakCsata.add(egysegekSorrend);
                } else {
                    egysegekSorrend.remove(egysegIras3);
                    egysegekSorrend.remove(egysegL3TestKep);

                    mino = 0;
                    egysegPozTorlese("mino", sor, oszlop);

                    informacioErtek.setText("<html><center>" + egysegNeve + " ellenfel hős megtámadta " + egyseg + " egységet,<p> aki " + EllenfelTulajdonsaga.ellenfelTamadasa + " szenvedett " +
                            "és meghalt.</p></center></html>");
                }
            }
            case "grif" -> {
                Eletero.harmadikEgysegEletero -= EllenfelTulajdonsaga.ellenfelTamadasa;
                harmadikEgysegSzam = Eletero.harmadikEgysegEletero / 30;
                if (Eletero.harmadikEgysegEletero > 0) {

                    egysegekSorrend.remove(egysegIras3);
                    egysegekSorrend.remove(egysegL3TestKep);

                    if (harmadikEgysegSzam < 10) {
                        egysegErtek3.setText(String.valueOf(String.format("%.2f", harmadikEgysegSzam)));
                    } else {
                        egysegErtek3.setText(String.valueOf(String.format("%.1f", harmadikEgysegSzam)));
                    }

                    informacioErtek.setText("<html><center>" + egysegNeve + " ellenfel hős megtámadta " + egyseg + " egységet,<p> aki " + EllenfelTulajdonsaga.ellenfelTamadasa + " szenvedett " +
                            "és " + Eletero.harmadikEgysegEletero + " maradt.</p></center></html>");

                    egysegIras3.add(egysegErtek3);
                    egysegL3TestKep.add(egysegL3TestKepe);
                    EgysegLathatosag.lathatosagSorrend(egysegIras3, egysegL3TestKep, oszlop, sor);
                    ablakCsata.add(egysegekSorrend);
                } else {
                    egysegekSorrend.remove(egysegIras3);
                    egysegekSorrend.remove(egysegL3TestKep);

                    grif = 0;
                    egysegPozTorlese("grif", sor, oszlop);

                    informacioErtek.setText("<html><center>" + egysegNeve + " ellenfel hős megtámadta " + egyseg + " egységet,<p> aki " + EllenfelTulajdonsaga.ellenfelTamadasa + " szenvedett " +
                            "és meghalt.</p></center></html>");
                }
            }
            case "fegyv" -> {
                Eletero.negyedikEgysegEletero -= EllenfelTulajdonsaga.ellenfelTamadasa;
                negyedikEgysegSzam = Eletero.negyedikEgysegEletero / 33;
                if (Eletero.negyedikEgysegEletero > 0) {

                    egysegekSorrend.remove(egysegIras4);
                    egysegekSorrend.remove(egysegL4TestKep);

                    if (negyedikEgysegSzam < 10) {
                        egysegErtek4.setText(String.valueOf(String.format("%.2f", negyedikEgysegSzam)));
                    } else {
                        egysegErtek4.setText(String.valueOf(String.format("%.1f", negyedikEgysegSzam)));
                    }

                    informacioErtek.setText("<html><center>" + egysegNeve + " ellenfel hős megtámadta " + egyseg + " egységet,<p> aki " + EllenfelTulajdonsaga.ellenfelTamadasa + " szenvedett " +
                            "és " + Eletero.negyedikEgysegEletero + " maradt.</p></center></html>");

                    egysegIras4.add(egysegErtek4);
                    egysegL4TestKep.add(egysegL4TestKepe);
                    EgysegLathatosag.lathatosagSorrend(egysegIras4, egysegL4TestKep, oszlop, sor);
                    ablakCsata.add(egysegekSorrend);
                } else {
                    egysegekSorrend.remove(egysegIras4);
                    egysegekSorrend.remove(egysegL4TestKep);

                    fegyv = 0;
                    egysegPozTorlese("fegyv", sor, oszlop);

                    informacioErtek.setText("<html><center>" + egysegNeve + " ellenfel hős megtámadta " + egyseg + " egységet,<p> aki " + EllenfelTulajdonsaga.ellenfelTamadasa + " szenvedett " +
                            "és meghalt.</p></center></html>");
                }
            }
            case "orgy" -> {
                Eletero.negyedikEgysegEletero -= EllenfelTulajdonsaga.ellenfelTamadasa;
                negyedikEgysegSzam = Eletero.negyedikEgysegEletero / 20;
                if (Eletero.negyedikEgysegEletero > 0) {

                    egysegekSorrend.remove(egysegIras4);
                    egysegekSorrend.remove(egysegL4TestKep);

                    if (negyedikEgysegSzam < 10) {
                        egysegErtek4.setText(String.valueOf(String.format("%.2f", negyedikEgysegSzam)));
                    } else {
                        egysegErtek4.setText(String.valueOf(String.format("%.1f", negyedikEgysegSzam)));
                    }

                    informacioErtek.setText("<html><center>" + egysegNeve + " ellenfel hős megtámadta " + egyseg + " egységet,<p> aki " + EllenfelTulajdonsaga.ellenfelTamadasa + " szenvedett " +
                            "és " + Eletero.negyedikEgysegEletero + " maradt.</p></center></html>");

                    egysegIras4.add(egysegErtek4);
                    egysegL4TestKep.add(egysegL4TestKepe);
                    EgysegLathatosag.lathatosagSorrend(egysegIras4, egysegL4TestKep, oszlop, sor);
                    ablakCsata.add(egysegekSorrend);
                } else {
                    egysegekSorrend.remove(egysegIras4);
                    egysegekSorrend.remove(egysegL4TestKep);

                    orgy = 0;
                    egysegPozTorlese("orgy", sor, oszlop);

                    informacioErtek.setText("<html><center>" + egysegNeve + " ellenfel hős megtámadta " + egyseg + " egységet,<p> aki " + EllenfelTulajdonsaga.ellenfelTamadasa + " szenvedett " +
                            "és meghalt.</p></center></html>");
                }
            }
            case "harcp" -> {
                Eletero.otodikEgysegEletero -= EllenfelTulajdonsaga.ellenfelTamadasa;
                otodikEgysegSzam = Eletero.otodikEgysegEletero / 54;
                if (Eletero.otodikEgysegEletero > 0) {

                    egysegekSorrend.remove(egysegIras5);
                    egysegekSorrend.remove(egysegL5TestKep);

                    if (otodikEgysegSzam < 10) {
                        egysegErtek5.setText(String.valueOf(String.format("%.2f", otodikEgysegSzam)));
                    } else {
                        egysegErtek5.setText(String.valueOf(String.format("%.1f", otodikEgysegSzam)));
                    }

                    informacioErtek.setText("<html><center>" + egysegNeve + " ellenfel hős megtámadta " + egyseg + " egységet,<p> aki " + EllenfelTulajdonsaga.ellenfelTamadasa + " szenvedett " +
                            "és " + Eletero.otodikEgysegEletero + " maradt.</p></center></html>");

                    egysegIras5.add(egysegErtek5);
                    egysegL5TestKep.add(egysegL5TestKepe);
                    EgysegLathatosag.lathatosagSorrend(egysegIras5, egysegL5TestKep, oszlop, sor);
                    ablakCsata.add(egysegekSorrend);
                } else {
                    egysegekSorrend.remove(egysegIras5);
                    egysegekSorrend.remove(egysegL5TestKep);

                    harcp = 0;
                    egysegPozTorlese("harcp", sor, oszlop);

                    informacioErtek.setText("<html><center>" + egysegNeve + " ellenfel hős megtámadta " + egyseg + " egységet,<p> aki " + EllenfelTulajdonsaga.ellenfelTamadasa + " szenvedett " +
                            "és meghalt.</p></center></html>");
                }
            }
            case "rapt" -> {
                Eletero.otodikEgysegEletero -= EllenfelTulajdonsaga.ellenfelTamadasa;
                otodikEgysegSzam = Eletero.otodikEgysegEletero / 35;
                if (Eletero.otodikEgysegEletero > 0) {

                    egysegekSorrend.remove(egysegIras5);
                    egysegekSorrend.remove(egysegL5TestKep);

                    if (otodikEgysegSzam < 10) {
                        egysegErtek5.setText(String.valueOf(String.format("%.2f", otodikEgysegSzam)));
                    } else {
                        egysegErtek5.setText(String.valueOf(String.format("%.1f", otodikEgysegSzam)));
                    }

                    informacioErtek.setText("<html><center>" + egysegNeve + " ellenfel hős megtámadta " + egyseg + " egységet,<p> aki " + EllenfelTulajdonsaga.ellenfelTamadasa + " szenvedett " +
                            "és " + Eletero.otodikEgysegEletero + " maradt.</p></center></html>");

                    egysegIras5.add(egysegErtek5);
                    egysegL5TestKep.add(egysegL5TestKepe);
                    EgysegLathatosag.lathatosagSorrend(egysegIras5, egysegL5TestKep, oszlop, sor);
                    ablakCsata.add(egysegekSorrend);
                } else {
                    egysegekSorrend.remove(egysegIras5);
                    egysegekSorrend.remove(egysegL5TestKep);

                    rapt = 0;
                    egysegPozTorlese("rapt", sor, oszlop);

                    informacioErtek.setText("<html><center>" + egysegNeve + " ellenfel hős megtámadta " + egyseg + " egységet,<p> aki " + EllenfelTulajdonsaga.ellenfelTamadasa + " szenvedett " +
                            "és meghalt.</p></center></html>");
                }
            }
        }
        double ujErtek2 = moralSorrendTList.get(mutatoEll);

        moralSorrendTList.remove(mutatoEll);
        moralSorrendTList.add(ujErtek2);

        hanyadikKor(elsoHely); 
        korokKiirasa();

        sorrendFrissites();
    }
}