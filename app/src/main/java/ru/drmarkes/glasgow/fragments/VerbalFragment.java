package ru.drmarkes.glasgow.fragments;

import android.view.View;

import ru.drmarkes.glasgow.R;

/**
 * Created by Андрей on 24.02.2016.
 */
public class VerbalFragment extends ResponseFragment {
    private static final int LAYOUT_NAME = R.layout.fragment_verbal;
    private static final int COUNT_BUTTONS = 5;

    public VerbalFragment(){
        super(LAYOUT_NAME, COUNT_BUTTONS);
    }

    public static VerbalFragment newInstance(){
        return new VerbalFragment();
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
        onSetResponseListener.onSetResponseVerbal(response);
    }
}
