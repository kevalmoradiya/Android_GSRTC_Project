package com.example.gsrtcandroidapps;


import android.os.AsyncTask;
import android.os.Bundle;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.GridLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Search_Bus_Details extends Activity {
String[] arg,ans;
String[] tripcodep=new String[3];
String[] tarr;
ProgressBar p;
String display,passcity;
LinearLayout[] lLayout;
TextView msg,station;
TextView[] t1,t2,t3,t4,t5,t6,t7;
LinearLayout topl,parentLayout;
Bundle bundel;

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_search_bus_details);
		if (android.os.Build.VERSION.SDK_INT >= 11)
		    getActionBar().setDisplayHomeAsUpEnabled(true);
		 if (getIntent().getBooleanExtra("EXITFI", false)) {
		     	
				finish();
			    }
		p=(ProgressBar)findViewById(R.id.progressBar1);
		msg=(TextView)findViewById(R.id.textView1);
		station=(TextView)findViewById(R.id.textView2);
		
		topl= (LinearLayout)findViewById(R.id.detailhead);
		arg = getIntent().getExtras().getStringArray("key");
	     passcity=arg[0]+"@"+arg[1];
	     tripcodep[0]=arg[0].toString();
	     tripcodep[1]=arg[1].toString();
	     
	     
	     AsyncCallWS task = new AsyncCallWS();
         //Call execute 
	     new AsyncCallWS().execute();
	     
	    
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.search__bus__details, menu);
		return true;
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
	public void onBackPressed()
	{
	    this.finish();  
	}
	@SuppressWarnings("deprecation")
	@SuppressLint("InlinedApi")
	public void linear(int no)
	{
		int j=0;
		parentLayout = (LinearLayout)findViewById(R.id.detail);
		tarr=new String[no];
        lLayout = new LinearLayout[no];
        
        LinearLayout.LayoutParams myLayoutParams = new LinearLayout.LayoutParams(
                LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT);
      
        myLayoutParams.setMargins(10, 10, 10, 10);
        myLayoutParams.height = 240;
        
		LinearLayout.LayoutParams params1  = new LinearLayout.LayoutParams(
        		LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        
        params1.leftMargin=20;
        
        
        LinearLayout.LayoutParams params2  = new LinearLayout.LayoutParams(
        		LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        params2.topMargin=10;
        
        LinearLayout.LayoutParams params3 = new LinearLayout.LayoutParams(
        		LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        params3.topMargin=10;
        
        t1=new TextView[no];
        t2=new TextView[no];
        t3=new TextView[no];
        t4=new TextView[no];
        t5=new TextView[no];
        t6=new TextView[no];
        t7=new TextView[no];
        for(int i = 0; i < lLayout.length; i++) {
            lLayout[i] = new LinearLayout(this);
           
            t1[i]=new TextView(this);
            t2[i]=new TextView(this);
            t3[i]=new TextView(this);
            t4[i]=new TextView(this);
            t5[i]=new TextView(this);
            t6[i]=new TextView(this);
            t7[i]=new TextView(this);
            lLayout[i].setId(i);
            t1[i].setId(j);
            j++;
            t1[i].setTextColor(Color.parseColor("#4617b4"));
            t2[i].setId(j);
           
            j++;
            t2[i].setTextColor(Color.parseColor("#4617b4"));
            t3[i].setId(j);
           
            t3[i].setTextColor(Color.parseColor("#4617b4"));
            j++;
            t4[i].setId(j);
            j++;
            t4[i].setTextColor(Color.parseColor("#4617b4"));
            t5[i].setId(j);
           j++;
            t5[i].setTextColor(Color.parseColor("#4617b4"));
            t6[i].setId(j);
           j++;
            t6[i].setTextColor(Color.parseColor("#4617b4"));
            t7[i].setId(j);
           j++;
            t7[i].setTextColor(Color.parseColor("#4617b4"));
            final int ip=i;
 lLayout[i].setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
				
				tripcodep[2]=""+tarr[ip];
					bundel=new Bundle();
					bundel.putStringArray("keyt",tripcodep);
					try
					{
						Intent is = new Intent(Search_Bus_Details.this,Internalstation.class);
						is.putExtras(bundel);
						startActivity(is);
						
						
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
					
					
					
				}
			});
            
            lLayout[i].setOrientation(LinearLayout.VERTICAL);
            
          
            if(i%2 == 0) {
                lLayout[i].setBackgroundColor(Color.parseColor("#bcbcbc"));
            } else {
                lLayout[i].setBackgroundColor(Color.parseColor("#ffffff"));
            }

            lLayout[i].setLayoutParams(myLayoutParams);
            t1[i].setLayoutParams(params1);
            t2[i].setLayoutParams(params1);
            t3[i].setLayoutParams(params1);
            t4[i].setLayoutParams(params1);
            t5[i].setLayoutParams(params1);
            t6[i].setLayoutParams(params1);
            t7[i].setLayoutParams(params1);
            parentLayout.addView(lLayout[i]);
            
            lLayout[i].addView(t5[i]);
            lLayout[i].addView(t1[i]);
            lLayout[i].addView(t2[i]);
            lLayout[i].addView(t3[i]);
           // lLayout[i].addView(t4[i]);
            lLayout[i].addView(t6[i]);
            lLayout[i].addView(t7[i]);
        }
       
	}
	
	private class AsyncCallWS extends AsyncTask<String, Void, Void> {

		@Override
		protected Void doInBackground(String... params) {
			ans = Background.busdetail(passcity,"Contact");
			
			return null;
		}

		@Override
		protected void onPostExecute(Void result) {
	
		int oo=0;
			if(ans[0].toString().equals("Error"))
			{	
				msg.setVisibility(View.VISIBLE);
			msg.setText("No bus for this route.");
			}
			else if(oo==Integer.parseInt(ans[0].toString()))
			{
				msg.setVisibility(View.VISIBLE);
				msg.setText("No bus for this route.");
			}
			else
			{
				oo=Integer.parseInt(ans[0].toString());
				linear(oo);
				int j=0;
				
				for(int i=1;i<oo*6;i++)
				{
			    tarr[j]=ans[i];
				t1[j].setText("Bus Name "+"           "+": "+ans[i+1]+" TO "+ans[i+2]);
				t2[j].setText("Category"+"              "+": "+ans[i+3]);
				t3[j].setText("Departure Time"+"  "+": "+ans[i+4]);
				t4[j].setText("Available Seat"+"  "+": "+"");
				t5[j].setText("Trip Code"+"             "+": "+ans[i]);
				t6[j].setText("Adult Fare"+"            "+": "+ans[i+5]);
				int chf=Integer.parseInt(ans[i+5])/2;
				t7[j].setText("Child Fare"+"             "+": "+chf);
				j++;	
				i=i+5;
				}
				topl.setVisibility(View.VISIBLE);
				station.setText(arg[0].toString()+" To "+arg[1].toString());
				
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
