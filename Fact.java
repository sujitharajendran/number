package wipro;
import java.util.Scanner;
public class Fact {


	public static void main(String[] args) {
	int fact = 1;
			Scanner s=new Scanner(System.in);
			System.out.println("enter the size");
	     int n=s.nextInt();
		System.out.println("enter the factorial number");
		int s1=s.nextInt();
		for(int i=1;i<=n;i++){
			fact=fact*i;
		}
			System.out.println(fact);
		
	}

}
