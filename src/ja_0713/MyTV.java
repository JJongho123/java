package ja_0713;

class TV {		//class 는 독립된 모듈이다
	
	String power2; 
	boolean power;
	int channel;
	int vol;
	

	void spower()

	{
		power = !power;
		if(power==true) {
			power2 = "켜짐";
		}
		else 
		{
			power2 = "꺼짐";
			
		}
		}
	
	
	void channelUp() {
		++channel;
	}

	void channelDown() {
		--channel;
	}
	void volUp() {
		++vol;
	}
	void volDown() {
		--vol;
	}
	
	
	
}

public class MyTV {
	public static void main(String[] args) {
		TV ttvv; // 스텍 영역에 레퍼런스 변수 ttvv를 위한 공간이 마련된다.

		ttvv = new TV();	 // new 에 의한 인스턴스 생성이란 필드 , 메서드 값들을 저장할 수
							 // 있는 별도의 공간은 heap 영역에 배당받는 것을 의미한다.
							 // 참조 변수는 생성된 인스턴스의 주소를 저장하기 위해
							 // 스텍영역에 메모리를 할당한다.

		
		TV ttvv2 = new TV();

		ttvv.spower();
		ttvv2.spower();

		ttvv.channel = 7;
		
		ttvv2.channel = 11;
		
		ttvv.vol = 55;
		
		ttvv2.vol = 25;
		
		ttvv.volUp();
		ttvv.volUp();
		ttvv.volDown();
		ttvv.channelUp();
		ttvv.channelUp();
		ttvv.channelUp();

		ttvv2.volUp();
		ttvv2.volUp();
		//ttvv2.volDown();
		ttvv2.channelDown();
		ttvv2.channelDown();
		ttvv2.channelDown();
		ttvv2.channelDown();
		ttvv2.channelDown();

		System.out.println("현재 ttvv는 " + ttvv.power2 + " 상태입니다.");
		System.out.println("현재 ttvv의 채널은 " + ttvv.channel + " 번 입니다.");
		System.out.println("현재 ttvv의 볼륨은 "+ttvv.vol+" 입니다.");

		System.out.println();
		
		System.out.println("현재 ttvv는 " + ttvv2.power2 + " 상태입니다.");
		System.out.println("현재 ttvv2의 채널은 " + ttvv2.channel + " 번 입니다.");
		System.out.println("현재 ttvv2의 볼륨은 " + ttvv2.vol + "  입니다.");
		
		
		
		
		
		
		
		
		
		

	}

}


