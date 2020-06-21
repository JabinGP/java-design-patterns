package org.jabingp.chainofresponsibility;

public class UMLSearchContext extends SearchContext {

    @Override
    public void search(String keyword) {
        System.out.println("Searching UML by keyword: " + keyword + " ......");
        if (this.successor != null) {
            this.successor.search(keyword);
        }
    }

}