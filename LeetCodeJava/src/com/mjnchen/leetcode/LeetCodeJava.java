package com.mjnchen.leetcode;

/**
 * Created by mjnchen on 7/17/19.
 */
public class LeetCodeJava {
    public static void main(String[] args) {
        // System.out.println("Hello World!");
        // int[] test=new int[]{2,1};
        // LeetCodeOJ78 solution=new LeetCodeOJ78();
        // System.out.println(solution.subsets(test));

        // List<List<Integer>> test=new List<List<Integer>>([[2],[3,4],[6,5,7],[4,1,8,3]]);
        // LeetCodeOJ120 solution=new LeetCodeOJ120();
        // System.out.println(solution.minimumTotal(test));

        // int[] candidates=new int[]{2,3,5,7};
        // int target=7;
        // LeetCodeOJ39 solution=new LeetCodeOJ39();
        // List<List<Integer>> result=solution.combinationSum(candidates,target);
        // System.out.println(result);

        // LeetCodeOJ95 solution=new LeetCodeOJ95();
        // List<TreeNode> result=solution.generateTrees(3);
        // System.out.println(result);

        // int[] num={2,2,2};
        // Arrays.sort(num);
        // //System.out.println(Arrays.toString(num));
        // LeetCodeOJ90A solution=new LeetCodeOJ90A();
        // List<List<Integer>> result=solution.subsetsWithDup(num);
        // System.out.println(result);

        // int[] inorder={1,2};
        // int[] postorder={1,2};
        // ////System.out.println(Arrays.toString(num));
        // LeetCodeOJ106 solution=new LeetCodeOJ106();
        // TreeNode result=solution.buildTree(inorder, postorder);
        // System.out.println(result);

        // int[] inorder={1,2};
        // int[] preorder={1,2};
        // ////System.out.println(Arrays.toString(num));
        // LeetCodeOJ105 solution=new LeetCodeOJ105();
        // TreeNode result=solution.buildTree(preorder,inorder);
        // System.out.println(result);

        // String s = "aabb";
        // List<List<String>> result = new ArrayList<List<String>>();
        // LeetCodeOJ131 solution = new LeetCodeOJ131();
        // result = solution.partition(s);
        // System.out.println(result);

        // String s = new String("aa");
        // int result;
        // LeetCodeOJ3 solution = new LeetCodeOJ3();
        // result = solution.lengthOfLongestSubstring(s);
        // System.out.println(result);

        // String s = new String("aaba");
        // String result;
        // LeetCodeOJ5 solution = new LeetCodeOJ5();
        // result = solution.longestPalindrome(s);
        // System.out.println(result);

        // String digits = new String("2");
        // List<String> result = new ArrayList<String>();
        // LeetCodeOJ17 solution = new LeetCodeOJ17();
        // result = solution.letterCombinations(digits);
        // System.out.println(result);

        // int[] nums = new int[]{1, 1, 2, 3, 4, 5, 6};
        // int target = 12;
        // LeetCodeOJ18 solution = new LeetCodeOJ18();
        // List<List<Integer>> result = new ArrayList<List<Integer>>();
        // result = solution.fourSum(nums, target);
        // System.out.println(result);

        // LeetCodeOJ29 solution = new LeetCodeOJ29();
        // int result = solution.divide(15, 3);
        // System.out.println(result);

        // int[] nums = new int[]{5, 1, 1};
        // LeetCodeOJ31 solution = new LeetCodeOJ31();
        // solution.nextPermutation(nums);
        // System.out.println(Arrays.toString(nums));

        // LeetCodeOJ38 solution = new LeetCodeOJ38();
        // String result = solution.countAndSay(5);
        // System.out.println(result);

        // int[] candidates=new int[]{1, 1};
        // int target=1;
        // LeetCodeOJ40 solution=new LeetCodeOJ40();
        // List<List<Integer>> result=solution.combinationSum2(candidates,target);
        // System.out.println(result);

        // LeetCodeOJ43 solution = new LeetCodeOJ43();
        // String result = solution.multiply("123", "456");
        // System.out.println(result);

        // int[] nums = new int[]{1, 1, 1};
        // LeetCodeOJ47 solution = new LeetCodeOJ47();
        // List<List<Integer>> result = solution.permuteUnique(nums);
        // System.out.println(result);

        // LeetCodeOJ52 solution = new LeetCodeOJ52();
        // int result;
        // result = solution.totalNQueens(4);
        // System.out.println(result);

        // LeetCodeOJ60 solution = new LeetCodeOJ60();
        // String result = solution.getPermutation(4, 7);
        // System.out.println(result);

        // LeetCodeOJ67 solution = new LeetCodeOJ67();
        // String a = "111";
        // String b ="11";
        // String result = solution.addBinary(a, b);
        // System.out.println(result);

        // LeetCodeOJ69 solution = new LeetCodeOJ69();
        // int result = solution.mySqrt(2147483647);
        // System.out.println(result);

        // LeetCodeOJ71 solution = new LeetCodeOJ71();
        // String path = "/.";
        // String result = solution.simplifyPath(path);
        // System.out.println(result);

        // LeetCodeOJ93 solution = new LeetCodeOJ93();
        // List<String> result = solution.restoreIpAddresses("25525511135");
        // for(int i = 0; i < result.size(); i++){
        //     System.out.println(result.get(i));
        // }

        // LeetCodeOJ125 solution = new LeetCodeOJ125();
        // boolean result = solution.isPalindrome("A man, a plan, a canal: Panama");
        // System.out.println(result);

        // String start = "hit", end = "cog";
        // Set<String> dict = new HashSet<String>(Arrays.asList("hot","dot","dog","lot","log"));
        // Set<String> visited = new HashSet<String>();
        // visited.add(start);
        // LeetCodeOJ127 solution = new LeetCodeOJ127();
        // List<String> test = solution.findNextStr(start, dict, visited);
        // int result = solution.ladderLength(start, end, dict);
        // System.out.println(test);
        // System.out.println(result);

        // int[] gas = new int[]{1, 2};
        // int[] cost = new int[]{2, 1};
        // LeetCodeOJ134 solution = new LeetCodeOJ134();
        // int result = solution.canCompleteCircuit(gas, cost);
        // System.out.println(result);

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        node3.next = null;
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node4.next = node5;
        node5.next = null;
        LeetCodeOJ143 solution = new LeetCodeOJ143();
        ListNode head = solution.reverseList(node4); // reverseList seems OK
        // while (head != null){
        // System.out.println(head.val);
        // head = head.next;
        // }
        ListNode head2 = solution.mergeTwoLists(node1, head);
        while (head2 != null){
            System.out.println(head2.val);
            head2 = head2.next;
        }
        node3.next = node4;


        // // Testing codes corresponding to foundations of Java:
        // int x = -1;
        // System.out.println(x>>1);  // The value of 'x>>>29' is 00...0111
        // System.out.println(x>>>29);  // The value of 'x>>>29' is 00...0111
        // System.out.println(x>>>30);  // The value of 'x>>>30' is 00...0011
        // System.out.println(x>>>31);  // The value of 'x>>>31' is 00...0001

        // final int arr1[] = {1, 2, 3, 4, 5};
        // int arr2[] = {10, 20, 30, 40, 50};
        // arr2 = arr1;
        // // arr1 = arr2;
        // for (int i = 0; i < arr2.length; i++)
        //     System.out.println(arr2[i]);

        //return;

        // BinomialCoefficient test=new BinomialCoefficient();
        // int result = test.binomialCoefficient(4,2);
        // System.out.println(result);

        // int a = -7;
        // int b = -3;
        // int c = a / b;
        // int d = a % b;
        // System.out.println(d); // 5 mod -2 is 1
    }
}
