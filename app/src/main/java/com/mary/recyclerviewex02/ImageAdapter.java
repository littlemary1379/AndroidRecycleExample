package com.mary.recyclerviewex02;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

import de.hdodenhof.circleimageview.CircleImageView;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ProfileImageAdapter>{

    List<Integer> profileImgSource=new ArrayList<>();

    public void addProfileImg(int img){
        profileImgSource.add(img);
    }

    //껍데기 생성
    @NonNull
    @Override
    public ProfileImageAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.layout_profile,parent,false);
        return new ProfileImageAdapter(view);
    }

    //데이터 바인딩
    @Override
    public void onBindViewHolder(@NonNull ProfileImageAdapter holder, int position) {
        int profileImg=profileImgSource.get(position);
        holder.setProfileImg(profileImg);
    }

    //크기 지정
    @Override
    public int getItemCount() {
        return profileImgSource.size();
    }

    public static class ProfileImageAdapter extends RecyclerView. ViewHolder{

        //규칙 1 : 회전할 레이아웃 내부의 뷰 모두 변수화

        private CircleImageView profileImgView;

        public ProfileImageAdapter(@NonNull View itemView) {
            super(itemView);

            //규칙2 : id를 통해 뷰 찾기
            profileImgView=itemView.findViewById(R.id.img_profile);

        }
        //규칙3 : 함수를 통해 아이템 넣기
        public void setProfileImg(int img){
            profileImgView.setImageResource(img);
        }
    }
}
