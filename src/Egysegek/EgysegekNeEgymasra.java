package Egysegek;

import static Jatek.Sorrend.regiPozOszlop;
import static Jatek.Sorrend.regiPozSor;
import static Jatek.XYKordinatakBemenet.*;

public class EgysegekNeEgymasra {

    public static int csontEgymasra =0, foldmuvEgymasra =0, ijasEgymasra =0, felderEgymasra =0,
            grifEgymasra =0, fegyvEgymasra =0, orgyEgymasra =0, minoEgymasra =0, raptEgymasra =0, harcpEgymasra =0;
    public static int ecsontEgymasra =0, efoldmuvEgymasra =0, eijasEgymasra =0, efelderEgymasra =0,
            egrifEgymasra =0, efegyvEgymasra =0, eorgyEgymasra =0, eminoEgymasra =0, eraptEgymasra =0, eharcpEgymasra =0;
    public static String pozTamadhatoCsont ="k", pozTamadhatoFoldmuv ="k", pozTamadhatoIjas ="k", pozTamadhatoFelder ="k",
    pozTamadhatoGrif ="k" , pozTamadhatoFegyv ="k", pozTamadhatoOrgy ="k", pozTamadhatoMino ="k", pozTamadhatoRapt ="k", pozTamadhatoHarcp ="k";

    public static void neMenjenEgymasraVan(int oszlop, int sor, String egyseg) {

        if (sor==10 && oszlop==1 && !sor10oszlop1 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor10oszlop1= true;
            sor10oszlop1Nev=egyseg;
        }else if (sor==10 && oszlop==2 && !sor10oszlop2 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor10oszlop2= true;
            sor10oszlop2Nev=egyseg;
        }else if (sor==9 && oszlop==1 && !sor9oszlop1 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor9oszlop1= true;
            sor9oszlop1Nev=egyseg;
        }else if (sor==9 && oszlop==2 && !sor9oszlop2 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor9oszlop2= true;
            sor9oszlop2Nev=egyseg;
        }else if (sor==8 && oszlop==1 && !sor8oszlop1 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor8oszlop1= true;
            sor8oszlop1Nev=egyseg;
        }else if (sor==8 && oszlop==2 && !sor8oszlop2 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor8oszlop2= true;
            sor8oszlop2Nev=egyseg;
        }else if (sor==7 && oszlop==1 && !sor7oszlop1 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor7oszlop1= true;
            sor7oszlop1Nev=egyseg;
        }else if (sor==7 && oszlop==2 && !sor7oszlop2 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor7oszlop2= true;
            sor7oszlop2Nev=egyseg;
        }else if (sor==6 && oszlop==1 && !sor6oszlop1 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor6oszlop1= true;
            sor6oszlop1Nev=egyseg;
        }else if (sor==6 && oszlop==2 && !sor6oszlop2 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor6oszlop2= true;
            sor6oszlop2Nev=egyseg;
        }else if (sor==5 && oszlop==1 && !sor5oszlop1 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor5oszlop1= true;
            sor5oszlop1Nev=egyseg;
        }else if (sor==5 && oszlop==2 && !sor5oszlop2 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor5oszlop2= true;
            sor5oszlop2Nev=egyseg;
        }else if (sor==4 && oszlop==1 && !sor4oszlop1 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor4oszlop1= true;
            sor4oszlop1Nev=egyseg;
        }else if (sor==4 && oszlop==2 && !sor4oszlop2 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor4oszlop2= true;
            sor4oszlop2Nev=egyseg;
        }else if (sor==3 && oszlop==1 && !sor3oszlop1 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor3oszlop1= true;
            sor3oszlop1Nev=egyseg;
        }else if (sor==3 && oszlop==2 && !sor3oszlop2 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor3oszlop2= true;
            sor3oszlop2Nev=egyseg;
        }else if (sor==2 && oszlop==1 && !sor2oszlop1 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor2oszlop1= true;
            sor2oszlop1Nev=egyseg;
        }else if (sor==2 && oszlop==2 && !sor2oszlop2 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor2oszlop2= true;
            sor2oszlop2Nev=egyseg;
        }else if (sor==1 && oszlop==1 && !sor1oszlop1 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor1oszlop1= true;
            sor1oszlop1Nev=egyseg;
        }else if (sor==1 && oszlop==2 && !sor1oszlop2 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor1oszlop2= true;
            sor1oszlop2Nev=egyseg;
        }else if (sor==8 && oszlop==3 && !sor8oszlop3 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor8oszlop3= true;
            sor8oszlop3Nev=egyseg;
        }else if (sor==7 && oszlop==3 && !sor7oszlop3 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor7oszlop3= true;
            sor7oszlop3Nev=egyseg;
        }else if (sor==6 && oszlop==3 && !sor6oszlop3 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor6oszlop3= true;
            sor6oszlop3Nev=egyseg;
        }else if (sor==5 && oszlop==3 && !sor5oszlop3 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor5oszlop3= true;
            sor5oszlop3Nev=egyseg;
        }else if (sor==4 && oszlop==3 && !sor4oszlop3 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor4oszlop3= true;
            sor4oszlop3Nev=egyseg;
        }else if (sor==3 && oszlop==3 && !sor3oszlop3 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor3oszlop3= true;
            sor3oszlop3Nev=egyseg;
        }else if (sor==2 && oszlop==3 && !sor2oszlop3 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor2oszlop3= true;
            sor2oszlop3Nev=egyseg;
        }else if (sor==1 && oszlop==3 && !sor1oszlop3 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor1oszlop3= true;
            sor1oszlop3Nev=egyseg;
        }else if (sor==8 && oszlop==4 && !sor8oszlop4 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor8oszlop4= true;
            sor8oszlop4Nev=egyseg;
        }else if (sor==7 && oszlop==4 && !sor7oszlop4 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor7oszlop4= true;
            sor7oszlop4Nev=egyseg;
        }else if (sor==5 && oszlop==4 && !sor5oszlop4 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor5oszlop4= true;
            sor5oszlop4Nev=egyseg;
        }else if (sor==4 && oszlop==4 && !sor4oszlop4 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor4oszlop4= true;
            sor4oszlop4Nev=egyseg;
        }else if (sor==3 && oszlop==4 && !sor3oszlop4 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor3oszlop4= true;
            sor3oszlop4Nev=egyseg;
        }else if (sor==2 && oszlop==4 && !sor2oszlop4 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor2oszlop4= true;
            sor2oszlop4Nev=egyseg;
        }else if (sor==1 && oszlop==4 && !sor1oszlop4 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor1oszlop4= true;
            sor1oszlop4Nev=egyseg;
        }else if (sor==10 && oszlop==5 && !sor10oszlop5 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor10oszlop5= true;
            sor10oszlop5Nev=egyseg;
        }else if (sor==9 && oszlop==5 && !sor9oszlop5 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor9oszlop5= true;
            sor9oszlop5Nev=egyseg;
        }else if (sor==8 && oszlop==5 && !sor8oszlop5 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor8oszlop5= true;
            sor8oszlop5Nev=egyseg;
        }else if (sor==7 && oszlop==5 && !sor7oszlop5 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor7oszlop5= true;
            sor7oszlop5Nev=egyseg;
        }else if (sor==6 && oszlop==5 && !sor6oszlop5 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor6oszlop5= true;
            sor6oszlop5Nev=egyseg;
        }else if (sor==5 && oszlop==5 && !sor5oszlop5 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor5oszlop5= true;
            sor5oszlop5Nev=egyseg;
        }else if (sor==4 && oszlop==5 && !sor4oszlop5 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor4oszlop5= true;
            sor4oszlop5Nev=egyseg;
        }else if (sor==3 && oszlop==5 && !sor3oszlop5 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor3oszlop5= true;
            sor3oszlop5Nev=egyseg;
        }else if (sor==2 && oszlop==5 && !sor2oszlop5 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor2oszlop5= true;
            sor2oszlop5Nev=egyseg;
        }else if (sor==1 && oszlop==5 && !sor1oszlop5 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor1oszlop5= true;
            sor1oszlop5Nev=egyseg;
        }else if (sor==10 && oszlop==6 && !sor10oszlop6 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor10oszlop6= true;
            sor10oszlop6Nev=egyseg;
        }else if (sor==9 && oszlop==6 && !sor9oszlop6 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor9oszlop6= true;
            sor9oszlop6Nev=egyseg;
        }else if (sor==7 && oszlop==6 && !sor7oszlop6 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor7oszlop6= true;
            sor7oszlop6Nev=egyseg;
        }else if (sor==6 && oszlop==6 && !sor6oszlop6 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor6oszlop6= true;
            sor6oszlop6Nev=egyseg;
        }else if (sor==5 && oszlop==6 && !sor5oszlop6 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor5oszlop6= true;
            sor5oszlop6Nev=egyseg;
        }else if (sor==4 && oszlop==6 && !sor4oszlop6 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor4oszlop6= true;
            sor4oszlop6Nev=egyseg;
        }else if (sor==3 && oszlop==6 && !sor3oszlop6 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor3oszlop6= true;
            sor3oszlop6Nev=egyseg;
        }else if (sor==2 && oszlop==6 && !sor2oszlop6 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor2oszlop6= true;
            sor2oszlop6Nev=egyseg;
        }else if (sor==1 && oszlop==6 && !sor1oszlop6 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor1oszlop6= true;
            sor1oszlop6Nev=egyseg;
        }else if (sor==10 && oszlop==7 && !sor10oszlop7 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor10oszlop7= true;
            sor10oszlop7Nev=egyseg;
        }else if (sor==9 && oszlop==7 && !sor9oszlop7 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor9oszlop7= true;
            sor9oszlop7Nev=egyseg;
        }else if (sor==7 && oszlop==7 && !sor7oszlop7 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor7oszlop7= true;
            sor7oszlop7Nev=egyseg;
        }else if (sor==6 && oszlop==7 && !sor6oszlop7 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor6oszlop7= true;
            sor6oszlop7Nev=egyseg;
        }else if (sor==5 && oszlop==7 && !sor5oszlop7 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor5oszlop7= true;
            sor5oszlop7Nev=egyseg;
        }else if (sor==4 && oszlop==7 && !sor4oszlop7 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor4oszlop7= true;
            sor4oszlop7Nev=egyseg;
        }else if (sor==3 && oszlop==7 && !sor3oszlop7 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor3oszlop7= true;
            sor3oszlop7Nev=egyseg;
        }else if (sor==2 && oszlop==7 && !sor2oszlop7 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor2oszlop7= true;
            sor2oszlop7Nev=egyseg;
        }else if (sor==1 && oszlop==7 && !sor1oszlop7 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor1oszlop7= true;
            sor1oszlop7Nev=egyseg;
        }else if (sor==10 && oszlop==8 && !sor10oszlop8 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor10oszlop8= true;
            sor10oszlop8Nev=egyseg;
        }else if (sor==9 && oszlop==8 && !sor9oszlop8 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor9oszlop8= true;
            sor9oszlop8Nev=egyseg;
        }else if (sor==8 && oszlop==8 && !sor8oszlop8 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor8oszlop8= true;
            sor8oszlop8Nev=egyseg;
        }else if (sor==6 && oszlop==8 && !sor6oszlop8 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor6oszlop8= true;
            sor6oszlop8Nev=egyseg;
        }else if (sor==5 && oszlop==8 && !sor5oszlop8 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor5oszlop8= true;
            sor5oszlop8Nev=egyseg;
        }else if (sor==4 && oszlop==8 && !sor4oszlop8 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor4oszlop8= true;
            sor4oszlop8Nev=egyseg;
        }else if (sor==3 && oszlop==8 && !sor3oszlop8 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor3oszlop8= true;
            sor3oszlop8Nev=egyseg;
        }else if (sor==2 && oszlop==8 && !sor2oszlop8 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor2oszlop8= true;
            sor2oszlop8Nev=egyseg;
        }else if (sor==1 && oszlop==8 && !sor1oszlop8 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor1oszlop8= true;
            sor1oszlop8Nev=egyseg;
        }else if (sor==10 && oszlop==9 && !sor10oszlop9 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor10oszlop9= true;
            sor10oszlop9Nev=egyseg;
        }else if (sor==9 && oszlop==9 && !sor9oszlop9 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor9oszlop9= true;
            sor9oszlop9Nev=egyseg;
        }else if (sor==8 && oszlop==9 && !sor8oszlop9 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor8oszlop9= true;
            sor8oszlop9Nev=egyseg;
        }else if (sor==6 && oszlop==9 && !sor6oszlop9 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor6oszlop9= true;
            sor6oszlop9Nev=egyseg;
        }else if (sor==5 && oszlop==9 && !sor5oszlop9 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor5oszlop9= true;
            sor5oszlop9Nev=egyseg;
        }else if (sor==4 && oszlop==9 && !sor4oszlop9 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor4oszlop9= true;
            sor4oszlop9Nev=egyseg;
        }else if (sor==3 && oszlop==9 && !sor3oszlop9 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor3oszlop9= true;
            sor3oszlop9Nev=egyseg;
        }else if (sor==2 && oszlop==9 && !sor2oszlop9 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor2oszlop9= true;
            sor2oszlop9Nev=egyseg;
        }else if (sor==1 && oszlop==9 && !sor1oszlop9 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor1oszlop9= true;
            sor1oszlop9Nev=egyseg;
        }else if (sor==10 && oszlop==10 && !sor10oszlop10 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor10oszlop10= true;
            sor10oszlop10Nev=egyseg;
        }else if (sor==9 && oszlop==10 && !sor9oszlop10 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor9oszlop10= true;
            sor9oszlop10Nev=egyseg;
        }else if (sor==8 && oszlop==10 && !sor8oszlop10 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor8oszlop10= true;
            sor8oszlop10Nev=egyseg;
        }else if (sor==7 && oszlop==10 && !sor7oszlop10 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor7oszlop10= true;
            sor7oszlop10Nev=egyseg;
        }else if (sor==6 && oszlop==10 && !sor6oszlop10 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor6oszlop10= true;
            sor6oszlop10Nev=egyseg;
        }else if (sor==5 && oszlop==10 && !sor5oszlop10 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor5oszlop10= true;
            sor5oszlop10Nev=egyseg;
        }else if (sor==4 && oszlop==10 && !sor4oszlop10 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor4oszlop10= true;
            sor4oszlop10Nev=egyseg;
        }else if (sor==3 && oszlop==10 && !sor3oszlop10 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor3oszlop10= true;
            sor3oszlop10Nev=egyseg;
        }else if (sor==2 && oszlop==10 && !sor2oszlop10 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor2oszlop10= true;
            sor2oszlop10Nev=egyseg;
        }else if (sor==1 && oszlop==10 && !sor1oszlop10 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor1oszlop10= true;
            sor1oszlop10Nev=egyseg;
        }else if (sor==10 && oszlop==11 && !sor10oszlop11 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor10oszlop11= true;
            sor10oszlop11Nev=egyseg;
        }else if (sor==9 && oszlop==11 && !sor9oszlop11 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor9oszlop11= true;
            sor9oszlop11Nev=egyseg;
        }else if (sor==8 && oszlop==11 && !sor8oszlop11 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor8oszlop11= true;
            sor8oszlop11Nev=egyseg;
        }else if (sor==7 && oszlop==11 && !sor7oszlop11 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor7oszlop11= true;
            sor7oszlop11Nev=egyseg;
        }else if (sor==6 && oszlop==11 && !sor6oszlop11 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor6oszlop11= true;
            sor6oszlop11Nev=egyseg;
        }else if (sor==5 && oszlop==11 && !sor5oszlop11 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor5oszlop11= true;
            sor5oszlop11Nev=egyseg;
        }else if (sor==4 && oszlop==11 && !sor4oszlop11 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor4oszlop11= true;
            sor4oszlop11Nev=egyseg;
        }else if (sor==3 && oszlop==11 && !sor3oszlop11 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor3oszlop11= true;
            sor3oszlop11Nev=egyseg;
        }else if (sor==2 && oszlop==11 && !sor2oszlop11 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor2oszlop11= true;
            sor2oszlop11Nev=egyseg;
        }else if (sor==1 && oszlop==11 && !sor1oszlop11 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor1oszlop11= true;
            sor1oszlop11Nev=egyseg;
        }else if (sor==10 && oszlop==12 && !sor10oszlop12 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor10oszlop12= true;
            sor10oszlop12Nev=egyseg;
        }else if (sor==9 && oszlop==12 && !sor9oszlop12 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor9oszlop12= true;
            sor9oszlop12Nev=egyseg;
        }else if (sor==8 && oszlop==12 && !sor8oszlop12 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor8oszlop12= true;
            sor8oszlop12Nev=egyseg;
        }else if (sor==7 && oszlop==12 && !sor7oszlop12 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor7oszlop12= true;
            sor7oszlop12Nev=egyseg;
        }else if (sor==6 && oszlop==12 && !sor6oszlop12 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor6oszlop12= true;
            sor6oszlop12Nev=egyseg;
        }else if (sor==5 && oszlop==12 && !sor5oszlop12 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor5oszlop12= true;
            sor5oszlop12Nev=egyseg;
        }else if (sor==4 && oszlop==12 && !sor4oszlop12 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor4oszlop12= true;
            sor4oszlop12Nev=egyseg;
        }else if (sor==3 && oszlop==12 && !sor3oszlop12 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor3oszlop12= true;
            sor3oszlop12Nev=egyseg;
        }else if (sor==2 && oszlop==12 && !sor2oszlop12 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor2oszlop12= true;
            sor2oszlop12Nev=egyseg;
        }else if (sor==1 && oszlop==12 && !sor1oszlop12 && !egyseg.equals("morLena") && !egyseg.equals("morLaszlo")) {
            sor1oszlop12= true;
            sor1oszlop12Nev=egyseg;
        }else {
            mehet = false;
        }
    }

    public static void holVagyEgy(int oszlop, int sor,String egyseg) {

        int poz=Integer.parseInt(oszlop + "" + sor);

        if (mehet && grifEgymasra !=poz && ijasEgymasra !=poz && foldmuvEgymasra !=poz && fegyvEgymasra !=poz && harcpEgymasra !=poz
                  && minoEgymasra !=poz && felderEgymasra !=poz && csontEgymasra !=poz && orgyEgymasra !=poz && raptEgymasra !=poz &&
                   egrifEgymasra !=poz && eijasEgymasra !=poz && efoldmuvEgymasra !=poz && efegyvEgymasra !=poz && eharcpEgymasra !=poz &&
                   eminoEgymasra !=poz && efelderEgymasra !=poz && ecsontEgymasra !=poz && eorgyEgymasra !=poz && eraptEgymasra !=poz ) {
            if (egyseg.equals("csont")) {
                csontEgymasra = Integer.parseInt(oszlop + "" + sor);
                pozTamadhatoCsont=(oszlop + "-" + sor);
            }else if (egyseg.equals("foldmuv")) {
                foldmuvEgymasra = Integer.parseInt(oszlop + "" + sor);
                pozTamadhatoFoldmuv=(oszlop + "-" + sor);
            }else if (egyseg.equals("ijas")) {
                ijasEgymasra = Integer.parseInt(oszlop + "" + sor);
                pozTamadhatoIjas=(oszlop + "-" + sor);
            }else if (egyseg.equals("felder")) {
                felderEgymasra = Integer.parseInt(oszlop + "" + sor);
                pozTamadhatoFelder=(oszlop + "-" + sor);
            }else if (egyseg.equals("grif")) {
                grifEgymasra = Integer.parseInt(oszlop + "" + sor);
                pozTamadhatoGrif=(oszlop + "-" + sor);
            }else if (egyseg.equals("mino")) {
                minoEgymasra = Integer.parseInt(oszlop + "" + sor);
                pozTamadhatoMino=(oszlop + "-" + sor);
            }else if (egyseg.equals("orgy")) {
                orgyEgymasra = Integer.parseInt(oszlop + "" + sor);
                pozTamadhatoOrgy=(oszlop + "-" + sor);
            }else if (egyseg.equals("fegyv")) {
                fegyvEgymasra = Integer.parseInt(oszlop + "" + sor);
                pozTamadhatoFegyv=(oszlop + "-" + sor);
            }else if (egyseg.equals("rapt")) {
                raptEgymasra = Integer.parseInt(oszlop + "" + sor);
                pozTamadhatoRapt=(oszlop + "-" + sor);
            }else if (egyseg.equals("harcp")) {
                harcpEgymasra = Integer.parseInt(oszlop + "" + sor);
                pozTamadhatoHarcp=(oszlop + "-" + sor);
            }else if (egyseg.equals("ecsont")) {
                ecsontEgymasra = Integer.parseInt(oszlop + "" + sor);
            }else if (egyseg.equals("efoldmuv")) {
                efoldmuvEgymasra = Integer.parseInt(oszlop + "" + sor);
            }else if (egyseg.equals("eijas")) {
                eijasEgymasra = Integer.parseInt(oszlop + "" + sor);
            }else if (egyseg.equals("efelder")) {
                efelderEgymasra = Integer.parseInt(oszlop + "" + sor);
            }else if (egyseg.equals("egrif")) {
                egrifEgymasra = Integer.parseInt(oszlop + "" + sor);
            }else if (egyseg.equals("emino")) {
                eminoEgymasra = Integer.parseInt(oszlop + "" + sor);
            }else if (egyseg.equals("eorgy")) {
                eorgyEgymasra = Integer.parseInt(oszlop + "" + sor);
            }else if (egyseg.equals("efegyv")) {
                efegyvEgymasra = Integer.parseInt(oszlop + "" + sor);
            }else if (egyseg.equals("erapt")) {
                eraptEgymasra = Integer.parseInt(oszlop + "" + sor);
            }else if (egyseg.equals("eharcp")) {
                eharcpEgymasra = Integer.parseInt(oszlop + "" + sor);
            }
        }
    }

    public static void holVagyKetto(int oszlop, int sor,String egyseg) {

            holVagyKettoCsontvaz(oszlop,sor,egyseg);
            holVagyKettoFolmuves(oszlop,sor,egyseg);
            holVagyKettoMino(oszlop,sor,egyseg);
            holVagyKettoFegyv(oszlop,sor,egyseg);
            holVagyKettoGrif(oszlop,sor,egyseg);
            holVagyKettoFelder(oszlop,sor,egyseg);
            holVagyKettoIjas(oszlop,sor,egyseg);
    }

    public static void holVagyKettoCsontvaz(int oszlop, int sor,String egyseg) {
        int poz=Integer.parseInt(oszlop + "" + sor);
        pozTamadhatoCsont=(oszlop + "-" + sor);
        int pozJelenlegi=Integer.parseInt(regiPozOszlop + "" + regiPozSor);


        if ( csontEgymasra !=0 && egyseg.equals("csont") && minoEgymasra !=poz && felderEgymasra !=poz && csontEgymasra !=poz && orgyEgymasra !=poz && raptEgymasra !=poz
                && egrifEgymasra !=poz && eijasEgymasra !=poz && efoldmuvEgymasra !=poz && efegyvEgymasra !=poz && eharcpEgymasra !=poz && csontEgymasra !=pozJelenlegi ) {
            if (csontEgymasra ==11) {
                sor1oszlop1= false;
                sor1oszlop1Nev="n";
            }else if (csontEgymasra ==12) {
                sor2oszlop1= false;
                sor2oszlop1Nev="n";
            }else if (csontEgymasra ==13) {
                sor3oszlop1= false;
                sor3oszlop1Nev="n";
            }else if (csontEgymasra ==14) {
                sor4oszlop1= false;
                sor4oszlop1Nev="n";
            }else if (csontEgymasra ==15) {
                sor5oszlop1= false;
                sor5oszlop1Nev="n";
            }else if (csontEgymasra ==16) {
                sor6oszlop1= false;
                sor6oszlop1Nev="n";
            }else if (csontEgymasra ==17) {
                sor7oszlop1= false;
                sor7oszlop1Nev="n";
            }else if (csontEgymasra ==18) {
                sor8oszlop1= false;
                sor8oszlop1Nev="n";
            }else if (csontEgymasra ==19) {
                sor9oszlop1= false;
                sor9oszlop1Nev="n";
            }else if (csontEgymasra ==110) {
                sor10oszlop1= false;
                sor10oszlop1Nev="n";
            }else if (csontEgymasra ==21) {
                sor1oszlop2= false;
                sor1oszlop2Nev="n";
            }else if (csontEgymasra ==22) {
                sor2oszlop2= false;
                sor2oszlop2Nev="n";
            }else if (csontEgymasra ==23) {
                sor3oszlop2= false;
                sor3oszlop2Nev="n";
            }else if (csontEgymasra ==24) {
                sor4oszlop2= false;
                sor4oszlop2Nev="n";
            }else if (csontEgymasra ==25) {
                sor5oszlop2= false;
                sor5oszlop2Nev="n";
            }else if (csontEgymasra ==26) {
                sor6oszlop2= false;
                sor6oszlop2Nev="n";
            }else if (csontEgymasra ==27) {
                sor7oszlop2= false;
                sor7oszlop2Nev="n";
            }else if (csontEgymasra ==28) {
                sor8oszlop2= false;
                sor8oszlop2Nev="n";
            }else if (csontEgymasra ==29) {
                sor9oszlop2= false;
                sor9oszlop2Nev="n";
            }else if (csontEgymasra ==210) {
                sor10oszlop2= false;
                sor10oszlop2Nev="n";
            }else if (csontEgymasra ==31) {
                sor1oszlop3= false;
                sor1oszlop3Nev="n";
            }else if (csontEgymasra ==32) {
                sor2oszlop3= false;
                sor2oszlop3Nev="n";
            }else if (csontEgymasra ==33) {
                sor3oszlop3= false;
                sor3oszlop3Nev="n";
            }else if (csontEgymasra ==34) {
                sor4oszlop3= false;
                sor4oszlop3Nev="n";
            }else if (csontEgymasra ==35) {
                sor5oszlop3= false;
                sor5oszlop3Nev="n";
            }else if (csontEgymasra ==36) {
                sor6oszlop3= false;
                sor6oszlop3Nev="n";
            }else if (csontEgymasra ==37) {
                sor7oszlop3= false;
                sor7oszlop3Nev="n";
            }else if (csontEgymasra ==38) {
                sor8oszlop3= false;
                sor8oszlop3Nev="n";
            }else if (csontEgymasra ==39) {
                sor9oszlop3= false;
                sor9oszlop3Nev="n";
            }else if (csontEgymasra ==310) {
                sor10oszlop3= false;
                sor10oszlop3Nev="n";
            }else if (csontEgymasra ==41) {
                sor1oszlop4= false;
                sor1oszlop4Nev="n";
            }else if (csontEgymasra ==42) {
                sor2oszlop4= false;
                sor2oszlop4Nev="n";
            }else if (csontEgymasra ==43) {
                sor3oszlop4= false;
                sor3oszlop4Nev="n";
            }else if (csontEgymasra ==44) {
                sor4oszlop4= false;
                sor4oszlop4Nev="n";
            }else if (csontEgymasra ==45) {
                sor5oszlop4= false;
                sor5oszlop4Nev="n";
            }else if (csontEgymasra ==46) {
                sor6oszlop4= false;
                sor6oszlop4Nev="n";
            }else if (csontEgymasra ==47) {
                sor7oszlop4= false;
                sor7oszlop4Nev="n";
            }else if (csontEgymasra ==48) {
                sor8oszlop4= false;
                sor8oszlop4Nev="n";
            }else if (csontEgymasra ==49) {
                sor9oszlop4= false;
                sor9oszlop4Nev="n";
            }else if (csontEgymasra ==410) {
                sor10oszlop4= false;
                sor10oszlop4Nev="n";
            }else if (csontEgymasra ==51) {
                sor1oszlop5= false;
                sor1oszlop5Nev="n";
            }else if (csontEgymasra ==52) {
                sor2oszlop5= false;
                sor2oszlop5Nev="n";
            }else if (csontEgymasra ==53) {
                sor3oszlop5= false;
                sor3oszlop5Nev="n";
            }else if (csontEgymasra ==54) {
                sor4oszlop5= false;
                sor4oszlop5Nev="n";
            }else if (csontEgymasra ==55) {
                sor5oszlop5= false;
                sor5oszlop5Nev="n";
            }else if (csontEgymasra ==56) {
                sor6oszlop5= false;
                sor6oszlop5Nev="n";
            }else if (csontEgymasra ==57) {
                sor7oszlop5= false;
                sor7oszlop5Nev="n";
            }else if (csontEgymasra ==58) {
                sor8oszlop5= false;
                sor8oszlop5Nev="n";
            }else if (csontEgymasra ==59) {
                sor9oszlop5= false;
                sor9oszlop5Nev="n";
            }else if (csontEgymasra ==510) {
                sor10oszlop5= false;
                sor10oszlop5Nev="n";
            }else if (csontEgymasra ==61) {
                sor1oszlop6= false;
                sor1oszlop6Nev="n";
            }else if (csontEgymasra ==62) {
                sor2oszlop6= false;
                sor2oszlop6Nev="n";
            }else if (csontEgymasra ==63) {
                sor3oszlop6= false;
                sor3oszlop6Nev="n";
            }else if (csontEgymasra ==64) {
                sor4oszlop6= false;
                sor4oszlop6Nev="n";
            }else if (csontEgymasra ==65) {
                sor5oszlop6= false;
                sor5oszlop6Nev="n";
            }else if (csontEgymasra ==66) {
                sor6oszlop6= false;
                sor6oszlop6Nev="n";
            }else if (csontEgymasra ==67) {
                sor7oszlop6= false;
                sor7oszlop6Nev="n";
            }else if (csontEgymasra ==68) {
                sor8oszlop6= false;
                sor8oszlop6Nev="n";
            }else if (csontEgymasra ==69) {
                sor9oszlop6= false;
                sor9oszlop6Nev="n";
            }else if (csontEgymasra ==610) {
                sor10oszlop6= false;
                sor10oszlop6Nev="n";
            }else if (csontEgymasra ==71) {
                sor1oszlop7= false;
                sor1oszlop7Nev="n";
            }else if (csontEgymasra ==72) {
                sor2oszlop7= false;
                sor2oszlop7Nev="n";
            }else if (csontEgymasra ==73) {
                sor3oszlop7= false;
                sor3oszlop7Nev="n";
            }else if (csontEgymasra ==74) {
                sor4oszlop7= false;
                sor4oszlop7Nev="n";
            }else if (csontEgymasra ==75) {
                sor5oszlop7= false;
                sor5oszlop7Nev="n";
            }else if (csontEgymasra ==76) {
                sor6oszlop7= false;
                sor6oszlop7Nev="n";
            }else if (csontEgymasra ==77) {
                sor7oszlop7= false;
                sor7oszlop7Nev="n";
            }else if (csontEgymasra ==78) {
                sor8oszlop7= false;
                sor8oszlop7Nev="n";
            }else if (csontEgymasra ==79) {
                sor9oszlop7= false;
                sor9oszlop7Nev="n";
            }else if (csontEgymasra ==710) {
                sor10oszlop7= false;
                sor10oszlop7Nev="n";
            }else if (csontEgymasra ==81) {
                sor1oszlop8= false;
                sor1oszlop8Nev="n";
            }else if (csontEgymasra ==82) {
                sor2oszlop8= false;
                sor2oszlop8Nev="n";
            }else if (csontEgymasra ==83) {
                sor3oszlop8= false;
                sor3oszlop8Nev="n";
            }else if (csontEgymasra ==84) {
                sor4oszlop8= false;
                sor4oszlop8Nev="n";
            }else if (csontEgymasra ==85) {
                sor5oszlop8= false;
                sor5oszlop8Nev="n";
            }else if (csontEgymasra ==86) {
                sor6oszlop8= false;
                sor6oszlop8Nev="n";
            }else if (csontEgymasra ==87) {
                sor7oszlop8= false;
                sor7oszlop8Nev="n";
            }else if (csontEgymasra ==88) {
                sor8oszlop8= false;
                sor8oszlop8Nev="n";
            }else if (csontEgymasra ==89) {
                sor9oszlop8= false;
                sor9oszlop8Nev="n";
            }else if (csontEgymasra ==810) {
                sor10oszlop8= false;
                sor10oszlop8Nev="n";
            }else if (csontEgymasra ==91) {
                sor1oszlop9= false;
                sor1oszlop9Nev="n";
            }else if (csontEgymasra ==92) {
                sor2oszlop9= false;
                sor2oszlop9Nev="n";
            }else if (csontEgymasra ==93) {
                sor3oszlop9= false;
                sor3oszlop9Nev="n";
            }else if (csontEgymasra ==94) {
                sor4oszlop9= false;
                sor4oszlop9Nev="n";
            }else if (csontEgymasra ==95) {
                sor5oszlop9= false;
                sor5oszlop9Nev="n";
            }else if (csontEgymasra ==96) {
                sor6oszlop9= false;
                sor6oszlop9Nev="n";
            }else if (csontEgymasra ==97) {
                sor7oszlop9= false;
                sor7oszlop9Nev="n";
            }else if (csontEgymasra ==98) {
                sor8oszlop9= false;
                sor8oszlop9Nev="n";
            }else if (csontEgymasra ==99) {
                sor9oszlop9= false;
                sor9oszlop9Nev="n";
            }else if (csontEgymasra ==910) {
                sor10oszlop9= false;
                sor10oszlop9Nev="n";
            }else if (csontEgymasra ==101) {
                sor1oszlop10= false;
                sor1oszlop10Nev="n";
            }else if (csontEgymasra ==102) {
                sor2oszlop10= false;
                sor2oszlop10Nev="n";
            }else if (csontEgymasra ==103) {
                sor3oszlop10= false;
                sor3oszlop10Nev="n";
            }else if (csontEgymasra ==104) {
                sor4oszlop10= false;
                sor4oszlop10Nev="n";
            }else if (csontEgymasra ==105) {
                sor5oszlop10= false;
                sor5oszlop10Nev="n";
            }else if (csontEgymasra ==106) {
                sor6oszlop10= false;
                sor6oszlop10Nev="n";
            }else if (csontEgymasra ==107) {
                sor7oszlop10= false;
                sor7oszlop10Nev="n";
            }else if (csontEgymasra ==108) {
                sor8oszlop10= false;
                sor8oszlop10Nev="n";
            }else if (csontEgymasra ==109) {
                sor9oszlop10= false;
                sor9oszlop10Nev="n";
            }else if (csontEgymasra ==1010) {
                sor10oszlop10= false;
                sor10oszlop10Nev="n";
            }else if (csontEgymasra ==111) {
                sor1oszlop11= false;
                sor1oszlop11Nev="n";
            }else if (csontEgymasra ==112) {
                sor2oszlop11= false;
                sor2oszlop11Nev="n";
            }else if (csontEgymasra ==113) {
                sor3oszlop11= false;
                sor3oszlop11Nev="n";
            }else if (csontEgymasra ==114) {
                sor4oszlop11= false;
                sor4oszlop11Nev="n";
            }else if (csontEgymasra ==115) {
                sor5oszlop11= false;
                sor5oszlop11Nev="n";
            }else if (csontEgymasra ==116) {
                sor6oszlop11= false;
                sor6oszlop11Nev="n";
            }else if (csontEgymasra ==117) {
                sor7oszlop11= false;
                sor7oszlop11Nev="n";
            }else if (csontEgymasra ==118) {
                sor8oszlop11= false;
                sor8oszlop11Nev="n";
            }else if (csontEgymasra ==119) {
                sor9oszlop11= false;
                sor9oszlop11Nev="n";
            }else if (csontEgymasra ==1110) {
                sor10oszlop11= false;
                sor10oszlop11Nev="n";
            }else if (csontEgymasra ==121) {
                sor1oszlop12= false;
                sor1oszlop12Nev="n";
            }else if (csontEgymasra ==122) {
                sor2oszlop12= false;
                sor2oszlop12Nev="n";
            }else if (csontEgymasra ==123) {
                sor3oszlop12= false;
                sor3oszlop12Nev="n";
            }else if (csontEgymasra ==124) {
                sor4oszlop12= false;
                sor4oszlop12Nev="n";
            }else if (csontEgymasra ==125) {
                sor5oszlop12= false;
                sor5oszlop12Nev="n";
            }else if (csontEgymasra ==126) {
                sor6oszlop12= false;
                sor6oszlop12Nev="n";
            }else if (csontEgymasra ==127) {
                sor7oszlop12= false;
                sor7oszlop12Nev="n";
            }else if (csontEgymasra ==128) {
                sor8oszlop12= false;
                sor8oszlop12Nev="n";
            }else if (csontEgymasra ==129) {
                sor9oszlop12= false;
                sor9oszlop12Nev="n";
            }else if (csontEgymasra ==1210) {
                sor10oszlop12= false;
                sor10oszlop12Nev="n";
            }
            csontEgymasra =poz;

        }
    }


    public static void holVagyKettoFolmuves(int oszlop, int sor,String egyseg) {

        int poz = Integer.parseInt(oszlop + "" + sor);
        int pozJelenlegi = Integer.parseInt(regiPozOszlop + "" + regiPozSor);

        if (foldmuvEgymasra != 0 && egyseg.equals("foldmuv") && grifEgymasra != poz && ijasEgymasra != poz && foldmuvEgymasra != poz && fegyvEgymasra != poz && harcpEgymasra != poz
                && eminoEgymasra != poz && efelderEgymasra != poz && ecsontEgymasra != poz && eorgyEgymasra != poz && eraptEgymasra != poz && foldmuvEgymasra != pozJelenlegi) {

                pozTamadhatoFoldmuv=(oszlop + "-" + sor);

            if (foldmuvEgymasra == 11) {
                sor1oszlop1 = false;
                sor1oszlop1Nev = "n";
            } else if (foldmuvEgymasra == 12) {
                sor2oszlop1 = false;
                sor2oszlop1Nev = "n";
            } else if (foldmuvEgymasra == 13) {
                sor3oszlop1 = false;
                sor3oszlop1Nev = "n";
            } else if (foldmuvEgymasra == 14) {
                sor4oszlop1 = false;
                sor4oszlop1Nev = "n";
            } else if (foldmuvEgymasra == 15) {
                sor5oszlop1 = false;
                sor5oszlop1Nev = "n";
            } else if (foldmuvEgymasra == 16) {
                sor6oszlop1 = false;
                sor6oszlop1Nev = "n";
            } else if (foldmuvEgymasra == 17) {
                sor7oszlop1 = false;
                sor7oszlop1Nev = "n";
            } else if (foldmuvEgymasra == 18) {
                sor8oszlop1 = false;
                sor8oszlop1Nev = "n";
            } else if (foldmuvEgymasra == 19) {
                sor9oszlop1 = false;
                sor9oszlop1Nev = "n";
            } else if (foldmuvEgymasra == 110) {
                sor10oszlop1 = false;
                sor10oszlop1Nev = "n";
            } else if (foldmuvEgymasra == 21) {
                sor1oszlop2 = false;
                sor1oszlop2Nev = "n";
            } else if (foldmuvEgymasra == 22) {
                sor2oszlop2 = false;
                sor2oszlop2Nev = "n";
            } else if (foldmuvEgymasra == 23) {
                sor3oszlop2 = false;
                sor3oszlop2Nev = "n";
            } else if (foldmuvEgymasra == 24) {
                sor4oszlop2 = false;
                sor4oszlop2Nev = "n";
            } else if (foldmuvEgymasra == 25) {
                sor5oszlop2 = false;
                sor5oszlop2Nev = "n";
            } else if (foldmuvEgymasra == 26) {
                sor6oszlop2 = false;
                sor6oszlop2Nev = "n";
            } else if (foldmuvEgymasra == 27) {
                sor7oszlop2 = false;
                sor7oszlop2Nev = "n";
            } else if (foldmuvEgymasra == 28) {
                sor8oszlop2 = false;
                sor8oszlop2Nev = "n";
            } else if (foldmuvEgymasra == 29) {
                sor9oszlop2 = false;
                sor9oszlop2Nev = "n";
            } else if (foldmuvEgymasra == 210) {
                sor10oszlop2 = false;
                sor10oszlop2Nev = "n";
            } else if (foldmuvEgymasra == 31) {
                sor1oszlop3 = false;
                sor1oszlop3Nev = "n";
            } else if (foldmuvEgymasra == 32) {
                sor2oszlop3 = false;
                sor2oszlop3Nev = "n";
            } else if (foldmuvEgymasra == 33) {
                sor3oszlop3 = false;
                sor3oszlop3Nev = "n";
            } else if (foldmuvEgymasra == 34) {
                sor4oszlop3 = false;
                sor4oszlop3Nev = "n";
            } else if (foldmuvEgymasra == 35) {
                sor5oszlop3 = false;
                sor5oszlop3Nev = "n";
            } else if (foldmuvEgymasra == 36) {
                sor6oszlop3 = false;
                sor6oszlop3Nev = "n";
            } else if (foldmuvEgymasra == 37) {
                sor7oszlop3 = false;
                sor7oszlop3Nev = "n";
            } else if (foldmuvEgymasra == 38) {
                sor8oszlop3 = false;
                sor8oszlop3Nev = "n";
            } else if (foldmuvEgymasra == 39) {
                sor9oszlop3 = false;
                sor9oszlop3Nev = "n";
            } else if (foldmuvEgymasra == 310) {
                sor10oszlop3 = false;
                sor10oszlop3Nev = "n";
            } else if (foldmuvEgymasra == 41) {
                sor1oszlop4 = false;
                sor1oszlop4Nev = "n";
            } else if (foldmuvEgymasra == 42) {
                sor2oszlop4 = false;
                sor2oszlop4Nev = "n";
            } else if (foldmuvEgymasra == 43) {
                sor3oszlop4 = false;
                sor3oszlop4Nev = "n";
            } else if (foldmuvEgymasra == 44) {
                sor4oszlop4 = false;
                sor4oszlop4Nev = "n";
            } else if (foldmuvEgymasra == 45) {
                sor5oszlop4 = false;
                sor5oszlop4Nev = "n";
            } else if (foldmuvEgymasra == 46) {
                sor6oszlop4 = false;
                sor6oszlop4Nev = "n";
            } else if (foldmuvEgymasra == 47) {
                sor7oszlop4 = false;
                sor7oszlop4Nev = "n";
            } else if (foldmuvEgymasra == 48) {
                sor8oszlop4 = false;
                sor8oszlop4Nev = "n";
            } else if (foldmuvEgymasra == 49) {
                sor9oszlop4 = false;
                sor9oszlop4Nev = "n";
            } else if (foldmuvEgymasra == 410) {
                sor10oszlop4 = false;
                sor10oszlop4Nev = "n";
            } else if (foldmuvEgymasra == 51) {
                sor1oszlop5 = false;
                sor1oszlop5Nev = "n";
            } else if (foldmuvEgymasra == 52) {
                sor2oszlop5 = false;
                sor2oszlop5Nev = "n";
            } else if (foldmuvEgymasra == 53) {
                sor3oszlop5 = false;
                sor3oszlop5Nev = "n";
            } else if (foldmuvEgymasra == 54) {
                sor4oszlop5 = false;
                sor4oszlop5Nev = "n";
            } else if (foldmuvEgymasra == 55) {
                sor5oszlop5 = false;
                sor5oszlop5Nev = "n";
            } else if (foldmuvEgymasra == 56) {
                sor6oszlop5 = false;
                sor6oszlop5Nev = "n";
            } else if (foldmuvEgymasra == 57) {
                sor7oszlop5 = false;
                sor7oszlop5Nev = "n";
            } else if (foldmuvEgymasra == 58) {
                sor8oszlop5 = false;
                sor8oszlop5Nev = "n";
            } else if (foldmuvEgymasra == 59) {
                sor9oszlop5 = false;
                sor9oszlop5Nev = "n";
            } else if (foldmuvEgymasra == 510) {
                sor10oszlop5 = false;
                sor10oszlop5Nev = "n";
            } else if (foldmuvEgymasra == 61) {
                sor1oszlop6 = false;
                sor1oszlop6Nev = "n";
            } else if (foldmuvEgymasra == 62) {
                sor2oszlop6 = false;
                sor2oszlop6Nev = "n";
            } else if (foldmuvEgymasra == 63) {
                sor3oszlop6 = false;
                sor3oszlop6Nev = "n";
            } else if (foldmuvEgymasra == 64) {
                sor4oszlop6 = false;
                sor4oszlop6Nev = "n";
            } else if (foldmuvEgymasra == 65) {
                sor5oszlop6 = false;
                sor5oszlop6Nev = "n";
            } else if (foldmuvEgymasra == 66) {
                sor6oszlop6 = false;
                sor6oszlop6Nev = "n";
            } else if (foldmuvEgymasra == 67) {
                sor7oszlop6 = false;
                sor7oszlop6Nev = "n";
            } else if (foldmuvEgymasra == 68) {
                sor8oszlop6 = false;
                sor8oszlop6Nev = "n";
            } else if (foldmuvEgymasra == 69) {
                sor9oszlop6 = false;
                sor9oszlop6Nev = "n";
            } else if (foldmuvEgymasra == 610) {
                sor10oszlop6 = false;
                sor10oszlop6Nev = "n";
            } else if (foldmuvEgymasra == 71) {
                sor1oszlop7 = false;
                sor1oszlop7Nev = "n";
            } else if (foldmuvEgymasra == 72) {
                sor2oszlop7 = false;
                sor2oszlop7Nev = "n";
            } else if (foldmuvEgymasra == 73) {
                sor3oszlop7 = false;
                sor3oszlop7Nev = "n";
            } else if (foldmuvEgymasra == 74) {
                sor4oszlop7 = false;
                sor4oszlop7Nev = "n";
            } else if (foldmuvEgymasra == 75) {
                sor5oszlop7 = false;
                sor5oszlop7Nev = "n";
            } else if (foldmuvEgymasra == 76) {
                sor6oszlop7 = false;
                sor6oszlop7Nev = "n";
            } else if (foldmuvEgymasra == 77) {
                sor7oszlop7 = false;
                sor7oszlop7Nev = "n";
            } else if (foldmuvEgymasra == 78) {
                sor8oszlop7 = false;
                sor8oszlop7Nev = "n";
            } else if (foldmuvEgymasra == 79) {
                sor9oszlop7 = false;
                sor9oszlop7Nev = "n";
            } else if (foldmuvEgymasra == 710) {
                sor10oszlop7 = false;
                sor10oszlop7Nev = "n";
            } else if (foldmuvEgymasra == 81) {
                sor1oszlop8 = false;
                sor1oszlop8Nev = "n";
            } else if (foldmuvEgymasra == 82) {
                sor2oszlop8 = false;
                sor2oszlop8Nev = "n";
            } else if (foldmuvEgymasra == 83) {
                sor3oszlop8 = false;
                sor3oszlop8Nev = "n";
            } else if (foldmuvEgymasra == 84) {
                sor4oszlop8 = false;
                sor4oszlop8Nev = "n";
            } else if (foldmuvEgymasra == 85) {
                sor5oszlop8 = false;
                sor5oszlop8Nev = "n";
            } else if (foldmuvEgymasra == 86) {
                sor6oszlop8 = false;
                sor6oszlop8Nev = "n";
            } else if (foldmuvEgymasra == 87) {
                sor7oszlop8 = false;
                sor7oszlop8Nev = "n";
            } else if (foldmuvEgymasra == 88) {
                sor8oszlop8 = false;
                sor8oszlop8Nev = "n";
            } else if (foldmuvEgymasra == 89) {
                sor9oszlop8 = false;
                sor9oszlop8Nev = "n";
            } else if (foldmuvEgymasra == 810) {
                sor10oszlop8 = false;
                sor10oszlop8Nev = "n";
            } else if (foldmuvEgymasra == 91) {
                sor1oszlop9 = false;
                sor1oszlop9Nev = "n";
            } else if (foldmuvEgymasra == 92) {
                sor2oszlop9 = false;
                sor2oszlop9Nev = "n";
            } else if (foldmuvEgymasra == 93) {
                sor3oszlop9 = false;
                sor3oszlop9Nev = "n";
            } else if (foldmuvEgymasra == 94) {
                sor4oszlop9 = false;
                sor4oszlop9Nev = "n";
            } else if (foldmuvEgymasra == 95) {
                sor5oszlop9 = false;
                sor5oszlop9Nev = "n";
            } else if (foldmuvEgymasra == 96) {
                sor6oszlop9 = false;
                sor6oszlop9Nev = "n";
            } else if (foldmuvEgymasra == 97) {
                sor7oszlop9 = false;
                sor7oszlop9Nev = "n";
            } else if (foldmuvEgymasra == 98) {
                sor8oszlop9 = false;
                sor8oszlop9Nev = "n";
            } else if (foldmuvEgymasra == 99) {
                sor9oszlop9 = false;
                sor9oszlop9Nev = "n";
            } else if (foldmuvEgymasra == 910) {
                sor10oszlop9 = false;
                sor10oszlop9Nev = "n";
            } else if (foldmuvEgymasra == 101) {
                sor1oszlop10 = false;
                sor1oszlop10Nev = "n";
            } else if (foldmuvEgymasra == 102) {
                sor2oszlop10 = false;
                sor2oszlop10Nev = "n";
            } else if (foldmuvEgymasra == 103) {
                sor3oszlop10 = false;
                sor3oszlop10Nev = "n";
            } else if (foldmuvEgymasra == 104) {
                sor4oszlop10 = false;
                sor4oszlop10Nev = "n";
            } else if (foldmuvEgymasra == 105) {
                sor5oszlop10 = false;
                sor5oszlop10Nev = "n";
            } else if (foldmuvEgymasra == 106) {
                sor6oszlop10 = false;
                sor6oszlop10Nev = "n";
            } else if (foldmuvEgymasra == 107) {
                sor7oszlop10 = false;
                sor7oszlop10Nev = "n";
            } else if (foldmuvEgymasra == 108) {
                sor8oszlop10 = false;
                sor8oszlop10Nev = "n";
            } else if (foldmuvEgymasra == 109) {
                sor9oszlop10 = false;
                sor9oszlop10Nev = "n";
            } else if (foldmuvEgymasra == 1010) {
                sor10oszlop10 = false;
                sor10oszlop10Nev = "n";
            } else if (foldmuvEgymasra == 111) {
                sor1oszlop11 = false;
                sor1oszlop11Nev = "n";
            } else if (foldmuvEgymasra == 112) {
                sor2oszlop11 = false;
                sor2oszlop11Nev = "n";
            } else if (foldmuvEgymasra == 113) {
                sor3oszlop11 = false;
                sor3oszlop11Nev = "n";
            } else if (foldmuvEgymasra == 114) {
                sor4oszlop11 = false;
                sor4oszlop11Nev = "n";
            } else if (foldmuvEgymasra == 115) {
                sor5oszlop11 = false;
                sor5oszlop11Nev = "n";
            } else if (foldmuvEgymasra == 116) {
                sor6oszlop11 = false;
                sor6oszlop11Nev = "n";
            } else if (foldmuvEgymasra == 117) {
                sor7oszlop11 = false;
                sor7oszlop11Nev = "n";
            } else if (foldmuvEgymasra == 118) {
                sor8oszlop11 = false;
                sor8oszlop11Nev = "n";
            } else if (foldmuvEgymasra == 119) {
                sor9oszlop11 = false;
                sor9oszlop11Nev = "n";
            } else if (foldmuvEgymasra == 1110) {
                sor10oszlop11 = false;
                sor10oszlop11Nev = "n";
            } else if (foldmuvEgymasra == 121) {
                sor1oszlop12 = false;
                sor1oszlop12Nev = "n";
            } else if (foldmuvEgymasra == 122) {
                sor2oszlop12 = false;
                sor2oszlop12Nev = "n";
            } else if (foldmuvEgymasra == 123) {
                sor3oszlop12 = false;
                sor3oszlop12Nev = "n";
            } else if (foldmuvEgymasra == 124) {
                sor4oszlop12 = false;
                sor4oszlop12Nev = "n";
            } else if (foldmuvEgymasra == 125) {
                sor5oszlop12 = false;
                sor5oszlop12Nev = "n";
            } else if (foldmuvEgymasra == 126) {
                sor6oszlop12 = false;
                sor6oszlop12Nev = "n";
            } else if (foldmuvEgymasra == 127) {
                sor7oszlop12 = false;
                sor7oszlop12Nev = "n";
            } else if (foldmuvEgymasra == 128) {
                sor8oszlop12 = false;
                sor8oszlop12Nev = "n";
            } else if (foldmuvEgymasra == 129) {
                sor9oszlop12 = false;
                sor9oszlop12Nev = "n";
            } else if (foldmuvEgymasra == 1210) {
                sor10oszlop12 = false;
                sor10oszlop12Nev = "n";
            }
            foldmuvEgymasra = poz;
        }
    }

    public static void holVagyKettoIjas(int oszlop, int sor,String egyseg) {

        int poz = Integer.parseInt(oszlop + "" + sor);
        int pozJelenlegi = Integer.parseInt(regiPozOszlop + "" + regiPozSor);


        if (ijasEgymasra != 0 && egyseg.equals("ijas") && grifEgymasra != poz && ijasEgymasra != poz && foldmuvEgymasra != poz && fegyvEgymasra != poz && harcpEgymasra != poz
                && eminoEgymasra != poz && efelderEgymasra != poz && ecsontEgymasra != poz && eorgyEgymasra != poz && eraptEgymasra != poz && ijasEgymasra != pozJelenlegi) {

            pozTamadhatoIjas=(oszlop + "-" + sor);

            if (ijasEgymasra == 11) {
                sor1oszlop1 = false;
                sor1oszlop1Nev = "n";
            } else if (ijasEgymasra == 12) {
                sor2oszlop1 = false;
                sor2oszlop1Nev = "n";
            } else if (ijasEgymasra == 13) {
                sor3oszlop1 = false;
                sor3oszlop1Nev = "n";
            } else if (ijasEgymasra == 14) {
                sor4oszlop1 = false;
                sor4oszlop1Nev = "n";
            } else if (ijasEgymasra == 15) {
                sor5oszlop1 = false;
                sor5oszlop1Nev = "n";
            } else if (ijasEgymasra == 16) {
                sor6oszlop1 = false;
                sor6oszlop1Nev = "n";
            } else if (ijasEgymasra == 17) {
                sor7oszlop1 = false;
                sor7oszlop1Nev = "n";
            } else if (ijasEgymasra == 18) {
                sor8oszlop1 = false;
                sor8oszlop1Nev = "n";
            } else if (ijasEgymasra == 19) {
                sor9oszlop1 = false;
                sor9oszlop1Nev = "n";
            } else if (ijasEgymasra == 110) {
                sor10oszlop1 = false;
                sor10oszlop1Nev = "n";
            } else if (ijasEgymasra == 21) {
                sor1oszlop2 = false;
                sor1oszlop2Nev = "n";
            } else if (ijasEgymasra == 22) {
                sor2oszlop2 = false;
                sor2oszlop2Nev = "n";
            } else if (ijasEgymasra == 23) {
                sor3oszlop2 = false;
                sor3oszlop2Nev = "n";
            } else if (ijasEgymasra == 24) {
                sor4oszlop2 = false;
                sor4oszlop2Nev = "n";
            } else if (ijasEgymasra == 25) {
                sor5oszlop2 = false;
                sor5oszlop2Nev = "n";
            } else if (ijasEgymasra == 26) {
                sor6oszlop2 = false;
                sor6oszlop2Nev = "n";
            } else if (ijasEgymasra == 27) {
                sor7oszlop2 = false;
                sor7oszlop2Nev = "n";
            } else if (ijasEgymasra == 28) {
                sor8oszlop2 = false;
                sor8oszlop2Nev = "n";
            } else if (ijasEgymasra == 29) {
                sor9oszlop2 = false;
                sor9oszlop2Nev = "n";
            } else if (ijasEgymasra == 210) {
                sor10oszlop2 = false;
                sor10oszlop2Nev = "n";
            } else if (ijasEgymasra == 31) {
                sor1oszlop3 = false;
                sor1oszlop3Nev = "n";
            } else if (ijasEgymasra == 32) {
                sor2oszlop3 = false;
                sor2oszlop3Nev = "n";
            } else if (ijasEgymasra == 33) {
                sor3oszlop3 = false;
                sor3oszlop3Nev = "n";
            } else if (ijasEgymasra == 34) {
                sor4oszlop3 = false;
                sor4oszlop3Nev = "n";
            } else if (ijasEgymasra == 35) {
                sor5oszlop3 = false;
                sor5oszlop3Nev = "n";
            } else if (ijasEgymasra == 36) {
                sor6oszlop3 = false;
                sor6oszlop3Nev = "n";
            } else if (ijasEgymasra == 37) {
                sor7oszlop3 = false;
                sor7oszlop3Nev = "n";
            } else if (ijasEgymasra == 38) {
                sor8oszlop3 = false;
                sor8oszlop3Nev = "n";
            } else if (ijasEgymasra == 39) {
                sor9oszlop3 = false;
                sor9oszlop3Nev = "n";
            } else if (ijasEgymasra == 310) {
                sor10oszlop3 = false;
                sor10oszlop3Nev = "n";
            } else if (ijasEgymasra == 41) {
                sor1oszlop4 = false;
                sor1oszlop4Nev = "n";
            } else if (ijasEgymasra == 42) {
                sor2oszlop4 = false;
                sor2oszlop4Nev = "n";
            } else if (ijasEgymasra == 43) {
                sor3oszlop4 = false;
                sor3oszlop4Nev = "n";
            } else if (ijasEgymasra == 44) {
                sor4oszlop4 = false;
                sor4oszlop4Nev = "n";
            } else if (ijasEgymasra == 45) {
                sor5oszlop4 = false;
                sor5oszlop4Nev = "n";
            } else if (ijasEgymasra == 46) {
                sor6oszlop4 = false;
                sor6oszlop4Nev = "n";
            } else if (ijasEgymasra == 47) {
                sor7oszlop4 = false;
                sor7oszlop4Nev = "n";
            } else if (ijasEgymasra == 48) {
                sor8oszlop4 = false;
                sor8oszlop4Nev = "n";
            } else if (ijasEgymasra == 49) {
                sor9oszlop4 = false;
                sor9oszlop4Nev = "n";
            } else if (ijasEgymasra == 410) {
                sor10oszlop4 = false;
                sor10oszlop4Nev = "n";
            } else if (ijasEgymasra == 51) {
                sor1oszlop5 = false;
                sor1oszlop5Nev = "n";
            } else if (ijasEgymasra == 52) {
                sor2oszlop5 = false;
                sor2oszlop5Nev = "n";
            } else if (ijasEgymasra == 53) {
                sor3oszlop5 = false;
                sor3oszlop5Nev = "n";
            } else if (ijasEgymasra == 54) {
                sor4oszlop5 = false;
                sor4oszlop5Nev = "n";
            } else if (ijasEgymasra == 55) {
                sor5oszlop5 = false;
                sor5oszlop5Nev = "n";
            } else if (ijasEgymasra == 56) {
                sor6oszlop5 = false;
                sor6oszlop5Nev = "n";
            } else if (ijasEgymasra == 57) {
                sor7oszlop5 = false;
                sor7oszlop5Nev = "n";
            } else if (ijasEgymasra == 58) {
                sor8oszlop5 = false;
                sor8oszlop5Nev = "n";
            } else if (ijasEgymasra == 59) {
                sor9oszlop5 = false;
                sor9oszlop5Nev = "n";
            } else if (ijasEgymasra == 510) {
                sor10oszlop5 = false;
                sor10oszlop5Nev = "n";
            } else if (ijasEgymasra == 61) {
                sor1oszlop6 = false;
                sor1oszlop6Nev = "n";
            } else if (ijasEgymasra == 62) {
                sor2oszlop6 = false;
                sor2oszlop6Nev = "n";
            } else if (ijasEgymasra == 63) {
                sor3oszlop6 = false;
                sor3oszlop6Nev = "n";
            } else if (ijasEgymasra == 64) {
                sor4oszlop6 = false;
                sor4oszlop6Nev = "n";
            } else if (ijasEgymasra == 65) {
                sor5oszlop6 = false;
                sor5oszlop6Nev = "n";
            } else if (ijasEgymasra == 66) {
                sor6oszlop6 = false;
                sor6oszlop6Nev = "n";
            } else if (ijasEgymasra == 67) {
                sor7oszlop6 = false;
                sor7oszlop6Nev = "n";
            } else if (ijasEgymasra == 68) {
                sor8oszlop6 = false;
                sor8oszlop6Nev = "n";
            } else if (ijasEgymasra == 69) {
                sor9oszlop6 = false;
                sor9oszlop6Nev = "n";
            } else if (ijasEgymasra == 610) {
                sor10oszlop6 = false;
                sor10oszlop6Nev = "n";
            } else if (ijasEgymasra == 71) {
                sor1oszlop7 = false;
                sor1oszlop7Nev = "n";
            } else if (ijasEgymasra == 72) {
                sor2oszlop7 = false;
                sor2oszlop7Nev = "n";
            } else if (ijasEgymasra == 73) {
                sor3oszlop7 = false;
                sor3oszlop7Nev = "n";
            } else if (ijasEgymasra == 74) {
                sor4oszlop7 = false;
                sor4oszlop7Nev = "n";
            } else if (ijasEgymasra == 75) {
                sor5oszlop7 = false;
                sor5oszlop7Nev = "n";
            } else if (ijasEgymasra == 76) {
                sor6oszlop7 = false;
                sor6oszlop7Nev = "n";
            } else if (ijasEgymasra == 77) {
                sor7oszlop7 = false;
                sor7oszlop7Nev = "n";
            } else if (ijasEgymasra == 78) {
                sor8oszlop7 = false;
                sor8oszlop7Nev = "n";
            } else if (ijasEgymasra == 79) {
                sor9oszlop7 = false;
                sor9oszlop7Nev = "n";
            } else if (ijasEgymasra == 710) {
                sor10oszlop7 = false;
                sor10oszlop7Nev = "n";
            } else if (ijasEgymasra == 81) {
                sor1oszlop8 = false;
                sor1oszlop8Nev = "n";
            } else if (ijasEgymasra == 82) {
                sor2oszlop8 = false;
                sor2oszlop8Nev = "n";
            } else if (ijasEgymasra == 83) {
                sor3oszlop8 = false;
                sor3oszlop8Nev = "n";
            } else if (ijasEgymasra == 84) {
                sor4oszlop8 = false;
                sor4oszlop8Nev = "n";
            } else if (ijasEgymasra == 85) {
                sor5oszlop8 = false;
                sor5oszlop8Nev = "n";
            } else if (ijasEgymasra == 86) {
                sor6oszlop8 = false;
                sor6oszlop8Nev = "n";
            } else if (ijasEgymasra == 87) {
                sor7oszlop8 = false;
                sor7oszlop8Nev = "n";
            } else if (ijasEgymasra == 88) {
                sor8oszlop8 = false;
                sor8oszlop8Nev = "n";
            } else if (ijasEgymasra == 89) {
                sor9oszlop8 = false;
                sor9oszlop8Nev = "n";
            } else if (ijasEgymasra == 810) {
                sor10oszlop8 = false;
                sor10oszlop8Nev = "n";
            } else if (ijasEgymasra == 91) {
                sor1oszlop9 = false;
                sor1oszlop9Nev = "n";
            } else if (ijasEgymasra == 92) {
                sor2oszlop9 = false;
                sor2oszlop9Nev = "n";
            } else if (ijasEgymasra == 93) {
                sor3oszlop9 = false;
                sor3oszlop9Nev = "n";
            } else if (ijasEgymasra == 94) {
                sor4oszlop9 = false;
                sor4oszlop9Nev = "n";
            } else if (ijasEgymasra == 95) {
                sor5oszlop9 = false;
                sor5oszlop9Nev = "n";
            } else if (ijasEgymasra == 96) {
                sor6oszlop9 = false;
                sor6oszlop9Nev = "n";
            } else if (ijasEgymasra == 97) {
                sor7oszlop9 = false;
                sor7oszlop9Nev = "n";
            } else if (ijasEgymasra == 98) {
                sor8oszlop9 = false;
                sor8oszlop9Nev = "n";
            } else if (ijasEgymasra == 99) {
                sor9oszlop9 = false;
                sor9oszlop9Nev = "n";
            } else if (ijasEgymasra == 910) {
                sor10oszlop9 = false;
                sor10oszlop9Nev = "n";
            } else if (ijasEgymasra == 101) {
                sor1oszlop10 = false;
                sor1oszlop10Nev = "n";
            } else if (ijasEgymasra == 102) {
                sor2oszlop10 = false;
                sor2oszlop10Nev = "n";
            } else if (ijasEgymasra == 103) {
                sor3oszlop10 = false;
                sor3oszlop10Nev = "n";
            } else if (ijasEgymasra == 104) {
                sor4oszlop10 = false;
                sor4oszlop10Nev = "n";
            } else if (ijasEgymasra == 105) {
                sor5oszlop10 = false;
                sor5oszlop10Nev = "n";
            } else if (ijasEgymasra == 106) {
                sor6oszlop10 = false;
                sor6oszlop10Nev = "n";
            } else if (ijasEgymasra == 107) {
                sor7oszlop10 = false;
                sor7oszlop10Nev = "n";
            } else if (ijasEgymasra == 108) {
                sor8oszlop10 = false;
                sor8oszlop10Nev = "n";
            } else if (ijasEgymasra == 109) {
                sor9oszlop10 = false;
                sor9oszlop10Nev = "n";
            } else if (ijasEgymasra == 1010) {
                sor10oszlop10 = false;
                sor10oszlop10Nev = "n";
            } else if (ijasEgymasra == 111) {
                sor1oszlop11 = false;
                sor1oszlop11Nev = "n";
            } else if (ijasEgymasra == 112) {
                sor2oszlop11 = false;
                sor2oszlop11Nev = "n";
            } else if (ijasEgymasra == 113) {
                sor3oszlop11 = false;
                sor3oszlop11Nev = "n";
            } else if (ijasEgymasra == 114) {
                sor4oszlop11 = false;
                sor4oszlop11Nev = "n";
            } else if (ijasEgymasra == 115) {
                sor5oszlop11 = false;
                sor5oszlop11Nev = "n";
            } else if (ijasEgymasra == 116) {
                sor6oszlop11 = false;
                sor6oszlop11Nev = "n";
            } else if (ijasEgymasra == 117) {
                sor7oszlop11 = false;
                sor7oszlop11Nev = "n";
            } else if (ijasEgymasra == 118) {
                sor8oszlop11 = false;
                sor8oszlop11Nev = "n";
            } else if (ijasEgymasra == 119) {
                sor9oszlop11 = false;
                sor9oszlop11Nev = "n";
            } else if (ijasEgymasra == 1110) {
                sor10oszlop11 = false;
                sor10oszlop11Nev = "n";
            } else if (ijasEgymasra == 121) {
                sor1oszlop12 = false;
                sor1oszlop12Nev = "n";
            } else if (ijasEgymasra == 122) {
                sor2oszlop12 = false;
                sor2oszlop12Nev = "n";
            } else if (ijasEgymasra == 123) {
                sor3oszlop12 = false;
                sor3oszlop12Nev = "n";
            } else if (ijasEgymasra == 124) {
                sor4oszlop12 = false;
                sor4oszlop12Nev = "n";
            } else if (ijasEgymasra == 125) {
                sor5oszlop12 = false;
                sor5oszlop12Nev = "n";
            } else if (ijasEgymasra == 126) {
                sor6oszlop12 = false;
                sor6oszlop12Nev = "n";
            } else if (ijasEgymasra == 127) {
                sor7oszlop12 = false;
                sor7oszlop12Nev = "n";
            } else if (ijasEgymasra == 128) {
                sor8oszlop12 = false;
                sor8oszlop12Nev = "n";
            } else if (ijasEgymasra == 129) {
                sor9oszlop12 = false;
                sor9oszlop12Nev = "n";
            } else if (ijasEgymasra == 1210) {
                sor10oszlop12 = false;
                sor10oszlop12Nev = "n";
            }
            ijasEgymasra = poz;

        }
    }

    public static void holVagyKettoFelder(int oszlop, int sor,String egyseg) {

        int poz = Integer.parseInt(oszlop + "" + sor);
        pozTamadhatoFelder=(oszlop + "-" + sor);
        int pozJelenlegi = Integer.parseInt(regiPozOszlop + "" + regiPozSor);

        if (felderEgymasra != 0 && egyseg.equals("felder") && minoEgymasra != poz && felderEgymasra != poz && csontEgymasra != poz && orgyEgymasra != poz && raptEgymasra != poz
                && egrifEgymasra != poz && eijasEgymasra != poz && efoldmuvEgymasra != poz && efegyvEgymasra != poz && eharcpEgymasra != poz && felderEgymasra != pozJelenlegi) {
            if (felderEgymasra == 11) {
                sor1oszlop1 = false;
                sor1oszlop1Nev = "n";
            } else if (felderEgymasra == 12) {
                sor2oszlop1 = false;
                sor2oszlop1Nev = "n";
            } else if (felderEgymasra == 13) {
                sor3oszlop1 = false;
                sor3oszlop1Nev = "n";
            } else if (felderEgymasra == 14) {
                sor4oszlop1 = false;
                sor4oszlop1Nev = "n";
            } else if (felderEgymasra == 15) {
                sor5oszlop1 = false;
                sor5oszlop1Nev = "n";
            } else if (felderEgymasra == 16) {
                sor6oszlop1 = false;
                sor6oszlop1Nev = "n";
            } else if (felderEgymasra == 17) {
                sor7oszlop1 = false;
                sor7oszlop1Nev = "n";
            } else if (felderEgymasra == 18) {
                sor8oszlop1 = false;
                sor8oszlop1Nev = "n";
            } else if (felderEgymasra == 19) {
                sor9oszlop1 = false;
                sor9oszlop1Nev = "n";
            } else if (felderEgymasra == 110) {
                sor10oszlop1 = false;
                sor10oszlop1Nev = "n";
            } else if (felderEgymasra == 21) {
                sor1oszlop2 = false;
                sor1oszlop2Nev = "n";
            } else if (felderEgymasra == 22) {
                sor2oszlop2 = false;
                sor2oszlop2Nev = "n";
            } else if (felderEgymasra == 23) {
                sor3oszlop2 = false;
                sor3oszlop2Nev = "n";
            } else if (felderEgymasra == 24) {
                sor4oszlop2 = false;
                sor4oszlop2Nev = "n";
            } else if (felderEgymasra == 25) {
                sor5oszlop2 = false;
                sor5oszlop2Nev = "n";
            } else if (felderEgymasra == 26) {
                sor6oszlop2 = false;
                sor6oszlop2Nev = "n";
            } else if (felderEgymasra == 27) {
                sor7oszlop2 = false;
                sor7oszlop2Nev = "n";
            } else if (felderEgymasra == 28) {
                sor8oszlop2 = false;
                sor8oszlop2Nev = "n";
            } else if (felderEgymasra == 29) {
                sor9oszlop2 = false;
                sor9oszlop2Nev = "n";
            } else if (felderEgymasra == 210) {
                sor10oszlop2 = false;
                sor10oszlop2Nev = "n";
            } else if (felderEgymasra == 31) {
                sor1oszlop3 = false;
                sor1oszlop3Nev = "n";
            } else if (felderEgymasra == 32) {
                sor2oszlop3 = false;
                sor2oszlop3Nev = "n";
            } else if (felderEgymasra == 33) {
                sor3oszlop3 = false;
                sor3oszlop3Nev = "n";
            } else if (felderEgymasra == 34) {
                sor4oszlop3 = false;
                sor4oszlop3Nev = "n";
            } else if (felderEgymasra == 35) {
                sor5oszlop3 = false;
                sor5oszlop3Nev = "n";
            } else if (felderEgymasra == 36) {
                sor6oszlop3 = false;
                sor6oszlop3Nev = "n";
            } else if (felderEgymasra == 37) {
                sor7oszlop3 = false;
                sor7oszlop3Nev = "n";
            } else if (felderEgymasra == 38) {
                sor8oszlop3 = false;
                sor8oszlop3Nev = "n";
            } else if (felderEgymasra == 39) {
                sor9oszlop3 = false;
                sor9oszlop3Nev = "n";
            } else if (felderEgymasra == 310) {
                sor10oszlop3 = false;
                sor10oszlop3Nev = "n";
            } else if (felderEgymasra == 41) {
                sor1oszlop4 = false;
                sor1oszlop4Nev = "n";
            } else if (felderEgymasra == 42) {
                sor2oszlop4 = false;
                sor2oszlop4Nev = "n";
            } else if (felderEgymasra == 43) {
                sor3oszlop4 = false;
                sor3oszlop4Nev = "n";
            } else if (felderEgymasra == 44) {
                sor4oszlop4 = false;
                sor4oszlop4Nev = "n";
            } else if (felderEgymasra == 45) {
                sor5oszlop4 = false;
                sor5oszlop4Nev = "n";
            } else if (felderEgymasra == 46) {
                sor6oszlop4 = false;
                sor6oszlop4Nev = "n";
            } else if (felderEgymasra == 47) {
                sor7oszlop4 = false;
                sor7oszlop4Nev = "n";
            } else if (felderEgymasra == 48) {
                sor8oszlop4 = false;
                sor8oszlop4Nev = "n";
            } else if (felderEgymasra == 49) {
                sor9oszlop4 = false;
                sor9oszlop4Nev = "n";
            } else if (felderEgymasra == 410) {
                sor10oszlop4 = false;
                sor10oszlop4Nev = "n";
            } else if (felderEgymasra == 51) {
                sor1oszlop5 = false;
                sor1oszlop5Nev = "n";
            } else if (felderEgymasra == 52) {
                sor2oszlop5 = false;
                sor2oszlop5Nev = "n";
            } else if (felderEgymasra == 53) {
                sor3oszlop5 = false;
                sor3oszlop5Nev = "n";
            } else if (felderEgymasra == 54) {
                sor4oszlop5 = false;
                sor4oszlop5Nev = "n";
            } else if (felderEgymasra == 55) {
                sor5oszlop5 = false;
                sor5oszlop5Nev = "n";
            } else if (felderEgymasra == 56) {
                sor6oszlop5 = false;
                sor6oszlop5Nev = "n";
            } else if (felderEgymasra == 57) {
                sor7oszlop5 = false;
                sor7oszlop5Nev = "n";
            } else if (felderEgymasra == 58) {
                sor8oszlop5 = false;
                sor8oszlop5Nev = "n";
            } else if (felderEgymasra == 59) {
                sor9oszlop5 = false;
                sor9oszlop5Nev = "n";
            } else if (felderEgymasra == 510) {
                sor10oszlop5 = false;
                sor10oszlop5Nev = "n";
            } else if (felderEgymasra == 61) {
                sor1oszlop6 = false;
                sor1oszlop6Nev = "n";
            } else if (felderEgymasra == 62) {
                sor2oszlop6 = false;
                sor2oszlop6Nev = "n";
            } else if (felderEgymasra == 63) {
                sor3oszlop6 = false;
                sor3oszlop6Nev = "n";
            } else if (felderEgymasra == 64) {
                sor4oszlop6 = false;
                sor4oszlop6Nev = "n";
            } else if (felderEgymasra == 65) {
                sor5oszlop6 = false;
                sor5oszlop6Nev = "n";
            } else if (felderEgymasra == 66) {
                sor6oszlop6 = false;
                sor6oszlop6Nev = "n";
            } else if (felderEgymasra == 67) {
                sor7oszlop6 = false;
                sor7oszlop6Nev = "n";
            } else if (felderEgymasra == 68) {
                sor8oszlop6 = false;
                sor8oszlop6Nev = "n";
            } else if (felderEgymasra == 69) {
                sor9oszlop6 = false;
                sor9oszlop6Nev = "n";
            } else if (felderEgymasra == 610) {
                sor10oszlop6 = false;
                sor10oszlop6Nev = "n";
            } else if (felderEgymasra == 71) {
                sor1oszlop7 = false;
                sor1oszlop7Nev = "n";
            } else if (felderEgymasra == 72) {
                sor2oszlop7 = false;
                sor2oszlop7Nev = "n";
            } else if (felderEgymasra == 73) {
                sor3oszlop7 = false;
                sor3oszlop7Nev = "n";
            } else if (felderEgymasra == 74) {
                sor4oszlop7 = false;
                sor4oszlop7Nev = "n";
            } else if (felderEgymasra == 75) {
                sor5oszlop7 = false;
                sor5oszlop7Nev = "n";
            } else if (felderEgymasra == 76) {
                sor6oszlop7 = false;
                sor6oszlop7Nev = "n";
            } else if (felderEgymasra == 77) {
                sor7oszlop7 = false;
                sor7oszlop7Nev = "n";
            } else if (felderEgymasra == 78) {
                sor8oszlop7 = false;
                sor8oszlop7Nev = "n";
            } else if (felderEgymasra == 79) {
                sor9oszlop7 = false;
                sor9oszlop7Nev = "n";
            } else if (felderEgymasra == 710) {
                sor10oszlop7 = false;
                sor10oszlop7Nev = "n";
            } else if (felderEgymasra == 81) {
                sor1oszlop8 = false;
                sor1oszlop8Nev = "n";
            } else if (felderEgymasra == 82) {
                sor2oszlop8 = false;
                sor2oszlop8Nev = "n";
            } else if (felderEgymasra == 83) {
                sor3oszlop8 = false;
                sor3oszlop8Nev = "n";
            } else if (felderEgymasra == 84) {
                sor4oszlop8 = false;
                sor4oszlop8Nev = "n";
            } else if (felderEgymasra == 85) {
                sor5oszlop8 = false;
                sor5oszlop8Nev = "n";
            } else if (felderEgymasra == 86) {
                sor6oszlop8 = false;
                sor6oszlop8Nev = "n";
            } else if (felderEgymasra == 87) {
                sor7oszlop8 = false;
                sor7oszlop8Nev = "n";
            } else if (felderEgymasra == 88) {
                sor8oszlop8 = false;
                sor8oszlop8Nev = "n";
            } else if (felderEgymasra == 89) {
                sor9oszlop8 = false;
                sor9oszlop8Nev = "n";
            } else if (felderEgymasra == 810) {
                sor10oszlop8 = false;
                sor10oszlop8Nev = "n";
            } else if (felderEgymasra == 91) {
                sor1oszlop9 = false;
                sor1oszlop9Nev = "n";
            } else if (felderEgymasra == 92) {
                sor2oszlop9 = false;
                sor2oszlop9Nev = "n";
            } else if (felderEgymasra == 93) {
                sor3oszlop9 = false;
                sor3oszlop9Nev = "n";
            } else if (felderEgymasra == 94) {
                sor4oszlop9 = false;
                sor4oszlop9Nev = "n";
            } else if (felderEgymasra == 95) {
                sor5oszlop9 = false;
                sor5oszlop9Nev = "n";
            } else if (felderEgymasra == 96) {
                sor6oszlop9 = false;
                sor6oszlop9Nev = "n";
            } else if (felderEgymasra == 97) {
                sor7oszlop9 = false;
                sor7oszlop9Nev = "n";
            } else if (felderEgymasra == 98) {
                sor8oszlop9 = false;
                sor8oszlop9Nev = "n";
            } else if (felderEgymasra == 99) {
                sor9oszlop9 = false;
                sor9oszlop9Nev = "n";
            } else if (felderEgymasra == 910) {
                sor10oszlop9 = false;
                sor10oszlop9Nev = "n";
            } else if (felderEgymasra == 101) {
                sor1oszlop10 = false;
                sor1oszlop10Nev = "n";
            } else if (felderEgymasra == 102) {
                sor2oszlop10 = false;
                sor2oszlop10Nev = "n";
            } else if (felderEgymasra == 103) {
                sor3oszlop10 = false;
                sor3oszlop10Nev = "n";
            } else if (felderEgymasra == 104) {
                sor4oszlop10 = false;
                sor4oszlop10Nev = "n";
            } else if (felderEgymasra == 105) {
                sor5oszlop10 = false;
                sor5oszlop10Nev = "n";
            } else if (felderEgymasra == 106) {
                sor6oszlop10 = false;
                sor6oszlop10Nev = "n";
            } else if (felderEgymasra == 107) {
                sor7oszlop10 = false;
                sor7oszlop10Nev = "n";
            } else if (felderEgymasra == 108) {
                sor8oszlop10 = false;
                sor8oszlop10Nev = "n";
            } else if (felderEgymasra == 109) {
                sor9oszlop10 = false;
                sor9oszlop10Nev = "n";
            } else if (felderEgymasra == 1010) {
                sor10oszlop10 = false;
                sor10oszlop10Nev = "n";
            } else if (felderEgymasra == 111) {
                sor1oszlop11 = false;
                sor1oszlop11Nev = "n";
            } else if (felderEgymasra == 112) {
                sor2oszlop11 = false;
                sor2oszlop11Nev = "n";
            } else if (felderEgymasra == 113) {
                sor3oszlop11 = false;
                sor3oszlop11Nev = "n";
            } else if (felderEgymasra == 114) {
                sor4oszlop11 = false;
                sor4oszlop11Nev = "n";
            } else if (felderEgymasra == 115) {
                sor5oszlop11 = false;
                sor5oszlop11Nev = "n";
            } else if (felderEgymasra == 116) {
                sor6oszlop11 = false;
                sor6oszlop11Nev = "n";
            } else if (felderEgymasra == 117) {
                sor7oszlop11 = false;
                sor7oszlop11Nev = "n";
            } else if (felderEgymasra == 118) {
                sor8oszlop11 = false;
                sor8oszlop11Nev = "n";
            } else if (felderEgymasra == 119) {
                sor9oszlop11 = false;
                sor9oszlop11Nev = "n";
            } else if (felderEgymasra == 1110) {
                sor10oszlop11 = false;
                sor10oszlop11Nev = "n";
            } else if (felderEgymasra == 121) {
                sor1oszlop12 = false;
                sor1oszlop12Nev = "n";
            } else if (felderEgymasra == 122) {
                sor2oszlop12 = false;
                sor2oszlop12Nev = "n";
            } else if (felderEgymasra == 123) {
                sor3oszlop12 = false;
                sor3oszlop12Nev = "n";
            } else if (felderEgymasra == 124) {
                sor4oszlop12 = false;
                sor4oszlop12Nev = "n";
            } else if (felderEgymasra == 125) {
                sor5oszlop12 = false;
                sor5oszlop12Nev = "n";
            } else if (felderEgymasra == 126) {
                sor6oszlop12 = false;
                sor6oszlop12Nev = "n";
            } else if (felderEgymasra == 127) {
                sor7oszlop12 = false;
                sor7oszlop12Nev = "n";
            } else if (felderEgymasra == 128) {
                sor8oszlop12 = false;
                sor8oszlop12Nev = "n";
            } else if (felderEgymasra == 129) {
                sor9oszlop12 = false;
                sor9oszlop12Nev = "n";
            } else if (felderEgymasra == 1210) {
                sor10oszlop12 = false;
                sor10oszlop12Nev = "n";
            }
            felderEgymasra = poz;

        }
    }

    public static void holVagyKettoGrif(int oszlop, int sor,String egyseg) {

        int poz = Integer.parseInt(oszlop + "" + sor);
        pozTamadhatoGrif=(oszlop + "-" + sor);
        int pozJelenlegi = Integer.parseInt(regiPozOszlop + "" + regiPozSor);

        if (grifEgymasra != 0 && egyseg.equals("grif") && grifEgymasra != poz && ijasEgymasra != poz && foldmuvEgymasra != poz && fegyvEgymasra != poz && harcpEgymasra != poz
                && eminoEgymasra != poz && efelderEgymasra != poz && ecsontEgymasra != poz && eorgyEgymasra != poz && eraptEgymasra != poz && grifEgymasra != pozJelenlegi) {
            if (grifEgymasra == 11) {
                sor1oszlop1 = false;
                sor1oszlop1Nev = "n";
            } else if (grifEgymasra == 12) {
                sor2oszlop1 = false;
                sor2oszlop1Nev = "n";
            } else if (grifEgymasra == 13) {
                sor3oszlop1 = false;
                sor3oszlop1Nev = "n";
            } else if (grifEgymasra == 14) {
                sor4oszlop1 = false;
                sor4oszlop1Nev = "n";
            } else if (grifEgymasra == 15) {
                sor5oszlop1 = false;
                sor5oszlop1Nev = "n";
            } else if (grifEgymasra == 16) {
                sor6oszlop1 = false;
                sor6oszlop1Nev = "n";
            } else if (grifEgymasra == 17) {
                sor7oszlop1 = false;
                sor7oszlop1Nev = "n";
            } else if (grifEgymasra == 18) {
                sor8oszlop1 = false;
                sor8oszlop1Nev = "n";
            } else if (grifEgymasra == 19) {
                sor9oszlop1 = false;
                sor9oszlop1Nev = "n";
            } else if (grifEgymasra == 110) {
                sor10oszlop1 = false;
                sor10oszlop1Nev = "n";
            } else if (grifEgymasra == 21) {
                sor1oszlop2 = false;
                sor1oszlop2Nev = "n";
            } else if (grifEgymasra == 22) {
                sor2oszlop2 = false;
                sor2oszlop2Nev = "n";
            } else if (grifEgymasra == 23) {
                sor3oszlop2 = false;
                sor3oszlop2Nev = "n";
            } else if (grifEgymasra == 24) {
                sor4oszlop2 = false;
                sor4oszlop2Nev = "n";
            } else if (grifEgymasra == 25) {
                sor5oszlop2 = false;
                sor5oszlop2Nev = "n";
            } else if (grifEgymasra == 26) {
                sor6oszlop2 = false;
                sor6oszlop2Nev = "n";
            } else if (grifEgymasra == 27) {
                sor7oszlop2 = false;
                sor7oszlop2Nev = "n";
            } else if (grifEgymasra == 28) {
                sor8oszlop2 = false;
                sor8oszlop2Nev = "n";
            } else if (grifEgymasra == 29) {
                sor9oszlop2 = false;
                sor9oszlop2Nev = "n";
            } else if (grifEgymasra == 210) {
                sor10oszlop2 = false;
                sor10oszlop2Nev = "n";
            } else if (grifEgymasra == 31) {
                sor1oszlop3 = false;
                sor1oszlop3Nev = "n";
            } else if (grifEgymasra == 32) {
                sor2oszlop3 = false;
                sor2oszlop3Nev = "n";
            } else if (grifEgymasra == 33) {
                sor3oszlop3 = false;
                sor3oszlop3Nev = "n";
            } else if (grifEgymasra == 34) {
                sor4oszlop3 = false;
                sor4oszlop3Nev = "n";
            } else if (grifEgymasra == 35) {
                sor5oszlop3 = false;
                sor5oszlop3Nev = "n";
            } else if (grifEgymasra == 36) {
                sor6oszlop3 = false;
                sor6oszlop3Nev = "n";
            } else if (grifEgymasra == 37) {
                sor7oszlop3 = false;
                sor7oszlop3Nev = "n";
            } else if (grifEgymasra == 38) {
                sor8oszlop3 = false;
                sor8oszlop3Nev = "n";
            } else if (grifEgymasra == 39) {
                sor9oszlop3 = false;
                sor9oszlop3Nev = "n";
            } else if (grifEgymasra == 310) {
                sor10oszlop3 = false;
                sor10oszlop3Nev = "n";
            } else if (grifEgymasra == 41) {
                sor1oszlop4 = false;
                sor1oszlop4Nev = "n";
            } else if (grifEgymasra == 42) {
                sor2oszlop4 = false;
                sor2oszlop4Nev = "n";
            } else if (grifEgymasra == 43) {
                sor3oszlop4 = false;
                sor3oszlop4Nev = "n";
            } else if (grifEgymasra == 44) {
                sor4oszlop4 = false;
                sor4oszlop4Nev = "n";
            } else if (grifEgymasra == 45) {
                sor5oszlop4 = false;
                sor5oszlop4Nev = "n";
            } else if (grifEgymasra == 46) {
                sor6oszlop4 = false;
                sor6oszlop4Nev = "n";
            } else if (grifEgymasra == 47) {
                sor7oszlop4 = false;
                sor7oszlop4Nev = "n";
            } else if (grifEgymasra == 48) {
                sor8oszlop4 = false;
                sor8oszlop4Nev = "n";
            } else if (grifEgymasra == 49) {
                sor9oszlop4 = false;
                sor9oszlop4Nev = "n";
            } else if (grifEgymasra == 410) {
                sor10oszlop4 = false;
                sor10oszlop4Nev = "n";
            } else if (grifEgymasra == 51) {
                sor1oszlop5 = false;
                sor1oszlop5Nev = "n";
            } else if (grifEgymasra == 52) {
                sor2oszlop5 = false;
                sor2oszlop5Nev = "n";
            } else if (grifEgymasra == 53) {
                sor3oszlop5 = false;
                sor3oszlop5Nev = "n";
            } else if (grifEgymasra == 54) {
                sor4oszlop5 = false;
                sor4oszlop5Nev = "n";
            } else if (grifEgymasra == 55) {
                sor5oszlop5 = false;
                sor5oszlop5Nev = "n";
            } else if (grifEgymasra == 56) {
                sor6oszlop5 = false;
                sor6oszlop5Nev = "n";
            } else if (grifEgymasra == 57) {
                sor7oszlop5 = false;
                sor7oszlop5Nev = "n";
            } else if (grifEgymasra == 58) {
                sor8oszlop5 = false;
                sor8oszlop5Nev = "n";
            } else if (grifEgymasra == 59) {
                sor9oszlop5 = false;
                sor9oszlop5Nev = "n";
            } else if (grifEgymasra == 510) {
                sor10oszlop5 = false;
                sor10oszlop5Nev = "n";
            } else if (grifEgymasra == 61) {
                sor1oszlop6 = false;
                sor1oszlop6Nev = "n";
            } else if (grifEgymasra == 62) {
                sor2oszlop6 = false;
                sor2oszlop6Nev = "n";
            } else if (grifEgymasra == 63) {
                sor3oszlop6 = false;
                sor3oszlop6Nev = "n";
            } else if (grifEgymasra == 64) {
                sor4oszlop6 = false;
                sor4oszlop6Nev = "n";
            } else if (grifEgymasra == 65) {
                sor5oszlop6 = false;
                sor5oszlop6Nev = "n";
            } else if (grifEgymasra == 66) {
                sor6oszlop6 = false;
                sor6oszlop6Nev = "n";
            } else if (grifEgymasra == 67) {
                sor7oszlop6 = false;
                sor7oszlop6Nev = "n";
            } else if (grifEgymasra == 68) {
                sor8oszlop6 = false;
                sor8oszlop6Nev = "n";
            } else if (grifEgymasra == 69) {
                sor9oszlop6 = false;
                sor9oszlop6Nev = "n";
            } else if (grifEgymasra == 610) {
                sor10oszlop6 = false;
                sor10oszlop6Nev = "n";
            } else if (grifEgymasra == 71) {
                sor1oszlop7 = false;
                sor1oszlop7Nev = "n";
            } else if (grifEgymasra == 72) {
                sor2oszlop7 = false;
                sor2oszlop7Nev = "n";
            } else if (grifEgymasra == 73) {
                sor3oszlop7 = false;
                sor3oszlop7Nev = "n";
            } else if (grifEgymasra == 74) {
                sor4oszlop7 = false;
                sor4oszlop7Nev = "n";
            } else if (grifEgymasra == 75) {
                sor5oszlop7 = false;
                sor5oszlop7Nev = "n";
            } else if (grifEgymasra == 76) {
                sor6oszlop7 = false;
                sor6oszlop7Nev = "n";
            } else if (grifEgymasra == 77) {
                sor7oszlop7 = false;
                sor7oszlop7Nev = "n";
            } else if (grifEgymasra == 78) {
                sor8oszlop7 = false;
                sor8oszlop7Nev = "n";
            } else if (grifEgymasra == 79) {
                sor9oszlop7 = false;
                sor9oszlop7Nev = "n";
            } else if (grifEgymasra == 710) {
                sor10oszlop7 = false;
                sor10oszlop7Nev = "n";
            } else if (grifEgymasra == 81) {
                sor1oszlop8 = false;
                sor1oszlop8Nev = "n";
            } else if (grifEgymasra == 82) {
                sor2oszlop8 = false;
                sor2oszlop8Nev = "n";
            } else if (grifEgymasra == 83) {
                sor3oszlop8 = false;
                sor3oszlop8Nev = "n";
            } else if (grifEgymasra == 84) {
                sor4oszlop8 = false;
                sor4oszlop8Nev = "n";
            } else if (grifEgymasra == 85) {
                sor5oszlop8 = false;
                sor5oszlop8Nev = "n";
            } else if (grifEgymasra == 86) {
                sor6oszlop8 = false;
                sor6oszlop8Nev = "n";
            } else if (grifEgymasra == 87) {
                sor7oszlop8 = false;
                sor7oszlop8Nev = "n";
            } else if (grifEgymasra == 88) {
                sor8oszlop8 = false;
                sor8oszlop8Nev = "n";
            } else if (grifEgymasra == 89) {
                sor9oszlop8 = false;
                sor9oszlop8Nev = "n";
            } else if (grifEgymasra == 810) {
                sor10oszlop8 = false;
                sor10oszlop8Nev = "n";
            } else if (grifEgymasra == 91) {
                sor1oszlop9 = false;
                sor1oszlop9Nev = "n";
            } else if (grifEgymasra == 92) {
                sor2oszlop9 = false;
                sor2oszlop9Nev = "n";
            } else if (grifEgymasra == 93) {
                sor3oszlop9 = false;
                sor3oszlop9Nev = "n";
            } else if (grifEgymasra == 94) {
                sor4oszlop9 = false;
                sor4oszlop9Nev = "n";
            } else if (grifEgymasra == 95) {
                sor5oszlop9 = false;
                sor5oszlop9Nev = "n";
            } else if (grifEgymasra == 96) {
                sor6oszlop9 = false;
                sor6oszlop9Nev = "n";
            } else if (grifEgymasra == 97) {
                sor7oszlop9 = false;
                sor7oszlop9Nev = "n";
            } else if (grifEgymasra == 98) {
                sor8oszlop9 = false;
                sor8oszlop9Nev = "n";
            } else if (grifEgymasra == 99) {
                sor9oszlop9 = false;
                sor9oszlop9Nev = "n";
            } else if (grifEgymasra == 910) {
                sor10oszlop9 = false;
                sor10oszlop9Nev = "n";
            } else if (grifEgymasra == 101) {
                sor1oszlop10 = false;
                sor1oszlop10Nev = "n";
            } else if (grifEgymasra == 102) {
                sor2oszlop10 = false;
                sor2oszlop10Nev = "n";
            } else if (grifEgymasra == 103) {
                sor3oszlop10 = false;
                sor3oszlop10Nev = "n";
            } else if (grifEgymasra == 104) {
                sor4oszlop10 = false;
                sor4oszlop10Nev = "n";
            } else if (grifEgymasra == 105) {
                sor5oszlop10 = false;
                sor5oszlop10Nev = "n";
            } else if (grifEgymasra == 106) {
                sor6oszlop10 = false;
                sor6oszlop10Nev = "n";
            } else if (grifEgymasra == 107) {
                sor7oszlop10 = false;
                sor7oszlop10Nev = "n";
            } else if (grifEgymasra == 108) {
                sor8oszlop10 = false;
                sor8oszlop10Nev = "n";
            } else if (grifEgymasra == 109) {
                sor9oszlop10 = false;
                sor9oszlop10Nev = "n";
            } else if (grifEgymasra == 1010) {
                sor10oszlop10 = false;
                sor10oszlop10Nev = "n";
            } else if (grifEgymasra == 111) {
                sor1oszlop11 = false;
                sor1oszlop11Nev = "n";
            } else if (grifEgymasra == 112) {
                sor2oszlop11 = false;
                sor2oszlop11Nev = "n";
            } else if (grifEgymasra == 113) {
                sor3oszlop11 = false;
                sor3oszlop11Nev = "n";
            } else if (grifEgymasra == 114) {
                sor4oszlop11 = false;
                sor4oszlop11Nev = "n";
            } else if (grifEgymasra == 115) {
                sor5oszlop11 = false;
                sor5oszlop11Nev = "n";
            } else if (grifEgymasra == 116) {
                sor6oszlop11 = false;
                sor6oszlop11Nev = "n";
            } else if (grifEgymasra == 117) {
                sor7oszlop11 = false;
                sor7oszlop11Nev = "n";
            } else if (grifEgymasra == 118) {
                sor8oszlop11 = false;
                sor8oszlop11Nev = "n";
            } else if (grifEgymasra == 119) {
                sor9oszlop11 = false;
                sor9oszlop11Nev = "n";
            } else if (grifEgymasra == 1110) {
                sor10oszlop11 = false;
                sor10oszlop11Nev = "n";
            } else if (grifEgymasra == 121) {
                sor1oszlop12 = false;
                sor1oszlop12Nev = "n";
            } else if (grifEgymasra == 122) {
                sor2oszlop12 = false;
                sor2oszlop12Nev = "n";
            } else if (grifEgymasra == 123) {
                sor3oszlop12 = false;
                sor3oszlop12Nev = "n";
            } else if (grifEgymasra == 124) {
                sor4oszlop12 = false;
                sor4oszlop12Nev = "n";
            } else if (grifEgymasra == 125) {
                sor5oszlop12 = false;
                sor5oszlop12Nev = "n";
            } else if (grifEgymasra == 126) {
                sor6oszlop12 = false;
                sor6oszlop12Nev = "n";
            } else if (grifEgymasra == 127) {
                sor7oszlop12 = false;
                sor7oszlop12Nev = "n";
            } else if (grifEgymasra == 128) {
                sor8oszlop12 = false;
                sor8oszlop12Nev = "n";
            } else if (grifEgymasra == 129) {
                sor9oszlop12 = false;
                sor9oszlop12Nev = "n";
            } else if (grifEgymasra == 1210) {
                sor10oszlop12 = false;
                sor10oszlop12Nev = "n";
            }
            grifEgymasra = poz;

        }
    }



    public static void holVagyKettoFegyv(int oszlop, int sor,String egyseg) {

        int poz = Integer.parseInt(oszlop + "" + sor);
        pozTamadhatoFegyv=(oszlop + "-" + sor);
        int pozJelenlegi = Integer.parseInt(regiPozOszlop + "" + regiPozSor);


        if (fegyvEgymasra != 0 && egyseg.equals("fegyv") && grifEgymasra != poz && ijasEgymasra != poz && foldmuvEgymasra != poz && fegyvEgymasra != poz && harcpEgymasra != poz
                && eminoEgymasra != poz && efelderEgymasra != poz && ecsontEgymasra != poz && eorgyEgymasra != poz && eraptEgymasra != poz && fegyvEgymasra != pozJelenlegi) {
            if (fegyvEgymasra == 11) {
                sor1oszlop1 = false;
                sor1oszlop1Nev = "n";
            } else if (fegyvEgymasra == 12) {
                sor2oszlop1 = false;
                sor2oszlop1Nev = "n";
            } else if (fegyvEgymasra == 13) {
                sor3oszlop1 = false;
                sor3oszlop1Nev = "n";
            } else if (fegyvEgymasra == 14) {
                sor4oszlop1 = false;
                sor4oszlop1Nev = "n";
            } else if (fegyvEgymasra == 15) {
                sor5oszlop1 = false;
                sor5oszlop1Nev = "n";
            } else if (fegyvEgymasra == 16) {
                sor6oszlop1 = false;
                sor6oszlop1Nev = "n";
            } else if (fegyvEgymasra == 17) {
                sor7oszlop1 = false;
                sor7oszlop1Nev = "n";
            } else if (fegyvEgymasra == 18) {
                sor8oszlop1 = false;
                sor8oszlop1Nev = "n";
            } else if (fegyvEgymasra == 19) {
                sor9oszlop1 = false;
                sor9oszlop1Nev = "n";
            } else if (fegyvEgymasra == 110) {
                sor10oszlop1 = false;
                sor10oszlop1Nev = "n";
            } else if (fegyvEgymasra == 21) {
                sor1oszlop2 = false;
                sor1oszlop2Nev = "n";
            } else if (fegyvEgymasra == 22) {
                sor2oszlop2 = false;
                sor2oszlop2Nev = "n";
            } else if (fegyvEgymasra == 23) {
                sor3oszlop2 = false;
                sor3oszlop2Nev = "n";
            } else if (fegyvEgymasra == 24) {
                sor4oszlop2 = false;
                sor4oszlop2Nev = "n";
            } else if (fegyvEgymasra == 25) {
                sor5oszlop2 = false;
                sor5oszlop2Nev = "n";
            } else if (fegyvEgymasra == 26) {
                sor6oszlop2 = false;
                sor6oszlop2Nev = "n";
            } else if (fegyvEgymasra == 27) {
                sor7oszlop2 = false;
                sor7oszlop2Nev = "n";
            } else if (fegyvEgymasra == 28) {
                sor8oszlop2 = false;
                sor8oszlop2Nev = "n";
            } else if (fegyvEgymasra == 29) {
                sor9oszlop2 = false;
                sor9oszlop2Nev = "n";
            } else if (fegyvEgymasra == 210) {
                sor10oszlop2 = false;
                sor10oszlop2Nev = "n";
            } else if (fegyvEgymasra == 31) {
                sor1oszlop3 = false;
                sor1oszlop3Nev = "n";
            } else if (fegyvEgymasra == 32) {
                sor2oszlop3 = false;
                sor2oszlop3Nev = "n";
            } else if (fegyvEgymasra == 33) {
                sor3oszlop3 = false;
                sor3oszlop3Nev = "n";
            } else if (fegyvEgymasra == 34) {
                sor4oszlop3 = false;
                sor4oszlop3Nev = "n";
            } else if (fegyvEgymasra == 35) {
                sor5oszlop3 = false;
                sor5oszlop3Nev = "n";
            } else if (fegyvEgymasra == 36) {
                sor6oszlop3 = false;
                sor6oszlop3Nev = "n";
            } else if (fegyvEgymasra == 37) {
                sor7oszlop3 = false;
                sor7oszlop3Nev = "n";
            } else if (fegyvEgymasra == 38) {
                sor8oszlop3 = false;
                sor8oszlop3Nev = "n";
            } else if (fegyvEgymasra == 39) {
                sor9oszlop3 = false;
                sor9oszlop3Nev = "n";
            } else if (fegyvEgymasra == 310) {
                sor10oszlop3 = false;
                sor10oszlop3Nev = "n";
            } else if (fegyvEgymasra == 41) {
                sor1oszlop4 = false;
                sor1oszlop4Nev = "n";
            } else if (fegyvEgymasra == 42) {
                sor2oszlop4 = false;
                sor2oszlop4Nev = "n";
            } else if (fegyvEgymasra == 43) {
                sor3oszlop4 = false;
                sor3oszlop4Nev = "n";
            } else if (fegyvEgymasra == 44) {
                sor4oszlop4 = false;
                sor4oszlop4Nev = "n";
            } else if (fegyvEgymasra == 45) {
                sor5oszlop4 = false;
                sor5oszlop4Nev = "n";
            } else if (fegyvEgymasra == 46) {
                sor6oszlop4 = false;
                sor6oszlop4Nev = "n";
            } else if (fegyvEgymasra == 47) {
                sor7oszlop4 = false;
                sor7oszlop4Nev = "n";
            } else if (fegyvEgymasra == 48) {
                sor8oszlop4 = false;
                sor8oszlop4Nev = "n";
            } else if (fegyvEgymasra == 49) {
                sor9oszlop4 = false;
                sor9oszlop4Nev = "n";
            } else if (fegyvEgymasra == 410) {
                sor10oszlop4 = false;
                sor10oszlop4Nev = "n";
            } else if (fegyvEgymasra == 51) {
                sor1oszlop5 = false;
                sor1oszlop5Nev = "n";
            } else if (fegyvEgymasra == 52) {
                sor2oszlop5 = false;
                sor2oszlop5Nev = "n";
            } else if (fegyvEgymasra == 53) {
                sor3oszlop5 = false;
                sor3oszlop5Nev = "n";
            } else if (fegyvEgymasra == 54) {
                sor4oszlop5 = false;
                sor4oszlop5Nev = "n";
            } else if (fegyvEgymasra == 55) {
                sor5oszlop5 = false;
                sor5oszlop5Nev = "n";
            } else if (fegyvEgymasra == 56) {
                sor6oszlop5 = false;
                sor6oszlop5Nev = "n";
            } else if (fegyvEgymasra == 57) {
                sor7oszlop5 = false;
                sor7oszlop5Nev = "n";
            } else if (fegyvEgymasra == 58) {
                sor8oszlop5 = false;
                sor8oszlop5Nev = "n";
            } else if (fegyvEgymasra == 59) {
                sor9oszlop5 = false;
                sor9oszlop5Nev = "n";
            } else if (fegyvEgymasra == 510) {
                sor10oszlop5 = false;
                sor10oszlop5Nev = "n";
            } else if (fegyvEgymasra == 61) {
                sor1oszlop6 = false;
                sor1oszlop6Nev = "n";
            } else if (fegyvEgymasra == 62) {
                sor2oszlop6 = false;
                sor2oszlop6Nev = "n";
            } else if (fegyvEgymasra == 63) {
                sor3oszlop6 = false;
                sor3oszlop6Nev = "n";
            } else if (fegyvEgymasra == 64) {
                sor4oszlop6 = false;
                sor4oszlop6Nev = "n";
            } else if (fegyvEgymasra == 65) {
                sor5oszlop6 = false;
                sor5oszlop6Nev = "n";
            } else if (fegyvEgymasra == 66) {
                sor6oszlop6 = false;
                sor6oszlop6Nev = "n";
            } else if (fegyvEgymasra == 67) {
                sor7oszlop6 = false;
                sor7oszlop6Nev = "n";
            } else if (fegyvEgymasra == 68) {
                sor8oszlop6 = false;
                sor8oszlop6Nev = "n";
            } else if (fegyvEgymasra == 69) {
                sor9oszlop6 = false;
                sor9oszlop6Nev = "n";
            } else if (fegyvEgymasra == 610) {
                sor10oszlop6 = false;
                sor10oszlop6Nev = "n";
            } else if (fegyvEgymasra == 71) {
                sor1oszlop7 = false;
                sor1oszlop7Nev = "n";
            } else if (fegyvEgymasra == 72) {
                sor2oszlop7 = false;
                sor2oszlop7Nev = "n";
            } else if (fegyvEgymasra == 73) {
                sor3oszlop7 = false;
                sor3oszlop7Nev = "n";
            } else if (fegyvEgymasra == 74) {
                sor4oszlop7 = false;
                sor4oszlop7Nev = "n";
            } else if (fegyvEgymasra == 75) {
                sor5oszlop7 = false;
                sor5oszlop7Nev = "n";
            } else if (fegyvEgymasra == 76) {
                sor6oszlop7 = false;
                sor6oszlop7Nev = "n";
            } else if (fegyvEgymasra == 77) {
                sor7oszlop7 = false;
                sor7oszlop7Nev = "n";
            } else if (fegyvEgymasra == 78) {
                sor8oszlop7 = false;
                sor8oszlop7Nev = "n";
            } else if (fegyvEgymasra == 79) {
                sor9oszlop7 = false;
                sor9oszlop7Nev = "n";
            } else if (fegyvEgymasra == 710) {
                sor10oszlop7 = false;
                sor10oszlop7Nev = "n";
            } else if (fegyvEgymasra == 81) {
                sor1oszlop8 = false;
                sor1oszlop8Nev = "n";
            } else if (fegyvEgymasra == 82) {
                sor2oszlop8 = false;
                sor2oszlop8Nev = "n";
            } else if (fegyvEgymasra == 83) {
                sor3oszlop8 = false;
                sor3oszlop8Nev = "n";
            } else if (fegyvEgymasra == 84) {
                sor4oszlop8 = false;
                sor4oszlop8Nev = "n";
            } else if (fegyvEgymasra == 85) {
                sor5oszlop8 = false;
                sor5oszlop8Nev = "n";
            } else if (fegyvEgymasra == 86) {
                sor6oszlop8 = false;
                sor6oszlop8Nev = "n";
            } else if (fegyvEgymasra == 87) {
                sor7oszlop8 = false;
                sor7oszlop8Nev = "n";
            } else if (fegyvEgymasra == 88) {
                sor8oszlop8 = false;
                sor8oszlop8Nev = "n";
            } else if (fegyvEgymasra == 89) {
                sor9oszlop8 = false;
                sor9oszlop8Nev = "n";
            } else if (fegyvEgymasra == 810) {
                sor10oszlop8 = false;
                sor10oszlop8Nev = "n";
            } else if (fegyvEgymasra == 91) {
                sor1oszlop9 = false;
                sor1oszlop9Nev = "n";
            } else if (fegyvEgymasra == 92) {
                sor2oszlop9 = false;
                sor2oszlop9Nev = "n";
            } else if (fegyvEgymasra == 93) {
                sor3oszlop9 = false;
                sor3oszlop9Nev = "n";
            } else if (fegyvEgymasra == 94) {
                sor4oszlop9 = false;
                sor4oszlop9Nev = "n";
            } else if (fegyvEgymasra == 95) {
                sor5oszlop9 = false;
                sor5oszlop9Nev = "n";
            } else if (fegyvEgymasra == 96) {
                sor6oszlop9 = false;
                sor6oszlop9Nev = "n";
            } else if (fegyvEgymasra == 97) {
                sor7oszlop9 = false;
                sor7oszlop9Nev = "n";
            } else if (fegyvEgymasra == 98) {
                sor8oszlop9 = false;
                sor8oszlop9Nev = "n";
            } else if (fegyvEgymasra == 99) {
                sor9oszlop9 = false;
                sor9oszlop9Nev = "n";
            } else if (fegyvEgymasra == 910) {
                sor10oszlop9 = false;
                sor10oszlop9Nev = "n";
            } else if (fegyvEgymasra == 101) {
                sor1oszlop10 = false;
                sor1oszlop10Nev = "n";
            } else if (fegyvEgymasra == 102) {
                sor2oszlop10 = false;
                sor2oszlop10Nev = "n";
            } else if (fegyvEgymasra == 103) {
                sor3oszlop10 = false;
                sor3oszlop10Nev = "n";
            } else if (fegyvEgymasra == 104) {
                sor4oszlop10 = false;
                sor4oszlop10Nev = "n";
            } else if (fegyvEgymasra == 105) {
                sor5oszlop10 = false;
                sor5oszlop10Nev = "n";
            } else if (fegyvEgymasra == 106) {
                sor6oszlop10 = false;
                sor6oszlop10Nev = "n";
            } else if (fegyvEgymasra == 107) {
                sor7oszlop10 = false;
                sor7oszlop10Nev = "n";
            } else if (fegyvEgymasra == 108) {
                sor8oszlop10 = false;
                sor8oszlop10Nev = "n";
            } else if (fegyvEgymasra == 109) {
                sor9oszlop10 = false;
                sor9oszlop10Nev = "n";
            } else if (fegyvEgymasra == 1010) {
                sor10oszlop10 = false;
                sor10oszlop10Nev = "n";
            } else if (fegyvEgymasra == 111) {
                sor1oszlop11 = false;
                sor1oszlop11Nev = "n";
            } else if (fegyvEgymasra == 112) {
                sor2oszlop11 = false;
                sor2oszlop11Nev = "n";
            } else if (fegyvEgymasra == 113) {
                sor3oszlop11 = false;
                sor3oszlop11Nev = "n";
            } else if (fegyvEgymasra == 114) {
                sor4oszlop11 = false;
                sor4oszlop11Nev = "n";
            } else if (fegyvEgymasra == 115) {
                sor5oszlop11 = false;
                sor5oszlop11Nev = "n";
            } else if (fegyvEgymasra == 116) {
                sor6oszlop11 = false;
                sor6oszlop11Nev = "n";
            } else if (fegyvEgymasra == 117) {
                sor7oszlop11 = false;
                sor7oszlop11Nev = "n";
            } else if (fegyvEgymasra == 118) {
                sor8oszlop11 = false;
                sor8oszlop11Nev = "n";
            } else if (fegyvEgymasra == 119) {
                sor9oszlop11 = false;
                sor9oszlop11Nev = "n";
            } else if (fegyvEgymasra == 1110) {
                sor10oszlop11 = false;
                sor10oszlop11Nev = "n";
            } else if (fegyvEgymasra == 121) {
                sor1oszlop12 = false;
                sor1oszlop12Nev = "n";
            } else if (fegyvEgymasra == 122) {
                sor2oszlop12 = false;
                sor2oszlop12Nev = "n";
            } else if (fegyvEgymasra == 123) {
                sor3oszlop12 = false;
                sor3oszlop12Nev = "n";
            } else if (fegyvEgymasra == 124) {
                sor4oszlop12 = false;
                sor4oszlop12Nev = "n";
            } else if (fegyvEgymasra == 125) {
                sor5oszlop12 = false;
                sor5oszlop12Nev = "n";
            } else if (fegyvEgymasra == 126) {
                sor6oszlop12 = false;
                sor6oszlop12Nev = "n";
            } else if (fegyvEgymasra == 127) {
                sor7oszlop12 = false;
                sor7oszlop12Nev = "n";
            } else if (fegyvEgymasra == 128) {
                sor8oszlop12 = false;
                sor8oszlop12Nev = "n";
            } else if (fegyvEgymasra == 129) {
                sor9oszlop12 = false;
                sor9oszlop12Nev = "n";
            } else if (fegyvEgymasra == 1210) {
                sor10oszlop12 = false;
                sor10oszlop12Nev = "n";
            }
            fegyvEgymasra = poz;

        }
    }

    public static void holVagyKettoMino(int oszlop, int sor,String egyseg) {

        int poz=Integer.parseInt(oszlop + "" + sor);
        pozTamadhatoMino=(oszlop + "-" + sor);
        int pozJelenlegi=Integer.parseInt(regiPozOszlop + "" + regiPozSor);

    if ( minoEgymasra !=0 && egyseg.equals("mino") && minoEgymasra !=poz && felderEgymasra !=poz && csontEgymasra !=poz && orgyEgymasra !=poz && raptEgymasra !=poz
                && egrifEgymasra !=poz && eijasEgymasra !=poz && efoldmuvEgymasra !=poz && efegyvEgymasra !=poz && eharcpEgymasra !=poz && minoEgymasra !=pozJelenlegi  ) {
            if (minoEgymasra ==11) {
                sor1oszlop1= false;
                sor1oszlop1Nev="n";
            }else if (minoEgymasra ==12) {
                sor2oszlop1= false;
                sor2oszlop1Nev="n";
            }else if (minoEgymasra ==13) {
                sor3oszlop1= false;
                sor3oszlop1Nev="n";
            }else if (minoEgymasra ==14) {
                sor4oszlop1= false;
                sor4oszlop1Nev="n";
            }else if (minoEgymasra ==15) {
                sor5oszlop1= false;
                sor5oszlop1Nev="n";
            }else if (minoEgymasra ==16) {
                sor6oszlop1= false;
                sor6oszlop1Nev="n";
            }else if (minoEgymasra ==17) {
                sor7oszlop1= false;
                sor7oszlop1Nev="n";
            }else if (minoEgymasra ==18) {
                sor8oszlop1= false;
                sor8oszlop1Nev="n";
            }else if (minoEgymasra ==19) {
                sor9oszlop1= false;
                sor9oszlop1Nev="n";
            }else if (minoEgymasra ==110) {
                sor10oszlop1= false;
                sor10oszlop1Nev="n";
            }else if (minoEgymasra ==21) {
                sor1oszlop2= false;
                sor1oszlop2Nev="n";
            }else if (minoEgymasra ==22) {
                sor2oszlop2= false;
                sor2oszlop2Nev="n";
            }else if (minoEgymasra ==23) {
                sor3oszlop2= false;
                sor3oszlop2Nev="n";
            }else if (minoEgymasra ==24) {
                sor4oszlop2= false;
                sor4oszlop2Nev="n";
            }else if (minoEgymasra ==25) {
                sor5oszlop2= false;
                sor5oszlop2Nev="n";
            }else if (minoEgymasra ==26) {
                sor6oszlop2= false;
                sor6oszlop2Nev="n";
            }else if (minoEgymasra ==27) {
                sor7oszlop2= false;
                sor7oszlop2Nev="n";
            }else if (minoEgymasra ==28) {
                sor8oszlop2= false;
                sor8oszlop2Nev="n";
            }else if (minoEgymasra ==29) {
                sor9oszlop2= false;
                sor9oszlop2Nev="n";
            }else if (minoEgymasra ==210) {
                sor10oszlop2= false;
                sor10oszlop2Nev="n";
            }else if (minoEgymasra ==31) {
                sor1oszlop3= false;
                sor1oszlop3Nev="n";
            }else if (minoEgymasra ==32) {
                sor2oszlop3= false;
                sor2oszlop3Nev="n";
            }else if (minoEgymasra ==33) {
                sor3oszlop3= false;
                sor3oszlop3Nev="n";
            }else if (minoEgymasra ==34) {
                sor4oszlop3= false;
                sor4oszlop3Nev="n";
            }else if (minoEgymasra ==35) {
                sor5oszlop3= false;
                sor5oszlop3Nev="n";
            }else if (minoEgymasra ==36) {
                sor6oszlop3= false;
                sor6oszlop3Nev="n";
            }else if (minoEgymasra ==37) {
                sor7oszlop3= false;
                sor7oszlop3Nev="n";
            }else if (minoEgymasra ==38) {
                sor8oszlop3= false;
                sor8oszlop3Nev="n";
            }else if (minoEgymasra ==39) {
                sor9oszlop3= false;
                sor9oszlop3Nev="n";
            }else if (minoEgymasra ==310) {
                sor10oszlop3= false;
                sor10oszlop3Nev="n";
            }else if (minoEgymasra ==41) {
                sor1oszlop4= false;
                sor1oszlop4Nev="n";
            }else if (minoEgymasra ==42) {
                sor2oszlop4= false;
                sor2oszlop4Nev="n";
            }else if (minoEgymasra ==43) {
                sor3oszlop4= false;
                sor3oszlop4Nev="n";
            }else if (minoEgymasra ==44) {
                sor4oszlop4= false;
                sor4oszlop4Nev="n";
            }else if (minoEgymasra ==45) {
                sor5oszlop4= false;
                sor5oszlop4Nev="n";
            }else if (minoEgymasra ==46) {
                sor6oszlop4= false;
                sor6oszlop4Nev="n";
            }else if (minoEgymasra ==47) {
                sor7oszlop4= false;
                sor7oszlop4Nev="n";
            }else if (minoEgymasra ==48) {
                sor8oszlop4= false;
                sor8oszlop4Nev="n";
            }else if (minoEgymasra ==49) {
                sor9oszlop4= false;
                sor9oszlop4Nev="n";
            }else if (minoEgymasra ==410) {
                sor10oszlop4= false;
                sor10oszlop4Nev="n";
            }else if (minoEgymasra ==51) {
                sor1oszlop5= false;
                sor1oszlop5Nev="n";
            }else if (minoEgymasra ==52) {
                sor2oszlop5= false;
                sor2oszlop5Nev="n";
            }else if (minoEgymasra ==53) {
                sor3oszlop5= false;
                sor3oszlop5Nev="n";
            }else if (minoEgymasra ==54) {
                sor4oszlop5= false;
                sor4oszlop5Nev="n";
            }else if (minoEgymasra ==55) {
                sor5oszlop5= false;
                sor5oszlop5Nev="n";
            }else if (minoEgymasra ==56) {
                sor6oszlop5= false;
                sor6oszlop5Nev="n";
            }else if (minoEgymasra ==57) {
                sor7oszlop5= false;
                sor7oszlop5Nev="n";
            }else if (minoEgymasra ==58) {
                sor8oszlop5= false;
                sor8oszlop5Nev="n";
            }else if (minoEgymasra ==59) {
                sor9oszlop5= false;
                sor9oszlop5Nev="n";
            }else if (minoEgymasra ==510) {
                sor10oszlop5= false;
                sor10oszlop5Nev="n";
            }else if (minoEgymasra ==61) {
                sor1oszlop6= false;
                sor1oszlop6Nev="n";
            }else if (minoEgymasra ==62) {
                sor2oszlop6= false;
                sor2oszlop6Nev="n";
            }else if (minoEgymasra ==63) {
                sor3oszlop6= false;
                sor3oszlop6Nev="n";
            }else if (minoEgymasra ==64) {
                sor4oszlop6= false;
                sor4oszlop6Nev="n";
            }else if (minoEgymasra ==65) {
                sor5oszlop6= false;
                sor5oszlop6Nev="n";
            }else if (minoEgymasra ==66) {
                sor6oszlop6= false;
                sor6oszlop6Nev="n";
            }else if (minoEgymasra ==67) {
                sor7oszlop6= false;
                sor7oszlop6Nev="n";
            }else if (minoEgymasra ==68) {
                sor8oszlop6= false;
                sor8oszlop6Nev="n";
            }else if (minoEgymasra ==69) {
                sor9oszlop6= false;
                sor9oszlop6Nev="n";
            }else if (minoEgymasra ==610) {
                sor10oszlop6= false;
                sor10oszlop6Nev="n";
            }else if (minoEgymasra ==71) {
                sor1oszlop7= false;
                sor1oszlop7Nev="n";
            }else if (minoEgymasra ==72) {
                sor2oszlop7= false;
                sor2oszlop7Nev="n";
            }else if (minoEgymasra ==73) {
                sor3oszlop7= false;
                sor3oszlop7Nev="n";
            }else if (minoEgymasra ==74) {
                sor4oszlop7= false;
                sor4oszlop7Nev="n";
            }else if (minoEgymasra ==75) {
                sor5oszlop7= false;
                sor5oszlop7Nev="n";
            }else if (minoEgymasra ==76) {
                sor6oszlop7= false;
                sor6oszlop7Nev="n";
            }else if (minoEgymasra ==77) {
                sor7oszlop7= false;
                sor7oszlop7Nev="n";
            }else if (minoEgymasra ==78) {
                sor8oszlop7= false;
                sor8oszlop7Nev="n";
            }else if (minoEgymasra ==79) {
                sor9oszlop7= false;
                sor9oszlop7Nev="n";
            }else if (minoEgymasra ==710) {
                sor10oszlop7= false;
                sor10oszlop7Nev="n";
            }else if (minoEgymasra ==81) {
                sor1oszlop8= false;
                sor1oszlop8Nev="n";
            }else if (minoEgymasra ==82) {
                sor2oszlop8= false;
                sor2oszlop8Nev="n";
            }else if (minoEgymasra ==83) {
                sor3oszlop8= false;
                sor3oszlop8Nev="n";
            }else if (minoEgymasra ==84) {
                sor4oszlop8= false;
                sor4oszlop8Nev="n";
            }else if (minoEgymasra ==85) {
                sor5oszlop8= false;
                sor5oszlop8Nev="n";
            }else if (minoEgymasra ==86) {
                sor6oszlop8= false;
                sor6oszlop8Nev="n";
            }else if (minoEgymasra ==87) {
                sor7oszlop8= false;
                sor7oszlop8Nev="n";
            }else if (minoEgymasra ==88) {
                sor8oszlop8= false;
                sor8oszlop8Nev="n";
            }else if (minoEgymasra ==89) {
                sor9oszlop8= false;
                sor9oszlop8Nev="n";
            }else if (minoEgymasra ==810) {
                sor10oszlop8= false;
                sor10oszlop8Nev="n";
            }else if (minoEgymasra ==91) {
                sor1oszlop9= false;
                sor1oszlop9Nev="n";
            }else if (minoEgymasra ==92) {
                sor2oszlop9= false;
                sor2oszlop9Nev="n";
            }else if (minoEgymasra ==93) {
                sor3oszlop9= false;
                sor3oszlop9Nev="n";
            }else if (minoEgymasra ==94) {
                sor4oszlop9= false;
                sor4oszlop9Nev="n";
            }else if (minoEgymasra ==95) {
                sor5oszlop9= false;
                sor5oszlop9Nev="n";
            }else if (minoEgymasra ==96) {
                sor6oszlop9= false;
                sor6oszlop9Nev="n";
            }else if (minoEgymasra ==97) {
                sor7oszlop9= false;
                sor7oszlop9Nev="n";
            }else if (minoEgymasra ==98) {
                sor8oszlop9= false;
                sor8oszlop9Nev="n";
            }else if (minoEgymasra ==99) {
                sor9oszlop9= false;
                sor9oszlop9Nev="n";
            }else if (minoEgymasra ==910) {
                sor10oszlop9= false;
                sor10oszlop9Nev="n";
            }else if (minoEgymasra ==101) {
                sor1oszlop10= false;
                sor1oszlop10Nev="n";
            }else if (minoEgymasra ==102) {
                sor2oszlop10= false;
                sor2oszlop10Nev="n";
            }else if (minoEgymasra ==103) {
                sor3oszlop10= false;
                sor3oszlop10Nev="n";
            }else if (minoEgymasra ==104) {
                sor4oszlop10= false;
                sor4oszlop10Nev="n";
            }else if (minoEgymasra ==105) {
                sor5oszlop10= false;
                sor5oszlop10Nev="n";
            }else if (minoEgymasra ==106) {
                sor6oszlop10= false;
                sor6oszlop10Nev="n";
            }else if (minoEgymasra ==107) {
                sor7oszlop10= false;
                sor7oszlop10Nev="n";
            }else if (minoEgymasra ==108) {
                sor8oszlop10= false;
                sor8oszlop10Nev="n";
            }else if (minoEgymasra ==109) {
                sor9oszlop10= false;
                sor9oszlop10Nev="n";
            }else if (minoEgymasra ==1010) {
                sor10oszlop10= false;
                sor10oszlop10Nev="n";
            }else if (minoEgymasra ==111) {
                sor1oszlop11= false;
                sor1oszlop11Nev="n";
            }else if (minoEgymasra ==112) {
                sor2oszlop11= false;
                sor2oszlop11Nev="n";
            }else if (minoEgymasra ==113) {
                sor3oszlop11= false;
                sor3oszlop11Nev="n";
            }else if (minoEgymasra ==114) {
                sor4oszlop11= false;
                sor4oszlop11Nev="n";
            }else if (minoEgymasra ==115) {
                sor5oszlop11= false;
                sor5oszlop11Nev="n";
            }else if (minoEgymasra ==116) {
                sor6oszlop11= false;
                sor6oszlop11Nev="n";
            }else if (minoEgymasra ==117) {
                sor7oszlop11= false;
                sor7oszlop11Nev="n";
            }else if (minoEgymasra ==118) {
                sor8oszlop11= false;
                sor8oszlop11Nev="n";
            }else if (minoEgymasra ==119) {
                sor9oszlop11= false;
                sor9oszlop11Nev="n";
            }else if (minoEgymasra ==1110) {
                sor10oszlop11= false;
                sor10oszlop11Nev="n";
            }else if (minoEgymasra ==121) {
                sor1oszlop12= false;
                sor1oszlop12Nev="n";
            }else if (minoEgymasra ==122) {
                sor2oszlop12= false;
                sor2oszlop12Nev="n";
            }else if (minoEgymasra ==123) {
                sor3oszlop12= false;
                sor3oszlop12Nev="n";
            }else if (minoEgymasra ==124) {
                sor4oszlop12= false;
                sor4oszlop12Nev="n";
            }else if (minoEgymasra ==125) {
                sor5oszlop12= false;
                sor5oszlop12Nev="n";
            }else if (minoEgymasra ==126) {
                sor6oszlop12= false;
                sor6oszlop12Nev="n";
            }else if (minoEgymasra ==127) {
                sor7oszlop12= false;
                sor7oszlop12Nev="n";
            }else if (minoEgymasra ==128) {
                sor8oszlop12= false;
                sor8oszlop12Nev="n";
            }else if (minoEgymasra ==129) {
                sor9oszlop12= false;
                sor9oszlop12Nev="n";
            }else if (minoEgymasra ==1210) {
                sor10oszlop12= false;
                sor10oszlop12Nev="n";
            }
            minoEgymasra =poz;

        }else if ( orgyEgymasra !=0 && egyseg.equals("orgy") && minoEgymasra !=poz && felderEgymasra !=poz && csontEgymasra !=poz && orgyEgymasra !=poz && raptEgymasra !=poz
                && egrifEgymasra !=poz && eijasEgymasra !=poz && efoldmuvEgymasra !=poz && efegyvEgymasra !=poz && eharcpEgymasra !=poz && orgyEgymasra !=pozJelenlegi  ) {
            if (orgyEgymasra ==11) {
                sor1oszlop1= false;
                sor1oszlop1Nev="n";
            }else if (orgyEgymasra ==12) {
                sor2oszlop1= false;
                sor2oszlop1Nev="n";
            }else if (orgyEgymasra ==13) {
                sor3oszlop1= false;
                sor3oszlop1Nev="n";
            }else if (orgyEgymasra ==14) {
                sor4oszlop1= false;
                sor4oszlop1Nev="n";
            }else if (orgyEgymasra ==15) {
                sor5oszlop1= false;
                sor5oszlop1Nev="n";
            }else if (orgyEgymasra ==16) {
                sor6oszlop1= false;
                sor6oszlop1Nev="n";
            }else if (orgyEgymasra ==17) {
                sor7oszlop1= false;
                sor7oszlop1Nev="n";
            }else if (orgyEgymasra ==18) {
                sor8oszlop1= false;
                sor8oszlop1Nev="n";
            }else if (orgyEgymasra ==19) {
                sor9oszlop1= false;
                sor9oszlop1Nev="n";
            }else if (orgyEgymasra ==110) {
                sor10oszlop1= false;
                sor10oszlop1Nev="n";
            }else if (orgyEgymasra ==21) {
                sor1oszlop2= false;
                sor1oszlop2Nev="n";
            }else if (orgyEgymasra ==22) {
                sor2oszlop2= false;
                sor2oszlop2Nev="n";
            }else if (orgyEgymasra ==23) {
                sor3oszlop2= false;
                sor3oszlop2Nev="n";
            }else if (orgyEgymasra ==24) {
                sor4oszlop2= false;
                sor4oszlop2Nev="n";
            }else if (orgyEgymasra ==25) {
                sor5oszlop2= false;
                sor5oszlop2Nev="n";
            }else if (orgyEgymasra ==26) {
                sor6oszlop2= false;
                sor6oszlop2Nev="n";
            }else if (orgyEgymasra ==27) {
                sor7oszlop2= false;
                sor7oszlop2Nev="n";
            }else if (orgyEgymasra ==28) {
                sor8oszlop2= false;
                sor8oszlop2Nev="n";
            }else if (orgyEgymasra ==29) {
                sor9oszlop2= false;
                sor9oszlop2Nev="n";
            }else if (orgyEgymasra ==210) {
                sor10oszlop2= false;
                sor10oszlop2Nev="n";
            }else if (orgyEgymasra ==31) {
                sor1oszlop3= false;
                sor1oszlop3Nev="n";
            }else if (orgyEgymasra ==32) {
                sor2oszlop3= false;
                sor2oszlop3Nev="n";
            }else if (orgyEgymasra ==33) {
                sor3oszlop3= false;
                sor3oszlop3Nev="n";
            }else if (orgyEgymasra ==34) {
                sor4oszlop3= false;
                sor4oszlop3Nev="n";
            }else if (orgyEgymasra ==35) {
                sor5oszlop3= false;
                sor5oszlop3Nev="n";
            }else if (orgyEgymasra ==36) {
                sor6oszlop3= false;
                sor6oszlop3Nev="n";
            }else if (orgyEgymasra ==37) {
                sor7oszlop3= false;
                sor7oszlop3Nev="n";
            }else if (orgyEgymasra ==38) {
                sor8oszlop3= false;
                sor8oszlop3Nev="n";
            }else if (orgyEgymasra ==39) {
                sor9oszlop3= false;
                sor9oszlop3Nev="n";
            }else if (orgyEgymasra ==310) {
                sor10oszlop3= false;
                sor10oszlop3Nev="n";
            }else if (orgyEgymasra ==41) {
                sor1oszlop4= false;
                sor1oszlop4Nev="n";
            }else if (orgyEgymasra ==42) {
                sor2oszlop4= false;
                sor2oszlop4Nev="n";
            }else if (orgyEgymasra ==43) {
                sor3oszlop4= false;
                sor3oszlop4Nev="n";
            }else if (orgyEgymasra ==44) {
                sor4oszlop4= false;
                sor4oszlop4Nev="n";
            }else if (orgyEgymasra ==45) {
                sor5oszlop4= false;
                sor5oszlop4Nev="n";
            }else if (orgyEgymasra ==46) {
                sor6oszlop4= false;
                sor6oszlop4Nev="n";
            }else if (orgyEgymasra ==47) {
                sor7oszlop4= false;
                sor7oszlop4Nev="n";
            }else if (orgyEgymasra ==48) {
                sor8oszlop4= false;
                sor8oszlop4Nev="n";
            }else if (orgyEgymasra ==49) {
                sor9oszlop4= false;
                sor9oszlop4Nev="n";
            }else if (orgyEgymasra ==410) {
                sor10oszlop4= false;
                sor10oszlop4Nev="n";
            }else if (orgyEgymasra ==51) {
                sor1oszlop5= false;
                sor1oszlop5Nev="n";
            }else if (orgyEgymasra ==52) {
                sor2oszlop5= false;
                sor2oszlop5Nev="n";
            }else if (orgyEgymasra ==53) {
                sor3oszlop5= false;
                sor3oszlop5Nev="n";
            }else if (orgyEgymasra ==54) {
                sor4oszlop5= false;
                sor4oszlop5Nev="n";
            }else if (orgyEgymasra ==55) {
                sor5oszlop5= false;
                sor5oszlop5Nev="n";
            }else if (orgyEgymasra ==56) {
                sor6oszlop5= false;
                sor6oszlop5Nev="n";
            }else if (orgyEgymasra ==57) {
                sor7oszlop5= false;
                sor7oszlop5Nev="n";
            }else if (orgyEgymasra ==58) {
                sor8oszlop5= false;
                sor8oszlop5Nev="n";
            }else if (orgyEgymasra ==59) {
                sor9oszlop5= false;
                sor9oszlop5Nev="n";
            }else if (orgyEgymasra ==510) {
                sor10oszlop5= false;
                sor10oszlop5Nev="n";
            }else if (orgyEgymasra ==61) {
                sor1oszlop6= false;
                sor1oszlop6Nev="n";
            }else if (orgyEgymasra ==62) {
                sor2oszlop6= false;
                sor2oszlop6Nev="n";
            }else if (orgyEgymasra ==63) {
                sor3oszlop6= false;
                sor3oszlop6Nev="n";
            }else if (orgyEgymasra ==64) {
                sor4oszlop6= false;
                sor4oszlop6Nev="n";
            }else if (orgyEgymasra ==65) {
                sor5oszlop6= false;
                sor5oszlop6Nev="n";
            }else if (orgyEgymasra ==66) {
                sor6oszlop6= false;
                sor6oszlop6Nev="n";
            }else if (orgyEgymasra ==67) {
                sor7oszlop6= false;
                sor7oszlop6Nev="n";
            }else if (orgyEgymasra ==68) {
                sor8oszlop6= false;
                sor8oszlop6Nev="n";
            }else if (orgyEgymasra ==69) {
                sor9oszlop6= false;
                sor9oszlop6Nev="n";
            }else if (orgyEgymasra ==610) {
                sor10oszlop6= false;
                sor10oszlop6Nev="n";
            }else if (orgyEgymasra ==71) {
                sor1oszlop7= false;
                sor1oszlop7Nev="n";
            }else if (orgyEgymasra ==72) {
                sor2oszlop7= false;
                sor2oszlop7Nev="n";
            }else if (orgyEgymasra ==73) {
                sor3oszlop7= false;
                sor3oszlop7Nev="n";
            }else if (orgyEgymasra ==74) {
                sor4oszlop7= false;
                sor4oszlop7Nev="n";
            }else if (orgyEgymasra ==75) {
                sor5oszlop7= false;
                sor5oszlop7Nev="n";
            }else if (orgyEgymasra ==76) {
                sor6oszlop7= false;
                sor6oszlop7Nev="n";
            }else if (orgyEgymasra ==77) {
                sor7oszlop7= false;
                sor7oszlop7Nev="n";
            }else if (orgyEgymasra ==78) {
                sor8oszlop7= false;
                sor8oszlop7Nev="n";
            }else if (orgyEgymasra ==79) {
                sor9oszlop7= false;
                sor9oszlop7Nev="n";
            }else if (orgyEgymasra ==710) {
                sor10oszlop7= false;
                sor10oszlop7Nev="n";
            }else if (orgyEgymasra ==81) {
                sor1oszlop8= false;
                sor1oszlop8Nev="n";
            }else if (orgyEgymasra ==82) {
                sor2oszlop8= false;
                sor2oszlop8Nev="n";
            }else if (orgyEgymasra ==83) {
                sor3oszlop8= false;
                sor3oszlop8Nev="n";
            }else if (orgyEgymasra ==84) {
                sor4oszlop8= false;
                sor4oszlop8Nev="n";
            }else if (orgyEgymasra ==85) {
                sor5oszlop8= false;
                sor5oszlop8Nev="n";
            }else if (orgyEgymasra ==86) {
                sor6oszlop8= false;
                sor6oszlop8Nev="n";
            }else if (orgyEgymasra ==87) {
                sor7oszlop8= false;
                sor7oszlop8Nev="n";
            }else if (orgyEgymasra ==88) {
                sor8oszlop8= false;
                sor8oszlop8Nev="n";
            }else if (orgyEgymasra ==89) {
                sor9oszlop8= false;
                sor9oszlop8Nev="n";
            }else if (orgyEgymasra ==810) {
                sor10oszlop8= false;
                sor10oszlop8Nev="n";
            }else if (orgyEgymasra ==91) {
                sor1oszlop9= false;
                sor1oszlop9Nev="n";
            }else if (orgyEgymasra ==92) {
                sor2oszlop9= false;
                sor2oszlop9Nev="n";
            }else if (orgyEgymasra ==93) {
                sor3oszlop9= false;
                sor3oszlop9Nev="n";
            }else if (orgyEgymasra ==94) {
                sor4oszlop9= false;
                sor4oszlop9Nev="n";
            }else if (orgyEgymasra ==95) {
                sor5oszlop9= false;
                sor5oszlop9Nev="n";
            }else if (orgyEgymasra ==96) {
                sor6oszlop9= false;
                sor6oszlop9Nev="n";
            }else if (orgyEgymasra ==97) {
                sor7oszlop9= false;
                sor7oszlop9Nev="n";
            }else if (orgyEgymasra ==98) {
                sor8oszlop9= false;
                sor8oszlop9Nev="n";
            }else if (orgyEgymasra ==99) {
                sor9oszlop9= false;
                sor9oszlop9Nev="n";
            }else if (orgyEgymasra ==910) {
                sor10oszlop9= false;
                sor10oszlop9Nev="n";
            }else if (orgyEgymasra ==101) {
                sor1oszlop10= false;
                sor1oszlop10Nev="n";
            }else if (orgyEgymasra ==102) {
                sor2oszlop10= false;
                sor2oszlop10Nev="n";
            }else if (orgyEgymasra ==103) {
                sor3oszlop10= false;
                sor3oszlop10Nev="n";
            }else if (orgyEgymasra ==104) {
                sor4oszlop10= false;
                sor4oszlop10Nev="n";
            }else if (orgyEgymasra ==105) {
                sor5oszlop10= false;
                sor5oszlop10Nev="n";
            }else if (orgyEgymasra ==106) {
                sor6oszlop10= false;
                sor6oszlop10Nev="n";
            }else if (orgyEgymasra ==107) {
                sor7oszlop10= false;
                sor7oszlop10Nev="n";
            }else if (orgyEgymasra ==108) {
                sor8oszlop10= false;
                sor8oszlop10Nev="n";
            }else if (orgyEgymasra ==109) {
                sor9oszlop10= false;
                sor9oszlop10Nev="n";
            }else if (orgyEgymasra ==1010) {
                sor10oszlop10= false;
                sor10oszlop10Nev="n";
            }else if (orgyEgymasra ==111) {
                sor1oszlop11= false;
                sor1oszlop11Nev="n";
            }else if (orgyEgymasra ==112) {
                sor2oszlop11= false;
                sor2oszlop11Nev="n";
            }else if (orgyEgymasra ==113) {
                sor3oszlop11= false;
                sor3oszlop11Nev="n";
            }else if (orgyEgymasra ==114) {
                sor4oszlop11= false;
                sor4oszlop11Nev="n";
            }else if (orgyEgymasra ==115) {
                sor5oszlop11= false;
                sor5oszlop11Nev="n";
            }else if (orgyEgymasra ==116) {
                sor6oszlop11= false;
                sor6oszlop11Nev="n";
            }else if (orgyEgymasra ==117) {
                sor7oszlop11= false;
                sor7oszlop11Nev="n";
            }else if (orgyEgymasra ==118) {
                sor8oszlop11= false;
                sor8oszlop11Nev="n";
            }else if (orgyEgymasra ==119) {
                sor9oszlop11= false;
                sor9oszlop11Nev="n";
            }else if (orgyEgymasra ==1110) {
                sor10oszlop11= false;
                sor10oszlop11Nev="n";
            }else if (orgyEgymasra ==121) {
                sor1oszlop12= false;
                sor1oszlop12Nev="n";
            }else if (orgyEgymasra ==122) {
                sor2oszlop12= false;
                sor2oszlop12Nev="n";
            }else if (orgyEgymasra ==123) {
                sor3oszlop12= false;
                sor3oszlop12Nev="n";
            }else if (orgyEgymasra ==124) {
                sor4oszlop12= false;
                sor4oszlop12Nev="n";
            }else if (orgyEgymasra ==125) {
                sor5oszlop12= false;
                sor5oszlop12Nev="n";
            }else if (orgyEgymasra ==126) {
                sor6oszlop12= false;
                sor6oszlop12Nev="n";
            }else if (orgyEgymasra ==127) {
                sor7oszlop12= false;
                sor7oszlop12Nev="n";
            }else if (orgyEgymasra ==128) {
                sor8oszlop12= false;
                sor8oszlop12Nev="n";
            }else if (orgyEgymasra ==129) {
                sor9oszlop12= false;
                sor9oszlop12Nev="n";
            }else if (orgyEgymasra ==1210) {
                sor10oszlop12= false;
                sor10oszlop12Nev="n";
            }
            orgyEgymasra =poz;
            pozTamadhatoOrgy=(oszlop + "-" + sor);

        }else if ( harcpEgymasra !=0 && egyseg.equals("harcp") && grifEgymasra !=poz && ijasEgymasra !=poz && foldmuvEgymasra !=poz && fegyvEgymasra !=poz && harcpEgymasra !=poz
                && eminoEgymasra !=poz && efelderEgymasra !=poz && ecsontEgymasra !=poz && eorgyEgymasra !=poz && eraptEgymasra !=poz && harcpEgymasra !=pozJelenlegi  ) {
            if (harcpEgymasra ==11) {
                sor1oszlop1= false;
                sor1oszlop1Nev="n";
            }else if (harcpEgymasra ==12) {
                sor2oszlop1= false;
                sor2oszlop1Nev="n";
            }else if (harcpEgymasra ==13) {
                sor3oszlop1= false;
                sor3oszlop1Nev="n";
            }else if (harcpEgymasra ==14) {
                sor4oszlop1= false;
                sor4oszlop1Nev="n";
            }else if (harcpEgymasra ==15) {
                sor5oszlop1= false;
                sor5oszlop1Nev="n";
            }else if (harcpEgymasra ==16) {
                sor6oszlop1= false;
                sor6oszlop1Nev="n";
            }else if (harcpEgymasra ==17) {
                sor7oszlop1= false;
                sor7oszlop1Nev="n";
            }else if (harcpEgymasra ==18) {
                sor8oszlop1= false;
                sor8oszlop1Nev="n";
            }else if (harcpEgymasra ==19) {
                sor9oszlop1= false;
                sor9oszlop1Nev="n";
            }else if (harcpEgymasra ==110) {
                sor10oszlop1= false;
                sor10oszlop1Nev="n";
            }else if (harcpEgymasra ==21) {
                sor1oszlop2= false;
                sor1oszlop2Nev="n";
            }else if (harcpEgymasra ==22) {
                sor2oszlop2= false;
                sor2oszlop2Nev="n";
            }else if (harcpEgymasra ==23) {
                sor3oszlop2= false;
                sor3oszlop2Nev="n";
            }else if (harcpEgymasra ==24) {
                sor4oszlop2= false;
                sor4oszlop2Nev="n";
            }else if (harcpEgymasra ==25) {
                sor5oszlop2= false;
                sor5oszlop2Nev="n";
            }else if (harcpEgymasra ==26) {
                sor6oszlop2= false;
                sor6oszlop2Nev="n";
            }else if (harcpEgymasra ==27) {
                sor7oszlop2= false;
                sor7oszlop2Nev="n";
            }else if (harcpEgymasra ==28) {
                sor8oszlop2= false;
                sor8oszlop2Nev="n";
            }else if (harcpEgymasra ==29) {
                sor9oszlop2= false;
                sor9oszlop2Nev="n";
            }else if (harcpEgymasra ==210) {
                sor10oszlop2= false;
                sor10oszlop2Nev="n";
            }else if (harcpEgymasra ==31) {
                sor1oszlop3= false;
                sor1oszlop3Nev="n";
            }else if (harcpEgymasra ==32) {
                sor2oszlop3= false;
                sor2oszlop3Nev="n";
            }else if (harcpEgymasra ==33) {
                sor3oszlop3= false;
                sor3oszlop3Nev="n";
            }else if (harcpEgymasra ==34) {
                sor4oszlop3= false;
                sor4oszlop3Nev="n";
            }else if (harcpEgymasra ==35) {
                sor5oszlop3= false;
                sor5oszlop3Nev="n";
            }else if (harcpEgymasra ==36) {
                sor6oszlop3= false;
                sor6oszlop3Nev="n";
            }else if (harcpEgymasra ==37) {
                sor7oszlop3= false;
                sor7oszlop3Nev="n";
            }else if (harcpEgymasra ==38) {
                sor8oszlop3= false;
                sor8oszlop3Nev="n";
            }else if (harcpEgymasra ==39) {
                sor9oszlop3= false;
                sor9oszlop3Nev="n";
            }else if (harcpEgymasra ==310) {
                sor10oszlop3= false;
                sor10oszlop3Nev="n";
            }else if (harcpEgymasra ==41) {
                sor1oszlop4= false;
                sor1oszlop4Nev="n";
            }else if (harcpEgymasra ==42) {
                sor2oszlop4= false;
                sor2oszlop4Nev="n";
            }else if (harcpEgymasra ==43) {
                sor3oszlop4= false;
                sor3oszlop4Nev="n";
            }else if (harcpEgymasra ==44) {
                sor4oszlop4= false;
                sor4oszlop4Nev="n";
            }else if (harcpEgymasra ==45) {
                sor5oszlop4= false;
                sor5oszlop4Nev="n";
            }else if (harcpEgymasra ==46) {
                sor6oszlop4= false;
                sor6oszlop4Nev="n";
            }else if (harcpEgymasra ==47) {
                sor7oszlop4= false;
                sor7oszlop4Nev="n";
            }else if (harcpEgymasra ==48) {
                sor8oszlop4= false;
                sor8oszlop4Nev="n";
            }else if (harcpEgymasra ==49) {
                sor9oszlop4= false;
                sor9oszlop4Nev="n";
            }else if (harcpEgymasra ==410) {
                sor10oszlop4= false;
                sor10oszlop4Nev="n";
            }else if (harcpEgymasra ==51) {
                sor1oszlop5= false;
                sor1oszlop5Nev="n";
            }else if (harcpEgymasra ==52) {
                sor2oszlop5= false;
                sor2oszlop5Nev="n";
            }else if (harcpEgymasra ==53) {
                sor3oszlop5= false;
                sor3oszlop5Nev="n";
            }else if (harcpEgymasra ==54) {
                sor4oszlop5= false;
                sor4oszlop5Nev="n";
            }else if (harcpEgymasra ==55) {
                sor5oszlop5= false;
                sor5oszlop5Nev="n";
            }else if (harcpEgymasra ==56) {
                sor6oszlop5= false;
                sor6oszlop5Nev="n";
            }else if (harcpEgymasra ==57) {
                sor7oszlop5= false;
                sor7oszlop5Nev="n";
            }else if (harcpEgymasra ==58) {
                sor8oszlop5= false;
                sor8oszlop5Nev="n";
            }else if (harcpEgymasra ==59) {
                sor9oszlop5= false;
                sor9oszlop5Nev="n";
            }else if (harcpEgymasra ==510) {
                sor10oszlop5= false;
                sor10oszlop5Nev="n";
            }else if (harcpEgymasra ==61) {
                sor1oszlop6= false;
                sor1oszlop6Nev="n";
            }else if (harcpEgymasra ==62) {
                sor2oszlop6= false;
                sor2oszlop6Nev="n";
            }else if (harcpEgymasra ==63) {
                sor3oszlop6= false;
                sor3oszlop6Nev="n";
            }else if (harcpEgymasra ==64) {
                sor4oszlop6= false;
                sor4oszlop6Nev="n";
            }else if (harcpEgymasra ==65) {
                sor5oszlop6= false;
                sor5oszlop6Nev="n";
            }else if (harcpEgymasra ==66) {
                sor6oszlop6= false;
                sor6oszlop6Nev="n";
            }else if (harcpEgymasra ==67) {
                sor7oszlop6= false;
                sor7oszlop6Nev="n";
            }else if (harcpEgymasra ==68) {
                sor8oszlop6= false;
                sor8oszlop6Nev="n";
            }else if (harcpEgymasra ==69) {
                sor9oszlop6= false;
                sor9oszlop6Nev="n";
            }else if (harcpEgymasra ==610) {
                sor10oszlop6= false;
                sor10oszlop6Nev="n";
            }else if (harcpEgymasra ==71) {
                sor1oszlop7= false;
                sor1oszlop7Nev="n";
            }else if (harcpEgymasra ==72) {
                sor2oszlop7= false;
                sor2oszlop7Nev="n";
            }else if (harcpEgymasra ==73) {
                sor3oszlop7= false;
                sor3oszlop7Nev="n";
            }else if (harcpEgymasra ==74) {
                sor4oszlop7= false;
                sor4oszlop7Nev="n";
            }else if (harcpEgymasra ==75) {
                sor5oszlop7= false;
                sor5oszlop7Nev="n";
            }else if (harcpEgymasra ==76) {
                sor6oszlop7= false;
                sor6oszlop7Nev="n";
            }else if (harcpEgymasra ==77) {
                sor7oszlop7= false;
                sor7oszlop7Nev="n";
            }else if (harcpEgymasra ==78) {
                sor8oszlop7= false;
                sor8oszlop7Nev="n";
            }else if (harcpEgymasra ==79) {
                sor9oszlop7= false;
                sor9oszlop7Nev="n";
            }else if (harcpEgymasra ==710) {
                sor10oszlop7= false;
                sor10oszlop7Nev="n";
            }else if (harcpEgymasra ==81) {
                sor1oszlop8= false;
                sor1oszlop8Nev="n";
            }else if (harcpEgymasra ==82) {
                sor2oszlop8= false;
                sor2oszlop8Nev="n";
            }else if (harcpEgymasra ==83) {
                sor3oszlop8= false;
                sor3oszlop8Nev="n";
            }else if (harcpEgymasra ==84) {
                sor4oszlop8= false;
                sor4oszlop8Nev="n";
            }else if (harcpEgymasra ==85) {
                sor5oszlop8= false;
                sor5oszlop8Nev="n";
            }else if (harcpEgymasra ==86) {
                sor6oszlop8= false;
                sor6oszlop8Nev="n";
            }else if (harcpEgymasra ==87) {
                sor7oszlop8= false;
                sor7oszlop8Nev="n";
            }else if (harcpEgymasra ==88) {
                sor8oszlop8= false;
                sor8oszlop8Nev="n";
            }else if (harcpEgymasra ==89) {
                sor9oszlop8= false;
                sor9oszlop8Nev="n";
            }else if (harcpEgymasra ==810) {
                sor10oszlop8= false;
                sor10oszlop8Nev="n";
            }else if (harcpEgymasra ==91) {
                sor1oszlop9= false;
                sor1oszlop9Nev="n";
            }else if (harcpEgymasra ==92) {
                sor2oszlop9= false;
                sor2oszlop9Nev="n";
            }else if (harcpEgymasra ==93) {
                sor3oszlop9= false;
                sor3oszlop9Nev="n";
            }else if (harcpEgymasra ==94) {
                sor4oszlop9= false;
                sor4oszlop9Nev="n";
            }else if (harcpEgymasra ==95) {
                sor5oszlop9= false;
                sor5oszlop9Nev="n";
            }else if (harcpEgymasra ==96) {
                sor6oszlop9= false;
                sor6oszlop9Nev="n";
            }else if (harcpEgymasra ==97) {
                sor7oszlop9= false;
                sor7oszlop9Nev="n";
            }else if (harcpEgymasra ==98) {
                sor8oszlop9= false;
                sor8oszlop9Nev="n";
            }else if (harcpEgymasra ==99) {
                sor9oszlop9= false;
                sor9oszlop9Nev="n";
            }else if (harcpEgymasra ==910) {
                sor10oszlop9= false;
                sor10oszlop9Nev="n";
            }else if (harcpEgymasra ==101) {
                sor1oszlop10= false;
                sor1oszlop10Nev="n";
            }else if (harcpEgymasra ==102) {
                sor2oszlop10= false;
                sor2oszlop10Nev="n";
            }else if (harcpEgymasra ==103) {
                sor3oszlop10= false;
                sor3oszlop10Nev="n";
            }else if (harcpEgymasra ==104) {
                sor4oszlop10= false;
                sor4oszlop10Nev="n";
            }else if (harcpEgymasra ==105) {
                sor5oszlop10= false;
                sor5oszlop10Nev="n";
            }else if (harcpEgymasra ==106) {
                sor6oszlop10= false;
                sor6oszlop10Nev="n";
            }else if (harcpEgymasra ==107) {
                sor7oszlop10= false;
                sor7oszlop10Nev="n";
            }else if (harcpEgymasra ==108) {
                sor8oszlop10= false;
                sor8oszlop10Nev="n";
            }else if (harcpEgymasra ==109) {
                sor9oszlop10= false;
                sor9oszlop10Nev="n";
            }else if (harcpEgymasra ==1010) {
                sor10oszlop10= false;
                sor10oszlop10Nev="n";
            }else if (harcpEgymasra ==111) {
                sor1oszlop11= false;
                sor1oszlop11Nev="n";
            }else if (harcpEgymasra ==112) {
                sor2oszlop11= false;
                sor2oszlop11Nev="n";
            }else if (harcpEgymasra ==113) {
                sor3oszlop11= false;
                sor3oszlop11Nev="n";
            }else if (harcpEgymasra ==114) {
                sor4oszlop11= false;
                sor4oszlop11Nev="n";
            }else if (harcpEgymasra ==115) {
                sor5oszlop11= false;
                sor5oszlop11Nev="n";
            }else if (harcpEgymasra ==116) {
                sor6oszlop11= false;
                sor6oszlop11Nev="n";
            }else if (harcpEgymasra ==117) {
                sor7oszlop11= false;
                sor7oszlop11Nev="n";
            }else if (harcpEgymasra ==118) {
                sor8oszlop11= false;
                sor8oszlop11Nev="n";
            }else if (harcpEgymasra ==119) {
                sor9oszlop11= false;
                sor9oszlop11Nev="n";
            }else if (harcpEgymasra ==1110) {
                sor10oszlop11= false;
                sor10oszlop11Nev="n";
            }else if (harcpEgymasra ==121) {
                sor1oszlop12= false;
                sor1oszlop12Nev="n";
            }else if (harcpEgymasra ==122) {
                sor2oszlop12= false;
                sor2oszlop12Nev="n";
            }else if (harcpEgymasra ==123) {
                sor3oszlop12= false;
                sor3oszlop12Nev="n";
            }else if (harcpEgymasra ==124) {
                sor4oszlop12= false;
                sor4oszlop12Nev="n";
            }else if (harcpEgymasra ==125) {
                sor5oszlop12= false;
                sor5oszlop12Nev="n";
            }else if (harcpEgymasra ==126) {
                sor6oszlop12= false;
                sor6oszlop12Nev="n";
            }else if (harcpEgymasra ==127) {
                sor7oszlop12= false;
                sor7oszlop12Nev="n";
            }else if (harcpEgymasra ==128) {
                sor8oszlop12= false;
                sor8oszlop12Nev="n";
            }else if (harcpEgymasra ==129) {
                sor9oszlop12= false;
                sor9oszlop12Nev="n";
            }else if (harcpEgymasra ==1210) {
                sor10oszlop12= false;
                sor10oszlop12Nev="n";
            }
            harcpEgymasra =poz;
            pozTamadhatoHarcp=(oszlop + "-" + sor);

        }else if ( raptEgymasra !=0 && egyseg.equals("rapt") && minoEgymasra !=poz && felderEgymasra !=poz && csontEgymasra !=poz && orgyEgymasra !=poz && raptEgymasra !=poz
                && egrifEgymasra !=poz && eijasEgymasra !=poz && efoldmuvEgymasra !=poz && efegyvEgymasra !=poz && eharcpEgymasra !=poz && raptEgymasra !=pozJelenlegi  ) {
            if (raptEgymasra ==11) {
                sor1oszlop1= false;
                sor1oszlop1Nev="n";
            }else if (raptEgymasra ==12) {
                sor2oszlop1= false;
                sor2oszlop1Nev="n";
            }else if (raptEgymasra ==13) {
                sor3oszlop1= false;
                sor3oszlop1Nev="n";
            }else if (raptEgymasra ==14) {
                sor4oszlop1= false;
                sor4oszlop1Nev="n";
            }else if (raptEgymasra ==15) {
                sor5oszlop1= false;
                sor5oszlop1Nev="n";
            }else if (raptEgymasra ==16) {
                sor6oszlop1= false;
                sor6oszlop1Nev="n";
            }else if (raptEgymasra ==17) {
                sor7oszlop1= false;
                sor7oszlop1Nev="n";
            }else if (raptEgymasra ==18) {
                sor8oszlop1= false;
                sor8oszlop1Nev="n";
            }else if (raptEgymasra ==19) {
                sor9oszlop1= false;
                sor9oszlop1Nev="n";
            }else if (raptEgymasra ==110) {
                sor10oszlop1= false;
                sor10oszlop1Nev="n";
            }else if (raptEgymasra ==21) {
                sor1oszlop2= false;
                sor1oszlop2Nev="n";
            }else if (raptEgymasra ==22) {
                sor2oszlop2= false;
                sor2oszlop2Nev="n";
            }else if (raptEgymasra ==23) {
                sor3oszlop2= false;
                sor3oszlop2Nev="n";
            }else if (raptEgymasra ==24) {
                sor4oszlop2= false;
                sor4oszlop2Nev="n";
            }else if (raptEgymasra ==25) {
                sor5oszlop2= false;
                sor5oszlop2Nev="n";
            }else if (raptEgymasra ==26) {
                sor6oszlop2= false;
                sor6oszlop2Nev="n";
            }else if (raptEgymasra ==27) {
                sor7oszlop2= false;
                sor7oszlop2Nev="n";
            }else if (raptEgymasra ==28) {
                sor8oszlop2= false;
                sor8oszlop2Nev="n";
            }else if (raptEgymasra ==29) {
                sor9oszlop2= false;
                sor9oszlop2Nev="n";
            }else if (raptEgymasra ==210) {
                sor10oszlop2= false;
                sor10oszlop2Nev="n";
            }else if (raptEgymasra ==31) {
                sor1oszlop3= false;
                sor1oszlop3Nev="n";
            }else if (raptEgymasra ==32) {
                sor2oszlop3= false;
                sor2oszlop3Nev="n";
            }else if (raptEgymasra ==33) {
                sor3oszlop3= false;
                sor3oszlop3Nev="n";
            }else if (raptEgymasra ==34) {
                sor4oszlop3= false;
                sor4oszlop3Nev="n";
            }else if (raptEgymasra ==35) {
                sor5oszlop3= false;
                sor5oszlop3Nev="n";
            }else if (raptEgymasra ==36) {
                sor6oszlop3= false;
                sor6oszlop3Nev="n";
            }else if (raptEgymasra ==37) {
                sor7oszlop3= false;
                sor7oszlop3Nev="n";
            }else if (raptEgymasra ==38) {
                sor8oszlop3= false;
                sor8oszlop3Nev="n";
            }else if (raptEgymasra ==39) {
                sor9oszlop3= false;
                sor9oszlop3Nev="n";
            }else if (raptEgymasra ==310) {
                sor10oszlop3= false;
                sor10oszlop3Nev="n";
            }else if (raptEgymasra ==41) {
                sor1oszlop4= false;
                sor1oszlop4Nev="n";
            }else if (raptEgymasra ==42) {
                sor2oszlop4= false;
                sor2oszlop4Nev="n";
            }else if (raptEgymasra ==43) {
                sor3oszlop4= false;
                sor3oszlop4Nev="n";
            }else if (raptEgymasra ==44) {
                sor4oszlop4= false;
                sor4oszlop4Nev="n";
            }else if (raptEgymasra ==45) {
                sor5oszlop4= false;
                sor5oszlop4Nev="n";
            }else if (raptEgymasra ==46) {
                sor6oszlop4= false;
                sor6oszlop4Nev="n";
            }else if (raptEgymasra ==47) {
                sor7oszlop4= false;
                sor7oszlop4Nev="n";
            }else if (raptEgymasra ==48) {
                sor8oszlop4= false;
                sor8oszlop4Nev="n";
            }else if (raptEgymasra ==49) {
                sor9oszlop4= false;
                sor9oszlop4Nev="n";
            }else if (raptEgymasra ==410) {
                sor10oszlop4= false;
                sor10oszlop4Nev="n";
            }else if (raptEgymasra ==51) {
                sor1oszlop5= false;
                sor1oszlop5Nev="n";
            }else if (raptEgymasra ==52) {
                sor2oszlop5= false;
                sor2oszlop5Nev="n";
            }else if (raptEgymasra ==53) {
                sor3oszlop5= false;
                sor3oszlop5Nev="n";
            }else if (raptEgymasra ==54) {
                sor4oszlop5= false;
                sor4oszlop5Nev="n";
            }else if (raptEgymasra ==55) {
                sor5oszlop5= false;
                sor5oszlop5Nev="n";
            }else if (raptEgymasra ==56) {
                sor6oszlop5= false;
                sor6oszlop5Nev="n";
            }else if (raptEgymasra ==57) {
                sor7oszlop5= false;
                sor7oszlop5Nev="n";
            }else if (raptEgymasra ==58) {
                sor8oszlop5= false;
                sor8oszlop5Nev="n";
            }else if (raptEgymasra ==59) {
                sor9oszlop5= false;
                sor9oszlop5Nev="n";
            }else if (raptEgymasra ==510) {
                sor10oszlop5= false;
                sor10oszlop5Nev="n";
            }else if (raptEgymasra ==61) {
                sor1oszlop6= false;
                sor1oszlop6Nev="n";
            }else if (raptEgymasra ==62) {
                sor2oszlop6= false;
                sor2oszlop6Nev="n";
            }else if (raptEgymasra ==63) {
                sor3oszlop6= false;
                sor3oszlop6Nev="n";
            }else if (raptEgymasra ==64) {
                sor4oszlop6= false;
                sor4oszlop6Nev="n";
            }else if (raptEgymasra ==65) {
                sor5oszlop6= false;
                sor5oszlop6Nev="n";
            }else if (raptEgymasra ==66) {
                sor6oszlop6= false;
                sor6oszlop6Nev="n";
            }else if (raptEgymasra ==67) {
                sor7oszlop6= false;
                sor7oszlop6Nev="n";
            }else if (raptEgymasra ==68) {
                sor8oszlop6= false;
                sor8oszlop6Nev="n";
            }else if (raptEgymasra ==69) {
                sor9oszlop6= false;
                sor9oszlop6Nev="n";
            }else if (raptEgymasra ==610) {
                sor10oszlop6= false;
                sor10oszlop6Nev="n";
            }else if (raptEgymasra ==71) {
                sor1oszlop7= false;
                sor1oszlop7Nev="n";
            }else if (raptEgymasra ==72) {
                sor2oszlop7= false;
                sor2oszlop7Nev="n";
            }else if (raptEgymasra ==73) {
                sor3oszlop7= false;
                sor3oszlop7Nev="n";
            }else if (raptEgymasra ==74) {
                sor4oszlop7= false;
                sor4oszlop7Nev="n";
            }else if (raptEgymasra ==75) {
                sor5oszlop7= false;
                sor5oszlop7Nev="n";
            }else if (raptEgymasra ==76) {
                sor6oszlop7= false;
                sor6oszlop7Nev="n";
            }else if (raptEgymasra ==77) {
                sor7oszlop7= false;
                sor7oszlop7Nev="n";
            }else if (raptEgymasra ==78) {
                sor8oszlop7= false;
                sor8oszlop7Nev="n";
            }else if (raptEgymasra ==79) {
                sor9oszlop7= false;
                sor9oszlop7Nev="n";
            }else if (raptEgymasra ==710) {
                sor10oszlop7= false;
                sor10oszlop7Nev="n";
            }else if (raptEgymasra ==81) {
                sor1oszlop8= false;
                sor1oszlop8Nev="n";
            }else if (raptEgymasra ==82) {
                sor2oszlop8= false;
                sor2oszlop8Nev="n";
            }else if (raptEgymasra ==83) {
                sor3oszlop8= false;
                sor3oszlop8Nev="n";
            }else if (raptEgymasra ==84) {
                sor4oszlop8= false;
                sor4oszlop8Nev="n";
            }else if (raptEgymasra ==85) {
                sor5oszlop8= false;
                sor5oszlop8Nev="n";
            }else if (raptEgymasra ==86) {
                sor6oszlop8= false;
                sor6oszlop8Nev="n";
            }else if (raptEgymasra ==87) {
                sor7oszlop8= false;
                sor7oszlop8Nev="n";
            }else if (raptEgymasra ==88) {
                sor8oszlop8= false;
                sor8oszlop8Nev="n";
            }else if (raptEgymasra ==89) {
                sor9oszlop8= false;
                sor9oszlop8Nev="n";
            }else if (raptEgymasra ==810) {
                sor10oszlop8= false;
                sor10oszlop8Nev="n";
            }else if (raptEgymasra ==91) {
                sor1oszlop9= false;
                sor1oszlop9Nev="n";
            }else if (raptEgymasra ==92) {
                sor2oszlop9= false;
                sor2oszlop9Nev="n";
            }else if (raptEgymasra ==93) {
                sor3oszlop9= false;
                sor3oszlop9Nev="n";
            }else if (raptEgymasra ==94) {
                sor4oszlop9= false;
                sor4oszlop9Nev="n";
            }else if (raptEgymasra ==95) {
                sor5oszlop9= false;
                sor5oszlop9Nev="n";
            }else if (raptEgymasra ==96) {
                sor6oszlop9= false;
                sor6oszlop9Nev="n";
            }else if (raptEgymasra ==97) {
                sor7oszlop9= false;
                sor7oszlop9Nev="n";
            }else if (raptEgymasra ==98) {
                sor8oszlop9= false;
                sor8oszlop9Nev="n";
            }else if (raptEgymasra ==99) {
                sor9oszlop9= false;
                sor9oszlop9Nev="n";
            }else if (raptEgymasra ==910) {
                sor10oszlop9= false;
                sor10oszlop9Nev="n";
            }else if (raptEgymasra ==101) {
                sor1oszlop10= false;
                sor1oszlop10Nev="n";
            }else if (raptEgymasra ==102) {
                sor2oszlop10= false;
                sor2oszlop10Nev="n";
            }else if (raptEgymasra ==103) {
                sor3oszlop10= false;
                sor3oszlop10Nev="n";
            }else if (raptEgymasra ==104) {
                sor4oszlop10= false;
                sor4oszlop10Nev="n";
            }else if (raptEgymasra ==105) {
                sor5oszlop10= false;
                sor5oszlop10Nev="n";
            }else if (raptEgymasra ==106) {
                sor6oszlop10= false;
                sor6oszlop10Nev="n";
            }else if (raptEgymasra ==107) {
                sor7oszlop10= false;
                sor7oszlop10Nev="n";
            }else if (raptEgymasra ==108) {
                sor8oszlop10= false;
                sor8oszlop10Nev="n";
            }else if (raptEgymasra ==109) {
                sor9oszlop10= false;
                sor9oszlop10Nev="n";
            }else if (raptEgymasra ==1010) {
                sor10oszlop10= false;
                sor10oszlop10Nev="n";
            }else if (raptEgymasra ==111) {
                sor1oszlop11= false;
                sor1oszlop11Nev="n";
            }else if (raptEgymasra ==112) {
                sor2oszlop11= false;
                sor2oszlop11Nev="n";
            }else if (raptEgymasra ==113) {
                sor3oszlop11= false;
                sor3oszlop11Nev="n";
            }else if (raptEgymasra ==114) {
                sor4oszlop11= false;
                sor4oszlop11Nev="n";
            }else if (raptEgymasra ==115) {
                sor5oszlop11= false;
                sor5oszlop11Nev="n";
            }else if (raptEgymasra ==116) {
                sor6oszlop11= false;
                sor6oszlop11Nev="n";
            }else if (raptEgymasra ==117) {
                sor7oszlop11= false;
                sor7oszlop11Nev="n";
            }else if (raptEgymasra ==118) {
                sor8oszlop11= false;
                sor8oszlop11Nev="n";
            }else if (raptEgymasra ==119) {
                sor9oszlop11= false;
                sor9oszlop11Nev="n";
            }else if (raptEgymasra ==1110) {
                sor10oszlop11= false;
                sor10oszlop11Nev="n";
            }else if (raptEgymasra ==121) {
                sor1oszlop12= false;
                sor1oszlop12Nev="n";
            }else if (raptEgymasra ==122) {
                sor2oszlop12= false;
                sor2oszlop12Nev="n";
            }else if (raptEgymasra ==123) {
                sor3oszlop12= false;
                sor3oszlop12Nev="n";
            }else if (raptEgymasra ==124) {
                sor4oszlop12= false;
                sor4oszlop12Nev="n";
            }else if (raptEgymasra ==125) {
                sor5oszlop12= false;
                sor5oszlop12Nev="n";
            }else if (raptEgymasra ==126) {
                sor6oszlop12= false;
                sor6oszlop12Nev="n";
            }else if (raptEgymasra ==127) {
                sor7oszlop12= false;
                sor7oszlop12Nev="n";
            }else if (raptEgymasra ==128) {
                sor8oszlop12= false;
                sor8oszlop12Nev="n";
            }else if (raptEgymasra ==129) {
                sor9oszlop12= false;
                sor9oszlop12Nev="n";
            }else if (raptEgymasra ==1210) {
                sor10oszlop12= false;
                sor10oszlop12Nev="n";
            }
            raptEgymasra =poz;
            pozTamadhatoRapt=(oszlop + "-" + sor);

        }else if ( ecsontEgymasra !=0 && egyseg.equals("ecsont") && eminoEgymasra !=poz && efelderEgymasra !=poz && ecsontEgymasra !=poz && eorgyEgymasra !=poz && eraptEgymasra !=poz
                && grifEgymasra !=poz && ijasEgymasra !=poz && foldmuvEgymasra !=poz && fegyvEgymasra !=poz && harcpEgymasra !=poz && ecsontEgymasra !=pozJelenlegi  ) {
            if (ecsontEgymasra ==11) {
                sor1oszlop1= false;
                sor1oszlop1Nev="n";
            }else if (ecsontEgymasra ==12) {
                sor2oszlop1= false;
                sor2oszlop1Nev="n";
            }else if (ecsontEgymasra ==13) {
                sor3oszlop1= false;
                sor3oszlop1Nev="n";
            }else if (ecsontEgymasra ==14) {
                sor4oszlop1= false;
                sor4oszlop1Nev="n";
            }else if (ecsontEgymasra ==15) {
                sor5oszlop1= false;
                sor5oszlop1Nev="n";
            }else if (ecsontEgymasra ==16) {
                sor6oszlop1= false;
                sor6oszlop1Nev="n";
            }else if (ecsontEgymasra ==17) {
                sor7oszlop1= false;
                sor7oszlop1Nev="n";
            }else if (ecsontEgymasra ==18) {
                sor8oszlop1= false;
                sor8oszlop1Nev="n";
            }else if (ecsontEgymasra ==19) {
                sor9oszlop1= false;
                sor9oszlop1Nev="n";
            }else if (ecsontEgymasra ==110) {
                sor10oszlop1= false;
                sor10oszlop1Nev="n";
            }else if (ecsontEgymasra ==21) {
                sor1oszlop2= false;
                sor1oszlop2Nev="n";
            }else if (ecsontEgymasra ==22) {
                sor2oszlop2= false;
                sor2oszlop2Nev="n";
            }else if (ecsontEgymasra ==23) {
                sor3oszlop2= false;
                sor3oszlop2Nev="n";
            }else if (ecsontEgymasra ==24) {
                sor4oszlop2= false;
                sor4oszlop2Nev="n";
            }else if (ecsontEgymasra ==25) {
                sor5oszlop2= false;
                sor5oszlop2Nev="n";
            }else if (ecsontEgymasra ==26) {
                sor6oszlop2= false;
                sor6oszlop2Nev="n";
            }else if (ecsontEgymasra ==27) {
                sor7oszlop2= false;
                sor7oszlop2Nev="n";
            }else if (ecsontEgymasra ==28) {
                sor8oszlop2= false;
                sor8oszlop2Nev="n";
            }else if (ecsontEgymasra ==29) {
                sor9oszlop2= false;
                sor9oszlop2Nev="n";
            }else if (ecsontEgymasra ==210) {
                sor10oszlop2= false;
                sor10oszlop2Nev="n";
            }else if (ecsontEgymasra ==31) {
                sor1oszlop3= false;
                sor1oszlop3Nev="n";
            }else if (ecsontEgymasra ==32) {
                sor2oszlop3= false;
                sor2oszlop3Nev="n";
            }else if (ecsontEgymasra ==33) {
                sor3oszlop3= false;
                sor3oszlop3Nev="n";
            }else if (ecsontEgymasra ==34) {
                sor4oszlop3= false;
                sor4oszlop3Nev="n";
            }else if (ecsontEgymasra ==35) {
                sor5oszlop3= false;
                sor5oszlop3Nev="n";
            }else if (ecsontEgymasra ==36) {
                sor6oszlop3= false;
                sor6oszlop3Nev="n";
            }else if (ecsontEgymasra ==37) {
                sor7oszlop3= false;
                sor7oszlop3Nev="n";
            }else if (ecsontEgymasra ==38) {
                sor8oszlop3= false;
                sor8oszlop3Nev="n";
            }else if (ecsontEgymasra ==39) {
                sor9oszlop3= false;
                sor9oszlop3Nev="n";
            }else if (ecsontEgymasra ==310) {
                sor10oszlop3= false;
                sor10oszlop3Nev="n";
            }else if (ecsontEgymasra ==41) {
                sor1oszlop4= false;
                sor1oszlop4Nev="n";
            }else if (ecsontEgymasra ==42) {
                sor2oszlop4= false;
                sor2oszlop4Nev="n";
            }else if (ecsontEgymasra ==43) {
                sor3oszlop4= false;
                sor3oszlop4Nev="n";
            }else if (ecsontEgymasra ==44) {
                sor4oszlop4= false;
                sor4oszlop4Nev="n";
            }else if (ecsontEgymasra ==45) {
                sor5oszlop4= false;
                sor5oszlop4Nev="n";
            }else if (ecsontEgymasra ==46) {
                sor6oszlop4= false;
                sor6oszlop4Nev="n";
            }else if (ecsontEgymasra ==47) {
                sor7oszlop4= false;
                sor7oszlop4Nev="n";
            }else if (ecsontEgymasra ==48) {
                sor8oszlop4= false;
                sor8oszlop4Nev="n";
            }else if (ecsontEgymasra ==49) {
                sor9oszlop4= false;
                sor9oszlop4Nev="n";
            }else if (ecsontEgymasra ==410) {
                sor10oszlop4= false;
                sor10oszlop4Nev="n";
            }else if (ecsontEgymasra ==51) {
                sor1oszlop5= false;
                sor1oszlop5Nev="n";
            }else if (ecsontEgymasra ==52) {
                sor2oszlop5= false;
                sor2oszlop5Nev="n";
            }else if (ecsontEgymasra ==53) {
                sor3oszlop5= false;
                sor3oszlop5Nev="n";
            }else if (ecsontEgymasra ==54) {
                sor4oszlop5= false;
                sor4oszlop5Nev="n";
            }else if (ecsontEgymasra ==55) {
                sor5oszlop5= false;
                sor5oszlop5Nev="n";
            }else if (ecsontEgymasra ==56) {
                sor6oszlop5= false;
                sor6oszlop5Nev="n";
            }else if (ecsontEgymasra ==57) {
                sor7oszlop5= false;
                sor7oszlop5Nev="n";
            }else if (ecsontEgymasra ==58) {
                sor8oszlop5= false;
                sor8oszlop5Nev="n";
            }else if (ecsontEgymasra ==59) {
                sor9oszlop5= false;
                sor9oszlop5Nev="n";
            }else if (ecsontEgymasra ==510) {
                sor10oszlop5= false;
                sor10oszlop5Nev="n";
            }else if (ecsontEgymasra ==61) {
                sor1oszlop6= false;
                sor1oszlop6Nev="n";
            }else if (ecsontEgymasra ==62) {
                sor2oszlop6= false;
                sor2oszlop6Nev="n";
            }else if (ecsontEgymasra ==63) {
                sor3oszlop6= false;
                sor3oszlop6Nev="n";
            }else if (ecsontEgymasra ==64) {
                sor4oszlop6= false;
                sor4oszlop6Nev="n";
            }else if (ecsontEgymasra ==65) {
                sor5oszlop6= false;
                sor5oszlop6Nev="n";
            }else if (ecsontEgymasra ==66) {
                sor6oszlop6= false;
                sor6oszlop6Nev="n";
            }else if (ecsontEgymasra ==67) {
                sor7oszlop6= false;
                sor7oszlop6Nev="n";
            }else if (ecsontEgymasra ==68) {
                sor8oszlop6= false;
                sor8oszlop6Nev="n";
            }else if (ecsontEgymasra ==69) {
                sor9oszlop6= false;
                sor9oszlop6Nev="n";
            }else if (ecsontEgymasra ==610) {
                sor10oszlop6= false;
                sor10oszlop6Nev="n";
            }else if (ecsontEgymasra ==71) {
                sor1oszlop7= false;
                sor1oszlop7Nev="n";
            }else if (ecsontEgymasra ==72) {
                sor2oszlop7= false;
                sor2oszlop7Nev="n";
            }else if (ecsontEgymasra ==73) {
                sor3oszlop7= false;
                sor3oszlop7Nev="n";
            }else if (ecsontEgymasra ==74) {
                sor4oszlop7= false;
                sor4oszlop7Nev="n";
            }else if (ecsontEgymasra ==75) {
                sor5oszlop7= false;
                sor5oszlop7Nev="n";
            }else if (ecsontEgymasra ==76) {
                sor6oszlop7= false;
                sor6oszlop7Nev="n";
            }else if (ecsontEgymasra ==77) {
                sor7oszlop7= false;
                sor7oszlop7Nev="n";
            }else if (ecsontEgymasra ==78) {
                sor8oszlop7= false;
                sor8oszlop7Nev="n";
            }else if (ecsontEgymasra ==79) {
                sor9oszlop7= false;
                sor9oszlop7Nev="n";
            }else if (ecsontEgymasra ==710) {
                sor10oszlop7= false;
                sor10oszlop7Nev="n";
            }else if (ecsontEgymasra ==81) {
                sor1oszlop8= false;
                sor1oszlop8Nev="n";
            }else if (ecsontEgymasra ==82) {
                sor2oszlop8= false;
                sor2oszlop8Nev="n";
            }else if (ecsontEgymasra ==83) {
                sor3oszlop8= false;
                sor3oszlop8Nev="n";
            }else if (ecsontEgymasra ==84) {
                sor4oszlop8= false;
                sor4oszlop8Nev="n";
            }else if (ecsontEgymasra ==85) {
                sor5oszlop8= false;
                sor5oszlop8Nev="n";
            }else if (ecsontEgymasra ==86) {
                sor6oszlop8= false;
                sor6oszlop8Nev="n";
            }else if (ecsontEgymasra ==87) {
                sor7oszlop8= false;
                sor7oszlop8Nev="n";
            }else if (ecsontEgymasra ==88) {
                sor8oszlop8= false;
                sor8oszlop8Nev="n";
            }else if (ecsontEgymasra ==89) {
                sor9oszlop8= false;
                sor9oszlop8Nev="n";
            }else if (ecsontEgymasra ==810) {
                sor10oszlop8= false;
                sor10oszlop8Nev="n";
            }else if (ecsontEgymasra ==91) {
                sor1oszlop9= false;
                sor1oszlop9Nev="n";
            }else if (ecsontEgymasra ==92) {
                sor2oszlop9= false;
                sor2oszlop9Nev="n";
            }else if (ecsontEgymasra ==93) {
                sor3oszlop9= false;
                sor3oszlop9Nev="n";
            }else if (ecsontEgymasra ==94) {
                sor4oszlop9= false;
                sor4oszlop9Nev="n";
            }else if (ecsontEgymasra ==95) {
                sor5oszlop9= false;
                sor5oszlop9Nev="n";
            }else if (ecsontEgymasra ==96) {
                sor6oszlop9= false;
                sor6oszlop9Nev="n";
            }else if (ecsontEgymasra ==97) {
                sor7oszlop9= false;
                sor7oszlop9Nev="n";
            }else if (ecsontEgymasra ==98) {
                sor8oszlop9= false;
                sor8oszlop9Nev="n";
            }else if (ecsontEgymasra ==99) {
                sor9oszlop9= false;
                sor9oszlop9Nev="n";
            }else if (ecsontEgymasra ==910) {
                sor10oszlop9= false;
                sor10oszlop9Nev="n";
            }else if (ecsontEgymasra ==101) {
                sor1oszlop10= false;
                sor1oszlop10Nev="n";
            }else if (ecsontEgymasra ==102) {
                sor2oszlop10= false;
                sor2oszlop10Nev="n";
            }else if (ecsontEgymasra ==103) {
                sor3oszlop10= false;
                sor3oszlop10Nev="n";
            }else if (ecsontEgymasra ==104) {
                sor4oszlop10= false;
                sor4oszlop10Nev="n";
            }else if (ecsontEgymasra ==105) {
                sor5oszlop10= false;
                sor5oszlop10Nev="n";
            }else if (ecsontEgymasra ==106) {
                sor6oszlop10= false;
                sor6oszlop10Nev="n";
            }else if (ecsontEgymasra ==107) {
                sor7oszlop10= false;
                sor7oszlop10Nev="n";
            }else if (ecsontEgymasra ==108) {
                sor8oszlop10= false;
                sor8oszlop10Nev="n";
            }else if (ecsontEgymasra ==109) {
                sor9oszlop10= false;
                sor9oszlop10Nev="n";
            }else if (ecsontEgymasra ==1010) {
                sor10oszlop10= false;
                sor10oszlop10Nev="n";
            }else if (ecsontEgymasra ==111) {
                sor1oszlop11= false;
                sor1oszlop11Nev="n";
            }else if (ecsontEgymasra ==112) {
                sor2oszlop11= false;
                sor2oszlop11Nev="n";
            }else if (ecsontEgymasra ==113) {
                sor3oszlop11= false;
                sor3oszlop11Nev="n";
            }else if (ecsontEgymasra ==114) {
                sor4oszlop11= false;
                sor4oszlop11Nev="n";
            }else if (ecsontEgymasra ==115) {
                sor5oszlop11= false;
                sor5oszlop11Nev="n";
            }else if (ecsontEgymasra ==116) {
                sor6oszlop11= false;
                sor6oszlop11Nev="n";
            }else if (ecsontEgymasra ==117) {
                sor7oszlop11= false;
                sor7oszlop11Nev="n";
            }else if (ecsontEgymasra ==118) {
                sor8oszlop11= false;
                sor8oszlop11Nev="n";
            }else if (ecsontEgymasra ==119) {
                sor9oszlop11= false;
                sor9oszlop11Nev="n";
            }else if (ecsontEgymasra ==1110) {
                sor10oszlop11= false;
                sor10oszlop11Nev="n";
            }else if (ecsontEgymasra ==121) {
                sor1oszlop12= false;
                sor1oszlop12Nev="n";
            }else if (ecsontEgymasra ==122) {
                sor2oszlop12= false;
                sor2oszlop12Nev="n";
            }else if (ecsontEgymasra ==123) {
                sor3oszlop12= false;
                sor3oszlop12Nev="n";
            }else if (ecsontEgymasra ==124) {
                sor4oszlop12= false;
                sor4oszlop12Nev="n";
            }else if (ecsontEgymasra ==125) {
                sor5oszlop12= false;
                sor5oszlop12Nev="n";
            }else if (ecsontEgymasra ==126) {
                sor6oszlop12= false;
                sor6oszlop12Nev="n";
            }else if (ecsontEgymasra ==127) {
                sor7oszlop12= false;
                sor7oszlop12Nev="n";
            }else if (ecsontEgymasra ==128) {
                sor8oszlop12= false;
                sor8oszlop12Nev="n";
            }else if (ecsontEgymasra ==129) {
                sor9oszlop12= false;
                sor9oszlop12Nev="n";
            }else if (ecsontEgymasra ==1210) {
                sor10oszlop12= false;
                sor10oszlop12Nev="n";
            }
            ecsontEgymasra =poz;

        }else if ( efoldmuvEgymasra !=0 && egyseg.equals("efoldmuv") && egrifEgymasra !=poz && eijasEgymasra !=poz && efoldmuvEgymasra !=poz && efegyvEgymasra !=poz && eharcpEgymasra !=poz
                && minoEgymasra !=poz && felderEgymasra !=poz && csontEgymasra !=poz && orgyEgymasra !=poz && raptEgymasra !=poz && efoldmuvEgymasra !=pozJelenlegi  ) {
            if (efoldmuvEgymasra ==11) {
                sor1oszlop1= false;
                sor1oszlop1Nev="n";
            }else if (efoldmuvEgymasra ==12) {
                sor2oszlop1= false;
                sor2oszlop1Nev="n";
            }else if (efoldmuvEgymasra ==13) {
                sor3oszlop1= false;
                sor3oszlop1Nev="n";
            }else if (efoldmuvEgymasra ==14) {
                sor4oszlop1= false;
                sor4oszlop1Nev="n";
            }else if (efoldmuvEgymasra ==15) {
                sor5oszlop1= false;
                sor5oszlop1Nev="n";
            }else if (efoldmuvEgymasra ==16) {
                sor6oszlop1= false;
                sor6oszlop1Nev="n";
            }else if (efoldmuvEgymasra ==17) {
                sor7oszlop1= false;
                sor7oszlop1Nev="n";
            }else if (efoldmuvEgymasra ==18) {
                sor8oszlop1= false;
                sor8oszlop1Nev="n";
            }else if (efoldmuvEgymasra ==19) {
                sor9oszlop1= false;
                sor9oszlop1Nev="n";
            }else if (efoldmuvEgymasra ==110) {
                sor10oszlop1= false;
                sor10oszlop1Nev="n";
            }else if (efoldmuvEgymasra ==21) {
                sor1oszlop2= false;
                sor1oszlop2Nev="n";
            }else if (efoldmuvEgymasra ==22) {
                sor2oszlop2= false;
                sor2oszlop2Nev="n";
            }else if (efoldmuvEgymasra ==23) {
                sor3oszlop2= false;
                sor3oszlop2Nev="n";
            }else if (efoldmuvEgymasra ==24) {
                sor4oszlop2= false;
                sor4oszlop2Nev="n";
            }else if (efoldmuvEgymasra ==25) {
                sor5oszlop2= false;
                sor5oszlop2Nev="n";
            }else if (efoldmuvEgymasra ==26) {
                sor6oszlop2= false;
                sor6oszlop2Nev="n";
            }else if (efoldmuvEgymasra ==27) {
                sor7oszlop2= false;
                sor7oszlop2Nev="n";
            }else if (efoldmuvEgymasra ==28) {
                sor8oszlop2= false;
                sor8oszlop2Nev="n";
            }else if (efoldmuvEgymasra ==29) {
                sor9oszlop2= false;
                sor9oszlop2Nev="n";
            }else if (efoldmuvEgymasra ==210) {
                sor10oszlop2= false;
                sor10oszlop2Nev="n";
            }else if (efoldmuvEgymasra ==31) {
                sor1oszlop3= false;
                sor1oszlop3Nev="n";
            }else if (efoldmuvEgymasra ==32) {
                sor2oszlop3= false;
                sor2oszlop3Nev="n";
            }else if (efoldmuvEgymasra ==33) {
                sor3oszlop3= false;
                sor3oszlop3Nev="n";
            }else if (efoldmuvEgymasra ==34) {
                sor4oszlop3= false;
                sor4oszlop3Nev="n";
            }else if (efoldmuvEgymasra ==35) {
                sor5oszlop3= false;
                sor5oszlop3Nev="n";
            }else if (efoldmuvEgymasra ==36) {
                sor6oszlop3= false;
                sor6oszlop3Nev="n";
            }else if (efoldmuvEgymasra ==37) {
                sor7oszlop3= false;
                sor7oszlop3Nev="n";
            }else if (efoldmuvEgymasra ==38) {
                sor8oszlop3= false;
                sor8oszlop3Nev="n";
            }else if (efoldmuvEgymasra ==39) {
                sor9oszlop3= false;
                sor9oszlop3Nev="n";
            }else if (efoldmuvEgymasra ==310) {
                sor10oszlop3= false;
                sor10oszlop3Nev="n";
            }else if (efoldmuvEgymasra ==41) {
                sor1oszlop4= false;
                sor1oszlop4Nev="n";
            }else if (efoldmuvEgymasra ==42) {
                sor2oszlop4= false;
                sor2oszlop4Nev="n";
            }else if (efoldmuvEgymasra ==43) {
                sor3oszlop4= false;
                sor3oszlop4Nev="n";
            }else if (efoldmuvEgymasra ==44) {
                sor4oszlop4= false;
                sor4oszlop4Nev="n";
            }else if (efoldmuvEgymasra ==45) {
                sor5oszlop4= false;
                sor5oszlop4Nev="n";
            }else if (efoldmuvEgymasra ==46) {
                sor6oszlop4= false;
                sor6oszlop4Nev="n";
            }else if (efoldmuvEgymasra ==47) {
                sor7oszlop4= false;
                sor7oszlop4Nev="n";
            }else if (efoldmuvEgymasra ==48) {
                sor8oszlop4= false;
                sor8oszlop4Nev="n";
            }else if (efoldmuvEgymasra ==49) {
                sor9oszlop4= false;
                sor9oszlop4Nev="n";
            }else if (efoldmuvEgymasra ==410) {
                sor10oszlop4= false;
                sor10oszlop4Nev="n";
            }else if (efoldmuvEgymasra ==51) {
                sor1oszlop5= false;
                sor1oszlop5Nev="n";
            }else if (efoldmuvEgymasra ==52) {
                sor2oszlop5= false;
                sor2oszlop5Nev="n";
            }else if (efoldmuvEgymasra ==53) {
                sor3oszlop5= false;
                sor3oszlop5Nev="n";
            }else if (efoldmuvEgymasra ==54) {
                sor4oszlop5= false;
                sor4oszlop5Nev="n";
            }else if (efoldmuvEgymasra ==55) {
                sor5oszlop5= false;
                sor5oszlop5Nev="n";
            }else if (efoldmuvEgymasra ==56) {
                sor6oszlop5= false;
                sor6oszlop5Nev="n";
            }else if (efoldmuvEgymasra ==57) {
                sor7oszlop5= false;
                sor7oszlop5Nev="n";
            }else if (efoldmuvEgymasra ==58) {
                sor8oszlop5= false;
                sor8oszlop5Nev="n";
            }else if (efoldmuvEgymasra ==59) {
                sor9oszlop5= false;
                sor9oszlop5Nev="n";
            }else if (efoldmuvEgymasra ==510) {
                sor10oszlop5= false;
                sor10oszlop5Nev="n";
            }else if (efoldmuvEgymasra ==61) {
                sor1oszlop6= false;
                sor1oszlop6Nev="n";
            }else if (efoldmuvEgymasra ==62) {
                sor2oszlop6= false;
                sor2oszlop6Nev="n";
            }else if (efoldmuvEgymasra ==63) {
                sor3oszlop6= false;
                sor3oszlop6Nev="n";
            }else if (efoldmuvEgymasra ==64) {
                sor4oszlop6= false;
                sor4oszlop6Nev="n";
            }else if (efoldmuvEgymasra ==65) {
                sor5oszlop6= false;
                sor5oszlop6Nev="n";
            }else if (efoldmuvEgymasra ==66) {
                sor6oszlop6= false;
                sor6oszlop6Nev="n";
            }else if (efoldmuvEgymasra ==67) {
                sor7oszlop6= false;
                sor7oszlop6Nev="n";
            }else if (efoldmuvEgymasra ==68) {
                sor8oszlop6= false;
                sor8oszlop6Nev="n";
            }else if (efoldmuvEgymasra ==69) {
                sor9oszlop6= false;
                sor9oszlop6Nev="n";
            }else if (efoldmuvEgymasra ==610) {
                sor10oszlop6= false;
                sor10oszlop6Nev="n";
            }else if (efoldmuvEgymasra ==71) {
                sor1oszlop7= false;
                sor1oszlop7Nev="n";
            }else if (efoldmuvEgymasra ==72) {
                sor2oszlop7= false;
                sor2oszlop7Nev="n";
            }else if (efoldmuvEgymasra ==73) {
                sor3oszlop7= false;
                sor3oszlop7Nev="n";
            }else if (efoldmuvEgymasra ==74) {
                sor4oszlop7= false;
                sor4oszlop7Nev="n";
            }else if (efoldmuvEgymasra ==75) {
                sor5oszlop7= false;
                sor5oszlop7Nev="n";
            }else if (efoldmuvEgymasra ==76) {
                sor6oszlop7= false;
                sor6oszlop7Nev="n";
            }else if (efoldmuvEgymasra ==77) {
                sor7oszlop7= false;
                sor7oszlop7Nev="n";
            }else if (efoldmuvEgymasra ==78) {
                sor8oszlop7= false;
                sor8oszlop7Nev="n";
            }else if (efoldmuvEgymasra ==79) {
                sor9oszlop7= false;
                sor9oszlop7Nev="n";
            }else if (efoldmuvEgymasra ==710) {
                sor10oszlop7= false;
                sor10oszlop7Nev="n";
            }else if (efoldmuvEgymasra ==81) {
                sor1oszlop8= false;
                sor1oszlop8Nev="n";
            }else if (efoldmuvEgymasra ==82) {
                sor2oszlop8= false;
                sor2oszlop8Nev="n";
            }else if (efoldmuvEgymasra ==83) {
                sor3oszlop8= false;
                sor3oszlop8Nev="n";
            }else if (efoldmuvEgymasra ==84) {
                sor4oszlop8= false;
                sor4oszlop8Nev="n";
            }else if (efoldmuvEgymasra ==85) {
                sor5oszlop8= false;
                sor5oszlop8Nev="n";
            }else if (efoldmuvEgymasra ==86) {
                sor6oszlop8= false;
                sor6oszlop8Nev="n";
            }else if (efoldmuvEgymasra ==87) {
                sor7oszlop8= false;
                sor7oszlop8Nev="n";
            }else if (efoldmuvEgymasra ==88) {
                sor8oszlop8= false;
                sor8oszlop8Nev="n";
            }else if (efoldmuvEgymasra ==89) {
                sor9oszlop8= false;
                sor9oszlop8Nev="n";
            }else if (efoldmuvEgymasra ==810) {
                sor10oszlop8= false;
                sor10oszlop8Nev="n";
            }else if (efoldmuvEgymasra ==91) {
                sor1oszlop9= false;
                sor1oszlop9Nev="n";
            }else if (efoldmuvEgymasra ==92) {
                sor2oszlop9= false;
                sor2oszlop9Nev="n";
            }else if (efoldmuvEgymasra ==93) {
                sor3oszlop9= false;
                sor3oszlop9Nev="n";
            }else if (efoldmuvEgymasra ==94) {
                sor4oszlop9= false;
                sor4oszlop9Nev="n";
            }else if (efoldmuvEgymasra ==95) {
                sor5oszlop9= false;
                sor5oszlop9Nev="n";
            }else if (efoldmuvEgymasra ==96) {
                sor6oszlop9= false;
                sor6oszlop9Nev="n";
            }else if (efoldmuvEgymasra ==97) {
                sor7oszlop9= false;
                sor7oszlop9Nev="n";
            }else if (efoldmuvEgymasra ==98) {
                sor8oszlop9= false;
                sor8oszlop9Nev="n";
            }else if (efoldmuvEgymasra ==99) {
                sor9oszlop9= false;
                sor9oszlop9Nev="n";
            }else if (efoldmuvEgymasra ==910) {
                sor10oszlop9= false;
                sor10oszlop9Nev="n";
            }else if (efoldmuvEgymasra ==101) {
                sor1oszlop10= false;
                sor1oszlop10Nev="n";
            }else if (efoldmuvEgymasra ==102) {
                sor2oszlop10= false;
                sor2oszlop10Nev="n";
            }else if (efoldmuvEgymasra ==103) {
                sor3oszlop10= false;
                sor3oszlop10Nev="n";
            }else if (efoldmuvEgymasra ==104) {
                sor4oszlop10= false;
                sor4oszlop10Nev="n";
            }else if (efoldmuvEgymasra ==105) {
                sor5oszlop10= false;
                sor5oszlop10Nev="n";
            }else if (efoldmuvEgymasra ==106) {
                sor6oszlop10= false;
                sor6oszlop10Nev="n";
            }else if (efoldmuvEgymasra ==107) {
                sor7oszlop10= false;
                sor7oszlop10Nev="n";
            }else if (efoldmuvEgymasra ==108) {
                sor8oszlop10= false;
                sor8oszlop10Nev="n";
            }else if (efoldmuvEgymasra ==109) {
                sor9oszlop10= false;
                sor9oszlop10Nev="n";
            }else if (efoldmuvEgymasra ==1010) {
                sor10oszlop10= false;
                sor10oszlop10Nev="n";
            }else if (efoldmuvEgymasra ==111) {
                sor1oszlop11= false;
                sor1oszlop11Nev="n";
            }else if (efoldmuvEgymasra ==112) {
                sor2oszlop11= false;
                sor2oszlop11Nev="n";
            }else if (efoldmuvEgymasra ==113) {
                sor3oszlop11= false;
                sor3oszlop11Nev="n";
            }else if (efoldmuvEgymasra ==114) {
                sor4oszlop11= false;
                sor4oszlop11Nev="n";
            }else if (efoldmuvEgymasra ==115) {
                sor5oszlop11= false;
                sor5oszlop11Nev="n";
            }else if (efoldmuvEgymasra ==116) {
                sor6oszlop11= false;
                sor6oszlop11Nev="n";
            }else if (efoldmuvEgymasra ==117) {
                sor7oszlop11= false;
                sor7oszlop11Nev="n";
            }else if (efoldmuvEgymasra ==118) {
                sor8oszlop11= false;
                sor8oszlop11Nev="n";
            }else if (efoldmuvEgymasra ==119) {
                sor9oszlop11= false;
                sor9oszlop11Nev="n";
            }else if (efoldmuvEgymasra ==1110) {
                sor10oszlop11= false;
                sor10oszlop11Nev="n";
            }else if (efoldmuvEgymasra ==121) {
                sor1oszlop12= false;
                sor1oszlop12Nev="n";
            }else if (efoldmuvEgymasra ==122) {
                sor2oszlop12= false;
                sor2oszlop12Nev="n";
            }else if (efoldmuvEgymasra ==123) {
                sor3oszlop12= false;
                sor3oszlop12Nev="n";
            }else if (efoldmuvEgymasra ==124) {
                sor4oszlop12= false;
                sor4oszlop12Nev="n";
            }else if (efoldmuvEgymasra ==125) {
                sor5oszlop12= false;
                sor5oszlop12Nev="n";
            }else if (efoldmuvEgymasra ==126) {
                sor6oszlop12= false;
                sor6oszlop12Nev="n";
            }else if (efoldmuvEgymasra ==127) {
                sor7oszlop12= false;
                sor7oszlop12Nev="n";
            }else if (efoldmuvEgymasra ==128) {
                sor8oszlop12= false;
                sor8oszlop12Nev="n";
            }else if (efoldmuvEgymasra ==129) {
                sor9oszlop12= false;
                sor9oszlop12Nev="n";
            }else if (efoldmuvEgymasra ==1210) {
                sor10oszlop12= false;
                sor10oszlop12Nev="n";
            }
            efoldmuvEgymasra =poz;

        }else if (eijasEgymasra !=0 && egyseg.equals("eijas") && egrifEgymasra !=poz && eijasEgymasra !=poz && efoldmuvEgymasra !=poz && efegyvEgymasra !=poz && eharcpEgymasra !=poz
                && minoEgymasra !=poz && felderEgymasra !=poz && csontEgymasra !=poz && orgyEgymasra !=poz && raptEgymasra !=poz && eijasEgymasra !=pozJelenlegi  ) {
            if (eijasEgymasra ==11) {
                sor1oszlop1= false;
                sor1oszlop1Nev="n";
            }else if (eijasEgymasra ==12) {
                sor2oszlop1= false;
                sor2oszlop1Nev="n";
            }else if (eijasEgymasra ==13) {
                sor3oszlop1= false;
                sor3oszlop1Nev="n";
            }else if (eijasEgymasra ==14) {
                sor4oszlop1= false;
                sor4oszlop1Nev="n";
            }else if (eijasEgymasra ==15) {
                sor5oszlop1= false;
                sor5oszlop1Nev="n";
            }else if (eijasEgymasra ==16) {
                sor6oszlop1= false;
                sor6oszlop1Nev="n";
            }else if (eijasEgymasra ==17) {
                sor7oszlop1= false;
                sor7oszlop1Nev="n";
            }else if (eijasEgymasra ==18) {
                sor8oszlop1= false;
                sor8oszlop1Nev="n";
            }else if (eijasEgymasra ==19) {
                sor9oszlop1= false;
                sor9oszlop1Nev="n";
            }else if (eijasEgymasra ==110) {
                sor10oszlop1= false;
                sor10oszlop1Nev="n";
            }else if (eijasEgymasra ==21) {
                sor1oszlop2= false;
                sor1oszlop2Nev="n";
            }else if (eijasEgymasra ==22) {
                sor2oszlop2= false;
                sor2oszlop2Nev="n";
            }else if (eijasEgymasra ==23) {
                sor3oszlop2= false;
                sor3oszlop2Nev="n";
            }else if (eijasEgymasra ==24) {
                sor4oszlop2= false;
                sor4oszlop2Nev="n";
            }else if (eijasEgymasra ==25) {
                sor5oszlop2= false;
                sor5oszlop2Nev="n";
            }else if (eijasEgymasra ==26) {
                sor6oszlop2= false;
                sor6oszlop2Nev="n";
            }else if (eijasEgymasra ==27) {
                sor7oszlop2= false;
                sor7oszlop2Nev="n";
            }else if (eijasEgymasra ==28) {
                sor8oszlop2= false;
                sor8oszlop2Nev="n";
            }else if (eijasEgymasra ==29) {
                sor9oszlop2= false;
                sor9oszlop2Nev="n";
            }else if (eijasEgymasra ==210) {
                sor10oszlop2= false;
                sor10oszlop2Nev="n";
            }else if (eijasEgymasra ==31) {
                sor1oszlop3= false;
                sor1oszlop3Nev="n";
            }else if (eijasEgymasra ==32) {
                sor2oszlop3= false;
                sor2oszlop3Nev="n";
            }else if (eijasEgymasra ==33) {
                sor3oszlop3= false;
                sor3oszlop3Nev="n";
            }else if (eijasEgymasra ==34) {
                sor4oszlop3= false;
                sor4oszlop3Nev="n";
            }else if (eijasEgymasra ==35) {
                sor5oszlop3= false;
                sor5oszlop3Nev="n";
            }else if (eijasEgymasra ==36) {
                sor6oszlop3= false;
                sor6oszlop3Nev="n";
            }else if (eijasEgymasra ==37) {
                sor7oszlop3= false;
                sor7oszlop3Nev="n";
            }else if (eijasEgymasra ==38) {
                sor8oszlop3= false;
                sor8oszlop3Nev="n";
            }else if (eijasEgymasra ==39) {
                sor9oszlop3= false;
                sor9oszlop3Nev="n";
            }else if (eijasEgymasra ==310) {
                sor10oszlop3= false;
                sor10oszlop3Nev="n";
            }else if (eijasEgymasra ==41) {
                sor1oszlop4= false;
                sor1oszlop4Nev="n";
            }else if (eijasEgymasra ==42) {
                sor2oszlop4= false;
                sor2oszlop4Nev="n";
            }else if (eijasEgymasra ==43) {
                sor3oszlop4= false;
                sor3oszlop4Nev="n";
            }else if (eijasEgymasra ==44) {
                sor4oszlop4= false;
                sor4oszlop4Nev="n";
            }else if (eijasEgymasra ==45) {
                sor5oszlop4= false;
                sor5oszlop4Nev="n";
            }else if (eijasEgymasra ==46) {
                sor6oszlop4= false;
                sor6oszlop4Nev="n";
            }else if (eijasEgymasra ==47) {
                sor7oszlop4= false;
                sor7oszlop4Nev="n";
            }else if (eijasEgymasra ==48) {
                sor8oszlop4= false;
                sor8oszlop4Nev="n";
            }else if (eijasEgymasra ==49) {
                sor9oszlop4= false;
                sor9oszlop4Nev="n";
            }else if (eijasEgymasra ==410) {
                sor10oszlop4= false;
                sor10oszlop4Nev="n";
            }else if (eijasEgymasra ==51) {
                sor1oszlop5= false;
                sor1oszlop5Nev="n";
            }else if (eijasEgymasra ==52) {
                sor2oszlop5= false;
                sor2oszlop5Nev="n";
            }else if (eijasEgymasra ==53) {
                sor3oszlop5= false;
                sor3oszlop5Nev="n";
            }else if (eijasEgymasra ==54) {
                sor4oszlop5= false;
                sor4oszlop5Nev="n";
            }else if (eijasEgymasra ==55) {
                sor5oszlop5= false;
                sor5oszlop5Nev="n";
            }else if (eijasEgymasra ==56) {
                sor6oszlop5= false;
                sor6oszlop5Nev="n";
            }else if (eijasEgymasra ==57) {
                sor7oszlop5= false;
                sor7oszlop5Nev="n";
            }else if (eijasEgymasra ==58) {
                sor8oszlop5= false;
                sor8oszlop5Nev="n";
            }else if (eijasEgymasra ==59) {
                sor9oszlop5= false;
                sor9oszlop5Nev="n";
            }else if (eijasEgymasra ==510) {
                sor10oszlop5= false;
                sor10oszlop5Nev="n";
            }else if (eijasEgymasra ==61) {
                sor1oszlop6= false;
                sor1oszlop6Nev="n";
            }else if (eijasEgymasra ==62) {
                sor2oszlop6= false;
                sor2oszlop6Nev="n";
            }else if (eijasEgymasra ==63) {
                sor3oszlop6= false;
                sor3oszlop6Nev="n";
            }else if (eijasEgymasra ==64) {
                sor4oszlop6= false;
                sor4oszlop6Nev="n";
            }else if (eijasEgymasra ==65) {
                sor5oszlop6= false;
                sor5oszlop6Nev="n";
            }else if (eijasEgymasra ==66) {
                sor6oszlop6= false;
                sor6oszlop6Nev="n";
            }else if (eijasEgymasra ==67) {
                sor7oszlop6= false;
                sor7oszlop6Nev="n";
            }else if (eijasEgymasra ==68) {
                sor8oszlop6= false;
                sor8oszlop6Nev="n";
            }else if (eijasEgymasra ==69) {
                sor9oszlop6= false;
                sor9oszlop6Nev="n";
            }else if (eijasEgymasra ==610) {
                sor10oszlop6= false;
                sor10oszlop6Nev="n";
            }else if (eijasEgymasra ==71) {
                sor1oszlop7= false;
                sor1oszlop7Nev="n";
            }else if (eijasEgymasra ==72) {
                sor2oszlop7= false;
                sor2oszlop7Nev="n";
            }else if (eijasEgymasra ==73) {
                sor3oszlop7= false;
                sor3oszlop7Nev="n";
            }else if (eijasEgymasra ==74) {
                sor4oszlop7= false;
                sor4oszlop7Nev="n";
            }else if (eijasEgymasra ==75) {
                sor5oszlop7= false;
                sor5oszlop7Nev="n";
            }else if (eijasEgymasra ==76) {
                sor6oszlop7= false;
                sor6oszlop7Nev="n";
            }else if (eijasEgymasra ==77) {
                sor7oszlop7= false;
                sor7oszlop7Nev="n";
            }else if (eijasEgymasra ==78) {
                sor8oszlop7= false;
                sor8oszlop7Nev="n";
            }else if (eijasEgymasra ==79) {
                sor9oszlop7= false;
                sor9oszlop7Nev="n";
            }else if (eijasEgymasra ==710) {
                sor10oszlop7= false;
                sor10oszlop7Nev="n";
            }else if (eijasEgymasra ==81) {
                sor1oszlop8= false;
                sor1oszlop8Nev="n";
            }else if (eijasEgymasra ==82) {
                sor2oszlop8= false;
                sor2oszlop8Nev="n";
            }else if (eijasEgymasra ==83) {
                sor3oszlop8= false;
                sor3oszlop8Nev="n";
            }else if (eijasEgymasra ==84) {
                sor4oszlop8= false;
                sor4oszlop8Nev="n";
            }else if (eijasEgymasra ==85) {
                sor5oszlop8= false;
                sor5oszlop8Nev="n";
            }else if (eijasEgymasra ==86) {
                sor6oszlop8= false;
                sor6oszlop8Nev="n";
            }else if (eijasEgymasra ==87) {
                sor7oszlop8= false;
                sor7oszlop8Nev="n";
            }else if (eijasEgymasra ==88) {
                sor8oszlop8= false;
                sor8oszlop8Nev="n";
            }else if (eijasEgymasra ==89) {
                sor9oszlop8= false;
                sor9oszlop8Nev="n";
            }else if (eijasEgymasra ==810) {
                sor10oszlop8= false;
                sor10oszlop8Nev="n";
            }else if (eijasEgymasra ==91) {
                sor1oszlop9= false;
                sor1oszlop9Nev="n";
            }else if (eijasEgymasra ==92) {
                sor2oszlop9= false;
                sor2oszlop9Nev="n";
            }else if (eijasEgymasra ==93) {
                sor3oszlop9= false;
                sor3oszlop9Nev="n";
            }else if (eijasEgymasra ==94) {
                sor4oszlop9= false;
                sor4oszlop9Nev="n";
            }else if (eijasEgymasra ==95) {
                sor5oszlop9= false;
                sor5oszlop9Nev="n";
            }else if (eijasEgymasra ==96) {
                sor6oszlop9= false;
                sor6oszlop9Nev="n";
            }else if (eijasEgymasra ==97) {
                sor7oszlop9= false;
                sor7oszlop9Nev="n";
            }else if (eijasEgymasra ==98) {
                sor8oszlop9= false;
                sor8oszlop9Nev="n";
            }else if (eijasEgymasra ==99) {
                sor9oszlop9= false;
                sor9oszlop9Nev="n";
            }else if (eijasEgymasra ==910) {
                sor10oszlop9= false;
                sor10oszlop9Nev="n";
            }else if (eijasEgymasra ==101) {
                sor1oszlop10= false;
                sor1oszlop10Nev="n";
            }else if (eijasEgymasra ==102) {
                sor2oszlop10= false;
                sor2oszlop10Nev="n";
            }else if (eijasEgymasra ==103) {
                sor3oszlop10= false;
                sor3oszlop10Nev="n";
            }else if (eijasEgymasra ==104) {
                sor4oszlop10= false;
                sor4oszlop10Nev="n";
            }else if (eijasEgymasra ==105) {
                sor5oszlop10= false;
                sor5oszlop10Nev="n";
            }else if (eijasEgymasra ==106) {
                sor6oszlop10= false;
                sor6oszlop10Nev="n";
            }else if (eijasEgymasra ==107) {
                sor7oszlop10= false;
                sor7oszlop10Nev="n";
            }else if (eijasEgymasra ==108) {
                sor8oszlop10= false;
                sor8oszlop10Nev="n";
            }else if (eijasEgymasra ==109) {
                sor9oszlop10= false;
                sor9oszlop10Nev="n";
            }else if (eijasEgymasra ==1010) {
                sor10oszlop10= false;
                sor10oszlop10Nev="n";
            }else if (eijasEgymasra ==111) {
                sor1oszlop11= false;
                sor1oszlop11Nev="n";
            }else if (eijasEgymasra ==112) {
                sor2oszlop11= false;
                sor2oszlop11Nev="n";
            }else if (eijasEgymasra ==113) {
                sor3oszlop11= false;
                sor3oszlop11Nev="n";
            }else if (eijasEgymasra ==114) {
                sor4oszlop11= false;
                sor4oszlop11Nev="n";
            }else if (eijasEgymasra ==115) {
                sor5oszlop11= false;
                sor5oszlop11Nev="n";
            }else if (eijasEgymasra ==116) {
                sor6oszlop11= false;
                sor6oszlop11Nev="n";
            }else if (eijasEgymasra ==117) {
                sor7oszlop11= false;
                sor7oszlop11Nev="n";
            }else if (eijasEgymasra ==118) {
                sor8oszlop11= false;
                sor8oszlop11Nev="n";
            }else if (eijasEgymasra ==119) {
                sor9oszlop11= false;
                sor9oszlop11Nev="n";
            }else if (eijasEgymasra ==1110) {
                sor10oszlop11= false;
                sor10oszlop11Nev="n";
            }else if (eijasEgymasra ==121) {
                sor1oszlop12= false;
                sor1oszlop12Nev="n";
            }else if (eijasEgymasra ==122) {
                sor2oszlop12= false;
                sor2oszlop12Nev="n";
            }else if (eijasEgymasra ==123) {
                sor3oszlop12= false;
                sor3oszlop12Nev="n";
            }else if (eijasEgymasra ==124) {
                sor4oszlop12= false;
                sor4oszlop12Nev="n";
            }else if (eijasEgymasra ==125) {
                sor5oszlop12= false;
                sor5oszlop12Nev="n";
            }else if (eijasEgymasra ==126) {
                sor6oszlop12= false;
                sor6oszlop12Nev="n";
            }else if (eijasEgymasra ==127) {
                sor7oszlop12= false;
                sor7oszlop12Nev="n";
            }else if (eijasEgymasra ==128) {
                sor8oszlop12= false;
                sor8oszlop12Nev="n";
            }else if (eijasEgymasra ==129) {
                sor9oszlop12= false;
                sor9oszlop12Nev="n";
            }else if (eijasEgymasra ==1210) {
                sor10oszlop12= false;
                sor10oszlop12Nev="n";
            }
            eijasEgymasra =poz;

        }else if ( efelderEgymasra !=0 && egyseg.equals("efelder") && eminoEgymasra !=poz && efelderEgymasra !=poz && ecsontEgymasra !=poz && eorgyEgymasra !=poz && eraptEgymasra !=poz
                && grifEgymasra !=poz && ijasEgymasra !=poz && foldmuvEgymasra !=poz && fegyvEgymasra !=poz && harcpEgymasra !=poz && efelderEgymasra !=pozJelenlegi  ) {
            if (efelderEgymasra ==11) {
                sor1oszlop1= false;
                sor1oszlop1Nev="n";
            }else if (efelderEgymasra ==12) {
                sor2oszlop1= false;
                sor2oszlop1Nev="n";
            }else if (efelderEgymasra ==13) {
                sor3oszlop1= false;
                sor3oszlop1Nev="n";
            }else if (efelderEgymasra ==14) {
                sor4oszlop1= false;
                sor4oszlop1Nev="n";
            }else if (efelderEgymasra ==15) {
                sor5oszlop1= false;
                sor5oszlop1Nev="n";
            }else if (efelderEgymasra ==16) {
                sor6oszlop1= false;
                sor6oszlop1Nev="n";
            }else if (efelderEgymasra ==17) {
                sor7oszlop1= false;
                sor7oszlop1Nev="n";
            }else if (efelderEgymasra ==18) {
                sor8oszlop1= false;
                sor8oszlop1Nev="n";
            }else if (efelderEgymasra ==19) {
                sor9oszlop1= false;
                sor9oszlop1Nev="n";
            }else if (efelderEgymasra ==110) {
                sor10oszlop1= false;
                sor10oszlop1Nev="n";
            }else if (efelderEgymasra ==21) {
                sor1oszlop2= false;
                sor1oszlop2Nev="n";
            }else if (efelderEgymasra ==22) {
                sor2oszlop2= false;
                sor2oszlop2Nev="n";
            }else if (efelderEgymasra ==23) {
                sor3oszlop2= false;
                sor3oszlop2Nev="n";
            }else if (efelderEgymasra ==24) {
                sor4oszlop2= false;
                sor4oszlop2Nev="n";
            }else if (efelderEgymasra ==25) {
                sor5oszlop2= false;
                sor5oszlop2Nev="n";
            }else if (efelderEgymasra ==26) {
                sor6oszlop2= false;
                sor6oszlop2Nev="n";
            }else if (efelderEgymasra ==27) {
                sor7oszlop2= false;
                sor7oszlop2Nev="n";
            }else if (efelderEgymasra ==28) {
                sor8oszlop2= false;
                sor8oszlop2Nev="n";
            }else if (efelderEgymasra ==29) {
                sor9oszlop2= false;
                sor9oszlop2Nev="n";
            }else if (efelderEgymasra ==210) {
                sor10oszlop2= false;
                sor10oszlop2Nev="n";
            }else if (efelderEgymasra ==31) {
                sor1oszlop3= false;
                sor1oszlop3Nev="n";
            }else if (efelderEgymasra ==32) {
                sor2oszlop3= false;
                sor2oszlop3Nev="n";
            }else if (efelderEgymasra ==33) {
                sor3oszlop3= false;
                sor3oszlop3Nev="n";
            }else if (efelderEgymasra ==34) {
                sor4oszlop3= false;
                sor4oszlop3Nev="n";
            }else if (efelderEgymasra ==35) {
                sor5oszlop3= false;
                sor5oszlop3Nev="n";
            }else if (efelderEgymasra ==36) {
                sor6oszlop3= false;
                sor6oszlop3Nev="n";
            }else if (efelderEgymasra ==37) {
                sor7oszlop3= false;
                sor7oszlop3Nev="n";
            }else if (efelderEgymasra ==38) {
                sor8oszlop3= false;
                sor8oszlop3Nev="n";
            }else if (efelderEgymasra ==39) {
                sor9oszlop3= false;
                sor9oszlop3Nev="n";
            }else if (efelderEgymasra ==310) {
                sor10oszlop3= false;
                sor10oszlop3Nev="n";
            }else if (efelderEgymasra ==41) {
                sor1oszlop4= false;
                sor1oszlop4Nev="n";
            }else if (efelderEgymasra ==42) {
                sor2oszlop4= false;
                sor2oszlop4Nev="n";
            }else if (efelderEgymasra ==43) {
                sor3oszlop4= false;
                sor3oszlop4Nev="n";
            }else if (efelderEgymasra ==44) {
                sor4oszlop4= false;
                sor4oszlop4Nev="n";
            }else if (efelderEgymasra ==45) {
                sor5oszlop4= false;
                sor5oszlop4Nev="n";
            }else if (efelderEgymasra ==46) {
                sor6oszlop4= false;
                sor6oszlop4Nev="n";
            }else if (efelderEgymasra ==47) {
                sor7oszlop4= false;
                sor7oszlop4Nev="n";
            }else if (efelderEgymasra ==48) {
                sor8oszlop4= false;
                sor8oszlop4Nev="n";
            }else if (efelderEgymasra ==49) {
                sor9oszlop4= false;
                sor9oszlop4Nev="n";
            }else if (efelderEgymasra ==410) {
                sor10oszlop4= false;
                sor10oszlop4Nev="n";
            }else if (efelderEgymasra ==51) {
                sor1oszlop5= false;
                sor1oszlop5Nev="n";
            }else if (efelderEgymasra ==52) {
                sor2oszlop5= false;
                sor2oszlop5Nev="n";
            }else if (efelderEgymasra ==53) {
                sor3oszlop5= false;
                sor3oszlop5Nev="n";
            }else if (efelderEgymasra ==54) {
                sor4oszlop5= false;
                sor4oszlop5Nev="n";
            }else if (efelderEgymasra ==55) {
                sor5oszlop5= false;
                sor5oszlop5Nev="n";
            }else if (efelderEgymasra ==56) {
                sor6oszlop5= false;
                sor6oszlop5Nev="n";
            }else if (efelderEgymasra ==57) {
                sor7oszlop5= false;
                sor7oszlop5Nev="n";
            }else if (efelderEgymasra ==58) {
                sor8oszlop5= false;
                sor8oszlop5Nev="n";
            }else if (efelderEgymasra ==59) {
                sor9oszlop5= false;
                sor9oszlop5Nev="n";
            }else if (efelderEgymasra ==510) {
                sor10oszlop5= false;
                sor10oszlop5Nev="n";
            }else if (efelderEgymasra ==61) {
                sor1oszlop6= false;
                sor1oszlop6Nev="n";
            }else if (efelderEgymasra ==62) {
                sor2oszlop6= false;
                sor2oszlop6Nev="n";
            }else if (efelderEgymasra ==63) {
                sor3oszlop6= false;
                sor3oszlop6Nev="n";
            }else if (efelderEgymasra ==64) {
                sor4oszlop6= false;
                sor4oszlop6Nev="n";
            }else if (efelderEgymasra ==65) {
                sor5oszlop6= false;
                sor5oszlop6Nev="n";
            }else if (efelderEgymasra ==66) {
                sor6oszlop6= false;
                sor6oszlop6Nev="n";
            }else if (efelderEgymasra ==67) {
                sor7oszlop6= false;
                sor7oszlop6Nev="n";
            }else if (efelderEgymasra ==68) {
                sor8oszlop6= false;
                sor8oszlop6Nev="n";
            }else if (efelderEgymasra ==69) {
                sor9oszlop6= false;
                sor9oszlop6Nev="n";
            }else if (efelderEgymasra ==610) {
                sor10oszlop6= false;
                sor10oszlop6Nev="n";
            }else if (efelderEgymasra ==71) {
                sor1oszlop7= false;
                sor1oszlop7Nev="n";
            }else if (efelderEgymasra ==72) {
                sor2oszlop7= false;
                sor2oszlop7Nev="n";
            }else if (efelderEgymasra ==73) {
                sor3oszlop7= false;
                sor3oszlop7Nev="n";
            }else if (efelderEgymasra ==74) {
                sor4oszlop7= false;
                sor4oszlop7Nev="n";
            }else if (efelderEgymasra ==75) {
                sor5oszlop7= false;
                sor5oszlop7Nev="n";
            }else if (efelderEgymasra ==76) {
                sor6oszlop7= false;
                sor6oszlop7Nev="n";
            }else if (efelderEgymasra ==77) {
                sor7oszlop7= false;
                sor7oszlop7Nev="n";
            }else if (efelderEgymasra ==78) {
                sor8oszlop7= false;
                sor8oszlop7Nev="n";
            }else if (efelderEgymasra ==79) {
                sor9oszlop7= false;
                sor9oszlop7Nev="n";
            }else if (efelderEgymasra ==710) {
                sor10oszlop7= false;
                sor10oszlop7Nev="n";
            }else if (efelderEgymasra ==81) {
                sor1oszlop8= false;
                sor1oszlop8Nev="n";
            }else if (efelderEgymasra ==82) {
                sor2oszlop8= false;
                sor2oszlop8Nev="n";
            }else if (efelderEgymasra ==83) {
                sor3oszlop8= false;
                sor3oszlop8Nev="n";
            }else if (efelderEgymasra ==84) {
                sor4oszlop8= false;
                sor4oszlop8Nev="n";
            }else if (efelderEgymasra ==85) {
                sor5oszlop8= false;
                sor5oszlop8Nev="n";
            }else if (efelderEgymasra ==86) {
                sor6oszlop8= false;
                sor6oszlop8Nev="n";
            }else if (efelderEgymasra ==87) {
                sor7oszlop8= false;
                sor7oszlop8Nev="n";
            }else if (efelderEgymasra ==88) {
                sor8oszlop8= false;
                sor8oszlop8Nev="n";
            }else if (efelderEgymasra ==89) {
                sor9oszlop8= false;
                sor9oszlop8Nev="n";
            }else if (efelderEgymasra ==810) {
                sor10oszlop8= false;
                sor10oszlop8Nev="n";
            }else if (efelderEgymasra ==91) {
                sor1oszlop9= false;
                sor1oszlop9Nev="n";
            }else if (efelderEgymasra ==92) {
                sor2oszlop9= false;
                sor2oszlop9Nev="n";
            }else if (efelderEgymasra ==93) {
                sor3oszlop9= false;
                sor3oszlop9Nev="n";
            }else if (efelderEgymasra ==94) {
                sor4oszlop9= false;
                sor4oszlop9Nev="n";
            }else if (efelderEgymasra ==95) {
                sor5oszlop9= false;
                sor5oszlop9Nev="n";
            }else if (efelderEgymasra ==96) {
                sor6oszlop9= false;
                sor6oszlop9Nev="n";
            }else if (efelderEgymasra ==97) {
                sor7oszlop9= false;
                sor7oszlop9Nev="n";
            }else if (efelderEgymasra ==98) {
                sor8oszlop9= false;
                sor8oszlop9Nev="n";
            }else if (efelderEgymasra ==99) {
                sor9oszlop9= false;
                sor9oszlop9Nev="n";
            }else if (efelderEgymasra ==910) {
                sor10oszlop9= false;
                sor10oszlop9Nev="n";
            }else if (efelderEgymasra ==101) {
                sor1oszlop10= false;
                sor1oszlop10Nev="n";
            }else if (efelderEgymasra ==102) {
                sor2oszlop10= false;
                sor2oszlop10Nev="n";
            }else if (efelderEgymasra ==103) {
                sor3oszlop10= false;
                sor3oszlop10Nev="n";
            }else if (efelderEgymasra ==104) {
                sor4oszlop10= false;
                sor4oszlop10Nev="n";
            }else if (efelderEgymasra ==105) {
                sor5oszlop10= false;
                sor5oszlop10Nev="n";
            }else if (efelderEgymasra ==106) {
                sor6oszlop10= false;
                sor6oszlop10Nev="n";
            }else if (efelderEgymasra ==107) {
                sor7oszlop10= false;
                sor7oszlop10Nev="n";
            }else if (efelderEgymasra ==108) {
                sor8oszlop10= false;
                sor8oszlop10Nev="n";
            }else if (efelderEgymasra ==109) {
                sor9oszlop10= false;
                sor9oszlop10Nev="n";
            }else if (efelderEgymasra ==1010) {
                sor10oszlop10= false;
                sor10oszlop10Nev="n";
            }else if (efelderEgymasra ==111) {
                sor1oszlop11= false;
                sor1oszlop11Nev="n";
            }else if (efelderEgymasra ==112) {
                sor2oszlop11= false;
                sor2oszlop11Nev="n";
            }else if (efelderEgymasra ==113) {
                sor3oszlop11= false;
                sor3oszlop11Nev="n";
            }else if (efelderEgymasra ==114) {
                sor4oszlop11= false;
                sor4oszlop11Nev="n";
            }else if (efelderEgymasra ==115) {
                sor5oszlop11= false;
                sor5oszlop11Nev="n";
            }else if (efelderEgymasra ==116) {
                sor6oszlop11= false;
                sor6oszlop11Nev="n";
            }else if (efelderEgymasra ==117) {
                sor7oszlop11= false;
                sor7oszlop11Nev="n";
            }else if (efelderEgymasra ==118) {
                sor8oszlop11= false;
                sor8oszlop11Nev="n";
            }else if (efelderEgymasra ==119) {
                sor9oszlop11= false;
                sor9oszlop11Nev="n";
            }else if (efelderEgymasra ==1110) {
                sor10oszlop11= false;
                sor10oszlop11Nev="n";
            }else if (efelderEgymasra ==121) {
                sor1oszlop12= false;
                sor1oszlop12Nev="n";
            }else if (efelderEgymasra ==122) {
                sor2oszlop12= false;
                sor2oszlop12Nev="n";
            }else if (efelderEgymasra ==123) {
                sor3oszlop12= false;
                sor3oszlop12Nev="n";
            }else if (efelderEgymasra ==124) {
                sor4oszlop12= false;
                sor4oszlop12Nev="n";
            }else if (efelderEgymasra ==125) {
                sor5oszlop12= false;
                sor5oszlop12Nev="n";
            }else if (efelderEgymasra ==126) {
                sor6oszlop12= false;
                sor6oszlop12Nev="n";
            }else if (efelderEgymasra ==127) {
                sor7oszlop12= false;
                sor7oszlop12Nev="n";
            }else if (efelderEgymasra ==128) {
                sor8oszlop12= false;
                sor8oszlop12Nev="n";
            }else if (efelderEgymasra ==129) {
                sor9oszlop12= false;
                sor9oszlop12Nev="n";
            }else if (efelderEgymasra ==1210) {
                sor10oszlop12= false;
                sor10oszlop12Nev="n";
            }
            efelderEgymasra =poz;

        }else if ( egrifEgymasra !=0 && egyseg.equals("egrif") && egrifEgymasra !=poz && eijasEgymasra !=poz && efoldmuvEgymasra !=poz && efegyvEgymasra !=poz && eharcpEgymasra !=poz
                && minoEgymasra !=poz && felderEgymasra !=poz && csontEgymasra !=poz && orgyEgymasra !=poz && raptEgymasra !=poz && egrifEgymasra !=pozJelenlegi  ) {
            if (egrifEgymasra ==11) {
                sor1oszlop1= false;
                sor1oszlop1Nev="n";
            }else if (egrifEgymasra ==12) {
                sor2oszlop1= false;
                sor2oszlop1Nev="n";
            }else if (egrifEgymasra ==13) {
                sor3oszlop1= false;
                sor3oszlop1Nev="n";
            }else if (egrifEgymasra ==14) {
                sor4oszlop1= false;
                sor4oszlop1Nev="n";
            }else if (egrifEgymasra ==15) {
                sor5oszlop1= false;
                sor5oszlop1Nev="n";
            }else if (egrifEgymasra ==16) {
                sor6oszlop1= false;
                sor6oszlop1Nev="n";
            }else if (egrifEgymasra ==17) {
                sor7oszlop1= false;
                sor7oszlop1Nev="n";
            }else if (egrifEgymasra ==18) {
                sor8oszlop1= false;
                sor8oszlop1Nev="n";
            }else if (egrifEgymasra ==19) {
                sor9oszlop1= false;
                sor9oszlop1Nev="n";
            }else if (egrifEgymasra ==110) {
                sor10oszlop1= false;
                sor10oszlop1Nev="n";
            }else if (egrifEgymasra ==21) {
                sor1oszlop2= false;
                sor1oszlop2Nev="n";
            }else if (egrifEgymasra ==22) {
                sor2oszlop2= false;
                sor2oszlop2Nev="n";
            }else if (egrifEgymasra ==23) {
                sor3oszlop2= false;
                sor3oszlop2Nev="n";
            }else if (egrifEgymasra ==24) {
                sor4oszlop2= false;
                sor4oszlop2Nev="n";
            }else if (egrifEgymasra ==25) {
                sor5oszlop2= false;
                sor5oszlop2Nev="n";
            }else if (egrifEgymasra ==26) {
                sor6oszlop2= false;
                sor6oszlop2Nev="n";
            }else if (egrifEgymasra ==27) {
                sor7oszlop2= false;
                sor7oszlop2Nev="n";
            }else if (egrifEgymasra ==28) {
                sor8oszlop2= false;
                sor8oszlop2Nev="n";
            }else if (egrifEgymasra ==29) {
                sor9oszlop2= false;
                sor9oszlop2Nev="n";
            }else if (egrifEgymasra ==210) {
                sor10oszlop2= false;
                sor10oszlop2Nev="n";
            }else if (egrifEgymasra ==31) {
                sor1oszlop3= false;
                sor1oszlop3Nev="n";
            }else if (egrifEgymasra ==32) {
                sor2oszlop3= false;
                sor2oszlop3Nev="n";
            }else if (egrifEgymasra ==33) {
                sor3oszlop3= false;
                sor3oszlop3Nev="n";
            }else if (egrifEgymasra ==34) {
                sor4oszlop3= false;
                sor4oszlop3Nev="n";
            }else if (egrifEgymasra ==35) {
                sor5oszlop3= false;
                sor5oszlop3Nev="n";
            }else if (egrifEgymasra ==36) {
                sor6oszlop3= false;
                sor6oszlop3Nev="n";
            }else if (egrifEgymasra ==37) {
                sor7oszlop3= false;
                sor7oszlop3Nev="n";
            }else if (egrifEgymasra ==38) {
                sor8oszlop3= false;
                sor8oszlop3Nev="n";
            }else if (egrifEgymasra ==39) {
                sor9oszlop3= false;
                sor9oszlop3Nev="n";
            }else if (egrifEgymasra ==310) {
                sor10oszlop3= false;
                sor10oszlop3Nev="n";
            }else if (egrifEgymasra ==41) {
                sor1oszlop4= false;
                sor1oszlop4Nev="n";
            }else if (egrifEgymasra ==42) {
                sor2oszlop4= false;
                sor2oszlop4Nev="n";
            }else if (egrifEgymasra ==43) {
                sor3oszlop4= false;
                sor3oszlop4Nev="n";
            }else if (egrifEgymasra ==44) {
                sor4oszlop4= false;
                sor4oszlop4Nev="n";
            }else if (egrifEgymasra ==45) {
                sor5oszlop4= false;
                sor5oszlop4Nev="n";
            }else if (egrifEgymasra ==46) {
                sor6oszlop4= false;
                sor6oszlop4Nev="n";
            }else if (egrifEgymasra ==47) {
                sor7oszlop4= false;
                sor7oszlop4Nev="n";
            }else if (egrifEgymasra ==48) {
                sor8oszlop4= false;
                sor8oszlop4Nev="n";
            }else if (egrifEgymasra ==49) {
                sor9oszlop4= false;
                sor9oszlop4Nev="n";
            }else if (egrifEgymasra ==410) {
                sor10oszlop4= false;
                sor10oszlop4Nev="n";
            }else if (egrifEgymasra ==51) {
                sor1oszlop5= false;
                sor1oszlop5Nev="n";
            }else if (egrifEgymasra ==52) {
                sor2oszlop5= false;
                sor2oszlop5Nev="n";
            }else if (egrifEgymasra ==53) {
                sor3oszlop5= false;
                sor3oszlop5Nev="n";
            }else if (egrifEgymasra ==54) {
                sor4oszlop5= false;
                sor4oszlop5Nev="n";
            }else if (egrifEgymasra ==55) {
                sor5oszlop5= false;
                sor5oszlop5Nev="n";
            }else if (egrifEgymasra ==56) {
                sor6oszlop5= false;
                sor6oszlop5Nev="n";
            }else if (egrifEgymasra ==57) {
                sor7oszlop5= false;
                sor7oszlop5Nev="n";
            }else if (egrifEgymasra ==58) {
                sor8oszlop5= false;
                sor8oszlop5Nev="n";
            }else if (egrifEgymasra ==59) {
                sor9oszlop5= false;
                sor9oszlop5Nev="n";
            }else if (egrifEgymasra ==510) {
                sor10oszlop5= false;
                sor10oszlop5Nev="n";
            }else if (egrifEgymasra ==61) {
                sor1oszlop6= false;
                sor1oszlop6Nev="n";
            }else if (egrifEgymasra ==62) {
                sor2oszlop6= false;
                sor2oszlop6Nev="n";
            }else if (egrifEgymasra ==63) {
                sor3oszlop6= false;
                sor3oszlop6Nev="n";
            }else if (egrifEgymasra ==64) {
                sor4oszlop6= false;
                sor4oszlop6Nev="n";
            }else if (egrifEgymasra ==65) {
                sor5oszlop6= false;
                sor5oszlop6Nev="n";
            }else if (egrifEgymasra ==66) {
                sor6oszlop6= false;
                sor6oszlop6Nev="n";
            }else if (egrifEgymasra ==67) {
                sor7oszlop6= false;
                sor7oszlop6Nev="n";
            }else if (egrifEgymasra ==68) {
                sor8oszlop6= false;
                sor8oszlop6Nev="n";
            }else if (egrifEgymasra ==69) {
                sor9oszlop6= false;
                sor9oszlop6Nev="n";
            }else if (egrifEgymasra ==610) {
                sor10oszlop6= false;
                sor10oszlop6Nev="n";
            }else if (egrifEgymasra ==71) {
                sor1oszlop7= false;
                sor1oszlop7Nev="n";
            }else if (egrifEgymasra ==72) {
                sor2oszlop7= false;
                sor2oszlop7Nev="n";
            }else if (egrifEgymasra ==73) {
                sor3oszlop7= false;
                sor3oszlop7Nev="n";
            }else if (egrifEgymasra ==74) {
                sor4oszlop7= false;
                sor4oszlop7Nev="n";
            }else if (egrifEgymasra ==75) {
                sor5oszlop7= false;
                sor5oszlop7Nev="n";
            }else if (egrifEgymasra ==76) {
                sor6oszlop7= false;
                sor6oszlop7Nev="n";
            }else if (egrifEgymasra ==77) {
                sor7oszlop7= false;
                sor7oszlop7Nev="n";
            }else if (egrifEgymasra ==78) {
                sor8oszlop7= false;
                sor8oszlop7Nev="n";
            }else if (egrifEgymasra ==79) {
                sor9oszlop7= false;
                sor9oszlop7Nev="n";
            }else if (egrifEgymasra ==710) {
                sor10oszlop7= false;
                sor10oszlop7Nev="n";
            }else if (egrifEgymasra ==81) {
                sor1oszlop8= false;
                sor1oszlop8Nev="n";
            }else if (egrifEgymasra ==82) {
                sor2oszlop8= false;
                sor2oszlop8Nev="n";
            }else if (egrifEgymasra ==83) {
                sor3oszlop8= false;
                sor3oszlop8Nev="n";
            }else if (egrifEgymasra ==84) {
                sor4oszlop8= false;
                sor4oszlop8Nev="n";
            }else if (egrifEgymasra ==85) {
                sor5oszlop8= false;
                sor5oszlop8Nev="n";
            }else if (egrifEgymasra ==86) {
                sor6oszlop8= false;
                sor6oszlop8Nev="n";
            }else if (egrifEgymasra ==87) {
                sor7oszlop8= false;
                sor7oszlop8Nev="n";
            }else if (egrifEgymasra ==88) {
                sor8oszlop8= false;
                sor8oszlop8Nev="n";
            }else if (egrifEgymasra ==89) {
                sor9oszlop8= false;
                sor9oszlop8Nev="n";
            }else if (egrifEgymasra ==810) {
                sor10oszlop8= false;
                sor10oszlop8Nev="n";
            }else if (egrifEgymasra ==91) {
                sor1oszlop9= false;
                sor1oszlop9Nev="n";
            }else if (egrifEgymasra ==92) {
                sor2oszlop9= false;
                sor2oszlop9Nev="n";
            }else if (egrifEgymasra ==93) {
                sor3oszlop9= false;
                sor3oszlop9Nev="n";
            }else if (egrifEgymasra ==94) {
                sor4oszlop9= false;
                sor4oszlop9Nev="n";
            }else if (egrifEgymasra ==95) {
                sor5oszlop9= false;
                sor5oszlop9Nev="n";
            }else if (egrifEgymasra ==96) {
                sor6oszlop9= false;
                sor6oszlop9Nev="n";
            }else if (egrifEgymasra ==97) {
                sor7oszlop9= false;
                sor7oszlop9Nev="n";
            }else if (egrifEgymasra ==98) {
                sor8oszlop9= false;
                sor8oszlop9Nev="n";
            }else if (egrifEgymasra ==99) {
                sor9oszlop9= false;
                sor9oszlop9Nev="n";
            }else if (egrifEgymasra ==910) {
                sor10oszlop9= false;
                sor10oszlop9Nev="n";
            }else if (egrifEgymasra ==101) {
                sor1oszlop10= false;
                sor1oszlop10Nev="n";
            }else if (egrifEgymasra ==102) {
                sor2oszlop10= false;
                sor2oszlop10Nev="n";
            }else if (egrifEgymasra ==103) {
                sor3oszlop10= false;
                sor3oszlop10Nev="n";
            }else if (egrifEgymasra ==104) {
                sor4oszlop10= false;
                sor4oszlop10Nev="n";
            }else if (egrifEgymasra ==105) {
                sor5oszlop10= false;
                sor5oszlop10Nev="n";
            }else if (egrifEgymasra ==106) {
                sor6oszlop10= false;
                sor6oszlop10Nev="n";
            }else if (egrifEgymasra ==107) {
                sor7oszlop10= false;
                sor7oszlop10Nev="n";
            }else if (egrifEgymasra ==108) {
                sor8oszlop10= false;
                sor8oszlop10Nev="n";
            }else if (egrifEgymasra ==109) {
                sor9oszlop10= false;
                sor9oszlop10Nev="n";
            }else if (egrifEgymasra ==1010) {
                sor10oszlop10= false;
                sor10oszlop10Nev="n";
            }else if (egrifEgymasra ==111) {
                sor1oszlop11= false;
                sor1oszlop11Nev="n";
            }else if (egrifEgymasra ==112) {
                sor2oszlop11= false;
                sor2oszlop11Nev="n";
            }else if (egrifEgymasra ==113) {
                sor3oszlop11= false;
                sor3oszlop11Nev="n";
            }else if (egrifEgymasra ==114) {
                sor4oszlop11= false;
                sor4oszlop11Nev="n";
            }else if (egrifEgymasra ==115) {
                sor5oszlop11= false;
                sor5oszlop11Nev="n";
            }else if (egrifEgymasra ==116) {
                sor6oszlop11= false;
                sor6oszlop11Nev="n";
            }else if (egrifEgymasra ==117) {
                sor7oszlop11= false;
                sor7oszlop11Nev="n";
            }else if (egrifEgymasra ==118) {
                sor8oszlop11= false;
                sor8oszlop11Nev="n";
            }else if (egrifEgymasra ==119) {
                sor9oszlop11= false;
                sor9oszlop11Nev="n";
            }else if (egrifEgymasra ==1110) {
                sor10oszlop11= false;
                sor10oszlop11Nev="n";
            }else if (egrifEgymasra ==121) {
                sor1oszlop12= false;
                sor1oszlop12Nev="n";
            }else if (egrifEgymasra ==122) {
                sor2oszlop12= false;
                sor2oszlop12Nev="n";
            }else if (egrifEgymasra ==123) {
                sor3oszlop12= false;
                sor3oszlop12Nev="n";
            }else if (egrifEgymasra ==124) {
                sor4oszlop12= false;
                sor4oszlop12Nev="n";
            }else if (egrifEgymasra ==125) {
                sor5oszlop12= false;
                sor5oszlop12Nev="n";
            }else if (egrifEgymasra ==126) {
                sor6oszlop12= false;
                sor6oszlop12Nev="n";
            }else if (egrifEgymasra ==127) {
                sor7oszlop12= false;
                sor7oszlop12Nev="n";
            }else if (egrifEgymasra ==128) {
                sor8oszlop12= false;
                sor8oszlop12Nev="n";
            }else if (egrifEgymasra ==129) {
                sor9oszlop12= false;
                sor9oszlop12Nev="n";
            }else if (egrifEgymasra ==1210) {
                sor10oszlop12= false;
                sor10oszlop12Nev="n";
            }
            egrifEgymasra =poz;

        }else if ( efegyvEgymasra !=0 && egyseg.equals("efegyv") && egrifEgymasra !=poz && eijasEgymasra !=poz && efoldmuvEgymasra !=poz && efegyvEgymasra !=poz && eharcpEgymasra !=poz
                && minoEgymasra !=poz && felderEgymasra !=poz && csontEgymasra !=poz && orgyEgymasra !=poz && raptEgymasra !=poz && efegyvEgymasra !=pozJelenlegi  ) {
            if (efegyvEgymasra ==11) {
                sor1oszlop1= false;
                sor1oszlop1Nev="n";
            }else if (efegyvEgymasra ==12) {
                sor2oszlop1= false;
                sor2oszlop1Nev="n";
            }else if (efegyvEgymasra ==13) {
                sor3oszlop1= false;
                sor3oszlop1Nev="n";
            }else if (efegyvEgymasra ==14) {
                sor4oszlop1= false;
                sor4oszlop1Nev="n";
            }else if (efegyvEgymasra ==15) {
                sor5oszlop1= false;
                sor5oszlop1Nev="n";
            }else if (efegyvEgymasra ==16) {
                sor6oszlop1= false;
                sor6oszlop1Nev="n";
            }else if (efegyvEgymasra ==17) {
                sor7oszlop1= false;
                sor7oszlop1Nev="n";
            }else if (efegyvEgymasra ==18) {
                sor8oszlop1= false;
                sor8oszlop1Nev="n";
            }else if (efegyvEgymasra ==19) {
                sor9oszlop1= false;
                sor9oszlop1Nev="n";
            }else if (efegyvEgymasra ==110) {
                sor10oszlop1= false;
                sor10oszlop1Nev="n";
            }else if (efegyvEgymasra ==21) {
                sor1oszlop2= false;
                sor1oszlop2Nev="n";
            }else if (efegyvEgymasra ==22) {
                sor2oszlop2= false;
                sor2oszlop2Nev="n";
            }else if (efegyvEgymasra ==23) {
                sor3oszlop2= false;
                sor3oszlop2Nev="n";
            }else if (efegyvEgymasra ==24) {
                sor4oszlop2= false;
                sor4oszlop2Nev="n";
            }else if (efegyvEgymasra ==25) {
                sor5oszlop2= false;
                sor5oszlop2Nev="n";
            }else if (efegyvEgymasra ==26) {
                sor6oszlop2= false;
                sor6oszlop2Nev="n";
            }else if (efegyvEgymasra ==27) {
                sor7oszlop2= false;
                sor7oszlop2Nev="n";
            }else if (efegyvEgymasra ==28) {
                sor8oszlop2= false;
                sor8oszlop2Nev="n";
            }else if (efegyvEgymasra ==29) {
                sor9oszlop2= false;
                sor9oszlop2Nev="n";
            }else if (efegyvEgymasra ==210) {
                sor10oszlop2= false;
                sor10oszlop2Nev="n";
            }else if (efegyvEgymasra ==31) {
                sor1oszlop3= false;
                sor1oszlop3Nev="n";
            }else if (efegyvEgymasra ==32) {
                sor2oszlop3= false;
                sor2oszlop3Nev="n";
            }else if (efegyvEgymasra ==33) {
                sor3oszlop3= false;
                sor3oszlop3Nev="n";
            }else if (efegyvEgymasra ==34) {
                sor4oszlop3= false;
                sor4oszlop3Nev="n";
            }else if (efegyvEgymasra ==35) {
                sor5oszlop3= false;
                sor5oszlop3Nev="n";
            }else if (efegyvEgymasra ==36) {
                sor6oszlop3= false;
                sor6oszlop3Nev="n";
            }else if (efegyvEgymasra ==37) {
                sor7oszlop3= false;
                sor7oszlop3Nev="n";
            }else if (efegyvEgymasra ==38) {
                sor8oszlop3= false;
                sor8oszlop3Nev="n";
            }else if (efegyvEgymasra ==39) {
                sor9oszlop3= false;
                sor9oszlop3Nev="n";
            }else if (efegyvEgymasra ==310) {
                sor10oszlop3= false;
                sor10oszlop3Nev="n";
            }else if (efegyvEgymasra ==41) {
                sor1oszlop4= false;
                sor1oszlop4Nev="n";
            }else if (efegyvEgymasra ==42) {
                sor2oszlop4= false;
                sor2oszlop4Nev="n";
            }else if (efegyvEgymasra ==43) {
                sor3oszlop4= false;
                sor3oszlop4Nev="n";
            }else if (efegyvEgymasra ==44) {
                sor4oszlop4= false;
                sor4oszlop4Nev="n";
            }else if (efegyvEgymasra ==45) {
                sor5oszlop4= false;
                sor5oszlop4Nev="n";
            }else if (efegyvEgymasra ==46) {
                sor6oszlop4= false;
                sor6oszlop4Nev="n";
            }else if (efegyvEgymasra ==47) {
                sor7oszlop4= false;
                sor7oszlop4Nev="n";
            }else if (efegyvEgymasra ==48) {
                sor8oszlop4= false;
                sor8oszlop4Nev="n";
            }else if (efegyvEgymasra ==49) {
                sor9oszlop4= false;
                sor9oszlop4Nev="n";
            }else if (efegyvEgymasra ==410) {
                sor10oszlop4= false;
                sor10oszlop4Nev="n";
            }else if (efegyvEgymasra ==51) {
                sor1oszlop5= false;
                sor1oszlop5Nev="n";
            }else if (efegyvEgymasra ==52) {
                sor2oszlop5= false;
                sor2oszlop5Nev="n";
            }else if (efegyvEgymasra ==53) {
                sor3oszlop5= false;
                sor3oszlop5Nev="n";
            }else if (efegyvEgymasra ==54) {
                sor4oszlop5= false;
                sor4oszlop5Nev="n";
            }else if (efegyvEgymasra ==55) {
                sor5oszlop5= false;
                sor5oszlop5Nev="n";
            }else if (efegyvEgymasra ==56) {
                sor6oszlop5= false;
                sor6oszlop5Nev="n";
            }else if (efegyvEgymasra ==57) {
                sor7oszlop5= false;
                sor7oszlop5Nev="n";
            }else if (efegyvEgymasra ==58) {
                sor8oszlop5= false;
                sor8oszlop5Nev="n";
            }else if (efegyvEgymasra ==59) {
                sor9oszlop5= false;
                sor9oszlop5Nev="n";
            }else if (efegyvEgymasra ==510) {
                sor10oszlop5= false;
                sor10oszlop5Nev="n";
            }else if (efegyvEgymasra ==61) {
                sor1oszlop6= false;
                sor1oszlop6Nev="n";
            }else if (efegyvEgymasra ==62) {
                sor2oszlop6= false;
                sor2oszlop6Nev="n";
            }else if (efegyvEgymasra ==63) {
                sor3oszlop6= false;
                sor3oszlop6Nev="n";
            }else if (efegyvEgymasra ==64) {
                sor4oszlop6= false;
                sor4oszlop6Nev="n";
            }else if (efegyvEgymasra ==65) {
                sor5oszlop6= false;
                sor5oszlop6Nev="n";
            }else if (efegyvEgymasra ==66) {
                sor6oszlop6= false;
                sor6oszlop6Nev="n";
            }else if (efegyvEgymasra ==67) {
                sor7oszlop6= false;
                sor7oszlop6Nev="n";
            }else if (efegyvEgymasra ==68) {
                sor8oszlop6= false;
                sor8oszlop6Nev="n";
            }else if (efegyvEgymasra ==69) {
                sor9oszlop6= false;
                sor9oszlop6Nev="n";
            }else if (efegyvEgymasra ==610) {
                sor10oszlop6= false;
                sor10oszlop6Nev="n";
            }else if (efegyvEgymasra ==71) {
                sor1oszlop7= false;
                sor1oszlop7Nev="n";
            }else if (efegyvEgymasra ==72) {
                sor2oszlop7= false;
                sor2oszlop7Nev="n";
            }else if (efegyvEgymasra ==73) {
                sor3oszlop7= false;
                sor3oszlop7Nev="n";
            }else if (efegyvEgymasra ==74) {
                sor4oszlop7= false;
                sor4oszlop7Nev="n";
            }else if (efegyvEgymasra ==75) {
                sor5oszlop7= false;
                sor5oszlop7Nev="n";
            }else if (efegyvEgymasra ==76) {
                sor6oszlop7= false;
                sor6oszlop7Nev="n";
            }else if (efegyvEgymasra ==77) {
                sor7oszlop7= false;
                sor7oszlop7Nev="n";
            }else if (efegyvEgymasra ==78) {
                sor8oszlop7= false;
                sor8oszlop7Nev="n";
            }else if (efegyvEgymasra ==79) {
                sor9oszlop7= false;
                sor9oszlop7Nev="n";
            }else if (efegyvEgymasra ==710) {
                sor10oszlop7= false;
                sor10oszlop7Nev="n";
            }else if (efegyvEgymasra ==81) {
                sor1oszlop8= false;
                sor1oszlop8Nev="n";
            }else if (efegyvEgymasra ==82) {
                sor2oszlop8= false;
                sor2oszlop8Nev="n";
            }else if (efegyvEgymasra ==83) {
                sor3oszlop8= false;
                sor3oszlop8Nev="n";
            }else if (efegyvEgymasra ==84) {
                sor4oszlop8= false;
                sor4oszlop8Nev="n";
            }else if (efegyvEgymasra ==85) {
                sor5oszlop8= false;
                sor5oszlop8Nev="n";
            }else if (efegyvEgymasra ==86) {
                sor6oszlop8= false;
                sor6oszlop8Nev="n";
            }else if (efegyvEgymasra ==87) {
                sor7oszlop8= false;
                sor7oszlop8Nev="n";
            }else if (efegyvEgymasra ==88) {
                sor8oszlop8= false;
                sor8oszlop8Nev="n";
            }else if (efegyvEgymasra ==89) {
                sor9oszlop8= false;
                sor9oszlop8Nev="n";
            }else if (efegyvEgymasra ==810) {
                sor10oszlop8= false;
                sor10oszlop8Nev="n";
            }else if (efegyvEgymasra ==91) {
                sor1oszlop9= false;
                sor1oszlop9Nev="n";
            }else if (efegyvEgymasra ==92) {
                sor2oszlop9= false;
                sor2oszlop9Nev="n";
            }else if (efegyvEgymasra ==93) {
                sor3oszlop9= false;
                sor3oszlop9Nev="n";
            }else if (efegyvEgymasra ==94) {
                sor4oszlop9= false;
                sor4oszlop9Nev="n";
            }else if (efegyvEgymasra ==95) {
                sor5oszlop9= false;
                sor5oszlop9Nev="n";
            }else if (efegyvEgymasra ==96) {
                sor6oszlop9= false;
                sor6oszlop9Nev="n";
            }else if (efegyvEgymasra ==97) {
                sor7oszlop9= false;
                sor7oszlop9Nev="n";
            }else if (efegyvEgymasra ==98) {
                sor8oszlop9= false;
                sor8oszlop9Nev="n";
            }else if (efegyvEgymasra ==99) {
                sor9oszlop9= false;
                sor9oszlop9Nev="n";
            }else if (efegyvEgymasra ==910) {
                sor10oszlop9= false;
                sor10oszlop9Nev="n";
            }else if (efegyvEgymasra ==101) {
                sor1oszlop10= false;
                sor1oszlop10Nev="n";
            }else if (efegyvEgymasra ==102) {
                sor2oszlop10= false;
                sor2oszlop10Nev="n";
            }else if (efegyvEgymasra ==103) {
                sor3oszlop10= false;
                sor3oszlop10Nev="n";
            }else if (efegyvEgymasra ==104) {
                sor4oszlop10= false;
                sor4oszlop10Nev="n";
            }else if (efegyvEgymasra ==105) {
                sor5oszlop10= false;
                sor5oszlop10Nev="n";
            }else if (efegyvEgymasra ==106) {
                sor6oszlop10= false;
                sor6oszlop10Nev="n";
            }else if (efegyvEgymasra ==107) {
                sor7oszlop10= false;
                sor7oszlop10Nev="n";
            }else if (efegyvEgymasra ==108) {
                sor8oszlop10= false;
                sor8oszlop10Nev="n";
            }else if (efegyvEgymasra ==109) {
                sor9oszlop10= false;
                sor9oszlop10Nev="n";
            }else if (efegyvEgymasra ==1010) {
                sor10oszlop10= false;
                sor10oszlop10Nev="n";
            }else if (efegyvEgymasra ==111) {
                sor1oszlop11= false;
                sor1oszlop11Nev="n";
            }else if (efegyvEgymasra ==112) {
                sor2oszlop11= false;
                sor2oszlop11Nev="n";
            }else if (efegyvEgymasra ==113) {
                sor3oszlop11= false;
                sor3oszlop11Nev="n";
            }else if (efegyvEgymasra ==114) {
                sor4oszlop11= false;
                sor4oszlop11Nev="n";
            }else if (efegyvEgymasra ==115) {
                sor5oszlop11= false;
                sor5oszlop11Nev="n";
            }else if (efegyvEgymasra ==116) {
                sor6oszlop11= false;
                sor6oszlop11Nev="n";
            }else if (efegyvEgymasra ==117) {
                sor7oszlop11= false;
                sor7oszlop11Nev="n";
            }else if (efegyvEgymasra ==118) {
                sor8oszlop11= false;
                sor8oszlop11Nev="n";
            }else if (efegyvEgymasra ==119) {
                sor9oszlop11= false;
                sor9oszlop11Nev="n";
            }else if (efegyvEgymasra ==1110) {
                sor10oszlop11= false;
                sor10oszlop11Nev="n";
            }else if (efegyvEgymasra ==121) {
                sor1oszlop12= false;
                sor1oszlop12Nev="n";
            }else if (efegyvEgymasra ==122) {
                sor2oszlop12= false;
                sor2oszlop12Nev="n";
            }else if (efegyvEgymasra ==123) {
                sor3oszlop12= false;
                sor3oszlop12Nev="n";
            }else if (efegyvEgymasra ==124) {
                sor4oszlop12= false;
                sor4oszlop12Nev="n";
            }else if (efegyvEgymasra ==125) {
                sor5oszlop12= false;
                sor5oszlop12Nev="n";
            }else if (efegyvEgymasra ==126) {
                sor6oszlop12= false;
                sor6oszlop12Nev="n";
            }else if (efegyvEgymasra ==127) {
                sor7oszlop12= false;
                sor7oszlop12Nev="n";
            }else if (efegyvEgymasra ==128) {
                sor8oszlop12= false;
                sor8oszlop12Nev="n";
            }else if (efegyvEgymasra ==129) {
                sor9oszlop12= false;
                sor9oszlop12Nev="n";
            }else if (efegyvEgymasra ==1210) {
                sor10oszlop12= false;
                sor10oszlop12Nev="n";
            }
            efegyvEgymasra =poz;

        }else if ( eminoEgymasra !=0 && egyseg.equals("emino") && eminoEgymasra !=poz && efelderEgymasra !=poz && ecsontEgymasra !=poz && eorgyEgymasra !=poz && eraptEgymasra !=poz
                && grifEgymasra !=poz && ijasEgymasra !=poz && foldmuvEgymasra !=poz && fegyvEgymasra !=poz && harcpEgymasra !=poz && eminoEgymasra !=pozJelenlegi  ) {
            if (eminoEgymasra ==11) {
                sor1oszlop1= false;
                sor1oszlop1Nev="n";
            }else if (eminoEgymasra ==12) {
                sor2oszlop1= false;
                sor2oszlop1Nev="n";
            }else if (eminoEgymasra ==13) {
                sor3oszlop1= false;
                sor3oszlop1Nev="n";
            }else if (eminoEgymasra ==14) {
                sor4oszlop1= false;
                sor4oszlop1Nev="n";
            }else if (eminoEgymasra ==15) {
                sor5oszlop1= false;
                sor5oszlop1Nev="n";
            }else if (eminoEgymasra ==16) {
                sor6oszlop1= false;
                sor6oszlop1Nev="n";
            }else if (eminoEgymasra ==17) {
                sor7oszlop1= false;
                sor7oszlop1Nev="n";
            }else if (eminoEgymasra ==18) {
                sor8oszlop1= false;
                sor8oszlop1Nev="n";
            }else if (eminoEgymasra ==19) {
                sor9oszlop1= false;
                sor9oszlop1Nev="n";
            }else if (eminoEgymasra ==110) {
                sor10oszlop1= false;
                sor10oszlop1Nev="n";
            }else if (eminoEgymasra ==21) {
                sor1oszlop2= false;
                sor1oszlop2Nev="n";
            }else if (eminoEgymasra ==22) {
                sor2oszlop2= false;
                sor2oszlop2Nev="n";
            }else if (eminoEgymasra ==23) {
                sor3oszlop2= false;
                sor3oszlop2Nev="n";
            }else if (eminoEgymasra ==24) {
                sor4oszlop2= false;
                sor4oszlop2Nev="n";
            }else if (eminoEgymasra ==25) {
                sor5oszlop2= false;
                sor5oszlop2Nev="n";
            }else if (eminoEgymasra ==26) {
                sor6oszlop2= false;
                sor6oszlop2Nev="n";
            }else if (eminoEgymasra ==27) {
                sor7oszlop2= false;
                sor7oszlop2Nev="n";
            }else if (eminoEgymasra ==28) {
                sor8oszlop2= false;
                sor8oszlop2Nev="n";
            }else if (eminoEgymasra ==29) {
                sor9oszlop2= false;
                sor9oszlop2Nev="n";
            }else if (eminoEgymasra ==210) {
                sor10oszlop2= false;
                sor10oszlop2Nev="n";
            }else if (eminoEgymasra ==31) {
                sor1oszlop3= false;
                sor1oszlop3Nev="n";
            }else if (eminoEgymasra ==32) {
                sor2oszlop3= false;
                sor2oszlop3Nev="n";
            }else if (eminoEgymasra ==33) {
                sor3oszlop3= false;
                sor3oszlop3Nev="n";
            }else if (eminoEgymasra ==34) {
                sor4oszlop3= false;
                sor4oszlop3Nev="n";
            }else if (eminoEgymasra ==35) {
                sor5oszlop3= false;
                sor5oszlop3Nev="n";
            }else if (eminoEgymasra ==36) {
                sor6oszlop3= false;
                sor6oszlop3Nev="n";
            }else if (eminoEgymasra ==37) {
                sor7oszlop3= false;
                sor7oszlop3Nev="n";
            }else if (eminoEgymasra ==38) {
                sor8oszlop3= false;
                sor8oszlop3Nev="n";
            }else if (eminoEgymasra ==39) {
                sor9oszlop3= false;
                sor9oszlop3Nev="n";
            }else if (eminoEgymasra ==310) {
                sor10oszlop3= false;
                sor10oszlop3Nev="n";
            }else if (eminoEgymasra ==41) {
                sor1oszlop4= false;
                sor1oszlop4Nev="n";
            }else if (eminoEgymasra ==42) {
                sor2oszlop4= false;
                sor2oszlop4Nev="n";
            }else if (eminoEgymasra ==43) {
                sor3oszlop4= false;
                sor3oszlop4Nev="n";
            }else if (eminoEgymasra ==44) {
                sor4oszlop4= false;
                sor4oszlop4Nev="n";
            }else if (eminoEgymasra ==45) {
                sor5oszlop4= false;
                sor5oszlop4Nev="n";
            }else if (eminoEgymasra ==46) {
                sor6oszlop4= false;
                sor6oszlop4Nev="n";
            }else if (eminoEgymasra ==47) {
                sor7oszlop4= false;
                sor7oszlop4Nev="n";
            }else if (eminoEgymasra ==48) {
                sor8oszlop4= false;
                sor8oszlop4Nev="n";
            }else if (eminoEgymasra ==49) {
                sor9oszlop4= false;
                sor9oszlop4Nev="n";
            }else if (eminoEgymasra ==410) {
                sor10oszlop4= false;
                sor10oszlop4Nev="n";
            }else if (eminoEgymasra ==51) {
                sor1oszlop5= false;
                sor1oszlop5Nev="n";
            }else if (eminoEgymasra ==52) {
                sor2oszlop5= false;
                sor2oszlop5Nev="n";
            }else if (eminoEgymasra ==53) {
                sor3oszlop5= false;
                sor3oszlop5Nev="n";
            }else if (eminoEgymasra ==54) {
                sor4oszlop5= false;
                sor4oszlop5Nev="n";
            }else if (eminoEgymasra ==55) {
                sor5oszlop5= false;
                sor5oszlop5Nev="n";
            }else if (eminoEgymasra ==56) {
                sor6oszlop5= false;
                sor6oszlop5Nev="n";
            }else if (eminoEgymasra ==57) {
                sor7oszlop5= false;
                sor7oszlop5Nev="n";
            }else if (eminoEgymasra ==58) {
                sor8oszlop5= false;
                sor8oszlop5Nev="n";
            }else if (eminoEgymasra ==59) {
                sor9oszlop5= false;
                sor9oszlop5Nev="n";
            }else if (eminoEgymasra ==510) {
                sor10oszlop5= false;
                sor10oszlop5Nev="n";
            }else if (eminoEgymasra ==61) {
                sor1oszlop6= false;
                sor1oszlop6Nev="n";
            }else if (eminoEgymasra ==62) {
                sor2oszlop6= false;
                sor2oszlop6Nev="n";
            }else if (eminoEgymasra ==63) {
                sor3oszlop6= false;
                sor3oszlop6Nev="n";
            }else if (eminoEgymasra ==64) {
                sor4oszlop6= false;
                sor4oszlop6Nev="n";
            }else if (eminoEgymasra ==65) {
                sor5oszlop6= false;
                sor5oszlop6Nev="n";
            }else if (eminoEgymasra ==66) {
                sor6oszlop6= false;
                sor6oszlop6Nev="n";
            }else if (eminoEgymasra ==67) {
                sor7oszlop6= false;
                sor7oszlop6Nev="n";
            }else if (eminoEgymasra ==68) {
                sor8oszlop6= false;
                sor8oszlop6Nev="n";
            }else if (eminoEgymasra ==69) {
                sor9oszlop6= false;
                sor9oszlop6Nev="n";
            }else if (eminoEgymasra ==610) {
                sor10oszlop6= false;
                sor10oszlop6Nev="n";
            }else if (eminoEgymasra ==71) {
                sor1oszlop7= false;
                sor1oszlop7Nev="n";
            }else if (eminoEgymasra ==72) {
                sor2oszlop7= false;
                sor2oszlop7Nev="n";
            }else if (eminoEgymasra ==73) {
                sor3oszlop7= false;
                sor3oszlop7Nev="n";
            }else if (eminoEgymasra ==74) {
                sor4oszlop7= false;
                sor4oszlop7Nev="n";
            }else if (eminoEgymasra ==75) {
                sor5oszlop7= false;
                sor5oszlop7Nev="n";
            }else if (eminoEgymasra ==76) {
                sor6oszlop7= false;
                sor6oszlop7Nev="n";
            }else if (eminoEgymasra ==77) {
                sor7oszlop7= false;
                sor7oszlop7Nev="n";
            }else if (eminoEgymasra ==78) {
                sor8oszlop7= false;
                sor8oszlop7Nev="n";
            }else if (eminoEgymasra ==79) {
                sor9oszlop7= false;
                sor9oszlop7Nev="n";
            }else if (eminoEgymasra ==710) {
                sor10oszlop7= false;
                sor10oszlop7Nev="n";
            }else if (eminoEgymasra ==81) {
                sor1oszlop8= false;
                sor1oszlop8Nev="n";
            }else if (eminoEgymasra ==82) {
                sor2oszlop8= false;
                sor2oszlop8Nev="n";
            }else if (eminoEgymasra ==83) {
                sor3oszlop8= false;
                sor3oszlop8Nev="n";
            }else if (eminoEgymasra ==84) {
                sor4oszlop8= false;
                sor4oszlop8Nev="n";
            }else if (eminoEgymasra ==85) {
                sor5oszlop8= false;
                sor5oszlop8Nev="n";
            }else if (eminoEgymasra ==86) {
                sor6oszlop8= false;
                sor6oszlop8Nev="n";
            }else if (eminoEgymasra ==87) {
                sor7oszlop8= false;
                sor7oszlop8Nev="n";
            }else if (eminoEgymasra ==88) {
                sor8oszlop8= false;
                sor8oszlop8Nev="n";
            }else if (eminoEgymasra ==89) {
                sor9oszlop8= false;
                sor9oszlop8Nev="n";
            }else if (eminoEgymasra ==810) {
                sor10oszlop8= false;
                sor10oszlop8Nev="n";
            }else if (eminoEgymasra ==91) {
                sor1oszlop9= false;
                sor1oszlop9Nev="n";
            }else if (eminoEgymasra ==92) {
                sor2oszlop9= false;
                sor2oszlop9Nev="n";
            }else if (eminoEgymasra ==93) {
                sor3oszlop9= false;
                sor3oszlop9Nev="n";
            }else if (eminoEgymasra ==94) {
                sor4oszlop9= false;
                sor4oszlop9Nev="n";
            }else if (eminoEgymasra ==95) {
                sor5oszlop9= false;
                sor5oszlop9Nev="n";
            }else if (eminoEgymasra ==96) {
                sor6oszlop9= false;
                sor6oszlop9Nev="n";
            }else if (eminoEgymasra ==97) {
                sor7oszlop9= false;
                sor7oszlop9Nev="n";
            }else if (eminoEgymasra ==98) {
                sor8oszlop9= false;
                sor8oszlop9Nev="n";
            }else if (eminoEgymasra ==99) {
                sor9oszlop9= false;
                sor9oszlop9Nev="n";
            }else if (eminoEgymasra ==910) {
                sor10oszlop9= false;
                sor10oszlop9Nev="n";
            }else if (eminoEgymasra ==101) {
                sor1oszlop10= false;
                sor1oszlop10Nev="n";
            }else if (eminoEgymasra ==102) {
                sor2oszlop10= false;
                sor2oszlop10Nev="n";
            }else if (eminoEgymasra ==103) {
                sor3oszlop10= false;
                sor3oszlop10Nev="n";
            }else if (eminoEgymasra ==104) {
                sor4oszlop10= false;
                sor4oszlop10Nev="n";
            }else if (eminoEgymasra ==105) {
                sor5oszlop10= false;
                sor5oszlop10Nev="n";
            }else if (eminoEgymasra ==106) {
                sor6oszlop10= false;
                sor6oszlop10Nev="n";
            }else if (eminoEgymasra ==107) {
                sor7oszlop10= false;
                sor7oszlop10Nev="n";
            }else if (eminoEgymasra ==108) {
                sor8oszlop10= false;
                sor8oszlop10Nev="n";
            }else if (eminoEgymasra ==109) {
                sor9oszlop10= false;
                sor9oszlop10Nev="n";
            }else if (eminoEgymasra ==1010) {
                sor10oszlop10= false;
                sor10oszlop10Nev="n";
            }else if (eminoEgymasra ==111) {
                sor1oszlop11= false;
                sor1oszlop11Nev="n";
            }else if (eminoEgymasra ==112) {
                sor2oszlop11= false;
                sor2oszlop11Nev="n";
            }else if (eminoEgymasra ==113) {
                sor3oszlop11= false;
                sor3oszlop11Nev="n";
            }else if (eminoEgymasra ==114) {
                sor4oszlop11= false;
                sor4oszlop11Nev="n";
            }else if (eminoEgymasra ==115) {
                sor5oszlop11= false;
                sor5oszlop11Nev="n";
            }else if (eminoEgymasra ==116) {
                sor6oszlop11= false;
                sor6oszlop11Nev="n";
            }else if (eminoEgymasra ==117) {
                sor7oszlop11= false;
                sor7oszlop11Nev="n";
            }else if (eminoEgymasra ==118) {
                sor8oszlop11= false;
                sor8oszlop11Nev="n";
            }else if (eminoEgymasra ==119) {
                sor9oszlop11= false;
                sor9oszlop11Nev="n";
            }else if (eminoEgymasra ==1110) {
                sor10oszlop11= false;
                sor10oszlop11Nev="n";
            }else if (eminoEgymasra ==121) {
                sor1oszlop12= false;
                sor1oszlop12Nev="n";
            }else if (eminoEgymasra ==122) {
                sor2oszlop12= false;
                sor2oszlop12Nev="n";
            }else if (eminoEgymasra ==123) {
                sor3oszlop12= false;
                sor3oszlop12Nev="n";
            }else if (eminoEgymasra ==124) {
                sor4oszlop12= false;
                sor4oszlop12Nev="n";
            }else if (eminoEgymasra ==125) {
                sor5oszlop12= false;
                sor5oszlop12Nev="n";
            }else if (eminoEgymasra ==126) {
                sor6oszlop12= false;
                sor6oszlop12Nev="n";
            }else if (eminoEgymasra ==127) {
                sor7oszlop12= false;
                sor7oszlop12Nev="n";
            }else if (eminoEgymasra ==128) {
                sor8oszlop12= false;
                sor8oszlop12Nev="n";
            }else if (eminoEgymasra ==129) {
                sor9oszlop12= false;
                sor9oszlop12Nev="n";
            }else if (eminoEgymasra ==1210) {
                sor10oszlop12= false;
                sor10oszlop12Nev="n";
            }
            eminoEgymasra =poz;

        }else if ( eorgyEgymasra !=0 && egyseg.equals("eorgy") && eminoEgymasra !=poz && efelderEgymasra !=poz && ecsontEgymasra !=poz && eorgyEgymasra !=poz && eraptEgymasra !=poz
                && grifEgymasra !=poz && ijasEgymasra !=poz && foldmuvEgymasra !=poz && fegyvEgymasra !=poz && harcpEgymasra !=poz && eorgyEgymasra !=pozJelenlegi  ) {
            if (eorgyEgymasra ==11) {
                sor1oszlop1= false;
                sor1oszlop1Nev="n";
            }else if (eorgyEgymasra ==12) {
                sor2oszlop1= false;
                sor2oszlop1Nev="n";
            }else if (eorgyEgymasra ==13) {
                sor3oszlop1= false;
                sor3oszlop1Nev="n";
            }else if (eorgyEgymasra ==14) {
                sor4oszlop1= false;
                sor4oszlop1Nev="n";
            }else if (eorgyEgymasra ==15) {
                sor5oszlop1= false;
                sor5oszlop1Nev="n";
            }else if (eorgyEgymasra ==16) {
                sor6oszlop1= false;
                sor6oszlop1Nev="n";
            }else if (eorgyEgymasra ==17) {
                sor7oszlop1= false;
                sor7oszlop1Nev="n";
            }else if (eorgyEgymasra ==18) {
                sor8oszlop1= false;
                sor8oszlop1Nev="n";
            }else if (eorgyEgymasra ==19) {
                sor9oszlop1= false;
                sor9oszlop1Nev="n";
            }else if (eorgyEgymasra ==110) {
                sor10oszlop1= false;
                sor10oszlop1Nev="n";
            }else if (eorgyEgymasra ==21) {
                sor1oszlop2= false;
                sor1oszlop2Nev="n";
            }else if (eorgyEgymasra ==22) {
                sor2oszlop2= false;
                sor2oszlop2Nev="n";
            }else if (eorgyEgymasra ==23) {
                sor3oszlop2= false;
                sor3oszlop2Nev="n";
            }else if (eorgyEgymasra ==24) {
                sor4oszlop2= false;
                sor4oszlop2Nev="n";
            }else if (eorgyEgymasra ==25) {
                sor5oszlop2= false;
                sor5oszlop2Nev="n";
            }else if (eorgyEgymasra ==26) {
                sor6oszlop2= false;
                sor6oszlop2Nev="n";
            }else if (eorgyEgymasra ==27) {
                sor7oszlop2= false;
                sor7oszlop2Nev="n";
            }else if (eorgyEgymasra ==28) {
                sor8oszlop2= false;
                sor8oszlop2Nev="n";
            }else if (eorgyEgymasra ==29) {
                sor9oszlop2= false;
                sor9oszlop2Nev="n";
            }else if (eorgyEgymasra ==210) {
                sor10oszlop2= false;
                sor10oszlop2Nev="n";
            }else if (eorgyEgymasra ==31) {
                sor1oszlop3= false;
                sor1oszlop3Nev="n";
            }else if (eorgyEgymasra ==32) {
                sor2oszlop3= false;
                sor2oszlop3Nev="n";
            }else if (eorgyEgymasra ==33) {
                sor3oszlop3= false;
                sor3oszlop3Nev="n";
            }else if (eorgyEgymasra ==34) {
                sor4oszlop3= false;
                sor4oszlop3Nev="n";
            }else if (eorgyEgymasra ==35) {
                sor5oszlop3= false;
                sor5oszlop3Nev="n";
            }else if (eorgyEgymasra ==36) {
                sor6oszlop3= false;
                sor6oszlop3Nev="n";
            }else if (eorgyEgymasra ==37) {
                sor7oszlop3= false;
                sor7oszlop3Nev="n";
            }else if (eorgyEgymasra ==38) {
                sor8oszlop3= false;
                sor8oszlop3Nev="n";
            }else if (eorgyEgymasra ==39) {
                sor9oszlop3= false;
                sor9oszlop3Nev="n";
            }else if (eorgyEgymasra ==310) {
                sor10oszlop3= false;
                sor10oszlop3Nev="n";
            }else if (eorgyEgymasra ==41) {
                sor1oszlop4= false;
                sor1oszlop4Nev="n";
            }else if (eorgyEgymasra ==42) {
                sor2oszlop4= false;
                sor2oszlop4Nev="n";
            }else if (eorgyEgymasra ==43) {
                sor3oszlop4= false;
                sor3oszlop4Nev="n";
            }else if (eorgyEgymasra ==44) {
                sor4oszlop4= false;
                sor4oszlop4Nev="n";
            }else if (eorgyEgymasra ==45) {
                sor5oszlop4= false;
                sor5oszlop4Nev="n";
            }else if (eorgyEgymasra ==46) {
                sor6oszlop4= false;
                sor6oszlop4Nev="n";
            }else if (eorgyEgymasra ==47) {
                sor7oszlop4= false;
                sor7oszlop4Nev="n";
            }else if (eorgyEgymasra ==48) {
                sor8oszlop4= false;
                sor8oszlop4Nev="n";
            }else if (eorgyEgymasra ==49) {
                sor9oszlop4= false;
                sor9oszlop4Nev="n";
            }else if (eorgyEgymasra ==410) {
                sor10oszlop4= false;
                sor10oszlop4Nev="n";
            }else if (eorgyEgymasra ==51) {
                sor1oszlop5= false;
                sor1oszlop5Nev="n";
            }else if (eorgyEgymasra ==52) {
                sor2oszlop5= false;
                sor2oszlop5Nev="n";
            }else if (eorgyEgymasra ==53) {
                sor3oszlop5= false;
                sor3oszlop5Nev="n";
            }else if (eorgyEgymasra ==54) {
                sor4oszlop5= false;
                sor4oszlop5Nev="n";
            }else if (eorgyEgymasra ==55) {
                sor5oszlop5= false;
                sor5oszlop5Nev="n";
            }else if (eorgyEgymasra ==56) {
                sor6oszlop5= false;
                sor6oszlop5Nev="n";
            }else if (eorgyEgymasra ==57) {
                sor7oszlop5= false;
                sor7oszlop5Nev="n";
            }else if (eorgyEgymasra ==58) {
                sor8oszlop5= false;
                sor8oszlop5Nev="n";
            }else if (eorgyEgymasra ==59) {
                sor9oszlop5= false;
                sor9oszlop5Nev="n";
            }else if (eorgyEgymasra ==510) {
                sor10oszlop5= false;
                sor10oszlop5Nev="n";
            }else if (eorgyEgymasra ==61) {
                sor1oszlop6= false;
                sor1oszlop6Nev="n";
            }else if (eorgyEgymasra ==62) {
                sor2oszlop6= false;
                sor2oszlop6Nev="n";
            }else if (eorgyEgymasra ==63) {
                sor3oszlop6= false;
                sor3oszlop6Nev="n";
            }else if (eorgyEgymasra ==64) {
                sor4oszlop6= false;
                sor4oszlop6Nev="n";
            }else if (eorgyEgymasra ==65) {
                sor5oszlop6= false;
                sor5oszlop6Nev="n";
            }else if (eorgyEgymasra ==66) {
                sor6oszlop6= false;
                sor6oszlop6Nev="n";
            }else if (eorgyEgymasra ==67) {
                sor7oszlop6= false;
                sor7oszlop6Nev="n";
            }else if (eorgyEgymasra ==68) {
                sor8oszlop6= false;
                sor8oszlop6Nev="n";
            }else if (eorgyEgymasra ==69) {
                sor9oszlop6= false;
                sor9oszlop6Nev="n";
            }else if (eorgyEgymasra ==610) {
                sor10oszlop6= false;
                sor10oszlop6Nev="n";
            }else if (eorgyEgymasra ==71) {
                sor1oszlop7= false;
                sor1oszlop7Nev="n";
            }else if (eorgyEgymasra ==72) {
                sor2oszlop7= false;
                sor2oszlop7Nev="n";
            }else if (eorgyEgymasra ==73) {
                sor3oszlop7= false;
                sor3oszlop7Nev="n";
            }else if (eorgyEgymasra ==74) {
                sor4oszlop7= false;
                sor4oszlop7Nev="n";
            }else if (eorgyEgymasra ==75) {
                sor5oszlop7= false;
                sor5oszlop7Nev="n";
            }else if (eorgyEgymasra ==76) {
                sor6oszlop7= false;
                sor6oszlop7Nev="n";
            }else if (eorgyEgymasra ==77) {
                sor7oszlop7= false;
                sor7oszlop7Nev="n";
            }else if (eorgyEgymasra ==78) {
                sor8oszlop7= false;
                sor8oszlop7Nev="n";
            }else if (eorgyEgymasra ==79) {
                sor9oszlop7= false;
                sor9oszlop7Nev="n";
            }else if (eorgyEgymasra ==710) {
                sor10oszlop7= false;
                sor10oszlop7Nev="n";
            }else if (eorgyEgymasra ==81) {
                sor1oszlop8= false;
                sor1oszlop8Nev="n";
            }else if (eorgyEgymasra ==82) {
                sor2oszlop8= false;
                sor2oszlop8Nev="n";
            }else if (eorgyEgymasra ==83) {
                sor3oszlop8= false;
                sor3oszlop8Nev="n";
            }else if (eorgyEgymasra ==84) {
                sor4oszlop8= false;
                sor4oszlop8Nev="n";
            }else if (eorgyEgymasra ==85) {
                sor5oszlop8= false;
                sor5oszlop8Nev="n";
            }else if (eorgyEgymasra ==86) {
                sor6oszlop8= false;
                sor6oszlop8Nev="n";
            }else if (eorgyEgymasra ==87) {
                sor7oszlop8= false;
                sor7oszlop8Nev="n";
            }else if (eorgyEgymasra ==88) {
                sor8oszlop8= false;
                sor8oszlop8Nev="n";
            }else if (eorgyEgymasra ==89) {
                sor9oszlop8= false;
                sor9oszlop8Nev="n";
            }else if (eorgyEgymasra ==810) {
                sor10oszlop8= false;
                sor10oszlop8Nev="n";
            }else if (eorgyEgymasra ==91) {
                sor1oszlop9= false;
                sor1oszlop9Nev="n";
            }else if (eorgyEgymasra ==92) {
                sor2oszlop9= false;
                sor2oszlop9Nev="n";
            }else if (eorgyEgymasra ==93) {
                sor3oszlop9= false;
                sor3oszlop9Nev="n";
            }else if (eorgyEgymasra ==94) {
                sor4oszlop9= false;
                sor4oszlop9Nev="n";
            }else if (eorgyEgymasra ==95) {
                sor5oszlop9= false;
                sor5oszlop9Nev="n";
            }else if (eorgyEgymasra ==96) {
                sor6oszlop9= false;
                sor6oszlop9Nev="n";
            }else if (eorgyEgymasra ==97) {
                sor7oszlop9= false;
                sor7oszlop9Nev="n";
            }else if (eorgyEgymasra ==98) {
                sor8oszlop9= false;
                sor8oszlop9Nev="n";
            }else if (eorgyEgymasra ==99) {
                sor9oszlop9= false;
                sor9oszlop9Nev="n";
            }else if (eorgyEgymasra ==910) {
                sor10oszlop9= false;
                sor10oszlop9Nev="n";
            }else if (eorgyEgymasra ==101) {
                sor1oszlop10= false;
                sor1oszlop10Nev="n";
            }else if (eorgyEgymasra ==102) {
                sor2oszlop10= false;
                sor2oszlop10Nev="n";
            }else if (eorgyEgymasra ==103) {
                sor3oszlop10= false;
                sor3oszlop10Nev="n";
            }else if (eorgyEgymasra ==104) {
                sor4oszlop10= false;
                sor4oszlop10Nev="n";
            }else if (eorgyEgymasra ==105) {
                sor5oszlop10= false;
                sor5oszlop10Nev="n";
            }else if (eorgyEgymasra ==106) {
                sor6oszlop10= false;
                sor6oszlop10Nev="n";
            }else if (eorgyEgymasra ==107) {
                sor7oszlop10= false;
                sor7oszlop10Nev="n";
            }else if (eorgyEgymasra ==108) {
                sor8oszlop10= false;
                sor8oszlop10Nev="n";
            }else if (eorgyEgymasra ==109) {
                sor9oszlop10= false;
                sor9oszlop10Nev="n";
            }else if (eorgyEgymasra ==1010) {
                sor10oszlop10= false;
                sor10oszlop10Nev="n";
            }else if (eorgyEgymasra ==111) {
                sor1oszlop11= false;
                sor1oszlop11Nev="n";
            }else if (eorgyEgymasra ==112) {
                sor2oszlop11= false;
                sor2oszlop11Nev="n";
            }else if (eorgyEgymasra ==113) {
                sor3oszlop11= false;
                sor3oszlop11Nev="n";
            }else if (eorgyEgymasra ==114) {
                sor4oszlop11= false;
                sor4oszlop11Nev="n";
            }else if (eorgyEgymasra ==115) {
                sor5oszlop11= false;
                sor5oszlop11Nev="n";
            }else if (eorgyEgymasra ==116) {
                sor6oszlop11= false;
                sor6oszlop11Nev="n";
            }else if (eorgyEgymasra ==117) {
                sor7oszlop11= false;
                sor7oszlop11Nev="n";
            }else if (eorgyEgymasra ==118) {
                sor8oszlop11= false;
                sor8oszlop11Nev="n";
            }else if (eorgyEgymasra ==119) {
                sor9oszlop11= false;
                sor9oszlop11Nev="n";
            }else if (eorgyEgymasra ==1110) {
                sor10oszlop11= false;
                sor10oszlop11Nev="n";
            }else if (eorgyEgymasra ==121) {
                sor1oszlop12= false;
                sor1oszlop12Nev="n";
            }else if (eorgyEgymasra ==122) {
                sor2oszlop12= false;
                sor2oszlop12Nev="n";
            }else if (eorgyEgymasra ==123) {
                sor3oszlop12= false;
                sor3oszlop12Nev="n";
            }else if (eorgyEgymasra ==124) {
                sor4oszlop12= false;
                sor4oszlop12Nev="n";
            }else if (eorgyEgymasra ==125) {
                sor5oszlop12= false;
                sor5oszlop12Nev="n";
            }else if (eorgyEgymasra ==126) {
                sor6oszlop12= false;
                sor6oszlop12Nev="n";
            }else if (eorgyEgymasra ==127) {
                sor7oszlop12= false;
                sor7oszlop12Nev="n";
            }else if (eorgyEgymasra ==128) {
                sor8oszlop12= false;
                sor8oszlop12Nev="n";
            }else if (eorgyEgymasra ==129) {
                sor9oszlop12= false;
                sor9oszlop12Nev="n";
            }else if (eorgyEgymasra ==1210) {
                sor10oszlop12= false;
                sor10oszlop12Nev="n";
            }
            eorgyEgymasra =poz;

        }else if ( eharcpEgymasra !=0 && egyseg.equals("eharcp") && egrifEgymasra !=poz && eijasEgymasra !=poz && efoldmuvEgymasra !=poz && efegyvEgymasra !=poz && eharcpEgymasra !=poz
                && eminoEgymasra !=poz && efelderEgymasra !=poz && ecsontEgymasra !=poz && eorgyEgymasra !=poz && eraptEgymasra !=poz && eharcpEgymasra !=pozJelenlegi  ) {
            if (eharcpEgymasra ==11) {
                sor1oszlop1= false;
                sor1oszlop1Nev="n";
            }else if (eharcpEgymasra ==12) {
                sor2oszlop1= false;
                sor2oszlop1Nev="n";
            }else if (eharcpEgymasra ==13) {
                sor3oszlop1= false;
                sor3oszlop1Nev="n";
            }else if (eharcpEgymasra ==14) {
                sor4oszlop1= false;
                sor4oszlop1Nev="n";
            }else if (eharcpEgymasra ==15) {
                sor5oszlop1= false;
                sor5oszlop1Nev="n";
            }else if (eharcpEgymasra ==16) {
                sor6oszlop1= false;
                sor6oszlop1Nev="n";
            }else if (eharcpEgymasra ==17) {
                sor7oszlop1= false;
                sor7oszlop1Nev="n";
            }else if (eharcpEgymasra ==18) {
                sor8oszlop1= false;
                sor8oszlop1Nev="n";
            }else if (eharcpEgymasra ==19) {
                sor9oszlop1= false;
                sor9oszlop1Nev="n";
            }else if (eharcpEgymasra ==110) {
                sor10oszlop1= false;
                sor10oszlop1Nev="n";
            }else if (eharcpEgymasra ==21) {
                sor1oszlop2= false;
                sor1oszlop2Nev="n";
            }else if (eharcpEgymasra ==22) {
                sor2oszlop2= false;
                sor2oszlop2Nev="n";
            }else if (eharcpEgymasra ==23) {
                sor3oszlop2= false;
                sor3oszlop2Nev="n";
            }else if (eharcpEgymasra ==24) {
                sor4oszlop2= false;
                sor4oszlop2Nev="n";
            }else if (eharcpEgymasra ==25) {
                sor5oszlop2= false;
                sor5oszlop2Nev="n";
            }else if (eharcpEgymasra ==26) {
                sor6oszlop2= false;
                sor6oszlop2Nev="n";
            }else if (eharcpEgymasra ==27) {
                sor7oszlop2= false;
                sor7oszlop2Nev="n";
            }else if (eharcpEgymasra ==28) {
                sor8oszlop2= false;
                sor8oszlop2Nev="n";
            }else if (eharcpEgymasra ==29) {
                sor9oszlop2= false;
                sor9oszlop2Nev="n";
            }else if (eharcpEgymasra ==210) {
                sor10oszlop2= false;
                sor10oszlop2Nev="n";
            }else if (eharcpEgymasra ==31) {
                sor1oszlop3= false;
                sor1oszlop3Nev="n";
            }else if (eharcpEgymasra ==32) {
                sor2oszlop3= false;
                sor2oszlop3Nev="n";
            }else if (eharcpEgymasra ==33) {
                sor3oszlop3= false;
                sor3oszlop3Nev="n";
            }else if (eharcpEgymasra ==34) {
                sor4oszlop3= false;
                sor4oszlop3Nev="n";
            }else if (eharcpEgymasra ==35) {
                sor5oszlop3= false;
                sor5oszlop3Nev="n";
            }else if (eharcpEgymasra ==36) {
                sor6oszlop3= false;
                sor6oszlop3Nev="n";
            }else if (eharcpEgymasra ==37) {
                sor7oszlop3= false;
                sor7oszlop3Nev="n";
            }else if (eharcpEgymasra ==38) {
                sor8oszlop3= false;
                sor8oszlop3Nev="n";
            }else if (eharcpEgymasra ==39) {
                sor9oszlop3= false;
                sor9oszlop3Nev="n";
            }else if (eharcpEgymasra ==310) {
                sor10oszlop3= false;
                sor10oszlop3Nev="n";
            }else if (eharcpEgymasra ==41) {
                sor1oszlop4= false;
                sor1oszlop4Nev="n";
            }else if (eharcpEgymasra ==42) {
                sor2oszlop4= false;
                sor2oszlop4Nev="n";
            }else if (eharcpEgymasra ==43) {
                sor3oszlop4= false;
                sor3oszlop4Nev="n";
            }else if (eharcpEgymasra ==44) {
                sor4oszlop4= false;
                sor4oszlop4Nev="n";
            }else if (eharcpEgymasra ==45) {
                sor5oszlop4= false;
                sor5oszlop4Nev="n";
            }else if (eharcpEgymasra ==46) {
                sor6oszlop4= false;
                sor6oszlop4Nev="n";
            }else if (eharcpEgymasra ==47) {
                sor7oszlop4= false;
                sor7oszlop4Nev="n";
            }else if (eharcpEgymasra ==48) {
                sor8oszlop4= false;
                sor8oszlop4Nev="n";
            }else if (eharcpEgymasra ==49) {
                sor9oszlop4= false;
                sor9oszlop4Nev="n";
            }else if (eharcpEgymasra ==410) {
                sor10oszlop4= false;
                sor10oszlop4Nev="n";
            }else if (eharcpEgymasra ==51) {
                sor1oszlop5= false;
                sor1oszlop5Nev="n";
            }else if (eharcpEgymasra ==52) {
                sor2oszlop5= false;
                sor2oszlop5Nev="n";
            }else if (eharcpEgymasra ==53) {
                sor3oszlop5= false;
                sor3oszlop5Nev="n";
            }else if (eharcpEgymasra ==54) {
                sor4oszlop5= false;
                sor4oszlop5Nev="n";
            }else if (eharcpEgymasra ==55) {
                sor5oszlop5= false;
                sor5oszlop5Nev="n";
            }else if (eharcpEgymasra ==56) {
                sor6oszlop5= false;
                sor6oszlop5Nev="n";
            }else if (eharcpEgymasra ==57) {
                sor7oszlop5= false;
                sor7oszlop5Nev="n";
            }else if (eharcpEgymasra ==58) {
                sor8oszlop5= false;
                sor8oszlop5Nev="n";
            }else if (eharcpEgymasra ==59) {
                sor9oszlop5= false;
                sor9oszlop5Nev="n";
            }else if (eharcpEgymasra ==510) {
                sor10oszlop5= false;
                sor10oszlop5Nev="n";
            }else if (eharcpEgymasra ==61) {
                sor1oszlop6= false;
                sor1oszlop6Nev="n";
            }else if (eharcpEgymasra ==62) {
                sor2oszlop6= false;
                sor2oszlop6Nev="n";
            }else if (eharcpEgymasra ==63) {
                sor3oszlop6= false;
                sor3oszlop6Nev="n";
            }else if (eharcpEgymasra ==64) {
                sor4oszlop6= false;
                sor4oszlop6Nev="n";
            }else if (eharcpEgymasra ==65) {
                sor5oszlop6= false;
                sor5oszlop6Nev="n";
            }else if (eharcpEgymasra ==66) {
                sor6oszlop6= false;
                sor6oszlop6Nev="n";
            }else if (eharcpEgymasra ==67) {
                sor7oszlop6= false;
                sor7oszlop6Nev="n";
            }else if (eharcpEgymasra ==68) {
                sor8oszlop6= false;
                sor8oszlop6Nev="n";
            }else if (eharcpEgymasra ==69) {
                sor9oszlop6= false;
                sor9oszlop6Nev="n";
            }else if (eharcpEgymasra ==610) {
                sor10oszlop6= false;
                sor10oszlop6Nev="n";
            }else if (eharcpEgymasra ==71) {
                sor1oszlop7= false;
                sor1oszlop7Nev="n";
            }else if (eharcpEgymasra ==72) {
                sor2oszlop7= false;
                sor2oszlop7Nev="n";
            }else if (eharcpEgymasra ==73) {
                sor3oszlop7= false;
                sor3oszlop7Nev="n";
            }else if (eharcpEgymasra ==74) {
                sor4oszlop7= false;
                sor4oszlop7Nev="n";
            }else if (eharcpEgymasra ==75) {
                sor5oszlop7= false;
                sor5oszlop7Nev="n";
            }else if (eharcpEgymasra ==76) {
                sor6oszlop7= false;
                sor6oszlop7Nev="n";
            }else if (eharcpEgymasra ==77) {
                sor7oszlop7= false;
                sor7oszlop7Nev="n";
            }else if (eharcpEgymasra ==78) {
                sor8oszlop7= false;
                sor8oszlop7Nev="n";
            }else if (eharcpEgymasra ==79) {
                sor9oszlop7= false;
                sor9oszlop7Nev="n";
            }else if (eharcpEgymasra ==710) {
                sor10oszlop7= false;
                sor10oszlop7Nev="n";
            }else if (eharcpEgymasra ==81) {
                sor1oszlop8= false;
                sor1oszlop8Nev="n";
            }else if (eharcpEgymasra ==82) {
                sor2oszlop8= false;
                sor2oszlop8Nev="n";
            }else if (eharcpEgymasra ==83) {
                sor3oszlop8= false;
                sor3oszlop8Nev="n";
            }else if (eharcpEgymasra ==84) {
                sor4oszlop8= false;
                sor4oszlop8Nev="n";
            }else if (eharcpEgymasra ==85) {
                sor5oszlop8= false;
                sor5oszlop8Nev="n";
            }else if (eharcpEgymasra ==86) {
                sor6oszlop8= false;
                sor6oszlop8Nev="n";
            }else if (eharcpEgymasra ==87) {
                sor7oszlop8= false;
                sor7oszlop8Nev="n";
            }else if (eharcpEgymasra ==88) {
                sor8oszlop8= false;
                sor8oszlop8Nev="n";
            }else if (eharcpEgymasra ==89) {
                sor9oszlop8= false;
                sor9oszlop8Nev="n";
            }else if (eharcpEgymasra ==810) {
                sor10oszlop8= false;
                sor10oszlop8Nev="n";
            }else if (eharcpEgymasra ==91) {
                sor1oszlop9= false;
                sor1oszlop9Nev="n";
            }else if (eharcpEgymasra ==92) {
                sor2oszlop9= false;
                sor2oszlop9Nev="n";
            }else if (eharcpEgymasra ==93) {
                sor3oszlop9= false;
                sor3oszlop9Nev="n";
            }else if (eharcpEgymasra ==94) {
                sor4oszlop9= false;
                sor4oszlop9Nev="n";
            }else if (eharcpEgymasra ==95) {
                sor5oszlop9= false;
                sor5oszlop9Nev="n";
            }else if (eharcpEgymasra ==96) {
                sor6oszlop9= false;
                sor6oszlop9Nev="n";
            }else if (eharcpEgymasra ==97) {
                sor7oszlop9= false;
                sor7oszlop9Nev="n";
            }else if (eharcpEgymasra ==98) {
                sor8oszlop9= false;
                sor8oszlop9Nev="n";
            }else if (eharcpEgymasra ==99) {
                sor9oszlop9= false;
                sor9oszlop9Nev="n";
            }else if (eharcpEgymasra ==910) {
                sor10oszlop9= false;
                sor10oszlop9Nev="n";
            }else if (eharcpEgymasra ==101) {
                sor1oszlop10= false;
                sor1oszlop10Nev="n";
            }else if (eharcpEgymasra ==102) {
                sor2oszlop10= false;
                sor2oszlop10Nev="n";
            }else if (eharcpEgymasra ==103) {
                sor3oszlop10= false;
                sor3oszlop10Nev="n";
            }else if (eharcpEgymasra ==104) {
                sor4oszlop10= false;
                sor4oszlop10Nev="n";
            }else if (eharcpEgymasra ==105) {
                sor5oszlop10= false;
                sor5oszlop10Nev="n";
            }else if (eharcpEgymasra ==106) {
                sor6oszlop10= false;
                sor6oszlop10Nev="n";
            }else if (eharcpEgymasra ==107) {
                sor7oszlop10= false;
                sor7oszlop10Nev="n";
            }else if (eharcpEgymasra ==108) {
                sor8oszlop10= false;
                sor8oszlop10Nev="n";
            }else if (eharcpEgymasra ==109) {
                sor9oszlop10= false;
                sor9oszlop10Nev="n";
            }else if (eharcpEgymasra ==1010) {
                sor10oszlop10= false;
                sor10oszlop10Nev="n";
            }else if (eharcpEgymasra ==111) {
                sor1oszlop11= false;
                sor1oszlop11Nev="n";
            }else if (eharcpEgymasra ==112) {
                sor2oszlop11= false;
                sor2oszlop11Nev="n";
            }else if (eharcpEgymasra ==113) {
                sor3oszlop11= false;
                sor3oszlop11Nev="n";
            }else if (eharcpEgymasra ==114) {
                sor4oszlop11= false;
                sor4oszlop11Nev="n";
            }else if (eharcpEgymasra ==115) {
                sor5oszlop11= false;
                sor5oszlop11Nev="n";
            }else if (eharcpEgymasra ==116) {
                sor6oszlop11= false;
                sor6oszlop11Nev="n";
            }else if (eharcpEgymasra ==117) {
                sor7oszlop11= false;
                sor7oszlop11Nev="n";
            }else if (eharcpEgymasra ==118) {
                sor8oszlop11= false;
                sor8oszlop11Nev="n";
            }else if (eharcpEgymasra ==119) {
                sor9oszlop11= false;
                sor9oszlop11Nev="n";
            }else if (eharcpEgymasra ==1110) {
                sor10oszlop11= false;
                sor10oszlop11Nev="n";
            }else if (eharcpEgymasra ==121) {
                sor1oszlop12= false;
                sor1oszlop12Nev="n";
            }else if (eharcpEgymasra ==122) {
                sor2oszlop12= false;
                sor2oszlop12Nev="n";
            }else if (eharcpEgymasra ==123) {
                sor3oszlop12= false;
                sor3oszlop12Nev="n";
            }else if (eharcpEgymasra ==124) {
                sor4oszlop12= false;
                sor4oszlop12Nev="n";
            }else if (eharcpEgymasra ==125) {
                sor5oszlop12= false;
                sor5oszlop12Nev="n";
            }else if (eharcpEgymasra ==126) {
                sor6oszlop12= false;
                sor6oszlop12Nev="n";
            }else if (eharcpEgymasra ==127) {
                sor7oszlop12= false;
                sor7oszlop12Nev="n";
            }else if (eharcpEgymasra ==128) {
                sor8oszlop12= false;
                sor8oszlop12Nev="n";
            }else if (eharcpEgymasra ==129) {
                sor9oszlop12= false;
                sor9oszlop12Nev="n";
            }else if (eharcpEgymasra ==1210) {
                sor10oszlop12= false;
                sor10oszlop12Nev="n";
            }
            eharcpEgymasra =poz;

        }else if ( eraptEgymasra !=0 && egyseg.equals("erapt") && eminoEgymasra !=poz && efelderEgymasra !=poz && ecsontEgymasra !=poz && eorgyEgymasra !=poz && eraptEgymasra !=poz
                && grifEgymasra !=poz && ijasEgymasra !=poz && foldmuvEgymasra !=poz && fegyvEgymasra !=poz && harcpEgymasra !=poz && eraptEgymasra !=pozJelenlegi  ) {
            if (eraptEgymasra ==11) {
                sor1oszlop1= false;
                sor1oszlop1Nev="n";
            }else if (eraptEgymasra ==12) {
                sor2oszlop1= false;
                sor2oszlop1Nev="n";
            }else if (eraptEgymasra ==13) {
                sor3oszlop1= false;
                sor3oszlop1Nev="n";
            }else if (eraptEgymasra ==14) {
                sor4oszlop1= false;
                sor4oszlop1Nev="n";
            }else if (eraptEgymasra ==15) {
                sor5oszlop1= false;
                sor5oszlop1Nev="n";
            }else if (eraptEgymasra ==16) {
                sor6oszlop1= false;
                sor6oszlop1Nev="n";
            }else if (eraptEgymasra ==17) {
                sor7oszlop1= false;
                sor7oszlop1Nev="n";
            }else if (eraptEgymasra ==18) {
                sor8oszlop1= false;
                sor8oszlop1Nev="n";
            }else if (eraptEgymasra ==19) {
                sor9oszlop1= false;
                sor9oszlop1Nev="n";
            }else if (eraptEgymasra ==110) {
                sor10oszlop1= false;
                sor10oszlop1Nev="n";
            }else if (eraptEgymasra ==21) {
                sor1oszlop2= false;
                sor1oszlop2Nev="n";
            }else if (eraptEgymasra ==22) {
                sor2oszlop2= false;
                sor2oszlop2Nev="n";
            }else if (eraptEgymasra ==23) {
                sor3oszlop2= false;
                sor3oszlop2Nev="n";
            }else if (eraptEgymasra ==24) {
                sor4oszlop2= false;
                sor4oszlop2Nev="n";
            }else if (eraptEgymasra ==25) {
                sor5oszlop2= false;
                sor5oszlop2Nev="n";
            }else if (eraptEgymasra ==26) {
                sor6oszlop2= false;
                sor6oszlop2Nev="n";
            }else if (eraptEgymasra ==27) {
                sor7oszlop2= false;
                sor7oszlop2Nev="n";
            }else if (eraptEgymasra ==28) {
                sor8oszlop2= false;
                sor8oszlop2Nev="n";
            }else if (eraptEgymasra ==29) {
                sor9oszlop2= false;
                sor9oszlop2Nev="n";
            }else if (eraptEgymasra ==210) {
                sor10oszlop2= false;
                sor10oszlop2Nev="n";
            }else if (eraptEgymasra ==31) {
                sor1oszlop3= false;
                sor1oszlop3Nev="n";
            }else if (eraptEgymasra ==32) {
                sor2oszlop3= false;
                sor2oszlop3Nev="n";
            }else if (eraptEgymasra ==33) {
                sor3oszlop3= false;
                sor3oszlop3Nev="n";
            }else if (eraptEgymasra ==34) {
                sor4oszlop3= false;
                sor4oszlop3Nev="n";
            }else if (eraptEgymasra ==35) {
                sor5oszlop3= false;
                sor5oszlop3Nev="n";
            }else if (eraptEgymasra ==36) {
                sor6oszlop3= false;
                sor6oszlop3Nev="n";
            }else if (eraptEgymasra ==37) {
                sor7oszlop3= false;
                sor7oszlop3Nev="n";
            }else if (eraptEgymasra ==38) {
                sor8oszlop3= false;
                sor8oszlop3Nev="n";
            }else if (eraptEgymasra ==39) {
                sor9oszlop3= false;
                sor9oszlop3Nev="n";
            }else if (eraptEgymasra ==310) {
                sor10oszlop3= false;
                sor10oszlop3Nev="n";
            }else if (eraptEgymasra ==41) {
                sor1oszlop4= false;
                sor1oszlop4Nev="n";
            }else if (eraptEgymasra ==42) {
                sor2oszlop4= false;
                sor2oszlop4Nev="n";
            }else if (eraptEgymasra ==43) {
                sor3oszlop4= false;
                sor3oszlop4Nev="n";
            }else if (eraptEgymasra ==44) {
                sor4oszlop4= false;
                sor4oszlop4Nev="n";
            }else if (eraptEgymasra ==45) {
                sor5oszlop4= false;
                sor5oszlop4Nev="n";
            }else if (eraptEgymasra ==46) {
                sor6oszlop4= false;
                sor6oszlop4Nev="n";
            }else if (eraptEgymasra ==47) {
                sor7oszlop4= false;
                sor7oszlop4Nev="n";
            }else if (eraptEgymasra ==48) {
                sor8oszlop4= false;
                sor8oszlop4Nev="n";
            }else if (eraptEgymasra ==49) {
                sor9oszlop4= false;
                sor9oszlop4Nev="n";
            }else if (eraptEgymasra ==410) {
                sor10oszlop4= false;
                sor10oszlop4Nev="n";
            }else if (eraptEgymasra ==51) {
                sor1oszlop5= false;
                sor1oszlop5Nev="n";
            }else if (eraptEgymasra ==52) {
                sor2oszlop5= false;
                sor2oszlop5Nev="n";
            }else if (eraptEgymasra ==53) {
                sor3oszlop5= false;
                sor3oszlop5Nev="n";
            }else if (eraptEgymasra ==54) {
                sor4oszlop5= false;
                sor4oszlop5Nev="n";
            }else if (eraptEgymasra ==55) {
                sor5oszlop5= false;
                sor5oszlop5Nev="n";
            }else if (eraptEgymasra ==56) {
                sor6oszlop5= false;
                sor6oszlop5Nev="n";
            }else if (eraptEgymasra ==57) {
                sor7oszlop5= false;
                sor7oszlop5Nev="n";
            }else if (eraptEgymasra ==58) {
                sor8oszlop5= false;
                sor8oszlop5Nev="n";
            }else if (eraptEgymasra ==59) {
                sor9oszlop5= false;
                sor9oszlop5Nev="n";
            }else if (eraptEgymasra ==510) {
                sor10oszlop5= false;
                sor10oszlop5Nev="n";
            }else if (eraptEgymasra ==61) {
                sor1oszlop6= false;
                sor1oszlop6Nev="n";
            }else if (eraptEgymasra ==62) {
                sor2oszlop6= false;
                sor2oszlop6Nev="n";
            }else if (eraptEgymasra ==63) {
                sor3oszlop6= false;
                sor3oszlop6Nev="n";
            }else if (eraptEgymasra ==64) {
                sor4oszlop6= false;
                sor4oszlop6Nev="n";
            }else if (eraptEgymasra ==65) {
                sor5oszlop6= false;
                sor5oszlop6Nev="n";
            }else if (eraptEgymasra ==66) {
                sor6oszlop6= false;
                sor6oszlop6Nev="n";
            }else if (eraptEgymasra ==67) {
                sor7oszlop6= false;
                sor7oszlop6Nev="n";
            }else if (eraptEgymasra ==68) {
                sor8oszlop6= false;
                sor8oszlop6Nev="n";
            }else if (eraptEgymasra ==69) {
                sor9oszlop6= false;
                sor9oszlop6Nev="n";
            }else if (eraptEgymasra ==610) {
                sor10oszlop6= false;
                sor10oszlop6Nev="n";
            }else if (eraptEgymasra ==71) {
                sor1oszlop7= false;
                sor1oszlop7Nev="n";
            }else if (eraptEgymasra ==72) {
                sor2oszlop7= false;
                sor2oszlop7Nev="n";
            }else if (eraptEgymasra ==73) {
                sor3oszlop7= false;
                sor3oszlop7Nev="n";
            }else if (eraptEgymasra ==74) {
                sor4oszlop7= false;
                sor4oszlop7Nev="n";
            }else if (eraptEgymasra ==75) {
                sor5oszlop7= false;
                sor5oszlop7Nev="n";
            }else if (eraptEgymasra ==76) {
                sor6oszlop7= false;
                sor6oszlop7Nev="n";
            }else if (eraptEgymasra ==77) {
                sor7oszlop7= false;
                sor7oszlop7Nev="n";
            }else if (eraptEgymasra ==78) {
                sor8oszlop7= false;
                sor8oszlop7Nev="n";
            }else if (eraptEgymasra ==79) {
                sor9oszlop7= false;
                sor9oszlop7Nev="n";
            }else if (eraptEgymasra ==710) {
                sor10oszlop7= false;
                sor10oszlop7Nev="n";
            }else if (eraptEgymasra ==81) {
                sor1oszlop8= false;
                sor1oszlop8Nev="n";
            }else if (eraptEgymasra ==82) {
                sor2oszlop8= false;
                sor2oszlop8Nev="n";
            }else if (eraptEgymasra ==83) {
                sor3oszlop8= false;
                sor3oszlop8Nev="n";
            }else if (eraptEgymasra ==84) {
                sor4oszlop8= false;
                sor4oszlop8Nev="n";
            }else if (eraptEgymasra ==85) {
                sor5oszlop8= false;
                sor5oszlop8Nev="n";
            }else if (eraptEgymasra ==86) {
                sor6oszlop8= false;
                sor6oszlop8Nev="n";
            }else if (eraptEgymasra ==87) {
                sor7oszlop8= false;
                sor7oszlop8Nev="n";
            }else if (eraptEgymasra ==88) {
                sor8oszlop8= false;
                sor8oszlop8Nev="n";
            }else if (eraptEgymasra ==89) {
                sor9oszlop8= false;
                sor9oszlop8Nev="n";
            }else if (eraptEgymasra ==810) {
                sor10oszlop8= false;
                sor10oszlop8Nev="n";
            }else if (eraptEgymasra ==91) {
                sor1oszlop9= false;
                sor1oszlop9Nev="n";
            }else if (eraptEgymasra ==92) {
                sor2oszlop9= false;
                sor2oszlop9Nev="n";
            }else if (eraptEgymasra ==93) {
                sor3oszlop9= false;
                sor3oszlop9Nev="n";
            }else if (eraptEgymasra ==94) {
                sor4oszlop9= false;
                sor4oszlop9Nev="n";
            }else if (eraptEgymasra ==95) {
                sor5oszlop9= false;
                sor5oszlop9Nev="n";
            }else if (eraptEgymasra ==96) {
                sor6oszlop9= false;
                sor6oszlop9Nev="n";
            }else if (eraptEgymasra ==97) {
                sor7oszlop9= false;
                sor7oszlop9Nev="n";
            }else if (eraptEgymasra ==98) {
                sor8oszlop9= false;
                sor8oszlop9Nev="n";
            }else if (eraptEgymasra ==99) {
                sor9oszlop9= false;
                sor9oszlop9Nev="n";
            }else if (eraptEgymasra ==910) {
                sor10oszlop9= false;
                sor10oszlop9Nev="n";
            }else if (eraptEgymasra ==101) {
                sor1oszlop10= false;
                sor1oszlop10Nev="n";
            }else if (eraptEgymasra ==102) {
                sor2oszlop10= false;
                sor2oszlop10Nev="n";
            }else if (eraptEgymasra ==103) {
                sor3oszlop10= false;
                sor3oszlop10Nev="n";
            }else if (eraptEgymasra ==104) {
                sor4oszlop10= false;
                sor4oszlop10Nev="n";
            }else if (eraptEgymasra ==105) {
                sor5oszlop10= false;
                sor5oszlop10Nev="n";
            }else if (eraptEgymasra ==106) {
                sor6oszlop10= false;
                sor6oszlop10Nev="n";
            }else if (eraptEgymasra ==107) {
                sor7oszlop10= false;
                sor7oszlop10Nev="n";
            }else if (eraptEgymasra ==108) {
                sor8oszlop10= false;
                sor8oszlop10Nev="n";
            }else if (eraptEgymasra ==109) {
                sor9oszlop10= false;
                sor9oszlop10Nev="n";
            }else if (eraptEgymasra ==1010) {
                sor10oszlop10= false;
                sor10oszlop10Nev="n";
            }else if (eraptEgymasra ==111) {
                sor1oszlop11= false;
                sor1oszlop11Nev="n";
            }else if (eraptEgymasra ==112) {
                sor2oszlop11= false;
                sor2oszlop11Nev="n";
            }else if (eraptEgymasra ==113) {
                sor3oszlop11= false;
                sor3oszlop11Nev="n";
            }else if (eraptEgymasra ==114) {
                sor4oszlop11= false;
                sor4oszlop11Nev="n";
            }else if (eraptEgymasra ==115) {
                sor5oszlop11= false;
                sor5oszlop11Nev="n";
            }else if (eraptEgymasra ==116) {
                sor6oszlop11= false;
                sor6oszlop11Nev="n";
            }else if (eraptEgymasra ==117) {
                sor7oszlop11= false;
                sor7oszlop11Nev="n";
            }else if (eraptEgymasra ==118) {
                sor8oszlop11= false;
                sor8oszlop11Nev="n";
            }else if (eraptEgymasra ==119) {
                sor9oszlop11= false;
                sor9oszlop11Nev="n";
            }else if (eraptEgymasra ==1110) {
                sor10oszlop11= false;
                sor10oszlop11Nev="n";
            }else if (eraptEgymasra ==121) {
                sor1oszlop12= false;
                sor1oszlop12Nev="n";
            }else if (eraptEgymasra ==122) {
                sor2oszlop12= false;
                sor2oszlop12Nev="n";
            }else if (eraptEgymasra ==123) {
                sor3oszlop12= false;
                sor3oszlop12Nev="n";
            }else if (eraptEgymasra ==124) {
                sor4oszlop12= false;
                sor4oszlop12Nev="n";
            }else if (eraptEgymasra ==125) {
                sor5oszlop12= false;
                sor5oszlop12Nev="n";
            }else if (eraptEgymasra ==126) {
                sor6oszlop12= false;
                sor6oszlop12Nev="n";
            }else if (eraptEgymasra ==127) {
                sor7oszlop12= false;
                sor7oszlop12Nev="n";
            }else if (eraptEgymasra ==128) {
                sor8oszlop12= false;
                sor8oszlop12Nev="n";
            }else if (eraptEgymasra ==129) {
                sor9oszlop12= false;
                sor9oszlop12Nev="n";
            }else if (eraptEgymasra ==1210) {
                sor10oszlop12= false;
                sor10oszlop12Nev="n";
            }
            eraptEgymasra =poz;
        }
    }
}