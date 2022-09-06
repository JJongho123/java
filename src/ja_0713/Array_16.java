package ja_0713;

public class Array_16 {
	public static void main(String[] args) {
		
		int[] ff = {55,77,444};
							//0, 1 ,2
		System.out.println("main() 11 :"+ ff[2]);
		
		change(ff);
		change(ff);
		
		System.out.println("After change(ff)~~~~~");
		System.out.println("main () 22 :"+ff[2]);
		
	}
	private static void change(int[]yy) {
		yy[2] = 787878;
		System.out.println("change() : yy[2] = "+yy[2]);
	}
}
