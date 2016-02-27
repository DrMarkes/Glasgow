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
public class EyeFragment extends Fragment implements View.OnClickListener {
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    private int eye;
    private OnSetResponseListener onSetResponseListener;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        onSetResponseListener = (OnSetResponseListener) context;
    }

    public EyeFragment(){}

    public static EyeFragment newInstance(){
        return new EyeFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View viewFragment = inflater.inflate(R.layout.fragment_eye, container, false);
        button1 = (Button)viewFragment.findViewById(R.id.response1);
        button1.setOnClickListener(this);
        button2 = (Button)viewFragment.findViewById(R.id.response2);
        button2.setOnClickListener(this);
        button3 = (Button)viewFragment.findViewById(R.id.response3);
        button3.setOnClickListener(this);
        button4 = (Button)viewFragment.findViewById(R.id.response4);
        button4.setOnClickListener(this);
        setBackgroundColor();
        return viewFragment;
    }

    private void setBackgroundColor() {
        button1.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.colorPrimaryLight));
        button2.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.colorPrimaryLight));
        button3.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.colorPrimaryLight));
        button4.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.colorPrimaryLight));
        switch (eye){
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
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.response1:
                eye = 1;
                break;
            case R.id.response2:
                eye = 2;
                break;
            case R.id.response3:
                eye = 3;
                break;
            case R.id.response4:
                eye = 4;
                break;
        }
        setBackgroundColor();
        onSetResponseListener.onSetResponse("eye", eye);
    }

    @Override
    public void onDetach() {
        onSetResponseListener = null;
        super.onDetach();
    }
}
