package com.example.gsrtcandroidapps;

import android.os.AsyncTask;
import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;


public class Map2 extends Activity {

	String[] p,ans,arg;
	ProgressBar pr;
	Button bb1,bb2;
	TextView msg;
	Bundle bu1;
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map2);
		if (android.os.Build.VERSION.SDK_INT >= 11)
		    getActionBar().setDisplayHomeAsUpEnabled(true);
		pr=(ProgressBar)findViewById(R.id.progressBar1);
		msg=(TextView)findViewById(R.id.textView1);
		bb1=(Button)findViewById(R.id.button1);
		
		
		arg = getIntent().getExtras().getStringArray("tripcode");
		bb2=(Button)findViewById(R.id.button2);
		
		bb1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent isb1 = new Intent(Map2.this,MapWeb.class);
				startActivity(isb1);
				
			}
		});
bb2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				bu1=new Bundle();
				bu1.putStringArray("tripcode",arg);
				Intent isb1 = new Intent(Map2.this,BusStatusLive.class);
				isb1.putExtras(bu1);
				startActivity(isb1);
				
			}
		});
		
		p=getIntent().getExtras().getStringArray("tripcode");
		//AsyncCallWS task = new AsyncCallWS();
        //Call execute 
        //new AsyncCallWS().execute();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.map2, menu);
		return true;
	}
	
	private class AsyncCallWS extends AsyncTask<String, Void, Void> {

		@Override
		protected Void doInBackground(String... params) {
			
			ans = Background.mapactivity(p[0].toString(),"Bustripformap");
			Log.i("Resulr",ans[0].toString());
			return null;
		}

		@Override
		protected void onPostExecute(Void result) {

			if(ans[0].toString().equals("Error"))
			{	
				msg.setVisibility(View.VISIBLE);
			    msg.setText("Server Error.");
			}
			else if(ans[0].toString().equals("true"))
			{
				msg.setVisibility(View.VISIBLE);
				msg.setText("Success");
			}
			
			pr.setVisibility(View.GONE);
			
		}

		@Override
		protected void onPreExecute() {
			pr.setVisibility(View.VISIBLE);
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
