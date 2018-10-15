package com.ws.dmp.doordashlite.ui.activities;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.ws.dmp.doordashlite.R;
import com.ws.dmp.doordashlite.model.Restaurant;
import com.ws.dmp.doordashlite.viewmodel.RestaurantInfoViewModel;

public class RestaurantInfoActivity extends AppCompatActivity {

    private RestaurantInfoViewModel viewModel;
    private ImageView restaurantImage;
    private TextView restaurantName;
    private TextView foodDesc;
    private RatingBar restaurantRating;
    private TextView deliveryFee;
    private TextView restaurantStatus;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.restaurant_info);
        int id = getIntent().getIntExtra(MainActivity.RESTAURANT_ID, 0);

        initializeUI();
        viewModel = ViewModelProviders
                .of(this)
                .get(RestaurantInfoViewModel.class);
        fetchAndDisplayDetails(id);
    }

    private void initializeUI() {
        restaurantImage = findViewById(R.id.restaurantInfoImage);
        restaurantName = findViewById(R.id.restaurantName);
        foodDesc = findViewById(R.id.description);
        restaurantRating = findViewById(R.id.restaurantRating);
        restaurantStatus = findViewById(R.id.restaurantStatus);
        deliveryFee = findViewById(R.id.deliveryFee);
    }

    private void fetchAndDisplayDetails(int id) {
        try {
            viewModel.getRestaurantInfo(id).observe(this, result -> {
                if (result != null && result.isSuccess()) {
                    displayRestaurantInfo(result.getResource());
                } else {
                    displayErrorMessage(result.getError());
                }
            });
        } catch (Exception ex) {
            displayErrorMessage(ex);
        }


    }

    private void displayErrorMessage(Throwable error) {
        if (error != null) {
            System.out.print(error.getLocalizedMessage());
        }

        Snackbar.make(
                findViewById(R.id.outerLayout),
                R.string.error_fetching_restaurant,
                Snackbar.LENGTH_INDEFINITE)
                .show();
    }

    private void displayRestaurantInfo(Restaurant restaurant) {

        try {
            Glide.with(this)
                    .load(restaurant.getCoverImgUrl())
                    .into(restaurantImage);

            restaurantName.setText(restaurant.getName());
            foodDesc.setText(restaurant.getDescription());
            restaurantRating.setRating(restaurant.getAverageRating().floatValue());
            restaurantStatus.setText(restaurant.getStatus());
            deliveryFee.setText(restaurant.getDeliveryFees());

        } catch (Exception ex) {
            System.out.print(ex.getLocalizedMessage());
        }

    }

}
