package xyz.htooaungnaing.movieshelf.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;
import xyz.htooaungnaing.movieshelf.R;
import xyz.htooaungnaing.movieshelf.delegates.MovieActionDelegate;

/**
 * Created by htoo on 12/6/2017.
 */

public class MovieShelfViewHolder extends RecyclerView.ViewHolder {

    private MovieActionDelegate mMovieActionDelegate;

    public MovieShelfViewHolder(View itemView, MovieActionDelegate movieActionDelegate) {
        super(itemView);

        ButterKnife.bind(this, itemView);

        mMovieActionDelegate = movieActionDelegate;
    }

    @OnClick(R.id.cv_movie_item)
    public void onTapMovieItem(View view){
//        Toast.makeText(view.getContext(),"Movie item click", Toast.LENGTH_SHORT).show();
        mMovieActionDelegate.onTapMovieItem();
    }
}
