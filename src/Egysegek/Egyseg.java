package Egysegek;

import javax.swing.*;
import java.awt.*;

import static Hos.Tulajdonsagok.Tulajdonsagai.arany;
import static Hos.Tulajdonsagok.Tulajdonsagai.aranyErteke;
import static Ablakok.Csapat.ablakCsapat;

public class Egyseg {

    private static Egyseg instance = null;

    public static Egyseg getInstance()
    {
        if (instance == null)
            instance = new Egyseg();

        return instance;
    }

    public static JButton tizSzeresGomb;
    public static JButton szazSzorosGomb;
    public static JButton egySzeresGomb;

    public static JButton plusszGombElso;
    public static JButton minuszGombElso;

    public static JButton plusszGombMasodik;
    public static JButton minuszGombMasodik;

    public static JButton plusszGombHarmadik;
    public static JButton minuszGombHarmadik;

    public static JButton plusszGombNegyedik;
    public static JButton minuszGombNegyedik;

    public static JButton plusszGombOtodik;
    public static JButton minuszGombOtodik;

    public Egyseg() {

        tizSzeresGomb = new JButton();
        szazSzorosGomb = new JButton();
        egySzeresGomb = new JButton();

        plusszGombElso = new JButton();
        minuszGombElso = new JButton();

        plusszGombMasodik = new JButton();
        minuszGombMasodik = new JButton();

        plusszGombHarmadik = new JButton();
        minuszGombHarmadik = new JButton();

        plusszGombNegyedik = new JButton();
        minuszGombNegyedik = new JButton();

        plusszGombOtodik = new JButton();
        minuszGombOtodik = new JButton();


        tizSzeresGomb.addActionListener(e -> {
            hanyszoros=10;
            egySzeresGomb.setBorderPainted(false);
            tizSzeresGomb.setBorderPainted(true);
            szazSzorosGomb.setBorderPainted(false);
            System.out.println("10x egyseg vetel");
        });
        szazSzorosGomb.addActionListener(e -> {
            hanyszoros=100;
            egySzeresGomb.setBorderPainted(false);
            tizSzeresGomb.setBorderPainted(false);
            szazSzorosGomb.setBorderPainted(true);
            System.out.println("100x egyseg vetel");
        });
        egySzeresGomb.addActionListener(e -> {
            hanyszoros=1;
            egySzeresGomb.setBorderPainted(true);
            tizSzeresGomb.setBorderPainted(false);
            szazSzorosGomb.setBorderPainted(false);
            System.out.println("1x egyseg vetel");
        });

        plusszGombOtodik.addActionListener(e -> {
            if (arany - (27*hanyszoros) >= 0 && !negyedik) {
                osszEgyseg+= hanyszoros;
                orgyilkosSzam += hanyszoros;
                arany -= 27*hanyszoros;
                EgysegKepe.setIcon(orgyilkosIcon);
                leirasEgysegErtek.setText("<html><u>Orgyilkos:</u><p>Kitérés a speciális ereje.&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" +
                        "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" +
                        "<p>20%-os eséllyel kitérhet.</p></p></html>");

                System.out.println(hanyszoros+" orgyilkos megvasarolva");
                aranyErteke.setText(String.valueOf(arany));
                szamEgyseg4Ertek.setText(""+orgyilkosSzam);
            }
        });
        minuszGombOtodik.addActionListener(e -> {
            if ( orgyilkosSzam -hanyszoros >= 0 && !negyedik) {
                osszEgyseg-= hanyszoros;
                orgyilkosSzam -= hanyszoros;
                arany += 27*hanyszoros;
                System.out.println(hanyszoros+" orgyilkos eladva");
                aranyErteke.setText(String.valueOf(arany));
                szamEgyseg4Ertek.setText(""+orgyilkosSzam);
            }
        });
        plusszGombOtodik.addActionListener(e -> {
            if (arany - (22*hanyszoros) >= 0 && negyedik) {
                osszEgyseg+= hanyszoros;
                harcosPapSzam += hanyszoros;
                arany -= 22*hanyszoros;
                EgysegKepe.setIcon(harcosPapIcon);
                leirasEgysegErtek.setText("<html><u>Harcos Pap:</u><p>Nincs közelharci levonás a speciális e-</p></p>reje. Lövész, " +
                        "de közelharcra is képes.</p><p>Azonban ha vannak mellette </p><p> akkor már nem lövész.</p></html>");

                aranyErteke.setText(String.valueOf(arany));
                szamEgyseg4Ertek.setText(""+harcosPapSzam);
                System.out.println(hanyszoros+" harcos pap megvasarolva");
            }
        });
        minuszGombOtodik.addActionListener(e -> {
            if ( harcosPapSzam -hanyszoros >= 0 && negyedik) {
                osszEgyseg -= hanyszoros;
                harcosPapSzam -= hanyszoros;
                arany += 22*hanyszoros;
                aranyErteke.setText(String.valueOf(arany));
                szamEgyseg4Ertek.setText(""+harcosPapSzam);
                System.out.println(hanyszoros+" harcos pap eladva");
            }
        });

        plusszGombNegyedik.addActionListener(e -> {
            if (arany - (11*hanyszoros) >= 0 && !masodik) {
                osszEgyseg += hanyszoros;
                raptorLovasSzam += hanyszoros;
                arany -= 11*hanyszoros;
                EgysegKepe.setIcon(raptorLovasIcon);
                leirasEgysegErtek.setText("<html><u>Raptor lovas:</u><p> Elkerülés a speciális ereje.</p>" +
                        "</p><p>Nem támadják vissza 70%-os eséllyel.&nbsp;&nbsp;&nbsp; </p></html>");
                aranyErteke.setText(String.valueOf(arany));
                szamEgyseg2Ertek.setText(""+raptorLovasSzam);
                System.out.println(hanyszoros+" raptor lovas megvasarolva");
            }
        });
        minuszGombNegyedik.addActionListener(e -> {
            if ( raptorLovasSzam -hanyszoros >= 0 && !masodik) {
                osszEgyseg -= hanyszoros;
                raptorLovasSzam -= hanyszoros;
                arany += 11*hanyszoros;
                aranyErteke.setText(String.valueOf(arany));
                szamEgyseg2Ertek.setText(""+raptorLovasSzam);
                System.out.println(hanyszoros+" raptor lovas eladva");
            }
        });
        plusszGombNegyedik.addActionListener(e -> {
            if (arany - (11*hanyszoros) >= 0 && masodik) {
                osszEgyseg+= hanyszoros;
                fegyvernokSzam += hanyszoros;
                arany -= 11*hanyszoros;
                EgysegKepe.setIcon(fegyvernokIcon);
                leirasEgysegErtek.setText("<html><u>Fegyvernök:</u><p>Nagy pajzs a speciális ereje.</p><p>" +
                        "A támadások csak 60%-ban sebzik őt.&nbsp;&nbsp;</p></html>");
                aranyErteke.setText(String.valueOf(arany));
                szamEgyseg2Ertek.setText(""+fegyvernokSzam);
                System.out.println(hanyszoros+" fegyvernok megvasarolva");
            }
        });
        minuszGombNegyedik.addActionListener(e -> {
            if ( fegyvernokSzam -hanyszoros >= 0 && masodik) {
                osszEgyseg -= hanyszoros;
                fegyvernokSzam -= hanyszoros;
                arany += 11*hanyszoros;
                aranyErteke.setText(String.valueOf(arany));
                szamEgyseg2Ertek.setText(""+fegyvernokSzam);
                System.out.println(hanyszoros+" fegyvernok eladva");
            }
        });

        plusszGombHarmadik.addActionListener(e -> {
            if (arany - (19*hanyszoros) >= 0 && !harmadik) {
                osszEgyseg+= hanyszoros;
                minotaurSzam += hanyszoros;
                arany -= 19*hanyszoros;
                EgysegKepe.setIcon(minotaurIcon);
                leirasEgysegErtek.setText("<html><u>Minótaurosz:</u><p> Roham a speciális ereje.</p>" +
                        "</p><p>30%-os eséllyel megnövekedhet a se-&nbsp;&nbsp;&nbsp;&nbsp;</p><p>bessége.</p></html>");
                aranyErteke.setText(String.valueOf(arany));
                szamEgyseg3Ertek.setText(""+minotaurSzam);
                System.out.println(hanyszoros+" minotaur megvasarolva");
            }
        });

        minuszGombHarmadik.addActionListener(e -> {
            if ( minotaurSzam -hanyszoros >= 0 && !harmadik) {
                osszEgyseg-= hanyszoros;
                minotaurSzam -= hanyszoros;
                arany += 19*hanyszoros;
                aranyErteke.setText(String.valueOf(arany));
                szamEgyseg3Ertek.setText(""+minotaurSzam);
                System.out.println(hanyszoros+" minotaur eladva");
            }
        });
        plusszGombHarmadik.addActionListener(e -> {
            if (arany - (15*hanyszoros) >= 0 && harmadik) {
                osszEgyseg+= hanyszoros;
                griffSzam += hanyszoros;
                arany -= 15*hanyszoros;
                EgysegKepe.setIcon(griffIcon);
                leirasEgysegErtek.setText("<html><u>Griff:</u><p>Végtelen Visszatámadás</p><p> a speciális ereje." +
                        "<p>Vissza tud támadni minden alkalommal.</p></p></html>");
                aranyErteke.setText(String.valueOf(arany));
                szamEgyseg3Ertek.setText(""+griffSzam);
                System.out.println(hanyszoros+" griff megvasarolva");
            }
        });
        minuszGombHarmadik.addActionListener(e -> {
            if ( griffSzam -hanyszoros >= 0 && harmadik) {
                osszEgyseg-= hanyszoros;
                griffSzam -= hanyszoros;
                arany += 15*hanyszoros;
                aranyErteke.setText(String.valueOf(arany));
                szamEgyseg3Ertek.setText(""+griffSzam);
                System.out.println(hanyszoros+" griff eladva");
            }
        });

        plusszGombMasodik.addActionListener(e -> {
            if (arany - (6*hanyszoros) >= 0 && !otodik) {
                osszEgyseg+= hanyszoros;
                felderitoSzam += hanyszoros;
                arany -= 6*hanyszoros;
                EgysegKepe.setIcon(felderitoIcon);
                leirasEgysegErtek.setText("<html><u>Felderítő:</u><p>Lövés a speciális ereje.</p></p>Ha nincs mellette" +
                        "</p><p> ellenfél akkor meglő távolról 1 ellenfe-&nbsp;&nbsp;</p><p>let.<p></html>");
                aranyErteke.setText(String.valueOf(arany));
                szamEgyseg5Ertek.setText(""+felderitoSzam);
                System.out.println(hanyszoros+" felderito megvasarolva");
            }
        });
        minuszGombMasodik.addActionListener(e -> {
            if ( felderitoSzam -hanyszoros >= 0 && !otodik) {
                osszEgyseg-= hanyszoros;
                felderitoSzam -= hanyszoros;
                arany += 6*hanyszoros;
                aranyErteke.setText(String.valueOf(arany));
                szamEgyseg5Ertek.setText(""+felderitoSzam);
                System.out.println(hanyszoros+" felderito eladva");
            }
        });
        plusszGombMasodik.addActionListener(e -> {
            if ( arany - (6*hanyszoros) >= 0 && otodik) {
                osszEgyseg+= hanyszoros;
                ijaszSzam += hanyszoros;
                arany -= 6*hanyszoros;
                EgysegKepe.setIcon(ijaszIcon);
                leirasEgysegErtek.setText("<html><u>Ijász:</u><p>Lövés a speciális ereje.</p></p>Ha nincs mellette" +
                        "</p><p> ellenfél akkor meglő távolról 1 ellenfe-&nbsp;&nbsp;</p><p>let.<p></html>");
                aranyErteke.setText(String.valueOf(arany));
                szamEgyseg5Ertek.setText(""+ijaszSzam);
                System.out.println(hanyszoros+" ijasz megvasarolva");
            }
        });
        minuszGombMasodik.addActionListener(e -> {
            if ( ijaszSzam -hanyszoros  >= 0 && otodik) {
                osszEgyseg-= hanyszoros;
                ijaszSzam -= hanyszoros;
                arany += 6*hanyszoros;
                aranyErteke.setText(String.valueOf(arany));
                szamEgyseg5Ertek.setText(""+ijaszSzam);
                System.out.println(hanyszoros+" ijasz eladva");
            }
        });

        plusszGombElso.addActionListener(e -> {
            if (arany - (2*hanyszoros) >= 0 && !elso) {
                osszEgyseg+= hanyszoros;
                csontvazSzam += hanyszoros;
                arany -= 2*hanyszoros;
                EgysegKepe.setIcon(csontvazIcon);
                leirasEgysegErtek.setText("<html><u>Csontváz:</u><p>Nincsen semmilyen speciális ereje.&nbsp;&nbsp;&nbsp;&nbsp;" +
                        "&nbsp;&nbsp;&nbsp;&nbsp;</p></html>");
                aranyErteke.setText(String.valueOf(arany));
                szamEgyseg1Ertek.setText(""+csontvazSzam);
                System.out.println(hanyszoros+" csontvaz megvasarolva");
            }
        });
        minuszGombElso.addActionListener(e -> {
            if ( csontvazSzam -hanyszoros >= 0 && !elso) {
                osszEgyseg-= hanyszoros;
                csontvazSzam -= hanyszoros;
                arany += 2*hanyszoros;
                aranyErteke.setText(String.valueOf(arany));
                szamEgyseg1Ertek.setText(""+csontvazSzam);
                System.out.println(hanyszoros+" csontvaz eladva");
            }
        });
        plusszGombElso.addActionListener(e -> {
            if (arany - (2*hanyszoros) >= 0 && elso) {
                osszEgyseg+= hanyszoros;
                foldmuvesSzam += hanyszoros;
                arany -= 2*hanyszoros;
                EgysegKepe.setIcon(foldmuvesIcon);
                leirasEgysegErtek.setText("<html><u>Földműves:</u><p>Nincsen semmilyen speciális ereje.&nbsp;&nbsp;&nbsp;&nbsp;" +
                        "&nbsp;&nbsp;&nbsp;&nbsp;</p></html>");
                        szamEgyseg1Ertek.setText(""+foldmuvesSzam);
                aranyErteke.setText(String.valueOf(arany));
                System.out.println(hanyszoros+" foldmuves megvasarolva");
            }
        });
        minuszGombElso.addActionListener(e -> {
            if ( foldmuvesSzam -hanyszoros >= 0 && elso) {
                osszEgyseg-= hanyszoros;
                foldmuvesSzam -= hanyszoros;
                arany += 2*hanyszoros;
                aranyErteke.setText(String.valueOf(arany));
                szamEgyseg1Ertek.setText(""+foldmuvesSzam);
                System.out.println(hanyszoros+" foldmuves eladva");
            }
        });
    }

