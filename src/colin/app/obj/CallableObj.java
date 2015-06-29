package colin.app.obj;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableObj implements Callable<String>{

	private String taskName="joker";
	private int i;
	public CallableObj(int i){
		this.i=i;
	}
	
	public static void main(String[] args) throws Exception {
		ExecutorService exec=Executors.newCachedThreadPool();
		List<Future<String>> resultList=new ArrayList<Future<String>>();
		for(int i=0;i<20;i++){
			resultList.add(exec.submit(new CallableObj(i)));
		}
		for(Future<String> future:resultList){
			if(future.isDone()){
				System.out.println(future.get());
			}
		}
	}


	@Override
	public String call() throws Exception {
		String result="您好，恭喜您成为第"+i+"个访客";
		return result;
	}
}
