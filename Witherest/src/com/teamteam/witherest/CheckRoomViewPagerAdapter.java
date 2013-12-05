package com.teamteam.witherest;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.ListFragment;
import android.util.Log;

import com.teamteam.witherest.service.callback.object.CategoryRoomListResponseObject;
import com.viewpagerindicator.IconPagerAdapter;


public class CheckRoomViewPagerAdapter extends FragmentPagerAdapter implements IconPagerAdapter {
	
	public String[] mTistTitles;
	
	private int mCount = 2;
	private Activity mActivity;
	
	public FragmentCheckRoomList[] mFragments = new FragmentCheckRoomList[2];

	protected static final int[] ICONS = new int[] {
        R.drawable.perm_group_calendar,
        R.drawable.perm_group_camera,
        R.drawable.perm_group_device_alarms,
        R.drawable.perm_group_location};
	
	public CheckRoomViewPagerAdapter (FragmentManager fm,FragmentCheckRoomList[] fragments) {
	        super(fm);
	        this.mFragments = fragments;
	        
	        this.mTistTitles = new String[fragments.length];
	        for (int i = 0; i < mTistTitles.length; i++){
	        	this.mTistTitles[i] = this.mFragments[i].getArguments().getString("title");
	        }
	    }

	public int getIconResId(int position) {
		  return ICONS[position];
	}

	@Override
	public Fragment getItem(int position) {
		  return mFragments[position];
	
	}
	
	@Override
    public CharSequence getPageTitle(int position) {
      return mTistTitles[position];
    }

	@Override
	public int getCount() {
		return this.mFragments.length;
	}
	
	 public void setCount(int count) {
	        if (count > 0 && count <= 10) {
	            mCount = count;
	            notifyDataSetChanged();
	        }
	    }
}
