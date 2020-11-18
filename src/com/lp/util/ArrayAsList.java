package com.lp.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayAsList
{
	public static void main(String[] args)
	{
		String[] strs = new String[3];// 动态初始化
		strs[0] = "B";
		strs[1] = "C";
		strs[2] = "A";
		
		// 转换成Array
		List<String> strArray = Arrays.asList(strs);
		strArray.set(0, "b");
		for (String string : strArray)
		{
			System.out.println("****strArray:" + string);
		}
		
		// add/remove/clear方法会报错
//		strArray.remove(0);
		//		Exception in thread "main" java.lang.UnsupportedOperationException
		//		at java.util.AbstractList.remove(Unknown Source)
		//		at com.lp.test.ArrayAsList.main(ArrayAsList.java:25)

		// 尽量采用这种方法来将数组编程List
		List<String> strArray2 = new ArrayList<String>(Arrays.asList(strs));
		strArray2.remove(2);
		for (String string : strArray2)
		{
			System.out.println("****strArray2:" + string);
		}
		
	}
	

}
