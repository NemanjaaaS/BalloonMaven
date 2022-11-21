package org.example;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi zadatu rec: ");
        String rec = sc.nextLine();
        writeInFile wf = new writeInFile(rec);
        wf.writeInFile(rec);

        //Solution solution = new Solution("BAXLXLOOXN");
        //solution.solution("BAXLXLOOXN");

        //System.out.println("SOLUTION SAMO ZA BALLOON "+solution.solution("BAXLXLOOXN"));

        System.out.println("Results are in result.txt file!");
    }

}
