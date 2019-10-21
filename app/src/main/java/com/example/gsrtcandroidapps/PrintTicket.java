package com.example.gsrtcandroidapps;

import java.util.List;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import static com.example.gsrtcandroidapps.Addip.SERVER_URL;
import android.widget.Button;

public class PrintTicket extends Activity {

	String[] arg;
	SharedPreferences sharedpreferences;
	public static final String MyPREFERENCES = "MyPrefs" ;
	public static final String Username = "use"; 
	public static final String Name = "tok";
	static String ip=SERVER_URL;
	Button b1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_print_ticket);
		b1=(Button)findViewById(R.id.button1);
		
	arg = getIntent().getExtras().getStringArray("pnr");
		sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
		b1.setOnClickListener(new OnClickListener() {
			
			@SuppressLint("InlinedApi")
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Boolean result=isDownloadManagerAvailable(getApplicationContext());
	            if (result)
	             downloadFile();
				Intent isb1 = new Intent(PrintTicket.this,User_Login.class);
			Log.i("PNR NO: ", arg[0].toString());
				startActivity(isb1);
				finish();
				
			}
		});
	}
	@SuppressLint("NewApi")
	public void downloadFile(){
	     String DownloadUrl = "http://"+ip+"/GSRTC32/printticketfinal.aspx?PNR="+arg[0].toString()+"&User="+sharedpreferences.getString(Username, "")+"";
	    Log.i("ip",DownloadUrl);
	     DownloadManager.Request request = new DownloadManager.Request(Uri.parse(DownloadUrl));
	     request.setDescription("Downloading Ticket..");   //appears the same in Notification bar while downloading
	     request.setTitle(""+sharedpreferences.getString(Username, "")+""+arg[0]+".html");                
	     
	     if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
	         request.allowScanningByMediaScanner();
	         request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
	     }
	     request.setDestinationInExternalPublicDir("/GSRTC Ticket", ""+sharedpreferences.getString(Username, "")+""+arg[0]+".html");
	  
	     // get download service and enqueue file
	     DownloadManager manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
	     manager.enqueue(request);
	 }
	  
	 public static boolean isDownloadManagerAvailable(Context context) {
	     try {
	         if (Build.VERSION.SDK_INT < Build.VERSION_CODES.GINGERBREAD) {
	             return false;
	         }
	         Intent intent = new Intent(Intent.ACTION_MAIN);
	         intent.addCategory(Intent.CATEGORY_LAUNCHER);
	         intent.setClassName("com.android.providers.downloads.ui","com.android.providers.downloads.ui.DownloadList");
	         List <ResolveInfo> list = context.getPackageManager().queryIntentActivities(intent,
	                 PackageManager.MATCH_DEFAULT_ONLY);
	         return list.size() > 0;
	     } catch (Exception e) {
	         return false;
	     }
	 }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.print_ticket, menu);
		return true;
	}

}
