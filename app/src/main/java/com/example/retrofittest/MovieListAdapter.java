package com.example.retrofittest;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by Taehyung Kim on 2020-06-09.
 *
 * @Discription:
 */

public class MovieListAdapter extends RecyclerView.Adapter<MovieListAdapter.MovieListViewHolder> {

    private ArrayList<Map<String, Object>> items = new ArrayList<Map<String, Object>>();

    public MovieListAdapter(ArrayList<Map<String, Object>> resultList) {
        this.items = resultList;
    }

    @NonNull
    @Override
    public MovieListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item, parent, false);
        return new MovieListViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull MovieListViewHolder holder, int position) {
        Map<String, Object> item = items.get(position);
        holder.setItem(item);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class MovieListViewHolder extends RecyclerView.ViewHolder {
        public TextView tvRank, tvMovieNm, tvOpenDt;

        public MovieListViewHolder(View itemView) {
            super(itemView);
            tvRank = itemView.findViewById(R.id.tv_rank);
            tvMovieNm = itemView.findViewById(R.id.tv_movieNm);
            tvOpenDt = itemView.findViewById(R.id.tv_openDt);

        }

        public void setItem(Map<String, Object> item) {

            //"rank", "movieNm", "openDt"은 Json파일에 저장되어 있던 key값
            tvRank.setText(item.get("rank").toString());
            tvMovieNm.setText(item.get("movieNm").toString());
            tvOpenDt.setText(item.get("openDt").toString());

        }
    }
}