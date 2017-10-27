package cain.pattern.Factory.AbstractFactory;

import cain.pattern.Factory.FactoryMethod.Product;

/**
 * Created by Chai Wenrun on 2017/7/10 0010.
 */
public interface Factory {
    Product getProduct();
    Product getNewProduct();
}
