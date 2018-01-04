package xyz.htooaungnaing.movieshelf.events;

import java.util.List;

import xyz.htooaungnaing.movieshelf.data.vo.PopularMovieVO;

/**
 * Created by htoo on 1/2/2018.
 */

public class LoadedMoviesEvent {

    private List<PopularMovieVO> popularMovieVOList;

    public LoadedMoviesEvent(List<PopularMovieVO> popularMovieVOList) {
        this.popularMovieVOList = popularMovieVOList;
    }

    public List<PopularMovieVO> getPopularMovieVOList() {
        return popularMovieVOList;
    }
}
