package Hos;

import javax.swing.*;

import static Jatek.JatekAblak.ablakCsata;
import static Varazslatok.Feltamasztas.feltamasztaspipa;
import static Varazslatok.IsteniEro.isteniEropipa;
import static Varazslatok.Lassitas.lassitaspipa;
import static Varazslatok.Tuzlabda.tuzlabdapipa;
import static Varazslatok.Villamcsapas.villamcsapaspipa;

public class VarazslatVanNincs {

    private static VarazslatVanNincs instance = null;

    public static VarazslatVanNincs getInstance()
    {
        if (instance == null)
            instance = new VarazslatVanNincs();

        return instance;
    }

    public static JPanel varazslatCs1Kep = new JPanel();
    public static JPanel varazslatCs2Kep = new JPanel();
    public static JPanel varazslatCs3Kep = new JPanel();
    public static JPanel varazslatCs4Kep = new JPanel();
    public static JPanel varazslatCs5Kep = new JPanel();

    static JLabel varazslatCs1Kepe = new JLabel();
    static JLabel varazslatCs2Kepe = new JLabel();
    static JLabel varazslatCs3Kepe = new JLabel();
    static JLabel varazslatCs4Kepe = new JLabel();
    static JLabel varazslatCs5Kepe = new JLabel();

    static ImageIcon tuzlabdaff = new ImageIcon("Kepek/varazslatok/tuzlabdaff.png");
    static ImageIcon villamcsapasff = new ImageIcon("Kepek/varazslatok/villamcsapasff.png");
    static ImageIcon lassitasff = new ImageIcon("Kepek/varazslatok/lassitasff.png");
    static ImageIcon feltamasztasff = new ImageIcon("Kepek/varazslatok/feltamasztasff.png");
    static ImageIcon istenieroff = new ImageIcon("Kepek/varazslatok/istenieroff.png");

    public static void varazslatVanCsata() {

        elsoVarazslat();
        masodikVarazslat();
        harmadikVarazslat();
        negyedikVarazslat();
        otodikVarazslat();
    }

    public static void elsoVarazslat() {

        varazslatCs1Kep.setBounds(18,245,55,60);
        varazslatCs1Kep.setOpaque(false);

        varazslatCs1Kepe.setIcon(tuzlabdaff);
        varazslatCs1Kep.add(varazslatCs1Kepe);
        varazslatCs1Kep.setVisible(true);
      if (tuzlabdapipa==1) {
          varazslatCs1Kep.setVisible(false);
      }
        ablakCsata.add(varazslatCs1Kep);
    }

    public static void masodikVarazslat() {

        varazslatCs2Kep.setBounds(157,245,55,60);
        varazslatCs2Kep.setOpaque(false);

        varazslatCs2Kepe.setIcon(villamcsapasff);
        varazslatCs2Kep.add(varazslatCs2Kepe);
        varazslatCs2Kep.setVisible(true);
      if (villamcsapaspipa==1) {
          varazslatCs2Kep.setVisible(false);
      }
        ablakCsata.add(varazslatCs2Kep);
    }

    public static void harmadikVarazslat() {

        varazslatCs3Kep.setBounds(87,245,55,60);
        varazslatCs3Kep.setOpaque(false);

        varazslatCs3Kepe.setIcon(lassitasff);
        varazslatCs3Kep.add(varazslatCs3Kepe);
        varazslatCs3Kep.setVisible(true);
      if (lassitaspipa==1) {
          varazslatCs3Kep.setVisible(false);
      }
        ablakCsata.add(varazslatCs3Kep);
    }

    public static void negyedikVarazslat() {

        varazslatCs4Kep.setBounds(87,166,55,60);
        varazslatCs4Kep.setOpaque(false);

        varazslatCs4Kepe.setIcon(feltamasztasff);
        varazslatCs4Kep.add(varazslatCs4Kepe);
        varazslatCs4Kep.setVisible(true);
      if (feltamasztaspipa==1) {
          varazslatCs4Kep.setVisible(false);
      }
        ablakCsata.add(varazslatCs4Kep);
    }

    public static void otodikVarazslat() {

        varazslatCs5Kep.setBounds(157,166,55,60);
        varazslatCs5Kep.setOpaque(false);

        varazslatCs5Kepe.setIcon(istenieroff);
        varazslatCs5Kep.add(varazslatCs5Kepe);
        varazslatCs5Kep.setVisible(true);
      if (isteniEropipa==1) {
          varazslatCs5Kep.setVisible(false);
      }
        ablakCsata.add(varazslatCs5Kep);
    }
}

