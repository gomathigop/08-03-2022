package stringBufferandstrindBuilder;

public class Example4 {
	public static void main(String[] args) 
	{
		
		StringBuffer name1 = new StringBuffer("Welcome to Tamil Nadu");
		
		System.out.println("StringBuffer");
		
		System.out.println(name1.indexOf("to"));
		
		System.out.println(name1.indexOf("Tamil Nadu"));
		
        StringBuilder name2 = new StringBuilder("Welcome Home");
        
        System.out.println("StringBuilder");
        
		System.out.println(name2.indexOf("Welcome"));
		
		System.out.println(name2.indexOf("Home"));


	}


}
