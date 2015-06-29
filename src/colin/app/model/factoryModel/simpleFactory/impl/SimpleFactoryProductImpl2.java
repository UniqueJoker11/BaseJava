package colin.app.model.factoryModel.simpleFactory.impl;

import colin.app.model.factoryModel.simpleFactory.inter.ISimpleFactoryProduct;

/**    
 *       
 * @ClassName: SimpleFactoryProductImpl2     
 * @Description:   
 * @author liqniang
 * @date ：2015年6月26日 上午9:03:20        
 * @ModifyRemarks：    
 * @version:V1.0
 *     
 */
public class SimpleFactoryProductImpl2 implements ISimpleFactoryProduct{

	/* (non-Javadoc)    
	 * @see colin.app.model.factoryModel.simpleFactory.inter.ISimpleFactoryProduct#showProductFeature()    
	 */
	@Override
	public void showProductFeature() {
        System.out.println("我是产品2号，我的产品特性是稳定性高！");		
	}

}
