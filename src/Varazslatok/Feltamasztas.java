package Varazslatok;

import Hos.HosTamad;
import Ellenfel.EllenfelTamad;
import Egysegek.EgysegLathatosag;
import Hos.Tulajdonsagok.Varazsero;

import javax.swing.*;

import static Hos.Tulajdonsagok.Tulajdonsagai.arany;
import static Hos.Tulajdonsagok.Tulajdonsagai.aranyErteke;
import static Ablakok.Csapat.ablakCsapat;
import static Varazslatok.Varazslat.nevVarazslatErtek;
import static Hos.Tulajdonsagok.Tudas.manna;
import static Hos.Tulajdonsagok.Tudas.mannaErtek;
import static Egysegek.Eletero.elsoEgysegEletero;
import static Egysegek.Eletero.masodikEllEgysegEletero;
import static Egysegek.Eletero.harmadikEllEgysegEletero;
import static Egysegek.Eletero.negyedikEllEgysegEletero;
import static Egysegek.Eletero.otodikEllEgysegEletero;
import static Jatek.JatekAblak.*;
import static Jatek.Sorrend.*;
import static Hos.HosTamad.KiKicsoda;
import static Hos.HosTamad.holVagyHos;
import static Egysegek.EgysegLetetel.*;
import static Egysegek.Eletero.*;
import static Ellenfel.EllenfelEgysege.*;
import static Ellenfel.EllenfelTulajdonsaga.*;
import static Ellenfel.EllenfelTamad.*;

public class Feltamasztas {

    static JButton plusszGombFeltamasztas;
    static JButton minuszGombFeltamasztas;

    public Feltamasztas() {
        plusszGombFeltamasztas = new JButton();
        minuszGombFeltamasztas = new JButton();

        plusszGombFeltamasztas.addActionListener(e -> {
            if (feltamasztaspipa==0 && arany-120>=0) {
                feltamasztaspipa=1;
                arany-=120;
                feltamasztasKep.setVisible(false);
                nevVarazslatErtek.setText("<html><u>Feltámasztás:</u><p>    Saját egység feltámasztása, </p><p> max " +
                        "gyógyitás  ( varázserő * 50 ) </p><p> ( nem lehet több a max hp-jánál )</p>" +
                        "<p><u>Manna költsége: 6</u></p></html>");
                System.out.println("Feltamasztas megvasarolva");
            }
            aranyErteke.setText(String.valueOf(arany));
        });

        minuszGombFeltamasztas.addActionListener(e -> {
            if (feltamasztaspipa==1) {
                feltamasztaspipa=0;
                arany+=120;
                feltamasztasKep.setVisible(true);
                System.out.println("Feltamasztas eladva");
            }
            aranyErteke.setText(String.valueOf(arany));
        });
    }

    public static JPanel feltamasztasKep = new JPanel();
    static JLabel feltamasztasKepe = new JLabel();

    static ImageIcon feltamasztas = new ImageIcon("Kepek/varazslatok/feltamasztasff.png");

    public static int feltamasztaspipa=0;

    public static void feltamasztas() {

        plusszGombFeltamasztas.setBounds(1159, 265, 25, 25);
        plusszGombFeltamasztas.setOpaque(false);
        plusszGombFeltamasztas.setContentAreaFilled(false);
        plusszGombFeltamasztas.setBorderPainted(false);
        plusszGombFeltamasztas.setFocusable(false);

        minuszGombFeltamasztas.setBounds(1131, 265, 25, 25);
        minuszGombFeltamasztas.setOpaque(false);
        minuszGombFeltamasztas.setContentAreaFilled(false);
        minuszGombFeltamasztas.setBorderPainted(false);
        minuszGombFeltamasztas.setFocusable(false);

        feltamasztasKep.setBounds(1189,244,55,60);

        feltamasztasKepe.setIcon(feltamasztas);
        feltamasztasKep.add(feltamasztasKepe);
        feltamasztasKep.setOpaque(false);
        ablakCsapat.add(feltamasztasKep);

        ablakCsapat.add(plusszGombFeltamasztas);
        ablakCsapat.add(minuszGombFeltamasztas);
    }

