package com.lp.util;

import java.util.LinkedList;
import java.util.Queue;

public class QueueUtil
{
	public static void main(String[] args)
	{
		Queue<String> queue = new LinkedList<String>();
		queue.offer("aa");
		// 在 Queue 中 poll()和 remove()有什么区别？
		// •	相同点：都是返回第一个元素，并在队列中删除返回的对象。
		// •	不同点：如果没有元素 poll()会返回 null，而 remove()会直接抛出 NoSuchElementException 异常。
		System.out.println("***********queue.size():" + queue.size());
		System.out.println("***********queue.poll():" + queue.poll());
		System.out.println("***********queue.size():" + queue.size());
		System.out.println("***********queue.poll():" + queue.poll());
		System.out.println("***********queue.remove():" + queue.remove());
		System.out.println("***********queue.size():" + queue.size());
	}
	

}
