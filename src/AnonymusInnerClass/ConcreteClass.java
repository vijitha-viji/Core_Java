package AnonymusInnerClass;

public class ConcreteClass extends Child {
	
	public static void main(String[] args) {
		
		ConcreteClass cc= new ConcreteClass();
//				{
//			            public void findPartner()
//			            {
//			            	System.out.println("My life my rules from inner class");
//			            }
//				}; 
//				
				
				cc.findPartner();
	}

	@Override
	public void findPartner() {
		System.out.println("My life my rules abstract class");		
	}
	
	
	
	

}
