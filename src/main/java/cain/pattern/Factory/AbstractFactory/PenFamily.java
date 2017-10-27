package cain.pattern.Factory.AbstractFactory;

import cain.pattern.Factory.FactoryMethod.PenPart;
import cain.pattern.Factory.FactoryMethod.Product;

/**
 * Created by Chai Wenrun on 2017/7/10 0010.
 */
public class PenFamily implements Factory{

    @Override
    public Product getProduct() {
        return new PenPart("0.5mm");
    }
    @Override
    public Product getNewProduct(){
        return new PenPart("0.1mm");
    }
}
