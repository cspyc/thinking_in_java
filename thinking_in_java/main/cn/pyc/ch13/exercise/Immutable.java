package cn.pyc.ch13.exercise;

public class Immutable {
	//字符串转大写
	public static String upcase(String s) {
		return s.toUpperCase();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String q = "howdy";
		System.out.println(q);		
		
		String qq = upcase(q);	//证明：并不是原字符串转化，而是新建了一个字
		System.out.println(qq);
		System.out.println(q);
		
	}

}
