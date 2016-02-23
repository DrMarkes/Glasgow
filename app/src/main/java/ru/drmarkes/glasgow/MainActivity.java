package ru.drmarkes.glasgow;

import android.support.v4.app.Fragment;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int eye = 0;
    private int verbal = 0;
    private int motor = 0;
    private int result = 0;
    TextView textResult;

    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager)findViewById(R.id.pager);
        viewPager.setAdapter(new MyAdapter(getSupportFragmentManager()));

        PagerTabStrip pagerTabStrip = (PagerTabStrip)findViewById(R.id.pager_header);
        pagerTabStrip.setDrawFullUnderline(true);
        pagerTabStrip.setTabIndicatorColorResource(R.color.colorPrimary);

    }

    public void onClickEye(View view) {
        switch (view.getId()) {
            case R.id.response1:
                eye = 1;
                break;
            case R.id.response2:
                eye = 2;
                break;
            case R.id.response3:
                eye = 3;
                break;
            case R.id.response4:
                eye = 4;
                break;
        }
        setResultGlasgow();
    }

    public void onClickVerbal(View view) {
        switch (view.getId()) {
            case R.id.response1:
                verbal = 1;
                break;
            case R.id.response2:
                verbal = 2;
                break;
            case R.id.response3:
                verbal = 3;
                break;
            case R.id.response4:
                verbal = 4;
                break;
            case R.id.response5:
                verbal = 5;
                break;
        }
        setResultGlasgow();
    }

    public void onClickMotor(View view) {
        switch (view.getId()) {
            case R.id.response1:
                motor = 1;
                break;
            case R.id.response2:
                motor = 2;
                break;
            case R.id.response3:
                motor = 3;
                break;
            case R.id.response4:
                motor = 4;
                break;
            case R.id.response5:
                motor = 5;
                break;
            case R.id.response6:
                motor = 6;
                break;
        }
        setResultGlasgow();
    }

    private void setResultGlasgow() {
        result = eye + verbal + motor;

    }
}
