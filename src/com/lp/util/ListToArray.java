package com.lp.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray
{
	public static void main(String[] args)
	{
		List<String> strList = new ArrayList<String>();
		strList.add("one");
		strList.add("two");
		strList.add("three");
		
		// List转换成数组
		Object[] objs = strList.toArray();
		System.out.println("**********objs:" + Arrays.asList(objs));
		
		// 数组比array少
		String[] strs1 = new String[2];
		strList.toArray(strs1);
		System.out.println("**********strs1:" + Arrays.asList(strs1));
		
		// 数组的容量就是取List的长度
		String[] strs2 = new String[strList.size()];
		strList.toArray(strs2);
		System.out.println("**********strs2:" + Arrays.asList(strs2));
		
	}

}
