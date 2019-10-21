package com.example.gsrtcandroidapps;

import java.util.Calendar;

import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
public class PassengerDetails extends Activity {

	String[] data,seat1,ans,ans1;
	EditText idcno,name,age,address,city,pincode,phone,email,adult,child;
	TextView pickup,drop,time,journeydate,noofseat,msg;
	String addresst="NA",cityt="NA",pincodet="0";
	ProgressBar pr;
	String ti;
	Spinner gender,idctype,category;
	Button submit;
	Calendar c=Calendar.getInstance();
    String passengercontact1,passengercontact2,seatseprated;
	SharedPreferences sharedpreferences;
	AsyncCallWS task = new AsyncCallWS();
	AsyncCallWS1 task1 = new AsyncCallWS1();
	int hour,min;
	public static final String MyPREFERENCES = "MyPrefs" ;
	public static final String Username = "use"; 
	public static final String Name = "tok";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_passenger_details);
		if (getIntent().getBooleanExtra("EXITSES", false)) {
	     	
			finish();
		    }
	
		data = getIntent().getExtras().getStringArray("key1");
		seat1 = getIntent().getExtras().getStringArray("key");
	    hour=c.get(Calendar.HOUR);
	    min=c.get(Calendar.MINUTE);
	    ti=""+hour+" h "+min+" m";
		pr=(ProgressBar)findViewById(R.id.progressBar1);
		
		sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
		int leng=seat1.length;
		
		if(leng==0)
		{
			Toast.makeText(getApplicationContext(),"Seat Selection Problem",Toast.LENGTH_SHORT).show();
		}
		else if(leng==1)
		{
			seatseprated=seat1[0].toString();
		}
		else if(leng==2)
		{
			seatseprated=seat1[0].toString()+"#"+seat1[1].toString();
		}
		else if(leng==3)
		{
			seatseprated=seat1[0].toString()+"#"+seat1[1].toString()+"#"+seat1[2].toString();
		}
		else if(leng==4)
		{
			seatseprated=seat1[0].toString()+"#"+seat1[1].toString()+"#"+seat1[2].toString()+"#"+seat1[3].toString();
		}
		else if(leng==5)
		{
			seatseprated=seat1[0].toString()+"#"+seat1[1].toString()+"#"+seat1[2].toString()+"#"+seat1[3].toString()+"#"+seat1[4].toString();
		}
		else if(leng==6)
		{
			seatseprated=seat1[0].toString()+"#"+seat1[1].toString()+"#"+seat1[2].toString()+"#"+seat1[3].toString()+"#"+seat1[4].toString()+"#"+seat1[5].toString();
		}
		
		
		name=(EditText)findViewById(R.id.editText1);
	    age=(EditText)findViewById(R.id.editText2);
		idcno=(EditText)findViewById(R.id.editText3);
		gender=(Spinner)findViewById(R.id.spinner3);
		category=(Spinner)findViewById(R.id.spinner2);
		idctype=(Spinner)findViewById(R.id.spinner1);
		
		address=(EditText)findViewById(R.id.editText4);
		city=(EditText)findViewById(R.id.editText5);
		pincode=(EditText)findViewById(R.id.editText6);
		phone=(EditText)findViewById(R.id.editText7);
		email=(EditText)findViewById(R.id.editText8);
		adult=(EditText)findViewById(R.id.editText16);
		child=(EditText)findViewById(R.id.editText17);
		
		msg=(TextView)findViewById(R.id.textView20);
		pickup=(TextView)findViewById(R.id.textView17);
		drop=(TextView)findViewById(R.id.textView19);

       time=(TextView)findViewById(R.id.textView21);
		journeydate=(TextView)findViewById(R.id.textView25);
		noofseat=(TextView)findViewById(R.id.textView23);
		
		submit=(Button)findViewById(R.id.button1);
		new AsyncCallWS1().execute();
		
		//Toast.makeText(getApplicationContext(),seatseprated,Toast.LENGTH_SHORT).show();
		
        submit.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				int a=0;
				//Call execute 
				if(adult.getText().toString().equals(""))
				{
					if(child.getText().toString().equals(""))
					{
						a=0;
					}
					else
					{
					a=0+Integer.parseInt(child.getText().toString());
					}
				}
				else if(child.getText().toString().equals(""))
				{
					
					a=Integer.parseInt(adult.getText().toString())+0;
					
				}
				else
				{
					a=Integer.parseInt(adult.getText().toString())+Integer.parseInt(child.getText().toString());
				}
				
				if(a<Integer.parseInt(data[1].toString()))
				{
					Toast.makeText(getApplicationContext(),"Invalid Child or Adult.",Toast.LENGTH_SHORT).show();
				}
				else if(a>Integer.parseInt(data[1].toString()))
				{
					Toast.makeText(getApplicationContext(),"Invalid Child or Adult.",Toast.LENGTH_SHORT).show();
				}
				else
				{
					if(phone.getText().toString().equals("") || email.getText().toString().equals("") || name.getText().toString().equals("") || age.getText().toString().equals("") || idcno.getText().toString().equals(""))
					{
						Toast.makeText(getApplicationContext(),"One or more required field is empty.",Toast.LENGTH_SHORT).show();
					}
					else
					{
						if(phone.getText().length()==10)
						{
						addresst=address.getText().toString();
						cityt=city.getText().toString();
						pincodet=pincode.getText().toString();
						
						if(addresst.equals(""))
						{
						addresst="NA";
						}
						if(cityt.equals(""))
						{
							cityt="NA";
						}
						if(pincodet.equals(""))
						{
							pincodet="0";
						}
							
					passengercontact1=seat1.length+"#"+sharedpreferences.getString(Username, "")+"#"+data[2].toString()+"#"+data[0].toString()+"#"+data[3].toString()+"#"+data[4].toString()+"#"+adult.getText().toString()+"#"+child.getText().toString()+"#"+name.getText().toString()+"#"+age.getText().toString()+"#"+category.getSelectedItem().toString()+"#"+gender.getSelectedItem().toString();
					passengercontact2=addresst+"#"+cityt+"#"+pincodet+"#"+phone.getText().toString()+"#"+email.getText().toString()+"#"+idctype.getSelectedItem().toString()+"#"+idcno.getText().toString()+"#"+ti+"#"+seatseprated;
					Log.i("Pass1",passengercontact1);
					Log.i("Pass2",passengercontact2);
					new AsyncCallWS().execute();
						}
						else
						{
							Toast.makeText(getApplicationContext(), "Phone No. is invalid", Toast.LENGTH_SHORT).show();
						}
					}
				}
			}
		});
        
	
	
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.passenger_details, menu);
		return true;
	}
	
	private class AsyncCallWS extends AsyncTask<String, Void, Void> {

		@Override
		protected Void doInBackground(String... params) {
			
			ans = Background.userdetail(passengercontact1+"#"+passengercontact2,"Bususerdetail");
			
			return null;
		}

		@Override
		protected void onPostExecute(Void result) {
	
			if(ans[0].toString().equals("Error"))
			{	
				
				msg.setVisibility(View.VISIBLE);
			    msg.setText("Please login again.");
			}
			else if(ans[0].toString().equals("FALSE"))
			{	
				msg.setVisibility(View.VISIBLE);
			    msg.setText("Please login again.");
			}
			else 
			{
				
				Intent isb1 = new Intent(PassengerDetails.this,PaymentPage.class);
				finish();
				startActivity(isb1);
				
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
	private class AsyncCallWS1 extends AsyncTask<String, Void, Void> {

		@Override
		protected Void doInBackground(String... params) {
			String trip=data[2].toString();
			ans1 = Background.getdata(trip+"@"+"hello","Bususer");
			Log.i("TRIPCODE", data[2].toString());
			return null;
		}

		@Override
		protected void onPostExecute(Void result) {
	
			if(ans1[0].toString().equals("Error"))
			{	
				
				msg.setVisibility(View.VISIBLE);
			    msg.setText("Please login again.");
			}
			else if(ans1[0].toString().equals("FALSE"))
			{	
				
				msg.setVisibility(View.VISIBLE);
			    msg.setText("Please login again.");
			}
			else 
			{
				pickup.setText(ans1[0].toString());
				drop.setText(ans1[1].toString());
				time.setText(ans1[2].toString()+" TO "+ans1[3].toString());
				journeydate.setText(data[0].toString());
				noofseat.setText(data[1].toString());
				
			
				
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
	

	

}
