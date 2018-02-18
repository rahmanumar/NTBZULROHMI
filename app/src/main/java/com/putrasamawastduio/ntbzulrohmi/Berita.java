package com.putrasamawastduio.ntbzulrohmi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.putrasamawastduio.ntbzulrohmi.adapter.CustomAdapter;

public class Berita extends AppCompatActivity {
    ListView simpleList;
    String countryList[] = {"NTB 1", "NTB 2", "NTB 3", "NTB 4", "NTB 5", "NTB 6", "NTB 7", "NTB 8", "NTB 9", "NTB 10"};
    String tanggal[] = {"12/02/2018", "13/02/2018", "14/02/2018", "15/02/2018", "16/02/2018", "17/02/2018", "18/02/2018", "19/02/2018", "20/02/2018", "21/02/2018"};
    int flags[] = {R.drawable.ic_assignment_black_24dp, R.drawable.ic_assignment_black_24dp, R.drawable.ic_assignment_black_24dp,
            R.drawable.ic_assignment_black_24dp, R.drawable.ic_assignment_black_24dp, R.drawable.ic_assignment_black_24dp,
            R.drawable.ic_assignment_black_24dp, R.drawable.ic_assignment_black_24dp, R.drawable.ic_assignment_black_24dp,
            R.drawable.ic_assignment_black_24dp};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berita);
        getSupportActionBar().setTitle("Info & Berita");

        simpleList = (ListView) findViewById(R.id.simpleListView);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), countryList, tanggal, flags);
        simpleList.setAdapter(customAdapter);

simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        switch (i) {

            case 0:
                Toast.makeText(Berita.this, "NTB 1", Toast.LENGTH_SHORT).show();
                break;
            case 1:
                Toast.makeText(Berita.this, "NTB 2", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(Berita.this, "NTB 3", Toast.LENGTH_SHORT).show();
                break;
            case 3:
                Toast.makeText(Berita.this, "NTB 4", Toast.LENGTH_SHORT).show();
                break;
            case 4:
                Toast.makeText(Berita.this, "NTB 5", Toast.LENGTH_SHORT).show();
                break;
            case 5:
                Toast.makeText(Berita.this, "NTB 6", Toast.LENGTH_SHORT).show();
                break;
            case 6:
                Toast.makeText(Berita.this, "NTB 7", Toast.LENGTH_SHORT).show();
                break;
            case 7:
                Toast.makeText(Berita.this, "NTB 8", Toast.LENGTH_SHORT).show();
                break;
            case 8:
                Toast.makeText(Berita.this, "NTB 9", Toast.LENGTH_SHORT).show();
                break;
            case 9:
                Toast.makeText(Berita.this, "NTB 10", Toast.LENGTH_SHORT).show();
                break;
        }
        }
});





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