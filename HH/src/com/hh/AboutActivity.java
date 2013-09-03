package com.hh;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class AboutActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hh2);
        TextView txtInfo = (TextView)findViewById(R.id.info);
	    
        String FIO = getIntent().getExtras().getString("FIO");
        String Prof = getIntent().getExtras().getString("Prof");
        String DOB = getIntent().getExtras().getString("DOB");
        String Salary = getIntent().getExtras().getString("Salary");
        String Sex = getIntent().getExtras().getString("Sex");  
        String Phone = getIntent().getExtras().getString("Phone");
        String Email = getIntent().getExtras().getString("Email");
        
        txtInfo.setText("You " + FIO + " , being a " + Sex + ", born " + DOB + ", applying for a " + Prof + "with a salary of " + Salary + " Contact information:" + Phone + "," + Email + ".");
    }
    public void OnClick(View v){       	
    	        	 Toast.makeText(this, "Submitted", Toast.LENGTH_LONG).show();
    	}
}
