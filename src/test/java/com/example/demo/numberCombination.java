package com.example.demo;

import javax.swing.tree.TreeNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.lang.Math.floor;
import static java.lang.Math.max;

//public class numberSelect {
//
//    public static void main(String[] args){
//        String digits = "23";
//        List<String> a = letterCombinations(digits);
//    }
//    private static List<String> returnLists = new ArrayList<>();
//
//    public static List<String> letterCombinations(String digits) {
//
//        if(digits.length()==0){return returnLists;}else{
//            HashMap<Character, String[]> map = new HashMap<>();
//            map.put('2', new String[]{"a", "b", "c"});
//            map.put('3', new String[]{"d", "e", "f"});
//            map.put('4', new String[]{"g", "h", "i"});
//            map.put('5', new String[]{"j", "k", "l"});
//            map.put('6', new String[]{"m", "n", "o"});
//            map.put('7', new String[]{"p", "q", "r","s"});
//            map.put('8', new String[]{"t", "u", "v"});
//            map.put('9', new String[]{"w", "x", "y","z"});
//
//            backtrack(returnLists, map, digits, 0, new StringBuffer());
//            System.out.println(returnLists);
//            return returnLists;
//        }
//    }
//
//    public static void backtrack(List<String> returnLists, HashMap<Character, String[]> map, String digits, int index, StringBuffer returnList){
//        if(index == digits.length()){
////            System.out.println(index+"===============================");
////            System.out.println(returnList);
//            returnLists.add(returnList.toString());
//        }else{
//            char digit = digits.charAt(index);
////            System.out.println(digit);
//            String[] mapList = map.get(digit);
//            int mapListCount = mapList.length;
//            for(int i=0; i<mapListCount; i++){
//                returnList.append(mapList[i]);
////                System.out.println(returnList);
//
//                backtrack(returnLists, map, digits, index+1, returnList);
//
//                System.out.println(returnList.charAt(index));
//                returnList.deleteCharAt(index);
//            }
//        }
//
//    }
//}

//public class numberCombination {
//    public static List<List<Integer>> returnLists = new ArrayList<>();
//    public static List<Integer> returnList = new ArrayList<>();
//
//    public static void main(String[] args) {
//        int n = 3;
//        int k = 2;
//        List<List<Integer>> a =combination(n,k);
//    }
//    public static List<List<Integer>> combination(int n, int k){
//        backtrck(n, k, 1);
//        System.out.println(returnLists);
//        return returnLists;
//    }
//    public static void backtrck(int n, int k, int start) {
//        if (returnList.size() == k) {
//            returnLists.add(new ArrayList<>(returnList));
////            System.out.println(returnLists);
//            return;
//        }
//
//        if(k-returnList.size() > n-start+1){
//            int j = n-start;
//            System.out.println(n);
//            System.out.println(start);
//            System.out.println("************************"+j);
//            return;
//        }
//
//        for (int i = start; i <= n; i++) {
////            System.out.println(i);
//            returnList.add(i);
//            backtrck(n, k, i + 1);
//            System.out.println(returnList+"111111111111"+"----------------"+i);
//            returnList.remove(returnList.size()-1);
//            System.out.println(returnList);
//        }
//
//    }
//}


//public class numberCombination {
//    public static List<List<Integer>> returnLists = new ArrayList<>();
//    public static List<Integer> returnList = new ArrayList<>();
//
//    public static void main(String[] args) {
//        int[] candidates = {2,3,6,7};
//
//        int target = 7;
//        List<List<Integer>> a =combinationSum(candidates,target);
//    }
//
//    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
//        Arrays.sort(candidates);
//        backtrack(candidates,target,0);
//        System.out.println(returnLists+"----------------------------------------------------");
//        return returnLists;
//    }
//    public static void backtrack(int[] candidates, int target, int begin){
//        if(target == 0){
//            returnLists.add(new ArrayList<>(returnList));
//            return;
//        }
//        for(int j=begin; j<candidates.length; j++){
//            if(target-candidates[j] < 0){
//                return;
//            }
//            returnList.add(candidates[j]);
//            System.out.println(returnList+"*-*-*-*-*-*-*-*-*-*-*--*-*-*-*");
//            backtrack(candidates, target-candidates[j], j);
//            returnList.remove(returnList.size()-1);
//        }
//    }
//}

//public class numberCombination {
//    public static List<String> returnlists = new ArrayList<>();
//    public static StringBuffer returnlist = null;
//
//    public static void main(String[] args) {
//
//        int n=4;
//        List<String> a =generateParenthesis(n);
//    }
//    public static List<String> generateParenthesis(int n) {
//        backtrack(new StringBuilder(),n, 0,1);
//        System.out.println(returnlists+"***********************");
//        return null;
//    }
//
//    public static void backtrack(StringBuilder returnlist, int n, int left, int right){
//        if(returnlist.length()==2*n){
//            returnlists.add(returnlist.toString());
//            return;
//        }
//
//        if(left<n){
//            returnlist.append("(");
//            backtrack(returnlist, n, left+1, right);
//            returnlist.deleteCharAt(returnlist.length()-1);
//        }
//        if(left>=right){
//            returnlist.append(")");
//            backtrack(returnlist,n, left, right+1);
//            returnlist.deleteCharAt(returnlist.length()-1);
//        }
//    }
//}


//public class numberCombination {
//    public static     List<List<Integer>> combinationSums = new ArrayList<List<Integer>>();
//    public static     List<Integer> combinationSum = new ArrayList<>();
//    public static void main(String[] args) {
//        int[] candidates = {2,5,2,1,2};
//        int target = 5;
//        List<List<Integer>> a = combinationSum2(candidates, target);
//        System.out.println(a);
//    }
//    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
//        Arrays.sort(candidates);
//        backtrack(candidates, target, 0);
//        return combinationSums;
//    }
//    public static void backtrack(int[] candidates, int target, int start){
//        for(int j=start; j<candidates.length; j++){
//            if(target==0){
//                combinationSums.add(new ArrayList<>(combinationSum));
//                return;
//            }
//            if(target-candidates[j]<0){
//                return;
//            }
//            if (j>start && candidates[j]==candidates[j-1]){
//                continue;
//            }
//            combinationSum.add(candidates[j]);
//            backtrack(candidates, target-candidates[j], j+1);
//            combinationSum.remove(combinationSum.size()-1);
//        }
//    }
//}

