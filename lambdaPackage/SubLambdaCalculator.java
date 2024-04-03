package lambdaPackage;
import java.util.function.Function;

public class SubLambdaCalculator {
    public static Function<Integer, Integer>
    subtractionLambda = (x) -> (x + 100) - (x + 50);
    
}
