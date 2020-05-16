package com.github.whalerain.leetcodetrain.exerciseUp300;

import java.util.*;

/**
 * 373. 查找和最小的K对数字
 * https://leetcode-cn.com/problems/find-k-pairs-with-smallest-sums/
 *
 * @author ZhangXi
 */
public class Exercise373 {


    /**
     *
     */
    public static List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> result = new ArrayList<>();
        if (null == nums1 || nums1.length == 0 || null == nums2 || nums2.length == 0 || k == 0) {
            return result;
        }

        TreeMap<Integer, List<List<Integer>>> sumMap = new TreeMap<>();

        for (int i=0; i< nums1.length; i++) {
            for (int j=0; j<nums2.length; j++) {
                Integer sum = nums1[i] + nums2[j];
                List<List<Integer>> partResult = sumMap.containsKey(sum) ? sumMap.get(sum) : new LinkedList<>();
                List<Integer> arrUnit = Arrays.asList(nums1[i], nums2[j]);
                partResult.add(arrUnit);
                sumMap.put(sum, partResult);
            }
        }

        Iterator<Integer> it = sumMap.keySet().iterator();
        // treeMap的Key默认升序排序
        while (it.hasNext()) {
            List<List<Integer>> partResult = sumMap.get(it.next());
            for (List<Integer> unit : partResult) {
                if (result.size() < k) {
                    result.add(unit);
                } else {
                    return result;
                }
            }
        }

        return result;
    }


}
