package Ablakok;

import javax.swing.*;
import java.awt.*;

public class JatekLeiras{

    JButton visszaGomb;

    JatekLeiras() {
        visszaGomb = new JButton();

        visszaGomb.addActionListener(e -> {
            ablakJatekL.dispose();
            KezdoAblak kezdoAblak = KezdoAblak.getInstance();
            kezdoAblak.kezdoAblak();
        });
    }

    JFrame ablakJatekL = new JFrame("Heroes of Might & Magic");
    ImageIcon ikon = new ImageIcon("Kepek/ikon.png");
    ImageIcon alapKep = new ImageIcon("Kepek/alap_ismerteto.jpg");
    JLabel alap = new JLabel("",alapKep,JLabel.CENTER);

    public void jatekLeiras() {

        visszaGomb.setBounds(26, 46, 150, 40);
        visszaGomb.setOpaque(false);
        visszaGomb.setContentAreaFilled(false);
        visszaGomb.setBorderPainted(false);
        visszaGomb.setFocusable(false);

        ablakJatekL.add(visszaGomb);

        ablakJatekL.setIconImage(ikon.getImage());

        ablakJatekL.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ablakJatekL.setSize(1280, 635);
        ablakJatekL.setLayout(new BorderLayout());
        ablakJatekL.setVisible(true);
        ablakJatekL.setResizable(false);
        ablakJatekL.add(alap);
        ablakJatekL.setLocationRelativeTo(null);
    }
}