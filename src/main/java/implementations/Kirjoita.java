package implementations;

import interfaces.Country;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Kirjoita {
    public Kirjoita(AnnotationConfigApplicationContext ctx, String luettu) {
    Country country=null;
        if(luettu.contains("Finland")){
            country = ctx.getBean(Finland.class);
            new Tallennus(country);
        }
        if(luettu.contains("UnitedStates")){
            country = ctx.getBean(UnitedStates.class);
            new Tallennus(country);
        }
        System.out.println("Anna databacesta löytyvä maa");
    }
}
