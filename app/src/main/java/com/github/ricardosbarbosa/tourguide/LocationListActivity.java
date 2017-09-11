package com.github.ricardosbarbosa.tourguide;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.github.ricardosbarbosa.tourguide.model.Lists;

public class LocationListActivity extends AppCompatActivity {

    private String list_name_value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_list);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle(getTitle());

        // Show the Up button in the action bar.
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        list_name_value = getIntent().getStringExtra(getString(R.string.list_name_param));
        assert list_name_value != null;

        View recyclerView = findViewById(R.id.location_list);
        assert recyclerView != null;
        setupRecyclerView((RecyclerView) recyclerView);
    }

    private void setupRecyclerView(@NonNull RecyclerView recyclerView) {
        if (list_name_value.equals(getString(R.string.museus))) {
            recyclerView.setAdapter(new LocationRecyclerViewAdapter(Lists.getInstance(this).MUSEUS));
        } else if (list_name_value.equals(getString(R.string.churches))) {
            recyclerView.setAdapter(new LocationRecyclerViewAdapter(Lists.getInstance(this).CHURCHES));
        } else if (list_name_value.equals(getString(R.string.historical))) {
            recyclerView.setAdapter(new LocationRecyclerViewAdapter(Lists.getInstance(this).HISTORICALS));
        } else if (list_name_value.equals(getString(R.string.parques))) {
            recyclerView.setAdapter(new LocationRecyclerViewAdapter(Lists.getInstance(this).PARQUES));
        }
    }
}
