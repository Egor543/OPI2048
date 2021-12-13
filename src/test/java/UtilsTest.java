import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UtilsTest {

    @org.junit.Test
    public void testAdd(){
        int a = 2;
        int b = 3;
        int expResult = 5;
        int result = Utils.add(a,b);
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testDiv(){
        int a = 8;
        int b = 2;
        int expResult = 4;
        int result = Utils.div(a,b);
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testDet(){
        int a = 4;
        int b = 2;
        int expResult = 2;
        int result = Utils.det(a,b);
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testCon(){
        int a = 2;
        int b = 2;
        int expResult = 4;
        int result = Utils.con(a,b);
        assertEquals(expResult, result);
    }
    @org.junit.Test
    public void testCon1(){
        int a = 2;
        int b = 2;
        int c = 2;
        int expResult = 8;
        int result = Utils.con1(a,b,c);
        assertEquals(expResult, result);
    }
    @org.junit.Test
    public void testDet1(){
        int a = 8;
        int b = 2;
        int c = 2;
        int expResult = 4;
        int result = Utils.det1(a,b,c);
        assertEquals(expResult, result);
    }
    @org.junit.Test
    public void testAdd1(){
        int a = 2;
        int b = 2;
        int c = 2;
        int expResult = 6;
        int result = Utils.add1(a,b,c);
        assertEquals(expResult, result);
    }
    @org.junit.Test
    public void testCon2(){
        int a = 2;
        int b = 2;
        int c = 2;
        int expResult = 8;
        int result = Utils.con2(a,b,c);
        assertEquals(expResult, result);
    }
}
