package ja_0719;

interface Mbc{
	void play();
}

class Kbs{

	void autoPlay(Mbc oo) {
		oo.play();
	}
}

class MySbs implements Mbc{

	@Override
	public void play() {
		System.out.println(" MySbs Tv 생방송 ~~~~~~ ");
	}
	
}

class MyCNN implements Mbc{

	@Override
	public void play() {
		System.out.println(" MyCNN TV 야구 생중계*************");
	}}

public class InterfaceTest_3 {
	public static void main(String[] args) {
		
		Kbs obj = new Kbs();
		
		obj.autoPlay(new MySbs());		// 클래스 매개변수로 생성되었다.
		obj.autoPlay(new MyCNN());		// Style_2 클래스 코드와 연동해서 이해하기
		
	}
}
























