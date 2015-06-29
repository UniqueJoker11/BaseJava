package colin.app.model.factoryModel.abstractFactory.impl;

import colin.app.model.factoryModel.abstractFactory.inter.IAbstractFactoryProduct;

public class AbstractFactoryProductImpl1 implements IAbstractFactoryProduct{

	@Override
	public void showProductFeature() {
System.out.println("我是产品1号，我的产品特点是坚固耐用！");		
	}

}
