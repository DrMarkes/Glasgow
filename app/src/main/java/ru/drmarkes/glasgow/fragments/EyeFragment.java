package ru.drmarkes.glasgow.fragments;

import android.view.View;

import ru.drmarkes.glasgow.R;

/**
 * Created by Андрей on 24.02.2016.
 */
public class EyeFragment extends ResponseFragment {
    private static final int LAYOUT_NAME = R.layout.fragment_eye;
    private static final int COUNT_BUTTONS = 4;

    public EyeFragment(){
        super(LAYOUT_NAME, COUNT_BUTTONS);
    }

    public static EyeFragment newInstance(){
        return new EyeFragment();
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
        onSetResponseListener.onSetResponseEye(response);
    }
}
