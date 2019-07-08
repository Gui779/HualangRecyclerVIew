package com.example.hualangrecyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import java.util.ArrayList;

public class RecyAdapter extends RecyclerView.Adapter<RecyAdapter.MViewHolder> {

    private ArrayList<String> mImageList;
    private Context mContext;

    public RecyAdapter(ArrayList<String> imageList, Context context) {
        this.mImageList = imageList;
        this.mContext = context;

    }

    @NonNull
    @Override
    public MViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = View.inflate(mContext,R.layout.recy_item,null);
        MViewHolder mViewHolder = new MViewHolder(view);
        return mViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MViewHolder mViewHolder, int i) {
        Glide.with(mContext).load(mImageList.get(i)).into(mViewHolder.imageView);
    }

    @Override
    public int getItemCount() {
        return mImageList.size();
    }

    public class MViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;

        public MViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageview);
        }
    }
}
