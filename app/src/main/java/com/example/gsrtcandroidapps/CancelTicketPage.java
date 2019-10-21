package com.example.gsrtcandroidapps;

import android.os.AsyncTask;
import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.GridLayout.LayoutParams;

@SuppressLint("NewApi")
public class CancelTicketPage extends Activity {
	
	ProgressBar p;
	TextView msg;
	String[] no1,argd,ans,ans1,argg;
	String[] seat;
	String[] seatno;
	Bundle bu1;
	String seatseprated;
	int noa,noc,not,id,a,b,f=0;
	CheckBox[] adultchild;
	LinearLayout topl;
	AsyncCallWS1 task1 = new AsyncCallWS1();
   
   
	
	Button proceed;
	SharedPreferences sharedpreferences;
	Spinner adults,childs;
	
	public static final String MyPREFERENCES = "MyPrefs" ;
	public static final String Username = "use"; 
	public static final String Name = "tok";

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cancel_ticket_page);
		if (android.os.Build.VERSION.SDK_INT >= 11)
		    getActionBar().setDisplayHomeAsUpEnabled(true);
		p=(ProgressBar)findViewById(R.id.progressBar1);
		msg=(TextView)findViewById(R.id.textView1);
		argd = getIntent().getExtras().getStringArray("keydap");
		adults=(Spinner)findViewById(R.id.spinner1);
		childs=(Spinner)findViewById(R.id.spinner2);
		proceed=(Button)findViewById(R.id.button1);
		AsyncCallWS task = new AsyncCallWS();
        //Call execute 
		new AsyncCallWS().execute();
		proceed.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				a=Integer.parseInt(adults.getSelectedItem().toString())+Integer.parseInt(childs.getSelectedItem().toString());
				f=0;
				seat=new String[not];
				for(int c=0;c<not;c++)
				{
					if(adultchild[c].isChecked())
					{
						f++;
						seat[c]=adultchild[c].getText().toString();
					
					}
				}
				if(f>a)
				{
					Toast.makeText(getApplicationContext(),"You select more seat to cancel.",Toast.LENGTH_SHORT).show();
					
				}
				else if(f<a)
				{
					Toast.makeText(getApplicationContext(),"Plz select ticket to cancel.",Toast.LENGTH_SHORT).show();
					
				}
				else
				{
					
					
					if(f==1)
					{
						seatseprated=seat[0].toString();
					}
					else if(f==2)
					{
						seatseprated=seat[0].toString()+"@"+seat[1].toString();
					}
					else if(f==3)
					{
						seatseprated=seat[0].toString()+"@"+seat[1].toString()+"@"+seat[2].toString();
					}
					else if(f==4)
					{
						seatseprated=seat[0].toString()+"@"+seat[1].toString()+"@"+seat[2].toString()+"@"+seat[3].toString();
					}
					else if(f==5)
					{
						seatseprated=seat[0].toString()+"@"+seat[1].toString()+"@"+seat[2].toString()+"@"+seat[3].toString()+"@"+seat[4].toString();
					}
					else if(f==6)
					{
						seatseprated=seat[0].toString()+"@"+seat[1].toString()+"@"+seat[2].toString()+"@"+seat[3].toString()+"@"+seat[4].toString()+"@"+seat[5].toString();
					}
					//Toast.makeText(getApplicationContext(),"SUCCESS",Toast.LENGTH_SHORT).show();
					
					new AsyncCallWS1().execute();
					
				}
				
			}
		});
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.cancel_ticket_page, menu);
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
		
		adultchild=new CheckBox[no];
		
	
		
		LinearLayout parentLayout = (LinearLayout)findViewById(R.id.detail);
		
        LinearLayout.LayoutParams myLayoutParams = new LinearLayout.LayoutParams(
                LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT);
      
        myLayoutParams.setMargins(10, 10, 10, 10);
        
        
		LinearLayout.LayoutParams params1  = new LinearLayout.LayoutParams(
        		LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        
        params1.leftMargin=20;
        int k=0;
        for(k=0;k<no;k++)
        {
        	adultchild[k]=new CheckBox(this);
        	adultchild[k].setId(id);
        	id++;
        	adultchild[k].setText(""+seatno[k]);
        	adultchild[k].setLayoutParams(params1);
        	parentLayout.addView(adultchild[k]);
        }
        
        	
        	
        	String array_dha[] = new String[noa+1];
        	for(int i=0; i<=noa ; i++)
        	{
        	array_dha[i]=""+i;
        	}
            @SuppressWarnings({ "unchecked", "rawtypes" })
			ArrayAdapter adapter1 = new ArrayAdapter(this,android.R.layout.simple_spinner_item, array_dha);
                    adults.setAdapter(adapter1);
                   
                    adapter1.setDropDownViewResource
                    (android.R.layout.simple_spinner_dropdown_item);
        
        	String array_dhc[] = new String[noc+1];
        
        	for(int i=0; i<=noc ; i++)
        	{
        	array_dhc[i]=""+i;
        	}
        	@SuppressWarnings({ "rawtypes", "unchecked" })
			ArrayAdapter adapter2 = new ArrayAdapter(this,android.R.layout.simple_spinner_item, array_dhc);
                    childs.setAdapter(adapter2);
                    adapter2.setDropDownViewResource
                    (android.R.layout.simple_spinner_dropdown_item);
        	
       
        
	}
	private class AsyncCallWS extends AsyncTask<String, Void, Void> {

		@Override
		protected Void doInBackground(String... params) {
			ans = Background.busseatusingpnr(argd[0].toString(),"Android_SeatNo_From_PNRNo");
			
			return null;
		}

		@Override
		protected void onPostExecute(Void result) {
			{
				int oo=0;
				if(ans[0].toString().equals("Error"))
				{	
					msg.setVisibility(View.VISIBLE);
				    msg.setText("Server Error.");
				}
				else if(ans[0].toString().equals("FALSE"))
				{
					msg.setVisibility(View.VISIBLE);
					msg.setText("Server Error.");
				}
				else if(oo==Integer.parseInt(ans[0].toString()))
				{
					msg.setVisibility(View.VISIBLE);
					msg.setText("Seat Problem.");
				}
				else
				{
					oo=Integer.parseInt(ans[0].toString());
					not=oo;
					int  i;
					seatno=new String[oo];
					for(i=0;i<oo;i++)
					{
				    seatno[i]=ans[i+1].toString();
				    
					}
					noa=Integer.parseInt(ans[i+1]);
					i++;
					noc=Integer.parseInt(ans[i+1]);
					linear(oo);
					
					
				}				
				p.setVisibility(View.GONE);
			}
			
		}

		@Override
		protected void onPreExecute() {
			p.setVisibility(View.VISIBLE);
		}

		@Override
		protected void onProgressUpdate(Void... values) {
		}

	}
	private class AsyncCallWS1 extends AsyncTask<String, Void, Void> {

		@Override
		protected Void doInBackground(String... params) {
			ans1 = Background.confirmticketcancel(argd[0].toString()+"@"+childs.getSelectedItem().toString()+"@"+adults.getSelectedItem().toString()+"@"+seatseprated,"Aticket_cancellation");
			
			return null;
		}

		@Override
		protected void onPostExecute(Void result) {
			{
				
				if(ans1[0].toString().equals("Error"))
				{	
					msg.setVisibility(View.VISIBLE);
				    msg.setText("Server Error.");
				}
				else if(ans1[0].toString().equals("TRUE"))
				{
					
					argg=new String[1];
					argg[0]=argd[0].toString();
						bu1=new Bundle();
						bu1.putStringArray("pnr",argg);
						
Intent is = new Intent(CancelTicketPage.this,PrintTicket.class);
is.putExtras(bu1);
					startActivity(is);
					
					
				}		
				else
				{

				//	Toast.makeText(getApplicationContext(),"Something Wrong.",Toast.LENGTH_SHORT).show();
				}
				p.setVisibility(View.GONE);
			}
			
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
