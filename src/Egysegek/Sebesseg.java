package Egysegek;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static Jatek.JatekAblak.informacioErtek;
import static Jatek.Palya_Lepes.*;
import static Jatek.Sorrend.*;
import static Jatek.XYKordinatakBemenet.*;

public class Sebesseg {

    public static double elsoEgysegSebesseg = 0;
    public static double masodikEgysegSebesseg = 0;
    public static double harmadikEgysegSebesseg = 0;
    public static double negyedikEgysegSebesseg = 0;
    public static double otodikEgysegSebesseg = 0;

    public static double elsoEllEgysegSebesseg = 0;
    public static double masodikEllEgysegSebesseg = 0;
    public static double harmadikEllEgysegSebesseg = 0;
    public static double negyedikEllEgysegSebesseg = 0;
    public static double otodikEllEgysegSebesseg = 0;

    public static int nyomas = 0, egyszer = 1;

    public static double egysegSebessege = 0;

    public static int tavolsag=0;

    public static boolean vanRoham = false;

    public static Random random = new Random();

    public static List<Integer> lephetoSor = new ArrayList<Integer>(); 
    public static List<Integer> lephetoOszlop = new ArrayList<Integer>(); 


    public static void mekkoraTavolsagod(String egyseg) {

        switch (egyseg) {
            case "ecsont", "efoldmuv" -> elsoEllEgysegSebesseg = 4;
            case "efelder" -> masodikEllEgysegSebesseg = 5;
            case "emino" -> harmadikEllEgysegSebesseg = 4;
            case "eorgy" -> negyedikEllEgysegSebesseg = 13;
            case "erapt" -> otodikEllEgysegSebesseg = 7;
            case "eijas" -> masodikEllEgysegSebesseg = 4;
            case "egrif" -> harmadikEllEgysegSebesseg = 7;
            case "efegyv" -> negyedikEllEgysegSebesseg = 4;
            case "eharcp" -> otodikEllEgysegSebesseg = 5;
            case "csont", "foldmuv" -> elsoEgysegSebesseg = 4;
            case "felder" -> masodikEgysegSebesseg = 5;
            case "mino" -> harmadikEgysegSebesseg = 4;
            case "orgy" -> negyedikEgysegSebesseg = 13;
            case "rapt" -> otodikEgysegSebesseg = 7;
            case "ijas" -> masodikEgysegSebesseg = 4;
            case "grif" -> harmadikEgysegSebesseg = 7;
            case "fegyv" -> negyedikEgysegSebesseg = 4;
            case "harcp" -> otodikEgysegSebesseg = 5;
        }
    }

    public static void mekkoraTavolsagodGET(String egyseg) {

        if((!egyseg.equals("mino") && !egyseg.equals("emino"))) {

            switch (egyseg) {
                case "ecsont", "efoldmuv" -> egysegSebessege=Math.ceil(elsoEllEgysegSebesseg);
                case "efelder", "eijas" -> egysegSebessege=Math.ceil(masodikEllEgysegSebesseg);
                case "emino", "egrif" -> egysegSebessege=Math.ceil(harmadikEllEgysegSebesseg);
                case "eorgy", "efegyv" -> egysegSebessege=Math.ceil(negyedikEllEgysegSebesseg);
                case "erapt", "eharcp" -> egysegSebessege=Math.ceil(otodikEllEgysegSebesseg);
                case "csont", "foldmuv" -> egysegSebessege=Math.ceil(elsoEgysegSebesseg);
                case "felder", "ijas" -> egysegSebessege=Math.ceil(masodikEgysegSebesseg);
                case "mino", "grif" -> egysegSebessege=Math.ceil(harmadikEgysegSebesseg);
                case "orgy", "fegyv" -> egysegSebessege=Math.ceil(negyedikEgysegSebesseg);
                case "rapt", "harcp" -> egysegSebessege=Math.ceil(otodikEgysegSebesseg);
            }
        }
    }

    public static void tavolsag(int regiSor,int regiOszlop,int jelenlegiSor, int jelenlegiOszlop) {

        tavolsag = Math.abs(Math.abs(jelenlegiOszlop - regiOszlop) + Math.abs(jelenlegiSor - regiSor));

    }

    public static void MinoKepessege() {

        if ((elsoHely.equals("mino") || elsoHely.equals("emino"))) {

            if(egyszer == kor) {
                nyomas++;
            }else if(egyszer != kor) {
                nyomas = 1;
                egyszer = kor;
            }

            if (nyomas == 1 ) {
                int roham = random.nextInt(100 + 1);
                vanRoham = false;

                System.out.println(roham);

                vanRoham = roham <= 30;

                if (vanRoham) {
                    System.out.println("Minotaurosz roham aktivalva");
                    informacioErtek.setText("Minótaurosz roham aktiválva.");
                    if (elsoHely.equals("mino")) {
                        if (harmadikEgysegSebesseg==4) {
                            egysegSebessege =13;
                        }else if (harmadikEgysegSebesseg==2) {
                            egysegSebessege =7;
                        }
                    }else if (elsoHely.equals("emino")) {
                        if (harmadikEllEgysegSebesseg==4) {
                            egysegSebessege =13;
                        }else if (harmadikEllEgysegSebesseg==2) {
                            egysegSebessege =7;
                        }
                    }
                } else {
                    if (elsoHely.equals("mino")) {
                        egysegSebessege=harmadikEgysegSebesseg;
                    }else if (elsoHely.equals("emino")) {
                        egysegSebessege=harmadikEllEgysegSebesseg;
                    }
                }
            }
        }
    }


