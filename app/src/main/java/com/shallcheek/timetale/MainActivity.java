package com.shallcheek.timetale;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity {
    private TimeTableView mTimaTableView;
    private List<TimeTableModel> mList;
    private Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences read = getSharedPreferences("lock", MODE_WORLD_READABLE);
        spinner = (Spinner) findViewById(R.id.spinner2);
        spinner.setSelection(read.getInt("week",1)-1,true);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Spinner spinner=(Spinner) parent;
                int newWeek=(int)spinner.getItemIdAtPosition(position)+1;    //下拉栏选择的周数
                SharedPreferences read = getSharedPreferences("lock", MODE_WORLD_READABLE);
                int lastWeek=read.getInt("week",1);  //选择之前的周数
                if (lastWeek!=newWeek)
                {

                    SharedPreferences.Editor data = getSharedPreferences("lock", MODE_WORLD_WRITEABLE).edit();
                    data.putInt("week",newWeek);
                    data.commit();
                    reStart();
                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(getApplicationContext(), "没有改变的处理", Toast.LENGTH_LONG).show();
            }

        });


        mList = new ArrayList<TimeTableModel>();
        mTimaTableView = (TimeTableView) findViewById(R.id.main_timetable_ly);
        addList();
        mTimaTableView.setTimeTable(mList);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    private void addList() {
        SharedPreferences read = getSharedPreferences("lock", MODE_WORLD_READABLE);
        int who = read.getInt("who", 1);
        int week = read.getInt("week",1);

        System.out.println("who"+who);
        System.out.println("week"+week);



        new Data(mList,week,who);
        /*if(who==1)
            mList.add(new TimeTableModel(0, 1, 2, 1, "8:20", "10:10", "测试1","王老师", "06103", ""));
        if(who==2)
            mList.add(new TimeTableModel(0, 3, 4, 2, "8:20", "10:10", "测试2","王老师", "06103", ""));
        */
    }




    //重启activity
    private void reStart(){
        Intent intent = getIntent();
        finish();
        startActivity(intent);
    }





    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int who;
        //步骤2-1：创建一个SharedPreferences.Editor接口对象，lock表示要写入的XML文件名，MODE_WORLD_WRITEABLE写操作
        SharedPreferences.Editor data = getSharedPreferences("lock", MODE_WORLD_WRITEABLE).edit();
        switch (item.getItemId()) {
            case R.id.main_screenshot:
                ScreenshotUtil.getBitmapByView(this, (ScrollView) findViewById(R.id.main_scrollview));
                break;
            case R.id.table2:
                //切换到秀秀的课表
                reStart();

                who = 2;  //1表示自己的课表

                //步骤2-2：将获取过来的值放入文件
                data.putInt("who", who);
                //步骤3：提交
                data.commit();


                break;


            case R.id.table1:
                //切换到自己的课表
                reStart();

                who = 1;  //1表示自己的课表
                //步骤2-2：将获取过来的值放入文件
                data.putInt("who", who);
                //步骤3：提交
                data.commit();

                break;
        }
        return true;
    }
}
