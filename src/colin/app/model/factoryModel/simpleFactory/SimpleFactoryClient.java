package colin.app.model.factoryModel.simpleFactory;

import colin.app.model.factoryModel.simpleFactory.inter.ISimpleFactoryProduct;

/**    
 *       
 * @ClassName: SimpleFactoryClient     
 * @Description:选用简单工厂设计模式的情况：
 *     1、如果想要完全封装隔离具体实现，让外部只能通过接口来访问封装体，那么可以选用简单工厂模式，让客户端通过工厂来获取相应的接口，则无需关心具体的实现。
 *     2、如果想要把对外创建对象的职责 进行集中管理和控制，可以选用简单工厂，一个简单的工厂可以创建很多的，不相关的对象。可以把对外创建对象的职责集中到一个简单的
 *       工厂上来
 * @author liqniang
 * @date ：2015年6月26日 上午9:15:15        
 * @ModifyRemarks：    
 * @version:V1.0
 *     
 */
public class SimpleFactoryClient {

	public static void main(String[] args) {
		// 測試獲取产品1的产品特性
		ISimpleFactoryProduct product=SimpleFactoryCreator.getProduct(1);
		product.showProductFeature();
	}
}
