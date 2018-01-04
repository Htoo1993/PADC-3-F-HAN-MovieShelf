package xyz.htooaungnaing.movieshelf.data.models;

import xyz.htooaungnaing.movieshelf.network.HttpUrlConnectionDataAgent;
import xyz.htooaungnaing.movieshelf.network.MovieDataAgent;

/**
 * Created by htoo on 12/27/2017.
 */

public class MoviesModel {

    private static MoviesModel sObjInstance;
    private MovieDataAgent mMovieDataAgent;

    private MoviesModel(){
        mMovieDataAgent = HttpUrlConnectionDataAgent.getsObjInstance();
    }

    public static MoviesModel getsObjInstance() {
        if(sObjInstance == null){
            sObjInstance = new MoviesModel();
        }
        return sObjInstance;
    }

    /**
     * load movies from network api
     */
    public void loadMovies(){
        mMovieDataAgent.loadMovies();
    }
}
