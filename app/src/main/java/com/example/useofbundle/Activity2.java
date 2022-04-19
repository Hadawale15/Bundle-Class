package com.example.useofbundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    TextView name1,number1;
    Button send2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        name1=findViewById(R.id.activity1_name_id);
        number1=findViewById(R.id.activity1_number_id);
        send2=findViewById(R.id.Send_button2_id);

        Intent intent=getIntent();
        Bundle bundle=intent.getBundleExtra("bundle");
        String nameR=bundle.getString("Name");
        String numberR=bundle.getString("Number");

        name1.setText(nameR);
        number1.setText(numberR);

        send2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Activity2.this,Activity3.class);
                intent1.putExtra("bundle",bundle);
                startActivity(intent1);
            }
        });

    }
}