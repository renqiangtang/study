package com.example.java.study.basetype;

import org.junit.jupiter.api.Test;

import java.util.*;

/**
 *@author renqiangtang1
 *@date 2018/8/8
 */
public class MapTest {

	/**
	 * 一、基本知识点
	 * HashMap 底层是基于数组和链表实现的。其中有两个重要的参数：
	 * 1.容量
	 * 2.负载因子
	 * 容量的默认大小是 16，负载因子是 0.75，当 HashMap 的 size > 16*0.75 时就会发生扩容(容量和负载因子都可以自由调整)。
	 * 二、特点：
	 * 1.HashMap中可以存基本类型，对象，集合，null；
	 * 2.键唯一，值不唯一；
	 * 3.多线程不安全;
	 * 4.HashMap 只能在单线程中使用，并且尽量的预设容量，尽可能的减少扩容。
	 *
	 */
	@Test
	public  void testHashMap() {

		Map<String, Object> map = new HashMap<>(16);
		map.put("key1", 1);
		map.put("key2", null);
		map.put("key3", null);
		map.put("key4", "");
		map.put("key5", new Object());
		//覆盖前一个的内容
		map.put("key5",new StringBuffer("12"));
		map.put("key6",new ArrayList<>());

		//1.第一种：迭代器遍历map
		Iterator<Map.Entry<String, Object>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, Object> next = iterator.next();
			System.out.println("key:" + next.getKey() + ",value:" + next.getValue());
		}

		//2.第二种遍历方式
		Iterator<String> iterators = map.keySet().iterator();
		while (iterators.hasNext()){
			String key = iterator.next().getKey();
			Object value = iterator.next().getValue();
			System.out.println("key:" + key + ",value:" + value);

		}

		//3.第三种遍历方式，jdk1.8及以上版本才支持
		map.forEach((key,value)->System.out.println("key:" + key + ",value:" + value));

	}

	@Test
	public void testHashTable(){
		Map<String, Object> map = new Hashtable<>();
		map.put("key1", 1);
		map.put("key2", null);
		map.put("key3", null);
		map.put("key4", "");
		map.put("key5", new Object());
		//覆盖前一个的内容
		map.put("key5",new StringBuffer("12"));
		map.put("key6",new ArrayList<>());

		//1.第一种：迭代器遍历map
		Iterator<Map.Entry<String, Object>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, Object> next = iterator.next();
			System.out.println("key:" + next.getKey() + ",value:" + next.getValue());
		}

		//2.第二种遍历方式
		Iterator<String> iterators = map.keySet().iterator();
		while (iterators.hasNext()){
			String key = iterator.next().getKey();
			Object value = iterator.next().getValue();
			System.out.println("key:" + key + ",value:" + value);

		}

		//3.第三种遍历方式，jdk1.8及以上版本才支持
		map.forEach((key,value)->System.out.println("key:" + key + ",value:" + value));
	}
}
