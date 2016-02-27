package ru.drmarkes.glasgow.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import ru.drmarkes.glasgow.R;

/**
 * Created by Андрей on 24.02.2016.
 */
public class ResultFragment extends Fragment {
    TextView textResult;
    TextView textDepression;

    public ResultFragment(){}

    public static Fragment newInstance() {
        return new ResultFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_result, container, false);
        textResult = (TextView)view.findViewById(R.id.result);
        textDepression = (TextView)view.findViewById(R.id.depression);
        return view;
    }

    public void onSetResult(int result) {
        String resultString = Integer.toString(result);
        String depression;
        if(result < 5) {
            depression = "Запредельная (терминальная) кома (III)";
        } else if(result < 7) {
            depression = "Глубокая кома (II)";
        } else if(result < 9) {
            depression = "Умеренная кома (I)";
        } else if(result < 11) {
            depression = "Сопор";
        } else if(result < 13) {
            depression = "Глубокое оглушение";
        } else if(result < 15) {
            depression = "Умеренное оглушение";
        } else {
            depression = "Ясное сознание";
        }
        textResult.setText(resultString);
        textDepression.setText(depression);
    }
}
