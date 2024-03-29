package com.example.tictactoe;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

public class Circle extends Cell{
	
	public Circle(int x,int y){
		
		super(x, y);
	}
	
	public void draw(Canvas g,Resources res,int x,int y,int w,int h){
		
		Bitmap im=BitmapFactory.decodeResource(res, R.drawable.circle);
		
		g.drawBitmap(im, null,new Rect(x*w,y*h, (x*w)+w, (y*h)+h),new Paint());
		
		
	}
	
	public boolean equals(Object obj){
		
		if (obj instanceof Circle) {
			
			return true;
			
		} else {
			
			return false;

		}
		
	}
	
	public String tosString(){
		return "O";
	}

}
