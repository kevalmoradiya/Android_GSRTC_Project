package com.example.gsrtcandroidapps;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;




@SuppressLint({ "ValidFragment", "NewApi" })
public class Search_Bus_Activitylo extends Activity {

	TextView mEdit;
	Button showbus,b2;
	String[] array;
	AutoCompleteTextView textView1,textView2;
	Spinner sp;
	Bundle bundel;
	int flagdate=0;
	 boolean check = false;
 

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_search__bus__activitylo);
		
		if (android.os.Build.VERSION.SDK_INT >= 11)
		    getActionBar().setDisplayHomeAsUpEnabled(true);
		mEdit = (TextView)findViewById(R.id.Text1);
		textView2 = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView2);
		textView1 = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView1);
	    sp=(Spinner)findViewById(R.id.spinner2);
	   
	  
	    
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, COUNTRIES);
                textView1.setAdapter(adapter);
       textView2.setAdapter(adapter);
       showbus=(Button)findViewById(R.id.button1);
	
       showbus.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			
				if(flagdate==0)
				{
						array=new String[4]; 
						array[0]=textView1.getText().toString();
						array[1]=textView2.getText().toString();
						array[2]=mEdit.getText().toString();
						array[3]=sp.getSelectedItem().toString();
						if(mEdit.getText().toString().equals("") || textView1.getText().toString().equals("") ||
						   textView2.getText().toString().equals("") || sp.getSelectedItem().toString().equals(""))
						{
							Toast.makeText(getApplicationContext(), "One or more field is empty !",
									   Toast.LENGTH_LONG).show();
					    }
						else
						{
							
							bundel=new Bundle();
							bundel.putStringArray("key",array);
							try
							{
								Intent isb1 = new Intent(Search_Bus_Activitylo.this,Search_Bus_Detailslo.class);
								isb1.putExtras(bundel);
								startActivity(isb1);
								
							}
							catch(Exception e)
							{
								e.printStackTrace();
							}
						}		
						}
				
				else 
				{
					Toast.makeText(getApplicationContext(), "Please select valid date !",Toast.LENGTH_LONG).show();
				}
				}
			
		});

       
	
        
	}
	@Override
    public boolean onOptionsItemSelected(MenuItem menuItem)
    {       
        
        Intent isb3=new Intent(Search_Bus_Activitylo.this,MainActivity.class);
        isb3.putExtra("EXIT",true);
        startActivity(isb3);
        this.finish();
        return true;
        
    }
	@Override
	public void onBackPressed()
	{
	    this.finish();  
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.search__bus__activitylo, menu);
		
		return true;
	}
	private static final String[] COUNTRIES = new String[] {
        "Bhuj", "Rajkot", "Ahmedabad", "Baroda", "Surat", "Mahesana"
    };
	
	boolean datetwomonth(int day,int month,int year)
	{  flagdate=0;
		
	Calendar calendar = Calendar.getInstance();
	calendar.add(Calendar.MONTH,+3);
	
	int mm = calendar.get(Calendar.MONTH);
	int yy = calendar.get(Calendar.YEAR);
	int dd = calendar.get(Calendar.DAY_OF_MONTH);
	
	Log.d("2mon", "2month:day"+dd);
	Log.d("2mon", "2month:mon"+mm);
	Log.d("2mon", "2month:year"+yy);
	
	int d=dd-day;
	int m=mm-month;
	int y=yy-year;

	Log.d("sub", "d:"+d);
	Log.d("sub", "m:"+m);
	Log.d("sub", "y:"+y);
	
	if(y<0)
	{
     check=false;
     Log.d("y<1", "::"+check);
	}
	
	if(y>1)
	{
     check=false;
     Log.d("y>1", "::"+check);
	}
	
	else if(y==1)
	{
		if(m==0) 
		{
			if(d>0)
				{
				check=true; Log.d("y=1,m=0,d>0", "::"+check);
				}
		
		}
	 else if(m == -11)
		 {
		 check=true; 
		 Log.d("y=1,m=-11", "::"+check);
		 }
	 
	 else if(m==1)
	 	 {
		 check=true; Log.d("y=1,m=1", "::"+check); 
		 }
	 
	 else if(m==-10) 
	 {
		 if(d<0)
		 {
			 check=true; Log.d("y=1,m=-10,d>0", "::"+check); 
		 }
		 if(d>0)
		 {
			 check=false; Log.d("y=1,m=-10,d>0", "::"+check); 
		 }
	 }
		
	}
	else if(y==0)
	{
		if(m==2)
		{
			if(d<=0)
			{
			check=true; Log.d("y=0,m=2,d<0", "::"+check); 
			}
			if(d>0)
			{
			check=false; Log.d("y=0,m=2,d>0", "::"+check); 
			}
		
		}
		
		else if(m==1) { check=true; Log.d("y=0,m=1", "::"+check); }
		
		else if(m==0)
		{
			if(d>0)
				{
				check=true; Log.d("y=0,m=0,d>0", "::"+check);
				}
			if(d<0)
			{
			check=false; Log.d("y=0,m=0,d<0", "::"+check);
			}
		}
		
		else if(m<0)
		{
			check=false; Log.d("y=0,m<0", "::"+check);
		}
	}
	
return check;
}
	
	public void selectDate(View view) {
		DialogFragment newFragment = new SelectDateFragment();
		newFragment.show(getFragmentManager(), "DatePicker");
		}
	   
		@SuppressLint("SimpleDateFormat")
		public void populateSetDate(int year, int month, int day) {
		
		String d1 = new SimpleDateFormat("dd").format(new Date());
		String m1 = new SimpleDateFormat("MM").format(new Date());
		String y1 = new SimpleDateFormat("yyyy").format(new Date());
		Log.d("DATEE", "cur"+d1);
		Log.d("DATEE", "cur"+m1);
		Log.d("DATEE", "cur"+y1);
		flagdate=0;
		int day1= Integer.parseInt(d1);
		int mon1= Integer.parseInt(m1);
		int year1= Integer.parseInt(y1);
		
		
		
		Boolean b1= datetwomonth(day, month, year);
		if(!b1)
		{
			flagdate=1;
		}
		
		if(flagdate==1)
		{
			Toast.makeText(getApplicationContext(), "Please select valid date!",Toast.LENGTH_LONG).show();
		}

		mEdit.setText(month+"/"+day+"/"+year);
		
		}
		
		public class SelectDateFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener {
		@SuppressLint("NewApi")
		@Override
		public Dialog onCreateDialog(Bundle savedInstanceState) {
		 Calendar calendar = Calendar.getInstance();
       
	    int yy = calendar.get(Calendar.YEAR);
	    int mm = calendar.get(Calendar.MONTH);
		int dd = calendar.get(Calendar.DAY_OF_MONTH);
		
		return new DatePickerDialog(getActivity(), this, yy, mm, dd);
		}
		 
		@Override
		public void onDateSet(DatePicker view, int yy, int mm, int dd) {
		populateSetDate(yy,mm+1,dd);
		}
		}
		
		

}
