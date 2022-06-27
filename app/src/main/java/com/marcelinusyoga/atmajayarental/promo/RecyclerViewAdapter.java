package com.marcelinusyoga.atmajayarental.promo;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.marcelinusyoga.atmajayarental.R;
import com.marcelinusyoga.atmajayarental.databinding.ActivityRecyclerViewAdapterBinding;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.viewHolder> {
    private ArrayList<Promo> ListPromo;

    public RecyclerViewAdapter(ArrayList<Promo> listPromo) {
        ListPromo = listPromo;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        ActivityRecyclerViewAdapterBinding binding = DataBindingUtil.inflate(inflater, R.layout.activity_recycler_view_adapter, parent, false);

        return new RecyclerViewAdapter.viewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.viewHolder holder, int position) {
        final Promo promo = ListPromo.get(position);
        holder.binding.setPromo(promo);
        holder.binding.executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return ListPromo.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ActivityRecyclerViewAdapterBinding binding;

        public viewHolder(@NonNull ActivityRecyclerViewAdapterBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}