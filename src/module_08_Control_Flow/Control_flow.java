/*
       1.   Q.8 greater number bw 2 num
       2.   Q.9 even odd
       3.   Q.10 VALID VOTER
       4.   Q.11 WEEKDAY
       5.   Q.12 leap year
       6.   Q.13 electricity bill
       7.    Greeting message gender
       8.    Greater bw 3 integer
       9.    consonant or vowels
       10.   discount question       to check 1 case  ***********
       11.   movie rating
       12.   Service qualification
 */

package module_08_Control_Flow;
import java.util.Scanner;
public class Control_flow {
    public static void main(String[] args) {

        // Q.8 greater number bw 2 num

//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        if (a > b) {
//            System.out.println("a bada hai");
//        } else {
//            System.out.println("b bada hai");
//        }

        //      Q.9  even odd

//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        if (a % 2 == 0) {
//            System.out.println("even");
//        } else {
//            System.out.println("odd");
//        }

//                                Q. 10 VALID VOTER

//        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//        int age = sc.nextInt();
//        if (age > 18) {
//            System.out.println("hello " + name + "you are voter");
//        } else {
//            System.out.println("hello " + name + " you will be voter in " + (18 - age) + " years");
//        }

//                                Q.11 WEEKDAY

//        Scanner sc = new Scanner(System.in);
//        int day = sc.nextInt();
//        if (day == 1) {
//            System.out.println("monday");
//        } else if (day == 2) {
//            System.out.println("tuesday");
//        } else if (day == 3) {
//            System.out.println("wednesday");
//        }

//   5.                        Q.12 leap year

//        Scanner sc = new Scanner(System.in);
//        int year = sc.nextInt();
//        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
//            System.out.println("leap year");
//        } else {
//            System.out.println(" not leap year");
//        }

//   6.                      Q.13 electricity bill

//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//
//        if (a <= 100) {
//            System.out.println(a * 4.2);
//        } else if (a <= 200) {
//            System.out.println((100 * 4.2) + ((a - 100) * 6));
//        } else if (a <= 400) {
//            System.out.println((100 * 4.2) + (100 * 6) + ((a - 200) * 8));
//        } else {
//            System.out.println((100 * 4.2) + (100 * 6) + (200 * 8) + ((a - 400) * 13));
//        }

//   7.                  Greeting message gender

//        Scanner sc = new Scanner(System.in);
//        char c = sc.next().charAt(0);
//        if (c == 'M' || c == 'm') {
//            System.out.print("\"Hello,Sir!\"");
//        } else if (c == 'f' || c == 'F') {
//            System.out.print("\"Hello,Ma'am\"");
//        } else {
//            System.out.print("\"Hello,Guest\"");
//        }

//   8.                   Greater bw 3 integer

//        Scanner sc = new Scanner(System.in);
//        int a=sc.nextInt();
//     -   int b=sc.nextInt();
//        int c=sc.nextInt();
//        if(a>=b &&  a>=c){System.out.print(a);}
//        else
//        if(b>=a&& b>=c){System.out.print(b);}
//        else
//        if(c>=b&& c>=a){System.out.print(c);}


//    9.                consonant or vowels

//        Scanner sc = new Scanner(System.in);
//        char C = sc.nextLine().charAt(0);
//        if (!Character.isLetter(C)) {
//            // to ck if char is letter
//            System.out.print("Invalid input");
//        } else {
//            char c = Character.toLowerCase(C);
//            // for lower case
//            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
//                System.out.print("Vowel");
//            } else {
//                System.out.print("Consonant");
//            }
//
//
// 10.          discount question -   to check 1 case

//        Scanner sc = new Scanner(System.in);
//        int a =sc.nextInt();
//        if (a>0 && a<=5000){System.out.print(a);}
//        else
//
//        if (a>5000 && a<=7000){System.out.printf("%.0f" , a*0.95);}
//        else
//        if (a>7000 && a<=9000){System.out.printf("%.0f" ,a*.9);}
//        else
//        if (a>9000 ){System.out.printf("%.0f" ,a*.8);}

//   11.                         movie rating

//        Scanner sc = new Scanner(System.in);
//        double a = sc.nextDouble();
//        if (a >= 0 && a <= 2) {
//            System.out.print("Flop");
//        } else if (a >= 2.1 && a <= 3.4) {
//            System.out.print("Semi-hit");
//        } else if (a >= 3.5 && a <= 4.5) {
//            System.out.print("Hit");
//        } else if (a >= 4.6 && a <= 5.0) {
//            System.out.print("Super Hit");
//        }
//   12.               Service qualification

//        Scanner sc = new Scanner(System.in);
//        char gen=sc.next().charAt(0);
//        int serv=sc.nextInt();
//        String qual= sc.next();
//        if(gen=='M' &&serv>=10&&qual.equals ("P")){System.out.print("15000");}
//        else
//        if(gen=='M' &&serv>=10&&qual.equals ("U")){System.out.print("10000");}
//        else
//        if(gen=='M' &&serv<10&&qual.equals ("P")){System.out.print("10000");}
//        else
//        if(gen=='M' &&serv<10&&qual.equals ("U")){System.out.print("7000");}
//        else
//        if(gen=='F' &&serv>=10&&qual.equals ("P")){System.out.print("12000");}
//        else
//        if(gen=='F' &&serv>=10&&qual.equals ("U")){System.out.print("9000");}
//        else
//        if(gen=='F' &&serv<10&&qual.equals ("P")){System.out.print("10000");}
//        else
//        if(gen=='F' &&serv<10&&qual.equals ("U")){System.out.print("6000");}

    }
}
