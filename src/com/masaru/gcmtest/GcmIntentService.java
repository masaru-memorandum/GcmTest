package com.masaru.gcmtest;

import android.app.IntentService;
import android.content.Intent;

public class GcmIntentService extends IntentService {

	private static final String sTag = "GcmIntentService";
	
	public GcmIntentService() {
		super(sTag);
	}

	@Override
	protected void onHandleIntent(Intent intent) {
		
	}

}
