package com.india.news.newss;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class My_Adapter extends ArrayAdapter<News_1> {

    public My_Adapter(Context context1) {
        super(context1, -1, new ArrayList<News_1>());
    }

    @Override
    public View getView(int pos, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView
                    = LayoutInflater.from(getContext()).inflate(R.layout.my_list, parent, false);
        }
        TextView title = (TextView) convertView.findViewById(R.id.title);
        TextView author = (TextView) convertView.findViewById(R.id.author);
        TextView date = (TextView) convertView.findViewById(R.id.date);
        TextView section = (TextView) convertView.findViewById(R.id.section);

        News_1 currentNews = getItem(pos);
        title.setText(currentNews.getTitle());
        author.setText(currentNews.getAuthor());
        date.setText(currentNews.getDate());
        section.setText(currentNews.getSection());

        return convertView;
    }
}
