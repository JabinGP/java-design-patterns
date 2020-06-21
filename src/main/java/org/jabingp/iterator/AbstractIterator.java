package org.jabingp.iterator;

public interface AbstractIterator {
    public void next();

    public void previous();

    public boolean isLast();

    public boolean isFirst();

    public String getNextItem();

    public String getPreviousItem();
}