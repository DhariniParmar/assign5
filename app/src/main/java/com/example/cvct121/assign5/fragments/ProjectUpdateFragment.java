package com.example.cvct121.assign5.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cvct121.assign5.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProjectUpdateFragment extends Fragment {


    public ProjectUpdateFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_project_update, container, false);
    }

}
