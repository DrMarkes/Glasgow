package ru.drmarkes.glasgow;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Андрей on 22.02.2016.
 */
public class MyFragment extends Fragment {
    private int layout;
    TextView textViewResult;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;

    public static MyFragment newInstance(int layout) {
        MyFragment fragment = new MyFragment();
        fragment.layout = layout;
        return fragment;
    }

    public MyFragment(){

    }

    public void setText(String result) {
        textViewResult.setText(result);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View viewFragment = inflater.inflate(layout, container, false);
        if (layout == R.layout.fragment_result) {
            textViewResult = (TextView)viewFragment.findViewById(R.id.result);
        }
        if(layout == R.layout.fragment_eye) {
            button1 = (Button)viewFragment.findViewById(R.id.response1);
            button2 = (Button)viewFragment.findViewById(R.id.response2);
            button3 = (Button)viewFragment.findViewById(R.id.response3);
            button4 = (Button)viewFragment.findViewById(R.id.response4);
        }
        if (layout == R.layout.fragment_verbal) {
            button1 = (Button)viewFragment.findViewById(R.id.response1);
            button2 = (Button)viewFragment.findViewById(R.id.response2);
            button3 = (Button)viewFragment.findViewById(R.id.response3);
            button4 = (Button)viewFragment.findViewById(R.id.response4);
            button5 = (Button)viewFragment.findViewById(R.id.response5);
        }
        if (layout == R.layout.fragment_motor) {
            button1 = (Button)viewFragment.findViewById(R.id.response1);
            button2 = (Button)viewFragment.findViewById(R.id.response2);
            button3 = (Button)viewFragment.findViewById(R.id.response3);
            button4 = (Button)viewFragment.findViewById(R.id.response4);
            button5 = (Button)viewFragment.findViewById(R.id.response5);
            button6 = (Button)viewFragment.findViewById(R.id.response6);
        }

        return viewFragment;
    }


}
