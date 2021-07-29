package com.example.Assignment6;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ShowTotalPrice_activity extends AppCompatActivity {
    Button button ,MainMenu ;
    TextView TotalPrice ;
    ImageView backbutton;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.totalprice_activity);
        button = (Button)findViewById(R.id.button);
        TotalPrice = (TextView) findViewById(R.id.textView3);
        TextView Dollar = (TextView)findViewById(R.id. textView4);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                int e = dataFile.getTotalprice();
                String f = Integer.toString(e);
                TotalPrice.setText(f+"$");
//                Dollar.setText("$");
            }
        });
        setTitle("Price");
        MainMenu = (Button)findViewById(R.id.MainMenuActivity);
        MainMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                Intent intent = new Intent(ShowTotalPrice_activity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        Button ResetButton = (Button)findViewById(R.id.Reset);
        TextView ResetValueShow = (TextView)findViewById(R.id.textView3);


        ResetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
    int data = 0;
                dataFile.setTotalprice(data);
                int e = dataFile.getTotalprice();
                String ResetValue = Integer.toString(e);
                ResetValueShow.setText(ResetValue +"$");
            }
        });

        backbutton = (ImageView) findViewById(R.id.Backbutton);

        backbutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                Intent intent = new Intent(ShowTotalPrice_activity.this,MainActivity.class);
                startActivity(intent);
            }
        });




    }
}
