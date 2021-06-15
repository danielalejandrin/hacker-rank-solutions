package info.danidev;

public class TripletsArrays {

    public static final String ERROR_VALIDATION_MESSAGE = "Triplet contains number out of range [1-100]";

    public static int[] compareTriplets(int[] firstTriplet, int[] secondTriplet) throws Exception {
        int firstTripletPoints =0;
        int secondTripletPoints = 0;
        validateTriplet(firstTriplet);
        validateTriplet(secondTriplet);
        for(int i=0; i<3;i++){

            if(firstTriplet[i]>secondTriplet[i]){
                firstTripletPoints++;
            }
            if(firstTriplet[i]< secondTriplet[i]){
                secondTripletPoints++;
            }
        }
        return new int[]{firstTripletPoints, secondTripletPoints};
    }

    private static void validateTriplet(int[] triplet) throws Exception {
        for(int i=0;i< triplet.length;i++){
            if (triplet[i] <1 || triplet[i] >100){
                throw new Exception(ERROR_VALIDATION_MESSAGE);
            }
        }
    }
}
