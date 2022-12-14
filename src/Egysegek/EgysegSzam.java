package Egysegek;

import javax.swing.*;
import java.awt.*;

import static Egysegek.Egyseg.*;
import static Hos.Tulajdonsagok.Tulajdonsagai.font;
import static Ablakok.EgysegLepakolasAblak.ablakLepakolas;
import static Jatek.Valasztas.lovage;

public class EgysegSzam {

    private static EgysegSzam instance = null;

    public static EgysegSzam getInstance()
    {
        if (instance == null)
            instance = new EgysegSzam();

        return instance;
    }

    static JPanel elsoEgysegSzamIras = new JPanel();
    static JPanel masodikEgysegSzamIras = new JPanel();
    static JPanel harmadikEgysegSzamIras = new JPanel();
    static JPanel negyedikEgysegSzamIras = new JPanel();
    static JPanel otodikEgysegSzamIras = new JPanel();

    public static JLabel elsoEgysegSzamErtek = new JLabel();
    public static JLabel masodikEgysegSzamErtek = new JLabel();
    public static JLabel harmadikEgysegSzamErtek = new JLabel();
    public static JLabel negyedikEgysegSzamErtek = new JLabel();
    public static JLabel otodikEgysegSzamErtek = new JLabel();

    public static double elsoEgysegSzam = 0, maxElsoEgysegSzam = 0;
    public static double masodikEgysegSzam = 0, maxMasodikEgysegSzam = 0;
    public static double harmadikEgysegSzam = 0, maxHarmadikEgysegSzam = 0;
    public static double negyedikEgysegSzam = 0, maxNegyedikEgysegSzam = 0;
    public static double otodikEgysegSzam = 0, maxOtodikEgysegSzam = 0;


    public static void egysegSzama() {

        elsoEgysegSzam();
        masodikEgysegSzam();
        harmadikEgysegSzam();
        negyedikEgysegSzam();
        otodikEgysegSzam();
    }

    public static void elsoEgysegSzam() {
        elsoEgysegSzamErtek.setFont(font);
        elsoEgysegSzamErtek.setForeground(new Color(234,209,138));

        elsoEgysegSzamIras.setBounds(70,162,65,30);

        if (lovage==1) {
            elsoEgysegSzam=csontvazSzam;
        }else if (lovage==0) {
            elsoEgysegSzam=foldmuvesSzam;
        }
        elsoEgysegSzamErtek.setText((int)elsoEgysegSzam+" db");
        maxElsoEgysegSzam = elsoEgysegSzam;
        elsoEgysegSzamIras.add(elsoEgysegSzamErtek);
        elsoEgysegSzamIras.setOpaque(false);
        elsoEgysegSzamIras.repaint();
        ablakLepakolas.add(elsoEgysegSzamIras);
    }

    public static void masodikEgysegSzam() {
        masodikEgysegSzamErtek.setFont(font);
        masodikEgysegSzamErtek.setForeground(new Color(234,209,138));

        masodikEgysegSzamIras.setBounds(70,255,65,30);

        if (lovage==1) {
            masodikEgysegSzam=felderitoSzam;
        }else if (lovage==0) {
            masodikEgysegSzam=ijaszSzam;
        }
        masodikEgysegSzamErtek.setText((int)masodikEgysegSzam+" db");
        maxMasodikEgysegSzam = masodikEgysegSzam;
        masodikEgysegSzamIras.add(masodikEgysegSzamErtek);
        masodikEgysegSzamIras.setOpaque(false);
        masodikEgysegSzamIras.repaint();
        ablakLepakolas.add(masodikEgysegSzamIras);
    }

    public static void harmadikEgysegSzam() {
        harmadikEgysegSzamErtek.setFont(font);
        harmadikEgysegSzamErtek.setForeground(new Color(234,209,138));

        harmadikEgysegSzamIras.setBounds(70,348,65,30);

        if (lovage==1) {
            harmadikEgysegSzam=minotaurSzam;
        }else if (lovage==0) {
            harmadikEgysegSzam=griffSzam;
        }
        harmadikEgysegSzamErtek.setText((int)harmadikEgysegSzam+" db");
        maxHarmadikEgysegSzam = harmadikEgysegSzam;
        harmadikEgysegSzamIras.add(harmadikEgysegSzamErtek);
        harmadikEgysegSzamIras.setOpaque(false);
        harmadikEgysegSzamIras.repaint();
        ablakLepakolas.add(harmadikEgysegSzamIras);
    }

    public static void negyedikEgysegSzam() {
        negyedikEgysegSzamErtek.setFont(font);
        negyedikEgysegSzamErtek.setForeground(new Color(234,209,138));

        negyedikEgysegSzamIras.setBounds(70,441,65,30);

        if (lovage==1) {
            negyedikEgysegSzam=orgyilkosSzam;
        }else if (lovage==0) {
            negyedikEgysegSzam=fegyvernokSzam;
        }
        negyedikEgysegSzamErtek.setText((int)negyedikEgysegSzam+" db");
        negyedikEgysegSzamIras.add(negyedikEgysegSzamErtek);
        maxNegyedikEgysegSzam = negyedikEgysegSzam;
        negyedikEgysegSzamIras.setOpaque(false);
        negyedikEgysegSzamIras.repaint();
        ablakLepakolas.add(negyedikEgysegSzamIras);
    }

    public static void otodikEgysegSzam() {
        otodikEgysegSzamErtek.setFont(font);
        otodikEgysegSzamErtek.setForeground(new Color(234,209,138));

        otodikEgysegSzamIras.setBounds(70,534,65,30);

        if (lovage==1) {
            otodikEgysegSzam=raptorLovasSzam;
        }else if (lovage==0) {
            otodikEgysegSzam=harcosPapSzam;
        }
        otodikEgysegSzamErtek.setText((int)otodikEgysegSzam+" db");
        maxOtodikEgysegSzam = otodikEgysegSzam;
        otodikEgysegSzamIras.add(otodikEgysegSzamErtek);
        otodikEgysegSzamIras.setOpaque(false);
        otodikEgysegSzamIras.repaint();
        ablakLepakolas.add(otodikEgysegSzamIras);
    }
}