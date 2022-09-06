package ja_0725;

public class Do_1 {
	public static void main(String[] args) {
		
		int x = 0;
		int y = 10;
		
		do {
			
			++x;
			y--;
			
			System.out.print(x+","+y+" : ");
		}while (x<5);
		System.out.println("\n "+x+","+y);
	}

}
