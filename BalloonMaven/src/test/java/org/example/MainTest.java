package org.example;

import Exceptions.NoFileException;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    ReadFromFile rf = new ReadFromFile("src/main/java/files/searchStrings.txt");
    ArrayList<String> S = rf.ReadFromFile("src/main/java/files/searchStrings.txt");


    MainTest() throws NoFileException {

    }


}