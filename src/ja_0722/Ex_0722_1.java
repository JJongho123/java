package ja_0722;

class ATM11 {
	private int total;

	public ATM11() {
	}

	public ATM11(int total) {
		this.total = total;
	}

	synchronized void desposit(int amount, String name) { // synchronized 키워드 처리

		total += amount;
		System.out.println(name + " 님 입금 금액 :" + amount + " 원 ");
	}

	synchronized void withfraw(int amount, String name) { // synchronized 키워드 처리

		if ((total - amount) > 0) { // 출금가능하면
			total -= amount;
			System.out.println(name + " 님 출출금액 :" + amount + " 원 ");
		} else {
			System.out.println(name + " 님 잔액이 부족해 출금불가합니다.");
		}
	}

	public void getTotal() {
		System.out.println("\n 현재 계좌의 금액 : " + total + "원\n");
		System.out.println("===========================");
	}
}

class ATM_USER11 implements Runnable // ATM 사용자
{
	String nn = " ";
	boolean flag = false;

	ATM11 obj; // 멤버로 obj를 가지고있음

	public ATM_USER11(ATM11 obj, String name) {
		nn = name;
		this.obj = obj;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {

			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (flag) {
				obj.desposit((int) (Math.random() * 10000), nn);
				obj.getTotal();
			} else {
				obj.withfraw((int) (Math.random() * 10000), nn);
				obj.getTotal();
			}
			flag = !flag;
		}

	}
}

class Ex_0722_1 {
	public static void main(String[] args) {
		ATM11 atm = new ATM11(10000);

		Thread tt = new Thread(new ATM_USER11(atm, "류현진"));
		Thread tt1 = new Thread(new ATM_USER11(atm, "정종호"));
		Thread tt2 = new Thread(new ATM_USER11(atm, "손흥민"));

		tt.start();
		tt1.start();
		tt2.start();

	}
}
