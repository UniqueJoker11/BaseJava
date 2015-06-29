package colin.app.model.factoryModel.abstractFactory.impl;

import colin.app.model.factoryModel.abstractFactory.inter.IAbstractFactoryProduct;

public class AbstractFactoryProductImpl2 implements IAbstractFactoryProduct {

	@Override
	public void showProductFeature() {
		System.out.println("我是产品2号，我的产品特点是美观大方！");
	}

}
