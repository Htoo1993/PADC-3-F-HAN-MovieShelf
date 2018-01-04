package xyz.htooaungnaing.movieshelf.network.responses;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import xyz.htooaungnaing.movieshelf.data.vo.PopularMovieVO;

/**
 * Created by htoo on 1/2/2018.
 */

public class GetMoviesResponse {
   private int code;
   private String message;
   private String apiVersion;
   private String page;

   @SerializedName("popular-movies")
   private List<PopularMovieVO> movieList;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public String getPage() {
        return page;
    }

    public List<PopularMovieVO> getMovieList() {
        return movieList;
    }
}
