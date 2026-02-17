package org.practical;

import org.practical.LSP.ReadonlyFile;
import org.practical.LSP.WriteableFile;
import org.practical.OCP.Creditcard;
import org.practical.OCP.Debitcard;
import org.practical.OCP.PaymentProcess;
import org.practical.OCP.UPI;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ReadonlyFile rf = new ReadonlyFile();
        rf.read();

        WriteableFile wf = new WriteableFile();
        wf.write();
        wf.read();

    }
}