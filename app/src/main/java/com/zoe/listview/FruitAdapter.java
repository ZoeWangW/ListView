package com.zoe.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class FruitAdapter extends ArrayAdapter {

    private int resourceId;

    public FruitAdapter(Context context,int textViewResourceId,List<Fruit> object){
        super(context,textViewResourceId,object);
        resourceId = textViewResourceId;
    }

    @Override
    public View getView(int position,View convertView,ViewGroup parent){
        Fruit fruit = (Fruit) getItem(position);  //获取当前项的Fruit实例，加了（Fruit）
        View view = LayoutInflater.from(getContext()).inflate(resourceId, null);
        ImageView fruitImage = (ImageView)view.findViewById(R.id.fruit_image);
        TextView fruitname = (TextView)view.findViewById(R.id.fruit_name);
        fruitImage.setImageResource(fruit.getImageId());
        fruitname.setText(fruit.getName());
        return view;
    }
}