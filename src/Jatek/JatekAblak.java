package Jatek;

import Ablakok.KezdoAblak;
import Hos.HosTamad;

import javax.swing.*;
import java.awt.*;

import static Egysegek.Egyseg.*;
import static Egysegek.Eletero.*;
import static Egysegek.Sebesseg.*;
import static Egysegek.Sebzes.egysegSebzese;
import static Egysegek.Sebzes.ellenfelek;
import static Ellenfel.EllenfelEgysegPozicio.*;
import static Ellenfel.EllenfelMuveletei.ellenfelAlapok;
import static Ellenfel.EllenfelMuveletei.hosCsapatKovetkezik;
import static Ellenfel.EllenfelTulajdonsaga.mannaTulajdonsagCsata;
import static Ellenfel.EllenfelTulajdonsaga.tamadasaTulajdonsagCsata;
import static Hos.HosTamad.*;
import static Hos.Tulajdonsagok.Tamadas.tamadasTulajdonsagCsataH;
import static Hos.Tulajdonsagok.Tudas.*;
import static Hos.VarazslatVanNincs.varazslatVanCsata;
import static Jatek.CsataFeluletAtmeretezes.poziciokAtmeretezes;
import static Jatek.Palya_Lepes.*;
import static Jatek.Sorrend.*;
import static Jatek.Valasztas.lovage;
import static Jatek.VisszaAllitas.visszaAllitas;
import static Jatek.VisszaAllitas.visszaallitasCsapatletetel;
import static Jatek.XYKordinatakBemenet.*;
import static Varazslatok.Feltamasztas.feltamasztaspipa;
import static Varazslatok.IsteniEro.isteniEropipa;
import static Varazslatok.Lassitas.lassitaspipa;
import static Varazslatok.Tuzlabda.tuzlabdapipa;
import static Varazslatok.Varazslat.ellenfelekMegjelolese;
import static Varazslatok.Villamcsapas.villamcsapaspipa;


public class JatekAblak {

    static JButton feladas;
    static JButton gombTuzlabda;
    static JButton gombVillamcsapas;
    static JButton gombLassitas;
    static JButton gombIsteniEro;
    static JButton gombFeltamasztas;
    static JButton hosGombTamadas;
    static JButton egysegGombTamadas;
    static JButton egysegGombVarakozas;
    static JButton egysegGombMozgas;
    static JButton ujJatekGomb;

    private static JatekAblak instance = null;

