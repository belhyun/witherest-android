package com.teamteam.customComponent;

import android.content.Context;
import android.graphics.PixelFormat;
import android.os.Looper;
import android.view.Gravity;
import android.view.WindowManager;
import android.widget.ProgressBar;

public class SimpleProgress extends Thread{
	private Context context;
	private ProgressBar progressBar;
	private WindowManager winManager;
	private Looper looper;
	
	public SimpleProgress(Context context){
		this.context = context;
		progressBar = new ProgressBar(this.context);
		winManager = (WindowManager)context.getSystemService(Context.WINDOW_SERVICE);
		setDaemon(true);
	}
	
	public void run(){
		Looper.prepare();
		showProgress();
		looper= Looper.myLooper();
		Looper.loop();
	}

	private void showProgress() {
		WindowManager.LayoutParams param = new WindowManager.LayoutParams();
		param.gravity = Gravity.CENTER | Gravity.CENTER;
		param.x = 0;
		param.y = -100;
		param.width = WindowManager.LayoutParams.WRAP_CONTENT;
		param.height = WindowManager.LayoutParams.WRAP_CONTENT;
		//백키등의 이벤트를 허용하려면 아래의 주석을 푼다.
		param.flags = WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN /*| WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE*/;
		param.format = PixelFormat.TRANSLUCENT;
		winManager.addView(this.progressBar, param);	
	}
	
	public void dismiss(){
		winManager.removeView(this.progressBar);
		try {
			Thread.sleep(200);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		looper.quit();
	}
	
	public boolean isShowing(){
		return progressBar.isShown();
	}
	
}
