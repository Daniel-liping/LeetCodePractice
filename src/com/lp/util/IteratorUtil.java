package com.lp.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class IteratorUtil
{
	public static void main(String[] args)
	{
		// Iterator 的特点是更加安全，因为它可以确保，在当前遍历的集合元素被更改的时候，就会抛出 ConcurrentModificationException 异常。
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("C");
		list.add("B");
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			Object obj = iterator.next();
			System.out.println("***************obj:" +obj);
		}
		// 怎么确保一个集合不能被修改？
		List<String> list2 = new ArrayList<String>();
		list2.add("x");
		Collection<String> coll = Collections.unmodifiableCollection(list2);
		list2.add("y");
		System.out.println(list2.size());
		}

}
