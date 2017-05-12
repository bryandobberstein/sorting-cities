package org.launchcode.comparators;

import org.launchcode.City;

import java.util.Comparator;

/**
 * Created by max on 5/12/17.
 */
public class PopulationComparator implements Comparator<City>{

    @Override
    public int compare(City o1, City o2) {
        if (o1.getPopulation() > o2.getPopulation()){
            return -1;
        }

        else if (o1.getPopulation() == o2.getPopulation()){
            return 0;
        }

        else{
            return 1;
        }
    }
}
