import java.util.Scanner;
import static java.lang.System.*;
public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		out.print("Enter the number: ");
		int num = sc.nextInt();
		sc.close();
		int i, j;
		for(i = 0 ; i < num ; i++) {
			for(j = 1 ; j <= num+i ; j++) {
				if(j == num-i || j == num+i) {
					out.print(i+1);
				}
				else {
					out.print(" ");
				}
			}
			out.println();
		}
	}

}
