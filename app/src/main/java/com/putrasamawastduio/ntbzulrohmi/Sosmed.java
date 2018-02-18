package com.putrasamawastduio.ntbzulrohmi;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.putrasamawastduio.ntbzulrohmi.adapter.CustomAdapter;

public class Sosmed extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sosmed);
        getSupportActionBar().setTitle("Sosial Media");


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



//    //Buka Facebook
//    public static Intent openFacebook(Context context){
//        try{
//            context.getPackageManager().getPackageInfo("com.facebook.katana", 0);
//            return new Intent(Intent.ACTION_VIEW, Uri.parse("fb://page/376227335860239"));
//        } catch (Exception e){
//            return new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/karthikofficialpage"));
//        }
//    }
//
//    public void facebook(View view) {
//        Intent facebook = openFacebook(Sosmed.this);
//        startActivity(facebook);
//    }

    //Buka Facebook


    public void facebook(View view) {
        Intent facebook = new Intent(this,facebook_web.class);
        startActivity(facebook);
    }

        //        public void relawanview(View view) {
//            Intent relawan=new Intent(this,Relawan.class);
//            startActivity(relawan);

        //Buka Twitter
        public void twitter(View view) {
            Intent twitter2 = new Intent(this,twitter_web.class);
            startActivity(twitter2);
        }


    //Buka Website

    public void website(View view) {
        Intent website2 = new Intent(this,website_web.class);
        startActivity(website2);
    }


    //Buka Youtube

    public void youtube(View view) {
        Intent youtube2 = new Intent(this,Youtube_web.class);
        startActivity(youtube2);
    }



    //Buka Instagram

    public void instagram(View view) {
        Intent instagram2 = new Intent(this,instagram_web.class);
        startActivity(instagram2);
    }








//        public void relawanview(View view) {
//            Intent relawan=new Intent(this,Relawan.class);
//            startActivity(relawan);
//        }


}