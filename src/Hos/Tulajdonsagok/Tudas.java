package Hos.Tulajdonsagok;

import javax.swing.*;

import java.awt.*;

import static Hos.Tulajdonsagok.Tulajdonsagai.*;
import static Jatek.JatekAblak.alapcsata;
import static Ablakok.Csapat.ablakCsapat;

public class Tudas {

    static JButton plusszGombTudas;
    static JButton minuszGombTudas;

    public Tudas() {
        plusszGombTudas = new JButton();
        minuszGombTudas = new JButton();

        plusszGombTudas.addActionListener(e -> {
            if (tudas<10 && arany-tulajdonsagAra>=0) {
                tudas++;
                manna +=10;
                arany-=tulajdonsagAra;
                tulajdonsagAra= (int) Math.ceil(tulajdonsagAra*1.1);
                System.out.println("Tudas " + tudas );
            }
            aranyaraErteke.setText(String.valueOf(tulajdonsagAra));
            tudasTErteke.setText(String.valueOf(manna));
            aranyErteke.setText(String.valueOf(arany));
            tudasErteke.setText(String.valueOf(tudas));
        });

        minuszGombTudas.addActionListener(e -> {
            if (tudas>1) {
                tudas--;
                manna -=10;
                if (tulajdonsagAra==33){
                    tulajdonsagAra=30;
                }else{
                    tulajdonsagAra= (int) Math.floor(tulajdonsagAra/1.1);
                }
               arany+=tulajdonsagAra;
                System.out.println("Tudas " + tudas );
            }
            aranyaraErteke.setText(String.valueOf(tulajdonsagAra));
            tudasTErteke.setText(String.valueOf(manna));
            aranyErteke.setText(String.valueOf(arany));
            tudasErteke.setText(String.valueOf(tudas));
        });
    }

    static JPanel tudasIras = new JPanel();
    public static JLabel tudasErteke = new JLabel();

    static JPanel tudasErtekIras = new JPanel();
    public static JLabel tudasTErteke = new JLabel();

    static JPanel mannaIras = new JPanel();
    public static JLabel mannaErtek = new JLabel();

    public static int tudas = 1, manna = 10;


    public static void tulajdonsagokTudas() {

        tudasErteke.setFont(font);
        tudasTErteke.setFont(font);

        plusszGombTudas.setBounds(287, 519, 25, 25);
        plusszGombTudas.setOpaque(false);
        plusszGombTudas.setContentAreaFilled(false);
        plusszGombTudas.setBorderPainted(false);
        plusszGombTudas.setFocusable(false);

        minuszGombTudas.setBounds(257, 519, 25, 25);
        minuszGombTudas.setOpaque(false);
        minuszGombTudas.setContentAreaFilled(false);
        minuszGombTudas.setBorderPainted(false);
        minuszGombTudas.setFocusable(false);

        tudasIras.setBounds(191,513,50,30);

        tudasErteke.setText(String.valueOf(tudas));
        tudasIras.add(tudasErteke);
        tudasIras.setOpaque(false);
        tudasIras.repaint();
        ablakCsapat.add(tudasIras);

        tudasErtekIras.setBounds(140,513,50,30);

        tudasTErteke.setText(String.valueOf(manna));
        tudasErtekIras.add(tudasTErteke);
        tudasErtekIras.setOpaque(false);
        tudasErtekIras.repaint();
        ablakCsapat.add(tudasErtekIras);

        ablakCsapat.add(plusszGombTudas);
        ablakCsapat.add(minuszGombTudas);
    }

    public static void mannaTulajdonsagCsataH() {
        mannaErtek.setFont(font);
        mannaErtek.setForeground(new Color(234,209,138));

        mannaIras.setBounds(150,114,50,30);

        mannaErtek.setText(String.valueOf(manna));
        mannaIras.add(mannaErtek);
        mannaIras.setOpaque(false);
        mannaIras.repaint();
        alapcsata.add(mannaIras);
    }
}
