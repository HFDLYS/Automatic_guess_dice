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
				Toast.makeText(NotSoMainActivity.this,"我出千了，你输了",Toast.LENGTH_LONG).show();
			}
		});
	}
}

