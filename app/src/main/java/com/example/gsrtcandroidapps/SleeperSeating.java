package com.example.gsrtcandroidapps;

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
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class SleeperSeating extends Activity {
	CheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,cu1,cu2,cu3,cu4,cu5,cu6,cu7,cu8,cu9,cu10,cu11,cu12,cu13,cu14,cu15;
	String[] seat;
	String[] p;
	
	String[] p1=new String[]{"","",""};
	String[] p2=new String[]{"","",""};
	String[] p3=new String[]{"","",""};
	String[] p4=new String[]{"","",""};
	String[] p5=new String[]{"","",""};
	
	String[] pu1=new String[]{"","",""};
	String[] pu2=new String[]{"","",""};
	String[] pu3=new String[]{"","",""};
	String[] pu4=new String[]{"","",""};
	String[] pu5=new String[]{"","",""};
	
	String[] aa=new String[3];
	String[] argd,ans;
	ProgressBar pr;
	TextView msg;

Button b1;
Bundle bundle,bundle2;
	SharedPreferences sharedpreferences;
	public static final String MyPREFERENCES = "MyPrefs" ;
	public static final String Username = "use"; 
	public static final String Name = "tok";
	int f=0,keu=0,rest;
	
	int fu=0,keuu=0,restu;
	


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sleeper_seating);
		argd = getIntent().getExtras().getStringArray("keyda");
		aa=argd;
		rest=Integer.parseInt(argd[1].toString());
		seat=new String[rest];
		 //Toast.makeText(getApplicationContext(),argd[2].toString(),Toast.LENGTH_SHORT).show();
		sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
		
		b1=(Button)findViewById(R.id.button1);
		pr=(ProgressBar)findViewById(R.id.progressBar1);
		msg=(TextView)findViewById(R.id.textView1);
		
		c1=(CheckBox)findViewById(R.id.checkBox1);
		c2=(CheckBox)findViewById(R.id.checkBox2);
		c3=(CheckBox)findViewById(R.id.checkBox3);
		c4=(CheckBox)findViewById(R.id.checkBox4);
		c5=(CheckBox)findViewById(R.id.checkBox5);
		c6=(CheckBox)findViewById(R.id.checkBox6);
		c7=(CheckBox)findViewById(R.id.checkBox7);
		c8=(CheckBox)findViewById(R.id.checkBox8);
		c9=(CheckBox)findViewById(R.id.checkBox9);
		c10=(CheckBox)findViewById(R.id.checkBox10);
		c11=(CheckBox)findViewById(R.id.checkBox11);
		c12=(CheckBox)findViewById(R.id.checkBox12);
		c13=(CheckBox)findViewById(R.id.checkBox13);
		c14=(CheckBox)findViewById(R.id.checkBox14);
		c15=(CheckBox)findViewById(R.id.checkBox15);
		
		cu1=(CheckBox)findViewById(R.id.checkBoxu1);
		cu2=(CheckBox)findViewById(R.id.checkBoxu2);
		cu3=(CheckBox)findViewById(R.id.checkBoxu3);
		cu4=(CheckBox)findViewById(R.id.checkBoxu4);
		cu5=(CheckBox)findViewById(R.id.checkBoxu5);
		cu6=(CheckBox)findViewById(R.id.checkBoxu6);
		cu7=(CheckBox)findViewById(R.id.checkBoxu7);
		cu8=(CheckBox)findViewById(R.id.checkBoxu8);
		cu9=(CheckBox)findViewById(R.id.checkBoxu9);
		cu10=(CheckBox)findViewById(R.id.checkBoxu10);
		cu11=(CheckBox)findViewById(R.id.checkBoxu11);
		cu12=(CheckBox)findViewById(R.id.checkBoxu12);
		cu13=(CheckBox)findViewById(R.id.checkBoxu13);
		cu14=(CheckBox)findViewById(R.id.checkBoxu14);
		cu15=(CheckBox)findViewById(R.id.checkBoxu15);
		
		c1.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		c2.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		c3.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		c4.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		c5.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		c6.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		c7.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		c8.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		c9.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		c10.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		c11.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		c12.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		c13.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		c14.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		c15.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		
		cu1.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		cu2.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		cu3.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		cu4.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		cu5.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		cu6.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		cu7.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		cu8.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		cu9.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		cu10.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		cu11.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		cu12.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		cu13.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		cu14.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		cu15.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		
		
		AsyncCallWS task = new AsyncCallWS();
       // Call execute 
		new AsyncCallWS().execute();
		
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				int keu=0;
					for(int iii=0;iii<3;iii++)
					{
						if(!p1[iii].equals(""))
						{
							seat[keu]=p1[iii].toString();
							keu++;
						//	Toast.makeText(getApplicationContext(),""+keu+""+p1[iii].toString(),Toast.LENGTH_SHORT).show();
						}
						if(!p2[iii].equals(""))
						{
							seat[keu]=p2[iii].toString();
						    keu++;
						  //  Toast.makeText(getApplicationContext(),""+keu+""+p2[iii].toString(),Toast.LENGTH_SHORT).show();
						}
						if(!p3[iii].equals(""))
						{
							seat[keu]=p3[iii].toString();
							keu++;
							//Toast.makeText(getApplicationContext(),""+keu+""+p3[iii].toString(),Toast.LENGTH_SHORT).show();
						}
						if(!p4[iii].equals(""))
						{
							seat[keu]=p4[iii].toString();
							keu++;
							//Toast.makeText(getApplicationContext(),""+keu+""+p4[iii].toString(),Toast.LENGTH_SHORT).show();
						}
						if(!p5[iii].equals(""))
						{
							seat[keu]=p5[iii].toString();
							keu++;
						}
						if(!pu1[iii].equals(""))
						{
							seat[keu]=pu1[iii].toString();
							keu++;
						//	Toast.makeText(getApplicationContext(),""+keu+""+p1[iii].toString(),Toast.LENGTH_SHORT).show();
						}
						if(!pu2[iii].equals(""))
						{
							seat[keu]=pu2[iii].toString();
						    keu++;
						  //  Toast.makeText(getApplicationContext(),""+keu+""+p2[iii].toString(),Toast.LENGTH_SHORT).show();
						}
						if(!pu3[iii].equals(""))
						{
							seat[keu]=pu3[iii].toString();
							keu++;
							//Toast.makeText(getApplicationContext(),""+keu+""+p3[iii].toString(),Toast.LENGTH_SHORT).show();
						}
						if(!pu4[iii].equals(""))
						{
							seat[keu]=pu4[iii].toString();
							keu++;
							//Toast.makeText(getApplicationContext(),""+keu+""+p4[iii].toString(),Toast.LENGTH_SHORT).show();
						}
						if(!pu5[iii].equals(""))
						{
							seat[keu]=pu5[iii].toString();
							keu++;
						}
						
					}
					
					if(keu<rest)
					{
						Toast.makeText(getApplicationContext(),"Select your seat.",Toast.LENGTH_SHORT).show();
					}
					else
					{
						bundle=new Bundle();
						bundle2=new Bundle();
						
						bundle2.putStringArray("key1",aa);
						bundle.putStringArray("key",seat);
					
						try
						{
							Intent isb1 = new Intent(SleeperSeating.this,PassengerDetails.class);
							isb1.putExtras(bundle);
							isb1.putExtras(bundle2);
							
							startActivity(isb1);
							
						}
						catch(Exception e)
						{
							e.printStackTrace();
						}
					}
					
					
				
				
				//Toast.makeText(getApplicationContext(),seat[0].toString()+seat[1].toString()+seat[2].toString(),Toast.LENGTH_SHORT).show();
			}
		});
		
