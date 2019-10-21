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


public class Seating extends Activity {
	CheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24,c25,c26;
	CheckBox c27,c28,c29,c30,c31,c32,c33,c34,c35,c36,c37,c38,c39,c40,c41,c42,c43,c44,c45,c46,c47,c48,c49,c50,c51;
String[] seat;
String[] p;
int fl=0;

Button b1;
Bundle bundle,bundle2;

String[] p1=new String[]{"","","","",""};
String[] p2=new String[]{"","","","",""};
String[] p3=new String[]{"","","","",""};
String[] p4=new String[]{"","","","",""};
String[] p5=new String[]{"","","","",""};
String[] p6=new String[]{"","","","",""};
String[] p7=new String[]{"","","","",""};
String[] p8=new String[]{"","","","",""};
String[] p9=new String[]{"","","","",""};
String[] p10=new String[]{"","","","","",""};
String[] aa=new String[5];
String[] argd,ans;
ProgressBar pr;
TextView msg;
SharedPreferences sharedpreferences;
public static final String MyPREFERENCES = "MyPrefs" ;
public static final String Username = "use"; 
public static final String Name = "tok";
int f=0,keu=0,rest;



	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_seating);
		
		
		argd = getIntent().getExtras().getStringArray("keyda");
		aa=argd;
		rest=Integer.parseInt(argd[1].toString());
		seat=new String[rest];
	//	 Toast.makeText(getApplicationContext(),argd[2].toString(),Toast.LENGTH_SHORT).show();
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
		c16=(CheckBox)findViewById(R.id.checkBox16);
		c17=(CheckBox)findViewById(R.id.checkBox17);
		c18=(CheckBox)findViewById(R.id.checkBox18);
		c19=(CheckBox)findViewById(R.id.checkBox19);
		c20=(CheckBox)findViewById(R.id.checkBox20);
		c21=(CheckBox)findViewById(R.id.checkBox21);
		c22=(CheckBox)findViewById(R.id.checkBox22);
		c23=(CheckBox)findViewById(R.id.checkBox23);
		c24=(CheckBox)findViewById(R.id.checkBox24);
		c25=(CheckBox)findViewById(R.id.checkBox25);
		c26=(CheckBox)findViewById(R.id.checkBox26);
		c27=(CheckBox)findViewById(R.id.checkBox27);
		c28=(CheckBox)findViewById(R.id.checkBox28);
		c29=(CheckBox)findViewById(R.id.checkBox29);
		c30=(CheckBox)findViewById(R.id.checkBox30);
		c31=(CheckBox)findViewById(R.id.checkBox31);
		c32=(CheckBox)findViewById(R.id.checkBox32);
		c33=(CheckBox)findViewById(R.id.checkBox33);
		c34=(CheckBox)findViewById(R.id.checkBox34);
		c35=(CheckBox)findViewById(R.id.checkBox35);
		c36=(CheckBox)findViewById(R.id.checkBox36);
		c37=(CheckBox)findViewById(R.id.checkBox37);
		c38=(CheckBox)findViewById(R.id.checkBox38);
		c39=(CheckBox)findViewById(R.id.checkBox39);
		c40=(CheckBox)findViewById(R.id.checkBox40);
		c41=(CheckBox)findViewById(R.id.checkBox41);
		c42=(CheckBox)findViewById(R.id.checkBox42);
		c43=(CheckBox)findViewById(R.id.checkBox43);
		c44=(CheckBox)findViewById(R.id.checkBox44);
		c45=(CheckBox)findViewById(R.id.checkBox45);
		c46=(CheckBox)findViewById(R.id.checkBox46);
		c47=(CheckBox)findViewById(R.id.checkBox47);
		c48=(CheckBox)findViewById(R.id.checkBox48);
		c49=(CheckBox)findViewById(R.id.checkBox49);
		c50=(CheckBox)findViewById(R.id.checkBox50);
		c51=(CheckBox)findViewById(R.id.checkBox51);
		
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
		c16.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		c17.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		c18.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		c19.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		c20.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		c21.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		c22.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		c23.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		c24.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		c25.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		c26.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		c27.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		c28.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		c29.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		c30.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		c31.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		c32.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		c33.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		c34.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		c35.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		c36.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		c37.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		c38.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		c39.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		c40.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		c41.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		c42.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		c43.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		c44.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		c45.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		c46.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		c47.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		c48.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		c49.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		c50.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		c51.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		AsyncCallWS task = new AsyncCallWS();
        //Call execute 
		new AsyncCallWS().execute();
			
			b1.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					int keu=0;
					fl=0;
						for(int iii=0;iii<5;iii++)
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
							if(!p6[iii].equals(""))
							{
								seat[keu]=p6[iii].toString();
								keu++;
							}
							if(!p7[iii].equals(""))
							{
								seat[keu]=p7[iii].toString();
								keu++;
							}
							if(!p8[iii].equals(""))
							{
								seat[keu]=p8[iii].toString();
								keu++;
							}
							if(!p9[iii].equals(""))
							{
								seat[keu]=p9[iii].toString();
								keu++;
							}
						}
						for(int lll=0;lll<6;lll++)
						{
							if(!p10[lll].equals(""))
							{
								seat[keu]=p10[lll].toString();
								keu++;
							}
						}
						if(keu<rest)
						{
							Toast.makeText(getApplicationContext(),"Select your seat.",Toast.LENGTH_SHORT).show();
						}
						else
						{
							new AsyncCallWS().execute();
							
							for(int jk=0;jk<p.length;jk++)
							{
								for(int ji=0;ji<seat.length;ji++)
								{
								if(p[jk].equals(seat[ji]))
								{
								fl=1;	
								}
								
								}
							}
							if(fl!=1)
							{
							
							bundle=new Bundle();
							bundle2=new Bundle();
							bundle2.putStringArray("key1",aa);
							bundle.putStringArray("key",seat);
							try
							{
								Intent isb1 = new Intent(Seating.this,PassengerDetails.class);
								isb1.putExtras(bundle);
								isb1.putExtras(bundle2);
								startActivity(isb1);
								
							}
							catch(Exception e)
							{
								e.printStackTrace();
							}
							}
							else
							{
								Toast.makeText(getApplicationContext(),"Seat already reserved",Toast.LENGTH_SHORT).show();
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
					
					//Toast.makeText(getApplicationContext(),c1.getText(),Toast.LENGTH_SHORT).show();
					for(int k=0;k<5;k++)
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
					//Toast.makeText(getApplicationContext(),c2.getText(),Toast.LENGTH_SHORT).show();
					for(int k=0;k<5;k++)
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
			for(int k=0;k<5;k++)
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
		//	Toast.makeText(getApplicationContext(),c4.getText(),Toast.LENGTH_SHORT).show();
			for(int k=0;k<5;k++)
			{
				if(!c4.getText().equals(p[k]))
				{
			p1[3]=c4.getText().toString();
			c4.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
			
				f++;
				break;
				}
			}
		}
		else
		{
			f--;
		p1[3]="";	
		c4.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		}
		}
		else
		{
			if(!c4.isChecked())
			{
				f--;
				p1[3]="";
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
			//Toast.makeText(getApplicationContext(),c5.getText(),Toast.LENGTH_SHORT).show();
			for(int k=0;k<5;k++)
			{
				if(!c5.getText().equals(p[k]))
				{
			p1[4]=c5.getText().toString();
			c5.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
				f++;
				break;
				}
			}
		}
		else
		{
			f--;
		p1[4]="";	
		c5.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		}
		}
		else
		{
			if(!c5.isChecked())
			{
				f--;
				p1[4]="";
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
		//	Toast.makeText(getApplicationContext(),c6.getText(),Toast.LENGTH_SHORT).show();
			for(int k=0;k<5;k++)
			{
				if(!c6.getText().equals(p[k]))
				{
			p2[0]=c6.getText().toString();
			
				f++;
				break;
				}
			}
		}
		else
		{c6.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
			f--;
		p2[0]="";	
		}
		}
		else
		{
			if(!c6.isChecked())
			{
				f--;
				c6.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
				p2[0]="";
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
		//	Toast.makeText(getApplicationContext(),c7.getText(),Toast.LENGTH_SHORT).show();
			for(int k=0;k<5;k++)
			{
				if(!c7.getText().equals(p[k]))
				{
			p2[1]=c7.getText().toString();
			
				f++;
				break;
				}
			}
		}
		else
		{c7.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
			f--;
		p2[1]="";	
		}
		}
		else
		{
			if(!c7.isChecked())
			{
				f--;
				c7.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
				p2[1]="";
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
		//	Toast.makeText(getApplicationContext(),c8.getText(),Toast.LENGTH_SHORT).show();
			for(int k=0;k<5;k++)
			{
				if(!c8.getText().equals(p[k]))
				{
			p2[2]=c8.getText().toString();
			
				f++;
				break;
				}
			}
		}
		else
		{c8.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
			f--;
		p2[2]="";	
		}
		}
		else
		{
			if(!c8.isChecked())
			{
				f--;
				c8.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
				p2[2]="";
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
			for(int k=0;k<5;k++)
			{
				if(!c9.getText().equals(p[k]))
				{
			p2[3]=c9.getText().toString();
			
				f++;
				break;
				}
			}
		}
		else
		{c9.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
			f--;
		p2[3]="";	
		}
		}
		else
		{
			if(!c9.isChecked())
			{
				f--;
				c9.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
				p2[3]="";
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
		//	Toast.makeText(getApplicationContext(),c10.getText(),Toast.LENGTH_SHORT).show();
			for(int k=0;k<5;k++)
			{
				if(!c10.getText().equals(p[k]))
				{
			p2[4]=c10.getText().toString();
			
				f++;
				break;
				}
			}
		}
		else
		{c10.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
			f--;
		p2[4]="";	
		}
		}
		else
		{
			if(!c10.isChecked())
			{
				f--;
				c10.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
				p2[4]="";
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
		//	Toast.makeText(getApplicationContext(),c11.getText(),Toast.LENGTH_SHORT).show();
			for(int k=0;k<5;k++)
			{
				if(!c11.getText().equals(p[k]))
				{
			p3[0]=c11.getText().toString();
			
				f++;
				break;
				}
			}
		}
		else
		{c11.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
			f--;
		p3[0]="";	
		}
		}
		else
		{
			if(!c11.isChecked())
			{
				f--;
				c11.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
				p3[0]="";
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
			for(int k=0;k<5;k++)
			{
				if(!c12.getText().equals(p[k]))
				{
			p3[1]=c12.getText().toString();
			
				f++;
				break;
				}
			}
		}
		else
		{
			f--;
		p3[1]="";
		c12.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		}
		}
		else
		{
			if(!c12.isChecked())
			{
				f--;
				p3[1]="";
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
	for(int k=0;k<5;k++)
	{
		if(!c13.getText().equals(p[k]))
		{
	p3[2]=c13.getText().toString();
	
		f++;
		break;
		}
	}
}
else
{
	f--;
p3[2]="";	
c13.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
}
}
else
{
	if(!c13.isChecked())
	{
		f--;
		p3[2]="";
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
	for(int k=0;k<5;k++)
	{
		if(!c14.getText().equals(p[k]))
		{
	p3[3]=c14.getText().toString();
	
		f++;
		break;
		}
	}
}
else
{
	f--;
p3[3]="";	
c14.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
}
}
else
{
	if(!c14.isChecked())
	{
		f--;
		p3[3]="";
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
	for(int k=0;k<5;k++)
	{
		if(!c15.getText().equals(p[k]))
		{
	p3[4]=c15.getText().toString();
	
		f++;
		break;
		}
	}
}
else
{
	f--;
p3[4]="";	
c15.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
}
}
else
{
	if(!c15.isChecked())
	{
		f--;
		p3[4]="";
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
c16.setOnClickListener(new OnClickListener() {

@Override
public void onClick(View v) {
// TODO Auto-generated method stub
if(f<rest)
{
if(c16.isChecked())
{
	c16.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
//	Toast.makeText(getApplicationContext(),c16.getText(),Toast.LENGTH_SHORT).show();
	for(int k=0;k<5;k++)
	{
		if(!c16.getText().equals(p[k]))
		{
	p4[0]=c16.getText().toString();
	
		f++;
		break;
		}
	}
}
else
{c16.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
	f--;
p4[0]="";	
}
}
else
{
	if(!c16.isChecked())
	{
		f--;
		c16.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		p4[0]="";
	}
	else
	{
		c16.setChecked(false);
	Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
	}
}
}
});

c17.setOnClickListener(new OnClickListener() {

@Override
public void onClick(View v) {
// TODO Auto-generated method stub
if(f<rest)
{
if(c17.isChecked())
{
	c17.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
	//Toast.makeText(getApplicationContext(),c17.getText(),Toast.LENGTH_SHORT).show();
	for(int k=0;k<5;k++)
	{
		if(!c17.getText().equals(p[k]))
		{
	p4[1]=c17.getText().toString();
	
		f++;
		break;
		}
	}
}
else
{c17.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
	f--;
p4[1]="";	
}
}
else
{
	if(!c17.isChecked())
	{
		f--;
		c17.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		p4[1]="";
	}
	else
	{
		c17.setChecked(false);
	Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
	}
}
}
});

c18.setOnClickListener(new OnClickListener() {

@Override
public void onClick(View v) {
// TODO Auto-generated method stub
if(f<rest)
{
if(c18.isChecked())
{
	c18.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
//	Toast.makeText(getApplicationContext(),c18.getText(),Toast.LENGTH_SHORT).show();
	for(int k=0;k<5;k++)
	{
		if(!c18.getText().equals(p[k]))
		{
	p4[2]=c18.getText().toString();
	
		f++;
		break;
		}
	}
}
else
{c18.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
	f--;
p4[2]="";	
}
}
else
{
	if(!c18.isChecked())
	{
		f--;
		c18.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		p4[2]="";
	}
	else
	{
		c18.setChecked(false);
	Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
	}
}
}
});

c19.setOnClickListener(new OnClickListener() {

@Override
public void onClick(View v) {
// TODO Auto-generated method stub
if(f<rest)
{
if(c19.isChecked())
{
	c19.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
	//Toast.makeText(getApplicationContext(),c19.getText(),Toast.LENGTH_SHORT).show();
	for(int k=0;k<5;k++)
	{
		if(!c19.getText().equals(p[k]))
		{
	p4[3]=c19.getText().toString();
	
		f++;
		break;
		}
	}
}
else
{c19.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
	f--;
p4[3]="";	
}
}
else
{
	if(!c19.isChecked())
	{
		f--;
		c19.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		p4[3]="";
	}
	else
	{
		c19.setChecked(false);
	Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
	}
}
}
});
c20.setOnClickListener(new OnClickListener() {

@Override
public void onClick(View v) {
// TODO Auto-generated method stub
if(f<rest)
{
if(c20.isChecked())
{
	c20.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
//	Toast.makeText(getApplicationContext(),c20.getText(),Toast.LENGTH_SHORT).show();
	for(int k=0;k<5;k++)
	{
		if(!c20.getText().equals(p[k]))
		{
	p4[4]=c20.getText().toString();
	
		f++;
		break;
		}
	}
}
else
{c20.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
	f--;
p4[4]="";	
}
}
else
{
	if(!c20.isChecked())
	{
		f--;
		c20.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		p4[4]="";
	}
	else
	{
		c20.setChecked(false);
	Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
	}
}
}
});

c21.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(f<rest)
		{
		if(c21.isChecked())
		{
			c21.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
	//		Toast.makeText(getApplicationContext(),c21.getText(),Toast.LENGTH_SHORT).show();
			for(int k=0;k<5;k++)
			{
				if(!c21.getText().equals(p[k]))
				{
			p5[0]=c21.getText().toString();
			
				f++;
				break;
				}
			}
		}
		else
		{c21.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
			f--;
		p5[0]="";	
		}
		}
		else
		{
			if(!c21.isChecked())
			{
				f--;
				c21.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
				p5[0]="";
			}
			else
			{
				c21.setChecked(false);
			Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
			}
		}
	}
});
c22.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		if(f<rest)
		{
		if(c22.isChecked())
		{
			c22.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
		//	Toast.makeText(getApplicationContext(),c22.getText(),Toast.LENGTH_SHORT).show();
			for(int k=0;k<5;k++)
			{
				if(!c22.getText().equals(p[k]))
				{
			p5[1]=c22.getText().toString();
			
				f++;
				break;
				}
			}
		}
		else
		{
			f--;
		p5[1]="";
		c22.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		}
		}
		else
		{
			if(!c22.isChecked())
			{
				f--;
				p5[1]="";
				c22.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
			}
			else
			{
				c22.setChecked(false);
			Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
			}
		}
	}
});
c23.setOnClickListener(new OnClickListener() {

@Override
public void onClick(View v) {
// TODO Auto-generated method stub

if(f<rest)
{
if(c23.isChecked())
{
	c23.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
	//Toast.makeText(getApplicationContext(),c23.getText(),Toast.LENGTH_SHORT).show();
	for(int k=0;k<5;k++)
	{
		if(!c23.getText().equals(p[k]))
		{
	p5[2]=c23.getText().toString();
	
		f++;
		break;
		}
	}
}
else
{
	f--;
p5[2]="";	
c23.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
}
}
else
{
	if(!c23.isChecked())
	{
		f--;
		p5[2]="";
		c23.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
	}
	
	else
	{
		c23.setChecked(false);
	Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
	}
}
}
});
c24.setOnClickListener(new OnClickListener() {

@Override
public void onClick(View v) {
// TODO Auto-generated method stub

if(f<rest)
{
if(c24.isChecked())
{
	c24.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
	//Toast.makeText(getApplicationContext(),c24.getText(),Toast.LENGTH_SHORT).show();
	for(int k=0;k<5;k++)
	{
		if(!c24.getText().equals(p[k]))
		{
	p5[3]=c24.getText().toString();
	
		f++;
		break;
		}
	}
}
else
{
	f--;
p5[3]="";	
c24.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
}
}
else
{
	if(!c24.isChecked())
	{
		f--;
		p5[3]="";
		c24.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
	}
	else
	{
	Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
	c24.setChecked(false);
	}
}
}
});
c25.setOnClickListener(new OnClickListener() {

@Override
public void onClick(View v) {
// TODO Auto-generated method stub

if(f<rest)
{
if(c25.isChecked())
{
	c25.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
	//Toast.makeText(getApplicationContext(),c4.getText(),Toast.LENGTH_SHORT).show();
	for(int k=0;k<5;k++)
	{
		if(!c25.getText().equals(p[k]))
		{
	p5[4]=c25.getText().toString();
	
		f++;
		break;
		}
	}
}
else
{
	f--;
p5[4]="";	
c25.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
}
}
else
{
	if(!c25.isChecked())
	{
		f--;
		p5[4]="";
		c25.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
	}
	else
	{
		c25.setChecked(false);
	Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
	} 
}
}
});
c26.setOnClickListener(new OnClickListener() {

@Override
public void onClick(View v) {
// TODO Auto-generated method stub
if(f<rest)
{
if(c26.isChecked())
{
	c26.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
	//Toast.makeText(getApplicationContext(),c26.getText(),Toast.LENGTH_SHORT).show();
	for(int k=0;k<5;k++)
	{
		if(!c26.getText().equals(p[k]))
		{
	p6[0]=c26.getText().toString();
	
		f++;
		break;
		}
	}
}
else
{c26.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
	f--;
p6[0]="";	
}
}
else
{
	if(!c26.isChecked())
	{
		f--;
		c26.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		p6[0]="";
	}
	else
	{
		c26.setChecked(false);
	Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
	}
}
}
});

