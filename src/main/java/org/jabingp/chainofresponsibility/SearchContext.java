package org.jabingp.chainofresponsibility;

public abstract class SearchContext {
    protected SearchContext successor;

    public void setSuccessor(SearchContext successor) {
        this.successor = successor;
    }

    public abstract void search(String keyword);
}
