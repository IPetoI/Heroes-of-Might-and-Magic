package Ablakok;

import Egysegek.Egyseg;
import Hos.Tulajdonsagok.Tulajdonsagai;
import Jatek.*;
import Varazslatok.Varazslat;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

import static Egysegek.Egyseg.osszEgyseg;
import static Egysegek.EgysegLetetel.*;
import static Ellenfel.EllenfelEgysege.*;
import static Hos.Tulajdonsagok.Moral.moral;
import static Hos.Tulajdonsagok.Szerencse.szerencse;
import static Hos.Tulajdonsagok.Tamadas.tamadas;
import static Hos.Tulajdonsagok.Tudas.tudas;
import static Hos.Tulajdonsagok.Vedekezes.vedekezes;
import static Hos.Tulajdonsagok.Varazsero.varazsero;
import static Ablakok.EgysegLepakolasAblak.*;
import static Jatek.JatekAblak.*;
import static Jatek.Valasztas.lovage;
import static Jatek.XYKordinatakBemenet.*;

public class Csapat{

    JButton visszaGomb;
    JButton visszaallitasGomb;
    JButton csataGomb;

    EgysegLepakolasAblak egysegLepakolasAblak = EgysegLepakolasAblak.getInstance();

    private static Csapat instance = null;

    private Csapat() {
        visszaGomb = new JButton();
        visszaallitasGomb = new JButton();
        csataGomb = new JButton();

        visszaGomb.addActionListener(e -> {
            String[] lehetosegek = {"Igen, kilépek", "Mégse lépek ki"};
            ImageIcon ikon = new ImageIcon("Kepek/ikon1.png");

            int x = JOptionPane.showOptionDialog(null, "Ha kilépsz törlődik az eddigi összeállításod!",
                    "Biztos vagy benne?", JOptionPane.YES_NO_OPTION,
                    JOptionPane.INFORMATION_MESSAGE, ikon, lehetosegek, 0);
            if (x == 0) {
                VisszaAllitas.visszaAllitas();
                ablakCsapat.remove(alap);
                ablakCsapat.dispose();
                KezdoAblak kezdoAblak = KezdoAblak.getInstance();
                kezdoAblak.kezdoAblak();
            }
        });

        visszaallitasGomb.addActionListener(e -> VisszaAllitas.visszaAllitas());

        csataGomb.addActionListener(
                this::actionPerformed);
    }

    public static Csapat getInstance()
    {
        if (instance == null)
            instance = new Csapat();

        return instance;
    }

    public static JFrame ablakCsapat = new JFrame("Heroes of Might & Magic");

    ImageIcon ikon = new ImageIcon("Kepek/ikon.png");
    ImageIcon alapKep = new ImageIcon("Kepek/csapat.jpg");

    JLabel alap = new JLabel("",alapKep,JLabel.CENTER);

    Valasztas valasztas = new Valasztas();

    public void csapat() {

        gyozelemVagyVereseg.removeAll();
        gyozelemVagyVereseg.repaint();

        visszaGomb.setBounds(17, 28, 150, 40);
        visszaGomb.setOpaque(false);
        visszaGomb.setContentAreaFilled(false);
        visszaGomb.setBorderPainted(false);
        visszaGomb.setFocusable(false);

        ablakCsapat.add(visszaGomb);

        visszaallitasGomb.setBounds(871, 545, 155, 40);
        visszaallitasGomb.setOpaque(false);
        visszaallitasGomb.setContentAreaFilled(false);
        visszaallitasGomb.setBorderPainted(false);
        visszaallitasGomb.setFocusable(false);

        ablakCsapat.add(visszaallitasGomb);

        csataGomb.setBounds(1045, 545, 205, 40);
        csataGomb.setOpaque(false);
        csataGomb.setContentAreaFilled(false);
        csataGomb.setBorderPainted(false);
        csataGomb.setFocusable(false);

        ablakCsapat.add(csataGomb);

        Tulajdonsagai tulajdonsagai = Tulajdonsagai.getInstance();
        tulajdonsagai.arany();
        tulajdonsagai.tulajdonsagaik();

        valasztas.hosValasztas();

        Varazslat.varazslatai();

        Egyseg egysegember = Egyseg.getInstance();
        egysegember.egysegekVetele();


        ablakCsapat.setIconImage(ikon.getImage());

        ablakCsapat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ablakCsapat.setSize(1280, 635);
        ablakCsapat.setLayout(new BorderLayout());
        ablakCsapat.setVisible(true);
        ablakCsapat.setResizable(false);
        ablakCsapat.add(alap);
        ablakCsapat.setLocationRelativeTo(null);
    }

