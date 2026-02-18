package org.practical.ISP.GoodCode;

public class SimplePrinter implements Print{
    @Override
    public void print(Document document) {
        System.out.println("Printing the document");
    }
}
