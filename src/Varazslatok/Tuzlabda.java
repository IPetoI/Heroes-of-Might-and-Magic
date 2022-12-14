package Varazslatok;

import Egysegek.EgysegLathatosag;
import Egysegek.Eletero;
import Hos.HosTamad;
import Hos.Tulajdonsagok.Varazsero;

import javax.swing.*;

import static Ablakok.Csapat.ablakCsapat;
import static Egysegek.EgysegLetetel.*;
import static Egysegek.Sebzes.egysegPozTorlese;
import static Ellenfel.EllenfelEgysege.*;
import static Ellenfel.EllenfelMuveletei.*;
import static Ellenfel.EllenfelTamad.*;
import static Ellenfel.EllenfelTulajdonsaga.*;
import static Hos.HosTamad.KiKicsoda;
import static Hos.HosTamad.holVagyHos;
import static Hos.Tulajdonsagok.Tudas.manna;
import static Hos.Tulajdonsagok.Tudas.mannaErtek;
import static Hos.Tulajdonsagok.Tulajdonsagai.arany;
import static Hos.Tulajdonsagok.Tulajdonsagai.aranyErteke;
import static Jatek.JatekAblak.*;
import static Jatek.Sorrend.*;
import static Jatek.XYKordinatakBemenet.*;
import static Varazslatok.Varazslat.nevVarazslat;
import static Varazslatok.Varazslat.nevVarazslatErtek;


public class Tuzlabda {

    static JButton plusszGombTuzlabda;
    static JButton minuszGombTuzlabda;

    public Tuzlabda() {
        plusszGombTuzlabda = new JButton();
        minuszGombTuzlabda = new JButton();

        plusszGombTuzlabda.addActionListener(e -> {
            if (tuzlabdapipa==0 && arany-120>=0) {
                tuzlabdapipa=1;
                arany-=120;
                tuzlabdaKep.setVisible(false);
                nevVarazslatErtek.setText("<html><u>Tűzvarázslat:</u><p>    Egy területet kiválasztva</p><p> " +
                        "3x3 körben saját és ellenséges</p><p> egységeket sebez (varázserő * 20)</p>" +
                        "<p><u>Manna költsége: 9</u></p></html>");
                System.out.println("Tuzlabda megvasarolva");
            }
            aranyErteke.setText(String.valueOf(arany));
        });

        minuszGombTuzlabda.addActionListener(e -> {
            if (tuzlabdapipa==1) {
                tuzlabdapipa=0;
                arany+=120;
                tuzlabdaKep.setVisible(true);
                System.out.println("Tuzlabda eladva");
            }
            aranyErteke.setText(String.valueOf(arany));
        });
    }

    public static JPanel tuzlabdaKep = new JPanel();
    public static JLabel tuzlabdaKepe = new JLabel();

    public static ImageIcon tuzlabda = new ImageIcon("Kepek/varazslatok/tuzlabdaff.png");

    public static int tuzlabdapipa=0;

    public static void tuzlabda() {

        nevVarazslat.add(nevVarazslatErtek);
        nevVarazslat.setOpaque(false);
        nevVarazslat.repaint();
        ablakCsapat.add(nevVarazslat);

        plusszGombTuzlabda.setBounds(1159, 67, 25, 25);
        plusszGombTuzlabda.setOpaque(false);
        plusszGombTuzlabda.setContentAreaFilled(false);
        plusszGombTuzlabda.setBorderPainted(false);
        plusszGombTuzlabda.setFocusable(false);

        minuszGombTuzlabda.setBounds(1131, 67, 25, 25);
        minuszGombTuzlabda.setOpaque(false);
        minuszGombTuzlabda.setContentAreaFilled(false);
        minuszGombTuzlabda.setBorderPainted(false);
        minuszGombTuzlabda.setFocusable(false);

        tuzlabdaKep.setBounds(1189,46,55,60);

        tuzlabdaKepe.setIcon(tuzlabda);
        tuzlabdaKep.add(tuzlabdaKepe);
        tuzlabdaKep.setOpaque(false);
        ablakCsapat.add(tuzlabdaKep);

        ablakCsapat.add(plusszGombTuzlabda);
        ablakCsapat.add(minuszGombTuzlabda);
    }


