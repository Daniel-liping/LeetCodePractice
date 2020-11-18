package com.lp.util;

import java.util.ArrayList;
import java.util.List;

public class ListNoGeneric
{
	public static void main(String[] args)
	{
		// 比较 List、List<Object>、List<?> 的区别
		List list1 = new ArrayList();
		list1.add(new Object());
		list1.add(new Integer(1));
		list1.add(new String("Hello World"));
		

		List<Object> list2 = list1;
		list2.add(new Object());
		list2.add(new Integer(1));
		list2.add(new String("Hello World"));
		

		List<Integer> list3 = list1;
//		list3.add(new Object());
		list3.add(new Integer(1));
//		list3.add(new String("Hello World"));
		

		List<?> list4 = list1;
		list4.remove(0);
//		list4.add(new Object());
		
	}
}