    public JatekAblak() {
        feladas = new JButton();
        gombTuzlabda = new JButton();

        gombVillamcsapas = new JButton();
        gombLassitas = new JButton();
        gombIsteniEro = new JButton();
        gombFeltamasztas = new JButton();
        hosGombTamadas = new JButton();
        egysegGombTamadas = new JButton();
        egysegGombVarakozas = new JButton();
        egysegGombMozgas = new JButton();
        ujJatekGomb = new JButton();

        feladas.addActionListener(e -> {
            String[] lehetosegek = {"Igen, kilépek", "Mégse lépek ki"};
            ImageIcon ikon = new ImageIcon("Kepek/feladom.png");

            int x = JOptionPane.showOptionDialog(null, "Ha kilépsz elveszíted a játékot!",
                    "Biztos vagy benne?", JOptionPane.YES_NO_OPTION,
                    JOptionPane.INFORMATION_MESSAGE, ikon, lehetosegek, 0);
            if (x == 0) {

                System.out.println(" ");
                System.out.println(" ");
                System.out.println("Uj Jatek Inditasa -------------------------------------------------------");
                System.out.println(" ");

                ablakCsata.remove(alapcsata);
                ablakCsata.dispose();
                visszaAllitas();
                visszaallitasCsapatletetel();
                KezdoAblak kezdoAblak = KezdoAblak.getInstance();
                kezdoAblak.kezdoAblak();
            }
        });

        ujJatekGomb.addActionListener(e -> {

            moralSorrendTList.clear();

            System.out.println(" ");
            System.out.println(" ");
            System.out.println("Uj Jatek Inditasa -------------------------------------------------------");
            System.out.println(" ");

            ablakCsata.remove(alapcsata);
            ablakCsata.dispose();
            visszaAllitas();
            KezdoAblak kezdoAblak = KezdoAblak.getInstance();
            kezdoAblak.kezdoAblak();
        });

        gombTuzlabda.addActionListener(e -> {
            nullazas();
            if (tuzlabdapipa==1 && manna-9>=0 && elsoHely.charAt(0)!='e' && !hosVolt ) {
                System.out.println("Tuzlabda varazslat - koltsege 9 manna.");
                informacioErtek.setText("Tűzlabda varázslat - költsége 9 manna.");
                hosTuzlabdaGombBenyomva=true;
                ellenfelekMegjelolese();
            }else if (manna-9>=0) {
                hosTuzlabdaGombBenyomva=false;
                System.out.println("Nincs eleg mannaja.");
                informacioErtek.setText("Nincs elég manna erre a varázslatra!");
            }else if (!hosVolt) {
                System.out.println("Volt mar a hos ebben a korben.");
                informacioErtek.setText("Volt már a hős ebben a körben.");
            }else if (elsoHely.charAt(0)!='e') {
                System.out.println("Az ellenfel kovetkezik.");
                informacioErtek.setText("Az ellenfél következik.");
            }
        });
        gombVillamcsapas.addActionListener(e -> {
            nullazas();
            if (villamcsapaspipa==1 && manna-5>=0 && elsoHely.charAt(0)!='e' && !hosVolt) {
                System.out.println("Villamcsapas varazslat - koltsege 5 manna.");
                informacioErtek.setText("Villamcsapas varázslat - költsége 5 manna.");
                hosVillamcsapasGombBenyomva=true;
                ellenfelekMegjelolese();
            }else if (manna-5>=0) {
                hosVillamcsapasGombBenyomva=false;
                System.out.println("Nincs eleg mannaja.");
                informacioErtek.setText("Nincs elég manna erre a varázslatra!");
            }else if (!hosVolt) {
                System.out.println("Volt mar a hos ebben a korben.");
                informacioErtek.setText("Volt már a hős ebben a körben.");
            }else if (elsoHely.charAt(0)!='e') {
                System.out.println("Az ellenfel kovetkezik.");
                informacioErtek.setText("Az ellenfél következik.");
            }
        });
        gombLassitas.addActionListener(e -> {
            nullazas();
            if (lassitaspipa==1 && manna-3>=0 && elsoHely.charAt(0)!='e' && !hosVolt) {
                System.out.println("Lassitas varazslat - koltsege 3 manna.");
                informacioErtek.setText("Lassítás varázslat - költsége 3 manna.");
                hosLassitasGombBenyomva=true;
                ellenfelekMegjelolese();
            }else if (manna-3>=0) {
                hosLassitasGombBenyomva=false;
                System.out.println("Nincs eleg mannaja.");
                informacioErtek.setText("Nincs elég manna erre a varázslatra!");
            }else if (!hosVolt) {
                System.out.println("Volt mar a hos ebben a korben.");
                informacioErtek.setText("Volt már a hős ebben a körben.");
            }else if (elsoHely.charAt(0)!='e') {
                System.out.println("Az ellenfel kovetkezik.");
                informacioErtek.setText("Az ellenfél következik.");
            }
        });
        gombIsteniEro.addActionListener(e -> {
            nullazas();
            if (isteniEropipa==1 && manna-12>=0 && elsoHely.charAt(0)!='e' && !hosVolt ) {
                System.out.println("Isteni Ero varazslat - koltsege 12 manna.");
                informacioErtek.setText("Isteni Erő varázslat - költsége 12 manna.");
                hosIstenieroGombBenyomva=true;
                ellenfelekMegjelolese();
            }else if (manna-12>=0) {
                hosIstenieroGombBenyomva=false;
                System.out.println("Nincs eleg mannaja.");
                informacioErtek.setText("Nincs elég manna erre a varázslatra!");
            }else if (!hosVolt) {
                System.out.println("Volt mar a hos ebben a korben.");
                informacioErtek.setText("Volt már a hős ebben a körben.");
            }else if (elsoHely.charAt(0)!='e') {
                System.out.println("Az ellenfel kovetkezik.");
                informacioErtek.setText("Az ellenfél következik.");
            }
        });
        gombFeltamasztas.addActionListener(e -> {
            nullazas();
            if (feltamasztaspipa==1 && manna-6>=0 && elsoHely.charAt(0)!='e' && !hosVolt) {
                System.out.println("Feltamaszto varazslat - koltsege 6 manna.");
                informacioErtek.setText("Feltámasztó varázslat - költsége 6 manna.");
                hosFeltamasztasGombBenyomva=true;
                ellenfelekMegjelolese();
            }else if (manna-6>=0) {
                hosFeltamasztasGombBenyomva=false;
                System.out.println("Nincs eleg mannaja.");
                informacioErtek.setText("Nincs elég manna erre a varázslatra!");
            }else if (!hosVolt) {
                System.out.println("Volt mar a hos ebben a korben.");
                informacioErtek.setText("Volt már a hős ebben a körben.");
            }else if (elsoHely.charAt(0)!='e') {
                System.out.println("Az ellenfel kovetkezik.");
                informacioErtek.setText("Az ellenfél következik.");
            }
        });
        hosGombTamadas.addActionListener(e -> {
            nullazas();
            System.out.println(elsoHely);
            if (elsoHely.charAt(0)!='e' && !hosVolt)  {
                hosTamadasGombBenyomva=true;

                KiKicsoda();
                HosTamad.mutato=0;
                holVagyHos();

                String nev="n";
                if (mutato==0) {
                    nev=elsoHely;
                }else if (mutato==1) {
                    nev=masodikHely;
                }else if (mutato==2) {
                    nev=harmadikHely;
                }else if (mutato==3) {
                    nev=negyedikHely;
                }else if (mutato==4) {
                    nev=otodikHely;
                }else if (mutato==5) {
                    nev=hatodikHely;
                }else if (mutato==6) {
                    nev=hetedikHely;
                }else if (mutato==7) {
                    nev=nyolcadikHely;
                }else if (mutato==8) {
                    nev=kilencedikHely;
                }else if (mutato==9) {
                    nev=tizedikHely;
                }else if (mutato==10) {
                    nev=tizenegyedikHely;
                }else if (mutato==11) {
                    nev=tizenkettedikHely;
                }
                egysegNeve(nev);
                System.out.println(egysegNeve+" hos tamadasa kovetkezik.");
                informacioErtek.setText(egysegNeve+" hős támadása következik.");
            }else if (hosVolt){
                hosTamadasGombBenyomva=false;

                KiKicsoda();
                HosTamad.mutato=0;
                holVagyHos();

                String nev="n";
                if (mutato==0) {
                    nev=elsoHely;
                }else if (mutato==1) {
                    nev=masodikHely;
                }else if (mutato==2) {
                    nev=harmadikHely;
                }else if (mutato==3) {
                    nev=negyedikHely;
                }else if (mutato==4) {
                    nev=otodikHely;
                }else if (mutato==5) {
                    nev=hatodikHely;
                }else if (mutato==6) {
                    nev=hetedikHely;
                }else if (mutato==7) {
                    nev=nyolcadikHely;
                }else if (mutato==8) {
                    nev=kilencedikHely;
                }else if (mutato==9) {
                    nev=tizedikHely;
                }else if (mutato==10) {
                    nev=tizenegyedikHely;
                }else if (mutato==11) {
                    nev=tizenkettedikHely;
                }
                egysegNeve(nev);
                System.out.println(egysegNeve+" hos tamadott mar ebben a korben.");
                informacioErtek.setText(egysegNeve+" hős támadott már ebben a körben.");
            }
        });
        egysegGombTamadas.addActionListener(e -> {
            nullazas();
            egysegNeve(elsoHely);

            if (elsoHely.equals("morLena") || elsoHely.equals("morLaszlo"))  {
                System.out.println("Most "+egysegNeve+" hos kovetkezik, o nem tud tamadni ezzel a gombbal.");
                informacioErtek.setText("Most "+egysegNeve+" hős következik, ő nem tud támadni ezzel a gombbal.");
                tamadasGombBenyomva=false;
            }else {
                System.out.println("Egyseg tamadas aktivalva " + egysegNeve + " egysegnel.");
                informacioErtek.setText("Egység támadás aktiválva " + egysegNeve + " egységnél.");

                sorrendFrissites();

                tamadasGombBenyomva=true;

                egysegSebzese(elsoHely);
                ellenfelek(elsoHely);
            }
        });
        egysegGombMozgas.addActionListener(e -> {
            nullazas();
            egysegNeve(elsoHely);
            if (elsoHely.equals("morLena") || elsoHely.equals("morLaszlo"))  {
                System.out.println("Most "+egysegNeve+" hos kovetkezik, o nem tud mozogni.");
                informacioErtek.setText("Most "+egysegNeve+" hős következik, ő nem tud mozogni.");
                lepesGombBenyomva=false;
            }else {

                sorrendFrissites();

                lepesGombBenyomva=true;

                mekkoraTavolsagodGET(elsoHely);
                mekkoraTeruleteVan(elsoHely);

                hanyadikKor(elsoHely);
                korokKiirasa();
                System.out.println("Egyseg mozgas aktivalva "+egysegNeve+" egysegnel,<p> akinek a sebessege "
                +egysegSebessege+".");
                informacioErtek.setText("<html><center>Egység mozgás aktiválva "+egysegNeve+" egységnél,<p> akinek a sebessége "
                        +egysegSebessege+". </p></center></html>");
            }
        });
        egysegGombVarakozas.addActionListener(e -> {
            egysegNeve(elsoHely);
            if (elsoHely.equals("morLena") && !hosCsapatKovetkezik)  {
                System.out.println("most Lena hos kovetkezik, o nem tud varakozni");
                informacioErtek.setText("Most Léna hős következik, ő nem tud várakozni");
            }else if (hosCsapatKovetkezik && !elsoHely.equals("morLaszlo")){
                System.out.println("egyseg varakozas aktivalva "+elsoHely+" egysegnel");
                informacioErtek.setText("Egység várakozás aktiválva "+egysegNeve+" egységnél." );

                double ujErtek2 = moralSorrendTList.get(0);

                moralSorrendTList.remove(0);
                moralSorrendTList.add(ujErtek2);

                hanyadikKor(elsoHely);
                korokKiirasa();

                sorrendFrissites();
                ellenfelAlapok();
            }else if (elsoHely.equals("morLaszlo")) {
                System.out.println("most Laszlo hos kovetkezik, o nem tud varakozni");
                informacioErtek.setText("most László hős következik, ő nem tud várakozni");
            }
        });
    }

