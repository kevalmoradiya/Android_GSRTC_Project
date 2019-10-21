package com.example.gsrtcandroidapps;



import android.os.AsyncTask;
import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View.OnClickListener;


public class Book_Ticket extends Activity {

   Button login; 
   ProgressBar p;
   String[] array;
   String[] ans;
   TextView t1,t2;
   
   public static final String Name = "tok";
   public static final String MyPREFERENCES = "MyPrefs" ;
   public static final String Username = "use"; 
   SharedPreferences sharedpreferences;
   
   String commasepratedString;
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_book_ticket);
		if (android.os.Build.VERSION.SDK_INT >= 11)
		    getActionBar().setDisplayHomeAsUpEnabled(true);
		t1=(TextView)findViewById(R.id.usernamee);
		t2=(TextView)findViewById(R.id.passworde);
		login=(Button)findViewById(R.id.btn_login);
		p=(ProgressBar)findViewById(R.id.progressBar1);
		sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
	

		login.setOnClickListener(new OnClickListener() {
		
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				array=new String[]{t1.getText().toString(),t2.getText().toString()};
				
				
				commasepratedString=array[0]+"@"+array[1];
				
				
				
				
				AsyncCallWS task = new AsyncCallWS();
		         //Call execute 
				new AsyncCallWS().execute();
				//Toast.makeText(getApplicationContext(),(String)array[0],Toast.LENGTH_SHORT).show();
				
			}
		});
		
		
	}
	@Override
    public boolean onOptionsItemSelected(MenuItem menuItem)
    {       
		Intent intentbt=new Intent(Book_Ticket.this,MainActivity.class);
		intentbt.putExtra("EXIT",true);
        startActivity(intentbt);
        this.finish();
        return true;
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.book__ticket, menu);
		
		return true;
	}
	private class AsyncCallWS extends AsyncTask<String, Void, Void> {

		@Override
		protected Void doInBackground(String... params) {
			
			ans = Background.invokeHelloWorldWSL(commasepratedString,"UserValidationAndTokenGenerationA");
			
			Log.d("Book_Ticket",ans[0].toString());
			return null;
		}

		@Override
		protected void onPostExecute(Void result) {
			
			if(ans[0].equals("Error"))
			{
				 Toast.makeText(getApplicationContext(),"Server Error",Toast.LENGTH_SHORT).show();
				 
				 p.setVisibility(View.GONE);
			}
			else if(ans[0].equals("false"))
			{
				 Toast.makeText(getApplicationContext(),"Invalid Username or Password",Toast.LENGTH_SHORT).show();
				 p.setVisibility(View.GONE);
			}
			else
			{
				String n  = ans[0].toString();
				Editor editor = sharedpreferences.edit();
				editor.putString(Name, n);
				editor.putString(Username, t1.getText().toString());
				editor.commit(); 
				Intent ibt = new Intent(Book_Ticket.this,User_Login.class);
				startActivity(ibt);
				p.setVisibility(View.GONE);
				finish();
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
