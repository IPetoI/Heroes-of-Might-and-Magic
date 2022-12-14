package Hos.Tulajdonsagok;

import javax.swing.*;

import static Hos.Tulajdonsagok.Tulajdonsagai.*;
import static Ablakok.Csapat.ablakCsapat;

public class Szerencse {

    static JButton plusszGombSzerencse;
    static JButton minuszGombSzerencse;

    public Szerencse() {
        plusszGombSzerencse = new JButton();
        minuszGombSzerencse = new JButton();

        plusszGombSzerencse.addActionListener(e -> {
            if (szerencse<10 && arany-tulajdonsagAra>=0) {
                szerencse++;
                szerencseErtek+=5;
                arany-=tulajdonsagAra;
                System.out.println("Szerencse " + szerencse );
                tulajdonsagAra= (int) Math.ceil(tulajdonsagAra*1.1);
            }
            aranyaraErteke.setText(String.valueOf(tulajdonsagAra));
            szerencseTErteke.setText(szerencseErtek +"%");
            aranyErteke.setText(String.valueOf(arany));
            szerencseErteke.setText(String.valueOf(szerencse));
        });

        minuszGombSzerencse.addActionListener(e -> {
            if (szerencse>1) {
                szerencse--;
                szerencseErtek-=5;
                if (tulajdonsagAra==33){
                    tulajdonsagAra=30;
                }else{
                    tulajdonsagAra= (int) Math.floor(tulajdonsagAra/1.1);
                }
                System.out.println("Szerencse " + szerencse );
                arany+=tulajdonsagAra;
            }
            aranyaraErteke.setText(String.valueOf(tulajdonsagAra));
            szerencseTErteke.setText(szerencseErtek +"%");
            aranyErteke.setText(String.valueOf(arany));
            szerencseErteke.setText(String.valueOf(szerencse));
        });
    }

    static JPanel szerencseIras = new JPanel();
    public static JLabel szerencseErteke = new JLabel();

    static JPanel szerencseErtekIras = new JPanel();
    public static JLabel szerencseTErteke = new JLabel();

    public static int szerencse = 1, szerencseErtek = 5;


    public static void tulajdonsagokSzerencse() {

        szerencseErteke.setFont(font);
        szerencseTErteke.setFont(font);

        plusszGombSzerencse.setBounds(287, 399, 25, 25);
        plusszGombSzerencse.setOpaque(false);
        plusszGombSzerencse.setContentAreaFilled(false);
        plusszGombSzerencse.setBorderPainted(false);
        plusszGombSzerencse.setFocusable(false);

        minuszGombSzerencse.setBounds(257, 399, 25, 25);
        minuszGombSzerencse.setOpaque(false);
        minuszGombSzerencse.setContentAreaFilled(false);
        minuszGombSzerencse.setBorderPainted(false);
        minuszGombSzerencse.setFocusable(false);

        szerencseIras.setBounds(191,393,50,30);

        szerencseErteke.setText(String.valueOf(szerencse));

        szerencseIras.add(szerencseErteke);
        szerencseIras.setOpaque(false);
        szerencseIras.repaint();
        ablakCsapat.add(szerencseIras);

        szerencseErtekIras.setBounds(140,393,50,30);

        szerencseTErteke.setText(szerencseErtek+"%");
        szerencseErtekIras.add(szerencseTErteke);
        szerencseErtekIras.setOpaque(false);
        szerencseErtekIras.repaint();
        ablakCsapat.add(szerencseErtekIras);

        ablakCsapat.add(plusszGombSzerencse);
        ablakCsapat.add(minuszGombSzerencse);
    }

}
