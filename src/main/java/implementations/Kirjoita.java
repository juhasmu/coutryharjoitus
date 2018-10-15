package implementations;

import interfaces.Country;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Kirjoita {
    public Kirjoita(AnnotationConfigApplicationContext ctx, String luettu) {
        Country country = null;
        country = Avustaja.haeMaa(ctx,luettu);
        if(country !=null) {
            new Tallennus(country);
            return;
        }
    }
}
