package com.example.lv1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class myRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    List<Object> dataList;

    public myRecyclerAdapter(List<Object> myDataset) {
        dataList = myDataset;
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        if(dataList.get(viewType) instanceof String){
            View view = (View) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.header_info, viewGroup, false);
            return new HeaderViewHolder(view);
        }
        else if(dataList.get(viewType) instanceof Student){
            View view = (View) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.student_info, viewGroup, false);
            return new StudentViewHolder(view);
        }
        return null;
    }

    class HeaderViewHolder extends RecyclerView.ViewHolder {
        TextView txtNaslov;
        public HeaderViewHolder(@NonNull View itemView){
            super(itemView);
            txtNaslov = itemView.findViewById(R.id.tvNaslov);
        }
    }

    class StudentViewHolder extends RecyclerView.ViewHolder {
        TextView txtImeStud;
        TextView txtPrezStud;
        TextView txtPredStud;
        public StudentViewHolder(@NonNull View itemView){
            super(itemView);
            txtImeStud = itemView.findViewById(R.id.tvImeInfo);
            txtPrezStud = itemView.findViewById(R.id.tvPrezimeInfo);
            txtPredStud = itemView.findViewById(R.id.tvPredmetInfo);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
        if(dataList.get(position) instanceof String) {
            HeaderViewHolder headViewHolder = (HeaderViewHolder) viewHolder;
            headViewHolder.txtNaslov.setText("STUDENTI");
        }
        else if(dataList.get(position) instanceof Student) {
            StudentViewHolder studViewHolder = (StudentViewHolder) viewHolder;
            studViewHolder.txtImeStud.setText(((Student) dataList.get(position)).vratiIme());
            studViewHolder.txtPrezStud.setText(((Student) dataList.get(position)).vratiPrezime());
            studViewHolder.txtPredStud.setText(((Student) dataList.get(position)).vratiPredmet());
        }
    }
    @Override
    public int getItemCount() {
        return dataList.size();
    }
    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }
}