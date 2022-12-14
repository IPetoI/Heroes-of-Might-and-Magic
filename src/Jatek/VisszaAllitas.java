package Jatek;

import Egysegek.EgysegekNeEgymasra;
import Egysegek.Sebesseg;
import Hos.HosTamad;

import static Egysegek.Egyseg.*;
import static Egysegek.Eletero.*;
import static Egysegek.Eletero.otodikEgysegEletero;
import static Hos.Tulajdonsagok.Moral.*;
import static Hos.Tulajdonsagok.Szerencse.*;
import static Hos.Tulajdonsagok.Tamadas.*;
import static Hos.Tulajdonsagok.Tudas.*;
import static Hos.Tulajdonsagok.Tulajdonsagai.*;
import static Hos.Tulajdonsagok.Vedekezes.*;
import static Hos.Tulajdonsagok.Varazsero.*;
import static Jatek.Sorrend.*;
import static Jatek.Valasztas.*;
import static Jatek.XYKordinatakBemenet.*;
import static Ablakok.KezdoAblak.nehezseg;
import static Varazslatok.Feltamasztas.feltamasztasKep;
import static Varazslatok.Feltamasztas.feltamasztaspipa;
import static Varazslatok.IsteniEro.isteniEroKep;
import static Varazslatok.IsteniEro.isteniEropipa;
import static Varazslatok.Lassitas.lassitasKep;
import static Varazslatok.Lassitas.lassitaspipa;
import static Varazslatok.Tuzlabda.tuzlabdaKep;
import static Varazslatok.Tuzlabda.tuzlabdapipa;
import static Varazslatok.Varazslat.nevVarazslatErtek;
import static Varazslatok.Villamcsapas.villamcsapasKep;
import static Varazslatok.Villamcsapas.villamcsapaspipa;
import static Egysegek.Sebesseg.nyomas;
import static Egysegek.Sebesseg.egyszer;

public class VisszaAllitas {

