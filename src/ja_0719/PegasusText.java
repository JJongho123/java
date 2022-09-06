package ja_0719;

interface Bird{
	long speed = 65;
	void fly();
}
interface Horse{
	void run();
}
interface Fish{
	void swimming();
}

class Pegasus implements Bird, Horse , Fish{

	@Override
	public void swimming() {
		System.out.println(" 바다를 헤엄친다. ~~~~ ");
	}

	@Override
	public void run() {
		System.out.println(" 대륙을 뛰어다닌다 ^^^^^^^^^ ");
	}
	@Override
	public void fly() {
		
		System.out.println(" 하늘을 날라 다닌다.@@@@@@");
	}
	
}


public class PegasusText {
	public static void main(String[] args) {
		
		Pegasus obj = new Pegasus();
		
		obj.fly();
		System.out.println(" 속도는 : "+Bird.speed+" 입니다. ");
		
		obj.run();
		obj.swimming();
		
		
		
		
		
		
		
	}
}














