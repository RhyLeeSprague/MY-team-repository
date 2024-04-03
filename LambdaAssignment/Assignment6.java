package LambdaAssignment;
import java.util.function.Function;

public class Assignment6 {
    
    //A java function to produce a squared result of any number.
    public static Function<Integer, Integer> squareFunction = new Function<Integer, Integer>() {
        @Override
        public Integer apply(Integer number) {
            return number * number;
        }
     };
    //A lambda conversion for the squareFunction
    public static Function<Integer, Integer> squareLambda = (number) -> number * number;

    //A java function to produce a cubed/to the third power result of any number.
    public static Function<Integer, Integer> cubedFunction = new Function<Integer, Integer>() {
        @Override
        public Integer apply(Integer number) {
            return number * number *  number;
        }
     };
    //A lambda conversion for the cubedFunction
    public static Function<Integer, Integer> cubedLambda = (number) -> number * number * number;

    //A java function to produce a quartic/to the fourth power result of any number.
    public static Function<Integer, Integer> quarticFunction = new Function<Integer, Integer>() {
        @Override
        public Integer apply(Integer number) {
            return number * number *  number * number;
        }
     };
    //A lambda conversion for the quarticFunction
    public static Function<Integer, Integer> quarticLambda = (number) -> number * number * number * number;

    //A java function to produce a Quintic/to the fifth power result of any number.
    public static Function<Integer, Integer> quinticFunction = new Function<Integer, Integer>() {
        @Override
        public Integer apply(Integer number) {
            return number * number *  number * number * number;
        }
     };
    //A lambda conversion for the quinticFunction
    public static Function<Integer, Integer> quinticLambda = (number) -> number * number * number * number * number;

}
