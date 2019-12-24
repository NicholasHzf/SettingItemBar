package com.hzf.nicholas.settingitembar;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.hzf.nicholas.settingitembarlibrary.SettingItemBar;

public class MainActivity extends AppCompatActivity {

    SettingItemBar mSettingItemBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSettingItemBar = findViewById(R.id.setting);
        mSettingItemBar.setTitleText("NICHOLAS.HZF");
        mSettingItemBar.setInfoTextColor(Color.parseColor("#ff0000"));
        mSettingItemBar.setTitleStyle(2);
        mSettingItemBar.setInfoTextTVVisibility(8);
        mSettingItemBar.setOnItemClickListener(new SettingItemBar.OnItemClickListener() {
            @Override
            public void OnClick() {
                Toast.makeText(MainActivity.this,"888888",Toast.LENGTH_LONG).show();
            }
        },0);
//        mSettingItemBar.setOnItemClickListener(new SettingItemBar.OnItemClickListener() {
//            @Override
//            public void OnClick() {
//                Toast.makeText(MainActivity.this,"888888",Toast.LENGTH_LONG).show();
//            }
//        },1);
        mSettingItemBar.setOnItemClickListener(new SettingItemBar.OnItemClickListener() {
            @Override
            public void OnClick() {
                Toast.makeText(MainActivity.this,"77777",Toast.LENGTH_LONG).show();
            }
        },2);
//        mSettingItemBar.setOnItemClickListener(new SettingItemBar.OnItemClickListener() {
//            @Override
//            public void OnClick() {
//                Toast.makeText(MainActivity.this,"888888",Toast.LENGTH_LONG).show();
//            }
//        },3);
    }
}
