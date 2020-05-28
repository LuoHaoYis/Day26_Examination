package com.lhy.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import com.lhy.data.HomeBean;
import com.lhy.day26_examination.R;

import java.util.ArrayList;
import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder> {

    private List<HomeBean> homeList=new ArrayList<>();
    private Context context;

    public HomeAdapter(Context context) {
        this.context = context;
    }

    public void setHomeList(List<HomeBean> homeList) {
        this.homeList.addAll(homeList);
        notifyDataSetChanged();
    }

    public void deleteList(int i){
        this.homeList.remove(i);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            //创建布局
        View inflate = LayoutInflater.from(context).inflate(R.layout.recycler_item, viewGroup, false);

        return new ViewHolder(inflate);
    }

    int post=0;

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder viewHolder, final int i) {
        final HomeBean homeBean = homeList.get(i);
            //赋值
        Glide.with(context).load(homeBean.getThumbnail()).apply(new RequestOptions().circleCrop()).into(viewHolder.imageView);
        viewHolder.textView.setText(homeBean.getTitle());
        viewHolder.textView2.setText(homeBean.getAuthor());

        //按钮的点击事件
        viewHolder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                viewHolder.button.setText("取消");
                //判断
                if (viewHolder.button.getText().toString().equals("关注")) {
                    viewHolder.button.setText("取消");
                    if (additemClick != null) {
                        additemClick.itemClick(homeBean);
                    }
                } else {
                    viewHolder.button.setText("关注");
                    if (additemClick != null) {
                        additemClick.deleteClick(homeBean,i);
                    }
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return homeList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private final Button button;
        private final TextView textView2;
        private final TextView textView;
        private final ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView);
            textView2 = itemView.findViewById(R.id.textView2);
            button = itemView.findViewById(R.id.button);
        }
    }

    additemClick additemClick;

    public void setAdditemClick(HomeAdapter.additemClick additemClick) {
        this.additemClick = additemClick;
    }

   public interface  additemClick{
        void itemClick(HomeBean homeBean);
        void deleteClick(HomeBean homeBean,int i);
    }
}
