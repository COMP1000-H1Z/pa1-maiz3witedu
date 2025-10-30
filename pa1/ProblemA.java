package pa1;
import java.util.*;
public class ProblemA {

	public static void main(String[] args) {
		Scanner ZM = new Scanner(System.in);
		int yards,feet, inches, inch1, inch2, totinches;
		
		System.out.println("Eneter the number of yards");
		yards = ZM.nextInt();
		System.out.println("Enter the number of feet");
		feet = ZM.nextInt();
		System.out.printf("Enter the number of inches");
		inches = ZM.nextInt();
		
			inch1 = yards * 36;
	
			inch2 = feet * 12;
		
		totinches = inch1 + inch2 + inches;
		
		System.out.printf("The total number of inches: %d", totinches);
		

	}

}
