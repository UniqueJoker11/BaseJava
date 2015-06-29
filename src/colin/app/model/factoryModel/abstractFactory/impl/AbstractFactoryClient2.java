package colin.app.model.factoryModel.abstractFactory.impl;

import colin.app.model.factoryModel.abstractFactory.inter.IAbstractFactoryClient;
import colin.app.model.factoryModel.abstractFactory.inter.IAbstractFactoryProduct;

public class AbstractFactoryClient2 implements IAbstractFactoryClient{

	@Override
	public IAbstractFactoryProduct getProduct() {
		// TODO Auto-generated method stub
		return new AbstractFactoryProductImpl2();
	}

}
