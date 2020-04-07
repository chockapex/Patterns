import java.util.Scanner;
public class Pattern1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i, j, k;
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		sc.close();
		for(i = 1 ; i <= num ; i++) {
			for(j = num ; j > i ; j--) {
				System.out.print(" ");
			}
			for(k = 1 ; k <= i ; k++) {
				System.out.print(k);
			}
			System.out.println();
		}
	}

}
