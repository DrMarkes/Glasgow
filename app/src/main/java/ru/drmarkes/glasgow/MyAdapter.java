package ru.drmarkes.glasgow;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import ru.drmarkes.glasgow.fragments.EyeFragment;
import ru.drmarkes.glasgow.fragments.MotorFragment;
import ru.drmarkes.glasgow.fragments.ResultFragment;
import ru.drmarkes.glasgow.fragments.VerbalFragment;


/**
 * Created by Андрей on 22.02.2016.
 */
public class MyAdapter extends FragmentPagerAdapter {
    public MyAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = EyeFragment.newInstance();
                break;
            case 1:
                fragment = VerbalFragment.newInstance();
                break;
            case 2:
                fragment = MotorFragment.newInstance();
                break;
            case 3:
                fragment = ResultFragment.newInstance();
        }
        return fragment;
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
