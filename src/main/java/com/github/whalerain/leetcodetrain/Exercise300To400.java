package com.github.whalerain.leetcodetrain;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ZhangXi
 */
public class Exercise300To400 {


    /**
     * 373. 查找和最小的K对数字
     * https://leetcode-cn.com/problems/find-k-pairs-with-smallest-sums/
     */
    public static List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> result = new ArrayList<>();
        if (null == nums1 || nums1.length == 0 || null == nums2 || nums2.length == 0) {
            return result;
        }
        int index = 0;


        for (int i=0; i<nums1.length; i++) {
            int nextMin = (i == nums1.length - 1 ? nums1[i] : nums1[i+1]) + nums2[0];
            for (int j=0; j<nums2.length; j++) {
                if (index >= k) {
                    break;
                }
                if (i < nums1.length -1 && nums1[i] + nums2[j] > nextMin) {
                    break;
                }
                List<Integer> arr = new ArrayList<>(2);
                arr.add(nums1[i]);
                arr.add(nums2[j]);
                result.add(arr);
                index++;
            }
            if (index >= k) {
                // 退出算法
                break;
            }
        }
        return result;
    }


}
