package Jatek;

import Ellenfel.EllenfelTulajdonsaga;
import Hos.HosTamad;
import Hos.Tulajdonsagok.Moral;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;

import static Egysegek.Egyseg.*;
import static Ellenfel.EllenfelEgysegPozicio.*;
import static Jatek.JatekAblak.ablakCsata;
import static Jatek.JatekAblak.elsoAlkalommal0;
import static Jatek.Palya_Lepes.*;
import static Jatek.Valasztas.lovage;
import static Jatek.XYKordinatakBemenet.*;

public class Sorrend {

    private static Sorrend instance = null;

    public static Sorrend getInstance()
    {
        if (instance == null)
            instance = new Sorrend();

        return instance;
    }

    public static double ecsont=0,efoldmuv=0,efelder=0,eijas=0,egrif=0,emino=0,efegyv=0,eorgy=0,eharcp=0,erapt=0;
    public static double csont=0,foldmuv=0,felder=0,ijas=0,grif=0,mino=0,fegyv=0,orgy=0,harcp=0,rapt=0;
    public static double morLaszlo=2,morLena=1;

    public static String elsoHely ="n",masodikHely ="n",harmadikHely ="n",negyedikHely ="n",otodikHely ="n",hatodikHely ="n";
    public static String hetedikHely ="n",nyolcadikHely ="n",kilencedikHely ="n",tizedikHely ="n",tizenegyedikHely ="n";
    public static String tizenkettedikHely ="n";

    public static int jelenlegiEgysegPOZ=0;
    public static boolean elsoNezes=true;

    public static ArrayList<Double> moralSorrendTList = new ArrayList<>();

    public static ImageIcon csontvazSorK = new ImageIcon("Kepek/egysegek/csontvazpiros.jpg");
    public static ImageIcon foldmuvesSorK = new ImageIcon("Kepek/egysegek/foldmuveskek.jpg");
    public static ImageIcon felderitoSorK = new ImageIcon("Kepek/egysegek/felderitopiros.jpg");
    public static ImageIcon ijaszSorK = new ImageIcon("Kepek/egysegek/ijaszkek.jpg");
    public static ImageIcon minotaurSorK = new ImageIcon("Kepek/egysegek/minotauroszpiros.jpg");
    public static ImageIcon griffSorK = new ImageIcon("Kepek/egysegek/griffkek.jpg");
    public static ImageIcon raptorLovasSorK = new ImageIcon("Kepek/egysegek/raptorlovaspiros.jpg");
    public static ImageIcon fegyvernokSorK = new ImageIcon("Kepek/egysegek/fegyvernokkek.jpg");
    public static ImageIcon harcosPapSorK = new ImageIcon("Kepek/egysegek/harcospapkek.jpg");
    public static ImageIcon orgyilkosSorK = new ImageIcon("Kepek/egysegek/orgyilkospiros.jpg");
    public static ImageIcon laszloSorK = new ImageIcon("Kepek/hosok/laszlokek.jpg");
    public static ImageIcon lenaSorK = new ImageIcon("Kepek/hosok/lenapiros.jpg");

    public static ImageIcon lathatatlan = new ImageIcon("Kepek/atlatszo.png");
    public static ImageIcon szurkes = new ImageIcon("Kepek/atlatszo_szurke.png");

    static JPanel EgysegSorK0 = new JPanel();
    public static JLabel EgysegSorKe0 = new JLabel();
    static JPanel EgysegSorK1 = new JPanel();
    public static JLabel EgysegSorKe1 = new JLabel();
    static JPanel EgysegSorK2 = new JPanel();
    public static JLabel EgysegSorKe2 = new JLabel();
    static JPanel EgysegSorK3 = new JPanel();
    public static JLabel EgysegSorKe3 = new JLabel();
    static JPanel EgysegSorK4 = new JPanel();
    public static JLabel EgysegSorKe4 = new JLabel();
    static JPanel EgysegSorK5 = new JPanel();
    public static JLabel EgysegSorKe5 = new JLabel();
    static JPanel EgysegSorK6 = new JPanel();
    public static JLabel EgysegSorKe6 = new JLabel();
    static JPanel EgysegSorK7 = new JPanel();
    public static JLabel EgysegSorKe7 = new JLabel();
    static JPanel EgysegSorK8 = new JPanel();
    public static JLabel EgysegSorKe8 = new JLabel();
    static JPanel EgysegSorK9 = new JPanel();
    public static JLabel EgysegSorKe9 = new JLabel();
    static JPanel EgysegSorK10 = new JPanel();
    public static JLabel EgysegSorKe10 = new JLabel();
    static JPanel EgysegSorK11 = new JPanel();
    public static JLabel EgysegSorKe11 = new JLabel();

    public static boolean egyenloLeses=false;
    public static int kor=1;
    public static int listaMerete=0;
    public static String fixHely="n";
    public static double elsoFixErtek=0,masodikFixErtek=0,harmadikFixErtek=0,negyedikFixErtek=0,otodikFixErtek=0
            ,hatodikFixErtek=0,hetedikFixErtek=0,nyolcadikFixErtek=0,kilencedikFixErtek=0,tizedikFixErtek=0;
    public static String korokElsoHely="n";
    public static String elsoHelyFix ="n",masodikHelyFix="n",harmadikHelyFix="n",negyedikHelyFix="n",otodikHelyFix="n"
            ,hatodikHelyFix="n",hetedikHelyFix="n",nyolcadikHelyFix="n",kilencedikHelyFix="n",tizedikHelyFix="n";;

    public static int regiPozOszlop=0;
    public static int regiPozSor=0;

    public static void moralKiszamitas() {

        if (lovage==0) {
            if (foldmuvesSzam>0) {
                foldmuv=8+Moral.moralErtek;
                moralSorrendTList.add(foldmuv);
            }
            if (ijaszSzam>0) {
                ijas=9+Moral.moralErtek;
                moralSorrendTList.add(ijas);
            }
            if (griffSzam>0) {
                grif=15+Moral.moralErtek;
                moralSorrendTList.add(grif);
            }
            if (fegyvernokSzam>0) {
                fegyv=8+Moral.moralErtek;
                moralSorrendTList.add(fegyv);
            }
            if (harcosPapSzam>0) {
                harcp=10+Moral.moralErtek;
                moralSorrendTList.add(harcp);
            }

            if (ellenfelRaptorLovasSzam>0) {
                erapt=7+EllenfelTulajdonsaga.ellenfelMoral;
                moralSorrendTList.add(erapt);
            }
            if (ellenfelOrgyilkosSzam>0) {
                eorgy=16+EllenfelTulajdonsaga.ellenfelMoral;
                moralSorrendTList.add(eorgy);
            }
            if (ellenfelMinotaurSzam>0) {
                emino=4+EllenfelTulajdonsaga.ellenfelMoral;
                moralSorrendTList.add(emino);
            }
            if (ellenfelFelderitoSzam>0) {
                efelder=10+EllenfelTulajdonsaga.ellenfelMoral;
                moralSorrendTList.add(efelder);
            }
            if (ellenfelCsontvazSzam>0) {
                ecsont=8+EllenfelTulajdonsaga.ellenfelMoral;
                moralSorrendTList.add(ecsont);
            }
        }

        if (lovage==1) {
            if (csontvazSzam>0) {
                csont=8+Moral.moralErtek;
                moralSorrendTList.add(csont);
            }
            if (felderitoSzam>0) {
                felder=10+Moral.moralErtek;
                moralSorrendTList.add(felder);
            }
            if (minotaurSzam>0) {
                mino=4+Moral.moralErtek;
                moralSorrendTList.add(mino);
            }
            if (orgyilkosSzam>0) {
                orgy=16+Moral.moralErtek;
                moralSorrendTList.add(orgy);
            }
            if (raptorLovasSzam>0) {
                rapt=7+Moral.moralErtek;
                moralSorrendTList.add(rapt);
            }

            if (ellenfelHarcosPapSzam>0) {
                eharcp=10+EllenfelTulajdonsaga.ellenfelMoral;
                moralSorrendTList.add(eharcp);
            }
            if (ellenfelFegyvernokSzam>0) {
                efegyv=8+EllenfelTulajdonsaga.ellenfelMoral;
                moralSorrendTList.add(efegyv);
            }
            if (ellenfelGriffSzam>0) {
                egrif=15+EllenfelTulajdonsaga.ellenfelMoral;
                moralSorrendTList.add(egrif);
            }
            if (ellenfelIjaszSzam>0) {
                eijas=9+EllenfelTulajdonsaga.ellenfelMoral;
                moralSorrendTList.add(eijas);
            }
            if (ellenfelFoldmuvesSzam>0) {
                efoldmuv=8+EllenfelTulajdonsaga.ellenfelMoral;
                moralSorrendTList.add(efoldmuv);
            }
        }
        moralSorrendTList.add(morLaszlo);
        moralSorrendTList.add(morLena);

        Collections.sort(moralSorrendTList);
        Collections.reverse(moralSorrendTList);
    }

