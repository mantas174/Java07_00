package com.company;

import javax.swing.plaf.synth.SynthEditorPaneUI;

public class KavosAparatas {
    public int cukrausKiekis = 0;
    public int kavosPupeliuKiekis = 0;
    public int vandensKiekis = 0;
    public int panaudojimuSkaicius = 0;
    public static final int PANAUDOJIMU_SKAICIAUS_RIBA = 10;


    public void papildytiVandeni(){
        this.vandensKiekis = 30;
    }
    public void papildytiPupeles(){
        this.kavosPupeliuKiekis = 30;
    }
    public void papildytiCukru(){
        this.cukrausKiekis = 30;
    }

    public void kavosGaminimas(String rusis){
        if(rusis.equals("Kava latte")){
            if(arPasiruoses()) {
                if (cukrausKiekis >= 3 && kavosPupeliuKiekis >= 2 && vandensKiekis >= 1) {
                    cukrausKiekis -= 3;
                    kavosPupeliuKiekis -= 2;
                    vandensKiekis -= 1;
                    panaudojimuSkaicius++;
                } else {
                    System.out.println("Truksta produktu, papildyti aparata");
                }
                if (cukrausKiekis >= 4 && kavosPupeliuKiekis >= 5 && vandensKiekis >= 6) {
                    cukrausKiekis -= 4;
                    kavosPupeliuKiekis -= 5;
                    vandensKiekis -= 6;
                    panaudojimuSkaicius++;
                } else {
                    System.out.println("Truksta produktu, papildyti aparata");
                }
                if (cukrausKiekis >= 7 && kavosPupeliuKiekis >= 8 && vandensKiekis >= 9) {
                    cukrausKiekis -= 7;
                    kavosPupeliuKiekis -= 8;
                    vandensKiekis -= 9;
                    panaudojimuSkaicius++;
                } else {
                    System.out.println("Truksta produktu, papildyti aparata");
                }
            }else {
                System.out.println("Aparata reik isplaut");
            }

        }
    }

    public void atliktiPlovima(){
        panaudojimuSkaicius = 0;
    }
    public boolean arPasiruoses(){
        boolean rezult = true;
        if(PANAUDOJIMU_SKAICIAUS_RIBA == panaudojimuSkaicius)
            rezult = false;
        return rezult;
    }
    public String produktuBusena(){
        return "";
    }
    public String aparatoBusena(){
        return "";
    }



    public KavosAparatas(){

    }
    public KavosAparatas(int ck){

    }
    public KavosAparatas(int ck, int kpk, int vk){

    }

    public void setCukrausKiekis(int ck) {
        this.cukrausKiekis = cukrausKiekis;
    }
    public void setKavosPupeliuKiekis(int kpk){

    }
    public void setVandensKiekis(int vk){

    }
    public void setPanaudojimuSkaicius(int ps){

    }



    public int getCukrausKiekis(){
        return cukrausKiekis;
    }
    public int getKavosPupeliuKiekis(){
        return kavosPupeliuKiekis;
    }
    public int getVandensKiekis(){
        return vandensKiekis;
    }
    public int getPanaudojimuSkaicius(){
        return panaudojimuSkaicius;
    }

}
