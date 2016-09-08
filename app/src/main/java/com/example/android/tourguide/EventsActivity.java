package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Stefanie on 22.08.2016.
 */
public class EventsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sight_list);

        // Create a list of sights
        ArrayList<Sight> sights = new ArrayList<Sight>();
        sights.add(new Sight(getString(R.string.date_one), getString(R.string.event_one)));
        sights.add(new Sight(getString(R.string.date_two), getString(R.string.event_two)));
        sights.add(new Sight(getString(R.string.date_three), getString(R.string.event_three)));
        sights.add(new Sight(getString(R.string.date_four), getString(R.string.event_four)));
        sights.add(new Sight(getString(R.string.date_five), getString(R.string.event_five)));
        sights.add(new Sight(getString(R.string.date_six), getString(R.string.event_six)));
        sights.add(new Sight(getString(R.string.date_seven), getString(R.string.event_seven)));
        sights.add(new Sight(getString(R.string.date_eight), getString(R.string.event_eight)));
        sights.add(new Sight(getString(R.string.date_nine), getString(R.string.event_nine)));
        sights.add(new Sight(getString(R.string.date_ten), getString(R.string.event_ten)));
        sights.add(new Sight(getString(R.string.date_eleven), getString(R.string.event_eleven)));

        // Create an {@link SightAdapter}, whose data source is a list of {@link Sight}s. The
        // adapter knows how to create list items for each item in the list.
        SightAdapter adapter = new SightAdapter(this, sights, R.color.category_events);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // sight_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link SightAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Sight} in the list.
        listView.setAdapter(adapter);
    }
}