    public static void sorrendKiszamitas() throws IllegalArgumentException, IllegalAccessException {

          if (!egyenloLeses) {
              haVanEgyenlo();
              egyenloLeses=true;
          }

        Sorrend t = new Sorrend();
        Field[] f = t.getClass().getFields();

        for (int i=0;i<22;i++) {

            if (Double.compare((Double) f[i].get(t), moralSorrendTList.get(0)) == 0 && !f[i].get(t).equals(0.0)) {
                elsoHely =f[i].getName();
                if (elsoNezes) {
                    elsoFixErtek=moralSorrendTList.get(0);
                    elsoHelyFix =f[i].getName();
                }
            }else if (Double.compare((Double) f[i].get(t), moralSorrendTList.get(1)) == 0 && !f[i].get(t).equals(0.0)) {
                masodikHely =f[i].getName();
                if (elsoNezes) {
                    masodikFixErtek=moralSorrendTList.get(1);
                    masodikHelyFix =f[i].getName();
                }
            }if (moralSorrendTList.size()>2) {
                if (Double.compare((Double) f[i].get(t), moralSorrendTList.get(2)) == 0 && !f[i].get(t).equals(0.0)) {
                    harmadikHely =f[i].getName();
                    if (elsoNezes) {
                        harmadikFixErtek=moralSorrendTList.get(2);
                        harmadikHelyFix =f[i].getName();
                    }
                }
            }if (moralSorrendTList.size()>3) {
                if (Double.compare((Double) f[i].get(t), moralSorrendTList.get(3)) == 0 && !f[i].get(t).equals(0.0)) {
                    negyedikHely =f[i].getName();
                    if (elsoNezes) {
                        negyedikFixErtek=moralSorrendTList.get(3);
                        negyedikHelyFix =f[i].getName();
                    }
                }
            }if (moralSorrendTList.size()>4) {
                if (Double.compare((Double) f[i].get(t), moralSorrendTList.get(4)) == 0 && !f[i].get(t).equals(0.0)) {
                    otodikHely =f[i].getName();
                     if (elsoNezes) {
                    otodikFixErtek=moralSorrendTList.get(4);
                         otodikHelyFix =f[i].getName();
                }
                }
            }if (moralSorrendTList.size()>5) {
                if (Double.compare((Double) f[i].get(t), moralSorrendTList.get(5)) == 0 && !f[i].get(t).equals(0.0)) {
                    hatodikHely =f[i].getName();
                     if (elsoNezes) {
                    hatodikFixErtek=moralSorrendTList.get(5);
                         hatodikHelyFix =f[i].getName();
                }
                }
            }if (moralSorrendTList.size()>6) {
                if (Double.compare((Double) f[i].get(t), moralSorrendTList.get(6)) == 0 && !f[i].get(t).equals(0.0)) {
                    hetedikHely =f[i].getName();
                     if (elsoNezes) {
                    hetedikFixErtek=moralSorrendTList.get(6);
                         hetedikHelyFix =f[i].getName();
                }
                }
            }if (moralSorrendTList.size()>7) {
                if (Double.compare((Double) f[i].get(t), moralSorrendTList.get(7)) == 0 && !f[i].get(t).equals(0.0)) {
                    nyolcadikHely =f[i].getName();
                     if (elsoNezes) {
                    nyolcadikFixErtek=moralSorrendTList.get(7);
                         nyolcadikHelyFix =f[i].getName();
                }
                }
            }if (moralSorrendTList.size()>8) {
                if (Double.compare((Double) f[i].get(t), moralSorrendTList.get(8)) == 0 && !f[i].get(t).equals(0.0)) {
                    kilencedikHely =f[i].getName();
                     if (elsoNezes) {
                    kilencedikFixErtek=moralSorrendTList.get(8);
                         kilencedikHelyFix =f[i].getName();
                }
                }
            }if (moralSorrendTList.size()>9) {
                if (Double.compare((Double) f[i].get(t), moralSorrendTList.get(9)) == 0 && !f[i].get(t).equals(0.0)) {
                    tizedikHely =f[i].getName();
                }
            }if (moralSorrendTList.size()>10) {
                if (Double.compare((Double) f[i].get(t), moralSorrendTList.get(10)) == 0 && !f[i].get(t).equals(0.0)) {
                    tizenegyedikHely = f[i].getName();
                }
            }if (moralSorrendTList.size()>11) {
                if (Double.compare((Double) f[i].get(t), moralSorrendTList.get(11)) == 0 && !f[i].get(t).equals(0.0)) {
                    tizenkettedikHely =f[i].getName();
                }
            }

                Sorrend.elsoKepekLetetele(536,30);
                Sorrend.masodikKepekLetetele(536,30);
                Sorrend.harmadikKepekLetetele(536,30);
                Sorrend.negyedikKepekLetetele(536,30);
                Sorrend.otodikKepekLetetele(536,30);
                Sorrend.hatodikKepekLetetele(536,30);
                Sorrend.hetedikKepekLetetele(536,30);
                Sorrend.nyolcadikKepekLetetele(536,30);
                Sorrend.kilencedikKepekLetetele(536,30);
                Sorrend.tizedikKepekLetetele(536,30);
                Sorrend.tizenegyedikKepekLetetele(536,30);
                Sorrend.tizenkettedikKepekLetetele(536,30);
        }

        elsoNezes=false;

        switch (elsoHely) {
            case "foldmuv", "csont" -> {
                elsoMegjeloles(elsoHely, elsoEgysegPoz);
                jelenlegiEgysegPOZ = elsoEgysegPoz;
            }
            case "efoldmuv", "ecsont" -> {
                elsoMegjeloles(elsoHely, elsoEllPoz);
                jelenlegiEgysegPOZ = elsoEllPoz;
            }
            case "erapt", "eharcp" -> {
                elsoMegjeloles(elsoHely, otodikEllPoz);
                jelenlegiEgysegPOZ = otodikEllPoz;
            }
            case "rapt", "harcp" -> {
                elsoMegjeloles(elsoHely, otodikEgysegPoz);
                jelenlegiEgysegPOZ = otodikEgysegPoz;
            }
            case "orgy", "fegyv" -> {
                elsoMegjeloles(elsoHely, negyedikEgysegPoz);
                jelenlegiEgysegPOZ = negyedikEgysegPoz;
            }
            case "eorgy", "efegyv" -> {
                elsoMegjeloles(elsoHely, negyedikEllPoz);
                jelenlegiEgysegPOZ = negyedikEllPoz;
            }
            case "mino", "grif" -> {
                elsoMegjeloles(elsoHely, harmadikEgysegPoz);
                jelenlegiEgysegPOZ = harmadikEgysegPoz;
            }
            case "felder", "ijas" -> {
                elsoMegjeloles(elsoHely, masodikEgysegPoz);
                jelenlegiEgysegPOZ = masodikEgysegPoz;
            }
            case "efelder", "eijas" -> {
                elsoMegjeloles(elsoHely, masodikEllPoz);
                jelenlegiEgysegPOZ = masodikEllPoz;
            }
            case "egrif", "emino" -> {
                elsoMegjeloles(elsoHely, harmadikEllPoz);
                jelenlegiEgysegPOZ = harmadikEllPoz;
            }
            case "morLaszlo", "morLena" -> elsoMegjeloles(elsoHely, 10);
        }
    }

