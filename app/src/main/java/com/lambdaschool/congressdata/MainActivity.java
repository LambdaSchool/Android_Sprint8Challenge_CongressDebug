package com.lambdaschool.congressdata;

import android.app.Activity;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;





public class MainActivity extends AppCompatActivity {

    private RecyclerView               layoutList;
    private RecyclerView.LayoutManager layoutManager;
    private OverviewListAdapter        listAdapter;

    private Context                     context;
    private CongresspersonListViewModel viewModel;
    private Activity                    activity;
    int themeId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        activity = this;
        themeId = themeUtils.getcTheme(activity);
        themeUtils.onActivityCreateSetTheme(activity);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;
        layoutList = findViewById(R.id.layout_list);
        layoutList.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(context);
        layoutList.setLayoutManager(layoutManager);


        viewModel = ViewModelProviders.of(this).get(CongresspersonListViewModel.class);

        viewModel.getOverviewList().observe(this, overviewList -> runOnUiThread(() -> {
            assert overviewList != null;

            // using recycler view
            listAdapter = new OverviewListAdapter(overviewList);
            layoutList.setAdapter(listAdapter);
        }));
    }

    @Override
    protected void onStart() {
        int savedTheme = themeUtils.getcTheme(activity);
        if(themeId != savedTheme){
            themeId = savedTheme;
            themeUtils.refreshActivity(activity);
        }
        super.onStart();
    }
}
