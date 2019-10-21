package com.example.gsrtcandroidapps;

import java.util.Calendar;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Intent;
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
import android.widget.Toast;




@SuppressLint({ "ValidFragment", "NewApi" })
public class Search_Bus_Activity extends Activity {

	EditText mEdit;
	Button showbus,b2;
	String[] array;
	AutoCompleteTextView textView1,textView2;
	Spinner sp;
	Bundle bundel;

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_search_bus);
		if (android.os.Build.VERSION.SDK_INT >= 11)
		    getActionBar().setDisplayHomeAsUpEnabled(true);
		mEdit = (EditText)findViewById(R.id.editText1);
		textView2 = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView2);
		textView1 = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView1);
	    sp=(Spinner)findViewById(R.id.spinner);
	    
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, COUNTRIES);
                textView1.setAdapter(adapter);
       textView2.setAdapter(adapter);
       showbus=(Button)findViewById(R.id.button1);
	
        showbus.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			
				
						array=new String[4]; 
						array[0]=textView1.getText().toString();
						array[1]=textView2.getText().toString();
						//array[2]=mEdit.getText().toString();
						//array[3]=sp.getSelectedItem().toString();
						if(textView2.getText().toString().equals("") || textView1.getText().toString().equals(""))
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
								Intent isb1 = new Intent(Search_Bus_Activity.this,Search_Bus_Details.class);
								isb1.putExtras(bundel);
								startActivity(isb1);
								
							}
							catch(Exception e)
							{
								e.printStackTrace();
							}
						}
			}
		});

       
	
        
	}
	@Override
    public boolean onOptionsItemSelected(MenuItem menuItem)
    {       
        
        Intent isb3=new Intent(Search_Bus_Activity.this,MainActivity.class);
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
		getMenuInflater().inflate(R.menu.search__bus_, menu);
		
		return true;
	}
	private static final String[] COUNTRIES = new String[] {
        "Bhuj", "Rajkot", "Ahmedabad", "Baroda", "Surat", "Mahesana"
    };
	
	public void selectDate(View view) {
		DialogFragment newFragment = new SelectDateFragment();
		newFragment.show(getFragmentManager(), "DatePicker"); 
		}
	
		public void populateSetDate(int year, int month, int day) {
		
		mEdit.setText(day+"/"+month+"/"+year);
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
		populateSetDate(yy, mm+1, dd);
		}
		}
		
		

}
