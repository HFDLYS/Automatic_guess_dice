package com.huaji.HFDLYS;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.View.*;
import android.view.*;

public class NotSoMainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notsomain);
		Button B1 = (Button) findViewById(R.id.button_1);
		B1.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				
				Toast.makeText(NotSoMainActivity.this,"你输入的是",Toast.LENGTH_LONG).show();
			}
		});
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		getMenuInflater().inflate(R.menu.alittlemain , menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		{
			switch (item.getItemId())
			{
				case R.id.QQ:
					Toast.makeText(this , "作者QQ845388925" ,Toast.LENGTH_SHORT).show();
					break;
				case R.id.leave:
					Toast.makeText(this , "爱玩玩不玩滚" ,Toast.LENGTH_SHORT).show();
					finish();
					break;
				default:
			}
			return true;
		}
	}
}

