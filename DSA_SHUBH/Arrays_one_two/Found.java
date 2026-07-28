// MISTAKES IN THIS CODE:
// 1. bSearch: while(l < r) should be while(l <= r) — skips last single element
// 2. main: search(nums, 2) should be search(nums, target) — hardcoded value ignores target variable

import java.util.Scanner;

public class Found{
    public static void search(int nums[], int target){
        int m = minSearch(nums);
        if(nums[m] == target){
            System.out.println("Found");
        }
        else if(nums[m]< target && target <= nums[nums.length-1]){
            bSearch(nums,m+1,nums.length-1,target);
        }
        else{
            bSearch(nums,0,m-1,target);
        }
    }

    public static void bSearch(int nums[], int l, int r, int target){
        while(l<r){                          // ❌ MISTAKE 1: should be l<=r
            int mid = l + (r-l)/2;
            if(nums[mid]==target){
                System.out.println("Found");
                return;
            }
            else if(nums[mid]<target){
                l = mid+1;
            }
            else{
                r = mid-1;
            }
        }
    }

    public static int minSearch(int nums[]){
        int l=0;
        int r =nums.length -1;
        while(l<r){
            int mid = l + (r-l)/2;
            if(mid>0 && nums[mid-1]>nums[mid]){
                return mid;
            }
            else if(nums[l]<=nums[mid] && nums[mid]>=nums[r]){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        int nums[] = {4,5,6,1,2,3};
        int target = 3;
        search(nums, 2);                     // ❌ MISTAKE 2: should be search(nums, target)
    }
}