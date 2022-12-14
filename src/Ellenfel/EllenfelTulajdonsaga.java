package Ellenfel;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static Hos.Tulajdonsagok.Tulajdonsagai.font;
import static Ablakok.EgysegLepakolasAblak.ablakLepakolas;
import static Jatek.JatekAblak.alapcsata;

public class EllenfelTulajdonsaga {

    private static EllenfelTulajdonsaga instance = null;

    public static EllenfelTulajdonsaga getInstance()
    {
        if (instance == null)
            instance = new EllenfelTulajdonsaga();

        return instance;
    }

    public static Random random = new Random();

    static JPanel ellenfelMoralIras = new JPanel();
    static JPanel ellenfelVedekezesIras = new JPanel();
    static JPanel ellenfelSzerencseIras = new JPanel();
    static JPanel ellenfelVarazseroIras = new JPanel();
    static JPanel ellenfelTamadasIras = new JPanel();
    static JPanel ellenfelTudasIras = new JPanel();
    static JPanel ellenfelMannaIras = new JPanel();
    static JPanel ellenfelTamadasaIras = new JPanel();

    static JLabel ellenfelMoralErtek = new JLabel();
    static JLabel ellenfelVedekezesErtek = new JLabel();
    static JLabel ellenfelSzerencseErtek = new JLabel();
    static JLabel ellenfelVarazseroErtek = new JLabel();
    static JLabel ellenfelTamadasErtek = new JLabel();
    static JLabel ellenfelTudasErtek = new JLabel();
    public static JLabel ellenfelMannaErtek = new JLabel();
    static JLabel ellenfelTamadasaErtek = new JLabel();

    public static int ellenfelMoral = 1;
    public static int ellenfelVedekezes = 1;
    public static int ellenfelSzerencse = 1;
    public static int ellenfelVarazsero = 1;
    public static int ellenfelTamadas = 1;
    public static int ellenfelTudas = 1;
    public static int ellenfelManna = 10;
    public static int ellenfelTamadasa = 10;
    public static int ellenfelVedekezese = 5;

    public static int ellenfelArany=1000;

    public static void ellenfelTulajdonsagai() {

        ellenfelAranya();

        vedekezesTulajdonsag();
        szerencseTulajdonsag();
        varazseroTulajdonsag();
        tamadasTulajdonsag();
        tudasTulajdonsag();
        moralTulajdonsag();

        mannaTulajdonsag();
        tamadasaTulajdonsag();
    }

    public static void ellenfelAranya() {
        do {
            ellenfelArany=1000;

            int tulajdonsagAraEllenfel=5;

            ellenfelMoral = random.nextInt(10 - 1 + 1) + 1;
            ellenfelVedekezes = random.nextInt(10 - 1 + 1) + 1;
            ellenfelSzerencse = random.nextInt(10 - 1 + 1) + 1;
            ellenfelVarazsero = random.nextInt(10 - 1 + 1) + 1;
            ellenfelTamadas = random.nextInt(10 - 1 + 1) + 1;
            ellenfelTudas = random.nextInt(10 - 1 + 1) + 1;

            int osszes=ellenfelTamadas+ellenfelTudas+ellenfelMoral+ellenfelVedekezes+ellenfelVarazsero+ellenfelSzerencse-6;

            for (int i=0;i!=osszes;i++) {
                ellenfelArany-=tulajdonsagAraEllenfel;
                tulajdonsagAraEllenfel= (int) Math.ceil(tulajdonsagAraEllenfel*1.1);
            }
        }
        while (ellenfelArany<620) ;

        System.out.println(" ");
        System.out.println("---------------------- Ellenfel Tulajdonsagai ----------------------");
        System.out.println(" ");
            System.out.println("Ellenfel varazsereje: "+ellenfelVarazsero);
            System.out.println("Ellenfel vedekezese: "+ellenfelVedekezes);
            System.out.println("Ellenfel szerencseje: "+ellenfelSzerencse);
            System.out.println("Ellenfel tamadasa: "+ellenfelTamadas);
            System.out.println("Ellenfel moralja: "+ellenfelMoral);
            System.out.println("Ellenfel tudasa: "+ellenfelTudas);
        System.out.println(" ");
        System.out.println("--------------------------------------------------------------------");

        ellenfelManna = 10*ellenfelTudas;
        ellenfelTamadasa = 10*ellenfelTamadas;
        ellenfelVedekezese = 5*ellenfelVedekezes;

        System.out.println("Ellenfel aranya tulajdonsag vasarlas utan: "+ ellenfelArany);
    }

    public static void vedekezesTulajdonsag() {
        ellenfelVedekezesErtek.setFont(font);
        ellenfelVedekezesErtek.setForeground(new Color(234,209,138));

        ellenfelVedekezesIras.setBounds(1200,164,50,30);

        ellenfelVedekezesErtek.setText(String.valueOf(ellenfelVedekezes));
        ellenfelVedekezesIras.add(ellenfelVedekezesErtek);
        ellenfelVedekezesIras.setOpaque(false);
        ellenfelVedekezesIras.repaint();
        ablakLepakolas.add(ellenfelVedekezesIras);
    }

