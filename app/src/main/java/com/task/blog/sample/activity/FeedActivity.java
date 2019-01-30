package com.task.blog.sample.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.task.blog.sample.R;
import com.task.blog.sample.adapters.ViewPagerAdapter;
import com.task.blog.sample.databinding.FeedActivityBinding;

public class FeedActivity extends AppCompatActivity {
    private FeedActivityBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        setSupportActionBar(binding.toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        binding.viewpager.setAdapter(adapter);
        binding.tabs.setupWithViewPager(binding.viewpager);
    }
}
