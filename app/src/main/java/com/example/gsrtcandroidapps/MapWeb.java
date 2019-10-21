package com.example.gsrtcandroidapps;


import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import static com.example.gsrtcandroidapps.Addip.SERVER_URL;
import android.view.Menu;
import android.webkit.WebView;
import android.webkit.WebViewClient;

@SuppressLint("SetJavaScriptEnabled")
public class MapWeb extends Activity {

	
	static String ip=SERVER_URL;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_web);
		WebView wv = (WebView)findViewById(R.id.my_webview);
		wv.getSettings().setJavaScriptEnabled(true);
		wv.setWebViewClient(new WebViewClient() {
			

				
				
				@Override

				public boolean shouldOverrideUrlLoading(WebView view, String url) {

				view.loadUrl(url);

				return true;

				}

				});

				wv.loadUrl("http://"+ip+"/GSRTC32/Default6.aspx");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.map_web, menu);
		return true;
	}

}
