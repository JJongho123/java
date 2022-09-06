package ja_0726;

public class Ex_0726_3 {
	public static void main(String[] args) {
		int[] num = { 78, 66, 43, 89, 94, 54, 37 };

		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;

				}

			}
			System.out.println(num[i]);

		}
//		for(int i=0;i<num.length;i++) {
//			System.out.println(num[i]);
//		}
	}

}
