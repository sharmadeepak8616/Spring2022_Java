package Class14;

import java.util.Arrays;

public class TrySolution {
    public static void main(String[] args) {
        CodeTest_Solution solution = new CodeTest_Solution();

        int[] q1Numbers = {32, 54, 12, 67, 2, 5};
        System.out.println("***** Solution for Q1: *****\nInput array -> " + Arrays.toString(q1Numbers));
        int[] q1Result = solution.sortArray(q1Numbers);
        System.out.println("Sorted Array -> " + Arrays.toString(q1Result));

        int q2Input = 333;
        int q2Result = solution.addDigitsFromNumber(q2Input);
        System.out.println("\n\n***** Solution for Q2: *****\nInput value -> " + q2Input);
        System.out.println("Total of digits -> " + q2Result);

        int[] q3Array = {23, 54, 67, 12, 34, 23, 56};
        int q4NumberToRemove = 23;
        int[] q4Result = solution.removedIntFromArray(q4NumberToRemove, q3Array);
        System.out.println("\n\n***** Solution for Q3: *****\nInput number to remove -> " + q4NumberToRemove + "\nInput array -> " + Arrays.toString(q3Array));
        System.out.println("Array after removing -> " + Arrays.toString(q4Result));


        String[] q4Input1 = {"ab", "abcd", "abc", "abcde", "defg", "koli"};
        String[] q4Input2 = {"abcde", "jhuy", "plot", "koli"};
        System.out.println("\n\n***** Solution for Q4: *****\nInput array-1 -> " + Arrays.toString(q4Input1) + "\nInput array-2 -> " + Arrays.toString(q4Input2));
        System.out.println("Common values -> ");
        solution.printCommonInArrays(q4Input1, q4Input2);

    }
}