//public class numberCombination {
//    public static List<List<Integer>> combinationSums = new ArrayList<>();
//    public static List<Integer> combinationSum = new ArrayList<>();
//
//    public static void main(String[] args){
//        int k = 3;
//        int n = 7;
//        combinationSum3(3,7);
//        System.out.println(combinationSums);
//    }
//    public static List<List<Integer>> combinationSum3(int k, int n) {
//        backtrack(k,n,1);
//        return combinationSums;
//    }
//
//    public static void backtrack(int k, int n, int start){
//        if(n == 0 && k == 0){
//            System.out.println(k);
//            combinationSums.add(new ArrayList<>(combinationSum));
//            return;
//        }
//        for(int i=start; i<10; i++){
//            if(n-i < 0){
//                return;
//            }
//            combinationSum.add(i);
////            System.out.println(k);
//            System.out.println("---------------");
//            backtrack(k-1,n-i,i+1);
//            combinationSum.remove(combinationSum.size()-1);
//        }
//    }
//}


//
//public class numberCombination {
//    public static List<List<String>> returnLists = new ArrayList<>();
//    public static List<String> returnList = new ArrayList<>();
//    public static int n=0;
//    public static void main(String[] args){
//        String s = "aaa";
//        partition(s);
//        System.out.println(returnLists);
//    }
//    public static List<List<String>> partition(String s) {
//        backtrack(s, 0);
//        return returnLists;
//    }
//    public static void backtrack(String s, int start){
//        if(start >= s.length()){
//            returnLists.add(new ArrayList<>(returnList));
//            return;
//        }
//        for(int i=start; i<s.length(); i++){
////            System.out.println(i);
////            System.out.println(s.length());
////            System.out.println("---------------------");
//
//            if(isPartition(s, start, i)){
//                returnList.add(s.substring(start, i+1));
//                n++;
//                System.out.println(n);
//            }else {
//                continue;
//            }
//            backtrack(s, i+1);
//            returnList.remove(returnList.size()-1);
//        }
//    }
//    public static boolean isPartition(String s, int begin, int end){
//        for(int i=begin, j=end; i<j; i++, j--){
//            if(s.charAt(i) != s.charAt(j)){
//                return false;
//            }
//            System.out.println("================================");
//        }
//        return true;
//    }
//}


//public class numberCombination {
//    static int n = 0;
//
//    public static void main(String[] args) {
//        String s = "aa";
//        countSubstrings(s);
//        System.out.println(n);
//    }
//    public static int countSubstrings(String s) {
//        for(int i=0; i<s.length(); i++){
//            for(int j=i; j<s.length(); j++){
//                if(isPartition(s,i,j)){
//                    System.out.println(i+"*********"+j);
//                    System.out.println(s.substring(i,j));
//                    n++;
//                }
//            }
//        }
//        return n;
//    }
//    public static boolean isPartition(String s, int begin, int end){
//        for(int i=begin,j=end; i<j; i++,j--){
//            if(s.charAt(i) != s.charAt(j)){
//                return false;
//            }
//        }
//        return true;
//    }
//}


//public class numberCombination {
//
//    public static void main(String[] args) {
//        String s = "a";
//        boolean a = isPartition(s,0,0);
//        if(a){
//            System.out.println("1");
//            return;
//        }
//    }
//
//    public static boolean isPartition(String s, int begin, int end){
//        for(int i=begin,j=end; i<j; i++,j--){
//            if(s.charAt(i) != s.charAt(j)){
//                return false;
//            }
//        }
//        return true;
//    }
//}


//public class numberCombination {
//    static int sum = 0;
//
//    public static void main(String[] args) {
//        fib(3);
//    }
//    public static int fib(int n) {
//        recursion(n);
////        System.out.println(sum);
//        return sum;
//    }
//
//    public static int recursion(int n){
//        if(n>1){
//            sum = recursion(n-1)+recursion(n-2);
//        }else if(n==1){
//            sum = 1;
//        }else{
//            sum = 0;
//        }
//        System.out.println(n+"*****");
//        System.out.println(sum);
//        System.out.println("*****************");
//        return sum;
//    }
//}


//public class numberCombination {
//    public static void main(String[] args) {
//        uniquePaths(3, 7);
//    }
//
//    public static int uniquePaths(int m, int n) {
//        int[][] dp = new int[m][n];
//        //初始化
//        for (int i = 0; i < m; i++) {
//            dp[i][0] = 1;
//        }
//        for (int i = 0; i < n; i++) {
//            dp[0][i] = 1;
//        }
//
//        for(int i=1; i<m; i++){
//            for(int j=1; j<n; j++){
//                dp[i][j] = dp[i-1][j]+dp[i][j-1];
//            }
//        }
//        System.out.println(dp[m-1][n-1]);
//        return dp[m-1][n-1];
//    }
//}


//public class numberCombination {
//    public static void main(String[] args) {
//        int a = integerBreak(2);
//        System.out.println(a);
//    }
//    public static int integerBreak(int n) {
//        int dp[] = new int[n+1];
//        dp[2] = 1;
//        dp[1] = 1;
//        for(int i=2; i<=n; i++){
//            for(int j=1; j<=i-j; j++){
//                dp[i] = Math.max(dp[i], Math.max(j*(i-j), j*dp[i-j]));
//            }
//        }
//        return dp[n];
//    }
//}