    public static void mekkoraTeruleteVan(String egyseg) {

        mekkoraTavolsagodGET(egyseg);

        MinoKepessege();

        int regiPozSorL, regiPozOszlopL;

        lephetoSor.clear();
        lephetoOszlop.clear();

        if (egysegSebessege == 2) {
            for (int m = 0; m < 3; m++) {
                for (int i = 0; i < 5; i++) {

                    regiPozSorL = regiPozSor;
                    regiPozOszlopL = regiPozOszlop;

                    if (m == 1) {
                        regiPozSorL--;
                        regiPozOszlopL--;
                    } else if (m == 2) {
                        regiPozSorL -= 2;
                        regiPozOszlopL -= 2;
                    }

                    if (i % 2 == 0) { //5
                        for (int j = 2, k = 0; j >= 0 && k <= 2; j--, k++) {
                            int regiPozSorL2 = regiPozSorL;
                            int regiPozOszlopL2 = regiPozOszlopL;

                            regiPozOszlopL2 = regiPozOszlopL2 + j;
                            regiPozSorL2 = regiPozSorL2 + k;
                            if (regiPozOszlopL2 > 0 && regiPozSorL2 > 0 && regiPozOszlopL2 <= 12 && regiPozSorL2 <= 10) {
                                szurkites(regiPozSorL2, regiPozOszlopL2);
                                lephetoSor.add(regiPozSorL2);
                                lephetoOszlop.add(regiPozOszlopL2);
                            }
                        }
                    } else { //4
                        if (m != 2) {
                            for (int j = 1, k = 0; j >= 0 && k <= 1; j--, k++) {
                                int regiPozSorL2 = regiPozSorL;
                                int regiPozOszlopL2 = regiPozOszlopL;

                                regiPozOszlopL2 = regiPozOszlopL2 + j;
                                regiPozSorL2 = regiPozSorL2 + k;
                                if (regiPozOszlopL2 > 0 && regiPozSorL2 > 0 && regiPozOszlopL2 <= 12 && regiPozSorL2 <= 10) {
                                    szurkites(regiPozSorL2, regiPozOszlopL2);
                                    lephetoSor.add(regiPozSorL2);
                                    lephetoOszlop.add(regiPozOszlopL2);
                                }
                            }
                        }
                    }
                }
            }

        } else if (egysegSebessege == 3) {
            for (int m = 0; m < 4; m++) {
                for (int i = 0; i < 7; i++) {

                    regiPozSorL = regiPozSor;
                    regiPozOszlopL = regiPozOszlop;

                    if (m == 1) {
                        regiPozSorL--;
                        regiPozOszlopL--;
                    } else if (m == 2) {
                        regiPozSorL -= 2;
                        regiPozOszlopL -= 2;
                    } else if (m == 3) {
                        regiPozSorL -= 3;
                        regiPozOszlopL -= 3;
                    }

                    if (i % 2 == 0) { //5
                        for (int j = 3, k = 0; j >= 0 && k <= 3; j--, k++) {
                            int regiPozSorL2 = regiPozSorL;
                            int regiPozOszlopL2 = regiPozOszlopL;

                            regiPozOszlopL2 = regiPozOszlopL2 + j;
                            regiPozSorL2 = regiPozSorL2 + k;
                            if (regiPozOszlopL2 > 0 && regiPozSorL2 > 0 && regiPozOszlopL2 <= 12 && regiPozSorL2 <= 10) {
                                szurkites(regiPozSorL2, regiPozOszlopL2);
                                    lephetoSor.add(regiPozSorL2);
                                    lephetoOszlop.add(regiPozOszlopL2);
                            }
                        }
                    } else { //4
                        if (m != 3) {
                            for (int j = 2, k = 0; j >= 0 && k <= 2; j--, k++) {
                                int regiPozSorL2 = regiPozSorL;
                                int regiPozOszlopL2 = regiPozOszlopL;

                                regiPozOszlopL2 = regiPozOszlopL2 + j;
                                regiPozSorL2 = regiPozSorL2 + k;
                                if (regiPozOszlopL2 > 0 && regiPozSorL2 > 0 && regiPozOszlopL2 <= 12 && regiPozSorL2 <= 10) {
                                    szurkites(regiPozSorL2, regiPozOszlopL2);
                                    lephetoSor.add(regiPozSorL2);
                                    lephetoOszlop.add(regiPozOszlopL2);
                                }
                            }
                        }
                    }
                }
            }

        } else if (egysegSebessege == 4) {
            for (int m = 0; m < 5; m++) {
                for (int i = 0; i < 9; i++) {

                    regiPozSorL = regiPozSor;
                    regiPozOszlopL = regiPozOszlop;

                    if (m == 1) {
                        regiPozSorL--;
                        regiPozOszlopL--;
                    } else if (m == 2) {
                        regiPozSorL -= 2;
                        regiPozOszlopL -= 2;
                    } else if (m == 3) {
                        regiPozSorL -= 3;
                        regiPozOszlopL -= 3;
                    } else if (m == 4) {
                        regiPozSorL -= 4;
                        regiPozOszlopL -= 4;
                    }

                    if (i % 2 == 0) { //5
                        for (int j = 4, k = 0; j >= 0 && k <= 4; j--, k++) {
                            int regiPozSorL2 = regiPozSorL;
                            int regiPozOszlopL2 = regiPozOszlopL;

                            regiPozOszlopL2 = regiPozOszlopL2 + j;
                            regiPozSorL2 = regiPozSorL2 + k;
                            if (regiPozOszlopL2 > 0 && regiPozSorL2 > 0 && regiPozOszlopL2 <= 12 && regiPozSorL2 <= 10) {
                                szurkites(regiPozSorL2, regiPozOszlopL2);
                                    lephetoSor.add(regiPozSorL2);
                                    lephetoOszlop.add(regiPozOszlopL2);
                            }
                        }
                    } else { //4
                        if (m != 4) {
                            for (int j = 3, k = 0; j >= 0 && k <= 3; j--, k++) {
                                int regiPozSorL2 = regiPozSorL;
                                int regiPozOszlopL2 = regiPozOszlopL;

                                regiPozOszlopL2 = regiPozOszlopL2 + j;
                                regiPozSorL2 = regiPozSorL2 + k;
                                if (regiPozOszlopL2 > 0 && regiPozSorL2 > 0 && regiPozOszlopL2 <= 12 && regiPozSorL2 <= 10) {
                                    szurkites(regiPozSorL2, regiPozOszlopL2);
                                    lephetoSor.add(regiPozSorL2);
                                    lephetoOszlop.add(regiPozOszlopL2);
                                }
                            }
                        }
                    }
                }
            }

        } else if (egysegSebessege == 5) {

            for (int m = 0; m < 6; m++) {
                for (int i = 0; i < 11; i++) {

                    regiPozSorL = regiPozSor;
                    regiPozOszlopL = regiPozOszlop;

                    if (m == 1) {
                        regiPozSorL--;
                        regiPozOszlopL--;
                    } else if (m == 2) {
                        regiPozSorL -= 2;
                        regiPozOszlopL -= 2;
                    } else if (m == 3) {
                        regiPozSorL -= 3;
                        regiPozOszlopL -= 3;
                    } else if (m == 4) {
                        regiPozSorL -= 4;
                        regiPozOszlopL -= 4;
                    } else if (m == 5) {
                        regiPozSorL -= 5;
                        regiPozOszlopL -= 5;
                    }

                    if (i % 2 == 0) { //5
                        for (int j = 5, k = 0; j >= 0 && k <= 5; j--, k++) {
                            int regiPozSorL2 = regiPozSorL;
                            int regiPozOszlopL2 = regiPozOszlopL;

                            regiPozOszlopL2 = regiPozOszlopL2 + j;
                            regiPozSorL2 = regiPozSorL2 + k;
                            if (regiPozOszlopL2 > 0 && regiPozSorL2 > 0 && regiPozOszlopL2 <= 12 && regiPozSorL2 <= 10) {
                                szurkites(regiPozSorL2, regiPozOszlopL2);
                                    lephetoSor.add(regiPozSorL2);
                                    lephetoOszlop.add(regiPozOszlopL2);
                            }
                        }
                    } else { //4
                        if (m != 5) {
                            for (int j = 4, k = 0; j >= 0 && k <= 4; j--, k++) {
                                int regiPozSorL2 = regiPozSorL;
                                int regiPozOszlopL2 = regiPozOszlopL;

                                regiPozOszlopL2 = regiPozOszlopL2 + j;
                                regiPozSorL2 = regiPozSorL2 + k;
                                if (regiPozOszlopL2 > 0 && regiPozSorL2 > 0 && regiPozOszlopL2 <= 12 && regiPozSorL2 <= 10) {
                                    szurkites(regiPozSorL2, regiPozOszlopL2);
                                    lephetoSor.add(regiPozSorL2);
                                    lephetoOszlop.add(regiPozOszlopL2);
                                }
                            }
                        }
                    }
                }
            }

        } else if (egysegSebessege == 7) {

            for (int m = 0; m < 8; m++) {
                for (int i = 0; i < 15; i++) {

                    regiPozSorL = regiPozSor;
                    regiPozOszlopL = regiPozOszlop;

                    if (m == 1) {
                        regiPozSorL--;
                        regiPozOszlopL--;
                    } else if (m == 2) {
                        regiPozSorL -= 2;
                        regiPozOszlopL -= 2;
                    } else if (m == 3) {
                        regiPozSorL -= 3;
                        regiPozOszlopL -= 3;
                    } else if (m == 4) {
                        regiPozSorL -= 4;
                        regiPozOszlopL -= 4;
                    } else if (m == 5) {
                        regiPozSorL -= 5;
                        regiPozOszlopL -= 5;
                    } else if (m == 6) {
                        regiPozSorL -= 6;
                        regiPozOszlopL -= 6;
                    } else if (m == 7) {
                        regiPozSorL -= 7;
                        regiPozOszlopL -= 7;
                    }

                    if (i % 2 == 0) { //5
                        for (int j = 7, k = 0; j >= 0 && k <= 7; j--, k++) {
                            int regiPozSorL2 = regiPozSorL;
                            int regiPozOszlopL2 = regiPozOszlopL;

                            regiPozOszlopL2 = regiPozOszlopL2 + j;
                            regiPozSorL2 = regiPozSorL2 + k;
                            if (regiPozOszlopL2 > 0 && regiPozSorL2 > 0 && regiPozOszlopL2 <= 12 && regiPozSorL2 <= 10) {
                                szurkites(regiPozSorL2, regiPozOszlopL2);
                                    lephetoSor.add(regiPozSorL2);
                                    lephetoOszlop.add(regiPozOszlopL2);
                            }
                        }
                    } else { //4
                        if (m != 7) {
                            for (int j = 6, k = 0; j >= 0 && k <= 6; j--, k++) {
                                int regiPozSorL2 = regiPozSorL;
                                int regiPozOszlopL2 = regiPozOszlopL;

                                regiPozOszlopL2 = regiPozOszlopL2 + j;
                                regiPozSorL2 = regiPozSorL2 + k;
                                if (regiPozOszlopL2 > 0 && regiPozSorL2 > 0 && regiPozOszlopL2 <= 12 && regiPozSorL2 <= 10) {
                                    szurkites(regiPozSorL2, regiPozOszlopL2);
                                    lephetoSor.add(regiPozSorL2);
                                    lephetoOszlop.add(regiPozOszlopL2);
                                }
                            }
                        }
                    }
                }
            }

        } else if (egysegSebessege == 13) {

            for (int m = 0; m < 14; m++) {
                for (int i = 0; i < 27; i++) {

                    regiPozSorL = regiPozSor;
                    regiPozOszlopL = regiPozOszlop;

                    if (m == 1) {
                        regiPozSorL--;
                        regiPozOszlopL--;
                    } else if (m == 2) {
                        regiPozSorL -= 2;
                        regiPozOszlopL -= 2;
                    } else if (m == 3) {
                        regiPozSorL -= 3;
                        regiPozOszlopL -= 3;
                    } else if (m == 4) {
                        regiPozSorL -= 4;
                        regiPozOszlopL -= 4;
                    } else if (m == 5) {
                        regiPozSorL -= 5;
                        regiPozOszlopL -= 5;
                    } else if (m == 6) {
                        regiPozSorL -= 6;
                        regiPozOszlopL -= 6;
                    }else if (m == 7) {
                        regiPozSorL -= 7;
                        regiPozOszlopL -= 7;
                    } else if (m == 8) {
                        regiPozSorL -= 8;
                        regiPozOszlopL -= 8;
                    }else if (m == 9) {
                        regiPozSorL -= 9;
                        regiPozOszlopL -= 9;
                    }else if (m == 10) {
                        regiPozSorL -= 10;
                        regiPozOszlopL -= 10;
                    }else if (m == 11) {
                        regiPozSorL -= 11;
                        regiPozOszlopL -= 11;
                    }else if (m == 12) {
                        regiPozSorL -= 12;
                        regiPozOszlopL -= 12;
                    }else if (m == 13) {
                        regiPozSorL -= 13;
                        regiPozOszlopL -= 13;
                    }

                    if (i % 2 == 0) { //5
                        for (int j = 13, k = 0; j >= 0 && k <= 13; j--, k++) {
                            int regiPozSorL2 = regiPozSorL;
                            int regiPozOszlopL2 = regiPozOszlopL;

                            regiPozOszlopL2 = regiPozOszlopL2 + j;
                            regiPozSorL2 = regiPozSorL2 + k;
                            if (regiPozOszlopL2 > 0 && regiPozSorL2 > 0 && regiPozOszlopL2 <= 12 && regiPozSorL2 <= 10) {
                                szurkites(regiPozSorL2, regiPozOszlopL2);
                                    lephetoSor.add(regiPozSorL2);
                                    lephetoOszlop.add(regiPozOszlopL2);
                            }
                        }
                    } else { //4
                        if (m != 13) {
                            for (int j = 12, k = 0; j >= 0 && k <= 12; j--, k++) {
                                int regiPozSorL2 = regiPozSorL;
                                int regiPozOszlopL2 = regiPozOszlopL;

                                regiPozOszlopL2 = regiPozOszlopL2 + j;
                                regiPozSorL2 = regiPozSorL2 + k;
                                if (regiPozOszlopL2 > 0 && regiPozSorL2 > 0 && regiPozOszlopL2 <= 12 && regiPozSorL2 <= 10) {
                                    szurkites(regiPozSorL2, regiPozOszlopL2);
                                    lephetoSor.add(regiPozSorL2);
                                    lephetoOszlop.add(regiPozOszlopL2);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void szurkites(int regiPozSorL,int regiPozOszlopL) {
        int poz=Integer.parseInt(String.valueOf(regiPozSorL) + String.valueOf(regiPozOszlopL));

        if (poz==11 && !sor1oszlop1) {
            palyaS1O1.setBorderPainted(true);
            palyaS1O1.setIcon(szurkes);
            palyaS1O1.setBorder(null);
        }
        if (poz==12 && !sor1oszlop2) {
            palyaS1O2.setBorderPainted(true);
            palyaS1O2.setIcon(szurkes);
            palyaS1O2.setBorder(null);
        }
        if (poz==13 && !sor1oszlop3) {
            palyaS1O3.setBorderPainted(true);
            palyaS1O3.setIcon(szurkes);
            palyaS1O3.setBorder(null);
        }
        if (poz==14 && !sor1oszlop4) {
            palyaS1O4.setBorderPainted(true);
            palyaS1O4.setIcon(szurkes);
            palyaS1O4.setBorder(null);
        }
        if (poz==15 && !sor1oszlop5) {
            palyaS1O5.setBorderPainted(true);
            palyaS1O5.setIcon(szurkes);
            palyaS1O5.setBorder(null);
        }
        if (poz==16 && !sor1oszlop6) {
            palyaS1O6.setBorderPainted(true);
            palyaS1O6.setIcon(szurkes);
            palyaS1O6.setBorder(null);
        }
        if (poz==17 && !sor1oszlop7) {
            palyaS1O7.setBorderPainted(true);
            palyaS1O7.setIcon(szurkes);
            palyaS1O7.setBorder(null);
        }
        if (poz==18 && !sor1oszlop8) {
            palyaS1O8.setBorderPainted(true);
            palyaS1O8.setIcon(szurkes);
            palyaS1O8.setBorder(null);
        }
        if (poz==19 && !sor1oszlop9) {
            palyaS1O9.setBorderPainted(true);
            palyaS1O9.setIcon(szurkes);
            palyaS1O9.setBorder(null);
        }
        if (poz==110 && !sor1oszlop10) {
            palyaS1O10.setBorderPainted(true);
            palyaS1O10.setIcon(szurkes);
            palyaS1O10.setBorder(null);
        }
        if (poz==111 && !sor1oszlop11) {
            palyaS1O11.setBorderPainted(true);
            palyaS1O11.setIcon(szurkes);
            palyaS1O11.setBorder(null);
        }
        if (poz==112 && !sor1oszlop12) {
            palyaS1O12.setBorderPainted(true);
            palyaS1O12.setIcon(szurkes);
            palyaS1O12.setBorder(null);
        }


        if (poz==21 && !sor2oszlop1) {
            palyaS2O1.setBorderPainted(true);
            palyaS2O1.setIcon(szurkes);
            palyaS2O1.setBorder(null);
        }
        if (poz==22 && !sor2oszlop2) {
            palyaS2O2.setBorderPainted(true);
            palyaS2O2.setIcon(szurkes);
            palyaS2O2.setBorder(null);
        }
        if (poz==23 && !sor2oszlop3) {
            palyaS2O3.setBorderPainted(true);
            palyaS2O3.setIcon(szurkes);
            palyaS2O3.setBorder(null);
        }
        if (poz==24 && !sor2oszlop4) {
            palyaS2O4.setBorderPainted(true);
            palyaS2O4.setIcon(szurkes);
            palyaS2O4.setBorder(null);
        }
        if (poz==25 && !sor2oszlop5) {
            palyaS2O5.setBorderPainted(true);
            palyaS2O5.setIcon(szurkes);
            palyaS2O5.setBorder(null);
        }
        if (poz==26 && !sor2oszlop6) {
            palyaS2O6.setBorderPainted(true);
            palyaS2O6.setIcon(szurkes);
            palyaS2O6.setBorder(null);
        }
        if (poz==27 && !sor2oszlop7) {
            palyaS2O7.setBorderPainted(true);
            palyaS2O7.setIcon(szurkes);
            palyaS2O7.setBorder(null);
        }
        if (poz==28 && !sor2oszlop8) {
            palyaS2O8.setBorderPainted(true);
            palyaS2O8.setIcon(szurkes);
            palyaS2O8.setBorder(null);
        }
        if (poz==29 && !sor2oszlop9) {
            palyaS2O9.setBorderPainted(true);
            palyaS2O9.setIcon(szurkes);
            palyaS2O9.setBorder(null);
        }
        if (poz==210 && !sor2oszlop10) {
            palyaS2O10.setBorderPainted(true);
            palyaS2O10.setIcon(szurkes);
            palyaS2O10.setBorder(null);
        }
        if (poz==211 && !sor2oszlop11) {
            palyaS2O11.setBorderPainted(true);
            palyaS2O11.setIcon(szurkes);
            palyaS2O11.setBorder(null);
        }
        if (poz==212 && !sor2oszlop12) {
            palyaS2O12.setBorderPainted(true);
            palyaS2O12.setIcon(szurkes);
            palyaS2O12.setBorder(null);
        }


        if (poz==31 && !sor3oszlop1) {
            palyaS3O1.setBorderPainted(true);
            palyaS3O1.setIcon(szurkes);
            palyaS3O1.setBorder(null);
        }
        if (poz==32 && !sor3oszlop2) {
            palyaS3O2.setBorderPainted(true);
            palyaS3O2.setIcon(szurkes);
            palyaS3O2.setBorder(null);
        }
        if (poz==33 && !sor3oszlop3) {
            palyaS3O3.setBorderPainted(true);
            palyaS3O3.setIcon(szurkes);
            palyaS3O3.setBorder(null);
        }
        if (poz==34 && !sor3oszlop4) {
            palyaS3O4.setBorderPainted(true);
            palyaS3O4.setIcon(szurkes);
            palyaS3O4.setBorder(null);
        }
        if (poz==35 && !sor3oszlop5) {
            palyaS3O5.setBorderPainted(true);
            palyaS3O5.setIcon(szurkes);
            palyaS3O5.setBorder(null);
        }
        if (poz==36 && !sor3oszlop6) {
            palyaS3O6.setBorderPainted(true);
            palyaS3O6.setIcon(szurkes);
            palyaS3O6.setBorder(null);
        }
        if (poz==37 && !sor3oszlop7) {
            palyaS3O7.setBorderPainted(true);
            palyaS3O7.setIcon(szurkes);
            palyaS3O7.setBorder(null);
        }
        if (poz==38 && !sor3oszlop8) {
            palyaS3O8.setBorderPainted(true);
            palyaS3O8.setIcon(szurkes);
            palyaS3O8.setBorder(null);
        }
        if (poz==39 && !sor3oszlop9) {
            palyaS3O9.setBorderPainted(true);
            palyaS3O9.setIcon(szurkes);
            palyaS3O9.setBorder(null);
        }
        if (poz==310 && !sor3oszlop10) {
            palyaS3O10.setBorderPainted(true);
            palyaS3O10.setIcon(szurkes);
            palyaS3O10.setBorder(null);
        }
        if (poz==311 && !sor3oszlop11) {
            palyaS3O11.setBorderPainted(true);
            palyaS3O11.setIcon(szurkes);
            palyaS3O11.setBorder(null);
        }
        if (poz==312 && !sor3oszlop12) {
            palyaS3O12.setBorderPainted(true);
            palyaS3O12.setIcon(szurkes);
            palyaS3O12.setBorder(null);
        }


        if (poz==41 && !sor4oszlop1) {
            palyaS4O1.setBorderPainted(true);
            palyaS4O1.setIcon(szurkes);
            palyaS4O1.setBorder(null);
        }
        if (poz==42 && !sor4oszlop2) {
            palyaS4O2.setBorderPainted(true);
            palyaS4O2.setIcon(szurkes);
            palyaS4O2.setBorder(null);
        }
        if (poz==43 && !sor4oszlop3) {
            palyaS4O3.setBorderPainted(true);
            palyaS4O3.setIcon(szurkes);
            palyaS4O3.setBorder(null);
        }
        if (poz==44 && !sor4oszlop4) {
            palyaS4O4.setBorderPainted(true);
            palyaS4O4.setIcon(szurkes);
            palyaS4O4.setBorder(null);
        }
        if (poz==45 && !sor4oszlop5) {
            palyaS4O5.setBorderPainted(true);
            palyaS4O5.setIcon(szurkes);
            palyaS4O5.setBorder(null);
        }
        if (poz==46 && !sor4oszlop6) {
            palyaS4O6.setBorderPainted(true);
            palyaS4O6.setIcon(szurkes);
            palyaS4O6.setBorder(null);
        }
        if (poz==47 && !sor4oszlop7) {
            palyaS4O7.setBorderPainted(true);
            palyaS4O7.setIcon(szurkes);
            palyaS4O7.setBorder(null);
        }
        if (poz==48 && !sor4oszlop8) {
            palyaS4O8.setBorderPainted(true);
            palyaS4O8.setIcon(szurkes);
            palyaS4O8.setBorder(null);
        }
        if (poz==49 && !sor4oszlop9) {
            palyaS4O9.setBorderPainted(true);
            palyaS4O9.setIcon(szurkes);
            palyaS4O9.setBorder(null);
        }
        if (poz==410 && !sor4oszlop10) {
            palyaS4O10.setBorderPainted(true);
            palyaS4O10.setIcon(szurkes);
            palyaS4O10.setBorder(null);
        }
        if (poz==411 && !sor4oszlop11) {
            palyaS4O11.setBorderPainted(true);
            palyaS4O11.setIcon(szurkes);
            palyaS4O11.setBorder(null);
        }
        if (poz==412 && !sor4oszlop12) {
            palyaS4O12.setBorderPainted(true);
            palyaS4O12.setIcon(szurkes);
            palyaS4O12.setBorder(null);
        }


        if (poz==51 && !sor5oszlop1) {
            palyaS5O1.setBorderPainted(true);
            palyaS5O1.setIcon(szurkes);
            palyaS5O1.setBorder(null);
        }
        if (poz==52 && !sor5oszlop2) {
            palyaS5O2.setBorderPainted(true);
            palyaS5O2.setIcon(szurkes);
            palyaS5O2.setBorder(null);
        }
        if (poz==53 && !sor5oszlop3) {
            palyaS5O3.setBorderPainted(true);
            palyaS5O3.setIcon(szurkes);
            palyaS5O3.setBorder(null);
        }
        if (poz==54 && !sor5oszlop4) {
            palyaS5O4.setBorderPainted(true);
            palyaS5O4.setIcon(szurkes);
            palyaS5O4.setBorder(null);
        }
        if (poz==55 && !sor5oszlop5) {
            palyaS5O5.setBorderPainted(true);
            palyaS5O5.setIcon(szurkes);
            palyaS5O5.setBorder(null);
        }
        if (poz==56 && !sor5oszlop6) {
            palyaS5O6.setBorderPainted(true);
            palyaS5O6.setIcon(szurkes);
            palyaS5O6.setBorder(null);
        }
        if (poz==57 && !sor5oszlop7) {
            palyaS5O7.setBorderPainted(true);
            palyaS5O7.setIcon(szurkes);
            palyaS5O7.setBorder(null);
        }
        if (poz==58 && !sor5oszlop8) {
            palyaS5O8.setBorderPainted(true);
            palyaS5O8.setIcon(szurkes);
            palyaS5O8.setBorder(null);
        }
        if (poz==59 && !sor5oszlop9) {
            palyaS5O9.setBorderPainted(true);
            palyaS5O9.setIcon(szurkes);
            palyaS5O9.setBorder(null);
        }
        if (poz==510 && !sor5oszlop10) {
            palyaS5O10.setBorderPainted(true);
            palyaS5O10.setIcon(szurkes);
            palyaS5O10.setBorder(null);
        }
        if (poz==511 && !sor5oszlop11) {
            palyaS5O11.setBorderPainted(true);
            palyaS5O11.setIcon(szurkes);
            palyaS5O11.setBorder(null);
        }
        if (poz==512 && !sor5oszlop12) {
            palyaS5O12.setBorderPainted(true);
            palyaS5O12.setIcon(szurkes);
            palyaS5O12.setBorder(null);
        }


        if (poz==61 && !sor6oszlop1) {
            palyaS6O1.setBorderPainted(true);
            palyaS6O1.setIcon(szurkes);
            palyaS6O1.setBorder(null);
        }
        if (poz==62 && !sor6oszlop2) {
            palyaS6O2.setBorderPainted(true);
            palyaS6O2.setIcon(szurkes);
            palyaS6O2.setBorder(null);
        }
        if (poz==63 && !sor6oszlop3) {
            palyaS6O3.setBorderPainted(true);
            palyaS6O3.setIcon(szurkes);
            palyaS6O3.setBorder(null);
        }
        if (poz==65 && !sor6oszlop5) {
            palyaS6O5.setBorderPainted(true);
            palyaS6O5.setIcon(szurkes);
            palyaS6O5.setBorder(null);
        }
        if (poz==66 && !sor6oszlop6) {
            palyaS6O6.setBorderPainted(true);
            palyaS6O6.setIcon(szurkes);
            palyaS6O6.setBorder(null);
        }
        if (poz==67 && !sor6oszlop7) {
            palyaS6O7.setBorderPainted(true);
            palyaS6O7.setIcon(szurkes);
            palyaS6O7.setBorder(null);
        }
        if (poz==68 && !sor6oszlop8) {
            palyaS6O8.setBorderPainted(true);
            palyaS6O8.setIcon(szurkes);
            palyaS6O8.setBorder(null);
        }
        if (poz==69 && !sor6oszlop9) {
            palyaS6O9.setBorderPainted(true);
            palyaS6O9.setIcon(szurkes);
            palyaS6O9.setBorder(null);
        }
        if (poz==610 && !sor6oszlop10) {
            palyaS6O10.setBorderPainted(true);
            palyaS6O10.setIcon(szurkes);
            palyaS6O10.setBorder(null);
        }
        if (poz==611 && !sor6oszlop11) {
            palyaS6O11.setBorderPainted(true);
            palyaS6O11.setIcon(szurkes);
            palyaS6O11.setBorder(null);
        }
        if (poz==612 && !sor6oszlop12) {
            palyaS6O12.setBorderPainted(true);
            palyaS6O12.setIcon(szurkes);
            palyaS6O12.setBorder(null);
        }


        if (poz==71 && !sor7oszlop1) {
            palyaS7O1.setBorderPainted(true);
            palyaS7O1.setIcon(szurkes);
            palyaS7O1.setBorder(null);
        }
        if (poz==72 && !sor7oszlop2) {
            palyaS7O2.setBorderPainted(true);
            palyaS7O2.setIcon(szurkes);
            palyaS7O2.setBorder(null);
        }
        if (poz==73 && !sor7oszlop3) {
            palyaS7O3.setBorderPainted(true);
            palyaS7O3.setIcon(szurkes);
            palyaS7O3.setBorder(null);
        }
        if (poz==74 && !sor7oszlop4) {
            palyaS7O4.setBorderPainted(true);
            palyaS7O4.setIcon(szurkes);
            palyaS7O4.setBorder(null);
        }
        if (poz==75 && !sor7oszlop5) {
            palyaS7O5.setBorderPainted(true);
            palyaS7O5.setIcon(szurkes);
            palyaS7O5.setBorder(null);
        }
        if (poz==76 && !sor7oszlop6) {
            palyaS7O6.setBorderPainted(true);
            palyaS7O6.setIcon(szurkes);
            palyaS7O6.setBorder(null);
        }
        if (poz==77 && !sor7oszlop7) {
            palyaS7O7.setBorderPainted(true);
            palyaS7O7.setIcon(szurkes);
            palyaS7O7.setBorder(null);
        }
        if (poz==710 && !sor7oszlop10) {
            palyaS7O10.setBorderPainted(true);
            palyaS7O10.setIcon(szurkes);
            palyaS7O10.setBorder(null);
        }
        if (poz==711 && !sor7oszlop11) {
            palyaS7O11.setBorderPainted(true);
            palyaS7O11.setIcon(szurkes);
            palyaS7O11.setBorder(null);
        }
        if (poz==712 && !sor7oszlop12) {
            palyaS7O12.setBorderPainted(true);
            palyaS7O12.setIcon(szurkes);
            palyaS7O12.setBorder(null);
        }


        if (poz==81 && !sor8oszlop1) {
            palyaS8O1.setBorderPainted(true);
            palyaS8O1.setIcon(szurkes);
            palyaS8O1.setBorder(null);
        }
        if (poz==82 && !sor8oszlop2) {
            palyaS8O2.setBorderPainted(true);
            palyaS8O2.setIcon(szurkes);
            palyaS8O2.setBorder(null);
        }
        if (poz==83 && !sor8oszlop3) {
            palyaS8O3.setBorderPainted(true);
            palyaS8O3.setIcon(szurkes);
            palyaS8O3.setBorder(null);
        }
        if (poz==84 && !sor8oszlop4) {
            palyaS8O4.setBorderPainted(true);
            palyaS8O4.setIcon(szurkes);
            palyaS8O4.setBorder(null);
        }
        if (poz==85 && !sor8oszlop5) {
            palyaS8O5.setBorderPainted(true);
            palyaS8O5.setIcon(szurkes);
            palyaS8O5.setBorder(null);
        }
        if (poz==88 && !sor8oszlop8) {
            palyaS8O8.setBorderPainted(true);
            palyaS8O8.setIcon(szurkes);
            palyaS8O8.setBorder(null);
        }
        if (poz==89 && !sor8oszlop9) {
            palyaS8O9.setBorderPainted(true);
            palyaS8O9.setIcon(szurkes);
            palyaS8O9.setBorder(null);
        }
        if (poz==810 && !sor8oszlop10) {
            palyaS8O10.setBorderPainted(true);
            palyaS8O10.setIcon(szurkes);
            palyaS8O10.setBorder(null);
        }
        if (poz==811 && !sor8oszlop11) {
            palyaS8O11.setBorderPainted(true);
            palyaS8O11.setIcon(szurkes);
            palyaS8O11.setBorder(null);
        }
        if (poz==812 && !sor8oszlop12) {
            palyaS8O12.setBorderPainted(true);
            palyaS8O12.setIcon(szurkes);
            palyaS8O12.setBorder(null);
        }


        if (poz==91 && !sor9oszlop1) {
            palyaS9O1.setBorderPainted(true);
            palyaS9O1.setIcon(szurkes);
            palyaS9O1.setBorder(null);
        }
        if (poz==92 && !sor9oszlop2) {
            palyaS9O2.setBorderPainted(true);
            palyaS9O2.setIcon(szurkes);
            palyaS9O2.setBorder(null);
        }
        if (poz==95 && !sor9oszlop5) {
            palyaS9O5.setBorderPainted(true);
            palyaS9O5.setIcon(szurkes);
            palyaS9O5.setBorder(null);
        }
        if (poz==96 && !sor9oszlop6) {
            palyaS9O6.setBorderPainted(true);
            palyaS9O6.setIcon(szurkes);
            palyaS9O6.setBorder(null);
        }
        if (poz==97 && !sor9oszlop7) {
            palyaS9O7.setBorderPainted(true);
            palyaS9O7.setIcon(szurkes);
            palyaS9O7.setBorder(null);
        }
        if (poz==98 && !sor9oszlop8) {
            palyaS9O8.setBorderPainted(true);
            palyaS9O8.setIcon(szurkes);
            palyaS9O8.setBorder(null);
        }
        if (poz==99 && !sor9oszlop9) {
            palyaS9O9.setBorderPainted(true);
            palyaS9O9.setIcon(szurkes);
            palyaS9O9.setBorder(null);
        }
        if (poz==910 && !sor9oszlop10) {
            palyaS9O10.setBorderPainted(true);
            palyaS9O10.setIcon(szurkes);
            palyaS9O10.setBorder(null);
        }
        if (poz==911 && !sor9oszlop11) {
            palyaS9O11.setBorderPainted(true);
            palyaS9O11.setIcon(szurkes);
            palyaS9O11.setBorder(null);
        }
        if (poz==912 && !sor9oszlop12) {
            palyaS9O12.setBorderPainted(true);
            palyaS9O12.setIcon(szurkes);
            palyaS9O12.setBorder(null);
        }


        if (poz==101 && !sor10oszlop1) {
            palyaS10O1.setBorderPainted(true);
            palyaS10O1.setIcon(szurkes);
            palyaS10O1.setBorder(null);
        }
        if (poz==102 && !sor10oszlop2) {
            palyaS10O2.setBorderPainted(true);
            palyaS10O2.setIcon(szurkes);
            palyaS10O2.setBorder(null);
        }
        if (poz==105 && !sor10oszlop5) {
            palyaS10O5.setBorderPainted(true);
            palyaS10O5.setIcon(szurkes);
            palyaS10O5.setBorder(null);
        }
        if (poz==106 && !sor10oszlop6) {
            palyaS10O6.setBorderPainted(true);
            palyaS10O6.setIcon(szurkes);
            palyaS10O6.setBorder(null);
        }
        if (poz==107 && !sor10oszlop7) {
            palyaS10O7.setBorderPainted(true);
            palyaS10O7.setIcon(szurkes);
            palyaS10O7.setBorder(null);
        }
        if (poz==108 && !sor10oszlop8) {
            palyaS10O8.setBorderPainted(true);
            palyaS10O8.setIcon(szurkes);
            palyaS10O8.setBorder(null);
        }
        if (poz==109 && !sor10oszlop9) {
            palyaS10O9.setBorderPainted(true);
            palyaS10O9.setIcon(szurkes);
            palyaS10O9.setBorder(null);
        }
        if (poz==1010 && !sor10oszlop10) {
            palyaS10O10.setBorderPainted(true);
            palyaS10O10.setIcon(szurkes);
            palyaS10O10.setBorder(null);
        }
        if (poz==1011 && !sor10oszlop11) {
            palyaS10O11.setBorderPainted(true);
            palyaS10O11.setIcon(szurkes);
            palyaS10O11.setBorder(null);
        }
        if (poz==1012 && !sor10oszlop12) {
            palyaS10O12.setBorderPainted(true);
            palyaS10O12.setIcon(szurkes);
            palyaS10O12.setBorder(null);
        }
    }
}