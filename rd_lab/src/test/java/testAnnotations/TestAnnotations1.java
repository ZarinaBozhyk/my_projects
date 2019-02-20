package testAnnotations;

import org.junit.Assert;
import org.junit.Test;

public class TestAnnotations1 {
    @Test
    public void method1(){
        Assert.assertTrue(1+1==2);
    }
    @Test
    public void method2(){
        Assert.assertEquals(20, 5+5);
    }
    @Test
    public void method3(){
       Assert.assertFalse(1+1==2);

    }
    @Test
    public void method4(){
        Assert.assertNotEquals(20, 5+5);
    }
}
