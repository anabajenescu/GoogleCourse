package com.example.ana.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.ToDoViewHolder> {

    private ArrayList<ToDoItem> mDataset;

    public MyRecyclerAdapter(ArrayList<ToDoItem> mDataset){
        this.mDataset = mDataset;
    }

    //Un viewHolder tine informatia unui element din lista
    //cand ob e creat si introdus in lista
    @NonNull
    @Override
    public MyRecyclerAdapter.ToDoViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i){

        LinearLayout ll = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_todo, viewGroup, false);
        TextView v = ll.findViewById(R.id.to_do_item_text);

        //BUG FRECVENT\\
        //nu e ok pt ca un view holder nu poate fi creat din obiecte deja atasate altcuiva
        //ToDoViewHolder vh = new ToDoViewHolder(v);

        ToDoViewHolder vh = new ToDoViewHolder(ll);
        return vh;
    }

    //in momentul in care e legat de o informatie
    //in momentul in care un element iese din recycler si este nevoie sa fie reciclat
    @Override
    public void onBindViewHolder(@NonNull MyRecyclerAdapter.ToDoViewHolder myViewHoder, int i){

        myViewHoder.mTextView.setText(mDataset.get(i).getmText());
    }

    //cate elemente se gasesc in lista(in recycler)
    @Override
    public int getItemCount(){
        return 0;
    }

    public static class ToDoViewHolder extends RecyclerView.ViewHolder
    {
        public TextView mTextView;

        public ToDoViewHolder(LinearLayout v) {
            super(v);
            this.mTextView = v.findViewById(R.id.to_do_item_text);
        }
    }

}
