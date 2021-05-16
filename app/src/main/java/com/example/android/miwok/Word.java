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

    public Word(String defaultTranslation, String miwokTranslation) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
    }

    //Getter methods
    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }


}
