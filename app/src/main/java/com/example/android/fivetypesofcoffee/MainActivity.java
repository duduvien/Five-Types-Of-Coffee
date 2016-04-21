package com.example.android.fivetypesofcoffee;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void nextPage(View view) {
        Intent coffeeDetails = new Intent(getApplicationContext(), Main2Activity.class);
        switch (view.getId()){
            case R.id.latte:
                coffeeDetails.putExtra("name", "Latte");
                coffeeDetails.putExtra("image",R.drawable.latte_detail);
                coffeeDetails.putExtra("calories", "165cal");
                coffeeDetails.putExtra("description","A latte is a coffee drink made with espresso and steamed milk. The types of milk can be replaced, such as soy milk or almond milk are also used.");
                break;
            case R.id.mocha:
                coffeeDetails.putExtra("name", "Mocha");
                coffeeDetails.putExtra("image",R.drawable.mocha_detail);
                coffeeDetails.putExtra("calories", "330cal");
                coffeeDetails.putExtra("description","Like a caffè latte, Mocha is based on espresso and hot milk, but with added chocolate, typically in the form of sweet cocoa powder, although many varieties use chocolate syrup. Mochas can contain dark or milk chocolate.");
                break;
            case R.id.americano:
                coffeeDetails.putExtra("name", "Americano");
                coffeeDetails.putExtra("image",R.drawable.americano_detail);
                coffeeDetails.putExtra("calories", "15cal");
                coffeeDetails.putExtra("description","Americano is a style of coffee prepared by brewing espresso with added hot water. The strength of an Americano varies with the number of shots of espresso and the amount of water added. ");
                break;
            case R.id.cappuccino:
                coffeeDetails.putExtra("name", "Cappucino");
                coffeeDetails.putExtra("image",R.drawable.cappucino_detail);
                coffeeDetails.putExtra("calories", "150cal");
                coffeeDetails.putExtra("description","A cappuccino is an Italian coffee drink that is traditionally prepared with espresso, hot milk and steamed milk foam. Cream may be used instead of milk and is often topped with cinnamon. It is typically smaller in volume than a caffè latte, with a thicker layer of micro foam.");
                break;
            case R.id.flatWhite:
                coffeeDetails.putExtra("name", "Flat White");
                coffeeDetails.putExtra("image",R.drawable.flatwhite_detail);
                coffeeDetails.putExtra("calories", "120cal");
                coffeeDetails.putExtra("description","A flat white is a coffee beverage that originated in Australia. The beverage is prepared by pouring microfoam (steamed milk consisting of small, fine bubbles with a glossy or velvety consistency) over a single shot or double shot of espresso. Normally served in smaller volume.");
                break;
            default:
                Log.e("MainActivity.java", "Error in nextPage.");
                break;
        }
        startActivity(coffeeDetails);
    }
}
