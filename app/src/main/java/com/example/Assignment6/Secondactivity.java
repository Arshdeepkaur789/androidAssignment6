package com.example.Assignment6;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Secondactivity extends AppCompatActivity {
    int totalprice;
    Button Add,ShowTotal;
    ImageView image,backImage;
    TextView Productprice,quant;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivity);
         Add = (Button)findViewById(R.id.Add_to_Cart);
         Productprice = (TextView) findViewById(R.id.show_price);
         quant = (TextView) findViewById(R.id.Quantity);
         backImage = (ImageView)findViewById(R.id.backbutton);
         ShowTotal = (Button)findViewById(R.id.totalprice);


        Button quantityadd = (Button)findViewById(R.id.AddQuantity);
        Button quantitysubtract = (Button)findViewById(R.id.subtractquantity);

        String Name = getIntent().getStringExtra("Name");
        String Price = getIntent().getStringExtra("Price");

        setTitle(Name);
        Productprice.setText(Price+"$");

        quant.setText("1");

        backImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                Intent intent = new Intent(Secondactivity.this,MainActivity.class);
                startActivity(intent);
            }

        });

        if(Name.equals("IPhone11")){
            String uri = "@drawable/iphone11";
            int imageResource = getResources().getIdentifier(uri, null, getPackageName());
            image = (ImageView)findViewById(R.id.imageViewshow);
            Drawable res = getResources().getDrawable(imageResource);
            image.setImageDrawable(res);
        } else if(Name.equals("laptop")){
            String uri = "@drawable/laptop1";
            int imageResource = getResources().getIdentifier(uri, null, getPackageName());
            image = (ImageView)findViewById(R.id.imageViewshow);
            Drawable res = getResources().getDrawable(imageResource);
            image.setImageDrawable(res);
        } else if(Name.equals("Clothes")){
            String uri = "@drawable/clothes1";
            int imageResource = getResources().getIdentifier(uri, null, getPackageName());
            image = (ImageView)findViewById(R.id.imageViewshow);
            Drawable res = getResources().getDrawable(imageResource);
            image.setImageDrawable(res);
        } else if(Name.equals("Shoes")){
            String uri = "@drawable/shoes1";
            int imageResource = getResources().getIdentifier(uri, null, getPackageName());
            image = (ImageView)findViewById(R.id.imageViewshow);
            Drawable res = getResources().getDrawable(imageResource);
            image.setImageDrawable(res);
        } else if(Name.equals("Power Bank")){
            String uri = "@drawable/powerbank1";
            int imageResource = getResources().getIdentifier(uri, null, getPackageName());
            image = (ImageView)findViewById(R.id.imageViewshow);
            Drawable res = getResources().getDrawable(imageResource);
            image.setImageDrawable(res);
        }else if(Name.equals("PC")){
            String uri = "@drawable/pc1";
            int imageResource = getResources().getIdentifier(uri, null, getPackageName());
            image = (ImageView)findViewById(R.id.imageViewshow);
            Drawable res = getResources().getDrawable(imageResource);
            image.setImageDrawable(res);
        }
        else if(Name.equals("Accessories")){
            String uri = "@drawable/laptopaccessories1";
            int imageResource = getResources().getIdentifier(uri, null, getPackageName());
            image = (ImageView)findViewById(R.id.imageViewshow);
            Drawable res = getResources().getDrawable(imageResource);
            image.setImageDrawable(res);
        }else if(Name.equals("keyboard")){
            String uri = "@drawable/keyboard1";
            int imageResource = getResources().getIdentifier(uri, null, getPackageName());
            image = (ImageView)findViewById(R.id.imageViewshow);
            Drawable res = getResources().getDrawable(imageResource);
            image.setImageDrawable(res);
        }else if(Name.equals("Mouse")){
            String uri = "@drawable/mouse1";
            int imageResource = getResources().getIdentifier(uri, null, getPackageName());
            image = (ImageView)findViewById(R.id.imageViewshow);
            Drawable res = getResources().getDrawable(imageResource);
            image.setImageDrawable(res);
        }else if(Name.equals("Wireless Router")){
            String uri = "@drawable/router1";
            int imageResource = getResources().getIdentifier(uri, null, getPackageName());
            image = (ImageView)findViewById(R.id.imageViewshow);
            Drawable res = getResources().getDrawable(imageResource);
            image.setImageDrawable(res);
        }
        else if(Name.equals("Gaming pc")){
            String uri = "@drawable/gamingpc1";
            int imageResource = getResources().getIdentifier(uri, null, getPackageName());
            image = (ImageView)findViewById(R.id.imageViewshow);
            Drawable res = getResources().getDrawable(imageResource);
            image.setImageDrawable(res);
        }
        else if(Name.equals("Gaming pc Chair")){
            String uri = "@drawable/pcgamingchair1";
            int imageResource = getResources().getIdentifier(uri, null, getPackageName());
            image = (ImageView)findViewById(R.id.imageViewshow);
            Drawable res = getResources().getDrawable(imageResource);
            image.setImageDrawable(res);
        }
        else if(Name.equals("Camera")){
            String uri = "@drawable/camera 1";
            int imageResource = getResources().getIdentifier(uri, null, getPackageName());
            image = (ImageView)findViewById(R.id.imageViewshow);
            Drawable res = getResources().getDrawable(imageResource);
            image.setImageDrawable(res);
        }



         ShowTotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                Intent intent = new Intent(Secondactivity.this, ShowTotalPrice_activity.class);
                startActivity(intent);
            }
        });

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                int quantnumber = Integer.parseInt(quant.getText().toString());
                int SingleitemPrice =  Integer.parseInt(Price.toString());
                int totalQuantityPrice = dataFile.calculatePrice(quantnumber,SingleitemPrice);
                int getprice = dataFile.getTotalprice();
                int totalPrice = totalQuantityPrice+getprice;
                dataFile.setTotalprice(totalPrice);
                Toast.makeText(Secondactivity.this,"Successfully Added" , Toast.LENGTH_LONG).show();
            }
        });
        backImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                Intent intent = new Intent(Secondactivity.this,MainActivity.class);
         startActivity(intent);
            }
        });

        quantityadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                int quantitynumber = Integer.parseInt(quant.getText().toString());
                quantitynumber = quantitynumber + 1;
                String Totalquantitynumber = Integer.toString(quantitynumber);
                quant.setText(Totalquantitynumber);

            }
        });

        quantitysubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                int quantitynumber = Integer.parseInt(quant.getText().toString());
                if(quantitynumber >1){
                    quantitynumber = quantitynumber - 1;
                    String totalQuantity = Integer.toString(quantitynumber);
                    quant.setText(totalQuantity);
                }

            }
        });
    }

}
