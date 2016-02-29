package ru.drmarkes.glasgow;

import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ru.drmarkes.glasgow.fragments.ResultFragment;

public class MainActivity extends AppCompatActivity implements OnSetResponseListener {
    public int eye = 0;
    private int verbal = 0;
    private int motor = 0;
    private int result = 0;
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

    @Override
    public void onSetResponseEye(int eye) {
        this.eye = eye;
        showNextFragment();
    }

    @Override
    public void onSetResponseVerbal(int verbal) {
        this.verbal = verbal;
        showNextFragment();
    }

    @Override
    public void onSetResponseMotor(int motor) {
        this.motor = motor;
        showNextFragment();
    }

    private void showNextFragment(){
        if(eye == 0) {
            viewPager.setCurrentItem(0);
        } else if(verbal == 0) {
            viewPager.setCurrentItem(1);
        } else if(motor == 0) {
            viewPager.setCurrentItem(2);
        } else {
            viewPager.setCurrentItem(3);
            showResultGlasgow();
        }
    }

    private void calculateResult() {
        result = eye + verbal + motor;
    }

    private void showResultGlasgow() {
        calculateResult();
        ResultFragment fragment = (ResultFragment)getSupportFragmentManager().getFragments().get(3);
        fragment.onSetResult(result);
    }
}
