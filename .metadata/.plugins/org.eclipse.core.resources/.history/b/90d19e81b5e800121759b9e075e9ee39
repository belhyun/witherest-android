package com.teamteam.customComponent;

import com.teamteam.witherest.MainActivity;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

public class EventFrameLayout extends FrameLayout {

	public EventFrameLayout(Context context, AttributeSet attrs,
			int defStyle) {
		super(context, attrs, defStyle);
	}

	public EventFrameLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public EventFrameLayout(Context context) {
		super(context);
	}

	@Override
	public boolean dispatchTouchEvent(MotionEvent e) {
		if (e.getAction() == MotionEvent.ACTION_DOWN ){
			((MainActivity)getContext()).hideBottom();
		}else if (e.getAction() == MotionEvent.ACTION_UP){
			((MainActivity)getContext()).showBottom();
		}else if (e.getAction() == MotionEvent.ACTION_MOVE){
		}

		return super.dispatchTouchEvent(e);
	}

	

/*	@Override
	public boolean onInterceptTouchEvent(MotionEvent e) {
		if (e.getAction() == MotionEvent.ACTION_DOWN ){
			((MainActivity)getContext()).hideBottom();
			return true;
		}else if (e.getAction() == MotionEvent.ACTION_UP){
			((MainActivity)getContext()).showBottom();
			return true;
		}else if (e.getAction() == MotionEvent.ACTION_MOVE){
			return true;
		}
		return super.onInterceptTouchEvent(e);
	}
	*/

	
	
}
