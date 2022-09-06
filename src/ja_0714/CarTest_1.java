package ja_0714;

class Car {
	String color; // 멤버 변수 (필드 , 전역변수)
	String gearType;
	int door;
	String direction;

	public Car() { // default 생성자

	}

	public Car(String c, String g, int d, String dd) // 매개변수가 있는 생성자
	{
		color = c;
		gearType = g;
		door = d;
		direction = dd;
	}

	public String toString() {
		return "color : " + color + "   ,  gearType : " + gearType + "   ,  door :" + door + " , direction : "
				+ direction;
	}

}

public class CarTest_1 {
	public static void main(String[] args) {
		Car car1 = new Car();

		car1.color = "green";
		car1.gearType = "수동";
		car1.door = 5;
		car1.direction = "left";

		if (car1.direction.equals("left")) {
			System.out.println("이차는 왼쪽으로 돌고있습니다.");
		} else if (car1.direction.equals("right")) {
			System.out.println("이차는 오른쪽으로 돌고있습니다.");
		} else {
			System.out.println("이차는 직진하고 있습니다.");
		}
		System.out.println("car1" + car1.toString());

		Car car2 = new Car("red", "fullauto", 3, "right");

		if (car2.direction.equals("left")) {
			System.out.println(" 이차는 왼쪽으로 돌고있습니다.");
		} else if (car2.direction.equals("right")) {
			System.out.println("이차는 오른쪽으로 돌고있습니다.");
		} else {
			System.out.println("이차는 직진하고 있습니다.");
		}
		System.out.println("car2" + car2.toString());// toString 생략가능

		
		Car car3 = new Car("blue", "auto", 4, "1");

		if (car3.direction.equals("left")) {
			System.out.println(" 이차는 왼쪽으로 돌고있습니다.");
		} else if (car3.direction.equals("right")) {
			System.out.println("이차는 오른쪽으로 돌고있습니다.");
		} else 
		System.out.println("car3" + car3.toString()); 

		

		
		
		
		System.out.println();
		System.out.println("car1" + car1);

		System.out.println("car2" + car2);
		System.out.println("car3" + car3);
	}

}