    public static void tuzlabdaElsutese(int sor, int oszlop) {

        int sugarSor,sugarOszlop;
        for (int i=-1;i<=1;i++) {
            for (int j=-1;j<=1;j++) {
                sugarSor=sor+i;
                sugarOszlop=oszlop+j;
                if (sugarSor == 10 && sugarOszlop == 1 && sor10oszlop1) {
                    tuzlabaSebzese(sor10oszlop1Nev,10,1);
                } else if (sugarSor == 10 && sugarOszlop == 2 && sor10oszlop2) {
                    tuzlabaSebzese(sor10oszlop2Nev,10,2);
                } else if (sugarSor == 9 && sugarOszlop == 1 && sor9oszlop1) {
                    tuzlabaSebzese( sor9oszlop1Nev,9,1);
                } else if (sugarSor == 9 && sugarOszlop == 2 && sor9oszlop2) {
                    tuzlabaSebzese( sor9oszlop2Nev,9,2);
                } else if (sugarSor == 8 && sugarOszlop == 1 && sor8oszlop1) {
                    tuzlabaSebzese( sor8oszlop1Nev,8,1);
                } else if (sugarSor == 8 && sugarOszlop == 2 && sor8oszlop2) {
                    tuzlabaSebzese( sor8oszlop2Nev,8,2);
                } else if (sugarSor == 7 && sugarOszlop == 1 && sor7oszlop1) {
                    tuzlabaSebzese( sor7oszlop1Nev,7,1);
                } else if (sugarSor == 7 && sugarOszlop == 2 && sor7oszlop2) {
                    tuzlabaSebzese( sor7oszlop2Nev,7,2);
                } else if (sugarSor == 6 && sugarOszlop == 1 && sor6oszlop1) {
                    tuzlabaSebzese( sor6oszlop1Nev,6,1);
                } else if (sugarSor == 6 && sugarOszlop == 2 && sor6oszlop2) {
                    tuzlabaSebzese( sor6oszlop2Nev,6,2);
                } else if (sugarSor == 5 && sugarOszlop == 1 && sor5oszlop1) {
                    tuzlabaSebzese( sor5oszlop1Nev,5,1);
                } else if (sugarSor == 5 && sugarOszlop == 2 && sor5oszlop2) {
                    tuzlabaSebzese( sor5oszlop2Nev,5,2);
                } else if (sugarSor == 4 && sugarOszlop == 1 && sor4oszlop1) {
                    tuzlabaSebzese( sor4oszlop1Nev,4,1);
                } else if (sugarSor == 4 && sugarOszlop == 2 && sor4oszlop2) {
                    tuzlabaSebzese( sor4oszlop2Nev,4,2);
                } else if (sugarSor == 3 && sugarOszlop == 1 && sor3oszlop1) {
                    tuzlabaSebzese( sor3oszlop1Nev,3,1);
                } else if (sugarSor == 3 && sugarOszlop == 2 && sor3oszlop2) {
                    tuzlabaSebzese( sor3oszlop2Nev,3,2);
                } else if (sugarSor == 2 && sugarOszlop == 1 && sor2oszlop1) {
                    tuzlabaSebzese( sor2oszlop1Nev,2,1);
                } else if (sugarSor == 2 && sugarOszlop == 2 && sor2oszlop2) {
                    tuzlabaSebzese( sor2oszlop2Nev,2,2);
                } else if (sugarSor == 1 && sugarOszlop == 1 && sor1oszlop1) {
                    tuzlabaSebzese( sor1oszlop1Nev,1,1);
                } else if (sugarSor == 1 && sugarOszlop == 2 && sor1oszlop2) {
                    tuzlabaSebzese( sor1oszlop2Nev,1,2);
                } else if (sugarSor == 8 && sugarOszlop == 3 && sor8oszlop3) {
                    tuzlabaSebzese( sor8oszlop3Nev,8,3);
                } else if (sugarSor == 7 && sugarOszlop == 3 && sor7oszlop3) {
                    tuzlabaSebzese( sor7oszlop3Nev,7,3);
                } else if (sugarSor == 6 && sugarOszlop == 3 && sor6oszlop3) {
                    tuzlabaSebzese( sor6oszlop3Nev,6,3);
                } else if (sugarSor == 5 && sugarOszlop == 3 && sor5oszlop3) {
                    tuzlabaSebzese( sor5oszlop3Nev,5,3);
                } else if (sugarSor == 4 && sugarOszlop == 3 && sor4oszlop3) {
                    tuzlabaSebzese( sor4oszlop3Nev,4,3);
                } else if (sugarSor == 3 && sugarOszlop == 3 && sor3oszlop3) {
                    tuzlabaSebzese( sor3oszlop3Nev,3,3);
                } else if (sugarSor == 2 && sugarOszlop == 3 && sor2oszlop3) {
                    tuzlabaSebzese( sor2oszlop3Nev,2,3);
                } else if (sugarSor == 1 && sugarOszlop == 3 && sor1oszlop3) {
                    tuzlabaSebzese( sor1oszlop3Nev,1,3);
                } else if (sugarSor == 8 && sugarOszlop == 4 && sor8oszlop4) {
                    tuzlabaSebzese( sor8oszlop4Nev,8,4);
                } else if (sugarSor == 7 && sugarOszlop == 4 && sor7oszlop4) {
                    tuzlabaSebzese( sor7oszlop4Nev,7,4);
                } else if (sugarSor == 5 && sugarOszlop == 4 && sor5oszlop4) {
                    tuzlabaSebzese( sor5oszlop4Nev,5,4);
                } else if (sugarSor == 4 && sugarOszlop == 4 && sor4oszlop4) {
                    tuzlabaSebzese( sor4oszlop4Nev,4,4);
                } else if (sugarSor == 3 && sugarOszlop == 4 && sor3oszlop4) {
                    tuzlabaSebzese( sor3oszlop4Nev,3,4);
                } else if (sugarSor == 2 && sugarOszlop == 4 && sor2oszlop4) {
                    tuzlabaSebzese( sor2oszlop4Nev,2,4);
                } else if (sugarSor == 1 && sugarOszlop == 4 && sor1oszlop4) {
                    tuzlabaSebzese( sor1oszlop4Nev,1,4);
                } else if (sugarSor == 10 && sugarOszlop == 5 && sor10oszlop5) {
                    tuzlabaSebzese(sor10oszlop5Nev,10,5);
                } else if (sugarSor == 9 && sugarOszlop == 5 && sor9oszlop5) {
                    tuzlabaSebzese( sor9oszlop5Nev,9,5);
                } else if (sugarSor == 8 && sugarOszlop == 5 && sor8oszlop5) {
                    tuzlabaSebzese( sor8oszlop5Nev,8,5);
                } else if (sugarSor == 7 && sugarOszlop == 5 && sor7oszlop5) {
                    tuzlabaSebzese( sor7oszlop5Nev,7,5);
                } else if (sugarSor == 6 && sugarOszlop == 5 && sor6oszlop5) {
                    tuzlabaSebzese( sor6oszlop5Nev,6,5);
                } else if (sugarSor == 5 && sugarOszlop == 5 && sor5oszlop5) {
                    tuzlabaSebzese( sor5oszlop5Nev,5,5);
                } else if (sugarSor == 4 && sugarOszlop == 5 && sor4oszlop5) {
                    tuzlabaSebzese( sor4oszlop5Nev,4,5);
                } else if (sugarSor == 3 && sugarOszlop == 5 && sor3oszlop5) {
                    tuzlabaSebzese( sor3oszlop5Nev,3,5);
                } else if (sugarSor == 2 && sugarOszlop == 5 && sor2oszlop5) {
                    tuzlabaSebzese( sor2oszlop5Nev,2,5);
                } else if (sugarSor == 1 && sugarOszlop == 5 && sor1oszlop5) {
                    tuzlabaSebzese( sor1oszlop5Nev,1,5);
                } else if (sugarSor == 10 && sugarOszlop == 6 && sor10oszlop6) {
                    tuzlabaSebzese(sor10oszlop6Nev,10,6);
                } else if (sugarSor == 9 && sugarOszlop == 6 && sor9oszlop6) {
                    tuzlabaSebzese( sor9oszlop6Nev,9,6);
                } else if (sugarSor == 7 && sugarOszlop == 6 && sor7oszlop6) {
                    tuzlabaSebzese( sor7oszlop6Nev,7,6);
                } else if (sugarSor == 6 && sugarOszlop == 6 && sor6oszlop6) {
                    tuzlabaSebzese( sor6oszlop6Nev,6,6);
                } else if (sugarSor == 5 && sugarOszlop == 6 && sor5oszlop6) {
                    tuzlabaSebzese( sor5oszlop6Nev,5,6);
                } else if (sugarSor == 4 && sugarOszlop == 6 && sor4oszlop6) {
                    tuzlabaSebzese( sor4oszlop6Nev,4,6);
                } else if (sugarSor == 3 && sugarOszlop == 6 && sor3oszlop6) {
                    tuzlabaSebzese( sor3oszlop6Nev,3,6);
                } else if (sugarSor == 2 && sugarOszlop == 6 && sor2oszlop6) {
                    tuzlabaSebzese( sor2oszlop6Nev,2,6);
                } else if (sugarSor == 1 && sugarOszlop == 6 && sor1oszlop6) {
                    tuzlabaSebzese( sor1oszlop6Nev,1,6);
                } else if (sugarSor == 10 && sugarOszlop == 7 && sor10oszlop7) {
                    tuzlabaSebzese(sor10oszlop7Nev,10,7);
                } else if (sugarSor == 9 && sugarOszlop == 7 && sor9oszlop7) {
                    tuzlabaSebzese( sor9oszlop7Nev,9,7);
                } else if (sugarSor == 7 && sugarOszlop == 7 && sor7oszlop7) {
                    tuzlabaSebzese( sor7oszlop7Nev,7,7);
                } else if (sugarSor == 6 && sugarOszlop == 7 && sor6oszlop7) {
                    tuzlabaSebzese( sor6oszlop7Nev,6,7);
                } else if (sugarSor == 5 && sugarOszlop == 7 && sor5oszlop7) {
                    tuzlabaSebzese( sor5oszlop7Nev,5,7);
                } else if (sugarSor == 4 && sugarOszlop == 7 && sor4oszlop7) {
                    tuzlabaSebzese( sor4oszlop7Nev,4,7);
                } else if (sugarSor == 3 && sugarOszlop == 7 && sor3oszlop7) {
                    tuzlabaSebzese( sor3oszlop7Nev,3,7);
                } else if (sugarSor == 2 && sugarOszlop == 7 && sor2oszlop7) {
                    tuzlabaSebzese( sor2oszlop7Nev,2,7);
                } else if (sugarSor == 1 && sugarOszlop == 7 && sor1oszlop7) {
                    tuzlabaSebzese( sor1oszlop7Nev,1,7);
                } else if (sugarSor == 10 && sugarOszlop == 8 && sor10oszlop8) {
                    tuzlabaSebzese(sor10oszlop8Nev,10,8);
                } else if (sugarSor == 9 && sugarOszlop == 8 && sor9oszlop8) {
                    tuzlabaSebzese( sor9oszlop8Nev,9,8);
                } else if (sugarSor == 8 && sugarOszlop == 8 && sor8oszlop8) {
                    tuzlabaSebzese( sor8oszlop8Nev,8,8);
                } else if (sugarSor == 6 && sugarOszlop == 8 && sor6oszlop8) {
                    tuzlabaSebzese( sor6oszlop8Nev,6,8);
                } else if (sugarSor == 5 && sugarOszlop == 8 && sor5oszlop8) {
                    tuzlabaSebzese( sor5oszlop8Nev,5,8);
                } else if (sugarSor == 4 && sugarOszlop == 8 && sor4oszlop8) {
                    tuzlabaSebzese( sor4oszlop8Nev,4,8);
                } else if (sugarSor == 3 && sugarOszlop == 8 && sor3oszlop8) {
                    tuzlabaSebzese( sor3oszlop8Nev,3,8);
                } else if (sugarSor == 2 && sugarOszlop == 8 && sor2oszlop8) {
                    tuzlabaSebzese( sor2oszlop8Nev,2,8);
                } else if (sugarSor == 1 && sugarOszlop == 8 && sor1oszlop8) {
                    tuzlabaSebzese( sor1oszlop8Nev,1,8);
                } else if (sugarSor == 10 && sugarOszlop == 9 && sor10oszlop9) {
                    tuzlabaSebzese(sor10oszlop9Nev,10,9);
                } else if (sugarSor == 9 && sugarOszlop == 9 && sor9oszlop9) {
                    tuzlabaSebzese( sor9oszlop9Nev,9,9);
                } else if (sugarSor == 8 && sugarOszlop == 9 && sor8oszlop9) {
                    tuzlabaSebzese( sor8oszlop9Nev,8,9);
                } else if (sugarSor == 6 && sugarOszlop == 9 && sor6oszlop9) {
                    tuzlabaSebzese( sor6oszlop9Nev,6,9);
                } else if (sugarSor == 5 && sugarOszlop == 9 && sor5oszlop9) {
                    tuzlabaSebzese( sor5oszlop9Nev,5,9);
                } else if (sugarSor == 4 && sugarOszlop == 9 && sor4oszlop9) {
                    tuzlabaSebzese( sor4oszlop9Nev,4,9);
                } else if (sugarSor == 3 && sugarOszlop == 9 && sor3oszlop9) {
                    tuzlabaSebzese( sor3oszlop9Nev,3,9);
                } else if (sugarSor == 2 && sugarOszlop == 9 && sor2oszlop9) {
                    tuzlabaSebzese( sor2oszlop9Nev,2,9);
                } else if (sugarSor == 1 && sugarOszlop == 9 && sor1oszlop9) {
                    tuzlabaSebzese( sor1oszlop9Nev,1,9);
                } else if (sugarSor == 10 && sugarOszlop == 10 && sor10oszlop10) {
                    tuzlabaSebzese(sor10oszlop10Nev,10,10);
                } else if (sugarSor == 9 && sugarOszlop == 10 && sor9oszlop10) {
                    tuzlabaSebzese(sor9oszlop10Nev,9,10);
                } else if (sugarSor == 8 && sugarOszlop == 10 && sor8oszlop10) {
                    tuzlabaSebzese(sor8oszlop10Nev,8,10);
                } else if (sugarSor == 7 && sugarOszlop == 10 && sor7oszlop10) {
                    tuzlabaSebzese(sor7oszlop10Nev,7,10);
                } else if (sugarSor == 6 && sugarOszlop == 10 && sor6oszlop10) {
                    tuzlabaSebzese(sor6oszlop10Nev,6,10);
                } else if (sugarSor == 5 && sugarOszlop == 10 && sor5oszlop10) {
                    tuzlabaSebzese(sor5oszlop10Nev,5,10);
                } else if (sugarSor == 4 && sugarOszlop == 10 && sor4oszlop10) {
                    tuzlabaSebzese(sor4oszlop10Nev,4,10);
                } else if (sugarSor == 3 && sugarOszlop == 10 && sor3oszlop10) {
                    tuzlabaSebzese(sor3oszlop10Nev,3,10);
                } else if (sugarSor == 2 && sugarOszlop == 10 && sor2oszlop10) {
                    tuzlabaSebzese(sor2oszlop10Nev,2,10);
                } else if (sugarSor == 1 && sugarOszlop == 10 && sor1oszlop10) {
                    tuzlabaSebzese(sor1oszlop10Nev,1,10);
                } else if (sugarSor == 10 && sugarOszlop == 11 && sor10oszlop11) {
                    tuzlabaSebzese(sor10oszlop11Nev,10,11);
                } else if (sugarSor == 9 && sugarOszlop == 11 && sor9oszlop11) {
                    tuzlabaSebzese(sor9oszlop11Nev,9,11);
                } else if (sugarSor == 8 && sugarOszlop == 11 && sor8oszlop11) {
                    tuzlabaSebzese(sor8oszlop11Nev,8,11);
                } else if (sugarSor == 7 && sugarOszlop == 11 && sor7oszlop11) {
                    tuzlabaSebzese(sor7oszlop11Nev,7,11);
                } else if (sugarSor == 6 && sugarOszlop == 11 && sor6oszlop11) {
                    tuzlabaSebzese(sor6oszlop11Nev,6,11);
                } else if (sugarSor == 5 && sugarOszlop == 11 && sor5oszlop11) {
                    tuzlabaSebzese(sor5oszlop11Nev,5,11);
                } else if (sugarSor == 4 && sugarOszlop == 11 && sor4oszlop11) {
                    tuzlabaSebzese(sor4oszlop11Nev,4,11);
                } else if (sugarSor == 3 && sugarOszlop == 11 && sor3oszlop11) {
                    tuzlabaSebzese(sor3oszlop11Nev,3,11);
                } else if (sugarSor == 2 && sugarOszlop == 11 && sor2oszlop11) {
                    tuzlabaSebzese(sor2oszlop11Nev,2,11);
                } else if (sugarSor == 1 && sugarOszlop == 11 && sor1oszlop11) {
                    tuzlabaSebzese(sor1oszlop11Nev,1,11);
                } else if (sugarSor == 10 && sugarOszlop == 12 && sor10oszlop12) {
                    tuzlabaSebzese(sor10oszlop12Nev,10,12);
                } else if (sugarSor == 9 && sugarOszlop == 12 && sor9oszlop12) {
                    tuzlabaSebzese(sor9oszlop12Nev,9,12);
                } else if (sugarSor == 8 && sugarOszlop == 12 && sor8oszlop12) {
                    tuzlabaSebzese(sor8oszlop12Nev,8,12);
                } else if (sugarSor == 7 && sugarOszlop == 12 && sor7oszlop12) {
                    tuzlabaSebzese(sor7oszlop12Nev,7,12);
                } else if (sugarSor == 6 && sugarOszlop == 12 && sor6oszlop12) {
                    tuzlabaSebzese(sor6oszlop12Nev,6,12);
                } else if (sugarSor == 5 && sugarOszlop == 12 && sor5oszlop12) {
                    tuzlabaSebzese(sor5oszlop12Nev,5,12);
                } else if (sugarSor == 4 && sugarOszlop == 12 && sor4oszlop12) {
                    tuzlabaSebzese(sor4oszlop12Nev,4,12);
                } else if (sugarSor == 3 && sugarOszlop == 12 && sor3oszlop12) {
                    tuzlabaSebzese(sor3oszlop12Nev,3,12);
                } else if (sugarSor == 2 && sugarOszlop == 12 && sor2oszlop12) {
                    tuzlabaSebzese(sor2oszlop12Nev,2,12);
                } else if (sugarSor == 1 && sugarOszlop == 12 && sor1oszlop12) {
                    tuzlabaSebzese(sor1oszlop12Nev,1,12);
                }
            }
        }
        if (!ellenfelHosKovetkezik) {
        manna -= 9;
        mannaErtek.setText(String.valueOf(manna));

        KiKicsoda();
        HosTamad.mutato = 0;
        holVagyHos();

        hosTuzlabdaGombBenyomva=false;

        gyozelemVereseg();
        } else {
        ellenfelManna -= 9;
        ellenfelMannaErtek.setText(String.valueOf(ellenfelManna));

        kiKicsodaEll();
        mutatoEll = 0;
        holVagyEllHos();

        gyozelemVereseg();
        }

        if (!vege) {
            if (!ellenfelHosKovetkezik) {
            double ujErtek2 = moralSorrendTList.get(HosTamad.mutato);

            moralSorrendTList.remove(HosTamad.mutato);
            moralSorrendTList.add(ujErtek2);

            System.out.println(moralSorrendTList);
            System.out.println(elsoHely+"  "+masodikHely);
            hanyadikKor(elsoHely);
            korokKiirasa();

            sorrendFrissites();
            } else {
            double ujErtek2 = moralSorrendTList.get(mutatoEll);

            moralSorrendTList.remove(mutatoEll);
            moralSorrendTList.add(ujErtek2);

            System.out.println(moralSorrendTList);
            System.out.println(elsoHely+"  "+masodikHely);
            hanyadikKor(elsoHely);
            korokKiirasa();

            sorrendFrissites();
            }
        }
    }


