class Solution {
public static int[] sortedSquares(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			nums[i] = nums[i] * nums[i];
		}
		sort(nums,0,nums.length-1);
		return nums;
	}

	public static void merge(int[] arr, int st, int mid, int end) {
		int left = st;
		int right = mid + 1;
		int temp[] = new int[end - st + 1];
		int idx = 0;
		while (left <= mid && right <= end) {
			if (arr[left] < arr[right]) {
				temp[idx++] = arr[left++];
			} else {
				temp[idx++] = arr[right++];
			}
		}
		while (left <= mid) {
			temp[idx++] = arr[left++];
		}
		while (right <= end) {
			temp[idx++] = arr[right++];
		}
		for (int i = 0; i < temp.length; i++) {
			arr[st + i] = temp[i];
		}
	}

	public static void sort(int[] arr, int st, int end) {
		if (st < end) {
			int mid = st + (end - st) / 2;

			sort(arr, st, mid);
			sort(arr, mid + 1, end);
			merge(arr, st, mid, end);
		}
	}

}