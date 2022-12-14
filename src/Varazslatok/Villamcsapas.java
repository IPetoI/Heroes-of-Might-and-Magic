package Varazslatok;

import Egysegek.EgysegLathatosag;
import Egysegek.Eletero;
import Ellenfel.EllenfelTulajdonsaga;
import Hos.HosTamad;
import Hos.Tulajdonsagok.Varazsero;
import static Egysegek.EgysegSzam.*;
import static Egysegek.EgysegLetetel.*;
import static Ellenfel.EllenfelTamad.*;
import static Ellenfel.EllenfelTulajdonsaga.*;

import javax.swing.*;

import static Ablakok.Csapat.ablakCsapat;
import static Egysegek.EgysegLetetel.egysegekSorrend;
import static Egysegek.Sebzes.egysegPozTorlese;
import static Ellenfel.EllenfelEgysege.*;
import static Hos.HosTamad.KiKicsoda;
import static Hos.HosTamad.holVagyHos;
import static Hos.Tulajdonsagok.Tudas.manna;
import static Hos.Tulajdonsagok.Tudas.mannaErtek;
import static Hos.Tulajdonsagok.Tulajdonsagai.arany;
import static Hos.Tulajdonsagok.Tulajdonsagai.aranyErteke;
import static Jatek.JatekAblak.*;
import static Jatek.Sorrend.*;
import static Varazslatok.Varazslat.nevVarazslatErtek;

public class Villamcsapas {

    static JButton plusszGombVillamcsapas;
    static JButton minuszGombVillamcsapas;

    public Villamcsapas() {
        plusszGombVillamcsapas = new JButton();
        minuszGombVillamcsapas = new JButton();

        plusszGombVillamcsapas.addActionListener(e -> {
            if (villamcsapaspipa == 0 && arany - 60 >= 0) {
                villamcsapaspipa = 1;
                arany -= 60;
                villamcsapasKep.setVisible(false);
                nevVarazslatErtek.setText("<html><u>Villámcsapás:</u><p>    ( varázserő * 30 ) Sebzés </p><p> egy " +
                        " ellenfélre   , de  saját egységre </p><p> nem lehet</p>" +
                        "<p><u>Manna költsége: 5</u></p></html>");
                System.out.println("Villamcsapas megvasarolva");
            }
            aranyErteke.setText(String.valueOf(arany));
        });

        minuszGombVillamcsapas.addActionListener(e -> {
            if (villamcsapaspipa == 1) {
                villamcsapaspipa = 0;
                arany += 60;
                villamcsapasKep.setVisible(true);
                System.out.println("Villamcsapas eladva");
            }
            aranyErteke.setText(String.valueOf(arany));
        });
    }

    public static JPanel villamcsapasKep = new JPanel();
    static JLabel villamcsapasKepe = new JLabel();

    static ImageIcon villamcsapas = new ImageIcon("Kepek/varazslatok/villamcsapasff.png");

    public static int villamcsapaspipa = 0;

    public static void villamcsapas() {

        plusszGombVillamcsapas.setBounds(1159, 132, 25, 25);
        plusszGombVillamcsapas.setOpaque(false);
        plusszGombVillamcsapas.setContentAreaFilled(false);
        plusszGombVillamcsapas.setBorderPainted(false);
        plusszGombVillamcsapas.setFocusable(false);

        minuszGombVillamcsapas.setBounds(1131, 132, 25, 25);
        minuszGombVillamcsapas.setOpaque(false);
        minuszGombVillamcsapas.setContentAreaFilled(false);
        minuszGombVillamcsapas.setBorderPainted(false);
        minuszGombVillamcsapas.setFocusable(false);

        villamcsapasKep.setBounds(1189, 112, 55, 60);

        villamcsapasKepe.setIcon(villamcsapas);
        villamcsapasKep.add(villamcsapasKepe);
        villamcsapasKep.setOpaque(false);
        ablakCsapat.add(villamcsapasKep);

        ablakCsapat.add(plusszGombVillamcsapas);
        ablakCsapat.add(minuszGombVillamcsapas);
    }