    public static JatekAblak getInstance()
    {
        if (instance == null)
            instance = new JatekAblak();

        return instance;
    }

    public static JFrame ablakCsata = new JFrame("Heroes of Might & Magic");

    public static ImageIcon ikon = new ImageIcon("Kepek/ikon.png");
    public static ImageIcon csataKepLovag = new ImageIcon("Kepek/csata.jpg");
    public static ImageIcon csataKepNekromanta = new ImageIcon("Kepek/csataNekromanta.jpg");
    public static JLabel alapcsata = new JLabel("",csataKepLovag,JLabel.CENTER);

    public static JLabel informacioErtek = new JLabel("", SwingConstants.RIGHT);
    static JPanel informacio = new JPanel();

    static JLabel korokSzama = new JLabel();
    static JPanel korErtek = new JPanel();

    public static JLayeredPane gyozelemVagyVereseg = new JLayeredPane();
    public static ImageIcon gyozelemNekromanta = new ImageIcon("Kepek/NekromantaGyozelem.jpg");
    public static ImageIcon gyozelemLaszlo = new ImageIcon("Kepek/LaszloGyozelem.jpg");
    public static ImageIcon veresegNekromanta = new ImageIcon("Kepek/NekromantaVereseg.jpg");
    public static ImageIcon veresegLaszlo = new ImageIcon("Kepek/LaszloVereseg.jpg");
    public static ImageIcon dontetlenLaszlo = new ImageIcon("Kepek/LaszloDontetlen.jpg");
    public static ImageIcon dontetlenLena = new ImageIcon("Kepek/LenaDontetlen.jpg");

    public static JLabel gyozNekromanta = new JLabel(gyozelemNekromanta);
    public static JLabel gyozLaszlo = new JLabel(gyozelemLaszlo);
    public static JLabel veszNekromanta = new JLabel(veresegNekromanta);
    public static JLabel veszLaszlo = new JLabel(veresegLaszlo);
    public static JLabel donLaszlo = new JLabel(dontetlenLaszlo);
    public static JLabel donLena = new JLabel(dontetlenLena);

    public static boolean elsoAlkalommal0=false;
    public static boolean lepesGombBenyomva=false;
    public static boolean tamadasGombBenyomva=false;
    public static boolean hosTamadasGombBenyomva=false;
    public static boolean hosLassitasGombBenyomva=false;
    public static boolean hosTuzlabdaGombBenyomva=false;
    public static boolean hosVillamcsapasGombBenyomva=false;
    public static boolean hosIstenieroGombBenyomva=false;
    public static boolean hosFeltamasztasGombBenyomva=false;

    public static boolean vege=false;

    public static String egysegNeve="n";

    public static Font fontInf = new Font("Arial", Font.BOLD, 15);
    public static Font fontKor = new Font("Arial", Font.BOLD, 28);
    public static final String pirosSzin = "\u001B[41m";
    public static final String zoldSzin = "\u001B[42m";
    public static final String vilagoskekSzin = "\u001B[46m";
    public static final String eredetiSzin = "\u001B[0m";


    public static void jatekAblak() {

        if(elsoAlkalommal0) {
            System.out.println(" ");
            System.out.println("------------------------- Csata Kezdete -------------------------");

            palya();

            Sorrend.moralKiszamitas();
            try {
                Sorrend.sorrendKiszamitas();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }


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

            if (csontvazSzam > 0) {
                poziciokAtmeretezes(elsoO, elsoS, "csont");
            }
            if (foldmuvesSzam > 0) {
                poziciokAtmeretezes(elsoO, elsoS, "foldmuv");
            }
            if (felderitoSzam > 0) {
                poziciokAtmeretezes(masodikO, masodikS, "felder");
            }
            if (ijaszSzam > 0) {
                poziciokAtmeretezes(masodikO, masodikS, "ijas");
            }
            if (minotaurSzam > 0) {
                poziciokAtmeretezes(harmadikO, harmadikS, "mino");
            }
            if (griffSzam > 0) {
                poziciokAtmeretezes(harmadikO, harmadikS, "grif");
            }
            if (fegyvernokSzam > 0) {
                poziciokAtmeretezes(negyedikO, negyedikS, "fegyv");
            }
            if (orgyilkosSzam > 0) {
                poziciokAtmeretezes(negyedikO, negyedikS, "orgy");
            }
            if (raptorLovasSzam > 0) {
                poziciokAtmeretezes(otodikO, otodikS, "rapt");
            }
            if (harcosPapSzam > 0) {
                poziciokAtmeretezes(otodikO, otodikS, "harcp");
            }
            if (ellenfelCsontvazSzam > 0) {
                poziciokAtmeretezes(elsoOEll, elsoSEll, "ecsont");
            }
            if (ellenfelFoldmuvesSzam > 0) {
                poziciokAtmeretezes(elsoOEll, elsoSEll, "efoldm");
            }
            if (ellenfelFelderitoSzam > 0) {
                poziciokAtmeretezes(masodikOEll, masodikSEll, "efelder");
            }
            if (ellenfelIjaszSzam > 0) {
                poziciokAtmeretezes(masodikOEll, masodikSEll, "eijas");
            }
            if (ellenfelMinotaurSzam > 0) {
                poziciokAtmeretezes(harmadikOEll, harmadikSEll, "emino");
            }
            if (ellenfelGriffSzam > 0) {
                poziciokAtmeretezes(harmadikOEll, harmadikSEll, "egrif");
            }
            if (ellenfelFegyvernokSzam > 0) {
                poziciokAtmeretezes(negyedikOEll, negyedikSEll, "efegyv");
            }
            if (ellenfelOrgyilkosSzam > 0) {
                poziciokAtmeretezes(negyedikOEll, negyedikSEll, "eorgy");
            }
            if (ellenfelRaptorLovasSzam > 0) {
                poziciokAtmeretezes(otodikOEll, otodikSEll, "erapt");
            }
            if (ellenfelHarcosPapSzam > 0) {
                poziciokAtmeretezes(otodikOEll, otodikSEll, "eharcp");
            }

            varazslatVanCsata();
            tuzlabdaGomb();
            villamcsapasGomb();
            lassitasGomb();
            feltamasztasGomb();
            istenieroGomb();
            hosTamadasGomb();
            egysegTamadasGomb();
            egysegVarakozasGomb();
            egysegMozgasGomb();
            tamadasaTulajdonsagCsata();
            mannaTulajdonsagCsata();
            tamadasTulajdonsagCsataH();
            mannaTulajdonsagCsataH();
            informacio();
            hanyadikKor(elsoHely);
            korokKiirasa();
            ellenfelAlapok();
        }

        feladas.setBounds(35, 20, 156, 40);
        feladas.setOpaque(false);
        feladas.setContentAreaFilled(false);
        feladas.setBorderPainted(false);
        feladas.setFocusable(false);

        ablakCsata.add(feladas);

        ablakCsata.setIconImage(ikon.getImage());

        ablakCsata.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ablakCsata.setSize(1292, 635);
        ablakCsata.setLayout(new BorderLayout());
        ablakCsata.setVisible(true);
        ablakCsata.setResizable(false);
        ablakCsata.add(alapcsata);
        ablakCsata.setLocationRelativeTo(null);
    }

