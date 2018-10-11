package implementations;

import config.AppConfig;
import interfaces.Country;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class RunApp {
    public RunApp(){
        String luettu;
        Scanner lukija = new Scanner(System.in);
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Country country = null;
        while(true) {
            System.out.println("Kirjoita 0 niin lopetetaan");
            System.out.print("Kirjoita jotain> ");
            luettu = lukija.nextLine();
            if(luettu.contains("Finland")){
                country = ctx.getBean(Finland.class);
                if(luettu.equals("getFinland")){
                    System.out.println("\nOfficial name of the coutry: "+country.getName());
                    System.out.println ("Population count: "+country.getPopulation());
                    System.out.println ("President: "+country.getPresident()+"\n");
                    continue;
                }
                if(luettu.equals("setFinland")){
                   new Tallennus(country);
                   System.out.println("");
                   continue;
                }
            }
            if(luettu.contains("UnitedStates")){
                country = ctx.getBean(UnitedStates.class);
                if(luettu.equals("getUnitedStates")){
                    System.out.println("\nOfficial name of the coutry: "+country.getName());
                    System.out.println ("Population count: "+country.getPopulation());
                    System.out.println ("President: "+country.getPresident()+"\n");
                    continue;
                }
                if (luettu.equals("setUnitedStates")){
                    new Tallennus(country);
                    System.out.println("");
                    continue;
                }
            }
            if(luettu.equals("0")) {
                return;
            }
            System.out.println("Anna databacesta löytyvä maa");
        }
    }
}
