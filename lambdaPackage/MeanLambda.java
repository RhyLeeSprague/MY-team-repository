import java.util.Arrays;

public class MeanLambda {
    public static double calculateMean(int[] numbers){
        return Arrays.stream(numbers)
        .average()
        .orElse(0.0);
    }

}
