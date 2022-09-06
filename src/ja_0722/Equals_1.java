package ja_0722;
class Queen{

	int number;
	
	public Queen(int num) {
		number = num;
	}

}


public class Equals_1 {
	public static void main(String[] args) {
		
		
		Queen obj1 = new Queen(27);
		Queen obj2 = new Queen(27);
		
		if(obj1==obj2) {
			System.out.println("obj1 과 obj2 는 같다");
		}
		else
			System.out.println("obj1 과 obj2 는 다다르르다");
		
		System.out.println("obj1 : "+obj1.hashCode());
		System.out.println("obj1 : "+obj2.hashCode());
		
	
		
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1 과 obj2 는 같다");
		}
		else
			System.out.println("obj1 과 obj2 는 다다르르다");
		
		System.out.println("obj1 : "+obj1.hashCode());
		System.out.println("obj1 : "+obj2.hashCode());
		
		
		obj2 = obj1;
		
		System.out.println("===============================");
		if(obj1==obj2) {
			System.out.println("obj1 과 obj2 는 같다");
		}
		else
			System.out.println("obj1 과 obj2 는 다다르르다");
		
		System.out.println("obj1 : "+obj1.hashCode());
		System.out.println("obj1 : "+obj2.hashCode());
		
	
		
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1 과 obj2 는 같다");
		}
		else
			System.out.println("obj1 과 obj2 는 다다르르다");
		
		System.out.println("obj1 : "+obj1.hashCode());
		System.out.println("obj1 : "+obj2.hashCode());
		
		
	}

}
















