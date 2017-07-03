package bsu.edu.cs699.ying.medium;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/contest/leetcode-weekly-contest-39/problems/design-log-storage-system/
 *
 * Created by yliu12 on 2017/7/1.
 *63 / 63 test cases passed.
 Status: Accepted
 Runtime: 248 ms

 */
public class LogSystem {

    private Map<BigDecimal, Integer> logMap = new HashMap<>();

    public LogSystem() {
        logMap = new HashMap<>();

    }

    public void put(int id, String timestamp) {
        logMap.put(getDoubletimeStamp(timestamp, "Second"), id);
    }

    public BigDecimal getDoubletimeStamp(String timestamp, String gra) {

        BigDecimal bd = new BigDecimal("0");
        String[] times = timestamp.split(":");
        int maxi = 0;

        //Year:Month:Day:Hour:Minute:Second
        switch (gra) {
            case "Year":
                maxi = 0;
                break;
            case "Month":
                maxi = 1;
                break;
            case "Day":
                maxi = 2;
                break;
            case "Hour":
                maxi = 3;
                break;
            case "Minute":
                maxi = 4;
                break;
            case "Second":
                maxi = 5;
                break;

        }
        for (int i = 0; i <= maxi; i++) {

            bd = bd.add(
                    BigDecimal.valueOf(Double.parseDouble(times[i])).movePointLeft(2 * i));
        }
        return bd;
    }

    public List<Integer> retrieve(String s, String e, String gra) {

        int maxi = 0;

        //Year:Month:Day:Hour:Minute:Second
        switch (gra) {
            case "Year":
                maxi = 0;
                break;
            case "Month":
                maxi = 1;
                break;
            case "Day":
                maxi = 2;
                break;
            case "Hour":
                maxi = 3;
                break;
            case "Minute":
                maxi = 4;
                break;
            case "Second":
                maxi = 5;
                break;

        }

        List<Integer> result = new ArrayList<>();
        BigDecimal st = getDoubletimeStamp(s, gra);
        BigDecimal et = getDoubletimeStamp(e, gra).add(BigDecimal.ONE.movePointLeft(2 * maxi));


        for (BigDecimal k : logMap.keySet()) {
            if ((k.compareTo(st) == 1 || k.compareTo(st) == 0) && k.compareTo(et) == -1)
                result.add(logMap.get(k));
        }
        return result;
    }

    public static void main(String[] args) {
        LogSystem obj = new LogSystem();
        obj.put(1, "2017:01:01:23:59:59");
        obj.put(2, "2017:01:02:23:59:59");
        obj.put(3, "2016:01:01:00:00:00");
        List<Integer> param_1 = obj.retrieve("2017:01:01:23:59:59", "2017:01:02:23:59:59", "Second");
        //List<Integer> param_2  =obj.retrieve("2016:01:01:01:01:01","2017:01:01:23:00:00","Hour");
//["LogSystem","put","put","retrieve"]

        // List<Integer> param_2 = obj.retrieve(s,e,gra);


    }
}