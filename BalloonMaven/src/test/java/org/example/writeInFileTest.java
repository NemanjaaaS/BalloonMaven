package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.ArrayList;

public class writeInFileTest {
    String rec = "BALLOON";

    @Test
    void writeInFile() throws IOException {
        writeInFile wf = new writeInFile(rec);
        ArrayList<String> rezultatTest = new ArrayList<>();
        rezultatTest.add("Rec: BALLOON se pojavljuje 1 u reci:BAONXXOLL");
        rezultatTest.add("Rec: BALLOON se pojavljuje 2 u reci:BAOOLLNNOLOLGBAX");
        rezultatTest.add("Rec: BALLOON se pojavljuje 0 u reci:QAWABAWONL");
        rezultatTest.add("Rec: BALLOON se pojavljuje 1 u reci:ONLABLABLOON");
        //System.out.println(wf.writeInFile(rec));
        //System.out.println(rezultatTest);

        assertEquals(rezultatTest,wf.writeInFile(rec));
    }
}
