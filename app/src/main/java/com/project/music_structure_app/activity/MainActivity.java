package com.project.music_structure_app.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import com.project.music_structure_app.R;
import com.project.music_structure_app.SongAdapter;
import com.project.music_structure_app.data.SongData;
import com.project.music_structure_app.databinding.LayoutListBinding;

/**
 * Shows a list of user favorite {@link com.project.music_structure_app.data.Song} and some
 * suggestions. It includes Buttons to open up other Song categories.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Setting Content View.
        LayoutInflater inflater = (LayoutInflater)
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        LayoutListBinding binding = LayoutListBinding.inflate(inflater);
        setContentView(binding.getRoot());

        // Adding Header View to the ListView.
        View headerView = inflater.inflate(R.layout.layout_header_main,
                binding.listView, false);
        binding.listView.addHeaderView(headerView);

        // Attaching a custom ArrayAdapter to ListView.
        binding.listView.setAdapter(new SongAdapter(this, SongData.getSongs(0)));

        // Adding Footer View to the ListView.
        binding.listView.addFooterView(inflater.inflate(R.layout.layout_footer_default,
                binding.listView, false));

        Resources res = getResources();

        // Registering a callback to "Charts" Button in order to open "ChartActivity".
        Button genreButton = headerView.findViewById(R.id.button_chart);
        genreButton.setOnClickListener(view ->
                openActivity(res.getInteger(R.integer.categoryChart)));

        // Registering a callback to "Library" Button in order to open "LibraryActivity".
        Button libButton = headerView.findViewById(R.id.button_library);
        libButton.setOnClickListener(view ->
                openActivity(res.getInteger(R.integer.categoryLibrary)));
    }

    /**
     * Creates an Explicit Intent and opens up the destination activity.
     */
    private void openActivity(int category) {
        Intent intent = new Intent(this, CategoryActivity.class);
        intent.putExtra(CategoryActivity.EXTRA_CATEGORY, category);
        startActivity(intent);
    }
}