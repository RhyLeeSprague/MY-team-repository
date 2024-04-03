import java.util.function.Function;

public class LambdaTest {
    public static Function<Integer, Integer> squareLambda = (number) -> number * number;

    public static Function<String, Integer> stringLengthLambda = (str) -> str.length();
    public static void main(String[] args){
        int number = 13;
        String str = "Heyyyyy";

        int calculateLambda = squareLambda.apply(number); 
        int resultLambda = stringLengthLambda.apply(str);

        System.out.println(resultLambda);
        System.out.println(calculateLambda);
    }    
}
