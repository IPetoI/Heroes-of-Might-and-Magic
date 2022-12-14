package Egysegek;

import Ablakok.EgysegLepakolasAblak;

import javax.swing.*;
import java.awt.*;

import static Egysegek.Eletero.*;
import static Ablakok.EgysegLepakolasAblak.ablakLepakolas;
import static Ablakok.EgysegLepakolasAblak.elsoAlkalommal;
import static Jatek.XYKordinatakBemenet.egyseg;

public class EgysegLetetel {

    private static EgysegLetetel instance = null;

    public static EgysegLetetel getInstance() {
        if (instance == null)
            instance = new EgysegLetetel();

        return instance;
    }

    public static JPanel egysegL1TestKep = new JPanel();
    public static JLabel egysegL1TestKepe = new JLabel();
    public static JPanel egysegIras1 = new JPanel();
    public static JLabel egysegErtek1 = new JLabel();

    public static JPanel egysegL2TestKep = new JPanel();
    public static JLabel egysegL2TestKepe = new JLabel();
    public static JPanel egysegIras2 = new JPanel();
    public static JLabel egysegErtek2 = new JLabel();

    public static JPanel egysegL3TestKep = new JPanel();
    public static JLabel egysegL3TestKepe = new JLabel();
    public static JPanel egysegIras3 = new JPanel();
    public static JLabel egysegErtek3 = new JLabel();

    public static JPanel egysegL4TestKep = new JPanel();
    public static JLabel egysegL4TestKepe = new JLabel();
    public static JPanel egysegIras4 = new JPanel();
    public static JLabel egysegErtek4 = new JLabel();

    public static JPanel egysegL5TestKep = new JPanel();
    public static JLabel egysegL5TestKepe = new JLabel();
    public static JPanel egysegIras5 = new JPanel();
    public static JLabel egysegErtek5 = new JLabel();

    public static JLayeredPane egysegekSorrend = new JLayeredPane();

    public static int oszlop=0;
    public static int sor=0;
    public static double dbSzamElso=0;
    public static double dbSzamMasodik=0;
    public static double dbSzamHarmadik=0;
    public static double dbSzamNegyedik=0;
    public static double dbSzamOtodik=0;
    public static int xKep=0,yKep=0,xIras=0,yIras=0;

    String egysegFajta="n";

    public static Font fontKicsi = new Font("Arial", Font.BOLD, 8);

    EgysegLepakolasAblak egysegLepakolasAblak = EgysegLepakolasAblak.getInstance();

    public void egysegKitetel1() {

        ablakLepakolas.remove(egysegL1TestKep);
        egysegekSorrend.remove(egysegIras1);
        egysegekSorrend.remove(egysegL1TestKep);

        egysegekSorrend.setBounds(0,0,1250,600);

        if (egyseg.equals("foldmuv")) {
            egysegFajta="Foldmuves";
        }else {
            egysegFajta="Csontvaz";
        }
        System.out.println(egysegFajta+" elhelyezve az X: "+oszlop+" , Y: "+sor+" poziciora, eletereje: "+(int)elsoEgysegEletero);
        egysegErtek1.setFont(fontKicsi);
        egysegErtek1.setForeground(new Color(255, 255, 255));

        egysegIras1.setBounds(xIras,yIras,20,15);

        egysegErtek1.setText(String.valueOf((int)dbSzamElso));
        egysegIras1.add(egysegErtek1);
        egysegIras1.setOpaque(false);
        egysegIras1.repaint();

        egysegL1TestKep.setBounds(xKep,yKep,100,100);
        egysegL1TestKep.setOpaque(false);

        egysegL1TestKep.add(egysegL1TestKepe);
        EgysegLathatosag.lathatosagSorrend(egysegIras1,egysegL1TestKep,oszlop,sor);
        ablakLepakolas.add(egysegekSorrend);

        elsoAlkalommal=false;
        egysegLepakolasAblak.egysegLepakolas();
    }

    public void egysegKitetel2() {

        ablakLepakolas.remove(egysegL2TestKep);
        egysegekSorrend.remove(egysegIras2);
        egysegekSorrend.remove(egysegL2TestKep);

        egysegekSorrend.setBounds(0,0,1250,600);

        if (egyseg.equals("ijas")) {
            egysegFajta="Ijas";
        }else {
            egysegFajta="Felderito";
        }
        System.out.println(egysegFajta+" elhelyezve az X: "+oszlop+" , Y: "+sor+" poziciora, eletereje: "+(int)masodikEgysegEletero);
        egysegErtek2.setFont(fontKicsi);
        egysegErtek2.setForeground(new Color(255, 255, 255));

        egysegIras2.setBounds(xIras,yIras,20,15);

        egysegErtek2.setText(String.valueOf((int)dbSzamMasodik));
        egysegIras2.add(egysegErtek2);
        egysegIras2.setOpaque(false);
        egysegIras2.repaint();

        egysegL2TestKep.setBounds(xKep,yKep,100,100);
        egysegL2TestKep.setOpaque(false);

        egysegL2TestKep.add(egysegL2TestKepe);
        EgysegLathatosag.lathatosagSorrend(egysegIras2,egysegL2TestKep,oszlop,sor);
        ablakLepakolas.add(egysegekSorrend);

        elsoAlkalommal=false;
        egysegLepakolasAblak.egysegLepakolas();
    }

