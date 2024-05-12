package com.example.calorie_monitor.adapters;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.calorie_monitor.R;
import com.example.calorie_monitor.models.HomeHorModel;
import com.example.calorie_monitor.models.HomeVerModel;

import java.util.ArrayList;
import java.util.List;

public class HomeHorAdapter extends RecyclerView.Adapter<HomeHorAdapter.ViewHolder> {

    UpdateVerticalRec updateVerticalRec;
    Activity activity;
    ArrayList<HomeHorModel> list;

    boolean check = true;
    boolean select = true;
    int row_index = -1;

    public HomeHorAdapter(UpdateVerticalRec updateVerticalRec, Activity activity, ArrayList<HomeHorModel> list) {
        this.updateVerticalRec = updateVerticalRec;
        this.activity = activity;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.home_horizontal_item, parent, false));
    }

    @SuppressLint("RecyclerView")
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imageView.setImageResource(list.get(position).getImage());
        holder.textView.setText(list.get(position).getName());

        if (check) {
            ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

            homeVerModels.add(new HomeVerModel(R.drawable.pizza1, "Pizza1", "10:00 - 23:00", "4.9", "10$"));
            homeVerModels.add(new HomeVerModel(R.drawable.pizza2, "Pizza2", "10:00 - 23:00", "2.9", "16$"));
            homeVerModels.add(new HomeVerModel(R.drawable.pizza3, "Pizza3", "10:00 - 23:00", "3.9", "15$"));
            homeVerModels.add(new HomeVerModel(R.drawable.pizza3, "Pizza4", "10:00 - 23:00", "3.9", "15$"));
            homeVerModels.add(new HomeVerModel(R.drawable.pizza3, "Pizza5", "10:00 - 23:00", "3.9", "15$"));
            homeVerModels.add(new HomeVerModel(R.drawable.pizza3, "Pizza6", "10:00 - 23:00", "3.9", "15$"));

            updateVerticalRec.callBack(position, homeVerModels);
            check = false;
        }
            holder.cardView.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    row_index = position;
                    notifyDataSetChanged();

                    if (position==0){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                        homeVerModels.add(new HomeVerModel(R.drawable.pizza1, "Pizza small", "10:00 - 23:00", "4.9", "10$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.pizza2, "Pizza medium", "10:00 - 23:00", "2.9", "16$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.pizza3, "Pizza large", "10:00 - 23:00", "3.9", "20$"));
                        updateVerticalRec.callBack(position, homeVerModels);
                    }
                    if (position==1){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                        homeVerModels.add(new HomeVerModel(R.drawable.burger2, "Burger small", "10:00 - 23:00", "4.9", "18$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.burger4, "Burger medium", "10:00 - 23:00", "2.9", "26$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.hamburger, "Burger large", "10:00 - 23:00", "3.9", "35$"));
                        updateVerticalRec.callBack(position, homeVerModels);
                    }
                    if (position==2){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                        homeVerModels.add(new HomeVerModel(R.drawable.fries1, "Fries small", "10:00 - 23:00", "4.9", "18$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.fries2, "Fries medium", "10:00 - 23:00", "2.9", "26$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.fries3, "Fries large", "10:00 - 23:00", "3.9", "35$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.fries4, "Fries extra large", "10:00 - 23:00", "3.9", "55$"));
                        updateVerticalRec.callBack(position, homeVerModels);
                    }
                    if (position==3){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                        homeVerModels.add(new HomeVerModel(R.drawable.icecream1, "Ice cream small", "10:00 - 23:00", "4.9", "18$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.icecream2, "Ice cream medium", "10:00 - 23:00", "2.9", "26$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.icecream3, "Ice cream large", "10:00 - 23:00", "3.9", "35$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.icecream4, "Ice cream extra large", "10:00 - 23:00", "3.9", "55$"));
                        updateVerticalRec.callBack(position, homeVerModels);
                    }
                    if (position==4){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                        homeVerModels.add(new HomeVerModel(R.drawable.sandwich1, "Sandwich small", "10:00 - 23:00", "4.9", "18$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.sandwich2, "Sandwich medium", "10:00 - 23:00", "2.9", "26$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.sandwich3, "Sandwich large", "10:00 - 23:00", "3.9", "35$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.sandwich4, "Sandwich extra large", "10:00 - 23:00", "3.9", "55$"));
                        updateVerticalRec.callBack(position, homeVerModels);
                    }
                }
            });

            if (select){
                if (position==0){
                    holder.cardView.setBackgroundResource(R.drawable.change_bg);
                    select=false;
                }
            }
            else {
                if (row_index == position){
                    holder.cardView.setBackgroundResource(R.drawable.change_bg);
                }
                else {
                    holder.cardView.setBackgroundResource(R.drawable.default_bg);
                }
            }
        }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        CardView cardView;
        public ViewHolder(@NonNull View itemView){
            super(itemView);
            imageView = itemView.findViewById(R.id.hor_img);
            textView = itemView.findViewById(R.id.hor_text);
            cardView = itemView.findViewById(R.id.CardView);
        }
    }

}
