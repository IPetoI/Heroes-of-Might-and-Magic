package Jatek;

import Egysegek.EgysegLathatosag;
import Egysegek.EgysegekNeEgymasra;
import Hos.HosTamad;

import javax.swing.*;
import java.awt.*;

import static Egysegek.EgysegLetetel.*;
import static Egysegek.Sebesseg.*;
import static Egysegek.Sebzes.megtamadlak;
import static Ellenfel.EllenfelEgysegPozicio.*;
import static Ellenfel.EllenfelEgysege.fontKicsi;
import static Ellenfel.EllenfelEgysege.*;
import static Ellenfel.EllenfelMuveletei.ellenfelAlapok;
import static Hos.HosTamad.megtamadhato;
import static Jatek.JatekAblak.*;
import static Jatek.Sorrend.*;
import static Jatek.XYKordinatakBemenet.*;
import static Varazslatok.IsteniEro.istenieroAldasa;
import static Varazslatok.Lassitas.lelassitalak;
import static Varazslatok.Tuzlabda.tuzlabdaElsutese;
import static Varazslatok.Villamcsapas.villamcsapasElsutese;
import static Varazslatok.Feltamasztas.feltamasztalak;

public class Palya_Lepes {

    private static Palya_Lepes instance = null;

    public static JButton palyaS1O1,palyaS2O1,palyaS3O1,palyaS4O1,palyaS5O1,palyaS6O1,palyaS7O1,palyaS8O1,palyaS9O1,palyaS10O1;
    public static JButton palyaS1O2,palyaS2O2,palyaS3O2,palyaS4O2,palyaS5O2,palyaS6O2,palyaS7O2,palyaS8O2,palyaS9O2,palyaS10O2;
    public static JButton palyaS1O3,palyaS2O3,palyaS3O3,palyaS4O3,palyaS5O3,palyaS6O3,palyaS7O3,palyaS8O3;
    public static JButton palyaS1O4,palyaS2O4,palyaS3O4,palyaS4O4,palyaS5O4,palyaS7O4,palyaS8O4;
    public static JButton palyaS1O5,palyaS2O5,palyaS3O5,palyaS4O5,palyaS5O5,palyaS6O5,palyaS7O5,palyaS8O5,palyaS9O5,palyaS10O5;
    public static JButton palyaS1O6,palyaS2O6,palyaS3O6,palyaS4O6,palyaS5O6,palyaS6O6,palyaS7O6,palyaS9O6,palyaS10O6;
    public static JButton palyaS1O7,palyaS2O7,palyaS3O7,palyaS4O7,palyaS5O7,palyaS6O7,palyaS7O7,palyaS9O7,palyaS10O7;
    public static JButton palyaS1O8,palyaS2O8,palyaS3O8,palyaS4O8,palyaS5O8,palyaS6O8,palyaS8O8,palyaS9O8,palyaS10O8;
    public static JButton palyaS1O9,palyaS2O9,palyaS3O9,palyaS4O9,palyaS5O9,palyaS6O9,palyaS8O9,palyaS9O9,palyaS10O9;
    public static JButton palyaS1O10,palyaS2O10,palyaS3O10,palyaS4O10,palyaS5O10,palyaS6O10,palyaS7O10,palyaS8O10,palyaS9O10,palyaS10O10;
    public static JButton palyaS1O11,palyaS2O11,palyaS3O11,palyaS4O11,palyaS5O11,palyaS6O11,palyaS7O11,palyaS8O11,palyaS9O11,palyaS10O11;
    public static JButton palyaS1O12,palyaS2O12,palyaS3O12,palyaS4O12,palyaS5O12,palyaS6O12,palyaS7O12,palyaS8O12,palyaS9O12,palyaS10O12;

    public static JButton palyaS6O4,palyaS7O8,palyaS7O9,palyaS8O6,palyaS8O7,palyaS9O3,palyaS9O4, palyaS10O3,palyaS10O4;

