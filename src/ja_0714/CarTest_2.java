package ja_0714;

class Car_2 {
	String color;
	String gearType;
	int door;

	public Car_2() { // default 생성자

		this("white", "auto ", 4);

	}

	public Car_2(Car_2 car) { // 인스턴스 복사를 위한 생성자

		color = car.color;
		gearType = car.gearType;
		door = car.door;

	}

	public Car_2(String c, String g, int d) {
		color = c;
		gearType = g;
		door = d;
	}
}

public class CarTest_2 {
	public static void main(String[] args) {

		Car_2 obj_1 = new Car_2();
//		Car_2 obj_2 = obj_1;  
		Car_2 obj_2 = new Car_2(obj_1);   // obj_1 의 복사본 obj_2 
	    
		//33번 처럼 선언하면 같은객체이고 34번처럼 new 로 선언하면
		//새로운 객체를 생성해서 해시코드 주소값이 달라진다. 헤쉬코드가 같다면 같은객체 다르다면 다른객체이다.
		

		System.out.println(
				" obj_1 color : " + obj_1.color + " , obj_1 gearType : " + obj_1.gearType + "obj door : " + obj_1.door);
		System.out.println(
				" obj_2 color : " + obj_2.color + " , obj_2 gearType : " + obj_2.gearType + "obj door : " + obj_2.door);

		System.out.println();
		System.out.println(obj_1);
		System.out.println(obj_2);
		System.out.println();

		obj_1.door = 99;
		obj_1.color = "분홍색";
//		obj_2.door = 30;

		System.out.println(
				" obj_1 color : " + obj_1.color + " , obj_1 gearType : " + obj_1.gearType + "obj door : " + obj_1.door);
		System.out.println(
				" obj_2 color : " + obj_2.color + " , obj_2 gearType : " + obj_2.gearType + "obj door : " + obj_2.door);

	}

}
