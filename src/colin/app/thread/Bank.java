package colin.app.thread;

public class Bank {

	private int money = 1000;

	public synchronized int addMoney(int addMoney) throws InterruptedException {
		System.out.println("��Ҫ���X");
		Thread.sleep(1000);
		money+=addMoney;
		return  money;
	}

	public int minusMoney(int minsuMoney)
			throws InterruptedException {
		System.out.println("��Ҫȡ�X");
		money-=minsuMoney;
		
		return money;
	}
}
