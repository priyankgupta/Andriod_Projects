package com.example.leavecalculator;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class HelpBunking extends Activity {
	
	TextView txtview,resView;
	EditText FirstNum,SecondNum;
	Button res;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.secondactivity);
		txtview = (TextView)findViewById(R.id.T1);
		FirstNum = (EditText)findViewById(R.id.EditTxt01);
		res = (Button)findViewById(R.id.Btn01);
		resView = (TextView)findViewById(R.id.TxtView01);
		resView.setText("0.00");
		
		res.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
			//Getting first & second values and passing to show result
			showRes(FirstNum.getText(), SecondNum.getText());
			}
			});
		
		
	}
		
		protected void showRes(Editable first, Editable second)
		{
		float num1 = Float.parseFloat(first.toString());
		float num2 = Float.parseFloat(second.toString());
		float result1 = num2-num1;
		
		if(result1>0)
		{
		Toast.makeText(getApplicationContext(), "OK ENJOY!!",Toast.LENGTH_LONG).show();
		resView.setText(String.valueOf(res));
		}
		else
			Toast.makeText(getApplicationContext(), "No more days/classes left for bunking!!",Toast.LENGTH_LONG).show();	
		
		}
	
	}

