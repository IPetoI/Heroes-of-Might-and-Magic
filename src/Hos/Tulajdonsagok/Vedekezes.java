package Hos.Tulajdonsagok;

import javax.swing.*;

import static Hos.Tulajdonsagok.Tulajdonsagai.*;
import static Ablakok.Csapat.ablakCsapat;

public class Vedekezes {

     static JButton plusszGombVedekezes;
     static JButton minuszGombVedekezes;

    public Vedekezes() {
        plusszGombVedekezes = new JButton();
        minuszGombVedekezes = new JButton();

        plusszGombVedekezes.addActionListener(e -> {
            if (vedekezes<10 && arany-tulajdonsagAra>=0) {
                vedekezes++;
                vedekezesErtek+=5;
                arany-=tulajdonsagAra;
                tulajdonsagAra= (int) Math.ceil(tulajdonsagAra*1.1);
                System.out.println("Vedekezes " + vedekezes );
            }
            aranyaraErteke.setText(String.valueOf(tulajdonsagAra));
            vedekezesTErteke.setText(vedekezesErtek +"%");
            aranyErteke.setText(String.valueOf(arany));
            vedekezesErteke.setText(String.valueOf(vedekezes));
        });

        minuszGombVedekezes.addActionListener(e -> {
            if (vedekezes>1) {
                vedekezes--;
                vedekezesErtek-=5;
                if (tulajdonsagAra==33){
                    tulajdonsagAra=30;
                }else{
                    tulajdonsagAra= (int) Math.floor(tulajdonsagAra/1.1);
                }
                arany+=tulajdonsagAra;
                System.out.println("Vedekezes " + vedekezes );
            }
            aranyaraErteke.setText(String.valueOf(tulajdonsagAra));
            vedekezesTErteke.setText(vedekezesErtek +"%");
            aranyErteke.setText(String.valueOf(arany));
            vedekezesErteke.setText(String.valueOf(vedekezes));
        });
    }

    static JPanel vedekezesIras = new JPanel();
    public static JLabel vedekezesErteke = new JLabel();
    static JPanel vedekezesErtekIras = new JPanel();
    public static JLabel vedekezesTErteke = new JLabel();

    public static int vedekezes = 1, vedekezesErtek = 5;

    public static void tulajdonsagokVedekezes() {

        vedekezesErteke.setFont(font);
        vedekezesTErteke.setFont(font);

        plusszGombVedekezes.setBounds(287, 359, 25, 25);
        plusszGombVedekezes.setOpaque(false);
        plusszGombVedekezes.setContentAreaFilled(false);
        plusszGombVedekezes.setBorderPainted(false);
        plusszGombVedekezes.setFocusable(false);

        minuszGombVedekezes.setBounds(257, 359, 25, 25);
        minuszGombVedekezes.setOpaque(false);
        minuszGombVedekezes.setContentAreaFilled(false);
        minuszGombVedekezes.setBorderPainted(false);
        minuszGombVedekezes.setFocusable(false);

        vedekezesIras.setBounds(191,353,50,30);

        vedekezesErteke.setText(String.valueOf(vedekezes));
        vedekezesIras.add(vedekezesErteke);
        vedekezesIras.setOpaque(false);
        vedekezesIras.repaint();
        ablakCsapat.add(vedekezesIras);

        vedekezesErtekIras.setBounds(140,353,50,30);

        vedekezesTErteke.setText(vedekezesErtek+"%");
        vedekezesErtekIras.add(vedekezesTErteke);
        vedekezesErtekIras.setOpaque(false);
        vedekezesErtekIras.repaint();
        ablakCsapat.add(vedekezesErtekIras);

        ablakCsapat.add(plusszGombVedekezes);
        ablakCsapat.add(minuszGombVedekezes);
    }
}