    public static void nullazas() {
        hosLassitasGombBenyomva=false;
        hosTamadasGombBenyomva=false;
        tamadasGombBenyomva=false;
        lepesGombBenyomva=false;
        hosTuzlabdaGombBenyomva=false;
        hosIstenieroGombBenyomva=false;
        hosFeltamasztasGombBenyomva=false;
        hosVillamcsapasGombBenyomva=false;
    }

    public static void tuzlabdaGomb() {

         gombTuzlabda.setBounds(17,250, 55, 55);
         gombTuzlabda.setOpaque(false);
         gombTuzlabda.setContentAreaFilled(false);
         gombTuzlabda.setBorderPainted(false);
         gombTuzlabda.setFocusable(false);

        alapcsata.add(gombTuzlabda);
    }

    public static void villamcsapasGomb() {

        gombVillamcsapas.setBounds(157,250, 55, 55);
        gombVillamcsapas.setOpaque(false);
        gombVillamcsapas.setContentAreaFilled(false);
        gombVillamcsapas.setBorderPainted(false);
        gombVillamcsapas.setFocusable(false);

        alapcsata.add(gombVillamcsapas);
    }

    public static void lassitasGomb() {

        gombLassitas.setBounds(87,250, 55, 55);
        gombLassitas.setOpaque(false);
        gombLassitas.setContentAreaFilled(false);
        gombLassitas.setBorderPainted(false);
        gombLassitas.setFocusable(false);

        alapcsata.add(gombLassitas);
    }

    public static void feltamasztasGomb() {

        gombFeltamasztas.setBounds(87,171, 55, 55);
        gombFeltamasztas.setOpaque(false);
        gombFeltamasztas.setContentAreaFilled(false);
        gombFeltamasztas.setBorderPainted(false);
        gombFeltamasztas.setFocusable(false);

        alapcsata.add(gombFeltamasztas);
    }

    public static void istenieroGomb() {

        gombIsteniEro.setBounds(157,171, 55, 55);
        gombIsteniEro.setOpaque(false);
        gombIsteniEro.setContentAreaFilled(false);
        gombIsteniEro.setBorderPainted(false);
        gombIsteniEro.setFocusable(false);

        alapcsata.add(gombIsteniEro);
    }

    public static void hosTamadasGomb() {

        hosGombTamadas.setBounds(17, 171, 55, 55);
        hosGombTamadas.setOpaque(false);
        hosGombTamadas.setContentAreaFilled(false);
        hosGombTamadas.setBorderPainted(false);
        hosGombTamadas.setFocusable(false);

        alapcsata.add(hosGombTamadas);
    }

    public static void egysegTamadasGomb() {

        egysegGombTamadas.setBounds(17, 369, 55, 55);
        egysegGombTamadas.setOpaque(false);
        egysegGombTamadas.setContentAreaFilled(false);
        egysegGombTamadas.setBorderPainted(false);
        egysegGombTamadas.setFocusable(false);

        alapcsata.add(egysegGombTamadas);
    }

    public static void egysegVarakozasGomb() {

        egysegGombVarakozas.setBounds(87, 369, 55, 55);
        egysegGombVarakozas.setOpaque(false);
       egysegGombVarakozas.setContentAreaFilled(false);
       egysegGombVarakozas.setBorderPainted(false);
       egysegGombVarakozas.setFocusable(false);

        alapcsata.add(egysegGombVarakozas);
    }

    public static void egysegMozgasGomb() {

        egysegGombMozgas.setBounds(157, 369, 55, 55);
        egysegGombMozgas.setOpaque(false);
        egysegGombMozgas.setContentAreaFilled(false);
        egysegGombMozgas.setBorderPainted(false);
        egysegGombMozgas.setFocusable(false);

        alapcsata.add(egysegGombMozgas);
    }

    public static void informacio() {
        informacioErtek.setFont(fontInf);
        informacioErtek.setForeground(new Color(227, 179, 49));

        informacio.setBounds(820,543,450,50);

        informacio.setBackground(Color.BLACK);

        informacioErtek.setText("<html><center><u>Jó játékot!</u><p>Az információk itt jelennek majd meg.</p></center></html>");
        informacio.add(informacioErtek);
        informacio.setOpaque(false);
        informacio.repaint();
        alapcsata.add(informacio);
    }

