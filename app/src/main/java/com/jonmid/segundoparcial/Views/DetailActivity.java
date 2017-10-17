package com.jonmid.segundoparcial.Views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.jonmid.segundoparcial.Array.Images;
import com.jonmid.segundoparcial.R;
import com.jonmid.segundoparcial.TeamActivity;
import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {
TextView text1,text2;
ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        text1=(TextView) findViewById(R.id.id_tv_namedetail);
        text2=(TextView) findViewById(R.id.id_tv_codedetail);
imageView = (ImageView) findViewById(R.id.id_img_item_detail) ;
        text1.setText( getIntent().getExtras().getString("name"));
        text2.setText( getIntent().getExtras().getString("code"));

        Picasso.with(this).load(Images.imageRandom()).into(imageView);
    }


    public void d (){

        Intent intent = new Intent(this,TeamActivity.class);
startActivity(intent);
    }
}
