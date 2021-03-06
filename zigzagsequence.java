import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
public class zigZagSequence {
        public static void main (String[] args) throws java.lang.Exception {
                Scanner sc = new Scanner(System.in);
                int test_cases = sc.nextInt();
                for(int i = 1; i <= test_cases; i++){
                        int n = sc.nextInt();
                        int a[] = new int[n];
                        for(int j = 0; j < n; j++){
                                a[j] = sc.nextInt();
                        }
                        findZigZagSequence(a, n);
                }
        }
        public static void findZigZagSequence(int [] a, int n){
                Arrays.sort(a);
                int mid = (n + 1)/2-1;
                int temp = a[mid];
                a[mid] = a[n - 1];
                a[n - 1] = temp;
                int st = mid + 1;
                int ed = n - 2;
                while(st <= ed){
                        temp = a[st];
                        a[st] = a[ed];
                        a[ed] = temp;
                        st += 1;
                        ed -= 1;
                }
                for(int i = 0; i < n; i++){
                        if(i > 0)
                                System.out.print(" ");
                        System.out.print(a[i]);
                }
                System.out.println();
        }
}