    public static boolean elso=true;
    public static boolean masodik=true;
    public static boolean harmadik=true;
    public static boolean negyedik=true;
    public static boolean otodik=true;

    public static ImageIcon csontvazIcon = new ImageIcon("Kepek/egysegek/csontvaz.jpg");
    public static ImageIcon foldmuvesIcon = new ImageIcon("Kepek/egysegek/foldmuves.jpg");
    ImageIcon felderitoIcon = new ImageIcon("Kepek/egysegek/felderito.jpg");
    ImageIcon ijaszIcon = new ImageIcon("Kepek/egysegek/ijasz.jpg");
    ImageIcon minotaurIcon = new ImageIcon("Kepek/egysegek/minotaurosz.jpg");
    ImageIcon griffIcon = new ImageIcon("Kepek/egysegek/griff.jpg");
    ImageIcon raptorLovasIcon = new ImageIcon("Kepek/egysegek/raptorlovas.jpg");
    ImageIcon fegyvernokIcon = new ImageIcon("Kepek/egysegek/fegyvernok.jpg");
    ImageIcon harcosPapIcon = new ImageIcon("Kepek/egysegek/harcospap.jpg");
    ImageIcon orgyilkosIcon = new ImageIcon("Kepek/egysegek/orgyilkos.jpg");

