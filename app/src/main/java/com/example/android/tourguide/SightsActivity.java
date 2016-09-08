package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import java.util.ArrayList;

/**
 * Created by Stefanie on 22.08.2016.
 */
public class SightsActivity extends AppCompatActivity{

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.sight_list);

            // Create a list of sights
            ArrayList<Sight> sights = new ArrayList<Sight>();
            sights.add(new Sight(getString(R.string.sightaddress_one), getString(R.string.sight_one), R.drawable.mauer));
            sights.add(new Sight(getString(R.string.sightaddress_two), getString(R.string.sight_two), R.drawable.bundestag));
            sights.add(new Sight(getString(R.string.sightaddress_three), getString(R.string.sight_three), R.drawable.tor));
            sights.add(new Sight(getString(R.string.sightaddress_four), getString(R.string.sight_four), R.drawable.candle));
            sights.add(new Sight(getString(R.string.sightaddress_five), getString(R.string.sight_five), R.drawable.checkpoint_charlie));
            sights.add(new Sight(getString(R.string.sightaddress_six), getString(R.string.sight_six), R.drawable.saeule));
            sights.add(new Sight(getString(R.string.sightaddress_seven), getString(R.string.sight_seven), R.drawable.museum));
            sights.add(new Sight(getString(R.string.sightaddress_eight), getString(R.string.sight_eight), R.drawable.turm));
            sights.add(new Sight(getString(R.string.sightaddress_nine), getString(R.string.sight_nine), R.drawable.sony));
            sights.add(new Sight(getString(R.string.sightaddress_ten), getString(R.string.sight_ten), R.drawable.damm));

            // Create an {@link SightAdapter}, whose data source is a list of {@link Sight}s. The
            // adapter knows how to create list items for each item in the list.
            SightAdapter adapter = new SightAdapter(this, sights, R.color.category_sights);

            // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
            // There should be a {@link ListView} with the view ID called list, which is declared in the
            // sight_list.xml layout file.
            ListView listView = (ListView) findViewById(R.id.list);

            // Make the {@link ListView} use the {@link SightAdapter} we created above, so that the
            // {@link ListView} will display list items for each {@link Sight} in the list.
            listView.setAdapter(adapter);
        }
    }


