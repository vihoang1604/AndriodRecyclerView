package com.example.recycerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        recyclerview=findViewById( R.id.recyclerview );
        recyclerview.setLayoutManager( new LinearLayoutManager( this ) );
        final UserAdapter userAdapter=new UserAdapter();

        recyclerview.setAdapter( userAdapter );
        final User User1= new User("Nam",9);
        User User2= new User("Hoa",7);
        User User3= new User("Lan",7);

        final List<User> users = new ArrayList<User>();
        users.add(User1);
        users.add(User2);
        users.add(User3);
        userAdapter.users=users;
         findViewById(R.id.add).setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 users.add(new User("Mai",9));
                 userAdapter.notifyDataSetChanged();
             }
         });
         findViewById(R.id.update).setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 users.get(0).name="Mai";
                 userAdapter.notifyDataSetChanged();
             }
         });
    }
}
