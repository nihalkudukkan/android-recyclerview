package com.blade.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private List<ModelClass> userList;

    public Adapter(List<ModelClass> userList) {
        this.userList = userList;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_design,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        int resource = userList.get(position).getImageview1();
        String name = userList.get(position).getTextview1();
        String msg = userList.get(position).getTextview2();
        String time = userList.get(position).getTextview3();

        holder.setData(resource,name,msg,time);
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView1;
        private TextView textView1;
        private TextView textView2;
        private TextView textView3;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView1 = itemView.findViewById(R.id.imageview1);
            textView1 = itemView.findViewById(R.id.tv_name);
            textView2 = itemView.findViewById(R.id.tv_message);
            textView3 = itemView.findViewById(R.id.tv_time);
        }

        public void setData(int resource, String name, String msg, String time) {
            imageView1.setImageResource(resource);
            textView1.setText(name);
            textView2.setText(msg);
            textView3.setText(time);
        }
    }
}
