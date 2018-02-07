package com.thelosers.internshiptrail.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.thelosers.internshiptrail.Model.Product;
import com.thelosers.internshiptrail.R;

import java.util.List;

/**
 * Created by deepak on 07/02/18.
 */

public class FragmentThreeAdapter extends RecyclerView.Adapter<FragmentThreeAdapter.MyViewHolder> {

    private List<Product> horizontalList;
    private Context context;

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView mTitleText;
        ImageView mImageView;

        public MyViewHolder(View view) {
            super(view);
            mImageView = (ImageView) view.findViewById(R.id.imageView_adapter);
            mTitleText = (TextView) view.findViewById(R.id.textview_adapter);

        }
    }

    public FragmentThreeAdapter(Context context, List<Product> horizontalList) {
        this.context = context;
        this.horizontalList = horizontalList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_three_adapter, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        final Product detail = horizontalList.get(position);
        holder.mTitleText.setText(detail.getTitle());
       holder.mImageView.setImageDrawable(context.getResources().getDrawable(detail.getDrawable()));



    }

    @Override
    public int getItemCount() {
        return horizontalList.size();
    }
}







