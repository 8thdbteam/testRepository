package com.example.testofdaumwebview;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.os.Build;

public class MainActivity extends Activity {
	private WebView webView; 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_main);

		String url="http://dna.daum.net/examples/maps/maps3/mobile_simple.html"; 
			
		webView = (WebView) findViewById(R.id.webview);    
		webView.getSettings().setJavaScriptEnabled(true);     
		webView.setVerticalScrollBarEnabled(true);    
		webView.setHorizontalScrollBarEnabled(true);   
		webView.loadUrl(url); 
	}
}