c1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(f<rest)
				{
				if(c1.isChecked())
				{
					
			//		Toast.makeText(getApplicationContext(),c1.getText(),Toast.LENGTH_SHORT).show();
					for(int k=0;k<3;k++)
					{
						if(!c1.getText().equals(p[k]))
						{
					p1[0]=c1.getText().toString();
					c1.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
						f++;
						break;
						}
					}
				}
				else
				{c1.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
					f--;
				p1[0]="";	
				}
				}
				else
				{
					if(!c1.isChecked())
					{
						f--;
						c1.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
						p1[0]="";
					}
					else
					{
						c1.setChecked(false);
					Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
					}
				}
			}
		});
c2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				if(f<rest)
				{
				if(c2.isChecked())
				{
					c2.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
				//	Toast.makeText(getApplicationContext(),c2.getText(),Toast.LENGTH_SHORT).show();
					for(int k=0;k<3;k++)
					{
						if(!c2.getText().equals(p[k]))
						{
					p1[1]=c2.getText().toString();
					c2.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
					
						f++;
						break;
						}
					}
				}
				else
				{
					f--;
				p1[1]="";
				c2.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
				}
				}
				else
				{
					if(!c2.isChecked())
					{
						f--;
						p1[1]="";
						c2.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
					}
					else
					{
						c2.setChecked(false);
					Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
					}
				}
			}
		});
