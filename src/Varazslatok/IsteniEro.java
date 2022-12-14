package Varazslatok;

import Hos.HosTamad;
import Hos.Tulajdonsagok.Varazsero;

import javax.swing.*;

import Ellenfel.EllenfelTamad;
import Ellenfel.EllenfelTulajdonsaga;

import static Ablakok.Csapat.ablakCsapat;
import static Hos.HosTamad.KiKicsoda;
import static Hos.HosTamad.holVagyHos;
import static Hos.Tulajdonsagok.Tudas.manna;
import static Hos.Tulajdonsagok.Tudas.mannaErtek;
import static Hos.Tulajdonsagok.Tulajdonsagai.arany;
import static Hos.Tulajdonsagok.Tulajdonsagai.aranyErteke;
import static Ellenfel.EllenfelTulajdonsaga.*;
import static Ellenfel.EllenfelTamad.*;
import static Jatek.JatekAblak.*;
import static Jatek.Sorrend.*;
import static Varazslatok.Varazslat.nevVarazslatErtek;

public class IsteniEro {

    static JButton plusszGombIsteniEro;
    static JButton minuszGombIsteniEro;

    public IsteniEro() {
        plusszGombIsteniEro = new JButton();
        minuszGombIsteniEro = new JButton();

        plusszGombIsteniEro.addActionListener(e -> {
            if (isteniEropipa==0 && arany-180>=0) {
                isteniEropipa=1;
                arany-=180;
                isteniEroKep.setVisible(false);
                nevVarazslatErtek.setText("<html><u>Isteni erő:</u><p>   Egy egységnek végleg megnö- &nbsp;&nbsp; </p><p>" +
                        "vekszik a támadóereje  </p><p> ( varázserő / 10 ) szeresére.</p><p><u>Manna költsége: 12</u></p></html>");
                System.out.println("Isteni ero megvasarolva");
            }
            aranyErteke.setText(String.valueOf(arany));
        });

        minuszGombIsteniEro.addActionListener(e -> {
            if (isteniEropipa==1) {
                isteniEropipa=0;
                arany+=180;
                isteniEroKep.setVisible(true);
                System.out.println("Isteni ero eladva");
            }
            aranyErteke.setText(String.valueOf(arany));
        });
    }

    public static JPanel isteniEroKep = new JPanel();
    static JLabel isteniEroKepe = new JLabel();

    static ImageIcon isteniEro = new ImageIcon("Kepek/varazslatok/istenieroff.png");

    public static int isteniEropipa=0;

    public static boolean elsoEgysegIsteniero=false,masodikEgysegIsteniero=false,harmadikEgysegIsteniero=false,
            negyedikEgysegIsteniero=false, otodikEgysegIsteniero=false;
    public static boolean elsoEllEgysegIsteniero=false,masodikEllEgysegIsteniero=false,harmadikEllEgysegIsteniero=false,
            negyedikEllEgysegIsteniero=false, otodikEllEgysegIsteniero=false;

    public static void isteniEro() {

        plusszGombIsteniEro.setBounds(1159, 198, 25, 25);
        plusszGombIsteniEro.setOpaque(false);
        plusszGombIsteniEro.setContentAreaFilled(false);
        plusszGombIsteniEro.setBorderPainted(false);
        plusszGombIsteniEro.setFocusable(false);

        minuszGombIsteniEro.setBounds(1131, 198, 25, 25);
        minuszGombIsteniEro.setOpaque(false);
        minuszGombIsteniEro.setContentAreaFilled(false);
        minuszGombIsteniEro.setBorderPainted(false);
        minuszGombIsteniEro.setFocusable(false);

        isteniEroKep.setBounds(1189, 178,55,60);

        isteniEroKepe.setIcon(isteniEro);
        isteniEroKep.add(isteniEroKepe);
        isteniEroKep.setOpaque(false);
        ablakCsapat.add(isteniEroKep);

        ablakCsapat.add(plusszGombIsteniEro);
        ablakCsapat.add(minuszGombIsteniEro);
    }


    public static void istenieroAldasa(String egyseg) {

        egysegNeve(egyseg);

        double hosVarazslas = Varazsero.varazseroErtek;
        double hosVarazzs = 1 + hosVarazslas / 10;

        if (egyseg.charAt(0)!='e') {
            switch (egyseg) {
                case "csont", "foldmuv" -> {
                    elsoEgysegIsteniero=true;
                }
                case "felder", "ijas" -> {
                    masodikEgysegIsteniero=true;
                }
                case "mino", "grif" -> {
                    harmadikEgysegIsteniero=true;
                }
                case "orgy", "fegyv" -> {
                    negyedikEgysegIsteniero=true;
                }
                case "rapt", "harcp" -> {
                    otodikEgysegIsteniero=true;
                }
            }
            informacioErtek.setText(hosVarazzs + " megnőtt a sebzése " + egyseg + "-nek.");
            System.out.println(hosVarazzs + " megnőtt a sebzése " + egyseg + "-nek.");
        }
        manna -= 12;
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

    public static void istenieroAldasaEllenfel(String egyseg) {

        egysegNeve(egyseg);

        double ellenfelHosVarazslas = EllenfelTulajdonsaga.ellenfelVarazsero;
        double ellHosVarazs = 1 + ellenfelHosVarazslas / 10;

        if (egyseg.charAt(0)=='e') {
            switch (egyseg) {
                case "ecsont", "efoldmuv" -> {
                    elsoEllEgysegIsteniero=true;
                }
                case "efelder", "eijas" -> {
                    masodikEllEgysegIsteniero=true;
                }
                case "emino", "egrif" -> {
                    harmadikEllEgysegIsteniero=true;
                }
                case "eorgy", "efegyv" -> {
                    negyedikEllEgysegIsteniero=true;
                }
                case "erapt", "eharcp" -> {
                    otodikEllEgysegIsteniero=true;
                }
            }
            informacioErtek.setText(ellHosVarazs + " megnőtt a sebzése " + egyseg + "-nek.");
            System.out.println(ellHosVarazs + " megnőtt a sebzése " + egyseg + "-nek.");
        }
        ellenfelManna -= 12;
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
