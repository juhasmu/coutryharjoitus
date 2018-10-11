package implementations;

import java.util.Scanner;

public class RunApp {
    public RunApp(){
        String luettu;
        Scanner lukija = new Scanner(System.in);
        while(true) {
            System.out.println("Kirjoita 0 niin lopetetaan");
            System.out.print("Kirjoita jotain> ");
            luettu = lukija.nextLine();
            System.out.println(luettu);
            if(luettu.equals("0")) {
                return;
            }
        }
    }
}
