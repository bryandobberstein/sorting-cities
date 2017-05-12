package org.launchcode.comparators;

import org.launchcode.City;

import java.util.Comparator;

/**
 * Created by max on 5/12/17.
 */
public class AreaComparator implements Comparator<City>{

    @Override
    public int compare(City o1, City o2) {
        if (o1.getArea() > o2.getArea()){
            return -1;
        }
        else if (o1.getArea() == o2.getArea()){
            return 0;
        }
        else{
            return 1;
        }
    }
}
