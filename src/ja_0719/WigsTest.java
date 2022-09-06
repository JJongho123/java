package ja_0719;

interface Car{
	void run();
}
interface Ship{
	void navigate();
}
interface Dudu{
	void dudu();
}
interface Wigs extends Car,Ship,Dudu{
	void floating();
}

class EagelFive implements Wigs{

	@Override
	public void run() {
		System.out.println(" 황야를 달린다!!! ");
	}

	@Override
	public void navigate() {
		System.out.println(" 바다를 질주한다~~~~ ");
	}

	@Override
	public void floating() {
		System.out.println(" 습지를 날라다닌다 ^^^^^^^^");
	}

	@Override
	public void dudu() {
		System.out.println(" 땅속을 두더지처럼 뚫고들어간다$$$$$$$");
	}}

public class WigsTest {
	public static void main(String[] args) {
		
		EagelFive obj = new EagelFive();
		
		
		obj.floating();
		obj.run();
		obj.navigate();
		obj.dudu();
		
	}
}









