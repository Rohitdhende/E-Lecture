package com.developer.rohitdhende.electure;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.developer.rohitdhende.electure.Adapter.MyAdapter;
import com.developer.rohitdhende.electure.Fragments.SubjectsFragment;
import com.developer.rohitdhende.electure.Units.Mad_Unit1;
import com.developer.rohitdhende.electure.model.Model;

import java.util.ArrayList;

public class TopicsActivity extends AppCompatActivity {

    TextView mTitleTv;
    private static final String TAG = SubjectsFragment.class.getSimpleName();
    RecyclerView mRecyclerView;
    MyAdapter myAdapter;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topics);




        mRecyclerView = findViewById(R.id.recycler_view2);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        myAdapter = new MyAdapter(getMyList(), new MyAdapter.OnClickListener() {
            @Override
            public void onClick(Model clickedModel) {
                if(clickedModel.getTitle().equals("Introduction to MAD")) {
                    Intent intent = new Intent(getApplicationContext(), Mad_Unit1.class);
                    intent.putExtra("iTitle", clickedModel.getTitle());
                    startActivity(intent);

                }
                if(clickedModel.getTitle().equals("Android Architecture Overview and Creating an Example Android Application")){
                    Toast.makeText(getApplicationContext(),"You Clicked Android Architecture Overview and Creating an Example Android Application",Toast.LENGTH_SHORT).show();
                }
                if(clickedModel.getTitle().equals("Android Software Development Platform")){
                    Toast.makeText(getApplicationContext(),"You Clicked Android Software Development Platform",Toast.LENGTH_SHORT).show();
                }
                if(clickedModel.getTitle().equals("Android Framework Overview")){
                    Toast.makeText(getApplicationContext(),"You Clicked Android Framework Overview",Toast.LENGTH_SHORT).show();
                }
            }
        });
        mRecyclerView.setAdapter(myAdapter);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");


        final ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_24);

        mTitleTv = findViewById(R.id.title);


        Intent intent = getIntent();
        String mTitle = intent.getStringExtra("iTitle");

//        Bitmap bitmap = BitmapFactory.decodeByteArray(mBytes,0,mBytes.length);
        mTitleTv.setText(mTitle);
//        mDescTv.setText(mDescription);
//        mImageIv.setImageBitmap(bitmap);
    }

    private ArrayList<Model> getMyList() {
        ArrayList<Model> models =new ArrayList<>();
        Model m = new Model();
        m.setTitle("Introduction to MAD");
        m.setDescription("Des 1");
        m.setImg(R.drawable.book2);
        models.add(m);

        m = new Model();
        m.setTitle("Android Architecture Overview and Creating an Example Android Application");
        m.setDescription("Des 3");
        m.setImg(R.drawable.book2);
        models.add(m);

        m = new Model();
        m.setTitle("Android Software Development Platform");
        m.setDescription("Des 2");
        m.setImg(R.drawable.book2);
        models.add(m);

        m = new Model();
        m.setTitle("Android Framework Overview");
        m.setDescription("Des 3");
        m.setImg(R.drawable.book2);
        models.add(m);

        m = new Model();
        m.setTitle("Understanding Android Views, View Groups and Layouts");
        m.setDescription("Des 4");
        m.setImg(R.drawable.book2);
        models.add(m);

        m = new Model();
        m.setTitle("Graphical User Interface Screen with views");
        m.setDescription("Des 5");
        m.setImg(R.drawable.book2);
        models.add(m);

        m = new Model();
        m.setTitle("Displaying Pictures");
        m.setDescription("Des 5");
        m.setImg(R.drawable.book2);
        models.add(m);

        return models;
    }
}