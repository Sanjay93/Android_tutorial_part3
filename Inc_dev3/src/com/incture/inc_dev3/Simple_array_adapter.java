package com.incture.inc_dev3;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class Simple_array_adapter  extends ArrayAdapter<String>
{
	Context c;
	ArrayList<String> data=null;
	public Simple_array_adapter(Context context, int r_id, ArrayList<String> arr_data) {
		super(context, r_id, arr_data);
		
		// TODO Auto-generated constructor stub
		this.c=context;
		this.data=arr_data;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		
		View v=convertView;
		if(v==null)
		{
			LayoutInflater inflator=(LayoutInflater)c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			v=inflator.inflate(R.layout.list_item,null);
			
		}
		String z=data.get(position);
		TextView text=(TextView) v.findViewById(R.id.text37);
		text.setText(z);
		return v;
	//	return super.getView(position, convertView, parent);
	
	}

}
