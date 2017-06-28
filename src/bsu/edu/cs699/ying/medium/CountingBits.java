package bsu.edu.cs699.ying.medium;

/**
 * Proble :https://leetcode.com/submissions/detail/107518289/
 * Created by yliu12 on 6/27/2017.
 * 15 / 15 test cases passed.
 Status: Accepted
 Runtime: 161 ms
 */
public class CountingBits {

    public int[] countBits(int num) {
        int[] result = new int[num+1];
        for (int i=0;i<=num;i++){
            String binary = Integer.toBinaryString(i);
            String replace = binary.replace("1","");
            result[i] = binary.length()-replace.length();
        }
    return result;
    }

    public static void main(String[] args){
        CountingBits ks = new CountingBits();
        System.out.println(ks.countBits(2).toString());


    }

}
