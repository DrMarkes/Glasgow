package ru.drmarkes.glasgow;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


/**
 * Created by Андрей on 22.02.2016.
 */
public class MyAdapter extends FragmentPagerAdapter {
    public MyAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        int layout = 0;
        switch (position) {
            case 0:
                layout = R.layout.fragment_eye;
                break;
            case 1:
                layout = R.layout.fragment_verbal;
                break;
            case 2:
                layout = R.layout.fragment_motor;
                break;
            case 3:
                layout = R.layout.fragment_result;
        }
        return MyFragment.newInstance(layout);
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        CharSequence title = "";
        switch (position) {
            case 0:
                title = "Открывание глаз";
                break;
            case 1:
                title = "Речевая реакция";
                break;
            case 2:
                title = "Двигательная реакция";
                break;
            case 3:
                title = "Результат";
                break;
        }
        return title;
    }
}
