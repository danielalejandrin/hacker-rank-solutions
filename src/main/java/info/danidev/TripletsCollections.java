package info.danidev;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TripletsCollections {
    public static String NUMBER_OUT_OF_RANGE = "A number must be between 1 and 100";

    public static List<Integer> compareTriplets(List<Integer> tripletA, List<Integer> tripletB) {
        checkInvalidNumbers(tripletA);
        checkInvalidNumbers(tripletB);

        int sumA = 0;
        int sumB = 0;

        for (int i = 0; i< tripletA.size(); i++){
            if(tripletA.get(i)> tripletB.get(i)){
                sumA++;
            }else if (tripletA.get(i)< tripletB.get(i)){
                sumB++;
            }
        }
        return Arrays.asList(sumA,sumB);
    }

    private static void checkInvalidNumbers(List<Integer> triplet) throws IllegalArgumentException{
        List<Integer> invalidNumbers = triplet.stream()
                .filter(num -> num < 1 || num > 100)
                .collect(Collectors.toList());
        if(!invalidNumbers.isEmpty()){
            throw new IllegalArgumentException(NUMBER_OUT_OF_RANGE);
        }
    }
}
