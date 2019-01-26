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
				EditText T1 = (EditText)findViewById(R.id.text_1);
				String w = T1.getText().toString();
				int time =Integer.parseInt(w);
				String E ="不知道";
				int c = 0;
				String O= " " ;
				
				
				
				
				for(int e = 0 ; e<time ; e++)
					{
						int d =(int)(Math.random()*6)+1;
						Toast.makeText(NotSoMainActivity.this, E ,Toast.LENGTH_SHORT).show();
						O = O + Integer.toString(d);
						if (d > 3)
						{
							c++;
						}
					}
				if (c >= time /2 + 1)
				{
					E = "你赢了";
				}
				else
				{
					E= "你输了";
				}
				
				Toast.makeText(NotSoMainActivity.this,O + E ,Toast.LENGTH_LONG).show();
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

