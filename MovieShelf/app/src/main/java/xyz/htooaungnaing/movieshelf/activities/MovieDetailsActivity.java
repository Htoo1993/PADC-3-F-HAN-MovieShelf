package xyz.htooaungnaing.movieshelf.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;
import android.view.WindowManager;

import butterknife.BindView;
import butterknife.ButterKnife;
import xyz.htooaungnaing.movieshelf.R;
import xyz.htooaungnaing.movieshelf.adapters.MovieGenreAdapter;
import xyz.htooaungnaing.movieshelf.adapters.ReviewsAndSummaryAdapter;
import xyz.htooaungnaing.movieshelf.adapters.TrailerDetailImageAdapter;
import xyz.htooaungnaing.movieshelf.viewholders.MovieGenreViewHolder;

/**
 * Created by htoo on 12/12/2017.
 */

public class MovieDetailsActivity extends AppCompatActivity {

    @BindView(R.id.rv_trailer_details)
    RecyclerView rvTrailerDetails;

    @BindView(R.id.rv_genre)
    RecyclerView rvGenre;

    @BindView(R.id.rv_reviews_and_summary)
    RecyclerView rvReviewsAndSummary;

    private TrailerDetailImageAdapter trailerDetailImageAdapter;
    private MovieGenreAdapter movieGenreAdapter;
    private ReviewsAndSummaryAdapter reviewsAndSummaryAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_details);

        ButterKnife.bind(this, this);

        trailerDetailImageAdapter = new TrailerDetailImageAdapter();
        movieGenreAdapter = new MovieGenreAdapter();
        reviewsAndSummaryAdapter = new ReviewsAndSummaryAdapter();

//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        rvTrailerDetails.setLayoutManager(linearLayoutManager);
        rvTrailerDetails.setAdapter(trailerDetailImageAdapter);

        LinearLayoutManager genreLinearLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        rvGenre.setLayoutManager(genreLinearLayoutManager);
        rvGenre.setAdapter(movieGenreAdapter);

        LinearLayoutManager reviewsAndSummaryLayoutManger = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL, false);
        rvReviewsAndSummary.setLayoutManager(reviewsAndSummaryLayoutManger);
        rvReviewsAndSummary.setAdapter(reviewsAndSummaryAdapter);
    }
}
