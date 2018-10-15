package implementations.countries;

import interfaces.Country;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Finland")
public class Finland implements Country {

    private String name = "Finland";
    private String president = "Sauli Niinistö";
    private String population = "5 516 224";
    public String getName() {
        return name;
    }

    public String getPresident() {
        return president;
    }

    public String getPopulation() {
        return population;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public void setPresident(String president) {
        this.president = president;
    }


}
