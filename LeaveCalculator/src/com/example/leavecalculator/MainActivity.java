package com.example.leavecalculator;


import android.os.Bundle;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.text.Editable;

public class MainActivity extends Activity {

	EditText FirstValue;
	EditText SecondValue;
	TextView Result,txtSpace;
	Button Calculate,Helpbunk;
	float num1 , num2;
	@Override
	public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_main);
	FirstValue = (EditText) findViewById(R.id.EditText01);
	SecondValue = (EditText) findViewById(R.id.EditText02);
	Result = (TextView) findViewById(R.id.TextView01);
	Result.setText("0.00");
	txtSpace = (TextView) findViewById(R.id.txtSpace01);
	Calculate = (Button) findViewById(R.id.Button01);
	Helpbunk = (Button) findViewById(R.id.Button02);
	
	
	//Adding listener to button
	Calculate.setOnClickListener(new View.OnClickListener() {
	public void onClick(View v) {
	//Getting first & second values and passing to show result
	showResult(FirstValue.getText(), SecondValue.getText());
	}
	});
	
	Helpbunk.setOnClickListener(new View.OnClickListener() {
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			
			if(v.getId() == R.id.Button02)
	         {
				ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);
                progressDialog.setMessage("Loading...");
                progressDialog.show();
	             Intent intent= new Intent(MainActivity.this,HelpBunking.class);
	             startActivity(intent);      
	         }
		}
	});
	}
	protected void showResult(Editable first, Editable second)
	{
	float num1 = Float.parseFloat(first.toString());
	float num2 = Float.parseFloat(second.toString());
	float result1 = (num1/100) * num2;
	float result2 = num2-(int)result1;
	Result.setText(String.valueOf(result2));
	txtSpace.setText("Days/Classes you can bunk");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
