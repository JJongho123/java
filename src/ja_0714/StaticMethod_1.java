package ja_0714;

class StaticMethod {

	static int kor;
	static int eng;
	static int math;

	static double average() {

		int total = kor + eng + math;

		return (total / 3.0);

	}

}

public class StaticMethod_1 {

	public static void main(String[] args) {

		StaticMethod sm = new StaticMethod();

		StaticMethod.kor = 70;
		StaticMethod.eng = 50;
		StaticMethod.math = 100;

		System.out.println(" 평균 = " + StaticMethod.average());
		System.out.println(" 평균 = " + StaticMethod.average());

	}

}
