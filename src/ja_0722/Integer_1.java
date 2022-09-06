package ja_0722;

public class Integer_1 {
	public static void main(String[] args) {
		
		Integer kbs1 = new Integer(300);	//형식을 권장하지 않을때 줄이 그어진다.
		Integer mbc1 = new Integer(300);
		
		
		
		System.out.println("kbs1 == mbc1 :"+(kbs1==mbc1));
		
		System.out.println("kbs1.equals(mbc1) : "+kbs1.equals(mbc1)); //내용비교는 equals를 쓴다
		
		System.out.println("kbs1.toString() : "+kbs1.toString());
		System.out.println("mbc1.toString() : "+mbc1.toString());
		
		System.out.println("kbs1.hashcode() :"+kbs1.hashCode());
		System.out.println("mbc1.hashcode() :"+mbc1.hashCode());
		System.out.println("kbs1.hashcode() :"+kbs1.hashCode(789));
		System.out.println("mbc1.hashcode() :"+mbc1.hashCode(456));
		
		System.out.println("MAX_VALUE :"+Integer.MAX_VALUE);
		System.out.println("MIN_VALUE :"+Integer.MIN_VALUE);
		
		System.out.println("SIZE :"+Integer.SIZE+"bits");
		System.out.println("TYPE :"+Integer.TYPE);
		
	}
}