    public static void korokKiirasa() {
        korokSzama.setFont(fontKor);
        korokSzama.setForeground(new Color(234, 209, 138));

        korErtek.setBounds(700,549,60,50);

        korokSzama.setText(kor+".");

//        System.out.println("");
//        System.out.println( "1.1 "+sor1oszlop1Nev+" "+sor1oszlop1+" , 1.5 "+  sor1oszlop5Nev+" "+sor1oszlop5+" , 1.9"+sor1oszlop9Nev+" "+sor1oszlop9+" , "+
//                "2.1 "+sor2oszlop1Nev+" "+sor2oszlop1+" , 2.5 "+  sor2oszlop5Nev+" "+sor2oszlop5+" , 2.9"+sor2oszlop9Nev+" "+sor2oszlop9+" , "+
//                "3.1 "+sor3oszlop1Nev+" "+sor3oszlop1+" , 3.5 "+  sor3oszlop5Nev+" "+sor3oszlop5+" , 3.9"+sor3oszlop9Nev+" "+sor3oszlop9+" , "+
//                "4.1 "+sor4oszlop1Nev+" "+sor4oszlop1+" , 4.5 "+  sor4oszlop5Nev+" "+sor4oszlop5+" , 4.9"+sor4oszlop9Nev+" "+sor4oszlop9+" , "+
//                "5.1 "+sor5oszlop1Nev+" "+sor5oszlop1+" , 5.5 "+  sor5oszlop5Nev+" "+sor5oszlop5+" , 5.9"+sor5oszlop9Nev+" "+sor5oszlop9+" , "+
//                "6.1 "+sor6oszlop1Nev+" "+sor6oszlop1+" , 6.5 "+  sor6oszlop5Nev+" "+sor6oszlop5+" , 6.9"+sor6oszlop9Nev+" "+sor6oszlop9+" , "+
//                "7.1 "+sor7oszlop1Nev+" "+sor7oszlop1+" , 7.5 "+  sor7oszlop5Nev+" "+sor7oszlop5+" , 7.9"+sor7oszlop9Nev+" "+sor7oszlop9+" , "+
//                "8.1 "+sor8oszlop1Nev+" "+sor8oszlop1+" , 8.5 "+  sor8oszlop5Nev+" "+sor8oszlop5+" , 8.9"+sor8oszlop9Nev+" "+sor8oszlop9+" , "+
//                "9.1 "+sor9oszlop1Nev+" "+sor9oszlop1+" , 9.5 "+  sor9oszlop5Nev+" "+sor9oszlop5+" , 9.9"+sor9oszlop9Nev+" "+sor9oszlop9+" , "+
//                "10.1 "+sor10oszlop1Nev+" "+sor10oszlop1+" , 10.5"+sor10oszlop5Nev+" "+sor10oszlop5+" , 10.9"+sor10oszlop9Nev+" "+sor10oszlop9+" , "+
//                "1.2 "+sor1oszlop2Nev+" "+sor1oszlop2+" , 1.6 "+  sor1oszlop6Nev+" "+sor1oszlop6+" , 1.10"+sor1oszlop10Nev+" "+sor1oszlop10+" , "+
//                "2.2 "+sor2oszlop2Nev+" "+sor2oszlop2+" , 2.6 "+  sor2oszlop6Nev+" "+sor2oszlop6+" , 2.10"+sor2oszlop10Nev+" "+sor2oszlop10+" , "+
//                "3.2 "+sor3oszlop2Nev+" "+sor3oszlop2+" , 3.6 "+  sor3oszlop6Nev+" "+sor3oszlop6+" , 3.10"+sor3oszlop10Nev+" "+sor3oszlop10+" , "+
//                "4.2 "+sor4oszlop2Nev+" "+sor4oszlop2+" , 4.6 "+  sor4oszlop6Nev+" "+sor4oszlop6+" , 4.10"+sor4oszlop10Nev+" "+sor4oszlop10+" , "+
//                "5.2 "+sor5oszlop2Nev+" "+sor5oszlop2+" , 5.6 "+  sor5oszlop6Nev+" "+sor5oszlop6+" , 5.10"+sor5oszlop10Nev+" "+sor5oszlop10+" , "+
//                "6.2 "+sor6oszlop2Nev+" "+sor6oszlop2+" , 6.6 "+  sor6oszlop6Nev+" "+sor6oszlop6+" , 6.10"+sor6oszlop10Nev+" "+sor6oszlop10+" , "+
//                "7.2 "+sor7oszlop2Nev+" "+sor7oszlop2+" , 7.6 "+  sor7oszlop6Nev+" "+sor7oszlop6+" , 7.10"+sor7oszlop10Nev+" "+sor7oszlop10+" , "+
//                "8.2 "+sor8oszlop2Nev+" "+sor8oszlop2+" , 8.6 "+  sor8oszlop6Nev+" "+sor8oszlop6+" , 8.10"+sor8oszlop10Nev+" "+sor8oszlop10+" , "+
//                "9.2 "+sor9oszlop2Nev+" "+sor9oszlop2+" , 9.6 "+  sor9oszlop6Nev+" "+sor9oszlop6+" , 9.10"+sor9oszlop10Nev+" "+sor9oszlop10+" , "+
//                "10.2 "+sor10oszlop2Nev+" "+sor10oszlop2+" , 10.6"+sor10oszlop6Nev+" "+sor10oszlop6+" , 10.10"+sor10oszlop10Nev+" "+sor10oszlop10+" , "+
//                "1.3 "+sor1oszlop3Nev+" "+sor1oszlop3+" , 1.7 "+  sor1oszlop7Nev+" "+sor1oszlop7+" , 1.11"+sor1oszlop11Nev+" "+sor1oszlop11+" , "+
//                "2.3 "+sor2oszlop3Nev+" "+sor2oszlop3+" , 2.7 "+  sor2oszlop7Nev+" "+sor2oszlop7+" , 2.11"+sor2oszlop11Nev+" "+sor2oszlop11+" , "+
//                "3.3 "+sor3oszlop3Nev+" "+sor3oszlop3+" , 3.7 "+  sor3oszlop7Nev+" "+sor3oszlop7+" , 3.11"+sor3oszlop11Nev+" "+sor3oszlop11+" , "+
//                "4.3 "+sor4oszlop3Nev+" "+sor4oszlop3+" , 4.7 "+  sor4oszlop7Nev+" "+sor4oszlop7+" , 4.11"+sor4oszlop11Nev+" "+sor4oszlop11+" , "+
//                "5.3 "+sor5oszlop3Nev+" "+sor5oszlop3+" , 5.7 "+  sor5oszlop7Nev+" "+sor5oszlop7+" , 5.11"+sor5oszlop11Nev+" "+sor5oszlop11+" , "+
//                "6.3 "+sor6oszlop3Nev+" "+sor6oszlop3+" , 6.7 "+  sor6oszlop7Nev+" "+sor6oszlop7+" , 6.11"+sor6oszlop11Nev+" "+sor6oszlop11+" , "+
//                "7.3 "+sor7oszlop3Nev+" "+sor7oszlop3+" , 7.7 "+  sor7oszlop7Nev+" "+sor7oszlop7+" , 7.11"+sor7oszlop11Nev+" "+sor7oszlop11+" , "+
//                "8.3 "+sor8oszlop3Nev+" "+sor8oszlop3+" , 8.7 "+  sor8oszlop7Nev+" "+sor8oszlop7+" , 8.11"+sor8oszlop11Nev+" "+sor8oszlop11+" , "+
//                "9.3 "+sor9oszlop3Nev+" "+sor9oszlop3+" , 9.7 "+  sor9oszlop7Nev+" "+sor9oszlop7+" , 9.11"+sor9oszlop11Nev+" "+sor9oszlop11+" , "+
//                "10.3 "+sor10oszlop3Nev+" "+sor10oszlop3+" , 10.7"+sor10oszlop7Nev+" "+sor10oszlop7+" , 10.11"+sor10oszlop11Nev+" "+sor10oszlop11+" , "+
//                "1.4 "+sor1oszlop4Nev+" "+sor1oszlop4+" , 1.8 "+  sor1oszlop8Nev+" "+sor1oszlop8+" , 1.12"+sor1oszlop12Nev+" "+sor1oszlop12+" , "+
//                "2.4 "+sor2oszlop4Nev+" "+sor2oszlop4+" , 2.8 "+  sor2oszlop8Nev+" "+sor2oszlop8+" , 2.12"+sor2oszlop12Nev+" "+sor2oszlop12+" , "+
//                "3.4 "+sor3oszlop4Nev+" "+sor3oszlop4+" , 3.8 "+  sor3oszlop8Nev+" "+sor3oszlop8+" , 3.12"+sor3oszlop12Nev+" "+sor3oszlop12+" , "+
//                "4.4 "+sor4oszlop4Nev+" "+sor4oszlop4+" , 4.8 "+  sor4oszlop8Nev+" "+sor4oszlop8+" , 4.12"+sor4oszlop12Nev+" "+sor4oszlop12+" , "+
//                "5.4 "+sor5oszlop4Nev+" "+sor5oszlop4+" , 5.8 "+  sor5oszlop8Nev+" "+sor5oszlop8+" , 5.12"+sor5oszlop12Nev+" "+sor5oszlop12+" , "+
//                "6.4 "+sor6oszlop4Nev+" "+sor6oszlop4+" , 6.8 "+  sor6oszlop8Nev+" "+sor6oszlop8+" , 6.12"+sor6oszlop12Nev+" "+sor6oszlop12+" , "+
//                "7.4 "+sor7oszlop4Nev+" "+sor7oszlop4+" , 7.8 "+  sor7oszlop8Nev+" "+sor7oszlop8+" , 7.12"+sor7oszlop12Nev+" "+sor7oszlop12+" , "+
//                "8.4 "+sor8oszlop4Nev+" "+sor8oszlop4+" , 8.8 "+  sor8oszlop8Nev+" "+sor8oszlop8+" , 8.12"+sor8oszlop12Nev+" "+sor8oszlop12+" , "+
//                "9.4 "+sor9oszlop4Nev+" "+sor9oszlop4+" , 9.8 "+  sor9oszlop8Nev+" "+sor9oszlop8+" , 9.12"+sor9oszlop12Nev+" "+sor9oszlop12+" , "+
//                "10.4 "+sor10oszlop4Nev+" "+sor10oszlop4+" , 10.8"+sor10oszlop8Nev+" "+sor10oszlop8+" , 10.12"+sor10oszlop12Nev+" "+sor10oszlop12);
//        System.out.println("");

        korErtek.add(korokSzama);
        korErtek.setOpaque(false);
        korErtek.repaint();
        alapcsata.add(korErtek);
    }

