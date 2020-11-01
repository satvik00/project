package com.example.project;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class feedAdapter extends RecyclerView.Adapter<feedholder> {
    private ArrayList<String> articles;
    public feedAdapter(ArrayList<String> articles) {
        this.articles = articles;
    }
    @NonNull
    @Override
    public feedholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.feed_item,parent,false);
        final feedholder g=new feedholder(view);
        return g;
    }

    @Override
    public void onBindViewHolder(@NonNull feedholder holder, int position) {
        holder.textView.setText(articles.get(position));
    }

    @Override
    public int getItemCount() {
        return articles.size();
    }
}
class feedholder extends RecyclerView.ViewHolder{
    TextView textView;
    public feedholder(@NonNull View itemView) {
        super(itemView);
        textView= (TextView)itemView.findViewById(R.id.item);
    }
}