    public static void villamcsapasElsutese(String egyseg, int sor, int oszlop) {

        switch (egyseg) {
            case "efoldmuv" -> {
                Eletero.elsoEllEgysegEletero -= Varazsero.varazseroErtek * 30;
                ellenfelDbSzamElso = Eletero.elsoEllEgysegEletero / 3;
                if (Eletero.elsoEllEgysegEletero > 0) {

                    egysegekSorrend.remove(ellenfelEgysegIras1);
                    egysegekSorrend.remove(ellenfelEgysegL1Kep);

                    if (ellenfelDbSzamElso < 10) {
                        ellenfelEgysegErtek1.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamElso)));
                    } else {
                        ellenfelEgysegErtek1.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamElso)));
                    }

                    informacioErtek.setText("<html><center>" + egyseg + " egységet villámcsapták,<p> " + Varazsero.varazseroErtek * 30 + " sebzést szenvedett " +
                            "és " + Eletero.elsoEllEgysegEletero + " életereje maradt.</p></center></html>");

                    ellenfelEgysegIras1.add(ellenfelEgysegErtek1);
                    ellenfelEgysegL1Kep.add(ellenfelEgysegL1Kepe);
                    EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras1, ellenfelEgysegL1Kep, oszlop, sor);
                    ablakCsata.add(egysegekSorrend);
                } else {
                    egysegekSorrend.remove(ellenfelEgysegIras1);
                    egysegekSorrend.remove(ellenfelEgysegL1Kep);

                    efoldmuv = 0;
                    egysegPozTorlese("efoldmuv", sor, oszlop);

                    informacioErtek.setText("<html><center>" + egyseg + " egységet villámcsapták,<p> " + Varazsero.varazseroErtek * 30 + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                }
            }
            case "ecsont" -> {
                Eletero.elsoEllEgysegEletero -= Varazsero.varazseroErtek * 30;
                ellenfelDbSzamElso = Eletero.elsoEllEgysegEletero / 2;
                if (Eletero.elsoEllEgysegEletero > 0) {

                    egysegekSorrend.remove(ellenfelEgysegIras1);
                    egysegekSorrend.remove(ellenfelEgysegL1Kep);

                    if (ellenfelDbSzamElso < 10) {
                        ellenfelEgysegErtek1.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamElso)));
                    } else {
                        ellenfelEgysegErtek1.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamElso)));
                    }

                    informacioErtek.setText("<html><center>" + egyseg + " egységet villámcsapták,<p> " + Varazsero.varazseroErtek * 30 + " sebzést szenvedett " +
                            "és " + Eletero.elsoEllEgysegEletero + " életereje maradt.</p></center></html>");

                    ellenfelEgysegIras1.add(ellenfelEgysegErtek1);
                    ellenfelEgysegL1Kep.add(ellenfelEgysegL1Kepe);
                    EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras1, ellenfelEgysegL1Kep, oszlop, sor);
                    ablakCsata.add(egysegekSorrend);
                } else {
                    egysegekSorrend.remove(ellenfelEgysegIras1);
                    egysegekSorrend.remove(ellenfelEgysegL1Kep);

                    ecsont = 0;
                    egysegPozTorlese("ecsont", sor, oszlop);

                    informacioErtek.setText("<html><center>" + egyseg + " egységet villámcsapták,<p> " + Varazsero.varazseroErtek * 30 + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                }
            }
            case "efelder" -> {
                Eletero.masodikEllEgysegEletero -= Varazsero.varazseroErtek * 30;
                ellenfelDbSzamMasodik = Eletero.masodikEllEgysegEletero / 10;
                if (Eletero.masodikEllEgysegEletero > 0) {

                    egysegekSorrend.remove(ellenfelEgysegIras2);
                    egysegekSorrend.remove(ellenfelEgysegL2Kep);

                    if (ellenfelDbSzamMasodik < 10) {
                        ellenfelEgysegErtek2.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamMasodik)));
                    } else {
                        ellenfelEgysegErtek2.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamMasodik)));
                    }

                    informacioErtek.setText("<html><center>" + egyseg + " egységet villámcsapták,<p> " + Varazsero.varazseroErtek * 30 + " sebzést szenvedett " +
                            "és " + Eletero.masodikEllEgysegEletero + " életereje maradt.</p></center></html>");

                    ellenfelEgysegIras2.add(ellenfelEgysegErtek2);
                    ellenfelEgysegL2Kep.add(ellenfelEgysegL2Kepe);
                    EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras2, ellenfelEgysegL2Kep, oszlop, sor);
                    ablakCsata.add(egysegekSorrend);
                } else {
                    egysegekSorrend.remove(ellenfelEgysegIras2);
                    egysegekSorrend.remove(ellenfelEgysegL2Kep);

                    efelder = 0;
                    egysegPozTorlese("efelder", sor, oszlop);

                    informacioErtek.setText("<html><center>" + egyseg + " egységet villámcsapták,<p> " + Varazsero.varazseroErtek * 30 + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                }
            }
            case "eijas" -> {
                Eletero.masodikEllEgysegEletero -= Varazsero.varazseroErtek * 30;
                ellenfelDbSzamMasodik = Eletero.masodikEllEgysegEletero / 7;
                if (Eletero.masodikEllEgysegEletero > 0) {

                    egysegekSorrend.remove(ellenfelEgysegIras2);
                    egysegekSorrend.remove(ellenfelEgysegL2Kep);

                    if (ellenfelDbSzamMasodik < 10) {
                        ellenfelEgysegErtek2.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamMasodik)));
                    } else {
                        ellenfelEgysegErtek2.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamMasodik)));
                    }

                    informacioErtek.setText("<html><center>" + egyseg + " egységet villámcsapták,<p> " + Varazsero.varazseroErtek * 30 + " sebzést szenvedett " +
                            "és " + Eletero.masodikEllEgysegEletero + " életereje maradt.</p></center></html>");

                    ellenfelEgysegIras2.add(ellenfelEgysegErtek2);
                    ellenfelEgysegL2Kep.add(ellenfelEgysegL2Kepe);
                    EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras2, ellenfelEgysegL2Kep, oszlop, sor);
                    ablakCsata.add(egysegekSorrend);
                } else {
                    egysegekSorrend.remove(ellenfelEgysegIras2);
                    egysegekSorrend.remove(ellenfelEgysegL2Kep);

                    eijas = 0;
                    egysegPozTorlese("eijas", sor, oszlop);

                    informacioErtek.setText("<html><center>" + egyseg + " egységet villámcsapták,<p> " + Varazsero.varazseroErtek * 30 + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                }
            }
            case "emino" -> {
                Eletero.harmadikEllEgysegEletero -= Varazsero.varazseroErtek * 30;
                ellenfelDbSzamHarmadik = Eletero.harmadikEllEgysegEletero / 80;
                if (Eletero.harmadikEllEgysegEletero > 0) {

                    egysegekSorrend.remove(ellenfelEgysegIras3);
                    egysegekSorrend.remove(ellenfelEgysegL3Kep);

                    if (ellenfelDbSzamHarmadik < 10) {
                        ellenfelEgysegErtek3.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamHarmadik)));
                    } else {
                        ellenfelEgysegErtek3.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamHarmadik)));
                    }

                    informacioErtek.setText("<html><center>" + egyseg + " egységet villámcsapták,<p> " + Varazsero.varazseroErtek * 30 + " sebzést szenvedett " +
                            "és " + Eletero.harmadikEllEgysegEletero + " életereje maradt.</p></center></html>");

                    ellenfelEgysegIras3.add(ellenfelEgysegErtek3);
                    ellenfelEgysegL3Kep.add(ellenfelEgysegL3Kepe);
                    EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras3, ellenfelEgysegL3Kep, oszlop, sor);
                    ablakCsata.add(egysegekSorrend);
                } else {
                    egysegekSorrend.remove(ellenfelEgysegIras3);
                    egysegekSorrend.remove(ellenfelEgysegL3Kep);

                    emino = 0;
                    egysegPozTorlese("emino", sor, oszlop);

                    informacioErtek.setText("<html><center>" + egyseg + " egységet villámcsapták,<p> " + Varazsero.varazseroErtek * 30 + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                }
            }
            case "egrif" -> {
                Eletero.harmadikEllEgysegEletero -= Varazsero.varazseroErtek * 30;
                ellenfelDbSzamHarmadik = Eletero.harmadikEllEgysegEletero / 30;
                if (Eletero.harmadikEllEgysegEletero > 0) {

                    egysegekSorrend.remove(ellenfelEgysegIras3);
                    egysegekSorrend.remove(ellenfelEgysegL3Kep);

                    if (ellenfelDbSzamHarmadik < 10) {
                        ellenfelEgysegErtek3.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamHarmadik)));
                    } else {
                        ellenfelEgysegErtek3.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamHarmadik)));
                    }

                    informacioErtek.setText("<html><center>" + egyseg + " egységet villámcsapták,<p> " + Varazsero.varazseroErtek * 30 + " sebzést szenvedett " +
                            "és " + Eletero.harmadikEllEgysegEletero + " életereje maradt.</p></center></html>");

                    ellenfelEgysegIras3.add(ellenfelEgysegErtek3);
                    ellenfelEgysegL3Kep.add(ellenfelEgysegL3Kepe);
                    EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras3, ellenfelEgysegL3Kep, oszlop, sor);
                    ablakCsata.add(egysegekSorrend);
                } else {
                    egysegekSorrend.remove(ellenfelEgysegIras3);
                    egysegekSorrend.remove(ellenfelEgysegL3Kep);

                    egrif = 0;
                    egysegPozTorlese("egrif", sor, oszlop);

                    informacioErtek.setText("<html><center>" + egyseg + " egységet villámcsapták,<p> " + Varazsero.varazseroErtek * 30 + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                }
            }
            case "efegyv" -> {
                Eletero.negyedikEllEgysegEletero -= Varazsero.varazseroErtek * 30;
                ellenfelDbSzamNegyedik = Eletero.negyedikEllEgysegEletero / 33;
                if (Eletero.negyedikEllEgysegEletero > 0) {

                    egysegekSorrend.remove(ellenfelEgysegIras4);
                    egysegekSorrend.remove(ellenfelEgysegL4Kep);

                    if (ellenfelDbSzamNegyedik < 10) {
                        ellenfelEgysegErtek4.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamNegyedik)));
                    } else {
                        ellenfelEgysegErtek4.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamNegyedik)));
                    }

                    informacioErtek.setText("<html><center>" + egyseg + " egységet villámcsapták,<p> " + Varazsero.varazseroErtek * 30 + " sebzést szenvedett " +
                            "és " + Eletero.negyedikEllEgysegEletero + " életereje maradt.</p></center></html>");

                    ellenfelEgysegIras4.add(ellenfelEgysegErtek4);
                    ellenfelEgysegL4Kep.add(ellenfelEgysegL4Kepe);
                    EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras4, ellenfelEgysegL4Kep, oszlop, sor);
                    ablakCsata.add(egysegekSorrend);
                } else {
                    egysegekSorrend.remove(ellenfelEgysegIras4);
                    egysegekSorrend.remove(ellenfelEgysegL4Kep);

                    efegyv = 0;
                    egysegPozTorlese("efegyv", sor, oszlop);

                    informacioErtek.setText("<html><center>" + egyseg + " egységet villámcsapták,<p> " + Varazsero.varazseroErtek * 30 + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                }
            }
            case "eorgy" -> {
                Eletero.negyedikEllEgysegEletero -= Varazsero.varazseroErtek * 30;
                ellenfelDbSzamNegyedik = Eletero.negyedikEllEgysegEletero / 20;
                if (Eletero.negyedikEllEgysegEletero > 0) {

                    egysegekSorrend.remove(ellenfelEgysegIras4);
                    egysegekSorrend.remove(ellenfelEgysegL4Kep);

                    if (ellenfelDbSzamNegyedik < 10) {
                        ellenfelEgysegErtek4.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamNegyedik)));
                    } else {
                        ellenfelEgysegErtek4.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamNegyedik)));
                    }

                    informacioErtek.setText("<html><center>" + egyseg + " egységet villámcsapták,<p> " + Varazsero.varazseroErtek * 30 + " sebzést szenvedett " +
                            "és " + Eletero.negyedikEllEgysegEletero + " életereje maradt.</p></center></html>");

                    ellenfelEgysegIras4.add(ellenfelEgysegErtek4);
                    ellenfelEgysegL4Kep.add(ellenfelEgysegL4Kepe);
                    EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras4, ellenfelEgysegL4Kep, oszlop, sor);
                    ablakCsata.add(egysegekSorrend);
                } else {
                    egysegekSorrend.remove(ellenfelEgysegIras4);
                    egysegekSorrend.remove(ellenfelEgysegL4Kep);

                    eorgy = 0;
                    egysegPozTorlese("eorgy", sor, oszlop);

                    informacioErtek.setText("<html><center>" + egyseg + " egységet villámcsapták,<p> " + Varazsero.varazseroErtek * 30 + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                }
            }
            case "eharcp" -> {
                Eletero.otodikEllEgysegEletero -= Varazsero.varazseroErtek * 30;
                ellenfelDbSzamOtodik = Eletero.otodikEllEgysegEletero / 54;
                if (Eletero.otodikEllEgysegEletero > 0) {

                    egysegekSorrend.remove(ellenfelEgysegIras5);
                    egysegekSorrend.remove(ellenfelEgysegL5Kep);

                    if (ellenfelDbSzamOtodik < 10) {
                        ellenfelEgysegErtek5.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamOtodik)));
                    } else {
                        ellenfelEgysegErtek5.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamOtodik)));
                    }

                    informacioErtek.setText("<html><center>" + egyseg + " egységet villámcsapták,<p> " + Varazsero.varazseroErtek * 30 + " sebzést szenvedett " +
                            "és " + Eletero.otodikEllEgysegEletero + " életereje maradt.</p></center></html>");

                    ellenfelEgysegIras5.add(ellenfelEgysegErtek5);
                    ellenfelEgysegL5Kep.add(ellenfelEgysegL5Kepe);
                    EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras5, ellenfelEgysegL5Kep, oszlop, sor);
                    ablakCsata.add(egysegekSorrend);
                } else {
                    egysegekSorrend.remove(ellenfelEgysegIras5);
                    egysegekSorrend.remove(ellenfelEgysegL5Kep);

                    eharcp = 0;
                    egysegPozTorlese("eharcp", sor, oszlop);

                    informacioErtek.setText("<html><center>" + egyseg + " egységet villámcsapták,<p> " + Varazsero.varazseroErtek * 30 + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                }
            }
            case "erapt" -> {
                Eletero.otodikEllEgysegEletero -= Varazsero.varazseroErtek * 30;
                ellenfelDbSzamOtodik = Eletero.otodikEllEgysegEletero / 35;
                if (Eletero.otodikEllEgysegEletero > 0) {

                    egysegekSorrend.remove(ellenfelEgysegIras5);
                    egysegekSorrend.remove(ellenfelEgysegL5Kep);

                    if (ellenfelDbSzamOtodik < 10) {
                        ellenfelEgysegErtek5.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamOtodik)));
                    } else {
                        ellenfelEgysegErtek5.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamOtodik)));
                    }

                    informacioErtek.setText("<html><center>" + egyseg + " egységet villámcsapták,<p> " + Varazsero.varazseroErtek * 30 + " sebzést szenvedett " +
                            "és " + Eletero.otodikEllEgysegEletero + " életereje maradt.</p></center></html>");

                    ellenfelEgysegIras5.add(ellenfelEgysegErtek5);
                    ellenfelEgysegL5Kep.add(ellenfelEgysegL5Kepe);
                    EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras5, ellenfelEgysegL5Kep, oszlop, sor);
                    ablakCsata.add(egysegekSorrend);
                } else {
                    egysegekSorrend.remove(ellenfelEgysegIras5);
                    egysegekSorrend.remove(ellenfelEgysegL5Kep);

                    erapt = 0;
                    egysegPozTorlese("erapt", sor, oszlop);

                    informacioErtek.setText("<html><center>" + egyseg + " egységet villámcsapták,<p> " + Varazsero.varazseroErtek * 30 + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                }
            }
        }
        manna -= 5;
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

    public static void villamcsapasElsuteseEllenfel(String egyseg, int sor, int oszlop) {

        System.out.println("ellhosvillamcsapas:" + egyseg +"   sor"+ sor +"   osz"+ oszlop);
    
        switch (egyseg) {
    
            case "foldmuv" -> {
                Eletero.elsoEgysegEletero -= EllenfelTulajdonsaga.ellenfelVarazsero * 30;
                elsoEgysegSzam = Eletero.elsoEgysegEletero / 3;
                if (Eletero.elsoEgysegEletero > 0) {
    
                    egysegekSorrend.remove(egysegIras1);
                    egysegekSorrend.remove(egysegL1TestKep);
    
                    if (elsoEgysegSzam < 10) {
                        egysegErtek1.setText(String.valueOf(String.format("%.2f", elsoEgysegSzam)));
                    } else {
                        egysegErtek1.setText(String.valueOf(String.format("%.1f", elsoEgysegSzam)));
                    }
    
                    informacioErtek.setText("<html><center>" + egysegNeve + " egyseget villamcsapták,<p> aki " + EllenfelTulajdonsaga.ellenfelVarazsero * 30 + " szenvedett " +
                            "és " + Eletero.elsoEgysegEletero + " maradt.</p></center></html>");
    
                    egysegIras1.add(egysegErtek1);
                    egysegL1TestKep.add(egysegL1TestKepe);
                    EgysegLathatosag.lathatosagSorrend(egysegIras1, egysegL1TestKep, oszlop, sor);
                    ablakCsata.add(egysegekSorrend);
                } else {
                    egysegekSorrend.remove(egysegIras1);
                    egysegekSorrend.remove(egysegL1TestKep);
    
                    foldmuv = 0;
                    egysegPozTorlese("foldmuv", sor, oszlop);
    
                    informacioErtek.setText("<html><center>" + egysegNeve + " egyseget villamcsapták,<p> aki " + EllenfelTulajdonsaga.ellenfelVarazsero * 30 + " szenvedett " +
                            "és meghalt.</p></center></html>");
                }
            }
            case "csont" -> {
                Eletero.elsoEgysegEletero -= EllenfelTulajdonsaga.ellenfelVarazsero * 30;
                elsoEgysegSzam = Eletero.elsoEgysegEletero / 2;
                if (Eletero.elsoEgysegEletero > 0) {
    
                    egysegekSorrend.remove(egysegIras1);
                    egysegekSorrend.remove(egysegL1TestKep);
    
                    if (elsoEgysegSzam < 10) {
                        egysegErtek1.setText(String.valueOf(String.format("%.2f", elsoEgysegSzam)));
                    } else {
                        egysegErtek1.setText(String.valueOf(String.format("%.1f", elsoEgysegSzam)));
                    }
    
                    informacioErtek.setText("<html><center>" + egysegNeve + " egyseget villamcsapták,<p> aki " + EllenfelTulajdonsaga.ellenfelVarazsero * 30 + " szenvedett " +
                            "és " + Eletero.elsoEgysegEletero + " maradt.</p></center></html>");
    
                    egysegIras1.add(egysegErtek1);
                    egysegL1TestKep.add(egysegL1TestKepe);
                    EgysegLathatosag.lathatosagSorrend(egysegIras1, egysegL1TestKep, oszlop, sor);
                    ablakCsata.add(egysegekSorrend);
                } else {
                    egysegekSorrend.remove(egysegIras1);
                    egysegekSorrend.remove(egysegL1TestKep);
    
                    csont = 0;
                    egysegPozTorlese("csont", sor, oszlop);
    
                    informacioErtek.setText("<html><center>" + egysegNeve + " egyseget villamcsapták,<p> aki " + EllenfelTulajdonsaga.ellenfelVarazsero * 30 + " szenvedett " +
                            "és meghalt.</p></center></html>");
                }
            }
            case "felder" -> {
                Eletero.masodikEgysegEletero -= EllenfelTulajdonsaga.ellenfelVarazsero * 30;
                masodikEgysegSzam = Eletero.masodikEgysegEletero / 10;
                if (Eletero.masodikEgysegEletero > 0) {
    
                    egysegekSorrend.remove(egysegIras2);
                    egysegekSorrend.remove(egysegL2TestKep);
    
                    if (masodikEgysegSzam < 10) {
                        egysegErtek2.setText(String.valueOf(String.format("%.2f", masodikEgysegSzam)));
                    } else {
                        egysegErtek2.setText(String.valueOf(String.format("%.1f", masodikEgysegSzam)));
                    }
    
                    informacioErtek.setText("<html><center>" + egysegNeve + " egyseget villamcsapták,<p> aki " + EllenfelTulajdonsaga.ellenfelVarazsero * 30 + " szenvedett " +
                            "és " + Eletero.masodikEgysegEletero + " maradt.</p></center></html>");
    
                    egysegIras2.add(egysegErtek2);
                    egysegL2TestKep.add(egysegL2TestKepe);
                    EgysegLathatosag.lathatosagSorrend(egysegIras2, egysegL2TestKep, oszlop, sor);
                    ablakCsata.add(egysegekSorrend);
                } else {
                    egysegekSorrend.remove(egysegIras2);
                    egysegekSorrend.remove(egysegL2TestKep);
    
                    felder = 0;
                    egysegPozTorlese("felder", sor, oszlop);
    
                    informacioErtek.setText("<html><center>" + egysegNeve + " egyseget villamcsapták,<p> aki " + EllenfelTulajdonsaga.ellenfelVarazsero * 30 + " szenvedett " +
                            "és meghalt.</p></center></html>");
                }
            }
            case "ijas" -> {
                Eletero.masodikEgysegEletero -= EllenfelTulajdonsaga.ellenfelVarazsero * 30;
                masodikEgysegSzam = Eletero.masodikEgysegEletero / 7;
                if (Eletero.masodikEgysegEletero > 0) {
    
                    egysegekSorrend.remove(egysegIras2);
                    egysegekSorrend.remove(egysegL2TestKep);
    
                    if (masodikEgysegSzam < 10) {
                        egysegErtek2.setText(String.valueOf(String.format("%.2f", masodikEgysegSzam)));
                    } else {
                        egysegErtek2.setText(String.valueOf(String.format("%.1f", masodikEgysegSzam)));
                    }
    
                    informacioErtek.setText("<html><center>" + egysegNeve + " egyseget villamcsapták,<p> aki " + EllenfelTulajdonsaga.ellenfelVarazsero * 30 + " szenvedett " +
                            "és " + Eletero.masodikEgysegEletero + " maradt.</p></center></html>");
                    System.out.println(EllenfelTulajdonsaga.ellenfelVarazsero * 30+"  "+Eletero.masodikEgysegEletero);
    
                    egysegIras2.add(egysegErtek2);
                    egysegL2TestKep.add(egysegL2TestKepe);
                    EgysegLathatosag.lathatosagSorrend(egysegIras2, egysegL2TestKep, oszlop, sor);
                    ablakCsata.add(egysegekSorrend);
                } else {
                    egysegekSorrend.remove(egysegIras2);
                    egysegekSorrend.remove(egysegL2TestKep);
    
                    ijas = 0;
                    egysegPozTorlese("ijas", sor, oszlop);
    
                    informacioErtek.setText("<html><center>" + egysegNeve + " egyseget villamcsapták,<p> aki " + EllenfelTulajdonsaga.ellenfelVarazsero * 30 + " szenvedett " +
                            "és meghalt.</p></center></html>");
                }
            }
            case "mino" -> {
                Eletero.harmadikEgysegEletero -= EllenfelTulajdonsaga.ellenfelVarazsero * 30;
                harmadikEgysegSzam = Eletero.harmadikEgysegEletero / 80;
                if (Eletero.harmadikEgysegEletero > 0) {
    
                    egysegekSorrend.remove(egysegIras3);
                    egysegekSorrend.remove(egysegL3TestKep);
    
                    if (harmadikEgysegSzam < 10) {
                        egysegErtek3.setText(String.valueOf(String.format("%.2f", harmadikEgysegSzam)));
                    } else {
                        egysegErtek3.setText(String.valueOf(String.format("%.1f", harmadikEgysegSzam)));
                    }
    
                    informacioErtek.setText("<html><center>" + egysegNeve + " egyseget villamcsapták,<p> aki " + EllenfelTulajdonsaga.ellenfelVarazsero * 30 + " szenvedett " +
                            "és " + Eletero.harmadikEgysegEletero + " maradt.</p></center></html>");
    
                    egysegIras3.add(egysegErtek3);
                    egysegL3TestKep.add(egysegL3TestKepe);
                    EgysegLathatosag.lathatosagSorrend(egysegIras3, egysegL3TestKep, oszlop, sor);
                    ablakCsata.add(egysegekSorrend);
                } else {
                    egysegekSorrend.remove(egysegIras3);
                    egysegekSorrend.remove(egysegL3TestKep);
    
                    mino = 0;
                    egysegPozTorlese("mino", sor, oszlop);
    
                    informacioErtek.setText("<html><center>" + egysegNeve + " egyseget villamcsapták,<p> aki " + EllenfelTulajdonsaga.ellenfelVarazsero * 30 + " szenvedett " +
                            "és meghalt.</p></center></html>");
                }
            }
            case "grif" -> {
                Eletero.harmadikEgysegEletero -= EllenfelTulajdonsaga.ellenfelVarazsero * 30;
                harmadikEgysegSzam = Eletero.harmadikEgysegEletero / 30;
                if (Eletero.harmadikEgysegEletero > 0) {
    
                    egysegekSorrend.remove(egysegIras3);
                    egysegekSorrend.remove(egysegL3TestKep);
    
                    if (harmadikEgysegSzam < 10) {
                        egysegErtek3.setText(String.valueOf(String.format("%.2f", harmadikEgysegSzam)));
                    } else {
                        egysegErtek3.setText(String.valueOf(String.format("%.1f", harmadikEgysegSzam)));
                    }
    
                    informacioErtek.setText("<html><center>" + egysegNeve + " egyseget villamcsapták,<p> aki " + EllenfelTulajdonsaga.ellenfelVarazsero * 30 + " szenvedett " +
                            "és " + Eletero.harmadikEgysegEletero + " maradt.</p></center></html>");
    
                    egysegIras3.add(egysegErtek3);
                    egysegL3TestKep.add(egysegL3TestKepe);
                    EgysegLathatosag.lathatosagSorrend(egysegIras3, egysegL3TestKep, oszlop, sor);
                    ablakCsata.add(egysegekSorrend);
                } else {
                    egysegekSorrend.remove(egysegIras3);
                    egysegekSorrend.remove(egysegL3TestKep);
    
                    grif = 0;
                    egysegPozTorlese("grif", sor, oszlop);
    
                    informacioErtek.setText("<html><center>" + egysegNeve + " egyseget villamcsapták,<p> aki " + EllenfelTulajdonsaga.ellenfelVarazsero * 30 + " szenvedett " +
                            "és meghalt.</p></center></html>");
                }
            }
            case "fegyv" -> {
                Eletero.negyedikEgysegEletero -= EllenfelTulajdonsaga.ellenfelVarazsero * 30;
                negyedikEgysegSzam = Eletero.negyedikEgysegEletero / 33;
                if (Eletero.negyedikEgysegEletero > 0) {
    
                    egysegekSorrend.remove(egysegIras4);
                    egysegekSorrend.remove(egysegL4TestKep);
    
                    if (negyedikEgysegSzam < 10) {
                        egysegErtek4.setText(String.valueOf(String.format("%.2f", negyedikEgysegSzam)));
                    } else {
                        egysegErtek4.setText(String.valueOf(String.format("%.1f", negyedikEgysegSzam)));
                    }
    
                    informacioErtek.setText("<html><center>" + egysegNeve + " egyseget villamcsapták,<p> aki " + EllenfelTulajdonsaga.ellenfelVarazsero * 30 + " szenvedett " +
                            "és " + Eletero.negyedikEgysegEletero + " maradt.</p></center></html>");
    
                    egysegIras4.add(egysegErtek4);
                    egysegL4TestKep.add(egysegL4TestKepe);
                    EgysegLathatosag.lathatosagSorrend(egysegIras4, egysegL4TestKep, oszlop, sor);
                    ablakCsata.add(egysegekSorrend);
                } else {
                    egysegekSorrend.remove(egysegIras4);
                    egysegekSorrend.remove(egysegL4TestKep);
    
                    fegyv = 0;
                    egysegPozTorlese("fegyv", sor, oszlop);
    
                    informacioErtek.setText("<html><center>" + egysegNeve + " egyseget villamcsapták,<p> aki " + EllenfelTulajdonsaga.ellenfelVarazsero * 30 + " szenvedett " +
                            "és meghalt.</p></center></html>");
                }
            }
            case "orgy" -> {
                Eletero.negyedikEgysegEletero -= EllenfelTulajdonsaga.ellenfelVarazsero * 30;
                negyedikEgysegSzam = Eletero.negyedikEgysegEletero / 20;
                if (Eletero.negyedikEgysegEletero > 0) {
    
                    egysegekSorrend.remove(egysegIras4);
                    egysegekSorrend.remove(egysegL4TestKep);
    
                    if (negyedikEgysegSzam < 10) {
                        egysegErtek4.setText(String.valueOf(String.format("%.2f", negyedikEgysegSzam)));
                    } else {
                        egysegErtek4.setText(String.valueOf(String.format("%.1f", negyedikEgysegSzam)));
                    }
    
                    informacioErtek.setText("<html><center>" + egysegNeve + " egyseget villamcsapták,<p> aki " + EllenfelTulajdonsaga.ellenfelVarazsero * 30 + " szenvedett " +
                            "és " + Eletero.negyedikEgysegEletero + " maradt.</p></center></html>");
    
                    egysegIras4.add(egysegErtek4);
                    egysegL4TestKep.add(egysegL4TestKepe);
                    EgysegLathatosag.lathatosagSorrend(egysegIras4, egysegL4TestKep, oszlop, sor);
                    ablakCsata.add(egysegekSorrend);
                } else {
                    egysegekSorrend.remove(egysegIras4);
                    egysegekSorrend.remove(egysegL4TestKep);
    
                    orgy = 0;
                    egysegPozTorlese("orgy", sor, oszlop);
    
                    informacioErtek.setText("<html><center>" + egysegNeve + " egyseget villamcsapták,<p> aki " + EllenfelTulajdonsaga.ellenfelVarazsero * 30 + " szenvedett " +
                            "és meghalt.</p></center></html>");
                }
            }
            case "harcp" -> {
                Eletero.otodikEgysegEletero -= EllenfelTulajdonsaga.ellenfelVarazsero * 30;
                otodikEgysegSzam = Eletero.otodikEgysegEletero / 54;
                if (Eletero.otodikEgysegEletero > 0) {
    
                    egysegekSorrend.remove(egysegIras5);
                    egysegekSorrend.remove(egysegL5TestKep);
    
                    if (otodikEgysegSzam < 10) {
                        egysegErtek5.setText(String.valueOf(String.format("%.2f", otodikEgysegSzam)));
                    } else {
                        egysegErtek5.setText(String.valueOf(String.format("%.1f", otodikEgysegSzam)));
                    }
    
                    informacioErtek.setText("<html><center>" + egysegNeve + " egyseget villamcsapták,<p> aki " + EllenfelTulajdonsaga.ellenfelVarazsero * 30 + " szenvedett " +
                            "és " + Eletero.otodikEgysegEletero + " maradt.</p></center></html>");
    
                    egysegIras5.add(egysegErtek5);
                    egysegL5TestKep.add(egysegL5TestKepe);
                    EgysegLathatosag.lathatosagSorrend(egysegIras5, egysegL5TestKep, oszlop, sor);
                    ablakCsata.add(egysegekSorrend);
                } else {
                    egysegekSorrend.remove(egysegIras5);
                    egysegekSorrend.remove(egysegL5TestKep);
    
                    harcp = 0;
                    egysegPozTorlese("harcp", sor, oszlop);
    
                    informacioErtek.setText("<html><center>" + egysegNeve + " egyseget villamcsapták,<p> aki " + EllenfelTulajdonsaga.ellenfelVarazsero * 30 + " szenvedett " +
                            "és meghalt.</p></center></html>");
                }
            }
            case "rapt" -> {
                Eletero.otodikEgysegEletero -= EllenfelTulajdonsaga.ellenfelVarazsero * 30;
                otodikEgysegSzam = Eletero.otodikEgysegEletero / 35;
                if (Eletero.otodikEgysegEletero > 0) {
    
                    egysegekSorrend.remove(egysegIras5);
                    egysegekSorrend.remove(egysegL5TestKep);
    
                    if (otodikEgysegSzam < 10) {
                        egysegErtek5.setText(String.valueOf(String.format("%.2f", otodikEgysegSzam)));
                    } else {
                        egysegErtek5.setText(String.valueOf(String.format("%.1f", otodikEgysegSzam)));
                    }
    
                    informacioErtek.setText("<html><center>" + egysegNeve + " egyseget villamcsapták,<p> aki " + EllenfelTulajdonsaga.ellenfelVarazsero * 30 + " szenvedett " +
                            "és " + Eletero.otodikEgysegEletero + " maradt.</p></center></html>");
    
                    egysegIras5.add(egysegErtek5);
                    egysegL5TestKep.add(egysegL5TestKepe);
                    EgysegLathatosag.lathatosagSorrend(egysegIras5, egysegL5TestKep, oszlop, sor);
                    ablakCsata.add(egysegekSorrend);
                } else {
                    egysegekSorrend.remove(egysegIras5);
                    egysegekSorrend.remove(egysegL5TestKep);
    
                    rapt = 0;
                    egysegPozTorlese("rapt", sor, oszlop);
    
                    informacioErtek.setText("<html><center>" + egysegNeve + " egyseget villamcsapták,<p> aki " + EllenfelTulajdonsaga.ellenfelVarazsero * 30 + " szenvedett " +
                            "és meghalt.</p></center></html>");
                }
            }
        }
        ellenfelManna -= 5;
        ellenfelMannaErtek.setText(String.valueOf(ellenfelManna));

        kiKicsodaEll();
        mutatoEll = 0;
        holVagyEllHos();

        double ujErtek2 = moralSorrendTList.get(mutatoEll);

        moralSorrendTList.remove(mutatoEll);
        moralSorrendTList.add(ujErtek2);

        hanyadikKor(elsoHely);
        korokKiirasa();

        sorrendFrissites();
    }
}