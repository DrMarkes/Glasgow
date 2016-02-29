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
 * Created by Андрей on 29.02.2016.
 */
abstract class ResponseFragment extends Fragment implements View.OnClickListener {
    int response;
    OnSetResponseListener onSetResponseListener;
    Button[] button;
    int layoutName;
    int countButtons;

    public ResponseFragment(int layoutName, int countButtons){
        this.layoutName = layoutName;
        this.countButtons = countButtons;
        button = new Button[countButtons];
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        onSetResponseListener = (OnSetResponseListener) context;
    }

    @Override
    public void onDetach() {
        onSetResponseListener = null;
        super.onDetach();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View viewFragment = inflater.inflate(layoutName, container, false);
        findView(viewFragment);
        setButtonListener();
        setBackgroundColor();
        return viewFragment;
    }

    void findView(View v){
        for(int i = 0; i < countButtons; i++) {
            int id = i + 1;
            int buttonResponse = i + 1;
            int buttonID = getResources().getIdentifier("response" + id, "id", getActivity().getPackageName());
            button[i] = (Button)v.findViewById(buttonID);
            button[i].setTag(buttonResponse);
        }
    }

    void setButtonListener(){
        for(int i = 0; i < countButtons; i++) {
            button[i].setOnClickListener(this);
        }
    }

    void setBackgroundColorPrimary(){
        for(int i = 0; i < countButtons; i++) {
            button[i].setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.colorPrimaryLight));
        }
    }

    void setBackgroundColor() {
        int id = response - 1;
        setBackgroundColorPrimary();
        if(response != 0) {
            button[id].setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.colorAccentLight));
        }
    }

    @Override
    public void onClick(View v) {
        response = (int)v.getTag();
        setBackgroundColor();
    }
}
