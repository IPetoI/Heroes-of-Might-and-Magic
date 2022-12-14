package Hos.Tulajdonsagok;

import javax.swing.*;
import java.awt.*;

import static Hos.Tulajdonsagok.Moral.tulajdonsagokMoral;
import static Hos.Tulajdonsagok.Szerencse.tulajdonsagokSzerencse;
import static Hos.Tulajdonsagok.Tamadas.tulajdonsagokTamadas;
import static Hos.Tulajdonsagok.Tudas.tulajdonsagokTudas;
import static Hos.Tulajdonsagok.Varazsero.tulajdonsagokVarazsero;
import static Hos.Tulajdonsagok.Vedekezes.tulajdonsagokVedekezes;
import static Ablakok.Csapat.ablakCsapat;
import static Ablakok.KezdoAblak.nehezseg;

public class Tulajdonsagai {

    private static Tulajdonsagai instance = null;

    public static Tulajdonsagai getInstance()
    {
        if (instance == null)
            instance = new Tulajdonsagai();

        return instance;
    }

     JPanel aranyIras = new JPanel();
     public static JLabel aranyErteke = new JLabel();

     JPanel aranyaraIras = new JPanel();
     public static JLabel aranyaraErteke = new JLabel();

     public static Font font = new Font("Arial", Font.BOLD, 20);

     public static int arany = 0, tulajdonsagAra =5;


     public void arany() {

         switch (nehezseg) {
             case 1 -> arany = 700;
             case 2 -> arany = 1000;
             case 3 -> arany = 1300;
         }

        aranyErteke.setFont(font);

        aranyIras.setBounds(728,37,100,50);

        aranyErteke.setText(String.valueOf(arany));
        aranyIras.add(aranyErteke);
        aranyIras.setOpaque(false);
        aranyIras.repaint();
        ablakCsapat.add(aranyIras);

        aranyaraErteke.setFont(font);

        aranyaraIras.setBounds(141,316,40,50);

        aranyaraErteke.setText(String.valueOf(tulajdonsagAra));
        aranyaraIras.add(aranyaraErteke);
        aranyaraIras.setOpaque(false);
        aranyaraIras.repaint();
        ablakCsapat.add(aranyaraIras);
    }

    public void tulajdonsagaik() {
        new Vedekezes();
        new Varazsero();
        new Szerencse();
        new Tamadas();
        new Tudas();
        new Moral();
        tulajdonsagokTamadas();
        tulajdonsagokVarazsero();
        tulajdonsagokVedekezes();
        tulajdonsagokSzerencse();
        tulajdonsagokTudas();
        tulajdonsagokMoral();
    }
 }
