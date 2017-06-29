package bsu.edu.cs699.ying.medium;

/**
 * Created by yliu12 on 2017/6/26./**
 * Proble : https://leetcode.com/problems/sum-of-two-integers/#/description
 * Created by yliu12 on 6/26/2017.
 * 55 / 55 test cases passed.
 Status: Accepted
 Runtime: 9 ms
 */

public class ComplexNumberMultiplication {
    public String complexNumberMultiply(String a, String b) {
        a = a.replace("i", "");
        b = b.replace("i", "");

        String[] as =  a.split("/+");
        String[] bs =  b.split("/+");




        return         Integer.parseInt(as[0])*Integer.parseInt(bs[0]) - Integer.parseInt(as[1])*Integer.parseInt(bs[1]) +"+"+ (Integer.parseInt(as[1])*Integer.parseInt(bs[0]) + Integer.parseInt(as[0]) *Integer.parseInt(bs[1])) +"i";
    }
}