c3.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		if(f<rest)
		{
		if(c3.isChecked())
		{
			c3.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
			//Toast.makeText(getApplicationContext(),c3.getText(),Toast.LENGTH_SHORT).show();
			for(int k=0;k<3;k++)
			{
				if(!c3.getText().equals(p[k]))
				{
			p1[2]=c3.getText().toString();
			c3.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
			
				f++;
				break;
				}
			}
		}
		else
		{
			f--;
		p1[2]="";	
		c3.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		}
		}
		else
		{
			if(!c3.isChecked())
			{
				f--;
				p1[2]="";
				c3.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
			}
			
			else
			{
				c3.setChecked(false);
			Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
			}
		}
	}
});
c4.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		if(f<rest)
		{
		if(c4.isChecked())
		{
			c4.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
			//Toast.makeText(getApplicationContext(),c4.getText(),Toast.LENGTH_SHORT).show();
			for(int k=0;k<3;k++)
			{
				if(!c4.getText().equals(p[k]))
				{
			p2[0]=c4.getText().toString();
			c4.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
			
				f++;
				break;
				}
			}
		}
		else
		{
			f--;
		p2[0]="";	
		c4.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		}
		}
		else
		{
			if(!c4.isChecked())
			{
				f--;
				p2[0]="";
				c4.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
			}
			else
			{
			Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
			c4.setChecked(false);
			}
		}
	}
});
c5.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		if(f<rest)
		{
		if(c5.isChecked())
		{
			c5.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
			//Toast.makeText(getApplicationContext(),c4.getText(),Toast.LENGTH_SHORT).show();
			for(int k=0;k<3;k++)
			{
				if(!c5.getText().equals(p[k]))
				{
			p2[1]=c5.getText().toString();
			c5.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
				f++;
				break;
				}
			}
		}
		else
		{
			f--;
		p2[1]="";	
		c5.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		}
		}
		else
		{
			if(!c5.isChecked())
			{
				f--;
				p2[1]="";
				c5.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
			}
			else
			{
				c5.setChecked(false);
			Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
			} 
		}
	}
});
c6.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(f<rest)
		{
		if(c6.isChecked())
		{
			c6.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
			//Toast.makeText(getApplicationContext(),c6.getText(),Toast.LENGTH_SHORT).show();
			for(int k=0;k<3;k++)
			{
				if(!c6.getText().equals(p[k]))
				{
			p2[2]=c6.getText().toString();
			
				f++;
				break;
				}
			}
		}
		else
		{c6.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
			f--;
		p2[2]="";	
		}
		}
		else
		{
			if(!c6.isChecked())
			{
				f--;
				c6.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
				p2[2]="";
			}
			else
			{
				c6.setChecked(false);
			Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
			}
		}
	}
});

c7.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(f<rest)
		{
		if(c7.isChecked())
		{
			c7.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
			//Toast.makeText(getApplicationContext(),c7.getText(),Toast.LENGTH_SHORT).show();
			for(int k=0;k<3;k++)
			{
				if(!c7.getText().equals(p[k]))
				{
			p3[0]=c7.getText().toString();
			
				f++;
				break;
				}
			}
		}
		else
		{c7.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
			f--;
		p3[0]="";	
		}
		}
		else
		{
			if(!c7.isChecked())
			{
				f--;
				c7.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
				p3[0]="";
			}
			else
			{
				c7.setChecked(false);
			Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
			}
		}
	}
});

