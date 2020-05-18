package com.github.whalerain.leetcodetrain.exerciseUp0;

import java.util.*;

/**
 * 3. 无重复字符的最长子串
 * https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
 *
 * @author ZhangXi
 */
public class Exercise3 {

    /**
     * 执行用时 :732 ms, 在所有 Java 提交中击败了5.01% 的用户
     * 内存消耗 :40.7 MB, 在所有 Java 提交中击败了5.20%的用户
     */
    public static int lengthOfLongestSubstring(String s) {
        if (null == s || "".equals(s)) {
            return 0;
        }
        char[] chars = s.toCharArray();

        String pre = String.valueOf(chars[0]);
        LinkedList<String> link = new LinkedList<>();
        link.add(String.valueOf(chars[0]));
        int max = 0;
        for (int i=0; i<chars.length; i++) {
            String ch = String.valueOf(chars[i]);
            ListIterator<String> it = link.listIterator();
            while (it.hasNext()) {
                String val = it.next();
                if (val.length() > max) {
                    max = val.length();
                }
                if (val.contains(ch)) {
                    it.remove();
                } else if (!val.endsWith(pre)) {
                    it.remove();
                } else {
                    it.add(val+ch);
                }
            }
            pre = ch;
            link.add(ch);
        }

        for (String val : link) {
            if (val.length() > max) {
                max = val.length();
            }
        }

        return max;
    }


    /**
     * 官方思路：使用"滑动窗口"
     */
    public static int lengthOfLongestSubstringOfficial(String s) {
        // 哈希集合，记录每个字符是否出现过
        Set<Character> occ = new HashSet<Character>();
        int n = s.length();
        // 右指针，初始值为 -1，相当于我们在字符串的左边界的左侧，还没有开始移动
        int rk = -1, ans = 0;
        for (int i = 0; i < n; ++i) {
            if (i != 0) {
                // 左指针向右移动一格，移除一个字符
                occ.remove(s.charAt(i - 1));
            }
            while (rk + 1 < n && !occ.contains(s.charAt(rk + 1))) {
                // 不断地移动右指针
                occ.add(s.charAt(rk + 1));
                ++rk;
            }
            // 第 i 到 rk 个字符是一个极长的无重复字符子串
            ans = Math.max(ans, rk - i + 1);
        }
        return ans;
    }


}
