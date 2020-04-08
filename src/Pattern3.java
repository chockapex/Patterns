import static java.lang.System.*;

import java.util.Scanner;
public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		out.print("Enter the number: ");
		int num = sc.nextInt();
		sc.close();
		int i, j;
		for(i = 1 ; i <= num ; i++) {
			for(j = num ; j >= 1 ; j--) {
				if(j>i) {
					out.print(" ");
				}
				else {
					out.print(i+" ");
				}
			}
			out.println();
		}
	}

}
