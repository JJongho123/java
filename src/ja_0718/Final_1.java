package ja_0718;

class  WordProcess{
	void Input() {}

	void Edit() {}
	
	void Pring() {}
	
	void About() {
		System.out.print("A 회사 개발 ");
	}
}
final class NewWordProcess extends WordProcess{
	void About() {
		System.out.print("B 회사 개발 ");
	}
	
}




public class Final_1 {
	public static void main(String[] args) {
		
		NewWordProcess obj = new NewWordProcess();
		obj.About();
		
		
	}

}


















