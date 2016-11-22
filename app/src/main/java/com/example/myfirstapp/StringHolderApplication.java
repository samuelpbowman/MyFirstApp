package com.example.myfirstapp;

import android.app.Application;
import android.view.View;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by samuel on 11/21/16.
 */

public class StringHolderApplication extends Application {

    private List<View> list = new ArrayList<>();

    public List<View> getList() { return list; }

    public void setList(List<View> list) {
        this.list = list;
    }

    public void addToList(String s) {
        TableRow row = new TableRow(this);
        TextView view = new TextView(this);
        view.setText(s);
        row.addView(view);
        this.list.add(row);
    }

    public void onCreate() {

    }
}
