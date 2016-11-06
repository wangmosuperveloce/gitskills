package algorithms;

import java.util.*;

/**
 * Created by wangmo on 16/9/7.
 *
 *
 */
public class Solution {

    /**
     * Given an integer n, return the number of trailing zeroes in n!.
       Note: Your solution should be in logarithmic time complexity.
     * @param n
     * @return
     */
    public int trailingZeroes(int n) {
        int number = 0;
        while(n!=0){
            number += n/5;
            n /=5;
        }
        return number;
    }

    /**
     * Given an index k, return the kth row of the Pascal's triangle.
     For example, given k = 3,
     Return [1,3,3,1].
     */

    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<Integer>();
        result.add(1);
        int num = 1;
        int n = rowIndex / 2;
        for(int i=0; i<n; i++){
            double rate = 1.0 * (rowIndex-i)/(i+1);
            num = (int) ((long)num * (rowIndex-i)/(i+1));
            result.add(num);
        }
        n = (rowIndex-1)/2;
        while(n>=0){
            result.add(result.get(n));
            n--;
        }
        return result;
    }

    /**
     * Determine whether an integer is a palindrome. Do this without extra space.
     */
    public boolean isPalindrome(int x) {
        if(x==0) return true;
        if(x < 0 || x%10 == 0) return false;
        int origin = x;
        long i=x%10;
        x = x/10;
        while(x!=0){
            i=i*10+x%10;
            x=x/10;
        }
        return origin==i;
    }

    /**
     * Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
     */
    public int getSum(int a, int b) {
        int result = a|b;
        int fc=a,left=b;
        while((fc&left)!=0){
            int fa = ~a;
            int fb = ~b;
            fc = fa^fb;
            int aab = a&b;
            int aob = a|b;
            left = (aab & aob) << 1;
            result = left|(fc);
        }
        return result;
    }

    public char findTheDifference(String s, String t) {
        int result = 0;
        for(char c:s.toCharArray()){
            result = result ^ c;
        }
        for(char c:t.toCharArray()){
            result = result ^ c;
        }
        return (char)result;
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> map = new HashMap<Character, Integer>();
        for(char c: ransomNote.toCharArray()){
            Integer i = map.getOrDefault(c,new Integer(0));
            i++;
            map.put(c, i);
        }
        for(char c: magazine.toCharArray()){
            Integer i = map.get(c);
            if(i!=null){
                if(i==1){
                    map.remove(c);
                }else{
                    i--;
                    map.put(c, i);
                }
            }
        }
        return map.isEmpty();
    }

    public int firstUniqChar(String s) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        for(char c: s.toCharArray()){
            int i = map.getOrDefault(c, new Integer(0)) + 1;
            map.put(c, i);
        }

        char unique = ' ';
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            if(entry.getValue()==1){
                unique = entry.getKey();
                break;
            }
        }

        int i=0;
        for(char c: s.toCharArray()){
            if(c==unique)
                return i;
            i++;
        }

        return -1;
    }

    public boolean hasPathSum(TreeNode root, int sum) {
        Stack<TreeNode> node = new Stack<TreeNode>();
        int val = 0;
        while(!node.isEmpty() || root!=null){
            while(root != null){
                node.push(root);
                val += root.val;
                root = root.left;
            }

            if(val == sum && node.peek().right==null){
                return true;
            }

            if(!node.isEmpty()){
                root = node.pop();
                val -= root.val;
                root = root.right;
            }

        }
        return false;
    }

    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        if(A>C) {
            int temp = A;
            A = C;
            C= temp;
        }
        if(B>D) {
            int temp = B;
            B = D;
            D = temp;
        }

        if(E>G) {
            int temp = E;
            E = G;
            G= temp;
        }
        if(F>H) {
            int temp = F;
            F = H;
            H = temp;
        }
        System.out.println(A+" "+B+" "+C+" "+D+" "+E+" "+F+" "+G+" "+H);

        if(E>A && E<C){
            if(F>B && F<D){
                return (C-E) * (D-F);
            } else if (H>B && H<D) {
                return (C-E) * (H-B);
            }
        } else if(G>A && G<C) {
            if(F>B && F<D){
                return (G-A) * (D-F);
            } else if (H>B && H<D) {
                return (G-A) * (H-B);
            }
        }
        return 0;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode h0 = new ListNode(0);
        h0.next = head;
        ListNode front = h0;
        ListNode below = h0;

        for(int i=0;i<n;i++){
            below = below.next;
        }

        while(below.next != null){
            front = front.next;
            below = below.next;
        }

        front.next = front.next.next;

        return h0.next;
    }

    public boolean wordPattern(String pattern, String str) {
        String[] strs = str.split(" ");
        if(pattern.length() != strs.length) return false;
        Map<Character, String> map1 = new HashMap<Character, String>();
        Map<String, Character> map2 = new HashMap<String, Character>();
        for(int i=0;i<strs.length;i++){
            if(map1.get(pattern.charAt(i))!=null && map2.get(strs[i])!=null){
                String s = map1.get(pattern.charAt(i));
                if(s.compareTo(strs[i]) != 0) return false;
            }else if(map1.get(pattern.charAt(i))==null && map2.get(strs[i])==null){
                map1.put(pattern.charAt(i), strs[i]);
                map2.put(strs[i], pattern.charAt(i));
            }else {
                return false;
            }
        }
        return true;
    }

    public boolean isValid(String s) {
        char[] c = s.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        for(char x:c){
            if(x=='(' || x=='{' || x=='['){
                stack.push(x);
            }else{
                if(stack.isEmpty()) return false;
                char top = stack.pop();
                System.out.println(top + " " + x);
                if(top=='(' && x!=')') return false;
                if(top=='[' && x!=']') return false;
                if(top=='{' && x!='}') return false;
            }
        }
        if(stack.isEmpty())
            return true;
        return false;
    }

    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<Integer>();
        int i = n;
        int nextN = 0;
        while(true){
            while(i>=10 || i%10!=0){
                nextN += (i%10)*(i%10);
                i=i/10;
            }
            if(nextN == 1) return true;
            if(set.add(nextN) == false) return false;
            i = nextN;
            nextN = 0;
        }
    }

    /**
     Given an unsorted integer array, find the first missing positive integer.
     For example,
     Given [1,2,0] return 3,
     and [3,4,-1,1] return 2.
     Your algorithm should run in O(n) time and uses constant space.
     */
    public int firstMissingPositive(int[] nums) {
        int numberOfPositive = 0;
        for(int i:nums) {
            if (i > 0) {
                numberOfPositive++;
            }
        }
        return 0;
    }
    //Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int L1 = nums1.length;
        for(int i=0;i<m;i++){
            nums1[L1-i-1] = nums1[m-i-1];
        }

        int pos = L1-m;
        int pos2=0;
        int i=0;
        while(pos<L1 && pos2<nums2.length){
            if(nums1[pos] < nums2[pos2]){
                nums1[i++] = nums1[pos++];
            } else {
                nums1[i++] = nums2[pos2++];
            }
        }

        if(pos<L1){
            while(pos<L1){
                nums1[i++] = nums1[pos++];
            }
        }else{
            while(pos2<nums2.length){
                nums1[i++] = nums2[pos2++];
            }
        }
    }

    public int lengthOfLastWord(String s) {
        s = s.trim();
        for(int i=0;i<s.length();i++){
            if(s.charAt(s.length()-1-i) == ' '){
                return i;
            }
        }
        return s.length();
    }

