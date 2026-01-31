package DSA;

public class Solution744 {
    public static char nextGreatestLetter(char[] letters, char target) {
    	char min = Character.MAX_VALUE;
        for(char ch : letters) {
        	if(ch > target && min > ch)
        		min = ch;
        }
        if(min == Character.MAX_VALUE)
        	return letters[0];
        return min;
    }
    public static void main (String[] args) {
    	
    	char[] letters = {'x','x','y','y'};
    	char target = 'z';
    	char result = nextGreatestLetter(letters, target);
    	System.out.println(result);
    }
}
