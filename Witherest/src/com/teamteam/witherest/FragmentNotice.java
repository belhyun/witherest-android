package com.teamteam.witherest;



import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;
import android.widget.Toast;

public class FragmentNotice extends Fragment implements OnCheckedChangeListener {
	private Activity mActivity;
	private RadioGroup mSegmentRadioGroup;
	private ListView mWitherestNewsList;
	private ListView mCategoryNewsList;
	private ListView mRoomNewsList;

	/* Fragment Life Cycle */
	
	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		Log.v("노티스 프래그먼트", "onAttach 호출됨");
		this.mActivity = activity;
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.v("노티스 프래그먼트", "onCreate() 호출됨");
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		super.onCreateView(inflater, container, savedInstanceState);
		Log.v("노티스 프래그먼트", "onCreateView() 호출됨");
		View view= inflater.inflate(R.layout.fragment_notice, null);
		
		/*segmentRadioGroup = (RadioGroup)view.findViewById(R.id.segment_radio_group);
		segmentRadioGroup.setOnCheckedChangeListener(this);
		witherestNewsList = (ListView)view.findViewById(R.id.witherest_news_list);
		categoryNewsList = (ListView)view.findViewById(R.id.categoty_news_list);
		roomNewsList = (ListView)view.findViewById(R.id.room_news_list);
		
		witherestNewsList.setAdapter(new  FragmentWitherestNoticeAdapter(getActivity(), R.layout.fragment_notice_list_row));
		categoryNewsList.setAdapter(new  FragmentCategoryNewsAdapter(getActivity(), R.layout.fragment_notice_list_row));
		roomNewsList.setAdapter(new  FragmentRoomNewsAdapter(getActivity(), R.layout.fragment_notice_list_row));*/
		return view;
	}
	
	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
		/*segmentRadioGroup.check(R.id.notice_radio_btn);*/
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
	/*	mainContentToggle(R.id.notice_radio_btn);	*/
	}

	
	@Override
	public void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
	}


	@Override
	public void onPause() {
		// TODO Auto-generated method stub
		super.onResume();
	}
	
	
	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}

	@Override
	public void onDestroyView() {
		// TODO Auto-generated method stub
		super.onDestroyView();
	}

	@Override
	public void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
	}

	@Override
	public void onDetach() {
		// TODO Auto-generated method stub
		super.onDetach();
	}

	
	public void onCheckedChanged(RadioGroup group, int checkedId) {
		if (group == mSegmentRadioGroup) {
			mainContentToggle(checkedId);
		}	
	}

	private void mainContentToggle(int id) {
		mWitherestNewsList.setVisibility(View.INVISIBLE);
		mCategoryNewsList.setVisibility(View.INVISIBLE);
		mRoomNewsList.setVisibility(View.INVISIBLE);
		
		if (id == R.id.notice_radio_btn){
			mWitherestNewsList.setVisibility(View.VISIBLE);
		}
		if (id == R.id.categoty_radio_btn){
			mCategoryNewsList.setVisibility(View.VISIBLE);
		}
		if (id == R.id.room_radio_btn){
			mRoomNewsList.setVisibility(View.VISIBLE);
		}
		
	}
	public class FragmentWitherestNoticeAdapter extends BaseAdapter{
			Context  context ; 
			int resId ;
			LayoutInflater inflate;
			public  FragmentWitherestNoticeAdapter (Activity act, int layoutRes){
				this.context = act;
				this.resId = layoutRes;
				inflate = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			}
			public int getCount() {
				return 20;
			}

			public Object getItem(int position) {
				return position;
			}

			public long getItemId(int position) {
				return position;
			}

			public View getView(int position, View convertView, ViewGroup parent) {
				if (convertView == null){
					convertView = inflate.inflate(resId,parent, false);
				}
				return convertView;		
			}
	}
	

	
	public class FragmentCategoryNewsAdapter extends BaseAdapter{
		Context  context ; 
		int resId ;
		LayoutInflater inflate;
		public  FragmentCategoryNewsAdapter(Activity act, int layoutRes){
			this.context = act;
			this.resId = layoutRes;
			inflate = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		}
		public int getCount() {
			return 20;
		}

		public Object getItem(int position) {
			return position;
		}

		public long getItemId(int position) {
			return position;
		}

		public View getView(int position, View convertView, ViewGroup parent) {
			if (convertView == null){
				convertView = inflate.inflate(resId,parent, false);
			}
			return convertView;		
		}
	}
	
	public class FragmentRoomNewsAdapter extends BaseAdapter{
		Context  context ; 
		int resId ;
		LayoutInflater inflate;
		public  FragmentRoomNewsAdapter(Activity act, int layoutRes){
			this.context = act;
			this.resId = layoutRes;
			inflate = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		}
		public int getCount() {
			return 20;
		}

		public Object getItem(int position) {
			return position;
		}

		public long getItemId(int position) {
			return position;
		}

		public View getView(int position, View convertView, ViewGroup parent) {
			if (convertView == null){
				convertView = inflate.inflate(resId,parent, false);
			}
			return convertView;	
		}
	}


	
}