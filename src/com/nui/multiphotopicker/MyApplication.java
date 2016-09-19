package com.nui.multiphotopicker;

import android.app.Application;
import android.content.SharedPreferences;

import com.nui.multiphotopicker.util.CustomConstants;

public class MyApplication extends Application
{

	@Override
	public void onCreate(){
		removeTempFromPref();
	}
	
	private void removeTempFromPref()
	{
		SharedPreferences sp = getSharedPreferences(
				CustomConstants.APPLICATION_NAME, MODE_PRIVATE);
		sp.edit().remove(CustomConstants.PREF_TEMP_IMAGES).commit();
	}
}
