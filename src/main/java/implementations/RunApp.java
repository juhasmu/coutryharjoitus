package implementations;

import config.AppConfig;
import interfaces.Country;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class RunApp {
    public RunApp(){
        String luettu;
        Scanner lukija = new Scanner(System.in);
        String[] database ={"Finland","UnitedStates"};
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        while(true) {
            System.out.println("Kirjoita 0 niin lopetetaan");
            System.out.print("Kirjoita jotain> ");
            luettu = lukija.nextLine();

            if(luettu.startsWith("get")){
                new Lue(ctx,luettu);
                continue;
            }
            if(luettu.startsWith("set")){
                new Kirjoita(ctx,luettu);
            }
            if(luettu.equals("0")) {
                return;
            }
        }
    }
}
