package com.putrasamawastduio.ntbzulrohmi;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static com.putrasamawastduio.ntbzulrohmi.R.color.cardview_shadow_end_color;

public class Kontak extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kontak);
        getSupportActionBar().setTitle("Kontak Kami");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button reset = (Button) findViewById(R.id.reset);
        Button batal = (Button) findViewById(R.id.cancel);
        final Button kirim = (Button) findViewById(R.id.send);
        final TextView nama = (TextView) findViewById(R.id.txt_name);
        final TextView email = (TextView) findViewById(R.id.txt_email);
        final TextView subjeck = (TextView) findViewById(R.id.tst_subjeck);
        final TextView pesan = (TextView) findViewById(R.id.txt_pesan);
        final TextView hp = (TextView) findViewById(R.id.txt_hp);
        final TextView psn = (TextView) findViewById(R.id.psn);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nama.setText("");
                email.setText("");
                subjeck.setText("");
                pesan.setText("");
                hp.setText("");

            }
        });

        batal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        kirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(nama.getText().toString().length()==0) {
                    nama.setError("Nama diperlukan");
                }else if(hp.getText().toString().length()==0){
                    hp.setError("No.HP diperlukan");
                }else if(subjeck.getText().toString().length()==0){
                    subjeck.setError("Subjeck diperlukan");
                }else if(pesan.getText().toString().length()==0){
                    psn.setError("Pesan diperlukan");
                }else {
//
//

                    Log.i("Kirim Email", "");
                    String[] TO = {"satrialin34@gmail.com"};
                    String[] CC = {email.getText().toString()};
                    Intent emailIntent = new Intent(Intent.ACTION_SEND);
                    emailIntent.setData(Uri.parse("mailto:"));
                    emailIntent.setType("text/plain");

                    emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
                    emailIntent.putExtra(Intent.EXTRA_CC, CC);
                    emailIntent.putExtra(Intent.EXTRA_SUBJECT, "[" + subjeck.getText().toString() + "]" + "\n" + "[Nama : " + nama.getText().toString() + "]" + "\n" + "[Nomor HP : " + hp.getText().toString() + "]");
                    emailIntent.putExtra(Intent.EXTRA_TEXT, pesan.getText().toString());

                    try {
                        startActivity(Intent.createChooser(emailIntent, "Kirim Email"));
                        finish();
                        Log.i("Mengirim Email...", "");
                    } catch (android.content.ActivityNotFoundException ex) {
                        Toast.makeText(Kontak.this, "Tidak ada email terinstall.", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });




    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }

        return super.onOptionsItemSelected(item);
    }
}
