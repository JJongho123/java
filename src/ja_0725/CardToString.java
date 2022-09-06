package ja_0725;

class Card{
	
	String kind;
	int number;
	
	Card(){
		this("SPACE",1);
	}
	Card(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
	
	public String toString() {
		return "kind: "+kind+" , number :"+number; 
	}
}









public class CardToString {
	public static void main(String[] args) {
		
		Object obj1 = new Card();		//모든클래스위에는 object 클래스가 있다. 
		Object obj2 = new Card("HERAT",9);
		
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		System.out.println(obj1);
		System.out.println(obj2);
		
	}

}









