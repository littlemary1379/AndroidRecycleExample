package com.mary.recyclerviewex02;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private Context mContext=MainActivity.this;
    private RecyclerView rcProfile, rcMain;
    private ImageAdapter imgAdapter;
    private ImageMainAdapter imgMainAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcProfile=findViewById(R.id.rc_profileImg);
        rcMain=findViewById(R.id.rc_mainProfile);
        imgAdapter=new ImageAdapter();
        imgMainAdapter=new ImageMainAdapter();

        //이미지 넣기
        imgAdapter.addProfileImg(R.drawable.cat1);
        imgAdapter.addProfileImg(R.drawable.cat2);
        imgAdapter.addProfileImg(R.drawable.cat3);
        imgAdapter.addProfileImg(R.drawable.cat4);
        imgAdapter.addProfileImg(R.drawable.cat5);
        imgAdapter.addProfileImg(R.drawable.cat6);

        imgMainAdapter.addMainImage(R.drawable.dog1);
        imgMainAdapter.addMainImage(R.drawable.dog2);
        imgMainAdapter.addMainImage(R.drawable.dog3);
        imgMainAdapter.addMainImage(R.drawable.dog4);
        imgMainAdapter.addMainImage(R.drawable.dog5);
        imgMainAdapter.addMainImage(R.drawable.dog6);

        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(mContext, RecyclerView.HORIZONTAL, false);
        rcProfile.setLayoutManager(layoutManager);
        rcProfile.setAdapter(imgAdapter);

        RecyclerView.LayoutManager layoutManager2=new LinearLayoutManager(mContext);
        rcMain.setLayoutManager(layoutManager2);
        rcMain.setAdapter(imgMainAdapter);

    }
}