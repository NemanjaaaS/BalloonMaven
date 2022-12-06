package org.example;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class writeInFile {
    String rec;

    public writeInFile(String Rec) {
        rec = Rec;
    }

    public ArrayList<String> writeInFile(String rec) throws IOException {


        String StringPath = "BalloonMaven/src/main/java/files/searchStrings.txt";

        ReadFromFile rf = new ReadFromFile(StringPath);
        ArrayList<String> S = rf.ReadFromFile(StringPath);

        String filePath ="BalloonMaven/src/main/java/files/results.txt";
        FileWriter fw = new FileWriter(filePath,false);


        for(int i = 0;i<S.size();i++){
            SolutionAll solutionAll = new SolutionAll(S.get(i),rec);
            int result = solutionAll.solution(S.get(i),rec);
            String str = "Rec: "+rec+" se pojavljuje "+result+" u reci:"+S.get(i)+"\n";

            fw.write(str);

        }
        fw.close();


        ReadFromFile readF = new ReadFromFile(filePath);

        ArrayList<String> rezultat = new ArrayList<>();

        readF.ReadFromFile(filePath).forEach(i->rezultat.add(i));


        return rezultat;



    }
}
