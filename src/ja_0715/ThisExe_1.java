package ja_0715;

class This1
{
	private int kor;
	private int eng;
	private int math;
	
	public This1(int kor ,int eng , int math) {
		
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int total() {
		return(kor + eng + math);
	}
	
	
}



public class ThisExe_1 {
	public static void main(String[] args) {
	
		This1 obj = new This1(100,75,85);
		
		System.out.println("총점 : "+obj.total());
		
		
}
}