    public static void feltamasztalak(String egyseg) {

        // KEÉÉENE HOGY TUDJUK MENNYIT VÁSÁROLTUNK, MAJD AZT BEÁLLÍTANI MAX GYÓGYÍTÁSRA
        // HALOTT EGYSÉGEKET NEM LEHET GYÓGYÍTANI, (varázserő * 50)-ÉVEL GYÓGYÍT
    
        egysegNeve(egyseg);
    
        double hosVarazs = Varazsero.varazseroErtek;
        double hosVarazss =  hosVarazs * 50;
    
        if (egyseg.charAt(0)!='e') {
             switch (egyseg) {
                 case "foldmuv" -> {
                     double elsoEleteroje = elsoEgysegEletero;
                     elsoEleteroje += hosVarazss;
    
                     if (elsoEgysegMaxEletero >= elsoEleteroje) {
                         elsoEgysegEletero += hosVarazss;
                         dbSzamElso = elsoEgysegEletero / 3;
    
                         egysegekSorrend.remove(egysegIras1);
                         egysegekSorrend.remove(egysegL1TestKepe);
    
                         if (dbSzamElso < 10) {
                             egysegErtek1.setText(String.valueOf(String.format("%.2f", dbSzamElso)));
                         } else {
                             egysegErtek1.setText(String.valueOf(String.format("%.1f", dbSzamElso)));
                         }
                         
                         informacioErtek.setText(hosVarazss  + " visszagyógyult " + egyseg + ".");
    
                         egysegIras1.add(egysegErtek1);
                         egysegL1TestKep.add(egysegL1TestKepe);
                         EgysegLathatosag.lathatosagSorrend(egysegIras1, egysegL1TestKep, oszlop, sor);
                         ablakCsata.add(egysegekSorrend);
                     } else {
                         elsoEgysegEletero = elsoEgysegMaxEletero;
                         dbSzamElso = elsoEgysegEletero / 3;
    
                         egysegekSorrend.remove(egysegIras1);
                         egysegekSorrend.remove(egysegL1TestKepe);
    
                         if (dbSzamElso < 10) {
                             egysegErtek1.setText(String.valueOf(String.format("%.2f", dbSzamElso)));
                         } else {
                             egysegErtek1.setText(String.valueOf(String.format("%.1f", dbSzamElso)));
                         }
                         
                         informacioErtek.setText( "Teljesen visszagyógyult " + egyseg + ".");
    
                         egysegIras1.add(egysegErtek1);
                         egysegL1TestKep.add(egysegL1TestKepe);
                         EgysegLathatosag.lathatosagSorrend(egysegIras1, egysegL1TestKep, oszlop, sor);
                         ablakCsata.add(egysegekSorrend);
                     }
                 }
                 case "csont" -> {
                     double elsoEleteroje = elsoEgysegEletero;
                     elsoEleteroje += hosVarazss;
                     
                     if (elsoEgysegMaxEletero >= elsoEleteroje) {
                         elsoEgysegEletero += hosVarazss;
                         dbSzamElso = elsoEgysegEletero / 2;
    
                         egysegekSorrend.remove(egysegIras1);
                         egysegekSorrend.remove(egysegL1TestKepe);
    
                         if (dbSzamElso < 10) {
                             egysegErtek1.setText(String.valueOf(String.format("%.2f", dbSzamElso)));
                         } else {
                             egysegErtek1.setText(String.valueOf(String.format("%.1f", dbSzamElso)));
                         }
                         
                         informacioErtek.setText(hosVarazss  + " visszagyógyult " + egyseg + ".");
    
                         egysegIras1.add(egysegErtek1);
                         egysegL1TestKep.add(egysegL1TestKepe);
                         EgysegLathatosag.lathatosagSorrend(egysegIras1, egysegL1TestKep, oszlop, sor);
                         ablakCsata.add(egysegekSorrend);
                     } else {
                         elsoEgysegEletero = elsoEgysegMaxEletero;
                         dbSzamElso = elsoEgysegEletero / 2;
    
                         egysegekSorrend.remove(egysegIras1);
                         egysegekSorrend.remove(egysegL1TestKepe);
    
                         if (dbSzamElso < 10) {
                             egysegErtek1.setText(String.valueOf(String.format("%.2f", dbSzamElso)));
                         } else {
                             egysegErtek1.setText(String.valueOf(String.format("%.1f", dbSzamElso)));
                         }
                         
                         informacioErtek.setText( "Teljesen visszagyógyult " + egyseg + ".");
    
                         egysegIras1.add(egysegErtek1);
                         egysegL1TestKep.add(egysegL1TestKepe);
                         EgysegLathatosag.lathatosagSorrend(egysegIras1, egysegL1TestKep, oszlop, sor);
                         ablakCsata.add(egysegekSorrend);
                     }          
                 }
                 case  "ijas" -> {
                     double masodikEleteroje = masodikEgysegEletero;
                     masodikEleteroje += hosVarazss;
                     
                     if (masodikEgysegMaxEletero >= masodikEleteroje) {
                         masodikEgysegEletero += hosVarazss;
                         dbSzamMasodik = masodikEgysegEletero / 7;
    
                         egysegekSorrend.remove(egysegIras2);
                         egysegekSorrend.remove(egysegL2TestKepe);
    
                         if (dbSzamMasodik < 10) {
                             egysegErtek2.setText(String.valueOf(String.format("%.2f", dbSzamMasodik)));
                         } else {
                             egysegErtek2.setText(String.valueOf(String.format("%.1f", dbSzamMasodik)));
                         }
                         
                         informacioErtek.setText(hosVarazss  + " visszagyógyult " + egyseg + ".");
    
                         egysegIras2.add(egysegErtek2);
                         egysegL2TestKep.add(egysegL2TestKepe);
                         EgysegLathatosag.lathatosagSorrend(egysegIras2, egysegL2TestKep, oszlop, sor);
                         ablakCsata.add(egysegekSorrend);
                     } else {
                         masodikEgysegEletero = masodikEgysegMaxEletero;
                         dbSzamMasodik = masodikEgysegEletero / 7;
    
                         egysegekSorrend.remove(egysegIras2);
                         egysegekSorrend.remove(egysegL2TestKepe);
    
                         if (dbSzamMasodik < 10) {
                             egysegErtek2.setText(String.valueOf(String.format("%.2f", dbSzamMasodik)));
                         } else {
                             egysegErtek2.setText(String.valueOf(String.format("%.1f", dbSzamMasodik)));
                         }
                         
                         informacioErtek.setText( "Teljesen visszagyógyult " + egyseg + ".");
    
                         egysegIras2.add(egysegErtek2);
                         egysegL2TestKep.add(egysegL2TestKepe);
                         EgysegLathatosag.lathatosagSorrend(egysegIras2, egysegL2TestKep, oszlop, sor);
                         ablakCsata.add(egysegekSorrend);
                     }          
                 }
                 case  "grif" -> {
                     double harmadikEleteroje = harmadikEgysegEletero;
                     harmadikEleteroje += hosVarazss;
                     
                     if (harmadikEgysegMaxEletero >= harmadikEleteroje) {
                         harmadikEgysegEletero += hosVarazss;
                         dbSzamHarmadik = harmadikEgysegEletero / 30;
    
                         egysegekSorrend.remove(egysegIras3);
                         egysegekSorrend.remove(egysegL3TestKepe);
    
                         if (dbSzamHarmadik < 10) {
                             egysegErtek3.setText(String.valueOf(String.format("%.2f", dbSzamHarmadik)));
                         } else {
                             egysegErtek3.setText(String.valueOf(String.format("%.1f", dbSzamHarmadik)));
                         }
                         
                         informacioErtek.setText(hosVarazss  + " visszagyógyult " + egyseg + ".");
    
                         egysegIras3.add(egysegErtek3);
                         egysegL3TestKep.add(egysegL3TestKepe);
                         EgysegLathatosag.lathatosagSorrend(egysegIras3, egysegL3TestKep, oszlop, sor);
                         ablakCsata.add(egysegekSorrend);
                     } else {
                         harmadikEgysegEletero = harmadikEgysegMaxEletero;
                         dbSzamHarmadik = harmadikEgysegEletero / 30;
    
                         egysegekSorrend.remove(egysegIras3);
                         egysegekSorrend.remove(egysegL3TestKepe);
    
                         if (dbSzamHarmadik < 10) {
                             egysegErtek3.setText(String.valueOf(String.format("%.2f", dbSzamHarmadik)));
                         } else {
                             egysegErtek3.setText(String.valueOf(String.format("%.1f", dbSzamHarmadik)));
                         }
                         
                         informacioErtek.setText( "Teljesen visszagyógyult " + egyseg + ".");
    
                         egysegIras3.add(egysegErtek3);
                         egysegL3TestKep.add(egysegL3TestKepe);
                         EgysegLathatosag.lathatosagSorrend(egysegIras3, egysegL3TestKep, oszlop, sor);
                         ablakCsata.add(egysegekSorrend);
                     } 
                 }
                 case  "fegyv" -> {
                     double negyedikEleteroje = negyedikEgysegEletero;
                     negyedikEleteroje += hosVarazss;
                     
                     if (negyedikEgysegMaxEletero >= negyedikEleteroje) {
                         negyedikEgysegEletero += hosVarazss;
                         dbSzamNegyedik = negyedikEgysegEletero / 33;
    
                         egysegekSorrend.remove(egysegIras4);
                         egysegekSorrend.remove(egysegL4TestKepe);
    
                         if (dbSzamNegyedik < 10) {
                             egysegErtek4.setText(String.valueOf(String.format("%.2f", dbSzamNegyedik)));
                         } else {
                             egysegErtek4.setText(String.valueOf(String.format("%.1f", dbSzamNegyedik)));
                         }
                         
                         informacioErtek.setText(hosVarazss  + " visszagyógyult " + egyseg + ".");
    
                         egysegIras4.add(egysegErtek4);
                         egysegL4TestKep.add(egysegL4TestKepe);
                         EgysegLathatosag.lathatosagSorrend(egysegIras4, egysegL4TestKep, oszlop, sor);
                         ablakCsata.add(egysegekSorrend);
                     } else {
                         negyedikEgysegEletero = negyedikEgysegMaxEletero;
                         dbSzamNegyedik = negyedikEgysegEletero / 33;
    
                         egysegekSorrend.remove(egysegIras4);
                         egysegekSorrend.remove(egysegL4TestKepe);
    
                         if (dbSzamNegyedik < 10) {
                             egysegErtek4.setText(String.valueOf(String.format("%.2f", dbSzamNegyedik)));
                         } else {
                             egysegErtek4.setText(String.valueOf(String.format("%.1f", dbSzamNegyedik)));
                         }
                         
                         informacioErtek.setText( "Teljesen visszagyógyult " + egyseg + ".");
    
                         egysegIras4.add(egysegErtek4);
                         egysegL4TestKep.add(egysegL4TestKepe);
                         EgysegLathatosag.lathatosagSorrend(egysegIras4, egysegL4TestKep, oszlop, sor);
                         ablakCsata.add(egysegekSorrend);
                     } 
                 }
                 case  "orgy" -> {
                     double negyedikEleteroje = negyedikEgysegEletero;
                     negyedikEleteroje += hosVarazss;
                     
                     if (negyedikEgysegMaxEletero >= negyedikEleteroje) {
                         negyedikEgysegEletero += hosVarazss;
                         dbSzamNegyedik = negyedikEgysegEletero / 20;
    
                         egysegekSorrend.remove(egysegIras4);
                         egysegekSorrend.remove(egysegL4TestKepe);
    
                         if (dbSzamNegyedik < 10) {
                             egysegErtek4.setText(String.valueOf(String.format("%.2f", dbSzamNegyedik)));
                         } else {
                             egysegErtek4.setText(String.valueOf(String.format("%.1f", dbSzamNegyedik)));
                         }
                         
                         informacioErtek.setText(hosVarazss  + " visszagyógyult " + egyseg + ".");
    
                         egysegIras4.add(egysegErtek4);
                         egysegL4TestKep.add(egysegL4TestKepe);
                         EgysegLathatosag.lathatosagSorrend(egysegIras4, egysegL4TestKep, oszlop, sor);
                         ablakCsata.add(egysegekSorrend);
                     } else {
                         negyedikEgysegEletero = negyedikEgysegMaxEletero;
                         dbSzamNegyedik = negyedikEgysegEletero / 20;
    
                         egysegekSorrend.remove(egysegIras4);
                         egysegekSorrend.remove(egysegL4TestKepe);
    
                         if (dbSzamNegyedik < 10) {
                             egysegErtek4.setText(String.valueOf(String.format("%.2f", dbSzamNegyedik)));
                         } else {
                             egysegErtek4.setText(String.valueOf(String.format("%.1f", dbSzamNegyedik)));
                         }
                         
                         informacioErtek.setText( "Teljesen visszagyógyult " + egyseg + ".");
    
                         egysegIras4.add(egysegErtek4);
                         egysegL4TestKep.add(egysegL4TestKepe);
                         EgysegLathatosag.lathatosagSorrend(egysegIras4, egysegL4TestKep, oszlop, sor);
                         ablakCsata.add(egysegekSorrend);
                     } 
                 }
                 case  "harcp" -> {
                     double otodikEleteroje = otodikEgysegEletero;
                     otodikEleteroje += hosVarazss;
                     
                     if (otodikEgysegMaxEletero >= otodikEleteroje) {
                         otodikEgysegEletero += hosVarazss;
                         dbSzamOtodik = otodikEgysegEletero / 7;
    
                         egysegekSorrend.remove(egysegIras5);
                         egysegekSorrend.remove(egysegL5TestKepe);
    
                         if (dbSzamOtodik < 10) {
                             egysegErtek5.setText(String.valueOf(String.format("%.2f", dbSzamOtodik)));
                         } else {
                             egysegErtek5.setText(String.valueOf(String.format("%.1f", dbSzamOtodik)));
                         }
                         
                         informacioErtek.setText(hosVarazss  + " visszagyógyult " + egyseg + ".");
    
                         egysegIras5.add(egysegErtek5);
                         egysegL5TestKep.add(egysegL5TestKepe);
                         EgysegLathatosag.lathatosagSorrend(egysegIras5, egysegL5TestKep, oszlop, sor);
                         ablakCsata.add(egysegekSorrend);
                     } else {
                         otodikEgysegEletero = otodikEgysegMaxEletero;
                         dbSzamOtodik = otodikEgysegEletero / 7;
    
                         egysegekSorrend.remove(egysegIras5);
                         egysegekSorrend.remove(egysegL5TestKepe);
    
                         if (dbSzamOtodik < 10) {
                             egysegErtek5.setText(String.valueOf(String.format("%.2f", dbSzamOtodik)));
                         } else {
                             egysegErtek5.setText(String.valueOf(String.format("%.1f", dbSzamOtodik)));
                         }
                         
                         informacioErtek.setText( "Teljesen visszagyógyult " + egyseg + ".");
    
                         egysegIras5.add(egysegErtek5);
                         egysegL5TestKep.add(egysegL5TestKepe);
                         EgysegLathatosag.lathatosagSorrend(egysegIras5, egysegL5TestKep, oszlop, sor);
                         ablakCsata.add(egysegekSorrend);
                     } 
                 }
                 case "felder" -> {
                     double masodikEleteroje = masodikEgysegEletero;
                     masodikEleteroje += hosVarazss;
                     
                     if (masodikEgysegMaxEletero >= masodikEleteroje) {
                         masodikEgysegEletero += hosVarazss;
                         dbSzamMasodik = masodikEgysegEletero / 10;
    
                         egysegekSorrend.remove(egysegIras2);
                         egysegekSorrend.remove(egysegL2TestKepe);
    
                         if (dbSzamMasodik < 10) {
                             egysegErtek2.setText(String.valueOf(String.format("%.2f", dbSzamMasodik)));
                         } else {
                             egysegErtek2.setText(String.valueOf(String.format("%.1f", dbSzamMasodik)));
                         }
                         
                         informacioErtek.setText(hosVarazss  + " visszagyógyult " + egyseg + ".");
    
                         egysegIras2.add(egysegErtek2);
                         egysegL2TestKep.add(egysegL2TestKepe);
                         EgysegLathatosag.lathatosagSorrend(egysegIras2, egysegL2TestKep, oszlop, sor);
                         ablakCsata.add(egysegekSorrend);
                     } else {
                         masodikEgysegEletero = masodikEgysegMaxEletero;
                         dbSzamMasodik = masodikEgysegEletero / 10;
    
                         egysegekSorrend.remove(egysegIras2);
                         egysegekSorrend.remove(egysegL2TestKepe);
    
                         if (dbSzamMasodik < 10) {
                             egysegErtek2.setText(String.valueOf(String.format("%.2f", dbSzamMasodik)));
                         } else {
                             egysegErtek2.setText(String.valueOf(String.format("%.1f", dbSzamMasodik)));
                         }
                         
                         informacioErtek.setText( "Teljesen visszagyógyult " + egyseg + ".");
    
                         egysegIras2.add(egysegErtek2);
                         egysegL2TestKep.add(egysegL2TestKepe);
                         EgysegLathatosag.lathatosagSorrend(egysegIras2, egysegL2TestKep, oszlop, sor);
                         ablakCsata.add(egysegekSorrend);
                     } 
                 }
                 case "mino" -> {
                     double harmadikEleteroje = harmadikEgysegEletero;
                     harmadikEleteroje += hosVarazss;
                     
                     if (harmadikEgysegMaxEletero >= harmadikEleteroje) {
                         harmadikEgysegEletero += hosVarazss;
                         dbSzamHarmadik = harmadikEgysegEletero / 80;
    
                         egysegekSorrend.remove(egysegIras3);
                         egysegekSorrend.remove(egysegL3TestKepe);
    
                         if (dbSzamHarmadik < 10) {
                             egysegErtek3.setText(String.valueOf(String.format("%.2f", dbSzamHarmadik)));
                         } else {
                             egysegErtek3.setText(String.valueOf(String.format("%.1f", dbSzamHarmadik)));
                         }
                         
                         informacioErtek.setText(hosVarazss  + " visszagyógyult " + egyseg + ".");
    
                         egysegIras3.add(egysegErtek3);
                         egysegL3TestKep.add(egysegL3TestKepe);
                         EgysegLathatosag.lathatosagSorrend(egysegIras3, egysegL3TestKep, oszlop, sor);
                         ablakCsata.add(egysegekSorrend);
                     } else {
                         harmadikEgysegEletero = harmadikEgysegMaxEletero;
                         dbSzamHarmadik = harmadikEgysegEletero / 80;
    
                         egysegekSorrend.remove(egysegIras3);
                         egysegekSorrend.remove(egysegL3TestKepe);
    
                         if (dbSzamHarmadik < 10) {
                             egysegErtek3.setText(String.valueOf(String.format("%.2f", dbSzamHarmadik)));
                         } else {
                             egysegErtek3.setText(String.valueOf(String.format("%.1f", dbSzamHarmadik)));
                         }
                         
                         informacioErtek.setText( "Teljesen visszagyógyult " + egyseg + ".");
    
                         egysegIras3.add(egysegErtek3);
                         egysegL3TestKep.add(egysegL3TestKepe);
                         EgysegLathatosag.lathatosagSorrend(egysegIras3, egysegL3TestKep, oszlop, sor);
                         ablakCsata.add(egysegekSorrend);
                     } 
                 }
                 case "rapt" -> {
                     double otodikEleteroje = otodikEgysegEletero;
                     otodikEleteroje += hosVarazss;
                     
                     if (otodikEgysegMaxEletero >= otodikEleteroje) {
                         otodikEgysegEletero += hosVarazss;
                         dbSzamOtodik = otodikEgysegEletero / 35;
    
                         egysegekSorrend.remove(egysegIras5);
                         egysegekSorrend.remove(egysegL5TestKepe);
    
                         if (dbSzamOtodik < 10) {
                             egysegErtek5.setText(String.valueOf(String.format("%.2f", dbSzamOtodik)));
                         } else {
                             egysegErtek5.setText(String.valueOf(String.format("%.1f", dbSzamOtodik)));
                         }
                         
                         informacioErtek.setText(hosVarazss  + " visszagyógyult " + egyseg + ".");
    
                         egysegIras5.add(egysegErtek5);
                         egysegL5TestKep.add(egysegL5TestKepe);
                         EgysegLathatosag.lathatosagSorrend(egysegIras5, egysegL5TestKep, oszlop, sor);
                         ablakCsata.add(egysegekSorrend);
                     } else {
                         otodikEgysegEletero = otodikEgysegMaxEletero;
                         dbSzamOtodik = otodikEgysegEletero / 35;
    
                         egysegekSorrend.remove(egysegIras5);
                         egysegekSorrend.remove(egysegL5TestKepe);
    
                         if (dbSzamOtodik < 10) {
                             egysegErtek5.setText(String.valueOf(String.format("%.2f", dbSzamOtodik)));
                         } else {
                             egysegErtek5.setText(String.valueOf(String.format("%.1f", dbSzamOtodik)));
                         }
                         
                         informacioErtek.setText( "Teljesen visszagyógyult " + egyseg + ".");
    
                         egysegIras5.add(egysegErtek5);
                         egysegL5TestKep.add(egysegL5TestKepe);
                         EgysegLathatosag.lathatosagSorrend(egysegIras5, egysegL5TestKep, oszlop, sor);
                         ablakCsata.add(egysegekSorrend);
                     } 
                 }
             }
         }
         manna -= 6;
         mannaErtek.setText(String.valueOf(manna));
    
         KiKicsoda();
         HosTamad.mutato = 0;
         holVagyHos();
    
         double ujErtek2 = moralSorrendTList.get(HosTamad.mutato);
    
         moralSorrendTList.remove(HosTamad.mutato);
         moralSorrendTList.add(ujErtek2);
    
         hanyadikKor(elsoHely);
         korokKiirasa();
    
         sorrendFrissites();
     }