    private void actionPerformed(ActionEvent e) {

        if (osszEgyseg > 0) {

        egysegekSorrend.remove(egysegL5TestKep);
        egysegekSorrend.remove(egysegL4TestKep);
        egysegekSorrend.remove(egysegL3TestKep);
        egysegekSorrend.remove(egysegL2TestKep);
        egysegekSorrend.remove(egysegL1TestKep);

        egysegekSorrend.remove(egysegIras5);
        egysegekSorrend.remove(egysegIras4);
        egysegekSorrend.remove(egysegIras3);
        egysegekSorrend.remove(egysegIras2);
        egysegekSorrend.remove(egysegIras1);

        egysegekSorrend.remove(ellenfelEgysegL5Kep);
        egysegekSorrend.remove(ellenfelEgysegL4Kep);
        egysegekSorrend.remove(ellenfelEgysegL3Kep);
        egysegekSorrend.remove(ellenfelEgysegL2Kep);
        egysegekSorrend.remove(ellenfelEgysegL1Kep);

        egysegekSorrend.remove(ellenfelEgysegIras5);
        egysegekSorrend.remove(ellenfelEgysegIras4);
        egysegekSorrend.remove(ellenfelEgysegIras3);
        egysegekSorrend.remove(ellenfelEgysegIras2);
        egysegekSorrend.remove(ellenfelEgysegIras1);

        sor1oszlop1 = false; sor2oszlop1 = false; sor3oszlop1 = false; sor4oszlop1 = false; sor5oszlop1 = false; sor6oszlop1 = false;
            sor7oszlop1 = false; sor8oszlop1 = false; sor9oszlop1 = false; sor10oszlop1 = false;
        sor1oszlop2 = false; sor2oszlop2 = false; sor3oszlop2 = false; sor4oszlop2 = false; sor5oszlop2 = false; sor6oszlop2 = false;
            sor7oszlop2 = false; sor8oszlop2 = false; sor9oszlop2 = false; sor10oszlop2 = false;
        sor1oszlop3 = false; sor2oszlop3 = false; sor3oszlop3 = false; sor4oszlop3 = false; sor5oszlop3 = false; sor6oszlop3 = false;
            sor7oszlop3 = false; sor8oszlop3 = false; sor9oszlop3 = false; sor10oszlop3 = false;
        sor1oszlop4 = false; sor2oszlop4 = false; sor3oszlop4 = false; sor4oszlop4 = false; sor5oszlop4 = false; sor6oszlop4 = false;
            sor7oszlop4 = false; sor8oszlop4 = false; sor9oszlop4 = false; sor10oszlop4 = false;
        sor1oszlop5 = false; sor2oszlop5 = false; sor3oszlop5 = false; sor4oszlop5 = false; sor5oszlop5 = false; sor6oszlop5 = false;
            sor7oszlop5 = false; sor8oszlop5 = false; sor9oszlop5 = false; sor10oszlop5 = false;
        sor1oszlop6 = false; sor2oszlop6 = false; sor3oszlop6 = false; sor4oszlop6 = false; sor5oszlop6 = false; sor6oszlop6 = false;
            sor7oszlop6 = false; sor8oszlop6 = false; sor9oszlop6 = false; sor10oszlop6 = false;
        sor1oszlop7 = false; sor2oszlop7 = false; sor3oszlop7 = false; sor4oszlop7 = false; sor5oszlop7 = false; sor6oszlop7 = false;
            sor7oszlop7 = false; sor8oszlop7 = false; sor9oszlop7 = false; sor10oszlop7 = false;
        sor1oszlop8 = false; sor2oszlop8 = false; sor3oszlop8 = false; sor4oszlop8 = false; sor5oszlop8 = false; sor6oszlop8 = false;
            sor7oszlop8 = false; sor8oszlop8 = false; sor9oszlop8 = false; sor10oszlop8 = false;
        sor1oszlop9 = false; sor2oszlop9 = false; sor3oszlop9 = false; sor4oszlop9 = false; sor5oszlop9 = false; sor6oszlop9 = false;
            sor7oszlop9 = false; sor8oszlop9 = false; sor9oszlop9 = false; sor10oszlop9 = false;
        sor1oszlop10 = false; sor2oszlop10 = false; sor3oszlop10 = false; sor4oszlop10 = false; sor5oszlop10 = false; sor6oszlop10 = false;
            sor7oszlop10 = false; sor8oszlop10 = false; sor9oszlop10 = false; sor10oszlop10 = false;
        sor1oszlop11 = false; sor2oszlop11 = false; sor3oszlop11 = false; sor4oszlop11 = false; sor5oszlop11 = false; sor6oszlop11 = false;
            sor7oszlop11 = false; sor8oszlop11 = false; sor9oszlop11 = false; sor10oszlop11 = false;
        sor1oszlop12 = false; sor2oszlop12 = false; sor3oszlop12 = false; sor4oszlop12 = false; sor5oszlop12 = false; sor6oszlop12 = false;
            sor7oszlop12 = false; sor8oszlop12 = false; sor9oszlop12 = false; sor10oszlop12 = false;

        mehet = true;
        JatekAblak.elsoAlkalommal0 = true;

        Sorrend.kor=1;
        Sorrend.korokElsoHely="n";

        System.out.println(" ");
        System.out.println("---------------------- Hos Tulajdonsagai ----------------------");
        System.out.println(" ");
        System.out.println("Hos varazsereje: "+varazsero);
        System.out.println("Hos vedekezese: "+vedekezes);
        System.out.println("Hos szerencseje: "+szerencse);
        System.out.println("Hos tamadasa: "+tamadas);
        System.out.println("Hos moralja: "+moral);
        System.out.println("Hos tudasa: "+tudas);
        System.out.println(" ");
        System.out.println("--------------------------------------------------------------------");

        elsoAlkalommal = true;

            if (lovage == 0) {
                ablakCsata.remove(alapcsata);
                ablakCsata.dispose();
                ablakLepakolas.remove(alap);
                ablakLepakolas.dispose();
                EgysegLepakolasAblak.alap.setIcon(alapKepLovag);
                alapcsata.setIcon(csataKepLovag);
                ablakCsapat.remove(alap);
                ablakCsapat.dispose();
                egysegLepakolasAblak.egysegLepakolas();
            } else if (lovage == 1) {
                ablakCsata.remove(alapcsata);
                ablakCsata.dispose();
                ablakLepakolas.remove(alap);
                ablakLepakolas.dispose();
                EgysegLepakolasAblak.alap.setIcon(alapKepNekromanta);
                alapcsata.setIcon(csataKepNekromanta);
                ablakCsapat.remove(alap);
                ablakCsapat.dispose();
                egysegLepakolasAblak.egysegLepakolas();
            }
        }
    }
}