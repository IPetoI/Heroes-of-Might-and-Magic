package Ellenfel;

import Egysegek.EgysegLathatosag;

import javax.swing.*;
import java.awt.*;

import static Egysegek.EgysegLetetel.egysegekSorrend;
import static Egysegek.Eletero.*;
import static Ellenfel.EllenfelEgysegPozicio.*;
import static Ablakok.EgysegLepakolasAblak.ablakLepakolas;
import static Jatek.Valasztas.lovage;

public class EllenfelEgysege {

    private static EllenfelEgysege instance = null;

    public static EllenfelEgysege getInstance() {
        if (instance == null)
            instance = new EllenfelEgysege();

        return instance;
    }

    public static JPanel ellenfelEgysegL1Kep = new JPanel();
    public static JLabel ellenfelEgysegL1Kepe = new JLabel();
    public static JPanel ellenfelEgysegIras1 = new JPanel();
    public static JLabel ellenfelEgysegErtek1 = new JLabel();

    public static JPanel ellenfelEgysegL2Kep = new JPanel();
    public static JLabel ellenfelEgysegL2Kepe = new JLabel();
    public static JPanel ellenfelEgysegIras2 = new JPanel();
    public static JLabel ellenfelEgysegErtek2 = new JLabel();

    public static JPanel ellenfelEgysegL3Kep = new JPanel();
    public static JLabel ellenfelEgysegL3Kepe = new JLabel();
    public static JPanel ellenfelEgysegIras3 = new JPanel();
    public static JLabel ellenfelEgysegErtek3 = new JLabel();

    public static JPanel ellenfelEgysegL4Kep = new JPanel();
    public static JLabel ellenfelEgysegL4Kepe = new JLabel();
    public static JPanel ellenfelEgysegIras4 = new JPanel();
    public static JLabel ellenfelEgysegErtek4 = new JLabel();

    public static JPanel ellenfelEgysegL5Kep = new JPanel();
    public static JLabel ellenfelEgysegL5Kepe = new JLabel();
    public static JPanel ellenfelEgysegIras5 = new JPanel();
    public static JLabel ellenfelEgysegErtek5 = new JLabel();

    public static int ellenfelOszlop=0;
    public static int ellenfelSor=0;
    public static double ellenfelDbSzamElso=0;
    public static double ellenfelDbSzamMasodik=0;
    public static double ellenfelDbSzamHarmadik=0;
    public static double ellenfelDbSzamNegyedik=0;
    public static double ellenfelDbSzamOtodik=0;
    public static int ellenfelxKep=0,ellenfelyKep=0,ellenfelxIras=0,ellenfelyIras=0;

    String ellenfelEgysegFajta="n";

    public static Font fontKicsi = new Font("Arial", Font.BOLD, 8);


