package com.example.Assignment6;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ProgramViewHolder {
    ImageView itemImage;
    TextView productName;
    TextView productPrice;
    ProgramViewHolder(View v){
        itemImage = v.findViewById(R.id.imageView);
        productName = v.findViewById(R.id.textview1);
        productPrice = v.findViewById(R.id.textview2);
    }
}