    public static void haVanEgyenlo() throws IllegalAccessException {

        int melyikLegyen= random.nextInt(1 + 1);


        int hanyadik=0;
        String elsoNevK="n",masodikNevK="n",harmadikNevK="n",negyedikNevK="n",otodikNevK="n",hatodikNevK="n";
        double elsoErtekK=0,masodikErtekK=0,harmadikErtekK=0,negyedikErtekK=0,otodikErtekK=0,hatodikErtekK=0;
        int iMasolat=100, jMasolat=100,iMasolat1=100, jMasolat1=100,iMasolat2=100, jMasolat2=100;
        int iMasolat3=100, jMasolat3=100,iMasolat4=100, jMasolat4=100,iMasolat5=100, jMasolat5=100;

        Sorrend t = new Sorrend();
        Field[] f = t.getClass().getFields();

        for (int i=0;i<moralSorrendTList.size();i++) {

            for (int j = 0; j < moralSorrendTList.size(); j++) {


                for (int l = 0; l < 20; l++) {
                    if (moralSorrendTList.get(i).equals(moralSorrendTList.get(j)) && i!=j) {
                        if (Double.compare((Double) f[l].get(t), moralSorrendTList.get(i)) == 0) {

                            if (hanyadik==0) {
                                iMasolat=i;
                                jMasolat=j;

                            }else if (hanyadik==1) {
                                iMasolat1=i;
                                jMasolat1=j;
                            }else if (hanyadik==2) {
                                iMasolat2=i;
                                jMasolat2=j;
                            }else if (hanyadik==3) {
                                iMasolat3=i;
                                jMasolat3=j;
                            }else if (hanyadik==4) {
                                iMasolat4=i;
                                jMasolat4=j;
                            }else if (hanyadik==5) {
                                iMasolat5=i;
                                jMasolat5=j;
                            }

                            if (iMasolat==j && jMasolat==i && iMasolat1==j && jMasolat1==i && iMasolat2==j && jMasolat2==i
                                    && iMasolat3==j && jMasolat3==i && iMasolat4==j && jMasolat4==i && iMasolat5==j && jMasolat5==i) {

                            }else {
                                if (hanyadik == 0) {
                                    elsoNevK = f[l].getName();
                                    elsoErtekK = (double) f[l].get(t);

                                    hanyadik++;
                                } else if (hanyadik == 1 && !f[l].getName().equals(elsoNevK)) {
                                    masodikNevK = f[l].getName();
                                    masodikErtekK = (double) f[l].get(t);

                                    hanyadik++;
                                } else if (hanyadik == 2 && !f[l].getName().equals(elsoNevK) && !f[l].getName().equals(masodikNevK)) {
                                    harmadikNevK = f[l].getName();
                                    harmadikErtekK = (double) f[l].get(t);

                                    hanyadik++;
                                } else if (hanyadik == 3 && !f[l].getName().equals(elsoNevK) && !f[l].getName().equals(masodikNevK)
                                        && !f[l].getName().equals(harmadikNevK)) {
                                    negyedikNevK = f[l].getName();
                                    negyedikErtekK = (double) f[l].get(t);

                                    hanyadik++;
                                }else if (hanyadik == 4 && !f[l].getName().equals(elsoNevK) && !f[l].getName().equals(masodikNevK) && !f[l].getName().equals(harmadikNevK)
                                        && !f[l].getName().equals(negyedikNevK)) {
                                    otodikNevK = f[l].getName();
                                    otodikErtekK = (double) f[l].get(t);

                                    hanyadik++;
                                }else if (hanyadik == 5 && !f[l].getName().equals(elsoNevK) && !f[l].getName().equals(masodikNevK) && !f[l].getName().equals(harmadikNevK)
                                        && !f[l].getName().equals(negyedikNevK) && !f[l].getName().equals(otodikNevK)) {
                                    hatodikNevK = f[l].getName();
                                    hatodikErtekK = (double) f[l].get(t);

                                    hanyadik++;
                                }
                            }
                        }
                    }
                }
            }




        }


        for (int i=0;i<moralSorrendTList.size();i++) {
            if (!elsoNevK.equals("n") && !masodikNevK.equals("n") && !harmadikNevK.equals("n") && !negyedikNevK.equals("n") && !otodikNevK.equals("n") && !hatodikNevK.equals("n")) {
                if (melyikLegyen == 0) {
                    for (int m = 0; m < 20; m++) {
                        if (f[m].getName().equals(elsoNevK)) {
                            if (Double.compare((Double) f[m].get(t), moralSorrendTList.get(i)) == 0) {
                                f[m].set(t, elsoErtekK - 0.25);
                                moralSorrendTList.set(i, (Double) f[m].get(t));
                            }
                        } else if (f[m].getName().equals(masodikNevK)) {
                            if (Double.compare((Double) f[m].get(t), moralSorrendTList.get(i)) == 0) {
                                f[m].set(t, masodikErtekK - 0.75);
                                moralSorrendTList.set(i, (Double) f[m].get(t));
                            }
                        } else if (f[m].getName().equals(harmadikNevK)) {
                            if (Double.compare((Double) f[m].get(t), moralSorrendTList.get(i)) == 0) {
                                f[m].set(t, harmadikErtekK - 0.50);
                                moralSorrendTList.set(i, (Double) f[m].get(t));
                            }
                        } else if (f[m].getName().equals(hatodikNevK)) {
                            if (Double.compare((Double) f[m].get(t), moralSorrendTList.get(i)) == 0) {
                                f[m].set(t, hatodikErtekK - 0.44);
                                moralSorrendTList.set(i, (Double) f[m].get(t));
                            }
                        }
                    }
                } else if (melyikLegyen == 1) {
                    for (int m = 0; m < 20; m++) {
                        if (f[m].getName().equals(masodikNevK)) {
                            if (Double.compare((Double) f[m].get(t), moralSorrendTList.get(i)) == 0) {
                                f[m].set(t, masodikErtekK - 0.75);
                                moralSorrendTList.set(i, (Double) f[m].get(t));
                            }
                        } else if (f[m].getName().equals(harmadikNevK)) {
                            if (Double.compare((Double) f[m].get(t), moralSorrendTList.get(i)) == 0) {
                                f[m].set(t, harmadikErtekK - 0.25);
                                moralSorrendTList.set(i, (Double) f[m].get(t));
                            }
                        } else if (f[m].getName().equals(negyedikNevK)) {
                            if (Double.compare((Double) f[m].get(t), moralSorrendTList.get(i)) == 0) {
                                f[m].set(t, negyedikErtekK - 0.50);
                                moralSorrendTList.set(i, (Double) f[m].get(t));
                            }
                        } else if (f[m].getName().equals(otodikNevK)) {
                            if (Double.compare((Double) f[m].get(t), moralSorrendTList.get(i)) == 0) {
                                f[m].set(t, otodikErtekK - 0.10);
                                moralSorrendTList.set(i, (Double) f[m].get(t));
                            }
                        } else if (f[m].getName().equals(hatodikNevK)) {
                            if (Double.compare((Double) f[m].get(t), moralSorrendTList.get(i)) == 0) {
                                f[m].set(t, hatodikErtekK - 0.80);
                                moralSorrendTList.set(i, (Double) f[m].get(t));
                            }
                        }
                    }
                }

            } else if (!elsoNevK.equals("n") && !masodikNevK.equals("n") && !harmadikNevK.equals("n") && !negyedikNevK.equals("n") && !otodikNevK.equals("n")) {
                if (melyikLegyen == 0) {
                    for (int m = 0; m < 20; m++) {
                        if (f[m].getName().equals(elsoNevK)) {
                            if (Double.compare((Double) f[m].get(t), moralSorrendTList.get(i)) == 0) {
                                f[m].set(t, elsoErtekK - 0.25);
                                moralSorrendTList.set(i, (Double) f[m].get(t));
                            }
                        } else if (f[m].getName().equals(masodikNevK)) {
                            if (Double.compare((Double) f[m].get(t), moralSorrendTList.get(i)) == 0) {
                                f[m].set(t, masodikErtekK - 0.75);
                                moralSorrendTList.set(i, (Double) f[m].get(t));
                            }
                        } else if (f[m].getName().equals(harmadikNevK)) {
                            if (Double.compare((Double) f[m].get(t), moralSorrendTList.get(i)) == 0) {
                                f[m].set(t, harmadikErtekK - 0.50);
                                moralSorrendTList.set(i, (Double) f[m].get(t));
                            }
                        } else if (f[m].getName().equals(otodikNevK)) {
                            if (Double.compare((Double) f[m].get(t), moralSorrendTList.get(i)) == 0) {
                                f[m].set(t, otodikErtekK - 0.60);
                                moralSorrendTList.set(i, (Double) f[m].get(t));
                            }
                        }
                    }
                } else if (melyikLegyen == 1) {
                    for (int m = 0; m < 20; m++) {
                        if (f[m].getName().equals(masodikNevK)) {
                            if (Double.compare((Double) f[m].get(t), moralSorrendTList.get(i)) == 0) {
                                f[m].set(t, masodikErtekK - 0.75);
                                moralSorrendTList.set(i, (Double) f[m].get(t));
                            }
                        } else if (f[m].getName().equals(harmadikNevK)) {
                            if (Double.compare((Double) f[m].get(t), moralSorrendTList.get(i)) == 0) {
                                f[m].set(t, harmadikErtekK - 0.25);
                                moralSorrendTList.set(i, (Double) f[m].get(t));
                            }
                        } else if (f[m].getName().equals(negyedikNevK)) {
                            if (Double.compare((Double) f[m].get(t), moralSorrendTList.get(i)) == 0) {
                                f[m].set(t, negyedikErtekK - 0.50);
                                moralSorrendTList.set(i, (Double) f[m].get(t));
                            }
                        } else if (f[m].getName().equals(otodikNevK)) {
                            if (Double.compare((Double) f[m].get(t), moralSorrendTList.get(i)) == 0) {
                                f[m].set(t, otodikErtekK - 0.10);
                                moralSorrendTList.set(i, (Double) f[m].get(t));
                            }
                        }
                    }
                }

            } else if (!elsoNevK.equals("n") && !masodikNevK.equals("n") && !harmadikNevK.equals("n") && !negyedikNevK.equals("n")) {
                if (melyikLegyen == 0) {
                    for (int m = 0; m < 20; m++) {
                        if (f[m].getName().equals(elsoNevK)) {
                            if (Double.compare((Double) f[m].get(t), moralSorrendTList.get(i)) == 0) {
                                f[m].set(t, elsoErtekK - 0.25);
                                moralSorrendTList.set(i, (Double) f[m].get(t));
                            }
                        } else if (f[m].getName().equals(masodikNevK)) {
                            if (Double.compare((Double) f[m].get(t), moralSorrendTList.get(i)) == 0) {
                                f[m].set(t, masodikErtekK - 0.75);
                                moralSorrendTList.set(i, (Double) f[m].get(t));
                            }
                        } else if (f[m].getName().equals(harmadikNevK)) {
                            if (Double.compare((Double) f[m].get(t), moralSorrendTList.get(i)) == 0) {
                                f[m].set(t, harmadikErtekK - 0.50);
                                moralSorrendTList.set(i, (Double) f[m].get(t));
                            }
                        }
                    }
                } else if (melyikLegyen == 1) {
                    for (int m = 0; m < 20; m++) {
                        if (f[m].getName().equals(masodikNevK)) {
                            if (Double.compare((Double) f[m].get(t), moralSorrendTList.get(i)) == 0) {
                                f[m].set(t, masodikErtekK - 0.75);
                                moralSorrendTList.set(i, (Double) f[m].get(t));
                            }
                        } else if (f[m].getName().equals(harmadikNevK)) {
                            if (Double.compare((Double) f[m].get(t), moralSorrendTList.get(i)) == 0) {
                                f[m].set(t, harmadikErtekK - 0.25);
                                moralSorrendTList.set(i, (Double) f[m].get(t));
                            }
                        } else if (f[m].getName().equals(negyedikNevK)) {
                            if (Double.compare((Double) f[m].get(t), moralSorrendTList.get(i)) == 0) {
                                f[m].set(t, negyedikErtekK - 0.50);
                                moralSorrendTList.set(i, (Double) f[m].get(t));
                            }
                        }
                    }
                }

            } else if (!elsoNevK.equals("n") && !masodikNevK.equals("n") && !harmadikNevK.equals("n")) {
                if (melyikLegyen == 0) {
                    for (int m = 0; m < 20; m++) {
                        if (f[m].getName().equals(elsoNevK)) {
                            if (Double.compare((Double) f[m].get(t), moralSorrendTList.get(i)) == 0) {
                                f[m].set(t, elsoErtekK - 0.25);
                                moralSorrendTList.set(i, (Double) f[m].get(t));
                            }
                        } else if (f[m].getName().equals(masodikNevK)) {
                            if (Double.compare((Double) f[m].get(t), moralSorrendTList.get(i)) == 0) {
                                f[m].set(t, masodikErtekK - 0.75);
                                moralSorrendTList.set(i, (Double) f[m].get(t));
                            }
                        }
                    }
                } else if (melyikLegyen == 1) {
                    for (int m = 0; m < 20; m++) {
                        if (f[m].getName().equals(masodikNevK)) {
                            if (Double.compare((Double) f[m].get(t), moralSorrendTList.get(i)) == 0) {
                                f[m].set(t, masodikErtekK - 0.25);
                                moralSorrendTList.set(i, (Double) f[m].get(t));
                            }
                        } else if (f[m].getName().equals(harmadikNevK)) {
                            if (Double.compare((Double) f[m].get(t), moralSorrendTList.get(i)) == 0) {
                                f[m].set(t, harmadikErtekK - 0.75);
                                moralSorrendTList.set(i, (Double) f[m].get(t));
                            }
                        }
                    }
                }

            } else if (!elsoNevK.equals("n") && !masodikNevK.equals("n")) {
                if (melyikLegyen == 0) {
                    for (int m = 0; m < 20; m++) {
                        if (f[m].getName().equals(elsoNevK)) {
                            if (Double.compare((Double) f[m].get(t), moralSorrendTList.get(i)) == 0) {
                                f[m].set(t, elsoErtekK - 0.5);
                                moralSorrendTList.set(i, (Double) f[m].get(t));
                            }
                        }
                    }
                } else if (melyikLegyen == 1) {
                    for (int m = 0; m < 20; m++) {
                        if (f[m].getName().equals(masodikNevK)) {

                            if (Double.compare((Double) f[m].get(t), moralSorrendTList.get(i)) == 0) {
                                f[m].set(t, masodikErtekK - 0.5);
                                moralSorrendTList.set(i, (Double) f[m].get(t));
                            }
                        }
                    }
                }
            }
        }

        Collections.sort(moralSorrendTList);
        Collections.reverse(moralSorrendTList);
    }

