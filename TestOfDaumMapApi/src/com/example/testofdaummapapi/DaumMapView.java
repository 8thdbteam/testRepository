package com.example.testofdaummapapi;



import net.daum.mf.map.api.MapPoint;
import net.daum.mf.map.api.MapView;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;

public class DaumMapView extends Activity implements
		MapView.OpenAPIKeyAuthenticationResultListener,MapView.CurrentLocationEventListener
		{

	private MapView mapView;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		LinearLayout linearLayout = new LinearLayout(this);
		linearLayout.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
		linearLayout.setOrientation(LinearLayout.VERTICAL);

		mapView = new MapView(this);
		mapView.setDaumMapApiKey("612a367127335365215b78b01ff662295e6163f2");
		mapView.setOpenAPIKeyAuthenticationResultListener(this);
		
		/*자기 위치 찾는 버튼 추가*/
		Button btn=new Button(this);
		btn.setText("내위치찾기");
		linearLayout.addView(btn, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
		
		
		linearLayout.addView(mapView);
		
		
		btn.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mapView.setCurrentLocationTrackingMode(MapView.CurrentLocationTrackingMode.TrackingModeOnWithoutHeading); 
			}
			
		});
		/* 맵 타입
		 * mapView.setMapType(MapView.MapType.Hybrid);
		 */
		mapView.setMapType(MapView.MapType.Standard);
		setContentView(linearLayout);
	}

	@Override
	public void onDaumMapOpenAPIKeyAuthenticationResult(MapView arg0, int arg1,
			String arg2) {
		// TODO Auto-generated method stub
		
	}
	

	@Override
	public void onCurrentLocationUpdateFailed(MapView mapView) {
	  // 현위치 갱신 실패 시
	  
	}

	@Override
	public void onCurrentLocationUpdateCancelled(MapView arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onCurrentLocationDeviceHeadingUpdate(MapView arg0, float arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onCurrentLocationUpdate(MapView arg0, MapPoint arg1, float arg2) {
		// TODO Auto-generated method stub
		
	}
}