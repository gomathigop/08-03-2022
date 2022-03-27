package stringBufferandstrindBuilder;

public class Example1 {
	public static void main(String[] args) 
	{
		
		StringBuffer name = new StringBuffer("Gomathi");
		
		System.out.println(name.append(" Gopi"));
		
		System.out.println(name.append(" Viji"));
		
		
		System.out.println("================");
		
		StringBuilder myName = new StringBuilder("kavipriya");
		
		 
		System.out.println(myName.append(" G"));
		
		System.out.println(myName.delete(0,2));
		
		System.out.println(myName.substring(0,5));

	}


}
