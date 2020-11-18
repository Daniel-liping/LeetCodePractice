package com.lp.util.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Collection 是一个集合接口，它提供了对集合对象进行基本操作的通用接口方法，所有集合都是它的子类，比如 List、Set 等。
 * Collections 是一个包装类，包含了很多静态方法，不能被实例化，就像一个工具类，比如提供的排序方法： Collections. sort(list)。
 */
public class CollectionUtil
{
	public static void main(String[] args)
	{
		Collections collections = null;//  Collections 是一个包装类，包含了很多静态方法，不能被实例化，就像一个工具类，比如提供的排序方法： Collections. sort(list)。
//		Collection col = null;// Collection 是一个集合接口，它提供了对集合对象进行基本操作的通用接口方法，所有集合都是它的子类，比如 List、Set 等。
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("C");
		list.add("B");
		list.add("E");
		list.add("D");
		for(String val:list) {
			System.out.println("list:" + val);
		}
		Collections.sort(list);// 能进行一定的排序
		for(String val:list) {
			System.out.println("Collections.sort(list):" + val);
		}
	}

}
