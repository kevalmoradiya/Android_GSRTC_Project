package com.example.gsrtcandroidapps;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Bus_Status extends Activity {

	Button b1;
	EditText ee1;
	Bundle bundle;
	String[] tripcode=new String[1];
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bus_status);
		if (android.os.Build.VERSION.SDK_INT >= 11)
		    getActionBar().setDisplayHomeAsUpEnabled(true);
		b1=(Button)findViewById(R.id.button1);
		ee1=(EditText)findViewById(R.id.editText1);
		
		
		
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				bundle=new Bundle();
				tripcode[0]=ee1.getText().toString();
				bundle.putStringArray("tripcode",tripcode);
				Intent isb1 = new Intent(Bus_Status.this,Map2.class);
				isb1.putExtras(bundle);
			
				startActivity(isb1);
			}
		});
	}
	@Override
    public boolean onOptionsItemSelected(MenuItem menuItem)
    {       
        
        Intent intentbs=new Intent(Bus_Status.this,MainActivity.class);
        intentbs.putExtra("EXIT",true);
        startActivity(intentbs);
        this.finish();
        return true;
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.bus__status, menu);
		
		return true;
	}

}
