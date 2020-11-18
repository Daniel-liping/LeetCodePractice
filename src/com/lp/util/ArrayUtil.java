package com.lp.util;

import java.util.Arrays;

public class ArrayUtil
{
	public static void main(String[] args)
	{
		String[] args1 = {"a", "b", "C"};// 静态初始化
		String[] args2 = new String[3];// 动态初始化
		
		// foreach遍历
		for (String str : args1)
		{
			System.out.println("*****str:" + str);
		}
		// JDK8 的函数式接口进行遍历
		Arrays.asList(args1).stream().forEach(x -> System.out.println("*****forEach:" + x));;
		Arrays.asList(args1).stream().forEach(System.out::println);;
	}
}
