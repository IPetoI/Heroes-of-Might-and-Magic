package Jatek;

import Egysegek.EgysegLetetel;
import Egysegek.EgysegekNeEgymasra;

import javax.swing.*;

import static Egysegek.Egyseg.*;
import static Egysegek.EgysegLetetel.*;
import static Egysegek.EgysegSzam.*;
import static Egysegek.EgysegVan.*;
import static Egysegek.Eletero.egysegEletereje;
import static Egysegek.Sebesseg.mekkoraTavolsagod;
import static Ablakok.EgysegLepakolasAblak.ablakLepakolas;
import static Jatek.Valasztas.lovage;

public class XYKordinatakBemenet {

    private static XYKordinatakBemenet instance = null;

    public static JButton felteszGomb0;
    public static JButton felteszGomb1;
    public static JButton felteszGomb2;
    public static JButton felteszGomb3;
    public static JButton felteszGomb4;

    JSpinner egysegY0, egysegX0;
    JSpinner egysegY1, egysegX1;
    JSpinner egysegY2, egysegX2;
    JSpinner egysegY3, egysegX3;
    JSpinner egysegY4, egysegX4;

    public static boolean sor1oszlop1=false,sor1oszlop2=false,sor2oszlop1=false,sor2oszlop2=false,sor3oszlop1=false;
    public static boolean sor4oszlop1=false,sor4oszlop2=false,sor5oszlop1=false,sor5oszlop2=false,sor6oszlop1=false;
    public static boolean sor7oszlop1=false,sor7oszlop2=false,sor8oszlop1=false,sor8oszlop2=false,sor9oszlop1=false;
    public static boolean sor10oszlop1=false,sor10oszlop2=false,sor3oszlop2=false,sor6oszlop2=false,sor9oszlop2=false;
    public static boolean sor10oszlop3=false,sor9oszlop3=false,sor8oszlop3=false,sor7oszlop3=false,sor6oszlop3=false;
    public static boolean sor5oszlop3=false,sor4oszlop3=false,sor3oszlop3=false,sor2oszlop3=false,sor1oszlop3=false;
    public static boolean sor10oszlop4=false,sor9oszlop4=false,sor8oszlop4=false,sor7oszlop4=false,sor6oszlop4=false;
    public static boolean sor5oszlop4=false,sor4oszlop4=false,sor3oszlop4=false,sor2oszlop4=false,sor1oszlop4=false;
    public static boolean sor10oszlop5=false,sor9oszlop5=false,sor8oszlop5=false,sor7oszlop5=false,sor6oszlop5=false;
    public static boolean sor5oszlop5=false,sor4oszlop5=false,sor3oszlop5=false,sor2oszlop5=false,sor1oszlop5=false;
    public static boolean sor10oszlop6=false,sor9oszlop6=false,sor8oszlop6=false,sor7oszlop6=false,sor6oszlop6=false;
    public static boolean sor5oszlop6=false,sor4oszlop6=false,sor3oszlop6=false,sor2oszlop6=false,sor1oszlop6=false;
    public static boolean sor10oszlop7=false,sor9oszlop7=false,sor8oszlop7=false,sor7oszlop7=false,sor6oszlop7=false;
    public static boolean sor5oszlop7=false,sor4oszlop7=false,sor3oszlop7=false,sor2oszlop7=false,sor1oszlop7=false;
    public static boolean sor10oszlop8=false,sor9oszlop8=false,sor8oszlop8=false,sor7oszlop8=false,sor6oszlop8=false;
    public static boolean sor5oszlop8=false,sor4oszlop8=false,sor3oszlop8=false,sor2oszlop8=false,sor1oszlop8=false;
    public static boolean sor10oszlop9=false,sor9oszlop9=false,sor8oszlop9=false,sor7oszlop9=false,sor6oszlop9=false;
    public static boolean sor5oszlop9=false,sor4oszlop9=false,sor3oszlop9=false,sor2oszlop9=false,sor1oszlop9=false;
    public static boolean sor10oszlop10=false,sor9oszlop10=false,sor8oszlop10=false,sor7oszlop10=false,sor6oszlop10=false;
    public static boolean sor5oszlop10=false,sor4oszlop10=false,sor3oszlop10=false,sor2oszlop10=false,sor1oszlop10=false;
    public static boolean sor10oszlop11=false,sor9oszlop11=false,sor8oszlop11=false,sor7oszlop11=false,sor6oszlop11=false;
    public static boolean sor5oszlop11=false,sor4oszlop11=false,sor3oszlop11=false,sor2oszlop11=false,sor1oszlop11=false;
    public static boolean sor10oszlop12=false,sor9oszlop12=false,sor8oszlop12=false,sor7oszlop12=false,sor6oszlop12=false;
    public static boolean sor5oszlop12=false,sor4oszlop12=false,sor3oszlop12=false,sor2oszlop12=false,sor1oszlop12=false;

