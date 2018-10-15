package implementations;

import interfaces.Country;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lue {
    public Lue(AnnotationConfigApplicationContext ctx, String luettu) {
    Country country = null;
        if(luettu.contains("Finland")){
            country = ctx.getBean(Finland.class);
            new LueMaa(country);
            return;
        }
        if(luettu.contains("UnitedStates")){
            country = ctx.getBean(UnitedStates.class);
            new LueMaa(country);
            return;
        }
        System.out.println("Anna databacesta löytyvä maa");
    }
}
