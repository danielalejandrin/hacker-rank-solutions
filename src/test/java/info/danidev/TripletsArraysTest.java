package info.danidev;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TripletsArraysTest {

    public static final String TRIPLET_CONTAINS_NUMBER_OUT_OF_RANGE_1_100 = "Triplet contains number out of range [1-100]";

    @Test
    void mustReturnAnArrayComparingTriplets() throws Exception {
        //Given
        int[] tripletA = new int[]{1,1,1};
        int[] tripletB = new int[]{1,1,1};
        //When
        int[] comparison = TripletsArrays.compareTriplets(tripletA,tripletB);
        //Then
        Assertions.assertTrue(Arrays.isArray(comparison));
    }

    @Test
    void mustReturnAnArrayOfSizeTwo() throws Exception {
        int[] tripletA = new int[]{1,1,1};
        int[] tripletB = new int[]{1,1,1};
        int[] comparison = TripletsArrays.compareTriplets(tripletA, tripletB);
        Assertions.assertEquals(2, comparison.length);
    }

    @Test
    @DisplayName("Must Return and Array Of Two [1,1]")
    void mustReturnAnArrayOfSizeTwoWithOnes() throws Exception {
        int[] tripletA = new int[]{5,6,7};
        int[] tripletB = new int[]{3,6,10};
        int[] comparison = TripletsArrays.compareTriplets(tripletA, tripletB);
        Assertions.assertArrayEquals(new int[]{1, 1}, comparison);
    }

    @Test
    @DisplayName("Must Return and Array Of Two [2,1]")
    void mustReturnAnArrayOfSizeTwoWithResult1() throws Exception {
        int[] tripletA = new int[]{17,28,30};
        int[] tripletB = new int[]{99,16,8};
        int [] comparison = TripletsArrays.compareTriplets(tripletA, tripletB);
        Assertions.assertArrayEquals(new int[]{2,1}, comparison);
    }

    @Test
    void mustReturnExceptionTripletContainsZero(){
        int[] tripletA = new int[]{1,0,3};
        int[] tripletB = new int[]{0,3,1};
        Exception exception = Assertions.assertThrows(Exception.class, () ->
                TripletsArrays.compareTriplets(tripletA, tripletB));

        String expectedMessage = TRIPLET_CONTAINS_NUMBER_OUT_OF_RANGE_1_100;
        String actualMessage = exception.getMessage();

        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }


}
