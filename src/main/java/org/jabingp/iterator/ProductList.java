package org.jabingp.iterator;

public class ProductList extends AbstractProductList {

    public ProductList(String[] productsName) {
        super(productsName);
    }

    @Override
    public AbstractIterator getIterator() {
        return new MyIterator(this);
    }
}