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

    public void setKolor_auta() {
		Scanner input = new Scanner(System.in);
        System.out.println("Podaj kolor auta:");
        this.kolor_auta = input.next();
    }
		
    public void setPredkosc_max() {
		Scanner input = new Scanner(System.in);
		System.out.println("Podaj predkosc auta:");
        this.predkosc_max = Integer.parseInt(input.next());
    }

    public void wypiszDane(){
        String tekst="Predkosc maksymalna samochodu to: "+predkosc_max+", a kolor auta to : "+kolor_auta;
        System.out.println(tekst);
    }
}