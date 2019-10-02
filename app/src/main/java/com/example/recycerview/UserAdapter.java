package com.example.recycerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {
   List<User> users;

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view= LayoutInflater.from( parent.getContext() ).inflate( R.layout.item_user,parent,false );

        return new UserViewHolder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
       holder.txtName.setText(users.get(position).name);
        holder.txtScore.setText( ""+users.get(position).score );
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    class UserViewHolder extends RecyclerView.ViewHolder{
        TextView txtName;
        TextView txtScore;
        public UserViewHolder(@NonNull View itemView) {
            super( itemView );
            txtName=itemView.findViewById(R.id.test_name);
            txtScore=itemView.findViewById(R.id.test_score);
        }
    }

}
