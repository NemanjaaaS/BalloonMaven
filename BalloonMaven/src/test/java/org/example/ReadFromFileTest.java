package org.example;

import Exceptions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ReadFromFileTest {
    String StringPath = "BalloonMaven/src/main/java/files/searchStrings.txt";
    String StringPathWrong = "src/main/java/files/unknown.txt";

    ReadFromFile rf = new ReadFromFile(StringPath);

    @Test
    void readFromFile() throws NoFileException {
        ArrayList<String> testString = new ArrayList<>();
        testString.add("BAONXXOLL");
        testString.add("BAOOLLNNOLOLGBAX");
        testString.add("QAWABAWONL");
        testString.add("ONLABLABLOON");

        assertEquals(testString,rf.ReadFromFile(StringPath));

        System.out.println("Data from file read successfully");
    }

    @Test
    public void readFromFileCatch(){
        assertThrows(NoFileException.class,
                ()-> {
                    rf.ReadFromFile(StringPathWrong);
                });
    }

}