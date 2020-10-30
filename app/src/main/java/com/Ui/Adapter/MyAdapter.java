package com.Ui.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.Ui.modal.DataModal;
import com.example.scrap.R;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    ArrayList<DataModal>  dataholder;

    public MyAdapter(ArrayList<DataModal> dataholder) {
        this.dataholder = dataholder;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.single_row_design,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.img1.setImageResource(dataholder.get(position).getImage());
        holder.headerText.setText(dataholder.get(position).getHeader());
        holder.DescText.setText(dataholder.get(position).getDesc());

    }

    @Override
    public int getItemCount() {
        return dataholder.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView img1;
        TextView headerText, DescText;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            img1= itemView.findViewById(R.id.img1);
            headerText= itemView.findViewById(R.id.headerText);
            DescText= itemView.findViewById(R.id.DescText);
        }
    }
}
