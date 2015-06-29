package colin.app.model.singletonFactory;

/**    
 *       
 * @ClassName: LazySingletonClazz  懒汉式单例   
 * @Description: 实现延迟加载，其特点是在需要获取实例的时候进行初始化。
 * @author liqniang
 * @date ：2015年6月26日 下午4:34:08        
 * @ModifyRemarks：    
 * @version:V1.0
 *     
 */
public class LazySingletonClazz {

	private static LazySingletonClazz singletonClazz=null;
	private LazySingletonClazz(){}
	/**    
	 * 方法描述：   
	 * 注意事项：    
	 * @return 
	 * @Exception 异常对象 
	*/
	public synchronized static LazySingletonClazz getInstance(){
		if(singletonClazz==null){
		singletonClazz=new LazySingletonClazz();	
		}
		return singletonClazz;
	}
}