//    Given a singly linked list, determine if it is a palindrome.
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode reverse = null;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            ListNode temp = reverse;
            reverse = slow;
            slow = slow.next;
            reverse.next = temp;
        }
        if (fast != null) {
            slow = slow.next;
        }
        while (slow != null) {
            if (reverse.val != slow.val) {
                return false;
            }
            reverse = reverse.next;
            slow = slow.next;
        }
        return true;
    }

    public ListNode removeElements(ListNode head, int val) {
        ListNode h0 = new ListNode(0);
        h0.next = head;
        ListNode retain = h0;
        ListNode current = head;
        while (current != null) {
            if (current.val == val) {
                h0.next = h0.next.next;
            } else {
                h0 = h0.next;
            }
            current = current.next;
        }
        return retain.next;
    }

    public String longestCommonPrefix(String[] strs) {
        String result = "";
        int x=0;
        while(true){
            char c = strs[0].charAt(x);
            for(int i=1;i<strs.length;i++){
                if(strs[i].length() < x+1 || c != strs[i].charAt(x)) return result;
            }
            result += c;
            x++;
        }
    }


    public String addBinary(String a, String b) {
        String c = "";
        if (a.length() > b.length()) {
            String temp = a;
            a = b;
            b = temp;
        }
        int L = b.length() - a.length();
        String temp = "";
        for(int i=0;i<L;i++){
            temp += "0";
        }
        a = temp + a;

        a = "0" + a;
        b = "0" + b;
        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();
        int length = aArray.length;
        char x = '0';
        for(int i=0; i < length; i++){
            int count = aArray[length-1-i] + bArray[length-1-i] + x -'0' - '0' -'0';
            if (count == 0) {
                c = '0' + c;
            } else if (count == 1) {
                c = '1' + c;
                x = '0';
            } else if (count == 2) {
                c = '0' + c;
                x = '1';
            } else if (count == 3) {
                c = '1' + c;
                x = '1';
            } else {
                System.exit(1);
            }
        }
        while (c.charAt(0) == '0' && c.length() > 1) {
            c = c.substring(1);
        }
        return c;
    }


    public List<String> readBinaryWatch(int num) {
        int[] left1 = new int[]{1,2,4,8};
        int[] left2 = new int[]{3,5,6,9,10};
        int[] left3 = new int[]{7,11};

        int[] right1 = new int[]{1,2,4,8,16,32};
        int[] right2 = new int[]{3,5,9,17,33,6,10,18,34,12,20,36,24,40,48};
        int[] right3 = new int[]{7,11,19,35,13,21,37,25,41,49,14,22,38,26,42,28,44,56};
        List<List<String>> left = new ArrayList<List<String>>();

        for(int i=0;i<4;i++){
            List<String> temp = new ArrayList<String>();
        }

        List<String> result = new ArrayList<String>();

        for(int i=0;i<num;i++){
//            int left = i;
            int right = num-i;

        }

        return null;
    }

    /**
     * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
     You may assume that each input would have exactly one solution.
     */
    public int[] twoSum(int[] nums, int target) {
        int[] array = new int[nums.length];
        System.arraycopy(nums,0,array,0,nums.length);
        Arrays.sort(array);
        int a=0,b=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(array[i]+array[j] == target){
                    a=i;b=j;break;
                }
            }
            if(a!=b) break;
        }
        int[] result = new int[2];
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
            if(a!=-1 && nums[i] == array[a]){
                result[0] = i;
                a=-1;
            } else if(b!=-1 && nums[i] == array[b]){
                result[1] = i;
                b=-1;
            }
        }
        Arrays.sort(result);
        return result;
    }

    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public int countPrimes(int n) {
        if( n <=2) {
            return 0;
        }
        int c= 1;
        boolean isNotPrime[] = new boolean[n+1];
        for(int i=3;i*i<=n;i=i+2) {
            if(isNotPrime[i]) {
                continue;
            }
            for(int j= i*i ;j<=n;j=j+2*i) {
                isNotPrime[j] = true;
            }

        }
        for(int i =3;i<n;i=i+2){
            if(!isNotPrime[i]) {
                c++;
            }
        }
        return c;

        //        if (n <= 2) return 0;
//        List<Integer> list = new ArrayList<>();
//        list.add(2);
//        for (int i=3; i<n; i++)  {
//            boolean isPrime = true;
//            for (int prime : list) {
//                if (i%prime == 0) {
//                    //System.out.println(i);
//                    isPrime = false;
//                    break;
//                }
//                if(prime*prime > i) break;
//            }
//            if (isPrime) {
//                list.add(i);
//                //System.out.println(i);
//            }
//        }
////        System.out.println(list.toString());
//        return list.size();
    }

    public String convert(String s, int numRows) {
        if(numRows == 1) return s;
        StringBuilder[] strings = new StringBuilder[numRows];
        for(int i=0;i<strings.length;i++){
            strings[i] = new StringBuilder();
        }
        int step = 1;
        int count = 0;
        for(char c : s.toCharArray()){
            strings[count].append(c);
            if (count == 0) {
                step = 1;
            } else if (count == numRows - 1) {
                step = -1;
            }
            count += step;
        }
        StringBuilder res = strings[0];
        for(int i=1;i<numRows;i++){
            res.append(strings[i]);
        }
        return res.toString();
    }

    /*Given an unsorted array, find the maximum difference between the successive elements in its sorted form.
    Try to solve it in linear time/space.
    Return 0 if the array contains less than 2 elements.
    You may assume all elements in the array are non-negative integers and fit in the 32-bit signed integer range.*/
    public int maximumGap(int[] nums) {
        if (nums.length < 2) return 0;
        int min = nums[0];
        for (int i=1; i<nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        for (int i=0; i<nums.length; i++) {
            nums[i] -= min;
        }

        Pair[] pairs = new Pair[nums.length];

        for (int i=0; i<nums.length; i++) {
            if (pairs[i] == null) {

            }
        }

        return 0;
    }
    private class Pair{
        int left;
        int right;
        Pair(int left, int right) {
            this.left = left;
            this.right  =right;
        }
    }


    public String convertToTitle(int n) {
        if (n <= 0) return null;
        String result = "";
        char A = 'A';
        while (n > 0) {
            result = (char)(A + (n - 1)%26) + result;
            n = (n - 1) / 26;
        }
        return result;
    }

    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        if (k < 0) k += nums.length;
        int[] big = new int[k];
        for (int i=nums.length-k; i<nums.length; i++){
            big[i-nums.length+k] = nums[i];
        }
        for (int i=0; i<nums.length-k; i++){
            nums[nums.length-i-1] = nums[nums.length-k-i-1];
        }
        for (int i=0; i<k; i++) {
            nums[i] = big[i];
        }
    }

    public int compareVersion(String version1, String version2) {
        int i=0,j=0;
        while (i<version1.length() && j<version2.length()) {
            long x1 = 0L;
            long x2 = 0L;
            while (i < version1.length() && version1.charAt(i++) != '.') {
                x1 = x1*10 + (version1.charAt(i-1)-'0');
            }
            while (j < version2.length() && version2.charAt(j++) != '.') {
                x2 = x2*10 + (version2.charAt(j-1)-'0');
            }
            if (x1 < x2) return -1;
            if (x1 > x2) return 1;
        }

        if (i < version1.length()) {
            if (!version1.substring(i).matches("(([0]+\\.)|([0]+))*")) {
                return 1;
            }
        }
        if (j < version2.length()) {
            if (!version2.substring(j).matches("(([0]+\\.)|([0]+))*")) return -1;
        }
//        BigDecimal bigDecimal = new BigDecimal("123");
//        bigDecimal.intValue()
        return 0;

//        if (version1.equals(version2)) return 0;
//        String[] vss1 = version1.split("\\.");
//        String[] vss2 = version2.split("\\.");
//        int minlen = vss1.length > vss2.length ? vss2.length : vss1.length;
//        for (int i=0; i<minlen; i++) {
//            BigDecimal s1 = new BigDecimal(vss1[i]);
//            BigDecimal s2 = new BigDecimal(vss2[i]);
//            if (s1.compareTo(s2) != 0) return s1.compareTo(s2);
//        }
//        if (vss1.length > vss2.length) {
//            for (int i = minlen; i<vss1.length; i++){
//                if (!vss1[i].matches("[0]*")) return 1;
//            }
//        }
//        if (vss2.length > vss1.length) {
//            for (int i = minlen; i<vss2.length; i++){
//                if (!vss2[i].matches("[0]*")) return -1;
//            }
//        }
    }

    public static void main(String[] args) throws Exception{
        Solution solution = new Solution();
        System.out.println(solution.compareVersion("1.0","1"));
//        solution.rotate(new int[]{1,2,3,4,5,6,7}, 3);
    }


}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}