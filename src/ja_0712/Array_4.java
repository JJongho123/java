package ja_0712;

public class Array_4 {
public static void main(String[] args) {
	
//	int[][] one = new int[4][3];
//	
//	one[0][0] = 1;
//	one[0][1] = 2;
//	one[0][2] = 88;
//	one[1][0] = 3;
//	one[1][1] = 4;
//	one[1][2] = 88;
//	one[2][0] = 5;
//	one[2][1] = 6;
//	one[2][2] = 88;
//	one[3][0] = 7;
//	one[3][1] = 8;
//	one[3][2] = 88;
	
	int[][] one = {{1,2,88},
	               {3,4,88},
	               {5,6,88},
	               {7,8,88}};
	
	int i, j;
	
	for ( i = 0; i < one.length; i++) { //행의길이
		for (j = 0; j < one[i].length; j++) { //열의 길이
			System.out.print("  " + one[i][j]);	
		}
		System.out.println();
	}
	
}
}
