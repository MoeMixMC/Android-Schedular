package com.moemixlol.buffschedule;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.text.SimpleDateFormat;

/**
 * Created by Mohamed on 8/3/2015.
 */
public class MondayActivity extends Activity{
    ListView list;
    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent = getIntent();
        String[] classes = {intent.getStringExtra("class1"), intent.getStringExtra("class2"), intent.getStringExtra("class3")};
        String[] classTimes = {intent.getStringExtra("class1time"), intent.getStringExtra("class2time"), intent.getStringExtra("class3time")};
        super.onCreate(savedInstanceState);
        setContentView(R.layout.monday_schedule);
        list = (ListView) findViewById(R.id.scheduleListView);
        final CustomAdapter ad = new CustomAdapter(classes, classTimes, context);
        list.setAdapter(ad);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
                //Toast.makeText(context, ad.getTime(position), Toast.LENGTH_LONG).show();
                /*if (intent.getStringExtra("getDay") == "Monday") {

                }
                if (intent.getStringExtra("getDay") == "Tuesday") {

                }
                if (intent.getStringExtra("getDay") == "Wednesday") {

                }
                if (intent.getStringExtra("getDay") == "Thursday") {

                }
                if (intent.getStringExtra("getDay") == "Friday") {

                }
                */
            }
        });

    }
}
