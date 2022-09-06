package ja_0715;

class Grade
{
	int kor = 60;			// 클래스 안의 인스턴스 변수는 초기화 하지않아도 자체 초기화;
	int eng = 65;
	int math = 77;
	
	
}



public class Result_1 {
	public static void main(String[] args) {
	
		int total , a, b, c ,d;  	// 메서드 안의 지역변수는 직접 초기화 해줘야한다 ( 수동초기화 )
		double avg;
		
		Grade grade1 = new Grade();
		Grade grade2 = new Grade();
		
		a = grade1.kor + grade1.eng + grade1.math;
		b = grade2.kor + grade2.eng + grade2.math;
		
		System.out.println(" 과목총점 : a  " + a );
		System.out.println(" 과목총점 : b  " + b );
		System.out.println();
		
		grade1.kor = 900;
		grade2.eng = 300;
		
		a = grade1.kor + grade1.eng + grade1.math;
		b = grade2.kor + grade2.eng + grade2.math;
		

		System.out.println(" 과목총점 : aa  " + a );
		System.out.println(" 과목총점 : bb  " + b );
		
		total = grade1.kor + grade2.eng + grade2.math;
		avg =  total / 3.0;
		
		System.out.println(" 과목 총점 : total "+total);
		System.out.println(" 과목 평균 : avg "+avg);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}

}
