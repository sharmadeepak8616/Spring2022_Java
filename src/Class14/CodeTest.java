package Class14;

public class CodeTest {

    /**
     * Ques-1:
     * Create a method to return an int-array after sorting a given input-int-array
     * points: 10
     */
    /*
     *
     * eg:
     * input -> [32, 54, 12, 67, 2, 5]
     * returned array -> [2, 5, 12, 32, 54, 67]
     *
     * input -> [5, 4, 3, 1, 2]
     * returned array -> [1, 2, 3, 4, 5]
     *
     * input -> [90, 34, 12, 4]
     * returned array -> [4, 12, 34, 90]
     *
     * int[] inputArr = {32, 54, 12, 67, 2, 5};
     * int[] outputArr = sortArray(inputArr);   // {2, 5, 12, 32, 54, 67}
     *
     * int[] inputArr = {5, 4, 3, 1, 2};
     * int[] outputArr = sortArray(inputArr);   // {1, 2, 3, 4, 5}
     */


    /**
     * Ques-2:
     * Create a method to return the sum of digits in input-int-value
     * points: 20
     */
    /*
     *
     * eg:
     * input -> 123
     * returned value -> 6  (1 + 2 + 3)
     *
     * input -> 323
     * returned value -> 8  (3 + 2 + 3)
     *
     * input -> 90
     * returned value -> 9  (9 + 0)
     *
     * int result1 = addDigits(123);    // result1 = 6
     *
     * int result2 = addDigits(575);    // result2 = 17
     *
     *
     *
     */


    /**
     * Ques-3:
     * Create a method to return an int-array after removing input-int-value from an input-int-array
     * points: 30
     */
    /*
     *
     * eg:
     * input -> 23, {23, 54, 67, 12, 34, 23, 56}
     * returned array -> {54, 67, 12, 34, 56}
     *
     * input -> 5, {23, 5, 67, 87, 10, 5, 34, 98, 66, 55}
     * returned array -> {23, 67, 87, 10, 34, 98, 66, 55}
     *
     * input -> 11, {22, 33, 44, 55}
     * returned array -> {22, 33, 44, 55}
     *
     *
     * int[] inputArr = {23, 54, 67, 12, 34, 23, 56};
     * int[] outputArr = removeValueFromArray(23, inputArr);    // {54, 67, 12, 34, 56}
     *
     * int[] inputArr2 =  {23, 5, 67, 87, 10, 5, 34, 98, 66, 55}
     * int[] outputArr2 = removeValueFromArray(5, inputArr2);    // {23, 67, 87, 10, 34, 98, 66, 55}
     *
     */

    /**
     * Ques-4:
     * Create a method to print the common Strings values in two input-String-arrays
     * points: 40
     * Note: two input-String-arrays can be of same size or different size
     */
    /*
     *
     * eg:
     * input -> {"happY", "king", "peace", "living standard"} , {"king kong", "Happy", "PEACE"}
     * Method should print ->
     * happy
     * peace
     *
     * input -> {“ab”, “abcd”, “abc”, “abcde”, “defg”, "koli”} , {“abcde”, “jhuy”, “plot”, “koli”}
     * Method should print ->
     * abcde
     * koli
     *
     * String[] inputArr1 = {"happY", "king", "peace", "living standard"};
     * String[] inputArr2 = {"king kong", "Happy", "PEACE"};
     *
     * printCommons(inputArr1, inputArr2);
     * happy
     * peace
     *
     *
     * String[] inputArr3 = {“ab”, “abcd”, “abc”, “abcde”, “defg”, "koli”};
     * String[] inputArr4 = {“abcde”, “jhuy”, “plot”, “koli”};
     *
     * printCommons(inputArr3, inputArr4);
     * abcde
     * koli
     *
     *
     *
     */
}
