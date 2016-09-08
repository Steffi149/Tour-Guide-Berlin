package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Stefanie on 22.08.2016.
 */
public class RestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sight_list);

        // Create a list of sights
        ArrayList<Sight> sights = new ArrayList<Sight>();
        sights.add(new Sight(getString(R.string.restaurantaddress_one), getString(R.string.restaurantaddress_one), R.drawable.burger));
        sights.add(new Sight(getString(R.string.restaurantaddress_two), getString(R.string.restaurantaddress_two), R.drawable.pizza));
        sights.add(new Sight(getString(R.string.restaurantaddress_three), getString(R.string.restaurantaddress_three), R.drawable.sushi));
        sights.add(new Sight(getString(R.string.restaurantaddress_four), getString(R.string.restaurantaddress_four), R.drawable.indian));
        sights.add(new Sight(getString(R.string.restaurantaddress_five), getString(R.string.restaurantaddress_five), R.drawable.beer));
        sights.add(new Sight(getString(R.string.restaurantaddress_six), getString(R.string.restaurantaddress_six), R.drawable.sweets));
        sights.add(new Sight(getString(R.string.restaurantaddress_seven), getString(R.string.restaurantaddress_seven), R.drawable.healthy));
        sights.add(new Sight(getString(R.string.restaurantaddress_eight), getString(R.string.restaurantaddress_eight), R.drawable.italian ));
        sights.add(new Sight(getString(R.string.restaurantaddress_nine), getString(R.string.restaurantaddress_nine), R.drawable.doener));
        sights.add(new Sight(getString(R.string.restaurantaddress_ten), getString(R.string.restaurantaddress_ten), R.drawable.soup));

        // Create an {@link SightAdapter}, whose data source is a list of {@link Sight}s. The
        // adapter knows how to create list items for each item in the list.
        SightAdapter adapter = new SightAdapter(this, sights, R.color.category_restaurant);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // sights_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link SightAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Sight} in the list.
        listView.setAdapter(adapter);
    }
}

