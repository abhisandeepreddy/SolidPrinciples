package org.practical.ISP.BadCode;

public class MultiplePurposePrinter implements Machine{
    @Override
    public void copy(Document document) {
        System.out.println("Copying the document");
    }

    @Override
    public void print(Document document) {
        System.out.println("Printing the document");
    }

    @Override
    public void scan(Document document) {
        System.out.println("Scaning the document");
    }
}
