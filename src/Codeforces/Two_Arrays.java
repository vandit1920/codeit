/*RedDreamer has an array a consisting of n non-negative integers, and an unlucky integer T.

Let's denote the misfortune of array b having length m as f(b) — the number of pairs of integers (i,j) such that 1≤i<j≤m and bi+bj=T. RedDreamer has to paint each element of a into one of two colors, white and black (for each element, the color is chosen independently), and then create two arrays c and d so that all white elements belong to c, and all black elements belong to d (it is possible that one of these two arrays becomes empty). RedDreamer wants to paint the elements in such a way that f(c)+f(d) is minimum possible.

For example:

if n=6, T=7 and a=[1,2,3,4,5,6], it is possible to paint the 1-st, the 4-th and the 5-th elements white, and all other elements black. So c=[1,4,5], d=[2,3,6], and f(c)+f(d)=0+0=0;
if n=3, T=6 and a=[3,3,3], it is possible to paint the 1-st element white, and all other elements black. So c=[3], d=[3,3], and f(c)+f(d)=0+1=1.
Help RedDreamer to paint the array optimally!

Input
The first line contains one integer t (1≤t≤1000) — the number of test cases. Then t test cases follow.

The first line of each test case contains two integers n and T (1≤n≤105, 0≤T≤109) — the number of elements in the array and the unlucky integer, respectively.

The second line contains n integers a1, a2, ..., an (0≤ai≤109) — the elements of the array.

The sum of n over all test cases does not exceed 105.

Output
For each test case print n integers: p1, p2, ..., pn (each pi is either 0 or 1) denoting the colors. If pi is 0, then ai is white and belongs to the array c, otherwise it is black and belongs to the array d.

If there are multiple answers that minimize the value of f(c)+f(d), print any of them.

Example
inputCopy
2
6 7
1 2 3 4 5 6
3 6
3 3 3
outputCopy
1 0 0 1 1 0
1 0 0
*/
package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Two_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int T = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int flag=1,r=0;
            for(int i=0;i<n;i++){
                if(T%2==0 && a[i]==(T/2)) {
                    r = flag;
                    flag = flag ^ 1;
                }
                else{
                    if(T<2*a[i])r=1;
                    else r=0;
                }
                System.out.print(r+ " ");
            }
            System.out.println();
            t=t-1;
        }
    }
}
