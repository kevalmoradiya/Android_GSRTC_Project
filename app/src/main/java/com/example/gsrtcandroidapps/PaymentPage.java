package com.example.gsrtcandroidapps;

import java.util.Calendar;

import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

@SuppressLint({ "NewApi", "ValidFragment" })
public class PaymentPage extends Activity {

	EditText bname,cnumber,edate,scode;
	Spinner ctype;
	String[] ans,ans1,arggg;
	ProgressBar pr;
	Bundle bu1;
	TextView bfare,discount,rfee,scharge,gtotal;
	SharedPreferences sharedpreferences;
	public static final String MyPREFERENCES = "MyPrefs" ;
	public static final String Username = "use"; 
	AsyncCallWS task = new AsyncCallWS();
	AsyncCallWS1 task1 = new AsyncCallWS1();
	Button b1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_payment_page);
		bname=(EditText)findViewById(R.id.editText1);
		ctype=(Spinner)findViewById(R.id.spinner1);
		cnumber=(EditText)findViewById(R.id.editText2);
		edate=(EditText)findViewById(R.id.editText3);
	
		scode=(EditText)findViewById(R.id.editText4);
		b1=(Button)findViewById(R.id.button1);
		pr=(ProgressBar)findViewById(R.id.progressBar1);
		bfare=(TextView)findViewById(R.id.textView17);
		discount=(TextView)findViewById(R.id.textView19);
		rfee=(TextView)findViewById(R.id.textView21);
		scharge=(TextView)findViewById(R.id.textView25);
		gtotal=(TextView)findViewById(R.id.textView23);
		sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
		new AsyncCallWS1().execute();
       
		
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(bname.getText().toString().equals("") || cnumber.getText().toString().equals("") || edate.getText().toString().equals("") || scode.getText().toString().equals(""))
				{
					Toast.makeText(getApplicationContext(),"One or more field is empty.",Toast.LENGTH_SHORT).show();
				}
				else
				{		
					new AsyncCallWS().execute();
				}
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.payment_page, menu);
		return true;
	}
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	@SuppressLint("NewApi")
	public void selectDate(View view) {
		DialogFragment newFragment = new SelectDateFragment();
		newFragment.show(getFragmentManager(), "DatePicker"); 
		}
	
		public void populateSetDate(int year, int month, int day) {
		
		edate.setText(day+"/"+month+"/"+year);
		}
		public class SelectDateFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener {
		@SuppressLint("NewApi")
		@Override
		public Dialog onCreateDialog(Bundle savedInstanceState) {
		final Calendar calendar = Calendar.getInstance();
		int yy = calendar.get(Calendar.YEAR);
		int mm = calendar.get(Calendar.MONTH);
		int dd = calendar.get(Calendar.DAY_OF_MONTH);
		return new DatePickerDialog(getActivity(), this, yy, mm, dd);
		}
		 
		@Override
		public void onDateSet(DatePicker view, int yy, int mm, int dd) {
		populateSetDate(yy, dd, mm+1);
		}
		}
		private class AsyncCallWS extends AsyncTask<String, Void, Void> {

			@Override
			protected Void doInBackground(String... params) {
				ans = Background.lastpb(sharedpreferences.getString(Username, "")+"@"+gtotal.getText().toString()+"@"+bname.getText().toString()+"@"+ctype.getSelectedItem().toString()+"@"+cnumber.getText().toString()+"@"+edate.getText().toString()+"@"+scode.getText().toString(),"Listpayment");
				
				return null;
			}

			@Override
			protected void onPostExecute(Void result) {
		
				if(ans[0].toString().equals("Error"))
				{	
					Toast.makeText(getApplicationContext(), "SERVER PROBLEM",Toast.LENGTH_SHORT).show();
					
				
				}
				else if(ans[0].toString().equals("FALSE"))
				{
					Toast.makeText(getApplicationContext(), "SERVER PROBLEM",Toast.LENGTH_SHORT).show();
				}
				else
				{
                   arggg=new String[1];
				arggg[0]=ans[0].toString();
					bu1=new Bundle();
					bu1.putStringArray("pnr",arggg);
					Intent isb1 = new Intent(PaymentPage.this,PrintTicket.class);
					isb1.putExtras(bu1);
					Log.i("bank", sharedpreferences.getString(Username, "")+"@"+gtotal.getText().toString()+"@"+bname.getText().toString()+"@"+ctype.getSelectedItem().toString()+"@"+cnumber.getText().toString()+"@"+edate.getText().toString()+"@"+scode.getText().toString());
					startActivity(isb1);
					finish();
					
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
				ans1 = Background.ticketcharge(sharedpreferences.getString(Username, "")+"@"+"hello","Bususerdetai");
				
				return null;
			}

			@Override
			protected void onPostExecute(Void result) {
		
				if(ans1[0].toString().equals("Error"))
				{	
					Toast.makeText(getApplicationContext(), "SERVER PROBLEM",Toast.LENGTH_SHORT).show();
				
				}
				else
				{
                    bfare.setText(ans1[0].toString());
                    discount.setText(ans1[1].toString());
                    rfee.setText(ans1[2].toString());
                    scharge.setText(ans1[3].toString());
                    gtotal.setText(ans1[4].toString());
					
					
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
