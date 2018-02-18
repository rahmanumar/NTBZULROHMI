package com.putrasamawastduio.ntbzulrohmi.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.putrasamawastduio.ntbzulrohmi.R;

/**
 * Created by Satria on 2/10/2018.
 */

public class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    ImageView img;

    private ItemClickListener itemClickListener;


    public MyHolder(View itemView) {
        super(itemView);

        img= (ImageView) itemView.findViewById(R.id.playerImage);

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        this.itemClickListener.onItemClick(v,getLayoutPosition());
    }

    public void setItemClickListener(ItemClickListener ic)
    {
        this.itemClickListener=ic;

    }
}
