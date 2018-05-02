package cn.pyc.ch06.exercise;

//一个Java文件中只能有一个public 类，且访问权限为public的类名要与文件名一致
//其他类可以为包访问权限
//类的访问权限只能为public 或者 包访问权限（默认不加任何字符/friendly表示）
class Soup1{
	private Soup1(){}	//构造函数，访问权限为private，所以无法直接用构造函数创建新对象
	
	public static Soup1 makeSoup(){
		return new Soup1();
	}
	
	public String toString(){
		return "返回Soup1对象";
	}
}
	
//单例模式
class Soup2{
	private Soup2(){}	//将构造函数设置为private
		
	private static Soup2 ps1 = new Soup2(); 	//创建一个对象赋值给引用，并将这个引用设置为private
	
	public static Soup2 access(){		//可供调用的函数，返回创建的此类唯一对象的引用
		return ps1;
	}	
	
	public void f(){
		System.out.println("通过创建的单例对象，调用方法！");
	}
}


//一个Java文件中只能有一个public 类
public class Example_Lunch {
	void testPrivate(){
		//无法创建对象，构造函数为private
		//Soup1 soup = new Soup1();
	}
	
	void testStatic(){
		Soup1 soup = Soup1.makeSoup();
		System.out.println(soup);
	}
	
	void testSingleton(){
		Soup2.access().f();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example_Lunch test = new Example_Lunch();
		test.testStatic();
		test.testSingleton();
	}

}
