package info.danidev.easy;

import info.danidev.easy.TripletsCollections;
import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TripletsCollectionsTest {

    public static String NUMBER_OUT_OF_RANGE = "A number must be between 1 and 100";
    List<Integer> tripletA;
    List<Integer> tripletB;

    @BeforeAll
    void setUp(){
        tripletA = Arrays.asList(5,6,7);
        tripletB = Arrays.asList(3,6,10);
    }

    @Test
    void shouldReturnAList(){
        Assertions.assertTrue(TripletsCollections.compareTriplets(tripletA, tripletB) instanceof List);
    }

    @Test
    void shouldReturnAListOfSizeTwo(){
        List<Integer> result = TripletsCollections.compareTriplets(tripletA, tripletB);
        Assertions.assertTrue(result.size() == 2);
    }

    @Test
    @DisplayName("Should return [1,1]")
    void shouldReturnAListWithOnes(){
        List<Integer> result = TripletsCollections.compareTriplets(tripletA, tripletB);
        Assertions.assertEquals(1, result.get(0));
        Assertions.assertEquals(1, result.get(1));
    }

    @Test
    @DisplayName("Should return [2,1]")
    void shouldReturnAListWithTwoAndOne(){
        List<Integer> tripletC = Arrays.asList(17,28,30);
        List<Integer> tripletD = Arrays.asList(99,16,8);

        List<Integer> result = TripletsCollections.compareTriplets(tripletC, tripletD);
        Assertions.assertEquals(2, result.get(0));
        Assertions.assertEquals(1, result.get(1));
    }

    @Test
    void shouldThrowAnErrorTripletsWithInvalidNumbers(){
        List<Integer> tripletC = Arrays.asList(17,28,30);
        List<Integer> tripletD = Arrays.asList(0,101,8);
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> TripletsCollections.compareTriplets(tripletC, tripletD));
    }


}
