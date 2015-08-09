package com.moemixlol.buffschedule;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ListView listView = (ListView) findViewById(R.id.listView);
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Monday");
        strings.add("Tuesday");
        strings.add("Wednesday");
        strings.add("Thursday");
        strings.add("Friday");
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, android.R.id.text1, strings);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(adapter.getItem(position) == "Monday"){
                    Intent i = new Intent(getApplicationContext(), MondayActivity.class);
                    i.putExtra("getDay", "Monday");
                    i.putExtra("class1", "Calc 2 Lecture");
                    i.putExtra("class2", "Comp Sci Lecture");
                    i.putExtra("class3", "Physics Lecture");
                    i.putExtra("class1time", "10-10:50 A.M");
                    i.putExtra("class2time", "1-1:50 P.M");
                    i.putExtra("class3time", "2-2:50 P.M");
                    startActivity(i);
                }
                if(adapter.getItem(position) == "Tuesday"){
                    Intent i = new Intent(getApplicationContext(), MondayActivity.class);
                    i.putExtra("getDay", "Tuesday");
                    i.putExtra("class1", "Writing");
                    i.putExtra("class2", "Calc 2 Lecture");
                    i.putExtra("class3", "Comp Sci Recitation");
                    i.putExtra("class1time", "8-9:15 A.M");
                    i.putExtra("class2time", "10-10:50 A.M");
                    i.putExtra("class3time", "4-4:50 P.M");
                    startActivity(i);
                }
                if(adapter.getItem(position) == "Wednesday"){
                    Intent i = new Intent(getApplicationContext(), MondayActivity.class);
                    i.putExtra("getDay", "Wednesday");
                    i.putExtra("class1", "Calc 2 Lecture");
                    i.putExtra("class2", "Comp Sci Lecture");
                    i.putExtra("class3", "Physics Lecture");
                    i.putExtra("class1time", "10-10:50 A.M");
                    i.putExtra("class2time", "1-1:50 P.M");
                    i.putExtra("class3time", "2-2:50 P.M");
                    startActivity(i);
                }
                if(adapter.getItem(position) == "Thursday"){
                    Intent i = new Intent(getApplicationContext(), MondayActivity.class);
                    i.putExtra("getDay", "Thursday");
                    i.putExtra("class1", "Writing");
                    i.putExtra("class2", "Calc 2 Lecture");
                    i.putExtra("class3", "Physics Recitation");
                    i.putExtra("class1time", "8-9:15 A.M");
                    i.putExtra("class2time", "10-10:50 P.M");
                    i.putExtra("class3time", "2-2:50 P.M");
                    startActivity(i);
                }
                if(adapter.getItem(position) == "Friday"){
                    Intent i = new Intent(getApplicationContext(), MondayActivity.class);
                    i.putExtra("getDay", "Friday");
                    i.putExtra("class1", "Calc 2 Lecture");
                    i.putExtra("class2", "Comp Sci Lecture");
                    i.putExtra("class3", "Physics Lecture");
                    i.putExtra("class1time", "10-10:50 A.M");
                    i.putExtra("class2time", "1-1:50 P.M");
                    i.putExtra("class3time", "2-2:50 P.M");
                    startActivity(i);
                }
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
