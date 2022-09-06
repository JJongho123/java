package ja_0713;

public class Array_10 {
	public static void main(String[] args) {
		int[][] var = new int[3][];

		int i, j, k = 0;

		var[0] = new int[3];
		var[1] = new int[2];
		var[2] = new int[4];


		for (i = 0; i < var.length; i++) {
			for (j = 0; j < var[i].length; j++) {
				var[i][j] = k++;
				System.out.print(var[i][j] + "\t");
			}
		}

		for (i = 0; i < var.length; i++) {
			for (j = 0; j < var[i].length; j++) {
				// System.out.print(var[i][j]+"\t");
			}
			System.out.println();

		}
	}
}