    public static void palya() {

        int X=313,Y=89;

        Palya_Lepes gombokLepeshez = Palya_Lepes.getInstance();
        gombokLepeshez.palyaGomobokLetetel(X,Y,palyaS1O1);
        gombokLepeshez.palyaGomobokLetetel(X+74,Y,palyaS1O2);
        gombokLepeshez.palyaGomobokLetetel(X+74*2,Y,palyaS1O3);
        gombokLepeshez.palyaGomobokLetetel(X+74*3,Y,palyaS1O4);
        gombokLepeshez.palyaGomobokLetetel(X+74*4,Y,palyaS1O5);
        gombokLepeshez.palyaGomobokLetetel(X+74*5,Y,palyaS1O6);
        gombokLepeshez.palyaGomobokLetetel(X+74*6,Y,palyaS1O7);
        gombokLepeshez.palyaGomobokLetetel(X+74*7,Y,palyaS1O8);
        gombokLepeshez.palyaGomobokLetetel(X+74*8,Y,palyaS1O9);
        gombokLepeshez.palyaGomobokLetetel(X+74*9,Y,palyaS1O10);
        gombokLepeshez.palyaGomobokLetetel(X+74*10,Y,palyaS1O11);
        gombokLepeshez.palyaGomobokLetetel(X+74*11,Y,palyaS1O12);

        gombokLepeshez.palyaGomobokLetetel(X,Y+44,palyaS2O1);
        gombokLepeshez.palyaGomobokLetetel(X+74,Y+44,palyaS2O2);
        gombokLepeshez.palyaGomobokLetetel(X+74*2,Y+44,palyaS2O3);
        gombokLepeshez.palyaGomobokLetetel(X+74*3,Y+44,palyaS2O4);
        gombokLepeshez.palyaGomobokLetetel(X+74*4,Y+44,palyaS2O5);
        gombokLepeshez.palyaGomobokLetetel(X+74*5,Y+44,palyaS2O6);
        gombokLepeshez.palyaGomobokLetetel(X+74*6,Y+44,palyaS2O7);
        gombokLepeshez.palyaGomobokLetetel(X+74*7,Y+44,palyaS2O8);
        gombokLepeshez.palyaGomobokLetetel(X+74*8,Y+44,palyaS2O9);
        gombokLepeshez.palyaGomobokLetetel(X+74*9,Y+44,palyaS2O10);
        gombokLepeshez.palyaGomobokLetetel(X+74*10,Y+44,palyaS2O11);
        gombokLepeshez.palyaGomobokLetetel(X+74*11,Y+44,palyaS2O12);

        gombokLepeshez.palyaGomobokLetetel(X,Y+44*2,palyaS3O1);
        gombokLepeshez.palyaGomobokLetetel(X+74,Y+44*2,palyaS3O2);
        gombokLepeshez.palyaGomobokLetetel(X+74*2,Y+44*2,palyaS3O3);
        gombokLepeshez.palyaGomobokLetetel(X+74*3,Y+44*2,palyaS3O4);
        gombokLepeshez.palyaGomobokLetetel(X+74*4,Y+44*2,palyaS3O5);
        gombokLepeshez.palyaGomobokLetetel(X+74*5,Y+44*2,palyaS3O6);
        gombokLepeshez.palyaGomobokLetetel(X+74*6,Y+44*2,palyaS3O7);
        gombokLepeshez.palyaGomobokLetetel(X+74*7,Y+44*2,palyaS3O8);
        gombokLepeshez.palyaGomobokLetetel(X+74*8,Y+44*2,palyaS3O9);
        gombokLepeshez.palyaGomobokLetetel(X+74*9,Y+44*2,palyaS3O10);
        gombokLepeshez.palyaGomobokLetetel(X+74*10,Y+44*2,palyaS3O11);
        gombokLepeshez.palyaGomobokLetetel(X+74*11,Y+44*2,palyaS3O12);

        gombokLepeshez.palyaGomobokLetetel(X,Y+44*3,palyaS4O1);
        gombokLepeshez.palyaGomobokLetetel(X+74,Y+44*3,palyaS4O2);
        gombokLepeshez.palyaGomobokLetetel(X+74*2,Y+44*3,palyaS4O3);
        gombokLepeshez.palyaGomobokLetetel(X+74*3,Y+44*3,palyaS4O4);
        gombokLepeshez.palyaGomobokLetetel(X+74*4,Y+44*3,palyaS4O5);
        gombokLepeshez.palyaGomobokLetetel(X+74*5,Y+44*3,palyaS4O6);
        gombokLepeshez.palyaGomobokLetetel(X+74*6,Y+44*3,palyaS4O7);
        gombokLepeshez.palyaGomobokLetetel(X+74*7,Y+44*3,palyaS4O8);
        gombokLepeshez.palyaGomobokLetetel(X+74*8,Y+44*3,palyaS4O9);
        gombokLepeshez.palyaGomobokLetetel(X+74*9,Y+44*3,palyaS4O10);
        gombokLepeshez.palyaGomobokLetetel(X+74*10,Y+44*3,palyaS4O11);
        gombokLepeshez.palyaGomobokLetetel(X+74*11,Y+44*3,palyaS4O12);

        gombokLepeshez.palyaGomobokLetetel(X,Y+44*4,palyaS5O1);
        gombokLepeshez.palyaGomobokLetetel(X+74,Y+44*4,palyaS5O2);
        gombokLepeshez.palyaGomobokLetetel(X+74*2,Y+44*4,palyaS5O3);
        gombokLepeshez.palyaGomobokLetetel(X+74*3,Y+44*4,palyaS5O4);
        gombokLepeshez.palyaGomobokLetetel(X+74*4,Y+44*4,palyaS5O5);
        gombokLepeshez.palyaGomobokLetetel(X+74*5,Y+44*4,palyaS5O6);
        gombokLepeshez.palyaGomobokLetetel(X+74*6,Y+44*4,palyaS5O7);
        gombokLepeshez.palyaGomobokLetetel(X+74*7,Y+44*4,palyaS5O8);
        gombokLepeshez.palyaGomobokLetetel(X+74*8,Y+44*4,palyaS5O9);
        gombokLepeshez.palyaGomobokLetetel(X+74*9,Y+44*4,palyaS5O10);
        gombokLepeshez.palyaGomobokLetetel(X+74*10,Y+44*4,palyaS5O11);
        gombokLepeshez.palyaGomobokLetetel(X+74*11,Y+44*4,palyaS5O12);

        gombokLepeshez.palyaGomobokLetetel(X,Y+44*5,palyaS6O1);
        gombokLepeshez.palyaGomobokLetetel(X+74,Y+44*5,palyaS6O2);
        gombokLepeshez.palyaGomobokLetetel(X+74*2,Y+44*5,palyaS6O3);
        gombokLepeshez.palyaGomobokLetetel(X+74*4,Y+44*5,palyaS6O5);
        gombokLepeshez.palyaGomobokLetetel(X+74*5,Y+44*5,palyaS6O6);
        gombokLepeshez.palyaGomobokLetetel(X+74*6,Y+44*5,palyaS6O7);
        gombokLepeshez.palyaGomobokLetetel(X+74*7,Y+44*5,palyaS6O8);
        gombokLepeshez.palyaGomobokLetetel(X+74*8,Y+44*5,palyaS6O9);
        gombokLepeshez.palyaGomobokLetetel(X+74*9,Y+44*5,palyaS6O10);
        gombokLepeshez.palyaGomobokLetetel(X+74*10,Y+44*5,palyaS6O11);
        gombokLepeshez.palyaGomobokLetetel(X+74*11,Y+44*5,palyaS6O12);

        gombokLepeshez.palyaGomobokLetetel(X,Y+44*6,palyaS7O1);
        gombokLepeshez.palyaGomobokLetetel(X+74,Y+44*6,palyaS7O2);
        gombokLepeshez.palyaGomobokLetetel(X+74*2,Y+44*6,palyaS7O3);
        gombokLepeshez.palyaGomobokLetetel(X+74*3,Y+44*6,palyaS7O4);
        gombokLepeshez.palyaGomobokLetetel(X+74*4,Y+44*6,palyaS7O5);
        gombokLepeshez.palyaGomobokLetetel(X+74*5,Y+44*6,palyaS7O6);
        gombokLepeshez.palyaGomobokLetetel(X+74*6,Y+44*6,palyaS7O7);
        gombokLepeshez.palyaGomobokLetetel(X+74*9,Y+44*6,palyaS7O10);
        gombokLepeshez.palyaGomobokLetetel(X+74*10,Y+44*6,palyaS7O11);
        gombokLepeshez.palyaGomobokLetetel(X+74*11,Y+44*6,palyaS7O12);

        gombokLepeshez.palyaGomobokLetetel(X,Y+44*7,palyaS8O1);
        gombokLepeshez.palyaGomobokLetetel(X+74,Y+44*7,palyaS8O2);
        gombokLepeshez.palyaGomobokLetetel(X+74*2,Y+44*7,palyaS8O3);
        gombokLepeshez.palyaGomobokLetetel(X+74*3,Y+44*7,palyaS8O4);
        gombokLepeshez.palyaGomobokLetetel(X+74*4,Y+44*7,palyaS8O5);
        gombokLepeshez.palyaGomobokLetetel(X+74*7,Y+44*7,palyaS8O8);
        gombokLepeshez.palyaGomobokLetetel(X+74*8,Y+44*7,palyaS8O9);
        gombokLepeshez.palyaGomobokLetetel(X+74*9,Y+44*7,palyaS8O10);
        gombokLepeshez.palyaGomobokLetetel(X+74*10,Y+44*7,palyaS8O11);
        gombokLepeshez.palyaGomobokLetetel(X+74*11,Y+44*7,palyaS8O12);

        gombokLepeshez.palyaGomobokLetetel(X,Y+44*8,palyaS9O1);
        gombokLepeshez.palyaGomobokLetetel(X+74,Y+44*8,palyaS9O2);
        gombokLepeshez.palyaGomobokLetetel(X+74*4,Y+44*8,palyaS9O5);
        gombokLepeshez.palyaGomobokLetetel(X+74*5,Y+44*8,palyaS9O6);
        gombokLepeshez.palyaGomobokLetetel(X+74*6,Y+44*8,palyaS9O7);
        gombokLepeshez.palyaGomobokLetetel(X+74*7,Y+44*8,palyaS9O8);
        gombokLepeshez.palyaGomobokLetetel(X+74*8,Y+44*8,palyaS9O9);
        gombokLepeshez.palyaGomobokLetetel(X+74*9,Y+44*8,palyaS9O10);
        gombokLepeshez.palyaGomobokLetetel(X+74*10,Y+44*8,palyaS9O11);
        gombokLepeshez.palyaGomobokLetetel(X+74*11,Y+44*8,palyaS9O12);

        gombokLepeshez.palyaGomobokLetetel(X,Y+44*9,palyaS10O1);
        gombokLepeshez.palyaGomobokLetetel(X+74,Y+44*9,palyaS10O2);
        gombokLepeshez.palyaGomobokLetetel(X+74*4,Y+44*9,palyaS10O5);
        gombokLepeshez.palyaGomobokLetetel(X+74*5,Y+44*9,palyaS10O6);
        gombokLepeshez.palyaGomobokLetetel(X+74*6,Y+44*9,palyaS10O7);
        gombokLepeshez.palyaGomobokLetetel(X+74*7,Y+44*9,palyaS10O8);
        gombokLepeshez.palyaGomobokLetetel(X+74*8,Y+44*9,palyaS10O9);
        gombokLepeshez.palyaGomobokLetetel(X+74*9,Y+44*9,palyaS10O10);
        gombokLepeshez.palyaGomobokLetetel(X+74*10,Y+44*9,palyaS10O11);
        gombokLepeshez.palyaGomobokLetetel(X+74*11,Y+44*9,palyaS10O12);


        // kimaradt
        gombokLepeshez.palyaGomobokLetetel(X+74*3,Y+44*5,palyaS6O4);

        gombokLepeshez.palyaGomobokLetetel(X+74*7,Y+44*6,palyaS7O8);
        gombokLepeshez.palyaGomobokLetetel(X+74*8,Y+44*6,palyaS7O9);

        gombokLepeshez.palyaGomobokLetetel(X+74*5,Y+44*7,palyaS8O6);
        gombokLepeshez.palyaGomobokLetetel(X+74*6,Y+44*7,palyaS8O7);

        gombokLepeshez.palyaGomobokLetetel(X+74*2,Y+44*8,palyaS9O3);
        gombokLepeshez.palyaGomobokLetetel(X+74*3,Y+44*8,palyaS9O4);

        gombokLepeshez.palyaGomobokLetetel(X+74*2,Y+44*9,palyaS10O3);
        gombokLepeshez.palyaGomobokLetetel(X+74*3,Y+44*9,palyaS10O4);

    }

