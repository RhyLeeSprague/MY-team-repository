package lambdaPackage;
public class CalculatorApp {
    public static void main(String args[]){
        int x = 10;
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int[] arr2 = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        int subResult = SubLambdaCalculator.subtractionLambda.apply(x);
        int addResult = AddLambda.AdditionLambda.apply(x);
        double avgResult = AverageLambdaCalculator.calculateAverage(arr);
        double sumResult = SumLambdaCalculator.calculateSum(arr2);

        System.out.println("Result of SubtractLambda: " + subResult);
        System.out.println("Result of AdditionLambda: " + addResult);
        System.out.println("Result of AverageLambda: " + avgResult);
        System.out.println("Result of SumLambda: " + sumResult);

    }

}
