package com.omninos.giftdemo;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Context context;
   // Glide GlideApp;
    Button showGif,showflowers,showpresents;
    ImageView imageView;
    RecyclerView recyclerView;
    MyAdapter adapter;
    List<GifUrls> list=new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView=findViewById(R.id.imageView);
        showGif=findViewById(R.id.showGif);
        recyclerView=findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));

        showflowers=findViewById(R.id.showflowers);
        showpresents=findViewById(R.id.showpresents);

        showGif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerView.setVisibility(View.VISIBLE);
                if (list!=null){
                    list.clear();
                }
                GifUrls gifUrls=new GifUrls("https://media.giphy.com/media/DYRbu4jIZXHFK/giphy.gif");
                list.add(gifUrls);

                gifUrls=new GifUrls("https://media.giphy.com/media/3dZL1Z4vQMoy4/giphy.gif");
                list.add(gifUrls);

                gifUrls=new GifUrls("https://media.giphy.com/media/8plT87cI4F2gw/giphy.gif");
                list.add(gifUrls);

                gifUrls=new GifUrls("https://media.giphy.com/media/duzpaTbCUy9Vu/giphy.gif");
                list.add(gifUrls);

                gifUrls=new GifUrls("https://media.giphy.com/media/O5ibw2aqNIfAs/giphy.gif");
                list.add(gifUrls);

                gifUrls=new GifUrls("https://media.giphy.com/media/VJs45VWL5UwMM/giphy.gif");
                list.add(gifUrls);

                gifUrls=new GifUrls("https://media.giphy.com/media/13ZVR7s6rymAso/giphy.gif");
                list.add(gifUrls);

                gifUrls=new GifUrls("https://media.giphy.com/media/3fVPnDHFumFW0/giphy.gif");
                list.add(gifUrls);

                gifUrls=new GifUrls("https://media.giphy.com/media/Pm45yRYElIcyA/giphy.gif");
                list.add(gifUrls);

                gifUrls=new GifUrls("https://media.giphy.com/media/3dZL1Z4vQMoy4/giphy.gif");
                list.add(gifUrls);

                adapter=new MyAdapter(MainActivity.this, list, new MyAdapter.myClick() {
                    @Override
                    public void MyOnClick(int position) {
                        Glide.with(MainActivity.this).load(list.get(position).gifurl).into(imageView);
                    }
                });
                recyclerView.setAdapter(adapter);
            }
        });

        showflowers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerView.setVisibility(View.VISIBLE);
                if (list!=null){
                    list.clear();
                }
                GifUrls gifUrls=new GifUrls("https://media.giphy.com/media/DBbZ0INFQy2DORdxQ0/giphy.gif");
                list.add(gifUrls);

                gifUrls=new GifUrls("https://media.giphy.com/media/xrnJuvXxcRBde/giphy.gif");
                list.add(gifUrls);

                gifUrls=new GifUrls("https://media.giphy.com/media/l1J9ENIvLta3Cev84/giphy.gif");
                list.add(gifUrls);

                gifUrls=new GifUrls("https://media.giphy.com/media/nbCTLBWCWndja/giphy.gif");
                list.add(gifUrls);

                gifUrls=new GifUrls("https://media.giphy.com/media/LULqtZK0Hrpw4/giphy.gif");
                list.add(gifUrls);

                gifUrls=new GifUrls("https://media.giphy.com/media/3ohhwEVsNSZpQw2CxW/giphy.gif");
                list.add(gifUrls);

                gifUrls=new GifUrls("https://media.giphy.com/media/MhduMtdqqDA2c/giphy.gif");
                list.add(gifUrls);

                gifUrls=new GifUrls("https://media.giphy.com/media/3ohhwImMnxCkbWq26k/giphy.gif");
                list.add(gifUrls);

                gifUrls=new GifUrls("https://media.giphy.com/media/l1J9MChCCK2scszYc/giphy.gif");
                list.add(gifUrls);

                gifUrls=new GifUrls("https://media.giphy.com/media/3ohhwNqyraVimPM4Ba/giphy.gif");
                list.add(gifUrls);

                adapter=new MyAdapter(MainActivity.this, list, new MyAdapter.myClick() {
                    @Override
                    public void MyOnClick(int position) {
                        Glide.with(MainActivity.this).load(list.get(position).gifurl).into(imageView);
                    }
                });
                recyclerView.setAdapter(adapter);
            }
        });

        showpresents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                recyclerView.setVisibility(View.VISIBLE);
                if (list!=null){
                    list.clear();
                }
                GifUrls gifUrls=new GifUrls("https://media.giphy.com/media/XceesPsii1uWA/giphy.gif");
                list.add(gifUrls);

                gifUrls=new GifUrls("https://media.giphy.com/media/fikiml0dKfRQ2ZS08E/giphy.gif");
                list.add(gifUrls);

                gifUrls=new GifUrls("https://media.giphy.com/media/aOGkt2JiOVuOk/giphy.gif");
                list.add(gifUrls);

                gifUrls=new GifUrls("https://media.giphy.com/media/mBzasqUrgFsblhIOtc/giphy.gif");
                list.add(gifUrls);

                gifUrls=new GifUrls("https://media.giphy.com/media/YUIccOGHzOIhtASy9z/giphy.gif");
                list.add(gifUrls);

                gifUrls=new GifUrls("https://media.giphy.com/media/5bkwinxJCfRtgCNkJY/giphy.gif");
                list.add(gifUrls);

                gifUrls=new GifUrls("https://media.giphy.com/media/l2QDMzntLKB6HN7Ow/giphy.gif");
                list.add(gifUrls);

                gifUrls=new GifUrls("https://media.giphy.com/media/l2JhLD0OfBiOdgNBS/giphy.gif");
                list.add(gifUrls);

                gifUrls=new GifUrls("https://media.giphy.com/media/3o6wrEYlie3QarN0zu/giphy.gif");
                list.add(gifUrls);

                gifUrls=new GifUrls("https://media.giphy.com/media/61UyExcIrkak67pfNE/giphy.gif");
                list.add(gifUrls);

                adapter=new MyAdapter(MainActivity.this, list, new MyAdapter.myClick() {
                    @Override
                    public void MyOnClick(int position) {
                        Glide.with(MainActivity.this).load(list.get(position).gifurl).into(imageView);
                    }
                });
                recyclerView.setAdapter(adapter);
            }
        });
       // Glide.with(this).load("https://media.giphy.com/media/8plT87cI4F2gw/giphy.gif").into(imageView);
    }
}