//public class numberCombination {
//    public static void main(String[] args) {
//        int[] nums = {-1, 0, 3, 5, 9, 12};
//        int target = 12;
//        int a = search(nums,target);
//        System.out.println(a);
//    }
//    public static int search(int[] nums, int target) {
//        int left = 0;
//        int right = nums.length-1;
//        while (left<=right){
//            int t = (right + left)/2;
//            if(target>nums[t]){
//                left = t+1;
//            }else if(target < nums[t]){
//                right = t-1;
//            }else {
//                return t;
//            }
//        }
//        return -1;
//    }
//}


//class ListNode {
//    int val;
//    ListNode next;
//    ListNode(){}
//    ListNode(int val) {
//        this.val=val;
//    }
//}
//public class numberCombination {
//    public static void main(String[] args) {
//        MyLinkedList();
//        addAtHead(1);
//        addAtTail(3);
//        addAtIndex(1,2);
//        int a= get(1);
//        deleteAtIndex(1);
//        int b= get(1);
//        System.out.println(a+" "+size+"=="+b+" "+size);
//
////        while (head != null){
////            System.out.print(head.val);
////            head = head.next;
////        }
//    }
//    static int size;
//    static ListNode head;
//
//    public static void MyLinkedList() {
//            size = 0;
//            head = new ListNode(0); //虚拟头节点
//        }
//        // 获取链表中第 index 个节点的值
//        public static int get(int index) {
//            if(index>=size || index<0){
//                return -1;
//            }else{
//                ListNode p=head;
//                for(int i=0; i<=index; i++){
//                    p = p.next;
//                }
//                return p.val;
//            }
//        }
//        //在链表的第一个元素之前添加一个值为 val 的节点
//        public static void addAtHead(int val) {
//            addAtIndex(0, val);
//        }
//
//        public static void addAtTail(int val) {
//            addAtIndex(size,val);
//        }
//        //在链表中的第 index 个节点之前添加值为 val  的节点
//        public static void addAtIndex(int index, int val) {
//            if(size<index){
//                return;
//            }
//            if(index<0){
//                index=0;
//            }
//            ListNode p=head;
//            for(int i=0; i<index; i++){
//                p = p.next;
//            }
//            ListNode addNode = new ListNode(val);
//            addNode.next = p.next;
//            p.next = addNode;
//            size++;
//
//        }
//
//        public static void deleteAtIndex(int index) {
//            if(index>=size || index<0){
//                return;
//            }
//            size--;
//            if(index==0){
//                head=head.next;
//                return;
//            }
//            ListNode p=head;
//            for(int i=0; i<index; i++){
//                p = p.next;
//            }
//            p.next = p.next.next;
//
//        }
//    }
//
///**
// * Your MyLinkedList object will be instantiated and called as such:
// * MyLinkedList obj = new MyLinkedList();
// * int param_1 = obj.get(index);
// * obj.addAtHead(val);
// * obj.addAtTail(val);
// * obj.addAtIndex(index,val);
// * obj.deleteAtIndex(index);
// */


//class ListNode {
//    int val;
//    ListNode next;
//    ListNode(){}
//    ListNode(int val) {
//        this.val=val;
//    }
//    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//}
//public class numberCombination {
//    static int size = 0;
//    static ListNode headHead = new ListNode(0); //虚拟头节点
//    public static void main(String[]args){
//        addAtIndex(1,1);
//        addAtIndex(2,2);
//        addAtIndex(3,3);
//        addAtIndex(4,4);
//        addAtIndex(5,5);
//
//        removeNthFromEnd(headHead,2);
//
//    }
//    //在链表中的第 index 个节点之前添加值为 val  的节点
//    public static void addAtIndex(int index, int val) {
//            if(size<index){
//                return;
//            }
//            if(index<0){
//                index=0;
//            }
//            ListNode p=headHead;
//            for(int i=0; i<index; i++){
//                p = p.next;
//            }
//            ListNode addNode = new ListNode(val);
//            addNode.next = p.next;
//            p.next = addNode;
//            size++;
//    }
//    public static ListNode removeNthFromEnd(ListNode head, int n) {
//        int longHead = 0;
//        ListNode q = head;
//        while(q != null){
//            q = q.next;
//            longHead++;
//        }
//        ListNode p = new ListNode();
//        p.next = head;
//        if(p.next == null || n>longHead){
//            return head;
//        }
//        for(int i=1; i<=longHead-n +1; i++){
//            p = p.next;
//        }
//        p.next = p.next.next;
//        System.out.println(head+"*******************");
//        return head;
//    }
//}


//public class numberCombination {
//    public static void main(String[] args) {
//        int n = 91;
//        boolean a = isHappy(n);
//        System.out.println(a);
//    }
//
//    public static boolean isHappy(int n) {
//        Set<Integer> set1 = new HashSet<>();
//        if (n == 1) {
//            return true;
////        }else if(n<=9){
////            return false;
//        }else {
//            while (n > 1) {
//                set1.add(n % 10);
//                n = n / 10;
//            }
//            System.out.println(set1);
//            for (int i : set1) {
//                n += i * i;
//              System.out.println(n);
//            }
//            isHappy(n);
//        }
//        return n==1;
//    }
//}


//public class numberCombination {
//    static String ransomNote = "aa";
//    static String magazine = "ab";
//
//    public static void main(String[] args) {
//        boolean boo = canConstruct(ransomNote, magazine);
//        System.out.println(boo);
//    }
//    public static boolean canConstruct(String ransomNote, String magazine) {
//        Map<String, Integer> map = new HashMap<>();
//        for(int i=0; i<magazine.length(); i++){
//            String s = String.valueOf(magazine.charAt(i));
//            if(map.containsKey(s)){
//                map.put(s, map.get(s)+1);
//            }else{
//                map.put(s, 1);
//            }
//        }
//        for(int j = 0; j< ransomNote.length(); j++){
//            String ss = String.valueOf(ransomNote.charAt(j));
//            System.out.println(ss);
//            if(!map.containsKey(ss)){
//                return false;
//            }else if (map.get(ss)>1){
//                map.put(ss, map.get(ss)-1);
//            }else {
//                map.remove(ss);
//            }
//        }
//        return true;
//    }
//}


