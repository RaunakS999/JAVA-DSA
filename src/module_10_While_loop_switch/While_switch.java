/*

CLASS 12

1.Separate digit of number
2. Q.21 Sum of digit of number
3.  reverse a number
4. Q.22  palindrome
5. Q.23 Strong number
6. Automorphic
7. Sum until single digit
8. fibonacci  term
9. HCF
10. Harshad(Niven number)
11. Number is perfect square
12. Abundant Number
13. Neon Number
14. ISBN number ******************************
 */

package module_10_While_loop_switch;

public class While_switch {

    public static void main(String[] args) {


// 1. Separate digit of number

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        while (n != 0) {
//            int lastDigit = n % 10;
//            n = n / 10;
//            System.out.println(lastDigit);
//        }

// 2. Q.21 Sum of digit

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int sum=0;
//        while (n != 0) {
//        int lastDigit =n%10;
//        sum+=lastDigit;
//        n=n/10;
//        }
//        System.out.println(sum);


//   3.  reverse a number

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int sum = 0;
//        while (n != 0) {
//            int rem = n % 10;
//            sum = sum * 10 + rem;
//            n = n / 10;
//        }
//        System.out.print(sum);

// 4. Q.22 palindrome

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int temp = n;
//        int sum = 0;
//        while (n != 0) {
//            int rem = n % 10;
//            sum = sum * 10 + rem;
//            n = n / 10;
//        }
//        n = temp;
//        System.out.print(sum == temp ? "Palindromic number" : "No Palindromic number");


//   5. Q.23 Strong number

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int temp = n;
//        int sum = 0;
//        while (n != 0) {
//            int rem = n % 10;
//            int fact = 1;
//            for (int i = 1; i <= rem; i++) {
//                fact *= i;
//            }
//            sum += fact;
//            n = n / 10;
//            System.out.println(fact);
//            System.out.println("Sum = " + sum);
//            System.out.println("N = " + temp);
//        }
//
//        System.out.print(temp == sum ? "Yes" : "No");

// 6. Automorphic                ##############

//        Scanner sc = new Scanner(System.in);
//        int n= sc.nextInt();
//        int c =0;
//        int temp = n;
//        while(n!=0){
//            c++;              //num of digits count
//            n=n/10;
//        }
//        n=temp;
//        long sqr=n*n;
//        long lastDig= sqr% (long)Math.pow(10,c);
//        System.out.print(lastDig==n?"Yes":"No");

// 7. Sum until single digit

//        int n =7852;
//        while (n>9){
//                int sum = 0;
//            while(n!=0) {
//                int lastDig = n % 10;
//                 sum+=lastDig;
//                n=n/10;
//            }
//            n=sum;
//            System.out.println(n);
//        }

// 8. fibonacci term

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int first=0,second=1;
//        for(int i=3;i<=n;i++) {
//            int current = first + second;
//            first = second;
//            second = current;
//        System.out.println(current);
//        }

// 9. HCF

//        Scanner sc = new Scanner(System.in);
//        int ans = 1;
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        for(int i = 1; i<= Math.max(a,b); i++){
//            if (a%i==0 && b%i==0){
//                ans = Math.max(ans,i);
//            }
//        }
//        System.out.println(ans);


// 10. Harshad(NIven number)


//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int temp = n;
//        int sum = 0;
//        while (n != 0) {
//            int lastD = n % 10;
//            sum += lastD;
//            n = n / 10;
//        }
//        n = temp;
//        if (n % sum == 0) {
//            System.out.print("Yes");
//        } else {
//            System.out.print("No");
//        }

// 11. Number is perfect square

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int i = 1; i * i <= n; i++) {
//            if (i * i == n) {
//                System.out.print("Yes");
//                return;
//            }
//        }
//        System.out.print("No");

// 12. Abundant Number

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int sum = 0;
//        for (int i = 1; i < n; i++) {
//            if (n % i == 0) {
//                sum += i;
//            }
//        }
//        System.out.print(sum > n ? "Yes" : "No");


// 13. Neon Number

//        Scanner sc =new Scanner(System.in);
//        int n=sc.nextInt();
//        int sum=0;
//        int sqr=n*n;
//        int temp=sqr;
//        while(sqr!=0){
//            int lastDig=sqr%10;
//            sum+=lastDig;
//            sqr/=10;
//        }
//        System.out.print(sum==n?"Yes":"No");

// 14. ISBN number ******************************
//        Scanner sc = new Scanner(System.in);
//        long n = sc.nextLong();
//        long sum=0;
//        if (n < 1000000000L || n > 9999999999L) {
//            System.out.println("false");
//            return;}
//        for(int i=10;i>=1;i--){
//            long last=n%10;
//            sum+=last*i;
//            n/=10;
//        }System.out.print(sum%11==0?"true":"false");


        //METHOD 2 --  USING STRING *************************** GPT

//        Scanner sc = new Scanner(System.in);
//        String isbn = sc.next();   // take input as string
//
//        // 1. Check length
//        if (isbn.length() != 10) {
//            System.out.println("Input must be exactly 10 digits");
//            return;
//        }
//
//        // 2. Check if all characters are digits
//        for (int i = 0; i < 10; i++) {
//            if (!Character.isDigit(isbn.charAt(i))) {
//                System.out.println("Input must contain only digits");
//                return;
//            }
//        }
//
//        // 3. Calculate checksum (ISBN-10 rule: digit * position-weight)
//        int sum = 0;
//        for (int i = 0; i < 10; i++) {
//            int digit = isbn.charAt(i) - '0';  // convert char to int
//            sum += digit * (10 - i);           // weights: 10 down to 1
//        }


    }
}
