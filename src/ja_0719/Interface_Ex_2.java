package ja_0719;

interface Mbc1{
	void play();
}
class Kbs1{
	void autoplay(Mbc1 aa) {
		aa.play();
	}
}
class MySbs1 implements Mbc1{

	@Override
	public void play() {
		System.out.println(" MySbs1 tv 생방송!!");
	}}

class MyCNN1 implements Mbc1{

	@Override
	public void play() {
		System.out.println(" MyCNN  생방송!!!");
	}}

public class Interface_Ex_2 {
	public static void main(String[] args) {
	
		Kbs1 kk = new Kbs1();
		kk.autoplay(new MySbs1());
		kk.autoplay(new MyCNN1());
	}
}            













