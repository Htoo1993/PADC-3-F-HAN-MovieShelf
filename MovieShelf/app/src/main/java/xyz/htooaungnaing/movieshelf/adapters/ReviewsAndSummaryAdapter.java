package xyz.htooaungnaing.movieshelf.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import xyz.htooaungnaing.movieshelf.R;
import xyz.htooaungnaing.movieshelf.viewholders.ReviewsAndSummaryViewHolder;

/**
 * Created by htoo on 12/26/2017.
 */

public class ReviewsAndSummaryAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.item_reviews_and_summary, parent, false);
        ReviewsAndSummaryViewHolder reviewsAndSummaryViewHolder = new ReviewsAndSummaryViewHolder(view);
        return reviewsAndSummaryViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
