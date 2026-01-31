package day2;

/**
 * Definition for singly-linked list.
 * 
 */
class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

public class Solution2 {
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode temp1 = l1;
		int val1 = 0;
		while (temp1 != null) {
			val1 *= 10;
			val1 += temp1.val;
			temp1 = temp1.next;
		}

		ListNode temp2 = l2;
		int val2 = 0;
		while (temp2 != null) {
			val2 *= 10;
			val2 += temp2.val;
			temp2 = temp2.next;
		}

		val1 = revNum(val1);
		val2 = revNum(val2);
		int val3 = val1 + val2;
//		val3 = revNum(val3);
		// System.out.println(val3);
		ListNode newL = null;
		int last;
		if (val3 == 0) {
		    return new ListNode(0);
		}
		while (val3 > 0) {
			last = val3 % 10;
			System.out.println(last);
			ListNode nn = new ListNode(last);
			if (newL == null) {
				newL = nn;
			} else {
				ListNode temp = newL;
				while (temp.next != null) {
					temp = temp.next;
				}
				temp.next = nn;
			}
			val3 /= 10;
		}

		return newL;
	}

	public static int revNum(int num) {
		int rev = 0;
		int li;
		while (num > 0) {
			li = num % 10;
			rev *= 10;
			rev += li;
			num /= 10;
		}
		// System.out.println(rev);
		return rev;
	}

	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		addTwoNumbers(l1, l2);

	}
}