    public static void egysegNeve(String egyseg) {

        switch (egyseg) {
            case "foldmuv" -> egysegNeve = "Földműves";
            case "efoldmuv" -> egysegNeve = "Ellenfel Földműves";
            case "erapt" -> egysegNeve = "Ellenfel RaptorLovas";
            case "rapt" -> egysegNeve = "RaptorLovas";
            case "orgy" -> egysegNeve = "Orgyilkos";
            case "eorgy" -> egysegNeve = "Ellenfel Orgyilkos";
            case "mino" -> egysegNeve = "Minótaurosz";
            case "felder" -> egysegNeve = "Felderítő";
            case "efelder" -> egysegNeve = "Ellenfel Felderítő";
            case "csont" -> egysegNeve = "Csontváz";
            case "ecsont" -> egysegNeve = "Ellenfel Csontváz";
            case "ijas" -> egysegNeve = "Ijász";
            case "eijas" -> egysegNeve = "Ellenfel Ijász";
            case "egrif" -> egysegNeve = "Ellenfel Griff";
            case "grif" -> egysegNeve = "Griff";
            case "efegyv" -> egysegNeve = "Ellenfel Fegyvernök";
            case "fegyv" -> egysegNeve = "Fegyvernök";
            case "eharcp" -> egysegNeve = "Ellenfel HarcosPap";
            case "harcp" -> egysegNeve = "HarcosPap";
            case "emino" -> egysegNeve = "Ellenfel Minótaurosz";
            case "morLaszlo" -> egysegNeve = "László";
            case "morLena" -> egysegNeve = "Léna";
        }
    }


