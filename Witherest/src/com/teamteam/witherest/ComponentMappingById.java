package com.teamteam.witherest;

import java.lang.reflect.Field;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class ComponentMappingById extends Activity {
	private static void mappingViews(Object object) {
		if(!(object instanceof Activity))
			return;
		
		Activity activity = (Activity) object;
		Field[] fields = activity.getClass().getDeclaredFields();
		for(Field field : fields) {
			ComponentMapping mappingView = field.getAnnotation(ComponentMapping.class);
			if(mappingView == null)
				continue;
			
			int identifier = mappingView.id();
			if(identifier == 0) {
				String identifierString = field.getName();
				identifier = activity.getResources().getIdentifier(identifierString, "id", activity.getPackageName());
			}
			
			if(identifier == 0)
				continue;
			
			View view = activity.findViewById(identifier);
			if(view == null)
				continue;
			
			if(view.getClass() == field.getType()) {
				try {
					field.setAccessible(true);
					field.set(object, view);
				} catch(IllegalArgumentException e) {
					e.printStackTrace();
				} catch(IllegalAccessException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		mappingViews(this);
		super.onCreate(savedInstanceState);
	}
}