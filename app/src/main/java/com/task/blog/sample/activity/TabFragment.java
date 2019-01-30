package com.task.blog.sample.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.task.blog.sample.AppController;
import com.task.blog.sample.R;
import com.task.blog.sample.adapters.FeedListAdapter;
import com.task.blog.sample.databinding.TabFragmentBinding;
import com.task.blog.sample.viewmodel.FeedViewModel;

public class TabFragment extends Fragment {
    int position;
    private FeedListAdapter adapter;
    private TabFragmentBinding binding;
    private FeedViewModel feedViewModel;
    private boolean isFragmentLoaded = false;

    public static Fragment getInstance(int position) {
        Bundle bundle = new Bundle();
        bundle.putInt("pos", position);
        TabFragment tabFragment = new TabFragment();
        tabFragment.setArguments(bundle);
        return tabFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        position = getArguments().getInt("pos");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_tab, container, false);
        binding.listFeed.setLayoutManager(new LinearLayoutManager(AppController.getAppContext()));
        adapter = new FeedListAdapter(AppController.getAppContext());
        Log.d("Response", "Peeru Call " + position);

        binding.listFeed.setAdapter(adapter);

        return binding.getRoot();
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        Log.d("Response", "Peeru Visible " + position+" IsVisible"+isVisibleToUser);

        if (isVisibleToUser) {
            feedViewModel = new FeedViewModel(AppController.create(AppController.getAppContext()), position);
            Log.d("Response", "Peeru Frame Loaded " + position);


            feedViewModel.getArticleLiveData().observe(this, pagedList -> {
                adapter.submitList(pagedList);

            });

            feedViewModel.getNetworkState().observe(this, networkState -> {
                adapter.setNetworkState(networkState);
            });

        }
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }


}