c27.setOnClickListener(new OnClickListener() {

@Override
public void onClick(View v) {
// TODO Auto-generated method stub
if(f<rest)
{
if(c27.isChecked())
{
	c27.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
	//Toast.makeText(getApplicationContext(),c27.getText(),Toast.LENGTH_SHORT).show();
	for(int k=0;k<5;k++)
	{
		if(!c27.getText().equals(p[k]))
		{
	p6[1]=c27.getText().toString();
	
		f++;
		break;
		}
	}
}
else
{c27.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
	f--;
p6[1]="";	
}
}
else
{
	if(!c27.isChecked())
	{
		f--;
		c27.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		p6[1]="";
	}
	else
	{
		c27.setChecked(false);
	Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
	}
}
}
});

c28.setOnClickListener(new OnClickListener() {

@Override
public void onClick(View v) {
// TODO Auto-generated method stub
if(f<rest)
{
if(c28.isChecked())
{
	c28.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
	//Toast.makeText(getApplicationContext(),c28.getText(),Toast.LENGTH_SHORT).show();
	for(int k=0;k<5;k++)
	{
		if(!c28.getText().equals(p[k]))
		{
	p6[2]=c28.getText().toString();
	
		f++;
		break;
		}
	}
}
else
{c28.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
	f--;
p6[2]="";	
}
}
else
{
	if(!c28.isChecked())
	{
		f--;
		c28.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		p6[2]="";
	}
	else
	{
		c28.setChecked(false);
	Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
	}
}
}
});

