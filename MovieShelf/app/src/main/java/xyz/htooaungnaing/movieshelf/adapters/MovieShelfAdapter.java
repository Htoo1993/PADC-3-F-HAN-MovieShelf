package xyz.htooaungnaing.movieshelf.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import xyz.htooaungnaing.movieshelf.R;
import xyz.htooaungnaing.movieshelf.viewholders.MovieShelfViewHolder;

/**
 * Created by htoo on 12/7/2017.
 */

public class MovieShelfAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View movieShelfView = layoutInflater.inflate(R.layout.movie_shelf,parent,false);
        MovieShelfViewHolder movieShelfViewHolder = new MovieShelfViewHolder(movieShelfView);
        return movieShelfViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}