//public class numberCombination {
//    public static void main(String[] args) {
//        int[] nums = new int[]{1000000000, 1000000000, 1000000000, 1000000000};
//        int target = -294967296;
//        List<List<Integer>> aa=  fourSum(nums,target);
//        System.out.println(aa);
//    }
//    public static List<List<Integer>> fourSum(int[] nums, int target) {
//        List<List<Integer>> fourNumber = new ArrayList<>();
//        if(nums.length<4){
//            return fourNumber;
//        }
//        Arrays.sort(nums);
//
//        for(int i=0; i<nums.length-3; i++){
//            for(int j=i+1; j<nums.length-2; j++){
//                int left=j+1, right=nums.length-1, t=target-nums[i]-nums[j];
//
////                System.out.println(target);
////                System.out.println(-nums[i]);
////                System.out.println(-nums[j]);
//                System.out.println(nums[0]+nums[1]+nums[2]+nums[3]);
////                System.out.println(t);
////                System.out.println("================");
//                while(left<right){
//                    if(nums[left]+nums[right]==t){
//                        fourNumber.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
//                        while(i<nums.length-3 && nums[i] == nums[i+1]) i++;
//                        while(j<nums.length-2 && nums[j] == nums[j+1]) j++;
//                        while(left<right && nums[left] == nums[left+1]) left++;
//                        while(left<right && nums[right] == nums[right-1]) right--;
//                        left++;
//                        right--;
//                    }else if(nums[left]+nums[right]>t){
//                        right--;
//                    }else{ //nums[left]+nums[right]<t
//                        left++;
//                    }
//                }
//            }
//        }
//        return fourNumber;
//    }
//}


//public class numberCombination {
//    public static void main(String[] args) {
//        String s = "hyzqyljrnigxvdtneasepfahmtyhlohwxmkqcdfehybknvdmfrfvtbsovjbdhevlfxpdaovjgunjqlimjkfnqcqnajmebeddqsgl";
//        String a = "fdcqkmxwholhytmhafpesaentdvxginrjlyqzyhehybknvdmfrfvtbsovjbdhevlfxpdaovjgunjqllgsqddebemjanqcqnfkjmi";
////                    fdcqkmxwholhytmhafpesaentdvxginrjlyqzyhehybknvdmfrfvtbsovjbdhevlfxpdaovjgunjqlimjkfnqcqnajmebeddqsgl
//        int k = 39;
//        reverseStr(s,k);
//    }
//    public static String reverseStr(String s, int k) {
//        int l = s.length(), ll = l, n = 0;
//        char[] ch = s.toCharArray();
//        while(ll>=k){
//            ll = ll-2*k;
//            for(int i = 0; i<k/2; i++){
//                char temp = ch[2*n*k+k-1-i];
//                ch[2*n*k+k-1-i] = ch[2*n*k+i];
//                ch[2*n*k+i] = temp;
//            }
//            n++;
//            System.out.println(n);
//        }
//        System.out.println(ll);
//        if (ll>0) {
//            for (int i = 0; i < ll / 2; i++) {
//                char temp = ch[l - 1 - i];
//                ch[l - 1 - i] = ch[2 * n * k + i];
//                System.out.println(2 * n * k + i);
//                System.out.println("-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
//                ch[2 * n * k + i] = temp;
//            }
//        }
//        System.out.println(l);
//        System.out.println(ch);
//        return new String(ch);
//    }
//}

//public class numberCombination {
//    public static void main(String[] args) {
//        String s = "a good   example";
//        String ss = reverseWords(s);
//        System.out.println(ss);
//    }
//    public static String reverseWords(String s) {
//        String[] str = s.split("\\s+");
//
//        for(int i=0; i<str.length/2; i++){
//            String temp = str[str.length-1-i];
//            str[str.length-1-i] = str[i];
//            str[i] = temp;
//        }
//        System.out.println(str);
//        System.out.println(str.toString());
//        System.out.println(Arrays.toString(str));
//        System.out.println(String.join(" ",str));
//        String aa = String.join(" ",str);
//        System.out.println(aa.length());
//        return aa;
//    }
//}

//public class numberCombination {
//    public static void main(String[] args) {
//
//        int[] nn = {1,2};
//        nextPermutation(nn);
//    }
//    public static void nextPermutation(int[] nums) {
//        int l = nums.length;
//        int index = 0;
//        boolean fig = false;
//        for(int i=l-1; i>0; i--){
//            if(nums[i-1] < nums[i]){
//                index=i-1;
//                fig = true;
//                System.out.println(nums[i-1] +"---"+ nums[i]);
//                break;
//            }
//        }
//        if(fig){
//            for (int i=l-1; i>0; i--){
//                if(nums[index] < nums[i]){
//                    System.out.println(nums[i]+"=-=-=-=-=-=-"+nums[index]);
//                    System.out.println(i+"=-=-=-=-=-=-"+index);
//                    int temp = nums[i];
//                    nums[i] = nums[index];
//                    nums[index] = temp;
//                    break;
//                }
//            }
//            int start = index+1, end = l-1;
//            while(start<end){
//                int tempp = nums[end];
//                nums[end] = nums[start];
//                nums[start] = tempp;
//                start++;
//                end--;
//            }
//        }
//        if(fig == false){
//            for(int i=0; i<l/2; i++){
//                int tempp = nums[l-1-i];
//                nums[l-1-i] = nums[i];
//                nums[i] = tempp;
//            }
//        }
//        System.out.println(Arrays.toString(nums));
//    }
//}

