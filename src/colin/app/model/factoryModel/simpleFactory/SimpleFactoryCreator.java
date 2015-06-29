package colin.app.model.factoryModel.simpleFactory;

import colin.app.model.factoryModel.simpleFactory.impl.SimpleFactoryProductImpl1;
import colin.app.model.factoryModel.simpleFactory.impl.SimpleFactoryProductImpl2;
import colin.app.model.factoryModel.simpleFactory.inter.ISimpleFactoryProduct;

/**    
 *       
 * @ClassName: SimpleFactoryCreator     
 * @Description:工厂类   
 * @author liqniang
 * @date ：2015年6月26日 上午9:04:19        
 * @ModifyRemarks：    
 * @version:V1.0
 *     
 */
public class SimpleFactoryCreator {

	public static ISimpleFactoryProduct getProduct(int type){
		ISimpleFactoryProduct product=null;
		switch(type){
		case 1:
			product= new SimpleFactoryProductImpl1();
			break;
		case 2:
			product= new SimpleFactoryProductImpl2();
			break;
		}
		return product;
	}
}
