package com.github.whalerain.leetcodetrain;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author ZhangXi
 */
@Slf4j
public class Exercise300To400Test {

    /**
     * test
     * 373. 查找和最小的K对数字
     * 执行用时 :327 ms, 在所有 Java 提交中击败了7.16% 的用户
     * 内存消耗 :93.7 MB, 在所有 Java 提交中击败了25.00%的用户
     */
    @Test
    public void testKSmallestPairs() {
        int[] nums1 = {1,7,11}, nums2 = {2,4,6};
        List<List<Integer>> result = Exercise300To400.kSmallestPairs(nums1, nums2, 3);
        log.info(JSONObject.toJSONString(result));
        //fixme: 需要重新设计，效率比较低
    }



}
