package org.jabingp.chainofresponsibility;

public class SQLSearchContext extends SearchContext {

    @Override
    public void search(String keyword) {
        System.out.println("Searching SQL by keyword: " + keyword + " .....");
        if (this.successor != null) {
            this.successor.search(keyword);
        }
    }

}