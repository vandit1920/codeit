/*
You are given an array of N integers A1,A2,…,AN and three more integers X,p, and k.
An operation on the array is defined to be: replace the k-th smallest integer in the array with any integer you want.
Output the minimum number of operations you must perform on the array (possibly 0 operations) to make the p-th smallest element of the array equal to X. If it is impossible to do so output −1.
Note: the k-th smallest number in an array is the k-th number from the left when the array is sorted in non-decreasing order.
Input
The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first line of each test case contains four integers N,X,p,k respectively.
The second line contains N space-separated integers A1,A2,…,AN.
Output
For each test case, print a single line containing one integer ― the minimum number of operations you must perform to make X the p-th smallest element or −1 if its impossible to do so.

Constraints
1≤T≤100
1≤p,k≤N
0≤X≤109
The sum of N over all test cases does not exceed 4∗105
0≤Ai≤109 for each valid i
Subtasks
Subtask #1 (10 points): N≤5
Subtask #2 (40 points): The sum of N over all test cases does not exceed 3∗103
Subtask #3 (50 points): Original constraints
Example Input
2
5 4 3 4
4 9 7 0 8
2 25 1 2
100 20
Example Output
1
-1
Explanation
Example case 1:
We can perform one operation in the array. Take the k-th smallest integer of the current array (which is 8 in this case) and replace it with 0. The array then becomes [4,9,7,0,0] which now makes 4 as the 3rd smallest number of the array.
Example case 2:
It is impossible to make 25 as the smallest number of the array
 */

package Codechef;

import java.util.Arrays;
import java.util.Scanner;

public class Replace_for_X {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            long x = sc.nextLong();
            int p = sc.nextInt();
            int k = sc.nextInt();
            long a[] = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            int count=0;
                if (a[p-1] != x) {
                  if(k<p && x<a[p-1]) {
                      count = -1;
                  }
                  else if(k<=p && x>a[p-1]){
                    for(int i=p-1;i<n;i++) {
                         if(a[i]<x)
                             count++;
                         else break;
                    }
                  }
                  else if(k>p && x>a[p-1]){
                      count = -1;
                  }
                  else if(k>p && x<a[p-1]) {
                   for(int i=0;i<p;i++){
                       if(a[i]>x)
                           count++;
                   }
                  }
                }
            System.out.println(count);
            t--;
        }
    }
}