    public static int orgyilkosSzam = 0;
    public static int harcosPapSzam = 0;
    public static int fegyvernokSzam = 0;
    public static int raptorLovasSzam = 0;
    public static int griffSzam = 0;
    public static int minotaurSzam = 0;
    public static int ijaszSzam = 0;
    public static int felderitoSzam = 0;
    public static int foldmuvesSzam = 0;
    public static int csontvazSzam = 0;

    public static int hanyszoros=1;

    static JPanel EgysegKep = new JPanel();
    public static JLabel EgysegKepe = new JLabel();

    public static JPanel leirasEgyseg = new JPanel();
    public static JLabel leirasEgysegErtek = new JLabel();

    public static JPanel nevEgyseg1 = new JPanel();
    public static JLabel nevEgyseg1Ertek = new JLabel();

    public static JPanel nevEgyseg2 = new JPanel();
    public static JLabel nevEgyseg2Ertek = new JLabel();

    public static JPanel nevEgyseg3 = new JPanel();
    public static JLabel nevEgyseg3Ertek = new JLabel();

    public static JPanel nevEgyseg4 = new JPanel();
    public static JLabel nevEgyseg4Ertek = new JLabel();

    public static JPanel nevEgyseg5 = new JPanel();
    public static JLabel nevEgyseg5Ertek = new JLabel();

