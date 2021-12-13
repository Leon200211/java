package task_30;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;



public class OperationsTest {

    @Test
    public void sum() {
        TestClass number = new TestClass(35, 6);
        int expected = TestClass.sum();
        int actual = 35 + 6;
        Assert.assertEquals(expected, actual);
    }
}
