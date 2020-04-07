
public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, lines = 5;
		for(i = 1 ; i <= lines ; i++) {
			for(j = lines ; j >= 1 ; j--) {
				if(i == j) {
					System.out.print('*');
				}
				else {
					System.out.print(j);
				}
			}
			System.out.println();
		}
	}

}
