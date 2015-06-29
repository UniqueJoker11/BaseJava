package colin.app.model.singletonFactory.sample;

public class MaxOperateConfigSingleton {

	private static class MaxGreedySingleton {
		private static MaxOperateConfigSingleton singleton = new MaxOperateConfigSingleton();
	}

	private MaxOperateConfigSingleton() {
	}

	public static MaxOperateConfigSingleton getInstance() {
		return MaxGreedySingleton.singleton;
	}

	public static void main(String[] args) {
		System.out.println(MaxOperateConfigSingleton.getInstance());
		System.out.println(MaxOperateConfigSingleton.getInstance());
		System.out.println(MaxOperateConfigSingleton.getInstance());
		System.out.println(MaxOperateConfigSingleton.getInstance());
	}
}
