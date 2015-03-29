package com.whoztop.ictest;

import com.codename1.ui.Component;
import com.codename1.ui.InfiniteContainer;
import com.codename1.ui.Label;


public class VertIC extends InfiniteContainer
{
	private static final int ITEMS_IN_ONE_GULP = 1000;
	
	public VertIC()
	{
		super(ITEMS_IN_ONE_GULP);
	}

	public Component[] fetchComponents(int index, int amount)
	{
		if (index > (ITEMS_IN_ONE_GULP - 1))
		{
			return null;
		}
		
		Component[] comps = new Component[amount];
		
		for (int i=0; i<amount; i++)
		{
			int cmpCnt = index + i;
			String lblTxt = "My index is: " + cmpCnt;
			Label lbl = new Label(lblTxt);
			lbl.setName(lblTxt);
			comps[i] = lbl;
		}
		
		return comps;
	}
}
