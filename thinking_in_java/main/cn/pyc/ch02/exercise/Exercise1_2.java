package cn.pyc.ch02.exercise;

/** 
 * @author PiYicheng
 * 创建一个类，它包含一个int域和一个char域，它们都没有被初始化，将它们的值打印出来，以验证Java执行了默认初始化。
 *
 */

public class Exercise1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise1_2 test = new Exercise1_2();
		System.out.println(test.getTestField1());
		System.out.println(test.getTestField1());
	}
	
	private int testField1;
	private char testField2;
	
	public void setTestField1(int testField1) {
		this.testField1 = testField1;
	}
	
	public int getTestField1() {
		return this.testField1;
	}
	
	public void setTestField2(char testField2) {
		this.testField2 = testField2;
	}
	
	public char getTestField2() {
		return this.testField2;
	}

}
