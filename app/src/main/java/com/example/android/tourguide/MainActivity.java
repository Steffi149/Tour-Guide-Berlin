package com.example.android.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the event category
        TextView events = (TextView) findViewById(R.id.events);

        // Set a click listener on that View
        assert events != null;
        events.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link EventsActivity}
                Intent eventIntent = new Intent(MainActivity.this, EventsActivity.class);

                // Start the new activity
                startActivity(eventIntent);
            }
        });

        // Find the View that shows the nightlife category
        TextView nightlife = (TextView) findViewById(R.id.nightlife);

        // Set a click listener on that View
        nightlife.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NightlifeActivity}
                Intent nightlifeIntent = new Intent(MainActivity.this, NightlifeActivity.class);

                // Start the new activity
                startActivity(nightlifeIntent);
            }
        });

        // Find the View that shows the restaurants category
        TextView restaurants = (TextView) findViewById(R.id.restaurants);

        // Set a click listener on that View
        restaurants.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link RestaurantsActivity}
                Intent restaurantsIntent = new Intent(MainActivity.this, RestaurantsActivity.class);

                // Start the new activity
                startActivity(restaurantsIntent);
            }
        });

        // Find the View that shows the sights category
        TextView sights = (TextView) findViewById(R.id.sights);

        // Set a click listener on that View
        sights.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SightsActivity}
                Intent sightsIntent = new Intent(MainActivity.this, SightsActivity.class);

                // Start the new activity
                startActivity(sightsIntent);
            }
        });
    }
}
