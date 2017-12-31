Input:
First line contains an integer N, the number of vertices.
Second line contains N space-separated integers, the degrees of the N vertices.

Output:
Print "Yes" (without the quotes) if the graph is a tree or "No" (without the quotes) otherwise.

Constraints:
1 ≤ N ≤ 100
1 ≤ Degreei ≤ 1000

Algorithm Used-A graph is called a tree when it has 2*(n-1) nodes given n vertices

Solution:

import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        if(counter(n,arr))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    public static boolean counter(int n,int[] arr){
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
    }
    int value=2*(n-1);
    if(sum==value)
        return true;
    else
        return false;
    }
}

