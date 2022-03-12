package Class5;

public class Doubts {
    public static void main(String[] args) {


        int num = 5;

        int res = num + (num++ * 5);
        /*
                multiply    (num * 5) 25
                addition    num + 25 -> 30
                assignment  res = 30
                post-inc    num + 1 -> 6

         */

        System.out.println(num);
        System.out.println(res);




    }
}
