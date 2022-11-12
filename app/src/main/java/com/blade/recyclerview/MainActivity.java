package com.blade.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass> userList;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        initData();
        initRecyclerView();
        
    }

    private void initRecyclerView() {
        recyclerView = findViewById(R.id.rv_mylist);
        layoutManager = new LinearLayoutManager(MainActivity.this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new Adapter(userList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }

    private void initData() {
        userList =  new ArrayList<>();
        userList.add(new ModelClass(R.drawable.ic_baseline_face_6_24, "Nihal", "How are You", "12:05AM"));
        userList.add(new ModelClass(R.drawable.ic_baseline_person_24, "Fasal", "Where r u?", "12:05AM"));
        userList.add(new ModelClass(R.drawable.ic_car, "Sahal", "Why r u??", "12:05AM"));
    }
}