package xyz.htooaungnaing.movieshelf.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import xyz.htooaungnaing.movieshelf.R;
import xyz.htooaungnaing.movieshelf.viewholders.TrailerDetailImageViewHolder;

/**
 * Created by htoo on 12/13/2017.
 */

public class TrailerDetailImageAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view =  layoutInflater.inflate(R.layout.item_trailer_detail, parent, false);
        TrailerDetailImageViewHolder trailerDetailImageViewHolder = new TrailerDetailImageViewHolder(view);
        return trailerDetailImageViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 8;
    }
}
