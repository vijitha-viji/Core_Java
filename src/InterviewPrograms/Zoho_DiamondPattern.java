package InterviewPrograms;

public class Zoho_DiamondPattern {
//	
//	   *
//	  ***
//	 *****
//	  ***
//	   *
	
	public static void main(String[] args) {
		 int n = 7; // Total height of the diamond (must be odd)
	        printDiamond(n);
	}
	
	public static void printDiamond(int n) {
        if (n % 2 == 0) {
            System.out.println("The height of the diamond must be an odd number.");
            return;
        }

        int mid = n / 2; // Middle index for the maximum stars

        // Print upper half including the middle line
        for (int i = 0; i <= mid; i++) {
            for (int j = 0; j < mid - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Print lower half
        for (int i = mid - 1; i >= 0; i--) {
            for (int j = 0; j < mid - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

}
}
