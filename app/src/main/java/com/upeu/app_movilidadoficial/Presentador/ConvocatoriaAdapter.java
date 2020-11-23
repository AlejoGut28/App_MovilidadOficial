package com.upeu.app_movilidadoficial.Presentador;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ConvocatoriaAdapter extends RecyclerView.Adapter<ConvocatoriaAdapter.ConvocatoriaViewHolder> {


    @NonNull
    @Override
    public ConvocatoriaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ConvocatoriaViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ConvocatoriaViewHolder extends RecyclerView.ViewHolder{
        public ConvocatoriaViewHolder(View itemView) {
            super(itemView);

        }
    }
}
