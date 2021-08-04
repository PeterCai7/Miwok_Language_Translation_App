package com.example.android.miwok;

/**
 *  {@link Word} represents a vocabulary word that the user wants to learn.
 *
 */
public class Word {
    //Miwok translation
    private String miwokTranslation;

    //Default translation, can be any other language than English
    private String defaultTranslation;

    private static final int NO_IMAGE_PROVIDED = -1;
    //image resource ID
    private int imgResId = NO_IMAGE_PROVIDED;

    private int mAudioResourceId;

    /**
     * Constructor method of Word class for Phrases
     * which would not use a image
     * @param defaultTranslation
     * @param miwokTranslation
     */
    public Word(String defaultTranslation, String miwokTranslation, int mAudioResourceId) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.mAudioResourceId = mAudioResourceId;
    }

    /**
     * Constructor method for remaining activities
     *
     * @param defaultTranslation
     * @param miwokTranslation
     * @param imgResId
     * @param mAudioResourceId
     */
    public Word(String defaultTranslation, String miwokTranslation, int imgResId, int mAudioResourceId) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.imgResId = imgResId;
        this.mAudioResourceId = mAudioResourceId;
    }

    //Getter methods
    public String getMiwokTranslation() {
        return miwokTranslation;
    }
    public String getDefaultTranslation() {
        return defaultTranslation;
    }
    public int getImgResId() { return imgResId; }
    public int getAudioResourceId() {return mAudioResourceId;}

    /**
     * Returns whether or not there is an image for this word
     */
    public boolean hasImage() {
        return imgResId != NO_IMAGE_PROVIDED;
    }
}
