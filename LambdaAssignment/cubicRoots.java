package LambdaAssignment;
import java.util.function.Function;

public class cubicRoots {
    //Normal java mathmatical function
    public static Function<Integer, Integer> cubedFunction = new Function<Integer, Integer>() {
        @Override
        public Integer apply(Integer number) {
            return number * number *  number;
        }
     };
    //Lambda Expressions to replace the function expressions
    public static Function<Integer, Integer> cubedLambda = (number) -> number * number * number;

}
