package Varazslatok;

import Egysegek.Sebesseg;
import Ellenfel.EllenfelTamad;
import Hos.HosTamad;

import javax.swing.*;

import static Ablakok.Csapat.ablakCsapat;
import static Egysegek.Sebesseg.*;
import static Hos.HosTamad.KiKicsoda;
import static Hos.HosTamad.holVagyHos;
import static Hos.Tulajdonsagok.Tudas.manna;
import static Hos.Tulajdonsagok.Tudas.mannaErtek;
import static Hos.Tulajdonsagok.Tulajdonsagai.arany;
import static Hos.Tulajdonsagok.Tulajdonsagai.aranyErteke;
import static Jatek.JatekAblak.*;
import static Jatek.Sorrend.*;
import static Varazslatok.Varazslat.nevVarazslatErtek;
import static Ellenfel.EllenfelTulajdonsaga.*;
import static Ellenfel.EllenfelTamad.*;

public class Lassitas {

    static JButton plusszGombLassitas;
    static JButton minuszGombLassitas;

    public Lassitas() {
        plusszGombLassitas = new JButton();
        minuszGombLassitas = new JButton();

        plusszGombLassitas.addActionListener(e -> {
            if (lassitaspipa==0 && arany-70>=0) {
                lassitaspipa=1;
                arany-=70;
                lassitasKep.setVisible(false);
                nevVarazslatErtek.setText("<html><u>Lassitás:</u><p>    Végleg felére veszi az ellenfél &nbsp;&nbsp;&nbsp; </p><p> sebességét.</p>" +
                        "<p><u></p><p><u>Manna költsége: 3</u></p></html>");
                System.out.println("Lassitas megvasarolva");
            }
            aranyErteke.setText(String.valueOf(arany));
        });

        minuszGombLassitas.addActionListener(e -> {
            if (lassitaspipa==1) {
                lassitaspipa=0;
                arany+=70;
                lassitasKep.setVisible(true);
                System.out.println("Lassitas eladva");
            }
            aranyErteke.setText(String.valueOf(arany));
        });
    }

    public static JPanel lassitasKep = new JPanel();
    static JLabel lassitasKepe = new JLabel();

    static ImageIcon lassitas = new ImageIcon("Kepek/varazslatok/lassitasff.png");

    public static int lassitaspipa=0;

    public static void lassitas() {

        plusszGombLassitas.setBounds(1159, 331, 25, 25);
        plusszGombLassitas.setOpaque(false);
        plusszGombLassitas.setContentAreaFilled(false);
        plusszGombLassitas.setBorderPainted(false);
        plusszGombLassitas.setFocusable(false);

        minuszGombLassitas.setBounds(1131, 331, 25, 25);
        minuszGombLassitas.setOpaque(false);
        minuszGombLassitas.setContentAreaFilled(false);
        minuszGombLassitas.setBorderPainted(false);
        minuszGombLassitas.setFocusable(false);

        lassitasKep.setBounds(1189,310,55,60);

        lassitasKepe.setIcon(lassitas);
        lassitasKep.add(lassitasKepe);
        lassitasKep.setOpaque(false);
        ablakCsapat.add(lassitasKep);

        ablakCsapat.add(plusszGombLassitas);
        ablakCsapat.add(minuszGombLassitas);
    }

    public static void lelassitalak(String egyseg) {

        System.out.println(egyseg+" lassitva ");
        egysegNeve(egyseg);
        informacioErtek.setText(egyseg+" lassitva.");
        if (((egyseg.equals("ecsont") || egyseg.equals("efoldmuv")) && elsoEllEgysegSebesseg>2) ||
                ((egyseg.equals("efelder") || egyseg.equals("eijas")) && masodikEllEgysegSebesseg>2) ||
                ((egyseg.equals("emino") || egyseg.equals("egrif")) && harmadikEllEgysegSebesseg>2) ||
                ((egyseg.equals("eorgy") || egyseg.equals("efegyv")) && negyedikEllEgysegSebesseg>2) ||
                ((egyseg.equals("erapt") || egyseg.equals("eharcp")) && otodikEllEgysegSebesseg>2) ||
                ((egyseg.equals("csont") || egyseg.equals("foldmuv")) && elsoEgysegSebesseg>2) ||
                ((egyseg.equals("felder") || egyseg.equals("ijas")) && masodikEgysegSebesseg>2) ||
                ((egyseg.equals("mino") || egyseg.equals("grif")) && harmadikEgysegSebesseg>2) ||
                ((egyseg.equals("orgy") || egyseg.equals("fegyv")) && negyedikEgysegSebesseg>2) ||
                ((egyseg.equals("rapt") || egyseg.equals("harcp")) && otodikEgysegSebesseg>2)) {

            switch (egyseg) {
                case "ecsont", "efoldmuv" -> elsoEllEgysegSebesseg = Math.ceil(elsoEgysegSebesseg/2);
                case "efelder", "eijas" -> Sebesseg.masodikEllEgysegSebesseg = Math.ceil(Sebesseg.masodikEllEgysegSebesseg/2);
                case "emino", "egrif" -> Sebesseg.harmadikEllEgysegSebesseg = Math.ceil(Sebesseg.harmadikEllEgysegSebesseg/2);
                case "eorgy", "efegyv" -> Sebesseg.negyedikEllEgysegSebesseg = Math.ceil(Sebesseg.negyedikEllEgysegSebesseg/2);
                case "erapt", "eharcp" -> Sebesseg.otodikEllEgysegSebesseg = Math.ceil(Sebesseg.otodikEllEgysegSebesseg/2);
                case "csont", "foldmuv" -> Sebesseg.elsoEgysegSebesseg = Math.ceil(Sebesseg.elsoEgysegSebesseg/2);
                case "felder", "ijas" -> Sebesseg.masodikEgysegSebesseg = Math.ceil(Sebesseg.masodikEgysegSebesseg/2);
                case "mino", "grif" -> Sebesseg.harmadikEgysegSebesseg = Math.ceil(Sebesseg.harmadikEgysegSebesseg/2);
                case "orgy", "fegyv" -> Sebesseg.negyedikEgysegSebesseg = Math.ceil(Sebesseg.negyedikEgysegSebesseg/2);
                case "rapt", "harcp" -> Sebesseg.otodikEgysegSebesseg = Math.ceil(Sebesseg.otodikEgysegSebesseg/2);
            }
            manna -=3;
            mannaErtek.setText(String.valueOf(manna));


            KiKicsoda();
            HosTamad.mutato=0;
            holVagyHos();

            double ujErtek2 = moralSorrendTList.get(HosTamad.mutato);

            moralSorrendTList.remove(HosTamad.mutato);
            moralSorrendTList.add(ujErtek2);

            hanyadikKor(elsoHely);
            korokKiirasa();

            sorrendFrissites();
        }else {
            System.out.println("Nem lehet 2-nel kisebb a sebessege egyik egysegnek sem.");
            informacioErtek.setText("Nem lehet 2-nél kisebb a sebessége egyik egységnek sem.");
        }

        mekkoraTeruleteVan(egyseg);
    }

