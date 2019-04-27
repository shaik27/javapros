package org.cts;

import java.util.ArrayList;
import java.util.List;

public class Sample {
	public int sum(int a,int b)
	{
		return a+b;
	}
	List<Integer> getIntegers()
	{
		List<Integer> nos=new ArrayList<Integer>();
		nos.add(10);
		nos.add(20);
		return nos;
	}
	public int[] getArray()
	{
		int a[]={10,20,30};
		return a;
	}
}
