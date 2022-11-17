package org.example;

import Exceptions.NoFileException;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class writeInFile {
    String rec;

    public writeInFile(String Rec) {
        rec = Rec;
    }

    public ArrayList<String> writeInFile(String rec) throws IOException {
        //ArrayList<String> res = new ArrayList<>();

        String StringPath = "src/main/java/files/searchStrings.txt";

        ReadFromFile rf = new ReadFromFile(StringPath);
        ArrayList<String> S = rf.ReadFromFile(StringPath);

        String filePath ="src/main/java/files/results.txt";
        FileWriter fw = new FileWriter(filePath,false);


        for(int i = 0;i<S.size();i++){
            SolutionAll solutionAll = new SolutionAll(S.get(i),rec);
            int result = solutionAll.solution(S.get(i),rec);
            String str = "Rec: "+rec+" se pojavljuje "+result+" u reci:"+S.get(i)+"\n";

            fw.write(str);



            //System.out.println("Resenje za sve "+str);
        }
        fw.close();


        ReadFromFile readF = new ReadFromFile(filePath);
        //res = readF.ReadFromFile(filePath);
        //System.out.println(readF.ReadFromFile(filePath));
        ArrayList<String> rezultat = new ArrayList<>();
        //rezultat = readF.ReadFromFile(filePath);
        readF.ReadFromFile(filePath).forEach(i->rezultat.add(i));

        //System.out.println("OVO JE REZULTAT U wIf: "+rezultat);

        return rezultat;



    }
}
