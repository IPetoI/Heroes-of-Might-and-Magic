package Ellenfel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import static Egysegek.Sebzes.*;
import static Egysegek.Sebesseg.*;
import static Egysegek.EgysegekNeEgymasra.*;
import static Egysegek.Eletero.*;
import static Jatek.JatekAblak.*;
import static Jatek.Palya_Lepes.*;
import static Jatek.Sorrend.*;
import static Ellenfel.EllenfelTulajdonsaga.*;
import static Jatek.Valasztas.lovage;
import static Varazslatok.IsteniEro.*;
import static Varazslatok.Lassitas.*;
import static Varazslatok.Villamcsapas.*;
import static Varazslatok.Tuzlabda.*;

public class EllenfelMuveletei {

    private static EllenfelMuveletei instance = null;

    public static EllenfelMuveletei getInstance() {
        if (instance == null)
            instance = new EllenfelMuveletei();

        return instance;
    }

    public static int egymasUtanEgysegekSzama=0;

    public static boolean ellenfelEgysegKovetkezik=false;
    public static boolean ellenfelHosKovetkezik=false;
    public static boolean hosCsapatKovetkezik =false;

    public static Random random = new Random();
        

    public static void ellenfelAlapok() {

        System.out.println(elsoHely +"  " + lovage);

        if(elsoHely.charAt(0)=='e' && !elsoHely.equals("morLaszlo") && !elsoHely.equals("morLena")) {
            System.out.println("ellenfel vagyok ------");
            ellenfelEgysegKovetkezik=true;
            ellenfelHosKovetkezik=false;
            hosCsapatKovetkezik =false;
            varakozasEllenfelekKozott();
            egymasUtanEgysegekSzama++;
        }
        if(elsoHely.charAt(0)!='e' && !elsoHely.equals("morLaszlo") && !elsoHely.equals("morLena") ) {
            System.out.println("csapatban vagyok ------");
            ellenfelEgysegKovetkezik=false;
            ellenfelHosKovetkezik=false;
            hosCsapatKovetkezik =true;
            varakozasEllenfelekKozott();
            egymasUtanEgysegekSzama++;
        }
        if (elsoHely.equals("morLena") && lovage == 0) {
            System.out.println("Léna vagyok az ellenfélhős ------");
            ellenfelHosKovetkezik=true;
            ellenfelEgysegKovetkezik=false;
            hosCsapatKovetkezik =false;
            varakozasEllenfelekKozott();
            egymasUtanEgysegekSzama++;
        }
        if (elsoHely.equals("morLena") && lovage == 1) {
            System.out.println("Léna vagyok a hős ------");
            ellenfelHosKovetkezik=false;
            ellenfelEgysegKovetkezik=false;
            hosCsapatKovetkezik =true;
            egymasUtanEgysegekSzama++;
        }
        if (elsoHely.equals("morLaszlo") && lovage == 0) {
            System.out.println("csapatban vagyok, László a hős ------");
            ellenfelEgysegKovetkezik=false;
            ellenfelHosKovetkezik=false;
            hosCsapatKovetkezik =true;
            egymasUtanEgysegekSzama=0;
        }
        if (elsoHely.equals("morLaszlo") && lovage == 1) {
            System.out.println("ellenfél vagyok, László az ellenfélhős ------");
            ellenfelEgysegKovetkezik=false;
            ellenfelHosKovetkezik=true;
            hosCsapatKovetkezik =false;
            varakozasEllenfelekKozott();
            egymasUtanEgysegekSzama=0;
        }

        System.out.println("ellenfel hos jon: "+ellenfelHosKovetkezik+"  ellenfel egyseg jon "+ellenfelEgysegKovetkezik + "va "+ hosCsapatKovetkezik);
    }

