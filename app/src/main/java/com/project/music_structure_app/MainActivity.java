package com.project.music_structure_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import com.project.music_structure_app.data.SongData;
import com.project.music_structure_app.databinding.LayoutListBinding;

public class MainActivity extends AppCompatActivity {

    // Performs View Binding.
    private LayoutListBinding mBinding;

    // Inflates View from Layout.
    private LayoutInflater mInflater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mBinding = LayoutListBinding.inflate(mInflater);
        setContentView(mBinding.getRoot());

        // Adding Header View to the ListView.
        View headerView = mInflater.inflate(R.layout.layout_header_main,
                mBinding.listView, false);
        mBinding.listView.addHeaderView(headerView);

        // Attaching a custom ArrayAdapter to ListView.
        mBinding.listView.setAdapter(new SongAdapter(this, SongData.getSongs(0)));

        // Adding Footer View to the ListView.
        mBinding.listView.addFooterView(mInflater.inflate(R.layout.layout_footer_default,
                mBinding.listView, false));

        // Registering a callback to "Charts" Button in order to open "ChartActivity".
        Button genreButton = headerView.findViewById(R.id.button_chart);
        genreButton.setOnClickListener(view -> openActivity(1));

        // Registering a callback to "Library" Button in order to open "LibraryActivity".
        Button libButton = headerView.findViewById(R.id.button_library);
        libButton.setOnClickListener(view -> openActivity(2));
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