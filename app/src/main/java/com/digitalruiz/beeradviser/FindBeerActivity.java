package com.digitalruiz.beeradviser;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;


public class FindBeerActivity extends Activity {
    private BeerExpert expert = new BeerExpert();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

   public void onClickFindBeer(View view){
       //Get reference to the Text view
       TextView brands = (TextView) findViewById(R.id.brands);
       //Get reference to the spinner
       Spinner color = (Spinner) findViewById(R.id.color);
       //Get the value of the selected item in the spinner
       String beerType = String.valueOf(color.getSelectedItem());
       //Get recommendations from the expert
       List<String> brandList = expert.getBrands(beerType);
       StringBuilder brandsFormatted = new StringBuilder();
       for (String brand:brandList){
           brandsFormatted.append(brand).append('\n');
       }
       //Display
       brands.setText(brandsFormatted);
   }




}
