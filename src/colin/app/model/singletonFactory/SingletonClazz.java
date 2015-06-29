package colin.app.model.singletonFactory;

/**    
 *       
 * @ClassName: SingletonClazz  饿汉式的单例   
 * @Description: 静态的单例模式
 * @author liqniang
 * @date ：2015年6月26日 下午4:32:03        
 * @ModifyRemarks：    
 * @version:V1.0
 *     
 */
public class SingletonClazz {

	private static SingletonClazz clazz = new SingletonClazz();

	private SingletonClazz() {
	}

	public static SingletonClazz getInstance() {
		return clazz;
	}
}
