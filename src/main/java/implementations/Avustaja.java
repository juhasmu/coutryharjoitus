package implementations;

import implementations.countries.Finland;
import implementations.countries.UnitedStates;
import interfaces.Country;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Avustaja {

    public static Country haeMaa(AnnotationConfigApplicationContext ctx, String luettu) {
        Country country=null;
        if(luettu.toLowerCase().contains("finland")){
            country = ctx.getBean(Finland.class);
            return country;
        }
        if(luettu.toLowerCase().contains("united states")){
            country = ctx.getBean(UnitedStates.class);
            return country;
        }
        System.out.println("Anna databacesta löytyvä maa");
        return country;
    }
}
