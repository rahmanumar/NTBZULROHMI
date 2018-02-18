package com.putrasamawastduio.ntbzulrohmi.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.putrasamawastduio.ntbzulrohmi.R;

/**
 * Created by Satria on 2/12/2018.
 */

public class CustomAdapter extends BaseAdapter {
    Context context;
    String countryList[];
    String tanggal[];
    int flags[];
    LayoutInflater inflter;

    public CustomAdapter(Context applicationContext, String[] countryList,String[] tanggal, int[] flags) {
        this.context = context;
        this.countryList = countryList;
        this.tanggal = tanggal;
        this.flags = flags;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return countryList.length;

    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.activity_listview, null);
        TextView country = (TextView) view.findViewById(R.id.textView);
        ImageView icon = (ImageView) view.findViewById(R.id.icon);
        TextView tgl = (TextView) view.findViewById(R.id.tgl);
        country.setText(countryList[i]);
        tgl.setText(tanggal[i]);
        icon.setImageResource(flags[i]);
        return view;
    }
}