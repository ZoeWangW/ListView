package com.zoe.listview;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Fruit> fruitList = new ArrayList<Fruit>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();  //初始化水果数据
        FruitAdapter adapter = new FruitAdapter(MainActivity.this,R.layout.fruit_item,fruitList);
        ListView listView = (ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fruit fruit = fruitList.get(position);
                Toast.makeText(MainActivity.this,fruit.getName(),Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void initFruits(){
        Fruit apple = new Fruit("Apple",R.mipmap.apple);
        fruitList.add(apple);

        Fruit banana = new Fruit("Banana",R.mipmap.banana);
        fruitList.add(banana);

        Fruit orange = new Fruit("Orange",R.mipmap.orange);
        fruitList.add(orange);

        Fruit watermelon = new Fruit("Watermelon",R.mipmap.watermelon);
        fruitList.add(watermelon);

        Fruit pear = new Fruit("Pear",R.mipmap.pear);
        fruitList.add(pear);

        Fruit grape = new Fruit("Grape",R.mipmap.grape);
        fruitList.add(grape);

        Fruit pineapple = new Fruit("Pineapple",R.mipmap.pineapple);
        fruitList.add(pineapple);

        Fruit strawberry = new Fruit("Strawberry",R.mipmap.strawberry);
        fruitList.add(strawberry);

        Fruit mango = new Fruit("Mango",R.mipmap.mango);
        fruitList.add(mango);

        Fruit cherry = new Fruit("Cherry",R.mipmap.cherry);
        fruitList.add(cherry);
    }
}
