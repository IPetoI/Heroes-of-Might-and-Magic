package Ellenfel;

import Egysegek.EgysegekNeEgymasra;

import javax.swing.*;
import java.util.Random;

import static Egysegek.Eletero.egysegEletereje;
import static Egysegek.Sebesseg.mekkoraTavolsagod;
import static Ellenfel.EllenfelEgysege.*;
import static Ellenfel.EllenfelTulajdonsaga.ellenfelArany;
import static Jatek.Valasztas.lovage;

public class EllenfelEgysegPozicio {

    static EllenfelEgysege ellenfelEgysege = EllenfelEgysege.getInstance();

    public static Random random = new Random();

    public static ImageIcon ellenfelFoldmuvesTest = new ImageIcon("Kepek/egysegek/FoldmuvesKE.png");
    public static ImageIcon ellenfelIjaszTest = new ImageIcon("Kepek/egysegek/IjaszKE.png");
    public static ImageIcon ellenfelGriffTest = new ImageIcon("Kepek/egysegek/GriffKE.png");
    public static ImageIcon ellenfelFegyvernokTest = new ImageIcon("Kepek/egysegek/FegyvernokKE.png");
    public static ImageIcon ellenfelHarcospapTest = new ImageIcon("Kepek/egysegek/HarcosPapKE.png");

    public static ImageIcon ellenfelCsontvazTest = new ImageIcon("Kepek/egysegek/CsontvazKE.png");
    public static ImageIcon ellenfelFelderitoTest = new ImageIcon("Kepek/egysegek/FelderitoKE.png");
    public static ImageIcon ellenfelMinotauroszTest = new ImageIcon("Kepek/egysegek/MinotauroszKE.png");
    public static ImageIcon ellenfelOrgyilkosTest = new ImageIcon("Kepek/egysegek/OrgyilkosKE.png");
    public static ImageIcon ellenfelRaptorlovasTest = new ImageIcon("Kepek/egysegek/RaptorLovasKE.png");

    public static int ellenfelFoldmuvesSzam=0;
    public static int ellenfelCsontvazSzam=0;
    public static int ellenfelIjaszSzam=0, ellenfelFelderitoSzam=0;
    public static int ellenfelGriffSzam=0, ellenfelMinotaurSzam=0;
    public static int ellenfelFegyvernokSzam=0, ellenfelOrgyilkosSzam=0;
    public static int ellenfelHarcosPapSzam=0, ellenfelRaptorLovasSzam=0;

    static int ellenfelAranyEgysegre3 =0;
    static int ellenfelAranyEgysegre4 =0;

    public static int elsoSEll =0;
    public static int masodikSEll=0;
    public static int harmadikSEll=0;
    public static int negyedikSEll=0;
    public static int otodikSEll=0;
    public static int elsoOEll =0;
    public static int masodikOEll=0;
    public static int harmadikOEll=0;
    public static int negyedikOEll=0;
    public static int otodikOEll=0;

    public static int elsoEllPoz=0;
    public static int masodikEllPoz=0;
    public static int harmadikEllPoz=0;
    public static int negyedikEllPoz=0;
    public static int otodikEllPoz=0;

    public static String egysegEllenfelEgy="n";
    public static String egysegEllenfelKetto="n";
    public static String egysegEllenfelHarom="n";
    public static String egysegEllenfelNegy="n";
    public static String egysegEllenfelOt="n";

    public static boolean mehete=true;

    public static void ellenfelEgysegeiKipakolas() {

        egysegekrePenz();

    }

