package ru.drmarkes.glasgow.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import ru.drmarkes.glasgow.OnSetResponseListener;
import ru.drmarkes.glasgow.R;

/**
 * Created by Андрей on 24.02.2016.
 */
public class MotorFragment extends ResponseFragment {
    Button button5;
    Button button6;
    private static final int LAYOUT_NAME = R.layout.fragment_motor;

    public MotorFragment(){
        super(LAYOUT_NAME);
    }

    public static MotorFragment newInstance(){
        return new MotorFragment();
    }

    @Override
    void findView(View v) {
        super.findView(v);
        button5 = (Button)v.findViewById(R.id.response5);
        button6 = (Button)v.findViewById(R.id.response6);
    }

    @Override
    void setButtonListener() {
        super.setButtonListener();
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
    }

    @Override
    void setBackgroundColorPrimary() {
        super.setBackgroundColorPrimary();
        button5.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.colorPrimaryLight));
        button6.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.colorPrimaryLight));
    }

    void setBackgroundColor() {
        setBackgroundColorPrimary();
        switch (response){
            case 1:
                button1.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.colorAccentLight));
                break;
            case 2:
                button2.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.colorAccentLight));
                break;
            case 3:
                button3.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.colorAccentLight));
                break;
            case 4:
                button4.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.colorAccentLight));
                break;
            case 5:
                button5.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.colorAccentLight));
                break;
            case 6:
                button6.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.colorAccentLight));
                break;
        }
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
            case R.id.response5:
                response = 5;
                break;
            case R.id.response6:
                response = 6;
                break;
        }
        setBackgroundColor();
        onSetResponseListener.onSetResponseMotor(response);
    }
}