    public Palya_Lepes() {

        palyaS6O4 = new JButton();
        palyaS7O8 = new JButton();
        palyaS7O9 = new JButton();
        palyaS8O6 = new JButton();
        palyaS8O7 = new JButton();
        palyaS9O3 = new JButton();
        palyaS9O4 = new JButton();
        palyaS10O3 = new JButton();
        palyaS10O4 = new JButton();

        palyaS1O1 = new JButton();
        palyaS1O2 = new JButton();
        palyaS1O3 = new JButton();
        palyaS1O4 = new JButton();
        palyaS1O5 = new JButton();
        palyaS1O6 = new JButton();
        palyaS1O7 = new JButton();
        palyaS1O8 = new JButton();
        palyaS1O9 = new JButton();
        palyaS1O10 = new JButton();
        palyaS1O11 = new JButton();
        palyaS1O12 = new JButton();

        palyaS2O1 = new JButton();
        palyaS2O2 = new JButton();
        palyaS2O3 = new JButton();
        palyaS2O4 = new JButton();
        palyaS2O5 = new JButton();
        palyaS2O6 = new JButton();
        palyaS2O7 = new JButton();
        palyaS2O8 = new JButton();
        palyaS2O9 = new JButton();
        palyaS2O10 = new JButton();
        palyaS2O11 = new JButton();
        palyaS2O12 = new JButton();

        palyaS3O1 = new JButton();
        palyaS3O2 = new JButton();
        palyaS3O3 = new JButton();
        palyaS3O4 = new JButton();
        palyaS3O5 = new JButton();
        palyaS3O6 = new JButton();
        palyaS3O7 = new JButton();
        palyaS3O8 = new JButton();
        palyaS3O9 = new JButton();
        palyaS3O10 = new JButton();
        palyaS3O11 = new JButton();
        palyaS3O12 = new JButton();

        palyaS4O1 = new JButton();
        palyaS4O2 = new JButton();
        palyaS4O3 = new JButton();
        palyaS4O4 = new JButton();
        palyaS4O5 = new JButton();
        palyaS4O6 = new JButton();
        palyaS4O7 = new JButton();
        palyaS4O8 = new JButton();
        palyaS4O9 = new JButton();
        palyaS4O10 = new JButton();
        palyaS4O11 = new JButton();
        palyaS4O12 = new JButton();

        palyaS5O1 = new JButton();
        palyaS5O2 = new JButton();
        palyaS5O3 = new JButton();
        palyaS5O4 = new JButton();
        palyaS5O5 = new JButton();
        palyaS5O6 = new JButton();
        palyaS5O7 = new JButton();
        palyaS5O8 = new JButton();
        palyaS5O9 = new JButton();
        palyaS5O10 = new JButton();
        palyaS5O11 = new JButton();
        palyaS5O12 = new JButton();

        palyaS6O1 = new JButton();
        palyaS6O2 = new JButton();
        palyaS6O3 = new JButton();
        palyaS6O5 = new JButton();
        palyaS6O6 = new JButton();
        palyaS6O7 = new JButton();
        palyaS6O8 = new JButton();
        palyaS6O9 = new JButton();
        palyaS6O10 = new JButton();
        palyaS6O11 = new JButton();
        palyaS6O12 = new JButton();

        palyaS7O1 = new JButton();
        palyaS7O2 = new JButton();
        palyaS7O3 = new JButton();
        palyaS7O4 = new JButton();
        palyaS7O5 = new JButton();
        palyaS7O6 = new JButton();
        palyaS7O7 = new JButton();
        palyaS7O10 = new JButton();
        palyaS7O11 = new JButton();
        palyaS7O12 = new JButton();

        palyaS8O1 = new JButton();
        palyaS8O2 = new JButton();
        palyaS8O3 = new JButton();
        palyaS8O4 = new JButton();
        palyaS8O5 = new JButton();
        palyaS8O8 = new JButton();
        palyaS8O9 = new JButton();
        palyaS8O10 = new JButton();
        palyaS8O11 = new JButton();
        palyaS8O12 = new JButton();

        palyaS9O1 = new JButton();
        palyaS9O2 = new JButton();
        palyaS9O5 = new JButton();
        palyaS9O6 = new JButton();
        palyaS9O7 = new JButton();
        palyaS9O8 = new JButton();
        palyaS9O9 = new JButton();
        palyaS9O10 = new JButton();
        palyaS9O11 = new JButton();
        palyaS9O12 = new JButton();

        palyaS10O1 = new JButton();
        palyaS10O2 = new JButton();
        palyaS10O5 = new JButton();
        palyaS10O6 = new JButton();
        palyaS10O7 = new JButton();
        palyaS10O8 = new JButton();
        palyaS10O9 = new JButton();
        palyaS10O10 = new JButton();
        palyaS10O11 = new JButton();
        palyaS10O12 = new JButton();


        palyaS6O4.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(6,4);
            lepesGombBenyomva=false;
            }
        });
        palyaS7O8.addActionListener(e -> {
            if(lepesGombBenyomva) {
                lepesMegtetele(7,8);
                }
            lepesGombBenyomva=false;

        });
        palyaS7O9.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(7,9);
                }
            lepesGombBenyomva=false;
        });
        palyaS8O6.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(8,6);
                }
            lepesGombBenyomva=false;
        });
        palyaS8O7.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(8,7);
                }
            lepesGombBenyomva=false;
        });
        palyaS9O3.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(9,3);
                }
            lepesGombBenyomva=false;
        });
        palyaS9O4.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(9,4);
                }
            lepesGombBenyomva=false;
        });
        palyaS10O3.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(10,3);
                }
            lepesGombBenyomva=false;
        });
        palyaS10O4.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(10,4);
                }
            lepesGombBenyomva=false;
        });


        //----1sor
        palyaS1O1.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(1,1);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(11);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 1,1);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor1oszlop1Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato(1,1);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor1oszlop1Nev.charAt(0)=='e' ) {
                lelassitalak(sor1oszlop1Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor1oszlop1Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor1oszlop1Nev,1,1);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese(1,1);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor1oszlop1Nev.charAt(0)!='e'   &&  sor1oszlop1Nev.charAt(0)!='n' ) {
                istenieroAldasa(sor1oszlop1Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor1oszlop1Nev.charAt(0)!='e'   &&  sor1oszlop1Nev.charAt(0)!='n' ) {
                feltamasztalak(sor1oszlop1Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
                sorrendFrissites();
                 if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS1O2.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(1,2);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(12);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 1,2);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor1oszlop2Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 1,2);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor1oszlop2Nev.charAt(0)=='e' ) {
                lelassitalak( sor1oszlop2Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor1oszlop2Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor1oszlop2Nev, 1,2);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 1,2);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor1oszlop2Nev.charAt(0)!='e'   &&  sor1oszlop2Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor1oszlop2Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor1oszlop2Nev.charAt(0)!='e'   &&  sor1oszlop2Nev.charAt(0)!='n' ) {
                feltamasztalak( sor1oszlop2Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS1O3.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(1,3);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(13);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 1,3);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor1oszlop3Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 1,3);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor1oszlop3Nev.charAt(0)=='e' ) {
                lelassitalak( sor1oszlop3Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor1oszlop3Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor1oszlop3Nev, 1,3);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 1,3);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor1oszlop3Nev.charAt(0)!='e'   &&  sor1oszlop3Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor1oszlop3Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor1oszlop3Nev.charAt(0)!='e'   &&  sor1oszlop3Nev.charAt(0)!='n' ) {
                feltamasztalak( sor1oszlop3Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS1O4.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(1,4);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(14);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 1,4);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor1oszlop4Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 1,4);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor1oszlop4Nev.charAt(0)=='e' ) {
                lelassitalak( sor1oszlop4Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor1oszlop4Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor1oszlop4Nev, 1,4);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 1,4);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor1oszlop4Nev.charAt(0)!='e'   &&  sor1oszlop4Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor1oszlop4Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor1oszlop4Nev.charAt(0)!='e'   &&  sor1oszlop4Nev.charAt(0)!='n' ) {
                feltamasztalak( sor1oszlop4Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS1O5.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(1,5);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(15);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 1,5);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor1oszlop5Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 1,5);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor1oszlop5Nev.charAt(0)=='e' ) {
                lelassitalak( sor1oszlop5Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor1oszlop5Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor1oszlop5Nev, 1,5);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 1,5);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor1oszlop5Nev.charAt(0)!='e'   &&  sor1oszlop5Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor1oszlop5Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor1oszlop5Nev.charAt(0)!='e'   &&  sor1oszlop5Nev.charAt(0)!='n' ) {
                feltamasztalak( sor1oszlop5Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS1O6.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(1,6);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(16);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 1,6);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor1oszlop6Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 1,6);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor1oszlop6Nev.charAt(0)=='e' ) {
                lelassitalak( sor1oszlop6Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor1oszlop6Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor1oszlop6Nev, 1,6);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 1,6);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor1oszlop6Nev.charAt(0)!='e'   &&  sor1oszlop6Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor1oszlop6Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor1oszlop6Nev.charAt(0)!='e'   &&  sor1oszlop6Nev.charAt(0)!='n' ) {
                feltamasztalak( sor1oszlop6Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS1O7.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(1,7);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(17);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 1,7);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor1oszlop7Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 1,7);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor1oszlop7Nev.charAt(0)=='e' ) {
                lelassitalak( sor1oszlop7Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor1oszlop7Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor1oszlop7Nev, 1,7);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 1,7);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor1oszlop7Nev.charAt(0)!='e'   &&  sor1oszlop7Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor1oszlop7Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor1oszlop7Nev.charAt(0)!='e'   &&  sor1oszlop7Nev.charAt(0)!='n' ) {
                feltamasztalak( sor1oszlop7Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS1O8.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(1,8);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(18);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 1,8);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor1oszlop8Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 1,8);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor1oszlop8Nev.charAt(0)=='e' ) {
                lelassitalak( sor1oszlop8Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor1oszlop8Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor1oszlop8Nev, 1,8);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 1,8);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor1oszlop8Nev.charAt(0)!='e'   &&  sor1oszlop8Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor1oszlop8Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor1oszlop8Nev.charAt(0)!='e'   &&  sor1oszlop8Nev.charAt(0)!='n' ) {
                feltamasztalak( sor1oszlop8Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS1O9.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(1,9);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(19);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 1,9);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor1oszlop9Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 1,9);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor1oszlop9Nev.charAt(0)=='e' ) {
                lelassitalak( sor1oszlop9Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor1oszlop9Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor1oszlop9Nev, 1,9);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 1,9);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor1oszlop9Nev.charAt(0)!='e'   &&  sor1oszlop9Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor1oszlop9Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor1oszlop9Nev.charAt(0)!='e'   &&  sor1oszlop9Nev.charAt(0)!='n' ) {
                feltamasztalak( sor1oszlop9Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS1O10.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(1,10);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(110);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 1,10);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor1oszlop10Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 1,10);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva && sor1oszlop10Nev.charAt(0)=='e' ) {
                lelassitalak( sor1oszlop10Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva && sor1oszlop10Nev.charAt(0)=='e' ) {
                villamcsapasElsutese(sor1oszlop10Nev,1,10);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese(1,10);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  && sor1oszlop10Nev.charAt(0)!='e'   && sor1oszlop10Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor1oszlop10Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  && sor1oszlop10Nev.charAt(0)!='e'   && sor1oszlop10Nev.charAt(0)!='n' ) {
                feltamasztalak( sor1oszlop10Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS1O11.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(1,11);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(111);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 1,11);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor1oszlop11Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 1,11);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva && sor1oszlop11Nev.charAt(0)=='e' ) {
                lelassitalak( sor1oszlop11Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva && sor1oszlop11Nev.charAt(0)=='e' ) {
                villamcsapasElsutese(sor1oszlop11Nev,1,11);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese(1,11);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  && sor1oszlop11Nev.charAt(0)!='e'   && sor1oszlop11Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor1oszlop11Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  && sor1oszlop11Nev.charAt(0)!='e'   && sor1oszlop11Nev.charAt(0)!='n' ) {
                feltamasztalak( sor1oszlop11Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS1O12.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(1,12);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(112);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 1,12);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor1oszlop12Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 1,12);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva && sor1oszlop12Nev.charAt(0)=='e' ) {
                lelassitalak( sor1oszlop12Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva && sor1oszlop12Nev.charAt(0)=='e' ) {
                villamcsapasElsutese(sor1oszlop12Nev,1,12);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese(1,12);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  && sor1oszlop12Nev.charAt(0)!='e'   && sor1oszlop12Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor1oszlop12Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  && sor1oszlop12Nev.charAt(0)!='e'   && sor1oszlop12Nev.charAt(0)!='n' ) {
                feltamasztalak( sor1oszlop12Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });

        //----2sor
        palyaS2O1.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(2,1);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(21);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 2,1);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor2oszlop1Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 2,1);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor2oszlop1Nev.charAt(0)=='e' ) {
                lelassitalak( sor2oszlop1Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor2oszlop1Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor2oszlop1Nev, 2,1);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 2,1);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor2oszlop1Nev.charAt(0)!='e'   &&  sor2oszlop1Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor2oszlop1Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor2oszlop1Nev.charAt(0)!='e'   &&  sor2oszlop1Nev.charAt(0)!='n' ) {
                feltamasztalak( sor2oszlop1Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS2O2.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(2,2);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(22);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 2,2);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor2oszlop2Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 2,2);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor2oszlop2Nev.charAt(0)=='e' ) {
                lelassitalak( sor2oszlop2Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor2oszlop2Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor2oszlop2Nev, 2,2);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 2,2);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor2oszlop2Nev.charAt(0)!='e'   &&  sor2oszlop2Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor2oszlop2Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor2oszlop2Nev.charAt(0)!='e'   &&  sor2oszlop2Nev.charAt(0)!='n' ) {
                feltamasztalak( sor2oszlop2Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS2O3.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(2,3);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(23);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 2,3);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor2oszlop3Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 2,3);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor2oszlop3Nev.charAt(0)=='e' ) {
                lelassitalak( sor2oszlop3Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor2oszlop3Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor2oszlop3Nev, 2,3);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 2,3);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor2oszlop3Nev.charAt(0)!='e'   &&  sor2oszlop3Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor2oszlop3Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor2oszlop3Nev.charAt(0)!='e'   &&  sor2oszlop3Nev.charAt(0)!='n' ) {
                feltamasztalak( sor2oszlop3Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS2O4.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(2,4);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(24);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 2,4);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor2oszlop4Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 2,4);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor2oszlop4Nev.charAt(0)=='e' ) {
                lelassitalak( sor2oszlop4Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor2oszlop4Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor2oszlop4Nev, 2,4);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 2,4);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor2oszlop4Nev.charAt(0)!='e'   &&  sor2oszlop4Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor2oszlop4Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor2oszlop4Nev.charAt(0)!='e'   &&  sor2oszlop4Nev.charAt(0)!='n' ) {
                feltamasztalak( sor2oszlop4Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS2O5.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(2,5);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(25);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 2,5);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor2oszlop5Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 2,5);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor2oszlop5Nev.charAt(0)=='e' ) {
                lelassitalak( sor2oszlop5Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor2oszlop5Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor2oszlop5Nev, 2,5);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 2,5);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor2oszlop5Nev.charAt(0)!='e'   &&  sor2oszlop5Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor2oszlop5Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor2oszlop5Nev.charAt(0)!='e'   &&  sor2oszlop5Nev.charAt(0)!='n' ) {
                feltamasztalak( sor2oszlop5Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS2O6.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(2,6);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(26);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 2,6);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor2oszlop6Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 2,6);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor2oszlop6Nev.charAt(0)=='e' ) {
                lelassitalak( sor2oszlop6Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor2oszlop6Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor2oszlop6Nev, 2,6);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 2,6);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor2oszlop6Nev.charAt(0)!='e'   &&  sor2oszlop6Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor2oszlop6Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor2oszlop6Nev.charAt(0)!='e'   &&  sor2oszlop6Nev.charAt(0)!='n' ) {
                feltamasztalak( sor2oszlop6Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS2O7.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(2,7);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(27);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 2,7);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor2oszlop7Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 2,7);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor2oszlop7Nev.charAt(0)=='e' ) {
                lelassitalak( sor2oszlop7Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor2oszlop7Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor2oszlop7Nev, 2,7);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 2,7);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor2oszlop7Nev.charAt(0)!='e'   &&  sor2oszlop7Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor2oszlop7Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor2oszlop7Nev.charAt(0)!='e'   &&  sor2oszlop7Nev.charAt(0)!='n' ) {
                feltamasztalak( sor2oszlop7Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS2O8.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(2,8);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(28);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 2,8);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor2oszlop8Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 2,8);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor2oszlop8Nev.charAt(0)=='e' ) {
                lelassitalak( sor2oszlop8Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor2oszlop8Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor2oszlop8Nev, 2,8);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 2,8);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor2oszlop8Nev.charAt(0)!='e'   &&  sor2oszlop8Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor2oszlop8Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor2oszlop8Nev.charAt(0)!='e'   &&  sor2oszlop8Nev.charAt(0)!='n' ) {
                feltamasztalak( sor2oszlop8Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS2O9.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(2,9);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(29);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 2,9);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor2oszlop9Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 2,9);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor2oszlop9Nev.charAt(0)=='e' ) {
                lelassitalak( sor2oszlop9Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor2oszlop9Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor2oszlop9Nev, 2,9);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 2,9);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor2oszlop9Nev.charAt(0)!='e'   &&  sor2oszlop9Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor2oszlop9Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor2oszlop9Nev.charAt(0)!='e'   &&  sor2oszlop9Nev.charAt(0)!='n' ) {
                feltamasztalak( sor2oszlop9Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS2O10.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(2,10);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(210);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 2,10);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor2oszlop10Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 2,10);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva && sor2oszlop10Nev.charAt(0)=='e' ) {
                lelassitalak( sor2oszlop10Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva && sor2oszlop10Nev.charAt(0)=='e' ) {
                villamcsapasElsutese(sor2oszlop10Nev,2,10);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese(2,10);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  && sor2oszlop10Nev.charAt(0)!='e'   && sor2oszlop10Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor2oszlop10Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  && sor2oszlop10Nev.charAt(0)!='e'   && sor2oszlop10Nev.charAt(0)!='n' ) {
                feltamasztalak( sor2oszlop10Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS2O11.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(2,11);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(211);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 2,11);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor2oszlop11Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 2,11);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva && sor2oszlop11Nev.charAt(0)=='e' ) {
                lelassitalak( sor2oszlop11Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva && sor2oszlop11Nev.charAt(0)=='e' ) {
                villamcsapasElsutese(sor2oszlop11Nev,2,11);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese(2,11);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  && sor2oszlop11Nev.charAt(0)!='e'   && sor2oszlop11Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor2oszlop11Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  && sor2oszlop11Nev.charAt(0)!='e'   && sor2oszlop11Nev.charAt(0)!='n' ) {
                feltamasztalak( sor2oszlop11Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS2O12.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(2,12);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(212);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 2,12);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor2oszlop12Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 2,12);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva && sor2oszlop12Nev.charAt(0)=='e' ) {
                lelassitalak( sor2oszlop12Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva && sor2oszlop12Nev.charAt(0)=='e' ) {
                villamcsapasElsutese(sor2oszlop12Nev,2,12);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese(2,12);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  && sor2oszlop12Nev.charAt(0)!='e'   && sor2oszlop12Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor2oszlop12Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  && sor2oszlop12Nev.charAt(0)!='e'   && sor2oszlop12Nev.charAt(0)!='n' ) {
                feltamasztalak( sor2oszlop12Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });

        //----3sor
        palyaS3O1.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(3,1);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(31);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 3,1);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor3oszlop1Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 3,1);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor3oszlop1Nev.charAt(0)=='e' ) {
                lelassitalak( sor3oszlop1Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor3oszlop1Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor3oszlop1Nev, 3,1);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 3,1);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor3oszlop1Nev.charAt(0)!='e'   &&  sor3oszlop1Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor3oszlop1Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor3oszlop1Nev.charAt(0)!='e'   &&  sor3oszlop1Nev.charAt(0)!='n' ) {
                feltamasztalak( sor3oszlop1Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS3O2.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(3,2);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(32);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 3,2);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor3oszlop2Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 3,2);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor3oszlop2Nev.charAt(0)=='e' ) {
                lelassitalak( sor3oszlop2Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor3oszlop2Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor3oszlop2Nev, 3,2);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 3,2);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor3oszlop2Nev.charAt(0)!='e'   &&  sor3oszlop2Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor3oszlop2Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor3oszlop2Nev.charAt(0)!='e'   &&  sor3oszlop2Nev.charAt(0)!='n' ) {
                feltamasztalak( sor3oszlop2Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS3O3.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(3,3);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(33);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 3,3);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor3oszlop3Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 3,3);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor3oszlop3Nev.charAt(0)=='e' ) {
                lelassitalak( sor3oszlop3Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor3oszlop3Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor3oszlop3Nev, 3,3);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 3,3);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor3oszlop3Nev.charAt(0)!='e'   &&  sor3oszlop3Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor3oszlop3Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor3oszlop3Nev.charAt(0)!='e'   &&  sor3oszlop3Nev.charAt(0)!='n' ) {
                feltamasztalak( sor3oszlop3Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS3O4.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(3,4);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(34);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 3,4);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor3oszlop4Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 3,4);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor3oszlop4Nev.charAt(0)=='e' ) {
                lelassitalak( sor3oszlop4Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor3oszlop4Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor3oszlop4Nev, 3,4);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 3,4);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor3oszlop4Nev.charAt(0)!='e'   &&  sor3oszlop4Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor3oszlop4Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor3oszlop4Nev.charAt(0)!='e'   &&  sor3oszlop4Nev.charAt(0)!='n' ) {
                feltamasztalak( sor3oszlop4Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS3O5.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(3,5);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(35);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 3,5);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor3oszlop5Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 3,5);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor3oszlop5Nev.charAt(0)=='e' ) {
                lelassitalak( sor3oszlop5Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor3oszlop5Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor3oszlop5Nev, 3,5);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 3,5);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor3oszlop5Nev.charAt(0)!='e'   &&  sor3oszlop5Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor3oszlop5Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor3oszlop5Nev.charAt(0)!='e'   &&  sor3oszlop5Nev.charAt(0)!='n' ) {
                feltamasztalak( sor3oszlop5Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS3O6.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(3,6);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(36);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 3,6);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor3oszlop6Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 3,6);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor3oszlop6Nev.charAt(0)=='e' ) {
                lelassitalak( sor3oszlop6Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor3oszlop6Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor3oszlop6Nev, 3,6);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 3,6);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor3oszlop6Nev.charAt(0)!='e'   &&  sor3oszlop6Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor3oszlop6Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor3oszlop6Nev.charAt(0)!='e'   &&  sor3oszlop6Nev.charAt(0)!='n' ) {
                feltamasztalak( sor3oszlop6Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS3O7.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(3,7);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(37);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 3,7);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor3oszlop7Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 3,7);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor3oszlop7Nev.charAt(0)=='e' ) {
                lelassitalak( sor3oszlop7Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor3oszlop7Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor3oszlop7Nev, 3,7);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 3,7);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor3oszlop7Nev.charAt(0)!='e'   &&  sor3oszlop7Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor3oszlop7Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor3oszlop7Nev.charAt(0)!='e'   &&  sor3oszlop7Nev.charAt(0)!='n' ) {
                feltamasztalak( sor3oszlop7Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS3O8.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(3,8);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(38);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 3,8);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor3oszlop8Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 3,8);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor3oszlop8Nev.charAt(0)=='e' ) {
                lelassitalak( sor3oszlop8Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor3oszlop8Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor3oszlop8Nev, 3,8);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 3,8);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor3oszlop8Nev.charAt(0)!='e'   &&  sor3oszlop8Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor3oszlop8Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor3oszlop8Nev.charAt(0)!='e'   &&  sor3oszlop8Nev.charAt(0)!='n' ) {
                feltamasztalak( sor3oszlop8Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS3O9.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(3,9);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(39);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 3,9);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor3oszlop9Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 3,9);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor3oszlop9Nev.charAt(0)=='e' ) {
                lelassitalak( sor3oszlop9Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor3oszlop9Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor3oszlop9Nev, 3,9);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 3,9);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor3oszlop9Nev.charAt(0)!='e'   &&  sor3oszlop9Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor3oszlop9Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor3oszlop9Nev.charAt(0)!='e'   &&  sor3oszlop9Nev.charAt(0)!='n' ) {
                feltamasztalak( sor3oszlop9Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS3O10.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(3,10);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(310);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 3,10);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor3oszlop10Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 3,10);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva && sor3oszlop10Nev.charAt(0)=='e' ) {
                lelassitalak( sor3oszlop10Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva && sor3oszlop10Nev.charAt(0)=='e' ) {
                villamcsapasElsutese(sor3oszlop10Nev,3,10);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese(3,10);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  && sor3oszlop10Nev.charAt(0)!='e'   && sor3oszlop10Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor3oszlop10Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  && sor3oszlop10Nev.charAt(0)!='e'   && sor3oszlop10Nev.charAt(0)!='n' ) {
                feltamasztalak( sor3oszlop10Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS3O11.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(3,11);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(311);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 3,11);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor3oszlop11Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 3,11);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva && sor3oszlop11Nev.charAt(0)=='e' ) {
                lelassitalak( sor3oszlop11Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva && sor3oszlop11Nev.charAt(0)=='e' ) {
                villamcsapasElsutese(sor3oszlop11Nev,3,11);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese(3,11);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  && sor3oszlop11Nev.charAt(0)!='e'   && sor3oszlop11Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor3oszlop11Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  && sor3oszlop11Nev.charAt(0)!='e'   && sor3oszlop11Nev.charAt(0)!='n' ) {
                feltamasztalak( sor3oszlop11Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS3O12.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(3,12);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(312);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 3,12);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor3oszlop12Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 3,12);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva && sor3oszlop12Nev.charAt(0)=='e' ) {
                lelassitalak( sor3oszlop12Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva && sor3oszlop12Nev.charAt(0)=='e' ) {
                villamcsapasElsutese(sor3oszlop12Nev,3,12);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese(3,12);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  && sor3oszlop12Nev.charAt(0)!='e'   && sor3oszlop12Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor3oszlop12Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  && sor3oszlop12Nev.charAt(0)!='e'   && sor3oszlop12Nev.charAt(0)!='n' ) {
                feltamasztalak( sor3oszlop12Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });

        //----44sor
        palyaS4O1.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(4,1);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(41);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 4,1);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor4oszlop1Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 4,1);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor4oszlop1Nev.charAt(0)=='e' ) {
                lelassitalak( sor4oszlop1Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor4oszlop1Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor4oszlop1Nev, 4,1);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 4,1);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor4oszlop1Nev.charAt(0)!='e'   &&  sor4oszlop1Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor4oszlop1Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor4oszlop1Nev.charAt(0)!='e'   &&  sor4oszlop1Nev.charAt(0)!='n' ) {
                feltamasztalak( sor4oszlop1Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS4O2.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(4,2);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(42);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 4,2);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor4oszlop2Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 4,2);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor4oszlop2Nev.charAt(0)=='e' ) {
                lelassitalak( sor4oszlop2Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor4oszlop2Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor4oszlop2Nev, 4,2);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 4,2);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor4oszlop2Nev.charAt(0)!='e'   &&  sor4oszlop2Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor4oszlop2Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor4oszlop2Nev.charAt(0)!='e'   &&  sor4oszlop2Nev.charAt(0)!='n' ) {
                feltamasztalak( sor4oszlop2Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS4O3.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(4,3);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(43);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 4,3);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor4oszlop3Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 4,3);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor4oszlop3Nev.charAt(0)=='e' ) {
                lelassitalak( sor4oszlop3Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor4oszlop3Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor4oszlop3Nev, 4,3);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 4,3);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor4oszlop3Nev.charAt(0)!='e'   &&  sor4oszlop3Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor4oszlop3Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor4oszlop3Nev.charAt(0)!='e'   &&  sor4oszlop3Nev.charAt(0)!='n' ) {
                feltamasztalak( sor4oszlop3Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS4O4.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(4,4);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(44);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 4,4);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor4oszlop4Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 4,4);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor4oszlop4Nev.charAt(0)=='e' ) {
                lelassitalak( sor4oszlop4Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor4oszlop4Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor4oszlop4Nev, 4,4);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 4,4);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor4oszlop4Nev.charAt(0)!='e'   &&  sor4oszlop4Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor4oszlop4Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor4oszlop4Nev.charAt(0)!='e'   &&  sor4oszlop4Nev.charAt(0)!='n' ) {
                feltamasztalak( sor4oszlop4Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS4O5.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(4,5);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(45);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 4,5);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor4oszlop5Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 4,5);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor4oszlop5Nev.charAt(0)=='e' ) {
                lelassitalak( sor4oszlop5Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor4oszlop5Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor4oszlop5Nev, 4,5);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 4,5);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor4oszlop5Nev.charAt(0)!='e'   &&  sor4oszlop5Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor4oszlop5Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor4oszlop5Nev.charAt(0)!='e'   &&  sor4oszlop5Nev.charAt(0)!='n' ) {
                feltamasztalak( sor4oszlop5Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS4O6.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(4,6);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(46);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 4,6);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor4oszlop6Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 4,6);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor4oszlop6Nev.charAt(0)=='e' ) {
                lelassitalak( sor4oszlop6Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor4oszlop6Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor4oszlop6Nev, 4,6);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 4,6);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor4oszlop6Nev.charAt(0)!='e'   &&  sor4oszlop6Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor4oszlop6Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor4oszlop6Nev.charAt(0)!='e'   &&  sor4oszlop6Nev.charAt(0)!='n' ) {
                feltamasztalak( sor4oszlop6Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS4O7.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(4,7);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(47);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 4,7);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor4oszlop7Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 4,7);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor4oszlop7Nev.charAt(0)=='e' ) {
                lelassitalak( sor4oszlop7Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor4oszlop7Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor4oszlop7Nev, 4,7);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 4,7);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor4oszlop7Nev.charAt(0)!='e'   &&  sor4oszlop7Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor4oszlop7Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor4oszlop7Nev.charAt(0)!='e'   &&  sor4oszlop7Nev.charAt(0)!='n' ) {
                feltamasztalak( sor4oszlop7Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS4O8.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(4,8);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(48);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 4,8);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor4oszlop8Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 4,8);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor4oszlop8Nev.charAt(0)=='e' ) {
                lelassitalak( sor4oszlop8Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor4oszlop8Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor4oszlop8Nev, 4,8);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 4,8);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor4oszlop8Nev.charAt(0)!='e'   &&  sor4oszlop8Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor4oszlop8Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor4oszlop8Nev.charAt(0)!='e'   &&  sor4oszlop8Nev.charAt(0)!='n' ) {
                feltamasztalak( sor4oszlop8Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS4O9.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(4,9);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(49);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 4,9);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor4oszlop9Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 4,9);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor4oszlop9Nev.charAt(0)=='e' ) {
                lelassitalak( sor4oszlop9Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor4oszlop9Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor4oszlop9Nev, 4,9);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 4,9);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor4oszlop9Nev.charAt(0)!='e'   &&  sor4oszlop9Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor4oszlop9Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor4oszlop9Nev.charAt(0)!='e'   &&  sor4oszlop9Nev.charAt(0)!='n' ) {
                feltamasztalak( sor4oszlop9Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS4O10.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(4,10);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(410);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 4,10);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor4oszlop10Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 4,10);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva && sor4oszlop10Nev.charAt(0)=='e' ) {
                lelassitalak( sor4oszlop10Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva && sor4oszlop10Nev.charAt(0)=='e' ) {
                villamcsapasElsutese(sor4oszlop10Nev,4,10);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese(4,10);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  && sor4oszlop10Nev.charAt(0)!='e'   && sor4oszlop10Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor4oszlop10Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  && sor4oszlop10Nev.charAt(0)!='e'   && sor4oszlop10Nev.charAt(0)!='n' ) {
                feltamasztalak( sor4oszlop10Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS4O11.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(4,11);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(411);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 4,11);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor4oszlop11Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 4,11);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva && sor4oszlop11Nev.charAt(0)=='e' ) {
                lelassitalak( sor4oszlop11Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva && sor4oszlop11Nev.charAt(0)=='e' ) {
                villamcsapasElsutese(sor4oszlop11Nev,4,11);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese(4,11);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  && sor4oszlop11Nev.charAt(0)!='e'   && sor4oszlop11Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor4oszlop11Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  && sor4oszlop11Nev.charAt(0)!='e'   && sor4oszlop11Nev.charAt(0)!='n' ) {
                feltamasztalak( sor4oszlop11Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS4O12.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(4,12);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(412);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 4,12);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor4oszlop12Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 4,12);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva && sor4oszlop12Nev.charAt(0)=='e' ) {
                lelassitalak( sor4oszlop12Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva && sor4oszlop12Nev.charAt(0)=='e' ) {
                villamcsapasElsutese(sor4oszlop12Nev,4,12);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese(4,12);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  && sor4oszlop12Nev.charAt(0)!='e'   && sor4oszlop12Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor4oszlop12Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  && sor4oszlop12Nev.charAt(0)!='e'   && sor4oszlop12Nev.charAt(0)!='n' ) {
                feltamasztalak( sor4oszlop12Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });

        //----5sor
        palyaS5O1.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(5,1);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(51);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 5,1);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor5oszlop1Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 5,1);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor5oszlop1Nev.charAt(0)=='e' ) {
                lelassitalak( sor5oszlop1Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor5oszlop1Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor5oszlop1Nev, 5,1);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 5,1);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor5oszlop1Nev.charAt(0)!='e'   &&  sor5oszlop1Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor5oszlop1Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor5oszlop1Nev.charAt(0)!='e'   &&  sor5oszlop1Nev.charAt(0)!='n' ) {
                feltamasztalak( sor5oszlop1Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS5O2.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(5,2);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(52);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 5,2);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor5oszlop2Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 5,2);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor5oszlop2Nev.charAt(0)=='e' ) {
                lelassitalak( sor5oszlop2Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor5oszlop2Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor5oszlop2Nev, 5,2);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 5,2);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor5oszlop2Nev.charAt(0)!='e'   &&  sor5oszlop2Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor5oszlop2Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor5oszlop2Nev.charAt(0)!='e'   &&  sor5oszlop2Nev.charAt(0)!='n' ) {
                feltamasztalak( sor5oszlop2Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS5O3.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(5,3);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(53);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 5,3);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor5oszlop3Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 5,3);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor5oszlop3Nev.charAt(0)=='e' ) {
                lelassitalak( sor5oszlop3Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor5oszlop3Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor5oszlop3Nev, 5,3);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 5,3);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor5oszlop3Nev.charAt(0)!='e'   &&  sor5oszlop3Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor5oszlop3Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor5oszlop3Nev.charAt(0)!='e'   &&  sor5oszlop3Nev.charAt(0)!='n' ) {
                feltamasztalak( sor5oszlop3Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS5O4.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(5,4);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(54);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 5,4);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor5oszlop4Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 5,4);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor5oszlop4Nev.charAt(0)=='e' ) {
                lelassitalak( sor5oszlop4Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor5oszlop4Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor5oszlop4Nev, 5,4);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 5,4);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor5oszlop4Nev.charAt(0)!='e'   &&  sor5oszlop4Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor5oszlop4Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor5oszlop4Nev.charAt(0)!='e'   &&  sor5oszlop4Nev.charAt(0)!='n' ) {
                feltamasztalak( sor5oszlop4Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS5O5.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(5,5);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(55);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 5,5);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor5oszlop5Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 5,5);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor5oszlop5Nev.charAt(0)=='e' ) {
                lelassitalak( sor5oszlop5Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor5oszlop5Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor5oszlop5Nev, 5,5);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 5,5);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor5oszlop5Nev.charAt(0)!='e'   &&  sor5oszlop5Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor5oszlop5Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor5oszlop5Nev.charAt(0)!='e'   &&  sor5oszlop5Nev.charAt(0)!='n' ) {
                feltamasztalak( sor5oszlop5Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS5O6.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(5,6);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(56);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 5,6);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor5oszlop6Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 5,6);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor5oszlop6Nev.charAt(0)=='e' ) {
                lelassitalak( sor5oszlop6Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor5oszlop6Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor5oszlop6Nev, 5,6);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 5,6);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor5oszlop6Nev.charAt(0)!='e'   &&  sor5oszlop6Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor5oszlop6Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor5oszlop6Nev.charAt(0)!='e'   &&  sor5oszlop6Nev.charAt(0)!='n' ) {
                feltamasztalak( sor5oszlop6Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS5O7.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(5,7);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(57);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 5,7);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor5oszlop7Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 5,7);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor5oszlop7Nev.charAt(0)=='e' ) {
                lelassitalak( sor5oszlop7Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor5oszlop7Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor5oszlop7Nev, 5,7);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 5,7);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor5oszlop7Nev.charAt(0)!='e'   &&  sor5oszlop7Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor5oszlop7Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor5oszlop7Nev.charAt(0)!='e'   &&  sor5oszlop7Nev.charAt(0)!='n' ) {
                feltamasztalak( sor5oszlop7Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS5O8.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(5,8);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(58);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 5,8);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor5oszlop8Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 5,8);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor5oszlop8Nev.charAt(0)=='e' ) {
                lelassitalak( sor5oszlop8Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor5oszlop8Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor5oszlop8Nev, 5,8);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 5,8);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor5oszlop8Nev.charAt(0)!='e'   &&  sor5oszlop8Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor5oszlop8Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor5oszlop8Nev.charAt(0)!='e'   &&  sor5oszlop8Nev.charAt(0)!='n' ) {
                feltamasztalak( sor5oszlop8Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS5O9.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(5,9);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(59);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 5,9);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor5oszlop9Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 5,9);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor5oszlop9Nev.charAt(0)=='e' ) {
                lelassitalak( sor5oszlop9Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor5oszlop9Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor5oszlop9Nev, 5,9);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 5,9);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor5oszlop9Nev.charAt(0)!='e'   &&  sor5oszlop9Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor5oszlop9Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor5oszlop9Nev.charAt(0)!='e'   &&  sor5oszlop9Nev.charAt(0)!='n' ) {
                feltamasztalak( sor5oszlop9Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS5O10.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(5,10);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(510);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 5,10);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor5oszlop10Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 5,10);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva && sor5oszlop10Nev.charAt(0)=='e' ) {
                lelassitalak( sor5oszlop10Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva && sor5oszlop10Nev.charAt(0)=='e' ) {
                villamcsapasElsutese(sor5oszlop10Nev,5,10);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese(5,10);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  && sor5oszlop10Nev.charAt(0)!='e'   && sor5oszlop10Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor5oszlop10Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  && sor5oszlop10Nev.charAt(0)!='e'   && sor5oszlop10Nev.charAt(0)!='n' ) {
                feltamasztalak( sor5oszlop10Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS5O11.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(5,11);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(511);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 5,11);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor5oszlop11Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 5,11);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva && sor5oszlop11Nev.charAt(0)=='e' ) {
                lelassitalak( sor5oszlop11Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva && sor5oszlop11Nev.charAt(0)=='e' ) {
                villamcsapasElsutese(sor5oszlop11Nev,5,11);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese(5,11);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  && sor5oszlop11Nev.charAt(0)!='e'   && sor5oszlop11Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor5oszlop11Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  && sor5oszlop11Nev.charAt(0)!='e'   && sor5oszlop11Nev.charAt(0)!='n' ) {
                feltamasztalak( sor5oszlop11Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS5O12.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(5,12);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(512);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 5,12);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor5oszlop12Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 5,12);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva && sor5oszlop12Nev.charAt(0)=='e' ) {
                lelassitalak( sor5oszlop12Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva && sor5oszlop12Nev.charAt(0)=='e' ) {
                villamcsapasElsutese(sor5oszlop12Nev,5,12);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese(5,12);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  && sor5oszlop12Nev.charAt(0)!='e'   && sor5oszlop12Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor5oszlop12Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  && sor5oszlop12Nev.charAt(0)!='e'   && sor5oszlop12Nev.charAt(0)!='n' ) {
                feltamasztalak( sor5oszlop12Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });

        //----6sor
        palyaS6O1.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(6,1);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(61);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 6,1);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor6oszlop1Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 6,1);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor6oszlop1Nev.charAt(0)=='e' ) {
                lelassitalak( sor6oszlop1Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor6oszlop1Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor6oszlop1Nev, 6,1);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 6,1);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor6oszlop1Nev.charAt(0)!='e'   &&  sor6oszlop1Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor6oszlop1Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor6oszlop1Nev.charAt(0)!='e'   &&  sor6oszlop1Nev.charAt(0)!='n' ) {
                feltamasztalak( sor6oszlop1Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS6O2.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(6,2);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(62);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 6,2);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor6oszlop2Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 6,2);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor6oszlop2Nev.charAt(0)=='e' ) {
                lelassitalak( sor6oszlop2Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor6oszlop2Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor6oszlop2Nev, 6,2);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 6,2);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor6oszlop2Nev.charAt(0)!='e'   &&  sor6oszlop2Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor6oszlop2Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor6oszlop2Nev.charAt(0)!='e'   &&  sor6oszlop2Nev.charAt(0)!='n' ) {
                feltamasztalak( sor6oszlop2Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS6O3.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(6,3);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(63);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 6,3);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor6oszlop3Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 6,3);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor6oszlop3Nev.charAt(0)=='e' ) {
                lelassitalak( sor6oszlop3Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor6oszlop3Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor6oszlop3Nev, 6,3);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 6,3);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor6oszlop3Nev.charAt(0)!='e'   &&  sor6oszlop3Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor6oszlop3Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor6oszlop3Nev.charAt(0)!='e'   &&  sor6oszlop3Nev.charAt(0)!='n' ) {
                feltamasztalak( sor6oszlop3Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS6O5.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(6,5);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(65);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 6,5);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor6oszlop5Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 6,5);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor6oszlop5Nev.charAt(0)=='e' ) {
                lelassitalak( sor6oszlop5Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor6oszlop5Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor6oszlop5Nev, 6,5);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 6,5);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor6oszlop5Nev.charAt(0)!='e'   &&  sor6oszlop5Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor6oszlop5Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor6oszlop5Nev.charAt(0)!='e'   &&  sor6oszlop5Nev.charAt(0)!='n' ) {
                feltamasztalak( sor6oszlop5Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS6O6.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(6,6);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(66);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 6,6);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor6oszlop6Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 6,6);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor6oszlop6Nev.charAt(0)=='e' ) {
                lelassitalak( sor6oszlop6Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor6oszlop6Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor6oszlop6Nev, 6,6);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 6,6);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor6oszlop6Nev.charAt(0)!='e'   &&  sor6oszlop6Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor6oszlop6Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor6oszlop6Nev.charAt(0)!='e'   &&  sor6oszlop6Nev.charAt(0)!='n' ) {
                feltamasztalak( sor6oszlop6Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS6O7.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(6,7);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(67);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 6,7);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor6oszlop7Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 6,7);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor6oszlop7Nev.charAt(0)=='e' ) {
                lelassitalak( sor6oszlop7Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor6oszlop7Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor6oszlop7Nev, 6,7);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 6,7);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor6oszlop7Nev.charAt(0)!='e'   &&  sor6oszlop7Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor6oszlop7Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor6oszlop7Nev.charAt(0)!='e'   &&  sor6oszlop7Nev.charAt(0)!='n' ) {
                feltamasztalak( sor6oszlop7Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS6O8.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(6,8);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(68);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 6,8);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor6oszlop8Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 6,8);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor6oszlop8Nev.charAt(0)=='e' ) {
                lelassitalak( sor6oszlop8Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor6oszlop8Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor6oszlop8Nev, 6,8);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 6,8);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor6oszlop8Nev.charAt(0)!='e'   &&  sor6oszlop8Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor6oszlop8Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor6oszlop8Nev.charAt(0)!='e'   &&  sor6oszlop8Nev.charAt(0)!='n' ) {
                feltamasztalak( sor6oszlop8Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS6O9.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(6,9);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(69);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 6,9);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor6oszlop9Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 6,9);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor6oszlop9Nev.charAt(0)=='e' ) {
                lelassitalak( sor6oszlop9Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor6oszlop9Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor6oszlop9Nev, 6,9);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 6,9);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor6oszlop9Nev.charAt(0)!='e'   &&  sor6oszlop9Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor6oszlop9Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor6oszlop9Nev.charAt(0)!='e'   &&  sor6oszlop9Nev.charAt(0)!='n' ) {
                feltamasztalak( sor6oszlop9Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS6O10.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(6,10);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(610);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 6,10);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor6oszlop10Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 6,10);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva && sor6oszlop10Nev.charAt(0)=='e' ) {
                lelassitalak( sor6oszlop10Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva && sor6oszlop10Nev.charAt(0)=='e' ) {
                villamcsapasElsutese(sor6oszlop10Nev,6,10);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese(6,10);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  && sor6oszlop10Nev.charAt(0)!='e'   && sor6oszlop10Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor6oszlop10Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  && sor6oszlop10Nev.charAt(0)!='e'   && sor6oszlop10Nev.charAt(0)!='n' ) {
                feltamasztalak( sor6oszlop10Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS6O11.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(6,11);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(611);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 6,11);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor6oszlop11Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 6,11);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva && sor6oszlop11Nev.charAt(0)=='e' ) {
                lelassitalak( sor6oszlop11Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva && sor6oszlop11Nev.charAt(0)=='e' ) {
                villamcsapasElsutese(sor6oszlop11Nev,6,11);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese(6,11);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  && sor6oszlop11Nev.charAt(0)!='e'   && sor6oszlop11Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor6oszlop11Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  && sor6oszlop11Nev.charAt(0)!='e'   && sor6oszlop11Nev.charAt(0)!='n' ) {
                feltamasztalak( sor6oszlop11Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS6O12.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(6,12);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(612);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 6,12);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor6oszlop12Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 6,12);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva && sor6oszlop12Nev.charAt(0)=='e' ) {
                lelassitalak( sor6oszlop12Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva && sor6oszlop12Nev.charAt(0)=='e' ) {
                villamcsapasElsutese(sor6oszlop12Nev,6,12);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese(6,12);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  && sor6oszlop12Nev.charAt(0)!='e'   && sor6oszlop12Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor6oszlop12Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  && sor6oszlop12Nev.charAt(0)!='e'   && sor6oszlop12Nev.charAt(0)!='n' ) {
                feltamasztalak( sor6oszlop12Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });

        //----7sor
        palyaS7O1.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(7,1);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(71);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 7,1);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor7oszlop1Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 7,1);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor7oszlop1Nev.charAt(0)=='e' ) {
                lelassitalak( sor7oszlop1Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor7oszlop1Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor7oszlop1Nev, 7,1);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 7,1);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor7oszlop1Nev.charAt(0)!='e'   &&  sor7oszlop1Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor7oszlop1Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor7oszlop1Nev.charAt(0)!='e'   &&  sor7oszlop1Nev.charAt(0)!='n' ) {
                feltamasztalak( sor7oszlop1Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS7O2.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(7,2);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(72);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 7,2);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor7oszlop2Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 7,2);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor7oszlop2Nev.charAt(0)=='e' ) {
                lelassitalak( sor7oszlop2Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor7oszlop2Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor7oszlop2Nev, 7,2);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 7,2);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor7oszlop2Nev.charAt(0)!='e'   &&  sor7oszlop2Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor7oszlop2Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor7oszlop2Nev.charAt(0)!='e'   &&  sor7oszlop2Nev.charAt(0)!='n' ) {
                feltamasztalak( sor7oszlop2Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS7O3.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(7,3);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(73);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 7,3);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor7oszlop3Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 7,3);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor7oszlop3Nev.charAt(0)=='e' ) {
                lelassitalak( sor7oszlop3Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor7oszlop3Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor7oszlop3Nev, 7,3);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 7,3);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor7oszlop3Nev.charAt(0)!='e'   &&  sor7oszlop3Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor7oszlop3Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor7oszlop3Nev.charAt(0)!='e'   &&  sor7oszlop3Nev.charAt(0)!='n' ) {
                feltamasztalak( sor7oszlop3Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS7O4.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(7,4);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(74);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 7,4);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor7oszlop4Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 7,4);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor7oszlop4Nev.charAt(0)=='e' ) {
                lelassitalak( sor7oszlop4Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor7oszlop4Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor7oszlop4Nev, 7,4);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 7,4);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor7oszlop4Nev.charAt(0)!='e'   &&  sor7oszlop4Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor7oszlop4Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor7oszlop4Nev.charAt(0)!='e'   &&  sor7oszlop4Nev.charAt(0)!='n' ) {
                feltamasztalak( sor7oszlop4Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS7O5.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(7,5);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(75);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 7,5);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor7oszlop5Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 7,5);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor7oszlop5Nev.charAt(0)=='e' ) {
                lelassitalak( sor7oszlop5Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor7oszlop5Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor7oszlop5Nev, 7,5);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 7,5);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor7oszlop5Nev.charAt(0)!='e'   &&  sor7oszlop5Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor7oszlop5Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor7oszlop5Nev.charAt(0)!='e'   &&  sor7oszlop5Nev.charAt(0)!='n' ) {
                feltamasztalak( sor7oszlop5Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS7O6.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(7,6);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(76);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 7,6);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor7oszlop6Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 7,6);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor7oszlop6Nev.charAt(0)=='e' ) {
                lelassitalak( sor7oszlop6Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor7oszlop6Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor7oszlop6Nev, 7,6);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 7,6);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor7oszlop6Nev.charAt(0)!='e'   &&  sor7oszlop6Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor7oszlop6Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor7oszlop6Nev.charAt(0)!='e'   &&  sor7oszlop6Nev.charAt(0)!='n' ) {
                feltamasztalak( sor7oszlop6Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS7O7.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(7,7);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(77);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 7,7);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor7oszlop7Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 7,7);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor7oszlop7Nev.charAt(0)=='e' ) {
                lelassitalak( sor7oszlop7Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor7oszlop7Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor7oszlop7Nev, 7,7);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 7,7);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor7oszlop7Nev.charAt(0)!='e'   &&  sor7oszlop7Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor7oszlop7Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor7oszlop7Nev.charAt(0)!='e'   &&  sor7oszlop7Nev.charAt(0)!='n' ) {
                feltamasztalak( sor7oszlop7Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS7O10.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(7,10);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(710);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 7,10);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor7oszlop10Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 7,10);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva && sor7oszlop10Nev.charAt(0)=='e' ) {
                lelassitalak( sor7oszlop10Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva && sor7oszlop10Nev.charAt(0)=='e' ) {
                villamcsapasElsutese(sor7oszlop10Nev,7,10);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese(7,10);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  && sor7oszlop10Nev.charAt(0)!='e'   && sor7oszlop10Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor7oszlop10Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  && sor7oszlop10Nev.charAt(0)!='e'   && sor7oszlop10Nev.charAt(0)!='n' ) {
                feltamasztalak( sor7oszlop10Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS7O11.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(7,11);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(711);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 7,11);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor7oszlop11Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 7,11);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva && sor7oszlop11Nev.charAt(0)=='e' ) {
                lelassitalak( sor7oszlop11Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva && sor7oszlop11Nev.charAt(0)=='e' ) {
                villamcsapasElsutese(sor7oszlop11Nev,7,11);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese(7,11);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  && sor7oszlop11Nev.charAt(0)!='e'   && sor7oszlop11Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor7oszlop11Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  && sor7oszlop11Nev.charAt(0)!='e'   && sor7oszlop11Nev.charAt(0)!='n' ) {
                feltamasztalak( sor7oszlop11Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS7O12.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(7,12);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(712);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 7,12);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor7oszlop12Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 7,12);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva && sor7oszlop12Nev.charAt(0)=='e' ) {
                lelassitalak( sor7oszlop12Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva && sor7oszlop12Nev.charAt(0)=='e' ) {
                villamcsapasElsutese(sor7oszlop12Nev,7,12);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese(7,12);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  && sor7oszlop12Nev.charAt(0)!='e'   && sor7oszlop12Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor7oszlop12Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  && sor7oszlop12Nev.charAt(0)!='e'   && sor7oszlop12Nev.charAt(0)!='n' ) {
                feltamasztalak( sor7oszlop12Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });

        //----8sor
        palyaS8O1.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(8,1);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(81);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 8,1);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor8oszlop1Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 8,1);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor8oszlop1Nev.charAt(0)=='e' ) {
                lelassitalak( sor8oszlop1Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor8oszlop1Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor8oszlop1Nev, 8,1);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 8,1);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor8oszlop1Nev.charAt(0)!='e'   &&  sor8oszlop1Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor8oszlop1Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor8oszlop1Nev.charAt(0)!='e'   &&  sor8oszlop1Nev.charAt(0)!='n' ) {
                feltamasztalak( sor8oszlop1Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS8O2.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(8,2);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(82);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 8,2);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor8oszlop2Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 8,2);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor8oszlop2Nev.charAt(0)=='e' ) {
                lelassitalak( sor8oszlop2Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor8oszlop2Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor8oszlop2Nev, 8,2);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 8,2);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor8oszlop2Nev.charAt(0)!='e'   &&  sor8oszlop2Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor8oszlop2Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor8oszlop2Nev.charAt(0)!='e'   &&  sor8oszlop2Nev.charAt(0)!='n' ) {
                feltamasztalak( sor8oszlop2Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS8O3.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(8,3);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(83);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 8,3);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor8oszlop3Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 8,3);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor8oszlop3Nev.charAt(0)=='e' ) {
                lelassitalak( sor8oszlop3Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor8oszlop3Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor8oszlop3Nev, 8,3);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 8,3);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor8oszlop3Nev.charAt(0)!='e'   &&  sor8oszlop3Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor8oszlop3Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor8oszlop3Nev.charAt(0)!='e'   &&  sor8oszlop3Nev.charAt(0)!='n' ) {
                feltamasztalak( sor8oszlop3Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS8O4.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(8,4);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(84);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 8,4);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor8oszlop4Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 8,4);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor8oszlop4Nev.charAt(0)=='e' ) {
                lelassitalak( sor8oszlop4Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor8oszlop4Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor8oszlop4Nev, 8,4);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 8,4);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor8oszlop4Nev.charAt(0)!='e'   &&  sor8oszlop4Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor8oszlop4Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor8oszlop4Nev.charAt(0)!='e'   &&  sor8oszlop4Nev.charAt(0)!='n' ) {
                feltamasztalak( sor8oszlop4Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS8O5.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(8,5);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(85);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 8,5);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor8oszlop5Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 8,5);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor8oszlop5Nev.charAt(0)=='e' ) {
                lelassitalak( sor8oszlop5Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor8oszlop5Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor8oszlop5Nev, 8,5);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 8,5);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor8oszlop5Nev.charAt(0)!='e'   &&  sor8oszlop5Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor8oszlop5Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor8oszlop5Nev.charAt(0)!='e'   &&  sor8oszlop5Nev.charAt(0)!='n' ) {
                feltamasztalak( sor8oszlop5Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS8O8.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(8,8);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(88);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 8,8);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor8oszlop8Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 8,8);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor8oszlop8Nev.charAt(0)=='e' ) {
                lelassitalak( sor8oszlop8Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor8oszlop8Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor8oszlop8Nev, 8,8);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 8,8);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor8oszlop8Nev.charAt(0)!='e'   &&  sor8oszlop8Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor8oszlop8Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor8oszlop8Nev.charAt(0)!='e'   &&  sor8oszlop8Nev.charAt(0)!='n' ) {
                feltamasztalak( sor8oszlop8Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS8O9.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(8,9);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(89);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 8,9);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor8oszlop9Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 8,9);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor8oszlop9Nev.charAt(0)=='e' ) {
                lelassitalak( sor8oszlop9Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor8oszlop9Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor8oszlop9Nev, 8,9);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 8,9);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor8oszlop9Nev.charAt(0)!='e'   &&  sor8oszlop9Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor8oszlop9Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor8oszlop9Nev.charAt(0)!='e'   &&  sor8oszlop9Nev.charAt(0)!='n' ) {
                feltamasztalak( sor8oszlop9Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS8O10.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(8,10);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(810);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 8,10);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor8oszlop10Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 8,10);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva && sor8oszlop10Nev.charAt(0)=='e' ) {
                lelassitalak( sor8oszlop10Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva && sor8oszlop10Nev.charAt(0)=='e' ) {
                villamcsapasElsutese(sor8oszlop10Nev,8,10);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese(8,10);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  && sor8oszlop10Nev.charAt(0)!='e'   && sor8oszlop10Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor8oszlop10Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  && sor8oszlop10Nev.charAt(0)!='e'   && sor8oszlop10Nev.charAt(0)!='n' ) {
                feltamasztalak( sor8oszlop10Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS8O11.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(8,11);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(811);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 8,11);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor8oszlop11Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 8,11);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva && sor8oszlop11Nev.charAt(0)=='e' ) {
                lelassitalak( sor8oszlop11Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva && sor8oszlop11Nev.charAt(0)=='e' ) {
                villamcsapasElsutese(sor8oszlop11Nev,8,11);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese(8,11);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  && sor8oszlop11Nev.charAt(0)!='e'   && sor8oszlop11Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor8oszlop11Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  && sor8oszlop11Nev.charAt(0)!='e'   && sor8oszlop11Nev.charAt(0)!='n' ) {
                feltamasztalak( sor8oszlop11Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS8O12.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(8,12);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(812);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 8,12);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor8oszlop12Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 8,12);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva && sor8oszlop12Nev.charAt(0)=='e' ) {
                lelassitalak( sor8oszlop12Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva && sor8oszlop12Nev.charAt(0)=='e' ) {
                villamcsapasElsutese(sor8oszlop12Nev,8,12);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese(8,12);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  && sor8oszlop12Nev.charAt(0)!='e'   && sor8oszlop12Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor8oszlop12Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  && sor8oszlop12Nev.charAt(0)!='e'   && sor8oszlop12Nev.charAt(0)!='n' ) {
                feltamasztalak( sor8oszlop12Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });

        //----9sor
        palyaS9O1.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(9,1);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(91);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 9,1);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor9oszlop1Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 9,1);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor9oszlop1Nev.charAt(0)=='e' ) {
                lelassitalak( sor9oszlop1Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor9oszlop1Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor9oszlop1Nev, 9,1);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 9,1);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor9oszlop1Nev.charAt(0)!='e'   &&  sor9oszlop1Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor9oszlop1Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor9oszlop1Nev.charAt(0)!='e'   &&  sor9oszlop1Nev.charAt(0)!='n' ) {
                feltamasztalak( sor9oszlop1Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS9O2.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(9,2);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(92);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 9,2);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor9oszlop2Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 9,2);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor9oszlop2Nev.charAt(0)=='e' ) {
                lelassitalak( sor9oszlop2Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor9oszlop2Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor9oszlop2Nev, 9,2);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 9,2);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor9oszlop2Nev.charAt(0)!='e'   &&  sor9oszlop2Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor9oszlop2Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor9oszlop2Nev.charAt(0)!='e'   &&  sor9oszlop2Nev.charAt(0)!='n' ) {
                feltamasztalak( sor9oszlop2Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS9O5.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(9,5);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(95);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 9,5);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor9oszlop5Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 9,5);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor9oszlop5Nev.charAt(0)=='e' ) {
                lelassitalak( sor9oszlop5Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor9oszlop5Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor9oszlop5Nev, 9,5);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 9,5);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor9oszlop5Nev.charAt(0)!='e'   &&  sor9oszlop5Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor9oszlop5Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor9oszlop5Nev.charAt(0)!='e'   &&  sor9oszlop5Nev.charAt(0)!='n' ) {
                feltamasztalak( sor9oszlop5Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS9O6.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(9,6);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(96);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 9,6);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor9oszlop6Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 9,6);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor9oszlop6Nev.charAt(0)=='e' ) {
                lelassitalak( sor9oszlop6Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor9oszlop6Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor9oszlop6Nev, 9,6);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 9,6);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor9oszlop6Nev.charAt(0)!='e'   &&  sor9oszlop6Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor9oszlop6Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor9oszlop6Nev.charAt(0)!='e'   &&  sor9oszlop6Nev.charAt(0)!='n' ) {
                feltamasztalak( sor9oszlop6Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS9O7.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(9,7);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(97);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 9,7);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor9oszlop7Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 9,7);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor9oszlop7Nev.charAt(0)=='e' ) {
                lelassitalak( sor9oszlop7Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor9oszlop7Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor9oszlop7Nev, 9,7);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 9,7);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor9oszlop7Nev.charAt(0)!='e'   &&  sor9oszlop7Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor9oszlop7Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor9oszlop7Nev.charAt(0)!='e'   &&  sor9oszlop7Nev.charAt(0)!='n' ) {
                feltamasztalak( sor9oszlop7Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS9O8.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(9,8);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(98);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 9,8);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor9oszlop8Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 9,8);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor9oszlop8Nev.charAt(0)=='e' ) {
                lelassitalak( sor9oszlop8Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor9oszlop8Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor9oszlop8Nev, 9,8);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 9,8);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor9oszlop8Nev.charAt(0)!='e'   &&  sor9oszlop8Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor9oszlop8Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor9oszlop8Nev.charAt(0)!='e'   &&  sor9oszlop8Nev.charAt(0)!='n' ) {
                feltamasztalak( sor9oszlop8Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS9O9.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(9,9);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(99);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 9,9);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor9oszlop9Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 9,9);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva  && sor9oszlop9Nev.charAt(0)=='e' ) {
                lelassitalak( sor9oszlop9Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva &&  sor9oszlop9Nev.charAt(0)=='e' ) {
                villamcsapasElsutese( sor9oszlop9Nev, 9,9);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese( 9,9);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  &&  sor9oszlop9Nev.charAt(0)!='e'   &&  sor9oszlop9Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor9oszlop9Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  &&  sor9oszlop9Nev.charAt(0)!='e'   &&  sor9oszlop9Nev.charAt(0)!='n' ) {
                feltamasztalak( sor9oszlop9Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS9O10.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(9,10);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(910);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 9,10);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor9oszlop10Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 9,10);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva && sor9oszlop10Nev.charAt(0)=='e' ) {
                lelassitalak( sor9oszlop10Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva && sor9oszlop10Nev.charAt(0)=='e' ) {
                villamcsapasElsutese(sor9oszlop10Nev,9,10);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese(9,10);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  && sor9oszlop10Nev.charAt(0)!='e'   && sor9oszlop10Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor9oszlop10Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  && sor9oszlop10Nev.charAt(0)!='e'   && sor9oszlop10Nev.charAt(0)!='n' ) {
                feltamasztalak( sor9oszlop10Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS9O11.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(9,11);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(911);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 9,11);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor9oszlop11Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 9,11);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva && sor9oszlop11Nev.charAt(0)=='e' ) {
                lelassitalak( sor9oszlop11Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva && sor9oszlop11Nev.charAt(0)=='e' ) {
                villamcsapasElsutese(sor9oszlop11Nev,9,11);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese(9,11);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  && sor9oszlop11Nev.charAt(0)!='e'   && sor9oszlop11Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor9oszlop11Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  && sor9oszlop11Nev.charAt(0)!='e'   && sor9oszlop11Nev.charAt(0)!='n' ) {
                feltamasztalak( sor9oszlop11Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS9O12.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(9,12);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(912);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 9,12);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor9oszlop12Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 9,12);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva && sor9oszlop12Nev.charAt(0)=='e' ) {
                lelassitalak( sor9oszlop12Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva && sor9oszlop12Nev.charAt(0)=='e' ) {
                villamcsapasElsutese(sor9oszlop12Nev,9,12);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese(9,12);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  && sor9oszlop12Nev.charAt(0)!='e'   && sor9oszlop12Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor9oszlop12Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  && sor9oszlop12Nev.charAt(0)!='e'   && sor9oszlop12Nev.charAt(0)!='n' ) {
                feltamasztalak( sor9oszlop12Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });

        //----10sor
        palyaS10O1.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(10,1);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(101);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 10,1);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor10oszlop1Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 10,1);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva && sor10oszlop1Nev.charAt(0)=='e' ) {
                lelassitalak( sor10oszlop1Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva && sor10oszlop1Nev.charAt(0)=='e' ) {
                villamcsapasElsutese(sor10oszlop1Nev,10,1);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese(10,1);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  && sor10oszlop1Nev.charAt(0)!='e'   && sor10oszlop1Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor10oszlop1Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  && sor10oszlop1Nev.charAt(0)!='e'   && sor10oszlop1Nev.charAt(0)!='n' ) {
                feltamasztalak( sor10oszlop1Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS10O2.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(10,2);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(102);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 10,2);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor10oszlop2Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 10,2);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva && sor10oszlop2Nev.charAt(0)=='e' ) {
                lelassitalak( sor10oszlop2Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva && sor10oszlop2Nev.charAt(0)=='e' ) {
                villamcsapasElsutese(sor10oszlop2Nev,10,2);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese(10,2);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  && sor10oszlop2Nev.charAt(0)!='e'   && sor10oszlop2Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor10oszlop2Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  && sor10oszlop2Nev.charAt(0)!='e'   && sor10oszlop2Nev.charAt(0)!='n' ) {
                feltamasztalak( sor10oszlop2Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS10O5.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(10,5);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(105);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 10,5);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor10oszlop5Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 10,5);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva && sor10oszlop5Nev.charAt(0)=='e' ) {
                lelassitalak( sor10oszlop5Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva && sor10oszlop5Nev.charAt(0)=='e' ) {
                villamcsapasElsutese(sor10oszlop5Nev,10,5);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese(10,5);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  && sor10oszlop5Nev.charAt(0)!='e'   && sor10oszlop5Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor10oszlop5Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  && sor10oszlop5Nev.charAt(0)!='e'   && sor10oszlop5Nev.charAt(0)!='n' ) {
                feltamasztalak( sor10oszlop5Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS10O6.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(10,6);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(106);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 10,6);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor10oszlop6Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 10,6);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva && sor10oszlop6Nev.charAt(0)=='e' ) {
                lelassitalak( sor10oszlop6Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva && sor10oszlop6Nev.charAt(0)=='e' ) {
                villamcsapasElsutese(sor10oszlop6Nev,10,6);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese(10,6);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  && sor10oszlop6Nev.charAt(0)!='e'   && sor10oszlop6Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor10oszlop6Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  && sor10oszlop6Nev.charAt(0)!='e'   && sor10oszlop6Nev.charAt(0)!='n' ) {
                feltamasztalak( sor10oszlop6Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS10O7.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(10,7);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(107);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 10,7);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor10oszlop7Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 10,7);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva && sor10oszlop7Nev.charAt(0)=='e' ) {
                lelassitalak( sor10oszlop7Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva && sor10oszlop7Nev.charAt(0)=='e' ) {
                villamcsapasElsutese(sor10oszlop7Nev,10,7);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese(10,7);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  && sor10oszlop7Nev.charAt(0)!='e'   && sor10oszlop7Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor10oszlop7Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  && sor10oszlop7Nev.charAt(0)!='e'   && sor10oszlop7Nev.charAt(0)!='n' ) {
                feltamasztalak( sor10oszlop7Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS10O8.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(10,8);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(108);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 10,8);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor10oszlop8Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 10,8);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva && sor10oszlop8Nev.charAt(0)=='e' ) {
                lelassitalak( sor10oszlop8Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva && sor10oszlop8Nev.charAt(0)=='e' ) {
                villamcsapasElsutese(sor10oszlop8Nev,10,8);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese(10,8);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  && sor10oszlop8Nev.charAt(0)!='e'   && sor10oszlop8Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor10oszlop8Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  && sor10oszlop8Nev.charAt(0)!='e'   && sor10oszlop8Nev.charAt(0)!='n' ) {
                feltamasztalak( sor10oszlop8Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS10O9.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(10,9);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(109);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 10,9);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor10oszlop9Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 10,9);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva && sor10oszlop9Nev.charAt(0)=='e' ) {
                lelassitalak( sor10oszlop9Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva && sor10oszlop9Nev.charAt(0)=='e' ) {
                villamcsapasElsutese(sor10oszlop9Nev,10,9);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva) {
                tuzlabdaElsutese(10,9);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  && sor10oszlop9Nev.charAt(0)!='e'   && sor10oszlop9Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor10oszlop9Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  && sor10oszlop9Nev.charAt(0)!='e'   && sor10oszlop9Nev.charAt(0)!='n' ) {
                feltamasztalak( sor10oszlop9Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS10O10.addActionListener(e -> {
            if(lepesGombBenyomva) {
            lepesMegtetele(10,10);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(1010);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 10,10);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor10oszlop10Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 10,10);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva && sor10oszlop10Nev.charAt(0)=='e' ) {
                lelassitalak(sor10oszlop10Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva && sor10oszlop10Nev.charAt(0)=='e' ) {
                villamcsapasElsutese(sor10oszlop10Nev,10,10);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva ) {
                tuzlabdaElsutese(10,10);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  && sor10oszlop10Nev.charAt(0)!='e'   && sor10oszlop10Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor10oszlop10Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  && sor10oszlop10Nev.charAt(0)!='e'  && sor10oszlop10Nev.charAt(0)!='n' ) {
                feltamasztalak( sor10oszlop10Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS10O11.addActionListener(e -> {
            if(lepesGombBenyomva  && sor10oszlop10Nev.charAt(0)!='e' ) {
            lepesMegtetele(10,11);
            lepesGombBenyomva=false;
                if (pozMegvaltozasa) {
                    pozMegvaltozasa=false;
                    pozMegvaltoztatasa(1011);
                }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 10,11);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor10oszlop11Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 10,11);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva && sor10oszlop11Nev.charAt(0)=='e' ) {
                lelassitalak(sor10oszlop11Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva && sor10oszlop11Nev.charAt(0)=='e' ) {
                villamcsapasElsutese(sor10oszlop11Nev,10,11);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva ) {
                tuzlabdaElsutese(10,11);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  && sor10oszlop11Nev.charAt(0)!='e'   && sor10oszlop11Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor10oszlop11Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  && sor10oszlop11Nev.charAt(0)!='e'  && sor10oszlop11Nev.charAt(0)!='n' ) {
                feltamasztalak( sor10oszlop11Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
        palyaS10O12.addActionListener(e -> {
            if(lepesGombBenyomva  && sor10oszlop11Nev.charAt(0)!='e' ) {
                lepesMegtetele(10,12);
                lepesGombBenyomva=false;
                    if (pozMegvaltozasa) {
                        pozMegvaltozasa=false;
                        pozMegvaltoztatasa(1012);
                    }
            }else if (tamadasGombBenyomva) {
                megtamadlak( 10,12);
                tamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTamadasGombBenyomva && sor10oszlop12Nev.charAt(0)=='e' && elsoHely.charAt(0)!='e' && !HosTamad.hosVolt) {
                megtamadhato( 10,12);
                HosTamad.hosVolt=true;
                hosTamadasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosLassitasGombBenyomva && sor10oszlop12Nev.charAt(0)=='e' ) {
                lelassitalak(sor10oszlop12Nev);
                HosTamad.hosVolt=true;
                hosLassitasGombBenyomva=false;
            }else if (hosVillamcsapasGombBenyomva && sor10oszlop12Nev.charAt(0)=='e' ) {
                villamcsapasElsutese(sor10oszlop12Nev,10,12);
                HosTamad.hosVolt=true;
                hosVillamcsapasGombBenyomva=false;
                gyozelemVereseg();
            }else if (hosTuzlabdaGombBenyomva ) {
                tuzlabdaElsutese(10,12);
                HosTamad.hosVolt=true;
            }else if (hosIstenieroGombBenyomva  && sor10oszlop12Nev.charAt(0)!='e'   && sor10oszlop12Nev.charAt(0)!='n' ) {
                istenieroAldasa( sor10oszlop12Nev);
                HosTamad.hosVolt=true;
                hosIstenieroGombBenyomva=false;
            }else if (hosFeltamasztasGombBenyomva  && sor10oszlop12Nev.charAt(0)!='e'  && sor10oszlop12Nev.charAt(0)!='n' ) {
                feltamasztalak( sor10oszlop12Nev);
                HosTamad.hosVolt=true;
                hosFeltamasztasGombBenyomva=false;
            }
            sorrendFrissites();
             if (!vege) {
                        ellenfelAlapok();
                    }
        });
    }

    public static Palya_Lepes getInstance()
    {
        if (instance == null)
            instance = new Palya_Lepes();

        return instance;
    }

    public static boolean ellenfel=false;
    public static boolean pozMegvaltozasa=false;

    public void palyaGomobokLetetel(int xPoz,int yPoz, JButton palyaSO) {

        palyaSO.setBounds(xPoz,yPoz, 74, 44);
        palyaSO.setOpaque(false);
        palyaSO.setContentAreaFilled(false);
        palyaSO.setBorderPainted(false);
        palyaSO.setFocusable(false);
        palyaSO.setIcon(lathatatlan);

        alapcsata.add(palyaSO);

    }

    public static void lepes(int sor, int oszlop, String egyseg) {

        int xKep=0,yKep=0,xIras=0,yIras=0;

        boolean b1 = oszlop == 1 || oszlop == 2 || oszlop == 3 || oszlop == 4 || oszlop == 5 || oszlop == 6
                || oszlop == 7 || oszlop == 8 || oszlop == 9 || oszlop == 10 || oszlop == 11 || oszlop == 12;

        if (!ellenfel) {

            if (oszlop == 1) {
                xKep = 284 + (oszlop * 16);
                xIras = 354 + (oszlop * 16);
            } else if (oszlop == 2) {
                xKep = 342 + (oszlop * 16);
                xIras = 412 + (oszlop * 16);
            } else if (oszlop == 3) {
                xKep = 400 + (oszlop * 16);
                xIras = 470 + (oszlop * 16);
            } else if (oszlop == 4) {
                xKep = 458 + (oszlop * 16);
                xIras = 528 + (oszlop * 16);
            } else if (oszlop == 5) {
                xKep = 516 + (oszlop * 16);
                xIras = 586 + (oszlop * 16);
            } else if (oszlop == 6) {
                xKep = 574 + (oszlop * 16);
                xIras = 644 + (oszlop * 16);
            } else if (oszlop == 7) {
                xKep = 632 + (oszlop * 16);
                xIras = 702 + (oszlop * 16);
            } else if (oszlop == 8) {
                xKep = 690 + (oszlop * 16);
                xIras = 760 + (oszlop * 16);
            } else if (oszlop == 9) {
                xKep = 748 + (oszlop * 16);
                xIras = 818 + (oszlop * 16);
            } else if (oszlop == 10) {
                xKep = 806 + (oszlop * 16);
                xIras = 876 + (oszlop * 16);
            } else if (oszlop == 11) {
                xKep = 864 + (oszlop * 16);
                xIras = 934 + (oszlop * 16);
            } else if (oszlop == 12) {
                xKep = 922 + (oszlop * 16);
                xIras = 992 + (oszlop * 16);
            }

            if (sor == 1 && b1) {
                yKep = 26 + (sor * 4);
                yIras = 91 + (sor * 4);
            } else if (sor == 2 && b1) {
                yKep = 65 + (sor * 4);
                yIras = 129 + (sor * 4);
            } else if (sor == 3 && b1) {
                yKep = 105 + (sor * 4);
                yIras = 169 + (sor * 4);
            } else if (sor == 4 && b1) {
                yKep = 144 + (sor * 4);
                yIras = 208 + (sor * 4);
            } else if (sor == 5 && b1) {
                yKep = 183 + (sor * 4);
                yIras = 247 + (sor * 4);
            } else if (sor == 6 && b1) {
                yKep = 222 + (sor * 4);
                yIras = 287 + (sor * 4);
            } else if (sor == 7 && b1) {
                yKep = 262 + (sor * 4);
                yIras = 326 + (sor * 4);
            } else if (sor == 8 && b1) {
                yKep = 302 + (sor * 4);
                yIras = 366 + (sor * 4);
            } else if (sor == 9 && b1) {
                yKep = 340 + (sor * 4);
                yIras = 404 + (sor * 4);
            } else if (sor == 10 && b1) {
                yKep = 380 + (sor * 4);
                yIras = 444 + (sor * 4);
            }
            
        }else {

            if (oszlop == 1) {
                xKep = 262 + (oszlop * 16);
                xIras = 272 + (oszlop * 16);
            } else if (oszlop == 2) {
                xKep = 320 + (oszlop * 16);
                xIras = 330 + (oszlop * 16);
            } else if (oszlop == 3) {
                xKep = 378 + (oszlop * 16);
                xIras = 388 + (oszlop * 16);
            } else if (oszlop == 4) {
                xKep = 436 + (oszlop * 16);
                xIras = 446 + (oszlop * 16);
            } else if (oszlop == 5) {
                xKep = 494 + (oszlop * 16);
                xIras = 504 + (oszlop * 16);
            } else if (oszlop == 6) {
                xKep = 552 + (oszlop * 16);
                xIras = 562 + (oszlop * 16);
            } else if (oszlop == 7) {
                xKep = 610 + (oszlop * 16);
                xIras = 620 + (oszlop * 16);
            } else if (oszlop == 8) {
                xKep = 666 + (oszlop * 16);
                xIras = 678 + (oszlop * 16);
            } else if (oszlop == 9) {
                xKep = 725 + (oszlop * 16);
                xIras = 736 + (oszlop * 16);
            } else if (oszlop == 10) {
                xKep = 784 + (oszlop * 16);
                xIras = 794 + (oszlop * 16);
            } else if (oszlop == 11) {
                xKep = 842 + (oszlop * 16);
                xIras = 852 + (oszlop * 16);
            } else if (oszlop == 12) {
                xKep = 900 + (oszlop * 16);
                xIras = 910 + (oszlop * 16);
            }

            if (sor == 1 && b1) {
                yKep = 26 + (sor * 4);
                yIras = 102 + (sor * 4);
            } else if (sor == 2 && b1) {
                yKep = 65 + (sor * 4);
                yIras = 140 + (sor * 4);
            } else if (sor == 3 && b1) {
                yKep = 105 + (sor * 4);
                yIras = 180 + (sor * 4);
            } else if (sor == 4 && b1) {
                yKep = 144 + (sor * 4);
                yIras = 219 + (sor * 4);
            } else if (sor == 5 && b1) {
                yKep = 183 + (sor * 4);
                yIras = 258 + (sor * 4);
            } else if (sor == 6 && b1) {
                yKep = 222 + (sor * 4);
                yIras = 297 + (sor * 4);
            } else if (sor == 7 && b1) {
                yKep = 262 + (sor * 4);
                yIras = 337 + (sor * 4);
            } else if (sor == 8 && b1) {
                yKep = 302 + (sor * 4);
                yIras = 377 + (sor * 4);
            } else if (sor == 9 && b1) {
                yKep = 340 + (sor * 4);
                yIras = 416 + (sor * 4);
            } else if (sor == 10 && b1) {
                yKep = 380 + (sor * 4);
                yIras = 456 + (sor * 4);
            }
        }

        switch (egyseg) {
            case "harcp", "rapt" -> {
                egysegekSorrend.remove(egysegIras5);
                egysegekSorrend.remove(egysegL5TestKep);
                egysegekSorrend.setBounds(0, 0, 1250, 600);
                if (egyseg.equals("harcp")) {
                    egyseg = "HarcosPap";
                } else {
                    egyseg = "RaptorLovas";
                }
                System.out.println(egyseg + " elhelyezve az X: " + oszlop + " , Y: " + sor + " poziciora.");
                egysegNeve(egyseg);
                informacioErtek.setText(egyseg + " elhelyezve az X: " + oszlop + " , Y: " + sor + " pozícióra.");
                egysegErtek5.setFont(fontKicsi);
                egysegErtek5.setForeground(new Color(255, 255, 255));
                egysegIras5.setBounds(xIras, yIras, 20, 15);
                egysegIras5.add(egysegErtek5);
                egysegIras5.setOpaque(false);
                egysegIras5.repaint();
                egysegL5TestKep.add(egysegL5TestKepe);
                egysegL5TestKep.setBounds(xKep, yKep, 100, 100);
                egysegL5TestKep.setOpaque(false);
                EgysegLathatosag.lathatosagSorrend(egysegIras5, egysegL5TestKep, oszlop, sor);
                ablakCsata.add(egysegekSorrend);
                elsoAlkalommal0 = false;
                JatekAblak.jatekAblak();
            }
            case "eharcp", "erapt" -> {
                egysegekSorrend.remove(ellenfelEgysegIras5);
                egysegekSorrend.remove(ellenfelEgysegL5Kep);
                egysegekSorrend.setBounds(0, 0, 1250, 600);
                if (egyseg.equals("eharcp")) {
                    egyseg = "HarcosPap";
                } else {
                    egyseg = "RaptorLovas";
                }
                System.out.println("Ellenfel "+egyseg + " elhelyezve az X: " + oszlop + " , Y: " + sor + " poziciora.");
                egysegNeve(egyseg);
                informacioErtek.setText("Ellenfél "+egyseg + " elhelyezve az X: " + oszlop + " , Y: " + sor + " pozícióra.");
                ellenfelEgysegErtek5.setFont(fontKicsi);
                ellenfelEgysegErtek5.setForeground(new Color(255, 255, 255));
                ellenfelEgysegIras5.setBounds(xIras, yIras, 20, 15);
                ellenfelEgysegIras5.add(ellenfelEgysegErtek5);
                ellenfelEgysegIras5.setOpaque(false);
                ellenfelEgysegIras5.repaint();
                ellenfelEgysegL5Kep.setBounds(xKep, yKep, 100, 100);
                ellenfelEgysegL5Kep.setOpaque(false);
                ellenfelEgysegL5Kep.add(ellenfelEgysegL5Kepe);
                EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras5, ellenfelEgysegL5Kep, oszlop, sor);
                ablakCsata.add(egysegekSorrend);
                elsoAlkalommal0 = false;
                JatekAblak.jatekAblak();
            }
            case "efegyv", "eorgy" -> {
                egysegekSorrend.remove(ellenfelEgysegIras4);
                egysegekSorrend.remove(ellenfelEgysegL4Kep);
                egysegekSorrend.setBounds(0, 0, 1250, 600);
                if (egysegEllenfelNegy.equals("efegyv")) {
                    egyseg = "Fegyvernok";
                } else {
                    egyseg = "Orgyilkos";
                }
                System.out.println("Ellenfel "+egyseg + " elhelyezve az X: " + oszlop + " , Y: " + sor + " poziciora.");
                egysegNeve(egyseg);
                informacioErtek.setText("Ellenfél "+egyseg + " elhelyezve az X: " + oszlop + " , Y: " + sor + " pozícióra.");
                ellenfelEgysegErtek4.setFont(fontKicsi);
                ellenfelEgysegErtek4.setForeground(new Color(255, 255, 255));
                ellenfelEgysegIras4.setBounds(xIras, yIras, 20, 15);
                ellenfelEgysegIras4.add(ellenfelEgysegErtek4);
                ellenfelEgysegIras4.setOpaque(false);
                ellenfelEgysegIras4.repaint();
                ellenfelEgysegL4Kep.setBounds(xKep, yKep, 100, 100);
                ellenfelEgysegL4Kep.setOpaque(false);
                ellenfelEgysegL4Kep.add(ellenfelEgysegL4Kepe);
                EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras4, ellenfelEgysegL4Kep, oszlop, sor);
                ablakCsata.add(egysegekSorrend);
                elsoAlkalommal0 = false;
                JatekAblak.jatekAblak();
            }
            case "fegyv", "orgy" -> {
                egysegekSorrend.remove(egysegIras4);
                egysegekSorrend.remove(egysegL4TestKep);
                egysegekSorrend.setBounds(0, 0, 1250, 600);
                if (egyseg.equals("fegyv")) {
                    egyseg = "Fegyvernok";
                } else {
                    egyseg = "Orgyilkos";
                }
                System.out.println(egyseg + " elhelyezve az X: " + oszlop + " , Y: " + sor + " poziciora.");
                egysegNeve(egyseg);
                informacioErtek.setText(egyseg + " elhelyezve az X: " + oszlop + " , Y: " + sor + " pozícióra.");
                egysegErtek4.setFont(fontKicsi);
                egysegErtek4.setForeground(new Color(255, 255, 255));
                egysegIras4.setBounds(xIras, yIras, 20, 15);
                egysegIras4.add(egysegErtek4);
                egysegIras4.setOpaque(false);
                egysegIras4.repaint();
                egysegL4TestKep.setBounds(xKep, yKep, 100, 100);
                egysegL4TestKep.setOpaque(false);
                egysegL4TestKep.add(egysegL4TestKepe);
                EgysegLathatosag.lathatosagSorrend(egysegIras4, egysegL4TestKep, oszlop, sor);
                ablakCsata.add(egysegekSorrend);
                elsoAlkalommal0 = false;
                JatekAblak.jatekAblak();
            }
            case "grif", "mino" -> {
                egysegekSorrend.remove(egysegIras3);
                egysegekSorrend.remove(egysegL3TestKep);
                egysegekSorrend.setBounds(0, 0, 1250, 600);
                if (egyseg.equals("grif")) {
                    egyseg = "Griff";
                } else {
                    egyseg = "Minotaurosz";
                }
                System.out.println(egyseg + " elhelyezve az X: " + oszlop + " , Y: " + sor + " poziciora.");
                egysegNeve(egyseg);
                informacioErtek.setText(egyseg + " elhelyezve az X: " + oszlop + " , Y: " + sor + " pozícióra.");
                egysegErtek3.setFont(fontKicsi);
                egysegErtek3.setForeground(new Color(255, 255, 255));
                egysegIras3.setBounds(xIras, yIras, 20, 15);
                egysegIras3.add(egysegErtek3);
                egysegIras3.setOpaque(false);
                egysegIras3.repaint();
                egysegL3TestKep.setBounds(xKep, yKep, 100, 100);
                egysegL3TestKep.setOpaque(false);
                egysegL3TestKep.add(egysegL3TestKepe);
                EgysegLathatosag.lathatosagSorrend(egysegIras3, egysegL3TestKep, oszlop, sor);
                ablakCsata.add(egysegekSorrend);
                elsoAlkalommal0 = false;
                JatekAblak.jatekAblak();
            }
            case "egrif", "emino" -> {
                egysegekSorrend.remove(ellenfelEgysegIras3);
                egysegekSorrend.remove(ellenfelEgysegL3Kep);
                egysegekSorrend.setBounds(0, 0, 1250, 600);
                if (egyseg.equals("egrif")) {
                    egyseg = "Griff";
                } else {
                    egyseg = "Minotaurosz";
                }
                System.out.println("Ellenfel "+egyseg + " elhelyezve az X: " + oszlop + " , Y: " + sor + " poziciora.");
                egysegNeve(egyseg);
                informacioErtek.setText("Ellenfél "+egyseg + " elhelyezve az X: " + oszlop + " , Y: " + sor + " pozícióra.");
                ellenfelEgysegErtek3.setFont(fontKicsi);
                ellenfelEgysegErtek3.setForeground(new Color(255, 255, 255));
                ellenfelEgysegIras3.setBounds(xIras, yIras, 20, 15);
                ellenfelEgysegIras3.add(ellenfelEgysegErtek3);
                ellenfelEgysegIras3.setOpaque(false);
                ellenfelEgysegIras3.repaint();
                ellenfelEgysegL3Kep.setBounds(xKep, yKep, 100, 100);
                ellenfelEgysegL3Kep.setOpaque(false);
                ellenfelEgysegL3Kep.add(ellenfelEgysegL3Kepe);
                EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras3, ellenfelEgysegL3Kep, oszlop, sor);
                ablakCsata.add(egysegekSorrend);
                elsoAlkalommal0 = false;
                JatekAblak.jatekAblak();
            }
            case "ijas", "felder" -> {
                egysegekSorrend.remove(egysegIras2);
                egysegekSorrend.remove(egysegL2TestKep);
                egysegekSorrend.setBounds(0, 0, 1250, 600);
                if (egyseg.equals("ijas")) {
                    egyseg = "Ijas";
                } else {
                    egyseg = "Felderito";
                }
                System.out.println(egyseg + " elhelyezve az X: " + oszlop + " , Y: " + sor + " poziciora.");
                egysegNeve(egyseg);
                informacioErtek.setText(egyseg + " elhelyezve az X: " + oszlop + " , Y: " + sor + " pozícióra.");
                egysegErtek2.setFont(fontKicsi);
                egysegErtek2.setForeground(new Color(255, 255, 255));
                egysegIras2.setBounds(xIras, yIras, 20, 15);
                egysegIras2.add(egysegErtek2);
                egysegIras2.setOpaque(false);
                egysegIras2.repaint();
                egysegL2TestKep.setBounds(xKep, yKep, 100, 100);
                egysegL2TestKep.setOpaque(false);
                egysegL2TestKep.add(egysegL2TestKepe);
                EgysegLathatosag.lathatosagSorrend(egysegIras2, egysegL2TestKep, oszlop, sor);
                ablakCsata.add(egysegekSorrend);
                elsoAlkalommal0 = false;
                JatekAblak.jatekAblak();
            }
            case "eijas", "efelder" -> {
                egysegekSorrend.remove(ellenfelEgysegIras2);
                egysegekSorrend.remove(ellenfelEgysegL2Kep);
                egysegekSorrend.setBounds(0, 0, 1250, 600);
                if (egyseg.equals("eijas")) {
                    egyseg = "Ijasz";
                } else {
                    egyseg = "Felderito";
                }
                System.out.println("Ellenfel "+egyseg + " elhelyezve az X: " + oszlop + " , Y: " + sor + " poziciora.");
                egysegNeve(egyseg);
                informacioErtek.setText("Ellenfél "+egyseg + " elhelyezve az X: " + oszlop + " , Y: " + sor + " pozícióra.");
                ellenfelEgysegErtek2.setFont(fontKicsi);
                ellenfelEgysegErtek2.setForeground(new Color(255, 255, 255));
                ellenfelEgysegIras2.setBounds(xIras, yIras, 20, 15);
                ellenfelEgysegIras2.add(ellenfelEgysegErtek2);
                ellenfelEgysegIras2.setOpaque(false);
                ellenfelEgysegIras2.repaint();
                ellenfelEgysegL2Kep.setBounds(xKep, yKep, 100, 100);
                ellenfelEgysegL2Kep.setOpaque(false);
                ellenfelEgysegL2Kep.add(ellenfelEgysegL2Kepe);
                EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras2, ellenfelEgysegL2Kep, oszlop, sor);
                ablakCsata.add(egysegekSorrend);
                elsoAlkalommal0 = false;
                JatekAblak.jatekAblak();
            }
            case "foldmuv", "csont" -> {
                egysegekSorrend.remove(egysegIras1);
                egysegekSorrend.remove(egysegL1TestKep);
                egysegekSorrend.setBounds(0, 0, 1250, 600);
                if (egyseg.equals("foldmuv")) {
                    egyseg = "Foldmuves";
                } else {
                    egyseg = "Csontvaz";
                }
                System.out.println(egyseg + " elhelyezve az X: " + oszlop + " , Y: " + sor + " poziciora.");
                egysegNeve(egyseg);
                informacioErtek.setText(egyseg + " elhelyezve az X: " + oszlop + " , Y: " + sor + " pozícióra.");
                egysegErtek1.setFont(fontKicsi);
                egysegErtek1.setForeground(new Color(255, 255, 255));
                egysegIras1.setBounds(xIras, yIras, 20, 15);
                egysegIras1.add(egysegErtek1);
                egysegIras1.setOpaque(false);
                egysegIras1.repaint();
                egysegL1TestKep.setBounds(xKep, yKep, 100, 100);
                egysegL1TestKep.setOpaque(false);
                egysegL1TestKep.add(egysegL1TestKepe);
                EgysegLathatosag.lathatosagSorrend(egysegIras1, egysegL1TestKep, oszlop, sor);
                ablakCsata.add(egysegekSorrend);
                elsoAlkalommal0 = false;
                JatekAblak.jatekAblak();
            }
            case "efoldmuv", "ecsont" -> {
                egysegekSorrend.remove(ellenfelEgysegIras1);
                egysegekSorrend.remove(ellenfelEgysegL1Kep);
                egysegekSorrend.setBounds(0, 0, 1250, 600);
                if (egyseg.equals("efoldm")) {
                    egyseg = "Foldmuves";
                } else {
                    egyseg = "Csontvaz";
                }
                System.out.println("Ellenfel "+egyseg + " elhelyezve az X: " + oszlop + " , Y: " + sor + " poziciora.");
                egysegNeve(egyseg);
                informacioErtek.setText("Ellenfél "+egyseg + " elhelyezve az X: " + oszlop + " , Y: " + sor + " pozícióra.");
                ellenfelEgysegErtek1.setFont(fontKicsi);
                ellenfelEgysegErtek1.setForeground(new Color(255, 255, 255));
                ellenfelEgysegIras1.setBounds(xIras, yIras, 20, 15);
                ellenfelEgysegIras1.add(ellenfelEgysegErtek1);
                ellenfelEgysegIras1.setOpaque(false);
                ellenfelEgysegIras1.repaint();
                ellenfelEgysegL1Kep.setBounds(xKep, yKep, 100, 100);
                ellenfelEgysegL1Kep.setOpaque(false);
                ellenfelEgysegL1Kep.add(ellenfelEgysegL1Kepe);
                EgysegLathatosag.lathatosagSorrend(ellenfelEgysegIras1, ellenfelEgysegL1Kep, oszlop, sor);
                ablakCsata.add(egysegekSorrend);
                elsoAlkalommal0 = false;
                JatekAblak.jatekAblak();
            }
            case "morLaszlo", "morLena" -> {
                elsoAlkalommal0 = false;
                JatekAblak.jatekAblak();
            }
        }
            regiPozOszlop= oszlop;
            regiPozSor= sor;
    }


    public static void lepesMegtetele(int sor,int oszlop) {

        sorrendKiVagy(elsoHely,EgysegSorKe0);

        switch (elsoHely) {
            case "foldmuv" -> {
                egyseg = "foldmuv";
                ellenfel = false;
            }
            case "efoldmuv" -> {
                egyseg = "efoldmuv";
                ellenfel = true;
            }
            case "erapt" -> {
                egyseg = "erapt";
                ellenfel = true;
            }
            case "rapt" -> {
                egyseg = "rapt";
                ellenfel = false;
            }
            case "orgy" -> {
                egyseg = "orgy";
                ellenfel = false;
            }
            case "eorgy" -> {
                egyseg = "eorgy";
                ellenfel = true;
            }
            case "mino" -> {
                egyseg = "mino";
                ellenfel = false;
            }
            case "felder" -> {
                egyseg = "felder";
                ellenfel = false;
            }
            case "efelder" -> {
                egyseg = "efelder";
                ellenfel = true;
            }
            case "csont" -> {
                egyseg = "csont";
                ellenfel = false;
            }
            case "ecsont" -> {
                egyseg = "ecsont";
                ellenfel = true;
            }
            case "ijas" -> {
                egyseg = "ijas";
                ellenfel = false;
            }
            case "eijas" -> {
                egyseg = "eijas";
                ellenfel = true;
            }
            case "egrif" -> {
                egyseg = "egrif";
                ellenfel = true;
            }
            case "grif" -> {
                egyseg = "grif";
                ellenfel = false;
            }
            case "efegyv" -> {
                egyseg = "efegyv";
                ellenfel = true;
            }
            case "fegyv" -> {
                egyseg = "fegyv";
                ellenfel = false;
            }
            case "eharcp" -> {
                egyseg = "eharcp";
                ellenfel = true;
            }
            case "harcp" -> {
                egyseg = "harcp";
                ellenfel = false;
            }
            case "emino" -> {
                egyseg = "emino";
                ellenfel = true;
            }
            case "morLaszlo" -> egyseg = "morLaszlo";
            case "morLena" -> egyseg = "morLena";
        }

        mehet=true;

        EgysegekNeEgymasra.holVagyKetto(oszlop, sor,egyseg);
        EgysegekNeEgymasra.holVagyEgy(oszlop, sor,egyseg);
        EgysegekNeEgymasra.neMenjenEgymasraVan(oszlop, sor,egyseg);

        if (egyseg.equals("morLaszlo") || egyseg.equals("morLena") ) {
            mehet=true;
        }

        if (mehet) {
                    tavolsag(regiPozSor,regiPozOszlop,sor,oszlop);
                    if (egysegSebessege>=tavolsag) {
                        ideNemIsLehetLepni(regiPozSor,regiPozOszlop);
                        engedelyezettLepes(sor,oszlop);
                        pozMegvaltozasa=true;
                    }else{
                        egysegNeve(elsoHely);
                        System.out.println(egysegNeve+" nem tud ide lepni.");
                        informacioErtek.setText(egysegNeve+" nem tud ide lépni.");
                        ideNemIsLehetLepni(sor,oszlop);
                        try {
                            sorrendKiszamitas();
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                    }
        }else {
            pozMegvaltozasa=false;


            switch (elsoHely) {
                case "foldmuv", "csont" -> elsoMegjeloles(elsoHely, elsoEgysegPoz);
                case "efoldmuv", "ecsont" -> elsoMegjeloles(elsoHely, elsoEllPoz);
                case "erapt", "eharcp" -> elsoMegjeloles(elsoHely, otodikEllPoz);
                case "rapt", "harcp" -> elsoMegjeloles(elsoHely, otodikEgysegPoz);
                case "orgy", "felder", "fegyv" -> elsoMegjeloles(elsoHely, negyedikEgysegPoz);
                case "eorgy", "efegyv" -> elsoMegjeloles(elsoHely, negyedikEllPoz);
                case "mino", "grif" -> elsoMegjeloles(elsoHely, harmadikEgysegPoz);
                case "efelder", "eijas" -> elsoMegjeloles(elsoHely, masodikEllPoz);
                case "ijas" -> elsoMegjeloles(elsoHely, masodikEgysegPoz);
                case "egrif", "emino" -> elsoMegjeloles(elsoHely, harmadikEllPoz);
                case "morLaszlo", "morLena" -> elsoMegjeloles(elsoHely, 10);
            }
        }
        mehet=true;
    }

    public static void engedelyezettLepes(int sor,int oszlop) {

        double ujErtek = moralSorrendTList.get(0);

        moralSorrendTList.remove(0);
        moralSorrendTList.add(ujErtek);


        hanyadikKor(elsoHely);
        korokKiirasa();

        try {
            Sorrend.sorrendKiszamitas();
        } catch (IllegalAccessException illegalAccessException) {
            illegalAccessException.printStackTrace();
        }

        Sorrend.elsoKepekLetetele(536,30);
        Sorrend.masodikKepekLetetele(536, 85);
        Sorrend.harmadikKepekLetetele(536, 140);
        Sorrend.negyedikKepekLetetele(536, 195);
        Sorrend.otodikKepekLetetele(536, 250);
        Sorrend.hatodikKepekLetetele(536, 305);
        Sorrend.hetedikKepekLetetele(536, 360);
        Sorrend.nyolcadikKepekLetetele(536, 415);
        Sorrend.kilencedikKepekLetetele(536, 470);
        Sorrend.tizedikKepekLetetele(536, 525);
        Sorrend.tizenegyedikKepekLetetele(536, 580);
        Sorrend.tizenkettedikKepekLetetele(536, 635);

        lepes(sor, oszlop,egyseg);

    }

    public static void pozMegvaltoztatasa(int poz) {

        switch (egyseg) {
            case "foldmuv", "csont" -> elsoEgysegPoz = poz;
            case "efoldmuv", "ecsont" -> elsoEllPoz = poz;
            case "erapt", "eharcp" -> otodikEllPoz = poz;
            case "rapt", "harcp" -> otodikEgysegPoz = poz;
            case "orgy", "felder", "fegyv" -> negyedikEgysegPoz = poz;
            case "eorgy", "efegyv" -> negyedikEllPoz = poz;
            case "mino", "grif" -> harmadikEgysegPoz = poz;
            case "efelder", "eijas" -> masodikEllPoz = poz;
            case "ijas" -> masodikEgysegPoz = poz;
            case "egrif", "emino" -> harmadikEllPoz = poz;
        }
    }


    public static void ideNemIsLehetLepni(int sor, int oszlop) {

        int poz=Integer.parseInt(oszlop + "" + sor);

            if (poz == 11) {
                sor1oszlop1 = false;
            } else if (poz == 12) {
                sor2oszlop1 = false;
            } else if (poz == 13) {
                sor3oszlop1 = false;
            } else if (poz == 14) {
                sor4oszlop1 = false;
            } else if (poz == 15) {
                sor5oszlop1 = false;
            } else if (poz == 16) {
                sor6oszlop1 = false;
            } else if (poz == 17) {
                sor7oszlop1 = false;
            } else if (poz == 18) {
                sor8oszlop1 = false;
            } else if (poz == 19) {
                sor9oszlop1 = false;
            } else if (poz == 110) {
                sor10oszlop1 = false;
            } else if (poz == 21) {
                sor1oszlop2 = false;
            } else if (poz == 22) {
                sor2oszlop2 = false;
            } else if (poz == 23) {
                sor3oszlop2 = false;
            } else if (poz == 24) {
                sor4oszlop2 = false;
            } else if (poz == 25) {
                sor5oszlop2 = false;
            } else if (poz == 26) {
                sor6oszlop2 = false;
            } else if (poz == 27) {
                sor7oszlop2 = false;
            } else if (poz == 28) {
                sor8oszlop2 = false;
            } else if (poz == 29) {
                sor9oszlop2 = false;
            } else if (poz == 210) {
                sor10oszlop2 = false;
            } else if (poz == 31) {
                sor1oszlop3 = false;
            } else if (poz == 32) {
                sor2oszlop3 = false;
            } else if (poz == 33) {
                sor3oszlop3 = false;
            } else if (poz == 34) {
                sor4oszlop3 = false;
            } else if (poz == 35) {
                sor5oszlop3 = false;
            } else if (poz == 36) {
                sor6oszlop3 = false;
            } else if (poz == 37) {
                sor7oszlop3 = false;
            } else if (poz == 38) {
                sor8oszlop3 = false;
            } else if (poz == 39) {
                sor9oszlop3 = false;
            } else if (poz == 310) {
                sor10oszlop3 = false;
            } else if (poz == 41) {
                sor1oszlop4 = false;
            } else if (poz == 42) {
                sor2oszlop4 = false;
            } else if (poz == 43) {
                sor3oszlop4 = false;
            } else if (poz == 44) {
                sor4oszlop4 = false;
            } else if (poz == 45) {
                sor5oszlop4 = false;
            } else if (poz == 46) {
                sor6oszlop4 = false;
            } else if (poz == 47) {
                sor7oszlop4 = false;
            } else if (poz == 48) {
                sor8oszlop4 = false;
            } else if (poz == 49) {
                sor9oszlop4 = false;
            } else if (poz == 410) {
                sor10oszlop4 = false;
            } else if (poz == 51) {
                sor1oszlop5 = false;
            } else if (poz == 52) {
                sor2oszlop5 = false;
            } else if (poz == 53) {
                sor3oszlop5 = false;
            } else if (poz == 54) {
                sor4oszlop5 = false;
            } else if (poz == 55) {
                sor5oszlop5 = false;
            } else if (poz == 56) {
                sor6oszlop5 = false;
            } else if (poz == 57) {
                sor7oszlop5 = false;
            } else if (poz == 58) {
                sor8oszlop5 = false;
            } else if (poz == 59) {
                sor9oszlop5 = false;
            } else if (poz == 510) {
                sor10oszlop5 = false;
            } else if (poz == 61) {
                sor1oszlop6 = false;
            } else if (poz == 62) {
                sor2oszlop6 = false;
            } else if (poz == 63) {
                sor3oszlop6 = false;
            } else if (poz == 64) {
                sor4oszlop6 = false;
            } else if (poz == 65) {
                sor5oszlop6 = false;
            } else if (poz == 66) {
                sor6oszlop6 = false;
            } else if (poz == 67) {
                sor7oszlop6 = false;
            } else if (poz == 68) {
                sor8oszlop6 = false;
            } else if (poz == 69) {
                sor9oszlop6 = false;
            } else if (poz == 610) {
                sor10oszlop6 = false;
            } else if (poz == 71) {
                sor1oszlop7 = false;
            } else if (poz == 72) {
                sor2oszlop7 = false;
            } else if (poz == 73) {
                sor3oszlop7 = false;
            } else if (poz == 74) {
                sor4oszlop7 = false;
            } else if (poz == 75) {
                sor5oszlop7 = false;
            } else if (poz == 76) {
                sor6oszlop7 = false;
            } else if (poz == 77) {
                sor7oszlop7 = false;
            } else if (poz == 78) {
                sor8oszlop7 = false;
            } else if (poz == 79) {
                sor9oszlop7 = false;
            } else if (poz == 710) {
                sor10oszlop7 = false;
            } else if (poz == 81) {
                sor1oszlop8 = false;
            } else if (poz == 82) {
                sor2oszlop8 = false;
            } else if (poz == 83) {
                sor3oszlop8 = false;
            } else if (poz == 84) {
                sor4oszlop8 = false;
            } else if (poz == 85) {
                sor5oszlop8 = false;
            } else if (poz == 86) {
                sor6oszlop8 = false;
            } else if (poz == 87) {
                sor7oszlop8 = false;
            } else if (poz == 88) {
                sor8oszlop8 = false;
            } else if (poz == 89) {
                sor9oszlop8 = false;
            } else if (poz == 810) {
                sor10oszlop8 = false;
            } else if (poz == 91) {
                sor1oszlop9 = false;
            } else if (poz == 92) {
                sor2oszlop9 = false;
            } else if (poz == 93) {
                sor3oszlop9 = false;
            } else if (poz == 94) {
                sor4oszlop9 = false;
            } else if (poz == 95) {
                sor5oszlop9 = false;
            } else if (poz == 96) {
                sor6oszlop9 = false;
            } else if (poz == 97) {
                sor7oszlop9 = false;
            } else if (poz == 98) {
                sor8oszlop9 = false;
            } else if (poz == 99) {
                sor9oszlop9 = false;
            } else if (poz == 910) {
                sor10oszlop9 = false;
            } else if (poz == 101) {
                sor1oszlop10 = false;
            } else if (poz == 102) {
                sor2oszlop10 = false;
            } else if (poz == 103) {
                sor3oszlop10 = false;
            } else if (poz == 104) {
                sor4oszlop10 = false;
            } else if (poz == 105) {
                sor5oszlop10 = false;
            } else if (poz == 106) {
                sor6oszlop10 = false;
            } else if (poz == 107) {
                sor7oszlop10 = false;
            } else if (poz == 108) {
                sor8oszlop10 = false;
            } else if (poz == 109) {
                sor9oszlop10 = false;
            } else if (poz == 1010) {
                sor10oszlop10 = false;
            } else if (poz == 111) {
                sor1oszlop11 = false;
            } else if (poz == 112) {
                sor2oszlop11 = false;
            } else if (poz == 113) {
                sor3oszlop11 = false;
            } else if (poz == 114) {
                sor4oszlop11 = false;
            } else if (poz == 115) {
                sor5oszlop11 = false;
            } else if (poz == 116) {
                sor6oszlop11 = false;
            } else if (poz == 117) {
                sor7oszlop11 = false;
            } else if (poz == 118) {
                sor8oszlop11 = false;
            } else if (poz == 119) {
                sor9oszlop11 = false;
            } else if (poz == 1110) {
                sor10oszlop11 = false;
            } else if (poz == 121) {
                sor1oszlop12 = false;
            } else if (poz == 122) {
                sor2oszlop12 = false;
            } else if (poz == 123) {
                sor3oszlop12 = false;
            } else if (poz == 124) {
                sor4oszlop12 = false;
            } else if (poz == 125) {
                sor5oszlop12 = false;
            } else if (poz == 126) {
                sor6oszlop12 = false;
            } else if (poz == 127) {
                sor7oszlop12 = false;
            } else if (poz == 128) {
                sor8oszlop12 = false;
            } else if (poz == 129) {
                sor9oszlop12 = false;
            } else if (poz == 1210) {
                sor10oszlop12 = false;
            }
    }

    public static void elozoPozTorlese(int poz) {


        if (poz == 11) {
            sor1oszlop1 = false;
        } else if (poz == 21) {
            sor2oszlop1 = false;
        } else if (poz == 31) {
            sor3oszlop1 = false;
        } else if (poz == 41) {
            sor4oszlop1 = false;
        } else if (poz == 51) {
            sor5oszlop1 = false;
        } else if (poz == 61) {
            sor6oszlop1 = false;
        } else if (poz == 71) {
            sor7oszlop1 = false;
        } else if (poz == 81) {
            sor8oszlop1 = false;
        } else if (poz == 91) {
            sor9oszlop1 = false;
        } else if (poz == 101) {
            sor10oszlop1 = false;
        } else if (poz == 12) {
            sor1oszlop2 = false;
        } else if (poz == 22) {
            sor2oszlop2 = false;
        } else if (poz == 32) {
            sor3oszlop2 = false;
        } else if (poz == 42) {
            sor4oszlop2 = false;
        } else if (poz == 52) {
            sor5oszlop2 = false;
        } else if (poz == 62) {
            sor6oszlop2 = false;
        } else if (poz == 72) {
            sor7oszlop2 = false;
        } else if (poz == 82) {
            sor8oszlop2 = false;
        } else if (poz == 92) {
            sor9oszlop2 = false;
        } else if (poz == 102) {
            sor10oszlop2 = false;
        } else if (poz == 13) {
            sor1oszlop3 = false;
        } else if (poz == 23) {
            sor2oszlop3 = false;
        } else if (poz == 33) {
            sor3oszlop3 = false;
        } else if (poz == 43) {
            sor4oszlop3 = false;
        } else if (poz == 53) {
            sor5oszlop3 = false;
        } else if (poz == 63) {
            sor6oszlop3 = false;
        } else if (poz == 73) {
            sor7oszlop3 = false;
        } else if (poz == 83) {
            sor8oszlop3 = false;
        } else if (poz == 93) {
            sor9oszlop3 = false;
        } else if (poz == 103) {
            sor10oszlop3 = false;
        } else if (poz == 14) {
            sor1oszlop4 = false;
        } else if (poz == 24) {
            sor2oszlop4 = false;
        } else if (poz == 34) {
            sor3oszlop4 = false;
        } else if (poz == 44) {
            sor4oszlop4 = false;
        } else if (poz == 54) {
            sor5oszlop4 = false;
        } else if (poz == 64) {
            sor6oszlop4 = false;
        } else if (poz == 74) {
            sor7oszlop4 = false;
        } else if (poz == 84) {
            sor8oszlop4 = false;
        } else if (poz == 94) {
            sor9oszlop4 = false;
        } else if (poz == 104) {
            sor10oszlop4 = false;
        } else if (poz == 15) {
            sor1oszlop5 = false;
        } else if (poz == 25) {
            sor2oszlop5 = false;
        } else if (poz == 35) {
            sor3oszlop5 = false;
        } else if (poz == 45) {
            sor4oszlop5 = false;
        } else if (poz == 55) {
            sor5oszlop5 = false;
        } else if (poz == 65) {
            sor6oszlop5 = false;
        } else if (poz == 75) {
            sor7oszlop5 = false;
        } else if (poz == 85) {
            sor8oszlop5 = false;
        } else if (poz == 95) {
            sor9oszlop5 = false;
        } else if (poz == 105) {
            sor10oszlop5 = false;
        } else if (poz == 16) {
            sor1oszlop6 = false;
        } else if (poz == 26) {
            sor2oszlop6 = false;
        } else if (poz == 36) {
            sor3oszlop6 = false;
        } else if (poz == 46) {
            sor4oszlop6 = false;
        } else if (poz == 56) {
            sor5oszlop6 = false;
        } else if (poz == 66) {
            sor6oszlop6 = false;
        } else if (poz == 76) {
            sor7oszlop6 = false;
        } else if (poz == 86) {
            sor8oszlop6 = false;
        } else if (poz == 96) {
            sor9oszlop6 = false;
        } else if (poz == 106) {
            sor10oszlop6 = false;
        } else if (poz == 17) {
            sor1oszlop7 = false;
        } else if (poz == 27) {
            sor2oszlop7 = false;
        } else if (poz == 37) {
            sor3oszlop7 = false;
        } else if (poz == 47) {
            sor4oszlop7 = false;
        } else if (poz == 57) {
            sor5oszlop7 = false;
        } else if (poz == 67) {
            sor6oszlop7 = false;
        } else if (poz == 77) {
            sor7oszlop7 = false;
        } else if (poz == 87) {
            sor8oszlop7 = false;
        } else if (poz == 97) {
            sor9oszlop7 = false;
        } else if (poz == 107) {
            sor10oszlop7 = false;
        } else if (poz == 18) {
            sor1oszlop8 = false;
        } else if (poz == 28) {
            sor2oszlop8 = false;
        } else if (poz == 38) {
            sor3oszlop8 = false;
        } else if (poz == 48) {
            sor4oszlop8 = false;
        } else if (poz == 58) {
            sor5oszlop8 = false;
        } else if (poz == 68) {
            sor6oszlop8 = false;
        } else if (poz == 78) {
            sor7oszlop8 = false;
        } else if (poz == 88) {
            sor8oszlop8 = false;
        } else if (poz == 98) {
            sor9oszlop8 = false;
        } else if (poz == 108) {
            sor10oszlop8 = false;
        } else if (poz == 19) {
            sor1oszlop9 = false;
        } else if (poz == 29) {
            sor2oszlop9 = false;
        } else if (poz == 39) {
            sor3oszlop9 = false;
        } else if (poz == 49) {
            sor4oszlop9 = false;
        } else if (poz == 59) {
            sor5oszlop9 = false;
        } else if (poz == 69) {
            sor6oszlop9 = false;
        } else if (poz == 79) {
            sor7oszlop9 = false;
        } else if (poz == 89) {
            sor8oszlop9 = false;
        } else if (poz == 99) {
            sor9oszlop9 = false;
        } else if (poz == 910) {
            sor10oszlop9 = false;
        } else if (poz == 110) {
            sor1oszlop10 = false;
        } else if (poz == 210) {
            sor2oszlop10 = false;
        } else if (poz == 310) {
            sor3oszlop10 = false;
        } else if (poz == 410) {
            sor4oszlop10 = false;
        } else if (poz == 510) {
            sor5oszlop10 = false;
        } else if (poz == 610) {
            sor6oszlop10 = false;
        } else if (poz == 710) {
            sor7oszlop10 = false;
        } else if (poz == 810) {
            sor8oszlop10 = false;
        } else if (poz == 910) {
            sor9oszlop10 = false;
        } else if (poz == 1010) {
            sor10oszlop10 = false;
        } else if (poz == 111) {
            sor1oszlop11 = false;
        } else if (poz == 211) {
            sor2oszlop11 = false;
        } else if (poz == 311) {
            sor3oszlop11 = false;
        } else if (poz == 411) {
            sor4oszlop11 = false;
        } else if (poz == 511) {
            sor5oszlop11 = false;
        } else if (poz == 611) {
            sor6oszlop11 = false;
        } else if (poz == 711) {
            sor7oszlop11 = false;
        } else if (poz == 811) {
            sor8oszlop11 = false;
        } else if (poz == 911) {
            sor9oszlop11 = false;
        } else if (poz == 1011) {
            sor10oszlop11 = false;
        } else if (poz == 112) {
            sor1oszlop12 = false;
        } else if (poz == 212) {
            sor2oszlop12 = false;
        } else if (poz == 312) {
            sor3oszlop12 = false;
        } else if (poz == 412) {
            sor4oszlop12 = false;
        } else if (poz == 512) {
            sor5oszlop12 = false;
        } else if (poz == 612) {
            sor6oszlop12 = false;
        } else if (poz == 712) {
            sor7oszlop12 = false;
        } else if (poz == 812) {
            sor8oszlop12 = false;
        } else if (poz == 912) {
            sor9oszlop12 = false;
        } else if (poz == 1012) {
            sor10oszlop12 = false;
        }
    }
}