package com.putrasamawastduio.ntbzulrohmi;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.File;

import uk.co.senab.photoview.PhotoViewAttacher;

public class DetailActivity extends AppCompatActivity {
    ImageView img;

    private PhotoViewAttacher photoViewAttacher;
    private static Uri imageUri = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        getSupportActionBar().setElevation(0);
        getSupportActionBar().setTitle("Detail");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.gal_d)));


        //RECEIVE OUR DATA
        Intent i = getIntent();

        final int image = i.getExtras().getInt("Image");


        //REFERENCE VIEWS FROM XML
        img = (ImageView) findViewById(R.id.playerImage);


        photoViewAttacher = new PhotoViewAttacher(img);

        //ASSIGN DATA TO THOSE VIEWS
        img.setImageResource(image);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);


        }


    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == android.R.id.home) ;
        finish();


        return super.onOptionsItemSelected(item);

    }




}