    public static JPanel szamEgyseg1 = new JPanel();
    public static JLabel szamEgyseg1Ertek = new JLabel();

    public static JPanel szamEgyseg2 = new JPanel();
    public static JLabel szamEgyseg2Ertek = new JLabel();

    public static JPanel szamEgyseg3 = new JPanel();
    public static JLabel szamEgyseg3Ertek = new JLabel();

    public static JPanel szamEgyseg4 = new JPanel();
    public static JLabel szamEgyseg4Ertek = new JLabel();

    public static JPanel szamEgyseg5 = new JPanel();
    public static JLabel szamEgyseg5Ertek = new JLabel();

    public static Font font = new Font("Arial", Font.BOLD, 20);
    public static Font fontKicsi = new Font("Arial", Font.BOLD, 16);

    public static int osszEgyseg= 0;


    public void kepek() {

        EgysegKep.setBounds(369,435,128,128);
        EgysegKep.setOpaque(false);
        EgysegKep.add(EgysegKepe);
        ablakCsapat.add(EgysegKep);
    }

    public void egysegekVetele() {

        elsoEgyseg();
        masodikEgyseg();
        harmadikEgyseg();
        negyedikEgyseg();
        otodikEgyseg();

        tizSzeresGomb.setBounds(828, 141, 25, 25);
        tizSzeresGomb.setOpaque(false);
        tizSzeresGomb.setContentAreaFilled(false);
        tizSzeresGomb.setBorderPainted(false);
        tizSzeresGomb.setBorder(BorderFactory.createMatteBorder(1, 1, 2, 2, Color.BLACK));
        tizSzeresGomb.setFocusable(false);

        szazSzorosGomb.setBounds(856, 141, 25, 25);
        szazSzorosGomb.setOpaque(false);
        szazSzorosGomb.setContentAreaFilled(false);
        szazSzorosGomb.setBorderPainted(false);
        szazSzorosGomb.setBorder(BorderFactory.createMatteBorder(1, 1, 2, 2, Color.BLACK));
        szazSzorosGomb.setFocusable(false);

        egySzeresGomb.setBounds(800, 141, 25, 25);
        egySzeresGomb.setOpaque(false);
        egySzeresGomb.setContentAreaFilled(false);
        egySzeresGomb.setBorderPainted(true);
        egySzeresGomb.setBorder(BorderFactory.createMatteBorder(1, 1, 2, 2, Color.BLACK));
        egySzeresGomb.setFocusable(false);

        ablakCsapat.add(tizSzeresGomb);
        ablakCsapat.add(szazSzorosGomb);
        ablakCsapat.add(egySzeresGomb);
    }

