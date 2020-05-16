package com.github.whalerain.leetcodetrain.exerciseUp1000;

/**
 * 1013. 将数组分成和相等的三个部分
 * https://leetcode-cn.com/problems/partition-array-into-three-parts-with-equal-sum/
 *
 * @author ZhangXi
 */
public class Exercise1013 {


    /**
     *
     */
    public static boolean canThreePartsEqualSum(int[] array) {
        if (null == array || array.length < 3) {
            return false;
        }

        // 计算总和
        int total = 0;
        for (int i=0; i<array.length; i++) {
            total += array[i];
        }
        if (total % 3 != 0) {
            return false;
        }

        // 依次计算前两部分组合值
        int sum = total / 3, top = 0;
        for (int i=0; i<array.length-2; i++) {
            top += array[i];
            if (top == sum) {
                int mid = 0;
                for (int j=i+1; j<array.length-1; j++) {
                    mid += array[j];
                    if (mid == sum) {
                        return true;
                    }
                }
            }
        }

        return false;
    }


}
