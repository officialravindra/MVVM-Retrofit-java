package in.premad.mvvmjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import java.util.ArrayList;
import java.util.List;

import in.premad.mvvmjava.Adapter.PlansAdapter;
import in.premad.mvvmjava.Model.GetPlansDetails;
import in.premad.mvvmjava.ViewModel.MainActivityViewModel;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    private RecyclerView my_recycler_view;
    private ProgressBar progress_circular_movie_article;
    private LinearLayoutManager layoutManager;
    private PlansAdapter adapter;
    private ArrayList<GetPlansDetails> articleArrayList = new ArrayList<>();
    MainActivityViewModel mainActivityViewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialization();

        getPlans();
    }


    /**
     * initialization of views and others
     *
     * @param @null
     */
    private void initialization() {
        progress_circular_movie_article = (ProgressBar) findViewById(R.id.progress_circular_movie_article);
        my_recycler_view = (RecyclerView) findViewById(R.id.my_recycler_view);

        // use a linear layout manager
        layoutManager = new LinearLayoutManager(MainActivity.this);
        my_recycler_view.setLayoutManager(layoutManager);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        my_recycler_view.setHasFixedSize(true);

        // adapter
        adapter = new PlansAdapter(MainActivity.this, articleArrayList);
        my_recycler_view.setAdapter(adapter);

        // View Model
        mainActivityViewModel = ViewModelProviders.of(this).get(MainActivityViewModel.class);
    }
    /**
     * get plans from api
     *
     * @param @null
     */
    private void getPlans() {
        mainActivityViewModel.getPlansResponseLiveData().observe(this, plansResponse -> {
            if (plansResponse != null) {

                progress_circular_movie_article.setVisibility(View.GONE);
                List<GetPlansDetails> plansList = plansResponse.getData();
                articleArrayList.addAll(plansList);
                adapter.notifyDataSetChanged();
            }
        });
    }
}