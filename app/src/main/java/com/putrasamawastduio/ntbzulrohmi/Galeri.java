package com.putrasamawastduio.ntbzulrohmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import com.putrasamawastduio.ntbzulrohmi.adapter.MyAdapter;

public class Galeri extends AppCompatActivity {
    int[] images = {R.drawable.zulrohmi, R.drawable.bangzul, R.drawable.profilzulrohmi,R.drawable.zulrohmi, R.drawable.bangzul, R.drawable.profilzulrohmi,R.drawable.zulrohmi, R.drawable.bangzul, R.drawable.profilzulrohmi,R.drawable.zulrohmi, R.drawable.bangzul, R.drawable.profilzulrohmi,R.drawable.zulrohmi, R.drawable.bangzul, R.drawable.profilzulrohmi,R.drawable.zulrohmi, R.drawable.bangzul, R.drawable.profilzulrohmi,R.drawable.zulrohmi, R.drawable.bangzul, R.drawable.profilzulrohmi,R.drawable.zulrohmi, R.drawable.bangzul, R.drawable.profilzulrohmi};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeri);


        //REFERENCE RECYCLER
        RecyclerView rv = (RecyclerView) findViewById(R.id.myRecycler);

        //SET PROPERTIES
        rv.setLayoutManager(new GridLayoutManager(this, 3));
        rv.setItemAnimator(new DefaultItemAnimator());

        //ADAPTER
        MyAdapter adapter = new MyAdapter(this, images);
        rv.setAdapter(adapter);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);


        }


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == android.R.id.home);
        finish();
        return super.onOptionsItemSelected(item);

    }
}
