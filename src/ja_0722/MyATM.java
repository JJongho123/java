package ja_0722;

class ATM {
	private int total;
	
	public ATM() {
	}

	public ATM(int total) {
		this.total = total;
	}

	synchronized void desposit(int amount, String name) {

		total += amount;
		System.out.println(name + " 님 입금 금액 :" + amount + " 원 ");
	}

	synchronized void withfraw(int amount, String name) {
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

class ATM_USER extends Thread // ATM 사용자
{
	boolean flag = false;

	ATM obj; // 멤버로 obj를 가지고있음

	public ATM_USER(ATM obj, String name) {
		super(name);
		this.obj = obj;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {

			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (flag) {
				obj.desposit((int) (Math.random() * 10000), getName());
				obj.getTotal();
			} else {
				obj.withfraw((int) (Math.random() * 10000), getName());
				obj.getTotal();
			}
			flag = !flag;
		}

	}
}

class MyATM {
	public static void main(String[] args) {
		ATM atm = new ATM(10000); // 계좌에 만원이 들어있음

		ATM_USER user1 = new ATM_USER(atm, "유현진");
		System.out.println(atm.hashCode());
		ATM_USER user2 = new ATM_USER(atm, "손흥민");
		System.out.println(atm.hashCode());
		ATM_USER user3 = new ATM_USER(atm, "우상혁");
		System.out.println(atm.hashCode());

		user1.start();
		user2.start();
		user3.start();
	}
}












