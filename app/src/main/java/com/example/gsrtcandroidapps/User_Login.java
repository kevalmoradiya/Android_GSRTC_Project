package com.example.gsrtcandroidapps;


import android.os.AsyncTask;
import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;
import android.view.View.OnClickListener;
import android.view.ViewDebug.FlagToString;

public class User_Login extends Activity {

	Button bt,ct,bh,lo;
	String l;
	SharedPreferences preferences,sharedpreferences; 
	public static final String MyPREFERENCES = "MyPrefs" ;
	   public static final String Username = "nameKey"; 
	   public static final String Name = "nameKey";
	   
	ProgressBar p;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_user_login);
		bt=(Button)findViewById(R.id.button1);
		ct=(Button)findViewById(R.id.button2);
		bh=(Button)findViewById(R.id.button3);
		lo=(Button)findViewById(R.id.button4);
		p=(ProgressBar)findViewById(R.id.progressBar1);
		sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
		
		
		
		bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent iul2 = new Intent(User_Login.this,Search_Bus_Activitylo.class);
				startActivity(iul2);
			}
		});
	
		
	ct.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent iul3 = new Intent(User_Login.this,User_Cancel_Ticket.class);
				startActivity(iul3);
			}
		});
		
		bh.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent iul4 = new Intent(User_Login.this,User_Book_History.class);
				startActivity(iul4);
			}
		});
		
		lo.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				AsyncCallWS task = new AsyncCallWS();
		         //Call execute 
				new AsyncCallWS().execute();
				
			}
		});
		}
		
		
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.user__login, menu);
		return true;
	}
	@Override
	public void onBackPressed()
	{
		
		
	    
	}
	private class AsyncCallWS extends AsyncTask<String, Void, Void> {

		@Override
		protected Void doInBackground(String... params) {
			l= Background.invokeHelloWorldp(sharedpreferences.getString(Username, ""),"InvalidateUserTokenA");
			preferences = getSharedPreferences("MyPrefs", 0);
			SharedPreferences.Editor editor = preferences.edit();
			editor.clear(); 
			editor.commit();
			
			
			return null;
		}

		@SuppressLint("InlinedApi")
		@Override
		protected void onPostExecute(Void result) {
		//	Toast.makeText(getApplicationContext(),l.toString(),Toast.LENGTH_SHORT).show();
			
			p.setVisibility(View.GONE);
			 Intent isb1 = new Intent(User_Login.this,MainActivity.class);
            isb1.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(isb1);
				
				finish();
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
