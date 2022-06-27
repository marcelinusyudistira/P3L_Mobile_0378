package com.marcelinusyoga.atmajayarental.transaksi;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.marcelinusyoga.atmajayarental.R;
import com.marcelinusyoga.atmajayarental.databinding.ActivityRecyclerViewAdapterTransaksiBinding;

import java.util.ArrayList;

public class RecyclerViewAdapterTransaksi extends RecyclerView.Adapter<RecyclerViewAdapterTransaksi.viewHolder> {
    private ArrayList<Transaksi> ListTransaksi;

    public RecyclerViewAdapterTransaksi(ArrayList<Transaksi> listTransaksi) {
        ListTransaksi = listTransaksi;
    }

    @NonNull
    @Override
    public RecyclerViewAdapterTransaksi.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        ActivityRecyclerViewAdapterTransaksiBinding binding = DataBindingUtil.inflate(inflater, R.layout.activity_recycler_view_adapter_transaksi, parent, false);

        return new RecyclerViewAdapterTransaksi.viewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapterTransaksi.viewHolder holder, int position) {
        final Transaksi transaksi = ListTransaksi.get(position);
        holder.binding.setTrn(transaksi);
        holder.binding.executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return ListTransaksi.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ActivityRecyclerViewAdapterTransaksiBinding binding;

        public viewHolder(@NonNull ActivityRecyclerViewAdapterTransaksiBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}