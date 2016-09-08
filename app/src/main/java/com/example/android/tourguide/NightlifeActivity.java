package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Stefanie on 22.08.2016.
 */
public class NightlifeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sight_list);

        // Create a list of sights
        ArrayList<Sight> sights = new ArrayList<Sight>();
        sights.add(new Sight(getString(R.string.address_one), getString(R.string.nightlife_one), R.drawable.martini));
        sights.add(new Sight(getString(R.string.address_two), getString(R.string.nightlife_two), R.drawable.cocktail));
        sights.add(new Sight(getString(R.string.address_three), getString(R.string.nightlife_three), R.drawable.berghain));
        sights.add(new Sight(getString(R.string.address_four), getString(R.string.nightlife_four), R.drawable.wine));
        sights.add(new Sight(getString(R.string.address_five), getString(R.string.nightlife_five), R.drawable.morebeer));
        sights.add(new Sight(getString(R.string.address_six), getString(R.string.nightlife_six), R.drawable.beer));
        sights.add(new Sight(getString(R.string.address_seven), getString(R.string.nightlife_seven), R.drawable.dancing));
        sights.add(new Sight(getString(R.string.address_eight), getString(R.string.nightlife_eight), R.drawable.art ));
        sights.add(new Sight(getString(R.string.address_nine), getString(R.string.nightlife_nine), R.drawable.gayclub));
        sights.add(new Sight(getString(R.string.address_ten), getString(R.string.nightlife_ten), R.drawable.fiestalatina));

        // Create an {@link SightAdapter}, whose data source is a list of {@link Sight}s. The
        // adapter knows how to create list items for each item in the list.
        SightAdapter adapter = new SightAdapter(this,sights, R.color.category_nightlife);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // sight_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link SightAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Sight} in the list.
        listView.setAdapter(adapter);
    }
}
