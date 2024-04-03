package LambdaAssignment;

public class MainLambda {
    public static void main(String args[]){
        //Variable to apply to functions/lambdas
        int x = 2;

        //To assign the function expressions to a result variable to print.
        int squaredFunctionResult = Assignment6.squareFunction.apply(x);
        int cubedFunctionResult = Assignment6.cubedFunction.apply(x);
        int quarticFunctionResult = Assignment6.quarticFunction.apply(x);
        int quinticFunctionResult = Assignment6.quinticFunction.apply(x);

        //To assign the lambda expressions to a result variable to print.
        int squaredResult = Assignment6.squareLambda.apply(x);
        int cubedResult = Assignment6.cubedLambda.apply(x);
        int quarticResult = Assignment6.quarticLambda.apply(x);
        int quinticResult = Assignment6.quinticLambda.apply(x);

        //To print out all results of the mathmatcial functions before conversion
        System.out.println("Result of squaredFunction: " + squaredFunctionResult);
        System.out.println("Result of cubicRootFunction: " + cubedFunctionResult);
        System.out.println("Result of quarticRootFunction: " + quarticFunctionResult);
        System.out.println("Result of quinticRootFunction: " + quinticFunctionResult);

        //To print out all results of lambdas conversions
        System.out.println("Result of squaredLambda: " + squaredResult);
        System.out.println("Result of cubicRootLambda: " + cubedResult);
        System.out.println("Result of quarticRootLambda: " + quarticResult);
        System.out.println("Result of quinticRootLambda: " + quinticResult);

    }
    
}
