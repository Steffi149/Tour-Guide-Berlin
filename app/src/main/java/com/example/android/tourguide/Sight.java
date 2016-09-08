package com.example.android.tourguide;

/**
 * {@link Sight} represents a sight that the user wants to learn about.
 * It contains a sight description and the sight name.
 */
public class Sight {

    /** Name of the sight */
    private String mSightName;

    /** Description of the sight */
    private String mSightDescription;

    /** Image resource ID for the sight */
    private int mImageResourceID = NO_IMAGE_PROVIDED;
    /** Constant value that represents no image was provided for this sight */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Sight object.
     *
     * @param sightName is the name of the popular sight
     * @param sightDescription is a further explanation of what the sight is
     */
    public Sight(String sightName, String sightDescription) {
        mSightName = sightName;
        mSightDescription = sightDescription;
    }
    /**
     * Create a new Sight object.
     *
     * @param sightName is the name of the popular sight
     * @param sightDescription is a further explanation of what the sight is
     * @param imageResourceID is the drawable resource ID for the image asset.
     */
    public Sight(String sightName, String sightDescription, int imageResourceID) {
        mSightName = sightName;
        mSightDescription = sightDescription;
        mImageResourceID = imageResourceID;
    }


    /**
     * Get the name of the popular sight.
     */
    public String getSightName() {
        return mSightName;
    }

    /**
     * Get the explanation of what the sight is.
     */
    public String getSightDescription() {
        return mSightDescription;
    }

    /**
     * Get the illustration for the sight.
     */
    public int getImageResourceID() {
        return mImageResourceID;
    }
    /**
     * * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceID != NO_IMAGE_PROVIDED;
        }
}