    public static void ellenfelHosKovetkezik() {

        int ran = random.nextInt(100 + 1);
        //ran=20;
        int ra = random.nextInt(100 + 1);
        //ra=65;

        System.out.println(foldmuvEgymasra+"   "+ ijasEgymasra);

        listNevE.clear();
        listNevH.clear();
        EleteroNev();

        System.out.println(moralSorrendTList);
        System.out.println(listNevE);
        System.out.println(listNevH);
        int randomEgysegH = random.nextInt((listNevH.size()-1) + 1);
        int randomEgysegE = random.nextInt((listNevE.size()-1) + 1);

        System.out.println("külső random: "+ran +" , belső random: " + ra+"  listanevH: "+ listNevH.size()
        +"  listanevE: "+ listNevE.size()+" randomE "+ randomEgysegE+" randomH "+ randomEgysegH + "randomHnev: "+ listNevH.get(randomEgysegH) +"  lovage: "+lovage);
        System.out.println("isteni "+Ellenfel.EllenfelVarazslat.ellenfelIstenieroV +" tuzlabda "+Ellenfel.EllenfelVarazslat.ellenfelTuzlabdaV
         +" fel "+Ellenfel.EllenfelVarazslat.ellenfelFeltamasztasV +" lass "+Ellenfel.EllenfelVarazslat.ellenfelLassitasV+ " villam "+Ellenfel.EllenfelVarazslat.ellenfelVillamcsapasV);

        // if ((ellenfelManna < 12 && ellenfelManna > 2 && !Ellenfel.EllenfelVarazslat.ellenfelLassitasV && !Ellenfel.EllenfelVarazslat.ellenfelVillamcsapasV && 
        //     !Ellenfel.EllenfelVarazslat.ellenfelFeltamasztasV && !Ellenfel.EllenfelVarazslat.ellenfelTuzlabdaV) ||
        //     (ellenfelManna < 9 && ellenfelManna > 2 && !Ellenfel.EllenfelVarazslat.ellenfelLassitasV && !Ellenfel.EllenfelVarazslat.ellenfelVillamcsapasV && !Ellenfel.EllenfelVarazslat.ellenfelFeltamasztasV) ||
        //     (ellenfelManna < 6 && ellenfelManna > 2 && !Ellenfel.EllenfelVarazslat.ellenfelLassitasV && !Ellenfel.EllenfelVarazslat.ellenfelVillamcsapasV) ||
        //     (ellenfelManna < 5 && ellenfelManna > 2 && !Ellenfel.EllenfelVarazslat.ellenfelLassitasV) || (!Ellenfel.EllenfelVarazslat.ellenfelLassitasV && !Ellenfel.EllenfelVarazslat.ellenfelIstenieroV
        //     && !Ellenfel.EllenfelVarazslat.ellenfelTuzlabdaV && !Ellenfel.EllenfelVarazslat.ellenfelFeltamasztasV && !Ellenfel.EllenfelVarazslat.ellenfelVillamcsapasV)) {
        //         System.out.println("Nincs eleg manna vagy nincs varazslat");
        //         ran = 45;
        // }
        if (ellenfelManna >= 3 && ran <= 33) {

            if (ra > 80) {
                if (ellenfelManna < 12 || !Ellenfel.EllenfelVarazslat.ellenfelIstenieroV) {
                    System.out.println("nincs istenie vagy keves a manna");
                    ra = 65;
                }else {
                    istenieroAldasaEllenfel(listNevE.get(randomEgysegE));
                    System.out.println("Ellenfel Hos az isteni erot hasznalta.");
                }
            }
            if (ra > 60 && ra <= 80) {
                if (ellenfelManna < 9 || !Ellenfel.EllenfelVarazslat.ellenfelTuzlabdaV) {
                    System.out.println("nincs tuzvarazslat vagy keves a manna");
                    ra = 45;
                } else {

                    String tamadhatoPoz = "k";
                    if (listNevH.get(randomEgysegH) == "foldmuv") {
                        tamadhatoPoz = pozTamadhatoFoldmuv;
                    }else  if (listNevH.get(randomEgysegH) == "ijas") {
                        tamadhatoPoz = pozTamadhatoIjas;
                    }else  if (listNevH.get(randomEgysegH) == "grif") {
                        tamadhatoPoz = pozTamadhatoGrif;
                    }else  if (listNevH.get(randomEgysegH) == "harcp") {
                        tamadhatoPoz = pozTamadhatoHarcp;
                    }else  if (listNevH.get(randomEgysegH) == "fegyv") {
                        tamadhatoPoz = pozTamadhatoFegyv;
                    }else  if (listNevH.get(randomEgysegH) == "csont") {
                        tamadhatoPoz = pozTamadhatoCsont;
                    }else  if (listNevH.get(randomEgysegH) == "felder") {
                        tamadhatoPoz = pozTamadhatoFelder;
                    }else  if (listNevH.get(randomEgysegH) == "mino") {
                        tamadhatoPoz = pozTamadhatoMino;
                    }else  if (listNevH.get(randomEgysegH) == "rapt") {
                        tamadhatoPoz = pozTamadhatoRapt;
                    }else  if (listNevH.get(randomEgysegH) == "orgy") {
                        tamadhatoPoz = pozTamadhatoOrgy;
                    }

                    System.out.println("hello w " + tamadhatoPoz + " foldm "+ pozTamadhatoFoldmuv + " ijas "+ pozTamadhatoIjas + " grif "+ pozTamadhatoGrif + " fegyv "
                    + pozTamadhatoFegyv + " harcp "+ pozTamadhatoHarcp );

                    String[] reszei = tamadhatoPoz.split("-");

                    int tamadhatoSor = Integer.parseInt(reszei[1]);
                    int tamadhatoOszlop = Integer.parseInt(reszei[0]);

                    tuzlabdaElsutese(tamadhatoSor,tamadhatoOszlop);
                }
            }
            if (ra > 40 && ra <= 60) {
                if (ellenfelManna < 6 || !Ellenfel.EllenfelVarazslat.ellenfelFeltamasztasV) {
                    System.out.println("nincs feltamasztas vagy keves a manna");
                    ra = 25;
                }else {
                    eleteroSorrend();

                    System.out.println(legkevesebbEletNevE+"  "+ legkevesebbEletErtekE);

                    if (legkevesebbEletErtekE != 0 ) {
                        Varazslatok.Feltamasztas.feltamasztalakEllenfel(legkevesebbEletNevE);
                        System.out.println("Ellenfel Hos a feltamasztas-t hasznalta.");
                    }
                }
            }
            if (ra > 20 && ra <= 40) {
                if (ellenfelManna < 5 || !Ellenfel.EllenfelVarazslat.ellenfelVillamcsapasV) {
                    System.out.println("nincs villamcsapas vagy keves a manna");
                    ra = 15;
                }else {

                    String tamadhatoPoz = "k";
                    if (listNevH.get(randomEgysegH) == "foldmuv") {
                        tamadhatoPoz = pozTamadhatoFoldmuv;
                    }else  if (listNevH.get(randomEgysegH) == "ijas") {
                        tamadhatoPoz = pozTamadhatoIjas;
                    }else  if (listNevH.get(randomEgysegH) == "grif") {
                        tamadhatoPoz = pozTamadhatoGrif;
                    }else  if (listNevH.get(randomEgysegH) == "harcp") {
                        tamadhatoPoz = pozTamadhatoHarcp;
                    }else  if (listNevH.get(randomEgysegH) == "fegyv") {
                        tamadhatoPoz = pozTamadhatoFegyv;
                    }else  if (listNevH.get(randomEgysegH) == "csont") {
                        tamadhatoPoz = pozTamadhatoCsont;
                    }else  if (listNevH.get(randomEgysegH) == "felder") {
                        tamadhatoPoz = pozTamadhatoFelder;
                    }else  if (listNevH.get(randomEgysegH) == "mino") {
                        tamadhatoPoz = pozTamadhatoMino;
                    }else  if (listNevH.get(randomEgysegH) == "rapt") {
                        tamadhatoPoz = pozTamadhatoRapt;
                    }else  if (listNevH.get(randomEgysegH) == "orgy") {
                        tamadhatoPoz = pozTamadhatoOrgy;
                    }

                    System.out.println("hello w " + tamadhatoPoz + " foldm "+ pozTamadhatoFoldmuv + " ijas "+ pozTamadhatoIjas + " grif "+ pozTamadhatoGrif + " fegyv "
                    + pozTamadhatoFegyv + " harcp "+ pozTamadhatoHarcp );

                    String[] reszei = tamadhatoPoz.split("-");

                    int tamadhatoSor = Integer.parseInt(reszei[1]);
                    int tamadhatoOszlop = Integer.parseInt(reszei[0]);

                    villamcsapasElsuteseEllenfel(listNevH.get(randomEgysegH),tamadhatoSor,tamadhatoOszlop);
                }
                
            }
            if (ra <= 20) {
                
                double legnagyobbSebesseguE = 0;
                String legnagyobbSebesseguENeve = "k";

                if (Egysegek.Sebesseg.elsoEgysegSebesseg > legnagyobbSebesseguE) {
                    legnagyobbSebesseguE = Egysegek.Sebesseg.elsoEgysegSebesseg;
                    if (lovage == 0) {
                        legnagyobbSebesseguENeve = "foldmuv";
                    } else {
                        legnagyobbSebesseguENeve = "csont";
                    }
                }else if (Egysegek.Sebesseg.masodikEgysegSebesseg > legnagyobbSebesseguE) {
                    legnagyobbSebesseguE = Egysegek.Sebesseg.masodikEgysegSebesseg;
                    if (lovage == 0) {
                        legnagyobbSebesseguENeve = "ijas";
                    } else {
                        legnagyobbSebesseguENeve = "felder";
                    }
                }else if (Egysegek.Sebesseg.harmadikEgysegSebesseg > legnagyobbSebesseguE) {
                    legnagyobbSebesseguE = Egysegek.Sebesseg.harmadikEgysegSebesseg;
                    if (lovage == 0) {
                        legnagyobbSebesseguENeve = "grif";
                    } else {
                        legnagyobbSebesseguENeve = "mino";
                    }
                }else if (Egysegek.Sebesseg.negyedikEgysegSebesseg > legnagyobbSebesseguE) {
                    legnagyobbSebesseguE = Egysegek.Sebesseg.negyedikEgysegSebesseg;
                    if (lovage == 0) {
                        legnagyobbSebesseguENeve = "fegyv";
                    } else {
                        legnagyobbSebesseguENeve = "orgy";
                    }
                }else if (Egysegek.Sebesseg.otodikEgysegSebesseg > legnagyobbSebesseguE) {
                    legnagyobbSebesseguE = Egysegek.Sebesseg.otodikEgysegSebesseg;
                    if (lovage == 0) {
                        legnagyobbSebesseguENeve = "harcp";
                    } else {
                        legnagyobbSebesseguENeve = "rapt";
                    }
                }
                
                if (legnagyobbSebesseguE > 2 && Ellenfel.EllenfelVarazslat.ellenfelLassitasV) {
                    lelassitalakEllenfel(legnagyobbSebesseguENeve);
                    System.out.println("Ellenfel Hos a lelassitas-t hasznalta.");
                } else {
                   ran = 40;
                }
            }
        }
        if (ran>=33 || ellenfelManna <3) {
            // támadás
            String tamadhatoPoz = "k";
            if (listNevH.get(randomEgysegH) == "foldmuv") {
                tamadhatoPoz = pozTamadhatoFoldmuv;
            }else  if (listNevH.get(randomEgysegH) == "ijas") {
                tamadhatoPoz = pozTamadhatoIjas;
            }else  if (listNevH.get(randomEgysegH) == "grif") {
                tamadhatoPoz = pozTamadhatoGrif;
            }else  if (listNevH.get(randomEgysegH) == "harcp") {
                tamadhatoPoz = pozTamadhatoHarcp;
            }else  if (listNevH.get(randomEgysegH) == "fegyv") {
                tamadhatoPoz = pozTamadhatoFegyv;
            }else  if (listNevH.get(randomEgysegH) == "csont") {
                tamadhatoPoz = pozTamadhatoCsont;
            }else  if (listNevH.get(randomEgysegH) == "felder") {
                tamadhatoPoz = pozTamadhatoFelder;
            }else  if (listNevH.get(randomEgysegH) == "mino") {
                tamadhatoPoz = pozTamadhatoMino;
            }else  if (listNevH.get(randomEgysegH) == "rapt") {
                tamadhatoPoz = pozTamadhatoRapt;
            }else  if (listNevH.get(randomEgysegH) == "orgy") {
                tamadhatoPoz = pozTamadhatoOrgy;
            }

            //System.out.println("hello w " + tamadhatoPoz + " foldm "+ pozTamadhatoFoldmuv + " ijas "+ pozTamadhatoIjas + " grif "+ pozTamadhatoGrif + " fegyv "
            //+ pozTamadhatoFegyv + " harcp "+ pozTamadhatoHarcp );

            String[] reszei = tamadhatoPoz.split("-");

            int tamadhatoSor = Integer.parseInt(reszei[1]);
            int tamadhatoOszlop = Integer.parseInt(reszei[0]);

            System.out.println(listNevH.get(randomEgysegH)+"  Poz: "+tamadhatoPoz+"  sor: "+tamadhatoSor+"  oszlop: "+tamadhatoOszlop);

            EllenfelTamad.kiKicsodaEll();
            EllenfelTamad.megtamadhato(tamadhatoSor,tamadhatoOszlop);
            EllenfelTamad.ellenfelHosVolt=true;
        }
        gyozelemVereseg();

        ellenfelAlapok();
    }

