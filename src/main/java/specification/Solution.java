package specification;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

/**
 * Created by wangmo on 16/9/7.
 *
 *
 */
public class Solution implements Serializable{

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

    public int reverseBits(int n) {
        return 0;
    }

    public static void main(String[] args) throws Exception{
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLastWord("a"));
        ObjectOutputStream os = new ObjectOutputStream(new ByteArrayOutputStream());
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