    public static String sor1oszlop1Nev="n",sor1oszlop2Nev="n",sor2oszlop1Nev="n",sor2oszlop2Nev="n",sor3oszlop1Nev="n";
    public static String sor4oszlop1Nev="n",sor4oszlop2Nev="n",sor5oszlop1Nev="n",sor5oszlop2Nev="n",sor6oszlop1Nev="n";
    public static String sor7oszlop1Nev="n",sor7oszlop2Nev="n",sor8oszlop1Nev="n",sor8oszlop2Nev="n",sor9oszlop1Nev="n";
    public static String sor10oszlop1Nev="n",sor10oszlop2Nev="n",sor3oszlop2Nev="n",sor6oszlop2Nev="n",sor9oszlop2Nev="n";
    public static String sor10oszlop3Nev="n",sor9oszlop3Nev="n",sor8oszlop3Nev="n",sor7oszlop3Nev="n",sor6oszlop3Nev="n";
    public static String sor5oszlop3Nev="n",sor4oszlop3Nev="n",sor3oszlop3Nev="n",sor2oszlop3Nev="n",sor1oszlop3Nev="n";
    public static String sor10oszlop4Nev="n",sor9oszlop4Nev="n",sor8oszlop4Nev="n",sor7oszlop4Nev="n",sor6oszlop4Nev="n";
    public static String sor5oszlop4Nev="n",sor4oszlop4Nev="n",sor3oszlop4Nev="n",sor2oszlop4Nev="n",sor1oszlop4Nev="n";
    public static String sor10oszlop5Nev="n",sor9oszlop5Nev="n",sor8oszlop5Nev="n",sor7oszlop5Nev="n",sor6oszlop5Nev="n";
    public static String sor5oszlop5Nev="n",sor4oszlop5Nev="n",sor3oszlop5Nev="n",sor2oszlop5Nev="n",sor1oszlop5Nev="n";
    public static String sor10oszlop6Nev="n",sor9oszlop6Nev="n",sor8oszlop6Nev="n",sor7oszlop6Nev="n",sor6oszlop6Nev="n";
    public static String sor5oszlop6Nev="n",sor4oszlop6Nev="n",sor3oszlop6Nev="n",sor2oszlop6Nev="n",sor1oszlop6Nev="n";
    public static String sor10oszlop7Nev="n",sor9oszlop7Nev="n",sor8oszlop7Nev="n",sor7oszlop7Nev="n",sor6oszlop7Nev="n";
    public static String sor5oszlop7Nev="n",sor4oszlop7Nev="n",sor3oszlop7Nev="n",sor2oszlop7Nev="n",sor1oszlop7Nev="n";
    public static String sor10oszlop8Nev="n",sor9oszlop8Nev="n",sor8oszlop8Nev="n",sor7oszlop8Nev="n",sor6oszlop8Nev="n";
    public static String sor5oszlop8Nev="n",sor4oszlop8Nev="n",sor3oszlop8Nev="n",sor2oszlop8Nev="n",sor1oszlop8Nev="n";
    public static String sor10oszlop9Nev="n",sor9oszlop9Nev="n",sor8oszlop9Nev="n",sor7oszlop9Nev="n",sor6oszlop9Nev="n";
    public static String sor5oszlop9Nev="n",sor4oszlop9Nev="n",sor3oszlop9Nev="n",sor2oszlop9Nev="n",sor1oszlop9Nev="n";
    public static String sor10oszlop10Nev="n",sor9oszlop10Nev="n",sor8oszlop10Nev="n",sor7oszlop10Nev="n",sor6oszlop10Nev="n";
    public static String sor5oszlop10Nev="n",sor4oszlop10Nev="n",sor3oszlop10Nev="n",sor2oszlop10Nev="n",sor1oszlop10Nev="n";
    public static String sor10oszlop11Nev="n",sor9oszlop11Nev="n",sor8oszlop11Nev="n",sor7oszlop11Nev="n",sor6oszlop11Nev="n";
    public static String sor5oszlop11Nev="n",sor4oszlop11Nev="n",sor3oszlop11Nev="n",sor2oszlop11Nev="n",sor1oszlop11Nev="n";
    public static String sor10oszlop12Nev="n",sor9oszlop12Nev="n",sor8oszlop12Nev="n",sor7oszlop12Nev="n",sor6oszlop12Nev="n";
    public static String sor5oszlop12Nev="n",sor4oszlop12Nev="n",sor3oszlop12Nev="n",sor2oszlop12Nev="n",sor1oszlop12Nev="n";


