//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Sorting
{
    public static void main(String args[])throws IOException
    {
        // Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        
        //reading input using BufferedReader class
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        //reading testcases count
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)       {
            
            String st[] = read.readLine().trim().split(" ");
            
            //reading size of array 
            int N =Integer.parseInt(st[0]);
            
            //creating a new array of size n
            int A[] = new int[N];
            st = read.readLine().trim().split(" ");
            
            //adding elements to the array
            for(int i = 0; i < N; i++)
                A[i] = Integer.parseInt(st[i]);
                
            //calling the method binSort() of
            //class BinarySort()
            new Solution().binSort(A, N);
            
            //printing the elements of array
            for(Integer x: A)
                System.out.print(x + " ");
            System.out.println();
        }
    }
}



// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to sort the binary array.
    static void binSort(int A[], int N)
    {
          int left = 0; // Initialize the left pointer
        int right = N - 1; // Initialize the right pointer

        while (left < right) {
            // Move the left pointer to the right while A[left] is 0
            while (A[left] == 0 && left < right) {
                left++;
            }

            // Move the right pointer to the left while A[right] is 1
            while (A[right] == 1 && left < right) {
                right--;
            }

            // If left is less than right, swap A[left] and A[right]
            if (left < right) {
                A[left] = 0;
                A[right] = 1;
                left++;
                right--;
    }
}
}
}