    public static void egysegekrePenz() {
        do {

            ellenfelAranyEgysegre4=0;
            ellenfelAranyEgysegre3=ellenfelArany;

            ellenfelFoldmuvesSzam=0;
            ellenfelIjaszSzam=0;
            ellenfelGriffSzam=0;
            ellenfelFegyvernokSzam=0;
            ellenfelHarcosPapSzam=0;

            ellenfelCsontvazSzam=0;
            ellenfelFelderitoSzam=0;
            ellenfelMinotaurSzam=0;
            ellenfelOrgyilkosSzam=0;
            ellenfelRaptorLovasSzam=0;

            if (lovage==1) {

                ellenfelFoldmuvesSzam = random.nextInt(200 + 1);
                ellenfelIjaszSzam = random.nextInt(100 + 1);
                ellenfelGriffSzam = random.nextInt(40 + 1);
                ellenfelFegyvernokSzam = random.nextInt(30 + 1);
                ellenfelHarcosPapSzam = random.nextInt(25 + 1);

                for (int i=0;i<ellenfelFoldmuvesSzam;i++) {
                    ellenfelAranyEgysegre4 += 2;
                }
                for (int i=0;i<ellenfelIjaszSzam;i++) {
                    ellenfelAranyEgysegre4 += 6;
                }
                for (int i=0;i<ellenfelGriffSzam;i++) {
                    ellenfelAranyEgysegre4 += 15;
                }
                for (int i=0;i<ellenfelFegyvernokSzam;i++) {
                    ellenfelAranyEgysegre4 += 11;
                }
                for (int i=0;i<ellenfelHarcosPapSzam;i++) {
                    ellenfelAranyEgysegre4 += 22;
                }
            }else if (lovage==0) {

                ellenfelCsontvazSzam=random.nextInt(200 + 1);
                ellenfelFelderitoSzam=random.nextInt(100 + 1);
                ellenfelMinotaurSzam=random.nextInt(40 + 1);
                ellenfelOrgyilkosSzam=random.nextInt(30 + 1);
                ellenfelRaptorLovasSzam=random.nextInt(25 + 1);

                for (int i=0;i<ellenfelCsontvazSzam;i++) {
                    ellenfelAranyEgysegre4 += 2;
                }
                for (int i=0;i<ellenfelFelderitoSzam;i++) {
                    ellenfelAranyEgysegre4 += 6;
                }
                for (int i=0;i<ellenfelMinotaurSzam;i++) {
                    ellenfelAranyEgysegre4 += 19;
                }
                for (int i=0;i<ellenfelOrgyilkosSzam;i++) {
                    ellenfelAranyEgysegre4 += 27;
                }
                for (int i=0;i<ellenfelRaptorLovasSzam;i++) {
                    ellenfelAranyEgysegre4 += 11;
                }
            }
            ellenfelAranyEgysegre3-= ellenfelAranyEgysegre4;
        }
        while (ellenfelAranyEgysegre3 <=-1 || ellenfelAranyEgysegre3>=4 ) ;

        ellenfelArany-= ellenfelAranyEgysegre4;

        ellenfelElsoEgysegPoz();
        ellenfelMasodikEgysegPoz();
        ellenfelHarmadikEgysegPoz();
        ellenfelNegyedikEgysegPoz();
        ellenfelOtodikEgysegPoz();
        System.out.println(" ");
        System.out.println("---------------------------------------------------------------");

        System.out.println("Ellenfel aranya egyseg vasarlas utan: "+ellenfelArany);

        System.out.println("-------------------- Sajat Egyseg Letetele --------------------");
        System.out.println(" ");
    }