    public static void feltamasztalakEllenfel(String egyseg) {
 
        egysegNeve(egyseg);
    
        double ellHosVarazs = Ellenfel.EllenfelTulajdonsaga.ellenfelVarazsero;
        double ellHosVarazss =  ellHosVarazs * 50;
    
        if (egyseg.charAt(0)=='e') {
             switch (egyseg) {
                 case "efoldmuv" -> {
                     double elsoEllEleteroje = elsoEllEgysegEletero;
                     elsoEllEleteroje += ellHosVarazss;
    
                     if (elsoEllEgysegMaxEletero >= elsoEllEleteroje) {
                         elsoEllEgysegEletero += ellHosVarazss;
                         ellenfelDbSzamElso = elsoEllEgysegEletero / 3;
    
                         egysegekSorrend.remove(ellenfelEgysegIras1);
                         egysegekSorrend.remove(ellenfelEgysegL1Kepe);
    
                         if (ellenfelDbSzamElso < 10) {
                             ellenfelEgysegErtek1.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamElso)));
                         } else {
                             ellenfelEgysegErtek1.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamElso)));
                         }
                         
                         informacioErtek.setText(ellHosVarazss  + " visszagyógyult " + egyseg + ".");
    
                         ellenfelEgysegIras1.add(ellenfelEgysegErtek1);
                         ellenfelEgysegL1Kep.add(ellenfelEgysegL1Kepe);
                         EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras1, ellenfelEgysegL1Kep, oszlop, sor);
                         ablakCsata.add(egysegekSorrend);
                     } else {
                         elsoEllEgysegEletero = elsoEllEgysegMaxEletero;
                         ellenfelDbSzamElso = elsoEllEgysegEletero / 3;
    
                         egysegekSorrend.remove(ellenfelEgysegIras1);
                         egysegekSorrend.remove(ellenfelEgysegL1Kepe);
    
                         if (ellenfelDbSzamElso < 10) {
                             ellenfelEgysegErtek1.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamElso)));
                         } else {
                             ellenfelEgysegErtek1.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamElso)));
                         }
                         
                         informacioErtek.setText( "Teljesen visszagyógyult " + egyseg + ".");
    
                         ellenfelEgysegIras1.add(ellenfelEgysegErtek1);
                         ellenfelEgysegL1Kep.add(ellenfelEgysegL1Kepe);
                         EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras1, ellenfelEgysegL1Kep, oszlop, sor);
                         ablakCsata.add(egysegekSorrend);
                     }
                 }
                 case "ecsont" -> {
                     double elsoEllEleteroje = elsoEllEgysegEletero;
                     elsoEllEleteroje += ellHosVarazss;
                     
                     if (elsoEllEgysegMaxEletero >= elsoEllEleteroje) {
                         elsoEllEgysegEletero += ellHosVarazss;
                         ellenfelDbSzamElso = elsoEllEgysegEletero / 2;
    
                         egysegekSorrend.remove(ellenfelEgysegIras1);
                         egysegekSorrend.remove(ellenfelEgysegL1Kepe);
    
                         if (ellenfelDbSzamElso < 10) {
                             ellenfelEgysegErtek1.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamElso)));
                         } else {
                             ellenfelEgysegErtek1.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamElso)));
                         }
                         
                         informacioErtek.setText(ellHosVarazss  + " visszagyógyult " + egyseg + ".");
    
                         ellenfelEgysegIras1.add(ellenfelEgysegErtek1);
                         ellenfelEgysegL1Kep.add(ellenfelEgysegL1Kepe);
                         EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras1, ellenfelEgysegL1Kep, oszlop, sor);
                         ablakCsata.add(egysegekSorrend);
                     } else {
                         elsoEllEgysegEletero = elsoEllEgysegMaxEletero;
                         ellenfelDbSzamElso = elsoEllEgysegEletero / 2;
    
                         egysegekSorrend.remove(ellenfelEgysegIras1);
                         egysegekSorrend.remove(ellenfelEgysegL1Kepe);
    
                         if (ellenfelDbSzamElso < 10) {
                             ellenfelEgysegErtek1.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamElso)));
                         } else {
                             ellenfelEgysegErtek1.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamElso)));
                         }
                         
                         informacioErtek.setText( "Teljesen visszagyógyult " + egyseg + ".");
    
                         ellenfelEgysegIras1.add(ellenfelEgysegErtek1);
                         ellenfelEgysegL1Kep.add(ellenfelEgysegL1Kepe);
                         EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras1, ellenfelEgysegL1Kep, oszlop, sor);
                         ablakCsata.add(egysegekSorrend);
                     }          
                 }
                 case  "eijas" -> {
                     double masodikEllEleteroje = masodikEllEgysegEletero;
                     masodikEllEleteroje += ellHosVarazss;
                     
                     if (masodikEllEgysegMaxEletero >= masodikEllEleteroje) {
                         masodikEllEgysegEletero += ellHosVarazss;
                         ellenfelDbSzamMasodik = masodikEllEgysegEletero / 7;
    
                         egysegekSorrend.remove(ellenfelEgysegIras2);
                         egysegekSorrend.remove(ellenfelEgysegL2Kepe);
    
                         if (ellenfelDbSzamMasodik < 10) {
                             ellenfelEgysegErtek2.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamMasodik)));
                         } else {
                             ellenfelEgysegErtek2.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamMasodik)));
                         }
                         
                         informacioErtek.setText(ellHosVarazss  + " visszagyógyult " + egyseg + ".");
    
                         ellenfelEgysegIras2.add(ellenfelEgysegErtek2);
                         ellenfelEgysegL2Kep.add(ellenfelEgysegL2Kepe);
                         EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras2, ellenfelEgysegL2Kep, oszlop, sor);
                         ablakCsata.add(egysegekSorrend);
                     } else {
                         masodikEllEgysegEletero = masodikEllEgysegMaxEletero;
                         ellenfelDbSzamMasodik = masodikEllEgysegEletero / 7;
    
                         egysegekSorrend.remove(ellenfelEgysegIras2);
                         egysegekSorrend.remove(ellenfelEgysegL2Kepe);
    
                         if (ellenfelDbSzamMasodik < 10) {
                             ellenfelEgysegErtek2.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamMasodik)));
                         } else {
                             ellenfelEgysegErtek2.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamMasodik)));
                         }
                         
                         informacioErtek.setText( "Teljesen visszagyógyult " + egyseg + ".");
    
                         ellenfelEgysegIras2.add(ellenfelEgysegErtek2);
                         ellenfelEgysegL2Kep.add(ellenfelEgysegL2Kepe);
                         EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras2, ellenfelEgysegL2Kep, oszlop, sor);
                         ablakCsata.add(egysegekSorrend);
                     }          
                 }
                 case  "egrif" -> {
                     double harmadikEllEleteroje = harmadikEllEgysegEletero;
                     harmadikEllEleteroje += ellHosVarazss;
                     
                     if (harmadikEllEgysegMaxEletero >= harmadikEllEleteroje) {
                         harmadikEllEgysegEletero += ellHosVarazss;
                         ellenfelDbSzamHarmadik = harmadikEllEgysegEletero / 30;
    
                         egysegekSorrend.remove(ellenfelEgysegIras3);
                         egysegekSorrend.remove(ellenfelEgysegL3Kepe);
    
                         if (ellenfelDbSzamHarmadik < 10) {
                             ellenfelEgysegErtek3.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamHarmadik)));
                         } else {
                             ellenfelEgysegErtek3.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamHarmadik)));
                         }
                         
                         informacioErtek.setText(ellHosVarazss  + " visszagyógyult " + egyseg + ".");
    
                         ellenfelEgysegIras3.add(ellenfelEgysegErtek3);
                         ellenfelEgysegL3Kep.add(ellenfelEgysegL3Kepe);
                         EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras3, ellenfelEgysegL3Kep, oszlop, sor);
                         ablakCsata.add(egysegekSorrend);
                     } else {
                         harmadikEllEgysegEletero = harmadikEllEgysegMaxEletero;
                         ellenfelDbSzamHarmadik = harmadikEllEgysegEletero / 30;
    
                         egysegekSorrend.remove(ellenfelEgysegIras3);
                         egysegekSorrend.remove(ellenfelEgysegL3Kepe);
    
                         if (ellenfelDbSzamHarmadik < 10) {
                             ellenfelEgysegErtek3.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamHarmadik)));
                         } else {
                             ellenfelEgysegErtek3.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamHarmadik)));
                         }
                         
                         informacioErtek.setText( "Teljesen visszagyógyult " + egyseg + ".");
    
                         ellenfelEgysegIras3.add(ellenfelEgysegErtek3);
                         ellenfelEgysegL3Kep.add(ellenfelEgysegL3Kepe);
                         EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras3, ellenfelEgysegL3Kep, oszlop, sor);
                         ablakCsata.add(egysegekSorrend);
                     } 
                 }
                 case  "efegyv" -> {
                     double negyedikEllEleteroje = negyedikEllEgysegEletero;
                     negyedikEllEleteroje += ellHosVarazss;
                     
                     if (negyedikEllEgysegMaxEletero >= negyedikEllEleteroje) {
                         negyedikEllEgysegEletero += ellHosVarazss;
                         ellenfelDbSzamNegyedik = negyedikEllEgysegEletero / 33;
    
                         egysegekSorrend.remove(ellenfelEgysegIras4);
                         egysegekSorrend.remove(ellenfelEgysegL4Kepe);
    
                         if (ellenfelDbSzamNegyedik < 10) {
                             ellenfelEgysegErtek4.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamNegyedik)));
                         } else {
                             ellenfelEgysegErtek4.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamNegyedik)));
                         }
                         
                         informacioErtek.setText(ellHosVarazss  + " visszagyógyult " + egyseg + ".");
    
                         ellenfelEgysegIras4.add(ellenfelEgysegErtek4);
                         ellenfelEgysegL4Kep.add(ellenfelEgysegL4Kepe);
                         EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras4, ellenfelEgysegL4Kep, oszlop, sor);
                         ablakCsata.add(egysegekSorrend);
                     } else {
                         negyedikEllEgysegEletero = negyedikEllEgysegMaxEletero;
                         ellenfelDbSzamNegyedik = negyedikEllEgysegEletero / 33;
    
                         egysegekSorrend.remove(ellenfelEgysegIras4);
                         egysegekSorrend.remove(ellenfelEgysegL4Kepe);
    
                         if (ellenfelDbSzamNegyedik < 10) {
                             ellenfelEgysegErtek4.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamNegyedik)));
                         } else {
                             ellenfelEgysegErtek4.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamNegyedik)));
                         }
                         
                         informacioErtek.setText( "Teljesen visszagyógyult " + egyseg + ".");
    
                         ellenfelEgysegIras4.add(ellenfelEgysegErtek4);
                         ellenfelEgysegL4Kep.add(ellenfelEgysegL4Kepe);
                         EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras4, ellenfelEgysegL4Kep, oszlop, sor);
                         ablakCsata.add(egysegekSorrend);
                     } 
                 }
                 case  "eorgy" -> {
                     double negyedikEllEleteroje = negyedikEllEgysegEletero;
                     negyedikEllEleteroje += ellHosVarazss;
                     
                     if (negyedikEllEgysegMaxEletero >= negyedikEllEleteroje) {
                         negyedikEllEgysegEletero += ellHosVarazss;
                         ellenfelDbSzamNegyedik = negyedikEllEgysegEletero / 20;
    
                         egysegekSorrend.remove(ellenfelEgysegIras4);
                         egysegekSorrend.remove(ellenfelEgysegL4Kepe);
    
                         if (ellenfelDbSzamNegyedik < 10) {
                             ellenfelEgysegErtek4.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamNegyedik)));
                         } else {
                             ellenfelEgysegErtek4.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamNegyedik)));
                         }
                         
                         informacioErtek.setText(ellHosVarazss  + " visszagyógyult " + egyseg + ".");
    
                         ellenfelEgysegIras4.add(ellenfelEgysegErtek4);
                         ellenfelEgysegL4Kep.add(ellenfelEgysegL4Kepe);
                         EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras4, ellenfelEgysegL4Kep, oszlop, sor);
                         ablakCsata.add(egysegekSorrend);
                     } else {
                         negyedikEllEgysegEletero = negyedikEllEgysegMaxEletero;
                         ellenfelDbSzamNegyedik = negyedikEllEgysegEletero / 20;
    
                         egysegekSorrend.remove(ellenfelEgysegIras4);
                         egysegekSorrend.remove(ellenfelEgysegL4Kepe);
    
                         if (ellenfelDbSzamNegyedik < 10) {
                             ellenfelEgysegErtek4.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamNegyedik)));
                         } else {
                             ellenfelEgysegErtek4.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamNegyedik)));
                         }
                         
                         informacioErtek.setText( "Teljesen visszagyógyult " + egyseg + ".");
    
                         ellenfelEgysegIras4.add(ellenfelEgysegErtek4);
                         ellenfelEgysegL4Kep.add(ellenfelEgysegL4Kepe);
                         EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras4, ellenfelEgysegL4Kep, oszlop, sor);
                         ablakCsata.add(egysegekSorrend);
                     } 
                 }
                 case  "eharcp" -> {
                     double otodikEllEleteroje = otodikEllEgysegEletero;
                     otodikEllEleteroje += ellHosVarazss;
                     
                     if (otodikEllEgysegMaxEletero >= otodikEllEleteroje) {
                         otodikEllEgysegEletero += ellHosVarazss;
                         ellenfelDbSzamOtodik = otodikEllEgysegEletero / 7;
    
                         egysegekSorrend.remove(ellenfelEgysegIras5);
                         egysegekSorrend.remove(ellenfelEgysegL5Kepe);
    
                         if (ellenfelDbSzamOtodik < 10) {
                             ellenfelEgysegErtek5.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamOtodik)));
                         } else {
                             ellenfelEgysegErtek5.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamOtodik)));
                         }
                         
                         informacioErtek.setText(ellHosVarazss  + " visszagyógyult " + egyseg + ".");
    
                         ellenfelEgysegIras5.add(ellenfelEgysegErtek5);
                         ellenfelEgysegL5Kep.add(ellenfelEgysegL5Kepe);
                         EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras5, ellenfelEgysegL5Kep, oszlop, sor);
                         ablakCsata.add(egysegekSorrend);
                     } else {
                         otodikEllEgysegEletero = otodikEllEgysegMaxEletero;
                         ellenfelDbSzamOtodik = otodikEllEgysegEletero / 7;
    
                         egysegekSorrend.remove(ellenfelEgysegIras5);
                         egysegekSorrend.remove(ellenfelEgysegL5Kepe);
    
                         if (ellenfelDbSzamOtodik < 10) {
                             ellenfelEgysegErtek5.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamOtodik)));
                         } else {
                             ellenfelEgysegErtek5.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamOtodik)));
                         }
                         
                         informacioErtek.setText( "Teljesen visszagyógyult " + egyseg + ".");
    
                         ellenfelEgysegIras5.add(ellenfelEgysegErtek5);
                         ellenfelEgysegL5Kep.add(ellenfelEgysegL5Kepe);
                         EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras5, ellenfelEgysegL5Kep, oszlop, sor);
                         ablakCsata.add(egysegekSorrend);
                     } 
                 }
                 case "efelder" -> {
                     double masodikEllEleteroje = masodikEllEgysegEletero;
                     masodikEllEleteroje += ellHosVarazss;
                     
                     if (masodikEllEgysegMaxEletero >= masodikEllEleteroje) {
                         masodikEllEgysegEletero += ellHosVarazss;
                         ellenfelDbSzamMasodik = masodikEllEgysegEletero / 10;
    
                         egysegekSorrend.remove(ellenfelEgysegIras2);
                         egysegekSorrend.remove(ellenfelEgysegL2Kepe);
    
                         if (ellenfelDbSzamMasodik < 10) {
                             ellenfelEgysegErtek2.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamMasodik)));
                         } else {
                             ellenfelEgysegErtek2.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamMasodik)));
                         }
                         
                         informacioErtek.setText(ellHosVarazss  + " visszagyógyult " + egyseg + ".");
    
                         ellenfelEgysegIras2.add(ellenfelEgysegErtek2);
                         ellenfelEgysegL2Kep.add(ellenfelEgysegL2Kepe);
                         EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras2, ellenfelEgysegL2Kep, oszlop, sor);
                         ablakCsata.add(egysegekSorrend);
                     } else {
                         masodikEllEgysegEletero = masodikEllEgysegMaxEletero;
                         ellenfelDbSzamMasodik = masodikEllEgysegEletero / 10;
    
                         egysegekSorrend.remove(ellenfelEgysegIras2);
                         egysegekSorrend.remove(ellenfelEgysegL2Kepe);
    
                         if (ellenfelDbSzamMasodik < 10) {
                             ellenfelEgysegErtek2.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamMasodik)));
                         } else {
                             ellenfelEgysegErtek2.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamMasodik)));
                         }
                         
                         informacioErtek.setText( "Teljesen visszagyógyult " + egyseg + ".");
    
                         ellenfelEgysegIras2.add(ellenfelEgysegErtek2);
                         ellenfelEgysegL2Kep.add(ellenfelEgysegL2Kepe);
                         EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras2, ellenfelEgysegL2Kep, oszlop, sor);
                         ablakCsata.add(egysegekSorrend);
                     } 
                 }
                 case "emino" -> {
                     double harmadikEllEleteroje = harmadikEllEgysegEletero;
                     harmadikEllEleteroje += ellHosVarazss;
                     
                     if (harmadikEllEgysegMaxEletero >= harmadikEllEleteroje) {
                         harmadikEllEgysegEletero += ellHosVarazss;
                         ellenfelDbSzamHarmadik = harmadikEllEgysegEletero / 80;
    
                         egysegekSorrend.remove(ellenfelEgysegIras3);
                         egysegekSorrend.remove(ellenfelEgysegL3Kepe);
    
                         if (ellenfelDbSzamHarmadik < 10) {
                             ellenfelEgysegErtek3.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamHarmadik)));
                         } else {
                             ellenfelEgysegErtek3.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamHarmadik)));
                         }
                         informacioErtek.setText(ellHosVarazss  + " visszagyógyult " + egyseg + ".");
    
                         ellenfelEgysegIras3.add(ellenfelEgysegErtek3);
                         ellenfelEgysegL3Kep.add(ellenfelEgysegL3Kepe);
                         EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras3, ellenfelEgysegL3Kep, oszlop, sor);
                         ablakCsata.add(egysegekSorrend);
                     } else {
                         harmadikEllEgysegEletero = harmadikEllEgysegMaxEletero;
                         ellenfelDbSzamHarmadik = harmadikEllEgysegEletero / 80;
    
                         egysegekSorrend.remove(ellenfelEgysegIras3);
                         egysegekSorrend.remove(ellenfelEgysegL3Kepe);
    
                         if (ellenfelDbSzamHarmadik < 10) {
                             ellenfelEgysegErtek3.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamHarmadik)));
                         } else {
                             ellenfelEgysegErtek3.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamHarmadik)));
                         }
                         
                         informacioErtek.setText( "Teljesen visszagyógyult " + egyseg + ".");
    
                         ellenfelEgysegIras3.add(ellenfelEgysegErtek3);
                         ellenfelEgysegL3Kep.add(ellenfelEgysegL3Kepe);
                         EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras3, ellenfelEgysegL3Kep, oszlop, sor);
                         ablakCsata.add(egysegekSorrend);
                     } 
                 }
                 case "erapt" -> {
                     double otodikEllEleteroje = otodikEllEgysegEletero;
                     otodikEllEleteroje += ellHosVarazss;
                     
                     if (otodikEllEgysegMaxEletero >= otodikEllEleteroje) {
                         otodikEllEgysegEletero += ellHosVarazss;
                         ellenfelDbSzamOtodik = otodikEllEgysegEletero / 35;
    
                         egysegekSorrend.remove(ellenfelEgysegIras5);
                         egysegekSorrend.remove(ellenfelEgysegL5Kepe);
    
                         if (ellenfelDbSzamOtodik < 10) {
                             ellenfelEgysegErtek5.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamOtodik)));
                         } else {
                             ellenfelEgysegErtek5.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamOtodik)));
                         }
                         
                         informacioErtek.setText(ellHosVarazss  + " visszagyógyult " + egyseg + ".");
    
                         ellenfelEgysegIras5.add(ellenfelEgysegErtek5);
                         ellenfelEgysegL5Kep.add(ellenfelEgysegL5Kepe);
                         EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras5, ellenfelEgysegL5Kep, oszlop, sor);
                         ablakCsata.add(egysegekSorrend);
                     } else {
                         otodikEllEgysegEletero = otodikEllEgysegMaxEletero;
                         ellenfelDbSzamOtodik = otodikEllEgysegEletero / 35;
    
                         egysegekSorrend.remove(ellenfelEgysegIras5);
                         egysegekSorrend.remove(ellenfelEgysegL5Kepe);
    
                         if (ellenfelDbSzamOtodik < 10) {
                             ellenfelEgysegErtek5.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamOtodik)));
                         } else {
                             ellenfelEgysegErtek5.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamOtodik)));
                         }
                         
                         informacioErtek.setText( "Teljesen visszagyógyult " + egyseg + ".");
    
                         ellenfelEgysegIras5.add(ellenfelEgysegErtek5);
                         ellenfelEgysegL5Kep.add(ellenfelEgysegL5Kepe);
                         EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras5, ellenfelEgysegL5Kep, oszlop, sor);
                         ablakCsata.add(egysegekSorrend);
                     } 
                 }
             }
        }
        ellenfelManna -= 6;
        ellenfelMannaErtek.setText(String.valueOf(ellenfelManna));

        kiKicsodaEll();
        EllenfelTamad.mutatoEll = 0;
        holVagyEllHos();

        double ujErtek2 = moralSorrendTList.get(EllenfelTamad.mutatoEll);

        moralSorrendTList.remove(EllenfelTamad.mutatoEll);
        moralSorrendTList.add(ujErtek2);

        hanyadikKor(elsoHely);
        korokKiirasa();

        sorrendFrissites();
     }
}