    public static void elsoKepekLetetele(int yKep,int xKep) {


        EgysegSorK0.setBounds(xKep,yKep,68,68);
        EgysegSorK0.setOpaque(false);
        EgysegSorK0.setVisible(true);

        sorrendKiVagy(elsoHely,EgysegSorKe0);

        EgysegSorK0.add(EgysegSorKe0);
        ablakCsata.add(EgysegSorK0);
    }

    public static void masodikKepekLetetele(int yKep,int xKep) {


        EgysegSorK1.setBounds(xKep,yKep,68,68);
        EgysegSorK1.setOpaque(false);
        EgysegSorK1.setVisible(true);

        sorrendKiVagy(masodikHely,EgysegSorKe1);

        EgysegSorK1.add(EgysegSorKe1);
        ablakCsata.add(EgysegSorK1);
    }

    public static void harmadikKepekLetetele(int yKep,int xKep) {


        EgysegSorK2.setBounds(xKep,yKep,68,68);
        EgysegSorK2.setOpaque(false);
        EgysegSorK2.setVisible(true);

        sorrendKiVagy(harmadikHely,EgysegSorKe2);

        EgysegSorK2.add(EgysegSorKe2);
        ablakCsata.add(EgysegSorK2);
    }

    public static void negyedikKepekLetetele(int yKep,int xKep) {


        EgysegSorK3.setBounds(xKep,yKep,68,68);
        EgysegSorK3.setOpaque(false);
        EgysegSorK3.setVisible(true);

        sorrendKiVagy(negyedikHely,EgysegSorKe3);

        EgysegSorK3.add(EgysegSorKe3);
        ablakCsata.add(EgysegSorK3);
    }

    public static void otodikKepekLetetele(int yKep,int xKep) {


        EgysegSorK4.setBounds(xKep,yKep,68,68);
        EgysegSorK4.setOpaque(false);
        EgysegSorK4.setVisible(true);

        sorrendKiVagy(otodikHely,EgysegSorKe4);

        EgysegSorK4.add(EgysegSorKe4);
        ablakCsata.add(EgysegSorK4);
    }

    public static void hatodikKepekLetetele(int yKep,int xKep) {

        EgysegSorK5.setBounds(xKep,yKep,68,68);
        EgysegSorK5.setOpaque(false);
        EgysegSorK5.setVisible(true);

        sorrendKiVagy(hatodikHely,EgysegSorKe5);

        EgysegSorK5.add(EgysegSorKe5);
        ablakCsata.add(EgysegSorK5);
    }

    public static void hetedikKepekLetetele(int yKep,int xKep) {

        EgysegSorK6.setBounds(xKep,yKep,68,68);
        EgysegSorK6.setOpaque(false);
        EgysegSorK6.setVisible(true);

        sorrendKiVagy(hetedikHely,EgysegSorKe6);

        EgysegSorK6.add(EgysegSorKe6);
        ablakCsata.add(EgysegSorK6);
    }

    public static void nyolcadikKepekLetetele(int yKep,int xKep) {

        EgysegSorK7.setBounds(xKep,yKep,68,68);
        EgysegSorK7.setOpaque(false);
        EgysegSorK7.setVisible(true);

        sorrendKiVagy(nyolcadikHely,EgysegSorKe7);

        EgysegSorK7.add(EgysegSorKe7);
        ablakCsata.add(EgysegSorK7);
    }

