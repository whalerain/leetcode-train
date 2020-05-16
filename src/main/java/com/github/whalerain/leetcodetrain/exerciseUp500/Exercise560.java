package com.github.whalerain.leetcodetrain.exerciseUp500;

import com.github.whalerain.leetcodetrain.support.Level;
import com.github.whalerain.leetcodetrain.support.LevelGetter;

import java.util.HashMap;

/**
 * 560. 和为K的子数组
 * https://leetcode-cn.com/problems/subarray-sum-equals-k/
 *
 * @author ZhangXi
 */
public class Exercise560 implements LevelGetter {

    /**
     * 第一想法：暴力枚举
     * 执行用时 :355 ms, 在所有 Java 提交中击败了11.95% 的用户
     * 内存消耗 :40.8 MB, 在所有 Java 提交中击败了7.69%的用户
     */
    public static int subarraySum(int[] nums, int k) {
        if (null == nums || nums.length == 0) {
            return 0;
        }

        int count = 0;
        for (int i=0; i<nums.length; i++) {
            int sum = nums[i];
            if (sum == k) {
                count++;
            }
            if (i+1 < nums.length) {
                for (int j=i+1; j<nums.length; j++) {
                    sum += nums[j];
                    if (sum == k) {
                        count++;
                    }
                }
            }
        }

        return count;
    }


    /**
     * 官方思路：前缀和 + HashMap优化
     */
    public static int subarraySumOfficial(int[] nums, int k) {
        //todo
        int count = 0, pre = 0;
        HashMap< Integer, Integer > mp = new HashMap < > ();
        mp.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            pre += nums[i];
            if (mp.containsKey(pre - k))
                count += mp.get(pre - k);
            mp.put(pre, mp.getOrDefault(pre, 0) + 1);
        }
        return count;
    }



    @Override
    public Level get() {
        return Level.MIDDLE;
    }
}
