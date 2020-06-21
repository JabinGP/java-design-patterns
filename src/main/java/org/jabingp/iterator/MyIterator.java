package org.jabingp.iterator;

public class MyIterator implements AbstractIterator {

    private String[] productsName;

    private int index;

    public MyIterator(AbstractProductList list) {
        this.productsName = list.getProductsName();
        this.index = 0;
    }

    @Override
    public void next() {
        if (!this.isLast()) {
            this.index++;
        }
    }

    @Override
    public void previous() {
        if (!this.isFirst()) {
            this.index--;
        }
    }

    @Override
    public boolean isLast() {
        return productsName.length == index + 1;
    }

    @Override
    public boolean isFirst() {
        return index == 0;
    }

    @Override
    public String getNextItem() {
        if (!isLast()) {
            return productsName[this.index + 1];
        }
        return null;
    }

    @Override
    public String getPreviousItem() {
        if (!isFirst()) {
            return productsName[this.index - 1];
        }
        return null;
    }

}