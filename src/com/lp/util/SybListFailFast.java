package com.lp.util;

import java.util.ArrayList;
import java.util.List;

public class SybListFailFast
{
	public static void main(String[] args)
	{
		List<String> masterList = new ArrayList<String>();
		masterList.add("one");
		masterList.add("two");
		masterList.add("three");
		masterList.add("four");
		masterList.add("five");
		
		List<String> branchList = masterList.subList(0, 3);
		
		// 如果下列行数不注释的话，会对branchList的操作有影响
//		masterList.remove(0);
//		masterList.add("ten");
//		masterList.clear();
		
		for (String string : branchList)
		{
			System.out.println("*************string:" + string );
		}
		
		// 下面对 branchList 执行操作
		branchList.clear();
		branchList.add("six");
		branchList.add("seven");
		branchList.remove(0);
		for (String string : branchList)
		{
			System.out.println("*************aa string:" + string );
		}
		
		System.out.println(masterList);
		
	}

}
