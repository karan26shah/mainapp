package com.example.karan.mainapp.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.example.karan.mainapp.Adapters.BannerImageAdapter;
import com.example.karan.mainapp.Models.BannerList;
import com.example.karan.mainapp.R;
import com.example.karan.mainapp.Utilities.RetrofitHelper;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Karan on 23-02-2018.
 */

public class BannerImageActivity extends AppCompatActivity {
    List<BannerList> banners;
    RecyclerView bannerimage;
    BannerImageAdapter bannerImageAdapter;


    //private OkHttpClient getClient() {
    //  OkHttpClient client = new OkHttpClient.Builder()
    //        .connectTimeout(5, TimeUnit.MINUTES)
    //      .readTimeout(5, TimeUnit.MINUTES)
    //    .build();
    //   return client;
    //}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bannerimage);
        bannerimage = (RecyclerView)findViewById(R.id.bannerImage);

        //  mRecyclerView.setHasFixedSize(true);
        //mLayoutManager = new LinearLayoutManager(this);
        // mRecyclerView.setLayoutManager(mLayoutManager);
        listBannerList();
    }

    /*Retrofit retrofit = new Retrofit.Builder()
           .baseUrl("http://192.168.2.81:3000/api/mobile/manager/v1/")
             .addConverterFactory(GsonConverterFactory.create())
           .client(getClient())
         .build();

  RetrofitService service = retrofit.create(RetrofitService.class);
*/
    private void listBannerList()
    {
        // RetrofitService service = retrofit.create(RetrofitService.class);
        Call<List<BannerList>> call = RetrofitHelper.getRetrofitService().listBannerList();
        call.enqueue(new Callback<List<BannerList>>() {
            @Override
            public void onResponse(Call<List<BannerList>> call, Response<List<BannerList>> response) {
                banners= response.body();

                Toast.makeText(com.example.karan.mainapp.Activity.BannerImageActivity.this, "successful", Toast.LENGTH_LONG).show();
                setBannerListToAdapter();
            }

            @Override
            public void onFailure(Call<List<BannerList>> call, Throwable t) {
                Log.d("error: ", "failed ");
                t.printStackTrace();
            }
        });
    }

    private void setBannerListToAdapter(){
        bannerimage.setLayoutManager(new LinearLayoutManager(this));
        bannerImageAdapter = new BannerImageAdapter(this,banners);
        bannerimage.setAdapter(bannerImageAdapter);
        bannerImageAdapter.notifyDataSetChanged();
    }

}