    public static void ellenfelEgysegKovetkezik() {

        ellenfelek(elsoHely);

        int megnezendoSor;
        int megnezendoOszlop;
        int rasegites = 0;
        int kivagyO = -2;
        int kivagyS = -2;

        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                megnezendoSor = regiPozSor + i;
                megnezendoOszlop = regiPozOszlop + j;
                if ((megnezendoSor == ellenemVagy1S && megnezendoOszlop == ellenemVagy1O) ||
                        (megnezendoSor == ellenemVagy2S && megnezendoOszlop == ellenemVagy2O)
                        || (megnezendoSor == ellenemVagy3S && megnezendoOszlop == ellenemVagy3O) ||
                        (megnezendoSor == ellenemVagy4S && megnezendoOszlop == ellenemVagy4O)
                        || (megnezendoSor == ellenemVagy5S && megnezendoOszlop == ellenemVagy5O)) {
                    rasegites++;
                    kivagyS = megnezendoSor;
                    kivagyO = megnezendoOszlop;
                }
            }
        }

        tudETamadni(kivagyS, kivagyO);
            if (tavolsagi) {

                if (rasegites == 0) {
                    System.out.println("Nincs ellenfel a kozelben, igy lovok " + kivagyS + " " + kivagyO);

                    System.out.println("egysegsebzes---------------");
                    egysegSebzese(elsoHely);
                    System.out.println("ellenfelek---------------");
                    ellenfelek(elsoHely);
                    System.out.println(ellenemVagy1O + "  " + ellenemVagy1S + " " + ellenemVagy2O + "  " + ellenemVagy2S + " " +
                            "" + ellenemVagy3O + "  " + ellenemVagy3S + " " + ellenemVagy4O + "  " + ellenemVagy4S + " " +
                            ellenemVagy5O + "  " + ellenemVagy5S);
                    if (ellenemVagy1O!=-2 && ellenemVagy1S!=-2) {
                        megtamadlak(ellenemVagy1S, ellenemVagy1O);
                    }else if (ellenemVagy2O!=-2 && ellenemVagy2S!=-2) {
                        megtamadlak(ellenemVagy2S, ellenemVagy2O);
                    }else if (ellenemVagy3O!=-2 && ellenemVagy3S!=-2) {
                        megtamadlak(ellenemVagy3S, ellenemVagy3O);
                    }else if (ellenemVagy4O!=-2 && ellenemVagy4S!=-2) {
                        megtamadlak(ellenemVagy4S, ellenemVagy4O);
                    }else if (ellenemVagy5O!=-2 && ellenemVagy5S!=-2) {
                        megtamadlak(ellenemVagy5S, ellenemVagy5O);
                    }

                    gyozelemVereseg();
                    System.out.println(vege);
                    if (!vege) {
                        ellenfelAlapok();
                    }


                }else {
                    System.out.println("Ellenfel van a kozelben " + kivagyS + " " + kivagyO);

                    // itt el kellene menekülnie
                    // kellene egy lista amiben benne van a lehetseges poz es oda lepne random, de ne masik hos melle
                    // ezt lehetne hasznalni a tamadoknal is, csak ott meg pont melle

                    sorrendFrissites();
                    mekkoraTavolsagodGET(elsoHely);
                    mekkoraTeruleteVan(elsoHely);

                    // System.out.println(lephetoSor +"  "+lephetoSor.size());
                    // System.out.println(lephetoOszlop+"  "+lephetoOszlop.size());

                    int lehetsegesLepes = random.nextInt((lephetoOszlop.size()-1) + 1);
                    int sorL = 0, oszlopL =0;

                    // ide lehetne egy for amiben a random szám generátor benne van és mielőtt tovább adjuk azt az értéket megnézzük van e körülötte
                    // masik csapat beli, ha van akkor for fut tovább , ha pedig nincs akkor kilép

                    oszlopL = lephetoOszlop.get(lehetsegesLepes);
                    sorL = lephetoSor.get(lehetsegesLepes);
                    
                    hanyadikKor(elsoHely);
                    korokKiirasa();
                    lepesMegtetele(sorL,oszlopL);
                    int osszerakvaL = Integer.parseInt(sorL + "" + oszlopL);
                    if (pozMegvaltozasa) {
                            pozMegvaltozasa=false;
                            pozMegvaltoztatasa(osszerakvaL);
                    }

                    double ujErtek2 = moralSorrendTList.get(0);

                    moralSorrendTList.remove(0);
                    moralSorrendTList.add(ujErtek2);

                    hanyadikKor(elsoHely);
                    korokKiirasa();

                    sorrendFrissites();

                    ellenfelAlapok();
                }

            }else {
                if (rasegites > 0) {
                    System.out.println("Van ellenfel a kozelben , így tamadok " + kivagyS + " " + kivagyO);

                    // itt megtámadja, de ha kevés a hp akkor elmenekülhetne

                    System.out.println("egysegsebzes---------------");
                    egysegSebzese(elsoHely);
                    System.out.println("ellenfelek---------------");
                    ellenfelek(elsoHely);
                    System.out.println("megtamadlak---------------");
                    megtamadlak(kivagyS, kivagyO);
                    gyozelemVereseg();
                    if (!vege) {
                        ellenfelAlapok();
                    }


                } else {
                    System.out.println("Nincs ellenfel a kozelben " + kivagyS + " " + kivagyO);

                    // itt kellene megközelítenije egy ellenséget

                    sorrendFrissites();
                    mekkoraTavolsagodGET(elsoHely);
                    mekkoraTeruleteVan(elsoHely);

                    // System.out.println(lephetoSor +"  "+lephetoSor.size());
                    // System.out.println(lephetoOszlop+"  "+lephetoOszlop.size());

                    int lehetsegesLepes = random.nextInt((lephetoOszlop.size()-1) + 1);
                    int sorL = 0, oszlopL =0;

                    // ide lehetne egy for amiben a random szám generátor benne van és mielőtt tovább adjuk azt az értéket megnézzük van e körülötte
                    // masik csapat beli, ha van akkor for fut tovább , ha pedig nincs akkor kilép

                    oszlopL = lephetoOszlop.get(lehetsegesLepes);
                    sorL = lephetoSor.get(lehetsegesLepes);
                    
                    hanyadikKor(elsoHely);
                    korokKiirasa();
                    lepesMegtetele(sorL,oszlopL);
                    int osszerakvaL = Integer.parseInt(sorL + "" + oszlopL);
                    if (pozMegvaltozasa) {
                            pozMegvaltozasa=false;
                            pozMegvaltoztatasa(osszerakvaL);
                    }

                    double ujErtek2 = moralSorrendTList.get(0);

                    moralSorrendTList.remove(0);
                    moralSorrendTList.add(ujErtek2);

                    hanyadikKor(elsoHely);
                    korokKiirasa();

                    sorrendFrissites();

                    ellenfelAlapok();
                }
            }
    }

    public static void varakozasEllenfelekKozott() {
        informacioErtek.setText("Ellenfél következik!");

        int varakozas = 1000;
        Timer ido = new Timer( varakozas, new ActionListener(){
            @Override
            public void actionPerformed( ActionEvent e ){
               if (ellenfelEgysegKovetkezik) {
                   ellenfelEgysegKovetkezik();
               }else if (ellenfelHosKovetkezik) {
                   ellenfelHosKovetkezik();
               }
            }
        } );
        ido.setRepeats( false );
        ido.start();
    }
}