    public static void tuzlabaSebzese(String egyseg, int sor, int oszlop) {

        System.out.println(egyseg +sor+oszlop);

        if (!egyseg.equals("n")) {
            switch (egyseg) {
                case "efoldmuv" -> {
                    if (!ellenfelHosKovetkezik) {
                        Eletero.elsoEllEgysegEletero -= Varazsero.varazseroErtek * 20;
                    } else {
                        Eletero.elsoEllEgysegEletero -= ellenfelVarazsero * 20;
                    }
                    ellenfelDbSzamElso = Eletero.elsoEllEgysegEletero / 3;
                    if (Eletero.elsoEllEgysegEletero > 0) {

                        egysegekSorrend.remove(ellenfelEgysegIras1);
                        egysegekSorrend.remove(ellenfelEgysegL1Kep);

                        if (ellenfelDbSzamElso < 10) {
                            ellenfelEgysegErtek1.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamElso)));
                        } else {
                            ellenfelEgysegErtek1.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamElso)));
                        }
                        
                        if (!ellenfelHosKovetkezik) {
                            informacioErtek.setText("<html><center>" + egyseg + " egységet tűzlabdázták,<p>" + Varazsero.varazseroErtek * 20 + " sebzést szenvedett " +
                            "és " + Eletero.elsoEllEgysegEletero + " életereje maradt.</p></center></html>");
                        } else {
                            informacioErtek.setText("<html><center>" + egyseg + " egységet tűzlabdázták,<p>" + ellenfelVarazsero * 20 + " sebzést szenvedett " +
                            "és " + Eletero.elsoEllEgysegEletero + " életereje maradt.</p></center></html>");
                        }

                        ellenfelEgysegIras1.add(ellenfelEgysegErtek1);
                        ellenfelEgysegL1Kep.add(ellenfelEgysegL1Kepe);
                        EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras1, ellenfelEgysegL1Kep, oszlop, sor);
                        ablakCsata.add(egysegekSorrend);
                    } else {
                        egysegekSorrend.remove(ellenfelEgysegIras1);
                        egysegekSorrend.remove(ellenfelEgysegL1Kep);

                        efoldmuv = 0;
                        egysegPozTorlese("efoldmuv", sor, oszlop);
                        
                        if (!ellenfelHosKovetkezik) {
                            informacioErtek.setText("<html><center>" + egyseg + " egységetet tűzlabdázták,<p> " + Varazsero.varazseroErtek * 20 + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                        } else {
                            informacioErtek.setText("<html><center>" + egyseg + " egységetet tűzlabdázták,<p> " + ellenfelVarazsero * 20 + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                        }
                    }
                }
                case "ecsont" -> {
                    if (!ellenfelHosKovetkezik) {
                        Eletero.elsoEllEgysegEletero -= Varazsero.varazseroErtek * 20;
                    } else {
                        Eletero.elsoEllEgysegEletero -= ellenfelVarazsero * 20;
                    }
                    ellenfelDbSzamElso = Eletero.elsoEllEgysegEletero / 2;
                    if (Eletero.elsoEllEgysegEletero > 0) {

                        egysegekSorrend.remove(ellenfelEgysegIras1);
                        egysegekSorrend.remove(ellenfelEgysegL1Kep);

                        if (ellenfelDbSzamElso < 10) {
                            ellenfelEgysegErtek1.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamElso)));
                        } else {
                            ellenfelEgysegErtek1.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamElso)));
                        }
                        
                        if (!ellenfelHosKovetkezik) {
                            informacioErtek.setText("<html><center>" + egyseg + " egységet tűzlabdázták,<p>" + Varazsero.varazseroErtek * 20 + " sebzést szenvedett " +
                            "és " + Eletero.elsoEllEgysegEletero + " életereje maradt.</p></center></html>");
                        } else {
                            informacioErtek.setText("<html><center>" + egyseg + " egységet tűzlabdázták,<p>" + ellenfelVarazsero * 20 + " sebzést szenvedett " +
                            "és " + Eletero.elsoEllEgysegEletero + " életereje maradt.</p></center></html>");
                        }

                        ellenfelEgysegIras1.add(ellenfelEgysegErtek1);
                        ellenfelEgysegL1Kep.add(ellenfelEgysegL1Kepe);
                        EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras1, ellenfelEgysegL1Kep, oszlop, sor);
                        ablakCsata.add(egysegekSorrend);
                    } else {
                        egysegekSorrend.remove(ellenfelEgysegIras1);
                        egysegekSorrend.remove(ellenfelEgysegL1Kep);

                        ecsont = 0;
                        egysegPozTorlese("ecsont", sor, oszlop);
                        
                        if (!ellenfelHosKovetkezik) {
                            informacioErtek.setText("<html><center>" + egyseg + " egységetet tűzlabdázták,<p> " + Varazsero.varazseroErtek * 20 + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                        } else {
                            informacioErtek.setText("<html><center>" + egyseg + " egységetet tűzlabdázták,<p> " + ellenfelVarazsero * 20 + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                        }
                    }
                }
                case "efelder" -> {
                    if (!ellenfelHosKovetkezik) {
                        Eletero.masodikEllEgysegEletero -= Varazsero.varazseroErtek * 20;
                    } else {
                        Eletero.masodikEllEgysegEletero -= ellenfelVarazsero * 20;
                    }
                    ellenfelDbSzamMasodik = Eletero.masodikEllEgysegEletero / 10;
                    if (Eletero.masodikEllEgysegEletero > 0) {

                        egysegekSorrend.remove(ellenfelEgysegIras2);
                        egysegekSorrend.remove(ellenfelEgysegL2Kep);

                        if (ellenfelDbSzamMasodik < 10) {
                            ellenfelEgysegErtek2.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamMasodik)));
                        } else {
                            ellenfelEgysegErtek2.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamMasodik)));
                        }
                        
                        if (!ellenfelHosKovetkezik) {
                            informacioErtek.setText("<html><center>" + egyseg + " egységet tűzlabdázták,<p>" + Varazsero.varazseroErtek * 20 + " sebzést szenvedett " +
                            "és " + Eletero.masodikEllEgysegEletero + " életereje maradt.</p></center></html>");
                        } else {
                            informacioErtek.setText("<html><center>" + egyseg + " egységet tűzlabdázták,<p>" + ellenfelVarazsero * 20 + " sebzést szenvedett " +
                            "és " + Eletero.masodikEllEgysegEletero + " életereje maradt.</p></center></html>");
                        }

                        ellenfelEgysegIras2.add(ellenfelEgysegErtek2);
                        ellenfelEgysegL2Kep.add(ellenfelEgysegL2Kepe);
                        EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras2, ellenfelEgysegL2Kep, oszlop, sor);
                        ablakCsata.add(egysegekSorrend);
                    } else {
                        egysegekSorrend.remove(ellenfelEgysegIras2);
                        egysegekSorrend.remove(ellenfelEgysegL2Kep);

                        efelder = 0;
                        egysegPozTorlese("efelder", sor, oszlop);
                        
                        if (!ellenfelHosKovetkezik) {
                            informacioErtek.setText("<html><center>" + egyseg + " egységetet tűzlabdázták,<p> " + Varazsero.varazseroErtek * 20 + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                        } else {
                            informacioErtek.setText("<html><center>" + egyseg + " egységetet tűzlabdázták,<p> " + ellenfelVarazsero * 20 + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                        }
                    }
                }
                case "eijas" -> {
                    if (!ellenfelHosKovetkezik) {
                        Eletero.masodikEllEgysegEletero -= Varazsero.varazseroErtek * 20;
                    } else {
                        Eletero.masodikEllEgysegEletero -= ellenfelVarazsero * 20;
                    }
                    ellenfelDbSzamMasodik = Eletero.masodikEllEgysegEletero / 7;
                    if (Eletero.masodikEllEgysegEletero > 0) {

                        egysegekSorrend.remove(ellenfelEgysegIras2);
                        egysegekSorrend.remove(ellenfelEgysegL2Kep);

                        if (ellenfelDbSzamMasodik < 10) {
                            ellenfelEgysegErtek2.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamMasodik)));
                        } else {
                            ellenfelEgysegErtek2.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamMasodik)));
                        }
                        
                        if (!ellenfelHosKovetkezik) {
                            informacioErtek.setText("<html><center>" + egyseg + " egységet tűzlabdázták,<p>" + Varazsero.varazseroErtek * 20 + " sebzést szenvedett " +
                            "és " + Eletero.masodikEllEgysegEletero + " életereje maradt.</p></center></html>");
                        } else {
                            informacioErtek.setText("<html><center>" + egyseg + " egységet tűzlabdázták,<p>" + ellenfelVarazsero * 20 + " sebzést szenvedett " +
                            "és " + Eletero.masodikEllEgysegEletero + " életereje maradt.</p></center></html>");
                        }

                        ellenfelEgysegIras2.add(ellenfelEgysegErtek2);
                        ellenfelEgysegL2Kep.add(ellenfelEgysegL2Kepe);
                        EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras2, ellenfelEgysegL2Kep, oszlop, sor);
                        ablakCsata.add(egysegekSorrend);
                    } else {
                        egysegekSorrend.remove(ellenfelEgysegIras2);
                        egysegekSorrend.remove(ellenfelEgysegL2Kep);

                        eijas = 0;
                        egysegPozTorlese("eijas", sor, oszlop);
                        
                        if (!ellenfelHosKovetkezik) {
                            informacioErtek.setText("<html><center>" + egyseg + " egységetet tűzlabdázták,<p> " + Varazsero.varazseroErtek * 20 + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                        } else {
                            informacioErtek.setText("<html><center>" + egyseg + " egységetet tűzlabdázták,<p> " + ellenfelVarazsero * 20 + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                        }
                    }
                }
                case "emino" -> {
                    if (!ellenfelHosKovetkezik) {
                        Eletero.harmadikEllEgysegEletero -= Varazsero.varazseroErtek * 20;
                    } else {
                        Eletero.harmadikEllEgysegEletero -= ellenfelVarazsero * 20;
                    }
                    ellenfelDbSzamHarmadik = Eletero.harmadikEllEgysegEletero / 80;
                    if (Eletero.harmadikEllEgysegEletero > 0) {

                        egysegekSorrend.remove(ellenfelEgysegIras3);
                        egysegekSorrend.remove(ellenfelEgysegL3Kep);

                        if (ellenfelDbSzamHarmadik < 10) {
                            ellenfelEgysegErtek3.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamHarmadik)));
                        } else {
                            ellenfelEgysegErtek3.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamHarmadik)));
                        }
                        
                        if (!ellenfelHosKovetkezik) {
                            informacioErtek.setText("<html><center>" + egyseg + " egységet tűzlabdázták,<p>" + Varazsero.varazseroErtek * 20 + " sebzést szenvedett " +
                            "és " + Eletero.harmadikEllEgysegEletero + " életereje maradt.</p></center></html>");
                        } else {
                            informacioErtek.setText("<html><center>" + egyseg + " egységet tűzlabdázták,<p>" + ellenfelVarazsero * 20 + " sebzést szenvedett " +
                            "és " + Eletero.harmadikEllEgysegEletero + " életereje maradt.</p></center></html>");
                        }

                        ellenfelEgysegIras3.add(ellenfelEgysegErtek3);
                        ellenfelEgysegL3Kep.add(ellenfelEgysegL3Kepe);
                        EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras3, ellenfelEgysegL3Kep, oszlop, sor);
                        ablakCsata.add(egysegekSorrend);
                    } else {
                        egysegekSorrend.remove(ellenfelEgysegIras3);
                        egysegekSorrend.remove(ellenfelEgysegL3Kep);

                        emino = 0;
                        egysegPozTorlese("emino", sor, oszlop);
                        
                        if (!ellenfelHosKovetkezik) {
                            informacioErtek.setText("<html><center>" + egyseg + " egységetet tűzlabdázták,<p> " + Varazsero.varazseroErtek * 20 + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                        } else {
                            informacioErtek.setText("<html><center>" + egyseg + " egységetet tűzlabdázták,<p> " + ellenfelVarazsero * 20 + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                        }
                    }
                }
                case "egrif" -> {
                    if (!ellenfelHosKovetkezik) {
                        Eletero.harmadikEllEgysegEletero -= Varazsero.varazseroErtek * 20;
                    } else {
                        Eletero.harmadikEllEgysegEletero -= ellenfelVarazsero * 20;
                    }
                    ellenfelDbSzamHarmadik = Eletero.harmadikEllEgysegEletero / 30;
                    if (Eletero.harmadikEllEgysegEletero > 0) {

                        egysegekSorrend.remove(ellenfelEgysegIras3);
                        egysegekSorrend.remove(ellenfelEgysegL3Kep);

                        if (ellenfelDbSzamHarmadik < 10) {
                            ellenfelEgysegErtek3.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamHarmadik)));
                        } else {
                            ellenfelEgysegErtek3.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamHarmadik)));
                        }
                        
                        if (!ellenfelHosKovetkezik) {
                            informacioErtek.setText("<html><center>" + egyseg + " egységet tűzlabdázták,<p>" + Varazsero.varazseroErtek * 20 + " sebzést szenvedett " +
                            "és " + Eletero.harmadikEllEgysegEletero + " életereje maradt.</p></center></html>");
                        } else {
                            informacioErtek.setText("<html><center>" + egyseg + " egységet tűzlabdázták,<p>" + ellenfelVarazsero * 20 + " sebzést szenvedett " +
                            "és " + Eletero.harmadikEllEgysegEletero + " életereje maradt.</p></center></html>");
                        }

                        ellenfelEgysegIras3.add(ellenfelEgysegErtek3);
                        ellenfelEgysegL3Kep.add(ellenfelEgysegL3Kepe);
                        EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras3, ellenfelEgysegL3Kep, oszlop, sor);
                        ablakCsata.add(egysegekSorrend);
                    } else {
                        egysegekSorrend.remove(ellenfelEgysegIras3);
                        egysegekSorrend.remove(ellenfelEgysegL3Kep);

                        egrif = 0;
                        egysegPozTorlese("egrif", sor, oszlop);
                        
                        if (!ellenfelHosKovetkezik) {
                            informacioErtek.setText("<html><center>" + egyseg + " egységetet tűzlabdázták,<p> " + Varazsero.varazseroErtek * 20 + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                        } else {
                            informacioErtek.setText("<html><center>" + egyseg + " egységetet tűzlabdázták,<p> " + ellenfelVarazsero * 20 + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                        }
                    }
                }
                case "efegyv" -> {
                    if (!ellenfelHosKovetkezik) {
                        Eletero.negyedikEllEgysegEletero -= Varazsero.varazseroErtek * 20;
                    } else {
                        Eletero.negyedikEllEgysegEletero -= ellenfelVarazsero * 20;
                    }
                    ellenfelDbSzamNegyedik = Eletero.negyedikEllEgysegEletero / 33;
                    if (Eletero.negyedikEllEgysegEletero > 0) {

                        egysegekSorrend.remove(ellenfelEgysegIras4);
                        egysegekSorrend.remove(ellenfelEgysegL4Kep);

                        if (ellenfelDbSzamNegyedik < 10) {
                            ellenfelEgysegErtek4.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamNegyedik)));
                        } else {
                            ellenfelEgysegErtek4.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamNegyedik)));
                        }
                        
                        if (!ellenfelHosKovetkezik) {
                            informacioErtek.setText("<html><center>" + egyseg + " egységet tűzlabdázták,<p>" + Varazsero.varazseroErtek * 20 + " sebzést szenvedett " +
                            "és " + Eletero.negyedikEllEgysegEletero + " életereje maradt.</p></center></html>");
                        } else {
                            informacioErtek.setText("<html><center>" + egyseg + " egységet tűzlabdázták,<p>" + ellenfelVarazsero * 20 + " sebzést szenvedett " +
                            "és " + Eletero.negyedikEllEgysegEletero + " életereje maradt.</p></center></html>");
                        }

                        ellenfelEgysegIras4.add(ellenfelEgysegErtek4);
                        ellenfelEgysegL4Kep.add(ellenfelEgysegL4Kepe);
                        EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras4, ellenfelEgysegL4Kep, oszlop, sor);
                        ablakCsata.add(egysegekSorrend);
                    } else {
                        egysegekSorrend.remove(ellenfelEgysegIras4);
                        egysegekSorrend.remove(ellenfelEgysegL4Kep);

                        efegyv = 0;
                        egysegPozTorlese("efegyv", sor, oszlop);
                        
                        if (!ellenfelHosKovetkezik) {
                            informacioErtek.setText("<html><center>" + egyseg + " egységetet tűzlabdázták,<p> " + Varazsero.varazseroErtek * 20 + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                        } else {
                            informacioErtek.setText("<html><center>" + egyseg + " egységetet tűzlabdázták,<p> " + ellenfelVarazsero * 20 + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                        }
                    }
                }
                case "eorgy" -> {
                    if (!ellenfelHosKovetkezik) {
                        Eletero.negyedikEllEgysegEletero -= Varazsero.varazseroErtek * 20;
                    } else {
                        Eletero.negyedikEllEgysegEletero -= ellenfelVarazsero * 20;
                    }
                    ellenfelDbSzamNegyedik = Eletero.negyedikEllEgysegEletero / 20;
                    if (Eletero.negyedikEllEgysegEletero > 0) {

                        egysegekSorrend.remove(ellenfelEgysegIras4);
                        egysegekSorrend.remove(ellenfelEgysegL4Kep);

                        if (ellenfelDbSzamNegyedik < 10) {
                            ellenfelEgysegErtek4.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamNegyedik)));
                        } else {
                            ellenfelEgysegErtek4.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamNegyedik)));
                        }
                        
                        if (!ellenfelHosKovetkezik) {
                            informacioErtek.setText("<html><center>" + egyseg + " egységet tűzlabdázták,<p>" + Varazsero.varazseroErtek * 20 + " sebzést szenvedett " +
                            "és " + Eletero.negyedikEllEgysegEletero + " életereje maradt.</p></center></html>");
                        } else {
                            informacioErtek.setText("<html><center>" + egyseg + " egységet tűzlabdázták,<p>" + ellenfelVarazsero * 20 + " sebzést szenvedett " +
                            "és " + Eletero.negyedikEllEgysegEletero + " életereje maradt.</p></center></html>");
                        }

                        ellenfelEgysegIras4.add(ellenfelEgysegErtek4);
                        ellenfelEgysegL4Kep.add(ellenfelEgysegL4Kepe);
                        EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras4, ellenfelEgysegL4Kep, oszlop, sor);
                        ablakCsata.add(egysegekSorrend);
                    } else {
                        egysegekSorrend.remove(ellenfelEgysegIras4);
                        egysegekSorrend.remove(ellenfelEgysegL4Kep);

                        eorgy = 0;
                        egysegPozTorlese("eorgy", sor, oszlop);
                        
                        if (!ellenfelHosKovetkezik) {
                            informacioErtek.setText("<html><center>" + egyseg + " egységetet tűzlabdázták,<p> " + Varazsero.varazseroErtek * 20 + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                        } else {
                            informacioErtek.setText("<html><center>" + egyseg + " egységetet tűzlabdázták,<p> " + ellenfelVarazsero * 20 + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                        }
                    }
                }
                case "eharcp" -> {
                    if (!ellenfelHosKovetkezik) {
                        Eletero.otodikEllEgysegEletero -= Varazsero.varazseroErtek * 20;
                    } else {
                        Eletero.otodikEllEgysegEletero -= ellenfelVarazsero * 20;
                    }
                    ellenfelDbSzamOtodik = Eletero.otodikEllEgysegEletero / 54;
                    if (Eletero.otodikEllEgysegEletero > 0) {

                        egysegekSorrend.remove(ellenfelEgysegIras5);
                        egysegekSorrend.remove(ellenfelEgysegL5Kep);

                        if (ellenfelDbSzamOtodik < 10) {
                            ellenfelEgysegErtek5.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamOtodik)));
                        } else {
                            ellenfelEgysegErtek5.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamOtodik)));
                        }
                        
                        if (!ellenfelHosKovetkezik) {
                            informacioErtek.setText("<html><center>" + egyseg + " egységet tűzlabdázták,<p>" + Varazsero.varazseroErtek * 20 + " sebzést szenvedett " +
                            "és " + Eletero.otodikEllEgysegEletero + " életereje maradt.</p></center></html>");
                        } else {
                            informacioErtek.setText("<html><center>" + egyseg + " egységet tűzlabdázták,<p>" + ellenfelVarazsero * 20 + " sebzést szenvedett " +
                            "és " + Eletero.otodikEllEgysegEletero + " életereje maradt.</p></center></html>");
                        }

                        ellenfelEgysegIras5.add(ellenfelEgysegErtek5);
                        ellenfelEgysegL5Kep.add(ellenfelEgysegL5Kepe);
                        EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras5, ellenfelEgysegL5Kep, oszlop, sor);
                        ablakCsata.add(egysegekSorrend);
                    } else {
                        egysegekSorrend.remove(ellenfelEgysegIras5);
                        egysegekSorrend.remove(ellenfelEgysegL5Kep);

                        eharcp = 0;
                        egysegPozTorlese("eharcp", sor, oszlop);
                        
                        if (!ellenfelHosKovetkezik) {
                            informacioErtek.setText("<html><center>" + egyseg + " egységetet tűzlabdázták,<p> " + Varazsero.varazseroErtek * 20 + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                        } else {
                            informacioErtek.setText("<html><center>" + egyseg + " egységetet tűzlabdázták,<p> " + ellenfelVarazsero * 20 + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                        }
                    }
                }
                case "erapt" -> {
                    if (!ellenfelHosKovetkezik) {
                        Eletero.otodikEllEgysegEletero -= Varazsero.varazseroErtek * 20;
                    } else {
                        Eletero.otodikEllEgysegEletero -= ellenfelVarazsero * 20;
                    }
                    ellenfelDbSzamOtodik = Eletero.otodikEllEgysegEletero / 35;
                    if (Eletero.otodikEllEgysegEletero > 0) {

                        egysegekSorrend.remove(ellenfelEgysegIras5);
                        egysegekSorrend.remove(ellenfelEgysegL5Kep);

                        if (ellenfelDbSzamOtodik < 10) {
                            ellenfelEgysegErtek5.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamOtodik)));
                        } else {
                            ellenfelEgysegErtek5.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamOtodik)));
                        }
                        
                        if (!ellenfelHosKovetkezik) {
                            informacioErtek.setText("<html><center>" + egyseg + " egységet tűzlabdázták,<p>" + Varazsero.varazseroErtek * 20 + " sebzést szenvedett " +
                            "és " + Eletero.otodikEllEgysegEletero + " életereje maradt.</p></center></html>");
                        } else {
                            informacioErtek.setText("<html><center>" + egyseg + " egységet tűzlabdázták,<p>" + ellenfelVarazsero * 20 + " sebzést szenvedett " +
                            "és " + Eletero.otodikEllEgysegEletero + " életereje maradt.</p></center></html>");
                        }

                        ellenfelEgysegIras5.add(ellenfelEgysegErtek5);
                        ellenfelEgysegL5Kep.add(ellenfelEgysegL5Kepe);
                        EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras5, ellenfelEgysegL5Kep, oszlop, sor);
                        ablakCsata.add(egysegekSorrend);
                    } else {
                        egysegekSorrend.remove(ellenfelEgysegIras5);
                        egysegekSorrend.remove(ellenfelEgysegL5Kep);

                        erapt = 0;
                        egysegPozTorlese("erapt", sor, oszlop);
                        
                        if (!ellenfelHosKovetkezik) {
                            informacioErtek.setText("<html><center>" + egyseg + " egységetet tűzlabdázták,<p> " + Varazsero.varazseroErtek * 20 + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                        } else {
                            informacioErtek.setText("<html><center>" + egyseg + " egységetet tűzlabdázták,<p> " + ellenfelVarazsero * 20 + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                        }
                    }
                }
                case "csont" -> {
                    if (!ellenfelHosKovetkezik) {
                        Eletero.elsoEgysegEletero -= Varazsero.varazseroErtek * 20;
                    } else {
                        Eletero.elsoEgysegEletero -= ellenfelVarazsero * 20;
                    }
                    dbSzamElso = Eletero.elsoEgysegEletero / 2;
                    if (Eletero.elsoEgysegEletero > 0) {

                        egysegekSorrend.remove(egysegIras1);
                        egysegekSorrend.remove(egysegL1TestKep);

                        if (dbSzamElso < 10) {
                            egysegErtek1.setText(String.valueOf(String.format("%.2f", dbSzamElso)));
                        } else {
                            egysegErtek1.setText(String.valueOf(String.format("%.1f", dbSzamElso)));
                        }
                        
                        if (!ellenfelHosKovetkezik) {
                            informacioErtek.setText("<html><center>" + egyseg + " egységet tűzlabdázták,<p>" + Varazsero.varazseroErtek * 20 + " sebzést szenvedett " +
                            "és " + Eletero.elsoEgysegEletero + " életereje maradt.</p></center></html>");
                        } else {
                            informacioErtek.setText("<html><center>" + egyseg + " egységet tűzlabdázták,<p>" + ellenfelVarazsero * 20 + " sebzést szenvedett " +
                            "és " + Eletero.elsoEgysegEletero + " életereje maradt.</p></center></html>");
                        }

                        egysegIras1.add(egysegErtek1);
                        egysegL1TestKep.add(egysegL1TestKepe);
                        EgysegLathatosag.lathatosagSorrend(egysegIras1, egysegL1TestKep, oszlop, sor);
                        ablakCsata.add(egysegekSorrend);
                    } else {
                        egysegekSorrend.remove(egysegIras1);
                        egysegekSorrend.remove(egysegL1TestKep);

                        csont = 0;
                        egysegPozTorlese("csont", sor, oszlop);
                        
                        if (!ellenfelHosKovetkezik) {
                            informacioErtek.setText("<html><center>" + egyseg + " egységetet tűzlabdázták,<p> " + Varazsero.varazseroErtek * 20 + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                        } else {
                            informacioErtek.setText("<html><center>" + egyseg + " egységetet tűzlabdázták,<p> " + ellenfelVarazsero * 20 + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                        }
                    }
                }
                case "foldmuv" -> {
                    if (!ellenfelHosKovetkezik) {
                        Eletero.elsoEgysegEletero -= Varazsero.varazseroErtek * 20;
                    } else {
                        Eletero.elsoEgysegEletero -= ellenfelVarazsero * 20;
                    }
                    dbSzamElso = Eletero.elsoEgysegEletero / 3;
                    if (Eletero.elsoEgysegEletero > 0) {

                        egysegekSorrend.remove(egysegIras1);
                        egysegekSorrend.remove(egysegL1TestKep);

                        if (dbSzamElso < 10) {
                            egysegErtek1.setText(String.valueOf(String.format("%.2f", dbSzamElso)));
                        } else {
                            egysegErtek1.setText(String.valueOf(String.format("%.1f", dbSzamElso)));
                        }
                        
                        if (!ellenfelHosKovetkezik) {
                            informacioErtek.setText("<html><center>" + egyseg + " egységet tűzlabdázták,<p>" + Varazsero.varazseroErtek * 20 + " sebzést szenvedett " +
                            "és " + Eletero.elsoEgysegEletero + " életereje maradt.</p></center></html>");
                        } else {
                            informacioErtek.setText("<html><center>" + egyseg + " egységet tűzlabdázták,<p>" + ellenfelVarazsero * 20 + " sebzést szenvedett " +
                            "és " + Eletero.elsoEgysegEletero + " életereje maradt.</p></center></html>");
                        }

                        egysegIras1.add(egysegErtek1);
                        egysegL1TestKep.add(egysegL1TestKepe);
                        EgysegLathatosag.lathatosagSorrend(egysegIras1, egysegL1TestKep, oszlop, sor);
                        ablakCsata.add(egysegekSorrend);
                    } else {
                        egysegekSorrend.remove(egysegIras1);
                        egysegekSorrend.remove(egysegL1TestKep);

                        foldmuv = 0;
                        egysegPozTorlese("foldmuv", sor, oszlop);
                        
                        if (!ellenfelHosKovetkezik) {
                            informacioErtek.setText("<html><center>" + egyseg + " egységetet tűzlabdázták,<p> " + Varazsero.varazseroErtek * 20 + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                        } else {
                            informacioErtek.setText("<html><center>" + egyseg + " egységetet tűzlabdázták,<p> " + ellenfelVarazsero * 20 + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                        }
                    }
                }
                case "ijas" -> {
                    if (!ellenfelHosKovetkezik) {
                        Eletero.masodikEgysegEletero -= Varazsero.varazseroErtek * 20;
                    } else {
                        Eletero.masodikEgysegEletero -= ellenfelVarazsero * 20;
                    }
                    dbSzamMasodik = Eletero.masodikEgysegEletero / 7;
                    if (Eletero.masodikEgysegEletero > 0) {

                        egysegekSorrend.remove(egysegIras2);
                        egysegekSorrend.remove(egysegL2TestKep);

                        if (dbSzamMasodik < 10) {
                            egysegErtek2.setText(String.valueOf(String.format("%.2f", dbSzamMasodik)));
                        } else {
                            egysegErtek2.setText(String.valueOf(String.format("%.1f", dbSzamMasodik)));
                        }
                        
                        if (!ellenfelHosKovetkezik) {
                            informacioErtek.setText("<html><center>" + egyseg + " egységet tűzlabdázták,<p>" + Varazsero.varazseroErtek * 20 + " sebzést szenvedett " +
                            "és " + Eletero.masodikEgysegEletero + " életereje maradt.</p></center></html>");
                        } else {
                            informacioErtek.setText("<html><center>" + egyseg + " egységet tűzlabdázták,<p>" + ellenfelVarazsero * 20 + " sebzést szenvedett " +
                            "és " + Eletero.masodikEgysegEletero + " életereje maradt.</p></center></html>");
                        }

                        egysegIras2.add(egysegErtek2);
                        egysegL2TestKep.add(egysegL2TestKepe);
                        EgysegLathatosag.lathatosagSorrend(egysegIras2, egysegL2TestKep, oszlop, sor);
                        ablakCsata.add(egysegekSorrend);
                    } else {
                        egysegekSorrend.remove(egysegIras2);
                        egysegekSorrend.remove(egysegL2TestKep);

                        ijas = 0;
                        egysegPozTorlese("ijas", sor, oszlop);
                        
                        if (!ellenfelHosKovetkezik) {
                            informacioErtek.setText("<html><center>" + egyseg + " egységetet tűzlabdázták,<p> " + Varazsero.varazseroErtek * 20 + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                        } else {
                            informacioErtek.setText("<html><center>" + egyseg + " egységetet tűzlabdázták,<p> " + ellenfelVarazsero * 20 + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                        }
                    }
                }
                case "felder" -> {
                    if (!ellenfelHosKovetkezik) {
                        Eletero.masodikEgysegEletero -= Varazsero.varazseroErtek * 20;
                    } else {
                        Eletero.masodikEgysegEletero -= ellenfelVarazsero * 20;
                    }
                    dbSzamMasodik = Eletero.masodikEgysegEletero / 10;
                    if (Eletero.masodikEgysegEletero > 0) {

                        egysegekSorrend.remove(egysegIras2);
                        egysegekSorrend.remove(egysegL2TestKep);

                        if (dbSzamMasodik < 10) {
                            egysegErtek2.setText(String.valueOf(String.format("%.2f", dbSzamMasodik)));
                        } else {
                            egysegErtek2.setText(String.valueOf(String.format("%.1f", dbSzamMasodik)));
                        }
                        
                        if (!ellenfelHosKovetkezik) {
                            informacioErtek.setText("<html><center>" + egyseg + " egységet tűzlabdázták,<p>" + Varazsero.varazseroErtek * 20 + " sebzést szenvedett " +
                            "és " + Eletero.masodikEgysegEletero + " életereje maradt.</p></center></html>");
                        } else {
                            informacioErtek.setText("<html><center>" + egyseg + " egységet tűzlabdázták,<p>" + ellenfelVarazsero * 20 + " sebzést szenvedett " +
                            "és " + Eletero.masodikEgysegEletero + " életereje maradt.</p></center></html>");
                        }

                        egysegIras2.add(egysegErtek2);
                        egysegL2TestKep.add(egysegL2TestKepe);
                        EgysegLathatosag.lathatosagSorrend(egysegIras2, egysegL2TestKep, oszlop, sor);
                        ablakCsata.add(egysegekSorrend);
                    } else {
                        egysegekSorrend.remove(egysegIras2);
                        egysegekSorrend.remove(egysegL2TestKep);

                        felder = 0;
                        egysegPozTorlese("felder", sor, oszlop);
                        
                        if (!ellenfelHosKovetkezik) {
                            informacioErtek.setText("<html><center>" + egyseg + " egységetet tűzlabdázták,<p> " + Varazsero.varazseroErtek * 20 + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                        } else {
                            informacioErtek.setText("<html><center>" + egyseg + " egységetet tűzlabdázták,<p> " + ellenfelVarazsero * 20 + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                        }
                    }
                }
                case "grif" -> {
                    if (!ellenfelHosKovetkezik) {
                        Eletero.harmadikEgysegEletero -= Varazsero.varazseroErtek * 20;
                    } else {
                        Eletero.harmadikEgysegEletero -= ellenfelVarazsero * 20;
                    }
                    dbSzamHarmadik = Eletero.harmadikEgysegEletero / 30;
                    if (Eletero.harmadikEgysegEletero > 0) {

                        egysegekSorrend.remove(egysegIras3);
                        egysegekSorrend.remove(egysegL3TestKep);

                        if (dbSzamHarmadik < 10) {
                            egysegErtek3.setText(String.valueOf(String.format("%.2f", dbSzamHarmadik)));
                        } else {
                            egysegErtek3.setText(String.valueOf(String.format("%.1f", dbSzamHarmadik)));
                        }
                        
                        if (!ellenfelHosKovetkezik) {
                            informacioErtek.setText("<html><center>" + egyseg + " egységet tűzlabdázták,<p>" + Varazsero.varazseroErtek * 20 + " sebzést szenvedett " +
                            "és " + Eletero.harmadikEgysegEletero + " életereje maradt.</p></center></html>");
                        } else {
                            informacioErtek.setText("<html><center>" + egyseg + " egységet tűzlabdázták,<p>" + ellenfelVarazsero * 20 + " sebzést szenvedett " +
                            "és " + Eletero.harmadikEgysegEletero + " életereje maradt.</p></center></html>");
                        }

                        egysegIras3.add(egysegErtek3);
                        egysegL3TestKep.add(egysegL3TestKepe);
                        EgysegLathatosag.lathatosagSorrend(egysegIras3, egysegL3TestKep, oszlop, sor);
                        ablakCsata.add(egysegekSorrend);
                    } else {
                        egysegekSorrend.remove(egysegIras3);
                        egysegekSorrend.remove(egysegL3TestKep);

                        grif = 0;
                        egysegPozTorlese("grif", sor, oszlop);
                        
                        if (!ellenfelHosKovetkezik) {
                            informacioErtek.setText("<html><center>" + egyseg + " egységetet tűzlabdázták,<p> " + Varazsero.varazseroErtek * 20 + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                        } else {
                            informacioErtek.setText("<html><center>" + egyseg + " egységetet tűzlabdázták,<p> " + ellenfelVarazsero * 20 + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                        }
                    }
                }
                case "mino" -> {
                    if (!ellenfelHosKovetkezik) {
                        Eletero.harmadikEgysegEletero -= Varazsero.varazseroErtek * 20;
                    } else {
                        Eletero.harmadikEgysegEletero -= ellenfelVarazsero * 20;
                    }
                    dbSzamHarmadik = Eletero.harmadikEgysegEletero / 80;
                    if (Eletero.harmadikEgysegEletero > 0) {

                        egysegekSorrend.remove(egysegIras3);
                        egysegekSorrend.remove(egysegL3TestKep);

                        if (dbSzamHarmadik < 10) {
                            egysegErtek3.setText(String.valueOf(String.format("%.2f", dbSzamHarmadik)));
                        } else {
                            egysegErtek3.setText(String.valueOf(String.format("%.1f", dbSzamHarmadik)));
                        }
                        
                        if (!ellenfelHosKovetkezik) {
                            informacioErtek.setText("<html><center>" + egyseg + " egységet tűzlabdázták,<p>" + Varazsero.varazseroErtek * 20 + " sebzést szenvedett " +
                            "és " + Eletero.harmadikEgysegEletero + " életereje maradt.</p></center></html>");
                        } else {
                            informacioErtek.setText("<html><center>" + egyseg + " egységet tűzlabdázták,<p>" + ellenfelVarazsero * 20 + " sebzést szenvedett " +
                            "és " + Eletero.harmadikEgysegEletero + " életereje maradt.</p></center></html>");
                        }

                        egysegIras3.add(egysegErtek3);
                        egysegL3TestKep.add(egysegL3TestKepe);
                        EgysegLathatosag.lathatosagSorrend(egysegIras3, egysegL3TestKep, oszlop, sor);
                        ablakCsata.add(egysegekSorrend);
                    } else {
                        egysegekSorrend.remove(egysegIras3);
                        egysegekSorrend.remove(egysegL3TestKep);

                        mino = 0;
                        egysegPozTorlese("mino", sor, oszlop);
                        
                        if (!ellenfelHosKovetkezik) {
                            informacioErtek.setText("<html><center>" + egyseg + " egységetet tűzlabdázták,<p> " + Varazsero.varazseroErtek * 20 + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                        } else {
                            informacioErtek.setText("<html><center>" + egyseg + " egységetet tűzlabdázták,<p> " + ellenfelVarazsero * 20 + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                        }
                    }
                }
                case "fegyv" -> {
                    if (!ellenfelHosKovetkezik) {
                        Eletero.negyedikEgysegEletero -= Varazsero.varazseroErtek * 20;
                    } else {
                        Eletero.negyedikEgysegEletero -= ellenfelVarazsero * 20;
                    }
                    dbSzamNegyedik = Eletero.negyedikEgysegEletero / 33;
                    if (Eletero.negyedikEgysegEletero > 0) {

                        egysegekSorrend.remove(egysegIras4);
                        egysegekSorrend.remove(egysegL4TestKep);

                        if (dbSzamNegyedik < 10) {
                            egysegErtek4.setText(String.valueOf(String.format("%.2f", dbSzamNegyedik)));
                        } else {
                            egysegErtek4.setText(String.valueOf(String.format("%.1f", dbSzamNegyedik)));
                        }
                        
                        if (!ellenfelHosKovetkezik) {
                            informacioErtek.setText("<html><center>" + egyseg + " egységet tűzlabdázták,<p>" + Varazsero.varazseroErtek * 20 + " sebzést szenvedett " +
                            "és " + Eletero.negyedikEgysegEletero + " életereje maradt.</p></center></html>");
                        } else {
                            informacioErtek.setText("<html><center>" + egyseg + " egységet tűzlabdázták,<p>" + ellenfelVarazsero * 20 + " sebzést szenvedett " +
                            "és " + Eletero.negyedikEgysegEletero + " életereje maradt.</p></center></html>");
                        }

                        egysegIras4.add(egysegErtek4);
                        egysegL4TestKep.add(egysegL4TestKepe);
                        EgysegLathatosag.lathatosagSorrend(egysegIras4, egysegL4TestKep, oszlop, sor);
                        ablakCsata.add(egysegekSorrend);
                    } else {
                        egysegekSorrend.remove(egysegIras4);
                        egysegekSorrend.remove(egysegL4TestKep);

                        fegyv = 0;
                        egysegPozTorlese("fegyv", sor, oszlop);
                        
                        if (!ellenfelHosKovetkezik) {
                            informacioErtek.setText("<html><center>" + egyseg + " egységetet tűzlabdázták,<p> " + Varazsero.varazseroErtek * 20 + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                        } else {
                            informacioErtek.setText("<html><center>" + egyseg + " egységetet tűzlabdázták,<p> " + ellenfelVarazsero * 20 + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                        }
                    }
                }
                case "orgy" -> {
                    if (!ellenfelHosKovetkezik) {
                        Eletero.negyedikEgysegEletero -= Varazsero.varazseroErtek * 20;
                    } else {
                        Eletero.negyedikEgysegEletero -= ellenfelVarazsero * 20;
                    }
                    dbSzamNegyedik = Eletero.negyedikEgysegEletero / 20;
                    if (Eletero.negyedikEgysegEletero > 0) {

                        egysegekSorrend.remove(egysegIras4);
                        egysegekSorrend.remove(egysegL4TestKep);

                        if (dbSzamNegyedik < 10) {
                            egysegErtek4.setText(String.valueOf(String.format("%.2f", dbSzamNegyedik)));
                        } else {
                            egysegErtek4.setText(String.valueOf(String.format("%.1f", dbSzamNegyedik)));
                        }
                        
                        if (!ellenfelHosKovetkezik) {
                            informacioErtek.setText("<html><center>" + egyseg + " egységet tűzlabdázták,<p>" + Varazsero.varazseroErtek * 20 + " sebzést szenvedett " +
                            "és " + Eletero.negyedikEgysegEletero + " életereje maradt.</p></center></html>");
                        } else {
                            informacioErtek.setText("<html><center>" + egyseg + " egységet tűzlabdázták,<p>" + ellenfelVarazsero * 20 + " sebzést szenvedett " +
                            "és " + Eletero.negyedikEgysegEletero + " életereje maradt.</p></center></html>");
                        }

                        egysegIras4.add(egysegErtek4);
                        egysegL4TestKep.add(egysegL4TestKepe);
                        EgysegLathatosag.lathatosagSorrend(egysegIras4, egysegL4TestKep, oszlop, sor);
                        ablakCsata.add(egysegekSorrend);
                    } else {
                        egysegekSorrend.remove(egysegIras4);
                        egysegekSorrend.remove(egysegL4TestKep);

                        orgy = 0;
                        egysegPozTorlese("orgy", sor, oszlop);
                        
                        if (!ellenfelHosKovetkezik) {
                            informacioErtek.setText("<html><center>" + egyseg + " egységetet tűzlabdázták,<p> " + Varazsero.varazseroErtek * 20 + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                        } else {
                            informacioErtek.setText("<html><center>" + egyseg + " egységetet tűzlabdázták,<p> " + ellenfelVarazsero * 20 + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                        }
                    }
                }
                case "harcp" -> {
                    if (!ellenfelHosKovetkezik) {
                        Eletero.otodikEgysegEletero -= Varazsero.varazseroErtek * 20;
                    } else {
                        Eletero.otodikEgysegEletero -= ellenfelVarazsero * 20;
                    }
                    dbSzamOtodik = Eletero.otodikEgysegEletero / 54;
                    if (Eletero.otodikEgysegEletero > 0) {

                        egysegekSorrend.remove(egysegIras5);
                        egysegekSorrend.remove(egysegL5TestKep);

                        if (dbSzamOtodik < 10) {
                            egysegErtek5.setText(String.valueOf(String.format("%.2f", dbSzamOtodik)));
                        } else {
                            egysegErtek5.setText(String.valueOf(String.format("%.1f", dbSzamOtodik)));
                        }
                        
                        if (!ellenfelHosKovetkezik) {
                            informacioErtek.setText("<html><center>" + egyseg + " egységet tűzlabdázták,<p>" + Varazsero.varazseroErtek * 20 + " sebzést szenvedett " +
                            "és " + Eletero.otodikEgysegEletero + " életereje maradt.</p></center></html>");
                        } else {
                            informacioErtek.setText("<html><center>" + egyseg + " egységet tűzlabdázták,<p>" + ellenfelVarazsero * 20 + " sebzést szenvedett " +
                            "és " + Eletero.otodikEgysegEletero + " életereje maradt.</p></center></html>");
                        }

                        egysegIras5.add(egysegErtek5);
                        egysegL5TestKep.add(egysegL5TestKepe);
                        EgysegLathatosag.lathatosagSorrend(egysegIras5, egysegL5TestKep, oszlop, sor);
                        ablakCsata.add(egysegekSorrend);
                    } else {
                        egysegekSorrend.remove(egysegIras5);
                        egysegekSorrend.remove(egysegL5TestKep);

                        harcp = 0;
                        egysegPozTorlese("harcp", sor, oszlop);
                        
                        if (!ellenfelHosKovetkezik) {
                            informacioErtek.setText("<html><center>" + egyseg + " egységetet tűzlabdázták,<p> " + Varazsero.varazseroErtek * 20 + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                        } else {
                            informacioErtek.setText("<html><center>" + egyseg + " egységetet tűzlabdázták,<p> " + ellenfelVarazsero * 20 + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                        }
                    }
                }
                case "rapt" -> {
                    if (!ellenfelHosKovetkezik) {
                        Eletero.otodikEgysegEletero -= Varazsero.varazseroErtek * 20;
                    } else {
                        Eletero.otodikEgysegEletero -= ellenfelVarazsero * 20;
                    }
                    dbSzamOtodik = Eletero.otodikEgysegEletero / 35;
                    if (Eletero.otodikEgysegEletero > 0) {

                        egysegekSorrend.remove(egysegIras5);
                        egysegekSorrend.remove(egysegL5TestKep);

                        if (dbSzamOtodik < 10) {
                            egysegErtek5.setText(String.valueOf(String.format("%.2f", dbSzamOtodik)));
                        } else {
                            egysegErtek5.setText(String.valueOf(String.format("%.1f", dbSzamOtodik)));
                        }
                        
                        if (!ellenfelHosKovetkezik) {
                            informacioErtek.setText("<html><center>" + egyseg + " egységet tűzlabdázták,<p>" + Varazsero.varazseroErtek * 20 + " sebzést szenvedett " +
                            "és " + Eletero.otodikEgysegEletero + " életereje maradt.</p></center></html>");
                        } else {
                            informacioErtek.setText("<html><center>" + egyseg + " egységet tűzlabdázták,<p>" + ellenfelVarazsero * 20 + " sebzést szenvedett " +
                            "és " + Eletero.otodikEgysegEletero + " életereje maradt.</p></center></html>");
                        }

                        egysegIras5.add(egysegErtek5);
                        egysegL5TestKep.add(egysegL5TestKepe);
                        EgysegLathatosag.lathatosagSorrend(egysegIras5, egysegL5TestKep, oszlop, sor);
                        ablakCsata.add(egysegekSorrend);
                    } else {
                        egysegekSorrend.remove(egysegIras5);
                        egysegekSorrend.remove(egysegL5TestKep);

                        rapt = 0;
                        egysegPozTorlese("rapt", sor, oszlop);
                        
                        if (!ellenfelHosKovetkezik) {
                            informacioErtek.setText("<html><center>" + egyseg + " egységetet tűzlabdázták,<p> " + Varazsero.varazseroErtek * 20 + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                        } else {
                            informacioErtek.setText("<html><center>" + egyseg + " egységetet tűzlabdázták,<p> " + ellenfelVarazsero * 20 + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                        }
                    }
                }
            }
        }
    }
}