    public static void elsoEgyseg() {

        plusszGombElso.setBounds(843, 183, 25, 25);
        plusszGombElso.setOpaque(false);
        plusszGombElso.setContentAreaFilled(false);
        plusszGombElso.setBorderPainted(false);
        plusszGombElso.setFocusable(false);

        minuszGombElso.setBounds(815, 183, 25, 25);
        minuszGombElso.setOpaque(false);
        minuszGombElso.setContentAreaFilled(false);
        minuszGombElso.setBorderPainted(false);
        minuszGombElso.setFocusable(false);

        ablakCsapat.add(plusszGombElso);
        ablakCsapat.add(minuszGombElso);

        EgysegKep.setBounds(369,435,128,128);
        EgysegKep.setOpaque(false);
        EgysegKepe.setIcon(foldmuvesIcon);
        EgysegKep.add(EgysegKepe);
        ablakCsapat.add(EgysegKep);

        leirasEgysegErtek.setFont(font);

        leirasEgyseg.setBounds(440, 430, 500, 160);

        leirasEgysegErtek.setText("<html><u>Földműves:</u><p>Nincsen semmilyen speciális ereje.&nbsp;&nbsp;&nbsp;&nbsp;" +
                "&nbsp;&nbsp;&nbsp;&nbsp;</p></html>");

        leirasEgyseg.add(leirasEgysegErtek);
        leirasEgyseg.setOpaque(false);
        leirasEgyseg.repaint();
        ablakCsapat.add(leirasEgyseg);

        nevEgyseg1Ertek.setFont(fontKicsi);

        nevEgyseg1.setBounds(350, 180, 460, 30);
        
        nevEgyseg1Ertek.setText("Földműves      2         1-1         3          4          8                  ");
        
        nevEgyseg1.add(nevEgyseg1Ertek);
        nevEgyseg1.setOpaque(false);
        nevEgyseg1.repaint();
        ablakCsapat.add(nevEgyseg1);

        szamEgyseg1Ertek.setFont(fontKicsi);

        szamEgyseg1.setBounds(734, 180, 50, 30);

        szamEgyseg1Ertek.setText(""+foldmuvesSzam);

        szamEgyseg1.add(szamEgyseg1Ertek);
        szamEgyseg1.setOpaque(false);
        szamEgyseg1.repaint();
        ablakCsapat.add(szamEgyseg1);
    }

