package colin.app.thread;

public class Bank {

	private int money = 1000;

	public synchronized int addMoney(int addMoney) throws InterruptedException {
		System.out.println("我要存錢");
		Thread.sleep(1000);
		money+=addMoney;
		return  money;
	}

	public int minusMoney(int minsuMoney)
			throws InterruptedException {
		System.out.println("我要取錢");
		money-=minsuMoney;
		
		return money;
	}
}