    public static void kilencedikKepekLetetele(int yKep,int xKep) {

        EgysegSorK8.setBounds(xKep,yKep,68,68);
        EgysegSorK8.setOpaque(false);
        EgysegSorK8.setVisible(true);

        sorrendKiVagy(kilencedikHely,EgysegSorKe8);

        EgysegSorK8.add(EgysegSorKe8);
        ablakCsata.add(EgysegSorK8);
    }

    public static void tizedikKepekLetetele(int yKep,int xKep) {

        EgysegSorK9.setBounds(xKep,yKep,68,68);
        EgysegSorK9.setOpaque(false);
        EgysegSorK9.setVisible(true);

        sorrendKiVagy(tizedikHely,EgysegSorKe9);

        EgysegSorK9.add(EgysegSorKe9);
        ablakCsata.add(EgysegSorK9);
    }

    public static void tizenegyedikKepekLetetele(int yKep,int xKep) {

        EgysegSorK10.setBounds(xKep,yKep,68,68);
        EgysegSorK10.setOpaque(false);
        EgysegSorK10.setVisible(true);

        sorrendKiVagy(tizenegyedikHely,EgysegSorKe10);

        EgysegSorK10.add(EgysegSorKe10);
        ablakCsata.add(EgysegSorK10);
    }

    public static void tizenkettedikKepekLetetele(int yKep,int xKep) {

        EgysegSorK11.setBounds(xKep,yKep,68,68);
        EgysegSorK11.setOpaque(false);
        EgysegSorK11.setVisible(true);

        sorrendKiVagy(tizenkettedikHely,EgysegSorKe11);

        EgysegSorK11.add(EgysegSorKe11);
        ablakCsata.add(EgysegSorK11);
    }

    public static void sorrendKiVagy(String hely,JLabel melyikKep) {

        switch (hely) {
            case "ecsont", "csont" -> melyikKep.setIcon(csontvazSorK);
            case "efelder", "felder" -> melyikKep.setIcon(felderitoSorK);
            case "emino", "mino" -> melyikKep.setIcon(minotaurSorK);
            case "eorgy", "orgy" -> melyikKep.setIcon(orgyilkosSorK);
            case "erapt", "rapt" -> melyikKep.setIcon(raptorLovasSorK);
            case "efoldmuv", "foldmuv" -> melyikKep.setIcon(foldmuvesSorK);
            case "eijas", "ijas" -> melyikKep.setIcon(ijaszSorK);
            case "egrif", "grif" -> melyikKep.setIcon(griffSorK);
            case "efegyv", "fegyv" -> melyikKep.setIcon(fegyvernokSorK);
            case "eharcp", "harcp" -> melyikKep.setIcon(harcosPapSorK);
            case "morLaszlo" -> melyikKep.setIcon(laszloSorK);
            case "morLena" -> melyikKep.setIcon(lenaSorK);
            case "n" -> melyikKep.setIcon(lathatatlan);
        }
    }

    public static void sorrendFrissites() {

        try {
            Sorrend.sorrendKiszamitas();
        } catch (IllegalAccessException illegalAccessException) {
            illegalAccessException.printStackTrace();
        }

        Sorrend.elsoKepekLetetele(536,30);
        Sorrend.masodikKepekLetetele(536, 85);
        Sorrend.harmadikKepekLetetele(536, 140);
        Sorrend.negyedikKepekLetetele(536, 195);
        Sorrend.otodikKepekLetetele(536, 250);
        Sorrend.hatodikKepekLetetele(536, 305);
        Sorrend.hetedikKepekLetetele(536, 360);
        Sorrend.nyolcadikKepekLetetele(536, 415);
        Sorrend.kilencedikKepekLetetele(536, 470);
        Sorrend.tizedikKepekLetetele(536, 525);
        Sorrend.tizenegyedikKepekLetetele(536, 580);
        Sorrend.tizenkettedikKepekLetetele(536, 635);

        elsoAlkalommal0=false;
        JatekAblak.jatekAblak();
    }

    public static void hanyadikKor(String egyseg) {

        if (elsoAlkalommal0) {

            elsoHelyFix =egyseg;
            listaMerete=moralSorrendTList.size();
            fixHely=elsoHelyFix;
        }

        if (listaMerete>moralSorrendTList.size()) {
            for (int i=0;i<moralSorrendTList.size();i++) {
                if (elsoFixErtek == moralSorrendTList.get(i)) {
                    fixHely = elsoHelyFix;
                    listaMerete = moralSorrendTList.size();
                    break;
                }
            }
        }
        if (listaMerete>moralSorrendTList.size()) {
            for (int i=0;i<moralSorrendTList.size();i++) {
                if (masodikFixErtek == moralSorrendTList.get(i)) {
                    fixHely = masodikHelyFix;
                    listaMerete = moralSorrendTList.size();
                    break;
                }
            }
        }
        if (listaMerete>moralSorrendTList.size()) {
            for (int i=0;i<moralSorrendTList.size();i++) {
                if (harmadikFixErtek == moralSorrendTList.get(i)) {
                    fixHely = harmadikHelyFix;
                    listaMerete = moralSorrendTList.size();
                    break;
                }
            }
        }
        if (listaMerete>moralSorrendTList.size()) {
            for (int i=0;i<moralSorrendTList.size();i++) {
                if (negyedikFixErtek == moralSorrendTList.get(i)) {
                    fixHely = negyedikHelyFix;
                    listaMerete = moralSorrendTList.size();
                    break;
                }
            }
        }
        if (listaMerete>moralSorrendTList.size()) {
            for (int i=0;i<moralSorrendTList.size();i++) {
                if (otodikFixErtek == moralSorrendTList.get(i)) {
                    fixHely = otodikHelyFix;
                    listaMerete = moralSorrendTList.size();
                    break;
                }
            }
        }
        if (listaMerete>moralSorrendTList.size()) {
            for (int i=0;i<moralSorrendTList.size();i++) {
                if (hatodikFixErtek == moralSorrendTList.get(i)) {
                    fixHely = hatodikHelyFix;
                    listaMerete = moralSorrendTList.size();
                    break;
                }
            }
        }
        if (listaMerete>moralSorrendTList.size()) {
            for (int i=0;i<moralSorrendTList.size();i++) {
                if (hetedikFixErtek == moralSorrendTList.get(i)) {
                    fixHely = hetedikHelyFix;
                    listaMerete = moralSorrendTList.size();
                    break;
                }
            }
        }
        if (listaMerete>moralSorrendTList.size()) {
            for (int i=0;i<moralSorrendTList.size();i++) {
                if (nyolcadikFixErtek == moralSorrendTList.get(i)) {
                    fixHely = nyolcadikHelyFix;
                    listaMerete = moralSorrendTList.size();
                    break;
                }
            }
        }
        if (listaMerete>moralSorrendTList.size()) {
            for (int i=0;i<moralSorrendTList.size();i++) {
                if (kilencedikFixErtek == moralSorrendTList.get(i)) {
                    fixHely = kilencedikHelyFix;
                    listaMerete = moralSorrendTList.size();
                    break;
                }
            }
        }

            korokElsoHely=masodikHely;

        if (korokElsoHely.equals(fixHely)) {
            kor++;
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

            System.out.println(" ");
            System.out.println(kor+". Kor");
        }
    }

