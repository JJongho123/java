package ja_0719;

//소프트웨어 디자인 패턴에서 싱글턴 패턴을 따르는 클래스는,
//생성자가 여러차례 호출되더라도 실제로 생성되는 객체는 하나이고
//최초생성 이후에 호출된 생성자는 최초의 생성자가 생성한 객체를 리턴한다.
//이와같은 디자인 유형을 싱글턴 패턴이라고 한다.
//주로 공통된 객체를 여러개 생성해서 사용하는  DBCP(DateBase Connection Pool)와 같은 
//상황에서 많이 사용된다.
final class Singleton{

	private static Singleton ss = new Singleton(); 
	//private 처리해서 밑으로 내려가지 못함 
	
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		if (ss==null) {
	
			ss = new Singleton();	// 위에서 객체를만들엇지만 밑으로 내려가지못해서 null 값으로 인지
									// 객체가 생성이 안되어있다면 객체를 생성하라는 의미
		}
		return ss;
	}
}
class HelloWorld {
	public HelloWorld() {}
} 

public class SingletonTest {
	public static void main(String[] args) {
		
		Singleton ss1 = Singleton.getInstance();  //getInstance 
		Singleton ss2 = Singleton.getInstance();
		
		System.out.println(" Singleton 객체 ss1 hashcode : "+ss1.hashCode());
		System.out.println(" Singleton 객체 ss2 hashcode : "+ss1);
		System.out.println(" Singleton 객체 ss2 hashcode : "+ss2.hashCode());
		System.out.println(" Singleton 객체 ss2 hashcode : "+ss2);
		
		System.out.println("=========================================");
		
		HelloWorld hh1 = new HelloWorld();
		HelloWorld hh2 = new HelloWorld();
		
		System.out.println(" HelloWorld 객체 hh1 hashcode "+hh1.hashCode());
		System.out.println(" HelloWorld 객체 hh1 hashcode "+hh1);
		System.out.println(" HelloWorld 객체 hh2 hashcode "+hh2.hashCode());
		System.out.println(" HelloWorld 객체 hh1 hashcode "+hh2);
		
		
		
		
	}
}












