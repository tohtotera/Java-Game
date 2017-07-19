package com.mycompany.myapp;

import android.*;
import android.app.*;
import android.content.res.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import java.util.*;

public class MainActivity extends Activity 
{
	RadioGroup rdo;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
	
		//Get the RadioGroup Instance
		rdo = (RadioGroup)findViewById(R.id.rdo_group);
	}
	
	public void onClick(View view){
		int id = rdo.getCheckedRadioButtonId();
		RadioButton btn = (RadioButton)findViewById(id);
		CharSequence txt = btn.getText();
		Toast.makeText(this,txt,Toast.LENGTH_SHORT).show();
		
	}
}
