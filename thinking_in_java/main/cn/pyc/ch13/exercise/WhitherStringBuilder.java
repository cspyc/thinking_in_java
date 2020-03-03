package cn.pyc.ch13.exercise;

public class WhitherStringBuilder {
	
	public String implicit(String[] fields) {
		String result ="";
		//在循环过程中，编译器自动优化，也会创建多个StringBuilder对象
		for(int i=0;i<fields.length;i++) {
			result += fields[i];
		}		
		return result;
	}
	
	public String explicit(String[] fields) {
		StringBuilder result = new StringBuilder();
		for(int i = 0;i<fields.length;i++) {
			result.append(fields[i]);
		}
		return result.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
