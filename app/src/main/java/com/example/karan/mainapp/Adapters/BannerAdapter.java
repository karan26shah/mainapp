package com.example.karan.mainapp.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.karan.mainapp.Models.BannerList;
import com.example.karan.mainapp.R;
import com.example.karan.mainapp.ViewHolder.BannerViewHolder;

import java.util.List;

/**
 * Created by Karan on 21-02-2018.
 */

public class BannerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context context;
    LayoutInflater inflater;
    List<BannerList> recyclerItem;

    public BannerAdapter( Context context,List<BannerList> recyclerItems)
    {
        this.recyclerItem = recyclerItems;
        this.context = context;
        inflater = LayoutInflater.from(context);

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder viewHolder = null;
        View rootView;
        rootView = inflater.inflate(R.layout.banner,parent,false);
        viewHolder = new BannerViewHolder(rootView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder,int position) {
        BannerViewHolder bannerViewHolder = (BannerViewHolder) holder;
        bannerViewHolder.bindData(context, recyclerItem.get(position));
    }

    @Override
    public int getItemCount() {
        return recyclerItem.size();
    }

}


