package InterviewPrograms;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		
		SwapTwoNumbers sw= new SwapTwoNumbers();
		sw.withThirdVariable();
		sw.withoutThirdVariable();
	}
	
	public void withThirdVariable()
	{
		int a=10;
		int b=20;
		int temp;
		
		temp=b;
		b=a;
	    a=temp;
		
		System.out.println(a);
		System.out.println(b);
		
		
		
	}
	
	public void withoutThirdVariable()
	{
		int a=20;
		int b=30;
		
		a=a-b; // 20-30 = 10
		b=a+b; //10+30 = 20
		a=b-a;// 10+20 =30
		
		System.out.println(a);
		System.out.println(b);
		
	}

}
