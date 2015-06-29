package colin.app.obj;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class SheduleTaskObj {

	//œﬂ≥Ã≥ÿ¿‡
	private ScheduledThreadPoolExecutor exector;
	private ScheduledFuture<?> sf;
	private BlockingQueue<WorkUnit<String>> lbp=new LinkedBlockingQueue<WorkUnit<String>>();
	private void run(){
		exector=new ScheduledThreadPoolExecutor(4);
		final Runnable msgRunnable=new Runnable() {
			
			@Override
			public void run() {
				String nextMsg=lbp.poll().getWork();
				if(!nextMsg.equals("")){
					System.out.println("Msg recvd "+nextMsg);
				}
			}
		};
		sf=exector.scheduleAtFixedRate(msgRunnable, 10, 10, TimeUnit.MILLISECONDS);
	}
	public void cancel(){
		final ScheduledFuture<?> sf1=sf;
		exector.schedule(new Runnable() {
			
			@Override
			public void run() {
				sf1.cancel(true);
				
			}
		}, 10, TimeUnit.MILLISECONDS);
	}
}
