package ja_0719;

interface Sleep{
	void sleep();
}
interface Eat{
	void eat();
}
interface Run{
	void run();
}
interface Man extends Sleep,Eat,Run {
	void shower();
}
class Jong implements Man{

	@Override
	public void sleep() {
		System.out.println(" 잠을 잔다 @@@@@@");
	}

	@Override
	public void eat() {
		System.out.println(" 밥을 먹는다 !!!!!");
	}

	@Override
	public void run() {
		System.out.println(" 운동을 한다 $$$$$$ ");
		
	}

	@Override
	public void shower() {
		System.out.println(" 샤워를 한다 ^^^^^^^ ");
		
	}}





public class Interface_Ex_1 {
	public static void main(String[] args) {
		
		Jong obj = new Jong();
		
		obj.eat();
		obj.run();
		obj.shower();
		obj.sleep();
		
		
	}

}










