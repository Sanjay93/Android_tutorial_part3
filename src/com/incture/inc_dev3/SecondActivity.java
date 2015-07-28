package com.incture.inc_dev3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends Activity{
	TextView username;
	Button button;
	
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);
		final TextView username=(TextView) findViewById(R.id.back);
		Intent intent=getIntent();
	String uname=intent.getStringExtra("usernamevalue");
	username.setText(uname);
	Button button1=(Button) findViewById(R.id.button);
	button1.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			//onBackPressed();
			Intent intent=new Intent(SecondActivity.this, ThirdActivity.class);
			
			startActivity(intent);
		}
	});
	}
	

}
