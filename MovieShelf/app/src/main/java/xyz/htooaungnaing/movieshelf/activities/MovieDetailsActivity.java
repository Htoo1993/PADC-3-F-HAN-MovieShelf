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
import xyz.htooaungnaing.movieshelf.adapters.TrailerDetailImageAdapter;

/**
 * Created by htoo on 12/12/2017.
 */

public class MovieDetailsActivity extends AppCompatActivity {

    @BindView(R.id.rv_trailer_details)
    RecyclerView rvTrailerDetails;

    private TrailerDetailImageAdapter trailerDetailImageAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_details);

        ButterKnife.bind(this, this);

        trailerDetailImageAdapter = new TrailerDetailImageAdapter();

//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);

        rvTrailerDetails.setLayoutManager(linearLayoutManager);
        rvTrailerDetails.setAdapter(trailerDetailImageAdapter);
    }
}
