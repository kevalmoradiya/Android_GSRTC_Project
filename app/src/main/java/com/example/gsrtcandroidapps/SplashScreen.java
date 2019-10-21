package com.example.gsrtcandroidapps;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class SplashScreen extends Activity {
	private static int SPLASH_TIME_OUT = 1000;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash_screen);
		

		// Check if Internet present
		
		new Handler().postDelayed(new Runnable() {
			 
            @Override
            public void run() {
                Intent i = new Intent(SplashScreen.this, Addip.class);
                startActivity(i);
 
                finish();
            }
        }, SPLASH_TIME_OUT);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.splash_screen, menu);
		return true;
	}

}