c29.setOnClickListener(new OnClickListener() {

@Override
public void onClick(View v) {
// TODO Auto-generated method stub
if(f<rest)
{
if(c29.isChecked())
{
	c29.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
	//Toast.makeText(getApplicationContext(),c29.getText(),Toast.LENGTH_SHORT).show();
	for(int k=0;k<5;k++)
	{
		if(!c29.getText().equals(p[k]))
		{
	p6[3]=c29.getText().toString();
	
		f++;
		break;
		}
	}
}
else
{c29.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
	f--;
p6[3]="";	
}
}
else
{
	if(!c29.isChecked())
	{
		f--;
		c29.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		p6[3]="";
	}
	else
	{
		c29.setChecked(false);
	//Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
	}
}
}
});
c30.setOnClickListener(new OnClickListener() {

@Override
public void onClick(View v) {
// TODO Auto-generated method stub
if(f<rest)
{
if(c30.isChecked())
{
	c30.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
	//Toast.makeText(getApplicationContext(),c30.getText(),Toast.LENGTH_SHORT).show();
	for(int k=0;k<5;k++)
	{
		if(!c30.getText().equals(p[k]))
		{
	p6[4]=c30.getText().toString();
	
		f++;
		break;
		}
	}
}
else
{c30.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
	f--;
p6[4]="";	
}
}
else
{
	if(!c30.isChecked())
	{
		f--;
		c30.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		p6[4]="";
	}
	else
	{
		c30.setChecked(false);
	Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
	}
}
}
});

