package ru.drmarkes.glasgow.fragments;

import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.Button;

import ru.drmarkes.glasgow.R;

/**
 * Created by Андрей on 24.02.2016.
 */
public class VerbalFragment extends ResponseFragment {
    Button button5;
    private static final int LAYOUT_NAME = R.layout.fragment_verbal;

    public VerbalFragment(){
        super(LAYOUT_NAME);
    }

    public static VerbalFragment newInstance(){
        return new VerbalFragment();
    }

    @Override
    void findView(View v) {
        super.findView(v);
        button5 = (Button)v.findViewById(R.id.response5);
    }

    @Override
    void setButtonListener() {
        super.setButtonListener();
        button5.setOnClickListener(this);
    }

    @Override
    void setBackgroundColorPrimary() {
        super.setBackgroundColorPrimary();
        button5.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.colorPrimaryLight));
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
        }
        setBackgroundColor();
        onSetResponseListener.onSetResponseVerbal(response);
    }
}