//public class numberCombination {
//    public static void main(String[] args) {
//        int[] nums1 = {};
//        int[] nums2 = {3,4};
//        double a = findMedianSortedArrays(nums1, nums2);
//        System.out.println(a);
//    }
//    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
//        int n = nums1.length;
//        int m = nums2.length;
//        int sum = n+m;
//        int n1=0, n2=0, index=0;
//        int[] nums = new int[m+n];
//        if(n==0){
//            if(m%2 == 0){
//                System.out.println(nums2[m/2]+" "+ (nums2[m/2]+nums2[m/2])/2.0);
//                return (nums2[m/2]+nums2[m/2])/2;
//            }else{
//                return nums2[m/2];
//            }
//        }
//        if(m==0){
//            if(n%2 == 0){
//                return (nums1[n/2]+nums1[n/2])/2;
//            }else{
//                return nums1[n/2];
//            }
//        }
//
//        while(index != (n+m)){
//            if(n1 == n){
//                while (n2 != m){
//                    nums[index] = nums2[n2];
//                    index++;
//                    n2++;
//                }
//                break;
//            }
//            if(n2==m){
//                while (n1 != n){
//                    nums[index] = nums1[n1];
//                    index++;
//                    n1++;
//                }
//                break;
//            }
//            if(nums1[n1] <= nums2[n2]){
//                nums[index] = nums1[n1];
//                index++;
//                n1++;
//            }else{
//                nums[index] = nums2[n2];
//                System.out.println(nums2[n2]);
//                index++;
//                n2++;
//            }
//        }
//        System.out.println( Arrays.toString(nums)+"**************");
//        if(sum %2 == 0){
//            System.out.println(nums[sum/2]+"**************"+nums[sum/2 -1]+"================" + (nums[sum/2]+nums[sum/2 -1])/2.0 );
//
//            return  (nums[sum/2]+nums[sum/2 -1])/2.0 ;
//        }else{
//            System.out.println(nums[n/2]);
//            return nums[sum/2];
//        }
//    }
//}

//public class numberCombination {
//    int nn[] = new int[]{};
//    public static void main(String[] args) {
//        int[] nums1 = {};
//        int[] nums2 = {3, 4};
//        double a = findMedianSortedArrays(nums1, nums2);
//        System.out.println(a);
//    }
//
//    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
//        int n = nums1.length; int m = nums2.length;
//        //因为数组是从索引0开始的，因此我们在这里必须+1，即索引(k+1)的数，才是第k个数。
//        int left = (n + m + 1) / 2; int right = (n + m + 2) / 2;
//        //将偶数和奇数的情况合并，如果是奇数，会求两次同样的 k
//        return (getKth(nums1, 0, n - 1, nums2, 0, m - 1, left)
//                + getKth(nums1, 0, n - 1, nums2, 0, m - 1, right)) * 0.5;
//    }
//    private static int getKth(int[] nums1, int start1, int end1, int[] nums2, int start2, int end2, int k) {
//        //因为索引和算数不同6-0=6，但是是有7个数的，因为end初始就是数组长度-1构成的。
//        //最后len代表当前数组(也可能是经过递归排除后的数组)，符合当前条件的元素的个数
//        int len1 = end1 - start1 + 1; int len2 = end2 - start2 + 1;
//        //让 len1 的长度小于 len2，这样就能保证如果有数组空了，一定是 len1
//        //就是如果len1长度小于len2，把getKth()中参数互换位置，即原来的len2就变成了len1，即len1，永远比len2小
//        if (len1 > len2) return getKth(nums2, start2, end2, nums1, start1, end1, k);
//        //如果一个数组中没有了元素，那么即从剩余数组nums2的其实start2开始加k再-1.
//        //因为k代表个数，而不是索引，那么从nums2后再找k个数，那个就是start2 + k-1索引处就行了。因为还包含nums2[start2]也是一个数。因为它在上次迭代时并没有被排除
//        if (len1 == 0) return nums2[start2 + k - 1];
//        //如果k=1，表明最接近中位数了，即两个数组中start索引处，谁的值小，中位数就是谁(start索引之前表示经过迭代已经被排出的不合格的元素，即数组没被抛弃的逻辑上的范围是nums[start]--->nums[end])。
//        if (k == 1) return Math.min(nums1[start1], nums2[start2]);
//        //为了防止数组长度小于 k/2,每次比较都会从当前数组所生长度和k/2作比较，取其中的小的(如果取大的，数组就会越界)
//        //然后素组如果len1小于k / 2，表示数组经过下一次遍历就会到末尾，然后后面就会在那个剩余的数组中寻找中位数
//        int i = start1 + Math.min(len1, k / 2) - 1;
//        int j = start2 + Math.min(len2, k / 2) - 1;
//        //如果nums1[i] > nums2[j]，表示nums2数组中包含j索引，之前的元素，逻辑上全部淘汰，即下次从J+1开始。
//        //而k则变为k - (j - start2 + 1)，即减去逻辑上排出的元素的个数(要加1，因为索引相减，相对于实际排除的时要少一个的)
//        if (nums1[i] > nums2[j]) {
//            return getKth(nums1, start1, end1, nums2, j + 1, end2, k - (j - start2 + 1));
//        }
//        else {
//            return getKth(nums1, i + 1, end1, nums2, start2, end2, k - (i - start1 + 1));
//        }
//    }
//}


//public class numberCombination {
//    int nn[] = new int[]{};
//    public static void main(String[] args) {
//        int[] nums1 = {5,7,7,8,8,10};
//        int t = 8;
//        int[] a = searchRange(nums1, t);
//        System.out.println(Arrays.toString(a));
//    }
//    public static int[] searchRange(int[] nums, int target) {
//        int start = 0, end = nums.length-1;
//        int left = -1, right = -1;
//        int nn[] = new int[2];
//        while(start<=end){
//            int mid = (start+end)/2;
//            if(nums[mid] >= target){
//                end = mid-1;
//            }else{
//                start = mid+1;
//                right = start;
//                System.out.println(start+"***"+right);
//            }
//        }
//
//        while(start<=end){
//            int mid = (start+end)/2;
//            if(nums[mid] <= target){
//                start = mid+1;
//                System.out.println(nums[mid]);
//            }else{
//                end = mid-1;
//                left = end;
//                System.out.println(end+"***"+left);
//            }
//        }
//
//
//        if(left == -1 || right==-1){
//            nn[0] = Math.max(left,right);
//            nn[1] = Math.max(left,right);
//        }else{
//            nn[0] = left;
//            nn[1] = right;
//        }
//        System.out.println(left);
//        System.out.println(right);
//        return nn;
//    }
//}


