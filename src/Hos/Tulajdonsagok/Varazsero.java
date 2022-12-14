package Hos.Tulajdonsagok;

import javax.swing.*;

import static Hos.Tulajdonsagok.Tulajdonsagai.*;
import static Ablakok.Csapat.ablakCsapat;

public class Varazsero {

     static JButton plusszGombVarazsero;
     static JButton minuszGombVarazsero;

    public Varazsero() {
        plusszGombVarazsero = new JButton();
        minuszGombVarazsero = new JButton();

        plusszGombVarazsero.addActionListener(e -> {
            if (varazsero<10 && arany-tulajdonsagAra>=0) {
                varazsero++;
                varazseroErtek++;
                arany-=tulajdonsagAra;
                tulajdonsagAra= (int) Math.ceil(tulajdonsagAra*1.1);
                System.out.println("Varazsero " + varazsero );
            }
            aranyaraErteke.setText(String.valueOf(tulajdonsagAra));
            varazseroTErteke.setText(String.valueOf(varazseroErtek));
            aranyErteke.setText(String.valueOf(arany));
            varazseroErteke.setText(String.valueOf(varazsero));
        });

        minuszGombVarazsero.addActionListener(e -> {
            if (varazsero>1) {
                varazsero--;
                varazseroErtek--;
                if (tulajdonsagAra==33){
                    tulajdonsagAra=30;
                }else{
                    tulajdonsagAra= (int) Math.floor(tulajdonsagAra/1.1);
                }
                arany+=tulajdonsagAra;
                System.out.println("Varazsero " + varazsero );
            }
            aranyaraErteke.setText(String.valueOf(tulajdonsagAra));
            varazseroTErteke.setText(String.valueOf(varazseroErtek));
            aranyErteke.setText(String.valueOf(arany));
            varazseroErteke.setText(String.valueOf(varazsero));
        });
    }

    static JPanel varazseroIras = new JPanel();
    public static JLabel varazseroErteke = new JLabel();

    static JPanel varazseroErtekIras = new JPanel();
    public static JLabel varazseroTErteke = new JLabel();

    public static int varazsero = 1, varazseroErtek = 1;


    public static void tulajdonsagokVarazsero() {

        varazseroErteke.setFont(font);
        varazseroTErteke.setFont(font);

        plusszGombVarazsero.setBounds(287, 439, 25, 25);
        plusszGombVarazsero.setOpaque(false);
        plusszGombVarazsero.setContentAreaFilled(false);
        plusszGombVarazsero.setBorderPainted(false);
        plusszGombVarazsero.setFocusable(false);

        minuszGombVarazsero.setBounds(257, 439, 25, 25);
        minuszGombVarazsero.setOpaque(false);
        minuszGombVarazsero.setContentAreaFilled(false);
        minuszGombVarazsero.setBorderPainted(false);
        minuszGombVarazsero.setFocusable(false);

        varazseroIras.setBounds(191,433,50,30);

        varazseroErteke.setText(String.valueOf(varazsero));
        varazseroIras.add(varazseroErteke);
        varazseroIras.setOpaque(false);
        varazseroIras.repaint();
        ablakCsapat.add(varazseroIras);

        varazseroErtekIras.setBounds(140,433,50,30);

        varazseroTErteke.setText(String.valueOf(varazseroErtek));
        varazseroErtekIras.add(varazseroTErteke);
        varazseroErtekIras.setOpaque(false);
        varazseroErtekIras.repaint();
        ablakCsapat.add(varazseroErtekIras);

        ablakCsapat.add(plusszGombVarazsero);
        ablakCsapat.add(minuszGombVarazsero);
    }
}