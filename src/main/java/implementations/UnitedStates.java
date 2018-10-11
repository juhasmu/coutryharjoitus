package implementations;

import interfaces.Country;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("UnitedStates")
public class UnitedStates implements Country{
    private String name = "United States";
    private String president = "Donald Trump";
    private String population = "325,7 miljoonaa";

    public String getName() {
        return name;
    }

    public String getPresident() {
        return president;
    }

    public String getPopulation() {
        return population;
    }
}
