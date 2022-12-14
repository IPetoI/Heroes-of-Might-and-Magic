package Egysegek;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import static Jatek.Valasztas.lovage;

public class Eletero {

    public static double elsoEgysegEletero=0, masodikEgysegEletero=0, harmadikEgysegEletero=0, negyedikEgysegEletero=0,
            otodikEgysegEletero=0;
    public static double elsoEgysegMaxEletero=0, masodikEgysegMaxEletero=0, harmadikEgysegMaxEletero=0, negyedikEgysegMaxEletero=0,
            otodikEgysegMaxEletero=0;
    public static double elsoEllEgysegEletero=0,masodikEllEgysegEletero=0,harmadikEllEgysegEletero=0,negyedikEllEgysegEletero=0,
            otodikEllEgysegEletero=0;
    public static double elsoEllEgysegMaxEletero=0, masodikEllEgysegMaxEletero=0, harmadikEllEgysegMaxEletero=0, negyedikEllEgysegMaxEletero=0,
            otodikEllEgysegMaxEletero=0;
    public static double elsoEgysegMaradekElet=0, masodikEgysegMaradekElet=0, harmadikEgysegMaradekElet=0, negyedikEgysegMaradekElet=0, 
            otodikEgysegMaradekElet=0;
    public static double elsoEllEgysegMaradekElet=0, masodikEllEgysegMaradekElet=0, harmadikEllEgysegMaradekElet=0, negyedikEllEgysegMaradekElet=0, 
            otodikEllEgysegMaradekElet=0;

    public static String legkevesebbEletNevE="n";
    public static double legkevesebbEletErtekE=0;
    public static String legkevesebbEletNevH="n";
    public static double legkevesebbEletErtekH=0;

    public static ArrayList<String> listNevE = new ArrayList<>();
    public static ArrayList<String> listNevH = new ArrayList<>();
    public static Map<String, Double> mapEletE = new HashMap<>();
    public static Map<String, Double> mapEletH = new HashMap<>();

    public static void egysegEletereje(String egyseg, double db) {

        switch (egyseg) {
            case "ecsont" -> { elsoEllEgysegEletero = 2*db;
                elsoEllEgysegMaxEletero = elsoEllEgysegEletero; 
            }
            case "efoldmuv" -> { elsoEllEgysegEletero = 3*db;
                elsoEllEgysegMaxEletero = elsoEllEgysegEletero; 
            }
            case "efelder" -> { masodikEllEgysegEletero = 10*db;
                masodikEllEgysegMaxEletero = masodikEllEgysegEletero;
            }
            case "emino" -> { harmadikEllEgysegEletero = 80*db;
                harmadikEllEgysegMaxEletero = harmadikEllEgysegEletero;
            }
            case "eorgy" -> { negyedikEllEgysegEletero = 20*db;
                negyedikEllEgysegMaxEletero = negyedikEllEgysegEletero;
            }
            case "erapt" -> { otodikEllEgysegEletero = 35*db;
                otodikEllEgysegMaxEletero = otodikEllEgysegEletero;
            }
            case "eijas" -> { masodikEllEgysegEletero = 7*db;
                masodikEllEgysegMaxEletero = masodikEllEgysegEletero;
            }
            case "egrif" -> { harmadikEllEgysegEletero = 30*db;
                harmadikEllEgysegMaxEletero = harmadikEllEgysegEletero;
            }
            case "efegyv" -> { negyedikEllEgysegEletero = 33*db;
                negyedikEllEgysegMaxEletero = negyedikEllEgysegEletero;
            }
            case "eharcp" -> { otodikEllEgysegEletero = 54*db;
                otodikEllEgysegMaxEletero = otodikEllEgysegEletero;
            }
            case "csont" -> { elsoEgysegEletero = 2*db;
                elsoEgysegMaxEletero = elsoEgysegEletero; 
            }
            case "foldmuv" -> { elsoEgysegEletero = 3*db;
                elsoEgysegMaxEletero = elsoEgysegEletero; 
            }
            case "felder" -> { masodikEgysegEletero = 10*db;
                masodikEgysegMaxEletero = masodikEgysegEletero;
            }
            case "mino" -> { harmadikEgysegEletero = 80*db;
                harmadikEgysegMaxEletero = harmadikEgysegEletero;
            }
            case "orgy" -> { negyedikEgysegEletero = 20*db;
                negyedikEgysegMaxEletero = negyedikEgysegEletero;
            }
            case "rapt" -> { otodikEgysegEletero = 35*db;
                otodikEgysegMaxEletero = otodikEgysegEletero;
            }
            case "ijas" -> { masodikEgysegEletero = 7*db;
                masodikEgysegMaxEletero = masodikEgysegEletero;
            }
            case "grif" -> { harmadikEgysegEletero = 30*db;
                harmadikEgysegMaxEletero = harmadikEgysegEletero;
            }
            case "fegyv" -> { negyedikEgysegEletero = 33*db;
                negyedikEgysegMaxEletero = negyedikEgysegEletero;
            }
            case "harcp" -> { otodikEgysegEletero = 54*db;
                otodikEgysegMaxEletero = otodikEgysegEletero;
            }
        }
    }

