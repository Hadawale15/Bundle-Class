package com.example.useofbundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText name,no;
    Button send1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.name_id);
        no=findViewById(R.id.Number_id);
        send1=findViewById(R.id.Send_button1_id);

        send1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Activity2.class);
                Bundle bundle=new Bundle();
                bundle.putString("Name",name.getText().toString());
                bundle.putString("Number",no.getText().toString());
                intent.putExtra("bundle",bundle);
                startActivity(intent);

            }
        });

    }
}