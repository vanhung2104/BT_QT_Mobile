package ute.nhom27.baitaptuan.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import ute.nhom27.baitaptuan.R;
import ute.nhom27.baitaptuan.model.Nhac;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.RecycleViewHolder> {

    static final String TAG = "RecycleViewAdapter";
    List<Nhac> nhacs;
    Context ctx;
    LayoutInflater inflater;

    public RecycleViewAdapter(Context ctx, List<Nhac> nhacs) {
        this.nhacs = nhacs;
        this.ctx = ctx;
        inflater = LayoutInflater.from(ctx);
    }


    @Override
    public RecycleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.row_nhac, parent, false);
        return new RecycleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecycleViewHolder holder, int position) {
        Log.d(TAG, "Đang bind item " + position); // Kiểm tra xem có vào đây không
        Nhac nhac = nhacs.get(position);
        holder.ma.setText(nhac.getMa());
        holder.ten.setText(nhac.getTen());
        holder.loi.setText(nhac.getLoi());
        holder.casi.setText(nhac.getCasi());
    }

    @Override
    public int getItemCount() {
        return nhacs.size();
    }

    public static class RecycleViewHolder extends RecyclerView.ViewHolder {
        TextView ma, ten, loi, casi;

        public RecycleViewHolder(View itemView) {
            super(itemView);
            ma = itemView.findViewById(R.id.ma);
            ten = itemView.findViewById(R.id.ten);
            loi = itemView.findViewById(R.id.loi);
            casi = itemView.findViewById(R.id.casi);
        }
    }


}
