package ja_0715;

class AA{
	static class BB{
		
		static int bbb = 777;
		static class CC{
			int ccc = bbb + 800;
		}
		
	}
}






public class NestedClass_1 {
	
	public static void main(String[] args) {
		
		AA.BB.CC obj = new AA.BB.CC();
		
		System.out.println(" CC 클래스 내부 변수 ccc= "+obj.ccc);
		
		
		
		
		
		
		
		
		
		
	}

}
