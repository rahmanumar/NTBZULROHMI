package com.putrasamawastduio.ntbzulrohmi.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.putrasamawastduio.ntbzulrohmi.DetailActivity;
import com.putrasamawastduio.ntbzulrohmi.R;

/**
 * Created by Satria on 2/10/2018.
 */

public class MyAdapter extends RecyclerView.Adapter<MyHolder>{


    Context c;
    int[] images;

    public MyAdapter(Context ctx,int[] images)
    {

        this.c=ctx;

        this.images=images;

    }
    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.model,null);


        MyHolder holder=new MyHolder(v);

        return holder;
    }



    @Override
    public void onBindViewHolder(MyHolder holder, final int position) {


        holder.img.setImageResource(images[position]);


        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(View v, int pos) {


                Intent i=new Intent(c,DetailActivity.class);



                i.putExtra("Image",images[position]);


                c.startActivity(i);

            }
        });

    }


    @Override
    public int getItemCount() {
        return images.length;
    }
}
