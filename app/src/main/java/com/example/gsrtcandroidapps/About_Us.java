package com.example.gsrtcandroidapps;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;



public class About_Us extends Activity{
	 
	

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about_us);
		if (android.os.Build.VERSION.SDK_INT >= 11)
		    getActionBar().setDisplayHomeAsUpEnabled(true); 
		
		
	}
	@Override
    public boolean onOptionsItemSelected(MenuItem menuItem)
    {       
        
        Intent intentau=new Intent(About_Us.this,MainActivity.class);
        intentau.putExtra("EXIT",true);
        startActivity(intentau);
        this.finish();
        return true;
    }

	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.about__us, menu);
		
	    return true;
	}
	

}
