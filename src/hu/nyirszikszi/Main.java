package hu.nyirszikszi;

import hu.nyirszikszi.gombterfogata.GombTerfogata;
import hu.nyirszikszi.kockaterfogata.KockaTerfogata;
import hu.nyirszikszi.teglatestterfogata.TeglatestTerfogata;

public class Main {

    public static void main(String[] args) {
        GombTerfogata g = new GombTerfogata(5);
        System.out.println("Gomb terfogata: " + g.getEredmeny());

        KockaTerfogata k = new KockaTerfogata(6);
        System.out.println("Kocka terfogata: " + k.getEredmeny());

        TeglatestTerfogata t = new TeglatestTerfogata(7, 8, 9);
        System.out.println("Teglatest terfogata: " + t.getEredmeny());
    }
}