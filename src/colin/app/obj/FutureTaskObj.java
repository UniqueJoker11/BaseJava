package colin.app.obj;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class FutureTaskObj implements Callable<String> {

	private int i;

	public FutureTaskObj(int i) {
		this.i = i;
	}

	@Override
	public String call() throws Exception {
		String result = "您好，恭喜您成为第" + i + "个访客";
		return result;
	}

	public static void main(String[] args) throws InterruptedException,
			ExecutionException {
		ExecutorService exec = Executors.newFixedThreadPool(5);
		List<FutureTask<String>> futureList = new ArrayList<FutureTask<String>>();
		for (int i = 0; i < 15; i++) {
			futureList.add(new FutureTask<String>(new FutureTaskObj(i)));
		}
		for (FutureTask task : futureList) {
			task.run();
			System.out.println("开始运行任务！");
			if (task.isDone()) {
				System.out.println(task.get());
			}
		}
	}

}
