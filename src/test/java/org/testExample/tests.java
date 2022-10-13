package org.testExample;
import org.example.Main;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class tests {

    @Test
    public void test1(){
        Main mainmain = new Main();

        boolean res = mainmain.checkGreater(2,1);

        assertTrue(res);
    }

    @Test
    public void test2(){
        Main mainmain = new Main();

        boolean res = mainmain.checkGreater(1,3);

        assertTrue(res);
    }
}
