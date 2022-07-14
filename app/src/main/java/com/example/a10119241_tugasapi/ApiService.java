package com.example.a10119241_tugasapi;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("api/heroes")
    Call<List<Post>> getPost();
}