c8.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(f<rest)
		{
		if(c8.isChecked())
		{
			c8.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
			//Toast.makeText(getApplicationContext(),c8.getText(),Toast.LENGTH_SHORT).show();
			for(int k=0;k<3;k++)
			{
				if(!c8.getText().equals(p[k]))
				{
			p3[1]=c8.getText().toString();
			
				f++;
				break;
				}
			}
		}
		else
		{c8.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
			f--;
		p3[1]="";	
		}
		}
		else
		{
			if(!c8.isChecked())
			{
				f--;
				c8.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
				p3[1]="";
			}
			else
			{
				c8.setChecked(false);
			Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
			}
		}
	}
});

c9.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(f<rest)
		{
		if(c9.isChecked())
		{
			c9.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
			//Toast.makeText(getApplicationContext(),c9.getText(),Toast.LENGTH_SHORT).show();
			for(int k=0;k<3;k++)
			{
				if(!c9.getText().equals(p[k]))
				{
			p3[2]=c9.getText().toString();
			
				f++;
				break;
				}
			}
		}
		else
		{c9.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
			f--;
		p3[2]="";	
		}
		}
		else
		{
			if(!c9.isChecked())
			{
				f--;
				c9.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
				p3[2]="";
			}
			else
			{
				c9.setChecked(false);
			Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
			}
		}
	}
});
c10.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(f<rest)
		{
		if(c10.isChecked())
		{
			c10.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
			//Toast.makeText(getApplicationContext(),c10.getText(),Toast.LENGTH_SHORT).show();
			for(int k=0;k<3;k++)
			{
				if(!c10.getText().equals(p[k]))
				{
			p4[0]=c10.getText().toString();
			
				f++;
				break;
				}
			}
		}
		else
		{c10.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
			f--;
		p4[0]="";	
		}
		}
		else
		{
			if(!c10.isChecked())
			{
				f--;
				c10.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
				p4[0]="";
			}
			else
			{
				c10.setChecked(false);
			Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
			}
		}
	}
});

c11.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(f<rest)
		{
		if(c11.isChecked())
		{
			c11.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
			//Toast.makeText(getApplicationContext(),c11.getText(),Toast.LENGTH_SHORT).show();
			for(int k=0;k<3;k++)
			{
				if(!c11.getText().equals(p[k]))
				{
			p4[1]=c11.getText().toString();
			
				f++;
				break;
				}
			}
		}
		else
		{c11.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
			f--;
		p4[1]="";	
		}
		}
		else
		{
			if(!c11.isChecked())
			{
				f--;
				c11.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
				p4[1]="";
			}
			else
			{
				c11.setChecked(false);
			Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
			}
		}
	}
});
c12.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		if(f<rest)
		{
		if(c12.isChecked())
		{
			c12.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
			//Toast.makeText(getApplicationContext(),c12.getText(),Toast.LENGTH_SHORT).show();
			for(int k=0;k<3;k++)
			{
				if(!c12.getText().equals(p[k]))
				{
			p4[2]=c12.getText().toString();
			
				f++;
				break;
				}
			}
		}
		else
		{
			f--;
		p4[2]="";
		c12.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		}
		}
		else
		{
			if(!c12.isChecked())
			{
				f--;
				p4[2]="";
				c12.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
			}
			else
			{
				c12.setChecked(false);
			Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
			}
		}
	}
});
c13.setOnClickListener(new OnClickListener() {

@Override
public void onClick(View v) {
// TODO Auto-generated method stub

if(f<rest)
{
if(c13.isChecked())
{
	c13.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
	//Toast.makeText(getApplicationContext(),c13.getText(),Toast.LENGTH_SHORT).show();
	for(int k=0;k<3;k++)
	{
		if(!c13.getText().equals(p[k]))
		{
	p5[0]=c13.getText().toString();
	
		f++;
		break;
		}
	}
}
else
{
	f--;
p5[0]="";	
c13.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
}
}
else
{
	if(!c13.isChecked())
	{
		f--;
		p5[0]="";
		c13.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
	}
	
	else
	{
		c13.setChecked(false);
	Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
	}
}
}
});
c14.setOnClickListener(new OnClickListener() {

@Override
public void onClick(View v) {
// TODO Auto-generated method stub

if(f<rest)
{
if(c14.isChecked())
{
	c14.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
	//Toast.makeText(getApplicationContext(),c14.getText(),Toast.LENGTH_SHORT).show();
	for(int k=0;k<3;k++)
	{
		if(!c14.getText().equals(p[k]))
		{
	p5[1]=c14.getText().toString();
	
		f++;
		break;
		}
	}
}
else
{
	f--;
p5[1]="";	
c14.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
}
}
else
{
	if(!c14.isChecked())
	{
		f--;
		p5[1]="";
		c14.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
	}
	else
	{
	Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
	c14.setChecked(false);
	}
}
}
});
c15.setOnClickListener(new OnClickListener() {

@Override
public void onClick(View v) {
// TODO Auto-generated method stub

if(f<rest)
{
if(c15.isChecked())
{
	c15.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
	//Toast.makeText(getApplicationContext(),c4.getText(),Toast.LENGTH_SHORT).show();
	for(int k=0;k<3;k++)
	{
		if(!c15.getText().equals(p[k]))
		{
	p5[2]=c15.getText().toString();
	
		f++;
		break;
		}
	}
}
else
{
	f--;
p5[2]="";	
c15.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
}
}
else
{
	if(!c15.isChecked())
	{
		f--;
		p5[2]="";
		c15.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
	}
	else
	{
		c15.setChecked(false);
	Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
	} 
}
}
});

