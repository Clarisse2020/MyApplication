package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class CattyActivity extends AppCompatActivity {
    String[]Mclara={
            "chips with salades",
            "chicken humberg with pizza",
            "fish fillet with rice",
            "peas with vegetables",
            "milkshake with cookies",
            "bread with juis"
    };
    String[] Mdido ={
            "price.....7500",
            "price.....10000",
            "price.....5000",
            "price.....4500",
            "price.....2000",
            "price.....1000"
    };
Integer[] Images= {
        R.drawable.caty1,
        R.drawable.caty2,
        R.drawable.caty3,
        R.drawable.caty4,
        R.drawable.caty5,
        R.drawable.down
};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catty);
        MyListView.MyListAdapter dapter = new MyListView.MyListAdapter(this,Mclara,Mdido,Images);
        ListView listView= (ListView)findViewById(R.id.clara);
        listView.setAdapter(dapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }
}
