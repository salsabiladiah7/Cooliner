package com.latihan.cooliner;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MoveActivity2 extends AppCompatActivity {

    private RecyclerView rvFood;
    private ArrayList<Food> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycle);

        rvFood = findViewById(R.id.rv_food);
        rvFood.setHasFixedSize(true);

        list.addAll(datamakanan2.getListData());
        showRecyclerCardView();
    }

    private void showRecyclerCardView() {
        rvFood.setLayoutManager(new LinearLayoutManager(this));
        CardViewFoodAdapter cardViewHeroAdapter = new CardViewFoodAdapter(list);
        rvFood.setAdapter(cardViewHeroAdapter);
    }
}