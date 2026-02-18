package org.practical.ISP.GoodCode;

public class MultiPurposeMachine implements Print, Scan, Copy{

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
