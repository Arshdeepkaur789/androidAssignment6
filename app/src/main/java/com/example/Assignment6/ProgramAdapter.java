package com.example.Assignment6;

import android.content.Intent;
import android.os.Bundle;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

public class ProgramAdapter extends ArrayAdapter<String> {
    Bundle bundle;
    Context context;
    String value[];
int[] images;
String[] productName;
String[] productPrice;
    public ProgramAdapter(Context context,String[] programName,int[] images,String[] productPrice) {
        super(context,R.layout.single_item,R.id.textview1,programName);
        this.context  = context;
        this.images = images;
        this.productName = programName;
        this.productPrice  = productPrice;
    }

    @NonNull
    @Override
    public View getView(int position,View convertView,ViewGroup parent) {
       View singleItem = convertView;
       ProgramViewHolder holder = null;
       if(singleItem == null){
           LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
       singleItem = layoutInflater.inflate(R.layout.single_item,parent,false);
       holder = new ProgramViewHolder(singleItem);
       singleItem.setTag(holder);
       }else{
           holder  = (ProgramViewHolder) singleItem.getTag();
       }
       holder.itemImage.setImageResource(images[position]);
       holder.productName.setText(productName[position]);
       holder.productPrice.setText(productPrice[position]);
       singleItem.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View view){
               String Name = productName[position];
               String Price = productPrice[position];
               Intent intent = new Intent(context, Secondactivity.class);
               intent.putExtra("Name", Name);
               intent.putExtra("Price", Price);
               context.startActivity(intent);
           }
       });
        return singleItem;
    }
}
