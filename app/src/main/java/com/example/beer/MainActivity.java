package com.example.beer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {
     private BeerExpert expert=new BeerExpert();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void find_Beer(View view){
        TextView brands = (TextView) findViewById(R.id.brands);
        Spinner color=(Spinner) findViewById(R.id.color);
        String beerType=String.valueOf(color.getSelectedItem());
        ArrayList<String> brandList=expert.getBrands(beerType);
        StringBuilder brandsFormatted=new StringBuilder();
        for(String brand : brandList){
            brandsFormatted.append(brand).append("\n");
        }
        brands.setText(brandsFormatted);
    }
}
class BeerExpert{
    ArrayList<String>  getBrands(String color){
        ArrayList<String> brands=new ArrayList<String>();
        if(color.equals("Amber")){
            brands.add("Jack Amber");
            brands.add("Red Moose");
        }
        else{
            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
        }
        return brands;
    }
}