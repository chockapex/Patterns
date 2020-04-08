import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		sc.close();
		char arr[][] = new char[num][num];
		int right, left, down, up;
		int n = (num % 2 == 0) ? num/2 : (num+1)/2;;
		int spiralCount = 0;
		while(spiralCount < n) {
			char c;
			if(spiralCount % 2 == 0) {
				c = 'X';
			}
			else {
				c = 'O';
			}
			
			for(right = 0 + spiralCount ; right < num - spiralCount ; right++) {
				arr[spiralCount][right] = c;
			}
			for(down = 1 + spiralCount; down < num - spiralCount ; down++) {
				arr[down][num - 1 - spiralCount] = c;
			}
			for(left = num - 2 - spiralCount ; left >= 0 + spiralCount ; left --) {
				arr[num - 1 - spiralCount][left] = c;
			}
			for(up = num - 2 - spiralCount; up >= 1 + spiralCount ; up--) {
				arr[up][spiralCount] = c;
			}
			spiralCount++;
		}
		
		for(int i = 0 ; i < num ; i++) {
			for(int j = 0 ; j < num ; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