cu1.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(f<rest)
		{
		if(cu1.isChecked())
		{
			
		//	Toast.makeText(getApplicationContext(),cu1.getText(),Toast.LENGTH_SHORT).show();
			for(int k=0;k<3;k++)
			{
				if(!cu1.getText().equals(p[k]))
				{
			pu1[0]=cu1.getText().toString();
			cu1.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
				f++;
				break;
				}
			}
		}
		else
		{cu1.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
			f--;
		pu1[0]="";	
		}
		}
		else
		{
			if(!cu1.isChecked())
			{
				f--;
				cu1.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
				pu1[0]="";
			}
			else
			{
				cu1.setChecked(false);
			Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
			}
		}
	}
});
cu2.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		if(f<rest)
		{
		if(cu2.isChecked())
		{
			cu2.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
			//Toast.makeText(getApplicationContext(),cu2.getText(),Toast.LENGTH_SHORT).show();
			for(int k=0;k<3;k++)
			{
				if(!cu2.getText().equals(p[k]))
				{
			pu1[1]=cu2.getText().toString();
			cu2.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
			
				f++;
				break;
				}
			}
		}
		else
		{
			f--;
		pu1[1]="";
		cu2.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		}
		}
		else
		{
			if(!cu2.isChecked())
			{
				f--;
				pu1[1]="";
				cu2.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
			}
			else
			{
				cu2.setChecked(false);
			Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
			}
		}
	}
});
cu3.setOnClickListener(new OnClickListener() {

@Override
public void onClick(View v) {
// TODO Auto-generated method stub

if(f<rest)
{
if(cu3.isChecked())
{
	cu3.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
	//Toast.makeText(getApplicationContext(),cu3.getText(),Toast.LENGTH_SHORT).show();
	for(int k=0;k<3;k++)
	{
		if(!cu3.getText().equals(p[k]))
		{
	pu1[2]=cu3.getText().toString();
	cu3.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
	
		f++;
		break;
		}
	}
}
else
{
	f--;
pu1[2]="";	
cu3.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
}
}
else
{
	if(!cu3.isChecked())
	{
		f--;
		pu1[2]="";
		cu3.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
	}
	
	else
	{
		cu3.setChecked(false);
	Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
	}
}
}
});
cu4.setOnClickListener(new OnClickListener() {

@Override
public void onClick(View v) {
// TODO Auto-generated method stub

if(f<rest)
{
if(cu4.isChecked())
{
	cu4.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
	//Toast.makeText(getApplicationContext(),cu4.getText(),Toast.LENGTH_SHORT).show();
	for(int k=0;k<3;k++)
	{
		if(!cu4.getText().equals(p[k]))
		{
	pu2[0]=cu4.getText().toString();
	cu4.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
	
		f++;
		break;
		}
	}
}
else
{
	f--;
pu2[0]="";	
cu4.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
}
}
else
{
	if(!cu4.isChecked())
	{
		f--;
		pu2[0]="";
		cu4.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
	}
	else
	{
	Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
	cu4.setChecked(false);
	}
}
}
});
cu5.setOnClickListener(new OnClickListener() {

@Override
public void onClick(View v) {
// TODO Auto-generated method stub

if(f<rest)
{
if(cu5.isChecked())
{
	cu5.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
	//Toast.makeText(getApplicationContext(),c4.getText(),Toast.LENGTH_SHORT).show();
	for(int k=0;k<3;k++)
	{
		if(!cu5.getText().equals(p[k]))
		{
	pu2[1]=cu5.getText().toString();
	cu5.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
		f++;
		break;
		}
	}
}
else
{
	f--;
pu2[1]="";	
cu5.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
}
}
else
{
	if(!cu5.isChecked())
	{
		f--;
		pu2[1]="";
		cu5.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
	}
	else
	{
		cu5.setChecked(false);
	Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
	} 
}
}
});
cu6.setOnClickListener(new OnClickListener() {

@Override
public void onClick(View v) {
// TODO Auto-generated method stub
if(f<rest)
{
if(cu6.isChecked())
{
	cu6.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
	//Toast.makeText(getApplicationContext(),cu6.getText(),Toast.LENGTH_SHORT).show();
	for(int k=0;k<3;k++)
	{
		if(!cu6.getText().equals(p[k]))
		{
	pu2[2]=cu6.getText().toString();
	
		f++;
		break;
		}
	}
}
else
{cu6.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
	f--;
pu2[2]="";	
}
}
else
{
	if(!cu6.isChecked())
	{
		f--;
		cu6.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		pu2[2]="";
	}
	else
	{
		cu6.setChecked(false);
	Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
	}
}
}
});

