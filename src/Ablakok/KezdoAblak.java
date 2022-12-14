package Ablakok;

import javax.swing.*;
import java.awt.*;

public class KezdoAblak {

    JButton jatekGombK;
    JButton jatekGombM;
    JButton jatekGombN;
    JButton pvpGomb;
    JButton jleirasGomb;

    private static KezdoAblak instance = null;

    private KezdoAblak() {
        jatekGombK = new JButton();
        jatekGombM = new JButton();
        jatekGombN = new JButton();
        pvpGomb = new JButton();
        jleirasGomb = new JButton();

        jatekGombK.addActionListener(e -> {
            ablak.dispose();
            nehezseg = 3;
            palya.csapat();
            System.out.println("konnyu jatekmod betoltve");
        });

        jatekGombM.addActionListener(e -> {
            ablak.dispose();
            nehezseg = 2;
            palya.csapat();
            System.out.println("kozepes jatekmod betoltve");
        });

        jatekGombN.addActionListener(e -> {
            ablak.dispose();
            nehezseg = 1;
            palya.csapat();
            System.out.println("nehez jatekmod betoltve");
        });

        pvpGomb.addActionListener(e -> {
            ablak.dispose();
            JatekLeiras jatekLeiras = new JatekLeiras();
            jatekLeiras.jatekLeiras();
        });

        jleirasGomb.addActionListener(e -> {
            ablak.dispose();
            JatekLeiras jatekLeiras = new JatekLeiras();
            jatekLeiras.jatekLeiras();
        });
    }

    public static KezdoAblak getInstance()
    {
        if (instance == null)
            instance = new KezdoAblak();

        return instance;
    }

    Csapat palya = Csapat.getInstance();

    JFrame ablak = new JFrame("Heroes of Might & Magic");
    ImageIcon ikon = new ImageIcon("Kepek/ikon.png");
    ImageIcon alapKep = new ImageIcon("Kepek/alap.jpg");

    JLabel alap = new JLabel("",alapKep,JLabel.CENTER);

    public static int nehezseg=0;

    public void kezdoAblak() {

        jatekGombK.setBounds(495, 166, 265, 40);
        jatekGombK.setFocusable(false);
        jatekGombK.setContentAreaFilled(false);
        jatekGombK.setBorderPainted(false);
        jatekGombK.setFocusable(false);

        jatekGombM.setBounds(495, 243, 265, 40);
        jatekGombM.setFocusable(false);
        jatekGombM.setContentAreaFilled(false);
        jatekGombM.setBorderPainted(false);
        jatekGombM.setFocusable(false);

        jatekGombN.setBounds(495, 318, 265, 40);
        jatekGombN.setFocusable(false);
        jatekGombN.setContentAreaFilled(false);
        jatekGombN.setBorderPainted(false);
        jatekGombN.setFocusable(false);

        pvpGomb.setBounds(495, 396, 265, 40);
        pvpGomb.setFocusable(false);
        pvpGomb.setContentAreaFilled(false);
        pvpGomb.setBorderPainted(false);
        pvpGomb.setFocusable(false);

        jleirasGomb.setBounds(495, 472, 265, 40);
        jleirasGomb.setFocusable(false);
        jleirasGomb.setContentAreaFilled(false);
        jleirasGomb.setBorderPainted(false);
        jleirasGomb.setFocusable(false);

        ablak.add(jatekGombK);
        ablak.add(jatekGombM);
        ablak.add(jatekGombN);
        ablak.add(pvpGomb);
        ablak.add(jleirasGomb);
        ablak.setIconImage(ikon.getImage());

        ablak.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ablak.setSize(1280, 635);
        ablak.setLayout(new BorderLayout());
        ablak.setVisible(true);
        ablak.setResizable(false);
        ablak.add(alap);
        ablak.setLocationRelativeTo(null);
    }
}