package com.github.ricardosbarbosa.tourguide;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.ricardosbarbosa.tourguide.model.Location;

import java.util.List;

public class LocationRecyclerViewAdapter
        extends RecyclerView.Adapter<LocationViewHolder> {

    private final List<Location> mLocations;

    public LocationRecyclerViewAdapter(List<Location> locations) {
        mLocations = locations;
    }

    @Override
    public LocationViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.location_list_content, parent, false);
        return new LocationViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final LocationViewHolder holder, int position) {
        Location location = mLocations.get(position);
        holder.mItem = location;
        holder.mNameView.setText(location.name);
        if (location.image != null) {
            Context context = holder.mImageView.getContext();
            holder.mImageView.setImageResource(context.getResources().getIdentifier(location.image, "mipmap", context.getPackageName()));
        }
    }

    @Override
    public int getItemCount() {
        return mLocations.size();
    }


}