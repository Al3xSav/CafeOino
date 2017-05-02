package com.example.android.cafeoino_singlesreenapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;



public class CustomListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] itemName;
    private final Integer[] imgId;

    public CustomListAdapter(Activity context, String[] itemname, Integer[] imgid) {
        super(context, R.layout.activity_contactlist, itemname);

        this.context=context;
        this.itemName =itemname;
        this.imgId =imgid;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.activity_contactlist, null,true);

        TextView textView = (TextView) rowView.findViewById(R.id.infoItem);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);

        textView.setText(itemName[position]);
        imageView.setImageResource(imgId[position]);
        return rowView;

    };
}