    public static void EleteroNev() {

        if (lovage==0) {
            if (elsoEgysegEletero>0) {
                listNevH.add("foldmuv");
            }
            if (masodikEgysegEletero>0) {
                listNevH.add("ijas");
            }
            if (harmadikEgysegEletero>0) {
                listNevH.add("grif");
            }
            if (negyedikEgysegEletero>0) {
                listNevH.add("fegyv");
            }
            if (otodikEgysegEletero>0) {
                listNevH.add("harcp");
            }

            if (otodikEllEgysegEletero>0) {
                listNevE.add("erapt");
            }
            if (negyedikEllEgysegEletero>0) {
                listNevE.add("eorgy");
            }
            if (harmadikEllEgysegEletero>0) {
                listNevE.add("emino");
            }
            if (masodikEllEgysegEletero>0) {
                listNevE.add("efelder");
            }
            if (elsoEllEgysegEletero>0) {
                listNevE.add("ecsont");
            }
        }

        if (lovage==1) {
            if (elsoEgysegEletero>0) {
                listNevH.add("csont");
            }
            if (masodikEgysegEletero>0) {
                listNevH.add("felder");
            }
            if (harmadikEgysegEletero>0) {
                listNevH.add("mino");
            }
            if (negyedikEgysegEletero>0) {
                listNevH.add("orgy");
            }
            if (otodikEgysegEletero>0) {
                listNevH.add("rapt");
            }

            if (otodikEllEgysegEletero>0) {
                listNevE.add("eharcp");
            }
            if (negyedikEllEgysegEletero>0) {
                listNevE.add("efegyv");
            }
            if (harmadikEllEgysegEletero>0) {
                listNevE.add("egrif");
            }
            if (masodikEllEgysegEletero>0) {
                listNevE.add("eijas");
            }
            if (elsoEllEgysegEletero>0) {
                listNevE.add("efoldmuv");
            }
        }
        // System.out.println("1h "+elsoEgysegEletero+", 2h "+masodikEgysegEletero+", 3h "+harmadikEgysegEletero+", 4h "+
        // negyedikEgysegEletero+", 5h "+otodikEgysegEletero+", 1e "+elsoEllEgysegEletero+", 2e "+harmadikEllEgysegEletero+
        // ", 3e "+harmadikEllEgysegEletero+", 4e "+negyedikEllEgysegEletero+", 5e "+otodikEllEgysegEletero);
    }


