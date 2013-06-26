package com.jinyk.glassharp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {
	
	private int position = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final int a[]={R.drawable.wine1, R.drawable.wine2, R.drawable.wine3, R.drawable.wine4, R.drawable.wine5,
        		R.drawable.wine6, R.drawable.wine7, R.drawable.wine8, R.drawable.wine9, R.drawable.wine10,
        		R.drawable.wine11};
        
        final ImageView imageView1 = (ImageView)findViewById(R.id.imageView1);
        Button button1 = (Button)findViewById(R.id.button1);
        Button button2 = (Button)findViewById(R.id.button2);
       
        
        button1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				imageView1.setImageResource(a[position++]);
			}
		});
        
        button2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				imageView1.setImageResource(a[position--]);				
			}
		});
    }
   
}