    public static void csontvazTorles() {
        elso=true;
        arany += 2*csontvazSzam;
        csontvazSzam=0;
        aranyErteke.setText(String.valueOf(arany));
    }

    public static void foldmuvesTorles() {
        elso=false;
        arany += 2*foldmuvesSzam;
        foldmuvesSzam=0;
        aranyErteke.setText(String.valueOf(arany));
    }

    public static void masodikEgyseg() {

        plusszGombMasodik.setBounds(843, 233, 25, 25);
        plusszGombMasodik.setOpaque(false);
        plusszGombMasodik.setContentAreaFilled(false);
        plusszGombMasodik.setBorderPainted(false);
        plusszGombMasodik.setFocusable(false);

        minuszGombMasodik.setBounds(815, 233, 25, 25);
        minuszGombMasodik.setOpaque(false);
        minuszGombMasodik.setContentAreaFilled(false);
        minuszGombMasodik.setBorderPainted(false);
        minuszGombMasodik.setFocusable(false);

        ablakCsapat.add(plusszGombMasodik);
        ablakCsapat.add(minuszGombMasodik);

        nevEgyseg2Ertek.setFont(fontKicsi);

        nevEgyseg2.setBounds(350, 380, 460, 30);

        nevEgyseg2Ertek.setText(" Fegyvernök     11        2-5         33        4          8                    ");
        nevEgyseg2.add(nevEgyseg2Ertek);
        nevEgyseg2.setOpaque(false);
        nevEgyseg2.repaint();
        ablakCsapat.add(nevEgyseg2);

        szamEgyseg2Ertek.setFont(fontKicsi);

        szamEgyseg2.setBounds(734, 380, 50, 30);

        szamEgyseg2Ertek.setText(""+fegyvernokSzam);

        szamEgyseg2.add(szamEgyseg2Ertek);
        szamEgyseg2.setOpaque(false);
        szamEgyseg2.repaint();
        ablakCsapat.add(szamEgyseg2);
    }