    public static void eleteroSorrend() {

        if (lovage==0) {
            if (elsoEgysegEletero>0) {
                elsoEgysegMaradekElet=elsoEgysegMaxEletero-elsoEgysegEletero;
                mapEletH.put("foldmuv", elsoEgysegMaradekElet);
            }
            if (masodikEgysegEletero>0) {
                masodikEgysegMaradekElet=masodikEgysegMaxEletero-masodikEgysegEletero;
                mapEletH.put("ijas", masodikEgysegMaradekElet);
            }
            if (harmadikEgysegEletero>0) {
                harmadikEgysegMaradekElet=harmadikEgysegMaxEletero-harmadikEgysegEletero;
                mapEletH.put("grif", harmadikEgysegMaradekElet);
            }
            if (negyedikEgysegEletero>0) {
                negyedikEgysegMaradekElet=negyedikEgysegMaxEletero-negyedikEgysegEletero;
                mapEletH.put("fegyv", negyedikEgysegMaradekElet);
            }
            if (otodikEgysegEletero>0) {
                otodikEgysegMaradekElet=otodikEgysegMaxEletero-otodikEgysegEletero;
                mapEletH.put("harcp", otodikEgysegMaradekElet);
            }

            if (otodikEllEgysegEletero>0) {
                otodikEllEgysegMaradekElet=otodikEllEgysegMaxEletero-otodikEllEgysegEletero;
                mapEletE.put("erapt", otodikEllEgysegMaradekElet);
            }
            if (negyedikEllEgysegEletero>0) {
                negyedikEllEgysegMaradekElet=negyedikEllEgysegMaxEletero-negyedikEllEgysegEletero;
                mapEletE.put("eorgy", negyedikEllEgysegMaradekElet);
            }
            if (harmadikEllEgysegEletero>0) {
                harmadikEllEgysegMaradekElet=harmadikEllEgysegMaxEletero-harmadikEllEgysegEletero;
                mapEletE.put("emino", harmadikEllEgysegMaradekElet);
            }
            if (masodikEllEgysegEletero>0) {
                masodikEllEgysegMaradekElet=masodikEllEgysegMaxEletero-masodikEllEgysegEletero;
                mapEletE.put("efelder", masodikEllEgysegMaradekElet);
            }
            if (elsoEllEgysegEletero>0) {
                elsoEllEgysegMaradekElet=elsoEllEgysegMaxEletero-elsoEllEgysegEletero;
                mapEletE.put("ecsont", elsoEllEgysegMaradekElet);
            }
        }

        if (lovage==1) {
            if (elsoEgysegEletero>0) {
                elsoEgysegMaradekElet=elsoEgysegMaxEletero-elsoEgysegEletero;
                mapEletH.put("csont", elsoEgysegMaradekElet);
            }
            if (masodikEgysegEletero>0) {
                masodikEgysegMaradekElet=masodikEgysegMaxEletero-masodikEgysegEletero;
                mapEletH.put("felder", masodikEgysegMaradekElet);
            }
            if (harmadikEgysegEletero>0) {
                harmadikEgysegMaradekElet=harmadikEgysegMaxEletero-harmadikEgysegEletero;
                mapEletH.put("mino", harmadikEgysegMaradekElet);
            }
            if (negyedikEgysegEletero>0) {
                negyedikEgysegMaradekElet=negyedikEgysegMaxEletero-negyedikEgysegEletero;
                mapEletH.put("orgy", negyedikEgysegMaradekElet);
            }
            if (otodikEgysegEletero>0) {
                otodikEgysegMaradekElet=otodikEgysegMaxEletero-otodikEgysegEletero;
                mapEletH.put("rapt", otodikEgysegMaradekElet);
            }

            if (otodikEllEgysegEletero>0) {
                otodikEllEgysegMaradekElet=otodikEllEgysegMaxEletero-otodikEllEgysegEletero;
                mapEletE.put("eharcp", otodikEllEgysegMaradekElet);
            }
            if (negyedikEllEgysegEletero>0) {
                negyedikEllEgysegMaradekElet=negyedikEllEgysegMaxEletero-negyedikEllEgysegEletero;
                mapEletE.put("efegyv", negyedikEllEgysegMaradekElet);
            }
            if (harmadikEllEgysegEletero>0) {
                harmadikEllEgysegMaradekElet=harmadikEllEgysegMaxEletero-harmadikEllEgysegEletero;
                mapEletE.put("egrif", harmadikEllEgysegMaradekElet);
            }
            if (masodikEllEgysegEletero>0) {
                masodikEllEgysegMaradekElet=masodikEllEgysegMaxEletero-masodikEllEgysegEletero;
                mapEletE.put("eijas",masodikEllEgysegMaradekElet);
            }
            if (elsoEllEgysegEletero>0) {
                elsoEllEgysegMaradekElet=elsoEllEgysegMaxEletero-elsoEllEgysegEletero;
                mapEletE.put("efoldmuv", elsoEllEgysegMaradekElet);
            }
        }

        legkevesebbEletErtekE = Collections.max(mapEletE.values());

        for (String key : getKeys(mapEletE, legkevesebbEletErtekE)) {
            legkevesebbEletNevE = key;
        }

        legkevesebbEletErtekH = Collections.max(mapEletH.values());

        for (String key : getKeys(mapEletH, legkevesebbEletErtekH)) {
            legkevesebbEletNevH = key;
        }

        // System.out.println("1h "+elsoEgysegEletero+", 2h "+masodikEgysegEletero+", 3h "+harmadikEgysegEletero+", 4h "+
        //  negyedikEgysegEletero+", 5h "+otodikEgysegEletero+", 1e "+elsoEllEgysegEletero+", 2e "+masodikEllEgysegEletero+
        //  ", 3e "+harmadikEllEgysegEletero+", 4e "+negyedikEllEgysegEletero+", 5e "+otodikEllEgysegEletero);

        // System.out.println(mapEletE);
        // System.out.println(mapEletH);

        // System.out.println(legkevesebbEletErtek +"   "+ legkevesebbEletNev);
    }

    private static Set<String> getKeys(Map<String, Double> map, double ertek) {

        Set<String> nev = new HashSet<>();
        if (map.containsValue(ertek)) {
            for (Map.Entry<String, Double> entry : map.entrySet()) {
                if (Objects.equals(entry.getValue(), ertek)) {
                    nev.add(entry.getKey());
                }
            }
        }
        return nev;
    }
}
