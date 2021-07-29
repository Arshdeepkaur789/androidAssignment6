package com.example.Assignment6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView lvProgram;
    String[] programName = {"IPhone11","laptop","Accessories","keyboard","Mouse","Wireless Router","PC","Gaming pc","Gaming pc Chair","Power Bank","Camera","Clothes","Shoes"};
    String[] productPrice = {"900","699","999","299","105","420","599","200","400","299","500","150","100"};
    int[] programImages = {R.drawable.iphone,R.drawable.laptop,R.drawable.laptopaccessories,R.drawable.keyboard,R.drawable.mouse,R.drawable.router,R.drawable.pc,R.drawable.gamingpc,R.drawable.pcgamingchair,R.drawable.powerbank,R.drawable.camera,R.drawable.clothes,R.drawable.shoes};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Products");
        lvProgram = findViewById(R.id.lvProgram);
        ProgramAdapter programAdapter = new ProgramAdapter(this,programName,programImages,productPrice);
        lvProgram.setAdapter(programAdapter);
    }
}