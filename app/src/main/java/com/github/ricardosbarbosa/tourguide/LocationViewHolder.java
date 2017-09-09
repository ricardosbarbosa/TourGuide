package com.github.ricardosbarbosa.tourguide;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.ricardosbarbosa.tourguide.model.Location;

public class LocationViewHolder extends RecyclerView.ViewHolder {
    private final View mView;
    public final TextView mNameView;
    public final ImageView mImageView;
    public Location mItem;

    public LocationViewHolder(View view) {
        super(view);
        mView = view;
        mNameView = (TextView) view.findViewById(R.id.name);
        mImageView = (ImageView) view.findViewById(R.id.image);
    }

    @Override
    public String toString() {
        return super.toString() + " '" + mNameView.getText() + "'";
    }
}