    public static void raptorLovasTorles() {
        masodik=true;
        arany += 11*raptorLovasSzam;
        raptorLovasSzam=0;
        aranyErteke.setText(String.valueOf(arany));
    }

    public static void fegyvernokTorles() {
        masodik=false;
        arany += 11*fegyvernokSzam;
        fegyvernokSzam=0;
        aranyErteke.setText(String.valueOf(arany));
    }

    public static void harmadikEgyseg() {

        plusszGombHarmadik.setBounds(843, 283, 25, 25);
        plusszGombHarmadik.setOpaque(false);
        plusszGombHarmadik.setContentAreaFilled(false);
        plusszGombHarmadik.setBorderPainted(false);
        plusszGombHarmadik.setFocusable(false);

        minuszGombHarmadik.setBounds(815, 283, 25, 25);
        minuszGombHarmadik.setOpaque(false);
        minuszGombHarmadik.setContentAreaFilled(false);
        minuszGombHarmadik.setBorderPainted(false);
        minuszGombHarmadik.setFocusable(false);

        ablakCsapat.add(plusszGombHarmadik);
        ablakCsapat.add(minuszGombHarmadik);

        nevEgyseg3Ertek.setFont(fontKicsi);

        nevEgyseg3.setBounds(350, 280, 460, 30);

        nevEgyseg3Ertek.setText("    Griff            15        5-10       30        7          15                 ");
        nevEgyseg3.add(nevEgyseg3Ertek);
        nevEgyseg3.setOpaque(false);
        nevEgyseg3.repaint();
        ablakCsapat.add(nevEgyseg3);

        szamEgyseg3Ertek.setFont(fontKicsi);

        szamEgyseg3.setBounds(734, 280, 50, 30);

        szamEgyseg3Ertek.setText(""+griffSzam);

        szamEgyseg3.add(szamEgyseg3Ertek);
        szamEgyseg3.setOpaque(false);
        szamEgyseg3.repaint();
        ablakCsapat.add(szamEgyseg3);
    }

    public static void griffTorles() {
        harmadik=false;
        arany += 15*griffSzam;
        griffSzam=0;
        aranyErteke.setText(String.valueOf(arany));
    }

    public static void minotaurTorles() {
        harmadik=true;
        arany += 19*minotaurSzam;
        minotaurSzam=0;
        aranyErteke.setText(String.valueOf(arany));
    }

