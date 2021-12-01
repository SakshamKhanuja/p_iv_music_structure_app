package com.project.music_structure_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;

import com.project.music_structure_app.data.SongData;
import com.project.music_structure_app.databinding.LayoutListBinding;

public class CategoryActivity extends AppCompatActivity {

    // Performs View Binding
    private LayoutListBinding mBinding;

    // Inflates View from Layout.
    private LayoutInflater mInflater;

    public static final String EXTRA_CATEGORY = "com.project.music_structure_app.Category";

    /*
     *
     */
    private int category;

    private int headerLayoutID;

    private int footerLayoutID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Receive the Explicit Intent from "MainActivity".
        Intent intent = getIntent();
        if(intent == null) {
            return;
        }

        // Set Content.
        mInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mBinding = LayoutListBinding.inflate(mInflater);
        setContentView(mBinding.getRoot());

        // Sets Category Layout
        if(intent.hasExtra(EXTRA_CATEGORY)) {
            category = intent.getIntExtra(EXTRA_CATEGORY, 1);
            if(category == 1) {
                headerLayoutID = R.layout.layout_header_charts;
                footerLayoutID = R.layout.layout_footer_default;
            } else if(category == 2) {
                headerLayoutID = R.layout.layout_header_library;
                footerLayoutID = R.layout.layout_footer_library;
            }
        }

        // Adding Header View to ListView.
        mBinding.listView.addHeaderView(mInflater.inflate(headerLayoutID, mBinding.listView,
                false));

        // Attaching a custom ArrayAdapter to ListView.
        mBinding.listView.setAdapter(new SongAdapter(this, SongData.getSongs(category)));

        // Adding Footer View to the ListView.
        mBinding.listView.addFooterView(mInflater.inflate(footerLayoutID, mBinding.listView,
                false));
    }
}