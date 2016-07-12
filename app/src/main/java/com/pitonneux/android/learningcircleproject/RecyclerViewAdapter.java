package com.pitonneux.android.learningcircleproject;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by jonathan on 16-07-10.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    // Provide a reference to the views for each data item
    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView itemCityName;
        public TextView itemGeolocation;
        public ImageView itemCityIcon;
        public RelativeLayout itemParent;


        public ViewHolder(View v) {
            super(v);
            itemCityName = (TextView) v.findViewById(R.id.list_item_cityname);
            itemGeolocation = (TextView) v.findViewById(R.id.list_item_geolocation);
            itemCityIcon = (ImageView) v.findViewById(R.id.list_item_city_icon);
            itemParent = (RelativeLayout) v.findViewById(R.id.list_item_parent);
        }
    }

    // Create new views (invoked by the layout manager)
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

//        create a view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview_item, parent, false);
        // set the view's size, margins, paddings and layout parameters here, if necessary
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

//    Replace the contents of the views
    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
//        gets the elements from the dataset at the right position, and places it in the view at that position
        holder.itemCityName.setText(DataClass.cityNames[position]);
        holder.itemGeolocation.setText(DataClass.cityGeolocations[position]);
        holder.itemCityIcon.setImageResource(DataClass.cityIconIDs[position]);
        holder.itemParent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                placeholder below
                Log.v("TAG", "blablabla");

//                This is where I'll start the detailView activity, and pass it a key based on which city was clicked
//                Intent intent = new Intent(this, detailView.class);
//                intent.putExtra(DataClass.CITY_KEY, position);

            }
        });

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return DataClass.cityNames.length;
    }


}