cu7.setOnClickListener(new OnClickListener() {

@Override
public void onClick(View v) {
// TODO Auto-generated method stub
if(f<rest)
{
if(cu7.isChecked())
{
	cu7.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
	//Toast.makeText(getApplicationContext(),cu7.getText(),Toast.LENGTH_SHORT).show();
	for(int k=0;k<3;k++)
	{
		if(!cu7.getText().equals(p[k]))
		{
	pu3[0]=cu7.getText().toString();
	
		f++;
		break;
		}
	}
}
else
{cu7.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
	f--;
pu3[0]="";	
}
}
else
{
	if(!cu7.isChecked())
	{
		f--;
		cu7.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		pu3[0]="";
	}
	else
	{
		cu7.setChecked(false);
	Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
	}
}
}
});

cu8.setOnClickListener(new OnClickListener() {

@Override
public void onClick(View v) {
// TODO Auto-generated method stub
if(f<rest)
{
if(cu8.isChecked())
{
	cu8.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
	//Toast.makeText(getApplicationContext(),cu8.getText(),Toast.LENGTH_SHORT).show();
	for(int k=0;k<3;k++)
	{
		if(!cu8.getText().equals(p[k]))
		{
	pu3[1]=cu8.getText().toString();
	
		f++;
		break;
		}
	}
}
else
{cu8.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
	f--;
pu3[1]="";	
}
}
else
{
	if(!cu8.isChecked())
	{
		f--;
		cu8.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		pu3[1]="";
	}
	else
	{
		cu8.setChecked(false);
	Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
	}
}
}
});

cu9.setOnClickListener(new OnClickListener() {

@Override
public void onClick(View v) {
// TODO Auto-generated method stub
if(f<rest)
{
if(cu9.isChecked())
{
	cu9.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
	//Toast.makeText(getApplicationContext(),cu9.getText(),Toast.LENGTH_SHORT).show();
	for(int k=0;k<3;k++)
	{
		if(!cu9.getText().equals(p[k]))
		{
	pu3[2]=cu9.getText().toString();
	
		f++;
		break;
		}
	}
}
else
{cu9.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
	f--;
pu3[2]="";	
}
}
else
{
	if(!cu9.isChecked())
	{
		f--;
		cu9.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		pu3[2]="";
	}
	else
	{
		cu9.setChecked(false);
	Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
	}
}
}
});
cu10.setOnClickListener(new OnClickListener() {

@Override
public void onClick(View v) {
// TODO Auto-generated method stub
if(f<rest)
{
if(cu10.isChecked())
{
	cu10.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
	//Toast.makeText(getApplicationContext(),cu10.getText(),Toast.LENGTH_SHORT).show();
	for(int k=0;k<3;k++)
	{
		if(!cu10.getText().equals(p[k]))
		{
	pu4[0]=cu10.getText().toString();
	
		f++;
		break;
		}
	}
}
else
{cu10.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
	f--;
pu4[0]="";	
}
}
else
{
	if(!cu10.isChecked())
	{
		f--;
		cu10.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		pu4[0]="";
	}
	else
	{
		cu10.setChecked(false);
	Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
	}
}
}
});

