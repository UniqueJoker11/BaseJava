package colin.app.model.factoryModel.abstractFactory;

import colin.app.model.factoryModel.abstractFactory.impl.AbstractFactoryClient2;
import colin.app.model.factoryModel.abstractFactory.inter.IAbstractFactoryClient;
import colin.app.model.factoryModel.abstractFactory.inter.IAbstractFactoryProduct;

public class AbstractFactoryCaller {

	public static void main(String[] args){
		//实验调用产品2的产品特性方法
		IAbstractFactoryClient factoryClient=new AbstractFactoryClient2();
	    IAbstractFactoryProduct product=factoryClient.getProduct();
	    product.showProductFeature();
	}
}
