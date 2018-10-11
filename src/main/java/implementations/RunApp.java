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
            System.out.println(luettu);
            if(luettu.equals("getFinland")){
                country = ctx.getBean(Finland.class);
                System.out.println(country.getName()+" population is "+country.getPopulation()+ " and president is "+country.getPresident());
            }
            if(luettu.equals("getUnitedStates")){
                country = ctx.getBean(UnitedStates.class);
                System.out.println(country.getName()+" population is "+country.getPopulation()+ " and president is  "+country.getPresident());
            }
            if(luettu.equals("0")) {
                return;
            }
        }
    }
}
