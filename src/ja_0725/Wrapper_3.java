package ja_0725;

public class Wrapper_3 {
	public static void main(String[] args) {
		
		//https://velog.io/@99gaga/Java-equals1-와-hashCode의-관계
		
		Integer kbs1 =new Integer(300);
		Integer mbc1 =new Integer(300);
		
		System.out.println("kbs1==mbc1 :"+(kbs1 == mbc1));
		
		System.out.println("kbs1.equals(mbc1) :"+kbs1.equals(mbc1));
		
		System.out.println("kbs1.toString() :"+kbs1.toString());
		System.out.println("mbc1.toString() :"+mbc1.toString());
		
		System.out.println("MAX_VALUE :"+Integer.MAX_VALUE);
		System.out.println("MIN_VALUE :"+Integer.MIN_VALUE);
		
		System.out.println("SIZE :"+Integer.SIZE);
		System.out.println("TYPE :"+Integer.TYPE);
		System.out.println("kbs1 hashCode :"+kbs1.getClass().hashCode());
		System.out.println("mbc1 hashCode :"+mbc1.getClass().hashCode());
		
		
	}

}
