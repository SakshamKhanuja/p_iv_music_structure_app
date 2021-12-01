package com.project.music_structure_app.data;

/**
 * Defines a Song.
 */
public class Song {

    // Stores the index of Song in a category.
    private int index;

    // Stores the name of the song.
    private final String name;

    // Stores the artist of the song.
    private final String artist;

    // Stores in which year this song was launched.
    private final int year;

    // Stores how long is this song.
    private final String duration;

    // Album Art
    private final int albumArtID;

    private String categoryName;

    private boolean songIsInFavoriteCategory;

    private boolean chartDrawablePresent;

    private int rankDrawable;

    private boolean songIsInCharts;

    /**
     * Indicates whether song is last of its category. This check allows
     * {@link com.project.music_structure_app.SongAdapter} to show label for next Song category.
     */
    private boolean lastOfCategory;

    /**
     * Initializes a basic Song object.
     *
     * @param name       The name of the Song.
     * @param artist     The name of the artist.
     * @param year       The year in which the song launched in.
     * @param duration   The duration of the song.
     * @param albumArtID Album Art resource ID.
     */
    public Song(String name, String artist, int year, String duration, int albumArtID) {
        this.name = name;
        this.artist = artist;
        this.year = year;
        this.duration = duration;
        this.albumArtID = albumArtID;
        lastOfCategory = false;
        songIsInFavoriteCategory = false;
        chartDrawablePresent = false;
        songIsInCharts = false;
    }

    /**
     * Initializes a Song for "Your Favorites" Category.
     *
     * @param index The index value of this Song in a Song Category.
     */
    public Song(int index, String name, String artist, int year, String duration, int albumArtID) {
        this(name, artist, year, duration, albumArtID);
        this.index = index;
        songIsInFavoriteCategory = true;
    }

    /**
     * Initializes a Song which is placed in the last position of any Song category.
     *
     * @param categoryName The name of the Category this song will be placed.
     */
    public Song(int index, String name, String artist, int year, String duration, int albumArtID,
                String categoryName) {
        this(index, name, artist, year, duration, albumArtID);
        this.categoryName = categoryName;
        lastOfCategory = true;
    }


    /**
     * Initializes a Song for "Charts" screen.
     *
     * @param rankDrawable The image resource ID that represents whether song is climbing or
     *                     falling from the charts.
     */
    public Song(int index, String name, String artist, int year, String duration, int albumArtID,
                int rankDrawable) {
        this(name, artist, year, duration, albumArtID);
        this.index = index;
        this.rankDrawable = rankDrawable;
        songIsInCharts = true;
    }

    /**
     * Initializes a Song which is placed in the last position of any song category in "Chart"
     * Screen.
     *
     * @param categoryName The name of the Category this song will be placed.
     */
    public Song(int index, String name, String artist, int year, String duration, int albumArtID,
                String categoryName, int rankDrawable) {
        this(index, name, artist, year, duration, albumArtID, rankDrawable);
        this.categoryName = categoryName;
        lastOfCategory = true;
        chartDrawablePresent = true;
    }

    /**
     * @return the song place in a category.
     */
    public int getIndex() {
        return index;
    }

    /**
     * @return the name of the song.
     */
    public String getName() {
        return name;
    }

    /**
     * @return the artist of the song.
     */
    public String getArtist() {
        return artist;
    }

    /**
     * @return the launch year of the song.
     */
    public int getYear() {
        return year;
    }

    /**
     * @return the duration of the song.
     */
    public String getDuration() {
        return duration;
    }

    /**
     * @return the resource ID of album art of the song.
     */
    public int getAlbumArtID() {
        return albumArtID;
    }

    /**
     * @return 'true' if Song is last of its category, otherwise 'false'.
     */
    public boolean isLastOfCategory() {
        return lastOfCategory;
    }

    /**
     * @return 'true' if Song is "Your Favorites" category, otherwise 'false'.
     */
    public boolean isSongIsInFavoriteCategory() {
        return songIsInFavoriteCategory;
    }

    /**
     * @return The category in which this Song is placed in.
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * @return Returns 'true' for Chart Song Category, otherwise 'false'.
     */
    public boolean isChartDrawablePresent() {
        return chartDrawablePresent;
    }

    /**
     * @return Returns 'true' if song is placed in Chart Screen.
     */
    public boolean isSongIsInCharts() {
        return songIsInCharts;
    }

    /**
     * @return Returns the drawable resource ID for rank.
     */
    public int getRankDrawable() {
        return rankDrawable;
    }
}