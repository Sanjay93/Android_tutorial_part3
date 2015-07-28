package com.incture.inc_dev3;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class ThirdActivity extends Activity {
String[] items=null;
ArrayList<String> x;
@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.third);
		ListView listview1=(ListView) findViewById(R.id.list1);
		items=new String[]{"sanjay","preethi","kailash","gokul","hari"};
		
		putItems();
		Simple_array_adapter adp=new Simple_array_adapter(getApplicationContext(),R.layout.list_item,x);
		listview1.setAdapter(adp);
		
		
		//ArrayAdapter<String> adp=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,items);
		listview1.setAdapter(adp);
		listview1.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				if(position==0)
				{
					Intent i= new Intent(getApplicationContext(),MainActivity.class);
					startActivity(i);
				}
				else if(position==1)
				{
					Intent in= new Intent(getApplicationContext(),SecondActivity.class);
					startActivity(in);
				}
				else if(position==2)
				{
					Toast.makeText(getApplicationContext(), "This is a good place",Toast.LENGTH_LONG).show();
				}
				
			}
	
		});
	}

public void putItems()
{
	x=new ArrayList<String>();
	for(int i=0;i<items.length;i++)
	{
		x.add(items[i]); 
	}
}
}
