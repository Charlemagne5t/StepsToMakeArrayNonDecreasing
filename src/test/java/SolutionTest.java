import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1(){
        int nums[] = {5,3,4,4,7,3,6,11,8,5,11};
        int expected = 3;
        int actual = new Solution().totalSteps(nums);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test2(){
        int nums[] = {4,5,7,7,13};
        int expected = 0;
        int actual = new Solution().totalSteps(nums);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test3(){
        int nums[] = {6,2,1,4,4,8,12,9};
        int expected = 3;
        int actual = new Solution().totalSteps(nums);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test4(){
        int nums[] = {10,6,5,10,15};
        int expected = 1;
        int actual = new Solution().totalSteps(nums);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test5(){
        int nums[] = {7,14,4,14,13,2,6,13};
        int expected = 3;
        int actual = new Solution().totalSteps(nums);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test6(){
        int nums[] = {10,1,2,3,4,5,6,1,2,3};
        int expected = 6;
        int actual = new Solution().totalSteps(nums);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test7(){
        int nums[] = {5,14,15,2,11,5,13,15};
        int expected = 3;
        int actual = new Solution().totalSteps(nums);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test8(){
        int nums[] = {1682,63,124,147,897,1210,1585,1744,1764,1945,323,984,1886,346,481,1059,1388,1483,1516,1842,1868,1877,504,1197,785,955,970,1848,1851,398,907,995,1167,1214,1423,1452,1464,1474,1311,1427,1757,1992,57,1625,1260,700,725};
        int expected = 10;
        int actual = new Solution().totalSteps(nums);

        Assert.assertEquals(expected, actual);
    }

}
