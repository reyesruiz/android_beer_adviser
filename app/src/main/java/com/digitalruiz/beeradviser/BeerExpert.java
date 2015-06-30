package com.digitalruiz.beeradviser;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by reyes on 6/29/15.
 */
public class BeerExpert {
    List<String> getBrands(String color) {
        List<String> brands = new ArrayList<String>();
        if (color.equals("amber")) {
            brands.add("Jack Amber");
            brands.add("Red Moose");
        }
        else if (color.equals("light")){
            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
        }
        else if (color.equals("brown")){
            brands.add("Some brown beer");
        }
        else if (color.equals("dark")){
            brands.add("Negra Modelo");
        }
        else {
              brands.add("Something went wrong");
        }

        return brands;
    }

}
