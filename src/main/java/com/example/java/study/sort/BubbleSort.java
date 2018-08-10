package com.example.java.study.sort;

import org.junit.jupiter.api.Test;

/**
 * 冒泡排序练习
 *@author renqiangtang1
 *@date 2018/7/30
 */
public class BubbleSort {

	/**
	 *  一、冒泡排序算法的原理如下：
	 *    1.比较相邻的元素。如果第一个比第二个大，就交换他们两个。
	 *    2.对每一对相邻元素做同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。
	 *    3.针对所有的元素重复以上的步骤，除了最后一个。
	 *    4.持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
	 *
	 *  二、冒泡排序法的实现问题：
	 * 	  1.需要两个循环实现相邻元素的对比；
	 *    2.第一个循环的起始值是1，也就是从数组第二个元素开始；
	 *    3.第二个循环的结束值是数组长度减去外层循环的数组index,即是i;
	 *    4.如果第一层循环起始值从0开始会报数组越界的异常；
	 *
	 *  三、冒泡排序性能分析：
	 *     假设参与比较的数组元素个数为 N，则第一轮排序有 N-1 次比较，第二轮有 N-2 次，如此类推，这种序列的求和公式为：
	 *     （N-1）+（N-2）+...+1 = N*（N-1）/2
	 *     当 N 的值很大时，算法比较次数约为 N2/2次比较，忽略减1。
	 *     假设数据是随机的，那么每次比较可能要交换位置，可能不会交换，
	 *     假设概率为50%，那么交换次数为 N2/4。不过如果是最坏的情况，初始数据是逆序的，那么每次比较都要交换位置。
	 *     交换和比较次数都和N2 成正比。由于常数不算大 O 表示法中，忽略 2 和 4，那么冒泡排序运行都需要 O(N2) 时间级别。
	 *     其实无论何时，只要看见一个循环嵌套在另一个循环中，我们都可以怀疑这个算法的运行时间为 O(N2)级，
	 *     外层循环执行 N 次，内层循环对每一次外层循环都执行N次（或者几分之N次）。这就意味着大约需要执行N2次某个基本操作。
	 */
	public   void sort(int [] array){
		System.out.println("------------冒牌排序法实现----------------");

		System.out.print("待排序数组：");
		display(array);
		System.out.println("----------------------------");
		if(array.length <= 0){
			return;
		}else {
			for(int i = 1;i < array.length;i++){
				boolean flag = true;
				for(int j = 0;j < array.length-i;j++){
					if (array[j] > array[j+1]) {
						int temp = array[j];
						array[j] = array[j+1];
						array[j+1] = temp;
						flag = false;
					}
				}
				if(flag){
					break;
				}
				// 第 i轮排序的结果为
				System.out.print("第" + i + "轮排序后的结果为:" );
				display(array);

			}
		}
		System.out.println("----------------------------");

	}

	private  void display(int[] array){

		for(int i = 0;i<array.length ;i++){
			if(i==array.length-1) {
				System.out.print(array[i]);
			}else {

				System.out.print(array[i]+",");
			}
		}
		System.out.println("");
	}

	@Test
	public  void testBubbleSort() throws Exception {
		int [] array ={1,4,0,2,5,3,1,5};
		new BubbleSort().sort(array);
		System.out.print("排序后的结果:");
		new BubbleSort().display(array);
	}
}
