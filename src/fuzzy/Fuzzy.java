/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuzzy;

import java.util.Scanner;

/**
 *
 * @author Aditya
 */
public class Fuzzy {

    /**
     * @param args the command line arguments
     */
    private double FindMax(double... vals) {
        double max = 0.0;

        for (double d : vals) {
            if (d > max) {
                max = d;
            }
        }
        return max;
    }

    public static void main(String[] args) {
       // for (int i = 0; i < 20; i++) {
            Fuzzy fuzzy = new Fuzzy();
//        double emosi = 0;
//        double provokasi = 0;
            double tidakEmosi = 0, cukupEmosi = 0, Emosi = 0, lebihEmosi = 0, sangatEmosi = 0;
            double tidakProv = 0, cukupProv = 0, Prov = 0, lebihProv = 0, sangatProv = 0;
            double ya = 0, ya1 = 0, ya2 = 0, ya3 = 0, ya4 = 0, ya5 = 0, ya6 = 0, ya7 = 0, ya8 = 0, ya9 = 0, ya10 = 0, ya11 = 0, ya12 = 0;
            double tidak = 0, tidak1 = 0, tidak2 = 0, tidak3 = 0, tidak4 = 0, tidak5 = 0, tidak6 = 0, tidak7 = 0, tidak8 = 0, tidak9 = 0, tidak10 = 0;
            double tidak11 = 0, tidak12 = 0;

            System.out.println("Emosi = ");
            Scanner e = new Scanner(System.in);
            double emosi = e.nextDouble();

            System.out.println("Provokasi = ");
            Scanner p = new Scanner(System.in);
            double provokasi = p.nextDouble();

            if ((emosi > 0) && (emosi <= 20)) {
                tidakEmosi = 1;
            } else if ((emosi > 20) && (emosi <= 40)) {
                tidakEmosi = (40 - emosi) / 20;
                cukupEmosi = (emosi - 20) / 20;
            } else if ((emosi > 40) && (emosi <= 60)) {
                cukupEmosi = (60 - emosi) / 20;
                Emosi = (emosi - 40) / 20;
            } else if ((emosi > 60) && (emosi <= 80)) {
                Emosi = (80 - emosi) / 20;
                lebihEmosi = (emosi - 60) / 20;
            } else if ((emosi > 80) && (emosi <= 100)) {
                lebihEmosi = (100 - emosi) / 20;
                sangatEmosi = (emosi - 80) / 20;
            } else {
                sangatEmosi = 1;
            }

            if ((provokasi > 0) && (provokasi <= 20)) {
                tidakProv = 1;
            } else if ((provokasi > 20) && (provokasi <= 40)) {
                tidakProv = (40 - provokasi) / 20;
                cukupProv = (provokasi - 20) / 20;
            } else if ((provokasi > 40) && (provokasi <= 60)) {
                cukupProv = (60 - provokasi) / 20;
                Prov = (provokasi - 40) / 20;
            } else if ((provokasi > 60) && (provokasi <= 80)) {
                Prov = (80 - provokasi) / 20;
                lebihProv = (provokasi - 60) / 20;
            } else if ((provokasi > 80) && (provokasi <= 100)) {
                lebihProv = (100 - provokasi) / 20;
                sangatProv = (provokasi - 80) / 20;
            } else {
                sangatProv = 1;
            }

            tidak = Math.min(tidakEmosi, tidakProv);
            tidak1 = Math.min(cukupEmosi, tidakProv);
            tidak2 = Math.min(Emosi, tidakProv);
            tidak3 = Math.min(lebihEmosi, tidakProv);
            tidak4 = Math.min(sangatEmosi, tidakProv);
            tidak5 = Math.min(tidakEmosi, cukupProv);
            tidak6 = Math.min(cukupEmosi, cukupProv);
            tidak7 = Math.min(Emosi, cukupProv);
            tidak8 = Math.min(lebihEmosi, cukupProv);
            tidak9 = Math.min(tidakEmosi, Prov);
            tidak10 = Math.min(cukupEmosi, Prov);
            tidak11 = Math.min(Emosi, Prov);
            tidak12 = Math.min(tidakEmosi, lebihProv);
            ya = Math.min(sangatEmosi, cukupProv);
            ya1 = Math.min(lebihEmosi, Prov);
            ya2 = Math.min(sangatEmosi, Prov);
            ya3 = Math.min(cukupEmosi, lebihProv);
            ya4 = Math.min(Emosi, lebihProv);
            ya5 = Math.min(lebihEmosi, lebihProv);
            ya6 = Math.min(sangatEmosi, lebihProv);
            ya7 = Math.min(tidakEmosi, sangatProv);
            ya8 = Math.min(cukupEmosi, sangatProv);
            ya9 = Math.min(Emosi, sangatProv);
            ya10 = Math.min(cukupEmosi, sangatProv);
            ya11 = Math.min(sangatEmosi, sangatProv);

            double Mt = fuzzy.FindMax(tidak, tidak1, tidak2, tidak5, tidak6, tidak7, tidak8, tidak9, tidak10, tidak11, tidak12);
            double My = fuzzy.FindMax(ya, ya1, ya2, ya3, ya4, ya5, ya6, ya7, ya8, ya9, ya10, ya11);

            double ouutput;
            ouutput = ((50 * Mt) + (100 * My)) / (My + Mt);

            System.out.println(ouutput);

            if (ouutput > 80) {
                System.out.println("Hoax");
            } else {
                System.out.println("Tidak Hoax");
            }

        }

    }

//}
