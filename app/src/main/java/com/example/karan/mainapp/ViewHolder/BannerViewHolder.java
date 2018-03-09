package com.example.karan.mainapp.ViewHolder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.karan.mainapp.Models.BannerList;
import com.example.karan.mainapp.R;

/**
 * Created by Karan on 22-02-2018.
 */

public class BannerViewHolder extends RecyclerView.ViewHolder{
    TextView id;
    TextView title;
    TextView description;
    TextView linkurl;

    public BannerViewHolder(View itemView)
    {
        super(itemView);
        bindViews(itemView);
    }

    public void bindViews(View rootview){
        id = (TextView)rootview.findViewById(R.id.id1);
        title = (TextView)rootview.findViewById(R.id.title);
        //description = (TextView)rootview.findViewById(R.id.description);
        linkurl = (TextView)rootview.findViewById(R.id.linkurl);
    }

    public void bindData(Context context, BannerList bannerList){

        id.setText(String.valueOf(bannerList.getId()));
        title.setText(bannerList.getTitle());
        //description.setText((CharSequence) bannerList.getDescription());
        linkurl.setText((CharSequence) bannerList.getLinkUrl());

    }
}
