package Hos.Tulajdonsagok;

import javax.swing.*;

import static Hos.Tulajdonsagok.Tulajdonsagai.*;
import static Ablakok.Csapat.ablakCsapat;

public class Moral {

    static JButton plusszGombMoral;
    static JButton minuszGombMoral;

    public Moral() {
        plusszGombMoral = new JButton();
        minuszGombMoral = new JButton();

        plusszGombMoral.addActionListener(e -> {
            if (moral<10 && arany-tulajdonsagAra>=0) {
                moral++;
                moralErtek++;
                arany-=tulajdonsagAra;
                System.out.println("Moral " + moral );
                tulajdonsagAra= (int) Math.ceil(tulajdonsagAra*1.1);
            }
            aranyaraErteke.setText(String.valueOf(tulajdonsagAra));
            moralTErteke.setText(String.valueOf(moralErtek));
            aranyErteke.setText(String.valueOf(arany));
            moralErteke.setText(String.valueOf(moral));
        });

        minuszGombMoral.addActionListener(e -> {
            if (moral>1) {
                moral--;
                moralErtek--;
                if (tulajdonsagAra==33){
                    tulajdonsagAra=30;
                }else{
                    tulajdonsagAra= (int) Math.floor(tulajdonsagAra/1.1);
                }
                System.out.println("Moral " + moral );
                arany+=tulajdonsagAra;
            }
            aranyaraErteke.setText(String.valueOf(tulajdonsagAra));
            moralTErteke.setText(String.valueOf(moralErtek));
            aranyErteke.setText(String.valueOf(arany));
            moralErteke.setText(String.valueOf(moral));
        });
    }

    static JPanel moralIras = new JPanel();
    public static JLabel moralErteke = new JLabel();

    static JPanel moralErtekIras = new JPanel();
    public static JLabel moralTErteke = new JLabel();

    public static int moral = 1, moralErtek = 1;


    public static void tulajdonsagokMoral() {

        moralErteke.setFont(font);
        moralTErteke.setFont(font);

        plusszGombMoral.setBounds(287, 559, 25, 25);
        plusszGombMoral.setOpaque(false);
        plusszGombMoral.setContentAreaFilled(false);
        plusszGombMoral.setBorderPainted(false);
        plusszGombMoral.setFocusable(false);

        minuszGombMoral.setBounds(257, 559, 25, 25);
        minuszGombMoral.setOpaque(false);
        minuszGombMoral.setContentAreaFilled(false);
        minuszGombMoral.setBorderPainted(false);
        minuszGombMoral.setFocusable(false);

        moralIras.setBounds(191,553,50,30);

        moralErteke.setText(String.valueOf(moral));
        moralIras.add(moralErteke);
        moralIras.setOpaque(false);
        moralIras.repaint();
        ablakCsapat.add(moralIras);

        moralErtekIras.setBounds(140,553,50,30);

        moralTErteke.setText(String.valueOf(moralErtek));
        moralErtekIras.add(moralTErteke);
        moralErtekIras.setOpaque(false);
        moralErtekIras.repaint();
        ablakCsapat.add(moralErtekIras);

        ablakCsapat.add(plusszGombMoral);
        ablakCsapat.add(minuszGombMoral);
    }
}
