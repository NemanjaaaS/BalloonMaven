package org.example;

import Exceptions.NoFileException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import java.io.IOException;
import java.util.ArrayList;

@ExtendWith(MockitoExtension.class)


public class writeInFileTest {
    String StringPath = "src/main/java/files/searchStrings.txt";
    String rec;
    writeInFile wf;
    @Mock
    SolutionAll solutionAll;

    @BeforeEach
    public void setUp(){
        wf = new writeInFile(rec);
        rec = "BALLOON";

    }

    @Test
    void writeInFile() throws IOException {
        lenient().when(solutionAll.solution("BAOOLLNNOLOLGBAX","BALLOON")).thenReturn(2);

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
