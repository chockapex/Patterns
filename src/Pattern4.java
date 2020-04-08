import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		sc.close();
		int i, j, k;
		for(i = -(num - 1) ; i <= (num - 1) ; i++) {
			for(j = 0 ; j < Math.abs(i) ; j++) {
				System.out.print(" ");
			}
			for(k = Math.abs(i) ; k < num ; k++) {
				System.out.print(-Math.abs(i) + num);
			}
			System.out.println();
		}
	}

}
