package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public static void main1(String[] args) {
		//输出五层的金字塔
		/*
		 *
		 * *
		 *   *
		 *     *
		 *********
		 */
		int totallevel = 10;
		for (int i = 1; i <= totallevel; i++) {
			int j = 1;
			for (; j <= totallevel - i; j++) {
				System.out.print(" ");
			}
			for (int n = 1; n <= i * 2 - 1; n++) {
				if (n == 1 || n == i * 2 - 1 || i == totallevel) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}

	@Test
	public static void main2(String[] args) {
		int[] nums = {1, 3, 5, 7};
		int target = 2;
		int i = 0, n = nums.length, j = 0;
		if (target > nums[n - 1]) {
			System.out.println(n);
			;
		} else {
			for (; target >= nums[i]; i++) {
				j++;
				System.out.println(i);
			}
			System.out.println(j);
		}
	}

	@Test
	public static void main3(String[] args) {
		int arr[] = {24, 69, 80, 57, 13, -100, 45, 0};
		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}


	public static List<List<Integer>> threeSum(int[] nums) {
		// 存储结果
		List<List<Integer>> threeChenSum = new ArrayList<>();
		// 判断长度是否小于3
		if (nums.length < 3) {
			return threeChenSum;
		}
		// 排序
		Arrays.sort(nums);
		// 判断第一个数是否大于0
		if (nums[0] > 0) {
			return threeChenSum;
		}
		for (int i = 0; i < nums.length - 2; i++) {
			if(i > 0 && nums[i] == nums[i-1]){
				continue;
			}
			int left = i+1, right = nums.length-1, target = - nums[i];
			while (left < right){
				if (nums[left] + nums[right] == target){
					threeChenSum.add(Arrays.asList(nums[i], nums[left], nums[right]));
					left++;
					while (left < right && nums[left] == nums[left-1]){
						left++;
					}
					right--;
					while (left < right && nums[right] == nums[right-1]){
						right--;
					}
				}else if(nums[left] + nums[right] > target){
					right--;
				}else {
					left++;
				}
			}
		}
		return threeChenSum;
	}

//	public static List<List<Integer>> threeSum(int[] nums) {
//		// 存储结果
//		List<List<Integer>> threeChenSum = new ArrayList<>();
//		int first = 0, second = 0, third = 0;
//		// 判断长度是否小于3
//		if (nums.length < 3) {
//			return threeChenSum;
//		}
//		// 排序
//		Arrays.sort(nums);
//		// 判断第一个数是否大于0
//		if (nums[0] > 0) {
//			return threeChenSum;
//		}
//
//		for (int i = 0; i < nums.length - 2; i++) {
//			// 第一个数
//			first = nums[i];
//			if(i > 0 && nums[i] == nums[i-1]){
//				continue;
//			}
//			// 建立一个set数组，存储第二个数
//			Set<Integer> set = new HashSet<>();
//			for (int j = i + 1; j < nums.length; j++) {
//				third = nums[j];
//				second = -(first + third);
//				if (set.contains(second)) {
//					threeChenSum.add(new ArrayList<>(Arrays.asList(first, second, third)));
//					while (j < nums.length - 1 && nums[j] == nums[j + 1]) j++;
//
//				}
//				set.add(third);
//			}
//		}
//		return threeChenSum;
//	}

	public static void main4(String[] args) {
		int[] a = {-1, 0, 1, 2, -1, -4, 0, 0, 0, 0};
		List<List<Integer>> lists = threeSum(a);
		System.out.println(lists);

	}



	public static List<List<Integer>> fourSum(int[] nums, int target) {
			List<List<Integer>> fourNumber = new ArrayList<>();
			if(nums.length<4){
				return fourNumber;
			}
			Arrays.sort(nums);


			for(int i=0; i<nums.length-3; i++){
				for(int j=i+1; j<nums.length-2; j++){
					int left=j+1, right=nums.length-1, t=target-nums[i]-nums[j];
					while(left<right){
						if(nums[left]+nums[right]==t){
							fourNumber.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));


							while(i<nums.length-3 && nums[i] == nums[i+1]) i++;
							while(j<nums.length-2 && nums[j] == nums[j+1]) j++;

							while(left<right && nums[left] == nums[left+1]) left++;

							while(left<right && nums[right] == nums[right-1]) right--;

							left++;
							right--;

						}else if(nums[left]+nums[right]>t){
							right--;
							System.out.println(right);
						}else{ //nums[left]+nums[right]<t
							left++;
						}
					}
				}
			}
		System.out.println(fourNumber);
			return fourNumber;
		}


	public static void main(String[] args) {
//		int[] nums = {1,-2,-5,-4,-3,3,3,5};
		int[] nums = {1,-2,-5,-4,0,0,0,0};
		int target = 0;
		fourSum(nums, target);
	}
}

