package com.sizzl.ryanhelmlinger.sizzl;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class WildWingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wild_wings);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button pickUpOrDelivery = (Button) findViewById(R.id.button1);
        pickUpOrDelivery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToPickUpOrDeliveryActivity();
            }
        });

        Button getFood = (Button) findViewById(R.id.buttonmenu1);
        getFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToRestaurantsActivity();
            }
        });

        Button orders = (Button) findViewById(R.id.buttonmenu2);
        orders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToOrdersActivity();
            }
        });

        Button accountInfo = (Button) findViewById(R.id.buttonmenu3);
        accountInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToAccountInfoActivity();
            }
        });
    }

    private void goToRestaurantsActivity(){
        Intent intent = new Intent(this, RestaurantsActivity.class);
        startActivity(intent);
    }
    private void goToAccountInfoActivity(){
        Intent intent = new Intent(this, AccountInfoActivity.class);
        startActivity(intent);
    }
    private void goToOrdersActivity() {
        Intent intent = new Intent(this, OrdersActivity.class);
        startActivity(intent);
    }
    private void goToPickUpOrDeliveryActivity() {
        Intent intent = new Intent(this, PickUpOrDeliveryActivity.class);
        startActivity(intent);
    }
}
