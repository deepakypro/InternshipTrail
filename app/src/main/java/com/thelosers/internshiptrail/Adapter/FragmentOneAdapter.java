package com.thelosers.internshiptrail.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.thelosers.internshiptrail.Model.Product;
import com.thelosers.internshiptrail.R;

import java.util.List;

/**
 * Created by deepak on 07/02/18.
 */

public class FragmentOneAdapter extends RecyclerView.Adapter<FragmentOneAdapter.MyViewHolder> {

    private List<Product> horizontalList;
    private Context context;

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView mTitleText;

        public MyViewHolder(View view) {
            super(view);
            mTitleText = (TextView) view.findViewById(R.id.textView_adapter_one);

        }
    }

    public FragmentOneAdapter(Context context, List<Product> horizontalList) {
        this.context = context;
        this.horizontalList = horizontalList;
    }

    @Override
    public FragmentOneAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.frag_one_recycle_view, parent, false);
        return new FragmentOneAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final FragmentOneAdapter.MyViewHolder holder, final int position) {
        final Product detail = horizontalList.get(position);
        holder.mTitleText.setText(detail.getProduct());


    }

    @Override
    public int getItemCount() {
        return horizontalList.size();
    }
}







