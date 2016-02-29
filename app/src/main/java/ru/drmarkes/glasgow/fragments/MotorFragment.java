package ru.drmarkes.glasgow.fragments;

import android.view.View;

import ru.drmarkes.glasgow.R;

/**
 * Created by Андрей on 24.02.2016.
 */
public class MotorFragment extends ResponseFragment {
    private static final int LAYOUT_NAME = R.layout.fragment_motor;
    private static final int COUNT_BUTTONS = 6;

    public MotorFragment(){
        super(LAYOUT_NAME, COUNT_BUTTONS);
    }

    public static MotorFragment newInstance(){
        return new MotorFragment();
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
        onSetResponseListener.onSetResponseMotor(response);
    }
}