//public class numberCombination {
//    public static void main(String[] args) {
//        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
//        List<List<String>> aa = groupAnagrams(strs);
//        System.out.println(aa);
//    }
//
//        public static List<List<String>> groupAnagrams(String[] strs) {
//            Map<String, List<String>> map = new HashMap < String, List<String >> ();
//            for (String str : strs) {
//                char[] st = str.toCharArray();
//                Arrays.sort(st);
//                String key = new String(st);
//                List list = map.getOrDefault(key, new ArrayList<>());
//                list.add(str);
//                map.put(String.valueOf(st), list);
//            }
//            return new ArrayList<List<String>>(map.values());
//        }
//}


//public class numberCombination {
//
//        public static void main(String[] args) {
//        int dividend = -2147483648;
//        int divisor = 2;
//        int aa = divide(dividend,divisor);
//        System.out.println(aa);
//    }
//    public static int divide(int dividend, int divisor) {
//        int aa = 0;
//        int result = 0;
//        if(dividend==Integer.MIN_VALUE){
//            if(divisor==1){
//                return dividend;
//            }
//            if(divisor==-1){
//                return -(dividend+1);
//            }
//        }
//        if(dividend<0){
//            dividend = -dividend;
//            System.out.println(dividend+"////////////////////////////////////////");
//            aa++;
//        }
//        if(divisor<0){
//            divisor = -divisor;
//            aa++;
//        }
//        System.out.println(dividend+"**"+divisor);
//        long t = Math.abs((long) dividend);
//        long d= Math.abs((long) divisor);
//        for(int i=31; i>=0; i--){
//            if((t>>i) >= divisor){
//                result += 1<<i;
//
//                System.out.println(t+"*-*-*"+(t>>i) +"*-*-*-*-*"+ divisor);
//                System.out.println((t>>i) <= divisor);
//
//                t = t - (divisor<<i);
//                System.out.println(t);
//
//                System.out.println(t+"****"+i+"-=-"+ (divisor<<i));
//            }
//        }
//        System.out.println(t+"---------------");
//        if(aa == 0 || aa == 2){
//            return result;
//        }else{
//            return -result;
//        }
//    }
//}


//public class numberCombination {
//
//    public static void main(String[] args) {
//        int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
//        int aa = minPathSum(grid);
//        System.out.println(aa);
//    }
//    public static int minPathSum(int[][] grid) {
//        if (grid == null || grid.length == 0 || grid[0].length == 0) {
//            return 0;
//        }
//        int rows = grid.length, columns = grid[0].length;
//        int[][] dp = new int[rows][columns];
//        dp[0][0] = grid[0][0];
//        for (int i = 1; i < rows; i++) {
//            dp[i][0] = dp[i - 1][0] + grid[i][0];
//        }
//        for (int j = 1; j < columns; j++) {
//            dp[0][j] = dp[0][j - 1] + grid[0][j];
//        }
//        for (int i = 1; i < rows; i++) {
//            for (int j = 1; j < columns; j++) {
//                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
//                System.out.println(dp[i][j]+"*-*--*-*--*");
//            }
//        }
//        return dp[rows - 1][columns - 1];
//    }
//}

//public class numberCombination {
//
//    public static void main(String[] args) {
//        String s = "leetteacode";
//        int a = Integer.MAX_VALUE;
//        List<String> wordDict = Arrays.asList(new String[]{"leet", "tea", "code"});
//        wordBreak(s, wordDict);
//    }
//    public static boolean wordBreak(String s, List<String> wordDict) {
//        HashSet set = new HashSet<>(wordDict);
//        boolean vild[] = new boolean[s.length()+1];
//        vild[0] = true;
//        for(int i=1; i<=s.length(); i++){
//            for(int j=0; j<i; j++){
//                if(set.contains(s.substring(j,i)) && vild[j]){
//                    vild[i] = true;
//                }
//            }
//        }
//        return vild[s.length()];
//    }
//}


//public class numberCombination {
//
//    public static void main(String[] args) {
//        int[] nums = {3,3,4};
//        majorityElement(nums);
//    }
//    public static int majorityElement(int[] nums) {
//        Map<Integer,Integer> map = new HashMap<>();
//        int temp = 1;
//        for(int num:nums){
//            if(map.containsKey(num)){
//                map.put(num, map.get(num)+1);
//            }else{
//                map.put(num, 1);
//            }
//        }
//        for(int key:map.values()){
//            System.out.println(key);
//            temp = max(temp, key);
//        }
//        System.out.println(temp);
//        return temp;
////    }
////}
//
//public class numberCombination {
//
//    public static void main(String[] args) {
//        int[] nums = {3,3,4};
//    }
//    public boolean isPalindrome(ListNode head) {
//        List<Integer> vals = new ArrayList<>();
//        ListNode p=head;
//        while(p != null){
//            vals.add(p.val);
//            p = p.next;
//        }
//        int start=0, end = vals.size()-1;
//        while(start<end){
//            if(vals.get (start) != vals.charAt(end)){
//                return false;
//            }
//            start++;
//            end--;
//        }
//        return true;
//    }
//}

