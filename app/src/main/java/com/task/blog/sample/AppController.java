package com.task.blog.sample;

import android.app.Application;
import android.content.Context;

import com.task.blog.sample.rest.RestApi;
import com.task.blog.sample.rest.RestApiFactory;

public class AppController extends Application {

    private RestApi restApi;
    private static Context APP_CONTEXT=null;
    @Override
    public void onCreate() {
        super.onCreate();
        AppController.APP_CONTEXT = getApplicationContext();
    }
    public static Context getAppContext() {
        return APP_CONTEXT;
    }

    private static AppController get(Context context) {
        return (AppController) context.getApplicationContext();
    }

    public static AppController create(Context context) {
        return AppController.get(context);
    }

    public RestApi getRestApi() {
        if(restApi == null) {
            restApi = RestApiFactory.create();
        }
        return restApi;
    }

}