    public static void ellenfelElsoEgysegPoz() {

        ellenfelOszlop = random.nextInt(12 - 11 + 1) + 11;
        ellenfelSor = random.nextInt(10 - 1 + 1) + 1;

        elsoOEll =ellenfelOszlop;
        elsoSEll =ellenfelSor;
        elsoEllPoz=Integer.parseInt(String.valueOf(elsoSEll) + String.valueOf(elsoOEll));

        if (ellenfelFoldmuvesSzam>0 || ellenfelCsontvazSzam>0) {

        if (lovage == 1) {
            ellenfelDbSzamElso = ellenfelFoldmuvesSzam;
            ellenfelEgysegL1Kepe.setIcon(ellenfelFoldmuvesTest);
            egysegEllenfelEgy="efoldmuv";
        } else if (lovage == 0) {
            ellenfelDbSzamElso = ellenfelCsontvazSzam;
            ellenfelEgysegL1Kepe.setIcon(ellenfelCsontvazTest);
            egysegEllenfelEgy="ecsont";
        }

            if (ellenfelOszlop == 11) {
                ellenfelxKep = 840;
                ellenfelxIras = 850;
            } else if (ellenfelOszlop == 12) {
                ellenfelxKep = 900;
                ellenfelxIras = 910;
            }

            if ((ellenfelSor == 1 && ellenfelOszlop == 11) || (ellenfelSor == 1 && ellenfelOszlop == 12)) {
                ellenfelyKep = 26;
                ellenfelyIras = 102;
            } else if ((ellenfelSor == 2 && ellenfelOszlop == 11) || (ellenfelSor == 2 && ellenfelOszlop == 12)) {
                ellenfelyKep = 65;
                ellenfelyIras = 140;
            } else if ((ellenfelSor == 3 && ellenfelOszlop == 11) || (ellenfelSor == 3 && ellenfelOszlop == 12)) {
                ellenfelyKep = 105;
                ellenfelyIras = 180;
            } else if ((ellenfelSor == 4 && ellenfelOszlop == 11) || (ellenfelSor == 4 && ellenfelOszlop == 12)) {
                ellenfelyKep = 144;
                ellenfelyIras = 219;
            } else if ((ellenfelSor == 5 && ellenfelOszlop == 11) || (ellenfelSor == 5 && ellenfelOszlop == 12)) {
                ellenfelyKep = 183;
                ellenfelyIras = 258;
            } else if ((ellenfelSor == 6 && ellenfelOszlop == 11) || (ellenfelSor == 6 && ellenfelOszlop == 12)) {
                ellenfelyKep = 222;
                ellenfelyIras = 297;
            } else if ((ellenfelSor == 7 && ellenfelOszlop == 11) || (ellenfelSor == 7 && ellenfelOszlop == 12)) {
                ellenfelyKep = 262;
                ellenfelyIras = 337;
            } else if ((ellenfelSor == 8 && ellenfelOszlop == 11) || (ellenfelSor == 8 && ellenfelOszlop == 12)) {
                ellenfelyKep = 302;
                ellenfelyIras = 377;
            } else if ((ellenfelSor == 9 && ellenfelOszlop == 11) || (ellenfelSor == 9 && ellenfelOszlop == 12)) {
                ellenfelyKep = 340;
                ellenfelyIras = 416;
            } else if ((ellenfelSor == 10 && ellenfelOszlop == 11) || (ellenfelSor == 10 && ellenfelOszlop == 12)) {
                ellenfelyKep = 380;
                ellenfelyIras = 456;
            }

            EgysegekNeEgymasra.holVagyKetto(elsoOEll, elsoSEll,egysegEllenfelEgy);
            EgysegekNeEgymasra.holVagyEgy(elsoOEll, elsoSEll,egysegEllenfelEgy);
            EgysegekNeEgymasra.neMenjenEgymasraVan(elsoOEll, elsoSEll,egysegEllenfelEgy);

            if (mehete) {
                mekkoraTavolsagod(egysegEllenfelEgy);
                egysegEletereje(egysegEllenfelEgy,ellenfelDbSzamElso);
                ellenfelEgysege.ellenfelEgysegKitetel1();
            }
            mehete=true;
        }
    }


