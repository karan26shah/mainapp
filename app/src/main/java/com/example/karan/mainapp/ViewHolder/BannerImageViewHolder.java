package com.example.karan.mainapp.ViewHolder;

/**
 * Created by Karan on 23-02-2018.
 */
/*
import android.content.Context;
import android.os.CountDownTimer;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.example.karan.mainapp.Activity.BannerImageActivity;
import com.example.karan.mainapp.R;
import com.example.karan.mainapp.Models.BannerList;

import java.util.List;

//import in.informationworks.learnaptandroid.coremodule.activities.homescreen.bannerfragments.CollectionBannerFragment;
//import in.informationworks.learnaptandroid.coremodule.activities.homescreen.bannerfragments.CourseBannerFragment;
//import in.informationworks.learnaptandroid.coremodule.activities.homescreen.bannerfragments.EventBannerFragment;
//import in.informationworks.learnaptandroid.coremodule.activities.homescreen.bannerfragments.WebLinkBannerFragment;
//import in.informationworks.learnaptandroid.coremodule.models.Banner;
//import in.informationworks.learnaptandroid.coremodule.models.IWRecyclerItem;
//import me.relex.circleindicator.CircleIndicator;

    /**
     * Created by heni on 4/7/17.
     */

  /*  public class BannerImageViewHolder extends RecyclerView.ViewHolder {

        LinearLayout llHolder;
        RelativeLayout rlHolder;
        android.support.v4.view.ViewPager viewPager;
        ImageView imgReference;
        PagerAdapter pagerAdapter;
        AppCompatActivity activity;
        CountDownTimer countDownTimer;
        List<BannerList> bannerList;
     //   me.relex.circleindicator.CircleIndicator circleIndicator;

        private void bindViews(View rootView){
            llHolder = (LinearLayout) rootView.findViewById(R.id.ll_holder);
            rlHolder = (RelativeLayout)rootView.findViewById(R.id.rl_image_holder);
            viewPager = (ViewPager) rootView.findViewById(R.id.view_pager);
            imgReference = (ImageView) rootView.findViewById(R.id.img_reference);
       //     circleIndicator = (CircleIndicator) rootView.findViewById(R.id.circle_indicator);
        }

        public BannerImageViewHolder(View itemView) {
            super(itemView);
            bindViews(itemView);
            countDownTimer = new CountDownTimer(10000, 10000) {
                @Override
                public void onTick(long millisUntilFinished) {
                }

                @Override
                public void onFinish() {
                    autoScrollNextPage();
                }
            };
        }

        public void bindIWItem(Context context, IWRecyclerItem iwRecyclerItem){
            bannerList = (List<BannerList>) iwRecyclerItem.getItem();
            if (pagerAdapter == null) {
                //activity = (AppCompatActivity) iwRecyclerItem.getOptions().get(0);
                pagerAdapter = new PagerAdapter(activity.getSupportFragmentManager());
                viewPager.setAdapter(pagerAdapter);
               // circleIndicator.setViewPager(viewPager);
                viewPager.setOffscreenPageLimit(bannerList.size());
                viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                    @Override
                    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                        countDownTimer.cancel();
                        countDownTimer.start();
                    }

                    @Override
                    public void onPageSelected(int position) {
                    }

                    @Override
                    public void onPageScrollStateChanged(int state) {

                    }
                });
                countDownTimer.start();
            }
        }

        private void autoScrollNextPage() {
            if (pagerAdapter != null && viewPager != null) {
                if (viewPager.getCurrentItem() == bannerList.size() - 1) {
                    viewPager.setCurrentItem(0);
                } else {
                    viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
                }
            }
            countDownTimer.start();
        }

        public class PagerAdapter extends FragmentStatePagerAdapter {

            public PagerAdapter(FragmentManager fm) {
                super(fm);


            }
            @Override
            public Fragment getItem(int position) {
                switch (bannerList.get(position).getBannerType().getCode()) {
                    case Banner.BannerType.WEB_LINK:
                        return WebLinkBannerFragment.newInstance(bannerList.get(position));
                 /*   case Banner.BannerType.COLLECTION:
                        return CollectionBannerFragment.newInstance(bannerList.get(position));
                    case Banner.BannerType.COURSE:
                        return CourseBannerFragment.newInstance(bannerList.get(position));
                    case Banner.BannerType.EVENT:
                        return EventBannerFragment.newInstance(bannerList.get(position));
               */
/*
                return WebLinkBannerFragment.newInstance(bannerList.get(position));
            }
            @Override
            public int getCount( {
                return bannerList.size();
            }
        }
    }


}*/
 public class BannerImageViewHolder{}