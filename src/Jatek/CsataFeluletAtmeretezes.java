package Jatek;

import Egysegek.EgysegLathatosag;

import static Egysegek.EgysegLetetel.*;
import static Ellenfel.EllenfelEgysege.*;
import static Jatek.JatekAblak.ablakCsata;

public class CsataFeluletAtmeretezes {

    public static void poziciokAtmeretezes(int oszlop, int sor, String egyseg) {

        int xKep=0,yKep=0,xIras=0,yIras=0;

        if (egyseg.equals("ecsont") || egyseg.equals("efelder") || egyseg.equals("emino") || egyseg.equals("eorgy") ||
                egyseg.equals("erapt") || egyseg.equals("efoldm") || egyseg.equals("eijas") || egyseg.equals("egrif") ||
                egyseg.equals("efegyv") || egyseg.equals("eharcp") ) {
            if (oszlop == 1) {
                xKep = 240+(oszlop*16);
                xIras = 250+(oszlop*16);
            } else if (oszlop == 2) {
                xKep = 300+(oszlop*16);
                xIras = 310+(oszlop*16);
            } else if (oszlop == 3) {
                xKep = 360+(oszlop*16);
                xIras = 370+(oszlop*16);
            } else if (oszlop == 4) {
                xKep = 420+(oszlop*16);
                xIras = 430+(oszlop*16);
            } else if (oszlop == 5) {
                xKep = 480+(oszlop*16);
                xIras = 490+(oszlop*16);
            } else if (oszlop == 6) {
                xKep = 540+(oszlop*16);
                xIras = 550+(oszlop*16);
            } else if (oszlop == 7) {
                xKep = 600+(oszlop*16);
                xIras = 610+(oszlop*16);
            } else if (oszlop == 8) {
                xKep = 660+(oszlop*16);
                xIras = 670+(oszlop*16);
            } else if (oszlop == 9) {
                xKep = 720+(oszlop*16);
                xIras = 730+(oszlop*16);
            } else if (oszlop == 10) {
                xKep = 780+(oszlop*16);
                xIras = 790+(oszlop*16);
            } else if (oszlop == 11) {
                xKep = 840+(oszlop*16);
                xIras = 850+(oszlop*16);
            } else if (oszlop == 12) {
                xKep = 900+(oszlop*16);
                xIras = 910+(oszlop*16);
            }

            boolean b = oszlop == 1 || oszlop == 2 || oszlop == 3 || oszlop == 4 || oszlop == 5 || oszlop == 6
                    || oszlop == 7 || oszlop == 8 || oszlop == 9 || oszlop == 10 || oszlop == 11 || oszlop == 12;
            if (sor == 1 && b) {
                yKep = 26+(sor*4);
                yIras = 102+(sor*4);
            } else if (sor == 2 && b) {
                yKep = 65+(sor*4);
                yIras = 140+(sor*4);
            } else if (sor == 3 && b) {
                yKep = 105+(sor*4);
                yIras = 180+(sor*4);
            } else if (sor == 4 && b) {
                yKep = 144+(sor*4);
                yIras = 219+(sor*4);
            } else if (sor == 5 && b) {
                yKep = 183+(sor*4);
                yIras = 258+(sor*4);
            } else if (sor == 6 && b) {
                yKep = 222+(sor*4);
                yIras = 297+(sor*4);
            } else if (sor == 7 && b) {
                yKep = 262+(sor*4);
                yIras = 337+(sor*4);
            } else if (sor == 8 && b) {
                yKep = 302+(sor*4);
                yIras = 377+(sor*4);
            } else if (sor == 9 && b) {
                yKep = 340+(sor*4);
                yIras = 416+(sor*4);
            } else if (sor == 10 && b) {
                yKep = 380+(sor*4);
                yIras = 456+(sor*4);
            }
        }else if (egyseg.equals("csont") || egyseg.equals("felder") || egyseg.equals("mino") || egyseg.equals("orgy") ||
                egyseg.equals("rapt") || egyseg.equals("foldmuv") || egyseg.equals("ijas") || egyseg.equals("grif") ||
                egyseg.equals("fegyv") || egyseg.equals("harcp") ) {
            if (oszlop == 1) {
                xKep=284+(oszlop*16);
                xIras=354+(oszlop*16);
            } else if (oszlop == 2) {
                xKep=342+(oszlop*16);
                xIras=412+(oszlop*16);
            } else if (oszlop == 3) {
                xKep = 400+(oszlop*16);
                xIras = 470+(oszlop*16);
            } else if (oszlop == 4) {
                xKep = 458+(oszlop*16);
                xIras = 528+(oszlop*16);
            } else if (oszlop == 5) {
                xKep = 516+(oszlop*16);
                xIras = 586+(oszlop*16);
            } else if (oszlop == 6) {
                xKep = 574+(oszlop*16);
                xIras = 644+(oszlop*16);
            } else if (oszlop == 7) {
                xKep = 632+(oszlop*16);
                xIras = 702+(oszlop*16);
            } else if (oszlop == 8) {
                xKep = 690+(oszlop*16);
                xIras = 760+(oszlop*16);
            } else if (oszlop == 9) {
                xKep = 748+(oszlop*16);
                xIras = 818+(oszlop*16);
            } else if (oszlop == 10) {
                xKep = 806+(oszlop*16);
                xIras = 876+(oszlop*16);
            } else if (oszlop == 11) {
                xKep = 864+(oszlop*16);
                xIras = 934+(oszlop*16);
            } else if (oszlop == 12) {
                xKep = 922+(oszlop*16);
                xIras = 992+(oszlop*16);
            }

            boolean b = oszlop == 1 || oszlop == 2 || oszlop == 3 || oszlop == 4 || oszlop == 5 || oszlop == 6
                    || oszlop == 7 || oszlop == 8 || oszlop == 9 || oszlop == 10 || oszlop == 11 || oszlop == 12;
            if (sor == 1 && b) {
                yKep = 26+(sor*4);
                yIras = 91+(sor*4);
            } else if (sor == 2 && b) {
                yKep = 65+(sor*4);
                yIras = 129+(sor*4);
            } else if (sor == 3 && b) {
                yKep = 105+(sor*4);
                yIras = 169+(sor*4);
            } else if (sor == 4 && b) {
                yKep = 144+(sor*4);
                yIras = 208+(sor*4);
            } else if (sor == 5 && b) {
                yKep = 183+(sor*4);
                yIras = 247+(sor*4);
            } else if (sor == 6 && b) {
                yKep = 222+(sor*4);
                yIras = 287+(sor*4);
            } else if (sor == 7 && b) {
                yKep = 262+(sor*4);
                yIras = 326+(sor*4);
            } else if (sor == 8 && b) {
                yKep = 302+(sor*4);
                yIras = 366+(sor*4);
            } else if (sor == 9 && b) {
                yKep = 340+(sor*4);
                yIras = 404+(sor*4);
            } else if (sor == 10 && b) {
                yKep = 380+(sor*4);
                yIras = 444+(sor*4);
            }
        }


        switch (egyseg) {
            case "ecsont", "efoldm" -> {
                ellenfelEgysegIras1.setBounds(xIras, yIras, 20, 15);
                ellenfelEgysegL1Kep.setBounds(xKep, yKep, 100, 100);
                EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras1, ellenfelEgysegL1Kep, oszlop, sor);
                ablakCsata.add(egysegekSorrend);
            }
            case "efelder", "eijas" -> {
                ellenfelEgysegIras2.setBounds(xIras, yIras, 20, 15);
                ellenfelEgysegL2Kep.setBounds(xKep, yKep, 100, 100);
                EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras2, ellenfelEgysegL2Kep, oszlop, sor);
                ablakCsata.add(egysegekSorrend);
            }
            case "emino", "egrif" -> {
                ellenfelEgysegIras3.setBounds(xIras, yIras, 20, 15);
                ellenfelEgysegL3Kep.setBounds(xKep, yKep, 100, 100);
                EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras3, ellenfelEgysegL3Kep, oszlop, sor);
                ablakCsata.add(egysegekSorrend);
            }
            case "eorgy", "efegyv" -> {
                ellenfelEgysegIras4.setBounds(xIras, yIras, 20, 15);
                ellenfelEgysegL4Kep.setBounds(xKep, yKep, 100, 100);
                EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras4, ellenfelEgysegL4Kep, oszlop, sor);
                ablakCsata.add(egysegekSorrend);
            }
            case "erapt", "eharcp" -> {
                ellenfelEgysegIras5.setBounds(xIras, yIras, 20, 15);
                ellenfelEgysegL5Kep.setBounds(xKep, yKep, 100, 100);
                EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras5, ellenfelEgysegL5Kep, oszlop, sor);
                ablakCsata.add(egysegekSorrend);
            }
            case "csont", "foldmuv" -> {
                egysegIras1.setBounds(xIras, yIras, 20, 15);
                egysegL1TestKep.setBounds(xKep, yKep, 100, 100);
                EgysegLathatosag.lathatosagSorrend(egysegIras1, egysegL1TestKep, oszlop, sor);
                ablakCsata.add(egysegekSorrend);
            }
            case "felder", "ijas" -> {
                egysegIras2.setBounds(xIras, yIras, 20, 15);
                egysegL2TestKep.setBounds(xKep, yKep, 100, 100);
                EgysegLathatosag.lathatosagSorrend(egysegIras2, egysegL2TestKep, oszlop, sor);
                ablakCsata.add(egysegekSorrend);
            }
            case "mino", "grif" -> {
                egysegIras3.setBounds(xIras, yIras, 20, 15);
                egysegL3TestKep.setBounds(xKep, yKep, 100, 100);
                EgysegLathatosag.lathatosagSorrend(egysegIras3, egysegL3TestKep, oszlop, sor);
                ablakCsata.add(egysegekSorrend);
            }
            case "orgy", "fegyv" -> {
                egysegIras4.setBounds(xIras, yIras, 20, 15);
                egysegL4TestKep.setBounds(xKep, yKep, 100, 100);
                EgysegLathatosag.lathatosagSorrend(egysegIras4, egysegL4TestKep, oszlop, sor);
                ablakCsata.add(egysegekSorrend);
            }
            case "rapt", "harcp" -> {
                egysegIras5.setBounds(xIras, yIras, 20, 15);
                egysegL5TestKep.setBounds(xKep, yKep, 100, 100);
                EgysegLathatosag.lathatosagSorrend(egysegIras5, egysegL5TestKep, oszlop, sor);
                ablakCsata.add(egysegekSorrend);
            }
        }
    }
}
