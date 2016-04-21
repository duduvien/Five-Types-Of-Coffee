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
                coffeeDetails.putExtra("description","First");
                break;
            case R.id.mocha:
                coffeeDetails.putExtra("name", "Mocha");
                coffeeDetails.putExtra("image",R.drawable.mocha_detail);
                coffeeDetails.putExtra("calories", "330cal");
                coffeeDetails.putExtra("description","Second");
                break;
            case R.id.americano:
                coffeeDetails.putExtra("name", "Americano");
                coffeeDetails.putExtra("image",R.drawable.americano_detail);
                coffeeDetails.putExtra("calories", "15cal");
                coffeeDetails.putExtra("description","Third");
                break;
            case R.id.cappuccino:
                coffeeDetails.putExtra("name", "Cappucino");
                coffeeDetails.putExtra("image",R.drawable.cappucino_detail);
                coffeeDetails.putExtra("calories", "150cal");
                coffeeDetails.putExtra("description","Forth");
                break;
            case R.id.flatWhite:
                coffeeDetails.putExtra("name", "Flat White");
                coffeeDetails.putExtra("image",R.drawable.flatwhite_detail);
                coffeeDetails.putExtra("calories", "120cal");
                coffeeDetails.putExtra("description","Fifth");
                break;
            default:
                Log.e("MainActivity.java", "Error in nextPage.");
                break;
        }
        startActivity(coffeeDetails);
    }
}
