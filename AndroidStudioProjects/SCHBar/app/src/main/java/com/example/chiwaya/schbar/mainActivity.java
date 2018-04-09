package com.example.chiwaya.schbar;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView.Adapter;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerAdapter_LifecycleAdapter;
import com.google.firebase.*;
import com.google.firebase.database.DatabaseReference;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class mainActivity extends AppCompatActivity {

    private RecyclerView mainList;
    private DatabaseReference localDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         mainList = findViewById(R.id.mainRecyclerList);
         mainList.setHasFixedSize(true );
         mainList.setLayoutManager( new LinearLayoutManager(this));
    }

    @Override
    protected void onStart(){
        super.onStart();

        FirebaseRecyclerAdapter <PostItem, MainViewHolder> fireRecycler =
                new FirebaseRecyclerAdapter<PostItem, MainViewHolder>
                        (){

                    @Override
                    protected void onBindViewHolder(@NonNull MainViewHolder holder, int position, @NonNull PostItem model) {

                    }

                    @Override
                    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                        return null;
                    }
                };
        //mainList.
    }

    public class  MainViewHolder extends RecyclerView.ViewHolder {
        public MainViewHolder(View itemView) {
            super(itemView);
            View view = itemView;
        }

        public void setTitle(String title) {
            TextView post_title = findViewById(R.id.post_descript);
            post_title.setText(title);
        }

        public void setDesc(String desc) {
            TextView post_note = findViewById(R.id.post_notes);
            post_note.setText(desc);
        }
    }
}
