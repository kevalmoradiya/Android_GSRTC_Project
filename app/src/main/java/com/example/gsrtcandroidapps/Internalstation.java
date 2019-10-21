package com.example.gsrtcandroidapps;


import android.os.AsyncTask;
import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.GridLayout.LayoutParams;


@SuppressLint("InlinedApi")
public class Internalstation extends Activity {
	String[] arg,ans;
	ProgressBar p;
	String display,pass;
	LinearLayout[] lLayout;
	TextView msg,station;
	TextView[] t1;
	LinearLayout topl;
	Bundle bundel;

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_internalstation);
		
		p=(ProgressBar)findViewById(R.id.progressBar1);
		msg=(TextView)findViewById(R.id.textView1);
		station=(TextView)findViewById(R.id.textView2);
		
		topl= (LinearLayout)findViewById(R.id.detailhead);
		arg = getIntent().getExtras().getStringArray("keyt");
	     pass=arg[0].toString()+"@"+arg[1].toString()+"@"+arg[2].toString();
	   //  Toast.makeText(getApplicationContext(),arg[0]+arg[1]+""+arg[2],Toast.LENGTH_SHORT).show();
	     Log.i("tripcode", arg[2].toString());
			
	     AsyncCallWS task1 = new AsyncCallWS();
         //Call execute 
	     new AsyncCallWS().execute();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.internalstation, menu);
		return true;
	}
	
	@Override
	public void onBackPressed()
	{
		bundel=new Bundle();
		bundel.putStringArray("key",arg);
		try
		{
			Intent is = new Intent(Internalstation.this,Search_Bus_Details.class);
			is.putExtras(bundel);
			is.putExtra("EXITFI",true);
			startActivity(is);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	    this.finish();  
	}
	@SuppressWarnings("deprecation")
	@SuppressLint("InlinedApi")
	public void linear(int no)
	{
		LinearLayout parentLayout = (LinearLayout)findViewById(R.id.detail);
		
        lLayout = new LinearLayout[no];
       
        
		LinearLayout.LayoutParams myLayoutParams = new LinearLayout.LayoutParams(
                LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT);
      
        myLayoutParams.setMargins(20, 20, 20, 20);
        myLayoutParams.height = 70;
        myLayoutParams.gravity=Gravity.CENTER_HORIZONTAL;
        
        
		LinearLayout.LayoutParams params1  = new LinearLayout.LayoutParams(
        		LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        params1.gravity=Gravity.CENTER;
       
       
        
        
       
        
        t1=new TextView[no];
       
        for(int i = 0; i < lLayout.length; i++) {
            lLayout[i] = new LinearLayout(this);
            lLayout[i].setBackgroundColor(Color.parseColor("#333333"));
            
            t1[i]=new TextView(this);
            
            lLayout[i].setId(i);
            t1[i].setId(i);
            t1[i].setText("Surya");
            t1[i].setTextColor(Color.parseColor("#ffffff"));
        
            lLayout[i].setOrientation(LinearLayout.VERTICAL);
         

            lLayout[i].setLayoutParams(myLayoutParams);
            t1[i].setLayoutParams(params1);
            parentLayout.addView(lLayout[i]);
            
            
            lLayout[i].addView(t1[i]);
        }
       
	}
	private class AsyncCallWS extends AsyncTask<String, Void, Void> {

		@Override
		protected Void doInBackground(String... params) {
			ans = Background.Internalstation(pass,"ListOfInternalStation");
			
			return null;
		}

		@Override
		protected void onPostExecute(Void result) {
	
		int oo=0;
			if(ans[0].toString().equals("Error"))
			{	
				msg.setVisibility(View.VISIBLE);
			msg.setText("No internal station for this route.");
			}
			else if(oo==Integer.parseInt(ans[0].toString()))
			{
				msg.setVisibility(View.VISIBLE);
				msg.setText("No internal station for this route.");
			}
			else
			{
				oo=Integer.parseInt(ans[0].toString());
				linear(oo);
			
				topl.setVisibility(View.VISIBLE);
				station.setText(arg[0].toString()+" To "+arg[1].toString());
				for(int i=0;i<oo;i++)
				{
				t1[i].setText(ans[i+1].toString());
				}
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
