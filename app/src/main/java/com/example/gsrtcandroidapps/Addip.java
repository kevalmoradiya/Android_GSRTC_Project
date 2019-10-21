package com.example.gsrtcandroidapps;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Addip extends Activity {
	static String SERVER_URL="192.168.1.20";

	EditText t;
	Button b,b1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_addip);
		t=(EditText)findViewById(R.id.editText1);
		b=(Button)findViewById(R.id.button1);
		b1=(Button)findViewById(R.id.button2);
		
		
		 b.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					SERVER_URL=t.getText().toString();
					
					
					Intent isb1 = new Intent(Addip.this,MainActivity.class);
					
					startActivity(isb1);
					
							
				}
			});
		 b1.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					SERVER_URL=t.getText().toString();
					
					
					Intent isb1 = new Intent(Addip.this,Search_Bus_Activitylo.class);
					
					startActivity(isb1);
					
							
				}
			});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.addip, menu);
		return true;
	}

}
