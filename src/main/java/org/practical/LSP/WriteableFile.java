package org.practical.LSP;

public class WriteableFile extends ReadableFile implements Writeable{
    @Override
    public void write() {
        System.out.println("Writing in the file......");
    }
}
