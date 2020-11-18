package com.lp.util;

import java.util.HashMap;
import java.util.Map;

public class MapUtil
{
	public static void main(String[] args)
	{
		Map<String, String> map = new HashMap<String, String>();
		map.put("A", "one");
		map.put("B", "two");
		map.put("C", "three");
		
		// 返回Map类对象的Key的Set视图
		System.out.println("*************map.keySet():" + map.keySet());
		// 返回Value集合的Collection视图
		System.out.println("*************map.values():" + map.values());
		// Key-Value对的Set视图
		System.out.println("*************map.entrySet():" + map.entrySet());
		//		*************map.keySet():[A, B, C]
		//		*************map.values():[one, two, three]
		//		*************map.entrySet():[A=one, B=two, C=three]

	}

}
