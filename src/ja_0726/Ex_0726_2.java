package ja_0726;

public class Ex_0726_2 {
	public static void main(String[] args) {

		int[] num = { 78, 66, 43, 89, 94, 54, 37 };

		System.out.println("\n=====================정 렬 전==============================\n");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "\t");

		}
		System.out.println("\n\n=====================정 렬 후==============================\n");

		for (int i = 0; i < num.length - 1; i++) {
			for (int j = i + 1; j < num.length; j++) {

//				if(eng[i].compareTo(eng[j])>0) 
				if (num[i] > num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}

		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "\t");
		}

	}

}
