package InterviewPrograms;

public class AdditionOfNumberFromString {
	public static void main(String[] args) {
		AdditionOfNumberFromString s = new AdditionOfNumberFromString();
		s.numberString();
		
	}
	
	public void numberString()
	{
		String st= "45dfdsd 56gdhdvc 66hg";
		
		String[] numbers = st.split("[^0-9]+");
		int sum=0;
		for (String num : numbers) {
			sum = sum + Integer.parseInt(num);
		}
		System.out.println(sum);
	}

}
