package com.victor.cotacaomoeda.models;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/**
 * Created by victor on 26/01/18.
 */

public class ArrayAdapterMoeda extends ArrayAdapter {


    public ArrayAdapterMoeda(Context context, int resource){
        super(context, resource);
    }

     @Override
    public void add(Object object){
        super.add(object);
    }


    @Override
    public int getCount(){
        return super.getCount();
    }

    @Override
    public Object getItem(int position){
        return super.getItem(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        return super.getView(position, convertView, parent);
    }




}
