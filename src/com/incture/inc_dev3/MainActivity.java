package com.incture.inc_dev3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final EditText username=(EditText)findViewById(R.id.user1);
		final EditText pwd=(EditText)findViewById(R.id.pwd1);
		final TextView login=(TextView)findViewById(R.id.login);
		
		
	login.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			if(username.getText().toString().trim().equals("") && pwd.getText().toString().equals(""))
			{
			Toast.makeText(getApplicationContext(), "Enter your username and password", Toast.LENGTH_LONG).show();;	
			}
			else if(pwd.getText().toString().equals(""))
			{
			//	Log.v(pwd.getText().toString().trim(), "password");
				Toast.makeText(getApplicationContext(), "Enter your password", Toast.LENGTH_LONG).show();;	
			}
			
			else if(username.getText().toString().trim().equals(""))
			{
				Toast.makeText(getApplicationContext(), "Enter username", Toast.LENGTH_LONG).show();;	
			}
			
			else{
			Intent intent=new Intent(MainActivity.this, SecondActivity.class);
			String usernamevalue=username.getText().toString();
			intent.putExtra("usernamevalue", usernamevalue);
			startActivity(intent);}
			
			
		}
	});
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