    public static void ellenfelMasodikEgysegPoz() {

        do {
            ellenfelOszlop = 12;
            ellenfelSor = random.nextInt(10 - 1 + 1) + 1;

            masodikOEll=ellenfelOszlop;
            masodikSEll=ellenfelSor;
            masodikEllPoz=Integer.parseInt(String.valueOf(masodikSEll) + String.valueOf(masodikOEll));

        } while ((elsoOEll == masodikOEll && elsoSEll == masodikSEll));

        if (ellenfelIjaszSzam>0 || ellenfelFelderitoSzam>0) {

        if (lovage == 1) {
            ellenfelDbSzamMasodik = ellenfelIjaszSzam;
            ellenfelEgysegL2Kepe.setIcon(ellenfelIjaszTest);
            egysegEllenfelKetto="eijas";
        } else if (lovage == 0) {
            ellenfelDbSzamMasodik = ellenfelFelderitoSzam;
            ellenfelEgysegL2Kepe.setIcon(ellenfelFelderitoTest);
            egysegEllenfelKetto="efelder";
        }

            if (ellenfelOszlop == 11) {
                ellenfelxKep = 840;
                ellenfelxIras = 850;
            } else if (ellenfelOszlop == 12) {
                ellenfelxKep = 900;
                ellenfelxIras = 910;
            }

            if ((ellenfelSor == 1 && ellenfelOszlop == 11) || (ellenfelSor == 1 && ellenfelOszlop == 12)) {
                ellenfelyKep = 26;
                ellenfelyIras = 102;
            } else if ((ellenfelSor == 2 && ellenfelOszlop == 11) || (ellenfelSor == 2 && ellenfelOszlop == 12)) {
                ellenfelyKep = 65;
                ellenfelyIras = 140;
            } else if ((ellenfelSor == 3 && ellenfelOszlop == 11) || (ellenfelSor == 3 && ellenfelOszlop == 12)) {
                ellenfelyKep = 105;
                ellenfelyIras = 180;
            } else if ((ellenfelSor == 4 && ellenfelOszlop == 11) || (ellenfelSor == 4 && ellenfelOszlop == 12)) {
                ellenfelyKep = 144;
                ellenfelyIras = 219;
            } else if ((ellenfelSor == 5 && ellenfelOszlop == 11) || (ellenfelSor == 5 && ellenfelOszlop == 12)) {
                ellenfelyKep = 183;
                ellenfelyIras = 258;
            } else if ((ellenfelSor == 6 && ellenfelOszlop == 11) || (ellenfelSor == 6 && ellenfelOszlop == 12)) {
                ellenfelyKep = 222;
                ellenfelyIras = 297;
            } else if ((ellenfelSor == 7 && ellenfelOszlop == 11) || (ellenfelSor == 7 && ellenfelOszlop == 12)) {
                ellenfelyKep = 262;
                ellenfelyIras = 337;
            } else if ((ellenfelSor == 8 && ellenfelOszlop == 11) || (ellenfelSor == 8 && ellenfelOszlop == 12)) {
                ellenfelyKep = 302;
                ellenfelyIras = 377;
            } else if ((ellenfelSor == 9 && ellenfelOszlop == 11) || (ellenfelSor == 9 && ellenfelOszlop == 12)) {
                ellenfelyKep = 340;
                ellenfelyIras = 416;
            } else if ((ellenfelSor == 10 && ellenfelOszlop == 11) || (ellenfelSor == 10 && ellenfelOszlop == 12)) {
                ellenfelyKep = 380;
                ellenfelyIras = 456;
            }


            EgysegekNeEgymasra.holVagyKetto(masodikOEll, masodikSEll,egysegEllenfelKetto);
            EgysegekNeEgymasra.holVagyEgy(masodikOEll, masodikSEll,egysegEllenfelKetto);
            EgysegekNeEgymasra.neMenjenEgymasraVan(masodikOEll, masodikSEll,egysegEllenfelKetto);

            if (mehete) {
                mekkoraTavolsagod(egysegEllenfelKetto);
                egysegEletereje(egysegEllenfelKetto,ellenfelDbSzamMasodik);
                ellenfelEgysege.ellenfelEgysegKitetel2();
            }
            mehete=true;
        }
    }


