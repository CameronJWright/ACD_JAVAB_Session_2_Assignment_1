package hello.world;
import java.util.Scanner;

public class Max {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a, b, c, max;
		
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		
		max = a;
		if(b>max) {
			max = b;
		}
		if(c>max) {
			max = c;
		}
		System.out.println("The max is : " + max);
		
	}

}
