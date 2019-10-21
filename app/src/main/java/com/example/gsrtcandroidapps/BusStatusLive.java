package com.example.gsrtcandroidapps;

import android.os.AsyncTask;
import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.ActionBar.LayoutParams;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;

import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class BusStatusLive extends Activity {

	SharedPreferences sharedpreferences;
	public static final String MyPREFERENCES = "MyPrefs" ;
	public static final String Username = "use"; 
	public static final String Name = "tok";
	LinearLayout[] lLayout;
	TextView[] station,scharvl,busstatus,actarvl;
	LinearLayout top;
	TextView msg;
	String[] ans,tarr,arg;
	ProgressBar p;
	
	
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bus_status_live);
		if (android.os.Build.VERSION.SDK_INT >= 11)
		    getActionBar().setDisplayHomeAsUpEnabled(true);
		top=(LinearLayout)findViewById(R.id.canceltop);
		sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
		msg=(TextView)findViewById(R.id.textView1);
		p=(ProgressBar)findViewById(R.id.progressBar3);
		arg = getIntent().getExtras().getStringArray("tripcode");
		
		Toast.makeText(getApplicationContext(), arg[0],Toast.LENGTH_SHORT).show();
		new AsyncCallWS().execute();
	    
	}
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.bus_status_live, menu);
		
		return true;
	}
	@Override
	public void onBackPressed()
	{
	    this.finish();  
	}

	
	@SuppressWarnings("deprecation")
	@SuppressLint("InlinedApi")
	public void linear(int no)
	{
		int j=0;
		
		LinearLayout parentLayout = (LinearLayout)findViewById(R.id.canceldata);
		
        lLayout = new LinearLayout[no];
        
        LinearLayout.LayoutParams myLayoutParams = new LinearLayout.LayoutParams(
                LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT);
      
        myLayoutParams.setMargins(10, 10, 10, 10);
        myLayoutParams.height = 150;
        
		LinearLayout.LayoutParams params1  = new LinearLayout.LayoutParams(
        		LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        
        params1.leftMargin=20;
        
        
        LinearLayout.LayoutParams params2  = new LinearLayout.LayoutParams(
        		LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        params2.topMargin=10;
        
        LinearLayout.LayoutParams params3 = new LinearLayout.LayoutParams(
        		LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        params3.topMargin=10;
        
        station=new TextView[no];
        scharvl=new TextView[no];
        busstatus=new TextView[no];
        actarvl=new TextView[no];
        
        for(int i = 0; i < lLayout.length; i++) {
            lLayout[i] = new LinearLayout(this);
            station[i]=new TextView(this);
            scharvl[i]=new TextView(this);
            actarvl[i]=new TextView(this);
            busstatus[i]=new TextView(this);
            
            lLayout[i].setId(i);
            station[i].setId(j);
            j++;
            station[i].setTextColor(Color.parseColor("#4617b4"));
            scharvl[i].setId(j);
           
            j++;
            scharvl[i].setTextColor(Color.parseColor("#4617b4"));
            actarvl[i].setId(j);
           
            actarvl[i].setTextColor(Color.parseColor("#4617b4"));
            j++;
            busstatus[i].setId(j);
            j++;
            busstatus[i].setTextColor(Color.parseColor("#4617b4"));
            
         lLayout[i].setOrientation(LinearLayout.VERTICAL);
            
          if(i%2 == 0) {
                lLayout[i].setBackgroundColor(Color.parseColor("#bcbcbc"));
            } else {
                lLayout[i].setBackgroundColor(Color.parseColor("#e4e4e4"));
            }

            lLayout[i].setLayoutParams(myLayoutParams);
            station[i].setLayoutParams(params1);
            scharvl[i].setLayoutParams(params1);
            actarvl[i].setLayoutParams(params1);
            busstatus[i].setLayoutParams(params1);
           
            parentLayout.addView(lLayout[i]);
            
            lLayout[i].addView(station[i]);
            lLayout[i].addView(scharvl[i]);
            lLayout[i].addView(actarvl[i]);
            lLayout[i].addView(busstatus[i]);
           
        }
     }
	
	
	private class AsyncCallWS extends AsyncTask<String, Void, Void> {

		@Override
		protected Void doInBackground(String... params) {
			ans = Background.userhistorya(arg[0].toString(),"AndroidRunningStatus");
			
			return null;
		}

		@Override
		protected void onPostExecute(Void result) {
	int oo=0;
			if(ans[0].toString().equals("Error"))
			{	
			msg.setVisibility(View.VISIBLE);
			msg.setText("NO DATA.");
			}
			else if(oo==Integer.parseInt(ans[0].toString()))
			{
				msg.setVisibility(View.VISIBLE);
				msg.setText("NO DATAAAAA.");
			}
			else if(ans[0].toString().equals("FALSE"))
			{
				msg.setVisibility(View.VISIBLE);
				msg.setText("NO DATA.");
			}
			else
			{
				oo=Integer.parseInt(ans[0].toString());
				linear(oo);
				int j=0;
				
				for(int i=1;i<oo*4;i++)
			{
					station[j].setText("Station                : " +ans[i]);
				    scharvl[j].setText("Sch. Arrival        : " +ans[i+1]);
				    actarvl[j].setText("Actual Arrival    : " +ans[i+2]);
				  busstatus[j].setText("Bus Status         : " +ans[i+3]);
				i=i+3;
				j++;
			}
			//	topl.setVisibility(View.VISIBLE);
			//	station.setText(arg[0].toString()+" To "+arg[1].toString());
			//	date1.setText(arg[2].toString());
			}
			p.setVisibility(View.GONE);
			
		}

		@Override
		protected void onPreExecute() {
			p.setVisibility(View.VISIBLE);
		}

		@Override
		protected void onProgressUpdate(Void... values) {
		}

	}
	@Override
	public boolean onOptionsItemSelected(MenuItem menuItem)
    {       
        
		switch (menuItem.getItemId()) {
        case android.R.id.home:
            NavUtils.navigateUpFromSameTask(this);
            return true;
        default:
            return super.onOptionsItemSelected(menuItem);
        }
    }
}