    public static void ellenfelHarmadikEgysegPoz() {

        do {
            ellenfelOszlop = random.nextInt(12 - 11 + 1) + 11;
            ellenfelSor = random.nextInt(10 - 1 + 1) + 1;

            harmadikOEll=ellenfelOszlop;
            harmadikSEll=ellenfelSor;
            harmadikEllPoz=Integer.parseInt(String.valueOf(harmadikSEll) + String.valueOf(harmadikOEll));


        } while ((harmadikOEll== elsoOEll && harmadikSEll== elsoSEll) || ( harmadikOEll==masodikOEll && harmadikSEll==masodikSEll));

        if (ellenfelGriffSzam>0 || ellenfelMinotaurSzam>0) {

        if (lovage == 1) {
            ellenfelDbSzamHarmadik = ellenfelGriffSzam;
            ellenfelEgysegL3Kepe.setIcon(ellenfelGriffTest);
            egysegEllenfelHarom="egrif";
        } else if (lovage == 0) {
            ellenfelDbSzamHarmadik = ellenfelMinotaurSzam;
            ellenfelEgysegL3Kepe.setIcon(ellenfelMinotauroszTest);
            egysegEllenfelHarom="emino";
        }

            if (ellenfelOszlop == 11) {
                ellenfelxKep = 840;
                ellenfelxIras = 850;
            } else if (ellenfelOszlop == 12) {
                ellenfelxKep = 900;
                ellenfelxIras = 910;
            }

            if ((ellenfelSor == 1 && ellenfelOszlop == 11) || (ellenfelSor == 1 && ellenfelOszlop == 12)) {
                ellenfelyKep = 26;
                ellenfelyIras = 102;
            } else if ((ellenfelSor == 2 && ellenfelOszlop == 11) || (ellenfelSor == 2 && ellenfelOszlop == 12)) {
                ellenfelyKep = 65;
                ellenfelyIras = 140;
            } else if ((ellenfelSor == 3 && ellenfelOszlop == 11) || (ellenfelSor == 3 && ellenfelOszlop == 12)) {
                ellenfelyKep = 105;
                ellenfelyIras = 180;
            } else if ((ellenfelSor == 4 && ellenfelOszlop == 11) || (ellenfelSor == 4 && ellenfelOszlop == 12)) {
                ellenfelyKep = 144;
                ellenfelyIras = 219;
            } else if ((ellenfelSor == 5 && ellenfelOszlop == 11) || (ellenfelSor == 5 && ellenfelOszlop == 12)) {
                ellenfelyKep = 183;
                ellenfelyIras = 258;
            } else if ((ellenfelSor == 6 && ellenfelOszlop == 11) || (ellenfelSor == 6 && ellenfelOszlop == 12)) {
                ellenfelyKep = 222;
                ellenfelyIras = 297;
            } else if ((ellenfelSor == 7 && ellenfelOszlop == 11) || (ellenfelSor == 7 && ellenfelOszlop == 12)) {
                ellenfelyKep = 262;
                ellenfelyIras = 337;
            } else if ((ellenfelSor == 8 && ellenfelOszlop == 11) || (ellenfelSor == 8 && ellenfelOszlop == 12)) {
                ellenfelyKep = 302;
                ellenfelyIras = 377;
            } else if ((ellenfelSor == 9 && ellenfelOszlop == 11) || (ellenfelSor == 9 && ellenfelOszlop == 12)) {
                ellenfelyKep = 340;
                ellenfelyIras = 416;
            } else if ((ellenfelSor == 10 && ellenfelOszlop == 11) || (ellenfelSor == 10 && ellenfelOszlop == 12)) {
                ellenfelyKep = 380;
                ellenfelyIras = 456;
            }

            EgysegekNeEgymasra.holVagyKetto(harmadikOEll, harmadikSEll,egysegEllenfelHarom);
            EgysegekNeEgymasra.holVagyEgy(harmadikOEll, harmadikSEll,egysegEllenfelHarom);
            EgysegekNeEgymasra.neMenjenEgymasraVan(harmadikOEll, harmadikSEll,egysegEllenfelHarom);

            if (mehete) {
                mekkoraTavolsagod(egysegEllenfelHarom);
                egysegEletereje(egysegEllenfelHarom,ellenfelDbSzamHarmadik);
                ellenfelEgysege.ellenfelEgysegKitetel3();
            }
            mehete=true;
        }
    }


