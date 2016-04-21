package com.example.android.fivetypesofcoffee;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Get previous activity's intent
        Intent previousActivity = getIntent();

        //Get data from Intent
        String name = previousActivity.getStringExtra("name");
        int imageId = previousActivity.getIntExtra("image", 0);
        String calories = previousActivity.getStringExtra("calories");
        String description = previousActivity.getStringExtra("description");


        //Get all views that need to edit
        TextView nameText = (TextView) findViewById(R.id.coffee_name_text_view);
        ImageView coffeeImage = (ImageView) findViewById(R.id.coffee_image);
        TextView caloriesText = (TextView) findViewById(R.id.calories_text_view);
        TextView descriptionText = (TextView) findViewById(R.id.description_text_view);

        //Set data to views
        nameText.setText(name);
        coffeeImage.setImageResource(imageId);
        caloriesText.setText(calories);
        descriptionText.setText(description);
    }
}
