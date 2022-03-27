package stringBufferandstrindBuilder;

public class Example5 {
	public static void main(String[] args) 
	{
		
		StringBuffer name1 = new StringBuffer("Welcome to India, welcome to chennai");
		
		System.out.println(name1.indexOf("to"));
		
		System.out.println(name1.indexOf("to", 10));

	}

}
