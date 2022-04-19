package com.example.useofbundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {

    TextView name2,number2;
    Button back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        name2=findViewById(R.id.activity2_name_id);
        number2=findViewById(R.id.activity2_number_id);
        back=findViewById(R.id.back_button_id);

        Intent intent=getIntent();
        Bundle bundle=intent.getBundleExtra("bundle");
        String nameR=bundle.getString("Name");
        String numberR=bundle.getString("Number");

        name2.setText(nameR);
        number2.setText(numberR);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}