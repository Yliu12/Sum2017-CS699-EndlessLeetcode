package bsu.edu.cs699.ying.easy;

/**
 * https://leetcode.com/problems/student-attendance-record-i/#/description
 * Created by yliu12 on 2017/7/17.
 * 113 / 113 test cases passed.
 * Status: Accepted
 * Runtime: 10 ms
 */
public class StudentAttendanceRecordI {
    public boolean checkRecord(String s) {
        boolean Aflag = false;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'A') {
                if (Aflag) {
                    return false;
                } else {
                    Aflag = !Aflag;
                }
            }
            if (s.charAt(i) == 'L') {
                if (i < s.length() - 2) {
                    if (s.charAt(i + 1) == 'L' && s.charAt(i + 2) == 'L') {
                        return false;
                    }
                }
            }

        }
        return true;
    }
}
