package implementations;

import interfaces.Country;

public class LueMaa {
    public LueMaa(Country country) {
        System.out.println("\nOfficial name of the coutry: "+country.getName());
        System.out.println ("Population count: "+country.getPopulation());
        System.out.println ("President: "+country.getPresident()+"\n");
    }
}
