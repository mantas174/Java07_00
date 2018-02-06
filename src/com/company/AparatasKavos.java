package com.company;

public class AparatasKavos {

    private static final int KADA_PLAUTI = 5;
    private static final String KAVA_JUODA = "JUODA";
    private static final String KAVA_LATTE = "LATTE";
    private static final String KAVA_ESPRESSO = "ESPRESSO";


    private float cukrausKiekis = 0;
    private float kavosKiekis = 0;
    private float vandensKiekis = 0;


    private int panaudojimuSkaicius = 0;
    private boolean arPlauti = false;


    public void pildykCukru() {
        setCukrausKiekis(1000);
    }

    public void pildykKava() {
        setKavosKiekis(1000);
    }

    public void pildykVandeni() {
        setVandensKiekis(1000);
    }

    public void uzpildykAparata() {
        pildykCukru();
        pildykKava();
        pildykVandeni();
    }

    public float getVandensKiekis() {
        return vandensKiekis;
    }

    public void setVandensKiekis(float vandensKiekis) {
        this.vandensKiekis = vandensKiekis;
    }

    public float getKavosKiekis() {
        return kavosKiekis;
    }

    public void setKavosKiekis(float kavosKiekis) {
        this.kavosKiekis = kavosKiekis;
    }

    public float getCukrasKiekis() {
        return cukrausKiekis;
    }

    public void setCukrausKiekis(float cukrasKiekis) {
        this.cukrausKiekis = cukrasKiekis;
    }

    public void parodykProduktuBusena() {
        System.out.println("Kavos kiekis" + getKavosKiekis());
        System.out.println("Cukraus kiekis" + getCukrasKiekis());
        System.out.println("Vandens kiekis" + getVandensKiekis());
    }

    public void parodykAparatoBusena() {
        System.out.println("Panaudojimu skaicius " + getPanaudojimuSkaicius());
        System.out.println("Iki plovimo liko " + getUzKiekPlauti());
        parodykProduktuBusena();
    }


    public int getPanaudojimuSkaicius() {
        return panaudojimuSkaicius;
    }


    public int getUzKiekPlauti() {
        // 7                          20                  7
        return KADA_PLAUTI - (getPanaudojimuSkaicius() % KADA_PLAUTI);
    }

    public void plauti() {
        arPlauti = false;
    }

    public void gaminkKava(String kavosRusis) {
        switch (kavosRusis) {
            case KAVA_JUODA:
                this.gaminkJuoda();
                break;
            case KAVA_LATTE:
                this.gaminkLatte();
                break;
            case KAVA_ESPRESSO:
                this.gaminkEspresso();
                break;
        }
    }

    private boolean arGaliuGaminti() {
        boolean result = true;
        if (arPlauti) {
            arPlauti = getUzKiekPlauti() == 1;
            result = false;
            System.out.println("Reikia plauti");
        }
        if (getVandensKiekis() <= 0) {
            result = false;
            System.out.println("Reikia Vandens");
            setVandensKiekis(0);
        }
        if (getKavosKiekis() <= 0) {
            result = false;
            System.out.println("Reikia Kavos");
            setKavosKiekis(0);
        }
        if (getCukrasKiekis() == 0) {
            result = false;
            System.out.println("Reikia cukraus");
            setCukrausKiekis(0);
        }
        return result;
    }

    private void gaminkJuoda() {
        if (arGaliuGaminti()) {
            arPlauti = getUzKiekPlauti() == 1;
            setVandensKiekis(getVandensKiekis() - 150);
            setCukrausKiekis(getCukrasKiekis() - 10);
            setKavosKiekis(getKavosKiekis() - 30);
            panaudojimuSkaicius++;
            System.out.println("");
        }
    }

    private void gaminkLatte() {
        if (arGaliuGaminti()) {
            arPlauti = getUzKiekPlauti() == 1;
            setVandensKiekis(getVandensKiekis() - 200);
            setCukrausKiekis(getCukrasKiekis() - 10);
            setKavosKiekis(getKavosKiekis() - 10);
            panaudojimuSkaicius++;
        }
    }

    private void gaminkEspresso() {
        if (arGaliuGaminti()) {
            arPlauti = getUzKiekPlauti() == 1;
            setVandensKiekis(getVandensKiekis() - 50);
            setCukrausKiekis(getCukrasKiekis() - 0);
            setKavosKiekis(getKavosKiekis() - 25);
            panaudojimuSkaicius++;
        }
    }
}
