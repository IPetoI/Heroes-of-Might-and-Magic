package Ellenfel;

import javax.swing.*;

import java.util.Random;

import static Ellenfel.EllenfelTulajdonsaga.ellenfelArany;
import static Ellenfel.EllenfelTulajdonsaga.ellenfelManna;
import static Ablakok.EgysegLepakolasAblak.ablakLepakolas;

public class EllenfelVarazslat {

    private static EllenfelVarazslat instance = null;

    public static EllenfelVarazslat getInstance()
    {
        if (instance == null)
            instance = new EllenfelVarazslat();

        return instance;
    }

    public static Random random = new Random();

    public static JPanel varazslatL1Kep = new JPanel();
    public static JPanel varazslatL2Kep = new JPanel();
    public static JPanel varazslatL3Kep = new JPanel();
    public static JPanel varazslatL4Kep = new JPanel();
    public static JPanel varazslatL5Kep = new JPanel();

    static JLabel varazslatL1Kepe = new JLabel();
    static JLabel varazslatL2Kepe = new JLabel();
    static JLabel varazslatL3Kepe = new JLabel();
    static JLabel varazslatL4Kepe = new JLabel();
    static JLabel varazslatL5Kepe = new JLabel();

    static ImageIcon tuzlabdaff = new ImageIcon("Kepek/varazslatok/tuzlabdaff.png");
    static ImageIcon villamcsapasff = new ImageIcon("Kepek/varazslatok/villamcsapasff.png");
    static ImageIcon lassitasff = new ImageIcon("Kepek/varazslatok/lassitasff.png");
    static ImageIcon feltamasztasff = new ImageIcon("Kepek/varazslatok/feltamasztasff.png");
    static ImageIcon istenieroff = new ImageIcon("Kepek/varazslatok/istenieroff.png");

    static boolean ellenfelTuzlabdaV=false;
    static boolean ellenfelVillamcsapasV=false;
    static boolean ellenfelLassitasV=false;
    static boolean ellenfelFeltamasztasV=false;
    static boolean ellenfelIstenieroV=false;
    static int ellenfelAranyVarazslatra1=0;
    static int ellenfelAranyVarazslatra0=0;
    static int mennyiManna=0;

    public static void ellenfelVarazslatVan() {

        ellenfelVanVarazslat();

        elsoVarazslat();
        masodikVarazslat();
        harmadikVarazslat();
        negyedikVarazslat();
        otodikVarazslat();

    }

    public static void ellenfelVanVarazslat() {

        if (ellenfelManna==10) {
            mennyiManna=550;
        }else if (ellenfelManna<50) {
            mennyiManna=450;
        }else if (ellenfelManna>50) {
            mennyiManna=350;
        }

        do {
            ellenfelAranyVarazslatra1=0;
            ellenfelAranyVarazslatra0=ellenfelArany;

            ellenfelTuzlabdaV=false;
            ellenfelVillamcsapasV=false;
            ellenfelLassitasV=false;
            ellenfelFeltamasztasV=false;
            ellenfelIstenieroV=false;

            ellenfelTuzlabdaV = random.nextBoolean();
            ellenfelVillamcsapasV = random.nextBoolean();
            ellenfelLassitasV = random.nextBoolean();
            ellenfelFeltamasztasV = random.nextBoolean();
            ellenfelIstenieroV = random.nextBoolean();

            if (ellenfelTuzlabdaV) {
                ellenfelAranyVarazslatra1+=120;
            }if (ellenfelVillamcsapasV) {
                ellenfelAranyVarazslatra1+=60;
            }if (ellenfelLassitasV) {
                ellenfelAranyVarazslatra1+=70;
            }if (ellenfelFeltamasztasV) {
                ellenfelAranyVarazslatra1+=120;
            }if (ellenfelIstenieroV) {
                ellenfelAranyVarazslatra1+=180;
            }

            ellenfelAranyVarazslatra0-=ellenfelAranyVarazslatra1;
        }
        while (ellenfelAranyVarazslatra0<mennyiManna) ;

        ellenfelArany=ellenfelAranyVarazslatra0;

        System.out.println("---------------------- Ellenfel Varazslatai ----------------------");
        System.out.println(" ");
        if (ellenfelTuzlabdaV) {
            System.out.println("Ellenfel a tuzlabda varazslatot megvsasarolta");
        }if (ellenfelVillamcsapasV) {
            System.out.println("Ellenfel a villamcsapas varazslatot megvsasarolta");
        }if (ellenfelLassitasV) {
            System.out.println("Ellenfel a lassitas varazslatot megvsasarolta");
        }if (ellenfelFeltamasztasV) {
            System.out.println("Ellenfel a feltamasztas varazslatot megvsasarolta");
        }if (ellenfelIstenieroV) {
            System.out.println("Ellenfel a isteniero varazslatot megvsasarolta");
        }if (!ellenfelTuzlabdaV && !ellenfelVillamcsapasV && !ellenfelLassitasV && !ellenfelFeltamasztasV
                && !ellenfelIstenieroV ) {
            System.out.println("Az ellenfel nem vett varazslatot");
        }
        System.out.println(" ");
        System.out.println("------------------------------------------------------------------");

        System.out.println("Ellenfel aranya varazslat vasarlas utan: "+ellenfelArany);
    }

