package colin.app.model.factoryModel.simpleFactory.impl;

import colin.app.model.factoryModel.simpleFactory.inter.ISimpleFactoryProduct;

public class SimpleFactoryProductImpl1 implements ISimpleFactoryProduct{

	@Override
	public void showProductFeature() {
		System.out.println("我是产品1号，我的产品质量好");
	}

}