cu11.setOnClickListener(new OnClickListener() {

@Override
public void onClick(View v) {
// TODO Auto-generated method stub
if(f<rest)
{
if(cu11.isChecked())
{
	cu11.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
	//Toast.makeText(getApplicationContext(),cu11.getText(),Toast.LENGTH_SHORT).show();
	for(int k=0;k<3;k++)
	{
		if(!cu11.getText().equals(p[k]))
		{
	pu4[1]=cu11.getText().toString();
	
		f++;
		break;
		}
	}
}
else
{cu11.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
	f--;
pu4[1]="";	
}
}
else
{
	if(!cu11.isChecked())
	{
		f--;
		cu11.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		pu4[1]="";
	}
	else
	{
		cu11.setChecked(false);
	Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
	}
}
}
});
cu12.setOnClickListener(new OnClickListener() {

@Override
public void onClick(View v) {
// TODO Auto-generated method stub

if(f<rest)
{
if(cu12.isChecked())
{
	cu12.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
	//Toast.makeText(getApplicationContext(),cu12.getText(),Toast.LENGTH_SHORT).show();
	for(int k=0;k<3;k++)
	{
		if(!cu12.getText().equals(p[k]))
		{
	pu4[2]=cu12.getText().toString();
	
		f++;
		break;
		}
	}
}
else
{
	f--;
pu4[2]="";
cu12.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
}
}
else
{
	if(!cu12.isChecked())
	{
		f--;
		pu4[2]="";
		cu12.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
	}
	else
	{
		cu12.setChecked(false);
	Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
	}
}
}
});
cu13.setOnClickListener(new OnClickListener() {

@Override
public void onClick(View v) {
//TODO Auto-generated method stub

if(f<rest)
{
if(cu13.isChecked())
{
cu13.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
//Toast.makeText(getApplicationContext(),cu13.getText(),Toast.LENGTH_SHORT).show();
for(int k=0;k<3;k++)
{
if(!cu13.getText().equals(p[k]))
{
pu5[0]=cu13.getText().toString();

f++;
break;
}
}
}
else
{
f--;
pu5[0]="";	
cu13.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
}
}
else
{
if(!cu13.isChecked())
{
f--;
pu5[0]="";
cu13.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
}

else
{
cu13.setChecked(false);
Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
}
}
}
});
cu14.setOnClickListener(new OnClickListener() {

@Override
public void onClick(View v) {
//TODO Auto-generated method stub

if(f<rest)
{
if(cu14.isChecked())
{
cu14.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
//Toast.makeText(getApplicationContext(),cu14.getText(),Toast.LENGTH_SHORT).show();
for(int k=0;k<3;k++)
{
if(!cu14.getText().equals(p[k]))
{
pu5[1]=cu14.getText().toString();

f++;
break;
}
}
}
else
{
f--;
pu5[1]="";	
cu14.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
}
}
else
{
if(!cu14.isChecked())
{
f--;
pu5[1]="";
cu14.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
}
else
{
Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
cu14.setChecked(false);
}
}
}
});
cu15.setOnClickListener(new OnClickListener() {

@Override
public void onClick(View v) {
//TODO Auto-generated method stub

if(f<rest)
{
if(cu15.isChecked())
{
cu15.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
//Toast.makeText(getApplicationContext(),c4.getText(),Toast.LENGTH_SHORT).show();
for(int k=0;k<3;k++)
{
if(!cu15.getText().equals(p[k]))
{
pu5[2]=cu15.getText().toString();

f++;
break;
}
}
}
else
{
f--;
pu5[2]="";	
cu15.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
}
}
else
{
if(!cu15.isChecked())
{
f--;
pu5[2]="";
cu15.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
}
else
{
cu15.setChecked(false);
Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
} 
}
}
});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sleeper_seating, menu);
		return true;
	}
	private class AsyncCallWS extends AsyncTask<String, Void, Void> {

		@Override
		protected Void doInBackground(String... params) {
			Log.i("DAta send",argd[2]+"@"+argd[0]);
			ans = Background.busreservedseat(argd[2]+"@"+argd[0],"Busreservedseat1");
			
			return null;
		}

		@Override
		protected void onPostExecute(Void result) {
	int oo=0;
			if(ans[0].toString().equals("Error"))
			{	
				msg.setVisibility(View.VISIBLE);
			    msg.setText("Please login again.");
			}
			else if(oo==Integer.parseInt(ans[0].toString()))
			{
				msg.setVisibility(View.VISIBLE);
				msg.setText("");
				p=new String[1];
				p[0]="";
			}
				
			else
			{
				oo=Integer.parseInt(ans[0].toString());
				
				p=new String[oo];
				for(int h=0;h<oo;h++)
				{
					p[h]=ans[h+1];
					Log.i("seat", p[h].toString());
				}
				reserved(oo);
				
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
	public void reserved(int o)
	{
		
		for(int j=0;j<o;j++)
		{
			if(c1.getText().equals(p[j]))
			{
				c1.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				c1.setClickable(false);
			}
			if(c2.getText().equals(p[j]))
			{
				c2.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				c2.setClickable(false);
			}
			if(c3.getText().equals(p[j]))
			{
				c3.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				c3.setClickable(false);
			}
			if(c4.getText().equals(p[j]))
			{
				c4.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				c4.setClickable(false);
			}
			if(c5.getText().equals(p[j]))
			{
				c5.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				c5.setClickable(false);
			}
			if(c6.getText().equals(p[j]))
			{
				c6.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				c6.setClickable(false);
			}
			if(c7.getText().equals(p[j]))
			{
				c7.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				c7.setClickable(false);
			}
			if(c8.getText().equals(p[j]))
			{
				c8.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				c8.setClickable(false);
			}
			if(c9.getText().equals(p[j]))
			{
				c9.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				c9.setClickable(false);
			}
			if(c10.getText().equals(p[j]))
			{
				c10.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				c10.setClickable(false);
			}
			if(c11.getText().equals(p[j]))
			{
				c11.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				c11.setClickable(false);
			}
			if(c12.getText().equals(p[j]))
			{
				c12.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				c12.setClickable(false);
			}
			if(c13.getText().equals(p[j]))
			{
				c13.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				c13.setClickable(false);
			}
			if(c14.getText().equals(p[j]))
			{
				c14.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				c1.setClickable(false);
			}
			if(c15.getText().equals(p[j]))
			{
				c15.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				c15.setClickable(false);
			}
			if(cu1.getText().equals(p[j]))
			{
				cu1.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				cu1.setClickable(false);
			}
			if(cu2.getText().equals(p[j]))
			{
				cu2.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				cu2.setClickable(false);
			}
			if(cu3.getText().equals(p[j]))
			{
				cu3.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				cu3.setClickable(false);
			}
			if(cu4.getText().equals(p[j]))
			{
				cu4.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				cu4.setClickable(false);
			}
			if(cu5.getText().equals(p[j]))
			{
				cu5.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				cu5.setClickable(false);
			}
			if(cu6.getText().equals(p[j]))
			{
				cu6.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				cu6.setClickable(false);
			}
			if(cu7.getText().equals(p[j]))
			{
				cu7.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				cu7.setClickable(false);
			}
			if(cu8.getText().equals(p[j]))
			{
				cu8.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				cu8.setClickable(false);
			}
			if(cu9.getText().equals(p[j]))
			{
				cu9.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				cu9.setClickable(false);
			}
			if(cu10.getText().equals(p[j]))
			{
				cu10.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				cu10.setClickable(false);
			}
			if(cu11.getText().equals(p[j]))
			{
				cu11.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				cu11.setClickable(false);
			}
			if(cu12.getText().equals(p[j]))
			{
				cu12.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				cu12.setClickable(false);
			}
			if(cu13.getText().equals(p[j]))
			{
				cu13.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				cu13.setClickable(false);
			}
			if(cu14.getText().equals(p[j]))
			{
				cu14.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				cu1.setClickable(false);
			}
			if(cu15.getText().equals(p[j]))
			{
				cu15.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				cu15.setClickable(false);
			}
		
		
	
		}

	}
	@Override
	public void onBackPressed()
	{
	    this.finish();  
	}

}
