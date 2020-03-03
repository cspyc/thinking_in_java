package cn.pyc.ch13.exercise;

import java.util.*;

public class InfiniteRecursion_Exercise2 {

	//打印出对象的内存地址
	public String toString() {
		//这样调用,加为“+”,编译器会将this转换成一个String,调用this上的toString()方法，发生递归调用，报错java.lang.StackOverflowError
		//return "InfiniteRecursion address:"+ this  +"\n";  		
		 
		//调用Object上的toString方法
		return "InfiniteRecursion address:"+ super.toString()  +"\n";  
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<InfiniteRecursion_Exercise2> v = new ArrayList<InfiniteRecursion_Exercise2>();
		for(int i = 0;i<10;i++) {
			v.add(new InfiniteRecursion_Exercise2());
		}
		System.out.println(v);
	}

}
