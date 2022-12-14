package Ablakok;

import Jatek.JatekAblak;
import Jatek.Sorrend;
import Jatek.VisszaAllitas;
import Jatek.XYKordinatakBemenet;

import javax.swing.*;
import java.awt.*;

import static Egysegek.EgysegSzam.*;
import static Egysegek.EgysegVan.egysegVanE;
import static Ellenfel.EllenfelEgysegPozicio.ellenfelEgysegeiKipakolas;
import static Ellenfel.EllenfelTulajdonsaga.ellenfelTulajdonsagai;
import static Ellenfel.EllenfelVarazslat.ellenfelVarazslatVan;
import static Jatek.JatekAblak.ablakCsata;
import static Jatek.JatekAblak.alapcsata;
import static Jatek.Sorrend.*;
import static Jatek.VisszaAllitas.visszaallitasCsapatletetel;
import static Jatek.XYKordinatakBemenet.*;

public class EgysegLepakolasAblak {

    private static EgysegLepakolasAblak instance = null;

    JButton visszaGomb;
    JButton csataGomb;

    public EgysegLepakolasAblak() {

        visszaGomb = new JButton();
        csataGomb = new JButton();

        visszaGomb.addActionListener(e -> {
            String[] lehetosegek = {"Igen, kilépek", "Mégse lépek ki"};
            ImageIcon ikon = new ImageIcon("Kepek/ikon1.png");

            int x = JOptionPane.showOptionDialog(null, "Ha vissza lépsz újra meg kell venned mindent!",
                    "Biztos vagy benne?", JOptionPane.YES_NO_OPTION,
                    JOptionPane.INFORMATION_MESSAGE, ikon, lehetosegek, 0);
            if (x == 0) {
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

                VisszaAllitas.visszaAllitas();
                visszaallitasCsapatletetel();
                ablakLepakolas.dispose();
                Csapat csapat = Csapat.getInstance();
                csapat.csapat();
            }
        });

        csataGomb.addActionListener(e -> {
            if (elsoEgysegSzam==0 && masodikEgysegSzam==0 && harmadikEgysegSzam==0 && negyedikEgysegSzam==0 &&
                    otodikEgysegSzam==0) {

                JatekAblak jatekAblak = JatekAblak.getInstance();

                Sorrend.egyenloLeses=false;

                JatekAblak.ablakCsata.getContentPane().removeAll();
                ablakCsata.repaint();

                moralSorrendTList.clear();

                kor=1;

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

                ecsont=0;efoldmuv=0;morLaszlo=2;morLena=1;
                efelder=0;eijas=0;egrif=0;emino=0;efegyv=0;eorgy=0;eharcp=0;erapt=0;
                csont=0;foldmuv=0;felder=0;ijas=0;grif=0;mino=0;fegyv=0;orgy=0;harcp=0;rapt=0;

                elsoHely ="n";masodikHely ="n";harmadikHely ="n";negyedikHely ="n";otodikHely ="n";hatodikHely ="n";
                hetedikHely ="n";nyolcadikHely ="n";kilencedikHely ="n";tizedikHely ="n";tizenegyedikHely ="n";
                tizenkettedikHely ="n";

                ablakLepakolas.dispose();
                ablakCsata.remove(alapcsata);
                ablakCsata.dispose();
                jatekAblak.jatekAblak();
            }
        });
    }

    public static EgysegLepakolasAblak getInstance() {
        if (instance == null)
            instance = new EgysegLepakolasAblak();

        return instance;
    }

    public static JFrame ablakLepakolas = new JFrame("Heroes of Might & Magic");
    ImageIcon ikon = new ImageIcon("Kepek/ikon.png");
    public static ImageIcon alapKepLovag = new ImageIcon("Kepek/csapatLetetel.jpg");
    public static ImageIcon alapKepNekromanta = new ImageIcon("Kepek/csapatLetetelNekromanta.jpg");
    public static JLabel alap = new JLabel("", alapKepLovag, JLabel.CENTER);
    public static boolean elsoAlkalommal=false;

    public void egysegLepakolas() {

        if(elsoAlkalommal) {
            egysegVanE();
            ellenfelTulajdonsagai();
            ellenfelVarazslatVan();
            System.out.println("---------------------- Ellenfel Egysegei ----------------------");
            System.out.println(" ");
            ellenfelEgysegeiKipakolas();
            egysegSzama();

            XYKordinatakBemenet kordinata = XYKordinatakBemenet.getInstance();
            kordinata.xyKordinatak0();
            kordinata.xyKordinatak1();
            kordinata.xyKordinatak2();
            kordinata.xyKordinatak3();
            kordinata.xyKordinatak4();
        }

        visszaGomb.setBounds(30, 15, 150, 40);
        visszaGomb.setOpaque(false);
        visszaGomb.setContentAreaFilled(false);
        visszaGomb.setBorderPainted(false);
        visszaGomb.setFocusable(false);

        ablakLepakolas.add(visszaGomb);

        csataGomb.setBounds(567, 522, 150, 40);
        csataGomb.setOpaque(false);
        csataGomb.setContentAreaFilled(false);
        csataGomb.setBorderPainted(false);
        csataGomb.setFocusable(false);

        ablakLepakolas.add(csataGomb);

        ablakLepakolas.setIconImage(ikon.getImage());
        ablakLepakolas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ablakLepakolas.setSize(1280, 635);
        ablakLepakolas.setLayout(new BorderLayout());
        ablakLepakolas.setVisible(true);
        ablakLepakolas.setResizable(false);
        ablakLepakolas.add(alap);
        ablakLepakolas.setLocationRelativeTo(null);
    }
}