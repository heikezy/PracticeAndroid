package cn.infinitex.xyy.androidpractice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Arrays;
import java.util.List;

import cn.infinitex.xyy.androidpractice.practice.broadcast.BroadcastActivity;
import cn.infinitex.xyy.androidpractice.practice.contact.ContactActivity;
import cn.infinitex.xyy.androidpractice.practice.database.DatabaseActivity;
import cn.infinitex.xyy.androidpractice.practice.httpService.HttpActivity;
import cn.infinitex.xyy.androidpractice.practice.log.LogDatabaseActivity;
import cn.infinitex.xyy.androidpractice.practice.map.MapActivity;
import cn.infinitex.xyy.androidpractice.practice.register.RegisterActivity;
import cn.infinitex.xyy.androidpractice.practice.subject.SubjectActivity;

public class MainActivity extends AppCompatActivity {
    private final static List<String> pageTitles = Arrays.asList(
            "Activity 跳转",
            "网络请求",
            "访问通讯录",
            "地图操作",
            "普通广播",
            "学科",
            "数据库插入",
            "数据库显示"
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.listview);
        listView.setAdapter(new ArrayAdapter<>(this, R.layout.item_title, pageTitles));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = null;
                switch (position) {
                    case 0:
                        intent = new Intent(MainActivity.this, RegisterActivity.class);
                        break;
                    case 1:
                        intent = new Intent(MainActivity.this, HttpActivity.class);
                        break;
                    case 2:
                        intent = new Intent(MainActivity.this, ContactActivity.class);
                        break;
                    case 3:
                        intent = new Intent(MainActivity.this, MapActivity.class);
                        break;
                    case 4:
                        intent = new Intent(MainActivity.this, BroadcastActivity.class);
                        break;
                    case 5:
                        intent = new Intent(MainActivity.this, SubjectActivity.class);
                        break;
                    case 6:
                        intent = new Intent(MainActivity.this, DatabaseActivity.class);
                        break;
                    case 7:
                        intent = new Intent(MainActivity.this, LogDatabaseActivity.class);
                        break;
                }
                startActivity(intent);
            }
        });
    }
}
