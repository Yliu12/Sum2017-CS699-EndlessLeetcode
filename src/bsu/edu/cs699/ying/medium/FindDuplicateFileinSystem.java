package bsu.edu.cs699.ying.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/find-duplicate-file-in-system/#/description
 * Created by yliu12 on 2017/6/30.
 * 161 / 161 test cases passed.
 * Status: Accepted
 * Runtime: 78 ms
 */
public class FindDuplicateFileinSystem {

    public List<List<String>> findDuplicate(String[] paths) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> fileMap = new HashMap<>();
        for (String items : paths) {
            String[] itemArray = items.split(" ");

            String filePath = itemArray[0];
            for (int i = 1; i < itemArray.length; i++) {
                String file = itemArray[i];
                String content = file.substring(file.indexOf('(') + 1, file.indexOf(')'));
                String fileFullName = filePath + "/" + file.substring(0, file.indexOf('('));


                fileMap.putIfAbsent(content, new ArrayList());

                fileMap.get(content).add(fileFullName);


            }
        }
        for (List<String> sameContentFileNamse : fileMap.values()) {
            if (sameContentFileNamse.size() > 1) {
                result.add(sameContentFileNamse);
            }
        }
        return result;
    }

}
