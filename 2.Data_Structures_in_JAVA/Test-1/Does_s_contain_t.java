// Given two string s and t, write a function to check if s contains all characters of t (in the same order as they are in string t).
// Return true or false.
// Do it recursively.
// E.g. : s = “abchjsgsuohhdhyrikkknddg” contains all characters of t=”coding” in the same order. So function will return true.
// Input Format :
// Line 1 : String s
// Line 2 : String t
// Output Format :
// true or false
// Sample Input 1 :
// abchjsgsuohhdhyrikkknddg
// coding
// Sample Output 1 :
// true


public class Solution {
	public static boolean checkSequence(String a, String b) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
		int ap = 0;
        int bp = 0 ;
        boolean ans = false;
        int check = 0;
        while( bp < b.length() && ap< a.length() ){
            if (a.charAt(ap) == b.charAt(bp)){
                //System.out.println(b.charAt(bp)+" "+check);
                ap++;
                bp++;
                check++;
                
                continue;
            }
            else{
                ap++;
            }
        }
        if (bp >= b.length()-1 && check == b.length()){
            ans = true;
        }
        return ans;
	}
}