c31.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(f<rest)
		{
		if(c31.isChecked())
		{
			c31.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
		//	Toast.makeText(getApplicationContext(),c31.getText(),Toast.LENGTH_SHORT).show();
			for(int k=0;k<5;k++)
			{
				if(!c31.getText().equals(p[k]))
				{
			p7[0]=c31.getText().toString();
			
				f++;
				break;
				}
			}
		}
		else
		{c31.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
			f--;
		p7[0]="";	
		}
		}
		else
		{
			if(!c31.isChecked())
			{
				f--;
				c31.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
				p7[0]="";
			}
			else
			{
				c31.setChecked(false);
			Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
			}
		}
	}
});
c32.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		if(f<rest)
		{
		if(c32.isChecked())
		{
			c32.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
			//Toast.makeText(getApplicationContext(),c32.getText(),Toast.LENGTH_SHORT).show();
			for(int k=0;k<5;k++)
			{
				if(!c32.getText().equals(p[k]))
				{
			p7[1]=c32.getText().toString();
			
				f++;
				break;
				}
			}
		}
		else
		{
			f--;
		p7[1]="";
		c32.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		}
		}
		else
		{
			if(!c32.isChecked())
			{
				f--;
				p7[1]="";
				c32.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
			}
			else
			{
				c32.setChecked(false);
			//Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
			}
		}
	}
});
c33.setOnClickListener(new OnClickListener() {

@Override
public void onClick(View v) {
// TODO Auto-generated method stub

if(f<rest)
{
if(c33.isChecked())
{
	c33.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
	//Toast.makeText(getApplicationContext(),c33.getText(),Toast.LENGTH_SHORT).show();
	for(int k=0;k<5;k++)
	{
		if(!c33.getText().equals(p[k]))
		{
	p7[2]=c33.getText().toString();
	
		f++;
		break;
		}
	}
}
else
{
	f--;
p7[2]="";	
c33.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
}
}
else
{
	if(!c33.isChecked())
	{
		f--;
		p7[2]="";
		c33.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
	}
	
	else
	{
		c33.setChecked(false);
	Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
	}
}
}
});
c34.setOnClickListener(new OnClickListener() {

@Override
public void onClick(View v) {
// TODO Auto-generated method stub

if(f<rest)
{
if(c34.isChecked())
{
	c34.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
	//Toast.makeText(getApplicationContext(),c34.getText(),Toast.LENGTH_SHORT).show();
	for(int k=0;k<5;k++)
	{
		if(!c34.getText().equals(p[k]))
		{
	p7[3]=c34.getText().toString();
	
		f++;
		break;
		}
	}
}
else
{
	f--;
p7[3]="";	
c34.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
}
}
else
{
	if(!c34.isChecked())
	{
		f--;
		p7[3]="";
		c34.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
	}
	else
	{
	Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
	c34.setChecked(false);
	}
}
}
});
c35.setOnClickListener(new OnClickListener() {

@Override
public void onClick(View v) {
// TODO Auto-generated method stub

if(f<rest)
{
if(c35.isChecked())
{
	c35.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
	//Toast.makeText(getApplicationContext(),c4.getText(),Toast.LENGTH_SHORT).show();
	for(int k=0;k<5;k++)
	{
		if(!c35.getText().equals(p[k]))
		{
	p7[4]=c35.getText().toString();
	
		f++;
		break;
		}
	}
}
else
{
	f--;
p7[4]="";	
c35.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
}
}
else
{
	if(!c35.isChecked())
	{
		f--;
		p7[4]="";
		c35.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
	}
	else
	{
		c35.setChecked(false);
	Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
	} 
}
}
});
c36.setOnClickListener(new OnClickListener() {

@Override
public void onClick(View v) {
// TODO Auto-generated method stub
if(f<rest)
{
if(c36.isChecked())
{
	c36.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
	//Toast.makeText(getApplicationContext(),c36.getText(),Toast.LENGTH_SHORT).show();
	for(int k=0;k<5;k++)
	{
		if(!c36.getText().equals(p[k]))
		{
	p8[0]=c36.getText().toString();
	
		f++;
		break;
		}
	}
}
else
{c36.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
	f--;
p8[0]="";	
}
}
else
{
	if(!c36.isChecked())
	{
		f--;
		c36.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		p8[0]="";
	}
	else
	{
		c36.setChecked(false);
	Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
	}
}
}
});

