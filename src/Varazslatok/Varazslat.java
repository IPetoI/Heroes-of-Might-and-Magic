package Varazslatok;

import javax.swing.*;
import java.awt.*;

import static Jatek.JatekAblak.*;
import static Jatek.JatekAblak.hosTuzlabdaGombBenyomva;
import static Jatek.Palya_Lepes.*;
import static Jatek.Palya_Lepes.palyaS10O12;
import static Jatek.Sorrend.*;
import static Jatek.Sorrend.szurkes;
import static Jatek.XYKordinatakBemenet.*;
import static Jatek.XYKordinatakBemenet.sor1oszlop12Nev;
import static Varazslatok.Feltamasztas.feltamasztas;
import static Varazslatok.IsteniEro.isteniEro;
import static Varazslatok.Lassitas.lassitas;
import static Varazslatok.Tuzlabda.tuzlabda;
import static Varazslatok.Villamcsapas.villamcsapas;

public class Varazslat {

        public static JPanel nevVarazslat = new JPanel();
        public static JLabel nevVarazslatErtek = new JLabel();

        public static Font font = new Font("Arial", Font.BOLD, 20);


       public static void varazslatai() {

           nevVarazslatErtek.setFont(font);

           nevVarazslat.setBounds(920,390,330,130);

           nevVarazslatErtek.setText("<html><u>Tűzvarázslat:</u><p>    Egy területet kiválasztva</p><p> " +
                   "3x3 körben saját és ellenséges</p><p> egységeket sebez (varázserő * 20)</p>" +
                   "<p><u>Manna költsége: 9</u></p></html>");

           new Tuzlabda();
           new Villamcsapas();
           new Lassitas();
           new IsteniEro();
           new Feltamasztas();
           feltamasztas();
           isteniEro();
           lassitas();
           villamcsapas();
           tuzlabda();
       }

    public static void ellenfelekMegjelolese() {
        int sor=0;
        int oszlop;

        for (int i=0;i<10;i++) {
            sor++;

            oszlop=0;
            for (int j=0;j<12;j++) {
                oszlop++;

                if (oszlop== regiPozOszlop && sor==regiPozSor) {
                    continue;
                }

                if (sor == 10 && oszlop == 1 && sor10oszlop1) {
                    ellenemVagyMegjelol(sor10oszlop1Nev,10,1);
                } else if (sor == 10 && oszlop == 2 && sor10oszlop2) {
                    ellenemVagyMegjelol(sor10oszlop2Nev,10,2);
                } else if (sor == 9 && oszlop == 1 && sor9oszlop1) {
                    ellenemVagyMegjelol( sor9oszlop1Nev,9,1);
                } else if (sor == 9 && oszlop == 2 && sor9oszlop2) {
                    ellenemVagyMegjelol( sor9oszlop2Nev,9,2);
                } else if (sor == 8 && oszlop == 1 && sor8oszlop1) {
                    ellenemVagyMegjelol( sor8oszlop1Nev,8,1);
                } else if (sor == 8 && oszlop == 2 && sor8oszlop2) {
                    ellenemVagyMegjelol( sor8oszlop2Nev,8,2);
                } else if (sor == 7 && oszlop == 1 && sor7oszlop1) {
                    ellenemVagyMegjelol( sor7oszlop1Nev,7,1);
                } else if (sor == 7 && oszlop == 2 && sor7oszlop2) {
                    ellenemVagyMegjelol( sor7oszlop2Nev,7,2);
                } else if (sor == 6 && oszlop == 1 && sor6oszlop1) {
                    ellenemVagyMegjelol( sor6oszlop1Nev,6,1);
                } else if (sor == 6 && oszlop == 2 && sor6oszlop2) {
                    ellenemVagyMegjelol( sor6oszlop2Nev,6,2);
                } else if (sor == 5 && oszlop == 1 && sor5oszlop1) {
                    ellenemVagyMegjelol( sor5oszlop1Nev,5,1);
                } else if (sor == 5 && oszlop == 2 && sor5oszlop2) {
                    ellenemVagyMegjelol( sor5oszlop2Nev,5,2);
                } else if (sor == 4 && oszlop == 1 && sor4oszlop1) {
                    ellenemVagyMegjelol( sor4oszlop1Nev,4,1);
                } else if (sor == 4 && oszlop == 2 && sor4oszlop2) {
                    ellenemVagyMegjelol( sor4oszlop2Nev,4,2);
                } else if (sor == 3 && oszlop == 1 && sor3oszlop1) {
                    ellenemVagyMegjelol( sor3oszlop1Nev,3,1);
                } else if (sor == 3 && oszlop == 2 && sor3oszlop2) {
                    ellenemVagyMegjelol( sor3oszlop2Nev,3,2);
                } else if (sor == 2 && oszlop == 1 && sor2oszlop1) {
                    ellenemVagyMegjelol( sor2oszlop1Nev,2,1);
                } else if (sor == 2 && oszlop == 2 && sor2oszlop2) {
                    ellenemVagyMegjelol( sor2oszlop2Nev,2,2);
                } else if (sor == 1 && oszlop == 1 && sor1oszlop1) {
                    ellenemVagyMegjelol( sor1oszlop1Nev,1,1);
                } else if (sor == 1 && oszlop == 2 && sor1oszlop2) {
                    ellenemVagyMegjelol( sor1oszlop2Nev,1,2);
                } else if (sor == 8 && oszlop == 3 && sor8oszlop3) {
                    ellenemVagyMegjelol( sor8oszlop3Nev,8,3);
                } else if (sor == 7 && oszlop == 3 && sor7oszlop3) {
                    ellenemVagyMegjelol( sor7oszlop3Nev,7,3);
                } else if (sor == 6 && oszlop == 3 && sor6oszlop3) {
                    ellenemVagyMegjelol( sor6oszlop3Nev,6,3);
                } else if (sor == 5 && oszlop == 3 && sor5oszlop3) {
                    ellenemVagyMegjelol( sor5oszlop3Nev,5,3);
                } else if (sor == 4 && oszlop == 3 && sor4oszlop3) {
                    ellenemVagyMegjelol( sor4oszlop3Nev,4,3);
                } else if (sor == 3 && oszlop == 3 && sor3oszlop3) {
                    ellenemVagyMegjelol( sor3oszlop3Nev,3,3);
                } else if (sor == 2 && oszlop == 3 && sor2oszlop3) {
                    ellenemVagyMegjelol( sor2oszlop3Nev,2,3);
                } else if (sor == 1 && oszlop == 3 && sor1oszlop3) {
                    ellenemVagyMegjelol( sor1oszlop3Nev,1,3);
                } else if (sor == 8 && oszlop == 4 && sor8oszlop4) {
                    ellenemVagyMegjelol( sor8oszlop4Nev,8,4);
                } else if (sor == 7 && oszlop == 4 && sor7oszlop4) {
                    ellenemVagyMegjelol( sor7oszlop4Nev,7,4);
                } else if (sor == 5 && oszlop == 4 && sor5oszlop4) {
                    ellenemVagyMegjelol( sor5oszlop4Nev,5,4);
                } else if (sor == 4 && oszlop == 4 && sor4oszlop4) {
                    ellenemVagyMegjelol( sor4oszlop4Nev,4,4);
                } else if (sor == 3 && oszlop == 4 && sor3oszlop4) {
                    ellenemVagyMegjelol( sor3oszlop4Nev,3,4);
                } else if (sor == 2 && oszlop == 4 && sor2oszlop4) {
                    ellenemVagyMegjelol( sor2oszlop4Nev,2,4);
                } else if (sor == 1 && oszlop == 4 && sor1oszlop4) {
                    ellenemVagyMegjelol( sor1oszlop4Nev,1,4);
                } else if (sor == 10 && oszlop == 5 && sor10oszlop5) {
                    ellenemVagyMegjelol(sor10oszlop5Nev,10,5);
                } else if (sor == 9 && oszlop == 5 && sor9oszlop5) {
                    ellenemVagyMegjelol( sor9oszlop5Nev,9,5);
                } else if (sor == 8 && oszlop == 5 && sor8oszlop5) {
                    ellenemVagyMegjelol( sor8oszlop5Nev,8,5);
                } else if (sor == 7 && oszlop == 5 && sor7oszlop5) {
                    ellenemVagyMegjelol( sor7oszlop5Nev,7,5);
                } else if (sor == 6 && oszlop == 5 && sor6oszlop5) {
                    ellenemVagyMegjelol( sor6oszlop5Nev,6,5);
                } else if (sor == 5 && oszlop == 5 && sor5oszlop5) {
                    ellenemVagyMegjelol( sor5oszlop5Nev,5,5);
                } else if (sor == 4 && oszlop == 5 && sor4oszlop5) {
                    ellenemVagyMegjelol( sor4oszlop5Nev,4,5);
                } else if (sor == 3 && oszlop == 5 && sor3oszlop5) {
                    ellenemVagyMegjelol( sor3oszlop5Nev,3,5);
                } else if (sor == 2 && oszlop == 5 && sor2oszlop5) {
                    ellenemVagyMegjelol( sor2oszlop5Nev,2,5);
                } else if (sor == 1 && oszlop == 5 && sor1oszlop5) {
                    ellenemVagyMegjelol( sor1oszlop5Nev,1,5);
                } else if (sor == 10 && oszlop == 6 && sor10oszlop6) {
                    ellenemVagyMegjelol(sor10oszlop6Nev,10,6);
                } else if (sor == 9 && oszlop == 6 && sor9oszlop6) {
                    ellenemVagyMegjelol( sor9oszlop6Nev,9,6);
                } else if (sor == 7 && oszlop == 6 && sor7oszlop6) {
                    ellenemVagyMegjelol( sor7oszlop6Nev,7,6);
                } else if (sor == 6 && oszlop == 6 && sor6oszlop6) {
                    ellenemVagyMegjelol( sor6oszlop6Nev,6,6);
                } else if (sor == 5 && oszlop == 6 && sor5oszlop6) {
                    ellenemVagyMegjelol( sor5oszlop6Nev,5,6);
                } else if (sor == 4 && oszlop == 6 && sor4oszlop6) {
                    ellenemVagyMegjelol( sor4oszlop6Nev,4,6);
                } else if (sor == 3 && oszlop == 6 && sor3oszlop6) {
                    ellenemVagyMegjelol( sor3oszlop6Nev,3,6);
                } else if (sor == 2 && oszlop == 6 && sor2oszlop6) {
                    ellenemVagyMegjelol( sor2oszlop6Nev,2,6);
                } else if (sor == 1 && oszlop == 6 && sor1oszlop6) {
                    ellenemVagyMegjelol( sor1oszlop6Nev,1,6);
                } else if (sor == 10 && oszlop == 7 && sor10oszlop7) {
                    ellenemVagyMegjelol(sor10oszlop7Nev,10,7);
                } else if (sor == 9 && oszlop == 7 && sor9oszlop7) {
                    ellenemVagyMegjelol( sor9oszlop7Nev,9,7);
                } else if (sor == 7 && oszlop == 7 && sor7oszlop7) {
                    ellenemVagyMegjelol( sor7oszlop7Nev,7,7);
                } else if (sor == 6 && oszlop == 7 && sor6oszlop7) {
                    ellenemVagyMegjelol( sor6oszlop7Nev,6,7);
                } else if (sor == 5 && oszlop == 7 && sor5oszlop7) {
                    ellenemVagyMegjelol( sor5oszlop7Nev,5,7);
                } else if (sor == 4 && oszlop == 7 && sor4oszlop7) {
                    ellenemVagyMegjelol( sor4oszlop7Nev,4,7);
                } else if (sor == 3 && oszlop == 7 && sor3oszlop7) {
                    ellenemVagyMegjelol( sor3oszlop7Nev,3,7);
                } else if (sor == 2 && oszlop == 7 && sor2oszlop7) {
                    ellenemVagyMegjelol( sor2oszlop7Nev,2,7);
                } else if (sor == 1 && oszlop == 7 && sor1oszlop7) {
                    ellenemVagyMegjelol( sor1oszlop7Nev,1,7);
                } else if (sor == 10 && oszlop == 8 && sor10oszlop8) {
                    ellenemVagyMegjelol(sor10oszlop8Nev,10,8);
                } else if (sor == 9 && oszlop == 8 && sor9oszlop8) {
                    ellenemVagyMegjelol( sor9oszlop8Nev,9,8);
                } else if (sor == 8 && oszlop == 8 && sor8oszlop8) {
                    ellenemVagyMegjelol( sor8oszlop8Nev,8,8);
                } else if (sor == 6 && oszlop == 8 && sor6oszlop8) {
                    ellenemVagyMegjelol( sor6oszlop8Nev,6,8);
                } else if (sor == 5 && oszlop == 8 && sor5oszlop8) {
                    ellenemVagyMegjelol( sor5oszlop8Nev,5,8);
                } else if (sor == 4 && oszlop == 8 && sor4oszlop8) {
                    ellenemVagyMegjelol( sor4oszlop8Nev,4,8);
                } else if (sor == 3 && oszlop == 8 && sor3oszlop8) {
                    ellenemVagyMegjelol( sor3oszlop8Nev,3,8);
                } else if (sor == 2 && oszlop == 8 && sor2oszlop8) {
                    ellenemVagyMegjelol( sor2oszlop8Nev,2,8);
                } else if (sor == 1 && oszlop == 8 && sor1oszlop8) {
                    ellenemVagyMegjelol( sor1oszlop8Nev,1,8);
                } else if (sor == 10 && oszlop == 9 && sor10oszlop9) {
                    ellenemVagyMegjelol(sor10oszlop9Nev,10,9);
                } else if (sor == 9 && oszlop == 9 && sor9oszlop9) {
                    ellenemVagyMegjelol( sor9oszlop9Nev,9,9);
                } else if (sor == 8 && oszlop == 9 && sor8oszlop9) {
                    ellenemVagyMegjelol( sor8oszlop9Nev,8,9);
                } else if (sor == 6 && oszlop == 9 && sor6oszlop9) {
                    ellenemVagyMegjelol( sor6oszlop9Nev,6,9);
                } else if (sor == 5 && oszlop == 9 && sor5oszlop9) {
                    ellenemVagyMegjelol( sor5oszlop9Nev,5,9);
                } else if (sor == 4 && oszlop == 9 && sor4oszlop9) {
                    ellenemVagyMegjelol( sor4oszlop9Nev,4,9);
                } else if (sor == 3 && oszlop == 9 && sor3oszlop9) {
                    ellenemVagyMegjelol( sor3oszlop9Nev,3,9);
                } else if (sor == 2 && oszlop == 9 && sor2oszlop9) {
                    ellenemVagyMegjelol( sor2oszlop9Nev,2,9);
                } else if (sor == 1 && oszlop == 9 && sor1oszlop9) {
                    ellenemVagyMegjelol( sor1oszlop9Nev,1,9);
                } else if (sor == 10 && oszlop == 10 && sor10oszlop10) {
                    ellenemVagyMegjelol(sor10oszlop10Nev,10,10);
                } else if (sor == 9 && oszlop == 10 && sor9oszlop10) {
                    ellenemVagyMegjelol(sor9oszlop10Nev,9,10);
                } else if (sor == 8 && oszlop == 10 && sor8oszlop10) {
                    ellenemVagyMegjelol(sor8oszlop10Nev,8,10);
                } else if (sor == 7 && oszlop == 10 && sor7oszlop10) {
                    ellenemVagyMegjelol(sor7oszlop10Nev,7,10);
                } else if (sor == 6 && oszlop == 10 && sor6oszlop10) {
                    ellenemVagyMegjelol(sor6oszlop10Nev,6,10);
                } else if (sor == 5 && oszlop == 10 && sor5oszlop10) {
                    ellenemVagyMegjelol(sor5oszlop10Nev,5,10);
                } else if (sor == 4 && oszlop == 10 && sor4oszlop10) {
                    ellenemVagyMegjelol(sor4oszlop10Nev,4,10);
                } else if (sor == 3 && oszlop == 10 && sor3oszlop10) {
                    ellenemVagyMegjelol(sor3oszlop10Nev,3,10);
                } else if (sor == 2 && oszlop == 10 && sor2oszlop10) {
                    ellenemVagyMegjelol(sor2oszlop10Nev,2,10);
                } else if (sor == 1 && oszlop == 10 && sor1oszlop10) {
                    ellenemVagyMegjelol(sor1oszlop10Nev,1,10);
                } else if (sor == 10 && oszlop == 11 && sor10oszlop11) {
                    ellenemVagyMegjelol(sor10oszlop11Nev,10,11);
                } else if (sor == 9 && oszlop == 11 && sor9oszlop11) {
                    ellenemVagyMegjelol(sor9oszlop11Nev,9,11);
                } else if (sor == 8 && oszlop == 11 && sor8oszlop11) {
                    ellenemVagyMegjelol(sor8oszlop11Nev,8,11);
                } else if (sor == 7 && oszlop == 11 && sor7oszlop11) {
                    ellenemVagyMegjelol(sor7oszlop11Nev,7,11);
                } else if (sor == 6 && oszlop == 11 && sor6oszlop11) {
                    ellenemVagyMegjelol(sor6oszlop11Nev,6,11);
                } else if (sor == 5 && oszlop == 11 && sor5oszlop11) {
                    ellenemVagyMegjelol(sor5oszlop11Nev,5,11);
                } else if (sor == 4 && oszlop == 11 && sor4oszlop11) {
                    ellenemVagyMegjelol(sor4oszlop11Nev,4,11);
                } else if (sor == 3 && oszlop == 11 && sor3oszlop11) {
                    ellenemVagyMegjelol(sor3oszlop11Nev,3,11);
                } else if (sor == 2 && oszlop == 11 && sor2oszlop11) {
                    ellenemVagyMegjelol(sor2oszlop11Nev,2,11);
                } else if (sor == 1 && oszlop == 11 && sor1oszlop11) {
                    ellenemVagyMegjelol(sor1oszlop11Nev,1,11);
                } else if (sor == 10 && oszlop == 12 && sor10oszlop12) {
                    ellenemVagyMegjelol(sor10oszlop12Nev,10,12);
                } else if (sor == 9 && oszlop == 12 && sor9oszlop12) {
                    ellenemVagyMegjelol(sor9oszlop12Nev,9,12);
                } else if (sor == 8 && oszlop == 12 && sor8oszlop12) {
                    ellenemVagyMegjelol(sor8oszlop12Nev,8,12);
                } else if (sor == 7 && oszlop == 12 && sor7oszlop12) {
                    ellenemVagyMegjelol(sor7oszlop12Nev,7,12);
                } else if (sor == 6 && oszlop == 12 && sor6oszlop12) {
                    ellenemVagyMegjelol(sor6oszlop12Nev,6,12);
                } else if (sor == 5 && oszlop == 12 && sor5oszlop12) {
                    ellenemVagyMegjelol(sor5oszlop12Nev,5,12);
                } else if (sor == 4 && oszlop == 12 && sor4oszlop12) {
                    ellenemVagyMegjelol(sor4oszlop12Nev,4,12);
                } else if (sor == 3 && oszlop == 12 && sor3oszlop12) {
                    ellenemVagyMegjelol(sor3oszlop12Nev,3,12);
                } else if (sor == 2 && oszlop == 12 && sor2oszlop12) {
                    ellenemVagyMegjelol(sor2oszlop12Nev,2,12);
                } else if (sor == 1 && oszlop == 12 && sor1oszlop12) {
                    ellenemVagyMegjelol(sor1oszlop12Nev,1,12);
                }
            }
        }
    }

