package com.example.foodbar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mRiders, mCustomers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRiders = (Button)findViewById(R.id.Riders);
        mCustomers = (Button)findViewById(R.id.Customers);

        mRiders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RidersLoginActivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });

        mCustomers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CustomersLoginActivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });


    }
}