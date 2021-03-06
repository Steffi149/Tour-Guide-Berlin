package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link SightAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Sight} objects.
 */
public class SightAdapter extends ArrayAdapter<Sight>  {

    /** setResource ID for background color */
    private int mColorResourceId;

    /**
     * Create a new {@link SightAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param sights is the list of {@link Sight}s to be displayed.
     * @param ColorResourceId is the resource ID for the background color for this list of sights
     */
    public SightAdapter(Context context, ArrayList<Sight> sights, int ColorResourceId) {
        super(context, 0, sights);
        mColorResourceId = ColorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Sight} object located at this position in the list
        Sight currentSight = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID sight_text_view.
        TextView sightTextView = (TextView) listItemView.findViewById(R.id.sight_text_view);
        // Get the sight description from the currentSight object and set this text on
        // the sight TextView.
        sightTextView.setText(currentSight.getSightDescription());

        // Find the TextView in the list_item.xml layout with the ID default_text_view.
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        // Get the name of the currentSight object and set this text on
        // the default TextView.
        defaultTextView.setText(currentSight.getSightName());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Check if an image is provided for this word or not
        if (currentSight.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentSight.getImageResourceID());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);


// Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}