//public class numberCombination {
//    public static void main(String[] args) {
//        Scanner cin = new Scanner(System.in);
//        returnString(String.valueOf(cin));
//    }
//    public static StringBuffer returnString(String nString){
//        StringBuffer string = new StringBuffer();
//        for (int i=0; i<nString.length(); i++){
//            char aa = nString.charAt(i);
//            if(aa == 'z'){
//                aa = 'a';
//            }else {
//                aa = (char) (aa-3);
//            }
//            string.append(aa);
//        }
//        System.out.println(string);
//        return string;
//    }
//    public static void main(String[] args) {
////        Scanner cin = new Scanner(System.in);
//        int[] nums = {1,3,2,4};
//        int k = 2;
//        kSort(nums,k);
//    }
//    public static int kSort(int[] nums, int k){
//        int record = 0;
//        PriorityQueue<Integer> queueK = new PriorityQueue<>();
//        for (int i=0; i<nums.length; i++){
//            queueK.offer(nums[i]);
//            if(queueK.size() > k){
//                int min = queueK.poll();
//                int index = i-k;
//                nums[index] = min;
//                record++;
//            }
//        }
//        while (queueK.size() > 0){
//            int min = queueK.poll();
//            int index = nums.length-k;
//            nums[index] = min;
//            k--;
//        }
//        System.out.println(record);
//        return record;
//    }
//public class numberCombination {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String str1 = input.next();
//        String str2 = input.nextLine(); // 获取字符串
//        int number1 = input.nextInt(); // 获取整数
//        float number2 = input.nextFloat(); // 获取浮点数据
//
//        //循环输入
//        while (input.hasNextInt()) {
//            int tmp = input.nextInt();
//            System.out.println(tmp); // 与println效果相同
//        }
//        input.close(); // 掉用完成关闭方法
//    }
//}


//public class numberCombination{
//    public static void main(String[] args) {
//        Scanner cin = new Scanner(System.in);
//        while(cin.hasNext()){
//            int m = cin.nextInt();
//            int n = cin.nextInt();
//            double res = getResult(m,n);
//            System.out.println(String.format("%.2f",res));
//        }
//    }
//    public static double getResult(int m,int n){
//        double res = m;
//        double pre = m;
//        for(int i=1;i<n;i++){
//            pre = Math.sqrt(pre);
//            res +=pre;
//        }
//        if(n==0) res=0;
//        return res;
//
//    }
//}


//public class numberCombination {
//    public static void main(String[] args) {
//        Scanner cin = new Scanner(System.in);
//        while (cin.hasNext()){
//            int m = cin.nextInt();
//            int n = cin.nextInt();
//            if(m>n) System.out.println("no\n");
//            StringBuilder str = new StringBuilder();
//            for(int i=m;i<=n;i++){
//                int sum = 0;
//                int t = i;
//                while (t!=0){
//                    int te = t%10;
//                    sum +=(int)Math.pow(te,3);
//                    t /=10;
//                }
//                if(sum==i) str.append(i + " ");
//            }
//            if(str.length()==0) System.out.println("no");
//            else{
//                String res = str.toString();
//                System.out.println(res);
//            }
//        }
//
//    }
//}

//public class numberCombination {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String str1 = input.next();
//        System.out.println(str1+"==================");
//        String str2 = input.nextLine(); // 获取字符串
//        System.out.println(str2+"=-=-=-=-=-=-=-=-=-=-=-");
//        int number1 = input.nextInt(); // 获取整数
////        float number2 = input.nextFloat(); // 获取浮点数据
//        returnString(str2);
////        //循环输入
//        while (input.hasNextInt()) {
//            System.out.println("**************");
//            int tmp = input.nextInt();
//            System.out.println(tmp); // 与println效果相同
//        }
////
////        input.close(); // 掉用完成关闭方法
//    }
//    public static StringBuffer returnString(String nString){
//        StringBuffer string = new StringBuffer();
//        for (int i=0; i<nString.length(); i++){
//            char aa = nString.charAt(i);
//            if(aa == 'z'){
//                aa = 'a';
//            }else {
//                aa = (char) (aa-3);
//            }
//            string.append(aa);
//        }
//        System.out.println(string);
//        return string;
//    }
//}


//import java.io.*;
//import java.util.*;
//public class numberCombination {
//    public static void main(String[] args) throws IOException {
//        Scanner in = new Scanner(System.in);
//        int m  = in.nextInt();
//        while (m -- > 0){
//            int n = in.nextInt();
//            int k = in.nextInt();
//            int[] arr = new int[n];
//            for (int i = 0; i < n; i++) {
//                arr[i] = in.nextInt();
//            }
//
//            int ans = 0;
//            int a = 1;
//            for (int i = 0; i < n; i++) {
//                if (arr[i] == a) a++;
//            }
//            int t = n - a + 1;
//
//            if (t % k == 0) {
//                ans = t / k;
//            }else {
//                ans = t / k + 1;
//            }
//            System.out.println(ans);
//        }
//    }
//}
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;

//public class numberCombination {
//    public static void main(String[] args) {
//        int[] arr = {10, 7, 8, 9, 1, 5};
//        System.out.println("Original array: " + Arrays.toString(arr));
//        quickSort(arr, 0, arr.length - 1);
//        System.out.println("Sorted array: " + Arrays.toString(arr));
//    }
//
//    public static void quickSort(int[] arr, int left, int right) {
//        if (left < right) {
//            int partitionIndex = partition(arr, left, right);
//            quickSort(arr, left, partitionIndex - 1);
//            quickSort(arr, partitionIndex + 1, right);
//        }
//    }
//
//    private static int partition(int[] arr, int left, int right) {
//        int pivot = arr[right];
//        int i = left - 1;
//        for (int j = left; j < right; j++) {
//            if (arr[j] <= pivot) {
//                i++;
//                swap(arr, i, j);
//            }
//        }
//        swap(arr, i + 1, right);
//        return i + 1;
//    }
//
//    private static void swap(int[] arr, int i, int j) {
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
//}

