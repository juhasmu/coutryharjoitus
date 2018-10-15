package implementations;

import interfaces.Country;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lue {
    public Lue(AnnotationConfigApplicationContext ctx, String luettu) {
        Country country = null;
        country = Avustaja.haeMaa(ctx,luettu);
        if(country!= null) {
            new LueMaa(country);
            return;
        }

    }
}
