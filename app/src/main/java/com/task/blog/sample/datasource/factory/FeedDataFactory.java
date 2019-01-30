package com.task.blog.sample.datasource.factory;

import android.arch.lifecycle.MutableLiveData;
import android.arch.paging.DataSource;

import com.task.blog.sample.AppController;
import com.task.blog.sample.datasource.FeedDataSource;

public class FeedDataFactory extends DataSource.Factory {

    private MutableLiveData<FeedDataSource> mutableLiveData;
    private FeedDataSource feedDataSource;
    private AppController appController;
    private int position;
    public FeedDataFactory(AppController appController,int position) {
        this.appController = appController;
        this.position = position;
        this.mutableLiveData = new MutableLiveData<FeedDataSource>();
    }

    @Override
    public DataSource create() {
        feedDataSource = new FeedDataSource(appController,position);
        mutableLiveData.postValue(feedDataSource);
        return feedDataSource;
    }


    public MutableLiveData<FeedDataSource> getMutableLiveData() {
        return mutableLiveData;
    }
}
