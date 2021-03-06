package com.iReadingGroup.iReading;


public class WordInfo {
    private String word;
    private String meaning;
    private int imageId;
    private boolean isShowingMeaning;
    private boolean collectStatus;

    /**
     * Instantiates a new Word info.
     *
     * @param word    the word
     * @param meaning the meaning
     * @param imageId the image id
     */
    public WordInfo(String word, String meaning, int imageId,boolean isShowingMeaning,boolean collectStatus) {
        this.word = word;//word
        this.meaning = meaning;//meaning
        this.imageId = imageId;//image
        this.isShowingMeaning=isShowingMeaning;//whether showing meaning
        this.collectStatus=collectStatus;
    }

    /**
     * Sets word.
     *
     * @param word the word
     */
    public void setWord(String word) {
        this.word = word;
    }

    /**
     * Set meaning.
     *
     * @param meaning the meaning
     */
    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    /**
     * Sets image id.
     *
     * @param imageId the image id
     */
    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    /**
     * Gets word.
     *
     * @return the word
     */
    public String getWord() {
        return word;
    }

    /**
     * Get meaning string.
     *
     * @return the string
     */
    public String getMeaning() {
        if (isShowingMeaning)return meaning;
        else return "";
    }

    /**
     * Gets image id.
     *
     * @return the image id
     */
    public int getImageId() {
        return imageId;
    }
    public void setShowingMeaning(boolean status)
    {
        if (status) isShowingMeaning=true;
        else isShowingMeaning=false;
    }
    public boolean getCollectStatus(){return  collectStatus;}
    public void setCollectStatus(boolean collectStatus){this.collectStatus=collectStatus;}
}