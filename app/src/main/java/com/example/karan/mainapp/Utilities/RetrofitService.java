package com.example.karan.mainapp.Utilities;

import com.example.karan.mainapp.Models.BannerList;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
/**
 * Created by Karan on 21-02-2018.
 */

public interface RetrofitService {
    @GET("banners/index.json")
   Call<List<BannerList>> listBannerList();
}
