package com.india.news.newss;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;
import android.util.Log;

import java.io.IOException;
import java.net.URL;
import java.util.List;

public class My_Loader extends AsyncTaskLoader<List<News_1>> {
    public My_Loader(Context context) {
        super(context);
    }

    @Override
    protected void onStartLoading() {
        super.onStartLoading();
        forceLoad();
    }

    @Override
    public List<News_1> loadInBackground() {
        List<News_1> listOfNews = null;
        try {
            URL url = Query_Utils.createUrl();
            String jsonResponse = Query_Utils.makeHttpRequest(url);
            listOfNews = Query_Utils.parseJson(jsonResponse);
        } catch (IOException e) {
            Log.e("Queryutils", "Error Loader LoadInBackground: ", e);
        }
        return listOfNews;
    }
}
