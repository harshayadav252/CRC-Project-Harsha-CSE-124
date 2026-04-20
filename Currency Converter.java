import java.util.Scanner;
public class CurrencyConverter {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("1. USD -> INR");
System.out.println("2. INR -> USD");
System.out.println("3. EUR -> INR");
System.out.print("Enter choice: ");
int ch = sc.nextInt();
System.out.print("Enter amount: ");
double amt = sc.nextDouble();
double res;
switch (ch) {
case 1:
res = amt * 83;
System.out.println("Converted amount: " + res);
break;
case 2:
res = amt / 83;
System.out.println("Converted amount: " + res);
break;
case 3:
res = amt * 90;
System.out.println("Converted amount: " + res);
break;
default:
System.out.println("Wrong choice");
}
sc.close();
}
}