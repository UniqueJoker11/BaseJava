package colin.app.model.singletonFactory;

import java.util.HashMap;
import java.util.Map;

/**    
 *       
 * @ClassName: RegistionSingleton  登记式单例   
 * @Description:   
 * @author liqniang
 * @date ：2015年6月26日 下午4:39:16        
 * @ModifyRemarks：    
 * @version:V1.0
 *     
 */
/**    
 *       
 * @ClassName: RegistionSingleton     
 * @Description:   
 * @author liqniang
 * @date ：2015年6月26日 下午4:41:00        
 * @ModifyRemarks：    
 * @version:V1.0
 *     
 */
public class RegistionSingleton {

	/**    
	 * registerMap:登记薄，用来存放所有的登记实例
	 *    
	 * @since Ver 1.1    
	 */    
	private static Map<String,RegistionSingleton> registerMap=new HashMap<>();
	/**
	 * 在类加载的时候添加一个实例到登记薄
	 * */
	static{
		RegistionSingleton singleton=new RegistionSingleton();
		registerMap.put(singleton.getClass().getName(),singleton);
	}
	protected RegistionSingleton(){}
	public static RegistionSingleton getInstance(String name){
		if(name==null){
			name="RegistionSingleton";
		}
		if(!registerMap.containsKey(name)){
			try {
				registerMap.put(name, (RegistionSingleton)Class.forName(name).newInstance());
			} catch (InstantiationException | IllegalAccessException
					| ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return registerMap.get(name);
	}
	
}
