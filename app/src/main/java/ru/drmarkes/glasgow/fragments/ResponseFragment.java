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
    protected int response;
    OnSetResponseListener onSetResponseListener;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    int layoutName;

    public ResponseFragment(int layoutName){
        this.layoutName = layoutName;
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
        for(int i = 1; i <=4; i++) {
            int buttonID = getResources().getIdentifier("response" + i, "id", getActivity().getPackageName());
            button[i] = (Button)v.findViewById(buttonID);
        }
        button1 = (Button)v.findViewById(R.id.response1);
        button2 = (Button)v.findViewById(R.id.response2);
        button3 = (Button)v.findViewById(R.id.response3);
        button4 = (Button)v.findViewById(R.id.response4);
    }

    void setButtonListener(){
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
    }

    void setBackgroundColorPrimary(){
        button1.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.colorPrimaryLight));
        button2.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.colorPrimaryLight));
        button3.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.colorPrimaryLight));
        button4.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.colorPrimaryLight));
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
        }
    }

    @Override
    abstract public void onClick(View v);
}
