package com.task.blog.sample.rest;

import com.task.blog.sample.model.ApiResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RestApi {


    //https://newsapi.org/v2/everything?q=movies&apiKey=079dac74a5f94ebdb990ecf61c8854b7&pageSize=20&page=2

    @GET("v2/posts")
    Call<List<ApiResponse>> fetchFeed(@Query("orderby") String orderBy,
                                      @Query("page") int pageIndex);
}
