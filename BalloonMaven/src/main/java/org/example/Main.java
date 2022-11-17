package org.example;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi zadatu rec: ");
        String rec = sc.nextLine();
        writeInFile wf = new writeInFile(rec);
        wf.writeInFile(rec);
    }

}
