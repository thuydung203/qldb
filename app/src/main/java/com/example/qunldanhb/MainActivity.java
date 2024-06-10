package com.example.qunldanhb;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnManageUnits, btnManageEmployees;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnManageUnits = findViewById(R.id.btnManageUnits);
        btnManageEmployees = findViewById(R.id.btnManageEmployees);

        btnManageUnits.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, UnitActivity.class);
            startActivity(intent);
        });

        btnManageEmployees.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, EmployeeActivity.class);
            startActivity(intent);
        });
    }
}
