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
        Country c1 =ctx.getBean(Finland.class);
        Country c2 =ctx.getBean(UnitedStates.class);
        System.out.println(c1.getName()+" population is "+c1.getPopulation()+ " and president is "+c1.getPresident());
        System.out.println(c2.getName()+" population is "+c2.getPopulation()+ " and president is  "+c2.getPresident());
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
