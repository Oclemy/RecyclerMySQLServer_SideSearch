package com.tutorials.hp.recyclermysqlserver_sidesearch.Recycler;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tutorials.hp.recyclermysqlserver_sidesearch.R;

import java.util.ArrayList;

/**
 * Created by Oclemmy on 4/2/2016 for ProgrammingWizards Channel.
 */
public class MyAdapter extends RecyclerView.Adapter<MyHolder> {

    Context c;
    ArrayList<String> names;

    public MyAdapter(Context c, ArrayList<String> names) {
        this.c = c;
        this.names = names;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.model,parent,false);
        MyHolder holder=new MyHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        holder.nameTxt.setText(names.get(position));
    }

    @Override
    public int getItemCount() {
        return names.size();
    }
}
