package application;

public class App {

	public static void main(String[] args) {
		/* Coding challenge
		 * Create a multiplication table, like this:
		 * 
		 * 1 2 3 4 ..... 12
		 * 2 4 6 8 ..... 24
		 * .....
		 * .....
		 * 12 24 36 48 ..... 144
		 */
		int sizeOfArray = 12;
		
		int[][] outerArray = null;
		outerArray = new int[sizeOfArray][sizeOfArray];
		
		for(int i = 0; i < sizeOfArray; i++) {
			for(int j= 0; j < sizeOfArray; j++) {
				outerArray[i][j] = (i + 1) * (j + 1);
			}
		}
		
		for(int k = 0; k < outerArray.length; k++) {
			for(int m = 0; m < outerArray[k].length; m++) {
				System.out.printf("%s\t", outerArray[k][m]);
			}
			System.out.println();
		}
		
	}

}