    public static void elsoMegjeloles(String egyseg, int poz) {

        int pozHossz=String.valueOf(poz).length();

        if (pozHossz==2) {
            regiPozOszlop= Integer.parseInt(Integer.toString(poz).substring(1, 2));
            regiPozSor= Integer.parseInt(Integer.toString(poz).substring(0, 1));
        }else if (pozHossz==3) {
            if (Integer.parseInt(Integer.toString(poz).substring(1, 2))==1) { // mikor az oszlop 2 elemű
                regiPozOszlop= Integer.parseInt(Integer.toString(poz).substring(1, 3));
                regiPozSor= Integer.parseInt(Integer.toString(poz).substring(0, 1));
            }else { // mikor a sor 2 elemű
                regiPozOszlop= Integer.parseInt(Integer.toString(poz).substring(2, 3));
                regiPozSor= Integer.parseInt(Integer.toString(poz).substring(0, 2));
            }

        }else if (pozHossz==4) {
            regiPozOszlop= Integer.parseInt(Integer.toString(poz).substring(2, 4));
            regiPozSor= Integer.parseInt(Integer.toString(poz).substring(0, 2));
        }

        if (egyseg.equals("morLena") || egyseg.equals("morLaszlo")) {
            poz=100000000;
        }


            if (egyseg.equals(elsoHely) && poz==11) {
                palyaS1O1.setBorderPainted(true);
                palyaS1O1.setIcon(szurkes);
                palyaS1O1.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=11) {
                palyaS1O1.setBorderPainted(false);
                palyaS1O1.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==12) {
                palyaS1O2.setBorderPainted(true);
                palyaS1O2.setIcon(szurkes);
                palyaS1O2.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=12) {
                palyaS1O2.setBorderPainted(false);
                palyaS1O2.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==13) {
                palyaS1O3.setBorderPainted(true);
                palyaS1O3.setIcon(szurkes);
                palyaS1O3.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=13) {
                palyaS1O3.setBorderPainted(false);
                palyaS1O3.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==14) {
                palyaS1O4.setBorderPainted(true);
                palyaS1O4.setIcon(szurkes);
                palyaS1O4.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=14) {
                palyaS1O4.setBorderPainted(false);
                palyaS1O4.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==15) {
                palyaS1O5.setBorderPainted(true);
                palyaS1O5.setIcon(szurkes);
                palyaS1O5.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=15) {
                palyaS1O5.setBorderPainted(false);
                palyaS1O5.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==16) {
                palyaS1O6.setBorderPainted(true);
                palyaS1O6.setIcon(szurkes);
                palyaS1O6.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=16) {
                palyaS1O6.setBorderPainted(false);
                palyaS1O6.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==17) {
                palyaS1O7.setBorderPainted(true);
                palyaS1O7.setIcon(szurkes);
                palyaS1O7.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=17) {
                palyaS1O7.setBorderPainted(false);
                palyaS1O7.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==18) {
                palyaS1O8.setBorderPainted(true);
                palyaS1O8.setIcon(szurkes);
                palyaS1O8.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=18) {
                palyaS1O8.setBorderPainted(false);
                palyaS1O8.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==19) {
                palyaS1O9.setBorderPainted(true);
                palyaS1O9.setIcon(szurkes);
                palyaS1O9.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=19) {
                palyaS1O9.setBorderPainted(false);
                palyaS1O9.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==110) {
                palyaS1O10.setBorderPainted(true);
                palyaS1O10.setIcon(szurkes);
                palyaS1O10.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=110) {
                palyaS1O10.setBorderPainted(false);
                palyaS1O10.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==111) {
                palyaS1O11.setBorderPainted(true);
                palyaS1O11.setIcon(szurkes);
                palyaS1O11.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=111) {
                palyaS1O11.setBorderPainted(false);
                palyaS1O11.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==112) {
                palyaS1O12.setBorderPainted(true);
                palyaS1O12.setIcon(szurkes);
                palyaS1O12.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=112) {
                palyaS1O12.setBorderPainted(false);
                palyaS1O12.setIcon(lathatatlan);
            }


            if (egyseg.equals(elsoHely) && poz==21) {
                palyaS2O1.setBorderPainted(true);
                palyaS2O1.setIcon(szurkes);
                palyaS2O1.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1,true));
            }else if (poz!=21) {
                palyaS2O1.setBorderPainted(false);
                palyaS2O1.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==22) {
                palyaS2O2.setBorderPainted(true);
                palyaS2O2.setIcon(szurkes);
                palyaS2O2.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=22) {
                palyaS2O2.setBorderPainted(false);
                palyaS2O2.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==23) {
                palyaS2O3.setBorderPainted(true);
                palyaS2O3.setIcon(szurkes);
                palyaS2O3.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=23) {
                palyaS2O3.setBorderPainted(false);
                palyaS2O3.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==24) {
                palyaS2O4.setBorderPainted(true);
                palyaS2O4.setIcon(szurkes);
                palyaS2O4.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=24) {
                palyaS2O4.setBorderPainted(false);
                palyaS2O4.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==25) {
                palyaS2O5.setBorderPainted(true);
                palyaS2O5.setIcon(szurkes);
                palyaS2O5.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=25) {
                palyaS2O5.setBorderPainted(false);
                palyaS2O5.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==26) {
                palyaS2O6.setBorderPainted(true);
                palyaS2O6.setIcon(szurkes);
                palyaS2O6.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=26) {
                palyaS2O6.setBorderPainted(false);
                palyaS2O6.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==27) {
                palyaS2O7.setBorderPainted(true);
                palyaS2O7.setIcon(szurkes);
                palyaS2O7.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=27) {
                palyaS2O7.setBorderPainted(false);
                palyaS2O7.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==28) {
                palyaS2O8.setBorderPainted(true);
                palyaS2O8.setIcon(szurkes);
                palyaS2O8.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=28) {
                palyaS2O8.setBorderPainted(false);
                palyaS2O8.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==29) {
                palyaS2O9.setBorderPainted(true);
                palyaS2O9.setIcon(szurkes);
                palyaS2O9.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=29) {
                palyaS2O9.setBorderPainted(false);
                palyaS2O9.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==210) {
                palyaS2O10.setBorderPainted(true);
                palyaS2O10.setIcon(szurkes);
                palyaS2O10.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=210) {
                palyaS2O10.setBorderPainted(false);
                palyaS2O10.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==211) {
                palyaS2O11.setBorderPainted(true);
                palyaS2O11.setIcon(szurkes);
                palyaS2O11.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=211) {
                palyaS2O11.setBorderPainted(false);
                palyaS2O11.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==212) {
                palyaS2O12.setBorderPainted(true);
                palyaS2O12.setIcon(szurkes);
                palyaS2O12.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=212) {
                palyaS2O12.setBorderPainted(false);
                palyaS2O12.setIcon(lathatatlan);
            }


            if (egyseg.equals(elsoHely) && poz==31) {
                palyaS3O1.setBorderPainted(true);
                palyaS3O1.setIcon(szurkes);
                palyaS3O1.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1,true));
            }else if (poz!=31) {
                palyaS3O1.setBorderPainted(false);
                palyaS3O1.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==32) {
                palyaS3O2.setBorderPainted(true);
                palyaS3O2.setIcon(szurkes);
                palyaS3O2.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=32) {
                palyaS3O2.setBorderPainted(false);
                palyaS3O2.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==33) {
                palyaS3O3.setBorderPainted(true);
                palyaS3O3.setIcon(szurkes);
                palyaS3O3.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=33) {
                palyaS3O3.setBorderPainted(false);
                palyaS3O3.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==34) {
                palyaS3O4.setBorderPainted(true);
                palyaS3O4.setIcon(szurkes);
                palyaS3O4.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=34) {
                palyaS3O4.setBorderPainted(false);
                palyaS3O4.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==35) {
                palyaS3O5.setBorderPainted(true);
                palyaS3O5.setIcon(szurkes);
                palyaS3O5.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=35) {
                palyaS3O5.setBorderPainted(false);
                palyaS3O5.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==36) {
                palyaS3O6.setBorderPainted(true);
                palyaS3O6.setIcon(szurkes);
                palyaS3O6.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=36) {
                palyaS3O6.setBorderPainted(false);
                palyaS3O6.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==37) {
                palyaS3O7.setBorderPainted(true);
                palyaS3O7.setIcon(szurkes);
                palyaS3O7.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=37) {
                palyaS3O7.setBorderPainted(false);
                palyaS3O7.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==38) {
                palyaS3O8.setBorderPainted(true);
                palyaS3O8.setIcon(szurkes);
                palyaS3O8.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=38) {
                palyaS3O8.setBorderPainted(false);
                palyaS3O8.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==39) {
                palyaS3O9.setBorderPainted(true);
                palyaS3O9.setIcon(szurkes);
                palyaS3O9.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=39) {
                palyaS3O9.setBorderPainted(false);
                palyaS3O9.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==310) {
                palyaS3O10.setBorderPainted(true);
                palyaS3O10.setIcon(szurkes);
                palyaS3O10.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=310) {
                palyaS3O10.setBorderPainted(false);
                palyaS3O10.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==311) {
                palyaS3O11.setBorderPainted(true);
                palyaS3O11.setIcon(szurkes);
                palyaS3O11.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=311) {
                palyaS3O11.setBorderPainted(false);
                palyaS3O11.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==312) {
                palyaS3O12.setBorderPainted(true);
                palyaS3O12.setIcon(szurkes);
                palyaS3O12.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=312) {
                palyaS3O12.setBorderPainted(false);
                palyaS3O12.setIcon(lathatatlan);
            }


            if (egyseg.equals(elsoHely) && poz==41) {
                palyaS4O1.setBorderPainted(true);
                palyaS4O1.setIcon(szurkes);
                palyaS4O1.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1,true));
            }else if (poz!=41) {
                palyaS4O1.setBorderPainted(false);
                palyaS4O1.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==42) {
                palyaS4O2.setBorderPainted(true);
                palyaS4O2.setIcon(szurkes);
                palyaS4O2.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=42) {
                palyaS4O2.setBorderPainted(false);
                palyaS4O2.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==43) {
                palyaS4O3.setBorderPainted(true);
                palyaS4O3.setIcon(szurkes);
                palyaS4O3.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=43) {
                palyaS4O3.setBorderPainted(false);
                palyaS4O3.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==44) {
                palyaS4O4.setBorderPainted(true);
                palyaS4O4.setIcon(szurkes);
                palyaS4O4.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=44) {
                palyaS4O4.setBorderPainted(false);
                palyaS4O4.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==45) {
                palyaS4O5.setBorderPainted(true);
                palyaS4O5.setIcon(szurkes);
                palyaS4O5.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=45) {
                palyaS4O5.setBorderPainted(false);
                palyaS4O5.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==46) {
                palyaS4O6.setBorderPainted(true);
                palyaS4O6.setIcon(szurkes);
                palyaS4O6.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=46) {
                palyaS4O6.setBorderPainted(false);
                palyaS4O6.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==47) {
                palyaS4O7.setBorderPainted(true);
                palyaS4O7.setIcon(szurkes);
                palyaS4O7.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=47) {
                palyaS4O7.setBorderPainted(false);
                palyaS4O7.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==48) {
                palyaS4O8.setBorderPainted(true);
                palyaS4O8.setIcon(szurkes);
                palyaS4O8.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=48) {
                palyaS4O8.setBorderPainted(false);
                palyaS4O8.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==49) {
                palyaS4O9.setBorderPainted(true);
                palyaS4O9.setIcon(szurkes);
                palyaS4O9.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=49) {
                palyaS4O9.setBorderPainted(false);
                palyaS4O9.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==410) {
                palyaS4O10.setBorderPainted(true);
                palyaS4O10.setIcon(szurkes);
                palyaS4O10.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=410) {
                palyaS4O10.setBorderPainted(false);
                palyaS4O10.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==411) {
                palyaS4O11.setBorderPainted(true);
                palyaS4O11.setIcon(szurkes);
                palyaS4O11.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=411) {
                palyaS4O11.setBorderPainted(false);
                palyaS4O11.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==412) {
                palyaS4O12.setBorderPainted(true);
                palyaS4O12.setIcon(szurkes);
                palyaS4O12.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=412) {
                palyaS4O12.setBorderPainted(false);
                palyaS4O12.setIcon(lathatatlan);
            }


            if (egyseg.equals(elsoHely) && poz==51) {
                palyaS5O1.setBorderPainted(true);
                palyaS5O1.setIcon(szurkes);
                palyaS5O1.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1,true));
            }else if (poz!=51) {
                palyaS5O1.setBorderPainted(false);
                palyaS5O1.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==52) {
                palyaS5O2.setBorderPainted(true);
                palyaS5O2.setIcon(szurkes);
                palyaS5O2.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=52) {
                palyaS5O2.setBorderPainted(false);
                palyaS5O2.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==53) {
                palyaS5O3.setBorderPainted(true);
                palyaS5O3.setIcon(szurkes);
                palyaS5O3.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=53) {
                palyaS5O3.setBorderPainted(false);
                palyaS5O3.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==54) {
                palyaS5O4.setBorderPainted(true);
                palyaS5O4.setIcon(szurkes);
                palyaS5O4.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=54) {
                palyaS5O4.setBorderPainted(false);
                palyaS5O4.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==55) {
                palyaS5O5.setBorderPainted(true);
                palyaS5O5.setIcon(szurkes);
                palyaS5O5.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=55) {
                palyaS5O5.setBorderPainted(false);
                palyaS5O5.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==56) {
                palyaS5O6.setBorderPainted(true);
                palyaS5O6.setIcon(szurkes);
                palyaS5O6.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=56) {
                palyaS5O6.setBorderPainted(false);
                palyaS5O6.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==57) {
                palyaS5O7.setBorderPainted(true);
                palyaS5O7.setIcon(szurkes);
                palyaS5O7.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=57) {
                palyaS5O7.setBorderPainted(false);
                palyaS5O7.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==58) {
                palyaS5O8.setBorderPainted(true);
                palyaS5O8.setIcon(szurkes);
                palyaS5O8.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=58) {
                palyaS5O8.setBorderPainted(false);
                palyaS5O8.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==59) {
                palyaS5O9.setBorderPainted(true);
                palyaS5O9.setIcon(szurkes);
                palyaS5O9.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=59) {
                palyaS5O9.setBorderPainted(false);
                palyaS5O9.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==510) {
                palyaS5O10.setBorderPainted(true);
                palyaS5O10.setIcon(szurkes);
                palyaS5O10.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=510) {
                palyaS5O10.setBorderPainted(false);
                palyaS5O10.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==511) {
                palyaS5O11.setBorderPainted(true);
                palyaS5O11.setIcon(szurkes);
                palyaS5O11.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=511) {
                palyaS5O11.setBorderPainted(false);
                palyaS5O11.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==512) {
                palyaS5O12.setBorderPainted(true);
                palyaS5O12.setIcon(szurkes);
                palyaS5O12.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=512) {
                palyaS5O12.setBorderPainted(false);
                palyaS5O12.setIcon(lathatatlan);
            }


            if (egyseg.equals(elsoHely) && poz==61) {
                palyaS6O1.setBorderPainted(true);
                palyaS6O1.setIcon(szurkes);
                palyaS6O1.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1,true));
            }else if (poz!=61) {
                palyaS6O1.setBorderPainted(false);
                palyaS6O1.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==62) {
                palyaS6O2.setBorderPainted(true);
                palyaS6O2.setIcon(szurkes);
                palyaS6O2.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=62) {
                palyaS6O2.setBorderPainted(false);
                palyaS6O2.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==63) {
                palyaS6O3.setBorderPainted(true);
                palyaS6O3.setIcon(szurkes);
                palyaS6O3.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=63) {
                palyaS6O3.setBorderPainted(false);
                palyaS6O3.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==65) {
                palyaS6O5.setBorderPainted(true);
                palyaS6O5.setIcon(szurkes);
                palyaS6O5.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=65) {
                palyaS6O5.setBorderPainted(false);
                palyaS6O5.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==66) {
                palyaS6O6.setBorderPainted(true);
                palyaS6O6.setIcon(szurkes);
                palyaS6O6.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=66) {
                palyaS6O6.setBorderPainted(false);
                palyaS6O6.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==67) {
                palyaS6O7.setBorderPainted(true);
                palyaS6O7.setIcon(szurkes);
                palyaS6O7.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=67) {
                palyaS6O7.setBorderPainted(false);
                palyaS6O7.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==68) {
                palyaS6O8.setBorderPainted(true);
                palyaS6O8.setIcon(szurkes);
                palyaS6O8.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=68) {
                palyaS6O8.setBorderPainted(false);
                palyaS6O8.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==69) {
                palyaS6O9.setBorderPainted(true);
                palyaS6O9.setIcon(szurkes);
                palyaS6O9.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=69) {
                palyaS6O9.setBorderPainted(false);
                palyaS6O9.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==610) {
                palyaS6O10.setBorderPainted(true);
                palyaS6O10.setIcon(szurkes);
                palyaS6O10.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=610) {
                palyaS6O10.setBorderPainted(false);
                palyaS6O10.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==611) {
                palyaS6O11.setBorderPainted(true);
                palyaS6O11.setIcon(szurkes);
                palyaS6O11.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=611) {
                palyaS6O11.setBorderPainted(false);
                palyaS6O11.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==612) {
                palyaS6O12.setBorderPainted(true);
                palyaS6O12.setIcon(szurkes);
                palyaS6O12.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=612) {
                palyaS6O12.setBorderPainted(false);
                palyaS6O12.setIcon(lathatatlan);
            }


            if (egyseg.equals(elsoHely) && poz==71) {
                palyaS7O1.setBorderPainted(true);
                palyaS7O1.setIcon(szurkes);
                palyaS7O1.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1,true));
            }else if (poz!=71) {
                palyaS7O1.setBorderPainted(false);
                palyaS7O1.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==72) {
                palyaS7O2.setBorderPainted(true);
                palyaS7O2.setIcon(szurkes);
                palyaS7O2.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=72) {
                palyaS7O2.setBorderPainted(false);
                palyaS7O2.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==73) {
                palyaS7O3.setBorderPainted(true);
                palyaS7O3.setIcon(szurkes);
                palyaS7O3.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=73) {
                palyaS7O3.setBorderPainted(false);
                palyaS7O3.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==74) {
                palyaS7O4.setBorderPainted(true);
                palyaS7O4.setIcon(szurkes);
                palyaS7O4.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=74) {
                palyaS7O4.setBorderPainted(false);
                palyaS7O4.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==75) {
                palyaS7O5.setBorderPainted(true);
                palyaS7O5.setIcon(szurkes);
                palyaS7O5.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=75) {
                palyaS7O5.setBorderPainted(false);
                palyaS7O5.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==76) {
                palyaS7O6.setBorderPainted(true);
                palyaS7O6.setIcon(szurkes);
                palyaS7O6.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=76) {
                palyaS7O6.setBorderPainted(false);
                palyaS7O6.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==77) {
                palyaS7O7.setBorderPainted(true);
                palyaS7O7.setIcon(szurkes);
                palyaS7O7.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=77) {
                palyaS7O7.setBorderPainted(false);
                palyaS7O7.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==710) {
                palyaS7O10.setBorderPainted(true);
                palyaS7O10.setIcon(szurkes);
                palyaS7O10.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=710) {
                palyaS7O10.setBorderPainted(false);
                palyaS7O10.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==711) {
                palyaS7O11.setBorderPainted(true);
                palyaS7O11.setIcon(szurkes);
                palyaS7O11.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=711) {
                palyaS7O11.setBorderPainted(false);
                palyaS7O11.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==712) {
                palyaS7O12.setBorderPainted(true);
                palyaS7O12.setIcon(szurkes);
                palyaS7O12.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=712) {
                palyaS7O12.setBorderPainted(false);
                palyaS7O12.setIcon(lathatatlan);
            }


            if (egyseg.equals(elsoHely) && poz==81) {
                palyaS8O1.setBorderPainted(true);
                palyaS8O1.setIcon(szurkes);
                palyaS8O1.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1,true));
            }else if (poz!=81) {
                palyaS8O1.setBorderPainted(false);
                palyaS8O1.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==82) {
                palyaS8O2.setBorderPainted(true);
                palyaS8O2.setIcon(szurkes);
                palyaS8O2.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=82) {
                palyaS8O2.setBorderPainted(false);
                palyaS8O2.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==83) {
                palyaS8O3.setBorderPainted(true);
                palyaS8O3.setIcon(szurkes);
                palyaS8O3.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=83) {
                palyaS8O3.setBorderPainted(false);
                palyaS8O3.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==84) {
                palyaS8O4.setBorderPainted(true);
                palyaS8O4.setIcon(szurkes);
                palyaS8O4.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=84) {
                palyaS8O4.setBorderPainted(false);
                palyaS8O4.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==85) {
                palyaS8O5.setBorderPainted(true);
                palyaS8O5.setIcon(szurkes);
                palyaS8O5.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=85) {
                palyaS8O5.setBorderPainted(false);
                palyaS8O5.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==88) {
                palyaS8O8.setBorderPainted(true);
                palyaS8O8.setIcon(szurkes);
                palyaS8O8.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=88) {
                palyaS8O8.setBorderPainted(false);
                palyaS8O8.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==89) {
                palyaS8O9.setBorderPainted(true);
                palyaS8O9.setIcon(szurkes);
                palyaS8O9.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=89) {
                palyaS8O9.setBorderPainted(false);
                palyaS8O9.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==810) {
                palyaS8O10.setBorderPainted(true);
                palyaS8O10.setIcon(szurkes);
                palyaS8O10.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=810) {
                palyaS8O10.setBorderPainted(false);
                palyaS8O10.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==811) {
                palyaS8O11.setBorderPainted(true);
                palyaS8O11.setIcon(szurkes);
                palyaS8O11.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=811) {
                palyaS8O11.setBorderPainted(false);
                palyaS8O11.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==812) {
                palyaS8O12.setBorderPainted(true);
                palyaS8O12.setIcon(szurkes);
                palyaS8O12.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=812) {
                palyaS8O12.setBorderPainted(false);
                palyaS8O12.setIcon(lathatatlan);
            }


            if (egyseg.equals(elsoHely) && poz==91) {
                palyaS9O1.setBorderPainted(true);
                palyaS9O1.setIcon(szurkes);
                palyaS9O1.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1,true));
            }else if (poz!=91) {
                palyaS9O1.setBorderPainted(false);
                palyaS9O1.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==92) {
                palyaS9O2.setBorderPainted(true);
                palyaS9O2.setIcon(szurkes);
                palyaS9O2.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=92) {
                palyaS9O2.setBorderPainted(false);
                palyaS9O2.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==95) {
                palyaS9O5.setBorderPainted(true);
                palyaS9O5.setIcon(szurkes);
                palyaS9O5.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=95) {
                palyaS9O5.setBorderPainted(false);
                palyaS9O5.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==96) {
                palyaS9O6.setBorderPainted(true);
                palyaS9O6.setIcon(szurkes);
                palyaS9O6.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=96) {
                palyaS9O6.setBorderPainted(false);
                palyaS9O6.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==97) {
                palyaS9O7.setBorderPainted(true);
                palyaS9O7.setIcon(szurkes);
                palyaS9O7.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=97) {
                palyaS9O7.setBorderPainted(false);
                palyaS9O7.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==98) {
                palyaS9O8.setBorderPainted(true);
                palyaS9O8.setIcon(szurkes);
                palyaS9O8.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=98) {
                palyaS9O8.setBorderPainted(false);
                palyaS9O8.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==99) {
                palyaS9O9.setBorderPainted(true);
                palyaS9O9.setIcon(szurkes);
                palyaS9O9.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=99) {
                palyaS9O9.setBorderPainted(false);
                palyaS9O9.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==910) {
                palyaS9O10.setBorderPainted(true);
                palyaS9O10.setIcon(szurkes);
                palyaS9O10.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=910) {
                palyaS9O10.setBorderPainted(false);
                palyaS9O10.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==911) {
                palyaS9O11.setBorderPainted(true);
                palyaS9O11.setIcon(szurkes);
                palyaS9O11.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=911) {
                palyaS9O11.setBorderPainted(false);
                palyaS9O11.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==912) {
                palyaS9O12.setBorderPainted(true);
                palyaS9O12.setIcon(szurkes);
                palyaS9O12.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=912) {
                palyaS9O12.setBorderPainted(false);
                palyaS9O12.setIcon(lathatatlan);
            }


            if (egyseg.equals(elsoHely) && poz==101) {
                palyaS10O1.setBorderPainted(true);
                palyaS10O1.setIcon(szurkes);
                palyaS10O1.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1,true));
            }else if (poz!=101) {
                palyaS10O1.setBorderPainted(false);
                palyaS10O1.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==102) {
                palyaS10O2.setBorderPainted(true);
                palyaS10O2.setIcon(szurkes);
                palyaS10O2.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=102) {
                palyaS10O2.setBorderPainted(false);
                palyaS10O2.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==105) {
                palyaS10O5.setBorderPainted(true);
                palyaS10O5.setIcon(szurkes);
                palyaS10O5.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=105) {
                palyaS10O5.setBorderPainted(false);
                palyaS10O5.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==106) {
                palyaS10O6.setBorderPainted(true);
                palyaS10O6.setIcon(szurkes);
                palyaS10O6.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=106) {
                palyaS10O6.setBorderPainted(false);
                palyaS10O6.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==107) {
                palyaS10O7.setBorderPainted(true);
                palyaS10O7.setIcon(szurkes);
                palyaS10O7.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=107) {
                palyaS10O7.setBorderPainted(false);
                palyaS10O7.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==108) {
                palyaS10O8.setBorderPainted(true);
                palyaS10O8.setIcon(szurkes);
                palyaS10O8.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=108) {
                palyaS10O8.setBorderPainted(false);
                palyaS10O8.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==109) {
                palyaS10O9.setBorderPainted(true);
                palyaS10O9.setIcon(szurkes);
                palyaS10O9.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=109) {
                palyaS10O9.setBorderPainted(false);
                palyaS10O9.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==1010) {
                palyaS10O10.setBorderPainted(true);
                palyaS10O10.setIcon(szurkes);
                palyaS10O10.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=1010) {
                palyaS10O10.setBorderPainted(false);
                palyaS10O10.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==1011) {
                palyaS10O11.setBorderPainted(true);
                palyaS10O11.setIcon(szurkes);
                palyaS10O11.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=1011) {
                palyaS10O11.setBorderPainted(false);
                palyaS10O11.setIcon(lathatatlan);
            }
            if (egyseg.equals(elsoHely) && poz==1012) {
                palyaS10O12.setBorderPainted(true);
                palyaS10O12.setIcon(szurkes);
                palyaS10O12.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            }else if (poz!=1012) {
                palyaS10O12.setBorderPainted(false);
                palyaS10O12.setIcon(lathatatlan);
            }
    }
}
