package com.company;

import java.util.Scanner;

public class Main {
    public static final int ACTION_0 = 0;
    public static final int ACTION_1 = 1;
    public static final int ACTION_2 = 2;
    public static final int ACTION_3 = 3;
    public static final int ACTION_4 = 4;
    public static final int ACTION_5 = 5;
    public static final int ACTION_6 = 6;
    public static final int ACTION_7 = 7;
    public static final int ACTION_8 = 8;
    public static final int ACTION_9 = 9;
    public static final int ACTION_10 = 10;
    private static final String KAVA_JUODA = "JUODA";
    private static final String KAVA_LATTE = "LATTE";
    private static final String KAVA_ESPRESSO = "ESPRESSO";

    public static void main(String[] args) {
	// write your code here
        Main obj = new Main();
        obj.run();
    }

    private void rodykMeniu(){
        System.out.println("-----------------");
        System.out.println(ACTION_1+" - Padaryk juoda kava");
        System.out.println(ACTION_2+" - Padaryk Latte kava");
        System.out.println(ACTION_3+" - Padaryk Espresso kava");
        System.out.println(ACTION_4+" - Plauk aparata");
        System.out.println(ACTION_5+" - Papildyk cukru");
        System.out.println(ACTION_6+" - Papildyk Vandeni");
        System.out.println(ACTION_7+" - Papildyk kava");
        System.out.println(ACTION_8+" - Parodyk ar pasiruoses");
        System.out.println(ACTION_9+" - Parodyk produktu busena");
        System.out.println(ACTION_10+" - Parodyk aparato busena");
        System.out.println(ACTION_0+" - Baigti darba");
        System.out.println("-----------------");
    }
    public void run(){
        Scanner in = new Scanner(System.in);
        int pasirinkimas;
        boolean arTesti = true;
        AparatasKavos obj = new AparatasKavos();
        while(arTesti){
            rodykMeniu();
            pasirinkimas = in.nextInt();
            switch (pasirinkimas){
                case ACTION_0:
                    arTesti = false;
                    break;
                case ACTION_1:
                    obj.gaminkKava(KAVA_JUODA);
                    break;
                case ACTION_2:
                    obj.gaminkKava(KAVA_LATTE);
                    break;
                case ACTION_3:
                    obj.gaminkKava(KAVA_ESPRESSO);
                    break;
            }
        }

    }
}
