package com.marcelinusyoga.atmajayarental.transaksidrv;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.marcelinusyoga.atmajayarental.R;
import com.marcelinusyoga.atmajayarental.databinding.ActivityRecyclerViewAdapterTransaksiBinding;
import com.marcelinusyoga.atmajayarental.databinding.ActivityRvadapterTransaksiDriverBinding;
import com.marcelinusyoga.atmajayarental.transaksi.RecyclerViewAdapterTransaksi;
import com.marcelinusyoga.atmajayarental.transaksi.Transaksi;

import java.util.ArrayList;

public class RVAdapterTransaksiDriver extends RecyclerView.Adapter<RVAdapterTransaksiDriver.viewHolder> {

    private ArrayList<TransaksiDriver> ListTransaksi;


    public RVAdapterTransaksiDriver(ArrayList<TransaksiDriver> listTransaksi) {
        ListTransaksi = listTransaksi;
    }

    @NonNull
    @Override
    public RVAdapterTransaksiDriver.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        ActivityRvadapterTransaksiDriverBinding binding = DataBindingUtil.inflate(inflater, R.layout.activity_rvadapter_transaksi_driver, parent, false);

        return new RVAdapterTransaksiDriver.viewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull RVAdapterTransaksiDriver.viewHolder holder, int position) {
        final TransaksiDriver transaksi = ListTransaksi.get(position);
        holder.binding.setTrndrv(transaksi);
        holder.binding.executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return ListTransaksi.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ActivityRvadapterTransaksiDriverBinding binding;
        public viewHolder(@NonNull ActivityRvadapterTransaksiDriverBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}