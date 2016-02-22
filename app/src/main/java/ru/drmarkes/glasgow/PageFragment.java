package ru.drmarkes.glasgow;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Андрей on 22.02.2016.
 */
public class PageFragment extends Fragment {
    private int pageNumber;
    private String title;

    public static PageFragment newInstance(int page, String title) {
        PageFragment fragment = new PageFragment();
        Bundle args = new Bundle();
        args.putInt("num", page);
        args.putString("someTitle", title);
        fragment.setArguments(args);
        return fragment;
    }

    public PageFragment(){

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pageNumber = getArguments().getInt("num", 0);
        title = getArguments().getString("someTitle");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
        View viewFragment = inflater.inflate(R.layout.fragment_page, container, false);

    }
}