    public static void elsoVarazslat() {

        varazslatL1Kep.setBounds(1058,497,55,60);
        varazslatL1Kep.setOpaque(false);

        varazslatL1Kepe.setIcon(tuzlabdaff);
        varazslatL1Kep.add(varazslatL1Kepe);
        varazslatL1Kep.setVisible(true);
        if (ellenfelTuzlabdaV) {
            varazslatL1Kep.setVisible(false);
        }
        ablakLepakolas.add(varazslatL1Kep);
    }

    public static void masodikVarazslat() {

        varazslatL2Kep.setBounds(1198,497,55,60);
        varazslatL2Kep.setOpaque(false);

        varazslatL2Kepe.setIcon(villamcsapasff);
        varazslatL2Kep.add(varazslatL2Kepe);
        varazslatL2Kep.setVisible(true);
        if (ellenfelVillamcsapasV) {
            varazslatL2Kep.setVisible(false);
        }
        ablakLepakolas.add(varazslatL2Kep);
    }

    public static void harmadikVarazslat() {

        varazslatL3Kep.setBounds(1128,497,55,60);
        varazslatL3Kep.setOpaque(false);

        varazslatL3Kepe.setIcon(lassitasff);
        varazslatL3Kep.add(varazslatL3Kepe);
        varazslatL3Kep.setVisible(true);
        if (ellenfelLassitasV) {
            varazslatL3Kep.setVisible(false);
        }
        ablakLepakolas.add(varazslatL3Kep);
    }

    public static void negyedikVarazslat() {

        varazslatL4Kep.setBounds(1094,417,55,60);
        varazslatL4Kep.setOpaque(false);

        varazslatL4Kepe.setIcon(feltamasztasff);
        varazslatL4Kep.add(varazslatL4Kepe);
        varazslatL4Kep.setVisible(true);
        if (ellenfelFeltamasztasV) {
            varazslatL4Kep.setVisible(false);
        }
        ablakLepakolas.add(varazslatL4Kep);
    }

    public static void otodikVarazslat() {

        varazslatL5Kep.setBounds(1165,417,55,60);
        varazslatL5Kep.setOpaque(false);

        varazslatL5Kepe.setIcon(istenieroff);
        varazslatL5Kep.add(varazslatL5Kepe);
        varazslatL5Kep.setVisible(true);
        if (ellenfelIstenieroV) {
            varazslatL5Kep.setVisible(false);
        }
        ablakLepakolas.add(varazslatL5Kep);
    }
}

