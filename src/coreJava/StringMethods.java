package coreJava;

public class StringMethods {
	public static void main(String[] args) {
		String name= "Venba Vasudev";
		
		System.out.println(name.charAt(1));
		System.out.println(name.isEmpty());
		System.out.println(name.substring(5));
		System.out.println(name.substring(6, 12));
		System.out.println(name.contains("z"));
		System.out.println(name.concat("Vijitha"));
		System.out.println(name.equals("Viji"));
		System.out.println(name.equalsIgnoreCase("VENBA"));
		System.out.println(name.length());
		System.out.println(name.replace("V", "B"));
		System.out.println(name.replace("Venba", "Vijitha"));
		System.out.println("IndexOf" + name.indexOf(name));
		System.out.println("Index Of V :"+name.indexOf("u"));
		System.out.println(name.indexOf("V", 4));
		
		
		
		
		
		
	}

}
