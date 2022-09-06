package ja_0715;

class SuperTV {

	boolean power;
	int channel;
	int volume;

	void power_1() {
		power = !power;
	}

	void channelUp() {
		channel++;
	}

	void channelDown() {
		channel--;
	}
	
	void volumeUp() {
		volume++;
	}

	void volumeDown() {
		volume--;
	}
}

class MyTV extends SuperTV {

	void displayCaption(String str) {
		if (power) {
			System.out.println(str);
		}
	}
}

public class SuperTest_2 {
	public static void main(String[] args) {

		MyTV mytv = new MyTV();
		
		mytv.volume = 55;
		mytv.channel = 2;
		
	
		
		mytv.channelDown();
		mytv.channelDown();
		mytv.channelDown();
		
		mytv.volumeUp();
		mytv.volumeUp();
		mytv.volumeUp();
		mytv.volumeUp();
		mytv.volumeDown();
		mytv.volumeDown();
		
		if(mytv.channel>=0) {
		
		System.out.println("현재 채널은 : "+mytv.channel);
		}
		else
		{
			System.out.println("채널을 더이상 내릴수 없습니다.");
			}
		System.out.println(mytv.volume);

		mytv.power_1();
		
		mytv.displayCaption("아름다운 강산");


		mytv.displayCaption("시원한 여름 바람");
		

		mytv.displayCaption("신나는 금요일~~~~");
	}

	
}