    static int elsoS =0;
    static int masodikS=0;
    static int harmadikS=0;
    public static int negyedikS=0;
    static int otodikS=0;
    static int elsoO =0;
    static int masodikO=0;
    static int harmadikO=0;
    public static int negyedikO=0;
    static int otodikO=0;

    public static int masodikEgysegPoz=0;
    public static int elsoEgysegPoz=0;
    public static int harmadikEgysegPoz=0;
    public static int negyedikEgysegPoz=0;
    public static int otodikEgysegPoz=0;

    public static String egysegEgy="n";
    public static String egysegKetto="n";
    public static String egysegHarom="n";
    public static String egysegNegy="n";
    public static String egysegOt="n";

    public static boolean mehet=true;
    public static String egyseg="n";

    public XYKordinatakBemenet() {

        EgysegLetetel egysegLetet = EgysegLetetel.getInstance();

        felteszGomb0 = new JButton();
        felteszGomb1 = new JButton();
        felteszGomb2 = new JButton();
        felteszGomb3 = new JButton();
        felteszGomb4 = new JButton();

        elsoY= new SpinnerListModel(sorTomb);
        elsoX= new SpinnerNumberModel(1,1,2,1);
        masodikY= new SpinnerListModel(sorTomb);
        masodikX= new SpinnerNumberModel(1,1,2,1);
        harmadikY= new SpinnerListModel(sorTomb);
        harmadikX= new SpinnerNumberModel(1,1,2,1);
        negyedikY= new SpinnerListModel(sorTomb);
        negyedikX= new SpinnerNumberModel(1,1,2,1);
        otodikY= new SpinnerListModel(sorTomb);
        otodikX= new SpinnerNumberModel(1,1,2,1);

        egysegY0 = new JSpinner(elsoY);
        egysegY1 = new JSpinner(masodikY);
        egysegY2 = new JSpinner(harmadikY);
        egysegY3 = new JSpinner(negyedikY);
        egysegY4 = new JSpinner(otodikY);

        egysegX0 = new JSpinner(elsoX);
        egysegX1 = new JSpinner(masodikX);
        egysegX2 = new JSpinner(harmadikX);
        egysegX3 = new JSpinner(negyedikX);
        egysegX4 = new JSpinner(otodikX);

        ((JSpinner.DefaultEditor) egysegX0.getEditor()).getTextField().setEditable(false);
        ((JSpinner.DefaultEditor) egysegX1.getEditor()).getTextField().setEditable(false);
        ((JSpinner.DefaultEditor) egysegX2.getEditor()).getTextField().setEditable(false);
        ((JSpinner.DefaultEditor) egysegX3.getEditor()).getTextField().setEditable(false);
        ((JSpinner.DefaultEditor) egysegX4.getEditor()).getTextField().setEditable(false);

        ((JSpinner.DefaultEditor) egysegY0.getEditor()).getTextField().setEditable(false);
        ((JSpinner.DefaultEditor) egysegY1.getEditor()).getTextField().setEditable(false);
        ((JSpinner.DefaultEditor) egysegY2.getEditor()).getTextField().setEditable(false);
        ((JSpinner.DefaultEditor) egysegY3.getEditor()).getTextField().setEditable(false);
        ((JSpinner.DefaultEditor) egysegY4.getEditor()).getTextField().setEditable(false);


        felteszGomb0.addActionListener(e -> {

            oszlop=(Integer)elsoX.getValue();
            sor=(Integer)elsoY.getValue();

            elsoS=sor;
            elsoO=oszlop;
            elsoEgysegPoz=Integer.parseInt(String.valueOf(elsoS) + String.valueOf(elsoO));

            if (lovage==0) {
                dbSzamElso=foldmuvesSzam;
                egysegL1TestKepe.setIcon(foldmuvesTest);
                egyseg="foldmuv";
                egysegEgy=egyseg;
            }else if (lovage == 1) {
                dbSzamElso= csontvazSzam;
                egysegL1TestKepe.setIcon(csontvazTest);
                egyseg="csont";
                egysegEgy=egyseg;
            }
            if (dbSzamElso>0) {
                if (oszlop==1 ) {
                    xKep=284;
                    xIras=354;
                }else if (oszlop==2) {
                    xKep=342;
                    xIras=412;
                }

                if ((sor==1 && oszlop==1) || (sor==1 && oszlop==2) ) {
                    yKep=26;
                    yIras=91;
                }else if ((sor==2 && oszlop==1) || (sor==2 && oszlop==2) ){
                    yKep=65;
                    yIras=129;
                }else if ((sor==3 && oszlop==1) || (sor==3 && oszlop==2) ){
                    yKep=105;
                    yIras=169;
                }else if ((sor==4 && oszlop==1) || (sor==4 && oszlop==2) ){
                    yKep=144;
                    yIras=208;
                }else if ((sor==5 && oszlop==1) || (sor==5 && oszlop==2) ){
                    yKep=183;
                    yIras=247;
                }else if ((sor==6 && oszlop==1) || (sor==6 && oszlop==2) ){
                    yKep=222;
                    yIras=287;
                }else if ((sor==7 && oszlop==1) || (sor==7 && oszlop==2) ){
                    yKep=262;
                    yIras=326;
                }else if ((sor==8 && oszlop==1) || (sor==8 && oszlop==2) ){
                    yKep=302;
                    yIras=366;
                }else if ((sor==9 && oszlop==1) || (sor==9 && oszlop==2) ){
                    yKep=340;
                    yIras=404;
                }else if ((sor==10 && oszlop==1) || (sor==10 && oszlop==2) ){
                    yKep=380;
                    yIras=444;
                }

                EgysegekNeEgymasra.holVagyKetto(oszlop, sor,egysegEgy);
                EgysegekNeEgymasra.holVagyEgy(oszlop, sor,egysegEgy);
                EgysegekNeEgymasra.neMenjenEgymasraVan(oszlop, sor,egysegEgy);

                if ((lovage==1 && csontvazSzam>0 && mehet) || (lovage==0 && foldmuvesSzam>0 && mehet)) {

                    mekkoraTavolsagod(egysegEgy);
                    egysegEletereje(egysegEgy,dbSzamElso);
                    egysegLetet.egysegKitetel1();

                    elsoEgysegSzam=0;
                    elsoEgysegSzamErtek.setText((int)elsoEgysegSzam+" db");
                    if (lovage==1) {
                        egysegL1Kep.setVisible(true);
                        egysegL1Kepe.setIcon(csontvazff);
                    }else if (lovage==0) {
                        egysegL1Kep.setVisible(true);
                        egysegL1Kepe.setIcon(foldmuvesff);
                    }
                }
                mehet=true;
            }
        });
        felteszGomb1.addActionListener(e -> {

            oszlop=(Integer)masodikX.getValue();
            sor=(Integer)masodikY.getValue();

            masodikS=sor;
            masodikO=oszlop;
            masodikEgysegPoz=Integer.parseInt(String.valueOf(masodikS) + String.valueOf(masodikO));

            if (lovage==0) {
                dbSzamMasodik=ijaszSzam;
                egysegL2TestKepe.setIcon(ijaszTest);
                egyseg="ijas";
                egysegKetto=egyseg;
            }else if (lovage == 1) {
                dbSzamMasodik= felderitoSzam;
                egysegL2TestKepe.setIcon(felderitoTest);
                egyseg="felder";
                egysegKetto=egyseg;
            }
            if (dbSzamMasodik>0) {
                if (oszlop==1 ) {
                    xKep=284;
                    xIras=354;
                }else if (oszlop==2) {
                    xKep=342;
                    xIras=412;
                }

                 if ((sor==1 && oszlop==1) || (sor==1 && oszlop==2) ) {
                    yKep=26;
                    yIras=91;
                }else if ((sor==2 && oszlop==1) || (sor==2 && oszlop==2) ){
                    yKep=65;
                    yIras=129;
                }else if ((sor==3 && oszlop==1) || (sor==3 && oszlop==2) ){
                    yKep=105;
                    yIras=169;
                }else if ((sor==4 && oszlop==1) || (sor==4 && oszlop==2) ){
                    yKep=144;
                    yIras=208;
                }else if ((sor==5 && oszlop==1) || (sor==5 && oszlop==2) ){
                    yKep=183;
                    yIras=247;
                }else if ((sor==6 && oszlop==1) || (sor==6 && oszlop==2) ){
                    yKep=222;
                    yIras=287;
                }else if ((sor==7 && oszlop==1) || (sor==7 && oszlop==2) ){
                    yKep=262;
                    yIras=326;
                }else if ((sor==8 && oszlop==1) || (sor==8 && oszlop==2) ){
                    yKep=302;
                    yIras=366;
                }else if ((sor==9 && oszlop==1) || (sor==9 && oszlop==2) ){
                    yKep=340;
                    yIras=404;
                }else if ((sor==10 && oszlop==1) || (sor==10 && oszlop==2) ){
                    yKep=380;
                    yIras=444;
                }

                EgysegekNeEgymasra.holVagyKetto(oszlop, sor,egysegKetto);
                EgysegekNeEgymasra.holVagyEgy(oszlop, sor,egysegKetto);
                EgysegekNeEgymasra.neMenjenEgymasraVan(oszlop, sor,egysegKetto);

                if ((lovage==1 && felderitoSzam>0 && mehet) || (lovage==0 && ijaszSzam>0 && mehet)) {

                    mekkoraTavolsagod(egysegKetto);
                    egysegEletereje(egysegKetto,dbSzamMasodik);
                    egysegLetet.egysegKitetel2();

                    masodikEgysegSzam=0;
                    masodikEgysegSzamErtek.setText((int)masodikEgysegSzam +" db");
                    if (lovage==1) {
                        egysegL2Kep.setVisible(true);
                        egysegL2Kepe.setIcon(felderitoff);
                    }else if (lovage==0) {
                        egysegL2Kep.setVisible(true);
                        egysegL2Kepe.setIcon(ijaszff);
                    }
                }
                mehet=true;
            }
        });
        felteszGomb2.addActionListener(e -> {
            oszlop=(Integer)harmadikX.getValue();
            sor=(Integer)harmadikY.getValue();

            harmadikS=sor;
            harmadikO=oszlop;
            harmadikEgysegPoz=Integer.parseInt(String.valueOf(harmadikS) + String.valueOf(harmadikO));

            if (lovage==0) {
                dbSzamHarmadik=griffSzam;
                egysegL3TestKepe.setIcon(griffTest);
                egyseg="grif";
                egysegHarom=egyseg;
            }else if (lovage == 1) {
                dbSzamHarmadik= minotaurSzam;
                egysegL3TestKepe.setIcon(minotauroszTest);
                egyseg="mino";
                egysegHarom=egyseg;
            }
            if (dbSzamHarmadik>0) {
                if (oszlop==1 ) {
                    xKep=284;
                    xIras=354;
                }else if (oszlop==2) {
                    xKep=342;
                    xIras=412;
                }

                 if ((sor==1 && oszlop==1) || (sor==1 && oszlop==2) ) {
                    yKep=26;
                    yIras=91;
                }else if ((sor==2 && oszlop==1) || (sor==2 && oszlop==2) ){
                    yKep=65;
                    yIras=129;
                }else if ((sor==3 && oszlop==1) || (sor==3 && oszlop==2) ){
                    yKep=105;
                    yIras=169;
                }else if ((sor==4 && oszlop==1) || (sor==4 && oszlop==2) ){
                    yKep=144;
                    yIras=208;
                }else if ((sor==5 && oszlop==1) || (sor==5 && oszlop==2) ){
                    yKep=183;
                    yIras=247;
                }else if ((sor==6 && oszlop==1) || (sor==6 && oszlop==2) ){
                    yKep=222;
                    yIras=287;
                }else if ((sor==7 && oszlop==1) || (sor==7 && oszlop==2) ){
                    yKep=262;
                    yIras=326;
                }else if ((sor==8 && oszlop==1) || (sor==8 && oszlop==2) ){
                    yKep=302;
                    yIras=366;
                }else if ((sor==9 && oszlop==1) || (sor==9 && oszlop==2) ){
                    yKep=340;
                    yIras=404;
                }else if ((sor==10 && oszlop==1) || (sor==10 && oszlop==2) ){
                    yKep=380;
                    yIras=444;
                }

                EgysegekNeEgymasra.holVagyKetto(oszlop, sor,egysegHarom);
                EgysegekNeEgymasra.holVagyEgy(oszlop, sor,egysegHarom);
                EgysegekNeEgymasra.neMenjenEgymasraVan(oszlop, sor,egysegHarom);

                if ((lovage==1 && minotaurSzam>0 && mehet) || (lovage==0 && griffSzam>0 && mehet)) {

                    mekkoraTavolsagod(egysegHarom);
                    egysegEletereje(egysegHarom,dbSzamHarmadik);
                    egysegLetet.egysegKitetel3();

                    harmadikEgysegSzam=0;
                    harmadikEgysegSzamErtek.setText((int)harmadikEgysegSzam+" db");
                    if (lovage==1) {
                        egysegL3Kep.setVisible(true);
                        egysegL3Kepe.setIcon(minotaurff);
                    }else if (lovage==0) {
                        egysegL3Kep.setVisible(true);
                        egysegL3Kepe.setIcon(griffff);
                    }
                }
                mehet=true;
            }
        });
        felteszGomb3.addActionListener(e -> {

            oszlop=(Integer)negyedikX.getValue();
            sor=(Integer)negyedikY.getValue();

            negyedikS=sor;
            negyedikO=oszlop;
            negyedikEgysegPoz=Integer.parseInt(String.valueOf(negyedikS) + String.valueOf(negyedikO));

            if (lovage==0) {
                dbSzamNegyedik=fegyvernokSzam;
                egysegL4TestKepe.setIcon(fegyvernokTest);
                egyseg="fegyv";
                egysegNegy=egyseg;
            }else if (lovage == 1) {
                dbSzamNegyedik= orgyilkosSzam;
                egysegL4TestKepe.setIcon(orgyilkosTest);
                egyseg="orgy";
                egysegNegy=egyseg;
            }
            if (dbSzamNegyedik>0) {
                if (oszlop==1 ) {
                    xKep=284;
                    xIras=354;
                }else if (oszlop==2) {
                    xKep=342;
                    xIras=412;
                }

                 if ((sor==1 && oszlop==1) || (sor==1 && oszlop==2) ) {
                    yKep=26;
                    yIras=91;
                }else if ((sor==2 && oszlop==1) || (sor==2 && oszlop==2) ){
                    yKep=65;
                    yIras=129;
                }else if ((sor==3 && oszlop==1) || (sor==3 && oszlop==2) ){
                    yKep=105;
                    yIras=169;
                }else if ((sor==4 && oszlop==1) || (sor==4 && oszlop==2) ){
                    yKep=144;
                    yIras=208;
                }else if ((sor==5 && oszlop==1) || (sor==5 && oszlop==2) ){
                    yKep=183;
                    yIras=247;
                }else if ((sor==6 && oszlop==1) || (sor==6 && oszlop==2) ){
                    yKep=222;
                    yIras=287;
                }else if ((sor==7 && oszlop==1) || (sor==7 && oszlop==2) ){
                    yKep=262;
                    yIras=326;
                }else if ((sor==8 && oszlop==1) || (sor==8 && oszlop==2) ){
                    yKep=302;
                    yIras=366;
                }else if ((sor==9 && oszlop==1) || (sor==9 && oszlop==2) ){
                    yKep=340;
                    yIras=404;
                }else if ((sor==10 && oszlop==1) || (sor==10 && oszlop==2) ){
                    yKep=380;
                    yIras=444;
                }

                EgysegekNeEgymasra.holVagyKetto(oszlop, sor,egysegNegy);
                EgysegekNeEgymasra.holVagyEgy(oszlop, sor,egysegNegy);
                EgysegekNeEgymasra.neMenjenEgymasraVan(oszlop, sor,egysegNegy);

                if ((lovage==1 && orgyilkosSzam>0 && mehet) || (lovage==0 && fegyvernokSzam>0 && mehet)) {

                    mekkoraTavolsagod(egysegNegy);
                    egysegEletereje(egysegNegy,dbSzamNegyedik);
                    egysegLetet.egysegKitetel4();

                    negyedikEgysegSzam=0;
                    negyedikEgysegSzamErtek.setText((int)negyedikEgysegSzam+" db");
                    if (lovage==1) {
                        egysegL4Kep.setVisible(true);
                        egysegL4Kepe.setIcon(orgyilkosff);
                    }else if (lovage==0) {
                        egysegL4Kep.setVisible(true);
                        egysegL4Kepe.setIcon(fegyvernokff);
                    }
                }
                mehet=true;
            }
        });
        felteszGomb4.addActionListener(e -> {

            oszlop=(Integer)otodikX.getValue();
            sor=(Integer)otodikY.getValue();

            otodikS=sor;
            otodikO=oszlop;
            otodikEgysegPoz=Integer.parseInt(String.valueOf(otodikS) + String.valueOf(otodikO));

            if (lovage==0) {
                dbSzamOtodik=harcosPapSzam;
                egysegL5TestKepe.setIcon(harcospapTest);
                egyseg="harcp";
                egysegOt=egyseg;
            }else if (lovage == 1) {
                dbSzamOtodik= raptorLovasSzam;
                egysegL5TestKepe.setIcon(raptorlovasTest);
                egyseg="rapt";
                egysegOt=egyseg;
            }
            if (dbSzamOtodik>0) {
                if (oszlop==1 ) {
                    xKep=284;
                    xIras=354;
                }else if (oszlop==2) {
                    xKep=342;
                    xIras=412;
                }

                 if ((sor==1 && oszlop==1) || (sor==1 && oszlop==2) ) {
                    yKep=26;
                    yIras=91;
                }else if ((sor==2 && oszlop==1) || (sor==2 && oszlop==2) ){
                    yKep=65;
                    yIras=129;
                }else if ((sor==3 && oszlop==1) || (sor==3 && oszlop==2) ){
                    yKep=105;
                    yIras=169;
                }else if ((sor==4 && oszlop==1) || (sor==4 && oszlop==2) ){
                    yKep=144;
                    yIras=208;
                }else if ((sor==5 && oszlop==1) || (sor==5 && oszlop==2) ){
                    yKep=183;
                    yIras=247;
                }else if ((sor==6 && oszlop==1) || (sor==6 && oszlop==2) ){
                    yKep=222;
                    yIras=287;
                }else if ((sor==7 && oszlop==1) || (sor==7 && oszlop==2) ){
                    yKep=262;
                    yIras=326;
                }else if ((sor==8 && oszlop==1) || (sor==8 && oszlop==2) ){
                    yKep=302;
                    yIras=366;
                }else if ((sor==9 && oszlop==1) || (sor==9 && oszlop==2) ){
                    yKep=340;
                    yIras=404;
                }else if ((sor==10 && oszlop==1) || (sor==10 && oszlop==2) ){
                    yKep=380;
                    yIras=444;
                }

                EgysegekNeEgymasra.holVagyKetto(oszlop, sor,egysegOt);
                EgysegekNeEgymasra.holVagyEgy(oszlop, sor,egysegOt);
                EgysegekNeEgymasra.neMenjenEgymasraVan(oszlop, sor,egysegOt);

                if ((lovage==1 && raptorLovasSzam>0 && mehet) || (lovage==0 && harcosPapSzam>0 && mehet)) {

                    mekkoraTavolsagod(egysegOt);
                    egysegEletereje(egysegOt,dbSzamOtodik);
                    egysegLetet.egysegKitetel5();

                    otodikEgysegSzam=0;
                    otodikEgysegSzamErtek.setText((int)otodikEgysegSzam+" db");
                    if (lovage==1) {
                        egysegL5Kep.setVisible(true);
                        egysegL5Kepe.setIcon(raptorLovasff);
                    }else if (lovage==0) {
                        egysegL5Kep.setVisible(true);
                        egysegL5Kepe.setIcon(harcosPapff);
                    }
                }
                mehet=true;
            }
        });
    }

