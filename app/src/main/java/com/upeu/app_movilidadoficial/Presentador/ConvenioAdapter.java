package com.upeu.app_movilidadoficial.Presentador;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



public class ConvenioAdapter extends RecyclerView.Adapter<ConvenioAdapter.ConvenioViewHolder> {
    @NonNull
    @Override
    public ConvenioViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder( ConvenioViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {

        return 0;
    }

    public class ConvenioViewHolder extends RecyclerView.ViewHolder{
        TextView textView9;
        TextView textView10;
        TextView textView12;

         public ConvenioViewHolder(View itemView) {
             super(itemView);

         }
     }
}
