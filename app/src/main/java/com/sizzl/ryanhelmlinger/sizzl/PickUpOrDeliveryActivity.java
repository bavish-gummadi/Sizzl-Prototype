package com.sizzl.ryanhelmlinger.sizzl;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class PickUpOrDeliveryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_up_or_delivery);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

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

        Button pickUpOrder = (Button) findViewById(R.id.button1);
        pickUpOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToPickUpOrderActivity();
            }
        });

        Button delivery = (Button) findViewById(R.id.button2);
        pickUpOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToDeliveryActivity();
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
    private void goToOrdersActivity(){
        Intent intent = new Intent(this, OrdersActivity.class);
        startActivity(intent);
    }
    private void goToPickUpOrderActivity(){
        Intent intent = new Intent(this, PickUpOrderActivity.class);
        startActivity(intent);
    }
    private void goToDeliveryActivity(){
        Intent intent = new Intent(this, DeliveryActivity.class);
        startActivity(intent);
    }

}
