package org.jabingp.chainofresponsibility;

public class JavaSearchContext extends SearchContext {

    @Override
    public void search(String keyword) {
        System.out.println("Searching Java by keyword: " + keyword + " .....");
        if (this.successor != null) {
            this.successor.search(keyword);
        }
    }

}