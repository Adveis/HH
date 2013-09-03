package com.hh;


import com.hh.R.id;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

 


public class HHActivity extends Activity {

	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hh);
	}



	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.hh, menu);
		return true;
	}

	
	public void onClick(View v)
	{
	    Intent intentt = new Intent(HHActivity.this, AboutActivity.class);
	    final EditText FIO = (EditText)findViewById(R.id.FIO);
	    final EditText Prof = (EditText)findViewById(R.id.Prof);
	    final EditText DOB = (EditText)findViewById(R.id.DOF);
	    final EditText Phone = (EditText)findViewById(R.id.phone);
	    final EditText Salary = (EditText)findViewById(R.id.Salary);
	    final Spinner Sex = (Spinner)findViewById(R.id.sex);
	    final EditText Email = (EditText)findViewById(R.id.email);
	    
		intentt.putExtra("FIO",FIO.getText().toString()); 
		intentt.putExtra("Prof",Prof.getText().toString()); 
		intentt.putExtra("DOB",DOB.getText().toString()); 
		intentt.putExtra("Phone",Phone.getText().toString()); 
		intentt.putExtra("Salary",Salary.getText().toString()); 
		intentt.putExtra("Sex",Sex.getSelectedItem().toString()); 
		intentt.putExtra("Email",Email.getText().toString()); 

		
	    startActivity(intentt);
	}
}

