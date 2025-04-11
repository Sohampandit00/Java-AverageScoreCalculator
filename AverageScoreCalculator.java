import java.util.Scanner;
public class classAverage
{ public static void main(String[] args){
	Scanner myScan = new Scanner(System.in);

	System.out.println("Enter your first grade: ");
	int grade1 = myScan.nextInt();

	System.out.println("Enter your second grade: ");
	int grade2 = myScan.nextInt();

	System.out.println("Enter your third grade: ");
	int grade3 = myScan.nextInt();

	int sum;
	double average;

	sum = grade1 + grade2 + grade3;

	average = (double)sum/3;

	System.out.println("Your average is: " + average);
	}
}