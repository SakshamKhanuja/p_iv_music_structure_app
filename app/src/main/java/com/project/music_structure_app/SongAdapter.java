package com.project.music_structure_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;

import com.project.music_structure_app.data.Song;

import java.util.ArrayList;

/**
 * Provides inflated View from {@link R.layout#layout_item_song} layout to a ListView.
 */
public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Context context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Referencing the recycled view.
        View itemView = convertView;

        // Checks if inflating "itemView" is required.
        if (itemView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) getContext()
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            itemView = layoutInflater.inflate(R.layout.layout_item_song, parent, false);
        }

        // Getting the requested Song.
        Song song = getItem(position);

        if (song != null) {
            // Checks which category the Song belongs to and applies the correct serial number.
            TextView textIndex = itemView.findViewById(R.id.item_index);
            ImageView imageRank = itemView.findViewById(R.id.item_rank);

            // Checks if song is in "You May Also Like" category.
            if (song.isSongIsInCharts()) {
                textIndex.setText(String.valueOf(song.getIndex()));
                imageRank.setImageDrawable(AppCompatResources.getDrawable(getContext(),
                        song.getRankDrawable()));
                textIndex.setVisibility(View.VISIBLE);
                imageRank.setVisibility(View.VISIBLE);
            } else {
                imageRank.setVisibility(View.GONE);
                // Song is from "First" screen.
                if (song.isSongIsInFavoriteCategory()) {
                    textIndex.setText(String.valueOf(song.getIndex()));
                    textIndex.setVisibility(View.VISIBLE);
                } else {
                    // Song is in "You May Also Like" category.
                    textIndex.setVisibility(View.GONE);
                }
            }

            // Sets the album art drawable.
            ImageView imageAlbumArt = itemView.findViewById(R.id.item_album_art);
            imageAlbumArt.setImageResource(song.getAlbumArtID());

            // Sets the song name.
            TextView textSongName = itemView.findViewById(R.id.item_song_name);
            textSongName.setText(song.getName());

            // Sets the song duration.
            TextView textDuration = itemView.findViewById(R.id.item_duration);
            textDuration.setText(song.getDuration());

            // Sets the artist name.
            TextView textArtistName = itemView.findViewById(R.id.item_artist_name);
            textArtistName.setText(song.getArtist());

            // Sets the launch year.
            TextView textYear = itemView.findViewById(R.id.item_year);
            textYear.setText(String.valueOf(song.getYear()));

            // Show next Category Label
            TextView textSongCategory = itemView.findViewById(R.id.item_category);
            TextView textSongChartCategory = itemView.findViewById(R.id.item_chart_category);
            if (song.isLastOfCategory()) {
                // Checks if song is under Chart Category.
                if (song.isChartDrawablePresent()) {
                    textSongCategory.setVisibility(View.GONE);
                    textSongChartCategory.setText(song.getCategoryName());
                    textSongChartCategory.setVisibility(View.VISIBLE);

                } else {
                    textSongChartCategory.setVisibility(View.GONE);
                    textSongCategory.setText(song.getCategoryName());
                    textSongCategory.setVisibility(View.VISIBLE);
                }
            } else {
                textSongCategory.setVisibility(View.GONE);
                textSongChartCategory.setVisibility(View.GONE);
            }
        }

        return itemView;
    }
}