    public void egysegKitetel3() {

        ablakLepakolas.remove(egysegL3TestKep);
        egysegekSorrend.remove(egysegIras3);
        egysegekSorrend.remove(egysegL3TestKep);

        egysegekSorrend.setBounds(0,0,1250,600);

         if (egyseg.equals("grif")) {
            egysegFajta="Griff";
        }else {
            egysegFajta="Minotaurosz";
        }
        System.out.println(egysegFajta+" elhelyezve az X: "+oszlop+" , Y: "+sor+" poziciora, eletereje: "+(int)harmadikEgysegEletero);
        egysegErtek3.setFont(fontKicsi);
        egysegErtek3.setForeground(new Color(255, 255, 255));

        egysegIras3.setBounds(xIras,yIras,20,15);

        egysegErtek3.setText(String.valueOf((int)dbSzamHarmadik));
        egysegIras3.add(egysegErtek3);
        egysegIras3.setOpaque(false);
        egysegIras3.repaint();

        egysegL3TestKep.setBounds(xKep,yKep,100,100);
        egysegL3TestKep.setOpaque(false);

        egysegL3TestKep.add(egysegL3TestKepe);
        EgysegLathatosag.lathatosagSorrend(egysegIras3,egysegL3TestKep,oszlop,sor);
        ablakLepakolas.add(egysegekSorrend);

        elsoAlkalommal=false;
        egysegLepakolasAblak.egysegLepakolas();
    }

    public void egysegKitetel4() {

        ablakLepakolas.remove(egysegL4TestKep);
        egysegekSorrend.remove(egysegIras4);
        egysegekSorrend.remove(egysegL4TestKep);

        egysegekSorrend.setBounds(0,0,1250,600);

         if (egyseg.equals("fegyv")) {
            egysegFajta="Fegyvernok";
        }else {
            egysegFajta="Orgyilkos";
        }
        System.out.println(egysegFajta+" elhelyezve az X: "+oszlop+" , Y: "+sor+" poziciora, eletereje: "+(int)negyedikEgysegEletero);
        egysegErtek4.setFont(fontKicsi);
        egysegErtek4.setForeground(new Color(255, 255, 255));

        egysegIras4.setBounds(xIras,yIras,20,15);

        egysegErtek4.setText(String.valueOf((int)dbSzamNegyedik));
        egysegIras4.add(egysegErtek4);
        egysegIras4.setOpaque(false);
        egysegIras4.repaint();

        egysegL4TestKep.setBounds(xKep,yKep,100,100);
        egysegL4TestKep.setOpaque(false);

        egysegL4TestKep.add(egysegL4TestKepe);
        EgysegLathatosag.lathatosagSorrend(egysegIras4,egysegL4TestKep,oszlop,sor);
        ablakLepakolas.add(egysegekSorrend);

        elsoAlkalommal=false;
        egysegLepakolasAblak.egysegLepakolas();
    }

    public void egysegKitetel5() {

        ablakLepakolas.remove(egysegL5TestKep);
        egysegekSorrend.remove(egysegIras5);
        egysegekSorrend.remove(egysegL5TestKep);

        egysegekSorrend.setBounds(0,0,1250,600);

         if (egyseg.equals("harcp")) {
            egysegFajta="HarcosPap";
        }else {
            egysegFajta="RaptorLovas";
        }
        System.out.println(egysegFajta+" elhelyezve az X: "+oszlop+" , Y: "+sor+" poziciora, eletereje: "+(int)otodikEgysegEletero);
        egysegErtek5.setFont(fontKicsi);
        egysegErtek5.setForeground(new Color(255, 255, 255));

        egysegIras5.setBounds(xIras,yIras,20,15);

        egysegErtek5.setText(String.valueOf((int)dbSzamOtodik));
        egysegIras5.add(egysegErtek5);
        egysegIras5.setOpaque(false);
        egysegIras5.repaint();

        egysegL5TestKep.setBounds(xKep,yKep,100,100);
        egysegL5TestKep.setOpaque(false);

        egysegL5TestKep.add(egysegL5TestKepe);
        EgysegLathatosag.lathatosagSorrend(egysegIras5,egysegL5TestKep,oszlop,sor);
        ablakLepakolas.add(egysegekSorrend);

        elsoAlkalommal=false;
        egysegLepakolasAblak.egysegLepakolas();
    }
}