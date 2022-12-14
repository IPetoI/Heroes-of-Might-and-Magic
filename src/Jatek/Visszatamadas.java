package Jatek;

import Egysegek.EgysegLathatosag;
import Egysegek.Eletero;

import static Egysegek.EgysegLetetel.*;
import static Egysegek.Sebzes.*;
import static Ellenfel.EllenfelEgysege.*;
import static Ellenfel.EllenfelEgysege.ellenfelEgysegL5Kep;
import static Jatek.JatekAblak.*;
import static Jatek.Sorrend.*;

public class Visszatamadas {

    public static boolean egysegVisszatamadas1 =false;
    public static boolean egysegVisszatamadas2 =false;
    public static boolean egysegVisszatamadas3 =false;
    public static boolean egysegVisszatamadas4 =false;
    public static boolean egysegVisszatamadas5 =false;
    public static boolean ellEgysegVisszatamadas1 =false;
    public static boolean ellEgysegVisszatamadas2 =false;
    public static boolean ellEgysegVisszatamadas3 =false;
    public static boolean ellEgysegVisszatamadas4 =false;
    public static boolean ellEgysegVisszatamadas5 =false;

    public static void Visszatamad(String egyseg, int sor, int oszlop) {

        egysegNeve(kitTamad);

        int raptVisszatamadva = random.nextInt(100 + 1);
        boolean vanVisszatamadas;

        vanVisszatamadas = raptVisszatamadva > 70;

        System.out.println(raptVisszatamadva + "  erteke a visszatamadasnak " + vanVisszatamadas);

        if ("efoldmuv".equals(egyseg)) {
            Eletero.elsoEllEgysegEletero -= sebzes;
            ellenfelDbSzamElso = Eletero.elsoEllEgysegEletero / 3;
            if (Eletero.elsoEllEgysegEletero > 0) {

                egysegekSorrend.remove(ellenfelEgysegIras1);
                egysegekSorrend.remove(ellenfelEgysegL1Kep);

                if (ellenfelDbSzamElso < 10) {
                    ellenfelEgysegErtek1.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamElso)));
                } else {
                    ellenfelEgysegErtek1.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamElso)));
                }

                if (vanKrit) {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki ( Krit ) " + sebzes + " szenvedett " +
                            "és " + Eletero.elsoEllEgysegEletero + " maradt.</p></center></html>");
                } else {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki " + sebzes + " szenvedett " +
                            "és " + Eletero.elsoEllEgysegEletero + " maradt.</p></center></html>");
                }


                ellenfelEgysegIras1.add(ellenfelEgysegErtek1);
                ellenfelEgysegL1Kep.add(ellenfelEgysegL1Kepe);
                EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras1, ellenfelEgysegL1Kep, oszlop, sor);
                ablakCsata.add(egysegekSorrend);
            } else {
                egysegekSorrend.remove(ellenfelEgysegIras1);
                egysegekSorrend.remove(ellenfelEgysegL1Kep);

                efoldmuv = 0;
                egysegPozTorlese("efoldmuv", sor, oszlop);

                if (vanKrit) {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki ( Krit ) " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                } else {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                }

            }
        } else if ("ecsont".equals(egyseg)) {
            Eletero.elsoEllEgysegEletero -= sebzes;
            ellenfelDbSzamElso = Eletero.elsoEllEgysegEletero / 2;
            if (Eletero.elsoEllEgysegEletero > 0) {

                egysegekSorrend.remove(ellenfelEgysegIras1);
                egysegekSorrend.remove(ellenfelEgysegL1Kep);

                if (ellenfelDbSzamElso < 10) {
                    ellenfelEgysegErtek1.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamElso)));
                } else {
                    ellenfelEgysegErtek1.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamElso)));
                }

                if (vanKrit) {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki ( Krit ) " + sebzes + " szenvedett " +
                            "és " + Eletero.elsoEllEgysegEletero + " maradt.</p></center></html>");
                } else {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki " + sebzes + " szenvedett " +
                            "és " + Eletero.elsoEllEgysegEletero + " maradt.</p></center></html>");
                }


                ellenfelEgysegIras1.add(ellenfelEgysegErtek1);
                ellenfelEgysegL1Kep.add(ellenfelEgysegL1Kepe);
                EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras1, ellenfelEgysegL1Kep, oszlop, sor);
                ablakCsata.add(egysegekSorrend);
            } else {
                egysegekSorrend.remove(ellenfelEgysegIras1);
                egysegekSorrend.remove(ellenfelEgysegL1Kep);

                ecsont = 0;
                egysegPozTorlese("ecsont", sor, oszlop);

                if (vanKrit) {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki ( Krit ) " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                } else {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                }

            }
        } else if ("efelder".equals(egyseg)) {
            Eletero.masodikEllEgysegEletero -= sebzes;
            ellenfelDbSzamMasodik = Eletero.masodikEllEgysegEletero / 10;
            if (Eletero.masodikEllEgysegEletero > 0) {

                egysegekSorrend.remove(ellenfelEgysegIras2);
                egysegekSorrend.remove(ellenfelEgysegL2Kep);

                if (ellenfelDbSzamMasodik < 10) {
                    ellenfelEgysegErtek2.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamMasodik)));
                } else {
                    ellenfelEgysegErtek2.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamMasodik)));
                }

                if (vanKrit) {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki ( Krit ) " + sebzes + " szenvedett " +
                            "és " + Eletero.masodikEllEgysegEletero + " maradt.</p></center></html>");
                } else {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki " + sebzes + " szenvedett " +
                            "és " + Eletero.masodikEllEgysegEletero + " maradt.</p></center></html>");
                }


                ellenfelEgysegIras2.add(ellenfelEgysegErtek2);
                ellenfelEgysegL2Kep.add(ellenfelEgysegL2Kepe);
                EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras2, ellenfelEgysegL2Kep, oszlop, sor);
                ablakCsata.add(egysegekSorrend);
            } else {
                egysegekSorrend.remove(ellenfelEgysegIras2);
                egysegekSorrend.remove(ellenfelEgysegL2Kep);

                efelder = 0;
                egysegPozTorlese("efelder", sor, oszlop);

                if (vanKrit) {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki ( Krit ) " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                } else {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                }

            }
        } else if ("eijas".equals(egyseg)) {
            Eletero.masodikEllEgysegEletero -= sebzes;
            ellenfelDbSzamMasodik = Eletero.masodikEllEgysegEletero / 7;
            if (Eletero.masodikEllEgysegEletero > 0) {

                egysegekSorrend.remove(ellenfelEgysegIras2);
                egysegekSorrend.remove(ellenfelEgysegL2Kep);

                if (ellenfelDbSzamMasodik < 10) {
                    ellenfelEgysegErtek2.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamMasodik)));
                } else {
                    ellenfelEgysegErtek2.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamMasodik)));
                }

                if (vanKrit) {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki ( Krit ) " + sebzes + " szenvedett " +
                            "és " + Eletero.masodikEllEgysegEletero + " maradt.</p></center></html>");
                } else {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki " + sebzes + " szenvedett " +
                            "és " + Eletero.masodikEllEgysegEletero + " maradt.</p></center></html>");
                }


                ellenfelEgysegIras2.add(ellenfelEgysegErtek2);
                ellenfelEgysegL2Kep.add(ellenfelEgysegL2Kepe);
                EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras2, ellenfelEgysegL2Kep, oszlop, sor);
                ablakCsata.add(egysegekSorrend);
            } else {
                egysegekSorrend.remove(ellenfelEgysegIras2);
                egysegekSorrend.remove(ellenfelEgysegL2Kep);

                eijas = 0;
                egysegPozTorlese("eijas", sor, oszlop);

                if (vanKrit) {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki ( Krit ) " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                } else {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                }

            }
        } else if ("emino".equals(egyseg)) {
            Eletero.harmadikEllEgysegEletero -= sebzes;
            ellenfelDbSzamHarmadik = Eletero.harmadikEllEgysegEletero / 80;
            if (Eletero.harmadikEllEgysegEletero > 0) {

                egysegekSorrend.remove(ellenfelEgysegIras3);
                egysegekSorrend.remove(ellenfelEgysegL3Kep);

                if (ellenfelDbSzamHarmadik < 10) {
                    ellenfelEgysegErtek3.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamHarmadik)));
                } else {
                    ellenfelEgysegErtek3.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamHarmadik)));
                }

                if (vanKrit) {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki ( Krit ) " + sebzes + " szenvedett " +
                            "és " + Eletero.harmadikEllEgysegEletero + " maradt.</p></center></html>");
                } else {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki " + sebzes + " szenvedett " +
                            "és " + Eletero.harmadikEllEgysegEletero + " maradt.</p></center></html>");
                }


                ellenfelEgysegIras3.add(ellenfelEgysegErtek3);
                ellenfelEgysegL3Kep.add(ellenfelEgysegL3Kepe);
                EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras3, ellenfelEgysegL3Kep, oszlop, sor);
                ablakCsata.add(egysegekSorrend);
            } else {
                egysegekSorrend.remove(ellenfelEgysegIras3);
                egysegekSorrend.remove(ellenfelEgysegL3Kep);

                emino = 0;
                egysegPozTorlese("emino", sor, oszlop);

                if (vanKrit) {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki ( Krit ) " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                } else {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                }

            }
        } else if ("egrif".equals(egyseg)) {
            Eletero.harmadikEllEgysegEletero -= sebzes;
            ellenfelDbSzamHarmadik = Eletero.harmadikEllEgysegEletero / 30;
            if (Eletero.harmadikEllEgysegEletero > 0) {

                egysegekSorrend.remove(ellenfelEgysegIras3);
                egysegekSorrend.remove(ellenfelEgysegL3Kep);

                if (ellenfelDbSzamHarmadik < 10) {
                    ellenfelEgysegErtek3.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamHarmadik)));
                } else {
                    ellenfelEgysegErtek3.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamHarmadik)));
                }

                if (vanKrit) {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki ( Krit ) " + sebzes + " szenvedett " +
                            "és " + Eletero.harmadikEllEgysegEletero + " maradt.</p></center></html>");
                } else {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki " + sebzes + " szenvedett " +
                            "és " + Eletero.harmadikEllEgysegEletero + " maradt.</p></center></html>");
                }


                ellenfelEgysegIras3.add(ellenfelEgysegErtek3);
                ellenfelEgysegL3Kep.add(ellenfelEgysegL3Kepe);
                EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras3, ellenfelEgysegL3Kep, oszlop, sor);
                ablakCsata.add(egysegekSorrend);
            } else {
                egysegekSorrend.remove(ellenfelEgysegIras3);
                egysegekSorrend.remove(ellenfelEgysegL3Kep);

                egrif = 0;
                egysegPozTorlese("egrif", sor, oszlop);

                if (vanKrit) {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki ( Krit ) " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                } else {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                }

            }
        } else if ("efegyv".equals(egyseg)) {
            Eletero.negyedikEllEgysegEletero -= sebzes;
            ellenfelDbSzamNegyedik = Eletero.negyedikEllEgysegEletero / 33;
            if (Eletero.negyedikEllEgysegEletero > 0) {

                egysegekSorrend.remove(ellenfelEgysegIras4);
                egysegekSorrend.remove(ellenfelEgysegL4Kep);

                if (ellenfelDbSzamNegyedik < 10) {
                    ellenfelEgysegErtek4.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamNegyedik)));
                } else {
                    ellenfelEgysegErtek4.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamNegyedik)));
                }

                if (vanKrit) {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki ( Krit ) " + sebzes + " szenvedett " +
                            "és " + Eletero.negyedikEllEgysegEletero + " maradt.</p></center></html>");
                } else {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki " + sebzes + " szenvedett " +
                            "és " + Eletero.negyedikEllEgysegEletero + " maradt.</p></center></html>");
                }


                ellenfelEgysegIras4.add(ellenfelEgysegErtek4);
                ellenfelEgysegL4Kep.add(ellenfelEgysegL4Kepe);
                EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras4, ellenfelEgysegL4Kep, oszlop, sor);
                ablakCsata.add(egysegekSorrend);
            } else {
                egysegekSorrend.remove(ellenfelEgysegIras4);
                egysegekSorrend.remove(ellenfelEgysegL4Kep);

                efegyv = 0;
                egysegPozTorlese("efegyv", sor, oszlop);

                if (vanKrit) {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki ( Krit ) " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                } else {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                }

            }
        } else if ("eorgy".equals(egyseg)) {
            Eletero.negyedikEllEgysegEletero -= sebzes;
            ellenfelDbSzamNegyedik = Eletero.negyedikEllEgysegEletero / 20;
            if (Eletero.negyedikEllEgysegEletero > 0) {

                egysegekSorrend.remove(ellenfelEgysegIras4);
                egysegekSorrend.remove(ellenfelEgysegL4Kep);

                if (ellenfelDbSzamNegyedik < 10) {
                    ellenfelEgysegErtek4.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamNegyedik)));
                } else {
                    ellenfelEgysegErtek4.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamNegyedik)));
                }

                if (vanKrit) {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki ( Krit ) " + sebzes + " szenvedett " +
                            "és " + Eletero.negyedikEllEgysegEletero + " maradt.</p></center></html>");
                } else {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki " + sebzes + " szenvedett " +
                            "és " + Eletero.negyedikEllEgysegEletero + " maradt.</p></center></html>");
                }


                ellenfelEgysegIras4.add(ellenfelEgysegErtek4);
                ellenfelEgysegL4Kep.add(ellenfelEgysegL4Kepe);
                EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras4, ellenfelEgysegL4Kep, oszlop, sor);
                ablakCsata.add(egysegekSorrend);
            } else {
                egysegekSorrend.remove(ellenfelEgysegIras4);
                egysegekSorrend.remove(ellenfelEgysegL4Kep);

                eorgy = 0;
                egysegPozTorlese("eorgy", sor, oszlop);

                if (vanKrit) {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki ( Krit ) " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                } else {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                }

            }
        } else if ("eharcp".equals(egyseg)) {
            Eletero.otodikEllEgysegEletero -= sebzes;
            ellenfelDbSzamOtodik = Eletero.otodikEllEgysegEletero / 54;
            if (Eletero.otodikEllEgysegEletero > 0) {

                egysegekSorrend.remove(ellenfelEgysegIras5);
                egysegekSorrend.remove(ellenfelEgysegL5Kep);

                if (ellenfelDbSzamOtodik < 10) {
                    ellenfelEgysegErtek5.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamOtodik)));
                } else {
                    ellenfelEgysegErtek5.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamOtodik)));
                }

                if (vanKrit) {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki ( Krit ) " + sebzes + " szenvedett " +
                            "és " + Eletero.otodikEllEgysegEletero + " maradt.</p></center></html>");
                } else {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki " + sebzes + " szenvedett " +
                            "és " + Eletero.otodikEllEgysegEletero + " maradt.</p></center></html>");
                }


                ellenfelEgysegIras5.add(ellenfelEgysegErtek5);
                ellenfelEgysegL5Kep.add(ellenfelEgysegL5Kepe);
                EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras5, ellenfelEgysegL5Kep, oszlop, sor);
                ablakCsata.add(egysegekSorrend);
            } else {
                egysegekSorrend.remove(ellenfelEgysegIras5);
                egysegekSorrend.remove(ellenfelEgysegL5Kep);

                eharcp = 0;
                egysegPozTorlese("eharcp", sor, oszlop);

                if (vanKrit) {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki ( Krit ) " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                } else {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                }

            }
        } else if ("erapt".equals(egyseg) && vanVisszatamadas) {
            Eletero.otodikEllEgysegEletero -= sebzes;
            ellenfelDbSzamOtodik = Eletero.otodikEllEgysegEletero / 35;
            if (Eletero.otodikEllEgysegEletero > 0) {

                egysegekSorrend.remove(ellenfelEgysegIras5);
                egysegekSorrend.remove(ellenfelEgysegL5Kep);

                if (ellenfelDbSzamOtodik < 10) {
                    ellenfelEgysegErtek5.setText(String.valueOf(String.format("%.2f", ellenfelDbSzamOtodik)));
                } else {
                    ellenfelEgysegErtek5.setText(String.valueOf(String.format("%.1f", ellenfelDbSzamOtodik)));
                }

                if (vanKrit) {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki ( Krit ) " + sebzes + " szenvedett " +
                            "és " + Eletero.otodikEllEgysegEletero + " maradt.</p></center></html>");
                } else {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki " + sebzes + " szenvedett " +
                            "és " + Eletero.otodikEllEgysegEletero + " maradt.</p></center></html>");
                }


                ellenfelEgysegIras5.add(ellenfelEgysegErtek5);
                ellenfelEgysegL5Kep.add(ellenfelEgysegL5Kepe);
                EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras5, ellenfelEgysegL5Kep, oszlop, sor);
                ablakCsata.add(egysegekSorrend);
            } else {
                egysegekSorrend.remove(ellenfelEgysegIras5);
                egysegekSorrend.remove(ellenfelEgysegL5Kep);

                erapt = 0;
                egysegPozTorlese("erapt", sor, oszlop);

                if (vanKrit) {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki ( Krit ) " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                } else {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                }

            }
        } else if ("csont".equals(egyseg)) {
            Eletero.elsoEgysegEletero -= sebzes;
            dbSzamElso = Eletero.elsoEgysegEletero / 2;
            if (Eletero.elsoEgysegEletero > 0) {

                egysegekSorrend.remove(egysegIras1);
                egysegekSorrend.remove(egysegL1TestKep);

                if (dbSzamElso < 10) {
                    egysegErtek1.setText(String.valueOf(String.format("%.2f", dbSzamElso)));
                } else {
                    egysegErtek1.setText(String.valueOf(String.format("%.1f", dbSzamElso)));
                }

                if (vanKrit) {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki ( Krit ) " + sebzes + " sebzést szenvedett " +
                            "és " + Eletero.elsoEgysegEletero + " életereje maradt.</p></center></html>");
                } else {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és " + Eletero.elsoEgysegEletero + " életereje maradt.</p></center></html>");
                }


                egysegIras1.add(egysegErtek1);
                egysegL1TestKep.add(egysegL1TestKepe);
                EgysegLathatosag.lathatosagSorrend(egysegIras1, egysegL1TestKep, oszlop, sor);
                ablakCsata.add(egysegekSorrend);
            } else {
                egysegekSorrend.remove(egysegIras1);
                egysegekSorrend.remove(egysegL1TestKep);

                csont = 0;
                egysegPozTorlese("csont", sor, oszlop);

                if (vanKrit) {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki ( Krit ) " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                } else {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                }

            }
        } else if ("foldmuv".equals(egyseg)) {
            Eletero.elsoEgysegEletero -= sebzes;
            dbSzamElso = Eletero.elsoEgysegEletero / 3;
            if (Eletero.elsoEgysegEletero > 0) {

                egysegekSorrend.remove(egysegIras1);
                egysegekSorrend.remove(egysegL1TestKep);

                if (dbSzamElso < 10) {
                    egysegErtek1.setText(String.valueOf(String.format("%.2f", dbSzamElso)));
                } else {
                    egysegErtek1.setText(String.valueOf(String.format("%.1f", dbSzamElso)));
                }

                if (vanKrit) {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki ( Krit ) " + sebzes + " sebzést szenvedett " +
                            "és " + Eletero.elsoEgysegEletero + " életereje maradt.</p></center></html>");
                } else {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és " + Eletero.elsoEgysegEletero + " életereje maradt.</p></center></html>");
                }


                egysegIras1.add(egysegErtek1);
                egysegL1TestKep.add(egysegL1TestKepe);
                EgysegLathatosag.lathatosagSorrend(egysegIras1, egysegL1TestKep, oszlop, sor);
                ablakCsata.add(egysegekSorrend);
            } else {
                egysegekSorrend.remove(egysegIras1);
                egysegekSorrend.remove(egysegL1TestKep);

                foldmuv = 0;
                egysegPozTorlese("foldmuv", sor, oszlop);

                if (vanKrit) {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki ( Krit ) " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                } else {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                }

            }
        } else if ("ijas".equals(egyseg)) {
            Eletero.masodikEgysegEletero -= sebzes;
            dbSzamMasodik = Eletero.masodikEgysegEletero / 7;
            if (Eletero.masodikEgysegEletero > 0) {

                egysegekSorrend.remove(egysegIras2);
                egysegekSorrend.remove(egysegL2TestKep);

                if (dbSzamMasodik < 10) {
                    egysegErtek2.setText(String.valueOf(String.format("%.2f", dbSzamMasodik)));
                } else {
                    egysegErtek2.setText(String.valueOf(String.format("%.1f", dbSzamMasodik)));
                }

                if (vanKrit) {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki ( Krit ) " + sebzes + " sebzést szenvedett " +
                            "és " + Eletero.masodikEgysegEletero + " életereje maradt.</p></center></html>");
                } else {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és " + Eletero.masodikEgysegEletero + " életereje maradt.</p></center></html>");
                }


                egysegIras2.add(egysegErtek2);
                egysegL2TestKep.add(egysegL2TestKepe);
                EgysegLathatosag.lathatosagSorrend(egysegIras2, egysegL2TestKep, oszlop, sor);
                ablakCsata.add(egysegekSorrend);
            } else {
                egysegekSorrend.remove(egysegIras2);
                egysegekSorrend.remove(egysegL2TestKep);

                ijas = 0;
                egysegPozTorlese("ijas", sor, oszlop);

                if (vanKrit) {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki ( Krit ) " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                } else {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                }

            }
        } else if ("felder".equals(egyseg)) {
            Eletero.masodikEgysegEletero -= sebzes;
            dbSzamMasodik = Eletero.masodikEgysegEletero / 10;
            if (Eletero.masodikEgysegEletero > 0) {

                egysegekSorrend.remove(egysegIras2);
                egysegekSorrend.remove(egysegL2TestKep);

                if (dbSzamMasodik < 10) {
                    egysegErtek2.setText(String.valueOf(String.format("%.2f", dbSzamMasodik)));
                } else {
                    egysegErtek2.setText(String.valueOf(String.format("%.1f", dbSzamMasodik)));
                }

                if (vanKrit) {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki ( Krit ) " + sebzes + " sebzést szenvedett " +
                            "és " + Eletero.masodikEgysegEletero + " életereje maradt.</p></center></html>");
                } else {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és " + Eletero.masodikEgysegEletero + " életereje maradt.</p></center></html>");
                }


                egysegIras2.add(egysegErtek2);
                egysegL2TestKep.add(egysegL2TestKepe);
                EgysegLathatosag.lathatosagSorrend(egysegIras2, egysegL2TestKep, oszlop, sor);
                ablakCsata.add(egysegekSorrend);
            } else {
                egysegekSorrend.remove(egysegIras2);
                egysegekSorrend.remove(egysegL2TestKep);

                felder = 0;
                egysegPozTorlese("felder", sor, oszlop);

                if (vanKrit) {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki ( Krit ) " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                } else {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                }

            }
        } else if ("grif".equals(egyseg)) {
            Eletero.harmadikEgysegEletero -= sebzes;
            dbSzamHarmadik = Eletero.harmadikEgysegEletero / 30;
            if (Eletero.harmadikEgysegEletero > 0) {

                egysegekSorrend.remove(egysegIras3);
                egysegekSorrend.remove(egysegL3TestKep);

                if (dbSzamHarmadik < 10) {
                    egysegErtek3.setText(String.valueOf(String.format("%.2f", dbSzamHarmadik)));
                } else {
                    egysegErtek3.setText(String.valueOf(String.format("%.1f", dbSzamHarmadik)));
                }

                if (vanKrit) {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki ( Krit ) " + sebzes + " sebzést szenvedett " +
                            "és " + Eletero.harmadikEgysegEletero + " életereje maradt.</p></center></html>");
                } else {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és " + Eletero.harmadikEgysegEletero + " életereje maradt.</p></center></html>");
                }


                egysegIras3.add(egysegErtek3);
                egysegL3TestKep.add(egysegL3TestKepe);
                EgysegLathatosag.lathatosagSorrend(egysegIras3, egysegL3TestKep, oszlop, sor);
                ablakCsata.add(egysegekSorrend);
            } else {
                egysegekSorrend.remove(egysegIras3);
                egysegekSorrend.remove(egysegL3TestKep);

                grif = 0;
                egysegPozTorlese("grif", sor, oszlop);

                if (vanKrit) {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki ( Krit ) " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                } else {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                }

            }
        } else if ("mino".equals(egyseg)) {
            Eletero.harmadikEgysegEletero -= sebzes;
            dbSzamHarmadik = Eletero.harmadikEgysegEletero / 80;
            if (Eletero.harmadikEgysegEletero > 0) {

                egysegekSorrend.remove(egysegIras3);
                egysegekSorrend.remove(egysegL3TestKep);

                if (dbSzamHarmadik < 10) {
                    egysegErtek3.setText(String.valueOf(String.format("%.2f", dbSzamHarmadik)));
                } else {
                    egysegErtek3.setText(String.valueOf(String.format("%.1f", dbSzamHarmadik)));
                }

                if (vanKrit) {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki ( Krit ) " + sebzes + " sebzést szenvedett " +
                            "és " + Eletero.harmadikEgysegEletero + " életereje maradt.</p></center></html>");
                } else {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és " + Eletero.harmadikEgysegEletero + " életereje maradt.</p></center></html>");
                }


                egysegIras3.add(egysegErtek3);
                egysegL3TestKep.add(egysegL3TestKepe);
                EgysegLathatosag.lathatosagSorrend(egysegIras3, egysegL3TestKep, oszlop, sor);
                ablakCsata.add(egysegekSorrend);
            } else {
                egysegekSorrend.remove(egysegIras3);
                egysegekSorrend.remove(egysegL3TestKep);

                mino = 0;
                egysegPozTorlese("mino", sor, oszlop);

                if (vanKrit) {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki ( Krit ) " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                } else {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                }

            }
        } else if ("fegyv".equals(egyseg)) {
            Eletero.negyedikEgysegEletero -= sebzes;
            dbSzamNegyedik = Eletero.negyedikEgysegEletero / 33;
            if (Eletero.negyedikEgysegEletero > 0) {

                egysegekSorrend.remove(egysegIras4);
                egysegekSorrend.remove(egysegL4TestKep);

                if (dbSzamNegyedik < 10) {
                    egysegErtek4.setText(String.valueOf(String.format("%.2f", dbSzamNegyedik)));
                } else {
                    egysegErtek4.setText(String.valueOf(String.format("%.1f", dbSzamNegyedik)));
                }

                if (vanKrit) {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki ( Krit ) " + sebzes + " sebzést szenvedett " +
                            "és " + Eletero.negyedikEgysegEletero + " életereje maradt.</p></center></html>");
                } else {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és " + Eletero.negyedikEgysegEletero + " életereje maradt.</p></center></html>");
                }


                egysegIras4.add(egysegErtek4);
                egysegL4TestKep.add(egysegL4TestKepe);
                EgysegLathatosag.lathatosagSorrend(egysegIras4, egysegL4TestKep, oszlop, sor);
                ablakCsata.add(egysegekSorrend);
            } else {
                egysegekSorrend.remove(egysegIras4);
                egysegekSorrend.remove(egysegL4TestKep);

                fegyv = 0;
                egysegPozTorlese("fegyv", sor, oszlop);

                if (vanKrit) {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki ( Krit ) " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                } else {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                }

            }
        } else if ("orgy".equals(egyseg)) {
            Eletero.negyedikEgysegEletero -= sebzes;
            dbSzamNegyedik = Eletero.negyedikEgysegEletero / 20;
            if (Eletero.negyedikEgysegEletero > 0) {

                egysegekSorrend.remove(egysegIras4);
                egysegekSorrend.remove(egysegL4TestKep);

                if (dbSzamNegyedik < 10) {
                    egysegErtek4.setText(String.valueOf(String.format("%.2f", dbSzamNegyedik)));
                } else {
                    egysegErtek4.setText(String.valueOf(String.format("%.1f", dbSzamNegyedik)));
                }

                if (vanKrit) {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki ( Krit ) " + sebzes + " sebzést szenvedett " +
                            "és " + Eletero.negyedikEgysegEletero + " életereje maradt.</p></center></html>");
                } else {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és " + Eletero.negyedikEgysegEletero + " életereje maradt.</p></center></html>");
                }


                egysegIras4.add(egysegErtek4);
                egysegL4TestKep.add(egysegL4TestKepe);
                EgysegLathatosag.lathatosagSorrend(egysegIras4, egysegL4TestKep, oszlop, sor);
                ablakCsata.add(egysegekSorrend);
            } else {
                egysegekSorrend.remove(egysegIras4);
                egysegekSorrend.remove(egysegL4TestKep);

                orgy = 0;
                egysegPozTorlese("orgy", sor, oszlop);

                if (vanKrit) {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki ( Krit ) " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                } else {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                }

            }
        } else if ("harcp".equals(egyseg)) {
            Eletero.otodikEgysegEletero -= sebzes;
            dbSzamOtodik = Eletero.otodikEgysegEletero / 54;
            if (Eletero.otodikEgysegEletero > 0) {

                egysegekSorrend.remove(egysegIras5);
                egysegekSorrend.remove(egysegL5TestKep);

                if (dbSzamOtodik < 10) {
                    egysegErtek5.setText(String.valueOf(String.format("%.2f", dbSzamOtodik)));
                } else {
                    egysegErtek5.setText(String.valueOf(String.format("%.1f", dbSzamOtodik)));
                }

                if (vanKrit) {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki ( Krit ) " + sebzes + " sebzést szenvedett " +
                            "és " + Eletero.otodikEgysegEletero + " életereje maradt.</p></center></html>");
                } else {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és " + Eletero.otodikEgysegEletero + " életereje maradt.</p></center></html>");
                }


                egysegIras5.add(egysegErtek5);
                egysegL5TestKep.add(egysegL5TestKepe);
                EgysegLathatosag.lathatosagSorrend(egysegIras5, egysegL5TestKep, oszlop, sor);
                ablakCsata.add(egysegekSorrend);
            } else {
                egysegekSorrend.remove(egysegIras5);
                egysegekSorrend.remove(egysegL5TestKep);

                harcp = 0;
                egysegPozTorlese("harcp", sor, oszlop);

                if (vanKrit) {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki ( Krit ) " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                } else {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                }

            }
        } else if ("rapt".equals(egyseg) || vanVisszatamadas) {
            Eletero.otodikEgysegEletero -= sebzes;
            dbSzamOtodik = Eletero.otodikEgysegEletero / 35;
            if (Eletero.otodikEgysegEletero > 0) {

                egysegekSorrend.remove(egysegIras5);
                egysegekSorrend.remove(egysegL5TestKep);

                if (dbSzamOtodik < 10) {
                    egysegErtek5.setText(String.valueOf(String.format("%.2f", dbSzamOtodik)));
                } else {
                    egysegErtek5.setText(String.valueOf(String.format("%.1f", dbSzamOtodik)));
                }

                if (vanKrit) {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki ( Krit ) " + sebzes + " sebzést szenvedett " +
                            "és " + Eletero.otodikEgysegEletero + " életereje maradt.</p></center></html>");
                } else {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és " + Eletero.otodikEgysegEletero + " életereje maradt.</p></center></html>");
                }


                egysegIras5.add(egysegErtek5);
                egysegL5TestKep.add(egysegL5TestKepe);
                EgysegLathatosag.lathatosagSorrend(egysegIras5, egysegL5TestKep, oszlop, sor);
                ablakCsata.add(egysegekSorrend);
            } else {
                egysegekSorrend.remove(egysegIras5);
                egysegekSorrend.remove(egysegL5TestKep);

                rapt = 0;
                egysegPozTorlese("rapt", sor, oszlop);

                if (vanKrit) {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki ( Krit ) " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                } else {
                    informacioErtek.setText("<html><center>Visszatámadták " + egyseg + " egységet,<p> aki " + sebzes + " sebzést szenvedett " +
                            "és meghalt.</p></center></html>");
                }
            }
        }

        switch (kitTamad) {
            case "ecsont", "efoldmuv" -> ellEgysegVisszatamadas1=true;
            case "efelder", "eijas" -> ellEgysegVisszatamadas2=true;
            case "emino" -> ellEgysegVisszatamadas3=true;
            case "eorgy", "efegyv" -> ellEgysegVisszatamadas4=true;
            case "eharcp" -> ellEgysegVisszatamadas5=true;
            case "csont", "foldmuv" -> egysegVisszatamadas1=true;
            case "felder", "ijas" -> egysegVisszatamadas2=true;
            case "mino" -> egysegVisszatamadas3=true;
            case "orgy", "fegyv" -> egysegVisszatamadas4=true;
            case "harcp" -> egysegVisszatamadas5=true;
            }
        if (kitTamad.equals("rapt") && vanVisszatamadas) {
            egysegVisszatamadas5 = true;
        }else if (kitTamad.equals("erapt") && vanVisszatamadas) {
            ellEgysegVisszatamadas5=true;
        }

        double ujErtek2 = moralSorrendTList.get(0);

        moralSorrendTList.remove(0);
        moralSorrendTList.add(ujErtek2);

        hanyadikKor(elsoHely);
        korokKiirasa();

        sorrendFrissites();
    }
}
