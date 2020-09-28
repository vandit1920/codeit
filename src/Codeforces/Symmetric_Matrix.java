/*
Masha has n types of tiles of size 2×2. Each cell of the tile contains one integer. Masha has an infinite number of tiles of each type.

Masha decides to construct the square of size m×m consisting of the given tiles. This square also has to be a symmetric with respect to the main diagonal matrix, and each cell of this square has to be covered with exactly one tile cell, and also sides of tiles should be parallel to the sides of the square. All placed tiles cannot intersect with each other. Also, each tile should lie inside the square. See the picture in Notes section for better understanding.

Symmetric with respect to the main diagonal matrix is such a square s that for each pair (i,j) the condition s[i][j]=s[j][i] holds. I.e. it is true that the element written in the i-row and j-th column equals to the element written in the j-th row and i-th column.

Your task is to determine if Masha can construct a square of size m×m which is a symmetric matrix and consists of tiles she has. Masha can use any number of tiles of each type she has to construct the square. Note that she can not rotate tiles, she can only place them in the orientation they have in the input.

You have to answer t independent test cases.

Input
The first line of the input contains one integer t (1≤t≤100) — the number of test cases. Then t test cases follow.

The first line of the test case contains two integers n and m (1≤n≤100, 1≤m≤100) — the number of types of tiles and the size of the square Masha wants to construct.

The next 2n lines of the test case contain descriptions of tiles types. Types of tiles are written one after another, each type is written on two lines.

The first line of the description contains two positive (greater than zero) integers not exceeding 100 — the number written in the top left corner of the tile and the number written in the top right corner of the tile of the current type. The second line of the description contains two positive (greater than zero) integers not exceeding 100 — the number written in the bottom left corner of the tile and the number written in the bottom right corner of the tile of the current type.

It is forbidden to rotate tiles, it is only allowed to place them in the orientation they have in the input.

Output
For each test case print the answer: "YES" (without quotes) if Masha can construct the square of size m×m which is a symmetric matrix. Otherwise, print "NO" (withtout quotes).

Example
inputCopy
6
3 4
1 2
5 6
5 7
7 4
8 9
9 8
2 5
1 1
1 1
2 2
2 2
1 100
10 10
10 10
1 2
4 5
8 4
2 2
1 1
1 1
1 2
3 4
1 2
1 1
1 1
outputCopy
YES
NO
YES
NO
YES
YES

 */
package Codeforces;

import java.util.Scanner;

public class Symmetric_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int a=0,b=0,c=0,d=0;
            int flag=0,e=0;
            for(int i=0;i<2*n;i++){
                if(i%2==0) {
                    a = sc.nextInt();
                    b = sc.nextInt();
                    e++;
                }
                else{
                    c = sc.nextInt();
                    d = sc.nextInt();
                    e++;
                }
                if(e==2){
                    if(b==c)flag=1;
                    a=b=c=d=0;
                    e=0;
                }
            }
            if(m%2==0 && flag==1){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
            t--;
        }
    }
}
