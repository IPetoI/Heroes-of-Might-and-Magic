package Egysegek;

import Ellenfel.EllenfelTulajdonsaga;
import Hos.Tulajdonsagok.Szerencse;
import Hos.Tulajdonsagok.Tamadas;
import Hos.Tulajdonsagok.Varazsero;
import Hos.Tulajdonsagok.Vedekezes;
import Jatek.Visszatamadas;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static Egysegek.EgysegLetetel.*;
import static Ellenfel.EllenfelEgysegPozicio.*;
import static Ellenfel.EllenfelEgysege.*;
import static Jatek.JatekAblak.*;
import static Jatek.Palya_Lepes.*;
import static Jatek.Sorrend.*;
import static Jatek.Visszatamadas.*;
import static Jatek.XYKordinatakBemenet.*;
import static Varazslatok.IsteniEro.*;

public class Sebzes {

    public static int elsoEgysegSebzes=0,masodikEgysegSebzes=0,harmadikEgysegSebzes=0,negyedikEgysegSebzes=0,otodikEgysegSebzes=0;
    public static int elsoEllEgysegSebzes=0,masodikEllEgysegSebzes=0,harmadikEllEgysegSebzes=0,negyedikEllEgysegSebzes=0,otodikEllEgysegSebzes=0;

    public static int velemVagy1 =0, velemVagy2 =0, velemVagy3 =0, velemVagy4 =0;
    public static int ellenemVagy1S =0, ellenemVagy2S =0, ellenemVagy3S =0, ellenemVagy4S =0, ellenemVagy5S =0;
    public static int ellenemVagy1O =0, ellenemVagy2O =0, ellenemVagy3O =0, ellenemVagy4O =0, ellenemVagy5O =0;
    public static int velemVagydb=0,ellenemVagydb=0;

    public static boolean tamadhat=false;
    public static boolean tavolsagi=false;

    public static String kitTamad="n";

    public static Random random = new Random();

    public static int sebzes=0;
    public static int halottEgysegSzam=0;

    public static double hosVarazs=0, ellHosVarazs=0;

    public static boolean vanKrit;

    public static void egysegSebzese(String egyseg) {

        switch (egyseg) {
            case "ecsont" -> elsoEllEgysegSebzes = random.nextInt(2 - 1 + 1) + 1;
            case "efoldmuv" -> elsoEllEgysegSebzes = 1;
            case "efelder" -> masodikEllEgysegSebzes = random.nextInt(4 - 1 + 1) + 1;
            case "emino" -> harmadikEllEgysegSebzes = random.nextInt(11 - 5 + 1) + 5;
            case "eorgy" -> negyedikEllEgysegSebzes = random.nextInt(18 - 6 + 1) + 6;
            case "erapt" -> otodikEllEgysegSebzes = random.nextInt(5 - 2 + 1) + 2;
            case "eijas" -> masodikEllEgysegSebzes = random.nextInt(4 - 2 + 1) + 2;
            case "egrif" -> harmadikEllEgysegSebzes = random.nextInt(10 - 5 + 1) + 5;
            case "efegyv" -> negyedikEllEgysegSebzes = random.nextInt(5 - 2 + 1) + 2;
            case "eharcp" -> otodikEllEgysegSebzes = random.nextInt(12 - 9 + 1) + 9;
            case "csont" -> elsoEgysegSebzes = random.nextInt(2 - 1 + 1) + 1;
            case "foldmuv" -> elsoEgysegSebzes = 1;
            case "felder" -> masodikEgysegSebzes = random.nextInt(4 - 1 + 1) + 1;
            case "mino" -> harmadikEgysegSebzes = random.nextInt(11 - 5 + 1) + 5;
            case "orgy" -> negyedikEgysegSebzes = random.nextInt(18 - 6 + 1) + 6;
            case "rapt" -> otodikEgysegSebzes = random.nextInt(5 - 2 + 1) + 2;
            case "ijas" -> masodikEgysegSebzes = random.nextInt(4 - 2 + 1) + 2;
            case "grif" -> harmadikEgysegSebzes = random.nextInt(10 - 5 + 1) + 5;
            case "fegyv" -> negyedikEgysegSebzes = random.nextInt(5 - 2 + 1) + 2;
            case "harcp" -> otodikEgysegSebzes = random.nextInt(12 - 9 + 1) + 9;
        }


        System.out.println("---- >"+harmadikEllEgysegSebzes);

        double hosVarazslas = Varazsero.varazseroErtek;
        double ellenfelHosVarazslas = EllenfelTulajdonsaga.ellenfelVarazsero;
        int atado=0;
        hosVarazs = 1 + hosVarazslas / 10;
        ellHosVarazs = 1 + ellenfelHosVarazslas / 10;

        if (egyseg.equals("ecsont") && elsoEllEgysegIsteniero) {
            atado= (int) Math.round(elsoEllEgysegSebzes * ellHosVarazs);
            elsoEllEgysegSebzes=atado;
        }else if (egyseg.equals("efoldmuv") && elsoEllEgysegIsteniero) {
            atado= (int) Math.round(elsoEllEgysegSebzes * ellHosVarazs);
            elsoEllEgysegSebzes=atado;
        }else if (egyseg.equals("efelder") && masodikEllEgysegIsteniero) {
            atado= (int) Math.round(masodikEllEgysegSebzes * ellHosVarazs);
            masodikEllEgysegSebzes =atado;
        }else if (egyseg.equals("eijas") && masodikEllEgysegIsteniero) {
            atado= (int) Math.round(masodikEllEgysegSebzes * ellHosVarazs);
            masodikEllEgysegSebzes =atado;
        }else if (egyseg.equals("emino") && harmadikEllEgysegIsteniero) {
            atado= (int) Math.round(harmadikEllEgysegSebzes * ellHosVarazs);
            harmadikEllEgysegSebzes =atado;
        }else if (egyseg.equals("egrif") && harmadikEllEgysegIsteniero) {
            atado= (int) Math.round(harmadikEllEgysegSebzes * ellHosVarazs);
            harmadikEllEgysegSebzes =atado;
        }else if (egyseg.equals("eorgy") && negyedikEllEgysegIsteniero) {
            atado= (int) Math.round(negyedikEllEgysegSebzes * ellHosVarazs);
            negyedikEllEgysegSebzes =atado;
        }else if (egyseg.equals("efegyv") && negyedikEllEgysegIsteniero) {
            atado= (int) Math.round(negyedikEllEgysegSebzes * ellHosVarazs);
            negyedikEllEgysegSebzes =atado;
        }else if (egyseg.equals("eharcp") && otodikEllEgysegIsteniero) {
            atado= (int) Math.round(otodikEllEgysegSebzes * ellHosVarazs);
            otodikEllEgysegSebzes =atado;
        }else if (egyseg.equals("erapt") && otodikEllEgysegIsteniero) {
            atado= (int) Math.round(otodikEllEgysegSebzes * ellHosVarazs);
        
            otodikEllEgysegSebzes =atado;
        }else if (egyseg.equals("foldmuv") && elsoEgysegIsteniero) {
            atado= (int) Math.round(elsoEgysegSebzes * hosVarazs);
            elsoEgysegSebzes =atado;
        }else if (egyseg.equals("csont") && elsoEgysegIsteniero) {
            atado= (int) Math.round(elsoEgysegSebzes * hosVarazs);
            elsoEgysegSebzes =atado;
        }else if (egyseg.equals("ijas") && masodikEgysegIsteniero) {
            atado= (int) Math.round(masodikEgysegSebzes * hosVarazs);
            masodikEgysegSebzes =atado;
        }else if (egyseg.equals("felder") && masodikEgysegIsteniero) {
            atado= (int) Math.round(masodikEgysegSebzes * hosVarazs);
            masodikEgysegSebzes =atado;
        }else if (egyseg.equals("grif") && harmadikEgysegIsteniero) {
            atado= (int) Math.round(harmadikEgysegSebzes * hosVarazs);
            harmadikEgysegSebzes =atado;
        }else if (egyseg.equals("mino") && harmadikEgysegIsteniero) {
            atado= (int) Math.round(harmadikEgysegSebzes * hosVarazs);
            harmadikEgysegSebzes =atado;
        }else if (egyseg.equals("orgy") && negyedikEgysegIsteniero) {
            atado= (int) Math.round(negyedikEgysegSebzes * hosVarazs);
            negyedikEgysegSebzes =atado;
        }else if (egyseg.equals("fegyv") && negyedikEgysegIsteniero) {
            atado= (int) Math.round(negyedikEgysegSebzes * hosVarazs);
            negyedikEgysegSebzes =atado;
        }else if (egyseg.equals("harcp") && otodikEgysegIsteniero) {
            atado= (int) Math.round(otodikEgysegSebzes * hosVarazs);
            otodikEgysegSebzes=atado;
        }else if (egyseg.equals("rapt") && otodikEgysegIsteniero) {
            atado= (int) Math.round(otodikEgysegSebzes * hosVarazs);
            otodikEgysegSebzes =atado;
        }

        System.out.println("---- >"+harmadikEllEgysegSebzes);
    }

    public static void sebzesKiszamitasaEgyseg(String tamado,String kit) {

        double ellenfelHosVedekezes = EllenfelTulajdonsaga.ellenfelVedekezese;
        double hosVedekezes = Vedekezes.vedekezesErtek;
        double hosTamadas = Tamadas.tamadasErtek;
        double ellenfelHosTamadas = EllenfelTulajdonsaga.ellenfelTamadasa;
        double hosTamadasa = 1 + hosTamadas / 100;
        double ellenfelHosTamadasa = 1 + ellenfelHosTamadas / 100;
        double ellenfelHosVedekezese = 1-ellenfelHosVedekezes / 100;
        double hosVedekezese = 1-hosVedekezes / 100;
        double egysegAlapSebzes=0;
        double egysegDB=0;
        int krit = random.nextInt(100 + 1);
        sebzes=0;
        boolean ellenfelCsapat=false;

        int orgyKiteres = random.nextInt(100 + 1);
        boolean vanOrgyKiteres = false;

        switch (tamado) {
            case "ecsont", "efoldmuv" -> {
                egysegAlapSebzes = elsoEllEgysegSebzes;
                egysegDB = ellenfelDbSzamElso;
                ellenfelCsapat=true;
            }
            case "efelder", "eijas" -> {
                egysegAlapSebzes = masodikEllEgysegSebzes;
                egysegDB = ellenfelDbSzamMasodik;
                ellenfelCsapat=true;
            }
            case "emino", "egrif" -> {
                egysegAlapSebzes = harmadikEllEgysegSebzes;
                egysegDB = ellenfelDbSzamHarmadik;
                ellenfelCsapat=true;
            }
            case "eorgy", "efegyv" -> {
                egysegAlapSebzes = negyedikEllEgysegSebzes;
                egysegDB = ellenfelDbSzamNegyedik;
                ellenfelCsapat=true;
            }
            case "erapt", "eharcp" -> {
                egysegAlapSebzes = otodikEllEgysegSebzes;
                egysegDB = ellenfelDbSzamOtodik;
                ellenfelCsapat=true;
            }
            case "csont", "foldmuv" -> {
                egysegAlapSebzes = elsoEgysegSebzes;
                egysegDB = dbSzamElso;
                ellenfelCsapat=false;
            }
            case "felder", "ijas" -> {
                egysegAlapSebzes = masodikEgysegSebzes;
                egysegDB = dbSzamMasodik;
                ellenfelCsapat=false;
            }
            case "mino", "grif" -> {
                egysegAlapSebzes = harmadikEgysegSebzes;
                egysegDB = dbSzamHarmadik;
                ellenfelCsapat=false;
            }
            case "orgy", "fegyv" -> {
                egysegAlapSebzes = negyedikEgysegSebzes;
                egysegDB = dbSzamNegyedik;
                ellenfelCsapat=false;
            }
            case "rapt", "harcp" -> {
                egysegAlapSebzes = otodikEgysegSebzes;
                egysegDB = dbSzamOtodik;
                ellenfelCsapat=false;
            }
        }

        if (kit.equals("orgy") || kit.equals("eorgy") ) {
            vanOrgyKiteres = orgyKiteres <= 20;
        }

        vanKrit = krit <= Szerencse.szerencseErtek;

        if (!ellenfelCsapat && !vanOrgyKiteres && !kit.equals("efegyv")) {
            if (vanKrit) {
                sebzes = (int) Math.round(((hosTamadasa * (egysegAlapSebzes * Math.ceil(egysegDB))) * ellenfelHosVedekezese) * 2);
                System.out.println("Kritikus tamadas! "+sebzes + " a sebzes");
                informacioErtek.setText("Kritikus támadás! "+sebzes + " a sebzés.");
            } else {
               sebzes = (int) Math.round(((hosTamadasa * (egysegAlapSebzes * Math.ceil(egysegDB))) * ellenfelHosVedekezese));
                System.out.println(sebzes + " a sebzes");
                informacioErtek.setText(sebzes + " a sebzés.");
            }
        }else if (!ellenfelCsapat && vanOrgyKiteres && kit.equals("eorgy")){
            System.out.println("Orgyilkos kitert");
            System.out.println(sebzes + " lett volna a sebzes");
            informacioErtek.setText("Orgyilkos kitért! "+sebzes + "lett volna a sebzés.");
        }else if (!ellenfelCsapat && kit.equals("efegyv")) {
            System.out.println("ez egy fegyvernok, csak 60%-ban sebzodik");
            informacioErtek.setText("Ez egy fegyvernok, csak 60%-ban sebződik.");
            if (vanKrit) {
                sebzes = (int) Math.round((((hosTamadasa * (egysegAlapSebzes * Math.ceil(egysegDB))) * ellenfelHosVedekezese) * 2)*0.6);
                System.out.println("Kritikus tamadas! "+sebzes + " a sebzes, fegyv");
                informacioErtek.setText("Kritikus támadás! "+sebzes + " a sebzés.");
            } else {
                sebzes = (int) Math.round((((hosTamadasa * (egysegAlapSebzes * Math.ceil(egysegDB))) * ellenfelHosVedekezese))*0.6);
                System.out.println(sebzes + " a sebzes");
                informacioErtek.setText(sebzes + " a sebzés.");
            }
        }

        if (ellenfelCsapat && !vanOrgyKiteres && !kit.equals("fegyv")) {
            if (vanKrit) {
                sebzes = (int) Math.round(((ellenfelHosTamadasa * (egysegAlapSebzes * Math.ceil(egysegDB))) * hosVedekezese) * 2);
                System.out.println("Kritikus tamadas! "+sebzes + " a sebzes");
                informacioErtek.setText("Kritikus támadás! "+sebzes + " a sebzés.");
            } else {
                sebzes = (int) Math.round(((ellenfelHosTamadasa * (egysegAlapSebzes * Math.ceil(egysegDB))) * hosVedekezese));
                System.out.println(sebzes + " a sebzes");
                informacioErtek.setText(sebzes + " a sebzés.");
            }
        }else if (ellenfelCsapat && vanOrgyKiteres && kit.equals("orgy")){
            System.out.println("Orgyilkos kitert");
            System.out.println(sebzes + " lett volna a sebzes");
            informacioErtek.setText("Orgyilkos kitért! "+sebzes + "lett volna a sebzés.");
        }else if (ellenfelCsapat && kit.equals("fegyv")) {
            System.out.println("ez egy fegyvernok, csak 60%-ban sebzodik");
            informacioErtek.setText("Ez egy fegyvernok, csak 60%-ban sebződik.");
            if (vanKrit) {
                sebzes = (int) Math.round((((ellenfelHosTamadasa * (egysegAlapSebzes * Math.ceil(egysegDB))) * hosVedekezese) * 2)*0.6);
                System.out.println("Kritikus tamadas! "+sebzes + " a sebzes");
                informacioErtek.setText("Kritikus támadás! "+sebzes + " a sebzés.");
            } else {
                sebzes = (int) Math.round((((ellenfelHosTamadasa * (egysegAlapSebzes * Math.ceil(egysegDB))) * hosVedekezese))*0.6);
                System.out.println(sebzes + " a sebzes");
                informacioErtek.setText(sebzes + " a sebzés.");
            }
        }
    }


