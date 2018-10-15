package com.ws.dmp.doordashlite.ui.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.ws.dmp.doordashlite.R;
import com.ws.dmp.doordashlite.model.Restaurant;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by prade on 10/12/2018.
 */

public class RestaurantsListAdapter extends Adapter<RestaurantsListAdapter.RestaurantInfoViewHolder> {

    private final Context context;
    private List<Restaurant> restaurantsList = new ArrayList<>();
    private RestaurantClickCallback restaurantClickCallback;

    public RestaurantsListAdapter(Context context, RestaurantClickCallback restaurantClickCallback) {
        this.context = context;
        this.restaurantClickCallback = restaurantClickCallback;
    }

    public void setRestaurantsList(List<Restaurant> restaurantsList) {
        this.restaurantsList = restaurantsList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public RestaurantInfoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.restaurant_list_item, parent, false);

        return new RestaurantInfoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RestaurantInfoViewHolder holder, int position) {
        final Restaurant restaurant = restaurantsList.get(position);
        try {

            Glide.with(context)
                    .load(restaurant.getCoverImgUrl())
                    .into(holder.restaurantImage);

            holder.restaurantName.setText(restaurant.getName());
            holder.restaurantDeliveryFee.setText(restaurant.getDeliveryFees());
            holder.restaurantStatus.setText(restaurant.getStatus());
            holder.restaurantDesc.setText(restaurant.getDescription());

            holder.itemView.setOnClickListener(view -> {
                if (restaurantClickCallback != null) {
                    restaurantClickCallback.onClick(restaurant);
                }
            });
        } catch (Exception ex) {
            System.out.print(ex.getLocalizedMessage());
        }

    }

    @Override
    public int getItemCount() {
        return restaurantsList.size();
    }

    public void setRestaurantClickCallback(RestaurantClickCallback restaurantClickCallback) {
        this.restaurantClickCallback = restaurantClickCallback;
    }

    class RestaurantInfoViewHolder extends RecyclerView.ViewHolder {

        ImageView restaurantImage;
        TextView restaurantName;
        TextView restaurantDeliveryFee;
        TextView restaurantStatus;
        TextView restaurantDesc;

        public RestaurantInfoViewHolder(View itemView) {
            super(itemView);

            restaurantImage = itemView.findViewById(R.id.resImage);
            restaurantName = itemView.findViewById(R.id.restaurantListName);
            restaurantDeliveryFee = itemView.findViewById(R.id.restaurantListDeliveryFee);
            restaurantStatus = itemView.findViewById(R.id.restaurantListStatus);
            restaurantDesc = itemView.findViewById(R.id.foodDesc);
        }
    }

    public interface RestaurantClickCallback {
        void onClick(Restaurant restaurant);
    }

}
