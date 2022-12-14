// Given an array of length N and an integer x, you need to find and return the first index of integer x present in the array. Return -1 if it is not present in the array.
// First index means, the index of first occurrence of x in the input array.
// Do this recursively. Indexing in the array starts from 0.
// Input Format :
// Line 1 : An Integer N i.e. size of array
// Line 2 : N integers which are elements of the array, separated by spaces
// Line 3 : Integer x
// Output Format :
// first index or -1


public class Solution {

	public static int firstIndex(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        if(input.length==0)
        {
            return -1;
        }
        if(input[0]==x)
        {
            return 0; 
        }
        int smallA[] = new int[input.length - 1];
        for(int i = 1;i<input.length;i++)
        {
            smallA[i-1]=input[i];
        }
        int fi = firstIndex(smallA,x);
        if(fi==-1)
        {
            return -1;
        }
        else
        {
            return fi+1;
        }
        
	}
	
}
