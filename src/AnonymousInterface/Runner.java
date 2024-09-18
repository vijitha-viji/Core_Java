package AnonymousInterface;

public abstract class Runner implements IParent {
	public static void main(String[] args) {
		
		IParent obj = new IParent()
		{

			@Override
			public void findPartner() {
				System.out.println("My life my rules");
			}};
				
				
	obj.findPartner();	
		
//		Runner r = new Runner();
//		r.findPartner();
	}

	
}
	
