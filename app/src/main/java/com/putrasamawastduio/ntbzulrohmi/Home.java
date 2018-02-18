package com.putrasamawastduio.ntbzulrohmi;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Home extends AppCompatActivity {
    private String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
//        getSupportActionBar().setElevation(0);
        url = "https://m.youtube.com/channel/UCyFKzfA-4h2f3-Va75ljPRA";


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void mediasos(View view) {
        Intent mediasos = new Intent(this,Sosmed.class);
        startActivity(mediasos);
    }


    public void email(View view) {
        Intent email = new Intent(this,Kontak.class);
        startActivity(email);
    }

    public void profil(View view) {
        Intent profil = new Intent(this,MainActivity.class);
        startActivity(profil);
    }
    public void gal(View view) {
        Intent gal = new Intent(this,Galeri.class);
        startActivity(gal);
    }

    public void exit(MenuItem item) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("NTB Gemilang");

//        builder.setIcon(R.mipmap.ic_appiconmessage);

        builder.setMessage("\n" + "Ingin keluar dari Aplikasi?");

        builder.setPositiveButton("TIDAK", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int i) {


                dialog.dismiss();
            }
        });

        builder.setNegativeButton("YA", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int i) {


                finish();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();

    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("NTB Gemilang");

//        builder.setIcon(R.mipmap.ic_appiconmessage);

        builder.setMessage("\n" + "Ingin keluar dari Aplikasi?");

        builder.setPositiveButton("TIDAK", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int i) {


                dialog.dismiss();
            }
        });

        builder.setNegativeButton("YA", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int i) {


                finish();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();

    }

    public void news(View view) {
        Intent news = new Intent(this,Berita.class);
        startActivity(news);
    }

    public void relawanview(View view) {
        Intent relawan=new Intent(this,Relawan.class);
        startActivity(relawan);
    }
}