//public class numberCombination {
//    public static void main(String[] args) {
//        int[] arr = {10, 7, 8, 9, 1, 5};
//        System.out.println("Original array: " + Arrays.toString(arr));
//        quickSort(arr, 0, arr.length - 1);
//        System.out.println("Sorted array: " + Arrays.toString(arr));
//    }
//
//    public static void quickSort(int[] arr, int left, int right) {
//        if (left < right) {
//            int index = partition(arr, left, right);
//            quickSort(arr, left, index - 1);
//            quickSort(arr, index + 1, right);
//        }
//    }
//
//    public static int partition(int[] arr, int left, int right) {
//        int pivot = arr[left];
//        int index = left; //其中index相当于慢指针，j相当于快指针。
//        for (int j=left+1; j<=right; j++){
//            if(arr[j]<pivot){
//                index++;
//                swap(arr,index,j);
//            }
//        }
//        swap(arr,index,left);
//        return index;
//    }
//
//    //    交换顺序
//    public static void swap(int[] arr, int i, int j) {
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
//
//}
//
//// 前序遍历·递归·LC144_二叉树的前序遍历
//public class numberCombination {
//    public List<Integer> preorderTraversal(TreeNode root) {
//        List<Integer> result = new ArrayList<Integer>();
//        preorder(root, result);
//        return result;
//    }
//
//    public void preorder(TreeNode root, List<Integer> result) {
//        if (root == null) {
//            return;
//        }
//        result.add(root.val);
//        preorder(root.left, result);
//        preorder(root.right, result);
//    }
//}
// 中序遍历·递归·LC94_二叉树的中序遍历
//class Solution {
//    public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> res = new ArrayList<>();
//        inorder(root, res);
//        return res;
//    }
//
//    void inorder(TreeNode root, List<Integer> list) {
//        if (root == null) {
//            return;
//        }
//        inorder(root.left, list);
//        list.add(root.val);             // 注意这一句
//        inorder(root.right, list);
//    }
//}
//// 后序遍历·递归·LC145_二叉树的后序遍历
//class Solution1 {
//    public List<Integer> postorderTraversal(TreeNode root) {
//        List<Integer> res = new ArrayList<>();
//        postorder(root, res);
//        return res;
//    }
//
//    void postorder(TreeNode root, List<Integer> list) {
//        if (root == null) {
//            return;
//        }
//        postorder(root.left, list);
//        postorder(root.right, list);
//        list.add(root.val);             // 注意这一句
//    }
//}

//class Solution {
//    public boolean isSymmetric(TreeNode root) {
//        List<Integer> result = new ArrayList<>();
//        inOrder(root, result);
//        int l = 0;
//        int r = result.size()-1;
//        while(l<r){
//            if(result.get(l) != result.charAt(r)){
//                return false;
//            }
//            l++;
//            r--;
//        }
//        return true;
//    }
//    public void inOrder(TreeNode root, List result){
//        if(root == null){
//            return ;
//        }
//        inOrder(root.left, result);
//        result.add(root);
//        inOrder(root.root, result);
//    }

//class numberCombination {
//    public static void main(String[] args) {
//        String s="aa";
////        System.out.println(s.length());
//
//        lengthOfLongestSubstring(s);
//    }
//    public static int lengthOfLongestSubstring(String s) {
//        int record = 0, n=s.length();
//        System.out.println(n);
//        int[] pos = new int[128]; //很关键，表示没有出现过都为0；
//        for(int i=0, start=0; i<n; i++){
//            start = Math.max(start, pos[s.charAt(i)]+1); //判断s.charAt(i)有没有出现过，若出现则pos[s.charAt(i)不为0；
//            record = Math.max(record, i-start+1);
//            pos[s.charAt(i)] = i;
//            System.out.println("***********");
//        }
//        System.out.println(record);
//        return record;
//    }
//}
//
//class numberCombination {
//    public List<Integer> findAnagrams(String s, String p) {
//        Set<String> setp = new HashSet<>();
//        List<Integer> list = new ArrayList<>();
//        for(int i= 0; i<p.length(); i++){
//            setp.add(String.valueOf(p.charAt(i)));
//        }
//        for(int i=0; i< s.length()-p.length(); i++){
//            for(int j=i; j<i+p.length(); j++){
//                if(!setp.contains(s.charAt(i))){
//                    break;
//                }
//                list.add(i);
//            }
//        }
//        return list;
//    }
//}


//class numberCombination {
//    public static void main(String[] args) {
//        char[][] grid= {
//                {'1', '1', '1', '1', '0'},
//        {'1', '1', '0', '1', '0'},
//        {'1', '1', '0', '0', '0'},
//        {'0', '0', '0', '0', '0'}};
//        numIslands(grid);
//    }
//    public static int numIslands(char[][] grid) {
//        int count=0;
//        for(int i=0; i<grid.length; i++){
//            for(int j=0; j<grid[0].length; j++){
//                System.out.println(grid[i][j]);
//                if(grid[i][j]=='1'){
//                    ++count;
//                    System.out.println("****************");
//                }
//                dfs(grid, i, j);
//            }
//        }
//        return count;
//    }
//    public static void dfs(char[][] grid, int x, int y){
//        if(x<0 || x>grid.length-1 || y<0 || y>grid[0].length-1 || grid[x][y]=='0'){
//            return;
//        }
//        grid[x][y]=0;
//        dfs(grid, x-1, y);
//        dfs(grid, x, y-1);
//        dfs(grid, x+1, y);
//        dfs(grid, x, y+1);
//    }
//}


//class numberCombination {
//    public void rotate(int[] nums, int k) {
//        List<Integer> list = new ArrayList<Integer>();
//        int len = nums.length;
//        for(int i=len-k; i<len; i++){
//            list.add(nums[i]);
//        }
//        for(int i=0; i<len-k; i++){
//            list.add(nums[i]);
//        }
//        return list;
//    }
//}

class numberCombination {
    public static void main(String[] args) {
        String string = "dpaaab";
        String pattern = "d.a*b";
        System.out.println(match(string, pattern));

    }
    public static boolean match(String string, String pattern) {
        // write code here
        int i=0;
        int j=0;
        for(int ii=0; ii<string.length(); ii++){
                if(pattern.charAt(j) ==string.charAt(i) || pattern.charAt(j) =='.'){
                    System.out.println(pattern.charAt(j));
                    System.out.println(string.charAt(i));
                    i++;
                    j++;
                }
                if(pattern.charAt(j) =='*' && pattern.charAt(j+1) !='*'){
                    j++;
                    while(pattern.charAt(j) != string.charAt(i)){
                        i++;
                    }
                }
                if(pattern.charAt(j) !='.' || pattern.charAt(j) !='*' || pattern.charAt(j) !=string.charAt(i)){
                    return false;
                }
            }
        return true;
    }
}