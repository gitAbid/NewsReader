package com.marblelab.newsreader;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Abid Hasan on 5/10/2017.
 */

public class NewsFeedListAdapter extends RecyclerView.Adapter<NewsFeedListAdapter.ViewHolder> {
    List<NewsFeed> newsFeeds;
    Context context;

    public NewsFeedListAdapter( Context context,List<NewsFeed> newsFeeds) {
        this.newsFeeds = newsFeeds;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(context).inflate(R.layout.news_card,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mNewscardTile.setText(newsFeeds.get(position).getTumbTitle());
        holder.mNewscardDescription.setText(newsFeeds.get(position).getTumbDescription());
        holder.mNewscardSource.setText(newsFeeds.get(position).getSource());
        holder.mNewscardUpdateTimeDate.setText(newsFeeds.get(position).getUpdateTimeDate());
        Picasso.with(context).load(newsFeeds.get(position).getTumbImaageLink()).into(holder.mNewscardTumbnail);
    }


    @Override
    public int getItemCount() {
        return newsFeeds.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView mNewscardTile;
        private TextView mNewscardDescription;
        private ImageView mNewscardTumbnail;
        private TextView mNewscardSource;
        private  TextView mNewscardUpdateTimeDate;
        public ViewHolder(View itemView) {
            super(itemView);
            mNewscardTile=(TextView)itemView.findViewById(R.id.tv_news_title);
            mNewscardDescription=(TextView)itemView.findViewById(R.id.tv_description);
            mNewscardSource=(TextView)itemView.findViewById(R.id.tv_source);
            mNewscardUpdateTimeDate=(TextView)itemView.findViewById(R.id.tv_time_update);
            mNewscardTumbnail=(ImageView)itemView.findViewById(R.id.iv_tumbnail);
        }
    }
}
