package com.project.music_structure_app.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;

import com.project.music_structure_app.R;
import com.project.music_structure_app.SongAdapter;
import com.project.music_structure_app.data.SongData;
import com.project.music_structure_app.databinding.LayoutListBinding;

/**
 * Shows a list of {@link com.project.music_structure_app.data.Song} that are placed in a category.
 */
public class CategoryActivity extends AppCompatActivity {

    // Intent Extra required to be attached by the origin Activity.
    public static final String EXTRA_CATEGORY = "com.project.music_structure_app.Category";

    /*
     * Indicates what category of Songs to show.
     *
     * 1 - Charts
     * 2 - My Library
     */
    private int category;

    // The layout resource ID containing the header view.
    private int headerLayoutID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Receive the Explicit Intent from "MainActivity".
        Intent intent = getIntent();
        if (intent == null) {
            return;
        }

        // Sets Song Category and Header View for ListView containing Songs.
        setCategory(intent);

        // Setting Content View.
        LayoutInflater mInflater = (LayoutInflater)
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        LayoutListBinding binding = LayoutListBinding.inflate(mInflater);
        setContentView(binding.getRoot());

        // Adding Header View to ListView.
        binding.listView.addHeaderView(mInflater.inflate(headerLayoutID, binding.listView,
                false));

        // Attaching a custom ArrayAdapter to ListView.
        binding.listView.setAdapter(new SongAdapter(this, SongData.getSongs(category)));

        // Adding Footer View to the ListView.
        binding.listView.addFooterView(mInflater.inflate(R.layout.layout_footer_default,
                binding.listView, false));
    }

    /**
     * Gets the Song Category from the Intent that started this Activity.
     */
    private void setCategory(Intent intent) {
        if (intent.hasExtra(EXTRA_CATEGORY)) {
            category = intent.getIntExtra(EXTRA_CATEGORY, 1);
            if (category == 1) {
                headerLayoutID = R.layout.layout_header_charts;
            } else if (category == 2) {
                headerLayoutID = R.layout.layout_header_library;
            }
        }
    }
}