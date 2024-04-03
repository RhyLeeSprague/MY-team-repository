package lambdaPackage;
import java.util.function.Function;

public class AddLambda {
    public static Function<Integer, Integer>
    AdditionLambda = (x) -> (x * 6) + (x - 2);

}