c37.setOnClickListener(new OnClickListener() {

@Override
public void onClick(View v) {
// TODO Auto-generated method stub
if(f<rest)
{
if(c37.isChecked())
{
	c37.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
	//Toast.makeText(getApplicationContext(),c37.getText(),Toast.LENGTH_SHORT).show();
	for(int k=0;k<5;k++)
	{
		if(!c37.getText().equals(p[k]))
		{
	p8[1]=c37.getText().toString();
	
		f++;
		break;
		}
	}
}
else
{c37.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
	f--;
p8[1]="";	
}
}
else
{
	if(!c37.isChecked())
	{
		f--;
		c37.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		p8[1]="";
	}
	else
	{
		c37.setChecked(false);
	Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
	}
}
}
});

c38.setOnClickListener(new OnClickListener() {

@Override
public void onClick(View v) {
// TODO Auto-generated method stub
if(f<rest)
{
if(c38.isChecked())
{
	c38.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
	//Toast.makeText(getApplicationContext(),c38.getText(),Toast.LENGTH_SHORT).show();
	for(int k=0;k<5;k++)
	{
		if(!c38.getText().equals(p[k]))
		{
	p8[2]=c38.getText().toString();
	
		f++;
		break;
		}
	}
}
else
{c38.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
	f--;
p8[2]="";	
}
}
else
{
	if(!c38.isChecked())
	{
		f--;
		c38.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		p8[2]="";
	}
	else
	{
		c38.setChecked(false);
	Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
	}
}
}
});