    public static void gyozelemVereseg() {

        if (elsoEllEgysegEletero<=0 && masodikEllEgysegEletero<=0 && harmadikEllEgysegEletero<=0 && negyedikEllEgysegEletero<=0 &&
                otodikEllEgysegEletero<=0 && elsoEgysegEletero<=0 && masodikEgysegEletero<=0 && harmadikEgysegEletero<=0 &&
                negyedikEgysegEletero<=0 && otodikEgysegEletero<=0) { // dontetlen

            vege=true;

            ablakCsata.getContentPane().removeAll();
            ablakCsata.repaint();
            alapcsata.removeAll();
            alapcsata.repaint();

            gyozelemVagyVereseg.setBounds(0,0,1292, 635);
            ablakCsata.add(gyozelemVagyVereseg);

            ujJatekGomb.setBounds(567, 410, 187, 51);
            ujJatekGomb.setOpaque(false);
            ujJatekGomb.setContentAreaFilled(false);
            ujJatekGomb.setBorderPainted(false);
            ujJatekGomb.setFocusable(false);

            gyozelemVagyVereseg.add(ujJatekGomb);

            if (lovage==0) {
                donLaszlo.setOpaque(true);
                donLaszlo.setBounds(0,0,1292, 635);
                gyozelemVagyVereseg.add(donLaszlo);
            }else {
                donLena.setOpaque(true);
                donLena.setBounds(0,0,1292, 635);
                gyozelemVagyVereseg.add(donLena);
            }

            System.out.println(vilagoskekSzin + "\nDöntetlen lett a végeredmény!" + eredetiSzin);

        }else if (elsoEgysegEletero<=0 && masodikEgysegEletero<=0 && harmadikEgysegEletero<=0 && negyedikEgysegEletero<=0 &&
                otodikEgysegEletero<=0) { // vereseg

            vege=true;

            ablakCsata.getContentPane().removeAll();
            ablakCsata.repaint();
            alapcsata.removeAll();
            alapcsata.repaint();

            gyozelemVagyVereseg.setBounds(0,0,1292, 635);
            ablakCsata.add(gyozelemVagyVereseg);

            ujJatekGomb.setBounds(567, 410, 187, 51);
            ujJatekGomb.setOpaque(false);
            ujJatekGomb.setContentAreaFilled(false);
            ujJatekGomb.setBorderPainted(false);
            ujJatekGomb.setFocusable(false);

            gyozelemVagyVereseg.add(ujJatekGomb);

            if (lovage==0) {
                veszLaszlo.setOpaque(true);
                veszLaszlo.setBounds(0,0,1292, 635);
                gyozelemVagyVereseg.add(veszLaszlo);
            }else {
                veszNekromanta.setOpaque(true);
                veszNekromanta.setBounds(0,0,1292, 635);
                gyozelemVagyVereseg.add(veszNekromanta);
            }

            System.out.println(pirosSzin + "\nVereséget szenvedtél!" + eredetiSzin);

        }else if (elsoEllEgysegEletero<=0 && masodikEllEgysegEletero<=0 && harmadikEllEgysegEletero<=0 && negyedikEllEgysegEletero<=0 &&
                otodikEllEgysegEletero<=0) {

            vege=true;

            ablakCsata.getContentPane().removeAll();
            ablakCsata.repaint();
            alapcsata.removeAll();
            alapcsata.repaint();

            gyozelemVagyVereseg.setBounds(0,0,1292, 635);
            ablakCsata.add(gyozelemVagyVereseg);

            ujJatekGomb.setBounds(567, 410, 187, 51);
            ujJatekGomb.setOpaque(false);
            ujJatekGomb.setContentAreaFilled(false);
            ujJatekGomb.setBorderPainted(false);
            ujJatekGomb.setFocusable(false);

            gyozelemVagyVereseg.add(ujJatekGomb);

            if (lovage==0) {
                gyozLaszlo.setOpaque(true);
                gyozLaszlo.setBounds(0,0,1292, 635);
                gyozelemVagyVereseg.add(gyozLaszlo);
            }else {
                gyozNekromanta.setOpaque(true);
                gyozNekromanta.setBounds(0,0,1292, 635);
                gyozelemVagyVereseg.add(gyozNekromanta);
            }

            System.out.println(zoldSzin + "\nGyőzelmet arattál!" + eredetiSzin);
        }
    }
}