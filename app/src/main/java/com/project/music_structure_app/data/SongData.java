package com.project.music_structure_app.data;

import com.project.music_structure_app.R;

import java.util.ArrayList;

/**
 * Stores app data.
 */
public class SongData {

    private SongData() {
    }

    /**
     * Get list of Songs from here.
     *
     * @param category represents the category of Songs:
     *                 0 - Home Screen
     *                 1 - Charts
     *                 2 - My Library
     * @return an ArrayList of {@link Song}.
     */
    public static ArrayList<Song> getSongs(int category) {
        switch (category) {
            case 0:
                ArrayList<Song> homeScreenSongs = new ArrayList<>();
                homeScreenSongs.add(new Song(1, "Something You Could Never Own", "Neffex", 2021, "2:48", R.drawable.album_art_fav_one));
                homeScreenSongs.add(new Song(2, "Majha Block", "Prem Dhillon", 2020, "4:06", R.drawable.album_art_fav_two));
                homeScreenSongs.add(new Song(3, "Jugni 2.0", "Kanika Kapoor", 2020, "3:13", R.drawable.album_art_fav_three));
                homeScreenSongs.add(new Song(4, "Double Addi", "Micky Singh, Amar Sandhu", 2014, "4:08", R.drawable.album_art_fav_four));
                homeScreenSongs.add(new Song(5, "Closer (Remix)", "The Chainsmokers", 2016, "4:21", R.drawable.album_art_fav_five));
                homeScreenSongs.add(new Song(6, "Tokoyo Drift", "Teriyaki Boyz", 2012, "4:17", R.drawable.album_art_fav_six));
                homeScreenSongs.add(new Song(7, "Udd Gaye", "Ritviz", 2017, "3:00", R.drawable.album_art_fav_seven, "You May Also Like"));
                homeScreenSongs.add(new Song("Easy On Me", "Adele", 2021, "3:44", R.drawable.album_art_today_one));
                homeScreenSongs.add(new Song("STAW (with Justin Bieber)", "The Kid LAROI, Justin Bieber", 2021, "2:21", R.drawable.album_art_today_two));
                homeScreenSongs.add(new Song("Heat Waves", "Glass Animal", 2021, "3:58", R.drawable.album_art_today_three));
                homeScreenSongs.add(new Song("Shivers", "Ed Sheeran", 2021, "3:27", R.drawable.album_art_today_four));
                homeScreenSongs.add(new Song("My Universe", "Coldplay, BTS", 2021, "3:46", R.drawable.album_art_today_five));
                return homeScreenSongs;

            case 1:
                ArrayList<Song> chartSongs = new ArrayList<>();
                chartSongs.add(new Song(1,"Raataan Lambiyan (From \"Shershaah\")", "Tanishk Bagchi, Jubin Nautiyal, Asees Kaur", 2021, "3:50", R.drawable.album_art_india_one, R.drawable.ic_inc));
                chartSongs.add(new Song(2, "Bijlee Bijlee", "Harrdy Sandhu", 2021, "2:48", R.drawable.album_art_india_two, R.drawable.ic_inc));
                chartSongs.add(new Song(3, "Ranjha (From \"Shershaah\")", "Jasleen Royal, B Praak, Romy", 2021, "3:48", R.drawable.album_art_india_three, R.drawable.ic_desc));
                chartSongs.add(new Song(4, "Najaa (From \"Sooryavanshi\")", "Tanishk Bagchi, Pav Dharia, Nikhita Gandhi", 2021, "3:11", R.drawable.album_art_india_four, R.drawable.ic_inc));
                chartSongs.add(new Song(5, "Lover", "Diljit Dosanjh", 2021, "3:10", R.drawable.album_art_india_five, R.drawable.ic_desc));
                chartSongs.add(new Song(6, "Dil Ko Karaar Aaya (From \"Sukoon\")", "Yasser Desai, Neha Kakkar, Rajat Nagpal", 2021, "3:51", R.drawable.album_art_india_six, R.drawable.ic_desc));
                chartSongs.add(new Song(7, "Shayad", "Pritam, Arijit Singh", 2021, "4:07", R.drawable.album_art_india_seven, R.drawable.ic_desc));
                chartSongs.add(new Song(8, "Sakhiyan 2.0", "Maninder Buttar, Zahrah S Khan, Tanishk Bagchi", 2021, "2:57", R.drawable.album_art_india_eight, R.drawable.ic_inc));
                chartSongs.add(new Song(9, "Brown Munde", "AP Dhillon, Gminxr, Gurinder Gill, Shinda Kahlon", 2021, "4:14", R.drawable.album_art_india_nine, R.drawable.ic_desc));
                chartSongs.add(new Song(10, "Chitta", "Manan Bhardwaj", 2021, "3:48", R.drawable.album_art_india_ten, "Global", R.drawable.ic_inc));
                chartSongs.add(new Song(1, "Easy On Me", "Adele", 2021, "3:44", R.drawable.album_art_today_one, R.drawable.ic_inc));
                chartSongs.add(new Song(2, "Toxic", "Boy With Uke", 2021, "2:48", R.drawable.album_art_global_one, R.drawable.ic_desc));
                chartSongs.add(new Song(3, "Moth To A Flame", "Swedish House Mafia, The Weeknd", 2021, "3:54", R.drawable.album_art_global_two, R.drawable.ic_inc));
                chartSongs.add(new Song(4, "STAW (with Justin Bieber)", "The Kid LAROI, Justin Bieber", 2021, "2:21", R.drawable.album_art_today_two, R.drawable.ic_inc));
                chartSongs.add(new Song(5, "Heat Waves", "Glass Animal", 2021, "3:58", R.drawable.album_art_today_three, R.drawable.ic_desc));
                chartSongs.add(new Song(6, "Blinding Lights", "The Weeknd", 2021, "3:20", R.drawable.album_art_global_three, R.drawable.ic_inc));
                chartSongs.add(new Song(7, "Shivers", "Ed Sheeran", 2021, "3:27", R.drawable.album_art_today_four, R.drawable.ic_inc));
                chartSongs.add(new Song(8, "Traitor", "Olivia Rodrigo", 2021, "3:49", R.drawable.album_art_global_four, R.drawable.ic_desc));
                chartSongs.add(new Song(9, "My Universe", "Coldplay, BTS", 2021, "3:46", R.drawable.album_art_today_five, R.drawable.ic_desc));
                chartSongs.add(new Song(10, "Happier Than Ever", "Billie Eilish", 2021, "4:58", R.drawable.album_art_global_five, R.drawable.ic_inc));
                return chartSongs;

            case 2:
                ArrayList<Song> library = new ArrayList<>();
                library.add(new Song("Jugni", "Kanika Kapoor", 2012, "3:30", R.drawable.album_art_lib_one));
                library.add(new Song("After Party", "Kanika Kapoor", 2021, "3:08", R.drawable.album_art_lib_two));
                library.add(new Song("This House", "Tom MacDonald", 2018, "3:27", R.drawable.album_art_lib_three));
                library.add(new Song("Jugni 2.0", "Kanika Kapoor", 2020, "3:13", R.drawable.album_art_fav_three));
                library.add(new Song("Udd Gaye", "Ritviz", 2017, "3:00", R.drawable.album_art_fav_seven));
                library.add(new Song("Tokoyo Drift", "Teriyaki Boyz", 2012, "4:17", R.drawable.album_art_fav_six));
                library.add(new Song("Pro", "Neffex", 2017, "3:37", R.drawable.album_art_lib_four));
                library.add(new Song("Knightridah", "Imran Khan", 2018, "3:12", R.drawable.album_art_lib_five));
                library.add(new Song("Something You Could Never Own", "Neffex", 2021, "2:48", R.drawable.album_art_fav_one));
                library.add(new Song("Majha Block", "Prem Dhillon", 2020, "4:06", R.drawable.album_art_fav_two));
                library.add(new Song("Presiden Roley", "Imran Khan", 2017, "3:03", R.drawable.album_art_lib_six));
                library.add(new Song("Double Addi", "Micky Singh, Amar Sandhu", 2014, "4:08", R.drawable.album_art_fav_four));
                library.add(new Song("It's Only Worth It If You Work For It", "Neffex", 2021, "3:04", R.drawable.album_art_lib_seven));
                library.add(new Song("A Year Ago", "Neffex", 2021, "2:55", R.drawable.album_art_lib_eight));
                library.add(new Song("No Turning Back", "Neffex", 2021, "2:38", R.drawable.album_art_lib_nine));
                library.add(new Song("Closer To Heaven", "Neffex", 2020, "3:05", R.drawable.album_art_lib_ten));
                library.add(new Song("Closer (Remix)", "The Chainsmokers", 2016, "4:21", R.drawable.album_art_fav_five));
                return library;

            default:
                return null;
        }
    }
}