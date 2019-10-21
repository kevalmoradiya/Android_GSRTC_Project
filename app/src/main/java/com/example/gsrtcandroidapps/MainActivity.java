package com.example.gsrtcandroidapps;


import android.os.Bundle;
import android.app.Activity;

import android.content.Intent;



import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {	
	Button b1;
	TextView t1;
	ConnectionDetector cd;
	AlertDialogManager alert = new AlertDialogManager();
	
	
	
		@Override
	    protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		cd = new ConnectionDetector(getApplicationContext());
		
	
		
		 if (getIntent().getBooleanExtra("EXIT", false)) {
		     	
			finish();
		    }
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
	
		return true;
		
	}
	@Override
	public void onBackPressed()
	{
	    finish();  
	}

	public void bussearch(View v)
    {
		Intent i1 = new Intent(MainActivity.this,Search_Bus_Activity.class);
		startActivity(i1);  
	} 

	
	public void bookticket(View v)
    {
		Intent i2 = new Intent(MainActivity.this,Book_Ticket.class);
		startActivity(i2);
    }
	public void busstatus(View v)
    {
		Intent i3 = new Intent(MainActivity.this,Bus_Status.class);
		startActivity(i3);
    }
	public void aboutus(View v)
    {
		Intent i4 = new Intent(MainActivity.this,About_Us.class);
		startActivity(i4);
    }
	
	
	
}


