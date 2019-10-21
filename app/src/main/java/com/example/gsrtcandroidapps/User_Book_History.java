package com.example.gsrtcandroidapps;

import android.os.AsyncTask;
import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.ActionBar.LayoutParams;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;

import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

public class User_Book_History extends Activity {

	SharedPreferences sharedpreferences;
	public static final String MyPREFERENCES = "MyPrefs" ;
	public static final String Username = "use"; 
	public static final String Name = "tok";
	LinearLayout[] lLayout;
	TextView[] tripname,DOJ,fair,totseat;
	LinearLayout top;
	TextView msg;
	String[] ans,tarr;
	ProgressBar p;
	
	
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_user_book_history);
		if (android.os.Build.VERSION.SDK_INT >= 11)
		    getActionBar().setDisplayHomeAsUpEnabled(true);
		sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
		top=(LinearLayout)findViewById(R.id.canceltop);
		p=(ProgressBar)findViewById(R.id.progressBar3);
		String s;
		 new AsyncCallWS().execute();
	    
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

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.user__book__history, menu);
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
        
        tripname=new TextView[no];
        DOJ=new TextView[no];
        fair=new TextView[no];
        totseat=new TextView[no];
        
        for(int i = 0; i < lLayout.length; i++) {
            lLayout[i] = new LinearLayout(this);
            tripname[i]=new TextView(this);
            DOJ[i]=new TextView(this);
            totseat[i]=new TextView(this);
            fair[i]=new TextView(this);
            
            lLayout[i].setId(i);
            tripname[i].setId(j);
            j++;
            tripname[i].setTextColor(Color.parseColor("#4617b4"));
            DOJ[i].setId(j);
           
            j++;
            DOJ[i].setTextColor(Color.parseColor("#4617b4"));
            totseat[i].setId(j);
           
            totseat[i].setTextColor(Color.parseColor("#4617b4"));
            j++;
            fair[i].setId(j);
            j++;
            fair[i].setTextColor(Color.parseColor("#4617b4"));
            
         lLayout[i].setOrientation(LinearLayout.VERTICAL);
            
          if(i%2 == 0) {
                lLayout[i].setBackgroundColor(Color.parseColor("#bcbcbc"));
            } else {
                lLayout[i].setBackgroundColor(Color.parseColor("#e4e4e4"));
            }

            lLayout[i].setLayoutParams(myLayoutParams);
            tripname[i].setLayoutParams(params1);
            DOJ[i].setLayoutParams(params1);
            totseat[i].setLayoutParams(params1);
            fair[i].setLayoutParams(params1);
           
            parentLayout.addView(lLayout[i]);
            
            lLayout[i].addView(tripname[i]);
            lLayout[i].addView(DOJ[i]);
            lLayout[i].addView(totseat[i]);
            lLayout[i].addView(fair[i]);
           
        }
     }
	
	
	private class AsyncCallWS extends AsyncTask<String, Void, Void> {

		@Override
		protected Void doInBackground(String... params) {
			ans = Background.userhistorya(sharedpreferences.getString(Username, ""),"UserHistory");
			
			return null;
		}

		@Override
		protected void onPostExecute(Void result) {
	int oo=0;
			if(ans[0].toString().equals("Error"))
			{	
			msg.setVisibility(View.VISIBLE);
			msg.setText("No bus history.");
			}
			else if(oo==Integer.parseInt(ans[0].toString()))
			{
				msg.setVisibility(View.VISIBLE);
				msg.setText("No bus history.");
			}
			else
			{
				oo=Integer.parseInt(ans[0].toString());
				linear(oo);
				int j=0;
				
				for(int i=1;i<oo*4;i++)
			{
					tripname[j].setText("Trip Name      : "+ans[i]);
				     DOJ[j].setText("Journey Date : "+ans[i+1]);
				 totseat[j].setText("Total Seat       : "+ans[i+2]);
				    fair[j].setText("Toatal Fair      : "+ans[i+3]);
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
}