    public static void negyedikEgyseg() {

        plusszGombNegyedik.setBounds(843, 383, 25, 25);
        plusszGombNegyedik.setOpaque(false);
        plusszGombNegyedik.setContentAreaFilled(false);
        plusszGombNegyedik.setBorderPainted(false);
        plusszGombNegyedik.setFocusable(false);

        minuszGombNegyedik.setBounds(815, 383, 25, 25);
        minuszGombNegyedik.setOpaque(false);
        minuszGombNegyedik.setContentAreaFilled(false);
        minuszGombNegyedik.setBorderPainted(false);
        minuszGombNegyedik.setFocusable(false);

        ablakCsapat.add(plusszGombNegyedik);
        ablakCsapat.add(minuszGombNegyedik);

        nevEgyseg4Ertek.setFont(fontKicsi);

        nevEgyseg4.setBounds(350, 330, 460, 30);

        nevEgyseg4Ertek.setText(" Harcos Pap     22        9-12       54        5          10                  ");
        nevEgyseg4.add(nevEgyseg4Ertek);
        nevEgyseg4.setOpaque(false);
        nevEgyseg4.repaint();
        ablakCsapat.add(nevEgyseg4);

        szamEgyseg4Ertek.setFont(fontKicsi);

        szamEgyseg4.setBounds(734, 330, 50, 30);

        szamEgyseg4Ertek.setText(""+harcosPapSzam);

        szamEgyseg4.add(szamEgyseg4Ertek);
        szamEgyseg4.setOpaque(false);
        szamEgyseg4.repaint();
        ablakCsapat.add(szamEgyseg4);
    }

    public static void harcosPapTorles() {
        negyedik=false;
        arany += 22*harcosPapSzam;
        harcosPapSzam=0;
        aranyErteke.setText(String.valueOf(arany));
    }

    public static void orgyilkosTorles() {
        negyedik=true;
        arany += 27*orgyilkosSzam;
        orgyilkosSzam=0;
        aranyErteke.setText(String.valueOf(arany));
    }

    public static void otodikEgyseg() {

        plusszGombOtodik.setBounds(843, 333, 25, 25);
        plusszGombOtodik.setOpaque(false);
        plusszGombOtodik.setContentAreaFilled(false);
        plusszGombOtodik.setBorderPainted(false);
        plusszGombOtodik.setFocusable(false);

        minuszGombOtodik.setBounds(815, 333, 25, 25);
        minuszGombOtodik.setOpaque(false);
        minuszGombOtodik.setContentAreaFilled(false);
        minuszGombOtodik.setBorderPainted(false);
        minuszGombOtodik.setFocusable(false);

        ablakCsapat.add(plusszGombOtodik);
        ablakCsapat.add(minuszGombOtodik);

        nevEgyseg5Ertek.setFont(fontKicsi);

        nevEgyseg5.setBounds(350, 230, 460, 30);

        nevEgyseg5Ertek.setText("    Ijász            6         2-4         7          4          9                  ");
        nevEgyseg5.add(nevEgyseg5Ertek);
        nevEgyseg5.setOpaque(false);
        nevEgyseg5.repaint();
        ablakCsapat.add(nevEgyseg5);

        szamEgyseg5Ertek.setFont(fontKicsi);

        szamEgyseg5.setBounds(734, 230, 50, 30);

        szamEgyseg5Ertek.setText(""+ijaszSzam);

        szamEgyseg5.add(szamEgyseg5Ertek);
        szamEgyseg5.setOpaque(false);
        szamEgyseg5.repaint();
        ablakCsapat.add(szamEgyseg5);
    }

    public static void felderitoTorles() {
        otodik=true;
        arany += 6*felderitoSzam;
        felderitoSzam=0;
        aranyErteke.setText(String.valueOf(arany));
    }

    public static void ijaszTorles() {
        otodik=false;
        arany += 6*ijaszSzam;
        ijaszSzam=0;
        aranyErteke.setText(String.valueOf(arany));
    }
}