package colin.app.thread;

public class Consumes implements Runnable{

	private int money;
	private Bank bank;
	
    public Consumes(int money, Bank bank) {
		super();
		this.money = money;
		this.bank = bank;
	}
    public static void main(String[] args) {
    	Bank bank=new Bank();
    	Consumes consumes1=new Consumes(100,bank);
    	Consumes consumes2=new Consumes(200,bank);
    	Thread thread=null;
    	Thread thread2=null;
    	for(int i=0;i<10;i++){
    		thread=new Thread(consumes1);
    		thread2=new  Thread(consumes2);
    		thread.run();
    		try {
    			Thread.sleep(1000);
    		} catch (InterruptedException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    		thread2.run();
        	System.out.println("0-------------------0");
    	}
    	
	}
	@Override
	public void run() {
		try {
			System.out.println("ÕË»§Óà¶îÎª£º"+bank.minusMoney(money));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
