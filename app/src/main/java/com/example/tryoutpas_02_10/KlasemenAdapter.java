package com.example.tryoutpas_02_10;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class KlasemenAdapter extends RecyclerView.Adapter<KlasemenAdapter.ViewHolder> {
    private List<KlasemenModel> klasemenList;

    public KlasemenAdapter(List<KlasemenModel> klasemenList) {
        this.klasemenList = klasemenList;
    }

    @NonNull
    @Override
    public KlasemenAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.klasemen_item_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull KlasemenAdapter.ViewHolder holder, int position) {
        KlasemenModel klasemen = klasemenList.get(position);

        holder.tvRank.setText(klasemen.getIntRank());
        holder.tvTeam.setText(klasemen.getStrTeam());
        holder.tvWin.setText(klasemen.getIntWin());
        holder.tvDraw.setText(klasemen.getIntDraw());
        holder.tvLoss.setText(klasemen.getIntLoss());
        holder.tvGoalDiff.setText(klasemen.getIntGoalDifference());
        holder.tvPoints.setText(klasemen.getIntPoints());
        Glide.with(holder.itemView.getContext()).load(klasemen.getStrBadge()).into(holder.ivBadge);
    }

    @Override
    public int getItemCount() {
        return klasemenList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvRank, tvTeam, tvWin, tvDraw, tvLoss, tvGoalDiff, tvPoints;
        ImageView ivBadge;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvRank = itemView.findViewById(R.id.tvRank);
            tvTeam = itemView.findViewById(R.id.tvTeam);
            tvWin = itemView.findViewById(R.id.tvWin);
            tvDraw = itemView.findViewById(R.id.tvDraw);
            tvLoss = itemView.findViewById(R.id.tvLoss);
            tvGoalDiff = itemView.findViewById(R.id.tvGoalDiff);
            tvPoints = itemView.findViewById(R.id.tvPoints);
            ivBadge = itemView.findViewById(R.id.ivBadge); // pastikan ini ada di layout XML
        }
    }
}
