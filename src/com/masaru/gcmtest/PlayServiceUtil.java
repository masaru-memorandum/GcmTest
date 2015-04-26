package com.masaru.gcmtest;

import android.app.Activity;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.gcm.GoogleCloudMessaging;

public class PlayServiceUtil {
	public static boolean isGooglePlayServiceAvailable(Activity activity) {
		int resultCode = GooglePlayServicesUtil
				.isGooglePlayServicesAvailable(activity);
		if (resultCode != ConnectionResult.SUCCESS) {
			if (GooglePlayServicesUtil.isUserRecoverableError(resultCode)) {
				GooglePlayServicesUtil.getErrorDialog(resultCode, activity, 0)
						.show();
			} else {
				activity.finish();
			}
			return false;
		}
		return true;
	}
	
	public static void initializeGcm(Activity activity){
		GoogleCloudMessaging gcm = GoogleCloudMessaging.getInstance(activity);
		
	}
}
