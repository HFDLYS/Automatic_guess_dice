package com.huaji.HFDLYS;

import android.app.*;
import android.os.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		Huaji('大',3);
    }
	static void Huaji(char w,int time)
	{
		if (w == '大')
		{	
			int c =0;
			for(int e = 0;e<time;e++)
			{
				int d =((int)(6*Math.random()) +1);
				System.out.println(d);
				if(d > 3)
				{
					c++;
				}
			}
			if(c >= time/2 +1)
			{
				System.out.println("我赢了");
			}
			else
			{
				System.out.println("我gg了");	
			}
		}
		else
		{
			int c =0;
			for(int e = 0;e<time;e++)
			{
				int d =((int)(6*Math.random()) +1);
				System.out.println(d);
				if(d <= 3)
				{
					c++;
				}
			}
			if(c >= time/2 +1)
			{
				System.out.println("我赢了");
			}
			else
			{
				System.out.println("我gg了");	
			}	
		}
	}
}

