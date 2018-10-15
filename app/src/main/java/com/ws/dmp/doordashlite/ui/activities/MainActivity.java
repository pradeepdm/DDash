package com.ws.dmp.doordashlite.ui.activities;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.ws.dmp.doordashlite.R;
import com.ws.dmp.doordashlite.model.Restaurant;
import com.ws.dmp.doordashlite.ui.adapters.RestaurantsListAdapter;
import com.ws.dmp.doordashlite.viewmodel.MainActivityViewModel;

public class MainActivity extends AppCompatActivity {

    public static final String RESTAURANT_ID = "RestaurantId";
    private RecyclerView restaurantListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        restaurantListView = findViewById(R.id.restaurantList);
        restaurantListView.setLayoutManager(new LinearLayoutManager(this));
        RestaurantsListAdapter adapter = new
                RestaurantsListAdapter(MainActivity.this,
                this::loadRestaurantInfoActivity);
        restaurantListView.setAdapter(adapter);

        MainActivityViewModel viewModel = ViewModelProviders
                .of(this)
                .get(MainActivityViewModel.class);

        viewModel.getAllRestaurants().observe(this, result -> {
            if (result != null && result.isSuccess())
                adapter.setRestaurantsList(result.getResource());
            else
                displayErrorMessage(result.getError());
        });
    }

    private void displayErrorMessage(Throwable error) {
        if (error != null) {
            System.out.print(error.getLocalizedMessage());
        }

        Snackbar.make(
                restaurantListView,
                R.string.error_message,
                Snackbar.LENGTH_INDEFINITE)
                .show();
    }

    private void loadRestaurantInfoActivity(Restaurant restaurant) {
        Intent intent = new Intent(this, RestaurantInfoActivity.class);
        intent.putExtra(RESTAURANT_ID, restaurant.getId());
        startActivity(intent);
    }
}
