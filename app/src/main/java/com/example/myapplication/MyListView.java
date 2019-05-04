package com.example.myapplication;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class MyListView {
    public static class MyListAdapter extends ArrayAdapter <String> {
        private Activity context;
        private String[] Mclara;
        private String []Mdido;
        private Integer[] Images;
        public MyListAdapter(CattyActivity cattyActivity, String[] mclara, String[] mdido, Integer[] images) {
            super(cattyActivity,R.layout.mycaty,mclara);
            this.context =context;
            this.Mclara = Mclara;
            this.Mdido = Mdido;
            this.Images = Images;

        }
        public View getView(int position, View view, ViewGroup parent) {
            LayoutInflater inflater=context.getLayoutInflater();
            View rowView=inflater.inflate(R.layout.mycaty, null,true);

            TextView titleText = (TextView) rowView.findViewById(R.id.tv1);
            ImageView imageView = (ImageView) rowView.findViewById(R.id.image);
            TextView subtitleText = (TextView) rowView.findViewById(R.id.tv2);

            titleText.setText(Mclara[position]);
            imageView.setImageResource(Images[position]);
            subtitleText.setText(Mdido[position]);

            return rowView;

        };
    }
}