c39.setOnClickListener(new OnClickListener() {

@Override
public void onClick(View v) {
// TODO Auto-generated method stub
if(f<rest)
{
if(c39.isChecked())
{
	c39.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
	//Toast.makeText(getApplicationContext(),c39.getText(),Toast.LENGTH_SHORT).show();
	for(int k=0;k<5;k++)
	{
		if(!c39.getText().equals(p[k]))
		{
	p8[3]=c39.getText().toString();
	
		f++;
		break;
		}
	}
}
else
{c39.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
	f--;
p8[3]="";	
}
}
else
{
	if(!c39.isChecked())
	{
		f--;
		c39.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		p8[3]="";
	}
	else
	{
		c39.setChecked(false);
	Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
	}
}
}
});
c40.setOnClickListener(new OnClickListener() {

@Override
public void onClick(View v) {
// TODO Auto-generated method stub
if(f<rest)
{
if(c40.isChecked())
{
	c40.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
	//Toast.makeText(getApplicationContext(),c40.getText(),Toast.LENGTH_SHORT).show();
	for(int k=0;k<5;k++)
	{
		if(!c40.getText().equals(p[k]))
		{
	p8[4]=c40.getText().toString();
	
		f++;
		break;
		}
	}
}
else
{c40.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
	f--;
p8[4]="";	
}
}
else
{
	if(!c40.isChecked())
	{
		f--;
		c40.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		p8[4]="";
	}
	else
	{
		c40.setChecked(false);
	Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
	}
}
}
});

