package cn.pyc.ch13.exercise;

public class Concatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mango = "mango";
		
		//用于String 的 + 与 += 是java中仅有的两个重载过的操作符
		String s = "abc" + mango + "def" + 47;
		
		System.out.println(s);
	}

}
