package ja_0727;

public class Nansu_1 {
	public static void main(String[] args) {

		int xx = 15; // 하한값
		int yy = 27; // 상한값
		int count = 0;
		// 난수 발생 공식 => (상한값 - 하한값 +1)*난수발생) + 하한값
		System.out.println(xx + " ~ " + yy + " 사이 난수 발생 \n");

		for (int i = 0; i < 100; i++) {

			System.out.print((int) ((yy - xx + 1) * Math.random()) + xx + " ");
			count++;

			if (count % 10 == 0) {
				System.out.println();
			}
		}

	}

}
