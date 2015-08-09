package com.moemixlol.buffschedule;

import android.content.Context;
import android.text.format.Time;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
public class CustomAdapter extends BaseAdapter{
    MainActivity a = new MainActivity();
    String [] classes;
    Context context;
    String [] classTimes;
    LayoutInflater inflater;

    public CustomAdapter(String[] classes, String[] classTimes, Context c)  {
        this.classes=classes;
        context=c;
        this.classTimes = classTimes;
        inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return classes.length;
    }

    @Override
    public String getItem(int position) {
        // TODO Auto-generated method stub
        return classes[position];
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    public String getTime(int position){

        return classTimes[position];
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        Time time = new Time();
        time.setToNow();

        convertView = inflater.inflate(R.layout.schedule_layout, parent, false);
        TextView className = (TextView)convertView.findViewById(R.id.className);
        TextView classTime = (TextView)convertView.findViewById(R.id.classTimes);
        TextView isNow = (TextView) convertView.findViewById(R.id.isNow);
        className.setText(classes[position]);
        classTime.setText(classTimes[position]);
        if(getTime(position).startsWith("10") && (time.hour == 10)){
            isNow.setText("NOW");
        }else if(getTime(position).startsWith("1") && (time.hour == 1)){
            isNow.setText("NOW");
        }else if(getTime(position).startsWith("2") && (time.hour == 2)){
            isNow.setText("NOW");
        }else if(getTime(position).startsWith("4") && (time.hour == 4)){
            isNow.setText("NOW");
        }else{
            isNow.setText("Not Now");
        }
        return convertView;
    }
}
