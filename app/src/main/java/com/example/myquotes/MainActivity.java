package com.example.myquotes;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView quoteList;
    ArrayList<ModelClass> CategoriesList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        quoteList = findViewById(R.id.quoteList);

        ModelClass dataOne = new ModelClass();
        dataOne.setCategoriesImage(R.drawable.birthday);
        dataOne.setCategoriesName("Birthday");
        CategoriesList.add(dataOne);

        ModelClass dataTwo = new ModelClass();
        dataTwo.setCategoriesImage(R.drawable.ic_work);
        dataTwo.setCategoriesName("Work");
        CategoriesList.add(dataTwo);

        ModelClass dataThree = new ModelClass();
        dataThree.setCategoriesImage(R.drawable.ic_fitness);
        dataThree.setCategoriesName("Fitness");
        CategoriesList.add(dataThree);

        ModelClass dataFour = new ModelClass();
        dataFour.setCategoriesImage(R.drawable.ic_sad);
        dataFour.setCategoriesName("Sad");
        CategoriesList.add(dataFour);


        ModelClass dataFive = new ModelClass();
        dataFive.setCategoriesImage(R.drawable.ic_cool);
        dataFive.setCategoriesName("Cool");
        CategoriesList.add(dataFive);


        ModelClass dataSix = new ModelClass();
        dataSix.setCategoriesImage(R.drawable.ic_cute);
        dataSix.setCategoriesName("Cute");
        CategoriesList.add(dataSix);


        ModelClass dataSeven = new ModelClass();
        dataSeven.setCategoriesImage(R.drawable.funny_);
        dataSeven.setCategoriesName("Funny");
        CategoriesList.add(dataSeven);

        ModelClass dataEight = new ModelClass();
        dataEight.setCategoriesImage(R.drawable.ic_life);
        dataEight.setCategoriesName("Life");
        CategoriesList.add(dataEight);

        ModelClass dataNine = new ModelClass();
        dataNine.setCategoriesImage(R.drawable.ic_love);
        dataNine.setCategoriesName("Love");
        CategoriesList.add(dataNine);

        ModelClass dataTen = new ModelClass();
        dataTen.setCategoriesImage(R.drawable.ic_self);
        dataTen.setCategoriesName("Selfie");
        CategoriesList.add(dataTen);

        MyClickInterface myClickInterface = new MyClickInterface() {
            @Override
            public void onClick(int CategoriesImage, String CategoriesName) {
                Intent intent = new Intent(MainActivity.this, QuotesPageActivity.class);
                intent.putExtra("CategoriesName", CategoriesName);
                startActivity(intent);
            }
        };

        MyAdapter adapter = new MyAdapter(CategoriesList, myClickInterface);
        GridLayoutManager manager = new GridLayoutManager(this, 2);
        quoteList.setLayoutManager(manager);
        quoteList.setAdapter(adapter);
    }
}