    public void ellenfelEgysegKitetel1() {

        if ((lovage==1 && ellenfelFoldmuvesSzam>0) || (lovage==0 && ellenfelCsontvazSzam>0)) {

            ablakLepakolas.remove(ellenfelEgysegL1Kep);
            egysegekSorrend.remove(ellenfelEgysegIras1);
            egysegekSorrend.remove(ellenfelEgysegL1Kep);

            egysegekSorrend.setBounds(0,0,1250,600);

            if (egysegEllenfelEgy.equals("efoldm")) {
                ellenfelEgysegFajta="Foldmuves";
            }else {
                ellenfelEgysegFajta="Csontvaz";
            }

            System.out.println((int)ellenfelDbSzamElso+" db "+ellenfelEgysegFajta+" ellenfel egyseg megvasarolva, eletereje: "+(int)elsoEllEgysegEletero);
            ellenfelEgysegErtek1.setFont(fontKicsi);
            ellenfelEgysegErtek1.setForeground(new Color(255, 255, 255));

            ellenfelEgysegIras1.setBounds(ellenfelxIras, ellenfelyIras, 20, 15);

            ellenfelEgysegErtek1.setText(String.valueOf((int)ellenfelDbSzamElso));
            ellenfelEgysegIras1.add(ellenfelEgysegErtek1);
            ellenfelEgysegIras1.setOpaque(false);
            ellenfelEgysegIras1.repaint();

            ellenfelEgysegL1Kep.setBounds(ellenfelxKep, ellenfelyKep, 100, 100);
            ellenfelEgysegL1Kep.setOpaque(false);

            ellenfelEgysegL1Kep.add(ellenfelEgysegL1Kepe);
            EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras1,ellenfelEgysegL1Kep,ellenfelOszlop,ellenfelSor);
            ablakLepakolas.add(egysegekSorrend);
        }
    }

    public void ellenfelEgysegKitetel2() {

        if ((lovage==1 && ellenfelIjaszSzam>0) || (lovage==0 && ellenfelFelderitoSzam>0)) {

        ablakLepakolas.remove(ellenfelEgysegL2Kep);
        egysegekSorrend.remove(ellenfelEgysegIras2);
        egysegekSorrend.remove(ellenfelEgysegL2Kep);

        egysegekSorrend.setBounds(0,0,1250,600);

            if (egysegEllenfelKetto.equals("eijas")) {
                ellenfelEgysegFajta="Ijasz";
            }else {
                ellenfelEgysegFajta="Felderito";
            }

            System.out.println((int)ellenfelDbSzamMasodik+" db "+ellenfelEgysegFajta+" ellenfel egyseg megvasarolva, eletereje: "+(int)masodikEllEgysegEletero);
        ellenfelEgysegErtek2.setFont(fontKicsi);
        ellenfelEgysegErtek2.setForeground(new Color(255, 255, 255));

        ellenfelEgysegIras2.setBounds(ellenfelxIras,ellenfelyIras,20,15);

        ellenfelEgysegErtek2.setText(String.valueOf((int)ellenfelDbSzamMasodik));
        ellenfelEgysegIras2.add(ellenfelEgysegErtek2);
        ellenfelEgysegIras2.setOpaque(false);
        ellenfelEgysegIras2.repaint();

        ellenfelEgysegL2Kep.setBounds(ellenfelxKep,ellenfelyKep,100,100);
        ellenfelEgysegL2Kep.setOpaque(false);

        ellenfelEgysegL2Kep.add(ellenfelEgysegL2Kepe);
        EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras2,ellenfelEgysegL2Kep,ellenfelOszlop,ellenfelSor);
        ablakLepakolas.add(egysegekSorrend);
        }
    }

    public void ellenfelEgysegKitetel3() {

        if ((lovage==1 && ellenfelGriffSzam>0) || (lovage==0 && ellenfelMinotaurSzam>0)) {

            ablakLepakolas.remove(ellenfelEgysegL3Kep);
            egysegekSorrend.remove(ellenfelEgysegIras3);
            egysegekSorrend.remove(ellenfelEgysegL3Kep);

            egysegekSorrend.setBounds(0,0,1250,600);

            if (egysegEllenfelHarom.equals("egrif")) {
                ellenfelEgysegFajta="Griff";
            }else {
                ellenfelEgysegFajta="Minotaurosz";
            }

            System.out.println((int)ellenfelDbSzamHarmadik+" db "+ellenfelEgysegFajta+" ellenfel egyseg megvasarolva, eletereje: "+(int)harmadikEllEgysegEletero);
            ellenfelEgysegErtek3.setFont(fontKicsi);
            ellenfelEgysegErtek3.setForeground(new Color(255, 255, 255));

            ellenfelEgysegIras3.setBounds(ellenfelxIras, ellenfelyIras, 20, 15);

            ellenfelEgysegErtek3.setText(String.valueOf((int)ellenfelDbSzamHarmadik));
            ellenfelEgysegIras3.add(ellenfelEgysegErtek3);
            ellenfelEgysegIras3.setOpaque(false);
            ellenfelEgysegIras3.repaint();

            ellenfelEgysegL3Kep.setBounds(ellenfelxKep, ellenfelyKep, 100, 100);
            ellenfelEgysegL3Kep.setOpaque(false);

            ellenfelEgysegL3Kep.add(ellenfelEgysegL3Kepe);
            EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras3,ellenfelEgysegL3Kep,ellenfelOszlop,ellenfelSor);
            ablakLepakolas.add(egysegekSorrend);
        }
    }

    public void ellenfelEgysegKitetel4() {

        if ((lovage==1 && ellenfelFegyvernokSzam>0) || (lovage==0 && ellenfelOrgyilkosSzam>0)) {

            ablakLepakolas.remove(ellenfelEgysegL4Kep);
            egysegekSorrend.remove(ellenfelEgysegIras4);
            egysegekSorrend.remove(ellenfelEgysegL4Kep);

            egysegekSorrend.setBounds(0,0,1250,600);

            if (egysegEllenfelNegy.equals("efegyv")) {
                ellenfelEgysegFajta="Fegyvernok";
            }else {
                ellenfelEgysegFajta="Orgyilkos";
            }

            System.out.println((int)ellenfelDbSzamNegyedik+" db "+ellenfelEgysegFajta+" ellenfel egyseg megvasarolva, eletereje: "+(int)negyedikEllEgysegEletero);
            ellenfelEgysegErtek4.setFont(fontKicsi);
            ellenfelEgysegErtek4.setForeground(new Color(255, 255, 255));

            ellenfelEgysegIras4.setBounds(ellenfelxIras, ellenfelyIras, 20, 15);

            ellenfelEgysegErtek4.setText(String.valueOf((int)ellenfelDbSzamNegyedik));
            ellenfelEgysegIras4.add(ellenfelEgysegErtek4);
            ellenfelEgysegIras4.setOpaque(false);
            ellenfelEgysegIras4.repaint();

            ellenfelEgysegL4Kep.setBounds(ellenfelxKep, ellenfelyKep, 100, 100);
            ellenfelEgysegL4Kep.setOpaque(false);

            ellenfelEgysegL4Kep.add(ellenfelEgysegL4Kepe);
            EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras4,ellenfelEgysegL4Kep,ellenfelOszlop,ellenfelSor);
            ablakLepakolas.add(egysegekSorrend);
        }
    }

    public void ellenfelEgysegKitetel5() {

        if ((lovage==1 && ellenfelHarcosPapSzam>0) || (lovage==0 && ellenfelRaptorLovasSzam>0)) {

            ablakLepakolas.remove(ellenfelEgysegL5Kep);
            egysegekSorrend.remove(ellenfelEgysegIras5);
            egysegekSorrend.remove(ellenfelEgysegL5Kep);

            egysegekSorrend.setBounds(0,0,1250,600);

            if (egysegEllenfelOt.equals("eharcp")) {
                ellenfelEgysegFajta="HarcosPap";
            }else {
                ellenfelEgysegFajta="RaptorLovas";
            }

            System.out.println((int)ellenfelDbSzamOtodik+" db "+ellenfelEgysegFajta+" ellenfel egyseg megvasarolva, eletereje: "+(int)otodikEllEgysegEletero);
            ellenfelEgysegErtek5.setFont(fontKicsi);
            ellenfelEgysegErtek5.setForeground(new Color(255, 255, 255));

            ellenfelEgysegIras5.setBounds(ellenfelxIras, ellenfelyIras, 20, 15);

            ellenfelEgysegErtek5.setText(String.valueOf((int)ellenfelDbSzamOtodik));
            ellenfelEgysegIras5.add(ellenfelEgysegErtek5);
            ellenfelEgysegIras5.setOpaque(false);
            ellenfelEgysegIras5.repaint();

            ellenfelEgysegL5Kep.setBounds(ellenfelxKep, ellenfelyKep, 100, 100);
            ellenfelEgysegL5Kep.setOpaque(false);

            ellenfelEgysegL5Kep.add(ellenfelEgysegL5Kepe);
            EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras5,ellenfelEgysegL5Kep,ellenfelOszlop,ellenfelSor);
            ablakLepakolas.add(egysegekSorrend);
        }
    }
}