c41.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(f<rest)
		{
		if(c41.isChecked())
		{
			c41.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
		//	Toast.makeText(getApplicationContext(),c41.getText(),Toast.LENGTH_SHORT).show();
			for(int k=0;k<5;k++)
			{
				if(!c41.getText().equals(p[k]))
				{
			p9[0]=c41.getText().toString();
			
				f++;
				break;
				}
			}
		}
		else
		{c41.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
			f--;
		p9[0]="";	
		}
		}
		else
		{
			if(!c41.isChecked())
			{
				f--;
				c41.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
				p9[0]="";
			}
			else
			{
				c41.setChecked(false);
			Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
			}
		}
	}
});
c42.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		if(f<rest)
		{
		if(c42.isChecked())
		{
			c42.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
			//Toast.makeText(getApplicationContext(),c42.getText(),Toast.LENGTH_SHORT).show();
			for(int k=0;k<5;k++)
			{
				if(!c42.getText().equals(p[k]))
				{
			p9[1]=c42.getText().toString();
			
				f++;
				break;
				}
			}
		}
		else
		{
			f--;
		p9[1]="";
		c42.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		}
		}
		else
		{
			if(!c42.isChecked())
			{
				f--;
				p9[1]="";
				c42.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
			}
			else
			{
				c42.setChecked(false);
			Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
			}
		}
	}
});
c43.setOnClickListener(new OnClickListener() {

@Override
public void onClick(View v) {
// TODO Auto-generated method stub

if(f<rest)
{
if(c43.isChecked())
{
	c43.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
	//Toast.makeText(getApplicationContext(),c43.getText(),Toast.LENGTH_SHORT).show();
	for(int k=0;k<5;k++)
	{
		if(!c43.getText().equals(p[k]))
		{
	p9[2]=c43.getText().toString();
	
		f++;
		break;
		}
	}
}
else
{
	f--;
p9[2]="";	
c43.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
}
}
else
{
	if(!c43.isChecked())
	{
		f--;
		p9[2]="";
		c43.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
	}
	
	else
	{
		c43.setChecked(false);
	Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
	}
}
}
});
c44.setOnClickListener(new OnClickListener() {

@Override
public void onClick(View v) {
// TODO Auto-generated method stub

if(f<rest)
{
if(c44.isChecked())
{
	c44.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
	//Toast.makeText(getApplicationContext(),c44.getText(),Toast.LENGTH_SHORT).show();
	for(int k=0;k<5;k++)
	{
		if(!c44.getText().equals(p[k]))
		{
	p9[3]=c44.getText().toString();
	
		f++;
		break;
		}
	}
}
else
{
	f--;
p9[3]="";	
c44.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
}
}
else
{
	if(!c44.isChecked())
	{
		f--;
		p9[3]="";
		c44.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
	}
	else
	{
	Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
	c44.setChecked(false);
	}
}
}
});
c45.setOnClickListener(new OnClickListener() {

@Override
public void onClick(View v) {
// TODO Auto-generated method stub

if(f<rest)
{
if(c45.isChecked())
{
	c45.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
	//Toast.makeText(getApplicationContext(),c4.getText(),Toast.LENGTH_SHORT).show();
	for(int k=0;k<5;k++)
	{
		if(!c45.getText().equals(p[k]))
		{
	p9[4]=c45.getText().toString();
	
		f++;
		break;
		}
	}
}
else
{
	f--;
p9[4]="";	
c45.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
}
}
else
{
	if(!c45.isChecked())
	{
		f--;
		p9[4]="";
		c45.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
	}
	else
	{
		c45.setChecked(false);
	Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
	} 
}
}
});
c46.setOnClickListener(new OnClickListener() {

@Override
public void onClick(View v) {
// TODO Auto-generated method stub
if(f<rest)
{
if(c46.isChecked())
{
	c46.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
	//Toast.makeText(getApplicationContext(),c46.getText(),Toast.LENGTH_SHORT).show();
	for(int k=0;k<5;k++)
	{
		if(!c46.getText().equals(p[k]))
		{
	p10[0]=c46.getText().toString();
	
		f++;
		break;
		}
	}
}
else
{c46.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
	f--;
p10[0]="";	
}
}
else
{
	if(!c46.isChecked())
	{
		f--;
		c46.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		p10[0]="";
	}
	else
	{
		c46.setChecked(false);
	Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
	}
}
}
});

c47.setOnClickListener(new OnClickListener() {

@Override
public void onClick(View v) {
// TODO Auto-generated method stub
if(f<rest)
{
if(c47.isChecked())
{
	c47.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
	//Toast.makeText(getApplicationContext(),c47.getText(),Toast.LENGTH_SHORT).show();
	for(int k=0;k<5;k++)
	{
		if(!c47.getText().equals(p[k]))
		{
	p10[1]=c47.getText().toString();
	
		f++;
		break;
		}
	}
}
else
{c47.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
	f--;
p10[1]="";	
}
}
else
{
	if(!c47.isChecked())
	{
		f--;
		c47.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		p10[1]="";
	}
	else
	{
		c47.setChecked(false);
	Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
	}
}
}
});

c48.setOnClickListener(new OnClickListener() {

@Override
public void onClick(View v) {
// TODO Auto-generated method stub
if(f<rest)
{
if(c48.isChecked())
{
	c48.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
	//Toast.makeText(getApplicationContext(),c48.getText(),Toast.LENGTH_SHORT).show();
	for(int k=0;k<5;k++)
	{
		if(!c48.getText().equals(p[k]))
		{
	p10[2]=c48.getText().toString();
	
		f++;
		break;
		}
	}
}
else
{c48.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
	f--;
p10[2]="";	
}
}
else
{
	if(!c48.isChecked())
	{
		f--;
		c48.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		p10[2]="";
	}
	else
	{
		c48.setChecked(false);
	Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
	}
}
}
});

