package com.redoyahmed.androiddi.retrofit;

import com.redoyahmed.androiddi.model.Songs;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiClient {

    @GET("/dagger")
    Call<List<Songs>> allSongs();
}
