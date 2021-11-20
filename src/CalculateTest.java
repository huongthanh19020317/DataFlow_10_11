import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class CalculateTest extends TestCase {

    @Test
    public void test1() {
        Assert.assertEquals("Input khong hop le!", Calculate.Calculate_L(3, 35, 1, 500, 0));
    }

    @Test
    public void test2() {
        Assert.assertEquals("Chua dat muc tieu!", Calculate.Calculate_L(1, 35, 1, 200, 0));
    }

    @Test
    public void test3() {
        Assert.assertEquals("Chua dat muc tieu!", Calculate.Calculate_L(2, 35, 1, 200, 0));
    }

    @Test
    public void test4() {
        Assert.assertEquals("Chua dat muc tieu!", Calculate.Calculate_L(1, 35, 2, 400, 0));
    }

    @Test
    public void test5() {
        Assert.assertEquals("Lo!", Calculate.Calculate_L(1, 35, 2, 1, 0));
    }
    public void testCalculate_L() {

    }

    public void testMain() {
    }

    @org.junit.Test
    public void calculate_L() {
    }
}