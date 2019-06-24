package com.redoyahmed.androiddi.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.redoyahmed.androiddi.R;
import com.redoyahmed.androiddi.model.Songs;
import com.redoyahmed.androiddi.utils.Helper;

import java.util.List;

public class SongAdapter extends RecyclerView.Adapter<SongViewHolder> {

    private Context context;
    private List<Songs> allSongs;

    public SongAdapter(Context context, List<Songs> allSongs) {
        this.context = context;
        this.allSongs = allSongs;
    }

    @NonNull
    @Override
    public SongViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item_song, parent, false);
        return new SongViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SongViewHolder holder, int position) {
        Songs mSong = allSongs.get(position);
        holder.songTitle.setText(mSong.getSongTitle());
        holder.songAuthor.setText(mSong.getSongAuthor());
        String imagePath = Helper.URL + "images/" + mSong.getSongImage();
        Glide.with(context).load(imagePath).diskCacheStrategy(DiskCacheStrategy.ALL).fitCenter().into(holder.songImage);
    }

    @Override
    public int getItemCount() {
        return allSongs.size();
    }
}