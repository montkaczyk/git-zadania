package program;

import java.util.Scanner;

public class Auto {
    private String kolor_auta;
    private int predkosc_max;

    public Auto() {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj kolor auta:");
        this.kolor_auta = input.next();
        System.out.println("Podaj predkosc auta:");
        this.predkosc_max = Integer.parseInt(input.next());
    }
		System.out.println("Podaj kolor auta:");
    public String getKolor_auta() {
        return kolor_auta;
    }

    public void setKolor_auta(String kolor_auta) {
        this.kolor_auta = kolor_auta;
    }

    public int getPredkosc_max() {
        return predkosc_max;
    }
		System.out.println("Podaj predkosc auta:");
    public void setPredkosc_max(int predkosc_max) {
        this.predkosc_max = predkosc_max;
    }

    public String toString(){
        String tekst="predkosc maksymalna to:"+predkosc_max+" a kolor auta to :"+kolor_auta;
        return tekst;
    }
}