    public static void ellenfelek(String egyseg) {
        int sor=0;
        int oszlop;
        velemVagydb=0;
        velemVagy1 =-2;
        velemVagy2 =-2;
        velemVagy3 =-2;
        velemVagy4 =-2;
        ellenemVagydb=0;
        ellenemVagy1S =-2;
        ellenemVagy2S =-2;
        ellenemVagy3S =-2;
        ellenemVagy4S =-2;
        ellenemVagy5S =-2;
        ellenemVagy1O =-2;
        ellenemVagy2O =-2;
        ellenemVagy3O =-2;
        ellenemVagy4O =-2;
        ellenemVagy5O =-2;

        for (int i=0;i<10;i++) {
            sor++;

            oszlop=0;
            for (int j=0;j<12;j++) {
                oszlop++;

                if (oszlop== regiPozOszlop && sor==regiPozSor) {
                    continue;
                }

        if (sor == 10 && oszlop == 1 && sor10oszlop1 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy(sor10oszlop1Nev,10,1);
        } else if (sor == 10 && oszlop == 2 && sor10oszlop2 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy(sor10oszlop2Nev,10,2);
        } else if (sor == 9 && oszlop == 1 && sor9oszlop1 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor9oszlop1Nev,9,1);
        } else if (sor == 9 && oszlop == 2 && sor9oszlop2 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor9oszlop2Nev,9,2);
        } else if (sor == 8 && oszlop == 1 && sor8oszlop1 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor8oszlop1Nev,8,1);
        } else if (sor == 8 && oszlop == 2 && sor8oszlop2 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor8oszlop2Nev,8,2);
        } else if (sor == 7 && oszlop == 1 && sor7oszlop1 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor7oszlop1Nev,7,1);
        } else if (sor == 7 && oszlop == 2 && sor7oszlop2 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor7oszlop2Nev,7,2);
        } else if (sor == 6 && oszlop == 1 && sor6oszlop1 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor6oszlop1Nev,6,1);
        } else if (sor == 6 && oszlop == 2 && sor6oszlop2 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor6oszlop2Nev,6,2);
        } else if (sor == 5 && oszlop == 1 && sor5oszlop1 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor5oszlop1Nev,5,1);
        } else if (sor == 5 && oszlop == 2 && sor5oszlop2 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor5oszlop2Nev,5,2);
        } else if (sor == 4 && oszlop == 1 && sor4oszlop1 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor4oszlop1Nev,4,1);
        } else if (sor == 4 && oszlop == 2 && sor4oszlop2 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor4oszlop2Nev,4,2);
        } else if (sor == 3 && oszlop == 1 && sor3oszlop1 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor3oszlop1Nev,3,1);
        } else if (sor == 3 && oszlop == 2 && sor3oszlop2 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor3oszlop2Nev,3,2);
        } else if (sor == 2 && oszlop == 1 && sor2oszlop1 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor2oszlop1Nev,2,1);
        } else if (sor == 2 && oszlop == 2 && sor2oszlop2 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor2oszlop2Nev,2,2);
        } else if (sor == 1 && oszlop == 1 && sor1oszlop1 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor1oszlop1Nev,1,1);
        } else if (sor == 1 && oszlop == 2 && sor1oszlop2 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor1oszlop2Nev,1,2);
        } else if (sor == 8 && oszlop == 3 && sor8oszlop3 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor8oszlop3Nev,8,3);
        } else if (sor == 7 && oszlop == 3 && sor7oszlop3 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor7oszlop3Nev,7,3);
        } else if (sor == 6 && oszlop == 3 && sor6oszlop3 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor6oszlop3Nev,6,3);
        } else if (sor == 5 && oszlop == 3 && sor5oszlop3 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor5oszlop3Nev,5,3);
        } else if (sor == 4 && oszlop == 3 && sor4oszlop3 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor4oszlop3Nev,4,3);
        } else if (sor == 3 && oszlop == 3 && sor3oszlop3 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor3oszlop3Nev,3,3);
        } else if (sor == 2 && oszlop == 3 && sor2oszlop3 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor2oszlop3Nev,2,3);
        } else if (sor == 1 && oszlop == 3 && sor1oszlop3 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor1oszlop3Nev,1,3);
        } else if (sor == 8 && oszlop == 4 && sor8oszlop4 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor8oszlop4Nev,8,4);
        } else if (sor == 7 && oszlop == 4 && sor7oszlop4 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor7oszlop4Nev,7,4);
        } else if (sor == 5 && oszlop == 4 && sor5oszlop4 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor5oszlop4Nev,5,4);
        } else if (sor == 4 && oszlop == 4 && sor4oszlop4 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor4oszlop4Nev,4,4);
        } else if (sor == 3 && oszlop == 4 && sor3oszlop4 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor3oszlop4Nev,3,4);
        } else if (sor == 2 && oszlop == 4 && sor2oszlop4 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor2oszlop4Nev,2,4);
        } else if (sor == 1 && oszlop == 4 && sor1oszlop4 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor1oszlop4Nev,1,4);
        } else if (sor == 10 && oszlop == 5 && sor10oszlop5 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy(sor10oszlop5Nev,10,5);
        } else if (sor == 9 && oszlop == 5 && sor9oszlop5 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor9oszlop5Nev,9,5);
        } else if (sor == 8 && oszlop == 5 && sor8oszlop5 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor8oszlop5Nev,8,5);
        } else if (sor == 7 && oszlop == 5 && sor7oszlop5 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor7oszlop5Nev,7,5);
        } else if (sor == 6 && oszlop == 5 && sor6oszlop5 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor6oszlop5Nev,6,5);
        } else if (sor == 5 && oszlop == 5 && sor5oszlop5 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor5oszlop5Nev,5,5);
        } else if (sor == 4 && oszlop == 5 && sor4oszlop5 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor4oszlop5Nev,4,5);
        } else if (sor == 3 && oszlop == 5 && sor3oszlop5 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor3oszlop5Nev,3,5);
        } else if (sor == 2 && oszlop == 5 && sor2oszlop5 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor2oszlop5Nev,2,5);
        } else if (sor == 1 && oszlop == 5 && sor1oszlop5 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor1oszlop5Nev,1,5);
        } else if (sor == 10 && oszlop == 6 && sor10oszlop6 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy(sor10oszlop6Nev,10,6);
        } else if (sor == 9 && oszlop == 6 && sor9oszlop6 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor9oszlop6Nev,9,6);
        } else if (sor == 7 && oszlop == 6 && sor7oszlop6 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor7oszlop6Nev,7,6);
        } else if (sor == 6 && oszlop == 6 && sor6oszlop6 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor6oszlop6Nev,6,6);
        } else if (sor == 5 && oszlop == 6 && sor5oszlop6 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor5oszlop6Nev,5,6);
        } else if (sor == 4 && oszlop == 6 && sor4oszlop6 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor4oszlop6Nev,4,6);
        } else if (sor == 3 && oszlop == 6 && sor3oszlop6 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor3oszlop6Nev,3,6);
        } else if (sor == 2 && oszlop == 6 && sor2oszlop6 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor2oszlop6Nev,2,6);
        } else if (sor == 1 && oszlop == 6 && sor1oszlop6 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor1oszlop6Nev,1,6);
        } else if (sor == 10 && oszlop == 7 && sor10oszlop7 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy(sor10oszlop7Nev,10,7);
        } else if (sor == 9 && oszlop == 7 && sor9oszlop7 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor9oszlop7Nev,9,7);
        } else if (sor == 7 && oszlop == 7 && sor7oszlop7 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor7oszlop7Nev,7,7);
        } else if (sor == 6 && oszlop == 7 && sor6oszlop7 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor6oszlop7Nev,6,7);
        } else if (sor == 5 && oszlop == 7 && sor5oszlop7 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor5oszlop7Nev,5,7);
        } else if (sor == 4 && oszlop == 7 && sor4oszlop7 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor4oszlop7Nev,4,7);
        } else if (sor == 3 && oszlop == 7 && sor3oszlop7 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor3oszlop7Nev,3,7);
        } else if (sor == 2 && oszlop == 7 && sor2oszlop7 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor2oszlop7Nev,2,7);
        } else if (sor == 1 && oszlop == 7 && sor1oszlop7 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor1oszlop7Nev,1,7);
        } else if (sor == 10 && oszlop == 8 && sor10oszlop8 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy(sor10oszlop8Nev,10,8);
        } else if (sor == 9 && oszlop == 8 && sor9oszlop8 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor9oszlop8Nev,9,8);
        } else if (sor == 8 && oszlop == 8 && sor8oszlop8 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor8oszlop8Nev,8,8);
        } else if (sor == 6 && oszlop == 8 && sor6oszlop8 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor6oszlop8Nev,6,8);
        } else if (sor == 5 && oszlop == 8 && sor5oszlop8 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor5oszlop8Nev,5,8);
        } else if (sor == 4 && oszlop == 8 && sor4oszlop8 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor4oszlop8Nev,4,8);
        } else if (sor == 3 && oszlop == 8 && sor3oszlop8 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor3oszlop8Nev,3,8);
        } else if (sor == 2 && oszlop == 8 && sor2oszlop8 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor2oszlop8Nev,2,8);
        } else if (sor == 1 && oszlop == 8 && sor1oszlop8 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor1oszlop8Nev,1,8);
        } else if (sor == 10 && oszlop == 9 && sor10oszlop9 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy(sor10oszlop9Nev,10,9);
        } else if (sor == 9 && oszlop == 9 && sor9oszlop9 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor9oszlop9Nev,9,9);
        } else if (sor == 8 && oszlop == 9 && sor8oszlop9 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor8oszlop9Nev,8,9);
        } else if (sor == 6 && oszlop == 9 && sor6oszlop9 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor6oszlop9Nev,6,9);
        } else if (sor == 5 && oszlop == 9 && sor5oszlop9 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor5oszlop9Nev,5,9);
        } else if (sor == 4 && oszlop == 9 && sor4oszlop9 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor4oszlop9Nev,4,9);
        } else if (sor == 3 && oszlop == 9 && sor3oszlop9 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor3oszlop9Nev,3,9);
        } else if (sor == 2 && oszlop == 9 && sor2oszlop9 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor2oszlop9Nev,2,9);
        } else if (sor == 1 && oszlop == 9 && sor1oszlop9 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy( sor1oszlop9Nev,1,9);
        } else if (sor == 10 && oszlop == 10 && sor10oszlop10 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy(sor10oszlop10Nev,10,10);
        } else if (sor == 9 && oszlop == 10 && sor9oszlop10 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy(sor9oszlop10Nev,9,10);
        } else if (sor == 8 && oszlop == 10 && sor8oszlop10 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy(sor8oszlop10Nev,8,10);
        } else if (sor == 7 && oszlop == 10 && sor7oszlop10 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy(sor7oszlop10Nev,7,10);
        } else if (sor == 6 && oszlop == 10 && sor6oszlop10 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy(sor6oszlop10Nev,6,10);
        } else if (sor == 5 && oszlop == 10 && sor5oszlop10 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy(sor5oszlop10Nev,5,10);
        } else if (sor == 4 && oszlop == 10 && sor4oszlop10 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy(sor4oszlop10Nev,4,10);
        } else if (sor == 3 && oszlop == 10 && sor3oszlop10 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy(sor3oszlop10Nev,3,10);
        } else if (sor == 2 && oszlop == 10 && sor2oszlop10 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy(sor2oszlop10Nev,2,10);
        } else if (sor == 1 && oszlop == 10 && sor1oszlop10 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy(sor1oszlop10Nev,1,10);
        } else if (sor == 10 && oszlop == 11 && sor10oszlop11 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy(sor10oszlop11Nev,10,11);
        } else if (sor == 9 && oszlop == 11 && sor9oszlop11 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy(sor9oszlop11Nev,9,11);
        } else if (sor == 8 && oszlop == 11 && sor8oszlop11 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy(sor8oszlop11Nev,8,11);
        } else if (sor == 7 && oszlop == 11 && sor7oszlop11 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy(sor7oszlop11Nev,7,11);
        } else if (sor == 6 && oszlop == 11 && sor6oszlop11 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy(sor6oszlop11Nev,6,11);
        } else if (sor == 5 && oszlop == 11 && sor5oszlop11 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy(sor5oszlop11Nev,5,11);
        } else if (sor == 4 && oszlop == 11 && sor4oszlop11 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy(sor4oszlop11Nev,4,11);
        } else if (sor == 3 && oszlop == 11 && sor3oszlop11 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy(sor3oszlop11Nev,3,11);
        } else if (sor == 2 && oszlop == 11 && sor2oszlop11 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy(sor2oszlop11Nev,2,11);
        } else if (sor == 1 && oszlop == 11 && sor1oszlop11 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy(sor1oszlop11Nev,1,11);
        } else if (sor == 10 && oszlop == 12 && sor10oszlop12 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy(sor10oszlop12Nev,10,12);
        } else if (sor == 9 && oszlop == 12 && sor9oszlop12 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy(sor9oszlop12Nev,9,12);
        } else if (sor == 8 && oszlop == 12 && sor8oszlop12 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy(sor8oszlop12Nev,8,12);
        } else if (sor == 7 && oszlop == 12 && sor7oszlop12 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy(sor7oszlop12Nev,7,12);
        } else if (sor == 6 && oszlop == 12 && sor6oszlop12 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy(sor6oszlop12Nev,6,12);
        } else if (sor == 5 && oszlop == 12 && sor5oszlop12 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy(sor5oszlop12Nev,5,12);
        } else if (sor == 4 && oszlop == 12 && sor4oszlop12 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy(sor4oszlop12Nev,4,12);
        } else if (sor == 3 && oszlop == 12 && sor3oszlop12 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy(sor3oszlop12Nev,3,12);
        } else if (sor == 2 && oszlop == 12 && sor2oszlop12 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy(sor2oszlop12Nev,2,12);
        } else if (sor == 1 && oszlop == 12 && sor1oszlop12 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            velemVagy(sor1oszlop12Nev,1,12);
        }
            }
        }
    }

    public static void velemVagy(String egyseg, int sor, int oszlop) {

        kitTamad=egyseg;

        if (elsoHely.charAt(0)=='e') {
            if (egyseg.charAt(0)=='e') {
                velemVagydb++;

                if (velemVagydb==1) {
                    velemVagy1= Integer.parseInt(String.valueOf(sor) + String.valueOf(oszlop));
                }else if (velemVagydb==2) {
                    velemVagy2=Integer.parseInt(String.valueOf(sor) + String.valueOf(oszlop));
                }else if (velemVagydb==3) {
                    velemVagy3=Integer.parseInt(String.valueOf(sor) + String.valueOf(oszlop));
                }else if (velemVagydb==4) {
                    velemVagy4=Integer.parseInt(String.valueOf(sor) + String.valueOf(oszlop));
                }
            }else {
                ellenemVagydb++;

                if (ellenemVagydb==1) {
                    ellenemVagy1S=sor;
                    ellenemVagy1O=oszlop;
                }else if (ellenemVagydb==2) {
                    ellenemVagy2S=sor;
                    ellenemVagy2O=oszlop;
                }else if (ellenemVagydb==3) {
                    ellenemVagy3S=sor;
                    ellenemVagy3O=oszlop;
                }else if (ellenemVagydb==4) {
                    ellenemVagy4S=sor;
                    ellenemVagy4O=oszlop;
                }else if (ellenemVagydb==5) {
                    ellenemVagy5S=sor;
                    ellenemVagy5O=oszlop;
                }
                tamadasSzurkites(sor,oszlop);
            }
        }else {
            if (egyseg.charAt(0)=='e') {
                ellenemVagydb++;

                if (ellenemVagydb==1) {
                    ellenemVagy1S=sor;
                    ellenemVagy1O=oszlop;
                }else if (ellenemVagydb==2) {
                    ellenemVagy2S=sor;
                    ellenemVagy2O=oszlop;
                }else if (ellenemVagydb==3) {
                    ellenemVagy3S=sor;
                    ellenemVagy3O=oszlop;
                }else if (ellenemVagydb==4) {
                    ellenemVagy4S=sor;
                    ellenemVagy4O=oszlop;
                }else if (ellenemVagydb==5) {
                    ellenemVagy5S=sor;
                    ellenemVagy5O=oszlop;
                }
                tamadasSzurkites(sor,oszlop);
            }else {
                velemVagydb++;

                if (velemVagydb==1) {
                    velemVagy1= Integer.parseInt(String.valueOf(sor) + String.valueOf(oszlop));
                }else if (velemVagydb==2) {
                    velemVagy2=Integer.parseInt(String.valueOf(sor) + String.valueOf(oszlop));
                }else if (velemVagydb==3) {
                    velemVagy3=Integer.parseInt(String.valueOf(sor) + String.valueOf(oszlop));
                }else if (velemVagydb==4) {
                    velemVagy4=Integer.parseInt(String.valueOf(sor) + String.valueOf(oszlop));
                }
            }
        }
    }

    public static void harcpTavKoz() {

        if (elsoHely.equals("harcp") || elsoHely.equals("eharcp")) {
            int harcpOszlop, harcpSor,harcpRasegites=0;

            for (int i=-1;i<=1;i++) {
                for (int j = -1; j <= 1; j++) {
                    harcpSor = regiPozSor + i;
                    harcpOszlop = regiPozOszlop + j;
                    if ((harcpSor==ellenemVagy1S && harcpOszlop==ellenemVagy1O) || (harcpSor==ellenemVagy2S
                            && harcpOszlop==ellenemVagy2O) || (harcpSor==ellenemVagy3S && harcpOszlop==ellenemVagy3O)
                            || (harcpSor==ellenemVagy4S && harcpOszlop==ellenemVagy4O)
                            || (harcpSor==ellenemVagy5S && harcpOszlop==ellenemVagy5O)) {
                        harcpRasegites++;
                    }
                }
            }
            if (harcpRasegites>0) {
                System.out.println("Ellenfel van a harcp mellett, ezert nem lovesz");
                tavolsagi=false;
            }else {
                System.out.println("Nincs ellenfel a harcp mellett, ezert lovesz");
                tavolsagi=true;
            }
        }
    }

    public static void tudETamadni(int sor, int oszlop) {

        tamadhat=false;
        tavolsagi=false;

        if (elsoHely.equals("ijas") || elsoHely.equals("eijas") || elsoHely.equals("felder") || elsoHely.equals("efelder")) {
            tavolsagi=true;
        }

        harcpTavKoz();

        if (tavolsagi) {

            int megnezendoSor;
            int megnezendoOszlop;
            int rasegites=0;

            for (int i=-1;i<=1;i++) {
                for (int j=-1;j<=1;j++) {
                    megnezendoSor = regiPozSor + i;
                    megnezendoOszlop = regiPozOszlop+j;
                        if ((megnezendoSor==ellenemVagy1S && megnezendoOszlop==ellenemVagy1O) || (megnezendoSor==ellenemVagy2S
                                && megnezendoOszlop==ellenemVagy2O) || (megnezendoSor==ellenemVagy3S && megnezendoOszlop==ellenemVagy3O)
                                || (megnezendoSor==ellenemVagy4S && megnezendoOszlop==ellenemVagy4O)
                                || (megnezendoSor==ellenemVagy5S && megnezendoOszlop==ellenemVagy5O)) {
                            rasegites++;
                        }
                }
            }
            if (rasegites>0) {
                System.out.println("Tamadas nem lehetseges mert ellenfel van a lovesz mellett");
                informacioErtek.setText("Támadás nem lehetséges mert ellenfél van a lövész mellett.");
                tamadhat=false;
            }else {
                System.out.println("Loves");
                informacioErtek.setText("Lövés.");
                tamadhat=true;
            }
        }else if (!tavolsagi) {

            int megnezendoSor;
            int megnezendoOszlop;
            int rasegites=0;

            for (int i=-1;i<=1;i++) {
                for (int j=-1;j<=1;j++) {
                    megnezendoSor = regiPozSor + i;
                    megnezendoOszlop = regiPozOszlop+j;
                    if (megnezendoSor==sor && megnezendoOszlop==oszlop) {
                        rasegites++;
                    }
                }
            }
            if (rasegites>0) {
                System.out.println("A kozelben van az ellenfel");
                informacioErtek.setText("A közelben van az ellenfél.");
                tamadhat=true;
            }else {
                System.out.println("Tul messze van az ellenfel");
                informacioErtek.setText("Túl messze van az ellenfél.");
                tamadhat=false;
            }
        }
    }

    public static void megtamadlak(int sor,int oszlop) {

        tudETamadni(sor,oszlop);

        int poz=Integer.parseInt(String.valueOf(sor) + String.valueOf(oszlop));

        boolean nemVelemVagy =poz!= velemVagy1 && poz!= velemVagy2 &&
                poz!= velemVagy3 && poz!= velemVagy4 && jelenlegiEgysegPOZ!=poz;
        boolean nemHos = !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo");

        if (sor == 10 && oszlop == 1 && sor10oszlop1 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely,sor10oszlop1Nev);
            kiVanItt(sor10oszlop1Nev,10,1);
        } else if (sor == 10 && oszlop == 2 && sor10oszlop2 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely,sor10oszlop2Nev);
            kiVanItt(sor10oszlop2Nev,10,2);
        } else if (sor == 9 && oszlop == 1 && sor9oszlop1 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor9oszlop1Nev);
            kiVanItt(sor9oszlop1Nev,9,1);
        } else if (sor == 9 && oszlop == 2 && sor9oszlop2 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor9oszlop2Nev);
            kiVanItt(sor9oszlop2Nev,9,2);
        } else if (sor == 8 && oszlop == 1 && sor8oszlop1 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor8oszlop1Nev);
            kiVanItt(sor8oszlop1Nev,8,1);
        } else if (sor == 8 && oszlop == 2 && sor8oszlop2 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor8oszlop2Nev);
            kiVanItt(sor8oszlop2Nev,8,2);
        } else if (sor == 7 && oszlop == 1 && sor7oszlop1 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor7oszlop1Nev);
            kiVanItt(sor7oszlop1Nev,7,1);
        } else if (sor == 7 && oszlop == 2 && sor7oszlop2 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor7oszlop2Nev);
            kiVanItt(sor7oszlop2Nev,7,2);
        } else if (sor == 6 && oszlop == 1 && sor6oszlop1 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor6oszlop1Nev);
            kiVanItt(sor6oszlop1Nev,6,1);
        } else if (sor == 6 && oszlop == 2 && sor6oszlop2 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor6oszlop2Nev);
            kiVanItt(sor6oszlop2Nev,6,2);
        } else if (sor == 5 && oszlop == 1 && sor5oszlop1 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor5oszlop1Nev);
            kiVanItt(sor5oszlop1Nev,5,1);
        } else if (sor == 5 && oszlop == 2 && sor5oszlop2 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor5oszlop2Nev);
            kiVanItt(sor5oszlop2Nev,5,2);
        } else if (sor == 4 && oszlop == 1 && sor4oszlop1 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor4oszlop1Nev);
            kiVanItt(sor4oszlop1Nev,4,1);
        } else if (sor == 4 && oszlop == 2 && sor4oszlop2 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor4oszlop2Nev);
            kiVanItt(sor4oszlop2Nev,4,2);
        } else if (sor == 3 && oszlop == 1 && sor3oszlop1 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor3oszlop1Nev);
            kiVanItt(sor3oszlop1Nev,3,1);
        } else if (sor == 3 && oszlop == 2 && sor3oszlop2 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor3oszlop2Nev);
            kiVanItt(sor3oszlop2Nev,3,2);
        } else if (sor == 2 && oszlop == 1 && sor2oszlop1 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor2oszlop1Nev);
            kiVanItt(sor2oszlop1Nev,2,1);
        } else if (sor == 2 && oszlop == 2 && sor2oszlop2 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor2oszlop2Nev);
            kiVanItt(sor2oszlop2Nev,2,2);
        } else if (sor == 1 && oszlop == 1 && sor1oszlop1 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor1oszlop1Nev);
            kiVanItt(sor1oszlop1Nev,1,1);
        } else if (sor == 1 && oszlop == 2 && sor1oszlop2 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor1oszlop2Nev);
            kiVanItt(sor1oszlop2Nev,1,2);
        } else if (sor == 8 && oszlop == 3 && sor8oszlop3 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor8oszlop3Nev);
            kiVanItt(sor8oszlop3Nev,8,3);
        } else if (sor == 7 && oszlop == 3 && sor7oszlop3 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor7oszlop3Nev);
            kiVanItt(sor7oszlop3Nev,7,3);
        } else if (sor == 6 && oszlop == 3 && sor6oszlop3 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor6oszlop3Nev);
            kiVanItt(sor6oszlop3Nev,6,3);
        } else if (sor == 5 && oszlop == 3 && sor5oszlop3 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor5oszlop3Nev);
            kiVanItt(sor5oszlop3Nev,5,3);
        } else if (sor == 4 && oszlop == 3 && sor4oszlop3 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor4oszlop3Nev);
            kiVanItt(sor4oszlop3Nev,4,3);
        } else if (sor == 3 && oszlop == 3 && sor3oszlop3 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor3oszlop3Nev);
            kiVanItt(sor3oszlop3Nev,3,3);
        } else if (sor == 2 && oszlop == 3 && sor2oszlop3 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor2oszlop3Nev);
            kiVanItt(sor2oszlop3Nev,2,3);
        } else if (sor == 1 && oszlop == 3 && sor1oszlop3 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor1oszlop3Nev);
            kiVanItt(sor1oszlop3Nev,1,3);
        } else if (sor == 8 && oszlop == 4 && sor8oszlop4 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor8oszlop4Nev);
            kiVanItt(sor8oszlop4Nev,8,4);
        } else if (sor == 7 && oszlop == 4 && sor7oszlop4 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor7oszlop4Nev);
            kiVanItt(sor7oszlop4Nev,7,4);
        } else if (sor == 5 && oszlop == 4 && sor5oszlop4 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor5oszlop4Nev);
            kiVanItt(sor5oszlop4Nev,5,4);
        } else if (sor == 4 && oszlop == 4 && sor4oszlop4 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor4oszlop4Nev);
            kiVanItt(sor4oszlop4Nev,4,4);
        } else if (sor == 3 && oszlop == 4 && sor3oszlop4 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor3oszlop4Nev);
            kiVanItt(sor3oszlop4Nev,3,4);
        } else if (sor == 2 && oszlop == 4 && sor2oszlop4 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor2oszlop4Nev);
            kiVanItt(sor2oszlop4Nev,2,4);
        } else if (sor == 1 && oszlop == 4 && sor1oszlop4 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor1oszlop4Nev);
            kiVanItt(sor1oszlop4Nev,1,4);
        } else if (sor == 10 && oszlop == 5 && sor10oszlop5 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely,sor10oszlop5Nev);
            kiVanItt(sor10oszlop5Nev,10,5);
        } else if (sor == 9 && oszlop == 5 && sor9oszlop5 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor9oszlop5Nev);
            kiVanItt(sor9oszlop5Nev,9,5);
        } else if (sor == 8 && oszlop == 5 && sor8oszlop5 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor8oszlop5Nev);
            kiVanItt(sor8oszlop5Nev,8,5);
        } else if (sor == 7 && oszlop == 5 && sor7oszlop5 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor7oszlop5Nev);
            kiVanItt(sor7oszlop5Nev,7,5);
        } else if (sor == 6 && oszlop == 5 && sor6oszlop5 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor6oszlop5Nev);
            kiVanItt(sor6oszlop5Nev,6,5);
        } else if (sor == 5 && oszlop == 5 && sor5oszlop5 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor5oszlop5Nev);
            kiVanItt(sor5oszlop5Nev,5,5);
        } else if (sor == 4 && oszlop == 5 && sor4oszlop5 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor4oszlop5Nev);
            kiVanItt(sor4oszlop5Nev,4,5);
        } else if (sor == 3 && oszlop == 5 && sor3oszlop5 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor3oszlop5Nev);
            kiVanItt(sor3oszlop5Nev,3,5);
        } else if (sor == 2 && oszlop == 5 && sor2oszlop5 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor2oszlop5Nev);
            kiVanItt(sor2oszlop5Nev,2,5);
        } else if (sor == 1 && oszlop == 5 && sor1oszlop5 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor1oszlop5Nev);
            kiVanItt(sor1oszlop5Nev,1,5);
        } else if (sor == 10 && oszlop == 6 && sor10oszlop6 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely,sor10oszlop6Nev);
            kiVanItt(sor10oszlop6Nev,10,6);
        } else if (sor == 9 && oszlop == 6 && sor9oszlop6 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor9oszlop6Nev);
            kiVanItt(sor9oszlop6Nev,9,6);
        } else if (sor == 7 && oszlop == 6 && sor7oszlop6 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor7oszlop6Nev);
            kiVanItt(sor7oszlop6Nev,7,6);
        } else if (sor == 6 && oszlop == 6 && sor6oszlop6 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor6oszlop6Nev);
            kiVanItt(sor6oszlop6Nev,6,6);
        } else if (sor == 5 && oszlop == 6 && sor5oszlop6 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor5oszlop6Nev);
            kiVanItt(sor5oszlop6Nev,5,6);
        } else if (sor == 4 && oszlop == 6 && sor4oszlop6 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor4oszlop6Nev);
            kiVanItt(sor4oszlop6Nev,4,6);
        } else if (sor == 3 && oszlop == 6 && sor3oszlop6 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor3oszlop6Nev);
            kiVanItt(sor3oszlop6Nev,3,6);
        } else if (sor == 2 && oszlop == 6 && sor2oszlop6 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor2oszlop6Nev);
            kiVanItt(sor2oszlop6Nev,2,6);
        } else if (sor == 1 && oszlop == 6 && sor1oszlop6 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor1oszlop6Nev);
            kiVanItt(sor1oszlop6Nev,1,6);
        } else if (sor == 10 && oszlop == 7 && sor10oszlop7 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely,sor10oszlop7Nev);
            kiVanItt(sor10oszlop7Nev,10,7);
        } else if (sor == 9 && oszlop == 7 && sor9oszlop7 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor9oszlop7Nev);
            kiVanItt(sor9oszlop7Nev,9,7);
        } else if (sor == 7 && oszlop == 7 && sor7oszlop7 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor7oszlop7Nev);
            kiVanItt(sor7oszlop7Nev,7,7);
        } else if (sor == 6 && oszlop == 7 && sor6oszlop7 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor6oszlop7Nev);
            kiVanItt(sor6oszlop7Nev,6,7);
        } else if (sor == 5 && oszlop == 7 && sor5oszlop7 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor5oszlop7Nev);
            kiVanItt(sor5oszlop7Nev,5,7);
        } else if (sor == 4 && oszlop == 7 && sor4oszlop7 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor4oszlop7Nev);
            kiVanItt(sor4oszlop7Nev,4,7);
        } else if (sor == 3 && oszlop == 7 && sor3oszlop7 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor3oszlop7Nev);
            kiVanItt(sor3oszlop7Nev,3,7);
        } else if (sor == 2 && oszlop == 7 && sor2oszlop7 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor2oszlop7Nev);
            kiVanItt(sor2oszlop7Nev,2,7);
        } else if (sor == 1 && oszlop == 7 && sor1oszlop7 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor1oszlop7Nev);
            kiVanItt(sor1oszlop7Nev,1,7);
        } else if (sor == 10 && oszlop == 8 && sor10oszlop8 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely,sor10oszlop8Nev);
            kiVanItt(sor10oszlop8Nev,10,8);
        } else if (sor == 9 && oszlop == 8 && sor9oszlop8 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor9oszlop8Nev);
            kiVanItt(sor9oszlop8Nev,9,8);
        } else if (sor == 8 && oszlop == 8 && sor8oszlop8 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor8oszlop8Nev);
            kiVanItt(sor8oszlop8Nev,8,8);
        } else if (sor == 6 && oszlop == 8 && sor6oszlop8 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor6oszlop8Nev);
            kiVanItt(sor6oszlop8Nev,6,8);
        } else if (sor == 5 && oszlop == 8 && sor5oszlop8 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor5oszlop8Nev);
            kiVanItt(sor5oszlop8Nev,5,8);
        } else if (sor == 4 && oszlop == 8 && sor4oszlop8 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor4oszlop8Nev);
            kiVanItt(sor4oszlop8Nev,4,8);
        } else if (sor == 3 && oszlop == 8 && sor3oszlop8 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor3oszlop8Nev);
            kiVanItt(sor3oszlop8Nev,3,8);
        } else if (sor == 2 && oszlop == 8 && sor2oszlop8 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor2oszlop8Nev);
            kiVanItt(sor2oszlop8Nev,2,8);
        } else if (sor == 1 && oszlop == 8 && sor1oszlop8 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor1oszlop8Nev);
            kiVanItt(sor1oszlop8Nev,1,8);
        } else if (sor == 10 && oszlop == 9 && sor10oszlop9 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely,sor10oszlop9Nev);
            kiVanItt(sor10oszlop9Nev,10,9);
        } else if (sor == 9 && oszlop == 9 && sor9oszlop9 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor9oszlop9Nev);
            kiVanItt(sor9oszlop9Nev,9,9);
        } else if (sor == 8 && oszlop == 9 && sor8oszlop9 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor8oszlop9Nev);
            kiVanItt(sor8oszlop9Nev,8,9);
        } else if (sor == 6 && oszlop == 9 && sor6oszlop9 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor6oszlop9Nev);
            kiVanItt(sor6oszlop9Nev,6,9);
        } else if (sor == 5 && oszlop == 9 && sor5oszlop9 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor5oszlop9Nev);
            kiVanItt(sor5oszlop9Nev,5,9);
        } else if (sor == 4 && oszlop == 9 && sor4oszlop9 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor4oszlop9Nev);
            kiVanItt(sor4oszlop9Nev,4,9);
        } else if (sor == 3 && oszlop == 9 && sor3oszlop9 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor3oszlop9Nev);
            kiVanItt(sor3oszlop9Nev,3,9);
        } else if (sor == 2 && oszlop == 9 && sor2oszlop9 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor2oszlop9Nev);
            kiVanItt(sor2oszlop9Nev,2,9);
        } else if (sor == 1 && oszlop == 9 && sor1oszlop9 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely, sor1oszlop9Nev);
            kiVanItt(sor1oszlop9Nev,1,9);
        } else if (sor == 10 && oszlop == 10 && sor10oszlop10 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely,sor10oszlop10Nev);
            kiVanItt(sor10oszlop10Nev,10,10);
        } else if (sor == 9 && oszlop == 10 && sor9oszlop10 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely,sor9oszlop10Nev);
            kiVanItt(sor9oszlop10Nev,9,10);
        } else if (sor == 8 && oszlop == 10 && sor8oszlop10 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely,sor8oszlop10Nev);
            kiVanItt(sor8oszlop10Nev,8,10);
        } else if (sor == 7 && oszlop == 10 && sor7oszlop10 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely,sor7oszlop10Nev);
            kiVanItt(sor7oszlop10Nev,7,10);
        } else if (sor == 6 && oszlop == 10 && sor6oszlop10 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely,sor6oszlop10Nev);
            kiVanItt(sor6oszlop10Nev,6,10);
        } else if (sor == 5 && oszlop == 10 && sor5oszlop10 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely,sor5oszlop10Nev);
            kiVanItt(sor5oszlop10Nev,5,10);
        } else if (sor == 4 && oszlop == 10 && sor4oszlop10 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely,sor4oszlop10Nev);
            kiVanItt(sor4oszlop10Nev,4,10);
        } else if (sor == 3 && oszlop == 10 && sor3oszlop10 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely,sor3oszlop10Nev);
            kiVanItt(sor3oszlop10Nev,3,10);
        } else if (sor == 2 && oszlop == 10 && sor2oszlop10 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely,sor2oszlop10Nev);
            kiVanItt(sor2oszlop10Nev,2,10);
        } else if (sor == 1 && oszlop == 10 && sor1oszlop10 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely,sor1oszlop10Nev);
            kiVanItt(sor1oszlop10Nev,1,10);
        } else if (sor == 10 && oszlop == 11 && sor10oszlop11 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely,sor10oszlop11Nev);
            kiVanItt(sor10oszlop11Nev,10,11);
        } else if (sor == 9 && oszlop == 11 && sor9oszlop11 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely,sor9oszlop11Nev);
            kiVanItt(sor9oszlop11Nev,9,11);
        } else if (sor == 8 && oszlop == 11 && sor8oszlop11 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely,sor8oszlop11Nev);
            kiVanItt(sor8oszlop11Nev,8,11);
        } else if (sor == 7 && oszlop == 11 && sor7oszlop11 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely,sor7oszlop11Nev);
            kiVanItt(sor7oszlop11Nev,7,11);
        } else if (sor == 6 && oszlop == 11 && sor6oszlop11 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely,sor6oszlop11Nev);
            kiVanItt(sor6oszlop11Nev,6,11);
        } else if (sor == 5 && oszlop == 11 && sor5oszlop11 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely,sor5oszlop11Nev);
            kiVanItt(sor5oszlop11Nev,5,11);
        } else if (sor == 4 && oszlop == 11 && sor4oszlop11 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely,sor4oszlop11Nev);
            kiVanItt(sor4oszlop11Nev,4,11);
        } else if (sor == 3 && oszlop == 11 && sor3oszlop11 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely,sor3oszlop11Nev);
            kiVanItt(sor3oszlop11Nev,3,11);
        } else if (sor == 2 && oszlop == 11 && sor2oszlop11 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely,sor2oszlop11Nev);
            kiVanItt(sor2oszlop11Nev,2,11);
        } else if (sor == 1 && oszlop == 11 && sor1oszlop11 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely,sor1oszlop11Nev);
            kiVanItt(sor1oszlop11Nev,1,11);
        } else if (sor == 10 && oszlop == 12 && sor10oszlop12 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely,sor10oszlop12Nev);
            kiVanItt(sor10oszlop12Nev,10,12);
        } else if (sor == 9 && oszlop == 12 && sor9oszlop12 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely,sor9oszlop12Nev);
            kiVanItt(sor9oszlop12Nev,9,12);
        } else if (sor == 8 && oszlop == 12 && sor8oszlop12 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely,sor8oszlop12Nev);
            kiVanItt(sor8oszlop12Nev,8,12);
        } else if (sor == 7 && oszlop == 12 && sor7oszlop12 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely,sor7oszlop12Nev);
            kiVanItt(sor7oszlop12Nev,7,12);
        } else if (sor == 6 && oszlop == 12 && sor6oszlop12 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely,sor6oszlop12Nev);
            kiVanItt(sor6oszlop12Nev,6,12);
        } else if (sor == 5 && oszlop == 12 && sor5oszlop12 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely,sor5oszlop12Nev);
            kiVanItt(sor5oszlop12Nev,5,12);
        } else if (sor == 4 && oszlop == 12 && sor4oszlop12 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely,sor4oszlop12Nev);
            kiVanItt(sor4oszlop12Nev,4,12);
        } else if (sor == 3 && oszlop == 12 && sor3oszlop12 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely,sor3oszlop12Nev);
            kiVanItt(sor3oszlop12Nev,3,12);
        } else if (sor == 2 && oszlop == 12 && sor2oszlop12 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely,sor2oszlop12Nev);
            kiVanItt(sor2oszlop12Nev,2,12);
        } else if (sor == 1 && oszlop == 12 && sor1oszlop12 && nemHos && nemVelemVagy && tamadhat) {
            sebzesKiszamitasaEgyseg(elsoHely,sor1oszlop12Nev);
            kiVanItt(sor1oszlop12Nev,1,12);
        }
    }

    public static void kiVanItt(String egyseg, int sor, int oszlop) {

        halottEgysegSzam=0;
        egysegNeve(elsoHely);

        switch (egyseg) {
            case "efoldmuv" -> {
                Eletero.elsoEllEgysegEletero -= sebzes;
                ellenfelDbSzamElso = Eletero.elsoEllEgysegEletero / 3;
                if (Eletero.elsoEllEgysegEletero > 0) {

                    egysegekSorrend.remove(ellenfelEgysegIras1);
                    egysegekSorrend.remove(ellenfelEgysegL1Kep);

                    if (ellenfelDbSzamElso < 10) {
                        ellenfelEgysegErtek1.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamElso)));
                    } else {
                        ellenfelEgysegErtek1.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamElso)));
                    }

                    if (vanKrit) {
                        informacioErtek.setText("<html><center><u>Krit!</u> " + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " szenvedett " +
                            "és " + Eletero.elsoEllEgysegEletero + " maradt.</p></center></html>");
                    }else {
                    informacioErtek.setText("<html><center>" + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " szenvedett " +
                            "és " + Eletero.elsoEllEgysegEletero + " maradt.</p></center></html>");
                    }


                    ellenfelEgysegIras1.add(ellenfelEgysegErtek1);
                    ellenfelEgysegL1Kep.add(ellenfelEgysegL1Kepe);
                    EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras1, ellenfelEgysegL1Kep, oszlop, sor);
                    ablakCsata.add(egysegekSorrend);
                } else {
                    halottEgysegSzam++;
                    egysegekSorrend.remove(ellenfelEgysegIras1);
                    egysegekSorrend.remove(ellenfelEgysegL1Kep);

                    efoldmuv = 0;
                    egysegPozTorlese("efoldmuv", sor, oszlop);

                    if (vanKrit) {
                        informacioErtek.setText("<html><center><u>Krit!</u> " + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                    }else {
                    informacioErtek.setText("<html><center>" + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                    }

                }
            }
            case "ecsont" -> {
                Eletero.elsoEllEgysegEletero -= sebzes;
                ellenfelDbSzamElso = Eletero.elsoEllEgysegEletero / 2;
                if (Eletero.elsoEllEgysegEletero > 0) {

                    egysegekSorrend.remove(ellenfelEgysegIras1);
                    egysegekSorrend.remove(ellenfelEgysegL1Kep);

                    if (ellenfelDbSzamElso < 10) {
                        ellenfelEgysegErtek1.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamElso)));
                    } else {
                        ellenfelEgysegErtek1.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamElso)));
                    }

                    if (vanKrit) {
                        informacioErtek.setText("<html><center><u>Krit!</u> " + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " szenvedett " +
                            "és " + Eletero.elsoEllEgysegEletero + " maradt.</p></center></html>");
                    }else {
                    informacioErtek.setText("<html><center>" + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " szenvedett " +
                            "és " + Eletero.elsoEllEgysegEletero + " maradt.</p></center></html>");
                    }


                    ellenfelEgysegIras1.add(ellenfelEgysegErtek1);
                    ellenfelEgysegL1Kep.add(ellenfelEgysegL1Kepe);
                    EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras1, ellenfelEgysegL1Kep, oszlop, sor);
                    ablakCsata.add(egysegekSorrend);
                } else {
                    halottEgysegSzam++;
                    egysegekSorrend.remove(ellenfelEgysegIras1);
                    egysegekSorrend.remove(ellenfelEgysegL1Kep);

                    ecsont = 0;
                    egysegPozTorlese("ecsont", sor, oszlop);

                    if (vanKrit) {
                        informacioErtek.setText("<html><center><u>Krit!</u> " + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                    }else {
                    informacioErtek.setText("<html><center>" + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                    }

                }
            }
            case "efelder" -> {
                Eletero.masodikEllEgysegEletero -= sebzes;
                ellenfelDbSzamMasodik = Eletero.masodikEllEgysegEletero / 10;
                if (Eletero.masodikEllEgysegEletero > 0) {

                    egysegekSorrend.remove(ellenfelEgysegIras2);
                    egysegekSorrend.remove(ellenfelEgysegL2Kep);

                    if (ellenfelDbSzamMasodik < 10) {
                        ellenfelEgysegErtek2.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamMasodik)));
                    } else {
                        ellenfelEgysegErtek2.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamMasodik)));
                    }

                    if (vanKrit) {
                        informacioErtek.setText("<html><center><u>Krit!</u> " + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " szenvedett " +
                            "és " + Eletero.masodikEllEgysegEletero + " maradt.</p></center></html>");
                    }else {
                    informacioErtek.setText("<html><center>" + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " szenvedett " +
                            "és " + Eletero.masodikEllEgysegEletero + " maradt.</p></center></html>");
                    }


                    ellenfelEgysegIras2.add(ellenfelEgysegErtek2);
                    ellenfelEgysegL2Kep.add(ellenfelEgysegL2Kepe);
                    EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras2, ellenfelEgysegL2Kep, oszlop, sor);
                    ablakCsata.add(egysegekSorrend);
                } else {
                    halottEgysegSzam++;
                    egysegekSorrend.remove(ellenfelEgysegIras2);
                    egysegekSorrend.remove(ellenfelEgysegL2Kep);

                    efelder = 0;
                    egysegPozTorlese("efelder", sor, oszlop);

                    if (vanKrit) {
                        informacioErtek.setText("<html><center><u>Krit!</u> " + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                    }else {
                    informacioErtek.setText("<html><center>" + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                    }

                }
            }
            case "eijas" -> {
                Eletero.masodikEllEgysegEletero -= sebzes;
                ellenfelDbSzamMasodik = Eletero.masodikEllEgysegEletero / 7;
                if (Eletero.masodikEllEgysegEletero > 0) {

                    egysegekSorrend.remove(ellenfelEgysegIras2);
                    egysegekSorrend.remove(ellenfelEgysegL2Kep);

                    if (ellenfelDbSzamMasodik < 10) {
                        ellenfelEgysegErtek2.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamMasodik)));
                    } else {
                        ellenfelEgysegErtek2.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamMasodik)));
                    }

                    if (vanKrit) {
                        informacioErtek.setText("<html><center><u>Krit!</u> " + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " szenvedett " +
                            "és " + Eletero.masodikEllEgysegEletero + " maradt.</p></center></html>");
                    }else {
                    informacioErtek.setText("<html><center>" + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " szenvedett " +
                            "és " + Eletero.masodikEllEgysegEletero + " maradt.</p></center></html>");
                    }


                    ellenfelEgysegIras2.add(ellenfelEgysegErtek2);
                    ellenfelEgysegL2Kep.add(ellenfelEgysegL2Kepe);
                    EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras2, ellenfelEgysegL2Kep, oszlop, sor);
                    ablakCsata.add(egysegekSorrend);
                } else {
                    halottEgysegSzam++;
                    egysegekSorrend.remove(ellenfelEgysegIras2);
                    egysegekSorrend.remove(ellenfelEgysegL2Kep);

                    eijas = 0;
                    egysegPozTorlese("eijas", sor, oszlop);

                    if (vanKrit) {
                        informacioErtek.setText("<html><center><u>Krit!</u> " + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                    }else {
                    informacioErtek.setText("<html><center>" + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                    }

                }
            }
            case "emino" -> {
                Eletero.harmadikEllEgysegEletero -= sebzes;
                ellenfelDbSzamHarmadik = Eletero.harmadikEllEgysegEletero / 80;
                if (Eletero.harmadikEllEgysegEletero > 0) {

                    egysegekSorrend.remove(ellenfelEgysegIras3);
                    egysegekSorrend.remove(ellenfelEgysegL3Kep);

                    if (ellenfelDbSzamHarmadik < 10) {
                        ellenfelEgysegErtek3.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamHarmadik)));
                    } else {
                        ellenfelEgysegErtek3.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamHarmadik)));
                    }

                    if (vanKrit) {
                        informacioErtek.setText("<html><center><u>Krit!</u> " + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " szenvedett " +
                            "és " + Eletero.harmadikEllEgysegEletero + " maradt.</p></center></html>");
                    }else {
                    informacioErtek.setText("<html><center>" + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " szenvedett " +
                            "és " + Eletero.harmadikEllEgysegEletero + " maradt.</p></center></html>");
                    }


                    ellenfelEgysegIras3.add(ellenfelEgysegErtek3);
                    ellenfelEgysegL3Kep.add(ellenfelEgysegL3Kepe);
                    EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras3, ellenfelEgysegL3Kep, oszlop, sor);
                    ablakCsata.add(egysegekSorrend);
                } else {
                    halottEgysegSzam++;
                    egysegekSorrend.remove(ellenfelEgysegIras3);
                    egysegekSorrend.remove(ellenfelEgysegL3Kep);

                    emino = 0;
                    egysegPozTorlese("emino", sor, oszlop);

                    if (vanKrit) {
                        informacioErtek.setText("<html><center><u>Krit!</u> " + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                    }else {
                    informacioErtek.setText("<html><center>" + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                    }

                }
            }
            case "egrif" -> {
                Eletero.harmadikEllEgysegEletero -= sebzes;
                ellenfelDbSzamHarmadik = Eletero.harmadikEllEgysegEletero / 30;
                if (Eletero.harmadikEllEgysegEletero > 0) {

                    egysegekSorrend.remove(ellenfelEgysegIras3);
                    egysegekSorrend.remove(ellenfelEgysegL3Kep);

                    if (ellenfelDbSzamHarmadik < 10) {
                        ellenfelEgysegErtek3.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamHarmadik)));
                    } else {
                        ellenfelEgysegErtek3.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamHarmadik)));
                    }

                    if (vanKrit) {
                        informacioErtek.setText("<html><center><u>Krit!</u> " + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " szenvedett " +
                            "és " + Eletero.harmadikEllEgysegEletero + " maradt.</p></center></html>");
                    }else {
                    informacioErtek.setText("<html><center>" + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " szenvedett " +
                            "és " + Eletero.harmadikEllEgysegEletero + " maradt.</p></center></html>");
                    }


                    ellenfelEgysegIras3.add(ellenfelEgysegErtek3);
                    ellenfelEgysegL3Kep.add(ellenfelEgysegL3Kepe);
                    EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras3, ellenfelEgysegL3Kep, oszlop, sor);
                    ablakCsata.add(egysegekSorrend);
                } else {
                    halottEgysegSzam++;
                    egysegekSorrend.remove(ellenfelEgysegIras3);
                    egysegekSorrend.remove(ellenfelEgysegL3Kep);

                    egrif = 0;
                    egysegPozTorlese("egrif", sor, oszlop);

                    if (vanKrit) {
                        informacioErtek.setText("<html><center><u>Krit!</u> " + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                    }else {
                    informacioErtek.setText("<html><center>" + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                    }

                }
            }
            case "efegyv" -> {
                Eletero.negyedikEllEgysegEletero -= sebzes;
                ellenfelDbSzamNegyedik = Eletero.negyedikEllEgysegEletero / 33;
                if (Eletero.negyedikEllEgysegEletero > 0) {

                    egysegekSorrend.remove(ellenfelEgysegIras4);
                    egysegekSorrend.remove(ellenfelEgysegL4Kep);

                    if (ellenfelDbSzamNegyedik < 10) {
                        ellenfelEgysegErtek4.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamNegyedik)));
                    } else {
                        ellenfelEgysegErtek4.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamNegyedik)));
                    }

                    if (vanKrit) {
                        informacioErtek.setText("<html><center><u>Krit!</u> " + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " szenvedett " +
                            "és " + Eletero.negyedikEllEgysegEletero + " maradt.</p></center></html>");
                    }else {
                    informacioErtek.setText("<html><center>" + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " szenvedett " +
                            "és " + Eletero.negyedikEllEgysegEletero + " maradt.</p></center></html>");
                    }


                    ellenfelEgysegIras4.add(ellenfelEgysegErtek4);
                    ellenfelEgysegL4Kep.add(ellenfelEgysegL4Kepe);
                    EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras4, ellenfelEgysegL4Kep, oszlop, sor);
                    ablakCsata.add(egysegekSorrend);
                } else {
                    halottEgysegSzam++;
                    egysegekSorrend.remove(ellenfelEgysegIras4);
                    egysegekSorrend.remove(ellenfelEgysegL4Kep);

                    efegyv = 0;
                    egysegPozTorlese("efegyv", sor, oszlop);

                    if (vanKrit) {
                        informacioErtek.setText("<html><center><u>Krit!</u> " + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                    }else {
                    informacioErtek.setText("<html><center>" + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                    }

                }
            }
            case "eorgy" -> {
                Eletero.negyedikEllEgysegEletero -= sebzes;
                ellenfelDbSzamNegyedik = Eletero.negyedikEllEgysegEletero / 20;
                if (Eletero.negyedikEllEgysegEletero > 0) {

                    egysegekSorrend.remove(ellenfelEgysegIras4);
                    egysegekSorrend.remove(ellenfelEgysegL4Kep);

                    if (ellenfelDbSzamNegyedik < 10) {
                        ellenfelEgysegErtek4.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamNegyedik)));
                    } else {
                        ellenfelEgysegErtek4.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamNegyedik)));
                    }

                    if (vanKrit) {
                        informacioErtek.setText("<html><center><u>Krit!</u> " + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " szenvedett " +
                            "és " + Eletero.negyedikEllEgysegEletero + " maradt.</p></center></html>");
                    }else {
                    informacioErtek.setText("<html><center>" + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " szenvedett " +
                            "és " + Eletero.negyedikEllEgysegEletero + " maradt.</p></center></html>");
                    }


                    ellenfelEgysegIras4.add(ellenfelEgysegErtek4);
                    ellenfelEgysegL4Kep.add(ellenfelEgysegL4Kepe);
                    EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras4, ellenfelEgysegL4Kep, oszlop, sor);
                    ablakCsata.add(egysegekSorrend);
                } else {
                    halottEgysegSzam++;
                    egysegekSorrend.remove(ellenfelEgysegIras4);
                    egysegekSorrend.remove(ellenfelEgysegL4Kep);

                    eorgy = 0;
                    egysegPozTorlese("eorgy", sor, oszlop);

                    if (vanKrit) {
                        informacioErtek.setText("<html><center><u>Krit!</u> " + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                    }else {
                    informacioErtek.setText("<html><center>" + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                    }

                }
            }
            case "eharcp" -> {
                Eletero.otodikEllEgysegEletero -= sebzes;
                ellenfelDbSzamOtodik = Eletero.otodikEllEgysegEletero / 54;
                if (Eletero.otodikEllEgysegEletero > 0) {

                    egysegekSorrend.remove(ellenfelEgysegIras5);
                    egysegekSorrend.remove(ellenfelEgysegL5Kep);

                    if (ellenfelDbSzamOtodik < 10) {
                        ellenfelEgysegErtek5.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamOtodik)));
                    } else {
                        ellenfelEgysegErtek5.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamOtodik)));
                    }

                    if (vanKrit) {
                        informacioErtek.setText("<html><center><u>Krit!</u> " + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " szenvedett " +
                            "és " + Eletero.otodikEllEgysegEletero + " maradt.</p></center></html>");
                    }else {
                    informacioErtek.setText("<html><center>" + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " szenvedett " +
                            "és " + Eletero.otodikEllEgysegEletero + " maradt.</p></center></html>");
                    }


                    ellenfelEgysegIras5.add(ellenfelEgysegErtek5);
                    ellenfelEgysegL5Kep.add(ellenfelEgysegL5Kepe);
                    EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras5, ellenfelEgysegL5Kep, oszlop, sor);
                    ablakCsata.add(egysegekSorrend);
                } else {
                    halottEgysegSzam++;
                    egysegekSorrend.remove(ellenfelEgysegIras5);
                    egysegekSorrend.remove(ellenfelEgysegL5Kep);

                    eharcp = 0;
                    egysegPozTorlese("eharcp", sor, oszlop);

                    if (vanKrit) {
                        informacioErtek.setText("<html><center><u>Krit!</u> " + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                    }else {
                    informacioErtek.setText("<html><center>" + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                    }

                }
            }
            case "erapt" -> {
                Eletero.otodikEllEgysegEletero -= sebzes;
                ellenfelDbSzamOtodik = Eletero.otodikEllEgysegEletero / 35;
                if (Eletero.otodikEllEgysegEletero > 0) {

                    egysegekSorrend.remove(ellenfelEgysegIras5);
                    egysegekSorrend.remove(ellenfelEgysegL5Kep);

                    if (ellenfelDbSzamOtodik < 10) {
                        ellenfelEgysegErtek5.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamOtodik)));
                    } else {
                        ellenfelEgysegErtek5.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamOtodik)));
                    }

                    if (vanKrit) {
                        informacioErtek.setText("<html><center><u>Krit!</u> " + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " szenvedett " +
                            "és " + Eletero.otodikEllEgysegEletero + " maradt.</p></center></html>");
                    }else {
                    informacioErtek.setText("<html><center>" + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " szenvedett " +
                            "és " + Eletero.otodikEllEgysegEletero + " maradt.</p></center></html>");
                    }


                    ellenfelEgysegIras5.add(ellenfelEgysegErtek5);
                    ellenfelEgysegL5Kep.add(ellenfelEgysegL5Kepe);
                    EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras5, ellenfelEgysegL5Kep, oszlop, sor);
                    ablakCsata.add(egysegekSorrend);
                } else {
                    halottEgysegSzam++;
                    egysegekSorrend.remove(ellenfelEgysegIras5);
                    egysegekSorrend.remove(ellenfelEgysegL5Kep);

                    erapt = 0;
                    egysegPozTorlese("erapt", sor, oszlop);

                    if (vanKrit) {
                        informacioErtek.setText("<html><center><u>Krit!</u> " + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                    }else {
                    informacioErtek.setText("<html><center>" + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                    }

                }
            }
            case "csont" -> {
                Eletero.elsoEgysegEletero -= sebzes;
                dbSzamElso = Eletero.elsoEgysegEletero / 2;
                if (Eletero.elsoEgysegEletero > 0) {

                    egysegekSorrend.remove(egysegIras1);
                    egysegekSorrend.remove(egysegL1TestKep);

                    if (dbSzamElso < 10) {
                        egysegErtek1.setText(String.valueOf(String.format("%.2f", dbSzamElso)));
                    } else {
                        egysegErtek1.setText(String.valueOf(String.format("%.1f", dbSzamElso)));
                    }

                    if (vanKrit) {
                        informacioErtek.setText("<html><center><u>Krit!</u> " + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és " + Eletero.elsoEgysegEletero + " életereje maradt.</p></center></html>");
                    }else {
                    informacioErtek.setText("<html><center>" + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és " + Eletero.elsoEgysegEletero + " életereje maradt.</p></center></html>");
                    }


                    egysegIras1.add(egysegErtek1);
                    egysegL1TestKep.add(egysegL1TestKepe);
                    EgysegLathatosag.lathatosagSorrend(egysegIras1, egysegL1TestKep, oszlop, sor);
                    ablakCsata.add(egysegekSorrend);
                } else {
                    halottEgysegSzam++;
                    egysegekSorrend.remove(egysegIras1);
                    egysegekSorrend.remove(egysegL1TestKep);

                    csont = 0;
                    egysegPozTorlese("csont", sor, oszlop);

                    if (vanKrit) {
                        informacioErtek.setText("<html><center><u>Krit!</u> " + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                    }else {
                    informacioErtek.setText("<html><center>" + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                    }

                }
            }
            case "foldmuv" -> {
                Eletero.elsoEgysegEletero -= sebzes;
                dbSzamElso = Eletero.elsoEgysegEletero / 3;
                if (Eletero.elsoEgysegEletero > 0) {

                    egysegekSorrend.remove(egysegIras1);
                    egysegekSorrend.remove(egysegL1TestKep);

                    if (dbSzamElso < 10) {
                        egysegErtek1.setText(String.valueOf(String.format("%.2f", dbSzamElso)));
                    } else {
                        egysegErtek1.setText(String.valueOf(String.format("%.1f", dbSzamElso)));
                    }

                    if (vanKrit) {
                        informacioErtek.setText("<html><center><u>Krit!</u> " + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és " + Eletero.elsoEgysegEletero + " életereje maradt.</p></center></html>");
                    }else {
                    informacioErtek.setText("<html><center>" + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és " + Eletero.elsoEgysegEletero + " életereje maradt.</p></center></html>");
                    }


                    egysegIras1.add(egysegErtek1);
                    egysegL1TestKep.add(egysegL1TestKepe);
                    EgysegLathatosag.lathatosagSorrend(egysegIras1, egysegL1TestKep, oszlop, sor);
                    ablakCsata.add(egysegekSorrend);
                } else {
                    halottEgysegSzam++;
                    egysegekSorrend.remove(egysegIras1);
                    egysegekSorrend.remove(egysegL1TestKep);

                    foldmuv = 0;
                    egysegPozTorlese("foldmuv", sor, oszlop);

                    if (vanKrit) {
                        informacioErtek.setText("<html><center><u>Krit!</u> " + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                    }else {
                    informacioErtek.setText("<html><center>" + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                    }

                }
            }
            case "ijas" -> {
                Eletero.masodikEgysegEletero -= sebzes;
                dbSzamMasodik = Eletero.masodikEgysegEletero / 7;
                if (Eletero.masodikEgysegEletero > 0) {

                    egysegekSorrend.remove(egysegIras2);
                    egysegekSorrend.remove(egysegL2TestKep);

                    if (dbSzamMasodik < 10) {
                        egysegErtek2.setText(String.valueOf(String.format("%.2f", dbSzamMasodik)));
                    } else {
                        egysegErtek2.setText(String.valueOf(String.format("%.1f", dbSzamMasodik)));
                    }

                    if (vanKrit) {
                        informacioErtek.setText("<html><center><u>Krit!</u> " + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és " + Eletero.masodikEgysegEletero + " életereje maradt.</p></center></html>");
                    }else {
                    informacioErtek.setText("<html><center>" + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és " + Eletero.masodikEgysegEletero + " életereje maradt.</p></center></html>");
                    }


                    egysegIras2.add(egysegErtek2);
                    egysegL2TestKep.add(egysegL2TestKepe);
                    EgysegLathatosag.lathatosagSorrend(egysegIras2, egysegL2TestKep, oszlop, sor);
                    ablakCsata.add(egysegekSorrend);
                } else {
                    halottEgysegSzam++;
                    egysegekSorrend.remove(egysegIras2);
                    egysegekSorrend.remove(egysegL2TestKep);

                    ijas = 0;
                    egysegPozTorlese("ijas", sor, oszlop);

                    if (vanKrit) {
                        informacioErtek.setText("<html><center><u>Krit!</u> " + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                    }else {
                    informacioErtek.setText("<html><center>" + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                    }

                }
            }
            case "felder" -> {
                Eletero.masodikEgysegEletero -= sebzes;
                dbSzamMasodik = Eletero.masodikEgysegEletero / 10;
                if (Eletero.masodikEgysegEletero > 0) {

                    egysegekSorrend.remove(egysegIras2);
                    egysegekSorrend.remove(egysegL2TestKep);

                    if (dbSzamMasodik < 10) {
                        egysegErtek2.setText(String.valueOf(String.format("%.2f", dbSzamMasodik)));
                    } else {
                        egysegErtek2.setText(String.valueOf(String.format("%.1f", dbSzamMasodik)));
                    }

                    if (vanKrit) {
                        informacioErtek.setText("<html><center><u>Krit!</u> " + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és " + Eletero.masodikEgysegEletero + " életereje maradt.</p></center></html>");
                    }else {
                    informacioErtek.setText("<html><center>" + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és " + Eletero.masodikEgysegEletero + " életereje maradt.</p></center></html>");
                    }


                    egysegIras2.add(egysegErtek2);
                    egysegL2TestKep.add(egysegL2TestKepe);
                    EgysegLathatosag.lathatosagSorrend(egysegIras2, egysegL2TestKep, oszlop, sor);
                    ablakCsata.add(egysegekSorrend);
                } else {
                    halottEgysegSzam++;
                    egysegekSorrend.remove(egysegIras2);
                    egysegekSorrend.remove(egysegL2TestKep);

                    felder = 0;
                    egysegPozTorlese("felder", sor, oszlop);

                    if (vanKrit) {
                        informacioErtek.setText("<html><center><u>Krit!</u> " + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                    }else {
                    informacioErtek.setText("<html><center>" + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                    }

                }
            }
            case "grif" -> {
                Eletero.harmadikEgysegEletero -= sebzes;
                dbSzamHarmadik = Eletero.harmadikEgysegEletero / 30;
                if (Eletero.harmadikEgysegEletero > 0) {

                    egysegekSorrend.remove(egysegIras3);
                    egysegekSorrend.remove(egysegL3TestKep);

                    if (dbSzamHarmadik < 10) {
                        egysegErtek3.setText(String.valueOf(String.format("%.2f", dbSzamHarmadik)));
                    } else {
                        egysegErtek3.setText(String.valueOf(String.format("%.1f", dbSzamHarmadik)));
                    }

                    if (vanKrit) {
                        informacioErtek.setText("<html><center><u>Krit!</u> " + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és " + Eletero.harmadikEgysegEletero + " életereje maradt.</p></center></html>");
                    }else {
                    informacioErtek.setText("<html><center>" + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és " + Eletero.harmadikEgysegEletero + " életereje maradt.</p></center></html>");
                    }


                    egysegIras3.add(egysegErtek3);
                    egysegL3TestKep.add(egysegL3TestKepe);
                    EgysegLathatosag.lathatosagSorrend(egysegIras3, egysegL3TestKep, oszlop, sor);
                    ablakCsata.add(egysegekSorrend);
                } else {
                    halottEgysegSzam++;
                    egysegekSorrend.remove(egysegIras3);
                    egysegekSorrend.remove(egysegL3TestKep);

                    grif = 0;
                    egysegPozTorlese("grif", sor, oszlop);

                    if (vanKrit) {
                        informacioErtek.setText("<html><center><u>Krit!</u> " + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                    }else {
                    informacioErtek.setText("<html><center>" + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                    }

                }
            }
            case "mino" -> {
                Eletero.harmadikEgysegEletero -= sebzes;
                dbSzamHarmadik = Eletero.harmadikEgysegEletero / 80;
                if (Eletero.harmadikEgysegEletero > 0) {

                    egysegekSorrend.remove(egysegIras3);
                    egysegekSorrend.remove(egysegL3TestKep);

                    if (dbSzamHarmadik < 10) {
                        egysegErtek3.setText(String.valueOf(String.format("%.2f", dbSzamHarmadik)));
                    } else {
                        egysegErtek3.setText(String.valueOf(String.format("%.1f", dbSzamHarmadik)));
                    }

                    if (vanKrit) {
                        informacioErtek.setText("<html><center><u>Krit!</u> " + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és " + Eletero.harmadikEgysegEletero + " életereje maradt.</p></center></html>");
                    }else {
                    informacioErtek.setText("<html><center>" + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és " + Eletero.harmadikEgysegEletero + " életereje maradt.</p></center></html>");
                    }


                    egysegIras3.add(egysegErtek3);
                    egysegL3TestKep.add(egysegL3TestKepe);
                    EgysegLathatosag.lathatosagSorrend(egysegIras3, egysegL3TestKep, oszlop, sor);
                    ablakCsata.add(egysegekSorrend);
                } else {
                    halottEgysegSzam++;
                    egysegekSorrend.remove(egysegIras3);
                    egysegekSorrend.remove(egysegL3TestKep);

                    mino = 0;
                    egysegPozTorlese("mino", sor, oszlop);

                    if (vanKrit) {
                        informacioErtek.setText("<html><center><u>Krit!</u> " + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                    }else {
                    informacioErtek.setText("<html><center>" + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                    }

                }
            }
            case "fegyv" -> {
                Eletero.negyedikEgysegEletero -= sebzes;
                dbSzamNegyedik = Eletero.negyedikEgysegEletero / 33;
                if (Eletero.negyedikEgysegEletero > 0) {

                    egysegekSorrend.remove(egysegIras4);
                    egysegekSorrend.remove(egysegL4TestKep);

                    if (dbSzamNegyedik < 10) {
                        egysegErtek4.setText(String.valueOf(String.format("%.2f", dbSzamNegyedik)));
                    } else {
                        egysegErtek4.setText(String.valueOf(String.format("%.1f", dbSzamNegyedik)));
                    }

                    if (vanKrit) {
                        informacioErtek.setText("<html><center><u>Krit!</u> " + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és " + Eletero.negyedikEgysegEletero + " életereje maradt.</p></center></html>");
                    }else {
                    informacioErtek.setText("<html><center>" + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és " + Eletero.negyedikEgysegEletero + " életereje maradt.</p></center></html>");
                    }


                    egysegIras4.add(egysegErtek4);
                    egysegL4TestKep.add(egysegL4TestKepe);
                    EgysegLathatosag.lathatosagSorrend(egysegIras4, egysegL4TestKep, oszlop, sor);
                    ablakCsata.add(egysegekSorrend);
                } else {
                    halottEgysegSzam++;
                    egysegekSorrend.remove(egysegIras4);
                    egysegekSorrend.remove(egysegL4TestKep);

                    fegyv = 0;
                    egysegPozTorlese("fegyv", sor, oszlop);

                    if (vanKrit) {
                        informacioErtek.setText("<html><center><u>Krit!</u> " + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                    }else {
                    informacioErtek.setText("<html><center>" + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                    }

                }
            }
            case "orgy" -> {
                Eletero.negyedikEgysegEletero -= sebzes;
                dbSzamNegyedik = Eletero.negyedikEgysegEletero / 20;
                if (Eletero.negyedikEgysegEletero > 0) {

                    egysegekSorrend.remove(egysegIras4);
                    egysegekSorrend.remove(egysegL4TestKep);

                    if (dbSzamNegyedik < 10) {
                        egysegErtek4.setText(String.valueOf(String.format("%.2f", dbSzamNegyedik)));
                    } else {
                        egysegErtek4.setText(String.valueOf(String.format("%.1f", dbSzamNegyedik)));
                    }

                    if (vanKrit) {
                        informacioErtek.setText("<html><center><u>Krit!</u> " + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és " + Eletero.negyedikEgysegEletero + " életereje maradt.</p></center></html>");
                    }else {
                    informacioErtek.setText("<html><center>" + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és " + Eletero.negyedikEgysegEletero + " életereje maradt.</p></center></html>");
                    }


                    egysegIras4.add(egysegErtek4);
                    egysegL4TestKep.add(egysegL4TestKepe);
                    EgysegLathatosag.lathatosagSorrend(egysegIras4, egysegL4TestKep, oszlop, sor);
                    ablakCsata.add(egysegekSorrend);
                } else {
                    halottEgysegSzam++;
                    egysegekSorrend.remove(egysegIras4);
                    egysegekSorrend.remove(egysegL4TestKep);

                    orgy = 0;
                    egysegPozTorlese("orgy", sor, oszlop);

                    if (vanKrit) {
                        informacioErtek.setText("<html><center><u>Krit!</u> " + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                    }else {
                    informacioErtek.setText("<html><center>" + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                    }

                }
            }
            case "harcp" -> {
                Eletero.otodikEgysegEletero -= sebzes;
                dbSzamOtodik = Eletero.otodikEgysegEletero / 54;
                if (Eletero.otodikEgysegEletero > 0) {

                    egysegekSorrend.remove(egysegIras5);
                    egysegekSorrend.remove(egysegL5TestKep);

                    if (dbSzamOtodik < 10) {
                        egysegErtek5.setText(String.valueOf(String.format("%.2f", dbSzamOtodik)));
                    } else {
                        egysegErtek5.setText(String.valueOf(String.format("%.1f", dbSzamOtodik)));
                    }

                    if (vanKrit) {
                        informacioErtek.setText("<html><center><u>Krit!</u> " + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és " + Eletero.otodikEgysegEletero + " életereje maradt.</p></center></html>");
                    }else {
                    informacioErtek.setText("<html><center>" + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és " + Eletero.otodikEgysegEletero + " életereje maradt.</p></center></html>");
                    }


                    egysegIras5.add(egysegErtek5);
                    egysegL5TestKep.add(egysegL5TestKepe);
                    EgysegLathatosag.lathatosagSorrend(egysegIras5, egysegL5TestKep, oszlop, sor);
                    ablakCsata.add(egysegekSorrend);
                } else {
                    halottEgysegSzam++;
                    egysegekSorrend.remove(egysegIras5);
                    egysegekSorrend.remove(egysegL5TestKep);

                    harcp = 0;
                    egysegPozTorlese("harcp", sor, oszlop);

                    if (vanKrit) {
                        informacioErtek.setText("<html><center><u>Krit!</u> " + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                    }else {
                    informacioErtek.setText("<html><center>" + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                    }

                }
            }
            case "rapt" -> {
                Eletero.otodikEgysegEletero -= sebzes;
                dbSzamOtodik = Eletero.otodikEgysegEletero / 35;
                if (Eletero.otodikEgysegEletero > 0) {

                    egysegekSorrend.remove(egysegIras5);
                    egysegekSorrend.remove(egysegL5TestKep);

                    if (dbSzamOtodik < 10) {
                        egysegErtek5.setText(String.valueOf(String.format("%.2f", dbSzamOtodik)));
                    } else {
                        egysegErtek5.setText(String.valueOf(String.format("%.1f", dbSzamOtodik)));
                    }

                    if (vanKrit) {
                        informacioErtek.setText("<html><center><u>Krit!</u> " + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és " + Eletero.otodikEgysegEletero + " életereje maradt.</p></center></html>");
                    }else {
                    informacioErtek.setText("<html><center>" + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és " + Eletero.otodikEgysegEletero + " életereje maradt.</p></center></html>");
                    }


                    egysegIras5.add(egysegErtek5);
                    egysegL5TestKep.add(egysegL5TestKepe);
                    EgysegLathatosag.lathatosagSorrend(egysegIras5, egysegL5TestKep, oszlop, sor);
                    ablakCsata.add(egysegekSorrend);
                } else {
                    halottEgysegSzam++;
                    egysegekSorrend.remove(egysegIras5);
                    egysegekSorrend.remove(egysegL5TestKep);

                    rapt = 0;
                    egysegPozTorlese("rapt", sor, oszlop);

                    if (vanKrit) {
                        informacioErtek.setText("<html><center><u>Krit!</u> " + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                    }else {
                    informacioErtek.setText("<html><center>" + egysegNeve + " megtámadta " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                    }

                }
            }
        }

        if (halottEgysegSzam>0 || tavolsagi) {
            double ujErtek2 = moralSorrendTList.get(0);

            moralSorrendTList.remove(0);
            moralSorrendTList.add(ujErtek2);

            hanyadikKor(elsoHely);
            korokKiirasa();

            sorrendFrissites();
        }else if ( !tavolsagi && halottEgysegSzam==0 && (((kitTamad.equals("ecsont") && !ellEgysegVisszatamadas1) || (kitTamad.equals("efoldmuv") && !ellEgysegVisszatamadas1)) ||
                ((kitTamad.equals("efelder") && !ellEgysegVisszatamadas2) || (kitTamad.equals("eijas") && !ellEgysegVisszatamadas2)) ||
                ((kitTamad.equals("emino") && !ellEgysegVisszatamadas3) || (kitTamad.equals("egrif") && !ellEgysegVisszatamadas3)) ||
                ((kitTamad.equals("eorgy") && !ellEgysegVisszatamadas4) || (kitTamad.equals("efegyv") && !ellEgysegVisszatamadas4)) ||
                ((kitTamad.equals("erapt") && !ellEgysegVisszatamadas5) || (kitTamad.equals("eharcp") && !ellEgysegVisszatamadas5)) ||
                ((kitTamad.equals("csont") && !egysegVisszatamadas1) || (kitTamad.equals("foldmuv") && !egysegVisszatamadas1)) ||
                ((kitTamad.equals("felder") && !egysegVisszatamadas2) || (kitTamad.equals("ijas") && !egysegVisszatamadas2)) ||
                ((kitTamad.equals("mino") && !egysegVisszatamadas3) || (kitTamad.equals("grif") && !egysegVisszatamadas3)) ||
                ((kitTamad.equals("orgy") && !egysegVisszatamadas4) || (kitTamad.equals("fegyv") && !egysegVisszatamadas4)) ||
                ((kitTamad.equals("rapt") && !egysegVisszatamadas5) || (kitTamad.equals("harcp") && !egysegVisszatamadas5)))) {

            egysegSebzese(kitTamad);
            sebzesKiszamitasaEgyseg(kitTamad,elsoHely);
            sebzes= (int) Math.round((double) sebzes/2);
            System.out.println("Visszatamadas erteke: "+sebzes);
            informacioErtek.setText("Visszatámadás értéke: "+sebzes);

            Visszatamadas.Visszatamad(elsoHely,regiPozSor,regiPozOszlop);
        }
    }


    public static void egysegPozTorlese(String ki, int sor, int oszlop) {
        int hanyadik=1110;

        if (elsoHely.equals(ki)){
            hanyadik=0;
            elsoHely="n";
        }
        if(masodikHely.equals(ki)) {
            hanyadik=1;
            masodikHely="n";
        }
        if(harmadikHely.equals(ki)) {
            hanyadik=2;
            harmadikHely="n";
        }
        if(negyedikHely.equals(ki)) {
            hanyadik=3;
            negyedikHely="n";
        }
        if(otodikHely.equals(ki)) {
            hanyadik=4;
            otodikHely="n";
        }
        if(hatodikHely.equals(ki)) {
            hanyadik=5;
            hatodikHely="n";
        }
        if(hetedikHely.equals(ki)) {
            hanyadik=6;
            hetedikHely="n";
        }
        if(nyolcadikHely.equals(ki)) {
            hanyadik=7;
            nyolcadikHely="n";
        }
        if(kilencedikHely.equals(ki)) {
            hanyadik=8;
            kilencedikHely="n";
        }
        if(tizedikHely.equals(ki)) {
            hanyadik=9;
            tizedikHely="n";
        }
        if(tizenegyedikHely.equals(ki)) {
            hanyadik=10;
            tizenegyedikHely="n";
        }
        if(tizenkettedikHely.equals(ki)) {
            hanyadik=11;
            tizenkettedikHely="n";
        }

        moralSorrendTList.remove(hanyadik);
        sorrendFrissites();

        if (moralSorrendTList.size()==2) {
            harmadikHely="n";
        } else if (moralSorrendTList.size()==3) {
            negyedikHely="n";
        }else if (moralSorrendTList.size()==4) {
            otodikHely="n";
        }else if (moralSorrendTList.size()==5) {
            hatodikHely="n";
        }else if (moralSorrendTList.size()==6) {
            hetedikHely="n";
        }else if (moralSorrendTList.size()==7) {
            nyolcadikHely="n";
        }else if (moralSorrendTList.size()==8) {
            kilencedikHely="n";
        }else if (moralSorrendTList.size()==9) {
            tizedikHely="n";
        }else if (moralSorrendTList.size()==10) {
            tizenegyedikHely="n";
        }else if (moralSorrendTList.size()==11) {
            tizenkettedikHely="n";
        }

        switch (ki) {
            case "ecsont", "efoldmuv" -> elozoPozTorlese(elsoEllPoz);
            case "efelder", "eijas" -> elozoPozTorlese(masodikEllPoz);
            case "emino", "egrif" -> elozoPozTorlese(harmadikEllPoz);
            case "eorgy", "efegyv" -> elozoPozTorlese(negyedikEllPoz);
            case "erapt", "eharcp" -> elozoPozTorlese(otodikEllPoz);
            case "csont", "foldmuv" -> elozoPozTorlese(elsoEgysegPoz);
            case "felder", "ijas" -> elozoPozTorlese(masodikEgysegPoz);
            case "mino", "grif" -> elozoPozTorlese(harmadikEgysegPoz);
            case "orgy", "fegyv" -> elozoPozTorlese(negyedikEgysegPoz);
            case "rapt", "harcp" -> elozoPozTorlese(otodikEgysegPoz);
        }

        if (sor == 10 && oszlop == 1 &&  !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor10oszlop1Nev="n";
        } else if (sor == 10 && oszlop == 2 &&  !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor10oszlop2Nev="n";
        } else if (sor == 9 && oszlop == 1 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor9oszlop1Nev="n";
        } else if (sor == 9 && oszlop == 2 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor9oszlop2Nev="n";
        } else if (sor == 8 && oszlop == 1 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor8oszlop1Nev="n";
        } else if (sor == 8 && oszlop == 2 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor8oszlop2Nev="n";
        } else if (sor == 7 && oszlop == 1 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor7oszlop1Nev="n";
        } else if (sor == 7 && oszlop == 2 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor7oszlop2Nev="n";
        } else if (sor == 6 && oszlop == 1 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor6oszlop1Nev="n";
        } else if (sor == 6 && oszlop == 2 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor6oszlop2Nev="n";
        } else if (sor == 5 && oszlop == 1 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor5oszlop1Nev="n";
        } else if (sor == 5 && oszlop == 2 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor5oszlop2Nev="n";
        } else if (sor == 4 && oszlop == 1 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor4oszlop1Nev="n";
        } else if (sor == 4 && oszlop == 2 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor4oszlop2Nev="n";
        } else if (sor == 3 && oszlop == 1 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor3oszlop1Nev="n";
        } else if (sor == 3 && oszlop == 2 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor3oszlop2Nev="n";
        } else if (sor == 2 && oszlop == 1 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor2oszlop1Nev="n";
        } else if (sor == 2 && oszlop == 2 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor2oszlop2Nev="n";
        } else if (sor == 1 && oszlop == 1 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor1oszlop1Nev="n";
        } else if (sor == 1 && oszlop == 2 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor1oszlop2Nev="n";
        } else if (sor == 8 && oszlop == 3 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor8oszlop3Nev="n";
        } else if (sor == 7 && oszlop == 3 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor7oszlop3Nev="n";
        } else if (sor == 6 && oszlop == 3 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor6oszlop3Nev="n";
        } else if (sor == 5 && oszlop == 3 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor5oszlop3Nev="n";
        } else if (sor == 4 && oszlop == 3 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor4oszlop3Nev="n";
        } else if (sor == 3 && oszlop == 3 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor3oszlop3Nev="n";
        } else if (sor == 2 && oszlop == 3 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor2oszlop3Nev="n";
        } else if (sor == 1 && oszlop == 3 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor1oszlop3Nev="n";
        } else if (sor == 8 && oszlop == 4 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor8oszlop4Nev="n";
        } else if (sor == 7 && oszlop == 4 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor7oszlop4Nev="n";
        } else if (sor == 5 && oszlop == 4 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor5oszlop4Nev="n";
        } else if (sor == 4 && oszlop == 4 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor4oszlop4Nev="n";
        } else if (sor == 3 && oszlop == 4 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor3oszlop4Nev="n";
        } else if (sor == 2 && oszlop == 4 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor2oszlop4Nev="n";
        } else if (sor == 1 && oszlop == 4 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor1oszlop4Nev="n";
        } else if (sor == 10 && oszlop == 5 &&  !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor10oszlop5Nev="n";
        } else if (sor == 9 && oszlop == 5 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor9oszlop5Nev="n";
        } else if (sor == 8 && oszlop == 5 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor8oszlop5Nev="n";
        } else if (sor == 7 && oszlop == 5 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor7oszlop5Nev="n";
        } else if (sor == 6 && oszlop == 5 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor6oszlop5Nev="n";
        } else if (sor == 5 && oszlop == 5 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor5oszlop5Nev="n";
        } else if (sor == 4 && oszlop == 5 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor4oszlop5Nev="n";
        } else if (sor == 3 && oszlop == 5 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor3oszlop5Nev="n";
        } else if (sor == 2 && oszlop == 5 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor2oszlop5Nev="n";
        } else if (sor == 1 && oszlop == 5 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor1oszlop5Nev="n";
        } else if (sor == 10 && oszlop == 6 &&  !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor10oszlop6Nev="n";
        } else if (sor == 9 && oszlop == 6 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor9oszlop6Nev="n";
        } else if (sor == 7 && oszlop == 6 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor7oszlop6Nev="n";
        } else if (sor == 6 && oszlop == 6 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor6oszlop6Nev="n";
        } else if (sor == 5 && oszlop == 6 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor5oszlop6Nev="n";
        } else if (sor == 4 && oszlop == 6 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor4oszlop6Nev="n";
        } else if (sor == 3 && oszlop == 6 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor3oszlop6Nev="n";
        } else if (sor == 2 && oszlop == 6 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor2oszlop6Nev="n";
        } else if (sor == 1 && oszlop == 6 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor1oszlop6Nev="n";
        } else if (sor == 10 && oszlop == 7 &&  !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor10oszlop7Nev="n";
        } else if (sor == 9 && oszlop == 7 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor9oszlop7Nev="n";
        } else if (sor == 7 && oszlop == 7 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor7oszlop7Nev="n";
        } else if (sor == 6 && oszlop == 7 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor6oszlop7Nev="n";
        } else if (sor == 5 && oszlop == 7 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor5oszlop7Nev="n";
        } else if (sor == 4 && oszlop == 7 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor4oszlop7Nev="n";
        } else if (sor == 3 && oszlop == 7 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor3oszlop7Nev="n";
        } else if (sor == 2 && oszlop == 7 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor2oszlop7Nev="n";
        } else if (sor == 1 && oszlop == 7 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor1oszlop7Nev="n";
        } else if (sor == 10 && oszlop == 8 &&  !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor10oszlop8Nev="n";
        } else if (sor == 9 && oszlop == 8 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor9oszlop8Nev="n";
        } else if (sor == 8 && oszlop == 8 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor8oszlop8Nev="n";
        } else if (sor == 6 && oszlop == 8 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor6oszlop8Nev="n";
        } else if (sor == 5 && oszlop == 8 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor5oszlop8Nev="n";
        } else if (sor == 4 && oszlop == 8 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor4oszlop8Nev="n";
        } else if (sor == 3 && oszlop == 8 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor3oszlop8Nev="n";
        } else if (sor == 2 && oszlop == 8 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor2oszlop8Nev="n";
        } else if (sor == 1 && oszlop == 8 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor1oszlop8Nev="n";
        } else if (sor == 10 && oszlop == 9 &&  !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor10oszlop9Nev="n";
        } else if (sor == 9 && oszlop == 9 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor9oszlop9Nev="n";
        } else if (sor == 8 && oszlop == 9 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor8oszlop9Nev="n";
        } else if (sor == 6 && oszlop == 9 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor6oszlop9Nev="n";
        } else if (sor == 5 && oszlop == 9 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor5oszlop9Nev="n";
        } else if (sor == 4 && oszlop == 9 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor4oszlop9Nev="n";
        } else if (sor == 3 && oszlop == 9 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor3oszlop9Nev="n";
        } else if (sor == 2 && oszlop == 9 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor2oszlop9Nev="n";
        } else if (sor == 1 && oszlop == 9 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor1oszlop9Nev="n";
        } else if (sor == 10 && oszlop == 10 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor10oszlop10Nev="n";
        } else if (sor == 9 && oszlop == 10 &&  !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor9oszlop10Nev="n";
        } else if (sor == 8 && oszlop == 10 &&  !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor8oszlop10Nev="n";
        } else if (sor == 7 && oszlop == 10 &&  !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor7oszlop10Nev="n";
        } else if (sor == 6 && oszlop == 10 &&  !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor6oszlop10Nev="n";
        } else if (sor == 5 && oszlop == 10 &&  !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor5oszlop10Nev="n";
        } else if (sor == 4 && oszlop == 10 &&  !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor4oszlop10Nev="n";
        } else if (sor == 3 && oszlop == 10 &&  !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor3oszlop10Nev="n";
        } else if (sor == 2 && oszlop == 10 &&  !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor2oszlop10Nev="n";
        } else if (sor == 1 && oszlop == 10 &&  !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor1oszlop10Nev="n";
        } else if (sor == 10 && oszlop == 11 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor10oszlop11Nev="n";
        } else if (sor == 9 && oszlop == 11 &&  !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor9oszlop11Nev="n";
        } else if (sor == 8 && oszlop == 11 &&  !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor8oszlop11Nev="n";
        } else if (sor == 7 && oszlop == 11 &&  !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor7oszlop11Nev="n";
        } else if (sor == 6 && oszlop == 11 &&  !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor6oszlop11Nev="n";
        } else if (sor == 5 && oszlop == 11 &&  !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor5oszlop11Nev="n";
        } else if (sor == 4 && oszlop == 11 &&  !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor4oszlop11Nev="n";
        } else if (sor == 3 && oszlop == 11 &&  !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor3oszlop11Nev="n";
        } else if (sor == 2 && oszlop == 11 &&  !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor2oszlop11Nev="n";
        } else if (sor == 1 && oszlop == 11 &&  !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor1oszlop11Nev="n";
        } else if (sor == 10 && oszlop == 12 && !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor10oszlop12Nev="n";
        } else if (sor == 9 && oszlop == 12 &&  !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor9oszlop12Nev="n";
        } else if (sor == 8 && oszlop == 12 &&  !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor8oszlop12Nev="n";
        } else if (sor == 7 && oszlop == 12 &&  !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor7oszlop12Nev="n";
        } else if (sor == 6 && oszlop == 12 &&  !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor6oszlop12Nev="n";
        } else if (sor == 5 && oszlop == 12 &&  !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor5oszlop12Nev="n";
        } else if (sor == 4 && oszlop == 12 &&  !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor4oszlop12Nev="n";
        } else if (sor == 3 && oszlop == 12 &&  !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor3oszlop12Nev="n";
        } else if (sor == 2 && oszlop == 12 &&  !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor2oszlop12Nev="n";
        } else if (sor == 1 && oszlop == 12 &&  !elsoHely.equals("morLena") && !elsoHely.equals("morLaszlo")) {
            sor1oszlop12Nev="n";
        }
    }


    public static void tamadasSzurkites(int regiPozSorL,int regiPozOszlopL) {
        int poz=Integer.parseInt(String.valueOf(regiPozSorL) + String.valueOf(regiPozOszlopL));

        if (poz==11) {
            palyaS1O1.setBorderPainted(true);
            palyaS1O1.setIcon(szurkes);
            palyaS1O1.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==12) {
            palyaS1O2.setBorderPainted(true);
            palyaS1O2.setIcon(szurkes);
            palyaS1O2.setBorder(null);
              palyaS1O2.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==13) {
            palyaS1O3.setBorderPainted(true);
            palyaS1O3.setIcon(szurkes);
            palyaS1O3.setBorder(null);
              palyaS1O3.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==14) {
            palyaS1O4.setBorderPainted(true);
            palyaS1O4.setIcon(szurkes);
            palyaS1O4.setBorder(null);
              palyaS1O4.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==15) {
            palyaS1O5.setBorderPainted(true);
            palyaS1O5.setIcon(szurkes);
            palyaS1O5.setBorder(null);
              palyaS1O5.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==16) {
            palyaS1O6.setBorderPainted(true);
            palyaS1O6.setIcon(szurkes);
            palyaS1O6.setBorder(null);
              palyaS1O6.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==17) {
            palyaS1O7.setBorderPainted(true);
            palyaS1O7.setIcon(szurkes);
            palyaS1O7.setBorder(null);
              palyaS1O7.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==18) {
            palyaS1O8.setBorderPainted(true);
            palyaS1O8.setIcon(szurkes);
            palyaS1O8.setBorder(null);
              palyaS1O8.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==19) {
            palyaS1O9.setBorderPainted(true);
            palyaS1O9.setIcon(szurkes);
            palyaS1O9.setBorder(null);
              palyaS1O9.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==110 ) {
            palyaS1O10.setBorderPainted(true);
            palyaS1O10.setIcon(szurkes);
            palyaS1O10.setBorder(null);
             palyaS1O10.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==111 ) {
            palyaS1O11.setBorderPainted(true);
            palyaS1O11.setIcon(szurkes);
            palyaS1O11.setBorder(null);
             palyaS1O11.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==112 ) {
            palyaS1O12.setBorderPainted(true);
            palyaS1O12.setIcon(szurkes);
            palyaS1O12.setBorder(null);
             palyaS1O12.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }


        if (poz==21) {
            palyaS2O1.setBorderPainted(true);
            palyaS2O1.setIcon(szurkes);
            palyaS2O1.setBorder(null);
              palyaS2O1.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==22) {
            palyaS2O2.setBorderPainted(true);
            palyaS2O2.setIcon(szurkes);
            palyaS2O2.setBorder(null);
              palyaS2O2.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==23) {
            palyaS2O3.setBorderPainted(true);
            palyaS2O3.setIcon(szurkes);
            palyaS2O3.setBorder(null);
              palyaS2O3.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==24) {
            palyaS2O4.setBorderPainted(true);
            palyaS2O4.setIcon(szurkes);
            palyaS2O4.setBorder(null);
              palyaS2O4.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==25) {
            palyaS2O5.setBorderPainted(true);
            palyaS2O5.setIcon(szurkes);
            palyaS2O5.setBorder(null);
              palyaS2O5.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==26) {
            palyaS2O6.setBorderPainted(true);
            palyaS2O6.setIcon(szurkes);
            palyaS2O6.setBorder(null);
              palyaS2O6.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==27) {
            palyaS2O7.setBorderPainted(true);
            palyaS2O7.setIcon(szurkes);
            palyaS2O7.setBorder(null);
              palyaS2O7.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==28) {
            palyaS2O8.setBorderPainted(true);
            palyaS2O8.setIcon(szurkes);
            palyaS2O8.setBorder(null);
              palyaS2O8.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==29) {
            palyaS2O9.setBorderPainted(true);
            palyaS2O9.setIcon(szurkes);
            palyaS2O9.setBorder(null);
              palyaS2O9.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==210 ) {
            palyaS2O10.setBorderPainted(true);
            palyaS2O10.setIcon(szurkes);
            palyaS2O10.setBorder(null);
             palyaS2O10.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==211 ) {
            palyaS2O11.setBorderPainted(true);
            palyaS2O11.setIcon(szurkes);
            palyaS2O11.setBorder(null);
             palyaS2O11.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==212 ) {
            palyaS2O12.setBorderPainted(true);
            palyaS2O12.setIcon(szurkes);
            palyaS2O12.setBorder(null);
             palyaS2O12.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }


        if (poz==31) {
            palyaS3O1.setBorderPainted(true);
            palyaS3O1.setIcon(szurkes);
            palyaS3O1.setBorder(null);
              palyaS3O1.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==32) {
            palyaS3O2.setBorderPainted(true);
            palyaS3O2.setIcon(szurkes);
            palyaS3O2.setBorder(null);
              palyaS3O2.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==33) {
            palyaS3O3.setBorderPainted(true);
            palyaS3O3.setIcon(szurkes);
            palyaS3O3.setBorder(null);
              palyaS3O3.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==34) {
            palyaS3O4.setBorderPainted(true);
            palyaS3O4.setIcon(szurkes);
            palyaS3O4.setBorder(null);
              palyaS3O4.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==35) {
            palyaS3O5.setBorderPainted(true);
            palyaS3O5.setIcon(szurkes);
            palyaS3O5.setBorder(null);
              palyaS3O5.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==36) {
            palyaS3O6.setBorderPainted(true);
            palyaS3O6.setIcon(szurkes);
            palyaS3O6.setBorder(null);
              palyaS3O6.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==37) {
            palyaS3O7.setBorderPainted(true);
            palyaS3O7.setIcon(szurkes);
            palyaS3O7.setBorder(null);
              palyaS3O7.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==38) {
            palyaS3O8.setBorderPainted(true);
            palyaS3O8.setIcon(szurkes);
            palyaS3O8.setBorder(null);
              palyaS3O8.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==39) {
            palyaS3O9.setBorderPainted(true);
            palyaS3O9.setIcon(szurkes);
            palyaS3O9.setBorder(null);
              palyaS3O9.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==310 ) {
            palyaS3O10.setBorderPainted(true);
            palyaS3O10.setIcon(szurkes);
            palyaS3O10.setBorder(null);
             palyaS3O10.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==311 ) {
            palyaS3O11.setBorderPainted(true);
            palyaS3O11.setIcon(szurkes);
            palyaS3O11.setBorder(null);
             palyaS3O11.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==312 ) {
            palyaS3O12.setBorderPainted(true);
            palyaS3O12.setIcon(szurkes);
            palyaS3O12.setBorder(null);
             palyaS3O12.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }


        if (poz==41) {
            palyaS4O1.setBorderPainted(true);
            palyaS4O1.setIcon(szurkes);
            palyaS4O1.setBorder(null);
              palyaS4O1.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==42) {
            palyaS4O2.setBorderPainted(true);
            palyaS4O2.setIcon(szurkes);
            palyaS4O2.setBorder(null);
              palyaS4O2.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==43) {
            palyaS4O3.setBorderPainted(true);
            palyaS4O3.setIcon(szurkes);
            palyaS4O3.setBorder(null);
              palyaS4O3.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==44) {
            palyaS4O4.setBorderPainted(true);
            palyaS4O4.setIcon(szurkes);
            palyaS4O4.setBorder(null);
              palyaS4O4.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==45) {
            palyaS4O5.setBorderPainted(true);
            palyaS4O5.setIcon(szurkes);
            palyaS4O5.setBorder(null);
              palyaS4O5.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==46) {
            palyaS4O6.setBorderPainted(true);
            palyaS4O6.setIcon(szurkes);
            palyaS4O6.setBorder(null);
              palyaS4O6.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==47) {
            palyaS4O7.setBorderPainted(true);
            palyaS4O7.setIcon(szurkes);
            palyaS4O7.setBorder(null);
              palyaS4O7.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==48) {
            palyaS4O8.setBorderPainted(true);
            palyaS4O8.setIcon(szurkes);
            palyaS4O8.setBorder(null);
              palyaS4O8.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==49) {
            palyaS4O9.setBorderPainted(true);
            palyaS4O9.setIcon(szurkes);
            palyaS4O9.setBorder(null);
              palyaS4O9.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==410 ) {
            palyaS4O10.setBorderPainted(true);
            palyaS4O10.setIcon(szurkes);
            palyaS4O10.setBorder(null);
             palyaS4O10.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==411 ) {
            palyaS4O11.setBorderPainted(true);
            palyaS4O11.setIcon(szurkes);
            palyaS4O11.setBorder(null);
             palyaS4O11.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==412 ) {
            palyaS4O12.setBorderPainted(true);
            palyaS4O12.setIcon(szurkes);
            palyaS4O12.setBorder(null);
             palyaS4O12.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }


        if (poz==51) {
            palyaS5O1.setBorderPainted(true);
            palyaS5O1.setIcon(szurkes);
            palyaS5O1.setBorder(null);
              palyaS5O1.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==52) {
            palyaS5O2.setBorderPainted(true);
            palyaS5O2.setIcon(szurkes);
            palyaS5O2.setBorder(null);
              palyaS5O2.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==53) {
            palyaS5O3.setBorderPainted(true);
            palyaS5O3.setIcon(szurkes);
            palyaS5O3.setBorder(null);
              palyaS5O3.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==54) {
            palyaS5O4.setBorderPainted(true);
            palyaS5O4.setIcon(szurkes);
            palyaS5O4.setBorder(null);
              palyaS5O4.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==55) {
            palyaS5O5.setBorderPainted(true);
            palyaS5O5.setIcon(szurkes);
            palyaS5O5.setBorder(null);
              palyaS5O5.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==56) {
            palyaS5O6.setBorderPainted(true);
            palyaS5O6.setIcon(szurkes);
            palyaS5O6.setBorder(null);
              palyaS5O6.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==57) {
            palyaS5O7.setBorderPainted(true);
            palyaS5O7.setIcon(szurkes);
            palyaS5O7.setBorder(null);
              palyaS5O7.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==58) {
            palyaS5O8.setBorderPainted(true);
            palyaS5O8.setIcon(szurkes);
            palyaS5O8.setBorder(null);
              palyaS5O8.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==59) {
            palyaS5O9.setBorderPainted(true);
            palyaS5O9.setIcon(szurkes);
            palyaS5O9.setBorder(null);
              palyaS5O9.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==510 ) {
            palyaS5O10.setBorderPainted(true);
            palyaS5O10.setIcon(szurkes);
            palyaS5O10.setBorder(null);
             palyaS5O10.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==511 ) {
            palyaS5O11.setBorderPainted(true);
            palyaS5O11.setIcon(szurkes);
            palyaS5O11.setBorder(null);
             palyaS5O11.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==512 ) {
            palyaS5O12.setBorderPainted(true);
            palyaS5O12.setIcon(szurkes);
            palyaS5O12.setBorder(null);
             palyaS5O12.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }


        if (poz==61) {
            palyaS6O1.setBorderPainted(true);
            palyaS6O1.setIcon(szurkes);
            palyaS6O1.setBorder(null);
              palyaS6O1.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==62) {
            palyaS6O2.setBorderPainted(true);
            palyaS6O2.setIcon(szurkes);
            palyaS6O2.setBorder(null);
              palyaS6O2.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==63) {
            palyaS6O3.setBorderPainted(true);
            palyaS6O3.setIcon(szurkes);
            palyaS6O3.setBorder(null);
              palyaS6O3.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==65) {
            palyaS6O5.setBorderPainted(true);
            palyaS6O5.setIcon(szurkes);
            palyaS6O5.setBorder(null);
              palyaS6O5.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==66) {
            palyaS6O6.setBorderPainted(true);
            palyaS6O6.setIcon(szurkes);
            palyaS6O6.setBorder(null);
              palyaS6O6.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==67) {
            palyaS6O7.setBorderPainted(true);
            palyaS6O7.setIcon(szurkes);
            palyaS6O7.setBorder(null);
              palyaS6O7.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==68) {
            palyaS6O8.setBorderPainted(true);
            palyaS6O8.setIcon(szurkes);
            palyaS6O8.setBorder(null);
              palyaS6O8.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==69) {
            palyaS6O9.setBorderPainted(true);
            palyaS6O9.setIcon(szurkes);
            palyaS6O9.setBorder(null);
              palyaS6O9.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==610 ) {
            palyaS6O10.setBorderPainted(true);
            palyaS6O10.setIcon(szurkes);
            palyaS6O10.setBorder(null);
             palyaS6O10.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==611 ) {
            palyaS6O11.setBorderPainted(true);
            palyaS6O11.setIcon(szurkes);
            palyaS6O11.setBorder(null);
             palyaS6O11.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==612 ) {
            palyaS6O12.setBorderPainted(true);
            palyaS6O12.setIcon(szurkes);
            palyaS6O12.setBorder(null);
             palyaS6O12.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }


        if (poz==71) {
            palyaS7O1.setBorderPainted(true);
            palyaS7O1.setIcon(szurkes);
            palyaS7O1.setBorder(null);
              palyaS7O1.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==72) {
            palyaS7O2.setBorderPainted(true);
            palyaS7O2.setIcon(szurkes);
            palyaS7O2.setBorder(null);
              palyaS7O2.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==73) {
            palyaS7O3.setBorderPainted(true);
            palyaS7O3.setIcon(szurkes);
            palyaS7O3.setBorder(null);
              palyaS7O3.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==74) {
            palyaS7O4.setBorderPainted(true);
            palyaS7O4.setIcon(szurkes);
            palyaS7O4.setBorder(null);
              palyaS7O4.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==75) {
            palyaS7O5.setBorderPainted(true);
            palyaS7O5.setIcon(szurkes);
            palyaS7O5.setBorder(null);
              palyaS7O5.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==76) {
            palyaS7O6.setBorderPainted(true);
            palyaS7O6.setIcon(szurkes);
            palyaS7O6.setBorder(null);
              palyaS7O6.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==77) {
            palyaS7O7.setBorderPainted(true);
            palyaS7O7.setIcon(szurkes);
            palyaS7O7.setBorder(null);
              palyaS7O7.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==710 ) {
            palyaS7O10.setBorderPainted(true);
            palyaS7O10.setIcon(szurkes);
            palyaS7O10.setBorder(null);
             palyaS7O10.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==711 ) {
            palyaS7O11.setBorderPainted(true);
            palyaS7O11.setIcon(szurkes);
            palyaS7O11.setBorder(null);
             palyaS7O11.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==712 ) {
            palyaS7O12.setBorderPainted(true);
            palyaS7O12.setIcon(szurkes);
            palyaS7O12.setBorder(null);
             palyaS7O12.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }


        if (poz==81) {
            palyaS8O1.setBorderPainted(true);
            palyaS8O1.setIcon(szurkes);
            palyaS8O1.setBorder(null);
              palyaS8O1.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==82) {
            palyaS8O2.setBorderPainted(true);
            palyaS8O2.setIcon(szurkes);
            palyaS8O2.setBorder(null);
              palyaS8O2.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==83) {
            palyaS8O3.setBorderPainted(true);
            palyaS8O3.setIcon(szurkes);
            palyaS8O3.setBorder(null);
              palyaS8O3.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==84) {
            palyaS8O4.setBorderPainted(true);
            palyaS8O4.setIcon(szurkes);
            palyaS8O4.setBorder(null);
              palyaS8O4.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==85) {
            palyaS8O5.setBorderPainted(true);
            palyaS8O5.setIcon(szurkes);
            palyaS8O5.setBorder(null);
              palyaS8O5.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==88) {
            palyaS8O8.setBorderPainted(true);
            palyaS8O8.setIcon(szurkes);
            palyaS8O8.setBorder(null);
              palyaS8O8.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==89) {
            palyaS8O9.setBorderPainted(true);
            palyaS8O9.setIcon(szurkes);
            palyaS8O9.setBorder(null);
              palyaS8O9.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==810 ) {
            palyaS8O10.setBorderPainted(true);
            palyaS8O10.setIcon(szurkes);
            palyaS8O10.setBorder(null);
             palyaS8O10.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==811 ) {
            palyaS8O11.setBorderPainted(true);
            palyaS8O11.setIcon(szurkes);
            palyaS8O11.setBorder(null);
             palyaS8O11.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==812 ) {
            palyaS8O12.setBorderPainted(true);
            palyaS8O12.setIcon(szurkes);
            palyaS8O12.setBorder(null);
             palyaS8O12.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }


        if (poz==91) {
            palyaS9O1.setBorderPainted(true);
            palyaS9O1.setIcon(szurkes);
            palyaS9O1.setBorder(null);
              palyaS9O1.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==92) {
            palyaS9O2.setBorderPainted(true);
            palyaS9O2.setIcon(szurkes);
            palyaS9O2.setBorder(null);
              palyaS9O2.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==95) {
            palyaS9O5.setBorderPainted(true);
            palyaS9O5.setIcon(szurkes);
            palyaS9O5.setBorder(null);
              palyaS9O5.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==96) {
            palyaS9O6.setBorderPainted(true);
            palyaS9O6.setIcon(szurkes);
            palyaS9O6.setBorder(null);
              palyaS9O6.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==97) {
            palyaS9O7.setBorderPainted(true);
            palyaS9O7.setIcon(szurkes);
            palyaS9O7.setBorder(null);
              palyaS9O7.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==98) {
            palyaS9O8.setBorderPainted(true);
            palyaS9O8.setIcon(szurkes);
            palyaS9O8.setBorder(null);
              palyaS9O8.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==99) {
            palyaS9O9.setBorderPainted(true);
            palyaS9O9.setIcon(szurkes);
            palyaS9O9.setBorder(null);
              palyaS9O9.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==910 ) {
            palyaS9O10.setBorderPainted(true);
            palyaS9O10.setIcon(szurkes);
            palyaS9O10.setBorder(null);
             palyaS9O10.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==911 ) {
            palyaS9O11.setBorderPainted(true);
            palyaS9O11.setIcon(szurkes);
            palyaS9O11.setBorder(null);
             palyaS9O11.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==912 ) {
            palyaS9O12.setBorderPainted(true);
            palyaS9O12.setIcon(szurkes);
            palyaS9O12.setBorder(null);
             palyaS9O12.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }


        if (poz==101 ) {
            palyaS10O1.setBorderPainted(true);
            palyaS10O1.setIcon(szurkes);
            palyaS10O1.setBorder(null);
             palyaS10O1.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==102 ) {
            palyaS10O2.setBorderPainted(true);
            palyaS10O2.setIcon(szurkes);
            palyaS10O2.setBorder(null);
             palyaS10O2.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==105 ) {
            palyaS10O5.setBorderPainted(true);
            palyaS10O5.setIcon(szurkes);
            palyaS10O5.setBorder(null);
             palyaS10O5.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==106 ) {
            palyaS10O6.setBorderPainted(true);
            palyaS10O6.setIcon(szurkes);
            palyaS10O6.setBorder(null);
             palyaS10O6.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==107 ) {
            palyaS10O7.setBorderPainted(true);
            palyaS10O7.setIcon(szurkes);
            palyaS10O7.setBorder(null);
             palyaS10O7.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==108 ) {
            palyaS10O8.setBorderPainted(true);
            palyaS10O8.setIcon(szurkes);
            palyaS10O8.setBorder(null);
             palyaS10O8.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==109 ) {
            palyaS10O9.setBorderPainted(true);
            palyaS10O9.setIcon(szurkes);
            palyaS10O9.setBorder(null);
             palyaS10O9.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==1010) {
            palyaS10O10.setBorderPainted(true);
            palyaS10O10.setIcon(szurkes);
            palyaS10O10.setBorder(null);
            palyaS10O10.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==1011 ) {
            palyaS10O11.setBorderPainted(true);
            palyaS10O11.setIcon(szurkes);
            palyaS10O11.setBorder(null);
            palyaS10O11.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (poz==1012 ) {
            palyaS10O12.setBorderPainted(true);
            palyaS10O12.setIcon(szurkes);
            palyaS10O12.setBorder(null);
            palyaS10O12.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
    }
}