    public static void szerencseTulajdonsag() {
        ellenfelSzerencseErtek.setFont(font);
        ellenfelSzerencseErtek.setForeground(new Color(234,209,138));

        ellenfelSzerencseIras.setBounds(1200,204,50,30);

        ellenfelSzerencseErtek.setText(String.valueOf(ellenfelSzerencse));
        ellenfelSzerencseIras.add(ellenfelSzerencseErtek);
        ellenfelSzerencseIras.setOpaque(false);
        ellenfelSzerencseIras.repaint();
        ablakLepakolas.add(ellenfelSzerencseIras);
    }

    public static void varazseroTulajdonsag() {
        ellenfelVarazseroErtek.setFont(font);
        ellenfelVarazseroErtek.setForeground(new Color(234,209,138));

        ellenfelVarazseroIras.setBounds(1200,243,50,30);

        ellenfelVarazseroErtek.setText(String.valueOf(ellenfelVarazsero));
        ellenfelVarazseroIras.add(ellenfelVarazseroErtek);
        ellenfelVarazseroIras.setOpaque(false);
        ellenfelVarazseroIras.repaint();
        ablakLepakolas.add(ellenfelVarazseroIras);
    }

    public static void tamadasTulajdonsag() {
        ellenfelTamadasErtek.setFont(font);
        ellenfelTamadasErtek.setForeground(new Color(234,209,138));

        ellenfelTamadasIras.setBounds(1200,283,50,30);

        ellenfelTamadasErtek.setText(String.valueOf(ellenfelTamadas));
        ellenfelTamadasIras.add(ellenfelTamadasErtek);
        ellenfelTamadasIras.setOpaque(false);
        ellenfelTamadasIras.repaint();
        ablakLepakolas.add(ellenfelTamadasIras);
    }

    public static void tudasTulajdonsag() {
        ellenfelTudasErtek.setFont(font);
        ellenfelTudasErtek.setForeground(new Color(234,209,138));

        ellenfelTudasIras.setBounds(1200,323,50,30);

        ellenfelTudasErtek.setText(String.valueOf(ellenfelTudas));
        ellenfelTudasIras.add(ellenfelTudasErtek);
        ellenfelTudasIras.setOpaque(false);
        ellenfelTudasIras.repaint();
        ablakLepakolas.add(ellenfelTudasIras);
    }

    public static void moralTulajdonsag() {
        ellenfelMoralErtek.setFont(font);
        ellenfelMoralErtek.setForeground(new Color(234,209,138));

        ellenfelMoralIras.setBounds(1200,362,50,30);

        ellenfelMoralErtek.setText(String.valueOf(ellenfelMoral));
        ellenfelMoralIras.add(ellenfelMoralErtek);
        ellenfelMoralIras.setOpaque(false);
        ellenfelMoralIras.repaint();
        ablakLepakolas.add(ellenfelMoralIras);
    }

    public static void tamadasaTulajdonsag() {
        ellenfelTamadasaErtek.setFont(font);
        ellenfelTamadasaErtek.setForeground(new Color(234,209,138));

        ellenfelTamadasaIras.setBounds(1200,112,50,30);

        ellenfelTamadasaErtek.setText(String.valueOf(ellenfelTamadasa));
        ellenfelTamadasaIras.add(ellenfelTamadasaErtek);
        ellenfelTamadasaIras.setOpaque(false);
        ellenfelTamadasaIras.repaint();
        ablakLepakolas.add(ellenfelTamadasaIras);
    }

    public static void mannaTulajdonsag() {
        ellenfelMannaErtek.setFont(font);
        ellenfelMannaErtek.setForeground(new Color(234,209,138));

        ellenfelMannaIras.setBounds(1200,82,50,30);

        ellenfelMannaErtek.setText(String.valueOf(ellenfelManna));
        ellenfelMannaIras.add(ellenfelMannaErtek);
        ellenfelMannaIras.setOpaque(false);
        ellenfelMannaIras.repaint();
        ablakLepakolas.add(ellenfelMannaIras);
    }

    public static void mannaTulajdonsagCsata() {
        ellenfelMannaErtek.setFont(font);
        ellenfelMannaErtek.setForeground(new Color(234,209,138));

        ellenfelMannaIras.setBounds(150,478,50,30);

        ellenfelMannaErtek.setText(String.valueOf(ellenfelManna));
        ellenfelMannaIras.add(ellenfelMannaErtek);
        ellenfelMannaIras.setOpaque(false);
        ellenfelMannaIras.repaint();
        alapcsata.add(ellenfelMannaIras);
    }

    public static void tamadasaTulajdonsagCsata() {
        ellenfelTamadasaErtek.setFont(font);
        ellenfelTamadasaErtek.setForeground(new Color(234,209,138));

        ellenfelTamadasaIras.setBounds(150,504,50,30);

        ellenfelTamadasaErtek.setText(String.valueOf(ellenfelTamadasa));
        ellenfelTamadasaIras.add(ellenfelTamadasaErtek);
        ellenfelTamadasaIras.setOpaque(false);
        ellenfelTamadasaIras.repaint();
        alapcsata.add(ellenfelTamadasaIras);
    }
}