package cn.pyc.ch13.exercise;

import java.util.*;
import generics.coffee.*;

public class ArrayListDisplay {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ArrayList.toString(),����ArrayList�а��������ж���
		//����ÿ��Ԫ���ϵ�toString()����
		ArrayList<Coffee> coffees = new ArrayList<Coffee>();
		for(Coffee c: new CoffeeGenerator(10)) {
			coffees.add(c);
		}
		System.out.println(coffees);
	}

}