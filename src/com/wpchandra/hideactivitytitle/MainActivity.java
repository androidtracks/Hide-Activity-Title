package com.wpchandra.hideactivitytitle;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		 //---hides the activity title bar---
        requestWindowFeature(Window.FEATURE_NO_TITLE);

		setContentView(R.layout.activity_main);
	}
}
