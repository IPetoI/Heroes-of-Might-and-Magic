package Egysegek;

import javax.swing.*;

import static Egysegek.EgysegLetetel.egysegekSorrend;
import static Jatek.Sorrend.elsoHely;;

public class EgysegLathatosag {

    private static EgysegLathatosag instance = null;

    public static EgysegLathatosag getInstance() {
        if (instance == null)
            instance = new EgysegLathatosag();

        return instance;
    }

    public static void lathatosagSorrend(JPanel egysegIras, JPanel egysegKep, int oszlop, int sor) {

        int ertek=0;

        if (elsoHely.charAt(0) =='e') {

            if ((sor==10 && oszlop==1)) {
                ertek=10;
            }else if ((sor==9 && oszlop==1)) {
                ertek=9;
            }else if ((sor==8 && oszlop==1)) {
                ertek=8;
            }else if ((sor==7 && oszlop==1)) {
                ertek=7;
            }else if ((sor==6 && oszlop==1)) {
                ertek=6;
            }else if ((sor==5 && oszlop==1)) {
                ertek=5;
            }else if ((sor==4 && oszlop==1)) {
                ertek=4;
            }else if ((sor==3 && oszlop==1)) {
                ertek=3;
            }else if ((sor==2 && oszlop==1)) {
                ertek=2;
            }else if ((sor==1 && oszlop==1)) {
                ertek=1;
            }
            else if ((sor==10 && oszlop==2)) {
                ertek=20;
            }else if ((sor==9 && oszlop==2)) {
                ertek=19;
            }else if ((sor==8 && oszlop==2)) {
                ertek=18;
            }else if ((sor==7 && oszlop==2)) {
                ertek=17;
            }else if ((sor==6 && oszlop==2)) {
                ertek=16;
            }else if ((sor==5 && oszlop==2)) {
                ertek=15;
            }else if ((sor==4 && oszlop==2)) {
                ertek=14;
            }else if ((sor==3 && oszlop==2)) {
                ertek=13;
            }else if ((sor==2 && oszlop==2)) {
                ertek=12;
            }else if ((sor==1 && oszlop==2)) {
                ertek=11;
            }
            else if ((sor==10 && oszlop==3)) {
                ertek=30;
            }else if ((sor==9 && oszlop==3)) {
                ertek=29;
            }else if ((sor==8 && oszlop==3)) {
                ertek=28;
            }else if ((sor==7 && oszlop==3)) {
                ertek=27;
            }else if ((sor==6 && oszlop==3)) {
                ertek=26;
            }else if ((sor==5 && oszlop==3)) {
                ertek=25;
            }else if ((sor==4 && oszlop==3)) {
                ertek=24;
            }else if ((sor==3 && oszlop==3)) {
                ertek=23;
            }else if ((sor==2 && oszlop==3)) {
                ertek=22;
            }else if ((sor==1 && oszlop==3)) {
                ertek=21;
            }
            else if ((sor==10 && oszlop==4)) {
                ertek=40;
            }else if ((sor==9 && oszlop==4)) {
                ertek=39;
            }else if ((sor==8 && oszlop==4)) {
                ertek=38;
            }else if ((sor==7 && oszlop==4)) {
                ertek=37;
            }else if ((sor==6 && oszlop==4)) {
                ertek=36;
            }else if ((sor==5 && oszlop==4)) {
                ertek=35;
            }else if ((sor==4 && oszlop==4)) {
                ertek=34;
            }else if ((sor==3 && oszlop==4)) {
                ertek=33;
            }else if ((sor==2 && oszlop==4)) {
                ertek=32;
            }else if ((sor==1 && oszlop==4)) {
                ertek=31;
            }
            else if ((sor==10 && oszlop==5)) {
                ertek=50;
            }else if ((sor==9 && oszlop==5)) {
                ertek=49;
            }else if ((sor==8 && oszlop==5)) {
                ertek=48;
            }else if ((sor==7 && oszlop==5)) {
                ertek=47;
            }else if ((sor==6 && oszlop==5)) {
                ertek=46;
            }else if ((sor==5 && oszlop==5)) {
                ertek=45;
            }else if ((sor==4 && oszlop==5)) {
                ertek=44;
            }else if ((sor==3 && oszlop==5)) {
                ertek=43;
            }else if ((sor==2 && oszlop==5)) {
                ertek=42;
            }else if ((sor==1 && oszlop==5)) {
                ertek=41;
            }
            else if ((sor==10 && oszlop==6)) {
                ertek=60;
            }else if ((sor==9 && oszlop==6)) {
                ertek=59;
            }else if ((sor==8 && oszlop==6)) {
                ertek=58;
            }else if ((sor==7 && oszlop==6)) {
                ertek=57;
            }else if ((sor==6 && oszlop==6)) {
                ertek=56;
            }else if ((sor==5 && oszlop==6)) {
                ertek=55;
            }else if ((sor==4 && oszlop==6)) {
                ertek=54;
            }else if ((sor==3 && oszlop==6)) {
                ertek=53;
            }else if ((sor==2 && oszlop==6)) {
                ertek=52;
            }else if ((sor==1 && oszlop==6)) {
                ertek=51;
            }
            else if ((sor==10 && oszlop==7)) {
                ertek=70;
            }else if ((sor==9 && oszlop==7)) {
                ertek=69;
            }else if ((sor==8 && oszlop==7)) {
                ertek=68;
            }else if ((sor==7 && oszlop==7)) {
                ertek=67;
            }else if ((sor==6 && oszlop==7)) {
                ertek=66;
            }else if ((sor==5 && oszlop==7)) {
                ertek=65;
            }else if ((sor==4 && oszlop==7)) {
                ertek=64;
            }else if ((sor==3 && oszlop==7)) {
                ertek=63;
            }else if ((sor==2 && oszlop==7)) {
                ertek=62;
            }else if ((sor==1 && oszlop==7)) {
                ertek=61;
            }
            else if ((sor==10 && oszlop==8)) {
                ertek=80;
            }else if ((sor==9 && oszlop==8)) {
                ertek=79;
            }else if ((sor==8 && oszlop==8)) {
                ertek=78;
            }else if ((sor==7 && oszlop==8)) {
                ertek=77;
            }else if ((sor==6 && oszlop==8)) {
                ertek=76;
            }else if ((sor==5 && oszlop==8)) {
                ertek=75;
            }else if ((sor==4 && oszlop==8)) {
                ertek=74;
            }else if ((sor==3 && oszlop==8)) {
                ertek=73;
            }else if ((sor==2 && oszlop==8)) {
                ertek=72;
            }else if ((sor==1 && oszlop==8)) {
                ertek=71;
            }
            else if ((sor==10 && oszlop==9)) {
                ertek=90;
            }else if ((sor==9 && oszlop==9)) {
                ertek=89;
            }else if ((sor==8 && oszlop==9)) {
                ertek=88;
            }else if ((sor==7 && oszlop==9)) {
                ertek=87;
            }else if ((sor==6 && oszlop==9)) {
                ertek=86;
            }else if ((sor==5 && oszlop==9)) {
                ertek=85;
            }else if ((sor==4 && oszlop==9)) {
                ertek=84;
            }else if ((sor==3 && oszlop==9)) {
                ertek=83;
            }else if ((sor==2 && oszlop==9)) {
                ertek=82;
            }else if ((sor==1 && oszlop==9)) {
                ertek=81;
            }
            else if ((sor==10 && oszlop==10)) {
                ertek=100;
            }else if ((sor==9 && oszlop==10)) {
                ertek=99;
            }else if ((sor==8 && oszlop==10)) {
                ertek=98;
            }else if ((sor==7 && oszlop==10)) {
                ertek=97;
            }else if ((sor==6 && oszlop==10)) {
                ertek=96;
            }else if ((sor==5 && oszlop==10)) {
                ertek=95;
            }else if ((sor==4 && oszlop==10)) {
                ertek=94;
            }else if ((sor==3 && oszlop==10)) {
                ertek=93;
            }else if ((sor==2 && oszlop==10)) {
                ertek=92;
            }else if ((sor==1 && oszlop==10)) {
                ertek=91;
            }
            else if ((sor==10 && oszlop==11)) {
                ertek=110;
            }else if ((sor==9 && oszlop==11)) {
                ertek=109;
            }else if ((sor==8 && oszlop==11)) {
                ertek=108;
            }else if ((sor==7 && oszlop==11)) {
                ertek=107;
            }else if ((sor==6 && oszlop==11)) {
                ertek=106;
            }else if ((sor==5 && oszlop==11)) {
                ertek=105;
            }else if ((sor==4 && oszlop==11)) {
                ertek=104;
            }else if ((sor==3 && oszlop==11)) {
                ertek=103;
            }else if ((sor==2 && oszlop==11)) {
                ertek=102;
            }else if ((sor==1 && oszlop==11)) {
                ertek=101;
            }
            else if ((sor==10 && oszlop==12)) {
                ertek=120;
            }else if ((sor==9 && oszlop==12)) {
                ertek=119;
            }else if ((sor==8 && oszlop==12)) {
                ertek=118;
            }else if ((sor==7 && oszlop==12)) {
                ertek=117;
            }else if ((sor==6 && oszlop==12)) {
                ertek=116;
            }else if ((sor==5 && oszlop==12)) {
                ertek=115;
            }else if ((sor==4 && oszlop==12)) {
                ertek=114;
            }else if ((sor==3 && oszlop==12)) {
                ertek=113;
            }else if ((sor==2 && oszlop==12)) {
                ertek=112;
            }else if ((sor==1 && oszlop==12)) {
                ertek=111;
            }
           
        } else if (elsoHely.charAt(0) =='n') {
            if ((sor==10 && oszlop==1)) {
                ertek=120;
            }else if ((sor==9 && oszlop==1)) {
                ertek=119;
            }else if ((sor==8 && oszlop==1)) {
                ertek=118;
            }else if ((sor==7 && oszlop==1)) {
                ertek=117;
            }else if ((sor==6 && oszlop==1)) {
                ertek=116;
            }else if ((sor==5 && oszlop==1)) {
                ertek=115;
            }else if ((sor==4 && oszlop==1)) {
                ertek=114;
            }else if ((sor==3 && oszlop==1)) {
                ertek=113;
            }else if ((sor==2 && oszlop==1)) {
                ertek=112;
            }else if ((sor==1 && oszlop==1)) {
                ertek=111;
            }
            else if ((sor==10 && oszlop==2)) {
                ertek=110;
            }else if ((sor==9 && oszlop==2)) {
                ertek=109;
            }else if ((sor==8 && oszlop==2)) {
                ertek=108;
            }else if ((sor==7 && oszlop==2)) {
                ertek=107;
            }else if ((sor==6 && oszlop==2)) {
                ertek=106;
            }else if ((sor==5 && oszlop==2)) {
                ertek=105;
            }else if ((sor==4 && oszlop==2)) {
                ertek=104;
            }else if ((sor==3 && oszlop==2)) {
                ertek=103;
            }else if ((sor==2 && oszlop==2)) {
                ertek=102;
            }else if ((sor==1 && oszlop==2)) {
                ertek=101;
            }
            else if ((sor==10 && oszlop==3)) {
                ertek=100;
            }else if ((sor==9 && oszlop==3)) {
                ertek=99;
            }else if ((sor==8 && oszlop==3)) {
                ertek=98;
            }else if ((sor==7 && oszlop==3)) {
                ertek=97;
            }else if ((sor==6 && oszlop==3)) {
                ertek=96;
            }else if ((sor==5 && oszlop==3)) {
                ertek=95;
            }else if ((sor==4 && oszlop==3)) {
                ertek=94;
            }else if ((sor==3 && oszlop==3)) {
                ertek=93;
            }else if ((sor==2 && oszlop==3)) {
                ertek=92;
            }else if ((sor==1 && oszlop==3)) {
                ertek=91;
            }
            else if ((sor==10 && oszlop==4)) {
                ertek=90;
            }else if ((sor==9 && oszlop==4)) {
                ertek=89;
            }else if ((sor==8 && oszlop==4)) {
                ertek=88;
            }else if ((sor==7 && oszlop==4)) {
                ertek=87;
            }else if ((sor==6 && oszlop==4)) {
                ertek=86;
            }else if ((sor==5 && oszlop==4)) {
                ertek=85;
            }else if ((sor==4 && oszlop==4)) {
                ertek=84;
            }else if ((sor==3 && oszlop==4)) {
                ertek=83;
            }else if ((sor==2 && oszlop==4)) {
                ertek=82;
            }else if ((sor==1 && oszlop==4)) {
                ertek=81;
            }
            else if ((sor==10 && oszlop==5)) {
                ertek=80;
            }else if ((sor==9 && oszlop==5)) {
                ertek=79;
            }else if ((sor==8 && oszlop==5)) {
                ertek=78;
            }else if ((sor==7 && oszlop==5)) {
                ertek=77;
            }else if ((sor==6 && oszlop==5)) {
                ertek=76;
            }else if ((sor==5 && oszlop==5)) {
                ertek=75;
            }else if ((sor==4 && oszlop==5)) {
                ertek=74;
            }else if ((sor==3 && oszlop==5)) {
                ertek=73;
            }else if ((sor==2 && oszlop==5)) {
                ertek=72;
            }else if ((sor==1 && oszlop==5)) {
                ertek=71;
            }
            else if ((sor==10 && oszlop==6)) {
                ertek=70;
            }else if ((sor==9 && oszlop==6)) {
                ertek=109;
            }else if ((sor==8 && oszlop==6)) {
                ertek=108;
            }else if ((sor==7 && oszlop==6)) {
                ertek=107;
            }else if ((sor==6 && oszlop==6)) {
                ertek=106;
            }else if ((sor==5 && oszlop==6)) {
                ertek=105;
            }else if ((sor==4 && oszlop==6)) {
                ertek=104;
            }else if ((sor==3 && oszlop==6)) {
                ertek=103;
            }else if ((sor==2 && oszlop==6)) {
                ertek=102;
            }else if ((sor==1 && oszlop==6)) {
                ertek=101;
            }
            else if ((sor==10 && oszlop==7)) {
                ertek=60;
            }else if ((sor==9 && oszlop==7)) {
                ertek=9;
            }else if ((sor==8 && oszlop==7)) {
                ertek=8;
            }else if ((sor==7 && oszlop==7)) {
                ertek=7;
            }else if ((sor==6 && oszlop==7)) {
                ertek=6;
            }else if ((sor==5 && oszlop==7)) {
                ertek=5;
            }else if ((sor==4 && oszlop==7)) {
                ertek=4;
            }else if ((sor==3 && oszlop==7)) {
                ertek=3;
            }else if ((sor==2 && oszlop==7)) {
                ertek=2;
            }else if ((sor==1 && oszlop==7)) {
                ertek=1;
            }
            else if ((sor==10 && oszlop==8)) {
                ertek=10;
            }else if ((sor==9 && oszlop==8)) {
                ertek=19;
            }else if ((sor==8 && oszlop==8)) {
                ertek=18;
            }else if ((sor==7 && oszlop==8)) {
                ertek=17;
            }else if ((sor==6 && oszlop==8)) {
                ertek=16;
            }else if ((sor==5 && oszlop==8)) {
                ertek=15;
            }else if ((sor==4 && oszlop==8)) {
                ertek=14;
            }else if ((sor==3 && oszlop==8)) {
                ertek=13;
            }else if ((sor==2 && oszlop==8)) {
                ertek=12;
            }else if ((sor==1 && oszlop==8)) {
                ertek=11;
            }
            else if ((sor==10 && oszlop==9)) {
                ertek=20;
            }else if ((sor==9 && oszlop==9)) {
                ertek=29;
            }else if ((sor==8 && oszlop==9)) {
                ertek=28;
            }else if ((sor==7 && oszlop==9)) {
                ertek=27;
            }else if ((sor==6 && oszlop==9)) {
                ertek=26;
            }else if ((sor==5 && oszlop==9)) {
                ertek=25;
            }else if ((sor==4 && oszlop==9)) {
                ertek=24;
            }else if ((sor==3 && oszlop==9)) {
                ertek=23;
            }else if ((sor==2 && oszlop==9)) {
                ertek=22;
            }else if ((sor==1 && oszlop==9)) {
                ertek=21;
            }
            else if ((sor==10 && oszlop==10)) {
                ertek=30;
            }else if ((sor==9 && oszlop==10)) {
                ertek=39;
            }else if ((sor==8 && oszlop==10)) {
                ertek=38;
            }else if ((sor==7 && oszlop==10)) {
                ertek=37;
            }else if ((sor==6 && oszlop==10)) {
                ertek=36;
            }else if ((sor==5 && oszlop==10)) {
                ertek=35;
            }else if ((sor==4 && oszlop==10)) {
                ertek=34;
            }else if ((sor==3 && oszlop==10)) {
                ertek=33;
            }else if ((sor==2 && oszlop==10)) {
                ertek=32;
            }else if ((sor==1 && oszlop==10)) {
                ertek=31;
            }
            else if ((sor==10 && oszlop==11)) {
                ertek=40;
            }else if ((sor==9 && oszlop==11)) {
                ertek=49;
            }else if ((sor==8 && oszlop==11)) {
                ertek=48;
            }else if ((sor==7 && oszlop==11)) {
                ertek=47;
            }else if ((sor==6 && oszlop==11)) {
                ertek=46;
            }else if ((sor==5 && oszlop==11)) {
                ertek=45;
            }else if ((sor==4 && oszlop==11)) {
                ertek=44;
            }else if ((sor==3 && oszlop==11)) {
                ertek=43;
            }else if ((sor==2 && oszlop==11)) {
                ertek=42;
            }else if ((sor==1 && oszlop==11)) {
                ertek=41;
            }
            else if ((sor==10 && oszlop==12)) {
                ertek=50;
            }else if ((sor==9 && oszlop==12)) {
                ertek=59;
            }else if ((sor==8 && oszlop==12)) {
                ertek=58;
            }else if ((sor==7 && oszlop==12)) {
                ertek=57;
            }else if ((sor==6 && oszlop==12)) {
                ertek=56;
            }else if ((sor==5 && oszlop==12)) {
                ertek=55;
            }else if ((sor==4 && oszlop==12)) {
                ertek=54;
            }else if ((sor==3 && oszlop==12)) {
                ertek=53;
            }else if ((sor==2 && oszlop==12)) {
                ertek=52;
            }else if ((sor==1 && oszlop==12)) {
                ertek=51;
            }
        } else {
            
            if ((sor==10 && oszlop==1)) {
                ertek=120;
            }else if ((sor==9 && oszlop==1)) {
                ertek=119;
            }else if ((sor==8 && oszlop==1)) {
                ertek=118;
            }else if ((sor==7 && oszlop==1)) {
                ertek=117;
            }else if ((sor==6 && oszlop==1)) {
                ertek=116;
            }else if ((sor==5 && oszlop==1)) {
                ertek=115;
            }else if ((sor==4 && oszlop==1)) {
                ertek=114;
            }else if ((sor==3 && oszlop==1)) {
                ertek=113;
            }else if ((sor==2 && oszlop==1)) {
                ertek=112;
            }else if ((sor==1 && oszlop==1)) {
                ertek=111;
            }
            else if ((sor==10 && oszlop==2)) {
                ertek=110;
            }else if ((sor==9 && oszlop==2)) {
                ertek=109;
            }else if ((sor==8 && oszlop==2)) {
                ertek=108;
            }else if ((sor==7 && oszlop==2)) {
                ertek=107;
            }else if ((sor==6 && oszlop==2)) {
                ertek=106;
            }else if ((sor==5 && oszlop==2)) {
                ertek=105;
            }else if ((sor==4 && oszlop==2)) {
                ertek=104;
            }else if ((sor==3 && oszlop==2)) {
                ertek=103;
            }else if ((sor==2 && oszlop==2)) {
                ertek=102;
            }else if ((sor==1 && oszlop==2)) {
                ertek=101;
            }
            else if ((sor==10 && oszlop==3)) {
                ertek=100;
            }else if ((sor==9 && oszlop==3)) {
                ertek=99;
            }else if ((sor==8 && oszlop==3)) {
                ertek=98;
            }else if ((sor==7 && oszlop==3)) {
                ertek=97;
            }else if ((sor==6 && oszlop==3)) {
                ertek=96;
            }else if ((sor==5 && oszlop==3)) {
                ertek=95;
            }else if ((sor==4 && oszlop==3)) {
                ertek=94;
            }else if ((sor==3 && oszlop==3)) {
                ertek=93;
            }else if ((sor==2 && oszlop==3)) {
                ertek=92;
            }else if ((sor==1 && oszlop==3)) {
                ertek=91;
            }
            else if ((sor==10 && oszlop==4)) {
                ertek=90;
            }else if ((sor==9 && oszlop==4)) {
                ertek=89;
            }else if ((sor==8 && oszlop==4)) {
                ertek=88;
            }else if ((sor==7 && oszlop==4)) {
                ertek=87;
            }else if ((sor==6 && oszlop==4)) {
                ertek=86;
            }else if ((sor==5 && oszlop==4)) {
                ertek=85;
            }else if ((sor==4 && oszlop==4)) {
                ertek=84;
            }else if ((sor==3 && oszlop==4)) {
                ertek=83;
            }else if ((sor==2 && oszlop==4)) {
                ertek=82;
            }else if ((sor==1 && oszlop==4)) {
                ertek=81;
            }
            else if ((sor==10 && oszlop==5)) {
                ertek=80;
            }else if ((sor==9 && oszlop==5)) {
                ertek=79;
            }else if ((sor==8 && oszlop==5)) {
                ertek=78;
            }else if ((sor==7 && oszlop==5)) {
                ertek=77;
            }else if ((sor==6 && oszlop==5)) {
                ertek=76;
            }else if ((sor==5 && oszlop==5)) {
                ertek=75;
            }else if ((sor==4 && oszlop==5)) {
                ertek=74;
            }else if ((sor==3 && oszlop==5)) {
                ertek=73;
            }else if ((sor==2 && oszlop==5)) {
                ertek=72;
            }else if ((sor==1 && oszlop==5)) {
                ertek=71;
            }
            else if ((sor==10 && oszlop==6)) {
                ertek=70;
            }else if ((sor==9 && oszlop==6)) {
                ertek=109;
            }else if ((sor==8 && oszlop==6)) {
                ertek=108;
            }else if ((sor==7 && oszlop==6)) {
                ertek=107;
            }else if ((sor==6 && oszlop==6)) {
                ertek=106;
            }else if ((sor==5 && oszlop==6)) {
                ertek=105;
            }else if ((sor==4 && oszlop==6)) {
                ertek=104;
            }else if ((sor==3 && oszlop==6)) {
                ertek=103;
            }else if ((sor==2 && oszlop==6)) {
                ertek=102;
            }else if ((sor==1 && oszlop==6)) {
                ertek=101;
            }
            else if ((sor==10 && oszlop==7)) {
                ertek=60;
            }else if ((sor==9 && oszlop==7)) {
                ertek=59;
            }else if ((sor==8 && oszlop==7)) {
                ertek=58;
            }else if ((sor==7 && oszlop==7)) {
                ertek=57;
            }else if ((sor==6 && oszlop==7)) {
                ertek=56;
            }else if ((sor==5 && oszlop==7)) {
                ertek=55;
            }else if ((sor==4 && oszlop==7)) {
                ertek=54;
            }else if ((sor==3 && oszlop==7)) {
                ertek=53;
            }else if ((sor==2 && oszlop==7)) {
                ertek=52;
            }else if ((sor==1 && oszlop==7)) {
                ertek=51;
            }
            else if ((sor==10 && oszlop==8)) {
                ertek=50;
            }else if ((sor==9 && oszlop==8)) {
                ertek=49;
            }else if ((sor==8 && oszlop==8)) {
                ertek=48;
            }else if ((sor==7 && oszlop==8)) {
                ertek=47;
            }else if ((sor==6 && oszlop==8)) {
                ertek=46;
            }else if ((sor==5 && oszlop==8)) {
                ertek=45;
            }else if ((sor==4 && oszlop==8)) {
                ertek=44;
            }else if ((sor==3 && oszlop==8)) {
                ertek=43;
            }else if ((sor==2 && oszlop==8)) {
                ertek=42;
            }else if ((sor==1 && oszlop==8)) {
                ertek=41;
            }
            else if ((sor==10 && oszlop==9)) {
                ertek=40;
            }else if ((sor==9 && oszlop==9)) {
                ertek=39;
            }else if ((sor==8 && oszlop==9)) {
                ertek=38;
            }else if ((sor==7 && oszlop==9)) {
                ertek=37;
            }else if ((sor==6 && oszlop==9)) {
                ertek=36;
            }else if ((sor==5 && oszlop==9)) {
                ertek=35;
            }else if ((sor==4 && oszlop==9)) {
                ertek=34;
            }else if ((sor==3 && oszlop==9)) {
                ertek=33;
            }else if ((sor==2 && oszlop==9)) {
                ertek=32;
            }else if ((sor==1 && oszlop==9)) {
                ertek=31;
            }
            else if ((sor==10 && oszlop==10)) {
                ertek=30;
            }else if ((sor==9 && oszlop==10)) {
                ertek=29;
            }else if ((sor==8 && oszlop==10)) {
                ertek=28;
            }else if ((sor==7 && oszlop==10)) {
                ertek=27;
            }else if ((sor==6 && oszlop==10)) {
                ertek=26;
            }else if ((sor==5 && oszlop==10)) {
                ertek=25;
            }else if ((sor==4 && oszlop==10)) {
                ertek=24;
            }else if ((sor==3 && oszlop==10)) {
                ertek=23;
            }else if ((sor==2 && oszlop==10)) {
                ertek=22;
            }else if ((sor==1 && oszlop==10)) {
                ertek=21;
            }
            else if ((sor==10 && oszlop==11)) {
                ertek=20;
            }else if ((sor==9 && oszlop==11)) {
                ertek=19;
            }else if ((sor==8 && oszlop==11)) {
                ertek=18;
            }else if ((sor==7 && oszlop==11)) {
                ertek=17;
            }else if ((sor==6 && oszlop==11)) {
                ertek=16;
            }else if ((sor==5 && oszlop==11)) {
                ertek=15;
            }else if ((sor==4 && oszlop==11)) {
                ertek=14;
            }else if ((sor==3 && oszlop==11)) {
                ertek=13;
            }else if ((sor==2 && oszlop==11)) {
                ertek=12;
            }else if ((sor==1 && oszlop==11)) {
                ertek=11;
            }
            else if ((sor==10 && oszlop==12)) {
                ertek=10;
            }else if ((sor==9 && oszlop==12)) {
                ertek=9;
            }else if ((sor==8 && oszlop==12)) {
                ertek=8;
            }else if ((sor==7 && oszlop==12)) {
                ertek=7;
            }else if ((sor==6 && oszlop==12)) {
                ertek=6;
            }else if ((sor==5 && oszlop==12)) {
                ertek=5;
            }else if ((sor==4 && oszlop==12)) {
                ertek=4;
            }else if ((sor==3 && oszlop==12)) {
                ertek=3;
            }else if ((sor==2 && oszlop==12)) {
                ertek=2;
            }else if ((sor==1 && oszlop==12)) {
                ertek=1;
            }
        }

        egysegekSorrend.remove(egysegIras);
        egysegekSorrend.remove(egysegKep);

        egysegekSorrend.add(egysegIras, Integer.valueOf(ertek));
        egysegekSorrend.add(egysegKep, Integer.valueOf(ertek));
    }
}