c49.setOnClickListener(new OnClickListener() {

@Override
public void onClick(View v) {
// TODO Auto-generated method stub
if(f<rest)
{
if(c49.isChecked())
{
	c49.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
	//Toast.makeText(getApplicationContext(),c49.getText(),Toast.LENGTH_SHORT).show();
	for(int k=0;k<5;k++)
	{
		if(!c49.getText().equals(p[k]))
		{
	p10[3]=c49.getText().toString();
	
		f++;
		break;
		}
	}
}
else
{c49.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
	f--;
p10[3]="";	
}
}
else
{
	if(!c49.isChecked())
	{
		f--;
		c49.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		p10[3]="";
	}
	else
	{
		c49.setChecked(false);
	Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
	}
}
}
});
c50.setOnClickListener(new OnClickListener() {

@Override
public void onClick(View v) {
// TODO Auto-generated method stub
if(f<rest)
{
if(c50.isChecked())
{
	c50.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
	//Toast.makeText(getApplicationContext(),c50.getText(),Toast.LENGTH_SHORT).show();
	for(int k=0;k<5;k++)
	{
		if(!c50.getText().equals(p[k]))
		{
	p10[4]=c50.getText().toString();
	
		f++;
		break;
		}
	}
}
else
{c50.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
	f--;
p10[4]="";	
}
}
else
{
	if(!c50.isChecked())
	{
		f--;
		c50.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		p10[4]="";
	}
	else
	{
		c50.setChecked(false);
	Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
	}
}
}
});
c51.setOnClickListener(new OnClickListener() {

@Override
public void onClick(View v) {
// TODO Auto-generated method stub
if(f<rest)
{
if(c51.isChecked())
{
	c51.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.booked);
	//Toast.makeText(getApplicationContext(),c51.getText(),Toast.LENGTH_SHORT).show();
	for(int k=0;k<5;k++)
	{
		if(!c51.getText().equals(p[k]))
		{
	p10[4]=c51.getText().toString();
	
		f++;
		break;
		}
	}
}
else
{c51.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
	f--;
p10[4]="";	
}
}
else
{
	if(!c51.isChecked())
	{
		f--;
		c51.setButtonDrawable(com.example.gsrtcandroidapps.R.drawable.seatt);
		p10[5]="";
	}
	else
	{
		c51.setChecked(false);
	Toast.makeText(getApplicationContext(),"Max. Seat Selected.",Toast.LENGTH_SHORT).show();
	}
}
}
});

}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.seating, menu);
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
			if(c16.getText().equals(p[j]))
			{
				c16.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				c16.setClickable(false);
			}
			if(c17.getText().equals(p[j]))
			{
				c17.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				c17.setClickable(false);
			}
			if(c18.getText().equals(p[j]))
			{
				c18.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				c18.setClickable(false);
			}
			if(c19.getText().equals(p[j]))
			{
				c19.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				c19.setClickable(false);
			}
			if(c20.getText().equals(p[j]))
			{
				c20.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				c20.setClickable(false);
			}
			if(c21.getText().equals(p[j]))
			{
				c21.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				c21.setClickable(false);
			}
			if(c22.getText().equals(p[j]))
			{
				c22.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				c22.setClickable(false);
			}
			if(c23.getText().equals(p[j]))
			{
				c23.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				c23.setClickable(false);
			}
			if(c24.getText().equals(p[j]))
			{
				c24.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				c24.setClickable(false);
			}
			if(c25.getText().equals(p[j]))
			{
				c25.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				c25.setClickable(false);
			}
			if(c26.getText().equals(p[j]))
			{
				c26.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				c26.setClickable(false);
			}
			if(c27.getText().equals(p[j]))
			{
				c27.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				c27.setClickable(false);
			}
			if(c28.getText().equals(p[j]))
			{
				c28.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				c28.setClickable(false);
			}
			if(c29.getText().equals(p[j]))
			{
				c29.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				c29.setClickable(false);
			}
			if(c30.getText().equals(p[j]))
			{
				c30.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				c30.setClickable(false);
			}
			if(c31.getText().equals(p[j]))
			{
				c31.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				c31.setClickable(false);
			}
			if(c32.getText().equals(p[j]))
			{
				c32.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				c32.setClickable(false);
			}
			if(c33.getText().equals(p[j]))
			{
				c33.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				c33.setClickable(false);
			}
			if(c34.getText().equals(p[j]))
			{
				c34.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				c34.setClickable(false);
			}
			if(c35.getText().equals(p[j]))
			{
				c35.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				c35.setClickable(false);
			}
			if(c36.getText().equals(p[j]))
			{
				c36.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				c36.setClickable(false);
			}
			if(c37.getText().equals(p[j]))
			{
				c37.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				c37.setClickable(false);
			}
			if(c38.getText().equals(p[j]))
			{
				c38.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				c38.setClickable(false);
			}
			if(c39.getText().equals(p[j]))
			{
				c39.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				c39.setClickable(false);
			}
			if(c40.getText().equals(p[j]))
			{
				c40.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				c40.setClickable(false);
			}
			if(c41.getText().equals(p[j]))
			{
				c41.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				c41.setClickable(false);
			}
			if(c42.getText().equals(p[j]))
			{
				c42.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				c42.setClickable(false);
			}
			if(c43.getText().equals(p[j]))
			{
				c43.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				c43.setClickable(false);
			}
			if(c44.getText().equals(p[j]))
			{
				c44.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				c44.setClickable(false);
			}
			if(c45.getText().equals(p[j]))
			{
				c45.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				c45.setClickable(false);
			}
			if(c46.getText().equals(p[j]))
			{
				c46.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				c46.setClickable(false);
			}
			if(c47.getText().equals(p[j]))
			{
				c47.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				c47.setClickable(false);
			}
			if(c48.getText().equals(p[j]))
			{
				c48.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				c48.setClickable(false);
			}
			if(c49.getText().equals(p[j]))
			{
				c49.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				c49.setClickable(false);
			}
			if(c50.getText().equals(p[j]))
			{
				c50.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				c50.setClickable(false);
			}
			if(c51.getText().equals(p[j]))
			{
				c51.setButtonDrawable( com.example.gsrtcandroidapps.R.drawable.icon_booked);
				c51.setClickable(false);
			}
		
	
		}

	}
	@Override
	public void onBackPressed()
	{
	    this.finish();  
	}
}
