package com.task.blog.sample.datasource;

import android.arch.lifecycle.MutableLiveData;
import android.arch.paging.PageKeyedDataSource;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.util.Log;

import com.task.blog.sample.AppController;
import com.task.blog.sample.model.ApiResponse;
import com.task.blog.sample.utils.NetworkState;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class FeedDataSource extends PageKeyedDataSource<Long, ApiResponse> {

    private static final String TAG = FeedDataSource.class.getSimpleName();

    private AppController appController;

    private MutableLiveData networkState;
    private MutableLiveData initialLoading;
    private List<ApiResponse> feedList = new ArrayList<>();
    //private HashMap<Integer,List<ApiResponse>> filter = new HashMap<>();
    int position;

    public FeedDataSource(AppController appController, int position) {
        this.appController = appController;
        this.position = position;
        networkState = new MutableLiveData();
        initialLoading = new MutableLiveData();
    }


    public MutableLiveData getNetworkState() {
        return networkState;
    }

    public MutableLiveData getInitialLoading() {
        return initialLoading;
    }

    @Override
    public void loadInitial(@NonNull LoadInitialParams<Long> params,
                            @NonNull LoadInitialCallback<Long, ApiResponse> callback) {

        initialLoading.postValue(NetworkState.LOADING);
        networkState.postValue(NetworkState.LOADING);

        appController.getRestApi().fetchFeed("date", 1)
                .enqueue(new Callback<List<ApiResponse>>() {
                    @Override
                    public void onResponse(Call<List<ApiResponse>> call, Response<List<ApiResponse>> response) {
                        Log.d("Response", "Peeru RESTAPI : " + position);
                        if (response.isSuccessful()) {
                            callback.onResult(formatResponse(response.body()), null, 2l);
                            initialLoading.postValue(NetworkState.LOADED);
                            networkState.postValue(NetworkState.LOADED);

                        } else {
                            initialLoading.postValue(new NetworkState(NetworkState.Status.FAILED, response.message()));
                            networkState.postValue(new NetworkState(NetworkState.Status.FAILED, response.message()));
                        }
                    }

                    @Override
                    public void onFailure(Call<List<ApiResponse>> call, Throwable t) {
                        String errorMessage = t == null ? "unknown error" : t.getMessage();
                        networkState.postValue(new NetworkState(NetworkState.Status.FAILED, errorMessage));
                    }
                });
    }

    @Override
    public void loadBefore(@NonNull LoadParams<Long> params,
                           @NonNull LoadCallback<Long, ApiResponse> callback) {

    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void loadAfter(@NonNull LoadParams<Long> params,
                          @NonNull LoadCallback<Long, ApiResponse> callback) {

        networkState.postValue(NetworkState.LOADING);

        appController.getRestApi().fetchFeed("date", Math.toIntExact(params.key)).enqueue(new Callback<List<ApiResponse>>() {
            @Override
            public void onResponse(Call<List<ApiResponse>> call, Response<List<ApiResponse>> response) {
                Log.d("Response", "Peeru RESTAPI Next Call: " + position);

                if (response.isSuccessful()) {
                    // long nextKey = (params.key == 2) ? -1 : params.key+1;
                    callback.onResult(formatResponse(response.body()), null);
                    networkState.postValue(NetworkState.LOADED);

                } else
                    networkState.postValue(new NetworkState(NetworkState.Status.FAILED, response.message()));
            }

            @Override
            public void onFailure(Call<List<ApiResponse>> call, Throwable t) {
                String errorMessage = t == null ? "unknown error" : t.getMessage();
                networkState.postValue(new NetworkState(NetworkState.Status.FAILED, errorMessage));
            }
        });
    }

    public List<ApiResponse> formatResponse(List<ApiResponse> r) {
        List<ApiResponse> temp = new ArrayList<>();
        for (ApiResponse res : r) {
            if (position == 0 && res.getCategories().get(0) == 3958) {
                temp.add(res);
            } else if (position == 1 && res.getCategories().get(0) == 1134) {
                temp.add(res);
            } else if (position == 2) {
                temp.add(res);
            }
        }
        return temp;
    }
}
