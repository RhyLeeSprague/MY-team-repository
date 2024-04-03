import java.util.function.Function;

public class LambdaExpressions {
    
    //Function<Integer, Integer> squareFunction = new Function<Integer, Integer>() {
        //@Override
        //public Integer apply(Integer number) {
            //return number * number;
        //}
     //};
    Function<Integer, Integer> squareLambda = (number) -> number * number;

    Function<String, Integer> stringLengthLambda = (str) -> str.length();

         
     //Function<String, Integer> stringLengthFunction = new Function<String, Integer>() {
       // @Override
        //public Integer apply(String str) {
          //  return str.length();
       // }
    // } 
}
