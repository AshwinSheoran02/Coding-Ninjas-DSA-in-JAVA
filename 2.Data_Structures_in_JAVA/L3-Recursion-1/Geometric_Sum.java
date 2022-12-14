// Given k, find the geometric sum i.e.
// 1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k) 
// using recursion.
// Input format :
// Integer k
// Output format :
// Geometric sum (upto 5 decimal places)


import java.util.*;
public class solution {

	public static double findGeometricSum(int k){
		// Write your code here
        
     
       if (k == 0) {
            return 1;
        }
        return (findGeometricSum(k - 1) + 1 / Math.pow(2, k));
    
	}
}
