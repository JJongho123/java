package ja_0713;

import java.util.Scanner;

public class ArrayEx_1 {
	public static void main(String[] args) {

		int[] num = new int[10];
		int[] cnt = new int[10];

		for (int i = 0; i < num.length; i++) {
			System.out.print((num[i] = (int) (Math.random() * 10)) + " ");

		}
		System.out.println("\n");

		for (int i = 0; i < num.length; i++) {
			cnt[num[i]]++;
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(" " + i + "의 갯수: " + cnt[i]);
		}
	}
}
