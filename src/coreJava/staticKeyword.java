package coreJava;

public class staticKeyword {
	
	
	String name;
	String address;
	static String city ;
	 static int i;
	static
	{
		 city = "Chennai";
		i=0;
	}
	
	public staticKeyword(String name, String address1)
	{
		this.name=name;
		this.address= address1;
		i++;
		System.out.println(i);
	}
	
	public void getAddress()
	{
		System.out.println(address + " "+ city);
	}	
	
	public static void getCity()
	{
		System.out.println(city);
	}
	public static void main(String[] args) {
		
		staticKeyword obj = new staticKeyword("Ram", "Urapakkam");
		staticKeyword obj2 = new staticKeyword("John", "Sholinganallur");
		obj.getAddress();
		obj2.getAddress();
		staticKeyword.getCity();
		staticKeyword.i=5;
	}

}
