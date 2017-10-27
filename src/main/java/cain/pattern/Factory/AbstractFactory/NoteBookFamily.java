package cain.pattern.Factory.AbstractFactory;

import cain.pattern.Factory.FactoryMethod.NoteBookPart;
import cain.pattern.Factory.FactoryMethod.Product;

/**
 * Created by Chai Wenrun on 2017/7/10 0010.
 */
public class NoteBookFamily implements Factory{

    @Override
    public Product getProduct() {
                return new NoteBookPart();
    }

    @Override
    public Product getNewProduct() {
        return null;
    }
}
