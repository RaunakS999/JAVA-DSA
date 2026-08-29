
/*
1. Ternary
2. Q.14  N times “hello world”
3. Q.15 N natural numbers - 1 to N & N to 1
4. Q.16 Sum of first N numbers
5. Q.17  Factorial of a number
6.        CLASS
7. sum of even and odd number in range
8. all prime factor  of a number
9. sum of all factor
10. ck if number is prime
11. power of number using loop approach
12.Fibonacci numbers generate
13 number of X divisor
14. find prime factor
15. even-indexed Fibonacci numbers
 */


package module_09_Ternary_LOOP;

import java.util.Scanner;

public class Ternary_LOOP {
    public static void main(String[] args) {


        //  1. ternary


//        int n =8;
//        String ans=(n%2==0 ? "even":"odd");
//        System.out.println(ans);

//  2       . Q.14  N times “hello world”

//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++) {
//            System.out.println("hello world " + i);
//        }

//   3.      Q.15 N natural numbers - 1 to N & N to 1

//        Scanner sc = new Scanner(System.in);
//        int n=sc.nextInt();
//        for (int i=1 ; i<=n;i++){
//            System.out.print(i);
//        }

//    4.        Q.16 Sum of first N numbers

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int sum=0;
//        for (int i=0;i<=n;i++){
//            sum+=i;
//            System.out.print(sum+" ");
//        }
//            System.out.print("last "+sum);


//    5.         Q.17  Factorial of a number

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int Fact = 1;
//        for (int i = 1; i <= n; i++) {
//            Fact = i * Fact;
//        }
//        System.out.println(Fact);


//   6.                           CLASS

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        BigInteger fact= new BigInteger("1");
//        for(int i=1;i<=n;i++){
//            fact=fact.multiply(new BigInteger(Integer.toString(i)));
//            System.out.println(fact);
//        }
//        System.out.println(fact.toString().length());

//
//  7.       sum of even and odd number in range

//        Scanner sc = new Scanner(System.in);
//        int i1 = sc.nextInt();
//        int i2 = sc.nextInt();
//        if (i1 > i2) {
//            int temp = i1;
//            i1 = i2;
//            i2 = temp;
//        }
//        int sum1 = 0;
//        int sum2 = 0;
//        for (int i = i1; i <= i2; i++) {
//            if (i % 2 == 0) {
//                sum1 += i;
//            } else {
//                sum2 += i;
//            }
//        }
//        System.out.println(sum1);
//        System.out.println(sum2);

//  8. all prime factor  of a number


//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=1;i<=n;i++){
//            if (n%i==0)
//                System.out.print( i+" " );
//        }

//  9. sum of all factor

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int sum=0;
//        for(int i=1;i<n;i++){
//            if (n%i==0)
//                sum+=i;
//        }
//        System.out.print( sum );

// 10. ck if number is prime
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int c =0;
//        for(int i=1;i<=n;i++){
//            if(n%i==0)
//            {
//                c++;}
//        }
//        if (c==2 ){
//            System.out.print("Prime");
//        }else{
//            System.out.print("Not Prime");
//        }
// 11. power of number using loop approach
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        double ans = 1;
//        if (b > 0) {
//            for (int i = 1; i <= b; i++) {
//                ans *= a;
//            }
//            System.out.print((int) ans);
//        } else if (b < 0) {
//
//            for (int i = 1; i <= -b; i++) {
//                ans *= a;
//            }
//            ans = 1 / ans;
//            System.out.print(ans);
//        } else if (b == 0 && a == 0) {
//            System.out.println("Undefined");
//        } else if (a == 0) {
//            System.out.println("0");
//        } else if (b == 0) {
//            System.out.println("1");
//
//        }

//  12.Fibonacci numbers generate

//        Scanner sc = new Scanner(System.in);
//        int n=sc.nextInt();
//        int first=0,second=1;
//        for(int i=0;i<n;i++){
//            System.out.print(first+" ");
//            int next =first+second;
//            first=second;
//            second=next;
//        }


//   13 number of X divisor     ######################

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int x = sc.nextInt();
//        int c = 0;
//        for (int i = 1; i <= n; i++) {
//            int divisor = 0;
//            for (int j = 1; j <= i; j++) {
//                if (i % j == 0)
//                    divisor++;
//            }
//            if (divisor == x) {
//                c++;
//            }
//        }

//   14. find prime factor

//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        while (a % 2 == 0) {
//            System.out.println(2 + " ");
//            a /= 2;
//        }
//        for (int i = 3; i <= a; i += 2) {
//            while (a % i == 0) {
//                System.out.println(i + " ");
//                a /= i;
//            }
//        }
//        if (a > 2) {
//            System.out.println(a);
//        }
        // 15. even-indexed Fibonacci numbers  ################

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int first = 0;
//        int second = 1;
//        int sum = 0;
//        for (int i = 0; i <= 2 * n; i++) {
//            if (i % 2 == 0) {
//                sum += first;
//            }
//            int next = first + second;
//            first = second;
//            second = next;
//        }
//        System.out.print(sum);


    }
}
