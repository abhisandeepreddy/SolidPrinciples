package org.practical.ISP.BadCode;

public class SimplePrinter implements Machine{
    @Override
    public void copy(Document document) {
        System.out.println("Copying the document");
    }

    @Override
    public void print(Document document) {
        throw new UnsupportedOperationException("can't print the doc");
    }

    @Override
    public void scan(Document document) {
        throw new UnsupportedOperationException("can't scan the doc");
    }
}
