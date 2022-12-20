package com.erkanterzioglu.landmarkbook;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LandMarkAdapter extends RecyclerView.Adapter<LandMarkAdapter.LandMarkHolder>  {

    public LandMarkAdapter(ArrayList<Landmark> landmarkArrayList) {
        this.landmarkArrayList = landmarkArrayList;
    }

    ArrayList<Landmark> landmarkArrayList;



    @NonNull
    @Override
    public LandMarkHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerRowBinding recyclerRowBinding=RecyclerRowBinding.inflater()
        return new LandMarkHolder();
    }

    @Override
    public void onBindViewHolder(@NonNull LandMarkHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return landmarkArrayList.size();
    }

    public class LandMarkHolder extends RecyclerView.ViewHolder{

        private RecyclerRowBinding binding;

        public LandMarkHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
