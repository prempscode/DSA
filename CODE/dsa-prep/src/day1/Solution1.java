package day1;
public class Solution1 {
    public static int[] twoSum(int[] nums, int target) {
		int res[] = {0,0};
		int newnums[] = new int[nums.length];
		
		for(int x = 0 ; x<newnums.length;x++) {
			newnums[x] = nums[x];
		}
		int i = 0;
		int j = newnums.length-1;
		java.util.Arrays.sort(newnums);
		while(i<j) {
			if((newnums[i] + newnums[j]) == target) {
				res[0] = findIdx(nums,newnums[i],-1);
				res[1] = findIdx(nums,newnums[j],res[0]);
				return res;
			}
			else if((newnums[i] + newnums[j]) > target) {
				j--;
			}
			else {
				i++;
			}
		} 	
    	return res;
    }
    private static int findIdx(int[] nums, int value, int checkedValue) {
    	
    	for(int idx = 0 ; idx < nums.length ;idx++) {
    		if((nums[idx] == value) && (idx != checkedValue))return idx;
    	}
		return -1;
	}
	public static void main(String[] args) {
    	int nums[] = {3,3};
    	int target = 6;
    	int res[] = twoSum(nums , target);
    	for(int i : res) {
    		System.out.print(i+" ");
    	}
    }
}