package array;

public class TwoDimension {

	public static void main(String[] args) {
		
		int[][] arr = {{1, 2, 3}, {4, 5, 6, 7}};
		
		System.out.println(arr.length);			// 행의 갯수
		System.out.println(arr[0].length);		// 해당 열의 갯수
		System.out.println(arr[1].length);		// 해당 열의 갯수
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
