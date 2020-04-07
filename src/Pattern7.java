
public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, lines = 4;
		for(i = 0 ; i < lines ; i++) {
			for(j = -lines ; j <= lines ; j++) {
				if(-Math.abs(j) + lines == i || j == 0) {
					System.out.print('*');
				}
				else {
					System.out.print('O');
				}
			}
			System.out.println();
		}
	}

}
