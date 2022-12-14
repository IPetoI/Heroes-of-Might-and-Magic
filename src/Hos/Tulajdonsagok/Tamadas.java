package Hos.Tulajdonsagok;

import javax.swing.*;

import java.awt.*;

import static Hos.Tulajdonsagok.Tulajdonsagai.*;
import static Jatek.JatekAblak.alapcsata;
import static Ablakok.Csapat.ablakCsapat;

public class Tamadas {

    static JButton plusszGombTamadas;
    static JButton minuszGombTamadas;

    public Tamadas() {
        plusszGombTamadas = new JButton();
        minuszGombTamadas = new JButton();

        plusszGombTamadas.addActionListener(e -> {
            if (tamadas<10 && arany-tulajdonsagAra>=0) {
                tamadas++;
                tamadasErtek+=10;
                arany-=tulajdonsagAra;
                tulajdonsagAra= (int) Math.ceil(tulajdonsagAra*1.1);
                System.out.println("Tamadas " + tamadas );
            }
            aranyaraErteke.setText(String.valueOf(tulajdonsagAra));
            tamadasTErteke.setText(tamadasErtek +"%");
            aranyErteke.setText(String.valueOf(arany));
            tamadasErteke.setText(String.valueOf(tamadas));
        });

        minuszGombTamadas.addActionListener(e -> {
            if (tamadas>1) {
                tamadas--;
                tamadasErtek-=10;
                if (tulajdonsagAra==33){
                    tulajdonsagAra=30;
                }else{
                    tulajdonsagAra= (int) Math.floor(tulajdonsagAra/1.1);
                }
                arany+=tulajdonsagAra;
                System.out.println("Tamadas " + tamadas );
            }
            aranyaraErteke.setText(String.valueOf(tulajdonsagAra));
            tamadasTErteke.setText(tamadasErtek +"%");
            aranyErteke.setText(String.valueOf(arany));
            tamadasErteke.setText(String.valueOf(tamadas));
        });
    }

    static JPanel tamadasIras = new JPanel();
    public static JLabel tamadasErteke = new JLabel();

    static JPanel tamadasErtekIras = new JPanel();
    public static JLabel tamadasTErteke = new JLabel();

    static JPanel tamadasaIras = new JPanel();
    static JLabel tamadasaErtek = new JLabel();

    public static int tamadas = 1, tamadasErtek = 10;


    public static void tulajdonsagokTamadas() {

        tamadasErteke.setFont(font);
        tamadasTErteke.setFont(font);

        plusszGombTamadas.setBounds(287, 479, 25, 25);
        plusszGombTamadas.setOpaque(false);
        plusszGombTamadas.setContentAreaFilled(false);
        plusszGombTamadas.setBorderPainted(false);
        plusszGombTamadas.setFocusable(false);

        minuszGombTamadas.setBounds(257, 479, 25, 25);
        minuszGombTamadas.setOpaque(false);
        minuszGombTamadas.setContentAreaFilled(false);
        minuszGombTamadas.setBorderPainted(false);
        minuszGombTamadas.setFocusable(false);

        tamadasIras.setBounds(191,473,50,30);

        tamadasErteke.setText(String.valueOf(tamadas));
        tamadasIras.add(tamadasErteke);
        tamadasIras.setOpaque(false);
        tamadasIras.repaint();
        ablakCsapat.add(tamadasIras);

        tamadasErtekIras.setBounds(140,473,50,30);

        tamadasTErteke.setText(tamadasErtek+"%");
        tamadasErtekIras.add(tamadasTErteke);
        tamadasErtekIras.setOpaque(false);
        tamadasErtekIras.repaint();
        ablakCsapat.add(tamadasErtekIras);

        ablakCsapat.add(plusszGombTamadas);
        ablakCsapat.add(minuszGombTamadas);
    }

    public static void tamadasTulajdonsagCsataH() {
        tamadasaErtek.setFont(font);
        tamadasaErtek.setForeground(new Color(234,209,138));

        tamadasaIras.setBounds(150,139,50,30);

        tamadasaErtek.setText(String.valueOf(tamadasErtek));
        tamadasaIras.add(tamadasaErtek);
        tamadasaIras.setOpaque(false);
        tamadasaIras.repaint();
        alapcsata.add(tamadasaIras);
    }
}
