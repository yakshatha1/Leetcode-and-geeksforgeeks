class Solution {
    public char findTheDifference(String s, String t) {
        int i = -1,sum=0;
	while((++i)<s.length()) {
		sum += t.charAt(i)-s.charAt(i);
	}
	sum += t.charAt(i);
	return (char)sum;
    }
}