package com.task.blog.sample.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.Transformations;
import android.arch.lifecycle.ViewModel;
import android.arch.paging.LivePagedListBuilder;
import android.arch.paging.PagedList;
import android.support.annotation.NonNull;

import com.task.blog.sample.AppController;
import com.task.blog.sample.datasource.factory.FeedDataFactory;
import com.task.blog.sample.model.ApiResponse;
import com.task.blog.sample.utils.NetworkState;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class FeedViewModel extends ViewModel {

    private Executor executor;
    private LiveData<NetworkState> networkState;
    private LiveData<PagedList<ApiResponse>> articleLiveData;
    int position;

    private AppController appController;
    public FeedViewModel(@NonNull AppController appController,int position) {
        this.appController = appController;
        this.position = position;
        init();
    }

    private void init() {
        executor = Executors.newFixedThreadPool(5);

        FeedDataFactory feedDataFactory = new FeedDataFactory(appController,position);
        networkState = Transformations.switchMap(feedDataFactory.getMutableLiveData(),
                dataSource -> dataSource.getNetworkState());

        PagedList.Config pagedListConfig =
                (new PagedList.Config.Builder())
                        .setEnablePlaceholders(false)
                        .setInitialLoadSizeHint(10)
                        .setPageSize(20).build();

        articleLiveData = (new LivePagedListBuilder(feedDataFactory, pagedListConfig))
                .setFetchExecutor(executor)
                .build();
    }


    public LiveData<NetworkState> getNetworkState() {
        return networkState;
    }

    public LiveData<PagedList<ApiResponse>> getArticleLiveData() {
        return articleLiveData;
    }
}
