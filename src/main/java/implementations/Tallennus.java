package implementations;

import interfaces.Country;

import java.util.Scanner;

public class Tallennus {
    public Tallennus(Country country){
        String luettu;
        Scanner lukija = new Scanner(System.in);
        System.out.print("Mitä haluat muuttaa> ");
        luettu=lukija.nextLine();
        if(luettu.equals("Nimi")){
            System.out.print("Anna uusi nimi> ");
            luettu=lukija.nextLine();
            country.setName(luettu);
            luettu = " ";
        }
        if(luettu.equals("Population")){
            System.out.print("Anna arvo> ");
            luettu=lukija.nextLine();
            country.setPopulation(luettu);
            luettu = " ";
        }
        if(luettu.equals("President")){
            System.out.print("Anna uusi nimi> ");
            luettu=lukija.nextLine();
            country.setPresident(luettu);
        }

    }
}
