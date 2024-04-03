package LambdaAssignment;

import java.util.function.Function;

public class QuinticRoots {
    public static Function<Integer, Integer> quinticFunction = new Function<Integer, Integer>() {
        @Override
        public Integer apply(Integer number) {
            return number * number *  number * number * number;
        }
     };
    public static Function<Integer, Integer> quinticLambda = (number) -> number * number * number * number * number;

}
