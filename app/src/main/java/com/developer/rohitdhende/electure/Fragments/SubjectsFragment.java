package com.developer.rohitdhende.electure.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.developer.rohitdhende.electure.Adapter.MyAdapter;
import com.developer.rohitdhende.electure.R;
import com.developer.rohitdhende.electure.TopicsActivity;
import com.developer.rohitdhende.electure.model.Model;

import java.util.ArrayList;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public  class SubjectsFragment extends Fragment {
    private static final String TAG = SubjectsFragment.class.getSimpleName();

    RecyclerView mRecyclerView;
    MyAdapter myAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_subjects,container,false);

        mRecyclerView = view.findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        myAdapter = new MyAdapter(getMyList(), new MyAdapter.OnClickListener() {
            @Override
            public void onClick(Model clickedModel) {
                if(clickedModel.getTitle().equals("Mobile App Development")) {
                    Intent intent = new Intent(requireActivity(), TopicsActivity.class);
                    intent.putExtra("iTitle", clickedModel.getTitle());
                    startActivity(intent);
                }
                if(clickedModel.getTitle().equals("Artificial Intelligence")){
                    Log.i(TAG,"Nahi Hua");
                }
            }
        });
        mRecyclerView.setAdapter(myAdapter);
        return view;
    }


    private ArrayList<Model> getMyList() {
        ArrayList<Model> models = new ArrayList<>();

        Model m = new Model();
        m.setTitle("Mobile App Development");
        m.setDescription("Des 1");
        m.setImg(R.drawable.mad2);
        models.add(m);

        m = new Model();
        m.setTitle("Software Testing and Quality Assurance");
        m.setDescription("Des 3");
        m.setImg(R.drawable.stqa2);
        models.add(m);

        m = new Model();
        m.setTitle("Artificial Intelligence");
        m.setDescription("Des 2");
        m.setImg(R.drawable.ai2);
        models.add(m);

        m = new Model();
        m.setTitle("Infrastructure Security");
        m.setDescription("Des 3");
        m.setImg(R.drawable.is2);
        models.add(m);

        m = new Model();
        m.setTitle("Enterprise Network Design");
        m.setDescription("Des 4");
        m.setImg(R.drawable.net2);
        models.add(m);

        m = new Model();
        m.setTitle("Cyber Security and Laws");
        m.setDescription("Des 5");
        m.setImg(R.drawable.csl2);
        models.add(m);

        m = new Model();
        m.setTitle("Management Information System");
        m.setDescription("Des 5");
        m.setImg(R.drawable.mis2);
        models.add(m);


        return models;
    }
}
