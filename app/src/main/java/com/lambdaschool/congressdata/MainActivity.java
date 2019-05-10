package com.lambdaschool.congressdata;

import android.app.Activity;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;



/*public class MainActivity extends LifecycleActivity  {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView) findViewById(R.id.list);
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressbar);
        progressBar.setVisibility(View.VISIBLE);
        MainActivityViewModel model = ViewModelProviders.of(this).get(MainActivityViewModel.class);
        model.getFruitList().observe(this, fruitlist -> {
            // update UI
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, fruitlist);
            // Assign adapter to ListView
            listView.setAdapter(adapter);
            progressBar.setVisibility(View.GONE);
        });
    }
}*/


public class MainActivity extends AppCompatActivity {

    private RecyclerView               layoutList;
    private RecyclerView.LayoutManager layoutManager;
    private OverviewListAdapter        listAdapter;

    private Context                     context;
    private CongresspersonListViewModel viewModel;
    private Activity                    activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        activity = this;
        themeUtils.getcTheme(activity);
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
}
