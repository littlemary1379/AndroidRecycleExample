package com.mary.recyclerviewex02;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ImageMainAdapter extends RecyclerView.Adapter<ImageMainAdapter.MainImageHolder>{

    List<Integer> mainImageSources=new ArrayList<>();

    public void addMainImage(int img){
        mainImageSources.add(img);
    }

    @NonNull
    @Override
    public MainImageHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.layout_content,parent,false);
        return new MainImageHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainImageHolder holder, int position) {
        int mainImage=mainImageSources.get(position);
        holder.setMainImgView(mainImage);
    }

    @Override
    public int getItemCount() {
        return mainImageSources.size();
    }

    public static class MainImageHolder extends RecyclerView.ViewHolder{

        private ImageView mainImgView;

        public MainImageHolder(@NonNull View itemView) {
            super(itemView);

            mainImgView=itemView.findViewById(R.id.img_main);
        }

        public void setMainImgView(int img){
            mainImgView.setImageResource(img);
        }
    }
}
