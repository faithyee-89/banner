package com.test.banner.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.test.banner.R;
import com.test.banner.bean.DataBean;
import com.test.banner.viewholder.ImageTitleHolder;
import com.youth.banner.adapter.BannerAdapter;

import java.util.List;

/**
 * 自定义布局，图片+标题
 */

public class ImageBottomTitleAdapter extends BannerAdapter<DataBean, ImageTitleHolder> {

    public ImageBottomTitleAdapter(List<DataBean> mDatas) {
        super(mDatas);
    }

    @Override
    public ImageTitleHolder onCreateHolder(ViewGroup parent, int viewType) {
        return new ImageTitleHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.banner_image_bottom_title, parent, false));
    }

    @Override
    public void onBindView(ImageTitleHolder holder, DataBean data, int position, int size) {
        holder.imageView.setImageResource(data.imageRes);
        holder.title.setText(data.title);
    }

}