    public static void visszaAllitas() {

        Sebesseg.vanRoham=false;

        JatekAblak.vege=false;

        Visszatamadas.egysegVisszatamadas1 =false;
        Visszatamadas.egysegVisszatamadas2 =false;
        Visszatamadas.egysegVisszatamadas3 =false;
        Visszatamadas.egysegVisszatamadas4 =false;
        Visszatamadas.egysegVisszatamadas5 =false;
        Visszatamadas.ellEgysegVisszatamadas1 =false;
        Visszatamadas.ellEgysegVisszatamadas2 =false;
        Visszatamadas.ellEgysegVisszatamadas3 =false;
        Visszatamadas.ellEgysegVisszatamadas4 =false;
        Visszatamadas.ellEgysegVisszatamadas5 =false;
        HosTamad.hosVolt=false;

        isteniEropipa=0;
        isteniEroKep.setVisible(true);
        feltamasztaspipa=0;
        feltamasztasKep.setVisible(true);
        lassitaspipa=0;
        lassitasKep.setVisible(true);
        villamcsapaspipa=0;
        villamcsapasKep.setVisible(true);
        tuzlabdapipa=0;
        tuzlabdaKep.setVisible(true);
        nevVarazslatErtek.setText("<html><u>Tűzvarázslat:</u><p>    Egy területet kiválasztva</p><p> " +
                "3x3 körben saját és ellenséges</p><p> egységeket sebez (varázserő * 20)</p>" +
                "<p><u>Manna költsége: 9</u></p></html>");

        foldmuvesSzam = 0;
        ijaszSzam = 0;
        griffSzam = 0;
        harcosPapSzam = 0;
        fegyvernokSzam = 0;

        if (lovage>0) {
            hos.setIcon(hosLaszlo);
            nevErtek.setText("László");
            System.out.println("Lovag-ot valasztottad");
            csontvazTorles();
            raptorLovasTorles();
            minotaurTorles();
            felderitoTorles();
            orgyilkosTorles();
        }
        emberEgysegreValtas();

        lovage=0;

        csontvazSzam = 0;
        felderitoSzam = 0;
        orgyilkosSzam = 0;
        minotaurSzam = 0;
        raptorLovasSzam = 0;

        osszEgyseg= 0;

        hanyszoros=1;
        egySzeresGomb.setBorderPainted(true);
        tizSzeresGomb.setBorderPainted(false);
        szazSzorosGomb.setBorderPainted(false);

        tulajdonsagAra =5;

        if (nehezseg==1) {
            arany=700;
        }else if (nehezseg==2) {
            arany=1000;
        }else if (nehezseg==3) {
            arany=1300;
        }

        aranyErteke.setText(String.valueOf(arany));
        aranyaraErteke.setText(String.valueOf(tulajdonsagAra));

        varazsero = 1;
        varazseroErtek = 1;
        varazseroErteke.setText(String.valueOf(varazsero));
        varazseroTErteke.setText(String.valueOf(varazseroErtek));

        vedekezes = 1;
        vedekezesErtek = 5;
        vedekezesTErteke.setText(vedekezesErtek +"%");
        vedekezesErteke.setText(String.valueOf(vedekezes));

        szerencse = 1;
        szerencseErtek = 5;
        szerencseTErteke.setText(szerencseErtek +"%");
        szerencseErteke.setText(String.valueOf(szerencse));

        tamadas = 1;
        tamadasErtek = 10;
        tamadasTErteke.setText(tamadasErtek +"%");
        tamadasErteke.setText(String.valueOf(tamadas));

        tudas = 1;
        manna = 10;
        tudasTErteke.setText(String.valueOf(manna));
        tudasErteke.setText(String.valueOf(tudas));

        moral = 1;
        moralErtek = 1;
        moralTErteke.setText(String.valueOf(moralErtek));
        moralErteke.setText(String.valueOf(moral));

        regiPozOszlop=0;
        regiPozSor=0;
        EgysegekNeEgymasra.ecsontEgymasra=0;
        EgysegekNeEgymasra.eminoEgymasra=0;
        EgysegekNeEgymasra.efelderEgymasra=0;
        EgysegekNeEgymasra.eorgyEgymasra=0;
        EgysegekNeEgymasra.eraptEgymasra=0;
        EgysegekNeEgymasra.csontEgymasra=0;
        EgysegekNeEgymasra.minoEgymasra=0;
        EgysegekNeEgymasra.felderEgymasra=0;
        EgysegekNeEgymasra.orgyEgymasra=0;
        EgysegekNeEgymasra.raptEgymasra=0;
        EgysegekNeEgymasra.foldmuvEgymasra=0;
        EgysegekNeEgymasra.ijasEgymasra=0;
        EgysegekNeEgymasra.grifEgymasra=0;
        EgysegekNeEgymasra.fegyvEgymasra=0;
        EgysegekNeEgymasra.harcpEgymasra=0;
        EgysegekNeEgymasra.efoldmuvEgymasra=0;
        EgysegekNeEgymasra.eijasEgymasra=0;
        EgysegekNeEgymasra.egrifEgymasra=0;
        EgysegekNeEgymasra.efegyvEgymasra=0;
        EgysegekNeEgymasra.eharcpEgymasra=0;
        EgysegekNeEgymasra.pozTamadhatoCsont ="k";
        EgysegekNeEgymasra.pozTamadhatoFoldmuv ="k";
        EgysegekNeEgymasra.pozTamadhatoIjas ="k";
        EgysegekNeEgymasra.pozTamadhatoFelder ="k";
        EgysegekNeEgymasra.pozTamadhatoGrif ="k";
        EgysegekNeEgymasra.pozTamadhatoFegyv ="k";
        EgysegekNeEgymasra.pozTamadhatoOrgy ="k";
        EgysegekNeEgymasra.pozTamadhatoMino ="k";
        EgysegekNeEgymasra.pozTamadhatoRapt ="k";
        EgysegekNeEgymasra.pozTamadhatoHarcp ="k";

        egyseg="n";

        moralSorrendTList.clear();
        elsoEllEgysegEletero=0;
        masodikEllEgysegEletero=0;
        harmadikEllEgysegEletero=0;
        negyedikEllEgysegEletero=0;
        otodikEllEgysegEletero=0;

        elsoEgysegEletero=0;
        masodikEgysegEletero=0;
        harmadikEgysegEletero=0;
        negyedikEgysegEletero=0;
        otodikEgysegEletero=0;

        egyseg="n";

        elsoFixErtek=0;
        masodikFixErtek=0;
        harmadikFixErtek=0;
        negyedikFixErtek=0;
        otodikFixErtek=0;
        hatodikFixErtek=0;
        hetedikFixErtek=0;
        nyolcadikFixErtek=0;
        kilencedikFixErtek=0;
        tizedikFixErtek=0;
        elsoNezes=true;
        nyomas = 0;
        egyszer = 1;

        Visszatamadas.egysegVisszatamadas1 =false;
        Visszatamadas.egysegVisszatamadas2 =false;
        Visszatamadas.egysegVisszatamadas3 =false;
        Visszatamadas.egysegVisszatamadas4 =false;
        Visszatamadas.egysegVisszatamadas5 =false;
        Visszatamadas.ellEgysegVisszatamadas1 =false;
        Visszatamadas.ellEgysegVisszatamadas2 =false;
        Visszatamadas.ellEgysegVisszatamadas3 =false;
        Visszatamadas.ellEgysegVisszatamadas4 =false;
        Visszatamadas.ellEgysegVisszatamadas5 =false;

        System.out.println("Minden visszaallitva");
    }

    public static void visszaallitasCsapatletetel() {

        egyseg="n";
        elsoX.setValue(1);
        elsoY.setValue(1);
        masodikX.setValue(1);
        masodikY.setValue(1);
        harmadikX.setValue(1);
        harmadikY.setValue(1);
        negyedikX.setValue(1);
        negyedikY.setValue(1);
        otodikX.setValue(1);
        otodikY.setValue(1);
    }
}