    public static void ellenfelNegyedikEgysegPoz() {

        do {
            ellenfelOszlop = random.nextInt(12 - 11 + 1) + 11;
            ellenfelSor = random.nextInt(10 - 1 + 1) + 1;

           negyedikOEll=ellenfelOszlop;
           negyedikSEll=ellenfelSor;
           negyedikEllPoz=Integer.parseInt(String.valueOf(negyedikSEll) + String.valueOf(negyedikOEll));

        } while ((negyedikOEll== elsoOEll && negyedikSEll== elsoSEll) || ( negyedikOEll==masodikOEll && negyedikSEll==masodikSEll )
                    || ( negyedikOEll==harmadikOEll && negyedikSEll==harmadikSEll));

        if (ellenfelFegyvernokSzam>0 || ellenfelOrgyilkosSzam>0) {

        if (lovage == 1) {
            ellenfelDbSzamNegyedik = ellenfelFegyvernokSzam;
            ellenfelEgysegL4Kepe.setIcon(ellenfelFegyvernokTest);
            egysegEllenfelNegy="efegyv";
        } else if (lovage == 0) {
            ellenfelDbSzamNegyedik = ellenfelOrgyilkosSzam;
            ellenfelEgysegL4Kepe.setIcon(ellenfelOrgyilkosTest);
            egysegEllenfelNegy="eorgy";
        }

            if (ellenfelOszlop == 11) {
                ellenfelxKep = 840;
                ellenfelxIras = 850;
            } else if (ellenfelOszlop == 12) {
                ellenfelxKep = 900;
                ellenfelxIras = 910;
            }

            if ((ellenfelSor == 1 && ellenfelOszlop == 11) || (ellenfelSor == 1 && ellenfelOszlop == 12)) {
                ellenfelyKep = 26;
                ellenfelyIras = 102;
            } else if ((ellenfelSor == 2 && ellenfelOszlop == 11) || (ellenfelSor == 2 && ellenfelOszlop == 12)) {
                ellenfelyKep = 65;
                ellenfelyIras = 140;
            } else if ((ellenfelSor == 3 && ellenfelOszlop == 11) || (ellenfelSor == 3 && ellenfelOszlop == 12)) {
                ellenfelyKep = 105;
                ellenfelyIras = 180;
            } else if ((ellenfelSor == 4 && ellenfelOszlop == 11) || (ellenfelSor == 4 && ellenfelOszlop == 12)) {
                ellenfelyKep = 144;
                ellenfelyIras = 219;
            } else if ((ellenfelSor == 5 && ellenfelOszlop == 11) || (ellenfelSor == 5 && ellenfelOszlop == 12)) {
                ellenfelyKep = 183;
                ellenfelyIras = 258;
            } else if ((ellenfelSor == 6 && ellenfelOszlop == 11) || (ellenfelSor == 6 && ellenfelOszlop == 12)) {
                ellenfelyKep = 222;
                ellenfelyIras = 297;
            } else if ((ellenfelSor == 7 && ellenfelOszlop == 11) || (ellenfelSor == 7 && ellenfelOszlop == 12)) {
                ellenfelyKep = 262;
                ellenfelyIras = 337;
            } else if ((ellenfelSor == 8 && ellenfelOszlop == 11) || (ellenfelSor == 8 && ellenfelOszlop == 12)) {
                ellenfelyKep = 302;
                ellenfelyIras = 377;
            } else if ((ellenfelSor == 9 && ellenfelOszlop == 11) || (ellenfelSor == 9 && ellenfelOszlop == 12)) {
                ellenfelyKep = 340;
                ellenfelyIras = 416;
            } else if ((ellenfelSor == 10 && ellenfelOszlop == 11) || (ellenfelSor == 10 && ellenfelOszlop == 12)) {
                ellenfelyKep = 380;
                ellenfelyIras = 456;
            }

            EgysegekNeEgymasra.holVagyKetto(negyedikOEll, negyedikSEll,egysegEllenfelNegy);
            EgysegekNeEgymasra.holVagyEgy(negyedikOEll, negyedikSEll,egysegEllenfelNegy);
            EgysegekNeEgymasra.neMenjenEgymasraVan(negyedikOEll, negyedikSEll,egysegEllenfelNegy);

            if (mehete) {
                mekkoraTavolsagod(egysegEllenfelNegy);
                egysegEletereje(egysegEllenfelNegy,ellenfelDbSzamNegyedik);
                ellenfelEgysege.ellenfelEgysegKitetel4();
            }
            mehete=true;
        }
    }


