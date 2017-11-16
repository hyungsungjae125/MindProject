package com.example.sungjae.mind;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends Activity {
    Button button;
    //regerences to our images
    private Integer[] mThumbIds = {
            R.drawable.choices, R.drawable.color,
            R.drawable.draw,R.drawable.illu
    };

    DisplayMetrics metrics;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.buttonmain);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this, OpticalActivity.class);
                startActivity(intent1);
            }
        });

        GridView gridview=(GridView)findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this));
        gridview.setOnItemClickListener(gridviewOnItemClickLinstener);

        metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        setTitle("메인메뉴");
    }
     private GridView.OnItemClickListener gridviewOnItemClickLinstener=
             new GridView.OnItemClickListener(){
                 public  void onItemClick(AdapterView<?> arg0,View arg1,int arg2,long arg3){
                     Toast.makeText(MainActivity.this,arg0.getAdapter().getItem(arg2).toString(),Toast.LENGTH_LONG).show();
                 }
             };

    public class ImageAdapter extends BaseAdapter{
        private Context mContext;
        LayoutInflater inflater;

        public ImageAdapter(Context c){
            mContext =c;
        }

        public int getCount(){
            return mThumbIds.length;
        }

        public Object getItem(int position){
            return mThumbIds[position];
        }

        public long getItemId(int position){
            return position;
        }

        public  View getView(int position, View converView, ViewGroup parent){
            int rowWidth = ( metrics.widthPixels)/3;
            ImageView imageView;
            if(converView==null){
                imageView=new ImageView(mContext);
                imageView.setLayoutParams(new GridView.LayoutParams(rowWidth,rowWidth));
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                imageView.setPadding(1,1,1,1);

            }
            else{
                imageView=(ImageView)converView;
            }
            imageView.setImageResource(mThumbIds[position]);
            return imageView;
        }
    }









    public void optical(View v){
        int id = v.getId();
        LinearLayout layout = (LinearLayout)v.findViewById(id);
        String tag=(String)layout.getTag();

        Intent it = new Intent(this, OpticalActivity.class);
        startActivity(it);
    }
}
