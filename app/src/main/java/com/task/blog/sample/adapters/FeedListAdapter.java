package com.task.blog.sample.adapters;

import android.arch.paging.PagedListAdapter;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.DrawableRequestBuilder;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.task.blog.sample.activity.WebView;
import com.task.blog.sample.databinding.FeedItemBinding;
import com.task.blog.sample.databinding.NetworkItemBinding;
import com.task.blog.sample.model.ApiResponse;
import com.task.blog.sample.utils.AppUtils;
import com.task.blog.sample.utils.NetworkState;

public class FeedListAdapter extends PagedListAdapter<ApiResponse, RecyclerView.ViewHolder> {

    private static final int TYPE_PROGRESS = 0;
    private static final int TYPE_ITEM = 1;

    private Context context;
    private NetworkState networkState;


    public FeedListAdapter(Context context) {
        super(ApiResponse.DIFF_CALLBACK);
        this.context = context;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        if (viewType == TYPE_PROGRESS) {
            NetworkItemBinding headerBinding = NetworkItemBinding.inflate(layoutInflater, parent, false);
            NetworkStateItemViewHolder viewHolder = new NetworkStateItemViewHolder(headerBinding);
            return viewHolder;

        } else {
            FeedItemBinding itemBinding = FeedItemBinding.inflate(layoutInflater, parent, false);
            ArticleItemViewHolder viewHolder = new ArticleItemViewHolder(itemBinding);
            return viewHolder;
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof ArticleItemViewHolder) {
            ((ArticleItemViewHolder) holder).bindTo(getItem(position));
        } else {
            ((NetworkStateItemViewHolder) holder).bindView(networkState);
        }
    }


    private boolean hasExtraRow() {
        if (networkState != null && networkState != NetworkState.LOADED) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int getItemViewType(int position) {
        if (hasExtraRow() && position == getItemCount() - 1) {
            return TYPE_PROGRESS;
        } else {
            return TYPE_ITEM;
        }
    }

    public void setNetworkState(NetworkState newNetworkState) {
        NetworkState previousState = this.networkState;
        boolean previousExtraRow = hasExtraRow();
        this.networkState = newNetworkState;
        boolean newExtraRow = hasExtraRow();
        if (previousExtraRow != newExtraRow) {
            if (previousExtraRow) {
                notifyItemRemoved(getItemCount());
            } else {
                notifyItemInserted(getItemCount());
            }
        } else if (newExtraRow && previousState != newNetworkState) {
            notifyItemChanged(getItemCount() - 1);
        }
    }


    public class ArticleItemViewHolder extends RecyclerView.ViewHolder {

        private FeedItemBinding binding;

        public ArticleItemViewHolder(FeedItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bindTo(ApiResponse article) {
            binding.blogTitle.setText(article.getTitle().getRendered().toString());
            binding.blogYear.setText(AppUtils.getDate(article.getDate().toString()));
            binding.blogDesc.setText(Html.fromHtml(Html.fromHtml(article.getExcerpt().getRendered()).toString()));

            String imgUrl = Html.fromHtml(Html.fromHtml(article.getJetpackFeaturedMediaUrl()).toString()).toString();
            loadImage(imgUrl)
                    .listener(new RequestListener<String, GlideDrawable>() {
                        @Override
                        public boolean onException(Exception e, String model, Target<GlideDrawable> target, boolean isFirstResource) {
                            binding.blogProgress.setVisibility(View.GONE);
                            return false;
                        }

                        @Override
                        public boolean onResourceReady(GlideDrawable resource, String model, Target<GlideDrawable> target, boolean isFromMemoryCache, boolean isFirstResource) {
                            // image ready, hide progress now
                            binding.blogProgress.setVisibility(View.GONE);
                            return false;   // return false if you want Glide to handle everything else.
                        }
                    })
                    .into(binding.blogPoster);

            binding.holderFrame.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, WebView.class);
                    intent.putExtra("url", article.getLink());
                    context.startActivity(intent);
                }
            });

        }

        private DrawableRequestBuilder<String> loadImage(@NonNull String posterPath) {
            return Glide
                    .with(context)
                    .load(posterPath)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)   // cache both original & resized image
                    .centerCrop()
                    .crossFade();
        }
    }


    public class NetworkStateItemViewHolder extends RecyclerView.ViewHolder {

        private NetworkItemBinding binding;

        public NetworkStateItemViewHolder(NetworkItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bindView(NetworkState networkState) {
            if (networkState != null && networkState.getStatus() == NetworkState.Status.RUNNING) {
                binding.progressBar.setVisibility(View.VISIBLE);
            } else {
                binding.progressBar.setVisibility(View.GONE);
            }

            if (networkState != null && networkState.getStatus() == NetworkState.Status.FAILED) {
                binding.errorMsg.setVisibility(View.VISIBLE);
                binding.errorMsg.setText(networkState.getMsg());
            } else {
                binding.errorMsg.setVisibility(View.GONE);
            }
        }
    }
}
