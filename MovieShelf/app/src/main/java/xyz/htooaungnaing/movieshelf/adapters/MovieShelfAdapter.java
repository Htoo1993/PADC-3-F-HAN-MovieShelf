package xyz.htooaungnaing.movieshelf.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import xyz.htooaungnaing.movieshelf.MovieShelfApp;
import xyz.htooaungnaing.movieshelf.R;
import xyz.htooaungnaing.movieshelf.data.vo.PopularMovieVO;
import xyz.htooaungnaing.movieshelf.delegates.MovieActionDelegate;
import xyz.htooaungnaing.movieshelf.viewholders.MovieShelfViewHolder;

/**
 * Created by htoo on 12/7/2017.
 */

public class MovieShelfAdapter extends RecyclerView.Adapter<MovieShelfViewHolder> {

    private MovieActionDelegate mMovieActionDelegate;
    private List<PopularMovieVO> mPopularMovieList;

    public MovieShelfAdapter(MovieActionDelegate movieActionDelegate){
        mMovieActionDelegate = movieActionDelegate;
        mPopularMovieList = new ArrayList<>();
    }

    @Override
    public MovieShelfViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View movieShelfView = layoutInflater.inflate(R.layout.item_movie_shelf,parent,false);
        MovieShelfViewHolder movieShelfViewHolder = new MovieShelfViewHolder(movieShelfView, mMovieActionDelegate);
        return movieShelfViewHolder;
    }

    @Override
    public void onBindViewHolder(MovieShelfViewHolder holder, int position) {
        holder.setMovie(mPopularMovieList.get(position));
    }

    @Override
    public int getItemCount() {
        return mPopularMovieList.size();
    }

    public void setMovies(List<PopularMovieVO> popularMovieList){
        mPopularMovieList = popularMovieList;
        notifyDataSetChanged();
    }
}
