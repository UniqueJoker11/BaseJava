package colin.app.obj;

public class WorkUnit<T> {

	public void task(T t){
		System.out.println("这次的任务是"+t.toString());
	}
	public String getWork(){
		return "这是返回的工作结果";
	}
}
