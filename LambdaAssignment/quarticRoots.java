package LambdaAssignment;

import java.util.function.Function;

public class quarticRoots {
    public static Function<Integer, Integer> quarticFunction = new Function<Integer, Integer>() {
        @Override
        public Integer apply(Integer number) {
            return number * number *  number;
        }
     };
    public static Function<Integer, Integer> quarticLambda = (number) -> number * number * number;
}
