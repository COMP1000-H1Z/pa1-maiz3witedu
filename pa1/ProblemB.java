package pa1;
import java.util.*;
public class ProblemB {

	public static void main(String[] args) {
	Scanner ZM = new Scanner(System.in);
int yard,feet, inches, inchesr, inchesrr;

System.out.println("Enter the number of inches");
inches = ZM.nextInt();

yard = inches/36;
inchesr = inches%36;

feet = inchesr/12;
inchesrr= inchesr%12;

System.out.printf("Yards:%d%n",yard);
System.out.printf("Feet: %d%n", feet);
System.out.printf("Inches: %d%n",inchesrr);

}
}