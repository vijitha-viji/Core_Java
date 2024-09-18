package coreJava;

public class ZuoraTest {
	
	public static void main(String[] args) {
		
		ZuoraTest zt = new ZuoraTest();
		double[]  a1= {12.3,45.6,12.8,67,45.9};
		zt.ascendOrder(a1);
		
		
	}


	
	public void ascendOrder(double[] a1)
	{
		//double[]  a1= {12.3,45.6,12.8,67,45.9};
		double sum = 0 ;
		for(int i=0; i<a1.length;i++)
		{
			
			for(int j=i+1;j<a1.length;j++)
			{
				if(a1[i]>a1[j])
				{
				    sum=a1[i];
				    a1[i]=a1[j];
				    a1[j]=sum;
				}
			
				
		}
		
		System.out.println(a1[i]);	
	}
	}
}

