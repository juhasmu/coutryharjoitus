package implementations;

import interfaces.Country;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Avustaja {

    public static Country haeMaa(AnnotationConfigApplicationContext ctx, String luettu) {
        Country country=null;
        if(luettu.contains("Finland")){
            country = ctx.getBean(Finland.class);
            return country;
        }
        if(luettu.contains("UnitedStates")){
            country = ctx.getBean(UnitedStates.class);
            return country;
        }
        System.out.println("Anna databacesta löytyvä maa");
        return country;
    }
}
