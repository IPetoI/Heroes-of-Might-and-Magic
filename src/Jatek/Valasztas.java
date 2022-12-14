package Jatek;

import javax.swing.*;
import java.awt.*;

import static Egysegek.Egyseg.*;
import static Ablakok.Csapat.ablakCsapat;

public class Valasztas{

    static JButton LovagValasztasGomb;
    static JButton NekromantaValasztasGomb;
    public static int lovage=0;

    public Valasztas() {
        LovagValasztasGomb = new JButton();
        NekromantaValasztasGomb = new JButton();

        LovagValasztasGomb.addActionListener(e -> {
            if (lovage == 1) {
                lovage=0;
                hos.setIcon(hosLaszlo);
                nevErtek.setText("László");
                System.out.println("Lovag-ot valasztottad");
                csontvazTorles();
                raptorLovasTorles();
                minotaurTorles();
                felderitoTorles();
                orgyilkosTorles();
                emberEgysegreValtas();
                osszEgyseg=0;
            }
        });

        NekromantaValasztasGomb.addActionListener(e -> {
            if (lovage == 0) {
                lovage=1;
                hos.setIcon(hosLena);
                nevErtek.setText("Léna");
                System.out.println("Lena-t valasztottad");
                foldmuvesTorles();
                fegyvernokTorles();
                griffTorles();
                ijaszTorles();
                harcosPapTorles();
                nekromantaEgysegreValtas();
                osszEgyseg=0;
            }
        });
    }

    public static JPanel profilkepHos = new JPanel();
    public static JLabel hos = new JLabel();

    public static ImageIcon hosLaszlo = new ImageIcon("Kepek/hosok/laszlo.jpg");
    ImageIcon hosLena = new ImageIcon("Kepek/hosok/lena.jpg");

    JPanel nev = new JPanel();
    public static JLabel nevErtek = new JLabel();

    Font font = new Font("Arial", Font.BOLD, 20);


    public void hosValasztas() {

        LovagValasztasGomb.setBounds(433, 43, 154, 40);
        LovagValasztasGomb.setOpaque(false);
        LovagValasztasGomb.setContentAreaFilled(false);
        LovagValasztasGomb.setBorderPainted(false);
        LovagValasztasGomb.setFocusable(false);

        ablakCsapat.add(LovagValasztasGomb);

        NekromantaValasztasGomb.setBounds(249, 43, 154, 40);
        NekromantaValasztasGomb.setOpaque(false);
        NekromantaValasztasGomb.setContentAreaFilled(false);
        NekromantaValasztasGomb.setBorderPainted(false);
        NekromantaValasztasGomb.setFocusable(false);

        ablakCsapat.add(NekromantaValasztasGomb);

        profilkepHos.setBounds(93,151,158,170);
        profilkepHos.setOpaque(false);
        hos.setIcon(hosLaszlo);
        profilkepHos.add(hos);
        ablakCsapat.add(profilkepHos);
        System.out.println(" ");
        System.out.println("---------------------- Sajat Tevekenysegek ----------------------");
        System.out.println(" ");
        System.out.println("lovag betoltve");

        nevErtek.setFont(font);

        nev.setBounds(116,122,100,50);

        nevErtek.setText("László");
        nev.add(nevErtek);
        nev.setOpaque(false);
        nev.repaint();
        ablakCsapat.add(nev);
    }

    public static void emberEgysegreValtas() {
        EgysegKepe.setIcon(foldmuvesIcon);
        leirasEgysegErtek.setText("<html><u>Földműves:</u><p>Nincsen semmilyen speciális ereje.&nbsp;&nbsp;&nbsp;&nbsp;" +
                "&nbsp;&nbsp;&nbsp;&nbsp;</p></html>");

        nevEgyseg1Ertek.setText("Földműves      2         1-1         3          4          8                  ");
        nevEgyseg5Ertek.setText("    Ijász            6         2-4         7          4          9                  ");
        nevEgyseg3Ertek.setText("    Griff            15        5-10       30        7          15                 ");
        nevEgyseg4Ertek.setText(" Harcos Pap     22        9-12       54        5          10                  ");
        nevEgyseg2Ertek.setText(" Fegyvernök     11        2-5         33        4          8                    ");
        szamEgyseg1Ertek.setText(""+foldmuvesSzam);
        szamEgyseg5Ertek.setText(""+ijaszSzam);
        szamEgyseg3Ertek.setText(""+griffSzam);
        szamEgyseg4Ertek.setText(""+harcosPapSzam);
        szamEgyseg2Ertek.setText(""+fegyvernokSzam);
    }

    public static void nekromantaEgysegreValtas() {
        EgysegKepe.setIcon(csontvazIcon);
        leirasEgysegErtek.setText("<html><u>Csontváz:</u><p>Nincsen semmilyen speciális ereje.&nbsp;&nbsp;&nbsp;&nbsp;" +
                "&nbsp;&nbsp;&nbsp;&nbsp;</p></html>");

        nevEgyseg1Ertek.setText("Csontváz         2         1-2         2          4          8                  ");
        nevEgyseg5Ertek.setText("    Felderítő          6         1-4         10        5          10                     ");
        nevEgyseg3Ertek.setText("  Minótaurosz    19        5-11       80        4          4                    ");
        nevEgyseg4Ertek.setText("     Orgyilkos         27        6-18       20       13        16                      ");
        nevEgyseg2Ertek.setText("  Raptor lovas    11        5-9         35        7          7                    ");
        szamEgyseg1Ertek.setText(""+csontvazSzam);
        szamEgyseg5Ertek.setText(""+felderitoSzam);
        szamEgyseg3Ertek.setText(""+minotaurSzam);
        szamEgyseg4Ertek.setText(""+orgyilkosSzam);
        szamEgyseg2Ertek.setText(""+raptorLovasSzam);
    }
}
