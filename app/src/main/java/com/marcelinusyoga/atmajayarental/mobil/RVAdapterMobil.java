package com.marcelinusyoga.atmajayarental.mobil;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.marcelinusyoga.atmajayarental.R;
import com.marcelinusyoga.atmajayarental.databinding.ActivityRvadapterMobilBinding;

import java.util.ArrayList;

public class RVAdapterMobil extends RecyclerView.Adapter<RVAdapterMobil.viewHolder> {
    private ArrayList<Mobil> ListMobil;

    public RVAdapterMobil(ArrayList<Mobil> listMobil) {
        ListMobil = listMobil;
    }

    @NonNull
    @Override
    public RVAdapterMobil.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        ActivityRvadapterMobilBinding binding = DataBindingUtil.inflate(inflater, R.layout.activity_rvadapter_mobil, parent, false);

        return new RVAdapterMobil.viewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull RVAdapterMobil.viewHolder holder, int position) {
        final Mobil mobil = ListMobil.get(position);
        holder.binding.setMbl(mobil);
        holder.binding.executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return ListMobil.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ActivityRvadapterMobilBinding binding;

        public viewHolder(@NonNull ActivityRvadapterMobilBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}