    public static XYKordinatakBemenet getInstance() {
        if (instance == null)
            instance = new XYKordinatakBemenet();

        return instance;
    }


    public static SpinnerModel elsoY,masodikY,harmadikY,negyedikY,otodikY;
    public static SpinnerModel elsoX,masodikX,harmadikX,negyedikX,otodikX;

    public static ImageIcon foldmuvesTest = new ImageIcon("Kepek/egysegek/FoldmuvesKH.png");
    public static ImageIcon ijaszTest = new ImageIcon("Kepek/egysegek/IjaszKH.png");
    public static ImageIcon griffTest = new ImageIcon("Kepek/egysegek/GriffKH.png");
    public static ImageIcon fegyvernokTest = new ImageIcon("Kepek/egysegek/FegyvernokKH.png");
    public static ImageIcon harcospapTest = new ImageIcon("Kepek/egysegek/HarcosPapKH.png");

    public static ImageIcon csontvazTest = new ImageIcon("Kepek/egysegek/CsontvazKH.png");
    public static ImageIcon felderitoTest = new ImageIcon("Kepek/egysegek/FelderitoKH.png");
    public static ImageIcon minotauroszTest = new ImageIcon("Kepek/egysegek/MinotauroszKH.png");
    public static ImageIcon orgyilkosTest = new ImageIcon("Kepek/egysegek/OrgyilkosKH.png");
    public static ImageIcon raptorlovasTest = new ImageIcon("Kepek/egysegek/RaptorLovasKH.png");