    public static void ellenfelOtodikEgysegPoz() {

        do {
            ellenfelOszlop = random.nextInt(12 - 11 + 1) + 11;
            ellenfelSor = random.nextInt(10 - 1 + 1) + 1;

            otodikOEll=ellenfelOszlop;
            otodikSEll=ellenfelSor;
            otodikEllPoz=Integer.parseInt(String.valueOf(otodikSEll) + String.valueOf(otodikOEll));

        } while ((otodikOEll== elsoOEll && otodikSEll== elsoSEll) || ( otodikOEll==masodikOEll && otodikSEll==masodikSEll )
                || ( otodikOEll==harmadikOEll && otodikSEll==harmadikSEll ) || ( otodikOEll==negyedikOEll && otodikSEll==negyedikSEll ));

        if (ellenfelHarcosPapSzam>0 || ellenfelRaptorLovasSzam>0) {

        if (lovage == 1) {
            ellenfelDbSzamOtodik = ellenfelHarcosPapSzam;
            ellenfelEgysegL5Kepe.setIcon(ellenfelHarcospapTest);
            egysegEllenfelOt="eharcp";
        } else if (lovage == 0) {
            ellenfelDbSzamOtodik = ellenfelRaptorLovasSzam;
            ellenfelEgysegL5Kepe.setIcon(ellenfelRaptorlovasTest);
            egysegEllenfelOt="erapt";
        }

            if (ellenfelOszlop == 11) {
                ellenfelxKep = 840;
                ellenfelxIras = 850;
            } else if (ellenfelOszlop == 12) {
                ellenfelxKep = 900;
                ellenfelxIras = 910;
            }

            if ((ellenfelSor == 1 && ellenfelOszlop == 11) || (ellenfelSor == 1 && ellenfelOszlop == 12)) {
                ellenfelyKep = 26;
                ellenfelyIras = 102;
            } else if ((ellenfelSor == 2 && ellenfelOszlop == 11) || (ellenfelSor == 2 && ellenfelOszlop == 12)) {
                ellenfelyKep = 65;
                ellenfelyIras = 140;
            } else if ((ellenfelSor == 3 && ellenfelOszlop == 11) || (ellenfelSor == 3 && ellenfelOszlop == 12)) {
                ellenfelyKep = 105;
                ellenfelyIras = 180;
            } else if ((ellenfelSor == 4 && ellenfelOszlop == 11) || (ellenfelSor == 4 && ellenfelOszlop == 12)) {
                ellenfelyKep = 144;
                ellenfelyIras = 219;
            } else if ((ellenfelSor == 5 && ellenfelOszlop == 11) || (ellenfelSor == 5 && ellenfelOszlop == 12)) {
                ellenfelyKep = 183;
                ellenfelyIras = 258;
            } else if ((ellenfelSor == 6 && ellenfelOszlop == 11) || (ellenfelSor == 6 && ellenfelOszlop == 12)) {
                ellenfelyKep = 222;
                ellenfelyIras = 297;
            } else if ((ellenfelSor == 7 && ellenfelOszlop == 11) || (ellenfelSor == 7 && ellenfelOszlop == 12)) {
                ellenfelyKep = 262;
                ellenfelyIras = 337;
            } else if ((ellenfelSor == 8 && ellenfelOszlop == 11) || (ellenfelSor == 8 && ellenfelOszlop == 12)) {
                ellenfelyKep = 302;
                ellenfelyIras = 377;
            } else if ((ellenfelSor == 9 && ellenfelOszlop == 11) || (ellenfelSor == 9 && ellenfelOszlop == 12)) {
                ellenfelyKep = 340;
                ellenfelyIras = 416;
            } else if ((ellenfelSor == 10 && ellenfelOszlop == 11) || (ellenfelSor == 10 && ellenfelOszlop == 12)) {
                ellenfelyKep = 380;
                ellenfelyIras = 456;
            }

            EgysegekNeEgymasra.holVagyKetto(otodikOEll, otodikSEll,egysegEllenfelOt);
            EgysegekNeEgymasra.holVagyEgy(otodikOEll, otodikSEll,egysegEllenfelOt);
            EgysegekNeEgymasra.neMenjenEgymasraVan(otodikOEll, otodikSEll,egysegEllenfelOt);

            if (mehete) {
                mekkoraTavolsagod(egysegEllenfelOt);
                egysegEletereje(egysegEllenfelOt,ellenfelDbSzamOtodik);
                ellenfelEgysege.ellenfelEgysegKitetel5();
            }
            mehete=true;
        }
    }
}