    public static void ellenemVagyMegjelol(String egyseg, int sor, int oszlop) {

        if (egyseg.charAt(0)=='e') {
            szinezesEll(sor,oszlop);
        }


        if (egyseg.charAt(0)!='e'){
            szinezes(sor,oszlop);
        }
    }

    public static void szinezesEll(int regiPozSorLass, int regiPozOszlopLass) {

        int poz=Integer.parseInt(String.valueOf(regiPozSorLass) + String.valueOf(regiPozOszlopLass));

        if (poz==11) {
            palyaS1O1.setBorderPainted(true);
            palyaS1O1.setIcon(szurkes);
            if (hosVillamcsapasGombBenyomva) {
                palyaS1O1.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS1O1.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS1O1.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS1O1.setBorderPainted(false);
                  palyaS1O1.setIcon(lathatatlan);
            }
        }
        if (poz==12) {
            palyaS1O2.setBorderPainted(true);
            palyaS1O2.setIcon(szurkes);
            palyaS1O2.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS1O2.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS1O2.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS1O2.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS1O2.setIcon(lathatatlan);
                  palyaS1O2.setIcon(lathatatlan);
            }
        }
        if (poz==13) {
            palyaS1O3.setBorderPainted(true);
            palyaS1O3.setIcon(szurkes);
            palyaS1O3.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS1O3.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS1O3.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS1O3.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS1O3.setBorderPainted(false);
                palyaS1O3.setIcon(lathatatlan);
            }
        }
        if (poz==14) {
            palyaS1O4.setBorderPainted(true);
            palyaS1O4.setIcon(szurkes);
            palyaS1O4.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS1O4.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS1O4.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS1O4.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS1O4.setBorderPainted(false);
                  palyaS1O4.setIcon(lathatatlan);
            }
        }
        if (poz==15) {
            palyaS1O5.setBorderPainted(true);
            palyaS1O5.setIcon(szurkes);
            palyaS1O5.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS1O5.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS1O5.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS1O5.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS1O5.setBorderPainted(false);
                  palyaS1O5.setIcon(lathatatlan);
            }
        }
        if (poz==16) {
            palyaS1O6.setBorderPainted(true);
            palyaS1O6.setIcon(szurkes);
            palyaS1O6.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS1O6.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS1O6.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS1O6.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS1O6.setBorderPainted(false);
                  palyaS1O6.setIcon(lathatatlan);
            }
        }
        if (poz==17) {
            palyaS1O7.setBorderPainted(true);
            palyaS1O7.setIcon(szurkes);
            palyaS1O7.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS1O7.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS1O7.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS1O7.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS1O7.setBorderPainted(false);
                  palyaS1O7.setIcon(lathatatlan);
            }
        }
        if (poz==18) {
            palyaS1O8.setBorderPainted(true);
            palyaS1O8.setIcon(szurkes);
            palyaS1O8.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS1O8.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS1O8.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS1O8.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS1O8.setBorderPainted(false);
                  palyaS1O8.setIcon(lathatatlan);
            }
        }
        if (poz==19) {
            palyaS1O9.setBorderPainted(true);
            palyaS1O9.setIcon(szurkes);
            palyaS1O9.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS1O9.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS1O9.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS1O9.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS1O9.setBorderPainted(false);
                  palyaS1O9.setIcon(lathatatlan);
            }
        }
        if (poz==110 ) {
            palyaS1O10.setBorderPainted(true);
            palyaS1O10.setIcon(szurkes);
            palyaS1O10.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS1O10.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS1O10.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS1O10.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS1O10.setBorderPainted(false);
                 palyaS1O10.setIcon(lathatatlan);
            }
        }
        if (poz==111 ) {
            palyaS1O11.setBorderPainted(true);
            palyaS1O11.setIcon(szurkes);
            palyaS1O11.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS1O11.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS1O11.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS1O11.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS1O11.setBorderPainted(false);
                 palyaS1O11.setIcon(lathatatlan);
            }
        }
        if (poz==112 ) {
            palyaS1O12.setBorderPainted(true);
            palyaS1O12.setIcon(szurkes);
            palyaS1O12.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS1O12.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS1O12.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS1O12.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS1O12.setBorderPainted(false);
                palyaS1O12.setIcon(lathatatlan);
            }
        }


        if (poz==21) {
            palyaS2O1.setBorderPainted(true);
            palyaS2O1.setIcon(szurkes);
            palyaS2O1.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS2O1.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS2O1.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS2O1.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS2O1.setBorderPainted(false);
                  palyaS2O1.setIcon(lathatatlan);
            }
        }
        if (poz==22) {
            palyaS2O2.setBorderPainted(true);
            palyaS2O2.setIcon(szurkes);
            palyaS2O2.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS2O2.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS2O2.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS2O2.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS2O2.setBorderPainted(false);
                  palyaS2O2.setIcon(lathatatlan);
            }
        }
        if (poz==23) {
            palyaS2O3.setBorderPainted(true);
            palyaS2O3.setIcon(szurkes);
            palyaS2O3.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS2O3.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS2O3.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS2O3.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS2O3.setBorderPainted(false);
                  palyaS2O3.setIcon(lathatatlan);
            }
        }
        if (poz==24) {
            palyaS2O4.setBorderPainted(true);
            palyaS2O4.setIcon(szurkes);
            palyaS2O4.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS2O4.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS2O4.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS2O4.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS2O4.setBorderPainted(false);
                  palyaS2O4.setIcon(lathatatlan);
            }
        }
        if (poz==25) {
            palyaS2O5.setBorderPainted(true);
            palyaS2O5.setIcon(szurkes);
            palyaS2O5.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS2O5.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS2O5.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS2O5.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS2O5.setBorderPainted(false);
                  palyaS2O5.setIcon(lathatatlan);
            }
        }
        if (poz==26) {
            palyaS2O6.setBorderPainted(true);
            palyaS2O6.setIcon(szurkes);
            palyaS2O6.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS2O6.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS2O6.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS2O6.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS2O6.setBorderPainted(false);
                palyaS2O6.setIcon(lathatatlan);
            }
        }
        if (poz==27) {
            palyaS2O7.setBorderPainted(true);
            palyaS2O7.setIcon(szurkes);
            palyaS2O7.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS2O7.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS2O7.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS2O7.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS2O7.setBorderPainted(false);
                palyaS2O7.setIcon(lathatatlan);
            }
        }
        if (poz==28) {
            palyaS2O8.setBorderPainted(true);
            palyaS2O8.setIcon(szurkes);
            palyaS2O8.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS2O8.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS2O8.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS2O8.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS2O8.setBorderPainted(false);
                  palyaS2O8.setIcon(lathatatlan);
            }
        }
        if (poz==29) {
            palyaS2O9.setBorderPainted(true);
            palyaS2O9.setIcon(szurkes);
            palyaS2O9.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS2O9.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS2O9.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS2O9.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS2O9.setBorderPainted(false);
                  palyaS2O9.setIcon(lathatatlan);
            }
        }
        if (poz==210 ) {
            palyaS2O10.setBorderPainted(true);
            palyaS2O10.setIcon(szurkes);
            palyaS2O10.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS2O10.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS2O10.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS2O10.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS2O10.setBorderPainted(false);
                palyaS2O10.setIcon(lathatatlan);
            }
        }
        if (poz==211 ) {
            palyaS2O11.setBorderPainted(true);
            palyaS2O11.setIcon(szurkes);
            palyaS2O11.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS2O11.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS2O11.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS2O11.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS2O11.setBorderPainted(false);
                 palyaS2O11.setIcon(lathatatlan);
            }
        }
        if (poz==212 ) {
            palyaS2O12.setBorderPainted(true);
            palyaS2O12.setIcon(szurkes);
            palyaS2O12.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS2O12.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS2O12.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS2O12.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS2O12.setBorderPainted(false);
                 palyaS2O12.setIcon(lathatatlan);
            }
        }


        if (poz==31) {
            palyaS3O1.setBorderPainted(true);
            palyaS3O1.setIcon(szurkes);
            palyaS3O1.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS3O1.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS3O1.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS3O1.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS3O1.setBorderPainted(false);
                  palyaS3O1.setIcon(lathatatlan);
            }
        }
        if (poz==32) {
            palyaS3O2.setBorderPainted(true);
            palyaS3O2.setIcon(szurkes);
            palyaS3O2.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS3O2.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS3O2.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS3O2.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS3O2.setBorderPainted(false);
                  palyaS3O2.setIcon(lathatatlan);
            }
        }
        if (poz==33) {
            palyaS3O3.setBorderPainted(true);
            palyaS3O3.setIcon(szurkes);
            palyaS3O3.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS3O3.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS3O3.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS3O3.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS3O3.setBorderPainted(false);
                  palyaS3O3.setIcon(lathatatlan);
            }
        }
        if (poz==34) {
            palyaS3O4.setBorderPainted(true);
            palyaS3O4.setIcon(szurkes);
            palyaS3O4.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS3O4.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS3O4.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS3O4.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS3O4.setBorderPainted(false);
                  palyaS3O4.setIcon(lathatatlan);
            }
        }
        if (poz==35) {
            palyaS3O5.setBorderPainted(true);
            palyaS3O5.setIcon(szurkes);
            palyaS3O5.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS3O5.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS3O5.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS3O5.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS3O5.setBorderPainted(false);
                  palyaS3O5.setIcon(lathatatlan);
            }
        }
        if (poz==36) {
            palyaS3O6.setBorderPainted(true);
            palyaS3O6.setIcon(szurkes);
            palyaS3O6.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS3O6.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS3O6.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS3O6.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS3O6.setBorderPainted(false);
                  palyaS3O6.setIcon(lathatatlan);
            }
        }
        if (poz==37) {
            palyaS3O7.setBorderPainted(true);
            palyaS3O7.setIcon(szurkes);
            palyaS3O7.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS3O7.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS3O7.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS3O7.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS3O7.setBorderPainted(false);
                  palyaS3O7.setIcon(lathatatlan);
            }
        }
        if (poz==38) {
            palyaS3O8.setBorderPainted(true);
            palyaS3O8.setIcon(szurkes);
            palyaS3O8.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS3O8.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS3O8.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS3O8.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS3O8.setBorderPainted(false);
                  palyaS3O8.setIcon(lathatatlan);
            }
        }
        if (poz==39) {
            palyaS3O9.setBorderPainted(true);
            palyaS3O9.setIcon(szurkes);
            palyaS3O9.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS3O9.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS3O9.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS3O9.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS3O9.setBorderPainted(false);
                  palyaS3O9.setIcon(lathatatlan);
            }
        }
        if (poz==310 ) {
            palyaS3O10.setBorderPainted(true);
            palyaS3O10.setIcon(szurkes);
            palyaS3O10.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS3O10.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS3O10.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS3O10.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS3O10.setBorderPainted(false);
                 palyaS3O10.setIcon(lathatatlan);
            }
        }
        if (poz==311 ) {
            palyaS3O11.setBorderPainted(true);
            palyaS3O11.setIcon(szurkes);
            palyaS3O11.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS3O11.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS3O11.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS3O11.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS3O11.setBorderPainted(false);
                 palyaS3O11.setIcon(lathatatlan);
            }
        }
        if (poz==312 ) {
            palyaS3O12.setBorderPainted(true);
            palyaS3O12.setIcon(szurkes);
            palyaS3O12.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS3O12.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS3O12.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS3O12.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS3O12.setBorderPainted(false);
                 palyaS3O12.setIcon(lathatatlan);
            }
        }


        if (poz==41) {
            palyaS4O1.setBorderPainted(true);
            palyaS4O1.setIcon(szurkes);
            palyaS4O1.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS4O1.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS4O1.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS4O1.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS4O1.setBorderPainted(false);
                  palyaS4O1.setIcon(lathatatlan);
            }
        }
        if (poz==42) {
            palyaS4O2.setBorderPainted(true);
            palyaS4O2.setIcon(szurkes);
            palyaS4O2.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS4O2.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS4O2.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS4O2.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS4O2.setBorderPainted(false);
                  palyaS4O2.setIcon(lathatatlan);
            }
        }
        if (poz==43) {
            palyaS4O3.setBorderPainted(true);
            palyaS4O3.setIcon(szurkes);
            palyaS4O3.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS4O3.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS4O3.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS4O3.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS4O3.setBorderPainted(false);
                  palyaS4O3.setIcon(lathatatlan);
            }
        }
        if (poz==44) {
            palyaS4O4.setBorderPainted(true);
            palyaS4O4.setIcon(szurkes);
            palyaS4O4.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS4O4.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS4O4.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS4O4.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS4O4.setBorderPainted(false);
                  palyaS4O4.setIcon(lathatatlan);
            }
        }
        if (poz==45) {
            palyaS4O5.setBorderPainted(true);
            palyaS4O5.setIcon(szurkes);
            palyaS4O5.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS4O5.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS4O5.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS4O5.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS4O5.setBorderPainted(false);
                  palyaS4O5.setIcon(lathatatlan);
            }
        }
        if (poz==46) {
            palyaS4O6.setBorderPainted(true);
            palyaS4O6.setIcon(szurkes);
            palyaS4O6.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS4O6.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS4O6.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS4O6.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS4O6.setBorderPainted(false);
                  palyaS4O6.setIcon(lathatatlan);
            }
        }
        if (poz==47) {
            palyaS4O7.setBorderPainted(true);
            palyaS4O7.setIcon(szurkes);
            palyaS4O7.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS4O7.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS4O7.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS4O7.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS4O7.setBorderPainted(false);
                  palyaS4O7.setIcon(lathatatlan);
            }
        }
        if (poz==48) {
            palyaS4O8.setBorderPainted(true);
            palyaS4O8.setIcon(szurkes);
            palyaS4O8.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS4O8.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS4O8.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS4O8.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS4O8.setBorderPainted(false);
                  palyaS4O8.setIcon(lathatatlan);
            }
        }
        if (poz==49) {
            palyaS4O9.setBorderPainted(true);
            palyaS4O9.setIcon(szurkes);
            palyaS4O9.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS4O9.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS4O9.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS4O9.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS4O9.setBorderPainted(false);
                  palyaS4O9.setIcon(lathatatlan);
            }
        }
        if (poz==410 ) {
            palyaS4O10.setBorderPainted(true);
            palyaS4O10.setIcon(szurkes);
            palyaS4O10.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS4O10.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS4O10.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS4O10.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS4O10.setBorderPainted(false);
                 palyaS4O10.setIcon(lathatatlan);
            }
        }
        if (poz==411 ) {
            palyaS4O11.setBorderPainted(true);
            palyaS4O11.setIcon(szurkes);
            palyaS4O11.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS4O11.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS4O11.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS4O11.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS4O11.setBorderPainted(false);
                 palyaS4O11.setIcon(lathatatlan);
            }
        }
        if (poz==412 ) {
            palyaS4O12.setBorderPainted(true);
            palyaS4O12.setIcon(szurkes);
            palyaS4O12.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS4O12.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS4O12.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS4O12.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS4O12.setBorderPainted(false);
                 palyaS4O12.setIcon(lathatatlan);
            }
        }


        if (poz==51) {
            palyaS5O1.setBorderPainted(true);
            palyaS5O1.setIcon(szurkes);
            palyaS5O1.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS5O1.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS5O1.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS5O1.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS5O1.setBorderPainted(false);
                  palyaS5O1.setIcon(lathatatlan);
            }
        }
        if (poz==52) {
            palyaS5O2.setBorderPainted(true);
            palyaS5O2.setIcon(szurkes);
            palyaS5O2.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS5O2.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS5O2.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS5O2.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS5O2.setBorderPainted(false);
                  palyaS5O2.setIcon(lathatatlan);
            }
        }
        if (poz==53) {
            palyaS5O3.setBorderPainted(true);
            palyaS5O3.setIcon(szurkes);
            palyaS5O3.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS5O3.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS5O3.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS5O3.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS5O3.setBorderPainted(false);
                  palyaS5O3.setIcon(lathatatlan);
            }
        }
        if (poz==54) {
            palyaS5O4.setBorderPainted(true);
            palyaS5O4.setIcon(szurkes);
            palyaS5O4.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS5O4.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS5O4.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS5O4.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS5O4.setBorderPainted(false);
                  palyaS5O4.setIcon(lathatatlan);
            }
        }
        if (poz==55) {
            palyaS5O5.setBorderPainted(true);
            palyaS5O5.setIcon(szurkes);
            palyaS5O5.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS5O5.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS5O5.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS5O5.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS5O5.setBorderPainted(false);
                  palyaS5O5.setIcon(lathatatlan);
            }
        }
        if (poz==56) {
            palyaS5O6.setBorderPainted(true);
            palyaS5O6.setIcon(szurkes);
            palyaS5O6.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS5O6.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS5O6.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS5O6.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS5O6.setBorderPainted(false);
                  palyaS5O6.setIcon(lathatatlan);
            }
        }
        if (poz==57) {
            palyaS5O7.setBorderPainted(true);
            palyaS5O7.setIcon(szurkes);
            palyaS5O7.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS5O7.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS5O7.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS5O7.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS5O7.setBorderPainted(false);
                  palyaS5O7.setIcon(lathatatlan);
            }
        }
        if (poz==58) {
            palyaS5O8.setBorderPainted(true);
            palyaS5O8.setIcon(szurkes);
            palyaS5O8.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS5O8.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS5O8.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS5O8.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS5O8.setBorderPainted(false);
                  palyaS5O8.setIcon(lathatatlan);
            }
        }
        if (poz==59) {
            palyaS5O9.setBorderPainted(true);
            palyaS5O9.setIcon(szurkes);
            palyaS5O9.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS5O9.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS5O9.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS5O9.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS5O9.setBorderPainted(false);
                  palyaS5O9.setIcon(lathatatlan);
            }
        }
        if (poz==510 ) {
            palyaS5O10.setBorderPainted(true);
            palyaS5O10.setIcon(szurkes);
            palyaS5O10.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS5O10.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS5O10.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS5O10.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS5O10.setBorderPainted(false);
                 palyaS5O10.setIcon(lathatatlan);
            }
        }
        if (poz==511 ) {
            palyaS5O11.setBorderPainted(true);
            palyaS5O11.setIcon(szurkes);
            palyaS5O11.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS5O11.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS5O11.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS5O11.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS5O11.setBorderPainted(false);
                palyaS5O11.setIcon(lathatatlan);
            }
        }
        if (poz==512 ) {
            palyaS5O12.setBorderPainted(true);
            palyaS5O12.setIcon(szurkes);
            palyaS5O12.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS5O12.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS5O12.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS5O12.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS5O12.setBorderPainted(false);
                 palyaS5O12.setIcon(lathatatlan);
            }
        }


        if (poz==61) {
            palyaS6O1.setBorderPainted(true);
            palyaS6O1.setIcon(szurkes);
            palyaS6O1.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS6O1.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS6O1.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS6O1.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS6O1.setBorderPainted(false);
                  palyaS6O1.setIcon(lathatatlan);
            }
        }
        if (poz==62) {
            palyaS6O2.setBorderPainted(true);
            palyaS6O2.setIcon(szurkes);
            palyaS6O2.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS6O2.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS6O2.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS6O2.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS6O2.setBorderPainted(false);
                  palyaS6O2.setIcon(lathatatlan);
            }
        }
        if (poz==63) {
            palyaS6O3.setBorderPainted(true);
            palyaS6O3.setIcon(szurkes);
            palyaS6O3.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS6O3.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS6O3.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS6O3.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS6O3.setBorderPainted(false);
                  palyaS6O3.setIcon(lathatatlan);
            }
        }
        if (poz==65) {
            palyaS6O5.setBorderPainted(true);
            palyaS6O5.setIcon(szurkes);
            palyaS6O5.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS6O5.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS6O5.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS6O5.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS6O5.setBorderPainted(false);
                palyaS6O5.setIcon(lathatatlan);
            }
        }
        if (poz==66) {
            palyaS6O6.setBorderPainted(true);
            palyaS6O6.setIcon(szurkes);
            palyaS6O6.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS6O6.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS6O6.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS6O6.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS6O6.setBorderPainted(false);
                  palyaS6O6.setIcon(lathatatlan);
            }
        }
        if (poz==67) {
            palyaS6O7.setBorderPainted(true);
            palyaS6O7.setIcon(szurkes);
            palyaS6O7.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS6O7.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS6O7.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS6O7.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS6O7.setBorderPainted(false);
                  palyaS6O7.setIcon(lathatatlan);
            }
        }
        if (poz==68) {
            palyaS6O8.setBorderPainted(true);
            palyaS6O8.setIcon(szurkes);
            palyaS6O8.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS6O8.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS6O8.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS6O8.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS6O8.setBorderPainted(false);
                  palyaS6O8.setIcon(lathatatlan);
            }
        }
        if (poz==69) {
            palyaS6O9.setBorderPainted(true);
            palyaS6O9.setIcon(szurkes);
            palyaS6O9.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS6O9.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS6O9.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS6O9.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS6O9.setBorderPainted(false);
                  palyaS6O9.setIcon(lathatatlan);
            }
        }
        if (poz==610 ) {
            palyaS6O10.setBorderPainted(true);
            palyaS6O10.setIcon(szurkes);
            palyaS6O10.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS6O10.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS6O10.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS6O10.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS6O10.setBorderPainted(false);
                 palyaS6O10.setIcon(lathatatlan);
            }
        }
        if (poz==611 ) {
            palyaS6O11.setBorderPainted(true);
            palyaS6O11.setIcon(szurkes);
            palyaS6O11.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS6O11.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS6O11.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS6O11.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS6O11.setBorderPainted(false);
                palyaS6O11.setIcon(lathatatlan);
            }
        }
        if (poz==612 ) {
            palyaS6O12.setBorderPainted(true);
            palyaS6O12.setIcon(szurkes);
            palyaS6O12.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS6O12.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS6O12.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS6O12.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS6O12.setBorderPainted(false);
                 palyaS6O12.setIcon(lathatatlan);
            }
        }


        if (poz==71) {
            palyaS7O1.setBorderPainted(true);
            palyaS7O1.setIcon(szurkes);
            palyaS7O1.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS7O1.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS7O1.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS7O1.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS7O1.setBorderPainted(false);
                  palyaS7O1.setIcon(lathatatlan);
            }
        }
        if (poz==72) {
            palyaS7O2.setBorderPainted(true);
            palyaS7O2.setIcon(szurkes);
            palyaS7O2.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS7O2.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS7O2.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS7O2.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS7O2.setBorderPainted(false);
                  palyaS7O2.setIcon(lathatatlan);
            }
        }
        if (poz==73) {
            palyaS7O3.setBorderPainted(true);
            palyaS7O3.setIcon(szurkes);
            palyaS7O3.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS7O3.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS7O3.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS7O3.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS7O3.setBorderPainted(false);
                  palyaS7O3.setIcon(lathatatlan);
            }
        }
        if (poz==74) {
            palyaS7O4.setBorderPainted(true);
            palyaS7O4.setIcon(szurkes);
            palyaS7O4.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS7O4.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS7O4.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS7O4.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS7O4.setBorderPainted(false);
                  palyaS7O4.setIcon(lathatatlan);
            }
        }
        if (poz==75) {
            palyaS7O5.setBorderPainted(true);
            palyaS7O5.setIcon(szurkes);
            palyaS7O5.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS7O5.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS7O5.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS7O5.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS7O5.setBorderPainted(false);
                  palyaS7O5.setIcon(lathatatlan);
            }
        }
        if (poz==76) {
            palyaS7O6.setBorderPainted(true);
            palyaS7O6.setIcon(szurkes);
            palyaS7O6.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS7O6.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS7O6.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS7O6.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS7O6.setBorderPainted(false);
                  palyaS7O6.setIcon(lathatatlan);
            }
        }
        if (poz==77) {
            palyaS7O7.setBorderPainted(true);
            palyaS7O7.setIcon(szurkes);
            palyaS7O7.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS7O7.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS7O7.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS7O7.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS7O7.setBorderPainted(false);
                  palyaS7O7.setIcon(lathatatlan);
            }
        }
        if (poz==710 ) {
            palyaS7O10.setBorderPainted(true);
            palyaS7O10.setIcon(szurkes);
            palyaS7O10.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS7O10.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS7O10.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS7O10.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS7O10.setBorderPainted(false);
                 palyaS7O10.setIcon(lathatatlan);
            }
        }
        if (poz==711 ) {
            palyaS7O11.setBorderPainted(true);
            palyaS7O11.setIcon(szurkes);
            palyaS7O11.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS7O11.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS7O11.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS7O11.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS7O11.setBorderPainted(false);
                 palyaS7O11.setIcon(lathatatlan);
            }
        }
        if (poz==712 ) {
            palyaS7O12.setBorderPainted(true);
            palyaS7O12.setIcon(szurkes);
            palyaS7O12.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS7O12.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS7O12.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS7O12.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS7O12.setBorderPainted(false);
                 palyaS7O12.setIcon(lathatatlan);
            }
        }


        if (poz==81) {
            palyaS8O1.setBorderPainted(true);
            palyaS8O1.setIcon(szurkes);
            palyaS8O1.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS8O1.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS8O1.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS8O1.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS8O1.setBorderPainted(false);
                palyaS8O1.setIcon(lathatatlan);
            }
        }
        if (poz==82) {
            palyaS8O2.setBorderPainted(true);
            palyaS8O2.setIcon(szurkes);
            palyaS8O2.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS8O2.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS8O2.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS8O2.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS8O2.setBorderPainted(false);
                  palyaS8O2.setIcon(lathatatlan);
            }
        }
        if (poz==83) {
            palyaS8O3.setBorderPainted(true);
            palyaS8O3.setIcon(szurkes);
            palyaS8O3.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS8O3.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS8O3.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS8O3.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS8O3.setBorderPainted(false);
                  palyaS8O3.setIcon(lathatatlan);
            }
        }
        if (poz==84) {
            palyaS8O4.setBorderPainted(true);
            palyaS8O4.setIcon(szurkes);
            palyaS8O4.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS8O4.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS8O4.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS8O4.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS8O4.setBorderPainted(false);
                  palyaS8O4.setIcon(lathatatlan);
            }
        }
        if (poz==85) {
            palyaS8O5.setBorderPainted(true);
            palyaS8O5.setIcon(szurkes);
            palyaS8O5.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS8O5.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS8O5.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS8O5.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS8O5.setBorderPainted(false);
                  palyaS8O5.setIcon(lathatatlan);
            }
        }
        if (poz==88) {
            palyaS8O8.setBorderPainted(true);
            palyaS8O8.setIcon(szurkes);
            palyaS8O8.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS8O8.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS8O8.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS8O8.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS8O8.setBorderPainted(false);
                  palyaS8O8.setIcon(lathatatlan);
            }
        }
        if (poz==89) {
            palyaS8O9.setBorderPainted(true);
            palyaS8O9.setIcon(szurkes);
            palyaS8O9.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS8O9.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS8O9.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS8O9.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS8O9.setBorderPainted(false);
                  palyaS8O9.setIcon(lathatatlan);
            }
        }
        if (poz==810 ) {
            palyaS8O10.setBorderPainted(true);
            palyaS8O10.setIcon(szurkes);
            palyaS8O10.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS8O10.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS8O10.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS8O10.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS8O10.setBorderPainted(false);
                 palyaS8O10.setIcon(lathatatlan);
            }
        }
        if (poz==811 ) {
            palyaS8O11.setBorderPainted(true);
            palyaS8O11.setIcon(szurkes);
            palyaS8O11.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS8O11.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS8O11.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS8O11.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS8O11.setBorderPainted(false);
                 palyaS8O11.setIcon(lathatatlan);
            }
        }
        if (poz==812 ) {
            palyaS8O12.setBorderPainted(true);
            palyaS8O12.setIcon(szurkes);
            palyaS8O12.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS8O12.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS8O12.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS8O12.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS8O12.setBorderPainted(false);
                 palyaS8O12.setIcon(lathatatlan);
            }
        }


        if (poz==91) {
            palyaS9O1.setBorderPainted(true);
            palyaS9O1.setIcon(szurkes);
            palyaS9O1.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS9O1.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS9O1.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS9O1.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS9O1.setBorderPainted(false);
                  palyaS9O1.setIcon(lathatatlan);
            }
        }
        if (poz==92) {
            palyaS9O2.setBorderPainted(true);
            palyaS9O2.setIcon(szurkes);
            palyaS9O2.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS9O2.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS9O2.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS9O2.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS9O2.setBorderPainted(false);
                  palyaS9O2.setIcon(lathatatlan);
            }
        }
        if (poz==95) {
            palyaS9O5.setBorderPainted(true);
            palyaS9O5.setIcon(szurkes);
            palyaS9O5.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS9O5.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS9O5.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS9O5.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS9O5.setBorderPainted(false);
                palyaS9O5.setIcon(lathatatlan);
            }
        }
        if (poz==96) {
            palyaS9O6.setBorderPainted(true);
            palyaS9O6.setIcon(szurkes);
            palyaS9O6.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS9O6.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS9O6.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS9O6.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS9O6.setBorderPainted(false);
                  palyaS9O6.setIcon(lathatatlan);
            }
        }
        if (poz==97) {
            palyaS9O7.setBorderPainted(true);
            palyaS9O7.setIcon(szurkes);
            palyaS9O7.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS9O7.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS9O7.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS9O7.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS9O7.setBorderPainted(false);
                  palyaS9O7.setIcon(lathatatlan);
            }
        }
        if (poz==98) {
            palyaS9O8.setBorderPainted(true);
            palyaS9O8.setIcon(szurkes);
            palyaS9O8.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS9O8.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS9O8.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS9O8.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS9O8.setBorderPainted(false);
                  palyaS9O8.setIcon(lathatatlan);
            }
        }
        if (poz==99) {
            palyaS9O9.setBorderPainted(true);
            palyaS9O9.setIcon(szurkes);
            palyaS9O9.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS9O9.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS9O9.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS9O9.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS9O9.setBorderPainted(false);
                  palyaS9O9.setIcon(lathatatlan);
            }
        }
        if (poz==910 ) {
            palyaS9O10.setBorderPainted(true);
            palyaS9O10.setIcon(szurkes);
            palyaS9O10.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS9O10.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS9O10.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS9O10.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS9O10.setBorderPainted(false);
                 palyaS9O10.setIcon(lathatatlan);
            }
        }
        if (poz==911 ) {
            palyaS9O11.setBorderPainted(true);
            palyaS9O11.setIcon(szurkes);
            palyaS9O11.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS9O11.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS9O11.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS9O11.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS9O11.setBorderPainted(false);
                 palyaS9O11.setIcon(lathatatlan);
            }
        }
        if (poz==912 ) {
            palyaS9O12.setBorderPainted(true);
            palyaS9O12.setIcon(szurkes);
            palyaS9O12.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS9O12.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS9O12.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS9O12.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS9O12.setBorderPainted(false);
                 palyaS9O12.setIcon(lathatatlan);
            }
        }


        if (poz==101 ) {
            palyaS10O1.setBorderPainted(true);
            palyaS10O1.setIcon(szurkes);
            palyaS10O1.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS10O1.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS10O1.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS10O1.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS10O1.setBorderPainted(false);
                palyaS10O1.setIcon(lathatatlan);
            }
        }
        if (poz==102 ) {
            palyaS10O2.setBorderPainted(true);
            palyaS10O2.setIcon(szurkes);
            palyaS10O2.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS10O2.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS10O2.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS10O2.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS10O2.setBorderPainted(false);
                 palyaS10O2.setIcon(lathatatlan);
            }
        }
        if (poz==105 ) {
            palyaS10O5.setBorderPainted(true);
            palyaS10O5.setIcon(szurkes);
            palyaS10O5.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS10O5.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS10O5.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS10O5.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS10O5.setBorderPainted(false);
                 palyaS10O5.setIcon(lathatatlan);
            }
        }
        if (poz==106 ) {
            palyaS10O6.setBorderPainted(true);
            palyaS10O6.setIcon(szurkes);
            palyaS10O6.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS10O6.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS10O6.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS10O6.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS10O6.setBorderPainted(false);
                palyaS10O6.setIcon(lathatatlan);
            }
        }
        if (poz==107 ) {
            palyaS10O7.setBorderPainted(true);
            palyaS10O7.setIcon(szurkes);
            palyaS10O7.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS10O7.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS10O7.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS10O7.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS10O7.setBorderPainted(false);
                 palyaS10O7.setIcon(lathatatlan);
            }
        }
        if (poz==108 ) {
            palyaS10O8.setBorderPainted(true);
            palyaS10O8.setIcon(szurkes);
            palyaS10O8.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS10O8.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS10O8.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS10O8.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS10O8.setBorderPainted(false);
                 palyaS10O8.setIcon(lathatatlan);
            }
        }
        if (poz==109 ) {
            palyaS10O9.setBorderPainted(true);
            palyaS10O9.setIcon(szurkes);
            palyaS10O9.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS10O9.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS10O9.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS10O9.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS10O9.setBorderPainted(false);
                 palyaS10O9.setIcon(lathatatlan);
            }
        }
        if (poz==1010) {
            palyaS10O10.setBorderPainted(true);
            palyaS10O10.setIcon(szurkes);
            palyaS10O10.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS10O10.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS10O10.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS10O10.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS10O10.setBorderPainted(false);
                palyaS10O10.setIcon(lathatatlan);
            }
        }
        if (poz==1011 ) {
            palyaS10O11.setBorderPainted(true);
            palyaS10O11.setIcon(szurkes);
            palyaS10O11.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS10O11.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS10O11.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS10O11.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS10O11.setBorderPainted(false);
                palyaS10O11.setIcon(lathatatlan);
            }
        }
        if (poz==1012 ) {
            palyaS10O12.setBorderPainted(true);
            palyaS10O12.setIcon(szurkes);
            palyaS10O12.setBorder(null);
            if (hosVillamcsapasGombBenyomva) {
                palyaS10O12.setBorder(BorderFactory.createLineBorder(new Color(30, 52, 210), 1));
            }else if (hosLassitasGombBenyomva) {
                palyaS10O12.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 194), 1));
            }else if (hosTuzlabdaGombBenyomva) {
                palyaS10O12.setBorder(BorderFactory.createLineBorder(new Color(125, 0, 0), 1));
            }else {
                palyaS10O12.setBorderPainted(false);
                palyaS10O12.setIcon(lathatatlan);
            }
        }
    }


    public static void szinezes(int regiPozSorLass, int regiPozOszlopLass) {

        int poz=Integer.parseInt(String.valueOf(regiPozSorLass) + String.valueOf(regiPozOszlopLass));

        if (poz==11) {
            palyaS1O1.setBorderPainted(true);
            palyaS1O1.setIcon(szurkes);
            if (hosIstenieroGombBenyomva) {
                palyaS1O1.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS1O1.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS1O1.setBorderPainted(false);
                palyaS1O1.setIcon(lathatatlan);
            }
        }
        if (poz==12) {
            palyaS1O2.setBorderPainted(true);
            palyaS1O2.setIcon(szurkes);
            palyaS1O2.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS1O2.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS1O2.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS1O2.setBorderPainted(false);
                palyaS1O2.setIcon(lathatatlan);
            }
        }
        if (poz==13) {
            palyaS1O3.setBorderPainted(true);
            palyaS1O3.setIcon(szurkes);
            palyaS1O3.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS1O3.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS1O3.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS1O3.setBorderPainted(false);
                palyaS1O3.setIcon(lathatatlan);
            }
        }
        if (poz==14) {
            palyaS1O4.setBorderPainted(true);
            palyaS1O4.setIcon(szurkes);
            palyaS1O4.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS1O4.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS1O4.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS1O4.setBorderPainted(false);
                palyaS1O4.setIcon(lathatatlan);
            }
        }
        if (poz==15) {
            palyaS1O5.setBorderPainted(true);
            palyaS1O5.setIcon(szurkes);
            palyaS1O5.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS1O5.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS1O5.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS1O5.setBorderPainted(false);
                palyaS1O5.setIcon(lathatatlan);
            }
        }
        if (poz==16) {
            palyaS1O6.setBorderPainted(true);
            palyaS1O6.setIcon(szurkes);
            palyaS1O6.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS1O6.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS1O6.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS1O6.setBorderPainted(false);
                palyaS1O6.setIcon(lathatatlan);
            }
        }
        if (poz==17) {
            palyaS1O7.setBorderPainted(true);
            palyaS1O7.setIcon(szurkes);
            palyaS1O7.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS1O7.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS1O7.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS1O7.setBorderPainted(false);
                palyaS1O7.setIcon(lathatatlan);
            }
        }
        if (poz==18) {
            palyaS1O8.setBorderPainted(true);
            palyaS1O8.setIcon(szurkes);
            palyaS1O8.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS1O8.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS1O8.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS1O8.setBorderPainted(false);
                palyaS1O8.setIcon(lathatatlan);
            }
        }
        if (poz==19) {
            palyaS1O9.setBorderPainted(true);
            palyaS1O9.setIcon(szurkes);
            palyaS1O9.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS1O9.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS1O9.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS1O9.setBorderPainted(false);
                palyaS1O9.setIcon(lathatatlan);
            }
        }
        if (poz==110 ) {
            palyaS1O10.setBorderPainted(true);
            palyaS1O10.setIcon(szurkes);
            palyaS1O10.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS1O10.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS1O10.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS1O10.setBorderPainted(false);
                palyaS1O10.setIcon(lathatatlan);
            }
        }
        if (poz==111 ) {
            palyaS1O11.setBorderPainted(true);
            palyaS1O11.setIcon(szurkes);
            palyaS1O11.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS1O11.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS1O11.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS1O11.setBorderPainted(false);
                palyaS1O11.setIcon(lathatatlan);
            }
        }
        if (poz==112 ) {
            palyaS1O12.setBorderPainted(true);
            palyaS1O12.setIcon(szurkes);
            palyaS1O12.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS1O12.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS1O12.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS1O12.setBorderPainted(false);
                palyaS1O12.setIcon(lathatatlan);
            }
        }


        if (poz==21) {
            palyaS2O1.setBorderPainted(true);
            palyaS2O1.setIcon(szurkes);
            palyaS2O1.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS2O1.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS2O1.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS2O1.setBorderPainted(false);
                palyaS2O1.setIcon(lathatatlan);
            }
        }
        if (poz==22) {
            palyaS2O2.setBorderPainted(true);
            palyaS2O2.setIcon(szurkes);
            palyaS2O2.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS2O2.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS2O2.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS2O2.setBorderPainted(false);
                palyaS2O2.setIcon(lathatatlan);
            }
        }
        if (poz==23) {
            palyaS2O3.setBorderPainted(true);
            palyaS2O3.setIcon(szurkes);
            palyaS2O3.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS2O3.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS2O3.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS2O3.setBorderPainted(false);
                palyaS2O3.setIcon(lathatatlan);
            }
        }
        if (poz==24) {
            palyaS2O4.setBorderPainted(true);
            palyaS2O4.setIcon(szurkes);
            palyaS2O4.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS2O4.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS2O4.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS2O4.setBorderPainted(false);
                palyaS2O4.setIcon(lathatatlan);
            }
        }
        if (poz==25) {
            palyaS2O5.setBorderPainted(true);
            palyaS2O5.setIcon(szurkes);
            palyaS2O5.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS2O5.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS2O5.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS2O5.setBorderPainted(false);
                palyaS2O5.setIcon(lathatatlan);
            }
        }
        if (poz==26) {
            palyaS2O6.setBorderPainted(true);
            palyaS2O6.setIcon(szurkes);
            palyaS2O6.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS2O6.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS2O6.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS2O6.setBorderPainted(false);
                        palyaS2O6.setIcon(lathatatlan);
            }
        }
        if (poz==27) {
            palyaS2O7.setBorderPainted(true);
            palyaS2O7.setIcon(szurkes);
            palyaS2O7.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS2O7.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS2O7.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS2O7.setBorderPainted(false);
                palyaS2O7.setIcon(lathatatlan);
            }
        }
        if (poz==28) {
            palyaS2O8.setBorderPainted(true);
            palyaS2O8.setIcon(szurkes);
            palyaS2O8.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS2O8.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS2O8.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS2O8.setBorderPainted(false);
                palyaS2O8.setIcon(lathatatlan);
            }
        }
        if (poz==29) {
            palyaS2O9.setBorderPainted(true);
            palyaS2O9.setIcon(szurkes);
            palyaS2O9.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS2O9.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS2O9.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS2O9.setBorderPainted(false);
                palyaS2O9.setIcon(lathatatlan);
            }
        }
        if (poz==210 ) {
            palyaS2O10.setBorderPainted(true);
            palyaS2O10.setIcon(szurkes);
            palyaS2O10.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS2O10.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS2O10.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS2O10.setBorderPainted(false);
                palyaS2O10.setIcon(lathatatlan);
            }
        }
        if (poz==211 ) {
            palyaS2O11.setBorderPainted(true);
            palyaS2O11.setIcon(szurkes);
            palyaS2O11.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS2O11.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS2O11.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS2O11.setBorderPainted(false);
                palyaS2O11.setIcon(lathatatlan);
            }
        }
        if (poz==212 ) {
            palyaS2O12.setBorderPainted(true);
            palyaS2O12.setIcon(szurkes);
            palyaS2O12.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS2O12.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS2O12.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS2O12.setBorderPainted(false);
                palyaS2O12.setIcon(lathatatlan);
            }
        }


        if (poz==31) {
            palyaS3O1.setBorderPainted(true);
            palyaS3O1.setIcon(szurkes);
            palyaS3O1.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS3O1.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS3O1.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS3O1.setBorderPainted(false);
                palyaS3O1.setIcon(lathatatlan);
            }
        }
        if (poz==32) {
            palyaS3O2.setBorderPainted(true);
            palyaS3O2.setIcon(szurkes);
            palyaS3O2.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS3O2.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS3O2.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS3O2.setBorderPainted(false);
                        palyaS3O2.setIcon(lathatatlan);
            }
        }
        if (poz==33) {
            palyaS3O3.setBorderPainted(true);
            palyaS3O3.setIcon(szurkes);
            palyaS3O3.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS3O3.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS3O3.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS3O3.setBorderPainted(false);
                palyaS3O3.setIcon(lathatatlan);
            }
        }
        if (poz==34) {
            palyaS3O4.setBorderPainted(true);
            palyaS3O4.setIcon(szurkes);
            palyaS3O4.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS3O4.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS3O4.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS3O4.setBorderPainted(false);
                palyaS3O4.setIcon(lathatatlan);
            }
        }
        if (poz==35) {
            palyaS3O5.setBorderPainted(true);
            palyaS3O5.setIcon(szurkes);
            palyaS3O5.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS3O5.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS3O5.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS3O5.setBorderPainted(false);
                palyaS3O5.setIcon(lathatatlan);
            }
        }
        if (poz==36) {
            palyaS3O6.setBorderPainted(true);
            palyaS3O6.setIcon(szurkes);
            palyaS3O6.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS3O6.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS3O6.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS3O6.setBorderPainted(false);
                palyaS3O6.setIcon(lathatatlan);
            }
        }
        if (poz==37) {
            palyaS3O7.setBorderPainted(true);
            palyaS3O7.setIcon(szurkes);
            palyaS3O7.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS3O7.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS3O7.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS3O7.setBorderPainted(false);
                palyaS3O7.setIcon(lathatatlan);
            }
        }
        if (poz==38) {
            palyaS3O8.setBorderPainted(true);
            palyaS3O8.setIcon(szurkes);
            palyaS3O8.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS3O8.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS3O8.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS3O8.setBorderPainted(false);
                palyaS3O8.setIcon(lathatatlan);
            }
        }
        if (poz==39) {
            palyaS3O9.setBorderPainted(true);
            palyaS3O9.setIcon(szurkes);
            palyaS3O9.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS3O9.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS3O9.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS3O9.setBorderPainted(false);
                palyaS3O9.setIcon(lathatatlan);
            }
        }
        if (poz==310 ) {
            palyaS3O10.setBorderPainted(true);
            palyaS3O10.setIcon(szurkes);
            palyaS3O10.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS3O10.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS3O10.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS3O10.setBorderPainted(false);
                palyaS3O10.setIcon(lathatatlan);
            }
        }
        if (poz==311 ) {
            palyaS3O11.setBorderPainted(true);
            palyaS3O11.setIcon(szurkes);
            palyaS3O11.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS3O11.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS3O11.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS3O11.setBorderPainted(false);
                palyaS3O11.setIcon(lathatatlan);
            }
        }
        if (poz==312 ) {
            palyaS3O12.setBorderPainted(true);
            palyaS3O12.setIcon(szurkes);
            palyaS3O12.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS3O12.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS3O12.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS3O12.setBorderPainted(false);
                palyaS3O12.setIcon(lathatatlan);
            }
        }


        if (poz==41) {
            palyaS4O1.setBorderPainted(true);
            palyaS4O1.setIcon(szurkes);
            palyaS4O1.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS4O1.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS4O1.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS4O1.setBorderPainted(false);
                palyaS4O1.setIcon(lathatatlan);
            }
        }
        if (poz==42) {
            palyaS4O2.setBorderPainted(true);
            palyaS4O2.setIcon(szurkes);
            palyaS4O2.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS4O2.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS4O2.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS4O2.setBorderPainted(false);
                palyaS4O2.setIcon(lathatatlan);
            }
        }
        if (poz==43) {
            palyaS4O3.setBorderPainted(true);
            palyaS4O3.setIcon(szurkes);
            palyaS4O3.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS4O3.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS4O3.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS4O3.setBorderPainted(false);
                palyaS4O3.setIcon(lathatatlan);
            }
        }
        if (poz==44) {
            palyaS4O4.setBorderPainted(true);
            palyaS4O4.setIcon(szurkes);
            palyaS4O4.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS4O4.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS4O4.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS4O4.setBorderPainted(false);
                palyaS4O4.setIcon(lathatatlan);
            }
        }
        if (poz==45) {
            palyaS4O5.setBorderPainted(true);
            palyaS4O5.setIcon(szurkes);
            palyaS4O5.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS4O5.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS4O5.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS4O5.setBorderPainted(false);
                palyaS4O5.setIcon(lathatatlan);
            }
        }
        if (poz==46) {
            palyaS4O6.setBorderPainted(true);
            palyaS4O6.setIcon(szurkes);
            palyaS4O6.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS4O6.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS4O6.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS4O6.setBorderPainted(false);
                palyaS4O6.setIcon(lathatatlan);
            }
        }
        if (poz==47) {
            palyaS4O7.setBorderPainted(true);
            palyaS4O7.setIcon(szurkes);
            palyaS4O7.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS4O7.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS4O7.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS4O7.setBorderPainted(false);
                palyaS4O7.setIcon(lathatatlan);
            }
        }
        if (poz==48) {
            palyaS4O8.setBorderPainted(true);
            palyaS4O8.setIcon(szurkes);
            palyaS4O8.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS4O8.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS4O8.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS4O8.setBorderPainted(false);
                palyaS4O8.setIcon(lathatatlan);
            }
        }
        if (poz==49) {
            palyaS4O9.setBorderPainted(true);
            palyaS4O9.setIcon(szurkes);
            palyaS4O9.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS4O9.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS4O9.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS4O9.setBorderPainted(false);
                palyaS4O9.setIcon(lathatatlan);
            }
        }
        if (poz==410 ) {
            palyaS4O10.setBorderPainted(true);
            palyaS4O10.setIcon(szurkes);
            palyaS4O10.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS4O10.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS4O10.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS4O10.setBorderPainted(false);
                palyaS4O10.setIcon(lathatatlan);
            }
        }
        if (poz==411 ) {
            palyaS4O11.setBorderPainted(true);
            palyaS4O11.setIcon(szurkes);
            palyaS4O11.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS4O11.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS4O11.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS4O11.setBorderPainted(false);
                palyaS4O11.setIcon(lathatatlan);
            }
        }
        if (poz==412 ) {
            palyaS4O12.setBorderPainted(true);
            palyaS4O12.setIcon(szurkes);
            palyaS4O12.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS4O12.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS4O12.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS4O12.setBorderPainted(false);
                palyaS4O12.setIcon(lathatatlan);
            }
        }


        if (poz==51) {
            palyaS5O1.setBorderPainted(true);
            palyaS5O1.setIcon(szurkes);
            palyaS5O1.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS5O1.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS5O1.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS5O1.setBorderPainted(false);
                palyaS5O1.setIcon(lathatatlan);
            }
        }
        if (poz==52) {
            palyaS5O2.setBorderPainted(true);
            palyaS5O2.setIcon(szurkes);
            palyaS5O2.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS5O2.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS5O2.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS5O2.setBorderPainted(false);
                palyaS5O2.setIcon(lathatatlan);
            }
        }
        if (poz==53) {
            palyaS5O3.setBorderPainted(true);
            palyaS5O3.setIcon(szurkes);
            palyaS5O3.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS5O3.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS5O3.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS5O3.setBorderPainted(false);
                palyaS5O3.setIcon(lathatatlan);
            }
        }
        if (poz==54) {
            palyaS5O4.setBorderPainted(true);
            palyaS5O4.setIcon(szurkes);
            palyaS5O4.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS5O4.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS5O4.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS5O4.setBorderPainted(false);
                palyaS5O4.setIcon(lathatatlan);
            }
        }
        if (poz==55) {
            palyaS5O5.setBorderPainted(true);
            palyaS5O5.setIcon(szurkes);
            palyaS5O5.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS5O5.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS5O5.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS5O5.setBorderPainted(false);
                palyaS5O5.setIcon(lathatatlan);
            }
        }
        if (poz==56) {
            palyaS5O6.setBorderPainted(true);
            palyaS5O6.setIcon(szurkes);
            palyaS5O6.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS5O6.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS5O6.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS5O6.setBorderPainted(false);
                palyaS5O6.setIcon(lathatatlan);
            }
        }
        if (poz==57) {
            palyaS5O7.setBorderPainted(true);
            palyaS5O7.setIcon(szurkes);
            palyaS5O7.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS5O7.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS5O7.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS5O7.setBorderPainted(false);
                palyaS5O7.setIcon(lathatatlan);
            }
        }
        if (poz==58) {
            palyaS5O8.setBorderPainted(true);
            palyaS5O8.setIcon(szurkes);
            palyaS5O8.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS5O8.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS5O8.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS5O8.setBorderPainted(false);
                palyaS5O8.setIcon(lathatatlan);
            }
        }
        if (poz==59) {
            palyaS5O9.setBorderPainted(true);
            palyaS5O9.setIcon(szurkes);
            palyaS5O9.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS5O9.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS5O9.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS5O9.setBorderPainted(false);
                palyaS5O9.setIcon(lathatatlan);
            }
        }
        if (poz==510 ) {
            palyaS5O10.setBorderPainted(true);
            palyaS5O10.setIcon(szurkes);
            palyaS5O10.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS5O10.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS5O10.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS5O10.setBorderPainted(false);
                palyaS5O10.setIcon(lathatatlan);
            }
        }
        if (poz==511 ) {
            palyaS5O11.setBorderPainted(true);
            palyaS5O11.setIcon(szurkes);
            palyaS5O11.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS5O11.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS5O11.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS5O11.setBorderPainted(false);
                palyaS5O11.setIcon(lathatatlan);
            }
        }
        if (poz==512 ) {
            palyaS5O12.setBorderPainted(true);
            palyaS5O12.setIcon(szurkes);
            palyaS5O12.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS5O12.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS5O12.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS5O12.setBorderPainted(false);
                palyaS5O12.setIcon(lathatatlan);
            }
        }


        if (poz==61) {
            palyaS6O1.setBorderPainted(true);
            palyaS6O1.setIcon(szurkes);
            palyaS6O1.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS6O1.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS6O1.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS6O1.setBorderPainted(false);
                palyaS6O1.setIcon(lathatatlan);
            }
        }
        if (poz==62) {
            palyaS6O2.setBorderPainted(true);
            palyaS6O2.setIcon(szurkes);
            palyaS6O2.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS6O2.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS6O2.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS6O2.setBorderPainted(false);
                palyaS6O2.setIcon(lathatatlan);
            }
        }
        if (poz==63) {
            palyaS6O3.setBorderPainted(true);
            palyaS6O3.setIcon(szurkes);
            palyaS6O3.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS6O3.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS6O3.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS6O3.setBorderPainted(false);
                palyaS6O3.setIcon(lathatatlan);
            }
        }
        if (poz==65) {
            palyaS6O5.setBorderPainted(true);
            palyaS6O5.setIcon(szurkes);
            palyaS6O5.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS6O5.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS6O5.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS6O5.setBorderPainted(false);
                palyaS6O5.setIcon(lathatatlan);
            }
        }
        if (poz==66) {
            palyaS6O6.setBorderPainted(true);
            palyaS6O6.setIcon(szurkes);
            palyaS6O6.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS6O6.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS6O6.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS6O6.setBorderPainted(false);
                palyaS6O6.setIcon(lathatatlan);
            }
        }
        if (poz==67) {
            palyaS6O7.setBorderPainted(true);
            palyaS6O7.setIcon(szurkes);
            palyaS6O7.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS6O7.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS6O7.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS6O7.setBorderPainted(false);
                palyaS6O7.setIcon(lathatatlan);
            }
        }
        if (poz==68) {
            palyaS6O8.setBorderPainted(true);
            palyaS6O8.setIcon(szurkes);
            palyaS6O8.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS6O8.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS6O8.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS6O8.setBorderPainted(false);
                palyaS6O8.setIcon(lathatatlan);
            }
        }
        if (poz==69) {
            palyaS6O9.setBorderPainted(true);
            palyaS6O9.setIcon(szurkes);
            palyaS6O9.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS6O9.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS6O9.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS6O9.setBorderPainted(false);
                palyaS6O9.setIcon(lathatatlan);
            }
        }
        if (poz==610 ) {
            palyaS6O10.setBorderPainted(true);
            palyaS6O10.setIcon(szurkes);
            palyaS6O10.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS6O10.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS6O10.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS6O10.setBorderPainted(false);
                palyaS6O10.setIcon(lathatatlan);
            }
        }
        if (poz==611 ) {
            palyaS6O11.setBorderPainted(true);
            palyaS6O11.setIcon(szurkes);
            palyaS6O11.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS6O11.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS6O11.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS6O11.setBorderPainted(false);
                palyaS6O11.setIcon(lathatatlan);
            }
        }
        if (poz==612 ) {
            palyaS6O12.setBorderPainted(true);
            palyaS6O12.setIcon(szurkes);
            palyaS6O12.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS6O12.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS6O12.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS6O12.setBorderPainted(false);
                palyaS6O12.setIcon(lathatatlan);
            }
        }


        if (poz==71) {
            palyaS7O1.setBorderPainted(true);
            palyaS7O1.setIcon(szurkes);
            palyaS7O1.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS7O1.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS7O1.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS7O1.setBorderPainted(false);
                palyaS7O1.setIcon(lathatatlan);
            }
        }
        if (poz==72) {
            palyaS7O2.setBorderPainted(true);
            palyaS7O2.setIcon(szurkes);
            palyaS7O2.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS7O2.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS7O2.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS7O2.setBorderPainted(false);
                palyaS7O2.setIcon(lathatatlan);
            }
        }
        if (poz==73) {
            palyaS7O3.setBorderPainted(true);
            palyaS7O3.setIcon(szurkes);
            palyaS7O3.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS7O3.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS7O3.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS7O3.setBorderPainted(false);
                palyaS7O3.setIcon(lathatatlan);
            }
        }
        if (poz==74) {
            palyaS7O4.setBorderPainted(true);
            palyaS7O4.setIcon(szurkes);
            palyaS7O4.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS7O4.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS7O4.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS7O4.setBorderPainted(false);
                palyaS7O4.setIcon(lathatatlan);
            }
        }
        if (poz==75) {
            palyaS7O5.setBorderPainted(true);
            palyaS7O5.setIcon(szurkes);
            palyaS7O5.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS7O5.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS7O5.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS7O5.setBorderPainted(false);
                palyaS7O5.setIcon(lathatatlan);
            }
        }
        if (poz==76) {
            palyaS7O6.setBorderPainted(true);
            palyaS7O6.setIcon(szurkes);
            palyaS7O6.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS7O6.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS7O6.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS7O6.setBorderPainted(false);
                palyaS7O6.setIcon(lathatatlan);
            }
        }
        if (poz==77) {
            palyaS7O7.setBorderPainted(true);
            palyaS7O7.setIcon(szurkes);
            palyaS7O7.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS7O7.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS7O7.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS7O7.setBorderPainted(false);
                palyaS7O7.setIcon(lathatatlan);
            }
        }
        if (poz==710 ) {
            palyaS7O10.setBorderPainted(true);
            palyaS7O10.setIcon(szurkes);
            palyaS7O10.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS7O10.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS7O10.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS7O10.setBorderPainted(false);
                palyaS7O10.setIcon(lathatatlan);
            }
        }
        if (poz==711 ) {
            palyaS7O11.setBorderPainted(true);
            palyaS7O11.setIcon(szurkes);
            palyaS7O11.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS7O11.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS7O11.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS7O11.setBorderPainted(false);
                palyaS7O11.setIcon(lathatatlan);
            }
        }
        if (poz==712 ) {
            palyaS7O12.setBorderPainted(true);
            palyaS7O12.setIcon(szurkes);
            palyaS7O12.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS7O12.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS7O12.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS7O12.setBorderPainted(false);
                palyaS7O12.setIcon(lathatatlan);
            }
        }


        if (poz==81) {
            palyaS8O1.setBorderPainted(true);
            palyaS8O1.setIcon(szurkes);
            palyaS8O1.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS8O1.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS8O1.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS8O1.setBorderPainted(false);
                palyaS8O1.setIcon(lathatatlan);
            }
        }
        if (poz==82) {
            palyaS8O2.setBorderPainted(true);
            palyaS8O2.setIcon(szurkes);
            palyaS8O2.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS8O2.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS8O2.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS8O2.setBorderPainted(false);
                palyaS8O2.setIcon(lathatatlan);
            }
        }
        if (poz==83) {
            palyaS8O3.setBorderPainted(true);
            palyaS8O3.setIcon(szurkes);
            palyaS8O3.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS8O3.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS8O3.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS8O3.setBorderPainted(false);
                palyaS8O3.setIcon(lathatatlan);
            }
        }
        if (poz==84) {
            palyaS8O4.setBorderPainted(true);
            palyaS8O4.setIcon(szurkes);
            palyaS8O4.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS8O4.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS8O4.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS8O4.setBorderPainted(false);
                palyaS8O4.setIcon(lathatatlan);
            }
        }
        if (poz==85) {
            palyaS8O5.setBorderPainted(true);
            palyaS8O5.setIcon(szurkes);
            palyaS8O5.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS8O5.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS8O5.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS8O5.setBorderPainted(false);
                palyaS8O5.setIcon(lathatatlan);
            }
        }
        if (poz==88) {
            palyaS8O8.setBorderPainted(true);
            palyaS8O8.setIcon(szurkes);
            palyaS8O8.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS8O8.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS8O8.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS8O8.setBorderPainted(false);
                palyaS8O8.setIcon(lathatatlan);
            }
        }
        if (poz==89) {
            palyaS8O9.setBorderPainted(true);
            palyaS8O9.setIcon(szurkes);
            palyaS8O9.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS8O9.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS8O9.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS8O9.setBorderPainted(false);
                palyaS8O9.setIcon(lathatatlan);
            }
        }
        if (poz==810 ) {
            palyaS8O10.setBorderPainted(true);
            palyaS8O10.setIcon(szurkes);
            palyaS8O10.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS8O10.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS8O10.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS8O10.setBorderPainted(false);
                palyaS8O10.setIcon(lathatatlan);
            }
        }
        if (poz==811 ) {
            palyaS8O11.setBorderPainted(true);
            palyaS8O11.setIcon(szurkes);
            palyaS8O11.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS8O11.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS8O11.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS8O11.setBorderPainted(false);
                palyaS8O11.setIcon(lathatatlan);
            }
        }
        if (poz==812 ) {
            palyaS8O12.setBorderPainted(true);
            palyaS8O12.setIcon(szurkes);
            palyaS8O12.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS8O12.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS8O12.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS8O12.setBorderPainted(false);
                palyaS8O12.setIcon(lathatatlan);
            }
        }


        if (poz==91) {
            palyaS9O1.setBorderPainted(true);
            palyaS9O1.setIcon(szurkes);
            palyaS9O1.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS9O1.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS9O1.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS9O1.setBorderPainted(false);
                palyaS9O1.setIcon(lathatatlan);
            }
        }
        if (poz==92) {
            palyaS9O2.setBorderPainted(true);
            palyaS9O2.setIcon(szurkes);
            palyaS9O2.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS9O2.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS9O2.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS9O2.setBorderPainted(false);
                palyaS9O2.setIcon(lathatatlan);
            }
        }
        if (poz==95) {
            palyaS9O5.setBorderPainted(true);
            palyaS9O5.setIcon(szurkes);
            palyaS9O5.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS9O5.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS9O5.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS9O5.setBorderPainted(false);
                palyaS9O5.setIcon(lathatatlan);
            }
        }
        if (poz==96) {
            palyaS9O6.setBorderPainted(true);
            palyaS9O6.setIcon(szurkes);
            palyaS9O6.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS9O6.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS9O6.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS9O6.setBorderPainted(false);
                palyaS9O6.setIcon(lathatatlan);
            }
        }
        if (poz==97) {
            palyaS9O7.setBorderPainted(true);
            palyaS9O7.setIcon(szurkes);
            palyaS9O7.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS9O7.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS9O7.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS9O7.setBorderPainted(false);
                palyaS9O7.setIcon(lathatatlan);
            }
        }
        if (poz==98) {
            palyaS9O8.setBorderPainted(true);
            palyaS9O8.setIcon(szurkes);
            palyaS9O8.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS9O8.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS9O8.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS9O8.setBorderPainted(false);
                palyaS9O8.setIcon(lathatatlan);
            }
        }
        if (poz==99) {
            palyaS9O9.setBorderPainted(true);
            palyaS9O9.setIcon(szurkes);
            palyaS9O9.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS9O9.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS9O9.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS9O9.setBorderPainted(false);
                palyaS9O9.setIcon(lathatatlan);
            }
        }
        if (poz==910 ) {
            palyaS9O10.setBorderPainted(true);
            palyaS9O10.setIcon(szurkes);
            palyaS9O10.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS9O10.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS9O10.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS9O10.setBorderPainted(false);
                palyaS9O10.setIcon(lathatatlan);
            }
        }
        if (poz==911 ) {
            palyaS9O11.setBorderPainted(true);
            palyaS9O11.setIcon(szurkes);
            palyaS9O11.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS9O11.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS9O11.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS9O11.setBorderPainted(false);
                palyaS9O11.setIcon(lathatatlan);
            }
        }
        if (poz==912 ) {
            palyaS9O12.setBorderPainted(true);
            palyaS9O12.setIcon(szurkes);
            palyaS9O12.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS9O12.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS9O12.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS9O12.setBorderPainted(false);
                palyaS9O12.setIcon(lathatatlan);
            }
        }


        if (poz==101 ) {
            palyaS10O1.setBorderPainted(true);
            palyaS10O1.setIcon(szurkes);
            palyaS10O1.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS10O1.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS10O1.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS10O1.setBorderPainted(false);
                palyaS10O1.setIcon(lathatatlan);
            }
        }
        if (poz==102 ) {
            palyaS10O2.setBorderPainted(true);
            palyaS10O2.setIcon(szurkes);
            palyaS10O2.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS10O2.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS10O2.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS10O2.setBorderPainted(false);
                palyaS10O2.setIcon(lathatatlan);
            }
        }
        if (poz==105 ) {
            palyaS10O5.setBorderPainted(true);
            palyaS10O5.setIcon(szurkes);
            palyaS10O5.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS10O5.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS10O5.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS10O5.setBorderPainted(false);
                palyaS10O5.setIcon(lathatatlan);
            }
        }
        if (poz==106 ) {
            palyaS10O6.setBorderPainted(true);
            palyaS10O6.setIcon(szurkes);
            palyaS10O6.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS10O6.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS10O6.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS10O6.setBorderPainted(false);
                palyaS10O6.setIcon(lathatatlan);
            }
        }
        if (poz==107 ) {
            palyaS10O7.setBorderPainted(true);
            palyaS10O7.setIcon(szurkes);
            palyaS10O7.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS10O7.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS10O7.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS10O7.setBorderPainted(false);
                palyaS10O7.setIcon(lathatatlan);
            }
        }
        if (poz==108 ) {
            palyaS10O8.setBorderPainted(true);
            palyaS10O8.setIcon(szurkes);
            palyaS10O8.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS10O8.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS10O8.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS10O8.setBorderPainted(false);
                palyaS10O8.setIcon(lathatatlan);
            }
        }
        if (poz==109 ) {
            palyaS10O9.setBorderPainted(true);
            palyaS10O9.setIcon(szurkes);
            palyaS10O9.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS10O9.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS10O9.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS10O9.setBorderPainted(false);
                palyaS10O9.setIcon(lathatatlan);
            }
        }
        if (poz==1010) {
            palyaS10O10.setBorderPainted(true);
            palyaS10O10.setIcon(szurkes);
            palyaS10O10.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS10O10.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS10O10.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS10O10.setBorderPainted(false);
                palyaS10O10.setIcon(lathatatlan);
            }
        }
        if (poz==1011 ) {
            palyaS10O11.setBorderPainted(true);
            palyaS10O11.setIcon(szurkes);
            palyaS10O11.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS10O11.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS10O11.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS10O11.setBorderPainted(false);
                palyaS10O11.setIcon(lathatatlan);
            }
        }
        if (poz==1012 ) {
            palyaS10O12.setBorderPainted(true);
            palyaS10O12.setIcon(szurkes);
            palyaS10O12.setBorder(null);
            if (hosIstenieroGombBenyomva) {
                palyaS10O12.setBorder(BorderFactory.createLineBorder(new Color(255, 234, 45), 1));
            }else if (hosFeltamasztasGombBenyomva) {
                palyaS10O12.setBorder(BorderFactory.createLineBorder(new Color(40, 200, 40), 1));
            }else {
                palyaS10O12.setBorderPainted(false);
                palyaS10O12.setIcon(lathatatlan);
            }
        }
    }
}
