package ja_0718;

public class Ex_0718_2 {
	public static void main(String[] args) {
		Point3D p3 = new Point3D();
		Point p2 = new Point3D();
		
		
		
		System.out.println(p3.x);
		System.out.println(p3.y);
		System.out.println(p3.z);
		System.out.println("================");
		System.out.println(p2.x);
		System.out.println(p2.y);
		System.out.println(p2.z);
		
		

	}
}

class Point{
	Point(){};
	int x = 10;
	int y = 20;
	int z = 999;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Point3D extends Point {
	int z = 30;
	

	Point3D() {
		this(100, 200, 300);
	}

	Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
}