    Integer[] sorTomb ={1,2,3,4,5,6,7,8,9,10};

    public void xyKordinatak0() {

        felteszGomb0.setBounds(121, 201, 79, 24);
        felteszGomb0.setOpaque(false);
        felteszGomb0.setContentAreaFilled(false);
        felteszGomb0.setBorderPainted(false);
        felteszGomb0.setFocusable(false);

        ablakLepakolas.add(felteszGomb0);

        egysegY0.setBounds(13,203,35,20);
        egysegX0.setBounds(63,203,35,20);

        ablakLepakolas.add(egysegY0);
        ablakLepakolas.add(egysegX0);
    }

    public void xyKordinatak1() {

        felteszGomb1.setBounds(121, 294, 79, 24);
        felteszGomb1.setOpaque(false);
        felteszGomb1.setContentAreaFilled(false);
        felteszGomb1.setBorderPainted(false);
        felteszGomb1.setFocusable(false);

        ablakLepakolas.add(felteszGomb1);

        egysegY1.setBounds(13,296,35,20);
        egysegX1.setBounds(63,296,35,20);

        ablakLepakolas.add(egysegY1);
        ablakLepakolas.add(egysegX1);
    }

    public void xyKordinatak2() {

        felteszGomb2.setBounds(121, 385, 79, 24);
        felteszGomb2.setOpaque(false);
        felteszGomb2.setContentAreaFilled(false);
        felteszGomb2.setBorderPainted(false);
        felteszGomb2.setFocusable(false);

        ablakLepakolas.add(felteszGomb2);

        egysegY2.setBounds(13,387,35,20);
        egysegX2.setBounds(63,387,35,20);

        ablakLepakolas.add(egysegY2);
        ablakLepakolas.add(egysegX2);
    }

    public void xyKordinatak3() {

        felteszGomb3.setBounds(121, 476, 79, 24);
        felteszGomb3.setOpaque(false);
        felteszGomb3.setContentAreaFilled(false);
        felteszGomb3.setBorderPainted(false);
        felteszGomb3.setFocusable(false);

        ablakLepakolas.add(felteszGomb3);

        egysegY3.setBounds(13,478,35,20);
        egysegX3.setBounds(63,478,35,20);

        ablakLepakolas.add(egysegY3);
        ablakLepakolas.add(egysegX3);
    }

    public void xyKordinatak4() {

        felteszGomb4.setBounds(121, 567, 79, 24);
        felteszGomb4.setOpaque(false);
        felteszGomb4.setContentAreaFilled(false);
        felteszGomb4.setBorderPainted(false);
        felteszGomb4.setFocusable(false);

        ablakLepakolas.add(felteszGomb4);

        egysegY4.setBounds(13,569,35,20);
        egysegX4.setBounds(63,569,35,20);

        ablakLepakolas.add(egysegY4);
        ablakLepakolas.add(egysegX4);
    }
}