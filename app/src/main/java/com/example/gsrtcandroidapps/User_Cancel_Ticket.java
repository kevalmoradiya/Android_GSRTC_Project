package com.example.gsrtcandroidapps;


import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
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
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

@TargetApi(Build.VERSION_CODES.HONEYCOMB)
@SuppressLint("InlinedApi")
public class User_Cancel_Ticket extends Activity {
	ProgressBar p;
	TextView msg;
	Bundle bundel;
	LinearLayout layout[];
	LinearLayout parentLayout;
	TextView PNR[],Startpt[],DOJ[];
	String[] ans,tarr;
    String[] pnrarray=new String[1];
	SharedPreferences sharedpreferences;
	public static final String MyPREFERENCES = "MyPrefs" ;
	public static final String Username = "use"; 
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_user_cancel_ticket);
		if (android.os.Build.VERSION.SDK_INT >= 11)
		    getActionBar().setDisplayHomeAsUpEnabled(true);
		p=(ProgressBar)findViewById(R.id.progressBar2);
		msg=(TextView)findViewById(R.id.textView1);
		sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
		AsyncCallWS task = new AsyncCallWS();
        //Call execute 
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
		getMenuInflater().inflate(R.menu.user__cancel__ticket, menu);
		return true;
	}
	@Override
	public void onBackPressed()
	{
	    this.finish();  
	}
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	@SuppressLint("InlinedApi")
	public void linear(int no)
	{
		
		parentLayout = (LinearLayout)findViewById(R.id.ll);
		tarr=new String[no];
        layout = new LinearLayout[no];
        
        @SuppressWarnings("deprecation")
		LinearLayout.LayoutParams myLayoutParams = new LinearLayout.LayoutParams(
                LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT);
      
        myLayoutParams.setMargins(10, 10, 10, 10);
        myLayoutParams.height = 130;
        
		LinearLayout.LayoutParams params1  = new LinearLayout.LayoutParams(
        		LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        
        params1.leftMargin=20;
        
        
        LinearLayout.LayoutParams params2  = new LinearLayout.LayoutParams(
        		LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        params2.topMargin=10;
        
        LinearLayout.LayoutParams params3 = new LinearLayout.LayoutParams(
        		LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        params3.topMargin=10;
        
        PNR=new TextView[no];
        Startpt=new TextView[no];
        DOJ=new TextView[no];
        
        for(int i = 0; i < layout.length; i++) {
            layout[i] = new LinearLayout(this);
           
            PNR[i]=new TextView(this);
            Startpt[i]=new TextView(this);
            DOJ[i]=new TextView(this);
            
            layout[i].setId(i);
            PNR[i].setId(i);
            PNR[i].setTextColor(Color.parseColor("#4617b4"));
            PNR[i].setText("PNR NO: 1231213");
            
            Startpt[i].setId(i);
            Startpt[i].setTextColor(Color.parseColor("#4617b4"));
            Startpt[i].setText("Surat To Baroda");
            
            DOJ[i].setId(i);
            DOJ[i].setTextColor(Color.parseColor("#4617b4"));
            DOJ[i].setText("Date: 31/3/2014");
            
            
            final int ip=i;
 layout[i].setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			
			pnrarray[0]=""+tarr[ip];
			bundel=new Bundle();
			bundel.putStringArray("keydap",pnrarray);
		try
			{
				Intent is = new Intent(User_Cancel_Ticket.this,CancelTicketPage.class);
				is.putExtras(bundel);
				startActivity(is);
				
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			
			
		}
	});
            
            layout[i].setOrientation(LinearLayout.VERTICAL);
            
          
            if(i%2 == 0) {
                layout[i].setBackgroundColor(Color.parseColor("#bcbcbc"));
            } else {
                layout[i].setBackgroundColor(Color.parseColor("#e4e4e4"));
            }

            layout[i].setLayoutParams(myLayoutParams);
            PNR[i].setLayoutParams(params1);
            Startpt[i].setLayoutParams(params1);
           
            DOJ[i].setLayoutParams(params1);
            
            parentLayout.addView(layout[i]);
            
            
            layout[i].addView(PNR[i]);
            layout[i].addView(Startpt[i]);
          
            layout[i].addView(DOJ[i]);
            
            
        }
       
	}
	
	private class AsyncCallWS extends AsyncTask<String, Void, Void> {

		@Override
		protected Void doInBackground(String... params) {
			ans = Background.Cancelticketd(sharedpreferences.getString(Username, "")+"@"+"hello","AndroidGetBooked");
			
			return null;
		}

		@Override
		protected void onPostExecute(Void result) {
	int oo=0;
			if(ans[0].toString().equals("Error"))
			{	
				msg.setVisibility(View.VISIBLE);
			    msg.setText("No Ticket Booked.");
			}
			else if(ans[0].toString().equals("FALSE"))
			{
				msg.setVisibility(View.VISIBLE);
				msg.setText("No Ticket Booked.");
			}
			else if(oo==Integer.parseInt(ans[0].toString()))
			{
				msg.setVisibility(View.VISIBLE);
				msg.setText("No Ticket Booked.");
			}
			else
			{
				oo=Integer.parseInt(ans[0].toString());
				linear(oo);
				int j=0;
				
				for(int i=1;i<oo*3;i++)
				{
			    tarr[j]=ans[i];
				PNR[j].setText(ans[i]);
				Startpt[j].setText(ans[i+1]);
				DOJ[j].setText(ans[i+2]);
				
				j++;	
				i=i+2;
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
