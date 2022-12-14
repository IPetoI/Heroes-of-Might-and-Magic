package Egysegek;

import javax.swing.*;

import static Egysegek.Egyseg.*;
import static Ablakok.EgysegLepakolasAblak.ablakLepakolas;
import static Jatek.Valasztas.lovage;

public class EgysegVan {

    public static JPanel egysegL1Kep = new JPanel();
    public static JPanel egysegL2Kep = new JPanel();
    public static JPanel egysegL3Kep = new JPanel();
    public static JPanel egysegL4Kep = new JPanel();
    public static JPanel egysegL5Kep = new JPanel();

    public static JLabel egysegL1Kepe = new JLabel();
    public static JLabel egysegL2Kepe = new JLabel();
    public static JLabel egysegL3Kepe = new JLabel();
    public static JLabel egysegL4Kepe = new JLabel();
    public static JLabel egysegL5Kepe = new JLabel();

    public static ImageIcon csontvazff = new ImageIcon("Kepek/egysegek/csontvaz-1ff.jpg");
    public static ImageIcon felderitoff = new ImageIcon("Kepek/egysegek/felderito-1ff.jpg");
    public static ImageIcon minotaurff = new ImageIcon("Kepek/egysegek/minotaurosz-1ff.jpg");
    public static ImageIcon orgyilkosff = new ImageIcon("Kepek/egysegek/orgyilkos-1ff.jpg");
    public static ImageIcon raptorLovasff = new ImageIcon("Kepek/egysegek/raptorlovas-1ff.jpg");

    public static ImageIcon foldmuvesff = new ImageIcon("Kepek/egysegek/foldmuves-1ff.jpg");
    public static ImageIcon ijaszff = new ImageIcon("Kepek/egysegek/ijasz-1ff.jpg");
    public static ImageIcon griffff = new ImageIcon("Kepek/egysegek/griff-1ff.jpg");
    public static ImageIcon harcosPapff = new ImageIcon("Kepek/egysegek/harcospap-1ff.jpg");
    public static ImageIcon fegyvernokff = new ImageIcon("Kepek/egysegek/fegyvernok-1ff.jpg");


    public static void egysegVanE() {
        elsoEgysegL();
        masodikEgysegL();
        harmadikEgysegL();
        negyedikEgysegL();
        otodikEgysegL();
    }

    public static void elsoEgysegL() {

        egysegL1Kep.setBounds(13,136,55,59);
        egysegL1Kep.setOpaque(false);

        egysegL1Kepe.setIcon(foldmuvesff);
        egysegL1Kep.add(egysegL1Kepe);
        egysegL1Kep.setVisible(false);
        if (csontvazSzam==0 && lovage==1) {
            egysegL1Kep.setVisible(true);
            egysegL1Kepe.setIcon(csontvazff);
        }else if (foldmuvesSzam==0 && lovage==0) {
            egysegL1Kep.setVisible(true);
        }
        ablakLepakolas.add(egysegL1Kep);
    }

    public static void masodikEgysegL() {

        egysegL2Kep.setBounds(13,227,55,59);
        egysegL2Kep.setOpaque(false);

        egysegL2Kepe.setIcon(ijaszff);
        egysegL2Kep.add(egysegL2Kepe);
        egysegL2Kep.setVisible(false);
        if (felderitoSzam==0 && lovage==1) {
            egysegL2Kep.setVisible(true);
            egysegL2Kepe.setIcon(felderitoff);
        }else if (ijaszSzam==0 && lovage==0) {
            egysegL2Kep.setVisible(true);
        }
        ablakLepakolas.add(egysegL2Kep);
    }

    public static void harmadikEgysegL() {

        egysegL3Kep.setBounds(13,319,55,59);
        egysegL3Kep.setOpaque(false);

        egysegL3Kepe.setIcon(griffff);
        egysegL3Kep.add(egysegL3Kepe);
        egysegL3Kep.setVisible(false);
        if (minotaurSzam==0 && lovage==1) {
            egysegL3Kep.setVisible(true);
            egysegL3Kepe.setIcon(minotaurff);
        }else if (griffSzam==0 && lovage==0) {
            egysegL3Kep.setVisible(true);
        }
        ablakLepakolas.add(egysegL3Kep);
    }

    public static void negyedikEgysegL() {

        egysegL4Kep.setBounds(13,411,55,59);
        egysegL4Kep.setOpaque(false);

        egysegL4Kepe.setIcon(fegyvernokff);
        egysegL4Kep.add(egysegL4Kepe);
        egysegL4Kep.setVisible(false);
        if (orgyilkosSzam==0 && lovage==1) {
            egysegL4Kep.setVisible(true);
            egysegL4Kepe.setIcon(orgyilkosff);
        }else if (fegyvernokSzam==0 && lovage==0) {
            egysegL4Kep.setVisible(true);
        }
        ablakLepakolas.add(egysegL4Kep);
    }

    public static void otodikEgysegL() {

        egysegL5Kep.setBounds(13,503,55,59);
        egysegL5Kep.setOpaque(false);

        egysegL5Kepe.setIcon(harcosPapff);
        egysegL5Kep.add(egysegL5Kepe);
        egysegL5Kep.setVisible(false);
        if (raptorLovasSzam==0 && lovage==1) {
            egysegL5Kep.setVisible(true);
            egysegL5Kepe.setIcon(raptorLovasff);
        }else if (harcosPapSzam==0 && lovage==0) {
            egysegL5Kep.setVisible(true);
        }
        ablakLepakolas.add(egysegL5Kep);
    }
}