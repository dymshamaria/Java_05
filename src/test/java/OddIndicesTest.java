import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class OddIndicesTest {

    //Positive
    @Test
    @Ignore
    public void testArrayOddIndices_HappyPath() {
        int[] array = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};

        int[] actualResult = new OddIndices().oddIndices(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testArrayOddIndices_ArrayOfTwo() {
        int[] array = {-45, 590};
        int[] expectedResult = {590};

        int[] actualResult = new OddIndices().oddIndices(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testArrayOddIndices_ArrayOfOne() {
        int[] array = {-45};
        int[] expectedResult = {};

        int[] actualResult = new OddIndices().oddIndices(array);

        Assert.assertEquals(actualResult, expectedResult);
    }


    //Negative
    @Test
    public void testArrayOddIndices_Null() {
        int[] array = null;
        int[] expectedResult = {};

        int[] actualResult = new OddIndices().oddIndices(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testArrayOddIndices_Empty() {
        int[] array = {};
        int[] expectedResult = {};

        int[] actualResult = new OddIndices().oddIndices(array);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
