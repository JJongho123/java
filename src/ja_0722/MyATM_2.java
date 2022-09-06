package ja_0722;



class ATM_2 {
	private int total;

	public ATM_2() {
	}

	public ATM_2(int total) {
		this.total = total;
	}

	 void desposit(int amount, String name) {

		total += amount;
		System.out.println(name + " 님 입금 금액 :" + amount + " 원 ");
	}

	 void withfraw(int amount, String name) {
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

class ATM_USER_2 extends Thread // ATM 사용자
{
	boolean flag = false;

	ATM_2 obj; // 멤버로 obj를 가지고있음

	public ATM_USER_2(ATM_2 obj, String name) {
		super(name);
		this.obj = obj;
	}

	public void run() {
		for (int i = 0; i < 3; i++) {

			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
			
			synchronized (obj) 
		{
			if (flag) {
				obj.desposit((int) (Math.random() * 10000), getName());
				obj.getTotal();
			} else {
				obj.withfraw((int) (Math.random() * 10000), getName());
				obj.getTotal();
			}
		}
			flag = !flag;
		}

	}
}

class MyATM_2{
	public static void main(String[] args) {
		ATM_2 atm = new ATM_2(10000); // 계좌에 만원이 들어있음

		ATM_USER_2 user1 = new ATM_USER_2(atm,"유현진");
		ATM_USER_2 user2 = new ATM_USER_2(atm,"손흥민");
		ATM_USER_2 user3 = new ATM_USER_2(atm,"우상혁");

		user1.start();
		user2.start();
		user3.start();
	}
}


