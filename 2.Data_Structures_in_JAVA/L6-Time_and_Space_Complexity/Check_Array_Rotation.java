// You have been given an integer array/list(ARR) of size N. It has been sorted(in increasing order) and then rotated by some number 'K' in the right hand direction.
// Your task is to write a function that returns the value of 'K', that means, the index from which the array/list has been rotated.
// Input format :
// The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

// First line of each test case or query contains an integer 'N' representing the size of the array/list.

// Second line contains 'N' single space separated integers representing the elements in the array/list.
// Output Format :
// For each test case, print the value of 'K' or the index from which which the array/list has been rotated.

// Output for every test case will be printed in a separate line.


public class Solution {

    public static int arrayRotateCheck(int[] arr){
    	//Your code goes here
        int len = arr.length;
        int min_element = Integer.MAX_VALUE;
        int min_index = Integer.MAX_VALUE;
        
         if (len==0){
             return 0;
         }
        
        for(int i = 0; i<len; i++){
            if(arr[i]<min_element){
                min_element = arr[i];
                min_index = i;
            }
        }
        
        return min_index;
    }

}