    public static void lelassitalakEllenfel(String egyseg) {

        System.out.println(egyseg+" lassitva ");
        egysegNeve(egyseg);
        informacioErtek.setText(egyseg+" lassitva.");
        if (((egyseg.equals("ecsont") || egyseg.equals("efoldmuv")) && elsoEllEgysegSebesseg>2) ||
                ((egyseg.equals("efelder") || egyseg.equals("eijas")) && masodikEllEgysegSebesseg>2) ||
                ((egyseg.equals("emino") || egyseg.equals("egrif")) && harmadikEllEgysegSebesseg>2) ||
                ((egyseg.equals("eorgy") || egyseg.equals("efegyv")) && negyedikEllEgysegSebesseg>2) ||
                ((egyseg.equals("erapt") || egyseg.equals("eharcp")) && otodikEllEgysegSebesseg>2) ||
                ((egyseg.equals("csont") || egyseg.equals("foldmuv")) && elsoEgysegSebesseg>2) ||
                ((egyseg.equals("felder") || egyseg.equals("ijas")) && masodikEgysegSebesseg>2) ||
                ((egyseg.equals("mino") || egyseg.equals("grif")) && harmadikEgysegSebesseg>2) ||
                ((egyseg.equals("orgy") || egyseg.equals("fegyv")) && negyedikEgysegSebesseg>2) ||
                ((egyseg.equals("rapt") || egyseg.equals("harcp")) && otodikEgysegSebesseg>2)) {

            switch (egyseg) {
                case "ecsont", "efoldmuv" -> elsoEllEgysegSebesseg = Math.ceil(elsoEgysegSebesseg/2);
                case "efelder", "eijas" -> Sebesseg.masodikEllEgysegSebesseg = Math.ceil(Sebesseg.masodikEllEgysegSebesseg/2);
                case "emino", "egrif" -> Sebesseg.harmadikEllEgysegSebesseg = Math.ceil(Sebesseg.harmadikEllEgysegSebesseg/2);
                case "eorgy", "efegyv" -> Sebesseg.negyedikEllEgysegSebesseg = Math.ceil(Sebesseg.negyedikEllEgysegSebesseg/2);
                case "erapt", "eharcp" -> Sebesseg.otodikEllEgysegSebesseg = Math.ceil(Sebesseg.otodikEllEgysegSebesseg/2);
                case "csont", "foldmuv" -> Sebesseg.elsoEgysegSebesseg = Math.ceil(Sebesseg.elsoEgysegSebesseg/2);
                case "felder", "ijas" -> Sebesseg.masodikEgysegSebesseg = Math.ceil(Sebesseg.masodikEgysegSebesseg/2);
                case "mino", "grif" -> Sebesseg.harmadikEgysegSebesseg = Math.ceil(Sebesseg.harmadikEgysegSebesseg/2);
                case "orgy", "fegyv" -> Sebesseg.negyedikEgysegSebesseg = Math.ceil(Sebesseg.negyedikEgysegSebesseg/2);
                case "rapt", "harcp" -> Sebesseg.otodikEgysegSebesseg = Math.ceil(Sebesseg.otodikEgysegSebesseg/2);
            }
            ellenfelManna -=3;
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
        }else {
            System.out.println("Nem lehet 2-nel kisebb a sebessege egyik egysegnek sem.");
            informacioErtek.setText("Nem lehet 2-nél kisebb a sebessége egyik egységnek sem.");
        }

        mekkoraTeruleteVan(egyseg);
    }
}
