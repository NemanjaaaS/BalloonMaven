package org.example;

import org.junit.jupiter.api.Test;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution("BAXLXLOXON");


    @Test
    void fillSmap() {
        HashMap<Character,Integer> Smapa = new HashMap<>();
        Smapa.put('B',1);
        Smapa.put('A',1);
        Smapa.put('L',1);
        Smapa.put('O',1);
        Smapa.put('N',1);
        assertEquals(Smapa,solution.fillSmap(),"All keys should have value 1.");

    }

    @Test
    void fillArr() {

       int[] arr = {1,1,1,1,1};
       fillSmap();
       assertArrayEquals(arr,solution.fillArr());
    }

    @Test
    void testSolution() {

        fillSmap();
        fillArr();

        assertEquals(1,solution.solution("BAXLXLOXON"),"Solution should return 1");
    }

}