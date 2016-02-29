package ru.drmarkes.glasgow.fragments;

import android.view.View;

import ru.drmarkes.glasgow.R;

/**
 * Created by Андрей on 24.02.2016.
 */
public class EyeFragment extends ResponseFragment {
    private static final int LAYOUT_NAME = R.layout.fragment_eye;

    public EyeFragment(){
        super(LAYOUT_NAME);
    }

    public static EyeFragment newInstance(){
        return new EyeFragment();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.response1:
                response = 1;
                break;
            case R.id.response2:
                response = 2;
                break;
            case R.id.response3:
                response = 3;
                break;
            case R.id.response4:
                response = 4;
                break;
        }
        setBackgroundColor();
        onSetResponseListener.onSetResponseEye(response);
    }
}
