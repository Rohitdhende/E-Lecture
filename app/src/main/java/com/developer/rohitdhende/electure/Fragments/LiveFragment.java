package com.developer.rohitdhende.electure.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.developer.rohitdhende.electure.R;

import androidx.fragment.app.Fragment;

public class LiveFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_live,container,false);
        return view;
    }
}
